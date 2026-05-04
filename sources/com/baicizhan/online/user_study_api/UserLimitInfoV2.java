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
public class UserLimitInfoV2 implements TBase<UserLimitInfoV2, _Fields>, Serializable, Cloneable, Comparable<UserLimitInfoV2> {
    private static final int __CHN_MODE_ISSET_ID = 4;
    private static final int __CHN_STYLE_ISSET_ID = 12;
    private static final int __COLLECT_WORDS_UPDATED_AT_ISSET_ID = 7;
    private static final int __CURRENT_MODE_ISSET_ID = 14;
    private static final int __CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE_ISSET_ID = 9;
    private static final int __HAS_WORD_FRIENDS_ISSET_ID = 1;
    private static final int __LISTENING_MODE_ISSET_ID = 3;
    private static final int __NEW_WIKI_ISSET_ID = 11;
    private static final int __SERVER_TIMESTAMP_ISSET_ID = 16;
    private static final int __SHOW_DEVICE_ISSET_ID = 13;
    private static final int __SHOW_SENTENCE_TRANS_ISSET_ID = 0;
    private static final int __SHOW_TOPIC_CORRECTION_ISSET_ID = 15;
    private static final int __SPELL_MODE_ISSET_ID = 2;
    private static final int __UPDATE_AT_OF_BOOK_INFO_ISSET_ID = 5;
    private static final int __UPDATE_AT_OF_NOTIFY_INFO_ISSET_ID = 6;
    private static final int __WORD_NOTE_ENABLE_ISSET_ID = 10;
    private static final int __WORD_NOTE_UPDATED_AT_ISSET_ID = 8;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private int __isset_bitfield;
    public int chn_mode;
    public int chn_style;
    public long collect_words_updated_at;
    public int cur_book_has_primary_school_mode;
    public int current_mode;
    public GameMode game_mode;
    public int has_word_friends;
    public int listening_mode;
    public int new_wiki;
    private _Fields[] optionals;
    public long server_timestamp;
    public int show_device;
    public int show_sentence_trans;
    public int show_topic_correction;
    public int spell_mode;
    public long update_at_of_book_info;
    public long update_at_of_notify_info;
    public List<WikiComponent> wiki_component_cfg;
    public int word_note_enable;
    public long word_note_updated_at;
    public String x_mode_setting;
    private static final TStruct STRUCT_DESC = new TStruct("UserLimitInfoV2");
    private static final TField SHOW_SENTENCE_TRANS_FIELD_DESC = new TField("show_sentence_trans", (byte) 8, 1);
    private static final TField HAS_WORD_FRIENDS_FIELD_DESC = new TField("has_word_friends", (byte) 8, 2);
    private static final TField SPELL_MODE_FIELD_DESC = new TField("spell_mode", (byte) 8, 3);
    private static final TField LISTENING_MODE_FIELD_DESC = new TField("listening_mode", (byte) 8, 4);
    private static final TField CHN_MODE_FIELD_DESC = new TField("chn_mode", (byte) 8, 5);
    private static final TField UPDATE_AT_OF_BOOK_INFO_FIELD_DESC = new TField("update_at_of_book_info", (byte) 10, 6);
    private static final TField UPDATE_AT_OF_NOTIFY_INFO_FIELD_DESC = new TField("update_at_of_notify_info", (byte) 10, 7);
    private static final TField COLLECT_WORDS_UPDATED_AT_FIELD_DESC = new TField("collect_words_updated_at", (byte) 10, 8);
    private static final TField WORD_NOTE_UPDATED_AT_FIELD_DESC = new TField("word_note_updated_at", (byte) 10, 9);
    private static final TField CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE_FIELD_DESC = new TField("cur_book_has_primary_school_mode", (byte) 8, 10);
    private static final TField WORD_NOTE_ENABLE_FIELD_DESC = new TField("word_note_enable", (byte) 8, 11);
    private static final TField WIKI_COMPONENT_CFG_FIELD_DESC = new TField("wiki_component_cfg", (byte) 15, 12);
    private static final TField NEW_WIKI_FIELD_DESC = new TField("new_wiki", (byte) 8, 13);
    private static final TField CHN_STYLE_FIELD_DESC = new TField("chn_style", (byte) 8, 14);
    private static final TField SHOW_DEVICE_FIELD_DESC = new TField("show_device", (byte) 8, 15);
    private static final TField CURRENT_MODE_FIELD_DESC = new TField("current_mode", (byte) 8, 16);
    private static final TField X_MODE_SETTING_FIELD_DESC = new TField("x_mode_setting", (byte) 11, 17);
    private static final TField SHOW_TOPIC_CORRECTION_FIELD_DESC = new TField("show_topic_correction", (byte) 8, 18);
    private static final TField SERVER_TIMESTAMP_FIELD_DESC = new TField("server_timestamp", (byte) 10, 19);
    private static final TField GAME_MODE_FIELD_DESC = new TField("game_mode", (byte) 12, 20);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserLimitInfoV2$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields = iArr;
            try {
                iArr[_Fields.SHOW_SENTENCE_TRANS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.HAS_WORD_FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.SPELL_MODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.LISTENING_MODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.CHN_MODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.UPDATE_AT_OF_BOOK_INFO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.UPDATE_AT_OF_NOTIFY_INFO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.COLLECT_WORDS_UPDATED_AT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.WORD_NOTE_UPDATED_AT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.WORD_NOTE_ENABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.WIKI_COMPONENT_CFG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.NEW_WIKI.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.CHN_STYLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.SHOW_DEVICE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.CURRENT_MODE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.X_MODE_SETTING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.SHOW_TOPIC_CORRECTION.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.SERVER_TIMESTAMP.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[_Fields.GAME_MODE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLimitInfoV2StandardScheme extends StandardScheme<UserLimitInfoV2> {
        private UserLimitInfoV2StandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserLimitInfoV2 struct) throws TException {
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
                            struct.chn_mode = iprot.readI32();
                            struct.setChn_modeIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 10) {
                            struct.update_at_of_book_info = iprot.readI64();
                            struct.setUpdate_at_of_book_infoIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 7:
                        if (b11 == 10) {
                            struct.update_at_of_notify_info = iprot.readI64();
                            struct.setUpdate_at_of_notify_infoIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 8:
                        if (b11 == 10) {
                            struct.collect_words_updated_at = iprot.readI64();
                            struct.setCollect_words_updated_atIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 9:
                        if (b11 == 10) {
                            struct.word_note_updated_at = iprot.readI64();
                            struct.setWord_note_updated_atIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 10:
                        if (b11 == 8) {
                            struct.cur_book_has_primary_school_mode = iprot.readI32();
                            struct.setCur_book_has_primary_school_modeIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 11:
                        if (b11 == 8) {
                            struct.word_note_enable = iprot.readI32();
                            struct.setWord_note_enableIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 12:
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
                    case 13:
                        if (b11 == 8) {
                            struct.new_wiki = iprot.readI32();
                            struct.setNew_wikiIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 14:
                        if (b11 == 8) {
                            struct.chn_style = iprot.readI32();
                            struct.setChn_styleIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 15:
                        if (b11 == 8) {
                            struct.show_device = iprot.readI32();
                            struct.setShow_deviceIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 16:
                        if (b11 == 8) {
                            struct.current_mode = iprot.readI32();
                            struct.setCurrent_modeIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 17:
                        if (b11 == 11) {
                            struct.x_mode_setting = iprot.readString();
                            struct.setX_mode_settingIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 18:
                        if (b11 == 8) {
                            struct.show_topic_correction = iprot.readI32();
                            struct.setShow_topic_correctionIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 19:
                        if (b11 == 10) {
                            struct.server_timestamp = iprot.readI64();
                            struct.setServer_timestampIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 20:
                        if (b11 == 12) {
                            GameMode gameMode = new GameMode();
                            struct.game_mode = gameMode;
                            gameMode.read(iprot);
                            struct.setGame_modeIsSet(true);
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
        public void write(TProtocol oprot, UserLimitInfoV2 struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserLimitInfoV2.STRUCT_DESC);
            oprot.writeFieldBegin(UserLimitInfoV2.SHOW_SENTENCE_TRANS_FIELD_DESC);
            oprot.writeI32(struct.show_sentence_trans);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserLimitInfoV2.HAS_WORD_FRIENDS_FIELD_DESC);
            oprot.writeI32(struct.has_word_friends);
            oprot.writeFieldEnd();
            if (struct.isSetSpell_mode()) {
                oprot.writeFieldBegin(UserLimitInfoV2.SPELL_MODE_FIELD_DESC);
                oprot.writeI32(struct.spell_mode);
                oprot.writeFieldEnd();
            }
            if (struct.isSetListening_mode()) {
                oprot.writeFieldBegin(UserLimitInfoV2.LISTENING_MODE_FIELD_DESC);
                oprot.writeI32(struct.listening_mode);
                oprot.writeFieldEnd();
            }
            if (struct.isSetChn_mode()) {
                oprot.writeFieldBegin(UserLimitInfoV2.CHN_MODE_FIELD_DESC);
                oprot.writeI32(struct.chn_mode);
                oprot.writeFieldEnd();
            }
            if (struct.isSetUpdate_at_of_book_info()) {
                oprot.writeFieldBegin(UserLimitInfoV2.UPDATE_AT_OF_BOOK_INFO_FIELD_DESC);
                oprot.writeI64(struct.update_at_of_book_info);
                oprot.writeFieldEnd();
            }
            if (struct.isSetUpdate_at_of_notify_info()) {
                oprot.writeFieldBegin(UserLimitInfoV2.UPDATE_AT_OF_NOTIFY_INFO_FIELD_DESC);
                oprot.writeI64(struct.update_at_of_notify_info);
                oprot.writeFieldEnd();
            }
            if (struct.isSetCollect_words_updated_at()) {
                oprot.writeFieldBegin(UserLimitInfoV2.COLLECT_WORDS_UPDATED_AT_FIELD_DESC);
                oprot.writeI64(struct.collect_words_updated_at);
                oprot.writeFieldEnd();
            }
            if (struct.isSetWord_note_updated_at()) {
                oprot.writeFieldBegin(UserLimitInfoV2.WORD_NOTE_UPDATED_AT_FIELD_DESC);
                oprot.writeI64(struct.word_note_updated_at);
                oprot.writeFieldEnd();
            }
            if (struct.isSetCur_book_has_primary_school_mode()) {
                oprot.writeFieldBegin(UserLimitInfoV2.CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE_FIELD_DESC);
                oprot.writeI32(struct.cur_book_has_primary_school_mode);
                oprot.writeFieldEnd();
            }
            if (struct.isSetWord_note_enable()) {
                oprot.writeFieldBegin(UserLimitInfoV2.WORD_NOTE_ENABLE_FIELD_DESC);
                oprot.writeI32(struct.word_note_enable);
                oprot.writeFieldEnd();
            }
            if (struct.wiki_component_cfg != null && struct.isSetWiki_component_cfg()) {
                oprot.writeFieldBegin(UserLimitInfoV2.WIKI_COMPONENT_CFG_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.wiki_component_cfg.size()));
                Iterator<WikiComponent> it = struct.wiki_component_cfg.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.isSetNew_wiki()) {
                oprot.writeFieldBegin(UserLimitInfoV2.NEW_WIKI_FIELD_DESC);
                oprot.writeI32(struct.new_wiki);
                oprot.writeFieldEnd();
            }
            if (struct.isSetChn_style()) {
                oprot.writeFieldBegin(UserLimitInfoV2.CHN_STYLE_FIELD_DESC);
                oprot.writeI32(struct.chn_style);
                oprot.writeFieldEnd();
            }
            if (struct.isSetShow_device()) {
                oprot.writeFieldBegin(UserLimitInfoV2.SHOW_DEVICE_FIELD_DESC);
                oprot.writeI32(struct.show_device);
                oprot.writeFieldEnd();
            }
            if (struct.isSetCurrent_mode()) {
                oprot.writeFieldBegin(UserLimitInfoV2.CURRENT_MODE_FIELD_DESC);
                oprot.writeI32(struct.current_mode);
                oprot.writeFieldEnd();
            }
            if (struct.x_mode_setting != null && struct.isSetX_mode_setting()) {
                oprot.writeFieldBegin(UserLimitInfoV2.X_MODE_SETTING_FIELD_DESC);
                oprot.writeString(struct.x_mode_setting);
                oprot.writeFieldEnd();
            }
            if (struct.isSetShow_topic_correction()) {
                oprot.writeFieldBegin(UserLimitInfoV2.SHOW_TOPIC_CORRECTION_FIELD_DESC);
                oprot.writeI32(struct.show_topic_correction);
                oprot.writeFieldEnd();
            }
            if (struct.isSetServer_timestamp()) {
                oprot.writeFieldBegin(UserLimitInfoV2.SERVER_TIMESTAMP_FIELD_DESC);
                oprot.writeI64(struct.server_timestamp);
                oprot.writeFieldEnd();
            }
            if (struct.game_mode != null && struct.isSetGame_mode()) {
                oprot.writeFieldBegin(UserLimitInfoV2.GAME_MODE_FIELD_DESC);
                struct.game_mode.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLimitInfoV2StandardSchemeFactory implements SchemeFactory {
        private UserLimitInfoV2StandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserLimitInfoV2StandardScheme getScheme() {
            return new UserLimitInfoV2StandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLimitInfoV2TupleScheme extends TupleScheme<UserLimitInfoV2> {
        private UserLimitInfoV2TupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserLimitInfoV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.show_sentence_trans = tTupleProtocol.readI32();
            struct.setShow_sentence_transIsSet(true);
            struct.has_word_friends = tTupleProtocol.readI32();
            struct.setHas_word_friendsIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(18);
            if (readBitSet.get(0)) {
                struct.spell_mode = tTupleProtocol.readI32();
                struct.setSpell_modeIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.listening_mode = tTupleProtocol.readI32();
                struct.setListening_modeIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.chn_mode = tTupleProtocol.readI32();
                struct.setChn_modeIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.update_at_of_book_info = tTupleProtocol.readI64();
                struct.setUpdate_at_of_book_infoIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.update_at_of_notify_info = tTupleProtocol.readI64();
                struct.setUpdate_at_of_notify_infoIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.collect_words_updated_at = tTupleProtocol.readI64();
                struct.setCollect_words_updated_atIsSet(true);
            }
            if (readBitSet.get(6)) {
                struct.word_note_updated_at = tTupleProtocol.readI64();
                struct.setWord_note_updated_atIsSet(true);
            }
            if (readBitSet.get(7)) {
                struct.cur_book_has_primary_school_mode = tTupleProtocol.readI32();
                struct.setCur_book_has_primary_school_modeIsSet(true);
            }
            if (readBitSet.get(8)) {
                struct.word_note_enable = tTupleProtocol.readI32();
                struct.setWord_note_enableIsSet(true);
            }
            if (readBitSet.get(9)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.wiki_component_cfg = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    WikiComponent wikiComponent = new WikiComponent();
                    wikiComponent.read(tTupleProtocol);
                    struct.wiki_component_cfg.add(wikiComponent);
                }
                struct.setWiki_component_cfgIsSet(true);
            }
            if (readBitSet.get(10)) {
                struct.new_wiki = tTupleProtocol.readI32();
                struct.setNew_wikiIsSet(true);
            }
            if (readBitSet.get(11)) {
                struct.chn_style = tTupleProtocol.readI32();
                struct.setChn_styleIsSet(true);
            }
            if (readBitSet.get(12)) {
                struct.show_device = tTupleProtocol.readI32();
                struct.setShow_deviceIsSet(true);
            }
            if (readBitSet.get(13)) {
                struct.current_mode = tTupleProtocol.readI32();
                struct.setCurrent_modeIsSet(true);
            }
            if (readBitSet.get(14)) {
                struct.x_mode_setting = tTupleProtocol.readString();
                struct.setX_mode_settingIsSet(true);
            }
            if (readBitSet.get(15)) {
                struct.show_topic_correction = tTupleProtocol.readI32();
                struct.setShow_topic_correctionIsSet(true);
            }
            if (readBitSet.get(16)) {
                struct.server_timestamp = tTupleProtocol.readI64();
                struct.setServer_timestampIsSet(true);
            }
            if (readBitSet.get(17)) {
                GameMode gameMode = new GameMode();
                struct.game_mode = gameMode;
                gameMode.read(tTupleProtocol);
                struct.setGame_modeIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserLimitInfoV2 struct) throws TException {
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
            if (struct.isSetChn_mode()) {
                bitSet.set(2);
            }
            if (struct.isSetUpdate_at_of_book_info()) {
                bitSet.set(3);
            }
            if (struct.isSetUpdate_at_of_notify_info()) {
                bitSet.set(4);
            }
            if (struct.isSetCollect_words_updated_at()) {
                bitSet.set(5);
            }
            if (struct.isSetWord_note_updated_at()) {
                bitSet.set(6);
            }
            if (struct.isSetCur_book_has_primary_school_mode()) {
                bitSet.set(7);
            }
            if (struct.isSetWord_note_enable()) {
                bitSet.set(8);
            }
            if (struct.isSetWiki_component_cfg()) {
                bitSet.set(9);
            }
            if (struct.isSetNew_wiki()) {
                bitSet.set(10);
            }
            if (struct.isSetChn_style()) {
                bitSet.set(11);
            }
            if (struct.isSetShow_device()) {
                bitSet.set(12);
            }
            if (struct.isSetCurrent_mode()) {
                bitSet.set(13);
            }
            if (struct.isSetX_mode_setting()) {
                bitSet.set(14);
            }
            if (struct.isSetShow_topic_correction()) {
                bitSet.set(15);
            }
            if (struct.isSetServer_timestamp()) {
                bitSet.set(16);
            }
            if (struct.isSetGame_mode()) {
                bitSet.set(17);
            }
            tTupleProtocol.writeBitSet(bitSet, 18);
            if (struct.isSetSpell_mode()) {
                tTupleProtocol.writeI32(struct.spell_mode);
            }
            if (struct.isSetListening_mode()) {
                tTupleProtocol.writeI32(struct.listening_mode);
            }
            if (struct.isSetChn_mode()) {
                tTupleProtocol.writeI32(struct.chn_mode);
            }
            if (struct.isSetUpdate_at_of_book_info()) {
                tTupleProtocol.writeI64(struct.update_at_of_book_info);
            }
            if (struct.isSetUpdate_at_of_notify_info()) {
                tTupleProtocol.writeI64(struct.update_at_of_notify_info);
            }
            if (struct.isSetCollect_words_updated_at()) {
                tTupleProtocol.writeI64(struct.collect_words_updated_at);
            }
            if (struct.isSetWord_note_updated_at()) {
                tTupleProtocol.writeI64(struct.word_note_updated_at);
            }
            if (struct.isSetCur_book_has_primary_school_mode()) {
                tTupleProtocol.writeI32(struct.cur_book_has_primary_school_mode);
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
            if (struct.isSetNew_wiki()) {
                tTupleProtocol.writeI32(struct.new_wiki);
            }
            if (struct.isSetChn_style()) {
                tTupleProtocol.writeI32(struct.chn_style);
            }
            if (struct.isSetShow_device()) {
                tTupleProtocol.writeI32(struct.show_device);
            }
            if (struct.isSetCurrent_mode()) {
                tTupleProtocol.writeI32(struct.current_mode);
            }
            if (struct.isSetX_mode_setting()) {
                tTupleProtocol.writeString(struct.x_mode_setting);
            }
            if (struct.isSetShow_topic_correction()) {
                tTupleProtocol.writeI32(struct.show_topic_correction);
            }
            if (struct.isSetServer_timestamp()) {
                tTupleProtocol.writeI64(struct.server_timestamp);
            }
            if (struct.isSetGame_mode()) {
                struct.game_mode.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLimitInfoV2TupleSchemeFactory implements SchemeFactory {
        private UserLimitInfoV2TupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserLimitInfoV2TupleScheme getScheme() {
            return new UserLimitInfoV2TupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SHOW_SENTENCE_TRANS(1, "show_sentence_trans"),
        HAS_WORD_FRIENDS(2, "has_word_friends"),
        SPELL_MODE(3, "spell_mode"),
        LISTENING_MODE(4, "listening_mode"),
        CHN_MODE(5, "chn_mode"),
        UPDATE_AT_OF_BOOK_INFO(6, "update_at_of_book_info"),
        UPDATE_AT_OF_NOTIFY_INFO(7, "update_at_of_notify_info"),
        COLLECT_WORDS_UPDATED_AT(8, "collect_words_updated_at"),
        WORD_NOTE_UPDATED_AT(9, "word_note_updated_at"),
        CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE(10, "cur_book_has_primary_school_mode"),
        WORD_NOTE_ENABLE(11, "word_note_enable"),
        WIKI_COMPONENT_CFG(12, "wiki_component_cfg"),
        NEW_WIKI(13, "new_wiki"),
        CHN_STYLE(14, "chn_style"),
        SHOW_DEVICE(15, "show_device"),
        CURRENT_MODE(16, "current_mode"),
        X_MODE_SETTING(17, "x_mode_setting"),
        SHOW_TOPIC_CORRECTION(18, "show_topic_correction"),
        SERVER_TIMESTAMP(19, "server_timestamp"),
        GAME_MODE(20, "game_mode");

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
                    return CHN_MODE;
                case 6:
                    return UPDATE_AT_OF_BOOK_INFO;
                case 7:
                    return UPDATE_AT_OF_NOTIFY_INFO;
                case 8:
                    return COLLECT_WORDS_UPDATED_AT;
                case 9:
                    return WORD_NOTE_UPDATED_AT;
                case 10:
                    return CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE;
                case 11:
                    return WORD_NOTE_ENABLE;
                case 12:
                    return WIKI_COMPONENT_CFG;
                case 13:
                    return NEW_WIKI;
                case 14:
                    return CHN_STYLE;
                case 15:
                    return SHOW_DEVICE;
                case 16:
                    return CURRENT_MODE;
                case 17:
                    return X_MODE_SETTING;
                case 18:
                    return SHOW_TOPIC_CORRECTION;
                case 19:
                    return SERVER_TIMESTAMP;
                case 20:
                    return GAME_MODE;
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
        hashMap.put(StandardScheme.class, new UserLimitInfoV2StandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserLimitInfoV2TupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SHOW_SENTENCE_TRANS, (_Fields) new FieldMetaData("show_sentence_trans", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.HAS_WORD_FRIENDS, (_Fields) new FieldMetaData("has_word_friends", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SPELL_MODE, (_Fields) new FieldMetaData("spell_mode", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LISTENING_MODE, (_Fields) new FieldMetaData("listening_mode", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CHN_MODE, (_Fields) new FieldMetaData("chn_mode", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.UPDATE_AT_OF_BOOK_INFO, (_Fields) new FieldMetaData("update_at_of_book_info", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.UPDATE_AT_OF_NOTIFY_INFO, (_Fields) new FieldMetaData("update_at_of_notify_info", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.COLLECT_WORDS_UPDATED_AT, (_Fields) new FieldMetaData("collect_words_updated_at", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.WORD_NOTE_UPDATED_AT, (_Fields) new FieldMetaData("word_note_updated_at", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE, (_Fields) new FieldMetaData("cur_book_has_primary_school_mode", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WORD_NOTE_ENABLE, (_Fields) new FieldMetaData("word_note_enable", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WIKI_COMPONENT_CFG, (_Fields) new FieldMetaData("wiki_component_cfg", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, WikiComponent.class))));
        enumMap.put((EnumMap) _Fields.NEW_WIKI, (_Fields) new FieldMetaData("new_wiki", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CHN_STYLE, (_Fields) new FieldMetaData("chn_style", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SHOW_DEVICE, (_Fields) new FieldMetaData("show_device", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CURRENT_MODE, (_Fields) new FieldMetaData("current_mode", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.X_MODE_SETTING, (_Fields) new FieldMetaData("x_mode_setting", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHOW_TOPIC_CORRECTION, (_Fields) new FieldMetaData("show_topic_correction", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SERVER_TIMESTAMP, (_Fields) new FieldMetaData("server_timestamp", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.GAME_MODE, (_Fields) new FieldMetaData("game_mode", (byte) 2, new StructMetaData((byte) 12, GameMode.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserLimitInfoV2.class, unmodifiableMap);
    }

    public UserLimitInfoV2() {
        this.__isset_bitfield = 0;
        this.optionals = new _Fields[]{_Fields.SPELL_MODE, _Fields.LISTENING_MODE, _Fields.CHN_MODE, _Fields.UPDATE_AT_OF_BOOK_INFO, _Fields.UPDATE_AT_OF_NOTIFY_INFO, _Fields.COLLECT_WORDS_UPDATED_AT, _Fields.WORD_NOTE_UPDATED_AT, _Fields.CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE, _Fields.WORD_NOTE_ENABLE, _Fields.WIKI_COMPONENT_CFG, _Fields.NEW_WIKI, _Fields.CHN_STYLE, _Fields.SHOW_DEVICE, _Fields.CURRENT_MODE, _Fields.X_MODE_SETTING, _Fields.SHOW_TOPIC_CORRECTION, _Fields.SERVER_TIMESTAMP, _Fields.GAME_MODE};
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
        setChn_modeIsSet(false);
        this.chn_mode = 0;
        setUpdate_at_of_book_infoIsSet(false);
        this.update_at_of_book_info = 0L;
        setUpdate_at_of_notify_infoIsSet(false);
        this.update_at_of_notify_info = 0L;
        setCollect_words_updated_atIsSet(false);
        this.collect_words_updated_at = 0L;
        setWord_note_updated_atIsSet(false);
        this.word_note_updated_at = 0L;
        setCur_book_has_primary_school_modeIsSet(false);
        this.cur_book_has_primary_school_mode = 0;
        setWord_note_enableIsSet(false);
        this.word_note_enable = 0;
        this.wiki_component_cfg = null;
        setNew_wikiIsSet(false);
        this.new_wiki = 0;
        setChn_styleIsSet(false);
        this.chn_style = 0;
        setShow_deviceIsSet(false);
        this.show_device = 0;
        setCurrent_modeIsSet(false);
        this.current_mode = 0;
        this.x_mode_setting = null;
        setShow_topic_correctionIsSet(false);
        this.show_topic_correction = 0;
        setServer_timestampIsSet(false);
        this.server_timestamp = 0L;
        this.game_mode = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserLimitInfoV2)) {
            return equals((UserLimitInfoV2) that);
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

    public int getCurrent_mode() {
        return this.current_mode;
    }

    public GameMode getGame_mode() {
        return this.game_mode;
    }

    public int getHas_word_friends() {
        return this.has_word_friends;
    }

    public int getListening_mode() {
        return this.listening_mode;
    }

    public int getNew_wiki() {
        return this.new_wiki;
    }

    public long getServer_timestamp() {
        return this.server_timestamp;
    }

    public int getShow_device() {
        return this.show_device;
    }

    public int getShow_sentence_trans() {
        return this.show_sentence_trans;
    }

    public int getShow_topic_correction() {
        return this.show_topic_correction;
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

    public String getX_mode_setting() {
        return this.x_mode_setting;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetChn_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetChn_style() {
        return EncodingUtils.testBit(this.__isset_bitfield, 12);
    }

    public boolean isSetCollect_words_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 7);
    }

    public boolean isSetCur_book_has_primary_school_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 9);
    }

    public boolean isSetCurrent_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 14);
    }

    public boolean isSetGame_mode() {
        return this.game_mode != null;
    }

    public boolean isSetHas_word_friends() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetListening_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetNew_wiki() {
        return EncodingUtils.testBit(this.__isset_bitfield, 11);
    }

    public boolean isSetServer_timestamp() {
        return EncodingUtils.testBit(this.__isset_bitfield, 16);
    }

    public boolean isSetShow_device() {
        return EncodingUtils.testBit(this.__isset_bitfield, 13);
    }

    public boolean isSetShow_sentence_trans() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetShow_topic_correction() {
        return EncodingUtils.testBit(this.__isset_bitfield, 15);
    }

    public boolean isSetSpell_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetUpdate_at_of_book_info() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetUpdate_at_of_notify_info() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetWiki_component_cfg() {
        return this.wiki_component_cfg != null;
    }

    public boolean isSetWord_note_enable() {
        return EncodingUtils.testBit(this.__isset_bitfield, 10);
    }

    public boolean isSetWord_note_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 8);
    }

    public boolean isSetX_mode_setting() {
        return this.x_mode_setting != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserLimitInfoV2 setChn_mode(int chn_mode) {
        this.chn_mode = chn_mode;
        setChn_modeIsSet(true);
        return this;
    }

    public void setChn_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public UserLimitInfoV2 setChn_style(int chn_style) {
        this.chn_style = chn_style;
        setChn_styleIsSet(true);
        return this;
    }

    public void setChn_styleIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 12, value);
    }

    public UserLimitInfoV2 setCollect_words_updated_at(long collect_words_updated_at) {
        this.collect_words_updated_at = collect_words_updated_at;
        setCollect_words_updated_atIsSet(true);
        return this;
    }

    public void setCollect_words_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 7, value);
    }

    public UserLimitInfoV2 setCur_book_has_primary_school_mode(int cur_book_has_primary_school_mode) {
        this.cur_book_has_primary_school_mode = cur_book_has_primary_school_mode;
        setCur_book_has_primary_school_modeIsSet(true);
        return this;
    }

    public void setCur_book_has_primary_school_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 9, value);
    }

    public UserLimitInfoV2 setCurrent_mode(int current_mode) {
        this.current_mode = current_mode;
        setCurrent_modeIsSet(true);
        return this;
    }

    public void setCurrent_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 14, value);
    }

    public UserLimitInfoV2 setGame_mode(GameMode game_mode) {
        this.game_mode = game_mode;
        return this;
    }

    public void setGame_modeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.game_mode = null;
    }

    public UserLimitInfoV2 setHas_word_friends(int has_word_friends) {
        this.has_word_friends = has_word_friends;
        setHas_word_friendsIsSet(true);
        return this;
    }

    public void setHas_word_friendsIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserLimitInfoV2 setListening_mode(int listening_mode) {
        this.listening_mode = listening_mode;
        setListening_modeIsSet(true);
        return this;
    }

    public void setListening_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public UserLimitInfoV2 setNew_wiki(int new_wiki) {
        this.new_wiki = new_wiki;
        setNew_wikiIsSet(true);
        return this;
    }

    public void setNew_wikiIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 11, value);
    }

    public UserLimitInfoV2 setServer_timestamp(long server_timestamp) {
        this.server_timestamp = server_timestamp;
        setServer_timestampIsSet(true);
        return this;
    }

    public void setServer_timestampIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 16, value);
    }

    public UserLimitInfoV2 setShow_device(int show_device) {
        this.show_device = show_device;
        setShow_deviceIsSet(true);
        return this;
    }

    public void setShow_deviceIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 13, value);
    }

    public UserLimitInfoV2 setShow_sentence_trans(int show_sentence_trans) {
        this.show_sentence_trans = show_sentence_trans;
        setShow_sentence_transIsSet(true);
        return this;
    }

    public void setShow_sentence_transIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserLimitInfoV2 setShow_topic_correction(int show_topic_correction) {
        this.show_topic_correction = show_topic_correction;
        setShow_topic_correctionIsSet(true);
        return this;
    }

    public void setShow_topic_correctionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 15, value);
    }

    public UserLimitInfoV2 setSpell_mode(int spell_mode) {
        this.spell_mode = spell_mode;
        setSpell_modeIsSet(true);
        return this;
    }

    public void setSpell_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserLimitInfoV2 setUpdate_at_of_book_info(long update_at_of_book_info) {
        this.update_at_of_book_info = update_at_of_book_info;
        setUpdate_at_of_book_infoIsSet(true);
        return this;
    }

    public void setUpdate_at_of_book_infoIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public UserLimitInfoV2 setUpdate_at_of_notify_info(long update_at_of_notify_info) {
        this.update_at_of_notify_info = update_at_of_notify_info;
        setUpdate_at_of_notify_infoIsSet(true);
        return this;
    }

    public void setUpdate_at_of_notify_infoIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public UserLimitInfoV2 setWiki_component_cfg(List<WikiComponent> wiki_component_cfg) {
        this.wiki_component_cfg = wiki_component_cfg;
        return this;
    }

    public void setWiki_component_cfgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.wiki_component_cfg = null;
    }

    public UserLimitInfoV2 setWord_note_enable(int word_note_enable) {
        this.word_note_enable = word_note_enable;
        setWord_note_enableIsSet(true);
        return this;
    }

    public void setWord_note_enableIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 10, value);
    }

    public UserLimitInfoV2 setWord_note_updated_at(long word_note_updated_at) {
        this.word_note_updated_at = word_note_updated_at;
        setWord_note_updated_atIsSet(true);
        return this;
    }

    public void setWord_note_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 8, value);
    }

    public UserLimitInfoV2 setX_mode_setting(String x_mode_setting) {
        this.x_mode_setting = x_mode_setting;
        return this;
    }

    public void setX_mode_settingIsSet(boolean value) {
        if (value) {
            return;
        }
        this.x_mode_setting = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserLimitInfoV2(");
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
        if (isSetChn_mode()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("chn_mode:");
            sb2.append(this.chn_mode);
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
        if (isSetCur_book_has_primary_school_mode()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("cur_book_has_primary_school_mode:");
            sb2.append(this.cur_book_has_primary_school_mode);
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
        if (isSetCurrent_mode()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("current_mode:");
            sb2.append(this.current_mode);
        }
        if (isSetX_mode_setting()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("x_mode_setting:");
            String str = this.x_mode_setting;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        if (isSetShow_topic_correction()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("show_topic_correction:");
            sb2.append(this.show_topic_correction);
        }
        if (isSetServer_timestamp()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("server_timestamp:");
            sb2.append(this.server_timestamp);
        }
        if (isSetGame_mode()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("game_mode:");
            GameMode gameMode = this.game_mode;
            if (gameMode == null) {
                sb2.append("null");
            } else {
                sb2.append(gameMode);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetChn_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetChn_style() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 12);
    }

    public void unsetCollect_words_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 7);
    }

    public void unsetCur_book_has_primary_school_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 9);
    }

    public void unsetCurrent_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 14);
    }

    public void unsetGame_mode() {
        this.game_mode = null;
    }

    public void unsetHas_word_friends() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetListening_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetNew_wiki() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 11);
    }

    public void unsetServer_timestamp() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 16);
    }

    public void unsetShow_device() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 13);
    }

    public void unsetShow_sentence_trans() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetShow_topic_correction() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 15);
    }

    public void unsetSpell_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetUpdate_at_of_book_info() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetUpdate_at_of_notify_info() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetWiki_component_cfg() {
        this.wiki_component_cfg = null;
    }

    public void unsetWord_note_enable() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 10);
    }

    public void unsetWord_note_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 8);
    }

