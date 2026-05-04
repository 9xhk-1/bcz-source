package com.baicizhan.online.resource_api;

import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.online.thrift.basic.LogicException;
import com.baicizhan.online.thrift.basic.SystemException;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
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
import org.apache.thrift.AsyncProcessFunction;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.ProcessFunction;
import org.apache.thrift.TApplicationException;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseAsyncProcessor;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TBaseProcessor;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.TProcessor;
import org.apache.thrift.TServiceClient;
import org.apache.thrift.TServiceClientFactory;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.async.TAsyncClient;
import org.apache.thrift.async.TAsyncClientFactory;
import org.apache.thrift.async.TAsyncClientManager;
import org.apache.thrift.async.TAsyncMethodCall;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.protocol.TProtocolUtil;
import org.apache.thrift.protocol.TStruct;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.server.AbstractNonblockingServer;
import org.apache.thrift.transport.TIOStreamTransport;
import org.apache.thrift.transport.TMemoryInputTransport;
import org.apache.thrift.transport.TNonblockingTransport;
import org.junit.jupiter.api.j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class ResourceService {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.ResourceService$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_book_resource_update_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_book_resource_update_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_by_word_v2_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_by_word_v2_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_wiki_by_word_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_wiki_by_word_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_list_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_list_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_update_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_update_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_media_by_topic_ids_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_media_by_topic_ids_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v3_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v3_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v2_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v2_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v3_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v3_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_media_update_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_media_update_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_root_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_root_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_infos_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_infos_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_md5s_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_md5s_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$search_word_v2_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$search_word_v2_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$submit_translate_bug_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$submit_translate_bug_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$translate_v2_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$translate_v2_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$word_bug_report_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ResourceService$word_bug_report_result$_Fields;

        static {
            int[] iArr = new int[word_bug_report_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$word_bug_report_result$_Fields = iArr;
            try {
                iArr[word_bug_report_result._Fields.BOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$word_bug_report_result$_Fields[word_bug_report_result._Fields.BOMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[word_bug_report_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$word_bug_report_args$_Fields = iArr2;
            try {
                iArr2[word_bug_report_args._Fields.KEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$word_bug_report_args$_Fields[word_bug_report_args._Fields.TYPES.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[submit_translate_bug_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$submit_translate_bug_result$_Fields = iArr3;
            try {
                iArr3[submit_translate_bug_result._Fields.BOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$submit_translate_bug_result$_Fields[submit_translate_bug_result._Fields.BOMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr4 = new int[submit_translate_bug_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$submit_translate_bug_args$_Fields = iArr4;
            try {
                iArr4[submit_translate_bug_args._Fields.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$submit_translate_bug_args$_Fields[submit_translate_bug_args._Fields.TRANS.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$submit_translate_bug_args$_Fields[submit_translate_bug_args._Fields.PROVIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr5 = new int[translate_v2_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$translate_v2_result$_Fields = iArr5;
            try {
                iArr5[translate_v2_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$translate_v2_result$_Fields[translate_v2_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$translate_v2_result$_Fields[translate_v2_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr6 = new int[translate_v2_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$translate_v2_args$_Fields = iArr6;
            try {
                iArr6[translate_v2_args._Fields.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr7 = new int[get_word_root_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_root_result$_Fields = iArr7;
            try {
                iArr7[get_word_root_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_root_result$_Fields[get_word_root_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_root_result$_Fields[get_word_root_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr8 = new int[get_word_root_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_root_args$_Fields = iArr8;
            try {
                iArr8[get_word_root_args._Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr9 = new int[get_game_word_update_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_update_info_result$_Fields = iArr9;
            try {
                iArr9[get_game_word_update_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_update_info_result$_Fields[get_game_word_update_info_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_update_info_result$_Fields[get_game_word_update_info_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            int[] iArr10 = new int[get_game_word_update_info_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_update_info_args$_Fields = iArr10;
            try {
                iArr10[get_game_word_update_info_args._Fields.BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            int[] iArr11 = new int[get_game_word_list_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_list_result$_Fields = iArr11;
            try {
                iArr11[get_game_word_list_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_list_result$_Fields[get_game_word_list_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_list_result$_Fields[get_game_word_list_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr12 = new int[get_game_word_list_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_list_args$_Fields = iArr12;
            try {
                iArr12[get_game_word_list_args._Fields.REQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            int[] iArr13 = new int[get_word_list_word_meta_v3_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v3_result$_Fields = iArr13;
            try {
                iArr13[get_word_list_word_meta_v3_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v3_result$_Fields[get_word_list_word_meta_v3_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v3_result$_Fields[get_word_list_word_meta_v3_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            int[] iArr14 = new int[get_word_list_word_meta_v3_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v3_args$_Fields = iArr14;
            try {
                iArr14[get_word_list_word_meta_v3_args._Fields.BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            int[] iArr15 = new int[get_word_list_word_meta_v2_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v2_result$_Fields = iArr15;
            try {
                iArr15[get_word_list_word_meta_v2_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v2_result$_Fields[get_word_list_word_meta_v2_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v2_result$_Fields[get_word_list_word_meta_v2_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused32) {
            }
            int[] iArr16 = new int[get_word_list_word_meta_v2_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v2_args$_Fields = iArr16;
            try {
                iArr16[get_word_list_word_meta_v2_args._Fields.KEYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            int[] iArr17 = new int[get_topic_resource_v3_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v3_result$_Fields = iArr17;
            try {
                iArr17[get_topic_resource_v3_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v3_result$_Fields[get_topic_resource_v3_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v3_result$_Fields[get_topic_resource_v3_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused36) {
            }
            int[] iArr18 = new int[get_topic_resource_v3_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v3_args$_Fields = iArr18;
            try {
                iArr18[get_topic_resource_v3_args._Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused37) {
            }
            int[] iArr19 = new int[get_topic_resource_v2_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_result$_Fields = iArr19;
            try {
                iArr19[get_topic_resource_v2_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_result$_Fields[get_topic_resource_v2_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_result$_Fields[get_topic_resource_v2_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused40) {
            }
            int[] iArr20 = new int[get_topic_resource_v2_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_args$_Fields = iArr20;
            try {
                iArr20[get_topic_resource_v2_args._Fields.KEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_args$_Fields[get_topic_resource_v2_args._Fields.CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_args$_Fields[get_topic_resource_v2_args._Fields.WITH_ZPK.ordinal()] = 3;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_args$_Fields[get_topic_resource_v2_args._Fields.WITH_DICT.ordinal()] = 4;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_args$_Fields[get_topic_resource_v2_args._Fields.WITH_DICT_WIKI.ordinal()] = 5;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_args$_Fields[get_topic_resource_v2_args._Fields.WITH_MEDIA.ordinal()] = 6;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_args$_Fields[get_topic_resource_v2_args._Fields.WITH_SIMILAL_WORDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused47) {
            }
            int[] iArr21 = new int[get_dict_wiki_by_word_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_wiki_by_word_result$_Fields = iArr21;
            try {
                iArr21[get_dict_wiki_by_word_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_wiki_by_word_result$_Fields[get_dict_wiki_by_word_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_wiki_by_word_result$_Fields[get_dict_wiki_by_word_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused50) {
            }
            int[] iArr22 = new int[get_dict_wiki_by_word_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_wiki_by_word_args$_Fields = iArr22;
            try {
                iArr22[get_dict_wiki_by_word_args._Fields.WORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused51) {
            }
            int[] iArr23 = new int[get_dict_by_word_v2_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_by_word_v2_result$_Fields = iArr23;
            try {
                iArr23[get_dict_by_word_v2_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_by_word_v2_result$_Fields[get_dict_by_word_v2_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_by_word_v2_result$_Fields[get_dict_by_word_v2_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused54) {
            }
            int[] iArr24 = new int[get_dict_by_word_v2_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_by_word_v2_args$_Fields = iArr24;
            try {
                iArr24[get_dict_by_word_v2_args._Fields.WORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused55) {
            }
            int[] iArr25 = new int[get_zpk_md5s_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_md5s_result$_Fields = iArr25;
            try {
                iArr25[get_zpk_md5s_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_md5s_result$_Fields[get_zpk_md5s_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_md5s_result$_Fields[get_zpk_md5s_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused58) {
            }
            int[] iArr26 = new int[get_zpk_md5s_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_md5s_args$_Fields = iArr26;
            try {
                iArr26[get_zpk_md5s_args._Fields.KEYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused59) {
            }
            int[] iArr27 = new int[get_zpk_infos_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_infos_result$_Fields = iArr27;
            try {
                iArr27[get_zpk_infos_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_infos_result$_Fields[get_zpk_infos_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_infos_result$_Fields[get_zpk_infos_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused62) {
            }
            int[] iArr28 = new int[get_zpk_infos_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_infos_args$_Fields = iArr28;
            try {
                iArr28[get_zpk_infos_args._Fields.KEYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused63) {
            }
            int[] iArr29 = new int[search_word_v2_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$search_word_v2_result$_Fields = iArr29;
            try {
                iArr29[search_word_v2_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$search_word_v2_result$_Fields[search_word_v2_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$search_word_v2_result$_Fields[search_word_v2_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused66) {
            }
            int[] iArr30 = new int[search_word_v2_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$search_word_v2_args$_Fields = iArr30;
            try {
                iArr30[search_word_v2_args._Fields.QUERY_STR.ordinal()] = 1;
            } catch (NoSuchFieldError unused67) {
            }
            int[] iArr31 = new int[get_book_resource_update_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_book_resource_update_info_result$_Fields = iArr31;
            try {
                iArr31[get_book_resource_update_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_book_resource_update_info_result$_Fields[get_book_resource_update_info_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_book_resource_update_info_result$_Fields[get_book_resource_update_info_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused70) {
            }
            int[] iArr32 = new int[get_book_resource_update_info_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_book_resource_update_info_args$_Fields = iArr32;
            try {
                iArr32[get_book_resource_update_info_args._Fields.WORD_LEVEL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused71) {
            }
            int[] iArr33 = new int[get_word_media_update_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_media_update_info_result$_Fields = iArr33;
            try {
                iArr33[get_word_media_update_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_media_update_info_result$_Fields[get_word_media_update_info_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_media_update_info_result$_Fields[get_word_media_update_info_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused74) {
            }
            int[] iArr34 = new int[get_word_media_update_info_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_media_update_info_args$_Fields = iArr34;
            try {
                iArr34[get_word_media_update_info_args._Fields.BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused75) {
            }
            int[] iArr35 = new int[get_media_by_topic_ids_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_media_by_topic_ids_result$_Fields = iArr35;
            try {
                iArr35[get_media_by_topic_ids_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_media_by_topic_ids_result$_Fields[get_media_by_topic_ids_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_media_by_topic_ids_result$_Fields[get_media_by_topic_ids_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused78) {
            }
            int[] iArr36 = new int[get_media_by_topic_ids_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_media_by_topic_ids_args$_Fields = iArr36;
            try {
                iArr36[get_media_by_topic_ids_args._Fields.TOPIC_IDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused79) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AsyncClient extends TAsyncClient implements AsyncIface {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class Factory implements TAsyncClientFactory<AsyncClient> {
            private TAsyncClientManager clientManager;
            private TProtocolFactory protocolFactory;

            public Factory(TAsyncClientManager clientManager, TProtocolFactory protocolFactory) {
                this.clientManager = clientManager;
                this.protocolFactory = protocolFactory;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.async.TAsyncClientFactory
            public AsyncClient getAsyncClient(TNonblockingTransport transport) {
                return new AsyncClient(this.protocolFactory, this.clientManager, transport);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_book_resource_update_info_call extends TAsyncMethodCall {
            private int word_level_id;

            public get_book_resource_update_info_call(int word_level_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.word_level_id = word_level_id;
            }

            public BookResourceUpdateInfo getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_book_resource_update_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_book_resource_update_info", (byte) 1, 0));
                get_book_resource_update_info_args get_book_resource_update_info_argsVar = new get_book_resource_update_info_args();
                get_book_resource_update_info_argsVar.setWord_level_id(this.word_level_id);
                get_book_resource_update_info_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_by_word_v2_call extends TAsyncMethodCall {
            private String word;

            public get_dict_by_word_v2_call(String word, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.word = word;
            }

            public WordDictV2 getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_dict_by_word_v2();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_dict_by_word_v2", (byte) 1, 0));
                get_dict_by_word_v2_args get_dict_by_word_v2_argsVar = new get_dict_by_word_v2_args();
                get_dict_by_word_v2_argsVar.setWord(this.word);
                get_dict_by_word_v2_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_wiki_by_word_call extends TAsyncMethodCall {
            private String word;

            public get_dict_wiki_by_word_call(String word, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.word = word;
            }

            public DictWiki getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_dict_wiki_by_word();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_dict_wiki_by_word", (byte) 1, 0));
                get_dict_wiki_by_word_args get_dict_wiki_by_word_argsVar = new get_dict_wiki_by_word_args();
                get_dict_wiki_by_word_argsVar.setWord(this.word);
                get_dict_wiki_by_word_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_list_call extends TAsyncMethodCall {
            private GameWordReq req;

            public get_game_word_list_call(GameWordReq req, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.req = req;
            }

            public List<GameWordItem> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_game_word_list();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_game_word_list", (byte) 1, 0));
                get_game_word_list_args get_game_word_list_argsVar = new get_game_word_list_args();
                get_game_word_list_argsVar.setReq(this.req);
                get_game_word_list_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_update_info_call extends TAsyncMethodCall {
            private int book_id;

            public get_game_word_update_info_call(int book_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.book_id = book_id;
            }

            public List<GameWordItemUpdateInfo> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_game_word_update_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_game_word_update_info", (byte) 1, 0));
                get_game_word_update_info_args get_game_word_update_info_argsVar = new get_game_word_update_info_args();
                get_game_word_update_info_argsVar.setBook_id(this.book_id);
                get_game_word_update_info_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_media_by_topic_ids_call extends TAsyncMethodCall {
            private List<Integer> topic_ids;

            public get_media_by_topic_ids_call(List<Integer> topic_ids, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.topic_ids = topic_ids;
            }

            public List<WordMedia> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_media_by_topic_ids();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_media_by_topic_ids", (byte) 1, 0));
                get_media_by_topic_ids_args get_media_by_topic_ids_argsVar = new get_media_by_topic_ids_args();
                get_media_by_topic_ids_argsVar.setTopic_ids(this.topic_ids);
                get_media_by_topic_ids_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v2_call extends TAsyncMethodCall {
            private GetTopicResourceChannel channel;
            private TopicKey key;
            private boolean with_dict;
            private boolean with_dict_wiki;
            private boolean with_media;
            private boolean with_similal_words;
            private boolean with_zpk;

            public get_topic_resource_v2_call(TopicKey key, GetTopicResourceChannel channel, boolean with_zpk, boolean with_dict, boolean with_dict_wiki, boolean with_media, boolean with_similal_words, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.key = key;
                this.channel = channel;
                this.with_zpk = with_zpk;
                this.with_dict = with_dict;
                this.with_dict_wiki = with_dict_wiki;
                this.with_media = with_media;
                this.with_similal_words = with_similal_words;
            }

            public TopicResourceV2 getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_topic_resource_v2();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_topic_resource_v2", (byte) 1, 0));
                get_topic_resource_v2_args get_topic_resource_v2_argsVar = new get_topic_resource_v2_args();
                get_topic_resource_v2_argsVar.setKey(this.key);
                get_topic_resource_v2_argsVar.setChannel(this.channel);
                get_topic_resource_v2_argsVar.setWith_zpk(this.with_zpk);
                get_topic_resource_v2_argsVar.setWith_dict(this.with_dict);
                get_topic_resource_v2_argsVar.setWith_dict_wiki(this.with_dict_wiki);
                get_topic_resource_v2_argsVar.setWith_media(this.with_media);
                get_topic_resource_v2_argsVar.setWith_similal_words(this.with_similal_words);
                get_topic_resource_v2_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v3_call extends TAsyncMethodCall {
            private int topicId;

            public get_topic_resource_v3_call(int topicId, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.topicId = topicId;
            }

            public String getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_topic_resource_v3();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_topic_resource_v3", (byte) 1, 0));
                get_topic_resource_v3_args get_topic_resource_v3_argsVar = new get_topic_resource_v3_args();
                get_topic_resource_v3_argsVar.setTopicId(this.topicId);
                get_topic_resource_v3_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v2_call extends TAsyncMethodCall {
            private List<TopicKey> keys;

            public get_word_list_word_meta_v2_call(List<TopicKey> keys, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.keys = keys;
            }

            public List<WordListWordMetaV2> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_word_list_word_meta_v2();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_word_list_word_meta_v2", (byte) 1, 0));
                get_word_list_word_meta_v2_args get_word_list_word_meta_v2_argsVar = new get_word_list_word_meta_v2_args();
                get_word_list_word_meta_v2_argsVar.setKeys(this.keys);
                get_word_list_word_meta_v2_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v3_call extends TAsyncMethodCall {
            private int book_id;

            public get_word_list_word_meta_v3_call(int book_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.book_id = book_id;
            }

            public List<WordListWordMetaV2> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_word_list_word_meta_v3();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_word_list_word_meta_v3", (byte) 1, 0));
                get_word_list_word_meta_v3_args get_word_list_word_meta_v3_argsVar = new get_word_list_word_meta_v3_args();
                get_word_list_word_meta_v3_argsVar.setBook_id(this.book_id);
                get_word_list_word_meta_v3_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_media_update_info_call extends TAsyncMethodCall {
            private int book_id;

            public get_word_media_update_info_call(int book_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.book_id = book_id;
            }

            public List<WordMediaUpdateInfo> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_word_media_update_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_word_media_update_info", (byte) 1, 0));
                get_word_media_update_info_args get_word_media_update_info_argsVar = new get_word_media_update_info_args();
                get_word_media_update_info_argsVar.setBook_id(this.book_id);
                get_word_media_update_info_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_root_call extends TAsyncMethodCall {
            private int topic_id;

            public get_word_root_call(int topic_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.topic_id = topic_id;
            }

            public WordRootRes getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_word_root();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_word_root", (byte) 1, 0));
                get_word_root_args get_word_root_argsVar = new get_word_root_args();
                get_word_root_argsVar.setTopic_id(this.topic_id);
                get_word_root_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_infos_call extends TAsyncMethodCall {
            private List<TopicKey> keys;

            public get_zpk_infos_call(List<TopicKey> keys, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.keys = keys;
            }

            public List<ZpkInfo> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_zpk_infos();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_zpk_infos", (byte) 1, 0));
                get_zpk_infos_args get_zpk_infos_argsVar = new get_zpk_infos_args();
                get_zpk_infos_argsVar.setKeys(this.keys);
                get_zpk_infos_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_md5s_call extends TAsyncMethodCall {
            private List<TopicKey> keys;

            public get_zpk_md5s_call(List<TopicKey> keys, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.keys = keys;
            }

            public List<ZpkMd5> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_zpk_md5s();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_zpk_md5s", (byte) 1, 0));
                get_zpk_md5s_args get_zpk_md5s_argsVar = new get_zpk_md5s_args();
                get_zpk_md5s_argsVar.setKeys(this.keys);
                get_zpk_md5s_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_word_v2_call extends TAsyncMethodCall {
            private String query_str;

            public search_word_v2_call(String query_str, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.query_str = query_str;
            }

            public List<SearchWordResultV2> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_search_word_v2();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("search_word_v2", (byte) 1, 0));
                search_word_v2_args search_word_v2_argsVar = new search_word_v2_args();
                search_word_v2_argsVar.setQuery_str(this.query_str);
                search_word_v2_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_translate_bug_call extends TAsyncMethodCall {
            private int provider;
            private String source;
            private String trans;

            public submit_translate_bug_call(String source, String trans, int provider, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.source = source;
                this.trans = trans;
                this.provider = provider;
            }

            public void getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_submit_translate_bug();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("submit_translate_bug", (byte) 1, 0));
                submit_translate_bug_args submit_translate_bug_argsVar = new submit_translate_bug_args();
                submit_translate_bug_argsVar.setSource(this.source);
                submit_translate_bug_argsVar.setTrans(this.trans);
                submit_translate_bug_argsVar.setProvider(this.provider);
                submit_translate_bug_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class translate_v2_call extends TAsyncMethodCall {
            private String source;

            public translate_v2_call(String source, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.source = source;
            }

            public TransResultV2 getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_translate_v2();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("translate_v2", (byte) 1, 0));
                translate_v2_args translate_v2_argsVar = new translate_v2_args();
                translate_v2_argsVar.setSource(this.source);
                translate_v2_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class word_bug_report_call extends TAsyncMethodCall {
            private TopicKey key;
            private List<WordBugType> types;

            public word_bug_report_call(TopicKey key, List<WordBugType> types, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.key = key;
                this.types = types;
            }

            public void getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_word_bug_report();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("word_bug_report", (byte) 1, 0));
                word_bug_report_args word_bug_report_argsVar = new word_bug_report_args();
                word_bug_report_argsVar.setKey(this.key);
                word_bug_report_argsVar.setTypes(this.types);
                word_bug_report_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        public AsyncClient(TProtocolFactory protocolFactory, TAsyncClientManager clientManager, TNonblockingTransport transport) {
            super(protocolFactory, clientManager, transport);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void get_book_resource_update_info(int word_level_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_book_resource_update_info_call get_book_resource_update_info_callVar = new get_book_resource_update_info_call(word_level_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_book_resource_update_info_callVar;
            this.___manager.call(get_book_resource_update_info_callVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void get_dict_by_word_v2(String word, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_dict_by_word_v2_call get_dict_by_word_v2_callVar = new get_dict_by_word_v2_call(word, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_dict_by_word_v2_callVar;
            this.___manager.call(get_dict_by_word_v2_callVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void get_dict_wiki_by_word(String word, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_dict_wiki_by_word_call get_dict_wiki_by_word_callVar = new get_dict_wiki_by_word_call(word, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_dict_wiki_by_word_callVar;
            this.___manager.call(get_dict_wiki_by_word_callVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void get_game_word_list(GameWordReq req, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_game_word_list_call get_game_word_list_callVar = new get_game_word_list_call(req, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_game_word_list_callVar;
            this.___manager.call(get_game_word_list_callVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void get_game_word_update_info(int book_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_game_word_update_info_call get_game_word_update_info_callVar = new get_game_word_update_info_call(book_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_game_word_update_info_callVar;
            this.___manager.call(get_game_word_update_info_callVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void get_media_by_topic_ids(List<Integer> topic_ids, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_media_by_topic_ids_call get_media_by_topic_ids_callVar = new get_media_by_topic_ids_call(topic_ids, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_media_by_topic_ids_callVar;
            this.___manager.call(get_media_by_topic_ids_callVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void get_topic_resource_v2(TopicKey key, GetTopicResourceChannel channel, boolean with_zpk, boolean with_dict, boolean with_dict_wiki, boolean with_media, boolean with_similal_words, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_topic_resource_v2_call get_topic_resource_v2_callVar = new get_topic_resource_v2_call(key, channel, with_zpk, with_dict, with_dict_wiki, with_media, with_similal_words, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_topic_resource_v2_callVar;
            this.___manager.call(get_topic_resource_v2_callVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void get_topic_resource_v3(int topicId, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_topic_resource_v3_call get_topic_resource_v3_callVar = new get_topic_resource_v3_call(topicId, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_topic_resource_v3_callVar;
            this.___manager.call(get_topic_resource_v3_callVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void get_word_list_word_meta_v2(List<TopicKey> keys, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_word_list_word_meta_v2_call get_word_list_word_meta_v2_callVar = new get_word_list_word_meta_v2_call(keys, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_word_list_word_meta_v2_callVar;
            this.___manager.call(get_word_list_word_meta_v2_callVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void get_word_list_word_meta_v3(int book_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_word_list_word_meta_v3_call get_word_list_word_meta_v3_callVar = new get_word_list_word_meta_v3_call(book_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_word_list_word_meta_v3_callVar;
            this.___manager.call(get_word_list_word_meta_v3_callVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void get_word_media_update_info(int book_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_word_media_update_info_call get_word_media_update_info_callVar = new get_word_media_update_info_call(book_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_word_media_update_info_callVar;
            this.___manager.call(get_word_media_update_info_callVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void get_word_root(int topic_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_word_root_call get_word_root_callVar = new get_word_root_call(topic_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_word_root_callVar;
            this.___manager.call(get_word_root_callVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void get_zpk_infos(List<TopicKey> keys, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_zpk_infos_call get_zpk_infos_callVar = new get_zpk_infos_call(keys, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_zpk_infos_callVar;
            this.___manager.call(get_zpk_infos_callVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void get_zpk_md5s(List<TopicKey> keys, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_zpk_md5s_call get_zpk_md5s_callVar = new get_zpk_md5s_call(keys, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_zpk_md5s_callVar;
            this.___manager.call(get_zpk_md5s_callVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void search_word_v2(String query_str, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            search_word_v2_call search_word_v2_callVar = new search_word_v2_call(query_str, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = search_word_v2_callVar;
            this.___manager.call(search_word_v2_callVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void submit_translate_bug(String source, String trans, int provider, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            submit_translate_bug_call submit_translate_bug_callVar = new submit_translate_bug_call(source, trans, provider, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = submit_translate_bug_callVar;
            this.___manager.call(submit_translate_bug_callVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void translate_v2(String source, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            translate_v2_call translate_v2_callVar = new translate_v2_call(source, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = translate_v2_callVar;
            this.___manager.call(translate_v2_callVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.AsyncIface
        public void word_bug_report(TopicKey key, List<WordBugType> types, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            word_bug_report_call word_bug_report_callVar = new word_bug_report_call(key, types, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = word_bug_report_callVar;
            this.___manager.call(word_bug_report_callVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AsyncIface {
        void get_book_resource_update_info(int word_level_id, AsyncMethodCallback resultHandler) throws TException;

        void get_dict_by_word_v2(String word, AsyncMethodCallback resultHandler) throws TException;

        void get_dict_wiki_by_word(String word, AsyncMethodCallback resultHandler) throws TException;

        void get_game_word_list(GameWordReq req, AsyncMethodCallback resultHandler) throws TException;

        void get_game_word_update_info(int book_id, AsyncMethodCallback resultHandler) throws TException;

        void get_media_by_topic_ids(List<Integer> topic_ids, AsyncMethodCallback resultHandler) throws TException;

        void get_topic_resource_v2(TopicKey key, GetTopicResourceChannel channel, boolean with_zpk, boolean with_dict, boolean with_dict_wiki, boolean with_media, boolean with_similal_words, AsyncMethodCallback resultHandler) throws TException;

        void get_topic_resource_v3(int topicId, AsyncMethodCallback resultHandler) throws TException;

        void get_word_list_word_meta_v2(List<TopicKey> keys, AsyncMethodCallback resultHandler) throws TException;

        void get_word_list_word_meta_v3(int book_id, AsyncMethodCallback resultHandler) throws TException;

        void get_word_media_update_info(int book_id, AsyncMethodCallback resultHandler) throws TException;

        void get_word_root(int topic_id, AsyncMethodCallback resultHandler) throws TException;

        void get_zpk_infos(List<TopicKey> keys, AsyncMethodCallback resultHandler) throws TException;

        void get_zpk_md5s(List<TopicKey> keys, AsyncMethodCallback resultHandler) throws TException;

        void search_word_v2(String query_str, AsyncMethodCallback resultHandler) throws TException;

        void submit_translate_bug(String source, String trans, int provider, AsyncMethodCallback resultHandler) throws TException;

        void translate_v2(String source, AsyncMethodCallback resultHandler) throws TException;

        void word_bug_report(TopicKey key, List<WordBugType> types, AsyncMethodCallback resultHandler) throws TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AsyncProcessor<I extends AsyncIface> extends TBaseAsyncProcessor<I> {
        private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_book_resource_update_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_book_resource_update_info_args, BookResourceUpdateInfo> {
            public get_book_resource_update_info() {
                super("get_book_resource_update_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<BookResourceUpdateInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<BookResourceUpdateInfo>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.get_book_resource_update_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_book_resource_update_info_result get_book_resource_update_info_resultVar;
                        get_book_resource_update_info_result get_book_resource_update_info_resultVar2 = new get_book_resource_update_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_book_resource_update_info_resultVar2.boom = (SystemException) exc;
                                get_book_resource_update_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_book_resource_update_info_resultVar = r02;
                                    this.sendResponse(fb2, get_book_resource_update_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_book_resource_update_info_resultVar2.bomb = (LogicException) exc;
                                get_book_resource_update_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_book_resource_update_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_book_resource_update_info_resultVar = get_book_resource_update_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(BookResourceUpdateInfo o11) {
                        get_book_resource_update_info_result get_book_resource_update_info_resultVar = new get_book_resource_update_info_result();
                        get_book_resource_update_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_book_resource_update_info_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_book_resource_update_info_args getEmptyArgsInstance() {
                return new get_book_resource_update_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_book_resource_update_info_args args, AsyncMethodCallback<BookResourceUpdateInfo> resultHandler) throws TException {
                iface.get_book_resource_update_info(args.word_level_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_by_word_v2<I extends AsyncIface> extends AsyncProcessFunction<I, get_dict_by_word_v2_args, WordDictV2> {
            public get_dict_by_word_v2() {
                super("get_dict_by_word_v2");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<WordDictV2> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<WordDictV2>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.get_dict_by_word_v2.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_dict_by_word_v2_result get_dict_by_word_v2_resultVar;
                        get_dict_by_word_v2_result get_dict_by_word_v2_resultVar2 = new get_dict_by_word_v2_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_dict_by_word_v2_resultVar2.boom = (SystemException) exc;
                                get_dict_by_word_v2_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_dict_by_word_v2_resultVar = r02;
                                    this.sendResponse(fb2, get_dict_by_word_v2_resultVar, b11, seqid);
                                    return;
                                }
                                get_dict_by_word_v2_resultVar2.bomb = (LogicException) exc;
                                get_dict_by_word_v2_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_dict_by_word_v2_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_dict_by_word_v2_resultVar = get_dict_by_word_v2_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(WordDictV2 o11) {
                        get_dict_by_word_v2_result get_dict_by_word_v2_resultVar = new get_dict_by_word_v2_result();
                        get_dict_by_word_v2_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_dict_by_word_v2_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_dict_by_word_v2_args getEmptyArgsInstance() {
                return new get_dict_by_word_v2_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_dict_by_word_v2_args args, AsyncMethodCallback<WordDictV2> resultHandler) throws TException {
                iface.get_dict_by_word_v2(args.word, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_wiki_by_word<I extends AsyncIface> extends AsyncProcessFunction<I, get_dict_wiki_by_word_args, DictWiki> {
            public get_dict_wiki_by_word() {
                super("get_dict_wiki_by_word");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<DictWiki> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<DictWiki>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.get_dict_wiki_by_word.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_dict_wiki_by_word_result get_dict_wiki_by_word_resultVar;
                        get_dict_wiki_by_word_result get_dict_wiki_by_word_resultVar2 = new get_dict_wiki_by_word_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_dict_wiki_by_word_resultVar2.boom = (SystemException) exc;
                                get_dict_wiki_by_word_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_dict_wiki_by_word_resultVar = r02;
                                    this.sendResponse(fb2, get_dict_wiki_by_word_resultVar, b11, seqid);
                                    return;
                                }
                                get_dict_wiki_by_word_resultVar2.bomb = (LogicException) exc;
                                get_dict_wiki_by_word_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_dict_wiki_by_word_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_dict_wiki_by_word_resultVar = get_dict_wiki_by_word_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(DictWiki o11) {
                        get_dict_wiki_by_word_result get_dict_wiki_by_word_resultVar = new get_dict_wiki_by_word_result();
                        get_dict_wiki_by_word_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_dict_wiki_by_word_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_dict_wiki_by_word_args getEmptyArgsInstance() {
                return new get_dict_wiki_by_word_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_dict_wiki_by_word_args args, AsyncMethodCallback<DictWiki> resultHandler) throws TException {
                iface.get_dict_wiki_by_word(args.word, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_list<I extends AsyncIface> extends AsyncProcessFunction<I, get_game_word_list_args, List<GameWordItem>> {
            public get_game_word_list() {
                super("get_game_word_list");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<GameWordItem>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<GameWordItem>>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.get_game_word_list.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_game_word_list_result get_game_word_list_resultVar;
                        get_game_word_list_result get_game_word_list_resultVar2 = new get_game_word_list_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_game_word_list_resultVar2.boom = (SystemException) exc;
                                get_game_word_list_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_game_word_list_resultVar = r02;
                                    this.sendResponse(fb2, get_game_word_list_resultVar, b11, seqid);
                                    return;
                                }
                                get_game_word_list_resultVar2.bomb = (LogicException) exc;
                                get_game_word_list_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_game_word_list_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_game_word_list_resultVar = get_game_word_list_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<GameWordItem> o11) {
                        get_game_word_list_result get_game_word_list_resultVar = new get_game_word_list_result();
                        get_game_word_list_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_game_word_list_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_game_word_list_args getEmptyArgsInstance() {
                return new get_game_word_list_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_game_word_list_args args, AsyncMethodCallback<List<GameWordItem>> resultHandler) throws TException {
                iface.get_game_word_list(args.req, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_update_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_game_word_update_info_args, List<GameWordItemUpdateInfo>> {
            public get_game_word_update_info() {
                super("get_game_word_update_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<GameWordItemUpdateInfo>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<GameWordItemUpdateInfo>>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.get_game_word_update_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_game_word_update_info_result get_game_word_update_info_resultVar;
                        get_game_word_update_info_result get_game_word_update_info_resultVar2 = new get_game_word_update_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_game_word_update_info_resultVar2.boom = (SystemException) exc;
                                get_game_word_update_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_game_word_update_info_resultVar = r02;
                                    this.sendResponse(fb2, get_game_word_update_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_game_word_update_info_resultVar2.bomb = (LogicException) exc;
                                get_game_word_update_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_game_word_update_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_game_word_update_info_resultVar = get_game_word_update_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<GameWordItemUpdateInfo> o11) {
                        get_game_word_update_info_result get_game_word_update_info_resultVar = new get_game_word_update_info_result();
                        get_game_word_update_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_game_word_update_info_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_game_word_update_info_args getEmptyArgsInstance() {
                return new get_game_word_update_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_game_word_update_info_args args, AsyncMethodCallback<List<GameWordItemUpdateInfo>> resultHandler) throws TException {
                iface.get_game_word_update_info(args.book_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_media_by_topic_ids<I extends AsyncIface> extends AsyncProcessFunction<I, get_media_by_topic_ids_args, List<WordMedia>> {
            public get_media_by_topic_ids() {
                super("get_media_by_topic_ids");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<WordMedia>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<WordMedia>>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.get_media_by_topic_ids.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_media_by_topic_ids_result get_media_by_topic_ids_resultVar;
                        get_media_by_topic_ids_result get_media_by_topic_ids_resultVar2 = new get_media_by_topic_ids_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_media_by_topic_ids_resultVar2.boom = (SystemException) exc;
                                get_media_by_topic_ids_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_media_by_topic_ids_resultVar = r02;
                                    this.sendResponse(fb2, get_media_by_topic_ids_resultVar, b11, seqid);
                                    return;
                                }
                                get_media_by_topic_ids_resultVar2.bomb = (LogicException) exc;
                                get_media_by_topic_ids_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_media_by_topic_ids_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_media_by_topic_ids_resultVar = get_media_by_topic_ids_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<WordMedia> o11) {
                        get_media_by_topic_ids_result get_media_by_topic_ids_resultVar = new get_media_by_topic_ids_result();
                        get_media_by_topic_ids_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_media_by_topic_ids_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_media_by_topic_ids_args getEmptyArgsInstance() {
                return new get_media_by_topic_ids_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_media_by_topic_ids_args args, AsyncMethodCallback<List<WordMedia>> resultHandler) throws TException {
                iface.get_media_by_topic_ids(args.topic_ids, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v2<I extends AsyncIface> extends AsyncProcessFunction<I, get_topic_resource_v2_args, TopicResourceV2> {
            public get_topic_resource_v2() {
                super("get_topic_resource_v2");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<TopicResourceV2> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<TopicResourceV2>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.get_topic_resource_v2.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_topic_resource_v2_result get_topic_resource_v2_resultVar;
                        get_topic_resource_v2_result get_topic_resource_v2_resultVar2 = new get_topic_resource_v2_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_topic_resource_v2_resultVar2.boom = (SystemException) exc;
                                get_topic_resource_v2_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_topic_resource_v2_resultVar = r02;
                                    this.sendResponse(fb2, get_topic_resource_v2_resultVar, b11, seqid);
                                    return;
                                }
                                get_topic_resource_v2_resultVar2.bomb = (LogicException) exc;
                                get_topic_resource_v2_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_topic_resource_v2_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_topic_resource_v2_resultVar = get_topic_resource_v2_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(TopicResourceV2 o11) {
                        get_topic_resource_v2_result get_topic_resource_v2_resultVar = new get_topic_resource_v2_result();
                        get_topic_resource_v2_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_topic_resource_v2_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_topic_resource_v2_args getEmptyArgsInstance() {
                return new get_topic_resource_v2_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_topic_resource_v2_args args, AsyncMethodCallback<TopicResourceV2> resultHandler) throws TException {
                iface.get_topic_resource_v2(args.key, args.channel, args.with_zpk, args.with_dict, args.with_dict_wiki, args.with_media, args.with_similal_words, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v3<I extends AsyncIface> extends AsyncProcessFunction<I, get_topic_resource_v3_args, String> {
            public get_topic_resource_v3() {
                super("get_topic_resource_v3");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<String> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<String>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.get_topic_resource_v3.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_topic_resource_v3_result get_topic_resource_v3_resultVar;
                        get_topic_resource_v3_result get_topic_resource_v3_resultVar2 = new get_topic_resource_v3_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_topic_resource_v3_resultVar2.boom = (SystemException) exc;
                                get_topic_resource_v3_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_topic_resource_v3_resultVar = r02;
                                    this.sendResponse(fb2, get_topic_resource_v3_resultVar, b11, seqid);
                                    return;
                                }
                                get_topic_resource_v3_resultVar2.bomb = (LogicException) exc;
                                get_topic_resource_v3_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_topic_resource_v3_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_topic_resource_v3_resultVar = get_topic_resource_v3_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(String o11) {
                        get_topic_resource_v3_result get_topic_resource_v3_resultVar = new get_topic_resource_v3_result();
                        get_topic_resource_v3_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_topic_resource_v3_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_topic_resource_v3_args getEmptyArgsInstance() {
                return new get_topic_resource_v3_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_topic_resource_v3_args args, AsyncMethodCallback<String> resultHandler) throws TException {
                iface.get_topic_resource_v3(args.topicId, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v2<I extends AsyncIface> extends AsyncProcessFunction<I, get_word_list_word_meta_v2_args, List<WordListWordMetaV2>> {
            public get_word_list_word_meta_v2() {
                super("get_word_list_word_meta_v2");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<WordListWordMetaV2>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<WordListWordMetaV2>>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.get_word_list_word_meta_v2.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_word_list_word_meta_v2_result get_word_list_word_meta_v2_resultVar;
                        get_word_list_word_meta_v2_result get_word_list_word_meta_v2_resultVar2 = new get_word_list_word_meta_v2_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_word_list_word_meta_v2_resultVar2.boom = (SystemException) exc;
                                get_word_list_word_meta_v2_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_word_list_word_meta_v2_resultVar = r02;
                                    this.sendResponse(fb2, get_word_list_word_meta_v2_resultVar, b11, seqid);
                                    return;
                                }
                                get_word_list_word_meta_v2_resultVar2.bomb = (LogicException) exc;
                                get_word_list_word_meta_v2_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_word_list_word_meta_v2_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_word_list_word_meta_v2_resultVar = get_word_list_word_meta_v2_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<WordListWordMetaV2> o11) {
                        get_word_list_word_meta_v2_result get_word_list_word_meta_v2_resultVar = new get_word_list_word_meta_v2_result();
                        get_word_list_word_meta_v2_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_word_list_word_meta_v2_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_word_list_word_meta_v2_args getEmptyArgsInstance() {
                return new get_word_list_word_meta_v2_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_word_list_word_meta_v2_args args, AsyncMethodCallback<List<WordListWordMetaV2>> resultHandler) throws TException {
                iface.get_word_list_word_meta_v2(args.keys, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v3<I extends AsyncIface> extends AsyncProcessFunction<I, get_word_list_word_meta_v3_args, List<WordListWordMetaV2>> {
            public get_word_list_word_meta_v3() {
                super("get_word_list_word_meta_v3");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<WordListWordMetaV2>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<WordListWordMetaV2>>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.get_word_list_word_meta_v3.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_word_list_word_meta_v3_result get_word_list_word_meta_v3_resultVar;
                        get_word_list_word_meta_v3_result get_word_list_word_meta_v3_resultVar2 = new get_word_list_word_meta_v3_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_word_list_word_meta_v3_resultVar2.boom = (SystemException) exc;
                                get_word_list_word_meta_v3_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_word_list_word_meta_v3_resultVar = r02;
                                    this.sendResponse(fb2, get_word_list_word_meta_v3_resultVar, b11, seqid);
                                    return;
                                }
                                get_word_list_word_meta_v3_resultVar2.bomb = (LogicException) exc;
                                get_word_list_word_meta_v3_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_word_list_word_meta_v3_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_word_list_word_meta_v3_resultVar = get_word_list_word_meta_v3_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<WordListWordMetaV2> o11) {
                        get_word_list_word_meta_v3_result get_word_list_word_meta_v3_resultVar = new get_word_list_word_meta_v3_result();
                        get_word_list_word_meta_v3_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_word_list_word_meta_v3_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_word_list_word_meta_v3_args getEmptyArgsInstance() {
                return new get_word_list_word_meta_v3_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_word_list_word_meta_v3_args args, AsyncMethodCallback<List<WordListWordMetaV2>> resultHandler) throws TException {
                iface.get_word_list_word_meta_v3(args.book_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_media_update_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_word_media_update_info_args, List<WordMediaUpdateInfo>> {
            public get_word_media_update_info() {
                super("get_word_media_update_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<WordMediaUpdateInfo>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<WordMediaUpdateInfo>>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.get_word_media_update_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_word_media_update_info_result get_word_media_update_info_resultVar;
                        get_word_media_update_info_result get_word_media_update_info_resultVar2 = new get_word_media_update_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_word_media_update_info_resultVar2.boom = (SystemException) exc;
                                get_word_media_update_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_word_media_update_info_resultVar = r02;
                                    this.sendResponse(fb2, get_word_media_update_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_word_media_update_info_resultVar2.bomb = (LogicException) exc;
                                get_word_media_update_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_word_media_update_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_word_media_update_info_resultVar = get_word_media_update_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<WordMediaUpdateInfo> o11) {
                        get_word_media_update_info_result get_word_media_update_info_resultVar = new get_word_media_update_info_result();
                        get_word_media_update_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_word_media_update_info_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_word_media_update_info_args getEmptyArgsInstance() {
                return new get_word_media_update_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_word_media_update_info_args args, AsyncMethodCallback<List<WordMediaUpdateInfo>> resultHandler) throws TException {
                iface.get_word_media_update_info(args.book_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_root<I extends AsyncIface> extends AsyncProcessFunction<I, get_word_root_args, WordRootRes> {
            public get_word_root() {
                super("get_word_root");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<WordRootRes> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<WordRootRes>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.get_word_root.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_word_root_result get_word_root_resultVar;
                        get_word_root_result get_word_root_resultVar2 = new get_word_root_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_word_root_resultVar2.boom = (SystemException) exc;
                                get_word_root_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_word_root_resultVar = r02;
                                    this.sendResponse(fb2, get_word_root_resultVar, b11, seqid);
                                    return;
                                }
                                get_word_root_resultVar2.bomb = (LogicException) exc;
                                get_word_root_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_word_root_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_word_root_resultVar = get_word_root_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(WordRootRes o11) {
                        get_word_root_result get_word_root_resultVar = new get_word_root_result();
                        get_word_root_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_word_root_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_word_root_args getEmptyArgsInstance() {
                return new get_word_root_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_word_root_args args, AsyncMethodCallback<WordRootRes> resultHandler) throws TException {
                iface.get_word_root(args.topic_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_infos<I extends AsyncIface> extends AsyncProcessFunction<I, get_zpk_infos_args, List<ZpkInfo>> {
            public get_zpk_infos() {
                super("get_zpk_infos");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<ZpkInfo>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<ZpkInfo>>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.get_zpk_infos.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_zpk_infos_result get_zpk_infos_resultVar;
                        get_zpk_infos_result get_zpk_infos_resultVar2 = new get_zpk_infos_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_zpk_infos_resultVar2.boom = (SystemException) exc;
                                get_zpk_infos_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_zpk_infos_resultVar = r02;
                                    this.sendResponse(fb2, get_zpk_infos_resultVar, b11, seqid);
                                    return;
                                }
                                get_zpk_infos_resultVar2.bomb = (LogicException) exc;
                                get_zpk_infos_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_zpk_infos_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_zpk_infos_resultVar = get_zpk_infos_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<ZpkInfo> o11) {
                        get_zpk_infos_result get_zpk_infos_resultVar = new get_zpk_infos_result();
                        get_zpk_infos_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_zpk_infos_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_zpk_infos_args getEmptyArgsInstance() {
                return new get_zpk_infos_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_zpk_infos_args args, AsyncMethodCallback<List<ZpkInfo>> resultHandler) throws TException {
                iface.get_zpk_infos(args.keys, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_md5s<I extends AsyncIface> extends AsyncProcessFunction<I, get_zpk_md5s_args, List<ZpkMd5>> {
            public get_zpk_md5s() {
                super("get_zpk_md5s");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<ZpkMd5>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<ZpkMd5>>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.get_zpk_md5s.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_zpk_md5s_result get_zpk_md5s_resultVar;
                        get_zpk_md5s_result get_zpk_md5s_resultVar2 = new get_zpk_md5s_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_zpk_md5s_resultVar2.boom = (SystemException) exc;
                                get_zpk_md5s_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_zpk_md5s_resultVar = r02;
                                    this.sendResponse(fb2, get_zpk_md5s_resultVar, b11, seqid);
                                    return;
                                }
                                get_zpk_md5s_resultVar2.bomb = (LogicException) exc;
                                get_zpk_md5s_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_zpk_md5s_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_zpk_md5s_resultVar = get_zpk_md5s_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<ZpkMd5> o11) {
                        get_zpk_md5s_result get_zpk_md5s_resultVar = new get_zpk_md5s_result();
                        get_zpk_md5s_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_zpk_md5s_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_zpk_md5s_args getEmptyArgsInstance() {
                return new get_zpk_md5s_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_zpk_md5s_args args, AsyncMethodCallback<List<ZpkMd5>> resultHandler) throws TException {
                iface.get_zpk_md5s(args.keys, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_word_v2<I extends AsyncIface> extends AsyncProcessFunction<I, search_word_v2_args, List<SearchWordResultV2>> {
            public search_word_v2() {
                super("search_word_v2");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<SearchWordResultV2>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<SearchWordResultV2>>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.search_word_v2.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        search_word_v2_result search_word_v2_resultVar;
                        search_word_v2_result search_word_v2_resultVar2 = new search_word_v2_result();
                        try {
                            if (exc instanceof SystemException) {
                                search_word_v2_resultVar2.boom = (SystemException) exc;
                                search_word_v2_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    search_word_v2_resultVar = r02;
                                    this.sendResponse(fb2, search_word_v2_resultVar, b11, seqid);
                                    return;
                                }
                                search_word_v2_resultVar2.bomb = (LogicException) exc;
                                search_word_v2_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, search_word_v2_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        search_word_v2_resultVar = search_word_v2_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<SearchWordResultV2> o11) {
                        search_word_v2_result search_word_v2_resultVar = new search_word_v2_result();
                        search_word_v2_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, search_word_v2_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public search_word_v2_args getEmptyArgsInstance() {
                return new search_word_v2_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, search_word_v2_args args, AsyncMethodCallback<List<SearchWordResultV2>> resultHandler) throws TException {
                iface.search_word_v2(args.query_str, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_translate_bug<I extends AsyncIface> extends AsyncProcessFunction<I, submit_translate_bug_args, Void> {
            public submit_translate_bug() {
                super("submit_translate_bug");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.submit_translate_bug.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        submit_translate_bug_result submit_translate_bug_resultVar;
                        submit_translate_bug_result submit_translate_bug_resultVar2 = new submit_translate_bug_result();
                        try {
                            if (exc instanceof SystemException) {
                                submit_translate_bug_resultVar2.boom = (SystemException) exc;
                                submit_translate_bug_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    submit_translate_bug_resultVar = r02;
                                    this.sendResponse(fb2, submit_translate_bug_resultVar, b11, seqid);
                                    return;
                                }
                                submit_translate_bug_resultVar2.bomb = (LogicException) exc;
                                submit_translate_bug_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, submit_translate_bug_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        submit_translate_bug_resultVar = submit_translate_bug_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new submit_translate_bug_result(), (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public submit_translate_bug_args getEmptyArgsInstance() {
                return new submit_translate_bug_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, submit_translate_bug_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.submit_translate_bug(args.source, args.trans, args.provider, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class translate_v2<I extends AsyncIface> extends AsyncProcessFunction<I, translate_v2_args, TransResultV2> {
            public translate_v2() {
                super("translate_v2");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<TransResultV2> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<TransResultV2>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.translate_v2.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        translate_v2_result translate_v2_resultVar;
                        translate_v2_result translate_v2_resultVar2 = new translate_v2_result();
                        try {
                            if (exc instanceof SystemException) {
                                translate_v2_resultVar2.boom = (SystemException) exc;
                                translate_v2_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    translate_v2_resultVar = r02;
                                    this.sendResponse(fb2, translate_v2_resultVar, b11, seqid);
                                    return;
                                }
                                translate_v2_resultVar2.bomb = (LogicException) exc;
                                translate_v2_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, translate_v2_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        translate_v2_resultVar = translate_v2_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(TransResultV2 o11) {
                        translate_v2_result translate_v2_resultVar = new translate_v2_result();
                        translate_v2_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, translate_v2_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public translate_v2_args getEmptyArgsInstance() {
                return new translate_v2_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, translate_v2_args args, AsyncMethodCallback<TransResultV2> resultHandler) throws TException {
                iface.translate_v2(args.source, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class word_bug_report<I extends AsyncIface> extends AsyncProcessFunction<I, word_bug_report_args, Void> {
            public word_bug_report() {
                super("word_bug_report");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.resource_api.ResourceService.AsyncProcessor.word_bug_report.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        word_bug_report_result word_bug_report_resultVar;
                        word_bug_report_result word_bug_report_resultVar2 = new word_bug_report_result();
                        try {
                            if (exc instanceof SystemException) {
                                word_bug_report_resultVar2.boom = (SystemException) exc;
                                word_bug_report_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    word_bug_report_resultVar = r02;
                                    this.sendResponse(fb2, word_bug_report_resultVar, b11, seqid);
                                    return;
                                }
                                word_bug_report_resultVar2.bomb = (LogicException) exc;
                                word_bug_report_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, word_bug_report_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        word_bug_report_resultVar = word_bug_report_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new word_bug_report_result(), (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public word_bug_report_args getEmptyArgsInstance() {
                return new word_bug_report_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, word_bug_report_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.word_bug_report(args.key, args.types, resultHandler);
            }
        }

        public AsyncProcessor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends AsyncIface> Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> getProcessMap(Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> processMap) {
            processMap.put("get_media_by_topic_ids", new get_media_by_topic_ids());
            processMap.put("get_word_media_update_info", new get_word_media_update_info());
            processMap.put("get_book_resource_update_info", new get_book_resource_update_info());
            processMap.put("search_word_v2", new search_word_v2());
            processMap.put("get_zpk_infos", new get_zpk_infos());
            processMap.put("get_zpk_md5s", new get_zpk_md5s());
            processMap.put("get_dict_by_word_v2", new get_dict_by_word_v2());
            processMap.put("get_dict_wiki_by_word", new get_dict_wiki_by_word());
            processMap.put("get_topic_resource_v2", new get_topic_resource_v2());
            processMap.put("get_topic_resource_v3", new get_topic_resource_v3());
            processMap.put("get_word_list_word_meta_v2", new get_word_list_word_meta_v2());
            processMap.put("get_word_list_word_meta_v3", new get_word_list_word_meta_v3());
            processMap.put("get_game_word_list", new get_game_word_list());
            processMap.put("get_game_word_update_info", new get_game_word_update_info());
            processMap.put("get_word_root", new get_word_root());
            processMap.put("translate_v2", new translate_v2());
            processMap.put("submit_translate_bug", new submit_translate_bug());
            processMap.put("word_bug_report", new word_bug_report());
            return processMap;
        }

        public AsyncProcessor(I iface, Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> processMap) {
            super(iface, getProcessMap(processMap));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Client extends TServiceClient implements Iface {
        public Client(TProtocol prot) {
            super(prot, prot);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public BookResourceUpdateInfo get_book_resource_update_info(int word_level_id) throws SystemException, LogicException, TException {
            send_get_book_resource_update_info(word_level_id);
            return recv_get_book_resource_update_info();
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public WordDictV2 get_dict_by_word_v2(String word) throws SystemException, LogicException, TException {
            send_get_dict_by_word_v2(word);
            return recv_get_dict_by_word_v2();
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public DictWiki get_dict_wiki_by_word(String word) throws SystemException, LogicException, TException {
            send_get_dict_wiki_by_word(word);
            return recv_get_dict_wiki_by_word();
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public List<GameWordItem> get_game_word_list(GameWordReq req) throws SystemException, LogicException, TException {
            send_get_game_word_list(req);
            return recv_get_game_word_list();
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public List<GameWordItemUpdateInfo> get_game_word_update_info(int book_id) throws SystemException, LogicException, TException {
            send_get_game_word_update_info(book_id);
            return recv_get_game_word_update_info();
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public List<WordMedia> get_media_by_topic_ids(List<Integer> topic_ids) throws SystemException, LogicException, TException {
            send_get_media_by_topic_ids(topic_ids);
            return recv_get_media_by_topic_ids();
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public TopicResourceV2 get_topic_resource_v2(TopicKey key, GetTopicResourceChannel channel, boolean with_zpk, boolean with_dict, boolean with_dict_wiki, boolean with_media, boolean with_similal_words) throws SystemException, LogicException, TException {
            send_get_topic_resource_v2(key, channel, with_zpk, with_dict, with_dict_wiki, with_media, with_similal_words);
            return recv_get_topic_resource_v2();
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public String get_topic_resource_v3(int topicId) throws SystemException, LogicException, TException {
            send_get_topic_resource_v3(topicId);
            return recv_get_topic_resource_v3();
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public List<WordListWordMetaV2> get_word_list_word_meta_v2(List<TopicKey> keys) throws SystemException, LogicException, TException {
            send_get_word_list_word_meta_v2(keys);
            return recv_get_word_list_word_meta_v2();
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public List<WordListWordMetaV2> get_word_list_word_meta_v3(int book_id) throws SystemException, LogicException, TException {
            send_get_word_list_word_meta_v3(book_id);
            return recv_get_word_list_word_meta_v3();
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public List<WordMediaUpdateInfo> get_word_media_update_info(int book_id) throws SystemException, LogicException, TException {
            send_get_word_media_update_info(book_id);
            return recv_get_word_media_update_info();
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public WordRootRes get_word_root(int topic_id) throws SystemException, LogicException, TException {
            send_get_word_root(topic_id);
            return recv_get_word_root();
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public List<ZpkInfo> get_zpk_infos(List<TopicKey> keys) throws SystemException, LogicException, TException {
            send_get_zpk_infos(keys);
            return recv_get_zpk_infos();
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public List<ZpkMd5> get_zpk_md5s(List<TopicKey> keys) throws SystemException, LogicException, TException {
            send_get_zpk_md5s(keys);
            return recv_get_zpk_md5s();
        }

        public BookResourceUpdateInfo recv_get_book_resource_update_info() throws SystemException, LogicException, TException {
            get_book_resource_update_info_result get_book_resource_update_info_resultVar = new get_book_resource_update_info_result();
            receiveBase(get_book_resource_update_info_resultVar, "get_book_resource_update_info");
            if (get_book_resource_update_info_resultVar.isSetSuccess()) {
                return get_book_resource_update_info_resultVar.success;
            }
            SystemException systemException = get_book_resource_update_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_book_resource_update_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_book_resource_update_info failed: unknown result");
        }

        public WordDictV2 recv_get_dict_by_word_v2() throws SystemException, LogicException, TException {
            get_dict_by_word_v2_result get_dict_by_word_v2_resultVar = new get_dict_by_word_v2_result();
            receiveBase(get_dict_by_word_v2_resultVar, "get_dict_by_word_v2");
            if (get_dict_by_word_v2_resultVar.isSetSuccess()) {
                return get_dict_by_word_v2_resultVar.success;
            }
            SystemException systemException = get_dict_by_word_v2_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_dict_by_word_v2_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_dict_by_word_v2 failed: unknown result");
        }

        public DictWiki recv_get_dict_wiki_by_word() throws SystemException, LogicException, TException {
            get_dict_wiki_by_word_result get_dict_wiki_by_word_resultVar = new get_dict_wiki_by_word_result();
            receiveBase(get_dict_wiki_by_word_resultVar, "get_dict_wiki_by_word");
            if (get_dict_wiki_by_word_resultVar.isSetSuccess()) {
                return get_dict_wiki_by_word_resultVar.success;
            }
            SystemException systemException = get_dict_wiki_by_word_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_dict_wiki_by_word_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_dict_wiki_by_word failed: unknown result");
        }

        public List<GameWordItem> recv_get_game_word_list() throws SystemException, LogicException, TException {
            get_game_word_list_result get_game_word_list_resultVar = new get_game_word_list_result();
            receiveBase(get_game_word_list_resultVar, "get_game_word_list");
            if (get_game_word_list_resultVar.isSetSuccess()) {
                return get_game_word_list_resultVar.success;
            }
            SystemException systemException = get_game_word_list_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_game_word_list_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_game_word_list failed: unknown result");
        }

        public List<GameWordItemUpdateInfo> recv_get_game_word_update_info() throws SystemException, LogicException, TException {
            get_game_word_update_info_result get_game_word_update_info_resultVar = new get_game_word_update_info_result();
            receiveBase(get_game_word_update_info_resultVar, "get_game_word_update_info");
            if (get_game_word_update_info_resultVar.isSetSuccess()) {
                return get_game_word_update_info_resultVar.success;
            }
            SystemException systemException = get_game_word_update_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_game_word_update_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_game_word_update_info failed: unknown result");
        }

        public List<WordMedia> recv_get_media_by_topic_ids() throws SystemException, LogicException, TException {
            get_media_by_topic_ids_result get_media_by_topic_ids_resultVar = new get_media_by_topic_ids_result();
            receiveBase(get_media_by_topic_ids_resultVar, "get_media_by_topic_ids");
            if (get_media_by_topic_ids_resultVar.isSetSuccess()) {
                return get_media_by_topic_ids_resultVar.success;
            }
            SystemException systemException = get_media_by_topic_ids_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_media_by_topic_ids_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_media_by_topic_ids failed: unknown result");
        }

        public TopicResourceV2 recv_get_topic_resource_v2() throws SystemException, LogicException, TException {
            get_topic_resource_v2_result get_topic_resource_v2_resultVar = new get_topic_resource_v2_result();
            receiveBase(get_topic_resource_v2_resultVar, "get_topic_resource_v2");
            if (get_topic_resource_v2_resultVar.isSetSuccess()) {
                return get_topic_resource_v2_resultVar.success;
            }
            SystemException systemException = get_topic_resource_v2_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_topic_resource_v2_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_topic_resource_v2 failed: unknown result");
        }

        public String recv_get_topic_resource_v3() throws SystemException, LogicException, TException {
            get_topic_resource_v3_result get_topic_resource_v3_resultVar = new get_topic_resource_v3_result();
            receiveBase(get_topic_resource_v3_resultVar, "get_topic_resource_v3");
            if (get_topic_resource_v3_resultVar.isSetSuccess()) {
                return get_topic_resource_v3_resultVar.success;
            }
            SystemException systemException = get_topic_resource_v3_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_topic_resource_v3_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_topic_resource_v3 failed: unknown result");
        }

        public List<WordListWordMetaV2> recv_get_word_list_word_meta_v2() throws SystemException, LogicException, TException {
            get_word_list_word_meta_v2_result get_word_list_word_meta_v2_resultVar = new get_word_list_word_meta_v2_result();
            receiveBase(get_word_list_word_meta_v2_resultVar, "get_word_list_word_meta_v2");
            if (get_word_list_word_meta_v2_resultVar.isSetSuccess()) {
                return get_word_list_word_meta_v2_resultVar.success;
            }
            SystemException systemException = get_word_list_word_meta_v2_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_word_list_word_meta_v2_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_word_list_word_meta_v2 failed: unknown result");
        }

        public List<WordListWordMetaV2> recv_get_word_list_word_meta_v3() throws SystemException, LogicException, TException {
            get_word_list_word_meta_v3_result get_word_list_word_meta_v3_resultVar = new get_word_list_word_meta_v3_result();
            receiveBase(get_word_list_word_meta_v3_resultVar, "get_word_list_word_meta_v3");
            if (get_word_list_word_meta_v3_resultVar.isSetSuccess()) {
                return get_word_list_word_meta_v3_resultVar.success;
            }
            SystemException systemException = get_word_list_word_meta_v3_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_word_list_word_meta_v3_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_word_list_word_meta_v3 failed: unknown result");
        }

        public List<WordMediaUpdateInfo> recv_get_word_media_update_info() throws SystemException, LogicException, TException {
            get_word_media_update_info_result get_word_media_update_info_resultVar = new get_word_media_update_info_result();
            receiveBase(get_word_media_update_info_resultVar, "get_word_media_update_info");
            if (get_word_media_update_info_resultVar.isSetSuccess()) {
                return get_word_media_update_info_resultVar.success;
            }
            SystemException systemException = get_word_media_update_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_word_media_update_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_word_media_update_info failed: unknown result");
        }

        public WordRootRes recv_get_word_root() throws SystemException, LogicException, TException {
            get_word_root_result get_word_root_resultVar = new get_word_root_result();
            receiveBase(get_word_root_resultVar, "get_word_root");
            if (get_word_root_resultVar.isSetSuccess()) {
                return get_word_root_resultVar.success;
            }
            SystemException systemException = get_word_root_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_word_root_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_word_root failed: unknown result");
        }

        public List<ZpkInfo> recv_get_zpk_infos() throws SystemException, LogicException, TException {
            get_zpk_infos_result get_zpk_infos_resultVar = new get_zpk_infos_result();
            receiveBase(get_zpk_infos_resultVar, "get_zpk_infos");
            if (get_zpk_infos_resultVar.isSetSuccess()) {
                return get_zpk_infos_resultVar.success;
            }
            SystemException systemException = get_zpk_infos_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_zpk_infos_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_zpk_infos failed: unknown result");
        }

        public List<ZpkMd5> recv_get_zpk_md5s() throws SystemException, LogicException, TException {
            get_zpk_md5s_result get_zpk_md5s_resultVar = new get_zpk_md5s_result();
            receiveBase(get_zpk_md5s_resultVar, "get_zpk_md5s");
            if (get_zpk_md5s_resultVar.isSetSuccess()) {
                return get_zpk_md5s_resultVar.success;
            }
            SystemException systemException = get_zpk_md5s_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_zpk_md5s_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_zpk_md5s failed: unknown result");
        }

        public List<SearchWordResultV2> recv_search_word_v2() throws SystemException, LogicException, TException {
            search_word_v2_result search_word_v2_resultVar = new search_word_v2_result();
            receiveBase(search_word_v2_resultVar, "search_word_v2");
            if (search_word_v2_resultVar.isSetSuccess()) {
                return search_word_v2_resultVar.success;
            }
            SystemException systemException = search_word_v2_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = search_word_v2_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "search_word_v2 failed: unknown result");
        }

        public void recv_submit_translate_bug() throws SystemException, LogicException, TException {
            submit_translate_bug_result submit_translate_bug_resultVar = new submit_translate_bug_result();
            receiveBase(submit_translate_bug_resultVar, "submit_translate_bug");
            SystemException systemException = submit_translate_bug_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = submit_translate_bug_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
        }

        public TransResultV2 recv_translate_v2() throws SystemException, LogicException, TException {
            translate_v2_result translate_v2_resultVar = new translate_v2_result();
            receiveBase(translate_v2_resultVar, "translate_v2");
            if (translate_v2_resultVar.isSetSuccess()) {
                return translate_v2_resultVar.success;
            }
            SystemException systemException = translate_v2_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = translate_v2_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "translate_v2 failed: unknown result");
        }

        public void recv_word_bug_report() throws SystemException, LogicException, TException {
            word_bug_report_result word_bug_report_resultVar = new word_bug_report_result();
            receiveBase(word_bug_report_resultVar, "word_bug_report");
            SystemException systemException = word_bug_report_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = word_bug_report_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public List<SearchWordResultV2> search_word_v2(String query_str) throws SystemException, LogicException, TException {
            send_search_word_v2(query_str);
            return recv_search_word_v2();
        }

        public void send_get_book_resource_update_info(int word_level_id) throws TException {
            get_book_resource_update_info_args get_book_resource_update_info_argsVar = new get_book_resource_update_info_args();
            get_book_resource_update_info_argsVar.setWord_level_id(word_level_id);
            sendBase("get_book_resource_update_info", get_book_resource_update_info_argsVar);
        }

        public void send_get_dict_by_word_v2(String word) throws TException {
            get_dict_by_word_v2_args get_dict_by_word_v2_argsVar = new get_dict_by_word_v2_args();
            get_dict_by_word_v2_argsVar.setWord(word);
            sendBase("get_dict_by_word_v2", get_dict_by_word_v2_argsVar);
        }

        public void send_get_dict_wiki_by_word(String word) throws TException {
            get_dict_wiki_by_word_args get_dict_wiki_by_word_argsVar = new get_dict_wiki_by_word_args();
            get_dict_wiki_by_word_argsVar.setWord(word);
            sendBase("get_dict_wiki_by_word", get_dict_wiki_by_word_argsVar);
        }

        public void send_get_game_word_list(GameWordReq req) throws TException {
            get_game_word_list_args get_game_word_list_argsVar = new get_game_word_list_args();
            get_game_word_list_argsVar.setReq(req);
            sendBase("get_game_word_list", get_game_word_list_argsVar);
        }

        public void send_get_game_word_update_info(int book_id) throws TException {
            get_game_word_update_info_args get_game_word_update_info_argsVar = new get_game_word_update_info_args();
            get_game_word_update_info_argsVar.setBook_id(book_id);
            sendBase("get_game_word_update_info", get_game_word_update_info_argsVar);
        }

        public void send_get_media_by_topic_ids(List<Integer> topic_ids) throws TException {
            get_media_by_topic_ids_args get_media_by_topic_ids_argsVar = new get_media_by_topic_ids_args();
            get_media_by_topic_ids_argsVar.setTopic_ids(topic_ids);
            sendBase("get_media_by_topic_ids", get_media_by_topic_ids_argsVar);
        }

        public void send_get_topic_resource_v2(TopicKey key, GetTopicResourceChannel channel, boolean with_zpk, boolean with_dict, boolean with_dict_wiki, boolean with_media, boolean with_similal_words) throws TException {
            get_topic_resource_v2_args get_topic_resource_v2_argsVar = new get_topic_resource_v2_args();
            get_topic_resource_v2_argsVar.setKey(key);
            get_topic_resource_v2_argsVar.setChannel(channel);
            get_topic_resource_v2_argsVar.setWith_zpk(with_zpk);
            get_topic_resource_v2_argsVar.setWith_dict(with_dict);
            get_topic_resource_v2_argsVar.setWith_dict_wiki(with_dict_wiki);
            get_topic_resource_v2_argsVar.setWith_media(with_media);
            get_topic_resource_v2_argsVar.setWith_similal_words(with_similal_words);
            sendBase("get_topic_resource_v2", get_topic_resource_v2_argsVar);
        }

        public void send_get_topic_resource_v3(int topicId) throws TException {
            get_topic_resource_v3_args get_topic_resource_v3_argsVar = new get_topic_resource_v3_args();
            get_topic_resource_v3_argsVar.setTopicId(topicId);
            sendBase("get_topic_resource_v3", get_topic_resource_v3_argsVar);
        }

        public void send_get_word_list_word_meta_v2(List<TopicKey> keys) throws TException {
            get_word_list_word_meta_v2_args get_word_list_word_meta_v2_argsVar = new get_word_list_word_meta_v2_args();
            get_word_list_word_meta_v2_argsVar.setKeys(keys);
            sendBase("get_word_list_word_meta_v2", get_word_list_word_meta_v2_argsVar);
        }

        public void send_get_word_list_word_meta_v3(int book_id) throws TException {
            get_word_list_word_meta_v3_args get_word_list_word_meta_v3_argsVar = new get_word_list_word_meta_v3_args();
            get_word_list_word_meta_v3_argsVar.setBook_id(book_id);
            sendBase("get_word_list_word_meta_v3", get_word_list_word_meta_v3_argsVar);
        }

        public void send_get_word_media_update_info(int book_id) throws TException {
            get_word_media_update_info_args get_word_media_update_info_argsVar = new get_word_media_update_info_args();
            get_word_media_update_info_argsVar.setBook_id(book_id);
            sendBase("get_word_media_update_info", get_word_media_update_info_argsVar);
        }

        public void send_get_word_root(int topic_id) throws TException {
            get_word_root_args get_word_root_argsVar = new get_word_root_args();
            get_word_root_argsVar.setTopic_id(topic_id);
            sendBase("get_word_root", get_word_root_argsVar);
        }

        public void send_get_zpk_infos(List<TopicKey> keys) throws TException {
            get_zpk_infos_args get_zpk_infos_argsVar = new get_zpk_infos_args();
            get_zpk_infos_argsVar.setKeys(keys);
            sendBase("get_zpk_infos", get_zpk_infos_argsVar);
        }

        public void send_get_zpk_md5s(List<TopicKey> keys) throws TException {
            get_zpk_md5s_args get_zpk_md5s_argsVar = new get_zpk_md5s_args();
            get_zpk_md5s_argsVar.setKeys(keys);
            sendBase("get_zpk_md5s", get_zpk_md5s_argsVar);
        }

        public void send_search_word_v2(String query_str) throws TException {
            search_word_v2_args search_word_v2_argsVar = new search_word_v2_args();
            search_word_v2_argsVar.setQuery_str(query_str);
            sendBase("search_word_v2", search_word_v2_argsVar);
        }

        public void send_submit_translate_bug(String source, String trans, int provider) throws TException {
            submit_translate_bug_args submit_translate_bug_argsVar = new submit_translate_bug_args();
            submit_translate_bug_argsVar.setSource(source);
            submit_translate_bug_argsVar.setTrans(trans);
            submit_translate_bug_argsVar.setProvider(provider);
            sendBase("submit_translate_bug", submit_translate_bug_argsVar);
        }

        public void send_translate_v2(String source) throws TException {
            translate_v2_args translate_v2_argsVar = new translate_v2_args();
            translate_v2_argsVar.setSource(source);
            sendBase("translate_v2", translate_v2_argsVar);
        }

        public void send_word_bug_report(TopicKey key, List<WordBugType> types) throws TException {
            word_bug_report_args word_bug_report_argsVar = new word_bug_report_args();
            word_bug_report_argsVar.setKey(key);
            word_bug_report_argsVar.setTypes(types);
            sendBase("word_bug_report", word_bug_report_argsVar);
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public void submit_translate_bug(String source, String trans, int provider) throws SystemException, LogicException, TException {
            send_submit_translate_bug(source, trans, provider);
            recv_submit_translate_bug();
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public TransResultV2 translate_v2(String source) throws SystemException, LogicException, TException {
            send_translate_v2(source);
            return recv_translate_v2();
        }

        @Override // com.baicizhan.online.resource_api.ResourceService.Iface
        public void word_bug_report(TopicKey key, List<WordBugType> types) throws SystemException, LogicException, TException {
            send_word_bug_report(key, types);
            recv_word_bug_report();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class Factory implements TServiceClientFactory<Client> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.TServiceClientFactory
            public Client getClient(TProtocol prot) {
                return new Client(prot);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.TServiceClientFactory
            public Client getClient(TProtocol iprot, TProtocol oprot) {
                return new Client(iprot, oprot);
            }
        }

        public Client(TProtocol iprot, TProtocol oprot) {
            super(iprot, oprot);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Iface {
        BookResourceUpdateInfo get_book_resource_update_info(int word_level_id) throws SystemException, LogicException, TException;

        WordDictV2 get_dict_by_word_v2(String word) throws SystemException, LogicException, TException;

        DictWiki get_dict_wiki_by_word(String word) throws SystemException, LogicException, TException;

        List<GameWordItem> get_game_word_list(GameWordReq req) throws SystemException, LogicException, TException;

        List<GameWordItemUpdateInfo> get_game_word_update_info(int book_id) throws SystemException, LogicException, TException;

        List<WordMedia> get_media_by_topic_ids(List<Integer> topic_ids) throws SystemException, LogicException, TException;

        TopicResourceV2 get_topic_resource_v2(TopicKey key, GetTopicResourceChannel channel, boolean with_zpk, boolean with_dict, boolean with_dict_wiki, boolean with_media, boolean with_similal_words) throws SystemException, LogicException, TException;

        String get_topic_resource_v3(int topicId) throws SystemException, LogicException, TException;

        List<WordListWordMetaV2> get_word_list_word_meta_v2(List<TopicKey> keys) throws SystemException, LogicException, TException;

        List<WordListWordMetaV2> get_word_list_word_meta_v3(int book_id) throws SystemException, LogicException, TException;

        List<WordMediaUpdateInfo> get_word_media_update_info(int book_id) throws SystemException, LogicException, TException;

        WordRootRes get_word_root(int topic_id) throws SystemException, LogicException, TException;

        List<ZpkInfo> get_zpk_infos(List<TopicKey> keys) throws SystemException, LogicException, TException;

        List<ZpkMd5> get_zpk_md5s(List<TopicKey> keys) throws SystemException, LogicException, TException;

        List<SearchWordResultV2> search_word_v2(String query_str) throws SystemException, LogicException, TException;

        void submit_translate_bug(String source, String trans, int provider) throws SystemException, LogicException, TException;

        TransResultV2 translate_v2(String source) throws SystemException, LogicException, TException;

        void word_bug_report(TopicKey key, List<WordBugType> types) throws SystemException, LogicException, TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Processor<I extends Iface> extends TBaseProcessor<I> implements TProcessor {
        private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_book_resource_update_info<I extends Iface> extends ProcessFunction<I, get_book_resource_update_info_args> {
            public get_book_resource_update_info() {
                super("get_book_resource_update_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_book_resource_update_info_args getEmptyArgsInstance() {
                return new get_book_resource_update_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_book_resource_update_info_result getResult(I iface, get_book_resource_update_info_args args) throws TException {
                get_book_resource_update_info_result get_book_resource_update_info_resultVar = new get_book_resource_update_info_result();
                try {
                    get_book_resource_update_info_resultVar.success = iface.get_book_resource_update_info(args.word_level_id);
                    return get_book_resource_update_info_resultVar;
                } catch (LogicException e11) {
                    get_book_resource_update_info_resultVar.bomb = e11;
                    return get_book_resource_update_info_resultVar;
                } catch (SystemException e12) {
                    get_book_resource_update_info_resultVar.boom = e12;
                    return get_book_resource_update_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_by_word_v2<I extends Iface> extends ProcessFunction<I, get_dict_by_word_v2_args> {
            public get_dict_by_word_v2() {
                super("get_dict_by_word_v2");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_dict_by_word_v2_args getEmptyArgsInstance() {
                return new get_dict_by_word_v2_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_dict_by_word_v2_result getResult(I iface, get_dict_by_word_v2_args args) throws TException {
                get_dict_by_word_v2_result get_dict_by_word_v2_resultVar = new get_dict_by_word_v2_result();
                try {
                    get_dict_by_word_v2_resultVar.success = iface.get_dict_by_word_v2(args.word);
                    return get_dict_by_word_v2_resultVar;
                } catch (LogicException e11) {
                    get_dict_by_word_v2_resultVar.bomb = e11;
                    return get_dict_by_word_v2_resultVar;
                } catch (SystemException e12) {
                    get_dict_by_word_v2_resultVar.boom = e12;
                    return get_dict_by_word_v2_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_wiki_by_word<I extends Iface> extends ProcessFunction<I, get_dict_wiki_by_word_args> {
            public get_dict_wiki_by_word() {
                super("get_dict_wiki_by_word");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_dict_wiki_by_word_args getEmptyArgsInstance() {
                return new get_dict_wiki_by_word_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_dict_wiki_by_word_result getResult(I iface, get_dict_wiki_by_word_args args) throws TException {
                get_dict_wiki_by_word_result get_dict_wiki_by_word_resultVar = new get_dict_wiki_by_word_result();
                try {
                    get_dict_wiki_by_word_resultVar.success = iface.get_dict_wiki_by_word(args.word);
                    return get_dict_wiki_by_word_resultVar;
                } catch (LogicException e11) {
                    get_dict_wiki_by_word_resultVar.bomb = e11;
                    return get_dict_wiki_by_word_resultVar;
                } catch (SystemException e12) {
                    get_dict_wiki_by_word_resultVar.boom = e12;
                    return get_dict_wiki_by_word_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_list<I extends Iface> extends ProcessFunction<I, get_game_word_list_args> {
            public get_game_word_list() {
                super("get_game_word_list");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_game_word_list_args getEmptyArgsInstance() {
                return new get_game_word_list_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_game_word_list_result getResult(I iface, get_game_word_list_args args) throws TException {
                get_game_word_list_result get_game_word_list_resultVar = new get_game_word_list_result();
                try {
                    get_game_word_list_resultVar.success = iface.get_game_word_list(args.req);
                    return get_game_word_list_resultVar;
                } catch (LogicException e11) {
                    get_game_word_list_resultVar.bomb = e11;
                    return get_game_word_list_resultVar;
                } catch (SystemException e12) {
                    get_game_word_list_resultVar.boom = e12;
                    return get_game_word_list_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_update_info<I extends Iface> extends ProcessFunction<I, get_game_word_update_info_args> {
            public get_game_word_update_info() {
                super("get_game_word_update_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_game_word_update_info_args getEmptyArgsInstance() {
                return new get_game_word_update_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_game_word_update_info_result getResult(I iface, get_game_word_update_info_args args) throws TException {
                get_game_word_update_info_result get_game_word_update_info_resultVar = new get_game_word_update_info_result();
                try {
                    get_game_word_update_info_resultVar.success = iface.get_game_word_update_info(args.book_id);
                    return get_game_word_update_info_resultVar;
                } catch (LogicException e11) {
                    get_game_word_update_info_resultVar.bomb = e11;
                    return get_game_word_update_info_resultVar;
                } catch (SystemException e12) {
                    get_game_word_update_info_resultVar.boom = e12;
                    return get_game_word_update_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_media_by_topic_ids<I extends Iface> extends ProcessFunction<I, get_media_by_topic_ids_args> {
            public get_media_by_topic_ids() {
                super("get_media_by_topic_ids");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_media_by_topic_ids_args getEmptyArgsInstance() {
                return new get_media_by_topic_ids_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_media_by_topic_ids_result getResult(I iface, get_media_by_topic_ids_args args) throws TException {
                get_media_by_topic_ids_result get_media_by_topic_ids_resultVar = new get_media_by_topic_ids_result();
                try {
                    get_media_by_topic_ids_resultVar.success = iface.get_media_by_topic_ids(args.topic_ids);
                    return get_media_by_topic_ids_resultVar;
                } catch (LogicException e11) {
                    get_media_by_topic_ids_resultVar.bomb = e11;
                    return get_media_by_topic_ids_resultVar;
                } catch (SystemException e12) {
                    get_media_by_topic_ids_resultVar.boom = e12;
                    return get_media_by_topic_ids_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v2<I extends Iface> extends ProcessFunction<I, get_topic_resource_v2_args> {
            public get_topic_resource_v2() {
                super("get_topic_resource_v2");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_topic_resource_v2_args getEmptyArgsInstance() {
                return new get_topic_resource_v2_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_topic_resource_v2_result getResult(I iface, get_topic_resource_v2_args args) throws TException {
                get_topic_resource_v2_result get_topic_resource_v2_resultVar = new get_topic_resource_v2_result();
                try {
                    get_topic_resource_v2_resultVar.success = iface.get_topic_resource_v2(args.key, args.channel, args.with_zpk, args.with_dict, args.with_dict_wiki, args.with_media, args.with_similal_words);
                    return get_topic_resource_v2_resultVar;
                } catch (LogicException e11) {
                    get_topic_resource_v2_resultVar.bomb = e11;
                    return get_topic_resource_v2_resultVar;
                } catch (SystemException e12) {
                    get_topic_resource_v2_resultVar.boom = e12;
                    return get_topic_resource_v2_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v3<I extends Iface> extends ProcessFunction<I, get_topic_resource_v3_args> {
            public get_topic_resource_v3() {
                super("get_topic_resource_v3");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_topic_resource_v3_args getEmptyArgsInstance() {
                return new get_topic_resource_v3_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_topic_resource_v3_result getResult(I iface, get_topic_resource_v3_args args) throws TException {
                get_topic_resource_v3_result get_topic_resource_v3_resultVar = new get_topic_resource_v3_result();
                try {
                    get_topic_resource_v3_resultVar.success = iface.get_topic_resource_v3(args.topicId);
                    return get_topic_resource_v3_resultVar;
                } catch (LogicException e11) {
                    get_topic_resource_v3_resultVar.bomb = e11;
                    return get_topic_resource_v3_resultVar;
                } catch (SystemException e12) {
                    get_topic_resource_v3_resultVar.boom = e12;
                    return get_topic_resource_v3_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v2<I extends Iface> extends ProcessFunction<I, get_word_list_word_meta_v2_args> {
            public get_word_list_word_meta_v2() {
                super("get_word_list_word_meta_v2");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_word_list_word_meta_v2_args getEmptyArgsInstance() {
                return new get_word_list_word_meta_v2_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_word_list_word_meta_v2_result getResult(I iface, get_word_list_word_meta_v2_args args) throws TException {
                get_word_list_word_meta_v2_result get_word_list_word_meta_v2_resultVar = new get_word_list_word_meta_v2_result();
                try {
                    get_word_list_word_meta_v2_resultVar.success = iface.get_word_list_word_meta_v2(args.keys);
                    return get_word_list_word_meta_v2_resultVar;
                } catch (LogicException e11) {
                    get_word_list_word_meta_v2_resultVar.bomb = e11;
                    return get_word_list_word_meta_v2_resultVar;
                } catch (SystemException e12) {
                    get_word_list_word_meta_v2_resultVar.boom = e12;
                    return get_word_list_word_meta_v2_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v3<I extends Iface> extends ProcessFunction<I, get_word_list_word_meta_v3_args> {
            public get_word_list_word_meta_v3() {
                super("get_word_list_word_meta_v3");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_word_list_word_meta_v3_args getEmptyArgsInstance() {
                return new get_word_list_word_meta_v3_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_word_list_word_meta_v3_result getResult(I iface, get_word_list_word_meta_v3_args args) throws TException {
                get_word_list_word_meta_v3_result get_word_list_word_meta_v3_resultVar = new get_word_list_word_meta_v3_result();
                try {
                    get_word_list_word_meta_v3_resultVar.success = iface.get_word_list_word_meta_v3(args.book_id);
                    return get_word_list_word_meta_v3_resultVar;
                } catch (LogicException e11) {
                    get_word_list_word_meta_v3_resultVar.bomb = e11;
                    return get_word_list_word_meta_v3_resultVar;
                } catch (SystemException e12) {
                    get_word_list_word_meta_v3_resultVar.boom = e12;
                    return get_word_list_word_meta_v3_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_media_update_info<I extends Iface> extends ProcessFunction<I, get_word_media_update_info_args> {
            public get_word_media_update_info() {
                super("get_word_media_update_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_word_media_update_info_args getEmptyArgsInstance() {
                return new get_word_media_update_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_word_media_update_info_result getResult(I iface, get_word_media_update_info_args args) throws TException {
                get_word_media_update_info_result get_word_media_update_info_resultVar = new get_word_media_update_info_result();
                try {
                    get_word_media_update_info_resultVar.success = iface.get_word_media_update_info(args.book_id);
                    return get_word_media_update_info_resultVar;
                } catch (LogicException e11) {
                    get_word_media_update_info_resultVar.bomb = e11;
                    return get_word_media_update_info_resultVar;
                } catch (SystemException e12) {
                    get_word_media_update_info_resultVar.boom = e12;
                    return get_word_media_update_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_root<I extends Iface> extends ProcessFunction<I, get_word_root_args> {
            public get_word_root() {
                super("get_word_root");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_word_root_args getEmptyArgsInstance() {
                return new get_word_root_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_word_root_result getResult(I iface, get_word_root_args args) throws TException {
                get_word_root_result get_word_root_resultVar = new get_word_root_result();
                try {
                    get_word_root_resultVar.success = iface.get_word_root(args.topic_id);
                    return get_word_root_resultVar;
                } catch (LogicException e11) {
                    get_word_root_resultVar.bomb = e11;
                    return get_word_root_resultVar;
                } catch (SystemException e12) {
                    get_word_root_resultVar.boom = e12;
                    return get_word_root_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_infos<I extends Iface> extends ProcessFunction<I, get_zpk_infos_args> {
            public get_zpk_infos() {
                super("get_zpk_infos");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_zpk_infos_args getEmptyArgsInstance() {
                return new get_zpk_infos_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_zpk_infos_result getResult(I iface, get_zpk_infos_args args) throws TException {
                get_zpk_infos_result get_zpk_infos_resultVar = new get_zpk_infos_result();
                try {
                    get_zpk_infos_resultVar.success = iface.get_zpk_infos(args.keys);
                    return get_zpk_infos_resultVar;
                } catch (LogicException e11) {
                    get_zpk_infos_resultVar.bomb = e11;
                    return get_zpk_infos_resultVar;
                } catch (SystemException e12) {
                    get_zpk_infos_resultVar.boom = e12;
                    return get_zpk_infos_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_md5s<I extends Iface> extends ProcessFunction<I, get_zpk_md5s_args> {
            public get_zpk_md5s() {
                super("get_zpk_md5s");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_zpk_md5s_args getEmptyArgsInstance() {
                return new get_zpk_md5s_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_zpk_md5s_result getResult(I iface, get_zpk_md5s_args args) throws TException {
                get_zpk_md5s_result get_zpk_md5s_resultVar = new get_zpk_md5s_result();
                try {
                    get_zpk_md5s_resultVar.success = iface.get_zpk_md5s(args.keys);
                    return get_zpk_md5s_resultVar;
                } catch (LogicException e11) {
                    get_zpk_md5s_resultVar.bomb = e11;
                    return get_zpk_md5s_resultVar;
                } catch (SystemException e12) {
                    get_zpk_md5s_resultVar.boom = e12;
                    return get_zpk_md5s_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_word_v2<I extends Iface> extends ProcessFunction<I, search_word_v2_args> {
            public search_word_v2() {
                super("search_word_v2");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public search_word_v2_args getEmptyArgsInstance() {
                return new search_word_v2_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public search_word_v2_result getResult(I iface, search_word_v2_args args) throws TException {
                search_word_v2_result search_word_v2_resultVar = new search_word_v2_result();
                try {
                    search_word_v2_resultVar.success = iface.search_word_v2(args.query_str);
                    return search_word_v2_resultVar;
                } catch (LogicException e11) {
                    search_word_v2_resultVar.bomb = e11;
                    return search_word_v2_resultVar;
                } catch (SystemException e12) {
                    search_word_v2_resultVar.boom = e12;
                    return search_word_v2_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_translate_bug<I extends Iface> extends ProcessFunction<I, submit_translate_bug_args> {
            public submit_translate_bug() {
                super("submit_translate_bug");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public submit_translate_bug_args getEmptyArgsInstance() {
                return new submit_translate_bug_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public submit_translate_bug_result getResult(I iface, submit_translate_bug_args args) throws TException {
                submit_translate_bug_result submit_translate_bug_resultVar = new submit_translate_bug_result();
                try {
                    iface.submit_translate_bug(args.source, args.trans, args.provider);
                    return submit_translate_bug_resultVar;
                } catch (LogicException e11) {
                    submit_translate_bug_resultVar.bomb = e11;
                    return submit_translate_bug_resultVar;
                } catch (SystemException e12) {
                    submit_translate_bug_resultVar.boom = e12;
                    return submit_translate_bug_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class translate_v2<I extends Iface> extends ProcessFunction<I, translate_v2_args> {
            public translate_v2() {
                super("translate_v2");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public translate_v2_args getEmptyArgsInstance() {
                return new translate_v2_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public translate_v2_result getResult(I iface, translate_v2_args args) throws TException {
                translate_v2_result translate_v2_resultVar = new translate_v2_result();
                try {
                    translate_v2_resultVar.success = iface.translate_v2(args.source);
                    return translate_v2_resultVar;
                } catch (LogicException e11) {
                    translate_v2_resultVar.bomb = e11;
                    return translate_v2_resultVar;
                } catch (SystemException e12) {
                    translate_v2_resultVar.boom = e12;
                    return translate_v2_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class word_bug_report<I extends Iface> extends ProcessFunction<I, word_bug_report_args> {
            public word_bug_report() {
                super("word_bug_report");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public word_bug_report_args getEmptyArgsInstance() {
                return new word_bug_report_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public word_bug_report_result getResult(I iface, word_bug_report_args args) throws TException {
                word_bug_report_result word_bug_report_resultVar = new word_bug_report_result();
                try {
                    iface.word_bug_report(args.key, args.types);
                    return word_bug_report_resultVar;
                } catch (LogicException e11) {
                    word_bug_report_resultVar.bomb = e11;
                    return word_bug_report_resultVar;
                } catch (SystemException e12) {
                    word_bug_report_resultVar.boom = e12;
                    return word_bug_report_resultVar;
                }
            }
        }

        public Processor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends Iface> Map<String, ProcessFunction<I, ? extends TBase>> getProcessMap(Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            processMap.put("get_media_by_topic_ids", new get_media_by_topic_ids());
            processMap.put("get_word_media_update_info", new get_word_media_update_info());
            processMap.put("get_book_resource_update_info", new get_book_resource_update_info());
            processMap.put("search_word_v2", new search_word_v2());
            processMap.put("get_zpk_infos", new get_zpk_infos());
            processMap.put("get_zpk_md5s", new get_zpk_md5s());
            processMap.put("get_dict_by_word_v2", new get_dict_by_word_v2());
            processMap.put("get_dict_wiki_by_word", new get_dict_wiki_by_word());
            processMap.put("get_topic_resource_v2", new get_topic_resource_v2());
            processMap.put("get_topic_resource_v3", new get_topic_resource_v3());
            processMap.put("get_word_list_word_meta_v2", new get_word_list_word_meta_v2());
            processMap.put("get_word_list_word_meta_v3", new get_word_list_word_meta_v3());
            processMap.put("get_game_word_list", new get_game_word_list());
            processMap.put("get_game_word_update_info", new get_game_word_update_info());
            processMap.put("get_word_root", new get_word_root());
            processMap.put("translate_v2", new translate_v2());
            processMap.put("submit_translate_bug", new submit_translate_bug());
            processMap.put("word_bug_report", new word_bug_report());
            return processMap;
        }

        public Processor(I iface, Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            super(iface, getProcessMap(processMap));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_book_resource_update_info_args implements TBase<get_book_resource_update_info_args, _Fields>, Serializable, Cloneable, Comparable<get_book_resource_update_info_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_book_resource_update_info_args");
        private static final TField WORD_LEVEL_ID_FIELD_DESC = new TField(ma.b.f72894c, (byte) 8, 1);
        private static final int __WORD_LEVEL_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int word_level_id;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            WORD_LEVEL_ID(1, ma.b.f72894c);

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
                if (fieldId != 1) {
                    return null;
                }
                return WORD_LEVEL_ID;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_book_resource_update_info_argsStandardScheme extends StandardScheme<get_book_resource_update_info_args> {
            private get_book_resource_update_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_book_resource_update_info_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        break;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 8) {
                        struct.word_level_id = iprot.readI32();
                        struct.setWord_level_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (struct.isSetWord_level_id()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'word_level_id' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_book_resource_update_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_book_resource_update_info_args.STRUCT_DESC);
                oprot.writeFieldBegin(get_book_resource_update_info_args.WORD_LEVEL_ID_FIELD_DESC);
                oprot.writeI32(struct.word_level_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_book_resource_update_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_book_resource_update_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_book_resource_update_info_argsStandardScheme getScheme() {
                return new get_book_resource_update_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_book_resource_update_info_argsTupleScheme extends TupleScheme<get_book_resource_update_info_args> {
            private get_book_resource_update_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_book_resource_update_info_args struct) throws TException {
                struct.word_level_id = ((TTupleProtocol) prot).readI32();
                struct.setWord_level_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_book_resource_update_info_args struct) throws TException {
                ((TTupleProtocol) prot).writeI32(struct.word_level_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_book_resource_update_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_book_resource_update_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_book_resource_update_info_argsTupleScheme getScheme() {
                return new get_book_resource_update_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_book_resource_update_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_book_resource_update_info_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.WORD_LEVEL_ID, (_Fields) new FieldMetaData(ma.b.f72894c, (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_book_resource_update_info_args.class, unmodifiableMap);
        }

        public get_book_resource_update_info_args() {
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
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_book_resource_update_info_args)) {
                return equals((get_book_resource_update_info_args) that);
            }
            return false;
        }

        public int getWord_level_id() {
            return this.word_level_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetWord_level_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_book_resource_update_info_args setWord_level_id(int word_level_id) {
            this.word_level_id = word_level_id;
            setWord_level_idIsSet(true);
            return this;
        }

        public void setWord_level_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "get_book_resource_update_info_args(word_level_id:" + this.word_level_id + pn.j.f81007d;
        }

        public void unsetWord_level_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_book_resource_update_info_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetWord_level_id()).compareTo(Boolean.valueOf(other.isSetWord_level_id()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetWord_level_id() || (compareTo = TBaseHelper.compareTo(this.word_level_id, other.word_level_id)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_book_resource_update_info_args, _Fields> deepCopy2() {
            return new get_book_resource_update_info_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_book_resource_update_info_args$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getWord_level_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_book_resource_update_info_args$_Fields[field.ordinal()] == 1) {
                return isSetWord_level_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_book_resource_update_info_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetWord_level_id();
            } else {
                setWord_level_id(((Integer) value).intValue());
            }
        }

        public get_book_resource_update_info_args(int word_level_id) {
            this();
            this.word_level_id = word_level_id;
            setWord_level_idIsSet(true);
        }

        public boolean equals(get_book_resource_update_info_args that) {
            return that != null && this.word_level_id == that.word_level_id;
        }

        public get_book_resource_update_info_args(get_book_resource_update_info_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.word_level_id = other.word_level_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_book_resource_update_info_result implements TBase<get_book_resource_update_info_result, _Fields>, Serializable, Cloneable, Comparable<get_book_resource_update_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public BookResourceUpdateInfo success;
        private static final TStruct STRUCT_DESC = new TStruct("get_book_resource_update_info_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_book_resource_update_info_resultStandardScheme extends StandardScheme<get_book_resource_update_info_result> {
            private get_book_resource_update_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_book_resource_update_info_result struct) throws TException {
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
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        BookResourceUpdateInfo bookResourceUpdateInfo = new BookResourceUpdateInfo();
                        struct.success = bookResourceUpdateInfo;
                        bookResourceUpdateInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_book_resource_update_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_book_resource_update_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_book_resource_update_info_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_book_resource_update_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_book_resource_update_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_book_resource_update_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_book_resource_update_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_book_resource_update_info_resultStandardScheme getScheme() {
                return new get_book_resource_update_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_book_resource_update_info_resultTupleScheme extends TupleScheme<get_book_resource_update_info_result> {
            private get_book_resource_update_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_book_resource_update_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    BookResourceUpdateInfo bookResourceUpdateInfo = new BookResourceUpdateInfo();
                    struct.success = bookResourceUpdateInfo;
                    bookResourceUpdateInfo.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_book_resource_update_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_book_resource_update_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_book_resource_update_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_book_resource_update_info_resultTupleScheme getScheme() {
                return new get_book_resource_update_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_book_resource_update_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_book_resource_update_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, BookResourceUpdateInfo.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_book_resource_update_info_result.class, unmodifiableMap);
        }

        public get_book_resource_update_info_result() {
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
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_book_resource_update_info_result)) {
                return equals((get_book_resource_update_info_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public BookResourceUpdateInfo getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_book_resource_update_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_book_resource_update_info_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_book_resource_update_info_result setSuccess(BookResourceUpdateInfo success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_book_resource_update_info_result(");
            sb2.append("success:");
            BookResourceUpdateInfo bookResourceUpdateInfo = this.success;
            if (bookResourceUpdateInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bookResourceUpdateInfo);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            BookResourceUpdateInfo bookResourceUpdateInfo = this.success;
            if (bookResourceUpdateInfo != null) {
                bookResourceUpdateInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_book_resource_update_info_result(BookResourceUpdateInfo success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_book_resource_update_info_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_book_resource_update_info_result, _Fields> deepCopy2() {
            return new get_book_resource_update_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_book_resource_update_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_book_resource_update_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_book_resource_update_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((BookResourceUpdateInfo) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_book_resource_update_info_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_book_resource_update_info_result(get_book_resource_update_info_result other) {
            if (other.isSetSuccess()) {
                this.success = new BookResourceUpdateInfo(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_dict_by_word_v2_args implements TBase<get_dict_by_word_v2_args, _Fields>, Serializable, Cloneable, Comparable<get_dict_by_word_v2_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_dict_by_word_v2_args");
        private static final TField WORD_FIELD_DESC = new TField("word", (byte) 11, 1);
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public String word;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            WORD(1, "word");

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
                if (fieldId != 1) {
                    return null;
                }
                return WORD;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_by_word_v2_argsStandardScheme extends StandardScheme<get_dict_by_word_v2_args> {
            private get_dict_by_word_v2_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_dict_by_word_v2_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 11) {
                        struct.word = iprot.readString();
                        struct.setWordIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_dict_by_word_v2_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_dict_by_word_v2_args.STRUCT_DESC);
                if (struct.word != null) {
                    oprot.writeFieldBegin(get_dict_by_word_v2_args.WORD_FIELD_DESC);
                    oprot.writeString(struct.word);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_by_word_v2_argsStandardSchemeFactory implements SchemeFactory {
            private get_dict_by_word_v2_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_dict_by_word_v2_argsStandardScheme getScheme() {
                return new get_dict_by_word_v2_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_by_word_v2_argsTupleScheme extends TupleScheme<get_dict_by_word_v2_args> {
            private get_dict_by_word_v2_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_dict_by_word_v2_args struct) throws TException {
                struct.word = ((TTupleProtocol) prot).readString();
                struct.setWordIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_dict_by_word_v2_args struct) throws TException {
                ((TTupleProtocol) prot).writeString(struct.word);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_by_word_v2_argsTupleSchemeFactory implements SchemeFactory {
            private get_dict_by_word_v2_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_dict_by_word_v2_argsTupleScheme getScheme() {
                return new get_dict_by_word_v2_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_dict_by_word_v2_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_dict_by_word_v2_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.WORD, (_Fields) new FieldMetaData("word", (byte) 1, new FieldValueMetaData((byte) 11)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_dict_by_word_v2_args.class, unmodifiableMap);
        }

        public get_dict_by_word_v2_args() {
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
            this.word = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_dict_by_word_v2_args)) {
                return equals((get_dict_by_word_v2_args) that);
            }
            return false;
        }

        public String getWord() {
            return this.word;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetWord() {
            return this.word != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_dict_by_word_v2_args setWord(String word) {
            this.word = word;
            return this;
        }

        public void setWordIsSet(boolean value) {
            if (value) {
                return;
            }
            this.word = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_dict_by_word_v2_args(");
            sb2.append("word:");
            String str = this.word;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetWord() {
            this.word = null;
        }

        public void validate() throws TException {
            if (this.word != null) {
                return;
            }
            throw new TProtocolException("Required field 'word' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_dict_by_word_v2_args(String word) {
            this();
            this.word = word;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_dict_by_word_v2_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetWord()).compareTo(Boolean.valueOf(other.isSetWord()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetWord() || (compareTo = TBaseHelper.compareTo(this.word, other.word)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_dict_by_word_v2_args, _Fields> deepCopy2() {
            return new get_dict_by_word_v2_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_by_word_v2_args$_Fields[field.ordinal()] == 1) {
                return getWord();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_by_word_v2_args$_Fields[field.ordinal()] == 1) {
                return isSetWord();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_by_word_v2_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetWord();
            } else {
                setWord((String) value);
            }
        }

        public boolean equals(get_dict_by_word_v2_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetWord = isSetWord();
            boolean isSetWord2 = that.isSetWord();
            if (isSetWord || isSetWord2) {
                return isSetWord && isSetWord2 && this.word.equals(that.word);
            }
            return true;
        }

        public get_dict_by_word_v2_args(get_dict_by_word_v2_args other) {
            if (other.isSetWord()) {
                this.word = other.word;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_dict_by_word_v2_result implements TBase<get_dict_by_word_v2_result, _Fields>, Serializable, Cloneable, Comparable<get_dict_by_word_v2_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public WordDictV2 success;
        private static final TStruct STRUCT_DESC = new TStruct("get_dict_by_word_v2_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_by_word_v2_resultStandardScheme extends StandardScheme<get_dict_by_word_v2_result> {
            private get_dict_by_word_v2_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_dict_by_word_v2_result struct) throws TException {
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
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        WordDictV2 wordDictV2 = new WordDictV2();
                        struct.success = wordDictV2;
                        wordDictV2.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_dict_by_word_v2_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_dict_by_word_v2_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_dict_by_word_v2_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_dict_by_word_v2_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_dict_by_word_v2_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_by_word_v2_resultStandardSchemeFactory implements SchemeFactory {
            private get_dict_by_word_v2_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_dict_by_word_v2_resultStandardScheme getScheme() {
                return new get_dict_by_word_v2_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_by_word_v2_resultTupleScheme extends TupleScheme<get_dict_by_word_v2_result> {
            private get_dict_by_word_v2_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_dict_by_word_v2_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    WordDictV2 wordDictV2 = new WordDictV2();
                    struct.success = wordDictV2;
                    wordDictV2.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_dict_by_word_v2_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_by_word_v2_resultTupleSchemeFactory implements SchemeFactory {
            private get_dict_by_word_v2_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_dict_by_word_v2_resultTupleScheme getScheme() {
                return new get_dict_by_word_v2_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_dict_by_word_v2_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_dict_by_word_v2_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, WordDictV2.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_dict_by_word_v2_result.class, unmodifiableMap);
        }

        public get_dict_by_word_v2_result() {
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
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_dict_by_word_v2_result)) {
                return equals((get_dict_by_word_v2_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public WordDictV2 getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_dict_by_word_v2_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_dict_by_word_v2_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_dict_by_word_v2_result setSuccess(WordDictV2 success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_dict_by_word_v2_result(");
            sb2.append("success:");
            WordDictV2 wordDictV2 = this.success;
            if (wordDictV2 == null) {
                sb2.append("null");
            } else {
                sb2.append(wordDictV2);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            WordDictV2 wordDictV2 = this.success;
            if (wordDictV2 != null) {
                wordDictV2.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_dict_by_word_v2_result(WordDictV2 success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_dict_by_word_v2_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_dict_by_word_v2_result, _Fields> deepCopy2() {
            return new get_dict_by_word_v2_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_by_word_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_by_word_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_by_word_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((WordDictV2) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_dict_by_word_v2_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_dict_by_word_v2_result(get_dict_by_word_v2_result other) {
            if (other.isSetSuccess()) {
                this.success = new WordDictV2(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_dict_wiki_by_word_args implements TBase<get_dict_wiki_by_word_args, _Fields>, Serializable, Cloneable, Comparable<get_dict_wiki_by_word_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_dict_wiki_by_word_args");
        private static final TField WORD_FIELD_DESC = new TField("word", (byte) 11, 1);
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public String word;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            WORD(1, "word");

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
                if (fieldId != 1) {
                    return null;
                }
                return WORD;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_wiki_by_word_argsStandardScheme extends StandardScheme<get_dict_wiki_by_word_args> {
            private get_dict_wiki_by_word_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_dict_wiki_by_word_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 11) {
                        struct.word = iprot.readString();
                        struct.setWordIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_dict_wiki_by_word_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_dict_wiki_by_word_args.STRUCT_DESC);
                if (struct.word != null) {
                    oprot.writeFieldBegin(get_dict_wiki_by_word_args.WORD_FIELD_DESC);
                    oprot.writeString(struct.word);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_wiki_by_word_argsStandardSchemeFactory implements SchemeFactory {
            private get_dict_wiki_by_word_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_dict_wiki_by_word_argsStandardScheme getScheme() {
                return new get_dict_wiki_by_word_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_wiki_by_word_argsTupleScheme extends TupleScheme<get_dict_wiki_by_word_args> {
            private get_dict_wiki_by_word_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_dict_wiki_by_word_args struct) throws TException {
                struct.word = ((TTupleProtocol) prot).readString();
                struct.setWordIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_dict_wiki_by_word_args struct) throws TException {
                ((TTupleProtocol) prot).writeString(struct.word);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_wiki_by_word_argsTupleSchemeFactory implements SchemeFactory {
            private get_dict_wiki_by_word_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_dict_wiki_by_word_argsTupleScheme getScheme() {
                return new get_dict_wiki_by_word_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_dict_wiki_by_word_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_dict_wiki_by_word_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.WORD, (_Fields) new FieldMetaData("word", (byte) 1, new FieldValueMetaData((byte) 11)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_dict_wiki_by_word_args.class, unmodifiableMap);
        }

        public get_dict_wiki_by_word_args() {
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
            this.word = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_dict_wiki_by_word_args)) {
                return equals((get_dict_wiki_by_word_args) that);
            }
            return false;
        }

        public String getWord() {
            return this.word;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetWord() {
            return this.word != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_dict_wiki_by_word_args setWord(String word) {
            this.word = word;
            return this;
        }

        public void setWordIsSet(boolean value) {
            if (value) {
                return;
            }
            this.word = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_dict_wiki_by_word_args(");
            sb2.append("word:");
            String str = this.word;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetWord() {
            this.word = null;
        }

        public void validate() throws TException {
            if (this.word != null) {
                return;
            }
            throw new TProtocolException("Required field 'word' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_dict_wiki_by_word_args(String word) {
            this();
            this.word = word;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_dict_wiki_by_word_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetWord()).compareTo(Boolean.valueOf(other.isSetWord()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetWord() || (compareTo = TBaseHelper.compareTo(this.word, other.word)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_dict_wiki_by_word_args, _Fields> deepCopy2() {
            return new get_dict_wiki_by_word_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_wiki_by_word_args$_Fields[field.ordinal()] == 1) {
                return getWord();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_wiki_by_word_args$_Fields[field.ordinal()] == 1) {
                return isSetWord();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_wiki_by_word_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetWord();
            } else {
                setWord((String) value);
            }
        }

        public boolean equals(get_dict_wiki_by_word_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetWord = isSetWord();
            boolean isSetWord2 = that.isSetWord();
            if (isSetWord || isSetWord2) {
                return isSetWord && isSetWord2 && this.word.equals(that.word);
            }
            return true;
        }

        public get_dict_wiki_by_word_args(get_dict_wiki_by_word_args other) {
            if (other.isSetWord()) {
                this.word = other.word;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_dict_wiki_by_word_result implements TBase<get_dict_wiki_by_word_result, _Fields>, Serializable, Cloneable, Comparable<get_dict_wiki_by_word_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public DictWiki success;
        private static final TStruct STRUCT_DESC = new TStruct("get_dict_wiki_by_word_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_wiki_by_word_resultStandardScheme extends StandardScheme<get_dict_wiki_by_word_result> {
            private get_dict_wiki_by_word_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_dict_wiki_by_word_result struct) throws TException {
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
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        DictWiki dictWiki = new DictWiki();
                        struct.success = dictWiki;
                        dictWiki.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_dict_wiki_by_word_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_dict_wiki_by_word_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_dict_wiki_by_word_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_dict_wiki_by_word_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_dict_wiki_by_word_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_wiki_by_word_resultStandardSchemeFactory implements SchemeFactory {
            private get_dict_wiki_by_word_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_dict_wiki_by_word_resultStandardScheme getScheme() {
                return new get_dict_wiki_by_word_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_wiki_by_word_resultTupleScheme extends TupleScheme<get_dict_wiki_by_word_result> {
            private get_dict_wiki_by_word_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_dict_wiki_by_word_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    DictWiki dictWiki = new DictWiki();
                    struct.success = dictWiki;
                    dictWiki.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_dict_wiki_by_word_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_dict_wiki_by_word_resultTupleSchemeFactory implements SchemeFactory {
            private get_dict_wiki_by_word_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_dict_wiki_by_word_resultTupleScheme getScheme() {
                return new get_dict_wiki_by_word_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_dict_wiki_by_word_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_dict_wiki_by_word_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, DictWiki.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_dict_wiki_by_word_result.class, unmodifiableMap);
        }

        public get_dict_wiki_by_word_result() {
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
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_dict_wiki_by_word_result)) {
                return equals((get_dict_wiki_by_word_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public DictWiki getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_dict_wiki_by_word_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_dict_wiki_by_word_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_dict_wiki_by_word_result setSuccess(DictWiki success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_dict_wiki_by_word_result(");
            sb2.append("success:");
            DictWiki dictWiki = this.success;
            if (dictWiki == null) {
                sb2.append("null");
            } else {
                sb2.append(dictWiki);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            DictWiki dictWiki = this.success;
            if (dictWiki != null) {
                dictWiki.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_dict_wiki_by_word_result(DictWiki success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_dict_wiki_by_word_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_dict_wiki_by_word_result, _Fields> deepCopy2() {
            return new get_dict_wiki_by_word_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_wiki_by_word_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_wiki_by_word_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_dict_wiki_by_word_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((DictWiki) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_dict_wiki_by_word_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_dict_wiki_by_word_result(get_dict_wiki_by_word_result other) {
            if (other.isSetSuccess()) {
                this.success = new DictWiki(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_game_word_list_args implements TBase<get_game_word_list_args, _Fields>, Serializable, Cloneable, Comparable<get_game_word_list_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public GameWordReq req;
        private static final TStruct STRUCT_DESC = new TStruct("get_game_word_list_args");
        private static final TField REQ_FIELD_DESC = new TField(HiAnalyticsConstant.Direction.REQUEST, (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            REQ(1, HiAnalyticsConstant.Direction.REQUEST);

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
                if (fieldId != 1) {
                    return null;
                }
                return REQ;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_list_argsStandardScheme extends StandardScheme<get_game_word_list_args> {
            private get_game_word_list_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_game_word_list_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 12) {
                        GameWordReq gameWordReq = new GameWordReq();
                        struct.req = gameWordReq;
                        gameWordReq.read(iprot);
                        struct.setReqIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_game_word_list_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_game_word_list_args.STRUCT_DESC);
                if (struct.req != null) {
                    oprot.writeFieldBegin(get_game_word_list_args.REQ_FIELD_DESC);
                    struct.req.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_list_argsStandardSchemeFactory implements SchemeFactory {
            private get_game_word_list_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_game_word_list_argsStandardScheme getScheme() {
                return new get_game_word_list_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_list_argsTupleScheme extends TupleScheme<get_game_word_list_args> {
            private get_game_word_list_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_game_word_list_args struct) throws TException {
                GameWordReq gameWordReq = new GameWordReq();
                struct.req = gameWordReq;
                gameWordReq.read((TTupleProtocol) prot);
                struct.setReqIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_game_word_list_args struct) throws TException {
                struct.req.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_list_argsTupleSchemeFactory implements SchemeFactory {
            private get_game_word_list_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_game_word_list_argsTupleScheme getScheme() {
                return new get_game_word_list_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_game_word_list_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_game_word_list_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.REQ, (_Fields) new FieldMetaData(HiAnalyticsConstant.Direction.REQUEST, (byte) 1, new StructMetaData((byte) 12, GameWordReq.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_game_word_list_args.class, unmodifiableMap);
        }

        public get_game_word_list_args() {
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
            this.req = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_game_word_list_args)) {
                return equals((get_game_word_list_args) that);
            }
            return false;
        }

        public GameWordReq getReq() {
            return this.req;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetReq() {
            return this.req != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_game_word_list_args setReq(GameWordReq req) {
            this.req = req;
            return this;
        }

        public void setReqIsSet(boolean value) {
            if (value) {
                return;
            }
            this.req = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_game_word_list_args(");
            sb2.append("req:");
            GameWordReq gameWordReq = this.req;
            if (gameWordReq == null) {
                sb2.append("null");
            } else {
                sb2.append(gameWordReq);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetReq() {
            this.req = null;
        }

        public void validate() throws TException {
            GameWordReq gameWordReq = this.req;
            if (gameWordReq != null) {
                if (gameWordReq != null) {
                    gameWordReq.validate();
                }
            } else {
                throw new TProtocolException("Required field 'req' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_game_word_list_args(GameWordReq req) {
            this();
            this.req = req;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_game_word_list_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetReq()).compareTo(Boolean.valueOf(other.isSetReq()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetReq() || (compareTo = TBaseHelper.compareTo((Comparable) this.req, (Comparable) other.req)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_game_word_list_args, _Fields> deepCopy2() {
            return new get_game_word_list_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_list_args$_Fields[field.ordinal()] == 1) {
                return getReq();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_list_args$_Fields[field.ordinal()] == 1) {
                return isSetReq();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_list_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetReq();
            } else {
                setReq((GameWordReq) value);
            }
        }

        public boolean equals(get_game_word_list_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetReq = isSetReq();
            boolean isSetReq2 = that.isSetReq();
            if (isSetReq || isSetReq2) {
                return isSetReq && isSetReq2 && this.req.equals(that.req);
            }
            return true;
        }

        public get_game_word_list_args(get_game_word_list_args other) {
            if (other.isSetReq()) {
                this.req = new GameWordReq(other.req);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_game_word_list_result implements TBase<get_game_word_list_result, _Fields>, Serializable, Cloneable, Comparable<get_game_word_list_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<GameWordItem> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_game_word_list_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_list_resultStandardScheme extends StandardScheme<get_game_word_list_result> {
            private get_game_word_list_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_game_word_list_result struct) throws TException {
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
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.success = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            GameWordItem gameWordItem = new GameWordItem();
                            gameWordItem.read(iprot);
                            struct.success.add(gameWordItem);
                        }
                        iprot.readListEnd();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_game_word_list_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_game_word_list_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_game_word_list_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<GameWordItem> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_game_word_list_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_game_word_list_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_list_resultStandardSchemeFactory implements SchemeFactory {
            private get_game_word_list_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_game_word_list_resultStandardScheme getScheme() {
                return new get_game_word_list_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_list_resultTupleScheme extends TupleScheme<get_game_word_list_result> {
            private get_game_word_list_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_game_word_list_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        GameWordItem gameWordItem = new GameWordItem();
                        gameWordItem.read(tTupleProtocol);
                        struct.success.add(gameWordItem);
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_game_word_list_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    Iterator<GameWordItem> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(tTupleProtocol);
                    }
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_list_resultTupleSchemeFactory implements SchemeFactory {
            private get_game_word_list_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_game_word_list_resultTupleScheme getScheme() {
                return new get_game_word_list_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_game_word_list_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_game_word_list_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, GameWordItem.class))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_game_word_list_result.class, unmodifiableMap);
        }

        public get_game_word_list_result() {
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

        public void addToSuccess(GameWordItem elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_game_word_list_result)) {
                return equals((get_game_word_list_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public List<GameWordItem> getSuccess() {
            return this.success;
        }

        public Iterator<GameWordItem> getSuccessIterator() {
            List<GameWordItem> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<GameWordItem> list = this.success;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_game_word_list_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_game_word_list_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_game_word_list_result setSuccess(List<GameWordItem> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_game_word_list_result(");
            sb2.append("success:");
            List<GameWordItem> list = this.success;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_game_word_list_result(List<GameWordItem> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_game_word_list_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((List) this.success, (List) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_game_word_list_result, _Fields> deepCopy2() {
            return new get_game_word_list_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_list_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_list_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_list_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((List) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_game_word_list_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_game_word_list_result(get_game_word_list_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<GameWordItem> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new GameWordItem(it.next()));
                }
                this.success = arrayList;
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_game_word_update_info_args implements TBase<get_game_word_update_info_args, _Fields>, Serializable, Cloneable, Comparable<get_game_word_update_info_args> {
        private static final int __BOOK_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int book_id;
        private static final TStruct STRUCT_DESC = new TStruct("get_game_word_update_info_args");
        private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            BOOK_ID(1, "book_id");

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
                if (fieldId != 1) {
                    return null;
                }
                return BOOK_ID;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_update_info_argsStandardScheme extends StandardScheme<get_game_word_update_info_args> {
            private get_game_word_update_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_game_word_update_info_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        break;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 8) {
                        struct.book_id = iprot.readI32();
                        struct.setBook_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (struct.isSetBook_id()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_game_word_update_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_game_word_update_info_args.STRUCT_DESC);
                oprot.writeFieldBegin(get_game_word_update_info_args.BOOK_ID_FIELD_DESC);
                oprot.writeI32(struct.book_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_update_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_game_word_update_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_game_word_update_info_argsStandardScheme getScheme() {
                return new get_game_word_update_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_update_info_argsTupleScheme extends TupleScheme<get_game_word_update_info_args> {
            private get_game_word_update_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_game_word_update_info_args struct) throws TException {
                struct.book_id = ((TTupleProtocol) prot).readI32();
                struct.setBook_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_game_word_update_info_args struct) throws TException {
                ((TTupleProtocol) prot).writeI32(struct.book_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_update_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_game_word_update_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_game_word_update_info_argsTupleScheme getScheme() {
                return new get_game_word_update_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_game_word_update_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_game_word_update_info_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_game_word_update_info_args.class, unmodifiableMap);
        }

        public get_game_word_update_info_args() {
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
            setBook_idIsSet(false);
            this.book_id = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_game_word_update_info_args)) {
                return equals((get_game_word_update_info_args) that);
            }
            return false;
        }

        public int getBook_id() {
            return this.book_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBook_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_game_word_update_info_args setBook_id(int book_id) {
            this.book_id = book_id;
            setBook_idIsSet(true);
            return this;
        }

        public void setBook_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "get_game_word_update_info_args(book_id:" + this.book_id + pn.j.f81007d;
        }

        public void unsetBook_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_game_word_update_info_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetBook_id()).compareTo(Boolean.valueOf(other.isSetBook_id()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetBook_id() || (compareTo = TBaseHelper.compareTo(this.book_id, other.book_id)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_game_word_update_info_args, _Fields> deepCopy2() {
            return new get_game_word_update_info_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_update_info_args$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getBook_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_update_info_args$_Fields[field.ordinal()] == 1) {
                return isSetBook_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_update_info_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetBook_id();
            } else {
                setBook_id(((Integer) value).intValue());
            }
        }

        public get_game_word_update_info_args(int book_id) {
            this();
            this.book_id = book_id;
            setBook_idIsSet(true);
        }

        public boolean equals(get_game_word_update_info_args that) {
            return that != null && this.book_id == that.book_id;
        }

        public get_game_word_update_info_args(get_game_word_update_info_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.book_id = other.book_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_game_word_update_info_result implements TBase<get_game_word_update_info_result, _Fields>, Serializable, Cloneable, Comparable<get_game_word_update_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<GameWordItemUpdateInfo> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_game_word_update_info_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_update_info_resultStandardScheme extends StandardScheme<get_game_word_update_info_result> {
            private get_game_word_update_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_game_word_update_info_result struct) throws TException {
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
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.success = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            GameWordItemUpdateInfo gameWordItemUpdateInfo = new GameWordItemUpdateInfo();
                            gameWordItemUpdateInfo.read(iprot);
                            struct.success.add(gameWordItemUpdateInfo);
                        }
                        iprot.readListEnd();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_game_word_update_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_game_word_update_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_game_word_update_info_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<GameWordItemUpdateInfo> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_game_word_update_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_game_word_update_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_update_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_game_word_update_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_game_word_update_info_resultStandardScheme getScheme() {
                return new get_game_word_update_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_update_info_resultTupleScheme extends TupleScheme<get_game_word_update_info_result> {
            private get_game_word_update_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_game_word_update_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        GameWordItemUpdateInfo gameWordItemUpdateInfo = new GameWordItemUpdateInfo();
                        gameWordItemUpdateInfo.read(tTupleProtocol);
                        struct.success.add(gameWordItemUpdateInfo);
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_game_word_update_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    Iterator<GameWordItemUpdateInfo> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(tTupleProtocol);
                    }
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_game_word_update_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_game_word_update_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_game_word_update_info_resultTupleScheme getScheme() {
                return new get_game_word_update_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_game_word_update_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_game_word_update_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, GameWordItemUpdateInfo.class))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_game_word_update_info_result.class, unmodifiableMap);
        }

        public get_game_word_update_info_result() {
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

        public void addToSuccess(GameWordItemUpdateInfo elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_game_word_update_info_result)) {
                return equals((get_game_word_update_info_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public List<GameWordItemUpdateInfo> getSuccess() {
            return this.success;
        }

        public Iterator<GameWordItemUpdateInfo> getSuccessIterator() {
            List<GameWordItemUpdateInfo> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<GameWordItemUpdateInfo> list = this.success;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_game_word_update_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_game_word_update_info_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_game_word_update_info_result setSuccess(List<GameWordItemUpdateInfo> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_game_word_update_info_result(");
            sb2.append("success:");
            List<GameWordItemUpdateInfo> list = this.success;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_game_word_update_info_result(List<GameWordItemUpdateInfo> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_game_word_update_info_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((List) this.success, (List) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_game_word_update_info_result, _Fields> deepCopy2() {
            return new get_game_word_update_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_update_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_update_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_game_word_update_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((List) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_game_word_update_info_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_game_word_update_info_result(get_game_word_update_info_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<GameWordItemUpdateInfo> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new GameWordItemUpdateInfo(it.next()));
                }
                this.success = arrayList;
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_media_by_topic_ids_args implements TBase<get_media_by_topic_ids_args, _Fields>, Serializable, Cloneable, Comparable<get_media_by_topic_ids_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_media_by_topic_ids_args");
        private static final TField TOPIC_IDS_FIELD_DESC = new TField("topic_ids", (byte) 15, 1);
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public List<Integer> topic_ids;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            TOPIC_IDS(1, "topic_ids");

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
                if (fieldId != 1) {
                    return null;
                }
                return TOPIC_IDS;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_media_by_topic_ids_argsStandardScheme extends StandardScheme<get_media_by_topic_ids_args> {
            private get_media_by_topic_ids_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_media_by_topic_ids_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.topic_ids = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            struct.topic_ids.add(Integer.valueOf(iprot.readI32()));
                        }
                        iprot.readListEnd();
                        struct.setTopic_idsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_media_by_topic_ids_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_media_by_topic_ids_args.STRUCT_DESC);
                if (struct.topic_ids != null) {
                    oprot.writeFieldBegin(get_media_by_topic_ids_args.TOPIC_IDS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 8, struct.topic_ids.size()));
                    Iterator<Integer> it = struct.topic_ids.iterator();
                    while (it.hasNext()) {
                        oprot.writeI32(it.next().intValue());
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_media_by_topic_ids_argsStandardSchemeFactory implements SchemeFactory {
            private get_media_by_topic_ids_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_media_by_topic_ids_argsStandardScheme getScheme() {
                return new get_media_by_topic_ids_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_media_by_topic_ids_argsTupleScheme extends TupleScheme<get_media_by_topic_ids_args> {
            private get_media_by_topic_ids_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_media_by_topic_ids_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                TList tList = new TList((byte) 8, tTupleProtocol.readI32());
                struct.topic_ids = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    struct.topic_ids.add(Integer.valueOf(tTupleProtocol.readI32()));
                }
                struct.setTopic_idsIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_media_by_topic_ids_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.topic_ids.size());
                Iterator<Integer> it = struct.topic_ids.iterator();
                while (it.hasNext()) {
                    tTupleProtocol.writeI32(it.next().intValue());
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_media_by_topic_ids_argsTupleSchemeFactory implements SchemeFactory {
            private get_media_by_topic_ids_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_media_by_topic_ids_argsTupleScheme getScheme() {
                return new get_media_by_topic_ids_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_media_by_topic_ids_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_media_by_topic_ids_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.TOPIC_IDS, (_Fields) new FieldMetaData("topic_ids", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_media_by_topic_ids_args.class, unmodifiableMap);
        }

        public get_media_by_topic_ids_args() {
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

        public void addToTopic_ids(int elem) {
            if (this.topic_ids == null) {
                this.topic_ids = new ArrayList();
            }
            this.topic_ids.add(Integer.valueOf(elem));
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.topic_ids = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_media_by_topic_ids_args)) {
                return equals((get_media_by_topic_ids_args) that);
            }
            return false;
        }

        public List<Integer> getTopic_ids() {
            return this.topic_ids;
        }

        public Iterator<Integer> getTopic_idsIterator() {
            List<Integer> list = this.topic_ids;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getTopic_idsSize() {
            List<Integer> list = this.topic_ids;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetTopic_ids() {
            return this.topic_ids != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_media_by_topic_ids_args setTopic_ids(List<Integer> topic_ids) {
            this.topic_ids = topic_ids;
            return this;
        }

        public void setTopic_idsIsSet(boolean value) {
            if (value) {
                return;
            }
            this.topic_ids = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_media_by_topic_ids_args(");
            sb2.append("topic_ids:");
            List<Integer> list = this.topic_ids;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetTopic_ids() {
            this.topic_ids = null;
        }

        public void validate() throws TException {
            if (this.topic_ids != null) {
                return;
            }
            throw new TProtocolException("Required field 'topic_ids' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_media_by_topic_ids_args(List<Integer> topic_ids) {
            this();
            this.topic_ids = topic_ids;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_media_by_topic_ids_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetTopic_ids()).compareTo(Boolean.valueOf(other.isSetTopic_ids()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetTopic_ids() || (compareTo = TBaseHelper.compareTo((List) this.topic_ids, (List) other.topic_ids)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_media_by_topic_ids_args, _Fields> deepCopy2() {
            return new get_media_by_topic_ids_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_media_by_topic_ids_args$_Fields[field.ordinal()] == 1) {
                return getTopic_ids();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_media_by_topic_ids_args$_Fields[field.ordinal()] == 1) {
                return isSetTopic_ids();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_media_by_topic_ids_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetTopic_ids();
            } else {
                setTopic_ids((List) value);
            }
        }

        public boolean equals(get_media_by_topic_ids_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetTopic_ids = isSetTopic_ids();
            boolean isSetTopic_ids2 = that.isSetTopic_ids();
            if (isSetTopic_ids || isSetTopic_ids2) {
                return isSetTopic_ids && isSetTopic_ids2 && this.topic_ids.equals(that.topic_ids);
            }
            return true;
        }

        public get_media_by_topic_ids_args(get_media_by_topic_ids_args other) {
            if (other.isSetTopic_ids()) {
                this.topic_ids = new ArrayList(other.topic_ids);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_media_by_topic_ids_result implements TBase<get_media_by_topic_ids_result, _Fields>, Serializable, Cloneable, Comparable<get_media_by_topic_ids_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<WordMedia> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_media_by_topic_ids_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_media_by_topic_ids_resultStandardScheme extends StandardScheme<get_media_by_topic_ids_result> {
            private get_media_by_topic_ids_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_media_by_topic_ids_result struct) throws TException {
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
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.success = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            WordMedia wordMedia = new WordMedia();
                            wordMedia.read(iprot);
                            struct.success.add(wordMedia);
                        }
                        iprot.readListEnd();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_media_by_topic_ids_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_media_by_topic_ids_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_media_by_topic_ids_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<WordMedia> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_media_by_topic_ids_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_media_by_topic_ids_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_media_by_topic_ids_resultStandardSchemeFactory implements SchemeFactory {
            private get_media_by_topic_ids_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_media_by_topic_ids_resultStandardScheme getScheme() {
                return new get_media_by_topic_ids_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_media_by_topic_ids_resultTupleScheme extends TupleScheme<get_media_by_topic_ids_result> {
            private get_media_by_topic_ids_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_media_by_topic_ids_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        WordMedia wordMedia = new WordMedia();
                        wordMedia.read(tTupleProtocol);
                        struct.success.add(wordMedia);
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_media_by_topic_ids_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    Iterator<WordMedia> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(tTupleProtocol);
                    }
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_media_by_topic_ids_resultTupleSchemeFactory implements SchemeFactory {
            private get_media_by_topic_ids_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_media_by_topic_ids_resultTupleScheme getScheme() {
                return new get_media_by_topic_ids_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_media_by_topic_ids_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_media_by_topic_ids_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, WordMedia.class))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_media_by_topic_ids_result.class, unmodifiableMap);
        }

        public get_media_by_topic_ids_result() {
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

        public void addToSuccess(WordMedia elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_media_by_topic_ids_result)) {
                return equals((get_media_by_topic_ids_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public List<WordMedia> getSuccess() {
            return this.success;
        }

        public Iterator<WordMedia> getSuccessIterator() {
            List<WordMedia> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<WordMedia> list = this.success;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_media_by_topic_ids_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_media_by_topic_ids_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_media_by_topic_ids_result setSuccess(List<WordMedia> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_media_by_topic_ids_result(");
            sb2.append("success:");
            List<WordMedia> list = this.success;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_media_by_topic_ids_result(List<WordMedia> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_media_by_topic_ids_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((List) this.success, (List) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_media_by_topic_ids_result, _Fields> deepCopy2() {
            return new get_media_by_topic_ids_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_media_by_topic_ids_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_media_by_topic_ids_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_media_by_topic_ids_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((List) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_media_by_topic_ids_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_media_by_topic_ids_result(get_media_by_topic_ids_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<WordMedia> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new WordMedia(it.next()));
                }
                this.success = arrayList;
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_topic_resource_v2_args implements TBase<get_topic_resource_v2_args, _Fields>, Serializable, Cloneable, Comparable<get_topic_resource_v2_args> {
        private static final int __WITH_DICT_ISSET_ID = 1;
        private static final int __WITH_DICT_WIKI_ISSET_ID = 2;
        private static final int __WITH_MEDIA_ISSET_ID = 3;
        private static final int __WITH_SIMILAL_WORDS_ISSET_ID = 4;
        private static final int __WITH_ZPK_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public GetTopicResourceChannel channel;
        public TopicKey key;
        public boolean with_dict;
        public boolean with_dict_wiki;
        public boolean with_media;
        public boolean with_similal_words;
        public boolean with_zpk;
        private static final TStruct STRUCT_DESC = new TStruct("get_topic_resource_v2_args");
        private static final TField KEY_FIELD_DESC = new TField(a.d.C0245a.f16161a, (byte) 12, 1);
        private static final TField CHANNEL_FIELD_DESC = new TField("channel", (byte) 8, 2);
        private static final TField WITH_ZPK_FIELD_DESC = new TField("with_zpk", (byte) 2, 3);
        private static final TField WITH_DICT_FIELD_DESC = new TField("with_dict", (byte) 2, 4);
        private static final TField WITH_DICT_WIKI_FIELD_DESC = new TField("with_dict_wiki", (byte) 2, 5);
        private static final TField WITH_MEDIA_FIELD_DESC = new TField("with_media", (byte) 2, 6);
        private static final TField WITH_SIMILAL_WORDS_FIELD_DESC = new TField("with_similal_words", (byte) 2, 7);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            KEY(1, a.d.C0245a.f16161a),
            CHANNEL(2, "channel"),
            WITH_ZPK(3, "with_zpk"),
            WITH_DICT(4, "with_dict"),
            WITH_DICT_WIKI(5, "with_dict_wiki"),
            WITH_MEDIA(6, "with_media"),
            WITH_SIMILAL_WORDS(7, "with_similal_words");

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
                        return KEY;
                    case 2:
                        return CHANNEL;
                    case 3:
                        return WITH_ZPK;
                    case 4:
                        return WITH_DICT;
                    case 5:
                        return WITH_DICT_WIKI;
                    case 6:
                        return WITH_MEDIA;
                    case 7:
                        return WITH_SIMILAL_WORDS;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v2_argsStandardScheme extends StandardScheme<get_topic_resource_v2_args> {
            private get_topic_resource_v2_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_topic_resource_v2_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        if (!struct.isSetWith_zpk()) {
                            throw new TProtocolException("Required field 'with_zpk' was not found in serialized data! Struct: " + toString());
                        }
                        if (!struct.isSetWith_dict()) {
                            throw new TProtocolException("Required field 'with_dict' was not found in serialized data! Struct: " + toString());
                        }
                        if (!struct.isSetWith_dict_wiki()) {
                            throw new TProtocolException("Required field 'with_dict_wiki' was not found in serialized data! Struct: " + toString());
                        }
                        if (!struct.isSetWith_media()) {
                            throw new TProtocolException("Required field 'with_media' was not found in serialized data! Struct: " + toString());
                        }
                        if (struct.isSetWith_similal_words()) {
                            struct.validate();
                            return;
                        }
                        throw new TProtocolException("Required field 'with_similal_words' was not found in serialized data! Struct: " + toString());
                    }
                    switch (readFieldBegin.f77768id) {
                        case 1:
                            if (b11 != 12) {
                                TProtocolUtil.skip(iprot, b11);
                                break;
                            } else {
                                TopicKey topicKey = new TopicKey();
                                struct.key = topicKey;
                                topicKey.read(iprot);
                                struct.setKeyIsSet(true);
                                break;
                            }
                        case 2:
                            if (b11 != 8) {
                                TProtocolUtil.skip(iprot, b11);
                                break;
                            } else {
                                struct.channel = GetTopicResourceChannel.findByValue(iprot.readI32());
                                struct.setChannelIsSet(true);
                                break;
                            }
                        case 3:
                            if (b11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                                break;
                            } else {
                                struct.with_zpk = iprot.readBool();
                                struct.setWith_zpkIsSet(true);
                                break;
                            }
                        case 4:
                            if (b11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                                break;
                            } else {
                                struct.with_dict = iprot.readBool();
                                struct.setWith_dictIsSet(true);
                                break;
                            }
                        case 5:
                            if (b11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                                break;
                            } else {
                                struct.with_dict_wiki = iprot.readBool();
                                struct.setWith_dict_wikiIsSet(true);
                                break;
                            }
                        case 6:
                            if (b11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                                break;
                            } else {
                                struct.with_media = iprot.readBool();
                                struct.setWith_mediaIsSet(true);
                                break;
                            }
                        case 7:
                            if (b11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                                break;
                            } else {
                                struct.with_similal_words = iprot.readBool();
                                struct.setWith_similal_wordsIsSet(true);
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
            public void write(TProtocol oprot, get_topic_resource_v2_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_topic_resource_v2_args.STRUCT_DESC);
                if (struct.key != null) {
                    oprot.writeFieldBegin(get_topic_resource_v2_args.KEY_FIELD_DESC);
                    struct.key.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.channel != null) {
                    oprot.writeFieldBegin(get_topic_resource_v2_args.CHANNEL_FIELD_DESC);
                    oprot.writeI32(struct.channel.getValue());
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldBegin(get_topic_resource_v2_args.WITH_ZPK_FIELD_DESC);
                oprot.writeBool(struct.with_zpk);
                oprot.writeFieldEnd();
                oprot.writeFieldBegin(get_topic_resource_v2_args.WITH_DICT_FIELD_DESC);
                oprot.writeBool(struct.with_dict);
                oprot.writeFieldEnd();
                oprot.writeFieldBegin(get_topic_resource_v2_args.WITH_DICT_WIKI_FIELD_DESC);
                oprot.writeBool(struct.with_dict_wiki);
                oprot.writeFieldEnd();
                oprot.writeFieldBegin(get_topic_resource_v2_args.WITH_MEDIA_FIELD_DESC);
                oprot.writeBool(struct.with_media);
                oprot.writeFieldEnd();
                oprot.writeFieldBegin(get_topic_resource_v2_args.WITH_SIMILAL_WORDS_FIELD_DESC);
                oprot.writeBool(struct.with_similal_words);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v2_argsStandardSchemeFactory implements SchemeFactory {
            private get_topic_resource_v2_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_topic_resource_v2_argsStandardScheme getScheme() {
                return new get_topic_resource_v2_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v2_argsTupleScheme extends TupleScheme<get_topic_resource_v2_args> {
            private get_topic_resource_v2_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_topic_resource_v2_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                TopicKey topicKey = new TopicKey();
                struct.key = topicKey;
                topicKey.read(tTupleProtocol);
                struct.setKeyIsSet(true);
                struct.channel = GetTopicResourceChannel.findByValue(tTupleProtocol.readI32());
                struct.setChannelIsSet(true);
                struct.with_zpk = tTupleProtocol.readBool();
                struct.setWith_zpkIsSet(true);
                struct.with_dict = tTupleProtocol.readBool();
                struct.setWith_dictIsSet(true);
                struct.with_dict_wiki = tTupleProtocol.readBool();
                struct.setWith_dict_wikiIsSet(true);
                struct.with_media = tTupleProtocol.readBool();
                struct.setWith_mediaIsSet(true);
                struct.with_similal_words = tTupleProtocol.readBool();
                struct.setWith_similal_wordsIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_topic_resource_v2_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.key.write(tTupleProtocol);
                tTupleProtocol.writeI32(struct.channel.getValue());
                tTupleProtocol.writeBool(struct.with_zpk);
                tTupleProtocol.writeBool(struct.with_dict);
                tTupleProtocol.writeBool(struct.with_dict_wiki);
                tTupleProtocol.writeBool(struct.with_media);
                tTupleProtocol.writeBool(struct.with_similal_words);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v2_argsTupleSchemeFactory implements SchemeFactory {
            private get_topic_resource_v2_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_topic_resource_v2_argsTupleScheme getScheme() {
                return new get_topic_resource_v2_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_topic_resource_v2_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_topic_resource_v2_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.KEY, (_Fields) new FieldMetaData(a.d.C0245a.f16161a, (byte) 1, new StructMetaData((byte) 12, TopicKey.class)));
            enumMap.put((EnumMap) _Fields.CHANNEL, (_Fields) new FieldMetaData("channel", (byte) 1, new EnumMetaData((byte) 16, GetTopicResourceChannel.class)));
            enumMap.put((EnumMap) _Fields.WITH_ZPK, (_Fields) new FieldMetaData("with_zpk", (byte) 1, new FieldValueMetaData((byte) 2)));
            enumMap.put((EnumMap) _Fields.WITH_DICT, (_Fields) new FieldMetaData("with_dict", (byte) 1, new FieldValueMetaData((byte) 2)));
            enumMap.put((EnumMap) _Fields.WITH_DICT_WIKI, (_Fields) new FieldMetaData("with_dict_wiki", (byte) 1, new FieldValueMetaData((byte) 2)));
            enumMap.put((EnumMap) _Fields.WITH_MEDIA, (_Fields) new FieldMetaData("with_media", (byte) 1, new FieldValueMetaData((byte) 2)));
            enumMap.put((EnumMap) _Fields.WITH_SIMILAL_WORDS, (_Fields) new FieldMetaData("with_similal_words", (byte) 1, new FieldValueMetaData((byte) 2)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_topic_resource_v2_args.class, unmodifiableMap);
        }

        public get_topic_resource_v2_args() {
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
            this.key = null;
            this.channel = null;
            setWith_zpkIsSet(false);
            this.with_zpk = false;
            setWith_dictIsSet(false);
            this.with_dict = false;
            setWith_dict_wikiIsSet(false);
            this.with_dict_wiki = false;
            setWith_mediaIsSet(false);
            this.with_media = false;
            setWith_similal_wordsIsSet(false);
            this.with_similal_words = false;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_topic_resource_v2_args)) {
                return equals((get_topic_resource_v2_args) that);
            }
            return false;
        }

        public GetTopicResourceChannel getChannel() {
            return this.channel;
        }

        public TopicKey getKey() {
            return this.key;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetChannel() {
            return this.channel != null;
        }

        public boolean isSetKey() {
            return this.key != null;
        }

        public boolean isSetWith_dict() {
            return EncodingUtils.testBit(this.__isset_bitfield, 1);
        }

        public boolean isSetWith_dict_wiki() {
            return EncodingUtils.testBit(this.__isset_bitfield, 2);
        }

        public boolean isSetWith_media() {
            return EncodingUtils.testBit(this.__isset_bitfield, 3);
        }

        public boolean isSetWith_similal_words() {
            return EncodingUtils.testBit(this.__isset_bitfield, 4);
        }

        public boolean isSetWith_zpk() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        public boolean isWith_dict() {
            return this.with_dict;
        }

        public boolean isWith_dict_wiki() {
            return this.with_dict_wiki;
        }

        public boolean isWith_media() {
            return this.with_media;
        }

        public boolean isWith_similal_words() {
            return this.with_similal_words;
        }

        public boolean isWith_zpk() {
            return this.with_zpk;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_topic_resource_v2_args setChannel(GetTopicResourceChannel channel) {
            this.channel = channel;
            return this;
        }

        public void setChannelIsSet(boolean value) {
            if (value) {
                return;
            }
            this.channel = null;
        }

        public get_topic_resource_v2_args setKey(TopicKey key) {
            this.key = key;
            return this;
        }

        public void setKeyIsSet(boolean value) {
            if (value) {
                return;
            }
            this.key = null;
        }

        public get_topic_resource_v2_args setWith_dict(boolean with_dict) {
            this.with_dict = with_dict;
            setWith_dictIsSet(true);
            return this;
        }

        public void setWith_dictIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
        }

        public get_topic_resource_v2_args setWith_dict_wiki(boolean with_dict_wiki) {
            this.with_dict_wiki = with_dict_wiki;
            setWith_dict_wikiIsSet(true);
            return this;
        }

        public void setWith_dict_wikiIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
        }

        public get_topic_resource_v2_args setWith_media(boolean with_media) {
            this.with_media = with_media;
            setWith_mediaIsSet(true);
            return this;
        }

        public void setWith_mediaIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
        }

        public get_topic_resource_v2_args setWith_similal_words(boolean with_similal_words) {
            this.with_similal_words = with_similal_words;
            setWith_similal_wordsIsSet(true);
            return this;
        }

        public void setWith_similal_wordsIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
        }

        public get_topic_resource_v2_args setWith_zpk(boolean with_zpk) {
            this.with_zpk = with_zpk;
            setWith_zpkIsSet(true);
            return this;
        }

        public void setWith_zpkIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_topic_resource_v2_args(");
            sb2.append("key:");
            TopicKey topicKey = this.key;
            if (topicKey == null) {
                sb2.append("null");
            } else {
                sb2.append(topicKey);
            }
            sb2.append(j2.O);
            sb2.append("channel:");
            GetTopicResourceChannel getTopicResourceChannel = this.channel;
            if (getTopicResourceChannel == null) {
                sb2.append("null");
            } else {
                sb2.append(getTopicResourceChannel);
            }
            sb2.append(j2.O);
            sb2.append("with_zpk:");
            sb2.append(this.with_zpk);
            sb2.append(j2.O);
            sb2.append("with_dict:");
            sb2.append(this.with_dict);
            sb2.append(j2.O);
            sb2.append("with_dict_wiki:");
            sb2.append(this.with_dict_wiki);
            sb2.append(j2.O);
            sb2.append("with_media:");
            sb2.append(this.with_media);
            sb2.append(j2.O);
            sb2.append("with_similal_words:");
            sb2.append(this.with_similal_words);
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetChannel() {
            this.channel = null;
        }

        public void unsetKey() {
            this.key = null;
        }

        public void unsetWith_dict() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
        }

        public void unsetWith_dict_wiki() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
        }

        public void unsetWith_media() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
        }

        public void unsetWith_similal_words() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
        }

        public void unsetWith_zpk() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        public void validate() throws TException {
            TopicKey topicKey = this.key;
            if (topicKey == null) {
                throw new TProtocolException("Required field 'key' was not present! Struct: " + toString());
            }
            if (this.channel != null) {
                if (topicKey != null) {
                    topicKey.validate();
                }
            } else {
                throw new TProtocolException("Required field 'channel' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_topic_resource_v2_args other) {
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
            int compareTo8 = Boolean.valueOf(isSetKey()).compareTo(Boolean.valueOf(other.isSetKey()));
            if (compareTo8 != 0) {
                return compareTo8;
            }
            if (isSetKey() && (compareTo7 = TBaseHelper.compareTo((Comparable) this.key, (Comparable) other.key)) != 0) {
                return compareTo7;
            }
            int compareTo9 = Boolean.valueOf(isSetChannel()).compareTo(Boolean.valueOf(other.isSetChannel()));
            if (compareTo9 != 0) {
                return compareTo9;
            }
            if (isSetChannel() && (compareTo6 = TBaseHelper.compareTo((Comparable) this.channel, (Comparable) other.channel)) != 0) {
                return compareTo6;
            }
            int compareTo10 = Boolean.valueOf(isSetWith_zpk()).compareTo(Boolean.valueOf(other.isSetWith_zpk()));
            if (compareTo10 != 0) {
                return compareTo10;
            }
            if (isSetWith_zpk() && (compareTo5 = TBaseHelper.compareTo(this.with_zpk, other.with_zpk)) != 0) {
                return compareTo5;
            }
            int compareTo11 = Boolean.valueOf(isSetWith_dict()).compareTo(Boolean.valueOf(other.isSetWith_dict()));
            if (compareTo11 != 0) {
                return compareTo11;
            }
            if (isSetWith_dict() && (compareTo4 = TBaseHelper.compareTo(this.with_dict, other.with_dict)) != 0) {
                return compareTo4;
            }
            int compareTo12 = Boolean.valueOf(isSetWith_dict_wiki()).compareTo(Boolean.valueOf(other.isSetWith_dict_wiki()));
            if (compareTo12 != 0) {
                return compareTo12;
            }
            if (isSetWith_dict_wiki() && (compareTo3 = TBaseHelper.compareTo(this.with_dict_wiki, other.with_dict_wiki)) != 0) {
                return compareTo3;
            }
            int compareTo13 = Boolean.valueOf(isSetWith_media()).compareTo(Boolean.valueOf(other.isSetWith_media()));
            if (compareTo13 != 0) {
                return compareTo13;
            }
            if (isSetWith_media() && (compareTo2 = TBaseHelper.compareTo(this.with_media, other.with_media)) != 0) {
                return compareTo2;
            }
            int compareTo14 = Boolean.valueOf(isSetWith_similal_words()).compareTo(Boolean.valueOf(other.isSetWith_similal_words()));
            if (compareTo14 != 0) {
                return compareTo14;
            }
            if (!isSetWith_similal_words() || (compareTo = TBaseHelper.compareTo(this.with_similal_words, other.with_similal_words)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_topic_resource_v2_args, _Fields> deepCopy2() {
            return new get_topic_resource_v2_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_args$_Fields[field.ordinal()]) {
                case 1:
                    return getKey();
                case 2:
                    return getChannel();
                case 3:
                    return Boolean.valueOf(isWith_zpk());
                case 4:
                    return Boolean.valueOf(isWith_dict());
                case 5:
                    return Boolean.valueOf(isWith_dict_wiki());
                case 6:
                    return Boolean.valueOf(isWith_media());
                case 7:
                    return Boolean.valueOf(isWith_similal_words());
                default:
                    throw new IllegalStateException();
            }
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_args$_Fields[field.ordinal()]) {
                case 1:
                    return isSetKey();
                case 2:
                    return isSetChannel();
                case 3:
                    return isSetWith_zpk();
                case 4:
                    return isSetWith_dict();
                case 5:
                    return isSetWith_dict_wiki();
                case 6:
                    return isSetWith_media();
                case 7:
                    return isSetWith_similal_words();
                default:
                    throw new IllegalStateException();
            }
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_args$_Fields[field.ordinal()]) {
                case 1:
                    if (value != null) {
                        setKey((TopicKey) value);
                        break;
                    } else {
                        unsetKey();
                        break;
                    }
                case 2:
                    if (value != null) {
                        setChannel((GetTopicResourceChannel) value);
                        break;
                    } else {
                        unsetChannel();
                        break;
                    }
                case 3:
                    if (value != null) {
                        setWith_zpk(((Boolean) value).booleanValue());
                        break;
                    } else {
                        unsetWith_zpk();
                        break;
                    }
                case 4:
                    if (value != null) {
                        setWith_dict(((Boolean) value).booleanValue());
                        break;
                    } else {
                        unsetWith_dict();
                        break;
                    }
                case 5:
                    if (value != null) {
                        setWith_dict_wiki(((Boolean) value).booleanValue());
                        break;
                    } else {
                        unsetWith_dict_wiki();
                        break;
                    }
                case 6:
                    if (value != null) {
                        setWith_media(((Boolean) value).booleanValue());
                        break;
                    } else {
                        unsetWith_media();
                        break;
                    }
                case 7:
                    if (value != null) {
                        setWith_similal_words(((Boolean) value).booleanValue());
                        break;
                    } else {
                        unsetWith_similal_words();
                        break;
                    }
            }
        }

        public get_topic_resource_v2_args(TopicKey key, GetTopicResourceChannel channel, boolean with_zpk, boolean with_dict, boolean with_dict_wiki, boolean with_media, boolean with_similal_words) {
            this();
            this.key = key;
            this.channel = channel;
            this.with_zpk = with_zpk;
            setWith_zpkIsSet(true);
            this.with_dict = with_dict;
            setWith_dictIsSet(true);
            this.with_dict_wiki = with_dict_wiki;
            setWith_dict_wikiIsSet(true);
            this.with_media = with_media;
            setWith_mediaIsSet(true);
            this.with_similal_words = with_similal_words;
            setWith_similal_wordsIsSet(true);
        }

        public boolean equals(get_topic_resource_v2_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetKey = isSetKey();
            boolean isSetKey2 = that.isSetKey();
            if ((isSetKey || isSetKey2) && !(isSetKey && isSetKey2 && this.key.equals(that.key))) {
                return false;
            }
            boolean isSetChannel = isSetChannel();
            boolean isSetChannel2 = that.isSetChannel();
            return (!(isSetChannel || isSetChannel2) || (isSetChannel && isSetChannel2 && this.channel.equals(that.channel))) && this.with_zpk == that.with_zpk && this.with_dict == that.with_dict && this.with_dict_wiki == that.with_dict_wiki && this.with_media == that.with_media && this.with_similal_words == that.with_similal_words;
        }

        public get_topic_resource_v2_args(get_topic_resource_v2_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            if (other.isSetKey()) {
                this.key = new TopicKey(other.key);
            }
            if (other.isSetChannel()) {
                this.channel = other.channel;
            }
            this.with_zpk = other.with_zpk;
            this.with_dict = other.with_dict;
            this.with_dict_wiki = other.with_dict_wiki;
            this.with_media = other.with_media;
            this.with_similal_words = other.with_similal_words;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_topic_resource_v2_result implements TBase<get_topic_resource_v2_result, _Fields>, Serializable, Cloneable, Comparable<get_topic_resource_v2_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public TopicResourceV2 success;
        private static final TStruct STRUCT_DESC = new TStruct("get_topic_resource_v2_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v2_resultStandardScheme extends StandardScheme<get_topic_resource_v2_result> {
            private get_topic_resource_v2_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_topic_resource_v2_result struct) throws TException {
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
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        TopicResourceV2 topicResourceV2 = new TopicResourceV2();
                        struct.success = topicResourceV2;
                        topicResourceV2.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_topic_resource_v2_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_topic_resource_v2_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_topic_resource_v2_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_topic_resource_v2_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_topic_resource_v2_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v2_resultStandardSchemeFactory implements SchemeFactory {
            private get_topic_resource_v2_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_topic_resource_v2_resultStandardScheme getScheme() {
                return new get_topic_resource_v2_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v2_resultTupleScheme extends TupleScheme<get_topic_resource_v2_result> {
            private get_topic_resource_v2_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_topic_resource_v2_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TopicResourceV2 topicResourceV2 = new TopicResourceV2();
                    struct.success = topicResourceV2;
                    topicResourceV2.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_topic_resource_v2_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v2_resultTupleSchemeFactory implements SchemeFactory {
            private get_topic_resource_v2_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_topic_resource_v2_resultTupleScheme getScheme() {
                return new get_topic_resource_v2_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_topic_resource_v2_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_topic_resource_v2_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, TopicResourceV2.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_topic_resource_v2_result.class, unmodifiableMap);
        }

        public get_topic_resource_v2_result() {
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
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_topic_resource_v2_result)) {
                return equals((get_topic_resource_v2_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public TopicResourceV2 getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_topic_resource_v2_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_topic_resource_v2_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_topic_resource_v2_result setSuccess(TopicResourceV2 success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_topic_resource_v2_result(");
            sb2.append("success:");
            TopicResourceV2 topicResourceV2 = this.success;
            if (topicResourceV2 == null) {
                sb2.append("null");
            } else {
                sb2.append(topicResourceV2);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            TopicResourceV2 topicResourceV2 = this.success;
            if (topicResourceV2 != null) {
                topicResourceV2.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_topic_resource_v2_result(TopicResourceV2 success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_topic_resource_v2_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_topic_resource_v2_result, _Fields> deepCopy2() {
            return new get_topic_resource_v2_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((TopicResourceV2) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_topic_resource_v2_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_topic_resource_v2_result(get_topic_resource_v2_result other) {
            if (other.isSetSuccess()) {
                this.success = new TopicResourceV2(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_topic_resource_v3_args implements TBase<get_topic_resource_v3_args, _Fields>, Serializable, Cloneable, Comparable<get_topic_resource_v3_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_topic_resource_v3_args");
        private static final TField TOPIC_ID_FIELD_DESC = new TField("topicId", (byte) 8, 1);
        private static final int __TOPICID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int topicId;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            TOPIC_ID(1, "topicId");

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
                if (fieldId != 1) {
                    return null;
                }
                return TOPIC_ID;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v3_argsStandardScheme extends StandardScheme<get_topic_resource_v3_args> {
            private get_topic_resource_v3_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_topic_resource_v3_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        break;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 8) {
                        struct.topicId = iprot.readI32();
                        struct.setTopicIdIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (struct.isSetTopicId()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'topicId' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_topic_resource_v3_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_topic_resource_v3_args.STRUCT_DESC);
                oprot.writeFieldBegin(get_topic_resource_v3_args.TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.topicId);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v3_argsStandardSchemeFactory implements SchemeFactory {
            private get_topic_resource_v3_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_topic_resource_v3_argsStandardScheme getScheme() {
                return new get_topic_resource_v3_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v3_argsTupleScheme extends TupleScheme<get_topic_resource_v3_args> {
            private get_topic_resource_v3_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_topic_resource_v3_args struct) throws TException {
                struct.topicId = ((TTupleProtocol) prot).readI32();
                struct.setTopicIdIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_topic_resource_v3_args struct) throws TException {
                ((TTupleProtocol) prot).writeI32(struct.topicId);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v3_argsTupleSchemeFactory implements SchemeFactory {
            private get_topic_resource_v3_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_topic_resource_v3_argsTupleScheme getScheme() {
                return new get_topic_resource_v3_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_topic_resource_v3_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_topic_resource_v3_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topicId", (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_topic_resource_v3_args.class, unmodifiableMap);
        }

        public get_topic_resource_v3_args() {
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
            setTopicIdIsSet(false);
            this.topicId = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_topic_resource_v3_args)) {
                return equals((get_topic_resource_v3_args) that);
            }
            return false;
        }

        public int getTopicId() {
            return this.topicId;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetTopicId() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_topic_resource_v3_args setTopicId(int topicId) {
            this.topicId = topicId;
            setTopicIdIsSet(true);
            return this;
        }

        public void setTopicIdIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "get_topic_resource_v3_args(topicId:" + this.topicId + pn.j.f81007d;
        }

        public void unsetTopicId() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_topic_resource_v3_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetTopicId()).compareTo(Boolean.valueOf(other.isSetTopicId()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetTopicId() || (compareTo = TBaseHelper.compareTo(this.topicId, other.topicId)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_topic_resource_v3_args, _Fields> deepCopy2() {
            return new get_topic_resource_v3_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v3_args$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getTopicId());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v3_args$_Fields[field.ordinal()] == 1) {
                return isSetTopicId();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v3_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetTopicId();
            } else {
                setTopicId(((Integer) value).intValue());
            }
        }

        public get_topic_resource_v3_args(int topicId) {
            this();
            this.topicId = topicId;
            setTopicIdIsSet(true);
        }

        public boolean equals(get_topic_resource_v3_args that) {
            return that != null && this.topicId == that.topicId;
        }

        public get_topic_resource_v3_args(get_topic_resource_v3_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.topicId = other.topicId;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_topic_resource_v3_result implements TBase<get_topic_resource_v3_result, _Fields>, Serializable, Cloneable, Comparable<get_topic_resource_v3_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public String success;
        private static final TStruct STRUCT_DESC = new TStruct("get_topic_resource_v3_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 11, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v3_resultStandardScheme extends StandardScheme<get_topic_resource_v3_result> {
            private get_topic_resource_v3_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_topic_resource_v3_result struct) throws TException {
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
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.success = iprot.readString();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_topic_resource_v3_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_topic_resource_v3_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_topic_resource_v3_result.SUCCESS_FIELD_DESC);
                    oprot.writeString(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_topic_resource_v3_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_topic_resource_v3_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v3_resultStandardSchemeFactory implements SchemeFactory {
            private get_topic_resource_v3_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_topic_resource_v3_resultStandardScheme getScheme() {
                return new get_topic_resource_v3_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v3_resultTupleScheme extends TupleScheme<get_topic_resource_v3_result> {
            private get_topic_resource_v3_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_topic_resource_v3_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    struct.success = tTupleProtocol.readString();
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_topic_resource_v3_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeString(struct.success);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_topic_resource_v3_resultTupleSchemeFactory implements SchemeFactory {
            private get_topic_resource_v3_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_topic_resource_v3_resultTupleScheme getScheme() {
                return new get_topic_resource_v3_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_topic_resource_v3_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_topic_resource_v3_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 11)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_topic_resource_v3_result.class, unmodifiableMap);
        }

        public get_topic_resource_v3_result() {
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
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_topic_resource_v3_result)) {
                return equals((get_topic_resource_v3_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public String getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_topic_resource_v3_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_topic_resource_v3_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_topic_resource_v3_result setSuccess(String success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_topic_resource_v3_result(");
            sb2.append("success:");
            String str = this.success;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_topic_resource_v3_result(String success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_topic_resource_v3_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo(this.success, other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_topic_resource_v3_result, _Fields> deepCopy2() {
            return new get_topic_resource_v3_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v3_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v3_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_topic_resource_v3_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((String) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_topic_resource_v3_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_topic_resource_v3_result(get_topic_resource_v3_result other) {
            if (other.isSetSuccess()) {
                this.success = other.success;
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_word_list_word_meta_v2_args implements TBase<get_word_list_word_meta_v2_args, _Fields>, Serializable, Cloneable, Comparable<get_word_list_word_meta_v2_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public List<TopicKey> keys;
        private static final TStruct STRUCT_DESC = new TStruct("get_word_list_word_meta_v2_args");
        private static final TField KEYS_FIELD_DESC = new TField("keys", (byte) 15, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            KEYS(1, "keys");

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
                if (fieldId != 1) {
                    return null;
                }
                return KEYS;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v2_argsStandardScheme extends StandardScheme<get_word_list_word_meta_v2_args> {
            private get_word_list_word_meta_v2_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_word_list_word_meta_v2_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.keys = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            TopicKey topicKey = new TopicKey();
                            topicKey.read(iprot);
                            struct.keys.add(topicKey);
                        }
                        iprot.readListEnd();
                        struct.setKeysIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_word_list_word_meta_v2_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_word_list_word_meta_v2_args.STRUCT_DESC);
                if (struct.keys != null) {
                    oprot.writeFieldBegin(get_word_list_word_meta_v2_args.KEYS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.keys.size()));
                    Iterator<TopicKey> it = struct.keys.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v2_argsStandardSchemeFactory implements SchemeFactory {
            private get_word_list_word_meta_v2_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_list_word_meta_v2_argsStandardScheme getScheme() {
                return new get_word_list_word_meta_v2_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v2_argsTupleScheme extends TupleScheme<get_word_list_word_meta_v2_args> {
            private get_word_list_word_meta_v2_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_word_list_word_meta_v2_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.keys = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    TopicKey topicKey = new TopicKey();
                    topicKey.read(tTupleProtocol);
                    struct.keys.add(topicKey);
                }
                struct.setKeysIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_word_list_word_meta_v2_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.keys.size());
                Iterator<TopicKey> it = struct.keys.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v2_argsTupleSchemeFactory implements SchemeFactory {
            private get_word_list_word_meta_v2_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_list_word_meta_v2_argsTupleScheme getScheme() {
                return new get_word_list_word_meta_v2_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_word_list_word_meta_v2_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_word_list_word_meta_v2_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.KEYS, (_Fields) new FieldMetaData("keys", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, TopicKey.class))));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_word_list_word_meta_v2_args.class, unmodifiableMap);
        }

        public get_word_list_word_meta_v2_args() {
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

        public void addToKeys(TopicKey elem) {
            if (this.keys == null) {
                this.keys = new ArrayList();
            }
            this.keys.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.keys = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_word_list_word_meta_v2_args)) {
                return equals((get_word_list_word_meta_v2_args) that);
            }
            return false;
        }

        public List<TopicKey> getKeys() {
            return this.keys;
        }

        public Iterator<TopicKey> getKeysIterator() {
            List<TopicKey> list = this.keys;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getKeysSize() {
            List<TopicKey> list = this.keys;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetKeys() {
            return this.keys != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_word_list_word_meta_v2_args setKeys(List<TopicKey> keys) {
            this.keys = keys;
            return this;
        }

        public void setKeysIsSet(boolean value) {
            if (value) {
                return;
            }
            this.keys = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_word_list_word_meta_v2_args(");
            sb2.append("keys:");
            List<TopicKey> list = this.keys;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetKeys() {
            this.keys = null;
        }

        public void validate() throws TException {
            if (this.keys != null) {
                return;
            }
            throw new TProtocolException("Required field 'keys' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_word_list_word_meta_v2_args(List<TopicKey> keys) {
            this();
            this.keys = keys;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_word_list_word_meta_v2_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetKeys()).compareTo(Boolean.valueOf(other.isSetKeys()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetKeys() || (compareTo = TBaseHelper.compareTo((List) this.keys, (List) other.keys)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_word_list_word_meta_v2_args, _Fields> deepCopy2() {
            return new get_word_list_word_meta_v2_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v2_args$_Fields[field.ordinal()] == 1) {
                return getKeys();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v2_args$_Fields[field.ordinal()] == 1) {
                return isSetKeys();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v2_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetKeys();
            } else {
                setKeys((List) value);
            }
        }

        public boolean equals(get_word_list_word_meta_v2_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetKeys = isSetKeys();
            boolean isSetKeys2 = that.isSetKeys();
            if (isSetKeys || isSetKeys2) {
                return isSetKeys && isSetKeys2 && this.keys.equals(that.keys);
            }
            return true;
        }

        public get_word_list_word_meta_v2_args(get_word_list_word_meta_v2_args other) {
            if (other.isSetKeys()) {
                ArrayList arrayList = new ArrayList(other.keys.size());
                Iterator<TopicKey> it = other.keys.iterator();
                while (it.hasNext()) {
                    arrayList.add(new TopicKey(it.next()));
                }
                this.keys = arrayList;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_word_list_word_meta_v2_result implements TBase<get_word_list_word_meta_v2_result, _Fields>, Serializable, Cloneable, Comparable<get_word_list_word_meta_v2_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<WordListWordMetaV2> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_word_list_word_meta_v2_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v2_resultStandardScheme extends StandardScheme<get_word_list_word_meta_v2_result> {
            private get_word_list_word_meta_v2_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_word_list_word_meta_v2_result struct) throws TException {
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
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.success = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            WordListWordMetaV2 wordListWordMetaV2 = new WordListWordMetaV2();
                            wordListWordMetaV2.read(iprot);
                            struct.success.add(wordListWordMetaV2);
                        }
                        iprot.readListEnd();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_word_list_word_meta_v2_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_word_list_word_meta_v2_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_word_list_word_meta_v2_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<WordListWordMetaV2> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_word_list_word_meta_v2_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_word_list_word_meta_v2_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v2_resultStandardSchemeFactory implements SchemeFactory {
            private get_word_list_word_meta_v2_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_list_word_meta_v2_resultStandardScheme getScheme() {
                return new get_word_list_word_meta_v2_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v2_resultTupleScheme extends TupleScheme<get_word_list_word_meta_v2_result> {
            private get_word_list_word_meta_v2_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_word_list_word_meta_v2_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        WordListWordMetaV2 wordListWordMetaV2 = new WordListWordMetaV2();
                        wordListWordMetaV2.read(tTupleProtocol);
                        struct.success.add(wordListWordMetaV2);
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_word_list_word_meta_v2_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    Iterator<WordListWordMetaV2> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(tTupleProtocol);
                    }
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v2_resultTupleSchemeFactory implements SchemeFactory {
            private get_word_list_word_meta_v2_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_list_word_meta_v2_resultTupleScheme getScheme() {
                return new get_word_list_word_meta_v2_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_word_list_word_meta_v2_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_word_list_word_meta_v2_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, WordListWordMetaV2.class))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_word_list_word_meta_v2_result.class, unmodifiableMap);
        }

        public get_word_list_word_meta_v2_result() {
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

        public void addToSuccess(WordListWordMetaV2 elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_word_list_word_meta_v2_result)) {
                return equals((get_word_list_word_meta_v2_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public List<WordListWordMetaV2> getSuccess() {
            return this.success;
        }

        public Iterator<WordListWordMetaV2> getSuccessIterator() {
            List<WordListWordMetaV2> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<WordListWordMetaV2> list = this.success;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_word_list_word_meta_v2_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_word_list_word_meta_v2_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_word_list_word_meta_v2_result setSuccess(List<WordListWordMetaV2> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_word_list_word_meta_v2_result(");
            sb2.append("success:");
            List<WordListWordMetaV2> list = this.success;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_word_list_word_meta_v2_result(List<WordListWordMetaV2> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_word_list_word_meta_v2_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((List) this.success, (List) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_word_list_word_meta_v2_result, _Fields> deepCopy2() {
            return new get_word_list_word_meta_v2_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((List) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_word_list_word_meta_v2_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_word_list_word_meta_v2_result(get_word_list_word_meta_v2_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<WordListWordMetaV2> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new WordListWordMetaV2(it.next()));
                }
                this.success = arrayList;
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_word_list_word_meta_v3_args implements TBase<get_word_list_word_meta_v3_args, _Fields>, Serializable, Cloneable, Comparable<get_word_list_word_meta_v3_args> {
        private static final int __BOOK_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int book_id;
        private static final TStruct STRUCT_DESC = new TStruct("get_word_list_word_meta_v3_args");
        private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            BOOK_ID(1, "book_id");

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
                if (fieldId != 1) {
                    return null;
                }
                return BOOK_ID;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v3_argsStandardScheme extends StandardScheme<get_word_list_word_meta_v3_args> {
            private get_word_list_word_meta_v3_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_word_list_word_meta_v3_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        break;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 8) {
                        struct.book_id = iprot.readI32();
                        struct.setBook_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (struct.isSetBook_id()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_word_list_word_meta_v3_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_word_list_word_meta_v3_args.STRUCT_DESC);
                oprot.writeFieldBegin(get_word_list_word_meta_v3_args.BOOK_ID_FIELD_DESC);
                oprot.writeI32(struct.book_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v3_argsStandardSchemeFactory implements SchemeFactory {
            private get_word_list_word_meta_v3_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_list_word_meta_v3_argsStandardScheme getScheme() {
                return new get_word_list_word_meta_v3_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v3_argsTupleScheme extends TupleScheme<get_word_list_word_meta_v3_args> {
            private get_word_list_word_meta_v3_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_word_list_word_meta_v3_args struct) throws TException {
                struct.book_id = ((TTupleProtocol) prot).readI32();
                struct.setBook_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_word_list_word_meta_v3_args struct) throws TException {
                ((TTupleProtocol) prot).writeI32(struct.book_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v3_argsTupleSchemeFactory implements SchemeFactory {
            private get_word_list_word_meta_v3_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_list_word_meta_v3_argsTupleScheme getScheme() {
                return new get_word_list_word_meta_v3_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_word_list_word_meta_v3_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_word_list_word_meta_v3_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_word_list_word_meta_v3_args.class, unmodifiableMap);
        }

        public get_word_list_word_meta_v3_args() {
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
            setBook_idIsSet(false);
            this.book_id = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_word_list_word_meta_v3_args)) {
                return equals((get_word_list_word_meta_v3_args) that);
            }
            return false;
        }

        public int getBook_id() {
            return this.book_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBook_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_word_list_word_meta_v3_args setBook_id(int book_id) {
            this.book_id = book_id;
            setBook_idIsSet(true);
            return this;
        }

        public void setBook_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "get_word_list_word_meta_v3_args(book_id:" + this.book_id + pn.j.f81007d;
        }

        public void unsetBook_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_word_list_word_meta_v3_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetBook_id()).compareTo(Boolean.valueOf(other.isSetBook_id()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetBook_id() || (compareTo = TBaseHelper.compareTo(this.book_id, other.book_id)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_word_list_word_meta_v3_args, _Fields> deepCopy2() {
            return new get_word_list_word_meta_v3_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v3_args$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getBook_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v3_args$_Fields[field.ordinal()] == 1) {
                return isSetBook_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v3_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetBook_id();
            } else {
                setBook_id(((Integer) value).intValue());
            }
        }

        public get_word_list_word_meta_v3_args(int book_id) {
            this();
            this.book_id = book_id;
            setBook_idIsSet(true);
        }

        public boolean equals(get_word_list_word_meta_v3_args that) {
            return that != null && this.book_id == that.book_id;
        }

        public get_word_list_word_meta_v3_args(get_word_list_word_meta_v3_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.book_id = other.book_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_word_list_word_meta_v3_result implements TBase<get_word_list_word_meta_v3_result, _Fields>, Serializable, Cloneable, Comparable<get_word_list_word_meta_v3_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<WordListWordMetaV2> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_word_list_word_meta_v3_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v3_resultStandardScheme extends StandardScheme<get_word_list_word_meta_v3_result> {
            private get_word_list_word_meta_v3_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_word_list_word_meta_v3_result struct) throws TException {
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
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.success = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            WordListWordMetaV2 wordListWordMetaV2 = new WordListWordMetaV2();
                            wordListWordMetaV2.read(iprot);
                            struct.success.add(wordListWordMetaV2);
                        }
                        iprot.readListEnd();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_word_list_word_meta_v3_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_word_list_word_meta_v3_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_word_list_word_meta_v3_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<WordListWordMetaV2> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_word_list_word_meta_v3_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_word_list_word_meta_v3_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v3_resultStandardSchemeFactory implements SchemeFactory {
            private get_word_list_word_meta_v3_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_list_word_meta_v3_resultStandardScheme getScheme() {
                return new get_word_list_word_meta_v3_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v3_resultTupleScheme extends TupleScheme<get_word_list_word_meta_v3_result> {
            private get_word_list_word_meta_v3_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_word_list_word_meta_v3_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        WordListWordMetaV2 wordListWordMetaV2 = new WordListWordMetaV2();
                        wordListWordMetaV2.read(tTupleProtocol);
                        struct.success.add(wordListWordMetaV2);
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_word_list_word_meta_v3_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    Iterator<WordListWordMetaV2> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(tTupleProtocol);
                    }
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_list_word_meta_v3_resultTupleSchemeFactory implements SchemeFactory {
            private get_word_list_word_meta_v3_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_list_word_meta_v3_resultTupleScheme getScheme() {
                return new get_word_list_word_meta_v3_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_word_list_word_meta_v3_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_word_list_word_meta_v3_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, WordListWordMetaV2.class))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_word_list_word_meta_v3_result.class, unmodifiableMap);
        }

        public get_word_list_word_meta_v3_result() {
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

        public void addToSuccess(WordListWordMetaV2 elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_word_list_word_meta_v3_result)) {
                return equals((get_word_list_word_meta_v3_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public List<WordListWordMetaV2> getSuccess() {
            return this.success;
        }

        public Iterator<WordListWordMetaV2> getSuccessIterator() {
            List<WordListWordMetaV2> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<WordListWordMetaV2> list = this.success;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_word_list_word_meta_v3_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_word_list_word_meta_v3_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_word_list_word_meta_v3_result setSuccess(List<WordListWordMetaV2> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_word_list_word_meta_v3_result(");
            sb2.append("success:");
            List<WordListWordMetaV2> list = this.success;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_word_list_word_meta_v3_result(List<WordListWordMetaV2> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_word_list_word_meta_v3_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((List) this.success, (List) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_word_list_word_meta_v3_result, _Fields> deepCopy2() {
            return new get_word_list_word_meta_v3_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v3_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v3_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_list_word_meta_v3_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((List) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_word_list_word_meta_v3_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_word_list_word_meta_v3_result(get_word_list_word_meta_v3_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<WordListWordMetaV2> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new WordListWordMetaV2(it.next()));
                }
                this.success = arrayList;
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_word_media_update_info_args implements TBase<get_word_media_update_info_args, _Fields>, Serializable, Cloneable, Comparable<get_word_media_update_info_args> {
        private static final int __BOOK_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int book_id;
        private static final TStruct STRUCT_DESC = new TStruct("get_word_media_update_info_args");
        private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            BOOK_ID(1, "book_id");

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
                if (fieldId != 1) {
                    return null;
                }
                return BOOK_ID;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_media_update_info_argsStandardScheme extends StandardScheme<get_word_media_update_info_args> {
            private get_word_media_update_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_word_media_update_info_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        break;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 8) {
                        struct.book_id = iprot.readI32();
                        struct.setBook_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (struct.isSetBook_id()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_word_media_update_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_word_media_update_info_args.STRUCT_DESC);
                oprot.writeFieldBegin(get_word_media_update_info_args.BOOK_ID_FIELD_DESC);
                oprot.writeI32(struct.book_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_media_update_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_word_media_update_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_media_update_info_argsStandardScheme getScheme() {
                return new get_word_media_update_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_media_update_info_argsTupleScheme extends TupleScheme<get_word_media_update_info_args> {
            private get_word_media_update_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_word_media_update_info_args struct) throws TException {
                struct.book_id = ((TTupleProtocol) prot).readI32();
                struct.setBook_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_word_media_update_info_args struct) throws TException {
                ((TTupleProtocol) prot).writeI32(struct.book_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_media_update_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_word_media_update_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_media_update_info_argsTupleScheme getScheme() {
                return new get_word_media_update_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_word_media_update_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_word_media_update_info_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_word_media_update_info_args.class, unmodifiableMap);
        }

        public get_word_media_update_info_args() {
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
            setBook_idIsSet(false);
            this.book_id = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_word_media_update_info_args)) {
                return equals((get_word_media_update_info_args) that);
            }
            return false;
        }

        public int getBook_id() {
            return this.book_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBook_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_word_media_update_info_args setBook_id(int book_id) {
            this.book_id = book_id;
            setBook_idIsSet(true);
            return this;
        }

        public void setBook_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "get_word_media_update_info_args(book_id:" + this.book_id + pn.j.f81007d;
        }

        public void unsetBook_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_word_media_update_info_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetBook_id()).compareTo(Boolean.valueOf(other.isSetBook_id()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetBook_id() || (compareTo = TBaseHelper.compareTo(this.book_id, other.book_id)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_word_media_update_info_args, _Fields> deepCopy2() {
            return new get_word_media_update_info_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_media_update_info_args$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getBook_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_media_update_info_args$_Fields[field.ordinal()] == 1) {
                return isSetBook_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_media_update_info_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetBook_id();
            } else {
                setBook_id(((Integer) value).intValue());
            }
        }

        public get_word_media_update_info_args(int book_id) {
            this();
            this.book_id = book_id;
            setBook_idIsSet(true);
        }

        public boolean equals(get_word_media_update_info_args that) {
            return that != null && this.book_id == that.book_id;
        }

        public get_word_media_update_info_args(get_word_media_update_info_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.book_id = other.book_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_word_media_update_info_result implements TBase<get_word_media_update_info_result, _Fields>, Serializable, Cloneable, Comparable<get_word_media_update_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<WordMediaUpdateInfo> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_word_media_update_info_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_media_update_info_resultStandardScheme extends StandardScheme<get_word_media_update_info_result> {
            private get_word_media_update_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_word_media_update_info_result struct) throws TException {
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
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.success = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            WordMediaUpdateInfo wordMediaUpdateInfo = new WordMediaUpdateInfo();
                            wordMediaUpdateInfo.read(iprot);
                            struct.success.add(wordMediaUpdateInfo);
                        }
                        iprot.readListEnd();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_word_media_update_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_word_media_update_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_word_media_update_info_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<WordMediaUpdateInfo> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_word_media_update_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_word_media_update_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_media_update_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_word_media_update_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_media_update_info_resultStandardScheme getScheme() {
                return new get_word_media_update_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_media_update_info_resultTupleScheme extends TupleScheme<get_word_media_update_info_result> {
            private get_word_media_update_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_word_media_update_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        WordMediaUpdateInfo wordMediaUpdateInfo = new WordMediaUpdateInfo();
                        wordMediaUpdateInfo.read(tTupleProtocol);
                        struct.success.add(wordMediaUpdateInfo);
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_word_media_update_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    Iterator<WordMediaUpdateInfo> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(tTupleProtocol);
                    }
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_media_update_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_word_media_update_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_media_update_info_resultTupleScheme getScheme() {
                return new get_word_media_update_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_word_media_update_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_word_media_update_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, WordMediaUpdateInfo.class))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_word_media_update_info_result.class, unmodifiableMap);
        }

        public get_word_media_update_info_result() {
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

        public void addToSuccess(WordMediaUpdateInfo elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_word_media_update_info_result)) {
                return equals((get_word_media_update_info_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public List<WordMediaUpdateInfo> getSuccess() {
            return this.success;
        }

        public Iterator<WordMediaUpdateInfo> getSuccessIterator() {
            List<WordMediaUpdateInfo> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<WordMediaUpdateInfo> list = this.success;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_word_media_update_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_word_media_update_info_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_word_media_update_info_result setSuccess(List<WordMediaUpdateInfo> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_word_media_update_info_result(");
            sb2.append("success:");
            List<WordMediaUpdateInfo> list = this.success;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_word_media_update_info_result(List<WordMediaUpdateInfo> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_word_media_update_info_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((List) this.success, (List) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_word_media_update_info_result, _Fields> deepCopy2() {
            return new get_word_media_update_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_media_update_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_media_update_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_media_update_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((List) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_word_media_update_info_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_word_media_update_info_result(get_word_media_update_info_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<WordMediaUpdateInfo> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new WordMediaUpdateInfo(it.next()));
                }
                this.success = arrayList;
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_word_root_args implements TBase<get_word_root_args, _Fields>, Serializable, Cloneable, Comparable<get_word_root_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_word_root_args");
        private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
        private static final int __TOPIC_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int topic_id;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            TOPIC_ID(1, "topic_id");

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
                if (fieldId != 1) {
                    return null;
                }
                return TOPIC_ID;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_root_argsStandardScheme extends StandardScheme<get_word_root_args> {
            private get_word_root_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_word_root_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        break;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 8) {
                        struct.topic_id = iprot.readI32();
                        struct.setTopic_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (struct.isSetTopic_id()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_word_root_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_word_root_args.STRUCT_DESC);
                oprot.writeFieldBegin(get_word_root_args.TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.topic_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_root_argsStandardSchemeFactory implements SchemeFactory {
            private get_word_root_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_root_argsStandardScheme getScheme() {
                return new get_word_root_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_root_argsTupleScheme extends TupleScheme<get_word_root_args> {
            private get_word_root_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_word_root_args struct) throws TException {
                struct.topic_id = ((TTupleProtocol) prot).readI32();
                struct.setTopic_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_word_root_args struct) throws TException {
                ((TTupleProtocol) prot).writeI32(struct.topic_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_root_argsTupleSchemeFactory implements SchemeFactory {
            private get_word_root_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_root_argsTupleScheme getScheme() {
                return new get_word_root_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_word_root_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_word_root_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_word_root_args.class, unmodifiableMap);
        }

        public get_word_root_args() {
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
            setTopic_idIsSet(false);
            this.topic_id = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_word_root_args)) {
                return equals((get_word_root_args) that);
            }
            return false;
        }

        public int getTopic_id() {
            return this.topic_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetTopic_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_word_root_args setTopic_id(int topic_id) {
            this.topic_id = topic_id;
            setTopic_idIsSet(true);
            return this;
        }

        public void setTopic_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "get_word_root_args(topic_id:" + this.topic_id + pn.j.f81007d;
        }

        public void unsetTopic_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_word_root_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetTopic_id() || (compareTo = TBaseHelper.compareTo(this.topic_id, other.topic_id)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_word_root_args, _Fields> deepCopy2() {
            return new get_word_root_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_root_args$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getTopic_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_root_args$_Fields[field.ordinal()] == 1) {
                return isSetTopic_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_root_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetTopic_id();
            } else {
                setTopic_id(((Integer) value).intValue());
            }
        }

        public get_word_root_args(int topic_id) {
            this();
            this.topic_id = topic_id;
            setTopic_idIsSet(true);
        }

        public boolean equals(get_word_root_args that) {
            return that != null && this.topic_id == that.topic_id;
        }

        public get_word_root_args(get_word_root_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.topic_id = other.topic_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_word_root_result implements TBase<get_word_root_result, _Fields>, Serializable, Cloneable, Comparable<get_word_root_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public WordRootRes success;
        private static final TStruct STRUCT_DESC = new TStruct("get_word_root_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_root_resultStandardScheme extends StandardScheme<get_word_root_result> {
            private get_word_root_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_word_root_result struct) throws TException {
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
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        WordRootRes wordRootRes = new WordRootRes();
                        struct.success = wordRootRes;
                        wordRootRes.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_word_root_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_word_root_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_word_root_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_word_root_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_word_root_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_root_resultStandardSchemeFactory implements SchemeFactory {
            private get_word_root_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_root_resultStandardScheme getScheme() {
                return new get_word_root_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_root_resultTupleScheme extends TupleScheme<get_word_root_result> {
            private get_word_root_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_word_root_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    WordRootRes wordRootRes = new WordRootRes();
                    struct.success = wordRootRes;
                    wordRootRes.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_word_root_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_root_resultTupleSchemeFactory implements SchemeFactory {
            private get_word_root_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_root_resultTupleScheme getScheme() {
                return new get_word_root_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_word_root_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_word_root_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, WordRootRes.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_word_root_result.class, unmodifiableMap);
        }

        public get_word_root_result() {
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
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_word_root_result)) {
                return equals((get_word_root_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public WordRootRes getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_word_root_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_word_root_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_word_root_result setSuccess(WordRootRes success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_word_root_result(");
            sb2.append("success:");
            WordRootRes wordRootRes = this.success;
            if (wordRootRes == null) {
                sb2.append("null");
            } else {
                sb2.append(wordRootRes);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            WordRootRes wordRootRes = this.success;
            if (wordRootRes != null) {
                wordRootRes.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_word_root_result(WordRootRes success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_word_root_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_word_root_result, _Fields> deepCopy2() {
            return new get_word_root_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_root_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_root_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_word_root_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((WordRootRes) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_word_root_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_word_root_result(get_word_root_result other) {
            if (other.isSetSuccess()) {
                this.success = new WordRootRes(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_zpk_infos_args implements TBase<get_zpk_infos_args, _Fields>, Serializable, Cloneable, Comparable<get_zpk_infos_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public List<TopicKey> keys;
        private static final TStruct STRUCT_DESC = new TStruct("get_zpk_infos_args");
        private static final TField KEYS_FIELD_DESC = new TField("keys", (byte) 15, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            KEYS(1, "keys");

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
                if (fieldId != 1) {
                    return null;
                }
                return KEYS;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_infos_argsStandardScheme extends StandardScheme<get_zpk_infos_args> {
            private get_zpk_infos_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_zpk_infos_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.keys = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            TopicKey topicKey = new TopicKey();
                            topicKey.read(iprot);
                            struct.keys.add(topicKey);
                        }
                        iprot.readListEnd();
                        struct.setKeysIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_zpk_infos_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_zpk_infos_args.STRUCT_DESC);
                if (struct.keys != null) {
                    oprot.writeFieldBegin(get_zpk_infos_args.KEYS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.keys.size()));
                    Iterator<TopicKey> it = struct.keys.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_infos_argsStandardSchemeFactory implements SchemeFactory {
            private get_zpk_infos_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_zpk_infos_argsStandardScheme getScheme() {
                return new get_zpk_infos_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_infos_argsTupleScheme extends TupleScheme<get_zpk_infos_args> {
            private get_zpk_infos_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_zpk_infos_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.keys = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    TopicKey topicKey = new TopicKey();
                    topicKey.read(tTupleProtocol);
                    struct.keys.add(topicKey);
                }
                struct.setKeysIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_zpk_infos_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.keys.size());
                Iterator<TopicKey> it = struct.keys.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_infos_argsTupleSchemeFactory implements SchemeFactory {
            private get_zpk_infos_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_zpk_infos_argsTupleScheme getScheme() {
                return new get_zpk_infos_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_zpk_infos_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_zpk_infos_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.KEYS, (_Fields) new FieldMetaData("keys", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, TopicKey.class))));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_zpk_infos_args.class, unmodifiableMap);
        }

        public get_zpk_infos_args() {
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

        public void addToKeys(TopicKey elem) {
            if (this.keys == null) {
                this.keys = new ArrayList();
            }
            this.keys.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.keys = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_zpk_infos_args)) {
                return equals((get_zpk_infos_args) that);
            }
            return false;
        }

        public List<TopicKey> getKeys() {
            return this.keys;
        }

        public Iterator<TopicKey> getKeysIterator() {
            List<TopicKey> list = this.keys;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getKeysSize() {
            List<TopicKey> list = this.keys;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetKeys() {
            return this.keys != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_zpk_infos_args setKeys(List<TopicKey> keys) {
            this.keys = keys;
            return this;
        }

        public void setKeysIsSet(boolean value) {
            if (value) {
                return;
            }
            this.keys = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_zpk_infos_args(");
            sb2.append("keys:");
            List<TopicKey> list = this.keys;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetKeys() {
            this.keys = null;
        }

        public void validate() throws TException {
            if (this.keys != null) {
                return;
            }
            throw new TProtocolException("Required field 'keys' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_zpk_infos_args(List<TopicKey> keys) {
            this();
            this.keys = keys;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_zpk_infos_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetKeys()).compareTo(Boolean.valueOf(other.isSetKeys()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetKeys() || (compareTo = TBaseHelper.compareTo((List) this.keys, (List) other.keys)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_zpk_infos_args, _Fields> deepCopy2() {
            return new get_zpk_infos_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_infos_args$_Fields[field.ordinal()] == 1) {
                return getKeys();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_infos_args$_Fields[field.ordinal()] == 1) {
                return isSetKeys();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_infos_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetKeys();
            } else {
                setKeys((List) value);
            }
        }

        public boolean equals(get_zpk_infos_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetKeys = isSetKeys();
            boolean isSetKeys2 = that.isSetKeys();
            if (isSetKeys || isSetKeys2) {
                return isSetKeys && isSetKeys2 && this.keys.equals(that.keys);
            }
            return true;
        }

        public get_zpk_infos_args(get_zpk_infos_args other) {
            if (other.isSetKeys()) {
                ArrayList arrayList = new ArrayList(other.keys.size());
                Iterator<TopicKey> it = other.keys.iterator();
                while (it.hasNext()) {
                    arrayList.add(new TopicKey(it.next()));
                }
                this.keys = arrayList;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_zpk_infos_result implements TBase<get_zpk_infos_result, _Fields>, Serializable, Cloneable, Comparable<get_zpk_infos_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<ZpkInfo> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_zpk_infos_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_infos_resultStandardScheme extends StandardScheme<get_zpk_infos_result> {
            private get_zpk_infos_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_zpk_infos_result struct) throws TException {
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
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.success = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            ZpkInfo zpkInfo = new ZpkInfo();
                            zpkInfo.read(iprot);
                            struct.success.add(zpkInfo);
                        }
                        iprot.readListEnd();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_zpk_infos_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_zpk_infos_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_zpk_infos_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<ZpkInfo> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_zpk_infos_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_zpk_infos_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_infos_resultStandardSchemeFactory implements SchemeFactory {
            private get_zpk_infos_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_zpk_infos_resultStandardScheme getScheme() {
                return new get_zpk_infos_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_infos_resultTupleScheme extends TupleScheme<get_zpk_infos_result> {
            private get_zpk_infos_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_zpk_infos_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        ZpkInfo zpkInfo = new ZpkInfo();
                        zpkInfo.read(tTupleProtocol);
                        struct.success.add(zpkInfo);
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_zpk_infos_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    Iterator<ZpkInfo> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(tTupleProtocol);
                    }
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_infos_resultTupleSchemeFactory implements SchemeFactory {
            private get_zpk_infos_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_zpk_infos_resultTupleScheme getScheme() {
                return new get_zpk_infos_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_zpk_infos_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_zpk_infos_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, ZpkInfo.class))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_zpk_infos_result.class, unmodifiableMap);
        }

        public get_zpk_infos_result() {
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

        public void addToSuccess(ZpkInfo elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_zpk_infos_result)) {
                return equals((get_zpk_infos_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public List<ZpkInfo> getSuccess() {
            return this.success;
        }

        public Iterator<ZpkInfo> getSuccessIterator() {
            List<ZpkInfo> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<ZpkInfo> list = this.success;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_zpk_infos_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_zpk_infos_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_zpk_infos_result setSuccess(List<ZpkInfo> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_zpk_infos_result(");
            sb2.append("success:");
            List<ZpkInfo> list = this.success;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_zpk_infos_result(List<ZpkInfo> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_zpk_infos_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((List) this.success, (List) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_zpk_infos_result, _Fields> deepCopy2() {
            return new get_zpk_infos_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_infos_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_infos_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_infos_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((List) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_zpk_infos_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_zpk_infos_result(get_zpk_infos_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<ZpkInfo> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ZpkInfo(it.next()));
                }
                this.success = arrayList;
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_zpk_md5s_args implements TBase<get_zpk_md5s_args, _Fields>, Serializable, Cloneable, Comparable<get_zpk_md5s_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public List<TopicKey> keys;
        private static final TStruct STRUCT_DESC = new TStruct("get_zpk_md5s_args");
        private static final TField KEYS_FIELD_DESC = new TField("keys", (byte) 15, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            KEYS(1, "keys");

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
                if (fieldId != 1) {
                    return null;
                }
                return KEYS;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_md5s_argsStandardScheme extends StandardScheme<get_zpk_md5s_args> {
            private get_zpk_md5s_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_zpk_md5s_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.keys = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            TopicKey topicKey = new TopicKey();
                            topicKey.read(iprot);
                            struct.keys.add(topicKey);
                        }
                        iprot.readListEnd();
                        struct.setKeysIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_zpk_md5s_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_zpk_md5s_args.STRUCT_DESC);
                if (struct.keys != null) {
                    oprot.writeFieldBegin(get_zpk_md5s_args.KEYS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.keys.size()));
                    Iterator<TopicKey> it = struct.keys.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_md5s_argsStandardSchemeFactory implements SchemeFactory {
            private get_zpk_md5s_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_zpk_md5s_argsStandardScheme getScheme() {
                return new get_zpk_md5s_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_md5s_argsTupleScheme extends TupleScheme<get_zpk_md5s_args> {
            private get_zpk_md5s_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_zpk_md5s_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.keys = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    TopicKey topicKey = new TopicKey();
                    topicKey.read(tTupleProtocol);
                    struct.keys.add(topicKey);
                }
                struct.setKeysIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_zpk_md5s_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.keys.size());
                Iterator<TopicKey> it = struct.keys.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_md5s_argsTupleSchemeFactory implements SchemeFactory {
            private get_zpk_md5s_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_zpk_md5s_argsTupleScheme getScheme() {
                return new get_zpk_md5s_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_zpk_md5s_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_zpk_md5s_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.KEYS, (_Fields) new FieldMetaData("keys", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, TopicKey.class))));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_zpk_md5s_args.class, unmodifiableMap);
        }

        public get_zpk_md5s_args() {
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

        public void addToKeys(TopicKey elem) {
            if (this.keys == null) {
                this.keys = new ArrayList();
            }
            this.keys.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.keys = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_zpk_md5s_args)) {
                return equals((get_zpk_md5s_args) that);
            }
            return false;
        }

        public List<TopicKey> getKeys() {
            return this.keys;
        }

        public Iterator<TopicKey> getKeysIterator() {
            List<TopicKey> list = this.keys;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getKeysSize() {
            List<TopicKey> list = this.keys;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetKeys() {
            return this.keys != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_zpk_md5s_args setKeys(List<TopicKey> keys) {
            this.keys = keys;
            return this;
        }

        public void setKeysIsSet(boolean value) {
            if (value) {
                return;
            }
            this.keys = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_zpk_md5s_args(");
            sb2.append("keys:");
            List<TopicKey> list = this.keys;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetKeys() {
            this.keys = null;
        }

        public void validate() throws TException {
            if (this.keys != null) {
                return;
            }
            throw new TProtocolException("Required field 'keys' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_zpk_md5s_args(List<TopicKey> keys) {
            this();
            this.keys = keys;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_zpk_md5s_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetKeys()).compareTo(Boolean.valueOf(other.isSetKeys()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetKeys() || (compareTo = TBaseHelper.compareTo((List) this.keys, (List) other.keys)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_zpk_md5s_args, _Fields> deepCopy2() {
            return new get_zpk_md5s_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_md5s_args$_Fields[field.ordinal()] == 1) {
                return getKeys();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_md5s_args$_Fields[field.ordinal()] == 1) {
                return isSetKeys();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_md5s_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetKeys();
            } else {
                setKeys((List) value);
            }
        }

        public boolean equals(get_zpk_md5s_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetKeys = isSetKeys();
            boolean isSetKeys2 = that.isSetKeys();
            if (isSetKeys || isSetKeys2) {
                return isSetKeys && isSetKeys2 && this.keys.equals(that.keys);
            }
            return true;
        }

        public get_zpk_md5s_args(get_zpk_md5s_args other) {
            if (other.isSetKeys()) {
                ArrayList arrayList = new ArrayList(other.keys.size());
                Iterator<TopicKey> it = other.keys.iterator();
                while (it.hasNext()) {
                    arrayList.add(new TopicKey(it.next()));
                }
                this.keys = arrayList;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_zpk_md5s_result implements TBase<get_zpk_md5s_result, _Fields>, Serializable, Cloneable, Comparable<get_zpk_md5s_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<ZpkMd5> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_zpk_md5s_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_md5s_resultStandardScheme extends StandardScheme<get_zpk_md5s_result> {
            private get_zpk_md5s_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_zpk_md5s_result struct) throws TException {
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
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.success = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            ZpkMd5 zpkMd5 = new ZpkMd5();
                            zpkMd5.read(iprot);
                            struct.success.add(zpkMd5);
                        }
                        iprot.readListEnd();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_zpk_md5s_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_zpk_md5s_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_zpk_md5s_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<ZpkMd5> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_zpk_md5s_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_zpk_md5s_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_md5s_resultStandardSchemeFactory implements SchemeFactory {
            private get_zpk_md5s_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_zpk_md5s_resultStandardScheme getScheme() {
                return new get_zpk_md5s_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_md5s_resultTupleScheme extends TupleScheme<get_zpk_md5s_result> {
            private get_zpk_md5s_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_zpk_md5s_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        ZpkMd5 zpkMd5 = new ZpkMd5();
                        zpkMd5.read(tTupleProtocol);
                        struct.success.add(zpkMd5);
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_zpk_md5s_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    Iterator<ZpkMd5> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(tTupleProtocol);
                    }
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_zpk_md5s_resultTupleSchemeFactory implements SchemeFactory {
            private get_zpk_md5s_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_zpk_md5s_resultTupleScheme getScheme() {
                return new get_zpk_md5s_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_zpk_md5s_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_zpk_md5s_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, ZpkMd5.class))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_zpk_md5s_result.class, unmodifiableMap);
        }

        public get_zpk_md5s_result() {
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

        public void addToSuccess(ZpkMd5 elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_zpk_md5s_result)) {
                return equals((get_zpk_md5s_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public List<ZpkMd5> getSuccess() {
            return this.success;
        }

        public Iterator<ZpkMd5> getSuccessIterator() {
            List<ZpkMd5> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<ZpkMd5> list = this.success;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_zpk_md5s_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_zpk_md5s_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_zpk_md5s_result setSuccess(List<ZpkMd5> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_zpk_md5s_result(");
            sb2.append("success:");
            List<ZpkMd5> list = this.success;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_zpk_md5s_result(List<ZpkMd5> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_zpk_md5s_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((List) this.success, (List) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_zpk_md5s_result, _Fields> deepCopy2() {
            return new get_zpk_md5s_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_md5s_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_md5s_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$get_zpk_md5s_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((List) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_zpk_md5s_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_zpk_md5s_result(get_zpk_md5s_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<ZpkMd5> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ZpkMd5(it.next()));
                }
                this.success = arrayList;
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class search_word_v2_args implements TBase<search_word_v2_args, _Fields>, Serializable, Cloneable, Comparable<search_word_v2_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public String query_str;
        private static final TStruct STRUCT_DESC = new TStruct("search_word_v2_args");
        private static final TField QUERY_STR_FIELD_DESC = new TField("query_str", (byte) 11, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            QUERY_STR(1, "query_str");

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
                if (fieldId != 1) {
                    return null;
                }
                return QUERY_STR;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_word_v2_argsStandardScheme extends StandardScheme<search_word_v2_args> {
            private search_word_v2_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, search_word_v2_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 11) {
                        struct.query_str = iprot.readString();
                        struct.setQuery_strIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, search_word_v2_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(search_word_v2_args.STRUCT_DESC);
                if (struct.query_str != null) {
                    oprot.writeFieldBegin(search_word_v2_args.QUERY_STR_FIELD_DESC);
                    oprot.writeString(struct.query_str);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_word_v2_argsStandardSchemeFactory implements SchemeFactory {
            private search_word_v2_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public search_word_v2_argsStandardScheme getScheme() {
                return new search_word_v2_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_word_v2_argsTupleScheme extends TupleScheme<search_word_v2_args> {
            private search_word_v2_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, search_word_v2_args struct) throws TException {
                struct.query_str = ((TTupleProtocol) prot).readString();
                struct.setQuery_strIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, search_word_v2_args struct) throws TException {
                ((TTupleProtocol) prot).writeString(struct.query_str);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_word_v2_argsTupleSchemeFactory implements SchemeFactory {
            private search_word_v2_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public search_word_v2_argsTupleScheme getScheme() {
                return new search_word_v2_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new search_word_v2_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new search_word_v2_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.QUERY_STR, (_Fields) new FieldMetaData("query_str", (byte) 1, new FieldValueMetaData((byte) 11)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(search_word_v2_args.class, unmodifiableMap);
        }

        public search_word_v2_args() {
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
            this.query_str = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof search_word_v2_args)) {
                return equals((search_word_v2_args) that);
            }
            return false;
        }

        public String getQuery_str() {
            return this.query_str;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetQuery_str() {
            return this.query_str != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public search_word_v2_args setQuery_str(String query_str) {
            this.query_str = query_str;
            return this;
        }

        public void setQuery_strIsSet(boolean value) {
            if (value) {
                return;
            }
            this.query_str = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("search_word_v2_args(");
            sb2.append("query_str:");
            String str = this.query_str;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetQuery_str() {
            this.query_str = null;
        }

        public void validate() throws TException {
            if (this.query_str != null) {
                return;
            }
            throw new TProtocolException("Required field 'query_str' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public search_word_v2_args(String query_str) {
            this();
            this.query_str = query_str;
        }

        @Override // java.lang.Comparable
        public int compareTo(search_word_v2_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetQuery_str()).compareTo(Boolean.valueOf(other.isSetQuery_str()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetQuery_str() || (compareTo = TBaseHelper.compareTo(this.query_str, other.query_str)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<search_word_v2_args, _Fields> deepCopy2() {
            return new search_word_v2_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$search_word_v2_args$_Fields[field.ordinal()] == 1) {
                return getQuery_str();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$search_word_v2_args$_Fields[field.ordinal()] == 1) {
                return isSetQuery_str();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$search_word_v2_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetQuery_str();
            } else {
                setQuery_str((String) value);
            }
        }

        public boolean equals(search_word_v2_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetQuery_str = isSetQuery_str();
            boolean isSetQuery_str2 = that.isSetQuery_str();
            if (isSetQuery_str || isSetQuery_str2) {
                return isSetQuery_str && isSetQuery_str2 && this.query_str.equals(that.query_str);
            }
            return true;
        }

        public search_word_v2_args(search_word_v2_args other) {
            if (other.isSetQuery_str()) {
                this.query_str = other.query_str;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class search_word_v2_result implements TBase<search_word_v2_result, _Fields>, Serializable, Cloneable, Comparable<search_word_v2_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<SearchWordResultV2> success;
        private static final TStruct STRUCT_DESC = new TStruct("search_word_v2_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_word_v2_resultStandardScheme extends StandardScheme<search_word_v2_result> {
            private search_word_v2_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, search_word_v2_result struct) throws TException {
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
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.success = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            SearchWordResultV2 searchWordResultV2 = new SearchWordResultV2();
                            searchWordResultV2.read(iprot);
                            struct.success.add(searchWordResultV2);
                        }
                        iprot.readListEnd();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, search_word_v2_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(search_word_v2_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(search_word_v2_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<SearchWordResultV2> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(search_word_v2_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(search_word_v2_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_word_v2_resultStandardSchemeFactory implements SchemeFactory {
            private search_word_v2_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public search_word_v2_resultStandardScheme getScheme() {
                return new search_word_v2_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_word_v2_resultTupleScheme extends TupleScheme<search_word_v2_result> {
            private search_word_v2_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, search_word_v2_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        SearchWordResultV2 searchWordResultV2 = new SearchWordResultV2();
                        searchWordResultV2.read(tTupleProtocol);
                        struct.success.add(searchWordResultV2);
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, search_word_v2_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    Iterator<SearchWordResultV2> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(tTupleProtocol);
                    }
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_word_v2_resultTupleSchemeFactory implements SchemeFactory {
            private search_word_v2_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public search_word_v2_resultTupleScheme getScheme() {
                return new search_word_v2_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new search_word_v2_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new search_word_v2_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, SearchWordResultV2.class))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(search_word_v2_result.class, unmodifiableMap);
        }

        public search_word_v2_result() {
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

        public void addToSuccess(SearchWordResultV2 elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof search_word_v2_result)) {
                return equals((search_word_v2_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public List<SearchWordResultV2> getSuccess() {
            return this.success;
        }

        public Iterator<SearchWordResultV2> getSuccessIterator() {
            List<SearchWordResultV2> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<SearchWordResultV2> list = this.success;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public search_word_v2_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public search_word_v2_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public search_word_v2_result setSuccess(List<SearchWordResultV2> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("search_word_v2_result(");
            sb2.append("success:");
            List<SearchWordResultV2> list = this.success;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public search_word_v2_result(List<SearchWordResultV2> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(search_word_v2_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((List) this.success, (List) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<search_word_v2_result, _Fields> deepCopy2() {
            return new search_word_v2_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$search_word_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$search_word_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$search_word_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((List) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(search_word_v2_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public search_word_v2_result(search_word_v2_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<SearchWordResultV2> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new SearchWordResultV2(it.next()));
                }
                this.success = arrayList;
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class submit_translate_bug_args implements TBase<submit_translate_bug_args, _Fields>, Serializable, Cloneable, Comparable<submit_translate_bug_args> {
        private static final int __PROVIDER_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int provider;
        public String source;
        public String trans;
        private static final TStruct STRUCT_DESC = new TStruct("submit_translate_bug_args");
        private static final TField SOURCE_FIELD_DESC = new TField("source", (byte) 11, 1);
        private static final TField TRANS_FIELD_DESC = new TField("trans", (byte) 11, 2);
        private static final TField PROVIDER_FIELD_DESC = new TField(ma.b.f72911h1, (byte) 8, 3);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SOURCE(1, "source"),
            TRANS(2, "trans"),
            PROVIDER(3, ma.b.f72911h1);

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
                    return SOURCE;
                }
                if (fieldId == 2) {
                    return TRANS;
                }
                if (fieldId != 3) {
                    return null;
                }
                return PROVIDER;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_translate_bug_argsStandardScheme extends StandardScheme<submit_translate_bug_args> {
            private submit_translate_bug_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, submit_translate_bug_args struct) throws TException {
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
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 8) {
                                struct.provider = iprot.readI32();
                                struct.setProviderIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.trans = iprot.readString();
                            struct.setTransIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.source = iprot.readString();
                        struct.setSourceIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (struct.isSetProvider()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'provider' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, submit_translate_bug_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(submit_translate_bug_args.STRUCT_DESC);
                if (struct.source != null) {
                    oprot.writeFieldBegin(submit_translate_bug_args.SOURCE_FIELD_DESC);
                    oprot.writeString(struct.source);
                    oprot.writeFieldEnd();
                }
                if (struct.trans != null) {
                    oprot.writeFieldBegin(submit_translate_bug_args.TRANS_FIELD_DESC);
                    oprot.writeString(struct.trans);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldBegin(submit_translate_bug_args.PROVIDER_FIELD_DESC);
                oprot.writeI32(struct.provider);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_translate_bug_argsStandardSchemeFactory implements SchemeFactory {
            private submit_translate_bug_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_translate_bug_argsStandardScheme getScheme() {
                return new submit_translate_bug_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_translate_bug_argsTupleScheme extends TupleScheme<submit_translate_bug_args> {
            private submit_translate_bug_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, submit_translate_bug_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.source = tTupleProtocol.readString();
                struct.setSourceIsSet(true);
                struct.trans = tTupleProtocol.readString();
                struct.setTransIsSet(true);
                struct.provider = tTupleProtocol.readI32();
                struct.setProviderIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, submit_translate_bug_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeString(struct.source);
                tTupleProtocol.writeString(struct.trans);
                tTupleProtocol.writeI32(struct.provider);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_translate_bug_argsTupleSchemeFactory implements SchemeFactory {
            private submit_translate_bug_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_translate_bug_argsTupleScheme getScheme() {
                return new submit_translate_bug_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new submit_translate_bug_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new submit_translate_bug_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SOURCE, (_Fields) new FieldMetaData("source", (byte) 1, new FieldValueMetaData((byte) 11)));
            enumMap.put((EnumMap) _Fields.TRANS, (_Fields) new FieldMetaData("trans", (byte) 1, new FieldValueMetaData((byte) 11)));
            enumMap.put((EnumMap) _Fields.PROVIDER, (_Fields) new FieldMetaData(ma.b.f72911h1, (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(submit_translate_bug_args.class, unmodifiableMap);
        }

        public submit_translate_bug_args() {
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
            this.source = null;
            this.trans = null;
            setProviderIsSet(false);
            this.provider = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof submit_translate_bug_args)) {
                return equals((submit_translate_bug_args) that);
            }
            return false;
        }

        public int getProvider() {
            return this.provider;
        }

        public String getSource() {
            return this.source;
        }

        public String getTrans() {
            return this.trans;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetProvider() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        public boolean isSetSource() {
            return this.source != null;
        }

        public boolean isSetTrans() {
            return this.trans != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public submit_translate_bug_args setProvider(int provider) {
            this.provider = provider;
            setProviderIsSet(true);
            return this;
        }

        public void setProviderIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public submit_translate_bug_args setSource(String source) {
            this.source = source;
            return this;
        }

        public void setSourceIsSet(boolean value) {
            if (value) {
                return;
            }
            this.source = null;
        }

        public submit_translate_bug_args setTrans(String trans) {
            this.trans = trans;
            return this;
        }

        public void setTransIsSet(boolean value) {
            if (value) {
                return;
            }
            this.trans = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("submit_translate_bug_args(");
            sb2.append("source:");
            String str = this.source;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j2.O);
            sb2.append("trans:");
            String str2 = this.trans;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
            sb2.append(j2.O);
            sb2.append("provider:");
            sb2.append(this.provider);
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetProvider() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        public void unsetSource() {
            this.source = null;
        }

        public void unsetTrans() {
            this.trans = null;
        }

        public void validate() throws TException {
            if (this.source == null) {
                throw new TProtocolException("Required field 'source' was not present! Struct: " + toString());
            }
            if (this.trans != null) {
                return;
            }
            throw new TProtocolException("Required field 'trans' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(submit_translate_bug_args other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSource()).compareTo(Boolean.valueOf(other.isSetSource()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSource() && (compareTo3 = TBaseHelper.compareTo(this.source, other.source)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetTrans()).compareTo(Boolean.valueOf(other.isSetTrans()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetTrans() && (compareTo2 = TBaseHelper.compareTo(this.trans, other.trans)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetProvider()).compareTo(Boolean.valueOf(other.isSetProvider()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetProvider() || (compareTo = TBaseHelper.compareTo(this.provider, other.provider)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<submit_translate_bug_args, _Fields> deepCopy2() {
            return new submit_translate_bug_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$submit_translate_bug_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSource();
            }
            if (i11 == 2) {
                return getTrans();
            }
            if (i11 == 3) {
                return Integer.valueOf(getProvider());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$submit_translate_bug_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSource();
            }
            if (i11 == 2) {
                return isSetTrans();
            }
            if (i11 == 3) {
                return isSetProvider();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$submit_translate_bug_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSource();
                    return;
                } else {
                    setSource((String) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetTrans();
                    return;
                } else {
                    setTrans((String) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetProvider();
            } else {
                setProvider(((Integer) value).intValue());
            }
        }

        public submit_translate_bug_args(String source, String trans, int provider) {
            this();
            this.source = source;
            this.trans = trans;
            this.provider = provider;
            setProviderIsSet(true);
        }

        public boolean equals(submit_translate_bug_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetSource = isSetSource();
            boolean isSetSource2 = that.isSetSource();
            if ((isSetSource || isSetSource2) && !(isSetSource && isSetSource2 && this.source.equals(that.source))) {
                return false;
            }
            boolean isSetTrans = isSetTrans();
            boolean isSetTrans2 = that.isSetTrans();
            return (!(isSetTrans || isSetTrans2) || (isSetTrans && isSetTrans2 && this.trans.equals(that.trans))) && this.provider == that.provider;
        }

        public submit_translate_bug_args(submit_translate_bug_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            if (other.isSetSource()) {
                this.source = other.source;
            }
            if (other.isSetTrans()) {
                this.trans = other.trans;
            }
            this.provider = other.provider;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class submit_translate_bug_result implements TBase<submit_translate_bug_result, _Fields>, Serializable, Cloneable, Comparable<submit_translate_bug_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        private static final TStruct STRUCT_DESC = new TStruct("submit_translate_bug_result");
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_translate_bug_resultStandardScheme extends StandardScheme<submit_translate_bug_result> {
            private submit_translate_bug_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, submit_translate_bug_result struct) throws TException {
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
                        } else if (b11 == 12) {
                            LogicException logicException = new LogicException();
                            struct.bomb = logicException;
                            logicException.read(iprot);
                            struct.setBombIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        SystemException systemException = new SystemException();
                        struct.boom = systemException;
                        systemException.read(iprot);
                        struct.setBoomIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, submit_translate_bug_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(submit_translate_bug_result.STRUCT_DESC);
                if (struct.boom != null) {
                    oprot.writeFieldBegin(submit_translate_bug_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(submit_translate_bug_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_translate_bug_resultStandardSchemeFactory implements SchemeFactory {
            private submit_translate_bug_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_translate_bug_resultStandardScheme getScheme() {
                return new submit_translate_bug_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_translate_bug_resultTupleScheme extends TupleScheme<submit_translate_bug_result> {
            private submit_translate_bug_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, submit_translate_bug_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(2);
                if (readBitSet.get(0)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(1)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, submit_translate_bug_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetBoom()) {
                    bitSet.set(0);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(1);
                }
                tTupleProtocol.writeBitSet(bitSet, 2);
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_translate_bug_resultTupleSchemeFactory implements SchemeFactory {
            private submit_translate_bug_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_translate_bug_resultTupleScheme getScheme() {
                return new submit_translate_bug_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new submit_translate_bug_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new submit_translate_bug_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(submit_translate_bug_result.class, unmodifiableMap);
        }

        public submit_translate_bug_result() {
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
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof submit_translate_bug_result)) {
                return equals((submit_translate_bug_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public submit_translate_bug_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public submit_translate_bug_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("submit_translate_bug_result(");
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public submit_translate_bug_result(SystemException boom, LogicException bomb) {
            this();
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(submit_translate_bug_result other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<submit_translate_bug_result, _Fields> deepCopy2() {
            return new submit_translate_bug_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$submit_translate_bug_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getBoom();
            }
            if (i11 == 2) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$submit_translate_bug_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetBoom();
            }
            if (i11 == 2) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$submit_translate_bug_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(submit_translate_bug_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public submit_translate_bug_result(submit_translate_bug_result other) {
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class translate_v2_args implements TBase<translate_v2_args, _Fields>, Serializable, Cloneable, Comparable<translate_v2_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public String source;
        private static final TStruct STRUCT_DESC = new TStruct("translate_v2_args");
        private static final TField SOURCE_FIELD_DESC = new TField("source", (byte) 11, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SOURCE(1, "source");

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
                if (fieldId != 1) {
                    return null;
                }
                return SOURCE;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class translate_v2_argsStandardScheme extends StandardScheme<translate_v2_args> {
            private translate_v2_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, translate_v2_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 11) {
                        struct.source = iprot.readString();
                        struct.setSourceIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, translate_v2_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(translate_v2_args.STRUCT_DESC);
                if (struct.source != null) {
                    oprot.writeFieldBegin(translate_v2_args.SOURCE_FIELD_DESC);
                    oprot.writeString(struct.source);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class translate_v2_argsStandardSchemeFactory implements SchemeFactory {
            private translate_v2_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public translate_v2_argsStandardScheme getScheme() {
                return new translate_v2_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class translate_v2_argsTupleScheme extends TupleScheme<translate_v2_args> {
            private translate_v2_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, translate_v2_args struct) throws TException {
                struct.source = ((TTupleProtocol) prot).readString();
                struct.setSourceIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, translate_v2_args struct) throws TException {
                ((TTupleProtocol) prot).writeString(struct.source);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class translate_v2_argsTupleSchemeFactory implements SchemeFactory {
            private translate_v2_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public translate_v2_argsTupleScheme getScheme() {
                return new translate_v2_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new translate_v2_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new translate_v2_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SOURCE, (_Fields) new FieldMetaData("source", (byte) 1, new FieldValueMetaData((byte) 11)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(translate_v2_args.class, unmodifiableMap);
        }

        public translate_v2_args() {
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
            this.source = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof translate_v2_args)) {
                return equals((translate_v2_args) that);
            }
            return false;
        }

        public String getSource() {
            return this.source;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetSource() {
            return this.source != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public translate_v2_args setSource(String source) {
            this.source = source;
            return this;
        }

        public void setSourceIsSet(boolean value) {
            if (value) {
                return;
            }
            this.source = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("translate_v2_args(");
            sb2.append("source:");
            String str = this.source;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetSource() {
            this.source = null;
        }

        public void validate() throws TException {
            if (this.source != null) {
                return;
            }
            throw new TProtocolException("Required field 'source' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public translate_v2_args(String source) {
            this();
            this.source = source;
        }

        @Override // java.lang.Comparable
        public int compareTo(translate_v2_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetSource()).compareTo(Boolean.valueOf(other.isSetSource()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetSource() || (compareTo = TBaseHelper.compareTo(this.source, other.source)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<translate_v2_args, _Fields> deepCopy2() {
            return new translate_v2_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$translate_v2_args$_Fields[field.ordinal()] == 1) {
                return getSource();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$translate_v2_args$_Fields[field.ordinal()] == 1) {
                return isSetSource();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$translate_v2_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetSource();
            } else {
                setSource((String) value);
            }
        }

        public boolean equals(translate_v2_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetSource = isSetSource();
            boolean isSetSource2 = that.isSetSource();
            if (isSetSource || isSetSource2) {
                return isSetSource && isSetSource2 && this.source.equals(that.source);
            }
            return true;
        }

        public translate_v2_args(translate_v2_args other) {
            if (other.isSetSource()) {
                this.source = other.source;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class translate_v2_result implements TBase<translate_v2_result, _Fields>, Serializable, Cloneable, Comparable<translate_v2_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public TransResultV2 success;
        private static final TStruct STRUCT_DESC = new TStruct("translate_v2_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class translate_v2_resultStandardScheme extends StandardScheme<translate_v2_result> {
            private translate_v2_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, translate_v2_result struct) throws TException {
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
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        TransResultV2 transResultV2 = new TransResultV2();
                        struct.success = transResultV2;
                        transResultV2.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, translate_v2_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(translate_v2_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(translate_v2_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(translate_v2_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(translate_v2_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class translate_v2_resultStandardSchemeFactory implements SchemeFactory {
            private translate_v2_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public translate_v2_resultStandardScheme getScheme() {
                return new translate_v2_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class translate_v2_resultTupleScheme extends TupleScheme<translate_v2_result> {
            private translate_v2_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, translate_v2_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TransResultV2 transResultV2 = new TransResultV2();
                    struct.success = transResultV2;
                    transResultV2.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, translate_v2_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class translate_v2_resultTupleSchemeFactory implements SchemeFactory {
            private translate_v2_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public translate_v2_resultTupleScheme getScheme() {
                return new translate_v2_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new translate_v2_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new translate_v2_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, TransResultV2.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(translate_v2_result.class, unmodifiableMap);
        }

        public translate_v2_result() {
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
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof translate_v2_result)) {
                return equals((translate_v2_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public TransResultV2 getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public translate_v2_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public translate_v2_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public translate_v2_result setSuccess(TransResultV2 success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("translate_v2_result(");
            sb2.append("success:");
            TransResultV2 transResultV2 = this.success;
            if (transResultV2 == null) {
                sb2.append("null");
            } else {
                sb2.append(transResultV2);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            TransResultV2 transResultV2 = this.success;
            if (transResultV2 != null) {
                transResultV2.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public translate_v2_result(TransResultV2 success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(translate_v2_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<translate_v2_result, _Fields> deepCopy2() {
            return new translate_v2_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$translate_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$translate_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$translate_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((TransResultV2) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(translate_v2_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public translate_v2_result(translate_v2_result other) {
            if (other.isSetSuccess()) {
                this.success = new TransResultV2(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class word_bug_report_args implements TBase<word_bug_report_args, _Fields>, Serializable, Cloneable, Comparable<word_bug_report_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public TopicKey key;
        public List<WordBugType> types;
        private static final TStruct STRUCT_DESC = new TStruct("word_bug_report_args");
        private static final TField KEY_FIELD_DESC = new TField(a.d.C0245a.f16161a, (byte) 12, 1);
        private static final TField TYPES_FIELD_DESC = new TField("types", (byte) 15, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            KEY(1, a.d.C0245a.f16161a),
            TYPES(2, "types");

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
                    return KEY;
                }
                if (fieldId != 2) {
                    return null;
                }
                return TYPES;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class word_bug_report_argsStandardScheme extends StandardScheme<word_bug_report_args> {
            private word_bug_report_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, word_bug_report_args struct) throws TException {
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
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.types = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                struct.types.add(WordBugType.findByValue(iprot.readI32()));
                            }
                            iprot.readListEnd();
                            struct.setTypesIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        TopicKey topicKey = new TopicKey();
                        struct.key = topicKey;
                        topicKey.read(iprot);
                        struct.setKeyIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, word_bug_report_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(word_bug_report_args.STRUCT_DESC);
                if (struct.key != null) {
                    oprot.writeFieldBegin(word_bug_report_args.KEY_FIELD_DESC);
                    struct.key.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.types != null) {
                    oprot.writeFieldBegin(word_bug_report_args.TYPES_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 8, struct.types.size()));
                    Iterator<WordBugType> it = struct.types.iterator();
                    while (it.hasNext()) {
                        oprot.writeI32(it.next().getValue());
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class word_bug_report_argsStandardSchemeFactory implements SchemeFactory {
            private word_bug_report_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public word_bug_report_argsStandardScheme getScheme() {
                return new word_bug_report_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class word_bug_report_argsTupleScheme extends TupleScheme<word_bug_report_args> {
            private word_bug_report_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, word_bug_report_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                TopicKey topicKey = new TopicKey();
                struct.key = topicKey;
                topicKey.read(tTupleProtocol);
                struct.setKeyIsSet(true);
                TList tList = new TList((byte) 8, tTupleProtocol.readI32());
                struct.types = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    struct.types.add(WordBugType.findByValue(tTupleProtocol.readI32()));
                }
                struct.setTypesIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, word_bug_report_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.key.write(tTupleProtocol);
                tTupleProtocol.writeI32(struct.types.size());
                Iterator<WordBugType> it = struct.types.iterator();
                while (it.hasNext()) {
                    tTupleProtocol.writeI32(it.next().getValue());
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class word_bug_report_argsTupleSchemeFactory implements SchemeFactory {
            private word_bug_report_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public word_bug_report_argsTupleScheme getScheme() {
                return new word_bug_report_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new word_bug_report_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new word_bug_report_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.KEY, (_Fields) new FieldMetaData(a.d.C0245a.f16161a, (byte) 1, new StructMetaData((byte) 12, TopicKey.class)));
            enumMap.put((EnumMap) _Fields.TYPES, (_Fields) new FieldMetaData("types", (byte) 1, new ListMetaData((byte) 15, new EnumMetaData((byte) 16, WordBugType.class))));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(word_bug_report_args.class, unmodifiableMap);
        }

        public word_bug_report_args() {
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

        public void addToTypes(WordBugType elem) {
            if (this.types == null) {
                this.types = new ArrayList();
            }
            this.types.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.key = null;
            this.types = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof word_bug_report_args)) {
                return equals((word_bug_report_args) that);
            }
            return false;
        }

        public TopicKey getKey() {
            return this.key;
        }

        public List<WordBugType> getTypes() {
            return this.types;
        }

        public Iterator<WordBugType> getTypesIterator() {
            List<WordBugType> list = this.types;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getTypesSize() {
            List<WordBugType> list = this.types;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetKey() {
            return this.key != null;
        }

        public boolean isSetTypes() {
            return this.types != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public word_bug_report_args setKey(TopicKey key) {
            this.key = key;
            return this;
        }

        public void setKeyIsSet(boolean value) {
            if (value) {
                return;
            }
            this.key = null;
        }

        public word_bug_report_args setTypes(List<WordBugType> types) {
            this.types = types;
            return this;
        }

        public void setTypesIsSet(boolean value) {
            if (value) {
                return;
            }
            this.types = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("word_bug_report_args(");
            sb2.append("key:");
            TopicKey topicKey = this.key;
            if (topicKey == null) {
                sb2.append("null");
            } else {
                sb2.append(topicKey);
            }
            sb2.append(j2.O);
            sb2.append("types:");
            List<WordBugType> list = this.types;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetKey() {
            this.key = null;
        }

        public void unsetTypes() {
            this.types = null;
        }

        public void validate() throws TException {
            TopicKey topicKey = this.key;
            if (topicKey == null) {
                throw new TProtocolException("Required field 'key' was not present! Struct: " + toString());
            }
            if (this.types != null) {
                if (topicKey != null) {
                    topicKey.validate();
                }
            } else {
                throw new TProtocolException("Required field 'types' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public word_bug_report_args(TopicKey key, List<WordBugType> types) {
            this();
            this.key = key;
            this.types = types;
        }

        @Override // java.lang.Comparable
        public int compareTo(word_bug_report_args other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetKey()).compareTo(Boolean.valueOf(other.isSetKey()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetKey() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.key, (Comparable) other.key)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetTypes()).compareTo(Boolean.valueOf(other.isSetTypes()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetTypes() || (compareTo = TBaseHelper.compareTo((List) this.types, (List) other.types)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<word_bug_report_args, _Fields> deepCopy2() {
            return new word_bug_report_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$word_bug_report_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getKey();
            }
            if (i11 == 2) {
                return getTypes();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$word_bug_report_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetKey();
            }
            if (i11 == 2) {
                return isSetTypes();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$word_bug_report_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetKey();
                    return;
                } else {
                    setKey((TopicKey) value);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetTypes();
            } else {
                setTypes((List) value);
            }
        }

        public boolean equals(word_bug_report_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetKey = isSetKey();
            boolean isSetKey2 = that.isSetKey();
            if ((isSetKey || isSetKey2) && !(isSetKey && isSetKey2 && this.key.equals(that.key))) {
                return false;
            }
            boolean isSetTypes = isSetTypes();
            boolean isSetTypes2 = that.isSetTypes();
            if (isSetTypes || isSetTypes2) {
                return isSetTypes && isSetTypes2 && this.types.equals(that.types);
            }
            return true;
        }

        public word_bug_report_args(word_bug_report_args other) {
            if (other.isSetKey()) {
                this.key = new TopicKey(other.key);
            }
            if (other.isSetTypes()) {
                ArrayList arrayList = new ArrayList(other.types.size());
                Iterator<WordBugType> it = other.types.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                this.types = arrayList;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class word_bug_report_result implements TBase<word_bug_report_result, _Fields>, Serializable, Cloneable, Comparable<word_bug_report_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        private static final TStruct STRUCT_DESC = new TStruct("word_bug_report_result");
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            BOOM(1, "boom"),
            BOMB(2, "bomb");

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
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class word_bug_report_resultStandardScheme extends StandardScheme<word_bug_report_result> {
            private word_bug_report_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, word_bug_report_result struct) throws TException {
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
                        } else if (b11 == 12) {
                            LogicException logicException = new LogicException();
                            struct.bomb = logicException;
                            logicException.read(iprot);
                            struct.setBombIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        SystemException systemException = new SystemException();
                        struct.boom = systemException;
                        systemException.read(iprot);
                        struct.setBoomIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, word_bug_report_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(word_bug_report_result.STRUCT_DESC);
                if (struct.boom != null) {
                    oprot.writeFieldBegin(word_bug_report_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(word_bug_report_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class word_bug_report_resultStandardSchemeFactory implements SchemeFactory {
            private word_bug_report_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public word_bug_report_resultStandardScheme getScheme() {
                return new word_bug_report_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class word_bug_report_resultTupleScheme extends TupleScheme<word_bug_report_result> {
            private word_bug_report_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, word_bug_report_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(2);
                if (readBitSet.get(0)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(1)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, word_bug_report_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetBoom()) {
                    bitSet.set(0);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(1);
                }
                tTupleProtocol.writeBitSet(bitSet, 2);
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class word_bug_report_resultTupleSchemeFactory implements SchemeFactory {
            private word_bug_report_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public word_bug_report_resultTupleScheme getScheme() {
                return new word_bug_report_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new word_bug_report_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new word_bug_report_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(word_bug_report_result.class, unmodifiableMap);
        }

        public word_bug_report_result() {
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
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof word_bug_report_result)) {
                return equals((word_bug_report_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public word_bug_report_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public word_bug_report_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("word_bug_report_result(");
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public word_bug_report_result(SystemException boom, LogicException bomb) {
            this();
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(word_bug_report_result other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<word_bug_report_result, _Fields> deepCopy2() {
            return new word_bug_report_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$word_bug_report_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getBoom();
            }
            if (i11 == 2) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$word_bug_report_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetBoom();
            }
            if (i11 == 2) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ResourceService$word_bug_report_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(word_bug_report_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public word_bug_report_result(word_bug_report_result other) {
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }
}
