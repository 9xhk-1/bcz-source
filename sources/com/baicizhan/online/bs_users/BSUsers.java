package com.baicizhan.online.bs_users;

import com.baicizhan.online.structs.BELogicException;
import com.baicizhan.online.structs.BESystemException;
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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BSUsers {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_users.BSUsers$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$add_word_friend_feedback_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$add_word_friend_feedback_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$finish_plan_notify_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$finish_plan_notify_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_activity_url_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_activity_url_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_ads_list_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_ads_list_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_easy_words_list_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_easy_words_list_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_latest_little_class_time_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_latest_little_class_time_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_show_ads_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_show_ads_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_user_word_media_record_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_user_word_media_record_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_word_friends_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_word_friends_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$qrcode_scan_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$qrcode_scan_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$redo_word_friend_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$redo_word_friend_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$save_word_friend_done_record_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$save_word_friend_done_record_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$sync_user_word_media_record_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$sync_user_word_media_record_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$user_operation_stat_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BSUsers$user_operation_stat_result$_Fields;

        static {
            int[] iArr = new int[get_activity_url_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_activity_url_result$_Fields = iArr;
            try {
                iArr[get_activity_url_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_activity_url_result$_Fields[get_activity_url_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_activity_url_args$_Fields = new int[get_activity_url_args._Fields.values().length];
            int[] iArr2 = new int[get_easy_words_list_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_easy_words_list_result$_Fields = iArr2;
            try {
                iArr2[get_easy_words_list_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_easy_words_list_result$_Fields[get_easy_words_list_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[get_easy_words_list_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_easy_words_list_args$_Fields = iArr3;
            try {
                iArr3[get_easy_words_list_args._Fields.WORD_LEVEL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr4 = new int[qrcode_scan_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$qrcode_scan_result$_Fields = iArr4;
            try {
                iArr4[qrcode_scan_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$qrcode_scan_result$_Fields[qrcode_scan_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$qrcode_scan_result$_Fields[qrcode_scan_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr5 = new int[qrcode_scan_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$qrcode_scan_args$_Fields = iArr5;
            try {
                iArr5[qrcode_scan_args._Fields.QRCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr6 = new int[finish_plan_notify_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$finish_plan_notify_result$_Fields = iArr6;
            try {
                iArr6[finish_plan_notify_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$finish_plan_notify_result$_Fields[finish_plan_notify_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr7 = new int[finish_plan_notify_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$finish_plan_notify_args$_Fields = iArr7;
            try {
                iArr7[finish_plan_notify_args._Fields.FINISH_PLAN_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr8 = new int[get_latest_little_class_time_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_latest_little_class_time_result$_Fields = iArr8;
            try {
                iArr8[get_latest_little_class_time_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_latest_little_class_time_result$_Fields[get_latest_little_class_time_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_latest_little_class_time_result$_Fields[get_latest_little_class_time_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_latest_little_class_time_args$_Fields = new int[get_latest_little_class_time_args._Fields.values().length];
            int[] iArr9 = new int[user_operation_stat_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$user_operation_stat_result$_Fields = iArr9;
            try {
                iArr9[user_operation_stat_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$user_operation_stat_result$_Fields[user_operation_stat_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr10 = new int[user_operation_stat_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$user_operation_stat_args$_Fields = iArr10;
            try {
                iArr10[user_operation_stat_args._Fields.OPERATION_LOGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr11 = new int[add_word_friend_feedback_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$add_word_friend_feedback_result$_Fields = iArr11;
            try {
                iArr11[add_word_friend_feedback_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$add_word_friend_feedback_result$_Fields[add_word_friend_feedback_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$add_word_friend_feedback_result$_Fields[add_word_friend_feedback_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            int[] iArr12 = new int[add_word_friend_feedback_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$add_word_friend_feedback_args$_Fields = iArr12;
            try {
                iArr12[add_word_friend_feedback_args._Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$add_word_friend_feedback_args$_Fields[add_word_friend_feedback_args._Fields.FEEDBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            int[] iArr13 = new int[save_word_friend_done_record_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$save_word_friend_done_record_result$_Fields = iArr13;
            try {
                iArr13[save_word_friend_done_record_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$save_word_friend_done_record_result$_Fields[save_word_friend_done_record_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$save_word_friend_done_record_result$_Fields[save_word_friend_done_record_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr14 = new int[save_word_friend_done_record_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$save_word_friend_done_record_args$_Fields = iArr14;
            try {
                iArr14[save_word_friend_done_record_args._Fields.WORD_LEVEL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$save_word_friend_done_record_args$_Fields[save_word_friend_done_record_args._Fields.DONE_TOPIC_IDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            int[] iArr15 = new int[redo_word_friend_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$redo_word_friend_result$_Fields = iArr15;
            try {
                iArr15[redo_word_friend_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$redo_word_friend_result$_Fields[redo_word_friend_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$redo_word_friend_result$_Fields[redo_word_friend_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$redo_word_friend_args$_Fields = new int[redo_word_friend_args._Fields.values().length];
            int[] iArr16 = new int[get_word_friends_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_word_friends_info_result$_Fields = iArr16;
            try {
                iArr16[get_word_friends_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_word_friends_info_result$_Fields[get_word_friends_info_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_word_friends_info_result$_Fields[get_word_friends_info_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr17 = new int[get_word_friends_info_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_word_friends_info_args$_Fields = iArr17;
            try {
                iArr17[get_word_friends_info_args._Fields.WORD_LEVEL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            int[] iArr18 = new int[get_show_ads_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_show_ads_result$_Fields = iArr18;
            try {
                iArr18[get_show_ads_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_show_ads_result$_Fields[get_show_ads_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_show_ads_result$_Fields[get_show_ads_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_show_ads_args$_Fields = new int[get_show_ads_args._Fields.values().length];
            int[] iArr19 = new int[get_ads_list_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_ads_list_result$_Fields = iArr19;
            try {
                iArr19[get_ads_list_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_ads_list_result$_Fields[get_ads_list_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_ads_list_result$_Fields[get_ads_list_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_ads_list_args$_Fields = new int[get_ads_list_args._Fields.values().length];
            int[] iArr20 = new int[get_user_word_media_record_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_user_word_media_record_result$_Fields = iArr20;
            try {
                iArr20[get_user_word_media_record_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_user_word_media_record_result$_Fields[get_user_word_media_record_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_user_word_media_record_result$_Fields[get_user_word_media_record_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused44) {
            }
            int[] iArr21 = new int[get_user_word_media_record_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_user_word_media_record_args$_Fields = iArr21;
            try {
                iArr21[get_user_word_media_record_args._Fields.WORD_LEVEL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused45) {
            }
            int[] iArr22 = new int[sync_user_word_media_record_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$sync_user_word_media_record_result$_Fields = iArr22;
            try {
                iArr22[sync_user_word_media_record_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$sync_user_word_media_record_result$_Fields[sync_user_word_media_record_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BSUsers$sync_user_word_media_record_result$_Fields[sync_user_word_media_record_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused48) {
            }
            int[] iArr23 = new int[sync_user_word_media_record_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BSUsers$sync_user_word_media_record_args$_Fields = iArr23;
            try {
                iArr23[sync_user_word_media_record_args._Fields.USER_MEDIA_RECORDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused49) {
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
        public static class add_word_friend_feedback_call extends TAsyncMethodCall {
            private String feedback;
            private int topic_id;

            public add_word_friend_feedback_call(int topic_id, String feedback, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.topic_id = topic_id;
                this.feedback = feedback;
            }

            public int getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_add_word_friend_feedback();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("add_word_friend_feedback", (byte) 1, 0));
                add_word_friend_feedback_args add_word_friend_feedback_argsVar = new add_word_friend_feedback_args();
                add_word_friend_feedback_argsVar.setTopic_id(this.topic_id);
                add_word_friend_feedback_argsVar.setFeedback(this.feedback);
                add_word_friend_feedback_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class finish_plan_notify_call extends TAsyncMethodCall {
            private BBUserFinishPlanInfo finish_plan_info;

            public finish_plan_notify_call(BBUserFinishPlanInfo finish_plan_info, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.finish_plan_info = finish_plan_info;
            }

            public int getResult() throws BESystemException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_finish_plan_notify();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("finish_plan_notify", (byte) 1, 0));
                finish_plan_notify_args finish_plan_notify_argsVar = new finish_plan_notify_args();
                finish_plan_notify_argsVar.setFinish_plan_info(this.finish_plan_info);
                finish_plan_notify_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_activity_url_call extends TAsyncMethodCall {
            public get_activity_url_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public String getResult() throws BESystemException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_activity_url();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_activity_url", (byte) 1, 0));
                new get_activity_url_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_ads_list_call extends TAsyncMethodCall {
            public get_ads_list_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public List<BBAdInfo> getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_ads_list();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_ads_list", (byte) 1, 0));
                new get_ads_list_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_easy_words_list_call extends TAsyncMethodCall {
            private int word_level_id;

            public get_easy_words_list_call(int word_level_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.word_level_id = word_level_id;
            }

            public List<Integer> getResult() throws BESystemException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_easy_words_list();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_easy_words_list", (byte) 1, 0));
                get_easy_words_list_args get_easy_words_list_argsVar = new get_easy_words_list_args();
                get_easy_words_list_argsVar.setWord_level_id(this.word_level_id);
                get_easy_words_list_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_little_class_time_call extends TAsyncMethodCall {
            public get_latest_little_class_time_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public int getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_latest_little_class_time();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_latest_little_class_time", (byte) 1, 0));
                new get_latest_little_class_time_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_show_ads_call extends TAsyncMethodCall {
            public get_show_ads_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public List<Integer> getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_show_ads();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_show_ads", (byte) 1, 0));
                new get_show_ads_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_word_media_record_call extends TAsyncMethodCall {
            private int word_level_id;

            public get_user_word_media_record_call(int word_level_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.word_level_id = word_level_id;
            }

            public List<BBUserWordMedia> getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_user_word_media_record();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_user_word_media_record", (byte) 1, 0));
                get_user_word_media_record_args get_user_word_media_record_argsVar = new get_user_word_media_record_args();
                get_user_word_media_record_argsVar.setWord_level_id(this.word_level_id);
                get_user_word_media_record_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_friends_info_call extends TAsyncMethodCall {
            private int word_level_id;

            public get_word_friends_info_call(int word_level_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.word_level_id = word_level_id;
            }

            public String getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_word_friends_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_word_friends_info", (byte) 1, 0));
                get_word_friends_info_args get_word_friends_info_argsVar = new get_word_friends_info_args();
                get_word_friends_info_argsVar.setWord_level_id(this.word_level_id);
                get_word_friends_info_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan_call extends TAsyncMethodCall {
            private String qrcode;

            public qrcode_scan_call(String qrcode, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.qrcode = qrcode;
            }

            public BBQRCodeResp getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_qrcode_scan();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("qrcode_scan", (byte) 1, 0));
                qrcode_scan_args qrcode_scan_argsVar = new qrcode_scan_args();
                qrcode_scan_argsVar.setQrcode(this.qrcode);
                qrcode_scan_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class redo_word_friend_call extends TAsyncMethodCall {
            public redo_word_friend_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public int getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_redo_word_friend();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("redo_word_friend", (byte) 1, 0));
                new redo_word_friend_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_word_friend_done_record_call extends TAsyncMethodCall {
            private List<Integer> done_topic_ids;
            private int word_level_id;

            public save_word_friend_done_record_call(int word_level_id, List<Integer> done_topic_ids, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.word_level_id = word_level_id;
                this.done_topic_ids = done_topic_ids;
            }

            public int getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_save_word_friend_done_record();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("save_word_friend_done_record", (byte) 1, 0));
                save_word_friend_done_record_args save_word_friend_done_record_argsVar = new save_word_friend_done_record_args();
                save_word_friend_done_record_argsVar.setWord_level_id(this.word_level_id);
                save_word_friend_done_record_argsVar.setDone_topic_ids(this.done_topic_ids);
                save_word_friend_done_record_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class sync_user_word_media_record_call extends TAsyncMethodCall {
            private List<BBUserWordMedia> user_media_records;

            public sync_user_word_media_record_call(List<BBUserWordMedia> user_media_records, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.user_media_records = user_media_records;
            }

            public int getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_sync_user_word_media_record();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("sync_user_word_media_record", (byte) 1, 0));
                sync_user_word_media_record_args sync_user_word_media_record_argsVar = new sync_user_word_media_record_args();
                sync_user_word_media_record_argsVar.setUser_media_records(this.user_media_records);
                sync_user_word_media_record_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class user_operation_stat_call extends TAsyncMethodCall {
            private List<BBOperationStatLog> operation_logs;

            public user_operation_stat_call(List<BBOperationStatLog> operation_logs, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.operation_logs = operation_logs;
            }

            public int getResult() throws BESystemException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_user_operation_stat();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("user_operation_stat", (byte) 1, 0));
                user_operation_stat_args user_operation_stat_argsVar = new user_operation_stat_args();
                user_operation_stat_argsVar.setOperation_logs(this.operation_logs);
                user_operation_stat_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        public AsyncClient(TProtocolFactory protocolFactory, TAsyncClientManager clientManager, TNonblockingTransport transport) {
            super(protocolFactory, clientManager, transport);
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.AsyncIface
        public void add_word_friend_feedback(int topic_id, String feedback, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            add_word_friend_feedback_call add_word_friend_feedback_callVar = new add_word_friend_feedback_call(topic_id, feedback, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = add_word_friend_feedback_callVar;
            this.___manager.call(add_word_friend_feedback_callVar);
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.AsyncIface
        public void finish_plan_notify(BBUserFinishPlanInfo finish_plan_info, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            finish_plan_notify_call finish_plan_notify_callVar = new finish_plan_notify_call(finish_plan_info, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = finish_plan_notify_callVar;
            this.___manager.call(finish_plan_notify_callVar);
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.AsyncIface
        public void get_activity_url(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_activity_url_call get_activity_url_callVar = new get_activity_url_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_activity_url_callVar;
            this.___manager.call(get_activity_url_callVar);
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.AsyncIface
        public void get_ads_list(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_ads_list_call get_ads_list_callVar = new get_ads_list_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_ads_list_callVar;
            this.___manager.call(get_ads_list_callVar);
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.AsyncIface
        public void get_easy_words_list(int word_level_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_easy_words_list_call get_easy_words_list_callVar = new get_easy_words_list_call(word_level_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_easy_words_list_callVar;
            this.___manager.call(get_easy_words_list_callVar);
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.AsyncIface
        public void get_latest_little_class_time(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_latest_little_class_time_call get_latest_little_class_time_callVar = new get_latest_little_class_time_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_latest_little_class_time_callVar;
            this.___manager.call(get_latest_little_class_time_callVar);
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.AsyncIface
        public void get_show_ads(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_show_ads_call get_show_ads_callVar = new get_show_ads_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_show_ads_callVar;
            this.___manager.call(get_show_ads_callVar);
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.AsyncIface
        public void get_user_word_media_record(int word_level_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_user_word_media_record_call get_user_word_media_record_callVar = new get_user_word_media_record_call(word_level_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_user_word_media_record_callVar;
            this.___manager.call(get_user_word_media_record_callVar);
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.AsyncIface
        public void get_word_friends_info(int word_level_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_word_friends_info_call get_word_friends_info_callVar = new get_word_friends_info_call(word_level_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_word_friends_info_callVar;
            this.___manager.call(get_word_friends_info_callVar);
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.AsyncIface
        public void qrcode_scan(String qrcode, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            qrcode_scan_call qrcode_scan_callVar = new qrcode_scan_call(qrcode, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = qrcode_scan_callVar;
            this.___manager.call(qrcode_scan_callVar);
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.AsyncIface
        public void redo_word_friend(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            redo_word_friend_call redo_word_friend_callVar = new redo_word_friend_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = redo_word_friend_callVar;
            this.___manager.call(redo_word_friend_callVar);
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.AsyncIface
        public void save_word_friend_done_record(int word_level_id, List<Integer> done_topic_ids, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            save_word_friend_done_record_call save_word_friend_done_record_callVar = new save_word_friend_done_record_call(word_level_id, done_topic_ids, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = save_word_friend_done_record_callVar;
            this.___manager.call(save_word_friend_done_record_callVar);
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.AsyncIface
        public void sync_user_word_media_record(List<BBUserWordMedia> user_media_records, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            sync_user_word_media_record_call sync_user_word_media_record_callVar = new sync_user_word_media_record_call(user_media_records, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = sync_user_word_media_record_callVar;
            this.___manager.call(sync_user_word_media_record_callVar);
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.AsyncIface
        public void user_operation_stat(List<BBOperationStatLog> operation_logs, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            user_operation_stat_call user_operation_stat_callVar = new user_operation_stat_call(operation_logs, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = user_operation_stat_callVar;
            this.___manager.call(user_operation_stat_callVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AsyncIface {
        void add_word_friend_feedback(int topic_id, String feedback, AsyncMethodCallback resultHandler) throws TException;

        void finish_plan_notify(BBUserFinishPlanInfo finish_plan_info, AsyncMethodCallback resultHandler) throws TException;

        void get_activity_url(AsyncMethodCallback resultHandler) throws TException;

        void get_ads_list(AsyncMethodCallback resultHandler) throws TException;

        void get_easy_words_list(int word_level_id, AsyncMethodCallback resultHandler) throws TException;

        void get_latest_little_class_time(AsyncMethodCallback resultHandler) throws TException;

        void get_show_ads(AsyncMethodCallback resultHandler) throws TException;

        void get_user_word_media_record(int word_level_id, AsyncMethodCallback resultHandler) throws TException;

        void get_word_friends_info(int word_level_id, AsyncMethodCallback resultHandler) throws TException;

        void qrcode_scan(String qrcode, AsyncMethodCallback resultHandler) throws TException;

        void redo_word_friend(AsyncMethodCallback resultHandler) throws TException;

        void save_word_friend_done_record(int word_level_id, List<Integer> done_topic_ids, AsyncMethodCallback resultHandler) throws TException;

        void sync_user_word_media_record(List<BBUserWordMedia> user_media_records, AsyncMethodCallback resultHandler) throws TException;

        void user_operation_stat(List<BBOperationStatLog> operation_logs, AsyncMethodCallback resultHandler) throws TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AsyncProcessor<I extends AsyncIface> extends TBaseAsyncProcessor<I> {
        private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class add_word_friend_feedback<I extends AsyncIface> extends AsyncProcessFunction<I, add_word_friend_feedback_args, Integer> {
            public add_word_friend_feedback() {
                super("add_word_friend_feedback");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Integer> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Integer>() { // from class: com.baicizhan.online.bs_users.BSUsers.AsyncProcessor.add_word_friend_feedback.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        add_word_friend_feedback_result add_word_friend_feedback_resultVar;
                        add_word_friend_feedback_result add_word_friend_feedback_resultVar2 = new add_word_friend_feedback_result();
                        try {
                            if (exc instanceof BESystemException) {
                                add_word_friend_feedback_resultVar2.sysException = (BESystemException) exc;
                                add_word_friend_feedback_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    add_word_friend_feedback_resultVar = r02;
                                    this.sendResponse(fb2, add_word_friend_feedback_resultVar, b11, seqid);
                                    return;
                                }
                                add_word_friend_feedback_resultVar2.logicException = (BELogicException) exc;
                                add_word_friend_feedback_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, add_word_friend_feedback_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        add_word_friend_feedback_resultVar = add_word_friend_feedback_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Integer o11) {
                        add_word_friend_feedback_result add_word_friend_feedback_resultVar = new add_word_friend_feedback_result();
                        add_word_friend_feedback_resultVar.success = o11.intValue();
                        add_word_friend_feedback_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, add_word_friend_feedback_resultVar, (byte) 2, seqid);
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
            public add_word_friend_feedback_args getEmptyArgsInstance() {
                return new add_word_friend_feedback_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, add_word_friend_feedback_args args, AsyncMethodCallback<Integer> resultHandler) throws TException {
                iface.add_word_friend_feedback(args.topic_id, args.feedback, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class finish_plan_notify<I extends AsyncIface> extends AsyncProcessFunction<I, finish_plan_notify_args, Integer> {
            public finish_plan_notify() {
                super("finish_plan_notify");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Integer> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Integer>() { // from class: com.baicizhan.online.bs_users.BSUsers.AsyncProcessor.finish_plan_notify.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        finish_plan_notify_result finish_plan_notify_resultVar;
                        finish_plan_notify_result finish_plan_notify_resultVar2 = new finish_plan_notify_result();
                        if (exc instanceof BESystemException) {
                            finish_plan_notify_resultVar2.sysException = (BESystemException) exc;
                            finish_plan_notify_resultVar2.setSysExceptionIsSet(true);
                            b11 = 2;
                            finish_plan_notify_resultVar = finish_plan_notify_resultVar2;
                        } else {
                            ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                            b11 = 3;
                            finish_plan_notify_resultVar = r02;
                        }
                        try {
                            this.sendResponse(fb2, finish_plan_notify_resultVar, b11, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Integer o11) {
                        finish_plan_notify_result finish_plan_notify_resultVar = new finish_plan_notify_result();
                        finish_plan_notify_resultVar.success = o11.intValue();
                        finish_plan_notify_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, finish_plan_notify_resultVar, (byte) 2, seqid);
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
            public finish_plan_notify_args getEmptyArgsInstance() {
                return new finish_plan_notify_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, finish_plan_notify_args args, AsyncMethodCallback<Integer> resultHandler) throws TException {
                iface.finish_plan_notify(args.finish_plan_info, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_activity_url<I extends AsyncIface> extends AsyncProcessFunction<I, get_activity_url_args, String> {
            public get_activity_url() {
                super("get_activity_url");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<String> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<String>() { // from class: com.baicizhan.online.bs_users.BSUsers.AsyncProcessor.get_activity_url.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_activity_url_result get_activity_url_resultVar;
                        get_activity_url_result get_activity_url_resultVar2 = new get_activity_url_result();
                        if (exc instanceof BESystemException) {
                            get_activity_url_resultVar2.sysException = (BESystemException) exc;
                            get_activity_url_resultVar2.setSysExceptionIsSet(true);
                            b11 = 2;
                            get_activity_url_resultVar = get_activity_url_resultVar2;
                        } else {
                            ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                            b11 = 3;
                            get_activity_url_resultVar = r02;
                        }
                        try {
                            this.sendResponse(fb2, get_activity_url_resultVar, b11, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(String o11) {
                        get_activity_url_result get_activity_url_resultVar = new get_activity_url_result();
                        get_activity_url_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_activity_url_resultVar, (byte) 2, seqid);
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
            public get_activity_url_args getEmptyArgsInstance() {
                return new get_activity_url_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_activity_url_args args, AsyncMethodCallback<String> resultHandler) throws TException {
                iface.get_activity_url(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_ads_list<I extends AsyncIface> extends AsyncProcessFunction<I, get_ads_list_args, List<BBAdInfo>> {
            public get_ads_list() {
                super("get_ads_list");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<BBAdInfo>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<BBAdInfo>>() { // from class: com.baicizhan.online.bs_users.BSUsers.AsyncProcessor.get_ads_list.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_ads_list_result get_ads_list_resultVar;
                        get_ads_list_result get_ads_list_resultVar2 = new get_ads_list_result();
                        try {
                            if (exc instanceof BESystemException) {
                                get_ads_list_resultVar2.sysException = (BESystemException) exc;
                                get_ads_list_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_ads_list_resultVar = r02;
                                    this.sendResponse(fb2, get_ads_list_resultVar, b11, seqid);
                                    return;
                                }
                                get_ads_list_resultVar2.logicException = (BELogicException) exc;
                                get_ads_list_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, get_ads_list_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_ads_list_resultVar = get_ads_list_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<BBAdInfo> o11) {
                        get_ads_list_result get_ads_list_resultVar = new get_ads_list_result();
                        get_ads_list_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_ads_list_resultVar, (byte) 2, seqid);
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
            public get_ads_list_args getEmptyArgsInstance() {
                return new get_ads_list_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_ads_list_args args, AsyncMethodCallback<List<BBAdInfo>> resultHandler) throws TException {
                iface.get_ads_list(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_easy_words_list<I extends AsyncIface> extends AsyncProcessFunction<I, get_easy_words_list_args, List<Integer>> {
            public get_easy_words_list() {
                super("get_easy_words_list");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<Integer>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<Integer>>() { // from class: com.baicizhan.online.bs_users.BSUsers.AsyncProcessor.get_easy_words_list.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_easy_words_list_result get_easy_words_list_resultVar;
                        get_easy_words_list_result get_easy_words_list_resultVar2 = new get_easy_words_list_result();
                        if (exc instanceof BESystemException) {
                            get_easy_words_list_resultVar2.sysException = (BESystemException) exc;
                            get_easy_words_list_resultVar2.setSysExceptionIsSet(true);
                            b11 = 2;
                            get_easy_words_list_resultVar = get_easy_words_list_resultVar2;
                        } else {
                            ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                            b11 = 3;
                            get_easy_words_list_resultVar = r02;
                        }
                        try {
                            this.sendResponse(fb2, get_easy_words_list_resultVar, b11, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<Integer> o11) {
                        get_easy_words_list_result get_easy_words_list_resultVar = new get_easy_words_list_result();
                        get_easy_words_list_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_easy_words_list_resultVar, (byte) 2, seqid);
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
            public get_easy_words_list_args getEmptyArgsInstance() {
                return new get_easy_words_list_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_easy_words_list_args args, AsyncMethodCallback<List<Integer>> resultHandler) throws TException {
                iface.get_easy_words_list(args.word_level_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_little_class_time<I extends AsyncIface> extends AsyncProcessFunction<I, get_latest_little_class_time_args, Integer> {
            public get_latest_little_class_time() {
                super("get_latest_little_class_time");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Integer> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Integer>() { // from class: com.baicizhan.online.bs_users.BSUsers.AsyncProcessor.get_latest_little_class_time.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_latest_little_class_time_result get_latest_little_class_time_resultVar;
                        get_latest_little_class_time_result get_latest_little_class_time_resultVar2 = new get_latest_little_class_time_result();
                        try {
                            if (exc instanceof BESystemException) {
                                get_latest_little_class_time_resultVar2.sysException = (BESystemException) exc;
                                get_latest_little_class_time_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_latest_little_class_time_resultVar = r02;
                                    this.sendResponse(fb2, get_latest_little_class_time_resultVar, b11, seqid);
                                    return;
                                }
                                get_latest_little_class_time_resultVar2.logicException = (BELogicException) exc;
                                get_latest_little_class_time_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, get_latest_little_class_time_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_latest_little_class_time_resultVar = get_latest_little_class_time_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Integer o11) {
                        get_latest_little_class_time_result get_latest_little_class_time_resultVar = new get_latest_little_class_time_result();
                        get_latest_little_class_time_resultVar.success = o11.intValue();
                        get_latest_little_class_time_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, get_latest_little_class_time_resultVar, (byte) 2, seqid);
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
            public get_latest_little_class_time_args getEmptyArgsInstance() {
                return new get_latest_little_class_time_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_latest_little_class_time_args args, AsyncMethodCallback<Integer> resultHandler) throws TException {
                iface.get_latest_little_class_time(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_show_ads<I extends AsyncIface> extends AsyncProcessFunction<I, get_show_ads_args, List<Integer>> {
            public get_show_ads() {
                super("get_show_ads");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<Integer>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<Integer>>() { // from class: com.baicizhan.online.bs_users.BSUsers.AsyncProcessor.get_show_ads.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_show_ads_result get_show_ads_resultVar;
                        get_show_ads_result get_show_ads_resultVar2 = new get_show_ads_result();
                        try {
                            if (exc instanceof BESystemException) {
                                get_show_ads_resultVar2.sysException = (BESystemException) exc;
                                get_show_ads_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_show_ads_resultVar = r02;
                                    this.sendResponse(fb2, get_show_ads_resultVar, b11, seqid);
                                    return;
                                }
                                get_show_ads_resultVar2.logicException = (BELogicException) exc;
                                get_show_ads_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, get_show_ads_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_show_ads_resultVar = get_show_ads_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<Integer> o11) {
                        get_show_ads_result get_show_ads_resultVar = new get_show_ads_result();
                        get_show_ads_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_show_ads_resultVar, (byte) 2, seqid);
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
            public get_show_ads_args getEmptyArgsInstance() {
                return new get_show_ads_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_show_ads_args args, AsyncMethodCallback<List<Integer>> resultHandler) throws TException {
                iface.get_show_ads(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_word_media_record<I extends AsyncIface> extends AsyncProcessFunction<I, get_user_word_media_record_args, List<BBUserWordMedia>> {
            public get_user_word_media_record() {
                super("get_user_word_media_record");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<BBUserWordMedia>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<BBUserWordMedia>>() { // from class: com.baicizhan.online.bs_users.BSUsers.AsyncProcessor.get_user_word_media_record.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_user_word_media_record_result get_user_word_media_record_resultVar;
                        get_user_word_media_record_result get_user_word_media_record_resultVar2 = new get_user_word_media_record_result();
                        try {
                            if (exc instanceof BESystemException) {
                                get_user_word_media_record_resultVar2.sysException = (BESystemException) exc;
                                get_user_word_media_record_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_user_word_media_record_resultVar = r02;
                                    this.sendResponse(fb2, get_user_word_media_record_resultVar, b11, seqid);
                                    return;
                                }
                                get_user_word_media_record_resultVar2.logicException = (BELogicException) exc;
                                get_user_word_media_record_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, get_user_word_media_record_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_user_word_media_record_resultVar = get_user_word_media_record_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<BBUserWordMedia> o11) {
                        get_user_word_media_record_result get_user_word_media_record_resultVar = new get_user_word_media_record_result();
                        get_user_word_media_record_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_user_word_media_record_resultVar, (byte) 2, seqid);
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
            public get_user_word_media_record_args getEmptyArgsInstance() {
                return new get_user_word_media_record_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_user_word_media_record_args args, AsyncMethodCallback<List<BBUserWordMedia>> resultHandler) throws TException {
                iface.get_user_word_media_record(args.word_level_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_friends_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_word_friends_info_args, String> {
            public get_word_friends_info() {
                super("get_word_friends_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<String> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<String>() { // from class: com.baicizhan.online.bs_users.BSUsers.AsyncProcessor.get_word_friends_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_word_friends_info_result get_word_friends_info_resultVar;
                        get_word_friends_info_result get_word_friends_info_resultVar2 = new get_word_friends_info_result();
                        try {
                            if (exc instanceof BESystemException) {
                                get_word_friends_info_resultVar2.sysException = (BESystemException) exc;
                                get_word_friends_info_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_word_friends_info_resultVar = r02;
                                    this.sendResponse(fb2, get_word_friends_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_word_friends_info_resultVar2.logicException = (BELogicException) exc;
                                get_word_friends_info_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, get_word_friends_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_word_friends_info_resultVar = get_word_friends_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(String o11) {
                        get_word_friends_info_result get_word_friends_info_resultVar = new get_word_friends_info_result();
                        get_word_friends_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_word_friends_info_resultVar, (byte) 2, seqid);
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
            public get_word_friends_info_args getEmptyArgsInstance() {
                return new get_word_friends_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_word_friends_info_args args, AsyncMethodCallback<String> resultHandler) throws TException {
                iface.get_word_friends_info(args.word_level_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan<I extends AsyncIface> extends AsyncProcessFunction<I, qrcode_scan_args, BBQRCodeResp> {
            public qrcode_scan() {
                super("qrcode_scan");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<BBQRCodeResp> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<BBQRCodeResp>() { // from class: com.baicizhan.online.bs_users.BSUsers.AsyncProcessor.qrcode_scan.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        qrcode_scan_result qrcode_scan_resultVar;
                        qrcode_scan_result qrcode_scan_resultVar2 = new qrcode_scan_result();
                        try {
                            if (exc instanceof BESystemException) {
                                qrcode_scan_resultVar2.sysException = (BESystemException) exc;
                                qrcode_scan_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    qrcode_scan_resultVar = r02;
                                    this.sendResponse(fb2, qrcode_scan_resultVar, b11, seqid);
                                    return;
                                }
                                qrcode_scan_resultVar2.logicException = (BELogicException) exc;
                                qrcode_scan_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, qrcode_scan_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        qrcode_scan_resultVar = qrcode_scan_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(BBQRCodeResp o11) {
                        qrcode_scan_result qrcode_scan_resultVar = new qrcode_scan_result();
                        qrcode_scan_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, qrcode_scan_resultVar, (byte) 2, seqid);
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
            public qrcode_scan_args getEmptyArgsInstance() {
                return new qrcode_scan_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, qrcode_scan_args args, AsyncMethodCallback<BBQRCodeResp> resultHandler) throws TException {
                iface.qrcode_scan(args.qrcode, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class redo_word_friend<I extends AsyncIface> extends AsyncProcessFunction<I, redo_word_friend_args, Integer> {
            public redo_word_friend() {
                super("redo_word_friend");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Integer> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Integer>() { // from class: com.baicizhan.online.bs_users.BSUsers.AsyncProcessor.redo_word_friend.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        redo_word_friend_result redo_word_friend_resultVar;
                        redo_word_friend_result redo_word_friend_resultVar2 = new redo_word_friend_result();
                        try {
                            if (exc instanceof BESystemException) {
                                redo_word_friend_resultVar2.sysException = (BESystemException) exc;
                                redo_word_friend_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    redo_word_friend_resultVar = r02;
                                    this.sendResponse(fb2, redo_word_friend_resultVar, b11, seqid);
                                    return;
                                }
                                redo_word_friend_resultVar2.logicException = (BELogicException) exc;
                                redo_word_friend_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, redo_word_friend_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        redo_word_friend_resultVar = redo_word_friend_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Integer o11) {
                        redo_word_friend_result redo_word_friend_resultVar = new redo_word_friend_result();
                        redo_word_friend_resultVar.success = o11.intValue();
                        redo_word_friend_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, redo_word_friend_resultVar, (byte) 2, seqid);
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
            public redo_word_friend_args getEmptyArgsInstance() {
                return new redo_word_friend_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, redo_word_friend_args args, AsyncMethodCallback<Integer> resultHandler) throws TException {
                iface.redo_word_friend(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_word_friend_done_record<I extends AsyncIface> extends AsyncProcessFunction<I, save_word_friend_done_record_args, Integer> {
            public save_word_friend_done_record() {
                super("save_word_friend_done_record");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Integer> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Integer>() { // from class: com.baicizhan.online.bs_users.BSUsers.AsyncProcessor.save_word_friend_done_record.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        save_word_friend_done_record_result save_word_friend_done_record_resultVar;
                        save_word_friend_done_record_result save_word_friend_done_record_resultVar2 = new save_word_friend_done_record_result();
                        try {
                            if (exc instanceof BESystemException) {
                                save_word_friend_done_record_resultVar2.sysException = (BESystemException) exc;
                                save_word_friend_done_record_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    save_word_friend_done_record_resultVar = r02;
                                    this.sendResponse(fb2, save_word_friend_done_record_resultVar, b11, seqid);
                                    return;
                                }
                                save_word_friend_done_record_resultVar2.logicException = (BELogicException) exc;
                                save_word_friend_done_record_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, save_word_friend_done_record_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        save_word_friend_done_record_resultVar = save_word_friend_done_record_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Integer o11) {
                        save_word_friend_done_record_result save_word_friend_done_record_resultVar = new save_word_friend_done_record_result();
                        save_word_friend_done_record_resultVar.success = o11.intValue();
                        save_word_friend_done_record_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, save_word_friend_done_record_resultVar, (byte) 2, seqid);
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
            public save_word_friend_done_record_args getEmptyArgsInstance() {
                return new save_word_friend_done_record_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, save_word_friend_done_record_args args, AsyncMethodCallback<Integer> resultHandler) throws TException {
                iface.save_word_friend_done_record(args.word_level_id, args.done_topic_ids, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class sync_user_word_media_record<I extends AsyncIface> extends AsyncProcessFunction<I, sync_user_word_media_record_args, Integer> {
            public sync_user_word_media_record() {
                super("sync_user_word_media_record");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Integer> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Integer>() { // from class: com.baicizhan.online.bs_users.BSUsers.AsyncProcessor.sync_user_word_media_record.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        sync_user_word_media_record_result sync_user_word_media_record_resultVar;
                        sync_user_word_media_record_result sync_user_word_media_record_resultVar2 = new sync_user_word_media_record_result();
                        try {
                            if (exc instanceof BESystemException) {
                                sync_user_word_media_record_resultVar2.sysException = (BESystemException) exc;
                                sync_user_word_media_record_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    sync_user_word_media_record_resultVar = r02;
                                    this.sendResponse(fb2, sync_user_word_media_record_resultVar, b11, seqid);
                                    return;
                                }
                                sync_user_word_media_record_resultVar2.logicException = (BELogicException) exc;
                                sync_user_word_media_record_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, sync_user_word_media_record_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        sync_user_word_media_record_resultVar = sync_user_word_media_record_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Integer o11) {
                        sync_user_word_media_record_result sync_user_word_media_record_resultVar = new sync_user_word_media_record_result();
                        sync_user_word_media_record_resultVar.success = o11.intValue();
                        sync_user_word_media_record_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, sync_user_word_media_record_resultVar, (byte) 2, seqid);
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
            public sync_user_word_media_record_args getEmptyArgsInstance() {
                return new sync_user_word_media_record_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, sync_user_word_media_record_args args, AsyncMethodCallback<Integer> resultHandler) throws TException {
                iface.sync_user_word_media_record(args.user_media_records, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class user_operation_stat<I extends AsyncIface> extends AsyncProcessFunction<I, user_operation_stat_args, Integer> {
            public user_operation_stat() {
                super("user_operation_stat");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Integer> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Integer>() { // from class: com.baicizhan.online.bs_users.BSUsers.AsyncProcessor.user_operation_stat.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        user_operation_stat_result user_operation_stat_resultVar;
                        user_operation_stat_result user_operation_stat_resultVar2 = new user_operation_stat_result();
                        if (exc instanceof BESystemException) {
                            user_operation_stat_resultVar2.sysException = (BESystemException) exc;
                            user_operation_stat_resultVar2.setSysExceptionIsSet(true);
                            b11 = 2;
                            user_operation_stat_resultVar = user_operation_stat_resultVar2;
                        } else {
                            ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                            b11 = 3;
                            user_operation_stat_resultVar = r02;
                        }
                        try {
                            this.sendResponse(fb2, user_operation_stat_resultVar, b11, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Integer o11) {
                        user_operation_stat_result user_operation_stat_resultVar = new user_operation_stat_result();
                        user_operation_stat_resultVar.success = o11.intValue();
                        user_operation_stat_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, user_operation_stat_resultVar, (byte) 2, seqid);
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
            public user_operation_stat_args getEmptyArgsInstance() {
                return new user_operation_stat_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, user_operation_stat_args args, AsyncMethodCallback<Integer> resultHandler) throws TException {
                iface.user_operation_stat(args.operation_logs, resultHandler);
            }
        }

        public AsyncProcessor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends AsyncIface> Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> getProcessMap(Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> processMap) {
            processMap.put("sync_user_word_media_record", new sync_user_word_media_record());
            processMap.put("get_user_word_media_record", new get_user_word_media_record());
            processMap.put("get_ads_list", new get_ads_list());
            processMap.put("get_show_ads", new get_show_ads());
            processMap.put("get_word_friends_info", new get_word_friends_info());
            processMap.put("redo_word_friend", new redo_word_friend());
            processMap.put("save_word_friend_done_record", new save_word_friend_done_record());
            processMap.put("add_word_friend_feedback", new add_word_friend_feedback());
            processMap.put("user_operation_stat", new user_operation_stat());
            processMap.put("get_latest_little_class_time", new get_latest_little_class_time());
            processMap.put("finish_plan_notify", new finish_plan_notify());
            processMap.put("qrcode_scan", new qrcode_scan());
            processMap.put("get_easy_words_list", new get_easy_words_list());
            processMap.put("get_activity_url", new get_activity_url());
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

        @Override // com.baicizhan.online.bs_users.BSUsers.Iface
        public int add_word_friend_feedback(int topic_id, String feedback) throws BESystemException, BELogicException, TException {
            send_add_word_friend_feedback(topic_id, feedback);
            return recv_add_word_friend_feedback();
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.Iface
        public int finish_plan_notify(BBUserFinishPlanInfo finish_plan_info) throws BESystemException, TException {
            send_finish_plan_notify(finish_plan_info);
            return recv_finish_plan_notify();
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.Iface
        public String get_activity_url() throws BESystemException, TException {
            send_get_activity_url();
            return recv_get_activity_url();
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.Iface
        public List<BBAdInfo> get_ads_list() throws BESystemException, BELogicException, TException {
            send_get_ads_list();
            return recv_get_ads_list();
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.Iface
        public List<Integer> get_easy_words_list(int word_level_id) throws BESystemException, TException {
            send_get_easy_words_list(word_level_id);
            return recv_get_easy_words_list();
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.Iface
        public int get_latest_little_class_time() throws BESystemException, BELogicException, TException {
            send_get_latest_little_class_time();
            return recv_get_latest_little_class_time();
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.Iface
        public List<Integer> get_show_ads() throws BESystemException, BELogicException, TException {
            send_get_show_ads();
            return recv_get_show_ads();
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.Iface
        public List<BBUserWordMedia> get_user_word_media_record(int word_level_id) throws BESystemException, BELogicException, TException {
            send_get_user_word_media_record(word_level_id);
            return recv_get_user_word_media_record();
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.Iface
        public String get_word_friends_info(int word_level_id) throws BESystemException, BELogicException, TException {
            send_get_word_friends_info(word_level_id);
            return recv_get_word_friends_info();
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.Iface
        public BBQRCodeResp qrcode_scan(String qrcode) throws BESystemException, BELogicException, TException {
            send_qrcode_scan(qrcode);
            return recv_qrcode_scan();
        }

        public int recv_add_word_friend_feedback() throws BESystemException, BELogicException, TException {
            add_word_friend_feedback_result add_word_friend_feedback_resultVar = new add_word_friend_feedback_result();
            receiveBase(add_word_friend_feedback_resultVar, "add_word_friend_feedback");
            if (add_word_friend_feedback_resultVar.isSetSuccess()) {
                return add_word_friend_feedback_resultVar.success;
            }
            BESystemException bESystemException = add_word_friend_feedback_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = add_word_friend_feedback_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "add_word_friend_feedback failed: unknown result");
        }

        public int recv_finish_plan_notify() throws BESystemException, TException {
            finish_plan_notify_result finish_plan_notify_resultVar = new finish_plan_notify_result();
            receiveBase(finish_plan_notify_resultVar, "finish_plan_notify");
            if (finish_plan_notify_resultVar.isSetSuccess()) {
                return finish_plan_notify_resultVar.success;
            }
            BESystemException bESystemException = finish_plan_notify_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            throw new TApplicationException(5, "finish_plan_notify failed: unknown result");
        }

        public String recv_get_activity_url() throws BESystemException, TException {
            get_activity_url_result get_activity_url_resultVar = new get_activity_url_result();
            receiveBase(get_activity_url_resultVar, "get_activity_url");
            if (get_activity_url_resultVar.isSetSuccess()) {
                return get_activity_url_resultVar.success;
            }
            BESystemException bESystemException = get_activity_url_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            throw new TApplicationException(5, "get_activity_url failed: unknown result");
        }

        public List<BBAdInfo> recv_get_ads_list() throws BESystemException, BELogicException, TException {
            get_ads_list_result get_ads_list_resultVar = new get_ads_list_result();
            receiveBase(get_ads_list_resultVar, "get_ads_list");
            if (get_ads_list_resultVar.isSetSuccess()) {
                return get_ads_list_resultVar.success;
            }
            BESystemException bESystemException = get_ads_list_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = get_ads_list_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "get_ads_list failed: unknown result");
        }

        public List<Integer> recv_get_easy_words_list() throws BESystemException, TException {
            get_easy_words_list_result get_easy_words_list_resultVar = new get_easy_words_list_result();
            receiveBase(get_easy_words_list_resultVar, "get_easy_words_list");
            if (get_easy_words_list_resultVar.isSetSuccess()) {
                return get_easy_words_list_resultVar.success;
            }
            BESystemException bESystemException = get_easy_words_list_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            throw new TApplicationException(5, "get_easy_words_list failed: unknown result");
        }

        public int recv_get_latest_little_class_time() throws BESystemException, BELogicException, TException {
            get_latest_little_class_time_result get_latest_little_class_time_resultVar = new get_latest_little_class_time_result();
            receiveBase(get_latest_little_class_time_resultVar, "get_latest_little_class_time");
            if (get_latest_little_class_time_resultVar.isSetSuccess()) {
                return get_latest_little_class_time_resultVar.success;
            }
            BESystemException bESystemException = get_latest_little_class_time_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = get_latest_little_class_time_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "get_latest_little_class_time failed: unknown result");
        }

        public List<Integer> recv_get_show_ads() throws BESystemException, BELogicException, TException {
            get_show_ads_result get_show_ads_resultVar = new get_show_ads_result();
            receiveBase(get_show_ads_resultVar, "get_show_ads");
            if (get_show_ads_resultVar.isSetSuccess()) {
                return get_show_ads_resultVar.success;
            }
            BESystemException bESystemException = get_show_ads_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = get_show_ads_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "get_show_ads failed: unknown result");
        }

        public List<BBUserWordMedia> recv_get_user_word_media_record() throws BESystemException, BELogicException, TException {
            get_user_word_media_record_result get_user_word_media_record_resultVar = new get_user_word_media_record_result();
            receiveBase(get_user_word_media_record_resultVar, "get_user_word_media_record");
            if (get_user_word_media_record_resultVar.isSetSuccess()) {
                return get_user_word_media_record_resultVar.success;
            }
            BESystemException bESystemException = get_user_word_media_record_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = get_user_word_media_record_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "get_user_word_media_record failed: unknown result");
        }

        public String recv_get_word_friends_info() throws BESystemException, BELogicException, TException {
            get_word_friends_info_result get_word_friends_info_resultVar = new get_word_friends_info_result();
            receiveBase(get_word_friends_info_resultVar, "get_word_friends_info");
            if (get_word_friends_info_resultVar.isSetSuccess()) {
                return get_word_friends_info_resultVar.success;
            }
            BESystemException bESystemException = get_word_friends_info_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = get_word_friends_info_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "get_word_friends_info failed: unknown result");
        }

        public BBQRCodeResp recv_qrcode_scan() throws BESystemException, BELogicException, TException {
            qrcode_scan_result qrcode_scan_resultVar = new qrcode_scan_result();
            receiveBase(qrcode_scan_resultVar, "qrcode_scan");
            if (qrcode_scan_resultVar.isSetSuccess()) {
                return qrcode_scan_resultVar.success;
            }
            BESystemException bESystemException = qrcode_scan_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = qrcode_scan_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "qrcode_scan failed: unknown result");
        }

        public int recv_redo_word_friend() throws BESystemException, BELogicException, TException {
            redo_word_friend_result redo_word_friend_resultVar = new redo_word_friend_result();
            receiveBase(redo_word_friend_resultVar, "redo_word_friend");
            if (redo_word_friend_resultVar.isSetSuccess()) {
                return redo_word_friend_resultVar.success;
            }
            BESystemException bESystemException = redo_word_friend_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = redo_word_friend_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "redo_word_friend failed: unknown result");
        }

        public int recv_save_word_friend_done_record() throws BESystemException, BELogicException, TException {
            save_word_friend_done_record_result save_word_friend_done_record_resultVar = new save_word_friend_done_record_result();
            receiveBase(save_word_friend_done_record_resultVar, "save_word_friend_done_record");
            if (save_word_friend_done_record_resultVar.isSetSuccess()) {
                return save_word_friend_done_record_resultVar.success;
            }
            BESystemException bESystemException = save_word_friend_done_record_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = save_word_friend_done_record_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "save_word_friend_done_record failed: unknown result");
        }

        public int recv_sync_user_word_media_record() throws BESystemException, BELogicException, TException {
            sync_user_word_media_record_result sync_user_word_media_record_resultVar = new sync_user_word_media_record_result();
            receiveBase(sync_user_word_media_record_resultVar, "sync_user_word_media_record");
            if (sync_user_word_media_record_resultVar.isSetSuccess()) {
                return sync_user_word_media_record_resultVar.success;
            }
            BESystemException bESystemException = sync_user_word_media_record_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = sync_user_word_media_record_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "sync_user_word_media_record failed: unknown result");
        }

        public int recv_user_operation_stat() throws BESystemException, TException {
            user_operation_stat_result user_operation_stat_resultVar = new user_operation_stat_result();
            receiveBase(user_operation_stat_resultVar, "user_operation_stat");
            if (user_operation_stat_resultVar.isSetSuccess()) {
                return user_operation_stat_resultVar.success;
            }
            BESystemException bESystemException = user_operation_stat_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            throw new TApplicationException(5, "user_operation_stat failed: unknown result");
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.Iface
        public int redo_word_friend() throws BESystemException, BELogicException, TException {
            send_redo_word_friend();
            return recv_redo_word_friend();
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.Iface
        public int save_word_friend_done_record(int word_level_id, List<Integer> done_topic_ids) throws BESystemException, BELogicException, TException {
            send_save_word_friend_done_record(word_level_id, done_topic_ids);
            return recv_save_word_friend_done_record();
        }

        public void send_add_word_friend_feedback(int topic_id, String feedback) throws TException {
            add_word_friend_feedback_args add_word_friend_feedback_argsVar = new add_word_friend_feedback_args();
            add_word_friend_feedback_argsVar.setTopic_id(topic_id);
            add_word_friend_feedback_argsVar.setFeedback(feedback);
            sendBase("add_word_friend_feedback", add_word_friend_feedback_argsVar);
        }

        public void send_finish_plan_notify(BBUserFinishPlanInfo finish_plan_info) throws TException {
            finish_plan_notify_args finish_plan_notify_argsVar = new finish_plan_notify_args();
            finish_plan_notify_argsVar.setFinish_plan_info(finish_plan_info);
            sendBase("finish_plan_notify", finish_plan_notify_argsVar);
        }

        public void send_get_activity_url() throws TException {
            sendBase("get_activity_url", new get_activity_url_args());
        }

        public void send_get_ads_list() throws TException {
            sendBase("get_ads_list", new get_ads_list_args());
        }

        public void send_get_easy_words_list(int word_level_id) throws TException {
            get_easy_words_list_args get_easy_words_list_argsVar = new get_easy_words_list_args();
            get_easy_words_list_argsVar.setWord_level_id(word_level_id);
            sendBase("get_easy_words_list", get_easy_words_list_argsVar);
        }

        public void send_get_latest_little_class_time() throws TException {
            sendBase("get_latest_little_class_time", new get_latest_little_class_time_args());
        }

        public void send_get_show_ads() throws TException {
            sendBase("get_show_ads", new get_show_ads_args());
        }

        public void send_get_user_word_media_record(int word_level_id) throws TException {
            get_user_word_media_record_args get_user_word_media_record_argsVar = new get_user_word_media_record_args();
            get_user_word_media_record_argsVar.setWord_level_id(word_level_id);
            sendBase("get_user_word_media_record", get_user_word_media_record_argsVar);
        }

        public void send_get_word_friends_info(int word_level_id) throws TException {
            get_word_friends_info_args get_word_friends_info_argsVar = new get_word_friends_info_args();
            get_word_friends_info_argsVar.setWord_level_id(word_level_id);
            sendBase("get_word_friends_info", get_word_friends_info_argsVar);
        }

        public void send_qrcode_scan(String qrcode) throws TException {
            qrcode_scan_args qrcode_scan_argsVar = new qrcode_scan_args();
            qrcode_scan_argsVar.setQrcode(qrcode);
            sendBase("qrcode_scan", qrcode_scan_argsVar);
        }

        public void send_redo_word_friend() throws TException {
            sendBase("redo_word_friend", new redo_word_friend_args());
        }

        public void send_save_word_friend_done_record(int word_level_id, List<Integer> done_topic_ids) throws TException {
            save_word_friend_done_record_args save_word_friend_done_record_argsVar = new save_word_friend_done_record_args();
            save_word_friend_done_record_argsVar.setWord_level_id(word_level_id);
            save_word_friend_done_record_argsVar.setDone_topic_ids(done_topic_ids);
            sendBase("save_word_friend_done_record", save_word_friend_done_record_argsVar);
        }

        public void send_sync_user_word_media_record(List<BBUserWordMedia> user_media_records) throws TException {
            sync_user_word_media_record_args sync_user_word_media_record_argsVar = new sync_user_word_media_record_args();
            sync_user_word_media_record_argsVar.setUser_media_records(user_media_records);
            sendBase("sync_user_word_media_record", sync_user_word_media_record_argsVar);
        }

        public void send_user_operation_stat(List<BBOperationStatLog> operation_logs) throws TException {
            user_operation_stat_args user_operation_stat_argsVar = new user_operation_stat_args();
            user_operation_stat_argsVar.setOperation_logs(operation_logs);
            sendBase("user_operation_stat", user_operation_stat_argsVar);
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.Iface
        public int sync_user_word_media_record(List<BBUserWordMedia> user_media_records) throws BESystemException, BELogicException, TException {
            send_sync_user_word_media_record(user_media_records);
            return recv_sync_user_word_media_record();
        }

        @Override // com.baicizhan.online.bs_users.BSUsers.Iface
        public int user_operation_stat(List<BBOperationStatLog> operation_logs) throws BESystemException, TException {
            send_user_operation_stat(operation_logs);
            return recv_user_operation_stat();
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
        int add_word_friend_feedback(int topic_id, String feedback) throws BESystemException, BELogicException, TException;

        int finish_plan_notify(BBUserFinishPlanInfo finish_plan_info) throws BESystemException, TException;

        String get_activity_url() throws BESystemException, TException;

        List<BBAdInfo> get_ads_list() throws BESystemException, BELogicException, TException;

        List<Integer> get_easy_words_list(int word_level_id) throws BESystemException, TException;

        int get_latest_little_class_time() throws BESystemException, BELogicException, TException;

        List<Integer> get_show_ads() throws BESystemException, BELogicException, TException;

        List<BBUserWordMedia> get_user_word_media_record(int word_level_id) throws BESystemException, BELogicException, TException;

        String get_word_friends_info(int word_level_id) throws BESystemException, BELogicException, TException;

        BBQRCodeResp qrcode_scan(String qrcode) throws BESystemException, BELogicException, TException;

        int redo_word_friend() throws BESystemException, BELogicException, TException;

        int save_word_friend_done_record(int word_level_id, List<Integer> done_topic_ids) throws BESystemException, BELogicException, TException;

        int sync_user_word_media_record(List<BBUserWordMedia> user_media_records) throws BESystemException, BELogicException, TException;

        int user_operation_stat(List<BBOperationStatLog> operation_logs) throws BESystemException, TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Processor<I extends Iface> extends TBaseProcessor<I> implements TProcessor {
        private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class add_word_friend_feedback<I extends Iface> extends ProcessFunction<I, add_word_friend_feedback_args> {
            public add_word_friend_feedback() {
                super("add_word_friend_feedback");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public add_word_friend_feedback_args getEmptyArgsInstance() {
                return new add_word_friend_feedback_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public add_word_friend_feedback_result getResult(I iface, add_word_friend_feedback_args args) throws TException {
                add_word_friend_feedback_result add_word_friend_feedback_resultVar = new add_word_friend_feedback_result();
                try {
                    add_word_friend_feedback_resultVar.success = iface.add_word_friend_feedback(args.topic_id, args.feedback);
                    add_word_friend_feedback_resultVar.setSuccessIsSet(true);
                    return add_word_friend_feedback_resultVar;
                } catch (BELogicException e11) {
                    add_word_friend_feedback_resultVar.logicException = e11;
                    return add_word_friend_feedback_resultVar;
                } catch (BESystemException e12) {
                    add_word_friend_feedback_resultVar.sysException = e12;
                    return add_word_friend_feedback_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class finish_plan_notify<I extends Iface> extends ProcessFunction<I, finish_plan_notify_args> {
            public finish_plan_notify() {
                super("finish_plan_notify");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public finish_plan_notify_args getEmptyArgsInstance() {
                return new finish_plan_notify_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public finish_plan_notify_result getResult(I iface, finish_plan_notify_args args) throws TException {
                finish_plan_notify_result finish_plan_notify_resultVar = new finish_plan_notify_result();
                try {
                    finish_plan_notify_resultVar.success = iface.finish_plan_notify(args.finish_plan_info);
                    finish_plan_notify_resultVar.setSuccessIsSet(true);
                    return finish_plan_notify_resultVar;
                } catch (BESystemException e11) {
                    finish_plan_notify_resultVar.sysException = e11;
                    return finish_plan_notify_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_activity_url<I extends Iface> extends ProcessFunction<I, get_activity_url_args> {
            public get_activity_url() {
                super("get_activity_url");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_activity_url_args getEmptyArgsInstance() {
                return new get_activity_url_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_activity_url_result getResult(I iface, get_activity_url_args args) throws TException {
                get_activity_url_result get_activity_url_resultVar = new get_activity_url_result();
                try {
                    get_activity_url_resultVar.success = iface.get_activity_url();
                    return get_activity_url_resultVar;
                } catch (BESystemException e11) {
                    get_activity_url_resultVar.sysException = e11;
                    return get_activity_url_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_ads_list<I extends Iface> extends ProcessFunction<I, get_ads_list_args> {
            public get_ads_list() {
                super("get_ads_list");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_ads_list_args getEmptyArgsInstance() {
                return new get_ads_list_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_ads_list_result getResult(I iface, get_ads_list_args args) throws TException {
                get_ads_list_result get_ads_list_resultVar = new get_ads_list_result();
                try {
                    get_ads_list_resultVar.success = iface.get_ads_list();
                    return get_ads_list_resultVar;
                } catch (BELogicException e11) {
                    get_ads_list_resultVar.logicException = e11;
                    return get_ads_list_resultVar;
                } catch (BESystemException e12) {
                    get_ads_list_resultVar.sysException = e12;
                    return get_ads_list_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_easy_words_list<I extends Iface> extends ProcessFunction<I, get_easy_words_list_args> {
            public get_easy_words_list() {
                super("get_easy_words_list");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_easy_words_list_args getEmptyArgsInstance() {
                return new get_easy_words_list_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_easy_words_list_result getResult(I iface, get_easy_words_list_args args) throws TException {
                get_easy_words_list_result get_easy_words_list_resultVar = new get_easy_words_list_result();
                try {
                    get_easy_words_list_resultVar.success = iface.get_easy_words_list(args.word_level_id);
                    return get_easy_words_list_resultVar;
                } catch (BESystemException e11) {
                    get_easy_words_list_resultVar.sysException = e11;
                    return get_easy_words_list_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_little_class_time<I extends Iface> extends ProcessFunction<I, get_latest_little_class_time_args> {
            public get_latest_little_class_time() {
                super("get_latest_little_class_time");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_latest_little_class_time_args getEmptyArgsInstance() {
                return new get_latest_little_class_time_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_latest_little_class_time_result getResult(I iface, get_latest_little_class_time_args args) throws TException {
                get_latest_little_class_time_result get_latest_little_class_time_resultVar = new get_latest_little_class_time_result();
                try {
                    get_latest_little_class_time_resultVar.success = iface.get_latest_little_class_time();
                    get_latest_little_class_time_resultVar.setSuccessIsSet(true);
                    return get_latest_little_class_time_resultVar;
                } catch (BELogicException e11) {
                    get_latest_little_class_time_resultVar.logicException = e11;
                    return get_latest_little_class_time_resultVar;
                } catch (BESystemException e12) {
                    get_latest_little_class_time_resultVar.sysException = e12;
                    return get_latest_little_class_time_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_show_ads<I extends Iface> extends ProcessFunction<I, get_show_ads_args> {
            public get_show_ads() {
                super("get_show_ads");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_show_ads_args getEmptyArgsInstance() {
                return new get_show_ads_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_show_ads_result getResult(I iface, get_show_ads_args args) throws TException {
                get_show_ads_result get_show_ads_resultVar = new get_show_ads_result();
                try {
                    get_show_ads_resultVar.success = iface.get_show_ads();
                    return get_show_ads_resultVar;
                } catch (BELogicException e11) {
                    get_show_ads_resultVar.logicException = e11;
                    return get_show_ads_resultVar;
                } catch (BESystemException e12) {
                    get_show_ads_resultVar.sysException = e12;
                    return get_show_ads_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_word_media_record<I extends Iface> extends ProcessFunction<I, get_user_word_media_record_args> {
            public get_user_word_media_record() {
                super("get_user_word_media_record");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_user_word_media_record_args getEmptyArgsInstance() {
                return new get_user_word_media_record_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_user_word_media_record_result getResult(I iface, get_user_word_media_record_args args) throws TException {
                get_user_word_media_record_result get_user_word_media_record_resultVar = new get_user_word_media_record_result();
                try {
                    get_user_word_media_record_resultVar.success = iface.get_user_word_media_record(args.word_level_id);
                    return get_user_word_media_record_resultVar;
                } catch (BELogicException e11) {
                    get_user_word_media_record_resultVar.logicException = e11;
                    return get_user_word_media_record_resultVar;
                } catch (BESystemException e12) {
                    get_user_word_media_record_resultVar.sysException = e12;
                    return get_user_word_media_record_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_friends_info<I extends Iface> extends ProcessFunction<I, get_word_friends_info_args> {
            public get_word_friends_info() {
                super("get_word_friends_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_word_friends_info_args getEmptyArgsInstance() {
                return new get_word_friends_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_word_friends_info_result getResult(I iface, get_word_friends_info_args args) throws TException {
                get_word_friends_info_result get_word_friends_info_resultVar = new get_word_friends_info_result();
                try {
                    get_word_friends_info_resultVar.success = iface.get_word_friends_info(args.word_level_id);
                    return get_word_friends_info_resultVar;
                } catch (BELogicException e11) {
                    get_word_friends_info_resultVar.logicException = e11;
                    return get_word_friends_info_resultVar;
                } catch (BESystemException e12) {
                    get_word_friends_info_resultVar.sysException = e12;
                    return get_word_friends_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan<I extends Iface> extends ProcessFunction<I, qrcode_scan_args> {
            public qrcode_scan() {
                super("qrcode_scan");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public qrcode_scan_args getEmptyArgsInstance() {
                return new qrcode_scan_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public qrcode_scan_result getResult(I iface, qrcode_scan_args args) throws TException {
                qrcode_scan_result qrcode_scan_resultVar = new qrcode_scan_result();
                try {
                    qrcode_scan_resultVar.success = iface.qrcode_scan(args.qrcode);
                    return qrcode_scan_resultVar;
                } catch (BELogicException e11) {
                    qrcode_scan_resultVar.logicException = e11;
                    return qrcode_scan_resultVar;
                } catch (BESystemException e12) {
                    qrcode_scan_resultVar.sysException = e12;
                    return qrcode_scan_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class redo_word_friend<I extends Iface> extends ProcessFunction<I, redo_word_friend_args> {
            public redo_word_friend() {
                super("redo_word_friend");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public redo_word_friend_args getEmptyArgsInstance() {
                return new redo_word_friend_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public redo_word_friend_result getResult(I iface, redo_word_friend_args args) throws TException {
                redo_word_friend_result redo_word_friend_resultVar = new redo_word_friend_result();
                try {
                    redo_word_friend_resultVar.success = iface.redo_word_friend();
                    redo_word_friend_resultVar.setSuccessIsSet(true);
                    return redo_word_friend_resultVar;
                } catch (BELogicException e11) {
                    redo_word_friend_resultVar.logicException = e11;
                    return redo_word_friend_resultVar;
                } catch (BESystemException e12) {
                    redo_word_friend_resultVar.sysException = e12;
                    return redo_word_friend_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_word_friend_done_record<I extends Iface> extends ProcessFunction<I, save_word_friend_done_record_args> {
            public save_word_friend_done_record() {
                super("save_word_friend_done_record");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public save_word_friend_done_record_args getEmptyArgsInstance() {
                return new save_word_friend_done_record_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public save_word_friend_done_record_result getResult(I iface, save_word_friend_done_record_args args) throws TException {
                save_word_friend_done_record_result save_word_friend_done_record_resultVar = new save_word_friend_done_record_result();
                try {
                    save_word_friend_done_record_resultVar.success = iface.save_word_friend_done_record(args.word_level_id, args.done_topic_ids);
                    save_word_friend_done_record_resultVar.setSuccessIsSet(true);
                    return save_word_friend_done_record_resultVar;
                } catch (BELogicException e11) {
                    save_word_friend_done_record_resultVar.logicException = e11;
                    return save_word_friend_done_record_resultVar;
                } catch (BESystemException e12) {
                    save_word_friend_done_record_resultVar.sysException = e12;
                    return save_word_friend_done_record_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class sync_user_word_media_record<I extends Iface> extends ProcessFunction<I, sync_user_word_media_record_args> {
            public sync_user_word_media_record() {
                super("sync_user_word_media_record");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public sync_user_word_media_record_args getEmptyArgsInstance() {
                return new sync_user_word_media_record_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public sync_user_word_media_record_result getResult(I iface, sync_user_word_media_record_args args) throws TException {
                sync_user_word_media_record_result sync_user_word_media_record_resultVar = new sync_user_word_media_record_result();
                try {
                    sync_user_word_media_record_resultVar.success = iface.sync_user_word_media_record(args.user_media_records);
                    sync_user_word_media_record_resultVar.setSuccessIsSet(true);
                    return sync_user_word_media_record_resultVar;
                } catch (BELogicException e11) {
                    sync_user_word_media_record_resultVar.logicException = e11;
                    return sync_user_word_media_record_resultVar;
                } catch (BESystemException e12) {
                    sync_user_word_media_record_resultVar.sysException = e12;
                    return sync_user_word_media_record_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class user_operation_stat<I extends Iface> extends ProcessFunction<I, user_operation_stat_args> {
            public user_operation_stat() {
                super("user_operation_stat");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public user_operation_stat_args getEmptyArgsInstance() {
                return new user_operation_stat_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public user_operation_stat_result getResult(I iface, user_operation_stat_args args) throws TException {
                user_operation_stat_result user_operation_stat_resultVar = new user_operation_stat_result();
                try {
                    user_operation_stat_resultVar.success = iface.user_operation_stat(args.operation_logs);
                    user_operation_stat_resultVar.setSuccessIsSet(true);
                    return user_operation_stat_resultVar;
                } catch (BESystemException e11) {
                    user_operation_stat_resultVar.sysException = e11;
                    return user_operation_stat_resultVar;
                }
            }
        }

        public Processor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends Iface> Map<String, ProcessFunction<I, ? extends TBase>> getProcessMap(Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            processMap.put("sync_user_word_media_record", new sync_user_word_media_record());
            processMap.put("get_user_word_media_record", new get_user_word_media_record());
            processMap.put("get_ads_list", new get_ads_list());
            processMap.put("get_show_ads", new get_show_ads());
            processMap.put("get_word_friends_info", new get_word_friends_info());
            processMap.put("redo_word_friend", new redo_word_friend());
            processMap.put("save_word_friend_done_record", new save_word_friend_done_record());
            processMap.put("add_word_friend_feedback", new add_word_friend_feedback());
            processMap.put("user_operation_stat", new user_operation_stat());
            processMap.put("get_latest_little_class_time", new get_latest_little_class_time());
            processMap.put("finish_plan_notify", new finish_plan_notify());
            processMap.put("qrcode_scan", new qrcode_scan());
            processMap.put("get_easy_words_list", new get_easy_words_list());
            processMap.put("get_activity_url", new get_activity_url());
            return processMap;
        }

        public Processor(I iface, Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            super(iface, getProcessMap(processMap));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class add_word_friend_feedback_args implements TBase<add_word_friend_feedback_args, _Fields>, Serializable, Cloneable, Comparable<add_word_friend_feedback_args> {
        private static final int __TOPIC_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public String feedback;
        public int topic_id;
        private static final TStruct STRUCT_DESC = new TStruct("add_word_friend_feedback_args");
        private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
        private static final TField FEEDBACK_FIELD_DESC = new TField("feedback", (byte) 11, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            TOPIC_ID(1, "topic_id"),
            FEEDBACK(2, "feedback");

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
                    return TOPIC_ID;
                }
                if (fieldId != 2) {
                    return null;
                }
                return FEEDBACK;
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
        public static class add_word_friend_feedback_argsStandardScheme extends StandardScheme<add_word_friend_feedback_args> {
            private add_word_friend_feedback_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, add_word_friend_feedback_args struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 11) {
                            struct.feedback = iprot.readString();
                            struct.setFeedbackIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
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
            public void write(TProtocol oprot, add_word_friend_feedback_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(add_word_friend_feedback_args.STRUCT_DESC);
                oprot.writeFieldBegin(add_word_friend_feedback_args.TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.topic_id);
                oprot.writeFieldEnd();
                if (struct.feedback != null) {
                    oprot.writeFieldBegin(add_word_friend_feedback_args.FEEDBACK_FIELD_DESC);
                    oprot.writeString(struct.feedback);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class add_word_friend_feedback_argsStandardSchemeFactory implements SchemeFactory {
            private add_word_friend_feedback_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public add_word_friend_feedback_argsStandardScheme getScheme() {
                return new add_word_friend_feedback_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class add_word_friend_feedback_argsTupleScheme extends TupleScheme<add_word_friend_feedback_args> {
            private add_word_friend_feedback_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, add_word_friend_feedback_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.topic_id = tTupleProtocol.readI32();
                struct.setTopic_idIsSet(true);
                struct.feedback = tTupleProtocol.readString();
                struct.setFeedbackIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, add_word_friend_feedback_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.topic_id);
                tTupleProtocol.writeString(struct.feedback);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class add_word_friend_feedback_argsTupleSchemeFactory implements SchemeFactory {
            private add_word_friend_feedback_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public add_word_friend_feedback_argsTupleScheme getScheme() {
                return new add_word_friend_feedback_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new add_word_friend_feedback_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new add_word_friend_feedback_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.FEEDBACK, (_Fields) new FieldMetaData("feedback", (byte) 1, new FieldValueMetaData((byte) 11)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(add_word_friend_feedback_args.class, unmodifiableMap);
        }

        public add_word_friend_feedback_args() {
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
            this.feedback = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof add_word_friend_feedback_args)) {
                return equals((add_word_friend_feedback_args) that);
            }
            return false;
        }

        public String getFeedback() {
            return this.feedback;
        }

        public int getTopic_id() {
            return this.topic_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetFeedback() {
            return this.feedback != null;
        }

        public boolean isSetTopic_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public add_word_friend_feedback_args setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }

        public void setFeedbackIsSet(boolean value) {
            if (value) {
                return;
            }
            this.feedback = null;
        }

        public add_word_friend_feedback_args setTopic_id(int topic_id) {
            this.topic_id = topic_id;
            setTopic_idIsSet(true);
            return this;
        }

        public void setTopic_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("add_word_friend_feedback_args(");
            sb2.append("topic_id:");
            sb2.append(this.topic_id);
            sb2.append(j2.O);
            sb2.append("feedback:");
            String str = this.feedback;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetFeedback() {
            this.feedback = null;
        }

        public void unsetTopic_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        public void validate() throws TException {
            if (this.feedback != null) {
                return;
            }
            throw new TProtocolException("Required field 'feedback' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(add_word_friend_feedback_args other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetTopic_id() && (compareTo2 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetFeedback()).compareTo(Boolean.valueOf(other.isSetFeedback()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetFeedback() || (compareTo = TBaseHelper.compareTo(this.feedback, other.feedback)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<add_word_friend_feedback_args, _Fields> deepCopy2() {
            return new add_word_friend_feedback_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$add_word_friend_feedback_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getTopic_id());
            }
            if (i11 == 2) {
                return getFeedback();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$add_word_friend_feedback_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetTopic_id();
            }
            if (i11 == 2) {
                return isSetFeedback();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$add_word_friend_feedback_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetTopic_id();
                    return;
                } else {
                    setTopic_id(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetFeedback();
            } else {
                setFeedback((String) value);
            }
        }

        public add_word_friend_feedback_args(int topic_id, String feedback) {
            this();
            this.topic_id = topic_id;
            setTopic_idIsSet(true);
            this.feedback = feedback;
        }

        public boolean equals(add_word_friend_feedback_args that) {
            if (that == null || this.topic_id != that.topic_id) {
                return false;
            }
            boolean isSetFeedback = isSetFeedback();
            boolean isSetFeedback2 = that.isSetFeedback();
            if (isSetFeedback || isSetFeedback2) {
                return isSetFeedback && isSetFeedback2 && this.feedback.equals(that.feedback);
            }
            return true;
        }

        public add_word_friend_feedback_args(add_word_friend_feedback_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.topic_id = other.topic_id;
            if (other.isSetFeedback()) {
                this.feedback = other.feedback;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class add_word_friend_feedback_result implements TBase<add_word_friend_feedback_result, _Fields>, Serializable, Cloneable, Comparable<add_word_friend_feedback_result> {
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public BELogicException logicException;
        public int success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("add_word_friend_feedback_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 8, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOGIC_EXCEPTION_FIELD_DESC = new TField("logicException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            SYS_EXCEPTION(1, "sysException"),
            LOGIC_EXCEPTION(2, "logicException");

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
                    return SYS_EXCEPTION;
                }
                if (fieldId != 2) {
                    return null;
                }
                return LOGIC_EXCEPTION;
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
        public static class add_word_friend_feedback_resultStandardScheme extends StandardScheme<add_word_friend_feedback_result> {
            private add_word_friend_feedback_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, add_word_friend_feedback_result struct) throws TException {
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
                                BELogicException bELogicException = new BELogicException();
                                struct.logicException = bELogicException;
                                bELogicException.read(iprot);
                                struct.setLogicExceptionIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            BESystemException bESystemException = new BESystemException();
                            struct.sysException = bESystemException;
                            bESystemException.read(iprot);
                            struct.setSysExceptionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.success = iprot.readI32();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, add_word_friend_feedback_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(add_word_friend_feedback_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(add_word_friend_feedback_result.SUCCESS_FIELD_DESC);
                    oprot.writeI32(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(add_word_friend_feedback_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(add_word_friend_feedback_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class add_word_friend_feedback_resultStandardSchemeFactory implements SchemeFactory {
            private add_word_friend_feedback_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public add_word_friend_feedback_resultStandardScheme getScheme() {
                return new add_word_friend_feedback_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class add_word_friend_feedback_resultTupleScheme extends TupleScheme<add_word_friend_feedback_result> {
            private add_word_friend_feedback_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, add_word_friend_feedback_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    struct.success = tTupleProtocol.readI32();
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    BESystemException bESystemException = new BESystemException();
                    struct.sysException = bESystemException;
                    bESystemException.read(tTupleProtocol);
                    struct.setSysExceptionIsSet(true);
                }
                if (readBitSet.get(2)) {
                    BELogicException bELogicException = new BELogicException();
                    struct.logicException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogicExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, add_word_friend_feedback_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetSysException()) {
                    bitSet.set(1);
                }
                if (struct.isSetLogicException()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success);
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogicException()) {
                    struct.logicException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class add_word_friend_feedback_resultTupleSchemeFactory implements SchemeFactory {
            private add_word_friend_feedback_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public add_word_friend_feedback_resultTupleScheme getScheme() {
                return new add_word_friend_feedback_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new add_word_friend_feedback_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new add_word_friend_feedback_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(add_word_friend_feedback_result.class, unmodifiableMap);
        }

        public add_word_friend_feedback_result() {
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
            setSuccessIsSet(false);
            this.success = 0;
            this.sysException = null;
            this.logicException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof add_word_friend_feedback_result)) {
                return equals((add_word_friend_feedback_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
        }

        public int getSuccess() {
            return this.success;
        }

        public BESystemException getSysException() {
            return this.sysException;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetLogicException() {
            return this.logicException != null;
        }

        public boolean isSetSuccess() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public add_word_friend_feedback_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public add_word_friend_feedback_result setSuccess(int success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public add_word_friend_feedback_result setSysException(BESystemException sysException) {
            this.sysException = sysException;
            return this;
        }

        public void setSysExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.sysException = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("add_word_friend_feedback_result(");
            sb2.append("success:");
            sb2.append(this.success);
            sb2.append(j2.O);
            sb2.append("sysException:");
            BESystemException bESystemException = this.sysException;
            if (bESystemException == null) {
                sb2.append("null");
            } else {
                sb2.append(bESystemException);
            }
            sb2.append(j2.O);
            sb2.append("logicException:");
            BELogicException bELogicException = this.logicException;
            if (bELogicException == null) {
                sb2.append("null");
            } else {
                sb2.append(bELogicException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetLogicException() {
            this.logicException = null;
        }

        public void unsetSuccess() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(add_word_friend_feedback_result other) {
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
            int compareTo5 = Boolean.valueOf(isSetSysException()).compareTo(Boolean.valueOf(other.isSetSysException()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetSysException() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.sysException, (Comparable) other.sysException)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetLogicException()).compareTo(Boolean.valueOf(other.isSetLogicException()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetLogicException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logicException, (Comparable) other.logicException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<add_word_friend_feedback_result, _Fields> deepCopy2() {
            return new add_word_friend_feedback_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$add_word_friend_feedback_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getSuccess());
            }
            if (i11 == 2) {
                return getSysException();
            }
            if (i11 == 3) {
                return getLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$add_word_friend_feedback_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetSysException();
            }
            if (i11 == 3) {
                return isSetLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$add_word_friend_feedback_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetSysException();
                    return;
                } else {
                    setSysException((BESystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetLogicException();
            } else {
                setLogicException((BELogicException) value);
            }
        }

        public add_word_friend_feedback_result(int success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.sysException = sysException;
            this.logicException = logicException;
        }

        public boolean equals(add_word_friend_feedback_result that) {
            if (that == null || this.success != that.success) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if ((isSetSysException || isSetSysException2) && !(isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException))) {
                return false;
            }
            boolean isSetLogicException = isSetLogicException();
            boolean isSetLogicException2 = that.isSetLogicException();
            if (isSetLogicException || isSetLogicException2) {
                return isSetLogicException && isSetLogicException2 && this.logicException.equals(that.logicException);
            }
            return true;
        }

        public add_word_friend_feedback_result(add_word_friend_feedback_result other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.success = other.success;
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
            if (other.isSetLogicException()) {
                this.logicException = new BELogicException(other.logicException);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class finish_plan_notify_args implements TBase<finish_plan_notify_args, _Fields>, Serializable, Cloneable, Comparable<finish_plan_notify_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BBUserFinishPlanInfo finish_plan_info;
        private static final TStruct STRUCT_DESC = new TStruct("finish_plan_notify_args");
        private static final TField FINISH_PLAN_INFO_FIELD_DESC = new TField("finish_plan_info", (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            FINISH_PLAN_INFO(1, "finish_plan_info");

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
                return FINISH_PLAN_INFO;
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
        public static class finish_plan_notify_argsStandardScheme extends StandardScheme<finish_plan_notify_args> {
            private finish_plan_notify_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, finish_plan_notify_args struct) throws TException {
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
                        BBUserFinishPlanInfo bBUserFinishPlanInfo = new BBUserFinishPlanInfo();
                        struct.finish_plan_info = bBUserFinishPlanInfo;
                        bBUserFinishPlanInfo.read(iprot);
                        struct.setFinish_plan_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, finish_plan_notify_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(finish_plan_notify_args.STRUCT_DESC);
                if (struct.finish_plan_info != null) {
                    oprot.writeFieldBegin(finish_plan_notify_args.FINISH_PLAN_INFO_FIELD_DESC);
                    struct.finish_plan_info.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class finish_plan_notify_argsStandardSchemeFactory implements SchemeFactory {
            private finish_plan_notify_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public finish_plan_notify_argsStandardScheme getScheme() {
                return new finish_plan_notify_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class finish_plan_notify_argsTupleScheme extends TupleScheme<finish_plan_notify_args> {
            private finish_plan_notify_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, finish_plan_notify_args struct) throws TException {
                BBUserFinishPlanInfo bBUserFinishPlanInfo = new BBUserFinishPlanInfo();
                struct.finish_plan_info = bBUserFinishPlanInfo;
                bBUserFinishPlanInfo.read((TTupleProtocol) prot);
                struct.setFinish_plan_infoIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, finish_plan_notify_args struct) throws TException {
                struct.finish_plan_info.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class finish_plan_notify_argsTupleSchemeFactory implements SchemeFactory {
            private finish_plan_notify_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public finish_plan_notify_argsTupleScheme getScheme() {
                return new finish_plan_notify_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new finish_plan_notify_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new finish_plan_notify_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.FINISH_PLAN_INFO, (_Fields) new FieldMetaData("finish_plan_info", (byte) 1, new StructMetaData((byte) 12, BBUserFinishPlanInfo.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(finish_plan_notify_args.class, unmodifiableMap);
        }

        public finish_plan_notify_args() {
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
            this.finish_plan_info = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof finish_plan_notify_args)) {
                return equals((finish_plan_notify_args) that);
            }
            return false;
        }

        public BBUserFinishPlanInfo getFinish_plan_info() {
            return this.finish_plan_info;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetFinish_plan_info() {
            return this.finish_plan_info != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public finish_plan_notify_args setFinish_plan_info(BBUserFinishPlanInfo finish_plan_info) {
            this.finish_plan_info = finish_plan_info;
            return this;
        }

        public void setFinish_plan_infoIsSet(boolean value) {
            if (value) {
                return;
            }
            this.finish_plan_info = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("finish_plan_notify_args(");
            sb2.append("finish_plan_info:");
            BBUserFinishPlanInfo bBUserFinishPlanInfo = this.finish_plan_info;
            if (bBUserFinishPlanInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBUserFinishPlanInfo);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetFinish_plan_info() {
            this.finish_plan_info = null;
        }

        public void validate() throws TException {
            BBUserFinishPlanInfo bBUserFinishPlanInfo = this.finish_plan_info;
            if (bBUserFinishPlanInfo != null) {
                if (bBUserFinishPlanInfo != null) {
                    bBUserFinishPlanInfo.validate();
                }
            } else {
                throw new TProtocolException("Required field 'finish_plan_info' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public finish_plan_notify_args(BBUserFinishPlanInfo finish_plan_info) {
            this();
            this.finish_plan_info = finish_plan_info;
        }

        @Override // java.lang.Comparable
        public int compareTo(finish_plan_notify_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetFinish_plan_info()).compareTo(Boolean.valueOf(other.isSetFinish_plan_info()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetFinish_plan_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.finish_plan_info, (Comparable) other.finish_plan_info)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<finish_plan_notify_args, _Fields> deepCopy2() {
            return new finish_plan_notify_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$finish_plan_notify_args$_Fields[field.ordinal()] == 1) {
                return getFinish_plan_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$finish_plan_notify_args$_Fields[field.ordinal()] == 1) {
                return isSetFinish_plan_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$finish_plan_notify_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetFinish_plan_info();
            } else {
                setFinish_plan_info((BBUserFinishPlanInfo) value);
            }
        }

        public boolean equals(finish_plan_notify_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetFinish_plan_info = isSetFinish_plan_info();
            boolean isSetFinish_plan_info2 = that.isSetFinish_plan_info();
            if (isSetFinish_plan_info || isSetFinish_plan_info2) {
                return isSetFinish_plan_info && isSetFinish_plan_info2 && this.finish_plan_info.equals(that.finish_plan_info);
            }
            return true;
        }

        public finish_plan_notify_args(finish_plan_notify_args other) {
            if (other.isSetFinish_plan_info()) {
                this.finish_plan_info = new BBUserFinishPlanInfo(other.finish_plan_info);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class finish_plan_notify_result implements TBase<finish_plan_notify_result, _Fields>, Serializable, Cloneable, Comparable<finish_plan_notify_result> {
        private static final TStruct STRUCT_DESC = new TStruct("finish_plan_notify_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 8, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int success;
        public BESystemException sysException;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            SYS_EXCEPTION(1, "sysException");

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
                if (fieldId != 1) {
                    return null;
                }
                return SYS_EXCEPTION;
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
        public static class finish_plan_notify_resultStandardScheme extends StandardScheme<finish_plan_notify_result> {
            private finish_plan_notify_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, finish_plan_notify_result struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 12) {
                            BESystemException bESystemException = new BESystemException();
                            struct.sysException = bESystemException;
                            bESystemException.read(iprot);
                            struct.setSysExceptionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.success = iprot.readI32();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, finish_plan_notify_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(finish_plan_notify_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(finish_plan_notify_result.SUCCESS_FIELD_DESC);
                    oprot.writeI32(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(finish_plan_notify_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class finish_plan_notify_resultStandardSchemeFactory implements SchemeFactory {
            private finish_plan_notify_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public finish_plan_notify_resultStandardScheme getScheme() {
                return new finish_plan_notify_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class finish_plan_notify_resultTupleScheme extends TupleScheme<finish_plan_notify_result> {
            private finish_plan_notify_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, finish_plan_notify_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(2);
                if (readBitSet.get(0)) {
                    struct.success = tTupleProtocol.readI32();
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    BESystemException bESystemException = new BESystemException();
                    struct.sysException = bESystemException;
                    bESystemException.read(tTupleProtocol);
                    struct.setSysExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, finish_plan_notify_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetSysException()) {
                    bitSet.set(1);
                }
                tTupleProtocol.writeBitSet(bitSet, 2);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success);
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class finish_plan_notify_resultTupleSchemeFactory implements SchemeFactory {
            private finish_plan_notify_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public finish_plan_notify_resultTupleScheme getScheme() {
                return new finish_plan_notify_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new finish_plan_notify_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new finish_plan_notify_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(finish_plan_notify_result.class, unmodifiableMap);
        }

        public finish_plan_notify_result() {
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
            setSuccessIsSet(false);
            this.success = 0;
            this.sysException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof finish_plan_notify_result)) {
                return equals((finish_plan_notify_result) that);
            }
            return false;
        }

        public int getSuccess() {
            return this.success;
        }

        public BESystemException getSysException() {
            return this.sysException;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetSuccess() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public finish_plan_notify_result setSuccess(int success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public finish_plan_notify_result setSysException(BESystemException sysException) {
            this.sysException = sysException;
            return this;
        }

        public void setSysExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.sysException = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("finish_plan_notify_result(");
            sb2.append("success:");
            sb2.append(this.success);
            sb2.append(j2.O);
            sb2.append("sysException:");
            BESystemException bESystemException = this.sysException;
            if (bESystemException == null) {
                sb2.append("null");
            } else {
                sb2.append(bESystemException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetSuccess() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(finish_plan_notify_result other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetSuccess() && (compareTo2 = TBaseHelper.compareTo(this.success, other.success)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetSysException()).compareTo(Boolean.valueOf(other.isSetSysException()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetSysException() || (compareTo = TBaseHelper.compareTo((Comparable) this.sysException, (Comparable) other.sysException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<finish_plan_notify_result, _Fields> deepCopy2() {
            return new finish_plan_notify_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$finish_plan_notify_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getSuccess());
            }
            if (i11 == 2) {
                return getSysException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$finish_plan_notify_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetSysException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$finish_plan_notify_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetSysException();
            } else {
                setSysException((BESystemException) value);
            }
        }

        public finish_plan_notify_result(int success, BESystemException sysException) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.sysException = sysException;
        }

        public boolean equals(finish_plan_notify_result that) {
            if (that == null || this.success != that.success) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if (isSetSysException || isSetSysException2) {
                return isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException);
            }
            return true;
        }

        public finish_plan_notify_result(finish_plan_notify_result other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.success = other.success;
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_activity_url_args implements TBase<get_activity_url_args, _Fields>, Serializable, Cloneable, Comparable<get_activity_url_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_activity_url_args");
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ;

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
                return null;
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
        public static class get_activity_url_argsStandardScheme extends StandardScheme<get_activity_url_args> {
            private get_activity_url_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_activity_url_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    byte b11 = iprot.readFieldBegin().type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                        iprot.readFieldEnd();
                    }
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_activity_url_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_activity_url_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_activity_url_argsStandardSchemeFactory implements SchemeFactory {
            private get_activity_url_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_activity_url_argsStandardScheme getScheme() {
                return new get_activity_url_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_activity_url_argsTupleScheme extends TupleScheme<get_activity_url_args> {
            private get_activity_url_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_activity_url_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_activity_url_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_activity_url_argsTupleSchemeFactory implements SchemeFactory {
            private get_activity_url_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_activity_url_argsTupleScheme getScheme() {
                return new get_activity_url_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_activity_url_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_activity_url_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_activity_url_args.class, unmodifiableMap);
        }

        public get_activity_url_args() {
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

        public boolean equals(get_activity_url_args that) {
            return that != null;
        }

        public int hashCode() {
            return 0;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public String toString() {
            return "get_activity_url_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_activity_url_args(get_activity_url_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_activity_url_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_activity_url_args, _Fields> deepCopy2() {
            return new get_activity_url_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_activity_url_args)) {
                return equals((get_activity_url_args) that);
            }
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_activity_url_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_activity_url_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_activity_url_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_activity_url_result implements TBase<get_activity_url_result, _Fields>, Serializable, Cloneable, Comparable<get_activity_url_result> {
        private static final TStruct STRUCT_DESC = new TStruct("get_activity_url_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 11, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public String success;
        public BESystemException sysException;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            SYS_EXCEPTION(1, "sysException");

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
                if (fieldId != 1) {
                    return null;
                }
                return SYS_EXCEPTION;
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
        public static class get_activity_url_resultStandardScheme extends StandardScheme<get_activity_url_result> {
            private get_activity_url_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_activity_url_result struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 12) {
                            BESystemException bESystemException = new BESystemException();
                            struct.sysException = bESystemException;
                            bESystemException.read(iprot);
                            struct.setSysExceptionIsSet(true);
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
            public void write(TProtocol oprot, get_activity_url_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_activity_url_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_activity_url_result.SUCCESS_FIELD_DESC);
                    oprot.writeString(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(get_activity_url_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_activity_url_resultStandardSchemeFactory implements SchemeFactory {
            private get_activity_url_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_activity_url_resultStandardScheme getScheme() {
                return new get_activity_url_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_activity_url_resultTupleScheme extends TupleScheme<get_activity_url_result> {
            private get_activity_url_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_activity_url_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(2);
                if (readBitSet.get(0)) {
                    struct.success = tTupleProtocol.readString();
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    BESystemException bESystemException = new BESystemException();
                    struct.sysException = bESystemException;
                    bESystemException.read(tTupleProtocol);
                    struct.setSysExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_activity_url_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetSysException()) {
                    bitSet.set(1);
                }
                tTupleProtocol.writeBitSet(bitSet, 2);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeString(struct.success);
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_activity_url_resultTupleSchemeFactory implements SchemeFactory {
            private get_activity_url_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_activity_url_resultTupleScheme getScheme() {
                return new get_activity_url_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_activity_url_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_activity_url_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 11)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_activity_url_result.class, unmodifiableMap);
        }

        public get_activity_url_result() {
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
            this.sysException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_activity_url_result)) {
                return equals((get_activity_url_result) that);
            }
            return false;
        }

        public String getSuccess() {
            return this.success;
        }

        public BESystemException getSysException() {
            return this.sysException;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_activity_url_result setSuccess(String success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public get_activity_url_result setSysException(BESystemException sysException) {
            this.sysException = sysException;
            return this;
        }

        public void setSysExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.sysException = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_activity_url_result(");
            sb2.append("success:");
            String str = this.success;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j2.O);
            sb2.append("sysException:");
            BESystemException bESystemException = this.sysException;
            if (bESystemException == null) {
                sb2.append("null");
            } else {
                sb2.append(bESystemException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_activity_url_result(String success, BESystemException sysException) {
            this();
            this.success = success;
            this.sysException = sysException;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_activity_url_result other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetSuccess() && (compareTo2 = TBaseHelper.compareTo(this.success, other.success)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetSysException()).compareTo(Boolean.valueOf(other.isSetSysException()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetSysException() || (compareTo = TBaseHelper.compareTo((Comparable) this.sysException, (Comparable) other.sysException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_activity_url_result, _Fields> deepCopy2() {
            return new get_activity_url_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_activity_url_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getSysException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_activity_url_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetSysException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_activity_url_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((String) value);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetSysException();
            } else {
                setSysException((BESystemException) value);
            }
        }

        public boolean equals(get_activity_url_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if (isSetSysException || isSetSysException2) {
                return isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException);
            }
            return true;
        }

        public get_activity_url_result(get_activity_url_result other) {
            if (other.isSetSuccess()) {
                this.success = other.success;
            }
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_ads_list_args implements TBase<get_ads_list_args, _Fields>, Serializable, Cloneable, Comparable<get_ads_list_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_ads_list_args");
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ;

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
                return null;
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
        public static class get_ads_list_argsStandardScheme extends StandardScheme<get_ads_list_args> {
            private get_ads_list_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_ads_list_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    byte b11 = iprot.readFieldBegin().type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                        iprot.readFieldEnd();
                    }
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_ads_list_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_ads_list_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_ads_list_argsStandardSchemeFactory implements SchemeFactory {
            private get_ads_list_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_ads_list_argsStandardScheme getScheme() {
                return new get_ads_list_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_ads_list_argsTupleScheme extends TupleScheme<get_ads_list_args> {
            private get_ads_list_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_ads_list_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_ads_list_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_ads_list_argsTupleSchemeFactory implements SchemeFactory {
            private get_ads_list_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_ads_list_argsTupleScheme getScheme() {
                return new get_ads_list_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_ads_list_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_ads_list_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_ads_list_args.class, unmodifiableMap);
        }

        public get_ads_list_args() {
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

        public boolean equals(get_ads_list_args that) {
            return that != null;
        }

        public int hashCode() {
            return 0;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public String toString() {
            return "get_ads_list_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_ads_list_args(get_ads_list_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_ads_list_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_ads_list_args, _Fields> deepCopy2() {
            return new get_ads_list_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_ads_list_args)) {
                return equals((get_ads_list_args) that);
            }
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_ads_list_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_ads_list_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_ads_list_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_ads_list_result implements TBase<get_ads_list_result, _Fields>, Serializable, Cloneable, Comparable<get_ads_list_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logicException;
        public List<BBAdInfo> success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("get_ads_list_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOGIC_EXCEPTION_FIELD_DESC = new TField("logicException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            SYS_EXCEPTION(1, "sysException"),
            LOGIC_EXCEPTION(2, "logicException");

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
                    return SYS_EXCEPTION;
                }
                if (fieldId != 2) {
                    return null;
                }
                return LOGIC_EXCEPTION;
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
        public static class get_ads_list_resultStandardScheme extends StandardScheme<get_ads_list_result> {
            private get_ads_list_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_ads_list_result struct) throws TException {
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
                                BELogicException bELogicException = new BELogicException();
                                struct.logicException = bELogicException;
                                bELogicException.read(iprot);
                                struct.setLogicExceptionIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            BESystemException bESystemException = new BESystemException();
                            struct.sysException = bESystemException;
                            bESystemException.read(iprot);
                            struct.setSysExceptionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.success = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            BBAdInfo bBAdInfo = new BBAdInfo();
                            bBAdInfo.read(iprot);
                            struct.success.add(bBAdInfo);
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
            public void write(TProtocol oprot, get_ads_list_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_ads_list_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_ads_list_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<BBAdInfo> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(get_ads_list_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(get_ads_list_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_ads_list_resultStandardSchemeFactory implements SchemeFactory {
            private get_ads_list_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_ads_list_resultStandardScheme getScheme() {
                return new get_ads_list_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_ads_list_resultTupleScheme extends TupleScheme<get_ads_list_result> {
            private get_ads_list_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_ads_list_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        BBAdInfo bBAdInfo = new BBAdInfo();
                        bBAdInfo.read(tTupleProtocol);
                        struct.success.add(bBAdInfo);
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    BESystemException bESystemException = new BESystemException();
                    struct.sysException = bESystemException;
                    bESystemException.read(tTupleProtocol);
                    struct.setSysExceptionIsSet(true);
                }
                if (readBitSet.get(2)) {
                    BELogicException bELogicException = new BELogicException();
                    struct.logicException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogicExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_ads_list_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetSysException()) {
                    bitSet.set(1);
                }
                if (struct.isSetLogicException()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    Iterator<BBAdInfo> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(tTupleProtocol);
                    }
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogicException()) {
                    struct.logicException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_ads_list_resultTupleSchemeFactory implements SchemeFactory {
            private get_ads_list_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_ads_list_resultTupleScheme getScheme() {
                return new get_ads_list_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_ads_list_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_ads_list_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BBAdInfo.class))));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_ads_list_result.class, unmodifiableMap);
        }

        public get_ads_list_result() {
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

        public void addToSuccess(BBAdInfo elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.sysException = null;
            this.logicException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_ads_list_result)) {
                return equals((get_ads_list_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
        }

        public List<BBAdInfo> getSuccess() {
            return this.success;
        }

        public Iterator<BBAdInfo> getSuccessIterator() {
            List<BBAdInfo> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<BBAdInfo> list = this.success;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public BESystemException getSysException() {
            return this.sysException;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetLogicException() {
            return this.logicException != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_ads_list_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public get_ads_list_result setSuccess(List<BBAdInfo> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public get_ads_list_result setSysException(BESystemException sysException) {
            this.sysException = sysException;
            return this;
        }

        public void setSysExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.sysException = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_ads_list_result(");
            sb2.append("success:");
            List<BBAdInfo> list = this.success;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j2.O);
            sb2.append("sysException:");
            BESystemException bESystemException = this.sysException;
            if (bESystemException == null) {
                sb2.append("null");
            } else {
                sb2.append(bESystemException);
            }
            sb2.append(j2.O);
            sb2.append("logicException:");
            BELogicException bELogicException = this.logicException;
            if (bELogicException == null) {
                sb2.append("null");
            } else {
                sb2.append(bELogicException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetLogicException() {
            this.logicException = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_ads_list_result(List<BBAdInfo> success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            this.sysException = sysException;
            this.logicException = logicException;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_ads_list_result other) {
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
            int compareTo5 = Boolean.valueOf(isSetSysException()).compareTo(Boolean.valueOf(other.isSetSysException()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetSysException() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.sysException, (Comparable) other.sysException)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetLogicException()).compareTo(Boolean.valueOf(other.isSetLogicException()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetLogicException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logicException, (Comparable) other.logicException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_ads_list_result, _Fields> deepCopy2() {
            return new get_ads_list_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_ads_list_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getSysException();
            }
            if (i11 == 3) {
                return getLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_ads_list_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetSysException();
            }
            if (i11 == 3) {
                return isSetLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_ads_list_result$_Fields[field.ordinal()];
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
                    unsetSysException();
                    return;
                } else {
                    setSysException((BESystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetLogicException();
            } else {
                setLogicException((BELogicException) value);
            }
        }

        public boolean equals(get_ads_list_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if ((isSetSysException || isSetSysException2) && !(isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException))) {
                return false;
            }
            boolean isSetLogicException = isSetLogicException();
            boolean isSetLogicException2 = that.isSetLogicException();
            if (isSetLogicException || isSetLogicException2) {
                return isSetLogicException && isSetLogicException2 && this.logicException.equals(that.logicException);
            }
            return true;
        }

        public get_ads_list_result(get_ads_list_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<BBAdInfo> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BBAdInfo(it.next()));
                }
                this.success = arrayList;
            }
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
            if (other.isSetLogicException()) {
                this.logicException = new BELogicException(other.logicException);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_easy_words_list_args implements TBase<get_easy_words_list_args, _Fields>, Serializable, Cloneable, Comparable<get_easy_words_list_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_easy_words_list_args");
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
        public static class get_easy_words_list_argsStandardScheme extends StandardScheme<get_easy_words_list_args> {
            private get_easy_words_list_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_easy_words_list_args struct) throws TException {
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
            public void write(TProtocol oprot, get_easy_words_list_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_easy_words_list_args.STRUCT_DESC);
                oprot.writeFieldBegin(get_easy_words_list_args.WORD_LEVEL_ID_FIELD_DESC);
                oprot.writeI32(struct.word_level_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_easy_words_list_argsStandardSchemeFactory implements SchemeFactory {
            private get_easy_words_list_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_easy_words_list_argsStandardScheme getScheme() {
                return new get_easy_words_list_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_easy_words_list_argsTupleScheme extends TupleScheme<get_easy_words_list_args> {
            private get_easy_words_list_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_easy_words_list_args struct) throws TException {
                struct.word_level_id = ((TTupleProtocol) prot).readI32();
                struct.setWord_level_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_easy_words_list_args struct) throws TException {
                ((TTupleProtocol) prot).writeI32(struct.word_level_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_easy_words_list_argsTupleSchemeFactory implements SchemeFactory {
            private get_easy_words_list_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_easy_words_list_argsTupleScheme getScheme() {
                return new get_easy_words_list_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_easy_words_list_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_easy_words_list_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.WORD_LEVEL_ID, (_Fields) new FieldMetaData(ma.b.f72894c, (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_easy_words_list_args.class, unmodifiableMap);
        }

        public get_easy_words_list_args() {
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
            if (that != null && (that instanceof get_easy_words_list_args)) {
                return equals((get_easy_words_list_args) that);
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

        public get_easy_words_list_args setWord_level_id(int word_level_id) {
            this.word_level_id = word_level_id;
            setWord_level_idIsSet(true);
            return this;
        }

        public void setWord_level_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "get_easy_words_list_args(word_level_id:" + this.word_level_id + j.f81007d;
        }

        public void unsetWord_level_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_easy_words_list_args other) {
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
        public TBase<get_easy_words_list_args, _Fields> deepCopy2() {
            return new get_easy_words_list_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_easy_words_list_args$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getWord_level_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_easy_words_list_args$_Fields[field.ordinal()] == 1) {
                return isSetWord_level_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_easy_words_list_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetWord_level_id();
            } else {
                setWord_level_id(((Integer) value).intValue());
            }
        }

        public get_easy_words_list_args(int word_level_id) {
            this();
            this.word_level_id = word_level_id;
            setWord_level_idIsSet(true);
        }

        public boolean equals(get_easy_words_list_args that) {
            return that != null && this.word_level_id == that.word_level_id;
        }

        public get_easy_words_list_args(get_easy_words_list_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.word_level_id = other.word_level_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_easy_words_list_result implements TBase<get_easy_words_list_result, _Fields>, Serializable, Cloneable, Comparable<get_easy_words_list_result> {
        private static final TStruct STRUCT_DESC = new TStruct("get_easy_words_list_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public List<Integer> success;
        public BESystemException sysException;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            SYS_EXCEPTION(1, "sysException");

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
                if (fieldId != 1) {
                    return null;
                }
                return SYS_EXCEPTION;
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
        public static class get_easy_words_list_resultStandardScheme extends StandardScheme<get_easy_words_list_result> {
            private get_easy_words_list_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_easy_words_list_result struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 12) {
                            BESystemException bESystemException = new BESystemException();
                            struct.sysException = bESystemException;
                            bESystemException.read(iprot);
                            struct.setSysExceptionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.success = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            struct.success.add(Integer.valueOf(iprot.readI32()));
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
            public void write(TProtocol oprot, get_easy_words_list_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_easy_words_list_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_easy_words_list_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 8, struct.success.size()));
                    Iterator<Integer> it = struct.success.iterator();
                    while (it.hasNext()) {
                        oprot.writeI32(it.next().intValue());
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(get_easy_words_list_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_easy_words_list_resultStandardSchemeFactory implements SchemeFactory {
            private get_easy_words_list_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_easy_words_list_resultStandardScheme getScheme() {
                return new get_easy_words_list_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_easy_words_list_resultTupleScheme extends TupleScheme<get_easy_words_list_result> {
            private get_easy_words_list_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_easy_words_list_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(2);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 8, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        struct.success.add(Integer.valueOf(tTupleProtocol.readI32()));
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    BESystemException bESystemException = new BESystemException();
                    struct.sysException = bESystemException;
                    bESystemException.read(tTupleProtocol);
                    struct.setSysExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_easy_words_list_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetSysException()) {
                    bitSet.set(1);
                }
                tTupleProtocol.writeBitSet(bitSet, 2);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    Iterator<Integer> it = struct.success.iterator();
                    while (it.hasNext()) {
                        tTupleProtocol.writeI32(it.next().intValue());
                    }
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_easy_words_list_resultTupleSchemeFactory implements SchemeFactory {
            private get_easy_words_list_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_easy_words_list_resultTupleScheme getScheme() {
                return new get_easy_words_list_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_easy_words_list_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_easy_words_list_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_easy_words_list_result.class, unmodifiableMap);
        }

        public get_easy_words_list_result() {
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

        public void addToSuccess(int elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(Integer.valueOf(elem));
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.sysException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_easy_words_list_result)) {
                return equals((get_easy_words_list_result) that);
            }
            return false;
        }

        public List<Integer> getSuccess() {
            return this.success;
        }

        public Iterator<Integer> getSuccessIterator() {
            List<Integer> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<Integer> list = this.success;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public BESystemException getSysException() {
            return this.sysException;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_easy_words_list_result setSuccess(List<Integer> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public get_easy_words_list_result setSysException(BESystemException sysException) {
            this.sysException = sysException;
            return this;
        }

        public void setSysExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.sysException = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_easy_words_list_result(");
            sb2.append("success:");
            List<Integer> list = this.success;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j2.O);
            sb2.append("sysException:");
            BESystemException bESystemException = this.sysException;
            if (bESystemException == null) {
                sb2.append("null");
            } else {
                sb2.append(bESystemException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_easy_words_list_result(List<Integer> success, BESystemException sysException) {
            this();
            this.success = success;
            this.sysException = sysException;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_easy_words_list_result other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetSuccess() && (compareTo2 = TBaseHelper.compareTo((List) this.success, (List) other.success)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetSysException()).compareTo(Boolean.valueOf(other.isSetSysException()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetSysException() || (compareTo = TBaseHelper.compareTo((Comparable) this.sysException, (Comparable) other.sysException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_easy_words_list_result, _Fields> deepCopy2() {
            return new get_easy_words_list_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_easy_words_list_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getSysException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_easy_words_list_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetSysException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_easy_words_list_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((List) value);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetSysException();
            } else {
                setSysException((BESystemException) value);
            }
        }

        public boolean equals(get_easy_words_list_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if (isSetSysException || isSetSysException2) {
                return isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException);
            }
            return true;
        }

        public get_easy_words_list_result(get_easy_words_list_result other) {
            if (other.isSetSuccess()) {
                this.success = new ArrayList(other.success);
            }
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_latest_little_class_time_args implements TBase<get_latest_little_class_time_args, _Fields>, Serializable, Cloneable, Comparable<get_latest_little_class_time_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_latest_little_class_time_args");
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ;

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
                return null;
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
        public static class get_latest_little_class_time_argsStandardScheme extends StandardScheme<get_latest_little_class_time_args> {
            private get_latest_little_class_time_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_latest_little_class_time_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    byte b11 = iprot.readFieldBegin().type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                        iprot.readFieldEnd();
                    }
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_latest_little_class_time_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_latest_little_class_time_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_little_class_time_argsStandardSchemeFactory implements SchemeFactory {
            private get_latest_little_class_time_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_latest_little_class_time_argsStandardScheme getScheme() {
                return new get_latest_little_class_time_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_little_class_time_argsTupleScheme extends TupleScheme<get_latest_little_class_time_args> {
            private get_latest_little_class_time_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_latest_little_class_time_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_latest_little_class_time_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_little_class_time_argsTupleSchemeFactory implements SchemeFactory {
            private get_latest_little_class_time_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_latest_little_class_time_argsTupleScheme getScheme() {
                return new get_latest_little_class_time_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_latest_little_class_time_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_latest_little_class_time_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_latest_little_class_time_args.class, unmodifiableMap);
        }

        public get_latest_little_class_time_args() {
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

        public boolean equals(get_latest_little_class_time_args that) {
            return that != null;
        }

        public int hashCode() {
            return 0;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public String toString() {
            return "get_latest_little_class_time_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_latest_little_class_time_args(get_latest_little_class_time_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_latest_little_class_time_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_latest_little_class_time_args, _Fields> deepCopy2() {
            return new get_latest_little_class_time_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_latest_little_class_time_args)) {
                return equals((get_latest_little_class_time_args) that);
            }
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_latest_little_class_time_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_latest_little_class_time_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_latest_little_class_time_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_latest_little_class_time_result implements TBase<get_latest_little_class_time_result, _Fields>, Serializable, Cloneable, Comparable<get_latest_little_class_time_result> {
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public BELogicException logicException;
        public int success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("get_latest_little_class_time_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 8, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOGIC_EXCEPTION_FIELD_DESC = new TField("logicException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            SYS_EXCEPTION(1, "sysException"),
            LOGIC_EXCEPTION(2, "logicException");

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
                    return SYS_EXCEPTION;
                }
                if (fieldId != 2) {
                    return null;
                }
                return LOGIC_EXCEPTION;
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
        public static class get_latest_little_class_time_resultStandardScheme extends StandardScheme<get_latest_little_class_time_result> {
            private get_latest_little_class_time_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_latest_little_class_time_result struct) throws TException {
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
                                BELogicException bELogicException = new BELogicException();
                                struct.logicException = bELogicException;
                                bELogicException.read(iprot);
                                struct.setLogicExceptionIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            BESystemException bESystemException = new BESystemException();
                            struct.sysException = bESystemException;
                            bESystemException.read(iprot);
                            struct.setSysExceptionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.success = iprot.readI32();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_latest_little_class_time_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_latest_little_class_time_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(get_latest_little_class_time_result.SUCCESS_FIELD_DESC);
                    oprot.writeI32(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(get_latest_little_class_time_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(get_latest_little_class_time_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_little_class_time_resultStandardSchemeFactory implements SchemeFactory {
            private get_latest_little_class_time_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_latest_little_class_time_resultStandardScheme getScheme() {
                return new get_latest_little_class_time_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_little_class_time_resultTupleScheme extends TupleScheme<get_latest_little_class_time_result> {
            private get_latest_little_class_time_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_latest_little_class_time_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    struct.success = tTupleProtocol.readI32();
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    BESystemException bESystemException = new BESystemException();
                    struct.sysException = bESystemException;
                    bESystemException.read(tTupleProtocol);
                    struct.setSysExceptionIsSet(true);
                }
                if (readBitSet.get(2)) {
                    BELogicException bELogicException = new BELogicException();
                    struct.logicException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogicExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_latest_little_class_time_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetSysException()) {
                    bitSet.set(1);
                }
                if (struct.isSetLogicException()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success);
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogicException()) {
                    struct.logicException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_little_class_time_resultTupleSchemeFactory implements SchemeFactory {
            private get_latest_little_class_time_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_latest_little_class_time_resultTupleScheme getScheme() {
                return new get_latest_little_class_time_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_latest_little_class_time_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_latest_little_class_time_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_latest_little_class_time_result.class, unmodifiableMap);
        }

        public get_latest_little_class_time_result() {
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
            setSuccessIsSet(false);
            this.success = 0;
            this.sysException = null;
            this.logicException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_latest_little_class_time_result)) {
                return equals((get_latest_little_class_time_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
        }

        public int getSuccess() {
            return this.success;
        }

        public BESystemException getSysException() {
            return this.sysException;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetLogicException() {
            return this.logicException != null;
        }

        public boolean isSetSuccess() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_latest_little_class_time_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public get_latest_little_class_time_result setSuccess(int success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public get_latest_little_class_time_result setSysException(BESystemException sysException) {
            this.sysException = sysException;
            return this;
        }

        public void setSysExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.sysException = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_latest_little_class_time_result(");
            sb2.append("success:");
            sb2.append(this.success);
            sb2.append(j2.O);
            sb2.append("sysException:");
            BESystemException bESystemException = this.sysException;
            if (bESystemException == null) {
                sb2.append("null");
            } else {
                sb2.append(bESystemException);
            }
            sb2.append(j2.O);
            sb2.append("logicException:");
            BELogicException bELogicException = this.logicException;
            if (bELogicException == null) {
                sb2.append("null");
            } else {
                sb2.append(bELogicException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetLogicException() {
            this.logicException = null;
        }

        public void unsetSuccess() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_latest_little_class_time_result other) {
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
            int compareTo5 = Boolean.valueOf(isSetSysException()).compareTo(Boolean.valueOf(other.isSetSysException()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetSysException() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.sysException, (Comparable) other.sysException)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetLogicException()).compareTo(Boolean.valueOf(other.isSetLogicException()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetLogicException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logicException, (Comparable) other.logicException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_latest_little_class_time_result, _Fields> deepCopy2() {
            return new get_latest_little_class_time_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_latest_little_class_time_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getSuccess());
            }
            if (i11 == 2) {
                return getSysException();
            }
            if (i11 == 3) {
                return getLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_latest_little_class_time_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetSysException();
            }
            if (i11 == 3) {
                return isSetLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_latest_little_class_time_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetSysException();
                    return;
                } else {
                    setSysException((BESystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetLogicException();
            } else {
                setLogicException((BELogicException) value);
            }
        }

        public get_latest_little_class_time_result(int success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.sysException = sysException;
            this.logicException = logicException;
        }

        public boolean equals(get_latest_little_class_time_result that) {
            if (that == null || this.success != that.success) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if ((isSetSysException || isSetSysException2) && !(isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException))) {
                return false;
            }
            boolean isSetLogicException = isSetLogicException();
            boolean isSetLogicException2 = that.isSetLogicException();
            if (isSetLogicException || isSetLogicException2) {
                return isSetLogicException && isSetLogicException2 && this.logicException.equals(that.logicException);
            }
            return true;
        }

        public get_latest_little_class_time_result(get_latest_little_class_time_result other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.success = other.success;
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
            if (other.isSetLogicException()) {
                this.logicException = new BELogicException(other.logicException);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_show_ads_args implements TBase<get_show_ads_args, _Fields>, Serializable, Cloneable, Comparable<get_show_ads_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_show_ads_args");
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ;

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
                return null;
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
        public static class get_show_ads_argsStandardScheme extends StandardScheme<get_show_ads_args> {
            private get_show_ads_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_show_ads_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    byte b11 = iprot.readFieldBegin().type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                        iprot.readFieldEnd();
                    }
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_show_ads_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_show_ads_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_show_ads_argsStandardSchemeFactory implements SchemeFactory {
            private get_show_ads_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_show_ads_argsStandardScheme getScheme() {
                return new get_show_ads_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_show_ads_argsTupleScheme extends TupleScheme<get_show_ads_args> {
            private get_show_ads_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_show_ads_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_show_ads_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_show_ads_argsTupleSchemeFactory implements SchemeFactory {
            private get_show_ads_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_show_ads_argsTupleScheme getScheme() {
                return new get_show_ads_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_show_ads_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_show_ads_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_show_ads_args.class, unmodifiableMap);
        }

        public get_show_ads_args() {
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

        public boolean equals(get_show_ads_args that) {
            return that != null;
        }

        public int hashCode() {
            return 0;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public String toString() {
            return "get_show_ads_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_show_ads_args(get_show_ads_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_show_ads_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_show_ads_args, _Fields> deepCopy2() {
            return new get_show_ads_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_show_ads_args)) {
                return equals((get_show_ads_args) that);
            }
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_show_ads_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_show_ads_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_show_ads_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_show_ads_result implements TBase<get_show_ads_result, _Fields>, Serializable, Cloneable, Comparable<get_show_ads_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logicException;
        public List<Integer> success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("get_show_ads_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOGIC_EXCEPTION_FIELD_DESC = new TField("logicException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            SYS_EXCEPTION(1, "sysException"),
            LOGIC_EXCEPTION(2, "logicException");

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
                    return SYS_EXCEPTION;
                }
                if (fieldId != 2) {
                    return null;
                }
                return LOGIC_EXCEPTION;
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
        public static class get_show_ads_resultStandardScheme extends StandardScheme<get_show_ads_result> {
            private get_show_ads_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_show_ads_result struct) throws TException {
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
                                BELogicException bELogicException = new BELogicException();
                                struct.logicException = bELogicException;
                                bELogicException.read(iprot);
                                struct.setLogicExceptionIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            BESystemException bESystemException = new BESystemException();
                            struct.sysException = bESystemException;
                            bESystemException.read(iprot);
                            struct.setSysExceptionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.success = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            struct.success.add(Integer.valueOf(iprot.readI32()));
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
            public void write(TProtocol oprot, get_show_ads_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_show_ads_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_show_ads_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 8, struct.success.size()));
                    Iterator<Integer> it = struct.success.iterator();
                    while (it.hasNext()) {
                        oprot.writeI32(it.next().intValue());
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(get_show_ads_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(get_show_ads_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_show_ads_resultStandardSchemeFactory implements SchemeFactory {
            private get_show_ads_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_show_ads_resultStandardScheme getScheme() {
                return new get_show_ads_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_show_ads_resultTupleScheme extends TupleScheme<get_show_ads_result> {
            private get_show_ads_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_show_ads_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 8, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        struct.success.add(Integer.valueOf(tTupleProtocol.readI32()));
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    BESystemException bESystemException = new BESystemException();
                    struct.sysException = bESystemException;
                    bESystemException.read(tTupleProtocol);
                    struct.setSysExceptionIsSet(true);
                }
                if (readBitSet.get(2)) {
                    BELogicException bELogicException = new BELogicException();
                    struct.logicException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogicExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_show_ads_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetSysException()) {
                    bitSet.set(1);
                }
                if (struct.isSetLogicException()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    Iterator<Integer> it = struct.success.iterator();
                    while (it.hasNext()) {
                        tTupleProtocol.writeI32(it.next().intValue());
                    }
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogicException()) {
                    struct.logicException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_show_ads_resultTupleSchemeFactory implements SchemeFactory {
            private get_show_ads_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_show_ads_resultTupleScheme getScheme() {
                return new get_show_ads_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_show_ads_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_show_ads_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_show_ads_result.class, unmodifiableMap);
        }

        public get_show_ads_result() {
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

        public void addToSuccess(int elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(Integer.valueOf(elem));
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.sysException = null;
            this.logicException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_show_ads_result)) {
                return equals((get_show_ads_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
        }

        public List<Integer> getSuccess() {
            return this.success;
        }

        public Iterator<Integer> getSuccessIterator() {
            List<Integer> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<Integer> list = this.success;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public BESystemException getSysException() {
            return this.sysException;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetLogicException() {
            return this.logicException != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_show_ads_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public get_show_ads_result setSuccess(List<Integer> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public get_show_ads_result setSysException(BESystemException sysException) {
            this.sysException = sysException;
            return this;
        }

        public void setSysExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.sysException = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_show_ads_result(");
            sb2.append("success:");
            List<Integer> list = this.success;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j2.O);
            sb2.append("sysException:");
            BESystemException bESystemException = this.sysException;
            if (bESystemException == null) {
                sb2.append("null");
            } else {
                sb2.append(bESystemException);
            }
            sb2.append(j2.O);
            sb2.append("logicException:");
            BELogicException bELogicException = this.logicException;
            if (bELogicException == null) {
                sb2.append("null");
            } else {
                sb2.append(bELogicException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetLogicException() {
            this.logicException = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_show_ads_result(List<Integer> success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            this.sysException = sysException;
            this.logicException = logicException;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_show_ads_result other) {
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
            int compareTo5 = Boolean.valueOf(isSetSysException()).compareTo(Boolean.valueOf(other.isSetSysException()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetSysException() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.sysException, (Comparable) other.sysException)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetLogicException()).compareTo(Boolean.valueOf(other.isSetLogicException()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetLogicException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logicException, (Comparable) other.logicException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_show_ads_result, _Fields> deepCopy2() {
            return new get_show_ads_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_show_ads_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getSysException();
            }
            if (i11 == 3) {
                return getLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_show_ads_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetSysException();
            }
            if (i11 == 3) {
                return isSetLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_show_ads_result$_Fields[field.ordinal()];
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
                    unsetSysException();
                    return;
                } else {
                    setSysException((BESystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetLogicException();
            } else {
                setLogicException((BELogicException) value);
            }
        }

        public boolean equals(get_show_ads_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if ((isSetSysException || isSetSysException2) && !(isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException))) {
                return false;
            }
            boolean isSetLogicException = isSetLogicException();
            boolean isSetLogicException2 = that.isSetLogicException();
            if (isSetLogicException || isSetLogicException2) {
                return isSetLogicException && isSetLogicException2 && this.logicException.equals(that.logicException);
            }
            return true;
        }

        public get_show_ads_result(get_show_ads_result other) {
            if (other.isSetSuccess()) {
                this.success = new ArrayList(other.success);
            }
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
            if (other.isSetLogicException()) {
                this.logicException = new BELogicException(other.logicException);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_user_word_media_record_args implements TBase<get_user_word_media_record_args, _Fields>, Serializable, Cloneable, Comparable<get_user_word_media_record_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_user_word_media_record_args");
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
        public static class get_user_word_media_record_argsStandardScheme extends StandardScheme<get_user_word_media_record_args> {
            private get_user_word_media_record_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_user_word_media_record_args struct) throws TException {
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
            public void write(TProtocol oprot, get_user_word_media_record_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_user_word_media_record_args.STRUCT_DESC);
                oprot.writeFieldBegin(get_user_word_media_record_args.WORD_LEVEL_ID_FIELD_DESC);
                oprot.writeI32(struct.word_level_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_word_media_record_argsStandardSchemeFactory implements SchemeFactory {
            private get_user_word_media_record_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_word_media_record_argsStandardScheme getScheme() {
                return new get_user_word_media_record_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_word_media_record_argsTupleScheme extends TupleScheme<get_user_word_media_record_args> {
            private get_user_word_media_record_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_user_word_media_record_args struct) throws TException {
                struct.word_level_id = ((TTupleProtocol) prot).readI32();
                struct.setWord_level_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_user_word_media_record_args struct) throws TException {
                ((TTupleProtocol) prot).writeI32(struct.word_level_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_word_media_record_argsTupleSchemeFactory implements SchemeFactory {
            private get_user_word_media_record_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_word_media_record_argsTupleScheme getScheme() {
                return new get_user_word_media_record_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_user_word_media_record_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_user_word_media_record_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.WORD_LEVEL_ID, (_Fields) new FieldMetaData(ma.b.f72894c, (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_user_word_media_record_args.class, unmodifiableMap);
        }

        public get_user_word_media_record_args() {
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
            if (that != null && (that instanceof get_user_word_media_record_args)) {
                return equals((get_user_word_media_record_args) that);
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

        public get_user_word_media_record_args setWord_level_id(int word_level_id) {
            this.word_level_id = word_level_id;
            setWord_level_idIsSet(true);
            return this;
        }

        public void setWord_level_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "get_user_word_media_record_args(word_level_id:" + this.word_level_id + j.f81007d;
        }

        public void unsetWord_level_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_user_word_media_record_args other) {
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
        public TBase<get_user_word_media_record_args, _Fields> deepCopy2() {
            return new get_user_word_media_record_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_user_word_media_record_args$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getWord_level_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_user_word_media_record_args$_Fields[field.ordinal()] == 1) {
                return isSetWord_level_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_user_word_media_record_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetWord_level_id();
            } else {
                setWord_level_id(((Integer) value).intValue());
            }
        }

        public get_user_word_media_record_args(int word_level_id) {
            this();
            this.word_level_id = word_level_id;
            setWord_level_idIsSet(true);
        }

        public boolean equals(get_user_word_media_record_args that) {
            return that != null && this.word_level_id == that.word_level_id;
        }

        public get_user_word_media_record_args(get_user_word_media_record_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.word_level_id = other.word_level_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_user_word_media_record_result implements TBase<get_user_word_media_record_result, _Fields>, Serializable, Cloneable, Comparable<get_user_word_media_record_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logicException;
        public List<BBUserWordMedia> success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("get_user_word_media_record_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOGIC_EXCEPTION_FIELD_DESC = new TField("logicException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            SYS_EXCEPTION(1, "sysException"),
            LOGIC_EXCEPTION(2, "logicException");

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
                    return SYS_EXCEPTION;
                }
                if (fieldId != 2) {
                    return null;
                }
                return LOGIC_EXCEPTION;
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
        public static class get_user_word_media_record_resultStandardScheme extends StandardScheme<get_user_word_media_record_result> {
            private get_user_word_media_record_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_user_word_media_record_result struct) throws TException {
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
                                BELogicException bELogicException = new BELogicException();
                                struct.logicException = bELogicException;
                                bELogicException.read(iprot);
                                struct.setLogicExceptionIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            BESystemException bESystemException = new BESystemException();
                            struct.sysException = bESystemException;
                            bESystemException.read(iprot);
                            struct.setSysExceptionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.success = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            BBUserWordMedia bBUserWordMedia = new BBUserWordMedia();
                            bBUserWordMedia.read(iprot);
                            struct.success.add(bBUserWordMedia);
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
            public void write(TProtocol oprot, get_user_word_media_record_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_user_word_media_record_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_user_word_media_record_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<BBUserWordMedia> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(get_user_word_media_record_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(get_user_word_media_record_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_word_media_record_resultStandardSchemeFactory implements SchemeFactory {
            private get_user_word_media_record_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_word_media_record_resultStandardScheme getScheme() {
                return new get_user_word_media_record_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_word_media_record_resultTupleScheme extends TupleScheme<get_user_word_media_record_result> {
            private get_user_word_media_record_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_user_word_media_record_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        BBUserWordMedia bBUserWordMedia = new BBUserWordMedia();
                        bBUserWordMedia.read(tTupleProtocol);
                        struct.success.add(bBUserWordMedia);
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    BESystemException bESystemException = new BESystemException();
                    struct.sysException = bESystemException;
                    bESystemException.read(tTupleProtocol);
                    struct.setSysExceptionIsSet(true);
                }
                if (readBitSet.get(2)) {
                    BELogicException bELogicException = new BELogicException();
                    struct.logicException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogicExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_user_word_media_record_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetSysException()) {
                    bitSet.set(1);
                }
                if (struct.isSetLogicException()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    Iterator<BBUserWordMedia> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(tTupleProtocol);
                    }
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogicException()) {
                    struct.logicException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_word_media_record_resultTupleSchemeFactory implements SchemeFactory {
            private get_user_word_media_record_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_word_media_record_resultTupleScheme getScheme() {
                return new get_user_word_media_record_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_user_word_media_record_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_user_word_media_record_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BBUserWordMedia.class))));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_user_word_media_record_result.class, unmodifiableMap);
        }

        public get_user_word_media_record_result() {
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

        public void addToSuccess(BBUserWordMedia elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.sysException = null;
            this.logicException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_user_word_media_record_result)) {
                return equals((get_user_word_media_record_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
        }

        public List<BBUserWordMedia> getSuccess() {
            return this.success;
        }

        public Iterator<BBUserWordMedia> getSuccessIterator() {
            List<BBUserWordMedia> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<BBUserWordMedia> list = this.success;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public BESystemException getSysException() {
            return this.sysException;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetLogicException() {
            return this.logicException != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_user_word_media_record_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public get_user_word_media_record_result setSuccess(List<BBUserWordMedia> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public get_user_word_media_record_result setSysException(BESystemException sysException) {
            this.sysException = sysException;
            return this;
        }

        public void setSysExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.sysException = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_user_word_media_record_result(");
            sb2.append("success:");
            List<BBUserWordMedia> list = this.success;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j2.O);
            sb2.append("sysException:");
            BESystemException bESystemException = this.sysException;
            if (bESystemException == null) {
                sb2.append("null");
            } else {
                sb2.append(bESystemException);
            }
            sb2.append(j2.O);
            sb2.append("logicException:");
            BELogicException bELogicException = this.logicException;
            if (bELogicException == null) {
                sb2.append("null");
            } else {
                sb2.append(bELogicException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetLogicException() {
            this.logicException = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_user_word_media_record_result(List<BBUserWordMedia> success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            this.sysException = sysException;
            this.logicException = logicException;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_user_word_media_record_result other) {
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
            int compareTo5 = Boolean.valueOf(isSetSysException()).compareTo(Boolean.valueOf(other.isSetSysException()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetSysException() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.sysException, (Comparable) other.sysException)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetLogicException()).compareTo(Boolean.valueOf(other.isSetLogicException()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetLogicException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logicException, (Comparable) other.logicException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_user_word_media_record_result, _Fields> deepCopy2() {
            return new get_user_word_media_record_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_user_word_media_record_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getSysException();
            }
            if (i11 == 3) {
                return getLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_user_word_media_record_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetSysException();
            }
            if (i11 == 3) {
                return isSetLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_user_word_media_record_result$_Fields[field.ordinal()];
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
                    unsetSysException();
                    return;
                } else {
                    setSysException((BESystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetLogicException();
            } else {
                setLogicException((BELogicException) value);
            }
        }

        public boolean equals(get_user_word_media_record_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if ((isSetSysException || isSetSysException2) && !(isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException))) {
                return false;
            }
            boolean isSetLogicException = isSetLogicException();
            boolean isSetLogicException2 = that.isSetLogicException();
            if (isSetLogicException || isSetLogicException2) {
                return isSetLogicException && isSetLogicException2 && this.logicException.equals(that.logicException);
            }
            return true;
        }

        public get_user_word_media_record_result(get_user_word_media_record_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<BBUserWordMedia> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BBUserWordMedia(it.next()));
                }
                this.success = arrayList;
            }
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
            if (other.isSetLogicException()) {
                this.logicException = new BELogicException(other.logicException);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_word_friends_info_args implements TBase<get_word_friends_info_args, _Fields>, Serializable, Cloneable, Comparable<get_word_friends_info_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_word_friends_info_args");
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
        public static class get_word_friends_info_argsStandardScheme extends StandardScheme<get_word_friends_info_args> {
            private get_word_friends_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_word_friends_info_args struct) throws TException {
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
            public void write(TProtocol oprot, get_word_friends_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_word_friends_info_args.STRUCT_DESC);
                oprot.writeFieldBegin(get_word_friends_info_args.WORD_LEVEL_ID_FIELD_DESC);
                oprot.writeI32(struct.word_level_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_friends_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_word_friends_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_friends_info_argsStandardScheme getScheme() {
                return new get_word_friends_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_friends_info_argsTupleScheme extends TupleScheme<get_word_friends_info_args> {
            private get_word_friends_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_word_friends_info_args struct) throws TException {
                struct.word_level_id = ((TTupleProtocol) prot).readI32();
                struct.setWord_level_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_word_friends_info_args struct) throws TException {
                ((TTupleProtocol) prot).writeI32(struct.word_level_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_friends_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_word_friends_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_friends_info_argsTupleScheme getScheme() {
                return new get_word_friends_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_word_friends_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_word_friends_info_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.WORD_LEVEL_ID, (_Fields) new FieldMetaData(ma.b.f72894c, (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_word_friends_info_args.class, unmodifiableMap);
        }

        public get_word_friends_info_args() {
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
            if (that != null && (that instanceof get_word_friends_info_args)) {
                return equals((get_word_friends_info_args) that);
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

        public get_word_friends_info_args setWord_level_id(int word_level_id) {
            this.word_level_id = word_level_id;
            setWord_level_idIsSet(true);
            return this;
        }

        public void setWord_level_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "get_word_friends_info_args(word_level_id:" + this.word_level_id + j.f81007d;
        }

        public void unsetWord_level_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_word_friends_info_args other) {
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
        public TBase<get_word_friends_info_args, _Fields> deepCopy2() {
            return new get_word_friends_info_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_word_friends_info_args$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getWord_level_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_word_friends_info_args$_Fields[field.ordinal()] == 1) {
                return isSetWord_level_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_word_friends_info_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetWord_level_id();
            } else {
                setWord_level_id(((Integer) value).intValue());
            }
        }

        public get_word_friends_info_args(int word_level_id) {
            this();
            this.word_level_id = word_level_id;
            setWord_level_idIsSet(true);
        }

        public boolean equals(get_word_friends_info_args that) {
            return that != null && this.word_level_id == that.word_level_id;
        }

        public get_word_friends_info_args(get_word_friends_info_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.word_level_id = other.word_level_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_word_friends_info_result implements TBase<get_word_friends_info_result, _Fields>, Serializable, Cloneable, Comparable<get_word_friends_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logicException;
        public String success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("get_word_friends_info_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 11, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOGIC_EXCEPTION_FIELD_DESC = new TField("logicException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            SYS_EXCEPTION(1, "sysException"),
            LOGIC_EXCEPTION(2, "logicException");

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
                    return SYS_EXCEPTION;
                }
                if (fieldId != 2) {
                    return null;
                }
                return LOGIC_EXCEPTION;
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
        public static class get_word_friends_info_resultStandardScheme extends StandardScheme<get_word_friends_info_result> {
            private get_word_friends_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_word_friends_info_result struct) throws TException {
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
                                BELogicException bELogicException = new BELogicException();
                                struct.logicException = bELogicException;
                                bELogicException.read(iprot);
                                struct.setLogicExceptionIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            BESystemException bESystemException = new BESystemException();
                            struct.sysException = bESystemException;
                            bESystemException.read(iprot);
                            struct.setSysExceptionIsSet(true);
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
            public void write(TProtocol oprot, get_word_friends_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_word_friends_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_word_friends_info_result.SUCCESS_FIELD_DESC);
                    oprot.writeString(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(get_word_friends_info_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(get_word_friends_info_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_friends_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_word_friends_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_friends_info_resultStandardScheme getScheme() {
                return new get_word_friends_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_friends_info_resultTupleScheme extends TupleScheme<get_word_friends_info_result> {
            private get_word_friends_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_word_friends_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    struct.success = tTupleProtocol.readString();
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    BESystemException bESystemException = new BESystemException();
                    struct.sysException = bESystemException;
                    bESystemException.read(tTupleProtocol);
                    struct.setSysExceptionIsSet(true);
                }
                if (readBitSet.get(2)) {
                    BELogicException bELogicException = new BELogicException();
                    struct.logicException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogicExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_word_friends_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetSysException()) {
                    bitSet.set(1);
                }
                if (struct.isSetLogicException()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeString(struct.success);
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogicException()) {
                    struct.logicException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_word_friends_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_word_friends_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_word_friends_info_resultTupleScheme getScheme() {
                return new get_word_friends_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_word_friends_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_word_friends_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 11)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_word_friends_info_result.class, unmodifiableMap);
        }

        public get_word_friends_info_result() {
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
            this.sysException = null;
            this.logicException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_word_friends_info_result)) {
                return equals((get_word_friends_info_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
        }

        public String getSuccess() {
            return this.success;
        }

        public BESystemException getSysException() {
            return this.sysException;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetLogicException() {
            return this.logicException != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_word_friends_info_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public get_word_friends_info_result setSuccess(String success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public get_word_friends_info_result setSysException(BESystemException sysException) {
            this.sysException = sysException;
            return this;
        }

        public void setSysExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.sysException = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_word_friends_info_result(");
            sb2.append("success:");
            String str = this.success;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j2.O);
            sb2.append("sysException:");
            BESystemException bESystemException = this.sysException;
            if (bESystemException == null) {
                sb2.append("null");
            } else {
                sb2.append(bESystemException);
            }
            sb2.append(j2.O);
            sb2.append("logicException:");
            BELogicException bELogicException = this.logicException;
            if (bELogicException == null) {
                sb2.append("null");
            } else {
                sb2.append(bELogicException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetLogicException() {
            this.logicException = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_word_friends_info_result(String success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            this.sysException = sysException;
            this.logicException = logicException;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_word_friends_info_result other) {
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
            int compareTo5 = Boolean.valueOf(isSetSysException()).compareTo(Boolean.valueOf(other.isSetSysException()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetSysException() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.sysException, (Comparable) other.sysException)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetLogicException()).compareTo(Boolean.valueOf(other.isSetLogicException()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetLogicException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logicException, (Comparable) other.logicException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_word_friends_info_result, _Fields> deepCopy2() {
            return new get_word_friends_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_word_friends_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getSysException();
            }
            if (i11 == 3) {
                return getLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_word_friends_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetSysException();
            }
            if (i11 == 3) {
                return isSetLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$get_word_friends_info_result$_Fields[field.ordinal()];
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
                    unsetSysException();
                    return;
                } else {
                    setSysException((BESystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetLogicException();
            } else {
                setLogicException((BELogicException) value);
            }
        }

        public boolean equals(get_word_friends_info_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if ((isSetSysException || isSetSysException2) && !(isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException))) {
                return false;
            }
            boolean isSetLogicException = isSetLogicException();
            boolean isSetLogicException2 = that.isSetLogicException();
            if (isSetLogicException || isSetLogicException2) {
                return isSetLogicException && isSetLogicException2 && this.logicException.equals(that.logicException);
            }
            return true;
        }

        public get_word_friends_info_result(get_word_friends_info_result other) {
            if (other.isSetSuccess()) {
                this.success = other.success;
            }
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
            if (other.isSetLogicException()) {
                this.logicException = new BELogicException(other.logicException);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class qrcode_scan_args implements TBase<qrcode_scan_args, _Fields>, Serializable, Cloneable, Comparable<qrcode_scan_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public String qrcode;
        private static final TStruct STRUCT_DESC = new TStruct("qrcode_scan_args");
        private static final TField QRCODE_FIELD_DESC = new TField("qrcode", (byte) 11, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            QRCODE(1, "qrcode");

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
                return QRCODE;
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
        public static class qrcode_scan_argsStandardScheme extends StandardScheme<qrcode_scan_args> {
            private qrcode_scan_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, qrcode_scan_args struct) throws TException {
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
                        struct.qrcode = iprot.readString();
                        struct.setQrcodeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, qrcode_scan_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(qrcode_scan_args.STRUCT_DESC);
                if (struct.qrcode != null) {
                    oprot.writeFieldBegin(qrcode_scan_args.QRCODE_FIELD_DESC);
                    oprot.writeString(struct.qrcode);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan_argsStandardSchemeFactory implements SchemeFactory {
            private qrcode_scan_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public qrcode_scan_argsStandardScheme getScheme() {
                return new qrcode_scan_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan_argsTupleScheme extends TupleScheme<qrcode_scan_args> {
            private qrcode_scan_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, qrcode_scan_args struct) throws TException {
                struct.qrcode = ((TTupleProtocol) prot).readString();
                struct.setQrcodeIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, qrcode_scan_args struct) throws TException {
                ((TTupleProtocol) prot).writeString(struct.qrcode);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan_argsTupleSchemeFactory implements SchemeFactory {
            private qrcode_scan_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public qrcode_scan_argsTupleScheme getScheme() {
                return new qrcode_scan_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new qrcode_scan_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new qrcode_scan_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.QRCODE, (_Fields) new FieldMetaData("qrcode", (byte) 1, new FieldValueMetaData((byte) 11)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(qrcode_scan_args.class, unmodifiableMap);
        }

        public qrcode_scan_args() {
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
            this.qrcode = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof qrcode_scan_args)) {
                return equals((qrcode_scan_args) that);
            }
            return false;
        }

        public String getQrcode() {
            return this.qrcode;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetQrcode() {
            return this.qrcode != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public qrcode_scan_args setQrcode(String qrcode) {
            this.qrcode = qrcode;
            return this;
        }

        public void setQrcodeIsSet(boolean value) {
            if (value) {
                return;
            }
            this.qrcode = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("qrcode_scan_args(");
            sb2.append("qrcode:");
            String str = this.qrcode;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetQrcode() {
            this.qrcode = null;
        }

        public void validate() throws TException {
            if (this.qrcode != null) {
                return;
            }
            throw new TProtocolException("Required field 'qrcode' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public qrcode_scan_args(String qrcode) {
            this();
            this.qrcode = qrcode;
        }

        @Override // java.lang.Comparable
        public int compareTo(qrcode_scan_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetQrcode()).compareTo(Boolean.valueOf(other.isSetQrcode()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetQrcode() || (compareTo = TBaseHelper.compareTo(this.qrcode, other.qrcode)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<qrcode_scan_args, _Fields> deepCopy2() {
            return new qrcode_scan_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$qrcode_scan_args$_Fields[field.ordinal()] == 1) {
                return getQrcode();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$qrcode_scan_args$_Fields[field.ordinal()] == 1) {
                return isSetQrcode();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$qrcode_scan_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetQrcode();
            } else {
                setQrcode((String) value);
            }
        }

        public boolean equals(qrcode_scan_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetQrcode = isSetQrcode();
            boolean isSetQrcode2 = that.isSetQrcode();
            if (isSetQrcode || isSetQrcode2) {
                return isSetQrcode && isSetQrcode2 && this.qrcode.equals(that.qrcode);
            }
            return true;
        }

        public qrcode_scan_args(qrcode_scan_args other) {
            if (other.isSetQrcode()) {
                this.qrcode = other.qrcode;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class qrcode_scan_result implements TBase<qrcode_scan_result, _Fields>, Serializable, Cloneable, Comparable<qrcode_scan_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logicException;
        public BBQRCodeResp success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("qrcode_scan_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOGIC_EXCEPTION_FIELD_DESC = new TField("logicException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            SYS_EXCEPTION(1, "sysException"),
            LOGIC_EXCEPTION(2, "logicException");

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
                    return SYS_EXCEPTION;
                }
                if (fieldId != 2) {
                    return null;
                }
                return LOGIC_EXCEPTION;
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
        public static class qrcode_scan_resultStandardScheme extends StandardScheme<qrcode_scan_result> {
            private qrcode_scan_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, qrcode_scan_result struct) throws TException {
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
                                BELogicException bELogicException = new BELogicException();
                                struct.logicException = bELogicException;
                                bELogicException.read(iprot);
                                struct.setLogicExceptionIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            BESystemException bESystemException = new BESystemException();
                            struct.sysException = bESystemException;
                            bESystemException.read(iprot);
                            struct.setSysExceptionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        BBQRCodeResp bBQRCodeResp = new BBQRCodeResp();
                        struct.success = bBQRCodeResp;
                        bBQRCodeResp.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, qrcode_scan_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(qrcode_scan_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(qrcode_scan_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(qrcode_scan_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(qrcode_scan_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan_resultStandardSchemeFactory implements SchemeFactory {
            private qrcode_scan_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public qrcode_scan_resultStandardScheme getScheme() {
                return new qrcode_scan_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan_resultTupleScheme extends TupleScheme<qrcode_scan_result> {
            private qrcode_scan_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, qrcode_scan_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    BBQRCodeResp bBQRCodeResp = new BBQRCodeResp();
                    struct.success = bBQRCodeResp;
                    bBQRCodeResp.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    BESystemException bESystemException = new BESystemException();
                    struct.sysException = bESystemException;
                    bESystemException.read(tTupleProtocol);
                    struct.setSysExceptionIsSet(true);
                }
                if (readBitSet.get(2)) {
                    BELogicException bELogicException = new BELogicException();
                    struct.logicException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogicExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, qrcode_scan_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetSysException()) {
                    bitSet.set(1);
                }
                if (struct.isSetLogicException()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogicException()) {
                    struct.logicException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan_resultTupleSchemeFactory implements SchemeFactory {
            private qrcode_scan_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public qrcode_scan_resultTupleScheme getScheme() {
                return new qrcode_scan_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new qrcode_scan_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new qrcode_scan_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, BBQRCodeResp.class)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(qrcode_scan_result.class, unmodifiableMap);
        }

        public qrcode_scan_result() {
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
            this.sysException = null;
            this.logicException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof qrcode_scan_result)) {
                return equals((qrcode_scan_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
        }

        public BBQRCodeResp getSuccess() {
            return this.success;
        }

        public BESystemException getSysException() {
            return this.sysException;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetLogicException() {
            return this.logicException != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public qrcode_scan_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public qrcode_scan_result setSuccess(BBQRCodeResp success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public qrcode_scan_result setSysException(BESystemException sysException) {
            this.sysException = sysException;
            return this;
        }

        public void setSysExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.sysException = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("qrcode_scan_result(");
            sb2.append("success:");
            BBQRCodeResp bBQRCodeResp = this.success;
            if (bBQRCodeResp == null) {
                sb2.append("null");
            } else {
                sb2.append(bBQRCodeResp);
            }
            sb2.append(j2.O);
            sb2.append("sysException:");
            BESystemException bESystemException = this.sysException;
            if (bESystemException == null) {
                sb2.append("null");
            } else {
                sb2.append(bESystemException);
            }
            sb2.append(j2.O);
            sb2.append("logicException:");
            BELogicException bELogicException = this.logicException;
            if (bELogicException == null) {
                sb2.append("null");
            } else {
                sb2.append(bELogicException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetLogicException() {
            this.logicException = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        public void validate() throws TException {
            BBQRCodeResp bBQRCodeResp = this.success;
            if (bBQRCodeResp != null) {
                bBQRCodeResp.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public qrcode_scan_result(BBQRCodeResp success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            this.sysException = sysException;
            this.logicException = logicException;
        }

        @Override // java.lang.Comparable
        public int compareTo(qrcode_scan_result other) {
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
            int compareTo5 = Boolean.valueOf(isSetSysException()).compareTo(Boolean.valueOf(other.isSetSysException()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetSysException() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.sysException, (Comparable) other.sysException)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetLogicException()).compareTo(Boolean.valueOf(other.isSetLogicException()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetLogicException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logicException, (Comparable) other.logicException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<qrcode_scan_result, _Fields> deepCopy2() {
            return new qrcode_scan_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$qrcode_scan_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getSysException();
            }
            if (i11 == 3) {
                return getLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$qrcode_scan_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetSysException();
            }
            if (i11 == 3) {
                return isSetLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$qrcode_scan_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((BBQRCodeResp) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetSysException();
                    return;
                } else {
                    setSysException((BESystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetLogicException();
            } else {
                setLogicException((BELogicException) value);
            }
        }

        public boolean equals(qrcode_scan_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if ((isSetSysException || isSetSysException2) && !(isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException))) {
                return false;
            }
            boolean isSetLogicException = isSetLogicException();
            boolean isSetLogicException2 = that.isSetLogicException();
            if (isSetLogicException || isSetLogicException2) {
                return isSetLogicException && isSetLogicException2 && this.logicException.equals(that.logicException);
            }
            return true;
        }

        public qrcode_scan_result(qrcode_scan_result other) {
            if (other.isSetSuccess()) {
                this.success = new BBQRCodeResp(other.success);
            }
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
            if (other.isSetLogicException()) {
                this.logicException = new BELogicException(other.logicException);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class redo_word_friend_args implements TBase<redo_word_friend_args, _Fields>, Serializable, Cloneable, Comparable<redo_word_friend_args> {
        private static final TStruct STRUCT_DESC = new TStruct("redo_word_friend_args");
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ;

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
                return null;
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
        public static class redo_word_friend_argsStandardScheme extends StandardScheme<redo_word_friend_args> {
            private redo_word_friend_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, redo_word_friend_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    byte b11 = iprot.readFieldBegin().type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                        iprot.readFieldEnd();
                    }
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, redo_word_friend_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(redo_word_friend_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class redo_word_friend_argsStandardSchemeFactory implements SchemeFactory {
            private redo_word_friend_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public redo_word_friend_argsStandardScheme getScheme() {
                return new redo_word_friend_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class redo_word_friend_argsTupleScheme extends TupleScheme<redo_word_friend_args> {
            private redo_word_friend_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, redo_word_friend_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, redo_word_friend_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class redo_word_friend_argsTupleSchemeFactory implements SchemeFactory {
            private redo_word_friend_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public redo_word_friend_argsTupleScheme getScheme() {
                return new redo_word_friend_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new redo_word_friend_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new redo_word_friend_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(redo_word_friend_args.class, unmodifiableMap);
        }

        public redo_word_friend_args() {
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

        public boolean equals(redo_word_friend_args that) {
            return that != null;
        }

        public int hashCode() {
            return 0;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public String toString() {
            return "redo_word_friend_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public redo_word_friend_args(redo_word_friend_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(redo_word_friend_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<redo_word_friend_args, _Fields> deepCopy2() {
            return new redo_word_friend_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof redo_word_friend_args)) {
                return equals((redo_word_friend_args) that);
            }
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$redo_word_friend_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$redo_word_friend_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$redo_word_friend_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class redo_word_friend_result implements TBase<redo_word_friend_result, _Fields>, Serializable, Cloneable, Comparable<redo_word_friend_result> {
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public BELogicException logicException;
        public int success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("redo_word_friend_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 8, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOGIC_EXCEPTION_FIELD_DESC = new TField("logicException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            SYS_EXCEPTION(1, "sysException"),
            LOGIC_EXCEPTION(2, "logicException");

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
                    return SYS_EXCEPTION;
                }
                if (fieldId != 2) {
                    return null;
                }
                return LOGIC_EXCEPTION;
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
        public static class redo_word_friend_resultStandardScheme extends StandardScheme<redo_word_friend_result> {
            private redo_word_friend_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, redo_word_friend_result struct) throws TException {
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
                                BELogicException bELogicException = new BELogicException();
                                struct.logicException = bELogicException;
                                bELogicException.read(iprot);
                                struct.setLogicExceptionIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            BESystemException bESystemException = new BESystemException();
                            struct.sysException = bESystemException;
                            bESystemException.read(iprot);
                            struct.setSysExceptionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.success = iprot.readI32();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, redo_word_friend_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(redo_word_friend_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(redo_word_friend_result.SUCCESS_FIELD_DESC);
                    oprot.writeI32(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(redo_word_friend_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(redo_word_friend_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class redo_word_friend_resultStandardSchemeFactory implements SchemeFactory {
            private redo_word_friend_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public redo_word_friend_resultStandardScheme getScheme() {
                return new redo_word_friend_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class redo_word_friend_resultTupleScheme extends TupleScheme<redo_word_friend_result> {
            private redo_word_friend_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, redo_word_friend_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    struct.success = tTupleProtocol.readI32();
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    BESystemException bESystemException = new BESystemException();
                    struct.sysException = bESystemException;
                    bESystemException.read(tTupleProtocol);
                    struct.setSysExceptionIsSet(true);
                }
                if (readBitSet.get(2)) {
                    BELogicException bELogicException = new BELogicException();
                    struct.logicException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogicExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, redo_word_friend_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetSysException()) {
                    bitSet.set(1);
                }
                if (struct.isSetLogicException()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success);
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogicException()) {
                    struct.logicException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class redo_word_friend_resultTupleSchemeFactory implements SchemeFactory {
            private redo_word_friend_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public redo_word_friend_resultTupleScheme getScheme() {
                return new redo_word_friend_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new redo_word_friend_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new redo_word_friend_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(redo_word_friend_result.class, unmodifiableMap);
        }

        public redo_word_friend_result() {
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
            setSuccessIsSet(false);
            this.success = 0;
            this.sysException = null;
            this.logicException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof redo_word_friend_result)) {
                return equals((redo_word_friend_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
        }

        public int getSuccess() {
            return this.success;
        }

        public BESystemException getSysException() {
            return this.sysException;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetLogicException() {
            return this.logicException != null;
        }

        public boolean isSetSuccess() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public redo_word_friend_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public redo_word_friend_result setSuccess(int success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public redo_word_friend_result setSysException(BESystemException sysException) {
            this.sysException = sysException;
            return this;
        }

        public void setSysExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.sysException = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("redo_word_friend_result(");
            sb2.append("success:");
            sb2.append(this.success);
            sb2.append(j2.O);
            sb2.append("sysException:");
            BESystemException bESystemException = this.sysException;
            if (bESystemException == null) {
                sb2.append("null");
            } else {
                sb2.append(bESystemException);
            }
            sb2.append(j2.O);
            sb2.append("logicException:");
            BELogicException bELogicException = this.logicException;
            if (bELogicException == null) {
                sb2.append("null");
            } else {
                sb2.append(bELogicException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetLogicException() {
            this.logicException = null;
        }

        public void unsetSuccess() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(redo_word_friend_result other) {
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
            int compareTo5 = Boolean.valueOf(isSetSysException()).compareTo(Boolean.valueOf(other.isSetSysException()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetSysException() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.sysException, (Comparable) other.sysException)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetLogicException()).compareTo(Boolean.valueOf(other.isSetLogicException()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetLogicException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logicException, (Comparable) other.logicException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<redo_word_friend_result, _Fields> deepCopy2() {
            return new redo_word_friend_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$redo_word_friend_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getSuccess());
            }
            if (i11 == 2) {
                return getSysException();
            }
            if (i11 == 3) {
                return getLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$redo_word_friend_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetSysException();
            }
            if (i11 == 3) {
                return isSetLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$redo_word_friend_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetSysException();
                    return;
                } else {
                    setSysException((BESystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetLogicException();
            } else {
                setLogicException((BELogicException) value);
            }
        }

        public redo_word_friend_result(int success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.sysException = sysException;
            this.logicException = logicException;
        }

        public boolean equals(redo_word_friend_result that) {
            if (that == null || this.success != that.success) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if ((isSetSysException || isSetSysException2) && !(isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException))) {
                return false;
            }
            boolean isSetLogicException = isSetLogicException();
            boolean isSetLogicException2 = that.isSetLogicException();
            if (isSetLogicException || isSetLogicException2) {
                return isSetLogicException && isSetLogicException2 && this.logicException.equals(that.logicException);
            }
            return true;
        }

        public redo_word_friend_result(redo_word_friend_result other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.success = other.success;
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
            if (other.isSetLogicException()) {
                this.logicException = new BELogicException(other.logicException);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class save_word_friend_done_record_args implements TBase<save_word_friend_done_record_args, _Fields>, Serializable, Cloneable, Comparable<save_word_friend_done_record_args> {
        private static final int __WORD_LEVEL_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public List<Integer> done_topic_ids;
        public int word_level_id;
        private static final TStruct STRUCT_DESC = new TStruct("save_word_friend_done_record_args");
        private static final TField WORD_LEVEL_ID_FIELD_DESC = new TField(ma.b.f72894c, (byte) 8, 1);
        private static final TField DONE_TOPIC_IDS_FIELD_DESC = new TField("done_topic_ids", (byte) 15, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            WORD_LEVEL_ID(1, ma.b.f72894c),
            DONE_TOPIC_IDS(2, "done_topic_ids");

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
                    return WORD_LEVEL_ID;
                }
                if (fieldId != 2) {
                    return null;
                }
                return DONE_TOPIC_IDS;
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
        public static class save_word_friend_done_record_argsStandardScheme extends StandardScheme<save_word_friend_done_record_args> {
            private save_word_friend_done_record_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, save_word_friend_done_record_args struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.done_topic_ids = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                struct.done_topic_ids.add(Integer.valueOf(iprot.readI32()));
                            }
                            iprot.readListEnd();
                            struct.setDone_topic_idsIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
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
            public void write(TProtocol oprot, save_word_friend_done_record_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(save_word_friend_done_record_args.STRUCT_DESC);
                oprot.writeFieldBegin(save_word_friend_done_record_args.WORD_LEVEL_ID_FIELD_DESC);
                oprot.writeI32(struct.word_level_id);
                oprot.writeFieldEnd();
                if (struct.done_topic_ids != null) {
                    oprot.writeFieldBegin(save_word_friend_done_record_args.DONE_TOPIC_IDS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 8, struct.done_topic_ids.size()));
                    Iterator<Integer> it = struct.done_topic_ids.iterator();
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
        public static class save_word_friend_done_record_argsStandardSchemeFactory implements SchemeFactory {
            private save_word_friend_done_record_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public save_word_friend_done_record_argsStandardScheme getScheme() {
                return new save_word_friend_done_record_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_word_friend_done_record_argsTupleScheme extends TupleScheme<save_word_friend_done_record_args> {
            private save_word_friend_done_record_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, save_word_friend_done_record_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.word_level_id = tTupleProtocol.readI32();
                struct.setWord_level_idIsSet(true);
                TList tList = new TList((byte) 8, tTupleProtocol.readI32());
                struct.done_topic_ids = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    struct.done_topic_ids.add(Integer.valueOf(tTupleProtocol.readI32()));
                }
                struct.setDone_topic_idsIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, save_word_friend_done_record_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.word_level_id);
                tTupleProtocol.writeI32(struct.done_topic_ids.size());
                Iterator<Integer> it = struct.done_topic_ids.iterator();
                while (it.hasNext()) {
                    tTupleProtocol.writeI32(it.next().intValue());
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_word_friend_done_record_argsTupleSchemeFactory implements SchemeFactory {
            private save_word_friend_done_record_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public save_word_friend_done_record_argsTupleScheme getScheme() {
                return new save_word_friend_done_record_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new save_word_friend_done_record_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new save_word_friend_done_record_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.WORD_LEVEL_ID, (_Fields) new FieldMetaData(ma.b.f72894c, (byte) 1, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.DONE_TOPIC_IDS, (_Fields) new FieldMetaData("done_topic_ids", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(save_word_friend_done_record_args.class, unmodifiableMap);
        }

        public save_word_friend_done_record_args() {
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

        public void addToDone_topic_ids(int elem) {
            if (this.done_topic_ids == null) {
                this.done_topic_ids = new ArrayList();
            }
            this.done_topic_ids.add(Integer.valueOf(elem));
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            setWord_level_idIsSet(false);
            this.word_level_id = 0;
            this.done_topic_ids = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof save_word_friend_done_record_args)) {
                return equals((save_word_friend_done_record_args) that);
            }
            return false;
        }

        public List<Integer> getDone_topic_ids() {
            return this.done_topic_ids;
        }

        public Iterator<Integer> getDone_topic_idsIterator() {
            List<Integer> list = this.done_topic_ids;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getDone_topic_idsSize() {
            List<Integer> list = this.done_topic_ids;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int getWord_level_id() {
            return this.word_level_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetDone_topic_ids() {
            return this.done_topic_ids != null;
        }

        public boolean isSetWord_level_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public save_word_friend_done_record_args setDone_topic_ids(List<Integer> done_topic_ids) {
            this.done_topic_ids = done_topic_ids;
            return this;
        }

        public void setDone_topic_idsIsSet(boolean value) {
            if (value) {
                return;
            }
            this.done_topic_ids = null;
        }

        public save_word_friend_done_record_args setWord_level_id(int word_level_id) {
            this.word_level_id = word_level_id;
            setWord_level_idIsSet(true);
            return this;
        }

        public void setWord_level_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("save_word_friend_done_record_args(");
            sb2.append("word_level_id:");
            sb2.append(this.word_level_id);
            sb2.append(j2.O);
            sb2.append("done_topic_ids:");
            List<Integer> list = this.done_topic_ids;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetDone_topic_ids() {
            this.done_topic_ids = null;
        }

        public void unsetWord_level_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        public void validate() throws TException {
            if (this.done_topic_ids != null) {
                return;
            }
            throw new TProtocolException("Required field 'done_topic_ids' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(save_word_friend_done_record_args other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetWord_level_id()).compareTo(Boolean.valueOf(other.isSetWord_level_id()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetWord_level_id() && (compareTo2 = TBaseHelper.compareTo(this.word_level_id, other.word_level_id)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetDone_topic_ids()).compareTo(Boolean.valueOf(other.isSetDone_topic_ids()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetDone_topic_ids() || (compareTo = TBaseHelper.compareTo((List) this.done_topic_ids, (List) other.done_topic_ids)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<save_word_friend_done_record_args, _Fields> deepCopy2() {
            return new save_word_friend_done_record_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$save_word_friend_done_record_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getWord_level_id());
            }
            if (i11 == 2) {
                return getDone_topic_ids();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$save_word_friend_done_record_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetWord_level_id();
            }
            if (i11 == 2) {
                return isSetDone_topic_ids();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$save_word_friend_done_record_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetWord_level_id();
                    return;
                } else {
                    setWord_level_id(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetDone_topic_ids();
            } else {
                setDone_topic_ids((List) value);
            }
        }

        public save_word_friend_done_record_args(int word_level_id, List<Integer> done_topic_ids) {
            this();
            this.word_level_id = word_level_id;
            setWord_level_idIsSet(true);
            this.done_topic_ids = done_topic_ids;
        }

        public boolean equals(save_word_friend_done_record_args that) {
            if (that == null || this.word_level_id != that.word_level_id) {
                return false;
            }
            boolean isSetDone_topic_ids = isSetDone_topic_ids();
            boolean isSetDone_topic_ids2 = that.isSetDone_topic_ids();
            if (isSetDone_topic_ids || isSetDone_topic_ids2) {
                return isSetDone_topic_ids && isSetDone_topic_ids2 && this.done_topic_ids.equals(that.done_topic_ids);
            }
            return true;
        }

        public save_word_friend_done_record_args(save_word_friend_done_record_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.word_level_id = other.word_level_id;
            if (other.isSetDone_topic_ids()) {
                this.done_topic_ids = new ArrayList(other.done_topic_ids);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class save_word_friend_done_record_result implements TBase<save_word_friend_done_record_result, _Fields>, Serializable, Cloneable, Comparable<save_word_friend_done_record_result> {
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public BELogicException logicException;
        public int success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("save_word_friend_done_record_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 8, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOGIC_EXCEPTION_FIELD_DESC = new TField("logicException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            SYS_EXCEPTION(1, "sysException"),
            LOGIC_EXCEPTION(2, "logicException");

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
                    return SYS_EXCEPTION;
                }
                if (fieldId != 2) {
                    return null;
                }
                return LOGIC_EXCEPTION;
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
        public static class save_word_friend_done_record_resultStandardScheme extends StandardScheme<save_word_friend_done_record_result> {
            private save_word_friend_done_record_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, save_word_friend_done_record_result struct) throws TException {
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
                                BELogicException bELogicException = new BELogicException();
                                struct.logicException = bELogicException;
                                bELogicException.read(iprot);
                                struct.setLogicExceptionIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            BESystemException bESystemException = new BESystemException();
                            struct.sysException = bESystemException;
                            bESystemException.read(iprot);
                            struct.setSysExceptionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.success = iprot.readI32();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, save_word_friend_done_record_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(save_word_friend_done_record_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(save_word_friend_done_record_result.SUCCESS_FIELD_DESC);
                    oprot.writeI32(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(save_word_friend_done_record_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(save_word_friend_done_record_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_word_friend_done_record_resultStandardSchemeFactory implements SchemeFactory {
            private save_word_friend_done_record_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public save_word_friend_done_record_resultStandardScheme getScheme() {
                return new save_word_friend_done_record_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_word_friend_done_record_resultTupleScheme extends TupleScheme<save_word_friend_done_record_result> {
            private save_word_friend_done_record_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, save_word_friend_done_record_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    struct.success = tTupleProtocol.readI32();
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    BESystemException bESystemException = new BESystemException();
                    struct.sysException = bESystemException;
                    bESystemException.read(tTupleProtocol);
                    struct.setSysExceptionIsSet(true);
                }
                if (readBitSet.get(2)) {
                    BELogicException bELogicException = new BELogicException();
                    struct.logicException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogicExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, save_word_friend_done_record_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetSysException()) {
                    bitSet.set(1);
                }
                if (struct.isSetLogicException()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success);
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogicException()) {
                    struct.logicException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_word_friend_done_record_resultTupleSchemeFactory implements SchemeFactory {
            private save_word_friend_done_record_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public save_word_friend_done_record_resultTupleScheme getScheme() {
                return new save_word_friend_done_record_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new save_word_friend_done_record_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new save_word_friend_done_record_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(save_word_friend_done_record_result.class, unmodifiableMap);
        }

        public save_word_friend_done_record_result() {
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
            setSuccessIsSet(false);
            this.success = 0;
            this.sysException = null;
            this.logicException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof save_word_friend_done_record_result)) {
                return equals((save_word_friend_done_record_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
        }

        public int getSuccess() {
            return this.success;
        }

        public BESystemException getSysException() {
            return this.sysException;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetLogicException() {
            return this.logicException != null;
        }

        public boolean isSetSuccess() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public save_word_friend_done_record_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public save_word_friend_done_record_result setSuccess(int success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public save_word_friend_done_record_result setSysException(BESystemException sysException) {
            this.sysException = sysException;
            return this;
        }

        public void setSysExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.sysException = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("save_word_friend_done_record_result(");
            sb2.append("success:");
            sb2.append(this.success);
            sb2.append(j2.O);
            sb2.append("sysException:");
            BESystemException bESystemException = this.sysException;
            if (bESystemException == null) {
                sb2.append("null");
            } else {
                sb2.append(bESystemException);
            }
            sb2.append(j2.O);
            sb2.append("logicException:");
            BELogicException bELogicException = this.logicException;
            if (bELogicException == null) {
                sb2.append("null");
            } else {
                sb2.append(bELogicException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetLogicException() {
            this.logicException = null;
        }

        public void unsetSuccess() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(save_word_friend_done_record_result other) {
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
            int compareTo5 = Boolean.valueOf(isSetSysException()).compareTo(Boolean.valueOf(other.isSetSysException()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetSysException() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.sysException, (Comparable) other.sysException)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetLogicException()).compareTo(Boolean.valueOf(other.isSetLogicException()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetLogicException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logicException, (Comparable) other.logicException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<save_word_friend_done_record_result, _Fields> deepCopy2() {
            return new save_word_friend_done_record_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$save_word_friend_done_record_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getSuccess());
            }
            if (i11 == 2) {
                return getSysException();
            }
            if (i11 == 3) {
                return getLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$save_word_friend_done_record_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetSysException();
            }
            if (i11 == 3) {
                return isSetLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$save_word_friend_done_record_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetSysException();
                    return;
                } else {
                    setSysException((BESystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetLogicException();
            } else {
                setLogicException((BELogicException) value);
            }
        }

        public save_word_friend_done_record_result(int success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.sysException = sysException;
            this.logicException = logicException;
        }

        public boolean equals(save_word_friend_done_record_result that) {
            if (that == null || this.success != that.success) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if ((isSetSysException || isSetSysException2) && !(isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException))) {
                return false;
            }
            boolean isSetLogicException = isSetLogicException();
            boolean isSetLogicException2 = that.isSetLogicException();
            if (isSetLogicException || isSetLogicException2) {
                return isSetLogicException && isSetLogicException2 && this.logicException.equals(that.logicException);
            }
            return true;
        }

        public save_word_friend_done_record_result(save_word_friend_done_record_result other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.success = other.success;
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
            if (other.isSetLogicException()) {
                this.logicException = new BELogicException(other.logicException);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class sync_user_word_media_record_args implements TBase<sync_user_word_media_record_args, _Fields>, Serializable, Cloneable, Comparable<sync_user_word_media_record_args> {
        private static final TStruct STRUCT_DESC = new TStruct("sync_user_word_media_record_args");
        private static final TField USER_MEDIA_RECORDS_FIELD_DESC = new TField("user_media_records", (byte) 15, 1);
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public List<BBUserWordMedia> user_media_records;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            USER_MEDIA_RECORDS(1, "user_media_records");

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
                return USER_MEDIA_RECORDS;
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
        public static class sync_user_word_media_record_argsStandardScheme extends StandardScheme<sync_user_word_media_record_args> {
            private sync_user_word_media_record_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, sync_user_word_media_record_args struct) throws TException {
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
                        struct.user_media_records = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            BBUserWordMedia bBUserWordMedia = new BBUserWordMedia();
                            bBUserWordMedia.read(iprot);
                            struct.user_media_records.add(bBUserWordMedia);
                        }
                        iprot.readListEnd();
                        struct.setUser_media_recordsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, sync_user_word_media_record_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(sync_user_word_media_record_args.STRUCT_DESC);
                if (struct.user_media_records != null) {
                    oprot.writeFieldBegin(sync_user_word_media_record_args.USER_MEDIA_RECORDS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.user_media_records.size()));
                    Iterator<BBUserWordMedia> it = struct.user_media_records.iterator();
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
        public static class sync_user_word_media_record_argsStandardSchemeFactory implements SchemeFactory {
            private sync_user_word_media_record_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public sync_user_word_media_record_argsStandardScheme getScheme() {
                return new sync_user_word_media_record_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class sync_user_word_media_record_argsTupleScheme extends TupleScheme<sync_user_word_media_record_args> {
            private sync_user_word_media_record_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, sync_user_word_media_record_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.user_media_records = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    BBUserWordMedia bBUserWordMedia = new BBUserWordMedia();
                    bBUserWordMedia.read(tTupleProtocol);
                    struct.user_media_records.add(bBUserWordMedia);
                }
                struct.setUser_media_recordsIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, sync_user_word_media_record_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.user_media_records.size());
                Iterator<BBUserWordMedia> it = struct.user_media_records.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class sync_user_word_media_record_argsTupleSchemeFactory implements SchemeFactory {
            private sync_user_word_media_record_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public sync_user_word_media_record_argsTupleScheme getScheme() {
                return new sync_user_word_media_record_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new sync_user_word_media_record_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new sync_user_word_media_record_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.USER_MEDIA_RECORDS, (_Fields) new FieldMetaData("user_media_records", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BBUserWordMedia.class))));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(sync_user_word_media_record_args.class, unmodifiableMap);
        }

        public sync_user_word_media_record_args() {
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

        public void addToUser_media_records(BBUserWordMedia elem) {
            if (this.user_media_records == null) {
                this.user_media_records = new ArrayList();
            }
            this.user_media_records.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.user_media_records = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof sync_user_word_media_record_args)) {
                return equals((sync_user_word_media_record_args) that);
            }
            return false;
        }

        public List<BBUserWordMedia> getUser_media_records() {
            return this.user_media_records;
        }

        public Iterator<BBUserWordMedia> getUser_media_recordsIterator() {
            List<BBUserWordMedia> list = this.user_media_records;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getUser_media_recordsSize() {
            List<BBUserWordMedia> list = this.user_media_records;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetUser_media_records() {
            return this.user_media_records != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public sync_user_word_media_record_args setUser_media_records(List<BBUserWordMedia> user_media_records) {
            this.user_media_records = user_media_records;
            return this;
        }

        public void setUser_media_recordsIsSet(boolean value) {
            if (value) {
                return;
            }
            this.user_media_records = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("sync_user_word_media_record_args(");
            sb2.append("user_media_records:");
            List<BBUserWordMedia> list = this.user_media_records;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetUser_media_records() {
            this.user_media_records = null;
        }

        public void validate() throws TException {
            if (this.user_media_records != null) {
                return;
            }
            throw new TProtocolException("Required field 'user_media_records' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public sync_user_word_media_record_args(List<BBUserWordMedia> user_media_records) {
            this();
            this.user_media_records = user_media_records;
        }

        @Override // java.lang.Comparable
        public int compareTo(sync_user_word_media_record_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetUser_media_records()).compareTo(Boolean.valueOf(other.isSetUser_media_records()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetUser_media_records() || (compareTo = TBaseHelper.compareTo((List) this.user_media_records, (List) other.user_media_records)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<sync_user_word_media_record_args, _Fields> deepCopy2() {
            return new sync_user_word_media_record_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$sync_user_word_media_record_args$_Fields[field.ordinal()] == 1) {
                return getUser_media_records();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$sync_user_word_media_record_args$_Fields[field.ordinal()] == 1) {
                return isSetUser_media_records();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$sync_user_word_media_record_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetUser_media_records();
            } else {
                setUser_media_records((List) value);
            }
        }

        public boolean equals(sync_user_word_media_record_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetUser_media_records = isSetUser_media_records();
            boolean isSetUser_media_records2 = that.isSetUser_media_records();
            if (isSetUser_media_records || isSetUser_media_records2) {
                return isSetUser_media_records && isSetUser_media_records2 && this.user_media_records.equals(that.user_media_records);
            }
            return true;
        }

        public sync_user_word_media_record_args(sync_user_word_media_record_args other) {
            if (other.isSetUser_media_records()) {
                ArrayList arrayList = new ArrayList(other.user_media_records.size());
                Iterator<BBUserWordMedia> it = other.user_media_records.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BBUserWordMedia(it.next()));
                }
                this.user_media_records = arrayList;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class sync_user_word_media_record_result implements TBase<sync_user_word_media_record_result, _Fields>, Serializable, Cloneable, Comparable<sync_user_word_media_record_result> {
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public BELogicException logicException;
        public int success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("sync_user_word_media_record_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 8, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOGIC_EXCEPTION_FIELD_DESC = new TField("logicException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            SYS_EXCEPTION(1, "sysException"),
            LOGIC_EXCEPTION(2, "logicException");

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
                    return SYS_EXCEPTION;
                }
                if (fieldId != 2) {
                    return null;
                }
                return LOGIC_EXCEPTION;
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
        public static class sync_user_word_media_record_resultStandardScheme extends StandardScheme<sync_user_word_media_record_result> {
            private sync_user_word_media_record_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, sync_user_word_media_record_result struct) throws TException {
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
                                BELogicException bELogicException = new BELogicException();
                                struct.logicException = bELogicException;
                                bELogicException.read(iprot);
                                struct.setLogicExceptionIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            BESystemException bESystemException = new BESystemException();
                            struct.sysException = bESystemException;
                            bESystemException.read(iprot);
                            struct.setSysExceptionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.success = iprot.readI32();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, sync_user_word_media_record_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(sync_user_word_media_record_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(sync_user_word_media_record_result.SUCCESS_FIELD_DESC);
                    oprot.writeI32(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(sync_user_word_media_record_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(sync_user_word_media_record_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class sync_user_word_media_record_resultStandardSchemeFactory implements SchemeFactory {
            private sync_user_word_media_record_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public sync_user_word_media_record_resultStandardScheme getScheme() {
                return new sync_user_word_media_record_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class sync_user_word_media_record_resultTupleScheme extends TupleScheme<sync_user_word_media_record_result> {
            private sync_user_word_media_record_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, sync_user_word_media_record_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    struct.success = tTupleProtocol.readI32();
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    BESystemException bESystemException = new BESystemException();
                    struct.sysException = bESystemException;
                    bESystemException.read(tTupleProtocol);
                    struct.setSysExceptionIsSet(true);
                }
                if (readBitSet.get(2)) {
                    BELogicException bELogicException = new BELogicException();
                    struct.logicException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogicExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, sync_user_word_media_record_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetSysException()) {
                    bitSet.set(1);
                }
                if (struct.isSetLogicException()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success);
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogicException()) {
                    struct.logicException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class sync_user_word_media_record_resultTupleSchemeFactory implements SchemeFactory {
            private sync_user_word_media_record_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public sync_user_word_media_record_resultTupleScheme getScheme() {
                return new sync_user_word_media_record_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new sync_user_word_media_record_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new sync_user_word_media_record_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(sync_user_word_media_record_result.class, unmodifiableMap);
        }

        public sync_user_word_media_record_result() {
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
            setSuccessIsSet(false);
            this.success = 0;
            this.sysException = null;
            this.logicException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof sync_user_word_media_record_result)) {
                return equals((sync_user_word_media_record_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
        }

        public int getSuccess() {
            return this.success;
        }

        public BESystemException getSysException() {
            return this.sysException;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetLogicException() {
            return this.logicException != null;
        }

        public boolean isSetSuccess() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public sync_user_word_media_record_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public sync_user_word_media_record_result setSuccess(int success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public sync_user_word_media_record_result setSysException(BESystemException sysException) {
            this.sysException = sysException;
            return this;
        }

        public void setSysExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.sysException = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("sync_user_word_media_record_result(");
            sb2.append("success:");
            sb2.append(this.success);
            sb2.append(j2.O);
            sb2.append("sysException:");
            BESystemException bESystemException = this.sysException;
            if (bESystemException == null) {
                sb2.append("null");
            } else {
                sb2.append(bESystemException);
            }
            sb2.append(j2.O);
            sb2.append("logicException:");
            BELogicException bELogicException = this.logicException;
            if (bELogicException == null) {
                sb2.append("null");
            } else {
                sb2.append(bELogicException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetLogicException() {
            this.logicException = null;
        }

        public void unsetSuccess() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(sync_user_word_media_record_result other) {
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
            int compareTo5 = Boolean.valueOf(isSetSysException()).compareTo(Boolean.valueOf(other.isSetSysException()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetSysException() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.sysException, (Comparable) other.sysException)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetLogicException()).compareTo(Boolean.valueOf(other.isSetLogicException()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetLogicException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logicException, (Comparable) other.logicException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<sync_user_word_media_record_result, _Fields> deepCopy2() {
            return new sync_user_word_media_record_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$sync_user_word_media_record_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getSuccess());
            }
            if (i11 == 2) {
                return getSysException();
            }
            if (i11 == 3) {
                return getLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$sync_user_word_media_record_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetSysException();
            }
            if (i11 == 3) {
                return isSetLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$sync_user_word_media_record_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetSysException();
                    return;
                } else {
                    setSysException((BESystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetLogicException();
            } else {
                setLogicException((BELogicException) value);
            }
        }

        public sync_user_word_media_record_result(int success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.sysException = sysException;
            this.logicException = logicException;
        }

        public boolean equals(sync_user_word_media_record_result that) {
            if (that == null || this.success != that.success) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if ((isSetSysException || isSetSysException2) && !(isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException))) {
                return false;
            }
            boolean isSetLogicException = isSetLogicException();
            boolean isSetLogicException2 = that.isSetLogicException();
            if (isSetLogicException || isSetLogicException2) {
                return isSetLogicException && isSetLogicException2 && this.logicException.equals(that.logicException);
            }
            return true;
        }

        public sync_user_word_media_record_result(sync_user_word_media_record_result other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.success = other.success;
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
            if (other.isSetLogicException()) {
                this.logicException = new BELogicException(other.logicException);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class user_operation_stat_args implements TBase<user_operation_stat_args, _Fields>, Serializable, Cloneable, Comparable<user_operation_stat_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public List<BBOperationStatLog> operation_logs;
        private static final TStruct STRUCT_DESC = new TStruct("user_operation_stat_args");
        private static final TField OPERATION_LOGS_FIELD_DESC = new TField("operation_logs", (byte) 15, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            OPERATION_LOGS(1, "operation_logs");

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
                return OPERATION_LOGS;
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
        public static class user_operation_stat_argsStandardScheme extends StandardScheme<user_operation_stat_args> {
            private user_operation_stat_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, user_operation_stat_args struct) throws TException {
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
                        struct.operation_logs = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            BBOperationStatLog bBOperationStatLog = new BBOperationStatLog();
                            bBOperationStatLog.read(iprot);
                            struct.operation_logs.add(bBOperationStatLog);
                        }
                        iprot.readListEnd();
                        struct.setOperation_logsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, user_operation_stat_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(user_operation_stat_args.STRUCT_DESC);
                if (struct.operation_logs != null) {
                    oprot.writeFieldBegin(user_operation_stat_args.OPERATION_LOGS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.operation_logs.size()));
                    Iterator<BBOperationStatLog> it = struct.operation_logs.iterator();
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
        public static class user_operation_stat_argsStandardSchemeFactory implements SchemeFactory {
            private user_operation_stat_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public user_operation_stat_argsStandardScheme getScheme() {
                return new user_operation_stat_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class user_operation_stat_argsTupleScheme extends TupleScheme<user_operation_stat_args> {
            private user_operation_stat_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, user_operation_stat_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.operation_logs = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    BBOperationStatLog bBOperationStatLog = new BBOperationStatLog();
                    bBOperationStatLog.read(tTupleProtocol);
                    struct.operation_logs.add(bBOperationStatLog);
                }
                struct.setOperation_logsIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, user_operation_stat_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.operation_logs.size());
                Iterator<BBOperationStatLog> it = struct.operation_logs.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class user_operation_stat_argsTupleSchemeFactory implements SchemeFactory {
            private user_operation_stat_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public user_operation_stat_argsTupleScheme getScheme() {
                return new user_operation_stat_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new user_operation_stat_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new user_operation_stat_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.OPERATION_LOGS, (_Fields) new FieldMetaData("operation_logs", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BBOperationStatLog.class))));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(user_operation_stat_args.class, unmodifiableMap);
        }

        public user_operation_stat_args() {
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

        public void addToOperation_logs(BBOperationStatLog elem) {
            if (this.operation_logs == null) {
                this.operation_logs = new ArrayList();
            }
            this.operation_logs.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.operation_logs = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof user_operation_stat_args)) {
                return equals((user_operation_stat_args) that);
            }
            return false;
        }

        public List<BBOperationStatLog> getOperation_logs() {
            return this.operation_logs;
        }

        public Iterator<BBOperationStatLog> getOperation_logsIterator() {
            List<BBOperationStatLog> list = this.operation_logs;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getOperation_logsSize() {
            List<BBOperationStatLog> list = this.operation_logs;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetOperation_logs() {
            return this.operation_logs != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public user_operation_stat_args setOperation_logs(List<BBOperationStatLog> operation_logs) {
            this.operation_logs = operation_logs;
            return this;
        }

        public void setOperation_logsIsSet(boolean value) {
            if (value) {
                return;
            }
            this.operation_logs = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("user_operation_stat_args(");
            sb2.append("operation_logs:");
            List<BBOperationStatLog> list = this.operation_logs;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetOperation_logs() {
            this.operation_logs = null;
        }

        public void validate() throws TException {
            if (this.operation_logs != null) {
                return;
            }
            throw new TProtocolException("Required field 'operation_logs' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public user_operation_stat_args(List<BBOperationStatLog> operation_logs) {
            this();
            this.operation_logs = operation_logs;
        }

        @Override // java.lang.Comparable
        public int compareTo(user_operation_stat_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetOperation_logs()).compareTo(Boolean.valueOf(other.isSetOperation_logs()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetOperation_logs() || (compareTo = TBaseHelper.compareTo((List) this.operation_logs, (List) other.operation_logs)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<user_operation_stat_args, _Fields> deepCopy2() {
            return new user_operation_stat_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$user_operation_stat_args$_Fields[field.ordinal()] == 1) {
                return getOperation_logs();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$user_operation_stat_args$_Fields[field.ordinal()] == 1) {
                return isSetOperation_logs();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$user_operation_stat_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetOperation_logs();
            } else {
                setOperation_logs((List) value);
            }
        }

        public boolean equals(user_operation_stat_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetOperation_logs = isSetOperation_logs();
            boolean isSetOperation_logs2 = that.isSetOperation_logs();
            if (isSetOperation_logs || isSetOperation_logs2) {
                return isSetOperation_logs && isSetOperation_logs2 && this.operation_logs.equals(that.operation_logs);
            }
            return true;
        }

        public user_operation_stat_args(user_operation_stat_args other) {
            if (other.isSetOperation_logs()) {
                ArrayList arrayList = new ArrayList(other.operation_logs.size());
                Iterator<BBOperationStatLog> it = other.operation_logs.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BBOperationStatLog(it.next()));
                }
                this.operation_logs = arrayList;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class user_operation_stat_result implements TBase<user_operation_stat_result, _Fields>, Serializable, Cloneable, Comparable<user_operation_stat_result> {
        private static final TStruct STRUCT_DESC = new TStruct("user_operation_stat_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 8, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int success;
        public BESystemException sysException;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            SYS_EXCEPTION(1, "sysException");

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
                if (fieldId != 1) {
                    return null;
                }
                return SYS_EXCEPTION;
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
        public static class user_operation_stat_resultStandardScheme extends StandardScheme<user_operation_stat_result> {
            private user_operation_stat_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, user_operation_stat_result struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 12) {
                            BESystemException bESystemException = new BESystemException();
                            struct.sysException = bESystemException;
                            bESystemException.read(iprot);
                            struct.setSysExceptionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.success = iprot.readI32();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, user_operation_stat_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(user_operation_stat_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(user_operation_stat_result.SUCCESS_FIELD_DESC);
                    oprot.writeI32(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(user_operation_stat_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class user_operation_stat_resultStandardSchemeFactory implements SchemeFactory {
            private user_operation_stat_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public user_operation_stat_resultStandardScheme getScheme() {
                return new user_operation_stat_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class user_operation_stat_resultTupleScheme extends TupleScheme<user_operation_stat_result> {
            private user_operation_stat_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, user_operation_stat_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(2);
                if (readBitSet.get(0)) {
                    struct.success = tTupleProtocol.readI32();
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    BESystemException bESystemException = new BESystemException();
                    struct.sysException = bESystemException;
                    bESystemException.read(tTupleProtocol);
                    struct.setSysExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, user_operation_stat_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetSysException()) {
                    bitSet.set(1);
                }
                tTupleProtocol.writeBitSet(bitSet, 2);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success);
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class user_operation_stat_resultTupleSchemeFactory implements SchemeFactory {
            private user_operation_stat_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public user_operation_stat_resultTupleScheme getScheme() {
                return new user_operation_stat_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new user_operation_stat_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new user_operation_stat_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(user_operation_stat_result.class, unmodifiableMap);
        }

        public user_operation_stat_result() {
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
            setSuccessIsSet(false);
            this.success = 0;
            this.sysException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof user_operation_stat_result)) {
                return equals((user_operation_stat_result) that);
            }
            return false;
        }

        public int getSuccess() {
            return this.success;
        }

        public BESystemException getSysException() {
            return this.sysException;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetSuccess() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public user_operation_stat_result setSuccess(int success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public user_operation_stat_result setSysException(BESystemException sysException) {
            this.sysException = sysException;
            return this;
        }

        public void setSysExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.sysException = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("user_operation_stat_result(");
            sb2.append("success:");
            sb2.append(this.success);
            sb2.append(j2.O);
            sb2.append("sysException:");
            BESystemException bESystemException = this.sysException;
            if (bESystemException == null) {
                sb2.append("null");
            } else {
                sb2.append(bESystemException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetSuccess() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(user_operation_stat_result other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetSuccess() && (compareTo2 = TBaseHelper.compareTo(this.success, other.success)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetSysException()).compareTo(Boolean.valueOf(other.isSetSysException()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetSysException() || (compareTo = TBaseHelper.compareTo((Comparable) this.sysException, (Comparable) other.sysException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<user_operation_stat_result, _Fields> deepCopy2() {
            return new user_operation_stat_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$user_operation_stat_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getSuccess());
            }
            if (i11 == 2) {
                return getSysException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$user_operation_stat_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetSysException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BSUsers$user_operation_stat_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetSysException();
            } else {
                setSysException((BESystemException) value);
            }
        }

        public user_operation_stat_result(int success, BESystemException sysException) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.sysException = sysException;
        }

        public boolean equals(user_operation_stat_result that) {
            if (that == null || this.success != that.success) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if (isSetSysException || isSetSysException2) {
                return isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException);
            }
            return true;
        }

        public user_operation_stat_result(user_operation_stat_result other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.success = other.success;
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
        }

        public void validate() throws TException {
        }
    }
}