    public void unsetX_mode_setting() {
        this.x_mode_setting = null;
    }

    public void validate() throws TException {
        GameMode gameMode = this.game_mode;
        if (gameMode != null) {
            gameMode.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserLimitInfoV2 other) {
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
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo21 = Boolean.valueOf(isSetShow_sentence_trans()).compareTo(Boolean.valueOf(other.isSetShow_sentence_trans()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (isSetShow_sentence_trans() && (compareTo20 = TBaseHelper.compareTo(this.show_sentence_trans, other.show_sentence_trans)) != 0) {
            return compareTo20;
        }
        int compareTo22 = Boolean.valueOf(isSetHas_word_friends()).compareTo(Boolean.valueOf(other.isSetHas_word_friends()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (isSetHas_word_friends() && (compareTo19 = TBaseHelper.compareTo(this.has_word_friends, other.has_word_friends)) != 0) {
            return compareTo19;
        }
        int compareTo23 = Boolean.valueOf(isSetSpell_mode()).compareTo(Boolean.valueOf(other.isSetSpell_mode()));
        if (compareTo23 != 0) {
            return compareTo23;
        }
        if (isSetSpell_mode() && (compareTo18 = TBaseHelper.compareTo(this.spell_mode, other.spell_mode)) != 0) {
            return compareTo18;
        }
        int compareTo24 = Boolean.valueOf(isSetListening_mode()).compareTo(Boolean.valueOf(other.isSetListening_mode()));
        if (compareTo24 != 0) {
            return compareTo24;
        }
        if (isSetListening_mode() && (compareTo17 = TBaseHelper.compareTo(this.listening_mode, other.listening_mode)) != 0) {
            return compareTo17;
        }
        int compareTo25 = Boolean.valueOf(isSetChn_mode()).compareTo(Boolean.valueOf(other.isSetChn_mode()));
        if (compareTo25 != 0) {
            return compareTo25;
        }
        if (isSetChn_mode() && (compareTo16 = TBaseHelper.compareTo(this.chn_mode, other.chn_mode)) != 0) {
            return compareTo16;
        }
        int compareTo26 = Boolean.valueOf(isSetUpdate_at_of_book_info()).compareTo(Boolean.valueOf(other.isSetUpdate_at_of_book_info()));
        if (compareTo26 != 0) {
            return compareTo26;
        }
        if (isSetUpdate_at_of_book_info() && (compareTo15 = TBaseHelper.compareTo(this.update_at_of_book_info, other.update_at_of_book_info)) != 0) {
            return compareTo15;
        }
        int compareTo27 = Boolean.valueOf(isSetUpdate_at_of_notify_info()).compareTo(Boolean.valueOf(other.isSetUpdate_at_of_notify_info()));
        if (compareTo27 != 0) {
            return compareTo27;
        }
        if (isSetUpdate_at_of_notify_info() && (compareTo14 = TBaseHelper.compareTo(this.update_at_of_notify_info, other.update_at_of_notify_info)) != 0) {
            return compareTo14;
        }
        int compareTo28 = Boolean.valueOf(isSetCollect_words_updated_at()).compareTo(Boolean.valueOf(other.isSetCollect_words_updated_at()));
        if (compareTo28 != 0) {
            return compareTo28;
        }
        if (isSetCollect_words_updated_at() && (compareTo13 = TBaseHelper.compareTo(this.collect_words_updated_at, other.collect_words_updated_at)) != 0) {
            return compareTo13;
        }
        int compareTo29 = Boolean.valueOf(isSetWord_note_updated_at()).compareTo(Boolean.valueOf(other.isSetWord_note_updated_at()));
        if (compareTo29 != 0) {
            return compareTo29;
        }
        if (isSetWord_note_updated_at() && (compareTo12 = TBaseHelper.compareTo(this.word_note_updated_at, other.word_note_updated_at)) != 0) {
            return compareTo12;
        }
        int compareTo30 = Boolean.valueOf(isSetCur_book_has_primary_school_mode()).compareTo(Boolean.valueOf(other.isSetCur_book_has_primary_school_mode()));
        if (compareTo30 != 0) {
            return compareTo30;
        }
        if (isSetCur_book_has_primary_school_mode() && (compareTo11 = TBaseHelper.compareTo(this.cur_book_has_primary_school_mode, other.cur_book_has_primary_school_mode)) != 0) {
            return compareTo11;
        }
        int compareTo31 = Boolean.valueOf(isSetWord_note_enable()).compareTo(Boolean.valueOf(other.isSetWord_note_enable()));
        if (compareTo31 != 0) {
            return compareTo31;
        }
        if (isSetWord_note_enable() && (compareTo10 = TBaseHelper.compareTo(this.word_note_enable, other.word_note_enable)) != 0) {
            return compareTo10;
        }
        int compareTo32 = Boolean.valueOf(isSetWiki_component_cfg()).compareTo(Boolean.valueOf(other.isSetWiki_component_cfg()));
        if (compareTo32 != 0) {
            return compareTo32;
        }
        if (isSetWiki_component_cfg() && (compareTo9 = TBaseHelper.compareTo((List) this.wiki_component_cfg, (List) other.wiki_component_cfg)) != 0) {
            return compareTo9;
        }
        int compareTo33 = Boolean.valueOf(isSetNew_wiki()).compareTo(Boolean.valueOf(other.isSetNew_wiki()));
        if (compareTo33 != 0) {
            return compareTo33;
        }
        if (isSetNew_wiki() && (compareTo8 = TBaseHelper.compareTo(this.new_wiki, other.new_wiki)) != 0) {
            return compareTo8;
        }
        int compareTo34 = Boolean.valueOf(isSetChn_style()).compareTo(Boolean.valueOf(other.isSetChn_style()));
        if (compareTo34 != 0) {
            return compareTo34;
        }
        if (isSetChn_style() && (compareTo7 = TBaseHelper.compareTo(this.chn_style, other.chn_style)) != 0) {
            return compareTo7;
        }
        int compareTo35 = Boolean.valueOf(isSetShow_device()).compareTo(Boolean.valueOf(other.isSetShow_device()));
        if (compareTo35 != 0) {
            return compareTo35;
        }
        if (isSetShow_device() && (compareTo6 = TBaseHelper.compareTo(this.show_device, other.show_device)) != 0) {
            return compareTo6;
        }
        int compareTo36 = Boolean.valueOf(isSetCurrent_mode()).compareTo(Boolean.valueOf(other.isSetCurrent_mode()));
        if (compareTo36 != 0) {
            return compareTo36;
        }
        if (isSetCurrent_mode() && (compareTo5 = TBaseHelper.compareTo(this.current_mode, other.current_mode)) != 0) {
            return compareTo5;
        }
        int compareTo37 = Boolean.valueOf(isSetX_mode_setting()).compareTo(Boolean.valueOf(other.isSetX_mode_setting()));
        if (compareTo37 != 0) {
            return compareTo37;
        }
        if (isSetX_mode_setting() && (compareTo4 = TBaseHelper.compareTo(this.x_mode_setting, other.x_mode_setting)) != 0) {
            return compareTo4;
        }
        int compareTo38 = Boolean.valueOf(isSetShow_topic_correction()).compareTo(Boolean.valueOf(other.isSetShow_topic_correction()));
        if (compareTo38 != 0) {
            return compareTo38;
        }
        if (isSetShow_topic_correction() && (compareTo3 = TBaseHelper.compareTo(this.show_topic_correction, other.show_topic_correction)) != 0) {
            return compareTo3;
        }
        int compareTo39 = Boolean.valueOf(isSetServer_timestamp()).compareTo(Boolean.valueOf(other.isSetServer_timestamp()));
        if (compareTo39 != 0) {
            return compareTo39;
        }
        if (isSetServer_timestamp() && (compareTo2 = TBaseHelper.compareTo(this.server_timestamp, other.server_timestamp)) != 0) {
            return compareTo2;
        }
        int compareTo40 = Boolean.valueOf(isSetGame_mode()).compareTo(Boolean.valueOf(other.isSetGame_mode()));
        if (compareTo40 != 0) {
            return compareTo40;
        }
        if (!isSetGame_mode() || (compareTo = TBaseHelper.compareTo((Comparable) this.game_mode, (Comparable) other.game_mode)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserLimitInfoV2, _Fields> deepCopy2() {
        return new UserLimitInfoV2(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getShow_sentence_trans());
            case 2:
                return Integer.valueOf(getHas_word_friends());
            case 3:
                return Integer.valueOf(getSpell_mode());
            case 4:
                return Integer.valueOf(getListening_mode());
            case 5:
                return Integer.valueOf(getChn_mode());
            case 6:
                return Long.valueOf(getUpdate_at_of_book_info());
            case 7:
                return Long.valueOf(getUpdate_at_of_notify_info());
            case 8:
                return Long.valueOf(getCollect_words_updated_at());
            case 9:
                return Long.valueOf(getWord_note_updated_at());
            case 10:
                return Integer.valueOf(getCur_book_has_primary_school_mode());
            case 11:
                return Integer.valueOf(getWord_note_enable());
            case 12:
                return getWiki_component_cfg();
            case 13:
                return Integer.valueOf(getNew_wiki());
            case 14:
                return Integer.valueOf(getChn_style());
            case 15:
                return Integer.valueOf(getShow_device());
            case 16:
                return Integer.valueOf(getCurrent_mode());
            case 17:
                return getX_mode_setting();
            case 18:
                return Integer.valueOf(getShow_topic_correction());
            case 19:
                return Long.valueOf(getServer_timestamp());
            case 20:
                return getGame_mode();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[field.ordinal()]) {
            case 1:
                return isSetShow_sentence_trans();
            case 2:
                return isSetHas_word_friends();
            case 3:
                return isSetSpell_mode();
            case 4:
                return isSetListening_mode();
            case 5:
                return isSetChn_mode();
            case 6:
                return isSetUpdate_at_of_book_info();
            case 7:
                return isSetUpdate_at_of_notify_info();
            case 8:
                return isSetCollect_words_updated_at();
            case 9:
                return isSetWord_note_updated_at();
            case 10:
                return isSetCur_book_has_primary_school_mode();
            case 11:
                return isSetWord_note_enable();
            case 12:
                return isSetWiki_component_cfg();
            case 13:
                return isSetNew_wiki();
            case 14:
                return isSetChn_style();
            case 15:
                return isSetShow_device();
            case 16:
                return isSetCurrent_mode();
            case 17:
                return isSetX_mode_setting();
            case 18:
                return isSetShow_topic_correction();
            case 19:
                return isSetServer_timestamp();
            case 20:
                return isSetGame_mode();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfoV2$_Fields[field.ordinal()]) {
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
                    setChn_mode(((Integer) value).intValue());
                    break;
                } else {
                    unsetChn_mode();
                    break;
                }
            case 6:
                if (value != null) {
                    setUpdate_at_of_book_info(((Long) value).longValue());
                    break;
                } else {
                    unsetUpdate_at_of_book_info();
                    break;
                }
            case 7:
                if (value != null) {
                    setUpdate_at_of_notify_info(((Long) value).longValue());
                    break;
                } else {
                    unsetUpdate_at_of_notify_info();
                    break;
                }
            case 8:
                if (value != null) {
                    setCollect_words_updated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetCollect_words_updated_at();
                    break;
                }
            case 9:
                if (value != null) {
                    setWord_note_updated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetWord_note_updated_at();
                    break;
                }
            case 10:
                if (value != null) {
                    setCur_book_has_primary_school_mode(((Integer) value).intValue());
                    break;
                } else {
                    unsetCur_book_has_primary_school_mode();
                    break;
                }
            case 11:
                if (value != null) {
                    setWord_note_enable(((Integer) value).intValue());
                    break;
                } else {
                    unsetWord_note_enable();
                    break;
                }
            case 12:
                if (value != null) {
                    setWiki_component_cfg((List) value);
                    break;
                } else {
                    unsetWiki_component_cfg();
                    break;
                }
            case 13:
                if (value != null) {
                    setNew_wiki(((Integer) value).intValue());
                    break;
                } else {
                    unsetNew_wiki();
                    break;
                }
            case 14:
                if (value != null) {
                    setChn_style(((Integer) value).intValue());
                    break;
                } else {
                    unsetChn_style();
                    break;
                }
            case 15:
                if (value != null) {
                    setShow_device(((Integer) value).intValue());
                    break;
                } else {
                    unsetShow_device();
                    break;
                }
            case 16:
                if (value != null) {
                    setCurrent_mode(((Integer) value).intValue());
                    break;
                } else {
                    unsetCurrent_mode();
                    break;
                }
            case 17:
                if (value != null) {
                    setX_mode_setting((String) value);
                    break;
                } else {
                    unsetX_mode_setting();
                    break;
                }
            case 18:
                if (value != null) {
                    setShow_topic_correction(((Integer) value).intValue());
                    break;
                } else {
                    unsetShow_topic_correction();
                    break;
                }
            case 19:
                if (value != null) {
                    setServer_timestamp(((Long) value).longValue());
                    break;
                } else {
                    unsetServer_timestamp();
                    break;
                }
            case 20:
                if (value != null) {
                    setGame_mode((GameMode) value);
                    break;
                } else {
                    unsetGame_mode();
                    break;
                }
        }
    }

    public boolean equals(UserLimitInfoV2 that) {
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
        boolean isSetChn_mode = isSetChn_mode();
        boolean isSetChn_mode2 = that.isSetChn_mode();
        if ((isSetChn_mode || isSetChn_mode2) && !(isSetChn_mode && isSetChn_mode2 && this.chn_mode == that.chn_mode)) {
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
        boolean isSetCur_book_has_primary_school_mode = isSetCur_book_has_primary_school_mode();
        boolean isSetCur_book_has_primary_school_mode2 = that.isSetCur_book_has_primary_school_mode();
        if ((isSetCur_book_has_primary_school_mode || isSetCur_book_has_primary_school_mode2) && !(isSetCur_book_has_primary_school_mode && isSetCur_book_has_primary_school_mode2 && this.cur_book_has_primary_school_mode == that.cur_book_has_primary_school_mode)) {
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
        boolean isSetCurrent_mode = isSetCurrent_mode();
        boolean isSetCurrent_mode2 = that.isSetCurrent_mode();
        if ((isSetCurrent_mode || isSetCurrent_mode2) && !(isSetCurrent_mode && isSetCurrent_mode2 && this.current_mode == that.current_mode)) {
            return false;
        }
        boolean isSetX_mode_setting = isSetX_mode_setting();
        boolean isSetX_mode_setting2 = that.isSetX_mode_setting();
        if ((isSetX_mode_setting || isSetX_mode_setting2) && !(isSetX_mode_setting && isSetX_mode_setting2 && this.x_mode_setting.equals(that.x_mode_setting))) {
            return false;
        }
        boolean isSetShow_topic_correction = isSetShow_topic_correction();
        boolean isSetShow_topic_correction2 = that.isSetShow_topic_correction();
        if ((isSetShow_topic_correction || isSetShow_topic_correction2) && !(isSetShow_topic_correction && isSetShow_topic_correction2 && this.show_topic_correction == that.show_topic_correction)) {
            return false;
        }
        boolean isSetServer_timestamp = isSetServer_timestamp();
        boolean isSetServer_timestamp2 = that.isSetServer_timestamp();
        if ((isSetServer_timestamp || isSetServer_timestamp2) && !(isSetServer_timestamp && isSetServer_timestamp2 && this.server_timestamp == that.server_timestamp)) {
            return false;
        }
        boolean isSetGame_mode = isSetGame_mode();
        boolean isSetGame_mode2 = that.isSetGame_mode();
        if (isSetGame_mode || isSetGame_mode2) {
            return isSetGame_mode && isSetGame_mode2 && this.game_mode.equals(that.game_mode);
        }
        return true;
    }

    public UserLimitInfoV2(int show_sentence_trans, int has_word_friends) {
        this();
        this.show_sentence_trans = show_sentence_trans;
        setShow_sentence_transIsSet(true);
        this.has_word_friends = has_word_friends;
        setHas_word_friendsIsSet(true);
    }

    public UserLimitInfoV2(UserLimitInfoV2 other) {
        this.__isset_bitfield = 0;
        this.optionals = new _Fields[]{_Fields.SPELL_MODE, _Fields.LISTENING_MODE, _Fields.CHN_MODE, _Fields.UPDATE_AT_OF_BOOK_INFO, _Fields.UPDATE_AT_OF_NOTIFY_INFO, _Fields.COLLECT_WORDS_UPDATED_AT, _Fields.WORD_NOTE_UPDATED_AT, _Fields.CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE, _Fields.WORD_NOTE_ENABLE, _Fields.WIKI_COMPONENT_CFG, _Fields.NEW_WIKI, _Fields.CHN_STYLE, _Fields.SHOW_DEVICE, _Fields.CURRENT_MODE, _Fields.X_MODE_SETTING, _Fields.SHOW_TOPIC_CORRECTION, _Fields.SERVER_TIMESTAMP, _Fields.GAME_MODE};
        this.__isset_bitfield = other.__isset_bitfield;
        this.show_sentence_trans = other.show_sentence_trans;
        this.has_word_friends = other.has_word_friends;
        this.spell_mode = other.spell_mode;
        this.listening_mode = other.listening_mode;
        this.chn_mode = other.chn_mode;
        this.update_at_of_book_info = other.update_at_of_book_info;
        this.update_at_of_notify_info = other.update_at_of_notify_info;
        this.collect_words_updated_at = other.collect_words_updated_at;
        this.word_note_updated_at = other.word_note_updated_at;
        this.cur_book_has_primary_school_mode = other.cur_book_has_primary_school_mode;
        this.word_note_enable = other.word_note_enable;
        if (other.isSetWiki_component_cfg()) {
            ArrayList arrayList = new ArrayList(other.wiki_component_cfg.size());
            Iterator<WikiComponent> it = other.wiki_component_cfg.iterator();
            while (it.hasNext()) {
                arrayList.add(new WikiComponent(it.next()));
            }
            this.wiki_component_cfg = arrayList;
        }
        this.new_wiki = other.new_wiki;
        this.chn_style = other.chn_style;
        this.show_device = other.show_device;
        this.current_mode = other.current_mode;
        if (other.isSetX_mode_setting()) {
            this.x_mode_setting = other.x_mode_setting;
        }
        this.show_topic_correction = other.show_topic_correction;
        this.server_timestamp = other.server_timestamp;
        if (other.isSetGame_mode()) {
            this.game_mode = new GameMode(other.game_mode);
        }
    }
}
