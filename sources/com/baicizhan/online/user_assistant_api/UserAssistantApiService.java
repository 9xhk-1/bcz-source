package com.baicizhan.online.user_assistant_api;

import com.baicizhan.online.thrift.basic.LogicException;
import com.baicizhan.online.thrift.basic.SystemException;
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
/* loaded from: classes6.dex */
public class UserAssistantApiService {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_assistant_api.UserAssistantApiService$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$analyze_clipboard_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$analyze_clipboard_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$check_feedback_msg_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$check_feedback_msg_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$done_word_stat_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$done_word_stat_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_activity_updated_time_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_activity_updated_time_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_v2_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_v2_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_credit_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_credit_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_exploration_items_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_exploration_items_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$huawei_pay_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$huawei_pay_result$_Fields;

        static {
            int[] iArr = new int[huawei_pay_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$huawei_pay_result$_Fields = iArr;
            try {
                iArr[huawei_pay_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$huawei_pay_result$_Fields[huawei_pay_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$huawei_pay_result$_Fields[huawei_pay_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[huawei_pay_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$huawei_pay_args$_Fields = iArr2;
            try {
                iArr2[huawei_pay_args._Fields.PAY_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[analyze_clipboard_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$analyze_clipboard_result$_Fields = iArr3;
            try {
                iArr3[analyze_clipboard_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$analyze_clipboard_result$_Fields[analyze_clipboard_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$analyze_clipboard_result$_Fields[analyze_clipboard_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr4 = new int[analyze_clipboard_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$analyze_clipboard_args$_Fields = iArr4;
            try {
                iArr4[analyze_clipboard_args._Fields.CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr5 = new int[done_word_stat_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$done_word_stat_result$_Fields = iArr5;
            try {
                iArr5[done_word_stat_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$done_word_stat_result$_Fields[done_word_stat_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$done_word_stat_result$_Fields[done_word_stat_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr6 = new int[done_word_stat_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$done_word_stat_args$_Fields = iArr6;
            try {
                iArr6[done_word_stat_args._Fields.BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$done_word_stat_args$_Fields[done_word_stat_args._Fields.STAT_LOGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr7 = new int[get_activity_updated_time_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_activity_updated_time_result$_Fields = iArr7;
            try {
                iArr7[get_activity_updated_time_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_activity_updated_time_result$_Fields[get_activity_updated_time_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_activity_updated_time_result$_Fields[get_activity_updated_time_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_activity_updated_time_args$_Fields = new int[get_activity_updated_time_args._Fields.values().length];
            int[] iArr8 = new int[get_exploration_items_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_exploration_items_result$_Fields = iArr8;
            try {
                iArr8[get_exploration_items_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_exploration_items_result$_Fields[get_exploration_items_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_exploration_items_result$_Fields[get_exploration_items_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_exploration_items_args$_Fields = new int[get_exploration_items_args._Fields.values().length];
            int[] iArr9 = new int[get_beta_user_types_v2_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_v2_result$_Fields = iArr9;
            try {
                iArr9[get_beta_user_types_v2_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_v2_result$_Fields[get_beta_user_types_v2_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_v2_result$_Fields[get_beta_user_types_v2_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_v2_args$_Fields = new int[get_beta_user_types_v2_args._Fields.values().length];
            int[] iArr10 = new int[get_beta_user_types_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_result$_Fields = iArr10;
            try {
                iArr10[get_beta_user_types_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_result$_Fields[get_beta_user_types_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_result$_Fields[get_beta_user_types_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_args$_Fields = new int[get_beta_user_types_args._Fields.values().length];
            int[] iArr11 = new int[get_credit_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_credit_result$_Fields = iArr11;
            try {
                iArr11[get_credit_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_credit_result$_Fields[get_credit_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_credit_result$_Fields[get_credit_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_credit_args$_Fields = new int[get_credit_args._Fields.values().length];
            int[] iArr12 = new int[check_feedback_msg_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$check_feedback_msg_result$_Fields = iArr12;
            try {
                iArr12[check_feedback_msg_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$check_feedback_msg_result$_Fields[check_feedback_msg_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$check_feedback_msg_result$_Fields[check_feedback_msg_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            int[] iArr13 = new int[check_feedback_msg_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$check_feedback_msg_args$_Fields = iArr13;
            try {
                iArr13[check_feedback_msg_args._Fields.DEVICE_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
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
        public static class analyze_clipboard_call extends TAsyncMethodCall {
            private String code;

            public analyze_clipboard_call(String code, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.code = code;
            }

            public ClipboardResp getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_analyze_clipboard();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("analyze_clipboard", (byte) 1, 0));
                analyze_clipboard_args analyze_clipboard_argsVar = new analyze_clipboard_args();
                analyze_clipboard_argsVar.setCode(this.code);
                analyze_clipboard_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_feedback_msg_call extends TAsyncMethodCall {
            private String device_id;

            public check_feedback_msg_call(String device_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.device_id = device_id;
            }

            public int getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_check_feedback_msg();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("check_feedback_msg", (byte) 1, 0));
                check_feedback_msg_args check_feedback_msg_argsVar = new check_feedback_msg_args();
                check_feedback_msg_argsVar.setDevice_id(this.device_id);
                check_feedback_msg_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class done_word_stat_call extends TAsyncMethodCall {
            private int book_id;
            private List<DoneWordStatLog> stat_logs;

            public done_word_stat_call(int book_id, List<DoneWordStatLog> stat_logs, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.book_id = book_id;
                this.stat_logs = stat_logs;
            }

            public int getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_done_word_stat();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("done_word_stat", (byte) 1, 0));
                done_word_stat_args done_word_stat_argsVar = new done_word_stat_args();
                done_word_stat_argsVar.setBook_id(this.book_id);
                done_word_stat_argsVar.setStat_logs(this.stat_logs);
                done_word_stat_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_activity_updated_time_call extends TAsyncMethodCall {
            public get_activity_updated_time_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public int getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_activity_updated_time();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_activity_updated_time", (byte) 1, 0));
                new get_activity_updated_time_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_beta_user_types_call extends TAsyncMethodCall {
            public get_beta_user_types_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public List<Integer> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_beta_user_types();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_beta_user_types", (byte) 1, 0));
                new get_beta_user_types_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_beta_user_types_v2_call extends TAsyncMethodCall {
            public get_beta_user_types_v2_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public UserBetaInfo getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_beta_user_types_v2();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_beta_user_types_v2", (byte) 1, 0));
                new get_beta_user_types_v2_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_credit_call extends TAsyncMethodCall {
            public get_credit_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public int getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_credit();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_credit", (byte) 1, 0));
                new get_credit_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_exploration_items_call extends TAsyncMethodCall {
            public get_exploration_items_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public List<ExplorationItem> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_exploration_items();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_exploration_items", (byte) 1, 0));
                new get_exploration_items_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class huawei_pay_call extends TAsyncMethodCall {
            private HuaweiPayInfo pay_info;

            public huawei_pay_call(HuaweiPayInfo pay_info, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.pay_info = pay_info;
            }

            public PayResp getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_huawei_pay();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("huawei_pay", (byte) 1, 0));
                huawei_pay_args huawei_pay_argsVar = new huawei_pay_args();
                huawei_pay_argsVar.setPay_info(this.pay_info);
                huawei_pay_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        public AsyncClient(TProtocolFactory protocolFactory, TAsyncClientManager clientManager, TNonblockingTransport transport) {
            super(protocolFactory, clientManager, transport);
        }

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncIface
        public void analyze_clipboard(String code, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            analyze_clipboard_call analyze_clipboard_callVar = new analyze_clipboard_call(code, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = analyze_clipboard_callVar;
            this.___manager.call(analyze_clipboard_callVar);
        }

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncIface
        public void check_feedback_msg(String device_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            check_feedback_msg_call check_feedback_msg_callVar = new check_feedback_msg_call(device_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = check_feedback_msg_callVar;
            this.___manager.call(check_feedback_msg_callVar);
        }

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncIface
        public void done_word_stat(int book_id, List<DoneWordStatLog> stat_logs, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            done_word_stat_call done_word_stat_callVar = new done_word_stat_call(book_id, stat_logs, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = done_word_stat_callVar;
            this.___manager.call(done_word_stat_callVar);
        }

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncIface
        public void get_activity_updated_time(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_activity_updated_time_call get_activity_updated_time_callVar = new get_activity_updated_time_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_activity_updated_time_callVar;
            this.___manager.call(get_activity_updated_time_callVar);
        }

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncIface
        public void get_beta_user_types(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_beta_user_types_call get_beta_user_types_callVar = new get_beta_user_types_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_beta_user_types_callVar;
            this.___manager.call(get_beta_user_types_callVar);
        }

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncIface
        public void get_beta_user_types_v2(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_beta_user_types_v2_call get_beta_user_types_v2_callVar = new get_beta_user_types_v2_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_beta_user_types_v2_callVar;
            this.___manager.call(get_beta_user_types_v2_callVar);
        }

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncIface
        public void get_credit(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_credit_call get_credit_callVar = new get_credit_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_credit_callVar;
            this.___manager.call(get_credit_callVar);
        }

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncIface
        public void get_exploration_items(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_exploration_items_call get_exploration_items_callVar = new get_exploration_items_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_exploration_items_callVar;
            this.___manager.call(get_exploration_items_callVar);
        }

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncIface
        public void huawei_pay(HuaweiPayInfo pay_info, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            huawei_pay_call huawei_pay_callVar = new huawei_pay_call(pay_info, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = huawei_pay_callVar;
            this.___manager.call(huawei_pay_callVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AsyncIface {
        void analyze_clipboard(String code, AsyncMethodCallback resultHandler) throws TException;

        void check_feedback_msg(String device_id, AsyncMethodCallback resultHandler) throws TException;

        void done_word_stat(int book_id, List<DoneWordStatLog> stat_logs, AsyncMethodCallback resultHandler) throws TException;

        void get_activity_updated_time(AsyncMethodCallback resultHandler) throws TException;

        void get_beta_user_types(AsyncMethodCallback resultHandler) throws TException;

        void get_beta_user_types_v2(AsyncMethodCallback resultHandler) throws TException;

        void get_credit(AsyncMethodCallback resultHandler) throws TException;

        void get_exploration_items(AsyncMethodCallback resultHandler) throws TException;

        void huawei_pay(HuaweiPayInfo pay_info, AsyncMethodCallback resultHandler) throws TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AsyncProcessor<I extends AsyncIface> extends TBaseAsyncProcessor<I> {
        private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class analyze_clipboard<I extends AsyncIface> extends AsyncProcessFunction<I, analyze_clipboard_args, ClipboardResp> {
            public analyze_clipboard() {
                super("analyze_clipboard");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<ClipboardResp> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<ClipboardResp>() { // from class: com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncProcessor.analyze_clipboard.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        analyze_clipboard_result analyze_clipboard_resultVar;
                        analyze_clipboard_result analyze_clipboard_resultVar2 = new analyze_clipboard_result();
                        try {
                            if (exc instanceof SystemException) {
                                analyze_clipboard_resultVar2.boom = (SystemException) exc;
                                analyze_clipboard_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    analyze_clipboard_resultVar = r02;
                                    this.sendResponse(fb2, analyze_clipboard_resultVar, b11, seqid);
                                    return;
                                }
                                analyze_clipboard_resultVar2.bomb = (LogicException) exc;
                                analyze_clipboard_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, analyze_clipboard_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        analyze_clipboard_resultVar = analyze_clipboard_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(ClipboardResp o11) {
                        analyze_clipboard_result analyze_clipboard_resultVar = new analyze_clipboard_result();
                        analyze_clipboard_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, analyze_clipboard_resultVar, (byte) 2, seqid);
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
            public analyze_clipboard_args getEmptyArgsInstance() {
                return new analyze_clipboard_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, analyze_clipboard_args args, AsyncMethodCallback<ClipboardResp> resultHandler) throws TException {
                iface.analyze_clipboard(args.code, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_feedback_msg<I extends AsyncIface> extends AsyncProcessFunction<I, check_feedback_msg_args, Integer> {
            public check_feedback_msg() {
                super("check_feedback_msg");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Integer> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Integer>() { // from class: com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncProcessor.check_feedback_msg.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        check_feedback_msg_result check_feedback_msg_resultVar;
                        check_feedback_msg_result check_feedback_msg_resultVar2 = new check_feedback_msg_result();
                        try {
                            if (exc instanceof SystemException) {
                                check_feedback_msg_resultVar2.boom = (SystemException) exc;
                                check_feedback_msg_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    check_feedback_msg_resultVar = r02;
                                    this.sendResponse(fb2, check_feedback_msg_resultVar, b11, seqid);
                                    return;
                                }
                                check_feedback_msg_resultVar2.bomb = (LogicException) exc;
                                check_feedback_msg_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, check_feedback_msg_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        check_feedback_msg_resultVar = check_feedback_msg_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Integer o11) {
                        check_feedback_msg_result check_feedback_msg_resultVar = new check_feedback_msg_result();
                        check_feedback_msg_resultVar.success = o11.intValue();
                        check_feedback_msg_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, check_feedback_msg_resultVar, (byte) 2, seqid);
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
            public check_feedback_msg_args getEmptyArgsInstance() {
                return new check_feedback_msg_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, check_feedback_msg_args args, AsyncMethodCallback<Integer> resultHandler) throws TException {
                iface.check_feedback_msg(args.device_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class done_word_stat<I extends AsyncIface> extends AsyncProcessFunction<I, done_word_stat_args, Integer> {
            public done_word_stat() {
                super("done_word_stat");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Integer> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Integer>() { // from class: com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncProcessor.done_word_stat.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        done_word_stat_result done_word_stat_resultVar;
                        done_word_stat_result done_word_stat_resultVar2 = new done_word_stat_result();
                        try {
                            if (exc instanceof SystemException) {
                                done_word_stat_resultVar2.boom = (SystemException) exc;
                                done_word_stat_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    done_word_stat_resultVar = r02;
                                    this.sendResponse(fb2, done_word_stat_resultVar, b11, seqid);
                                    return;
                                }
                                done_word_stat_resultVar2.bomb = (LogicException) exc;
                                done_word_stat_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, done_word_stat_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        done_word_stat_resultVar = done_word_stat_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Integer o11) {
                        done_word_stat_result done_word_stat_resultVar = new done_word_stat_result();
                        done_word_stat_resultVar.success = o11.intValue();
                        done_word_stat_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, done_word_stat_resultVar, (byte) 2, seqid);
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
            public done_word_stat_args getEmptyArgsInstance() {
                return new done_word_stat_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, done_word_stat_args args, AsyncMethodCallback<Integer> resultHandler) throws TException {
                iface.done_word_stat(args.book_id, args.stat_logs, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_activity_updated_time<I extends AsyncIface> extends AsyncProcessFunction<I, get_activity_updated_time_args, Integer> {
            public get_activity_updated_time() {
                super("get_activity_updated_time");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Integer> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Integer>() { // from class: com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncProcessor.get_activity_updated_time.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_activity_updated_time_result get_activity_updated_time_resultVar;
                        get_activity_updated_time_result get_activity_updated_time_resultVar2 = new get_activity_updated_time_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_activity_updated_time_resultVar2.boom = (SystemException) exc;
                                get_activity_updated_time_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_activity_updated_time_resultVar = r02;
                                    this.sendResponse(fb2, get_activity_updated_time_resultVar, b11, seqid);
                                    return;
                                }
                                get_activity_updated_time_resultVar2.bomb = (LogicException) exc;
                                get_activity_updated_time_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_activity_updated_time_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_activity_updated_time_resultVar = get_activity_updated_time_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Integer o11) {
                        get_activity_updated_time_result get_activity_updated_time_resultVar = new get_activity_updated_time_result();
                        get_activity_updated_time_resultVar.success = o11.intValue();
                        get_activity_updated_time_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, get_activity_updated_time_resultVar, (byte) 2, seqid);
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
            public get_activity_updated_time_args getEmptyArgsInstance() {
                return new get_activity_updated_time_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_activity_updated_time_args args, AsyncMethodCallback<Integer> resultHandler) throws TException {
                iface.get_activity_updated_time(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_beta_user_types<I extends AsyncIface> extends AsyncProcessFunction<I, get_beta_user_types_args, List<Integer>> {
            public get_beta_user_types() {
                super("get_beta_user_types");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<Integer>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<Integer>>() { // from class: com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncProcessor.get_beta_user_types.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_beta_user_types_result get_beta_user_types_resultVar;
                        get_beta_user_types_result get_beta_user_types_resultVar2 = new get_beta_user_types_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_beta_user_types_resultVar2.boom = (SystemException) exc;
                                get_beta_user_types_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_beta_user_types_resultVar = r02;
                                    this.sendResponse(fb2, get_beta_user_types_resultVar, b11, seqid);
                                    return;
                                }
                                get_beta_user_types_resultVar2.bomb = (LogicException) exc;
                                get_beta_user_types_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_beta_user_types_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_beta_user_types_resultVar = get_beta_user_types_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<Integer> o11) {
                        get_beta_user_types_result get_beta_user_types_resultVar = new get_beta_user_types_result();
                        get_beta_user_types_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_beta_user_types_resultVar, (byte) 2, seqid);
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
            public get_beta_user_types_args getEmptyArgsInstance() {
                return new get_beta_user_types_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_beta_user_types_args args, AsyncMethodCallback<List<Integer>> resultHandler) throws TException {
                iface.get_beta_user_types(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_beta_user_types_v2<I extends AsyncIface> extends AsyncProcessFunction<I, get_beta_user_types_v2_args, UserBetaInfo> {
            public get_beta_user_types_v2() {
                super("get_beta_user_types_v2");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<UserBetaInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<UserBetaInfo>() { // from class: com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncProcessor.get_beta_user_types_v2.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_beta_user_types_v2_result get_beta_user_types_v2_resultVar;
                        get_beta_user_types_v2_result get_beta_user_types_v2_resultVar2 = new get_beta_user_types_v2_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_beta_user_types_v2_resultVar2.boom = (SystemException) exc;
                                get_beta_user_types_v2_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_beta_user_types_v2_resultVar = r02;
                                    this.sendResponse(fb2, get_beta_user_types_v2_resultVar, b11, seqid);
                                    return;
                                }
                                get_beta_user_types_v2_resultVar2.bomb = (LogicException) exc;
                                get_beta_user_types_v2_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_beta_user_types_v2_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_beta_user_types_v2_resultVar = get_beta_user_types_v2_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(UserBetaInfo o11) {
                        get_beta_user_types_v2_result get_beta_user_types_v2_resultVar = new get_beta_user_types_v2_result();
                        get_beta_user_types_v2_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_beta_user_types_v2_resultVar, (byte) 2, seqid);
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
            public get_beta_user_types_v2_args getEmptyArgsInstance() {
                return new get_beta_user_types_v2_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_beta_user_types_v2_args args, AsyncMethodCallback<UserBetaInfo> resultHandler) throws TException {
                iface.get_beta_user_types_v2(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_credit<I extends AsyncIface> extends AsyncProcessFunction<I, get_credit_args, Integer> {
            public get_credit() {
                super("get_credit");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Integer> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Integer>() { // from class: com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncProcessor.get_credit.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_credit_result get_credit_resultVar;
                        get_credit_result get_credit_resultVar2 = new get_credit_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_credit_resultVar2.boom = (SystemException) exc;
                                get_credit_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_credit_resultVar = r02;
                                    this.sendResponse(fb2, get_credit_resultVar, b11, seqid);
                                    return;
                                }
                                get_credit_resultVar2.bomb = (LogicException) exc;
                                get_credit_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_credit_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_credit_resultVar = get_credit_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Integer o11) {
                        get_credit_result get_credit_resultVar = new get_credit_result();
                        get_credit_resultVar.success = o11.intValue();
                        get_credit_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, get_credit_resultVar, (byte) 2, seqid);
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
            public get_credit_args getEmptyArgsInstance() {
                return new get_credit_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_credit_args args, AsyncMethodCallback<Integer> resultHandler) throws TException {
                iface.get_credit(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_exploration_items<I extends AsyncIface> extends AsyncProcessFunction<I, get_exploration_items_args, List<ExplorationItem>> {
            public get_exploration_items() {
                super("get_exploration_items");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<ExplorationItem>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<ExplorationItem>>() { // from class: com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncProcessor.get_exploration_items.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_exploration_items_result get_exploration_items_resultVar;
                        get_exploration_items_result get_exploration_items_resultVar2 = new get_exploration_items_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_exploration_items_resultVar2.boom = (SystemException) exc;
                                get_exploration_items_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_exploration_items_resultVar = r02;
                                    this.sendResponse(fb2, get_exploration_items_resultVar, b11, seqid);
                                    return;
                                }
                                get_exploration_items_resultVar2.bomb = (LogicException) exc;
                                get_exploration_items_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_exploration_items_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_exploration_items_resultVar = get_exploration_items_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<ExplorationItem> o11) {
                        get_exploration_items_result get_exploration_items_resultVar = new get_exploration_items_result();
                        get_exploration_items_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_exploration_items_resultVar, (byte) 2, seqid);
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
            public get_exploration_items_args getEmptyArgsInstance() {
                return new get_exploration_items_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_exploration_items_args args, AsyncMethodCallback<List<ExplorationItem>> resultHandler) throws TException {
                iface.get_exploration_items(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class huawei_pay<I extends AsyncIface> extends AsyncProcessFunction<I, huawei_pay_args, PayResp> {
            public huawei_pay() {
                super("huawei_pay");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<PayResp> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<PayResp>() { // from class: com.baicizhan.online.user_assistant_api.UserAssistantApiService.AsyncProcessor.huawei_pay.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        huawei_pay_result huawei_pay_resultVar;
                        huawei_pay_result huawei_pay_resultVar2 = new huawei_pay_result();
                        try {
                            if (exc instanceof SystemException) {
                                huawei_pay_resultVar2.boom = (SystemException) exc;
                                huawei_pay_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    huawei_pay_resultVar = r02;
                                    this.sendResponse(fb2, huawei_pay_resultVar, b11, seqid);
                                    return;
                                }
                                huawei_pay_resultVar2.bomb = (LogicException) exc;
                                huawei_pay_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, huawei_pay_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        huawei_pay_resultVar = huawei_pay_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(PayResp o11) {
                        huawei_pay_result huawei_pay_resultVar = new huawei_pay_result();
                        huawei_pay_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, huawei_pay_resultVar, (byte) 2, seqid);
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
            public huawei_pay_args getEmptyArgsInstance() {
                return new huawei_pay_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, huawei_pay_args args, AsyncMethodCallback<PayResp> resultHandler) throws TException {
                iface.huawei_pay(args.pay_info, resultHandler);
            }
        }

        public AsyncProcessor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends AsyncIface> Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> getProcessMap(Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> processMap) {
            processMap.put("check_feedback_msg", new check_feedback_msg());
            processMap.put("get_credit", new get_credit());
            processMap.put("get_beta_user_types", new get_beta_user_types());
            processMap.put("get_beta_user_types_v2", new get_beta_user_types_v2());
            processMap.put("get_exploration_items", new get_exploration_items());
            processMap.put("get_activity_updated_time", new get_activity_updated_time());
            processMap.put("done_word_stat", new done_word_stat());
            processMap.put("analyze_clipboard", new analyze_clipboard());
            processMap.put("huawei_pay", new huawei_pay());
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

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.Iface
        public ClipboardResp analyze_clipboard(String code) throws SystemException, LogicException, TException {
            send_analyze_clipboard(code);
            return recv_analyze_clipboard();
        }

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.Iface
        public int check_feedback_msg(String device_id) throws SystemException, LogicException, TException {
            send_check_feedback_msg(device_id);
            return recv_check_feedback_msg();
        }

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.Iface
        public int done_word_stat(int book_id, List<DoneWordStatLog> stat_logs) throws SystemException, LogicException, TException {
            send_done_word_stat(book_id, stat_logs);
            return recv_done_word_stat();
        }

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.Iface
        public int get_activity_updated_time() throws SystemException, LogicException, TException {
            send_get_activity_updated_time();
            return recv_get_activity_updated_time();
        }

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.Iface
        public List<Integer> get_beta_user_types() throws SystemException, LogicException, TException {
            send_get_beta_user_types();
            return recv_get_beta_user_types();
        }

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.Iface
        public UserBetaInfo get_beta_user_types_v2() throws SystemException, LogicException, TException {
            send_get_beta_user_types_v2();
            return recv_get_beta_user_types_v2();
        }

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.Iface
        public int get_credit() throws SystemException, LogicException, TException {
            send_get_credit();
            return recv_get_credit();
        }

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.Iface
        public List<ExplorationItem> get_exploration_items() throws SystemException, LogicException, TException {
            send_get_exploration_items();
            return recv_get_exploration_items();
        }

        @Override // com.baicizhan.online.user_assistant_api.UserAssistantApiService.Iface
        public PayResp huawei_pay(HuaweiPayInfo pay_info) throws SystemException, LogicException, TException {
            send_huawei_pay(pay_info);
            return recv_huawei_pay();
        }

        public ClipboardResp recv_analyze_clipboard() throws SystemException, LogicException, TException {
            analyze_clipboard_result analyze_clipboard_resultVar = new analyze_clipboard_result();
            receiveBase(analyze_clipboard_resultVar, "analyze_clipboard");
            if (analyze_clipboard_resultVar.isSetSuccess()) {
                return analyze_clipboard_resultVar.success;
            }
            SystemException systemException = analyze_clipboard_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = analyze_clipboard_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "analyze_clipboard failed: unknown result");
        }

        public int recv_check_feedback_msg() throws SystemException, LogicException, TException {
            check_feedback_msg_result check_feedback_msg_resultVar = new check_feedback_msg_result();
            receiveBase(check_feedback_msg_resultVar, "check_feedback_msg");
            if (check_feedback_msg_resultVar.isSetSuccess()) {
                return check_feedback_msg_resultVar.success;
            }
            SystemException systemException = check_feedback_msg_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = check_feedback_msg_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "check_feedback_msg failed: unknown result");
        }

        public int recv_done_word_stat() throws SystemException, LogicException, TException {
            done_word_stat_result done_word_stat_resultVar = new done_word_stat_result();
            receiveBase(done_word_stat_resultVar, "done_word_stat");
            if (done_word_stat_resultVar.isSetSuccess()) {
                return done_word_stat_resultVar.success;
            }
            SystemException systemException = done_word_stat_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = done_word_stat_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "done_word_stat failed: unknown result");
        }

        public int recv_get_activity_updated_time() throws SystemException, LogicException, TException {
            get_activity_updated_time_result get_activity_updated_time_resultVar = new get_activity_updated_time_result();
            receiveBase(get_activity_updated_time_resultVar, "get_activity_updated_time");
            if (get_activity_updated_time_resultVar.isSetSuccess()) {
                return get_activity_updated_time_resultVar.success;
            }
            SystemException systemException = get_activity_updated_time_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_activity_updated_time_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_activity_updated_time failed: unknown result");
        }

        public List<Integer> recv_get_beta_user_types() throws SystemException, LogicException, TException {
            get_beta_user_types_result get_beta_user_types_resultVar = new get_beta_user_types_result();
            receiveBase(get_beta_user_types_resultVar, "get_beta_user_types");
            if (get_beta_user_types_resultVar.isSetSuccess()) {
                return get_beta_user_types_resultVar.success;
            }
            SystemException systemException = get_beta_user_types_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_beta_user_types_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_beta_user_types failed: unknown result");
        }

        public UserBetaInfo recv_get_beta_user_types_v2() throws SystemException, LogicException, TException {
            get_beta_user_types_v2_result get_beta_user_types_v2_resultVar = new get_beta_user_types_v2_result();
            receiveBase(get_beta_user_types_v2_resultVar, "get_beta_user_types_v2");
            if (get_beta_user_types_v2_resultVar.isSetSuccess()) {
                return get_beta_user_types_v2_resultVar.success;
            }
            SystemException systemException = get_beta_user_types_v2_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_beta_user_types_v2_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_beta_user_types_v2 failed: unknown result");
        }

        public int recv_get_credit() throws SystemException, LogicException, TException {
            get_credit_result get_credit_resultVar = new get_credit_result();
            receiveBase(get_credit_resultVar, "get_credit");
            if (get_credit_resultVar.isSetSuccess()) {
                return get_credit_resultVar.success;
            }
            SystemException systemException = get_credit_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_credit_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_credit failed: unknown result");
        }

        public List<ExplorationItem> recv_get_exploration_items() throws SystemException, LogicException, TException {
            get_exploration_items_result get_exploration_items_resultVar = new get_exploration_items_result();
            receiveBase(get_exploration_items_resultVar, "get_exploration_items");
            if (get_exploration_items_resultVar.isSetSuccess()) {
                return get_exploration_items_resultVar.success;
            }
            SystemException systemException = get_exploration_items_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_exploration_items_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_exploration_items failed: unknown result");
        }

        public PayResp recv_huawei_pay() throws SystemException, LogicException, TException {
            huawei_pay_result huawei_pay_resultVar = new huawei_pay_result();
            receiveBase(huawei_pay_resultVar, "huawei_pay");
            if (huawei_pay_resultVar.isSetSuccess()) {
                return huawei_pay_resultVar.success;
            }
            SystemException systemException = huawei_pay_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = huawei_pay_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "huawei_pay failed: unknown result");
        }

        public void send_analyze_clipboard(String code) throws TException {
            analyze_clipboard_args analyze_clipboard_argsVar = new analyze_clipboard_args();
            analyze_clipboard_argsVar.setCode(code);
            sendBase("analyze_clipboard", analyze_clipboard_argsVar);
        }

        public void send_check_feedback_msg(String device_id) throws TException {
            check_feedback_msg_args check_feedback_msg_argsVar = new check_feedback_msg_args();
            check_feedback_msg_argsVar.setDevice_id(device_id);
            sendBase("check_feedback_msg", check_feedback_msg_argsVar);
        }

        public void send_done_word_stat(int book_id, List<DoneWordStatLog> stat_logs) throws TException {
            done_word_stat_args done_word_stat_argsVar = new done_word_stat_args();
            done_word_stat_argsVar.setBook_id(book_id);
            done_word_stat_argsVar.setStat_logs(stat_logs);
            sendBase("done_word_stat", done_word_stat_argsVar);
        }

        public void send_get_activity_updated_time() throws TException {
            sendBase("get_activity_updated_time", new get_activity_updated_time_args());
        }

        public void send_get_beta_user_types() throws TException {
            sendBase("get_beta_user_types", new get_beta_user_types_args());
        }

        public void send_get_beta_user_types_v2() throws TException {
            sendBase("get_beta_user_types_v2", new get_beta_user_types_v2_args());
        }

        public void send_get_credit() throws TException {
            sendBase("get_credit", new get_credit_args());
        }

        public void send_get_exploration_items() throws TException {
            sendBase("get_exploration_items", new get_exploration_items_args());
        }

        public void send_huawei_pay(HuaweiPayInfo pay_info) throws TException {
            huawei_pay_args huawei_pay_argsVar = new huawei_pay_args();
            huawei_pay_argsVar.setPay_info(pay_info);
            sendBase("huawei_pay", huawei_pay_argsVar);
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
        ClipboardResp analyze_clipboard(String code) throws SystemException, LogicException, TException;

        int check_feedback_msg(String device_id) throws SystemException, LogicException, TException;

        int done_word_stat(int book_id, List<DoneWordStatLog> stat_logs) throws SystemException, LogicException, TException;

        int get_activity_updated_time() throws SystemException, LogicException, TException;

        List<Integer> get_beta_user_types() throws SystemException, LogicException, TException;

        UserBetaInfo get_beta_user_types_v2() throws SystemException, LogicException, TException;

        int get_credit() throws SystemException, LogicException, TException;

        List<ExplorationItem> get_exploration_items() throws SystemException, LogicException, TException;

        PayResp huawei_pay(HuaweiPayInfo pay_info) throws SystemException, LogicException, TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Processor<I extends Iface> extends TBaseProcessor<I> implements TProcessor {
        private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class analyze_clipboard<I extends Iface> extends ProcessFunction<I, analyze_clipboard_args> {
            public analyze_clipboard() {
                super("analyze_clipboard");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public analyze_clipboard_args getEmptyArgsInstance() {
                return new analyze_clipboard_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public analyze_clipboard_result getResult(I iface, analyze_clipboard_args args) throws TException {
                analyze_clipboard_result analyze_clipboard_resultVar = new analyze_clipboard_result();
                try {
                    analyze_clipboard_resultVar.success = iface.analyze_clipboard(args.code);
                    return analyze_clipboard_resultVar;
                } catch (LogicException e11) {
                    analyze_clipboard_resultVar.bomb = e11;
                    return analyze_clipboard_resultVar;
                } catch (SystemException e12) {
                    analyze_clipboard_resultVar.boom = e12;
                    return analyze_clipboard_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_feedback_msg<I extends Iface> extends ProcessFunction<I, check_feedback_msg_args> {
            public check_feedback_msg() {
                super("check_feedback_msg");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public check_feedback_msg_args getEmptyArgsInstance() {
                return new check_feedback_msg_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public check_feedback_msg_result getResult(I iface, check_feedback_msg_args args) throws TException {
                check_feedback_msg_result check_feedback_msg_resultVar = new check_feedback_msg_result();
                try {
                    check_feedback_msg_resultVar.success = iface.check_feedback_msg(args.device_id);
                    check_feedback_msg_resultVar.setSuccessIsSet(true);
                    return check_feedback_msg_resultVar;
                } catch (LogicException e11) {
                    check_feedback_msg_resultVar.bomb = e11;
                    return check_feedback_msg_resultVar;
                } catch (SystemException e12) {
                    check_feedback_msg_resultVar.boom = e12;
                    return check_feedback_msg_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class done_word_stat<I extends Iface> extends ProcessFunction<I, done_word_stat_args> {
            public done_word_stat() {
                super("done_word_stat");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public done_word_stat_args getEmptyArgsInstance() {
                return new done_word_stat_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public done_word_stat_result getResult(I iface, done_word_stat_args args) throws TException {
                done_word_stat_result done_word_stat_resultVar = new done_word_stat_result();
                try {
                    done_word_stat_resultVar.success = iface.done_word_stat(args.book_id, args.stat_logs);
                    done_word_stat_resultVar.setSuccessIsSet(true);
                    return done_word_stat_resultVar;
                } catch (LogicException e11) {
                    done_word_stat_resultVar.bomb = e11;
                    return done_word_stat_resultVar;
                } catch (SystemException e12) {
                    done_word_stat_resultVar.boom = e12;
                    return done_word_stat_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_activity_updated_time<I extends Iface> extends ProcessFunction<I, get_activity_updated_time_args> {
            public get_activity_updated_time() {
                super("get_activity_updated_time");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_activity_updated_time_args getEmptyArgsInstance() {
                return new get_activity_updated_time_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_activity_updated_time_result getResult(I iface, get_activity_updated_time_args args) throws TException {
                get_activity_updated_time_result get_activity_updated_time_resultVar = new get_activity_updated_time_result();
                try {
                    get_activity_updated_time_resultVar.success = iface.get_activity_updated_time();
                    get_activity_updated_time_resultVar.setSuccessIsSet(true);
                    return get_activity_updated_time_resultVar;
                } catch (LogicException e11) {
                    get_activity_updated_time_resultVar.bomb = e11;
                    return get_activity_updated_time_resultVar;
                } catch (SystemException e12) {
                    get_activity_updated_time_resultVar.boom = e12;
                    return get_activity_updated_time_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_beta_user_types<I extends Iface> extends ProcessFunction<I, get_beta_user_types_args> {
            public get_beta_user_types() {
                super("get_beta_user_types");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_beta_user_types_args getEmptyArgsInstance() {
                return new get_beta_user_types_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_beta_user_types_result getResult(I iface, get_beta_user_types_args args) throws TException {
                get_beta_user_types_result get_beta_user_types_resultVar = new get_beta_user_types_result();
                try {
                    get_beta_user_types_resultVar.success = iface.get_beta_user_types();
                    return get_beta_user_types_resultVar;
                } catch (LogicException e11) {
                    get_beta_user_types_resultVar.bomb = e11;
                    return get_beta_user_types_resultVar;
                } catch (SystemException e12) {
                    get_beta_user_types_resultVar.boom = e12;
                    return get_beta_user_types_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_beta_user_types_v2<I extends Iface> extends ProcessFunction<I, get_beta_user_types_v2_args> {
            public get_beta_user_types_v2() {
                super("get_beta_user_types_v2");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_beta_user_types_v2_args getEmptyArgsInstance() {
                return new get_beta_user_types_v2_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_beta_user_types_v2_result getResult(I iface, get_beta_user_types_v2_args args) throws TException {
                get_beta_user_types_v2_result get_beta_user_types_v2_resultVar = new get_beta_user_types_v2_result();
                try {
                    get_beta_user_types_v2_resultVar.success = iface.get_beta_user_types_v2();
                    return get_beta_user_types_v2_resultVar;
                } catch (LogicException e11) {
                    get_beta_user_types_v2_resultVar.bomb = e11;
                    return get_beta_user_types_v2_resultVar;
                } catch (SystemException e12) {
                    get_beta_user_types_v2_resultVar.boom = e12;
                    return get_beta_user_types_v2_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_credit<I extends Iface> extends ProcessFunction<I, get_credit_args> {
            public get_credit() {
                super("get_credit");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_credit_args getEmptyArgsInstance() {
                return new get_credit_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_credit_result getResult(I iface, get_credit_args args) throws TException {
                get_credit_result get_credit_resultVar = new get_credit_result();
                try {
                    get_credit_resultVar.success = iface.get_credit();
                    get_credit_resultVar.setSuccessIsSet(true);
                    return get_credit_resultVar;
                } catch (LogicException e11) {
                    get_credit_resultVar.bomb = e11;
                    return get_credit_resultVar;
                } catch (SystemException e12) {
                    get_credit_resultVar.boom = e12;
                    return get_credit_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_exploration_items<I extends Iface> extends ProcessFunction<I, get_exploration_items_args> {
            public get_exploration_items() {
                super("get_exploration_items");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_exploration_items_args getEmptyArgsInstance() {
                return new get_exploration_items_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_exploration_items_result getResult(I iface, get_exploration_items_args args) throws TException {
                get_exploration_items_result get_exploration_items_resultVar = new get_exploration_items_result();
                try {
                    get_exploration_items_resultVar.success = iface.get_exploration_items();
                    return get_exploration_items_resultVar;
                } catch (LogicException e11) {
                    get_exploration_items_resultVar.bomb = e11;
                    return get_exploration_items_resultVar;
                } catch (SystemException e12) {
                    get_exploration_items_resultVar.boom = e12;
                    return get_exploration_items_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class huawei_pay<I extends Iface> extends ProcessFunction<I, huawei_pay_args> {
            public huawei_pay() {
                super("huawei_pay");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public huawei_pay_args getEmptyArgsInstance() {
                return new huawei_pay_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public huawei_pay_result getResult(I iface, huawei_pay_args args) throws TException {
                huawei_pay_result huawei_pay_resultVar = new huawei_pay_result();
                try {
                    huawei_pay_resultVar.success = iface.huawei_pay(args.pay_info);
                    return huawei_pay_resultVar;
                } catch (LogicException e11) {
                    huawei_pay_resultVar.bomb = e11;
                    return huawei_pay_resultVar;
                } catch (SystemException e12) {
                    huawei_pay_resultVar.boom = e12;
                    return huawei_pay_resultVar;
                }
            }
        }

        public Processor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends Iface> Map<String, ProcessFunction<I, ? extends TBase>> getProcessMap(Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            processMap.put("check_feedback_msg", new check_feedback_msg());
            processMap.put("get_credit", new get_credit());
            processMap.put("get_beta_user_types", new get_beta_user_types());
            processMap.put("get_beta_user_types_v2", new get_beta_user_types_v2());
            processMap.put("get_exploration_items", new get_exploration_items());
            processMap.put("get_activity_updated_time", new get_activity_updated_time());
            processMap.put("done_word_stat", new done_word_stat());
            processMap.put("analyze_clipboard", new analyze_clipboard());
            processMap.put("huawei_pay", new huawei_pay());
            return processMap;
        }

        public Processor(I iface, Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            super(iface, getProcessMap(processMap));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class analyze_clipboard_args implements TBase<analyze_clipboard_args, _Fields>, Serializable, Cloneable, Comparable<analyze_clipboard_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public String code;
        private static final TStruct STRUCT_DESC = new TStruct("analyze_clipboard_args");
        private static final TField CODE_FIELD_DESC = new TField("code", (byte) 11, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            CODE(1, "code");

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
                return CODE;
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
        public static class analyze_clipboard_argsStandardScheme extends StandardScheme<analyze_clipboard_args> {
            private analyze_clipboard_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, analyze_clipboard_args struct) throws TException {
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
                        struct.code = iprot.readString();
                        struct.setCodeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, analyze_clipboard_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(analyze_clipboard_args.STRUCT_DESC);
                if (struct.code != null) {
                    oprot.writeFieldBegin(analyze_clipboard_args.CODE_FIELD_DESC);
                    oprot.writeString(struct.code);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class analyze_clipboard_argsStandardSchemeFactory implements SchemeFactory {
            private analyze_clipboard_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public analyze_clipboard_argsStandardScheme getScheme() {
                return new analyze_clipboard_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class analyze_clipboard_argsTupleScheme extends TupleScheme<analyze_clipboard_args> {
            private analyze_clipboard_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, analyze_clipboard_args struct) throws TException {
                struct.code = ((TTupleProtocol) prot).readString();
                struct.setCodeIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, analyze_clipboard_args struct) throws TException {
                ((TTupleProtocol) prot).writeString(struct.code);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class analyze_clipboard_argsTupleSchemeFactory implements SchemeFactory {
            private analyze_clipboard_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public analyze_clipboard_argsTupleScheme getScheme() {
                return new analyze_clipboard_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new analyze_clipboard_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new analyze_clipboard_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.CODE, (_Fields) new FieldMetaData("code", (byte) 1, new FieldValueMetaData((byte) 11)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(analyze_clipboard_args.class, unmodifiableMap);
        }

        public analyze_clipboard_args() {
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
            this.code = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof analyze_clipboard_args)) {
                return equals((analyze_clipboard_args) that);
            }
            return false;
        }

        public String getCode() {
            return this.code;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetCode() {
            return this.code != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public analyze_clipboard_args setCode(String code) {
            this.code = code;
            return this;
        }

        public void setCodeIsSet(boolean value) {
            if (value) {
                return;
            }
            this.code = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("analyze_clipboard_args(");
            sb2.append("code:");
            String str = this.code;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetCode() {
            this.code = null;
        }

        public void validate() throws TException {
            if (this.code != null) {
                return;
            }
            throw new TProtocolException("Required field 'code' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public analyze_clipboard_args(String code) {
            this();
            this.code = code;
        }

        @Override // java.lang.Comparable
        public int compareTo(analyze_clipboard_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetCode()).compareTo(Boolean.valueOf(other.isSetCode()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetCode() || (compareTo = TBaseHelper.compareTo(this.code, other.code)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<analyze_clipboard_args, _Fields> deepCopy2() {
            return new analyze_clipboard_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$analyze_clipboard_args$_Fields[field.ordinal()] == 1) {
                return getCode();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$analyze_clipboard_args$_Fields[field.ordinal()] == 1) {
                return isSetCode();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$analyze_clipboard_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetCode();
            } else {
                setCode((String) value);
            }
        }

        public boolean equals(analyze_clipboard_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetCode = isSetCode();
            boolean isSetCode2 = that.isSetCode();
            if (isSetCode || isSetCode2) {
                return isSetCode && isSetCode2 && this.code.equals(that.code);
            }
            return true;
        }

        public analyze_clipboard_args(analyze_clipboard_args other) {
            if (other.isSetCode()) {
                this.code = other.code;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class analyze_clipboard_result implements TBase<analyze_clipboard_result, _Fields>, Serializable, Cloneable, Comparable<analyze_clipboard_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public ClipboardResp success;
        private static final TStruct STRUCT_DESC = new TStruct("analyze_clipboard_result");
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
        public static class analyze_clipboard_resultStandardScheme extends StandardScheme<analyze_clipboard_result> {
            private analyze_clipboard_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, analyze_clipboard_result struct) throws TException {
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
                        ClipboardResp clipboardResp = new ClipboardResp();
                        struct.success = clipboardResp;
                        clipboardResp.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, analyze_clipboard_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(analyze_clipboard_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(analyze_clipboard_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(analyze_clipboard_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(analyze_clipboard_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class analyze_clipboard_resultStandardSchemeFactory implements SchemeFactory {
            private analyze_clipboard_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public analyze_clipboard_resultStandardScheme getScheme() {
                return new analyze_clipboard_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class analyze_clipboard_resultTupleScheme extends TupleScheme<analyze_clipboard_result> {
            private analyze_clipboard_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, analyze_clipboard_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    ClipboardResp clipboardResp = new ClipboardResp();
                    struct.success = clipboardResp;
                    clipboardResp.read(tTupleProtocol);
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
            public void write(TProtocol prot, analyze_clipboard_result struct) throws TException {
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
        public static class analyze_clipboard_resultTupleSchemeFactory implements SchemeFactory {
            private analyze_clipboard_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public analyze_clipboard_resultTupleScheme getScheme() {
                return new analyze_clipboard_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new analyze_clipboard_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new analyze_clipboard_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, ClipboardResp.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(analyze_clipboard_result.class, unmodifiableMap);
        }

        public analyze_clipboard_result() {
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
            if (that != null && (that instanceof analyze_clipboard_result)) {
                return equals((analyze_clipboard_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public ClipboardResp getSuccess() {
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

        public analyze_clipboard_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public analyze_clipboard_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public analyze_clipboard_result setSuccess(ClipboardResp success) {
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
            StringBuilder sb2 = new StringBuilder("analyze_clipboard_result(");
            sb2.append("success:");
            ClipboardResp clipboardResp = this.success;
            if (clipboardResp == null) {
                sb2.append("null");
            } else {
                sb2.append(clipboardResp);
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
            sb2.append(j.f81007d);
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
            ClipboardResp clipboardResp = this.success;
            if (clipboardResp != null) {
                clipboardResp.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public analyze_clipboard_result(ClipboardResp success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(analyze_clipboard_result other) {
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
        public TBase<analyze_clipboard_result, _Fields> deepCopy2() {
            return new analyze_clipboard_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$analyze_clipboard_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$analyze_clipboard_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$analyze_clipboard_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((ClipboardResp) value);
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

        public boolean equals(analyze_clipboard_result that) {
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

        public analyze_clipboard_result(analyze_clipboard_result other) {
            if (other.isSetSuccess()) {
                this.success = new ClipboardResp(other.success);
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
    public static class check_feedback_msg_args implements TBase<check_feedback_msg_args, _Fields>, Serializable, Cloneable, Comparable<check_feedback_msg_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public String device_id;
        private static final TStruct STRUCT_DESC = new TStruct("check_feedback_msg_args");
        private static final TField DEVICE_ID_FIELD_DESC = new TField("device_id", (byte) 11, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            DEVICE_ID(1, "device_id");

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
                return DEVICE_ID;
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
        public static class check_feedback_msg_argsStandardScheme extends StandardScheme<check_feedback_msg_args> {
            private check_feedback_msg_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, check_feedback_msg_args struct) throws TException {
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
                        struct.device_id = iprot.readString();
                        struct.setDevice_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, check_feedback_msg_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(check_feedback_msg_args.STRUCT_DESC);
                if (struct.device_id != null) {
                    oprot.writeFieldBegin(check_feedback_msg_args.DEVICE_ID_FIELD_DESC);
                    oprot.writeString(struct.device_id);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_feedback_msg_argsStandardSchemeFactory implements SchemeFactory {
            private check_feedback_msg_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_feedback_msg_argsStandardScheme getScheme() {
                return new check_feedback_msg_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_feedback_msg_argsTupleScheme extends TupleScheme<check_feedback_msg_args> {
            private check_feedback_msg_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, check_feedback_msg_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                if (tTupleProtocol.readBitSet(1).get(0)) {
                    struct.device_id = tTupleProtocol.readString();
                    struct.setDevice_idIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, check_feedback_msg_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetDevice_id()) {
                    bitSet.set(0);
                }
                tTupleProtocol.writeBitSet(bitSet, 1);
                if (struct.isSetDevice_id()) {
                    tTupleProtocol.writeString(struct.device_id);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_feedback_msg_argsTupleSchemeFactory implements SchemeFactory {
            private check_feedback_msg_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_feedback_msg_argsTupleScheme getScheme() {
                return new check_feedback_msg_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new check_feedback_msg_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new check_feedback_msg_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.DEVICE_ID, (_Fields) new FieldMetaData("device_id", (byte) 3, new FieldValueMetaData((byte) 11)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(check_feedback_msg_args.class, unmodifiableMap);
        }

        public check_feedback_msg_args() {
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
            this.device_id = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof check_feedback_msg_args)) {
                return equals((check_feedback_msg_args) that);
            }
            return false;
        }

        public String getDevice_id() {
            return this.device_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetDevice_id() {
            return this.device_id != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public check_feedback_msg_args setDevice_id(String device_id) {
            this.device_id = device_id;
            return this;
        }

        public void setDevice_idIsSet(boolean value) {
            if (value) {
                return;
            }
            this.device_id = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("check_feedback_msg_args(");
            sb2.append("device_id:");
            String str = this.device_id;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetDevice_id() {
            this.device_id = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public check_feedback_msg_args(String device_id) {
            this();
            this.device_id = device_id;
        }

        @Override // java.lang.Comparable
        public int compareTo(check_feedback_msg_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetDevice_id()).compareTo(Boolean.valueOf(other.isSetDevice_id()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetDevice_id() || (compareTo = TBaseHelper.compareTo(this.device_id, other.device_id)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<check_feedback_msg_args, _Fields> deepCopy2() {
            return new check_feedback_msg_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$check_feedback_msg_args$_Fields[field.ordinal()] == 1) {
                return getDevice_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$check_feedback_msg_args$_Fields[field.ordinal()] == 1) {
                return isSetDevice_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$check_feedback_msg_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetDevice_id();
            } else {
                setDevice_id((String) value);
            }
        }

        public boolean equals(check_feedback_msg_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetDevice_id = isSetDevice_id();
            boolean isSetDevice_id2 = that.isSetDevice_id();
            if (isSetDevice_id || isSetDevice_id2) {
                return isSetDevice_id && isSetDevice_id2 && this.device_id.equals(that.device_id);
            }
            return true;
        }

        public check_feedback_msg_args(check_feedback_msg_args other) {
            if (other.isSetDevice_id()) {
                this.device_id = other.device_id;
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class check_feedback_msg_result implements TBase<check_feedback_msg_result, _Fields>, Serializable, Cloneable, Comparable<check_feedback_msg_result> {
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public LogicException bomb;
        public SystemException boom;
        public int success;
        private static final TStruct STRUCT_DESC = new TStruct("check_feedback_msg_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 8, 0);
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
        public static class check_feedback_msg_resultStandardScheme extends StandardScheme<check_feedback_msg_result> {
            private check_feedback_msg_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, check_feedback_msg_result struct) throws TException {
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
            public void write(TProtocol oprot, check_feedback_msg_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(check_feedback_msg_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(check_feedback_msg_result.SUCCESS_FIELD_DESC);
                    oprot.writeI32(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(check_feedback_msg_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(check_feedback_msg_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_feedback_msg_resultStandardSchemeFactory implements SchemeFactory {
            private check_feedback_msg_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_feedback_msg_resultStandardScheme getScheme() {
                return new check_feedback_msg_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_feedback_msg_resultTupleScheme extends TupleScheme<check_feedback_msg_result> {
            private check_feedback_msg_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, check_feedback_msg_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    struct.success = tTupleProtocol.readI32();
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
            public void write(TProtocol prot, check_feedback_msg_result struct) throws TException {
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
                    tTupleProtocol.writeI32(struct.success);
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
        public static class check_feedback_msg_resultTupleSchemeFactory implements SchemeFactory {
            private check_feedback_msg_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_feedback_msg_resultTupleScheme getScheme() {
                return new check_feedback_msg_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new check_feedback_msg_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new check_feedback_msg_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(check_feedback_msg_result.class, unmodifiableMap);
        }

        public check_feedback_msg_result() {
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
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof check_feedback_msg_result)) {
                return equals((check_feedback_msg_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public int getSuccess() {
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
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public check_feedback_msg_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public check_feedback_msg_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public check_feedback_msg_result setSuccess(int success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("check_feedback_msg_result(");
            sb2.append("success:");
            sb2.append(this.success);
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
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(check_feedback_msg_result other) {
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
        public TBase<check_feedback_msg_result, _Fields> deepCopy2() {
            return new check_feedback_msg_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$check_feedback_msg_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getSuccess());
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$check_feedback_msg_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$check_feedback_msg_result$_Fields[field.ordinal()];
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

        public check_feedback_msg_result(int success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.boom = boom;
            this.bomb = bomb;
        }

        public boolean equals(check_feedback_msg_result that) {
            if (that == null || this.success != that.success) {
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

        public check_feedback_msg_result(check_feedback_msg_result other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.success = other.success;
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
    public static class done_word_stat_args implements TBase<done_word_stat_args, _Fields>, Serializable, Cloneable, Comparable<done_word_stat_args> {
        private static final int __BOOK_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int book_id;
        public List<DoneWordStatLog> stat_logs;
        private static final TStruct STRUCT_DESC = new TStruct("done_word_stat_args");
        private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 1);
        private static final TField STAT_LOGS_FIELD_DESC = new TField("stat_logs", (byte) 15, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            BOOK_ID(1, "book_id"),
            STAT_LOGS(2, "stat_logs");

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
                    return BOOK_ID;
                }
                if (fieldId != 2) {
                    return null;
                }
                return STAT_LOGS;
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
        public static class done_word_stat_argsStandardScheme extends StandardScheme<done_word_stat_args> {
            private done_word_stat_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, done_word_stat_args struct) throws TException {
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
                            struct.stat_logs = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                DoneWordStatLog doneWordStatLog = new DoneWordStatLog();
                                doneWordStatLog.read(iprot);
                                struct.stat_logs.add(doneWordStatLog);
                            }
                            iprot.readListEnd();
                            struct.setStat_logsIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
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
            public void write(TProtocol oprot, done_word_stat_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(done_word_stat_args.STRUCT_DESC);
                oprot.writeFieldBegin(done_word_stat_args.BOOK_ID_FIELD_DESC);
                oprot.writeI32(struct.book_id);
                oprot.writeFieldEnd();
                if (struct.stat_logs != null) {
                    oprot.writeFieldBegin(done_word_stat_args.STAT_LOGS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.stat_logs.size()));
                    Iterator<DoneWordStatLog> it = struct.stat_logs.iterator();
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
        public static class done_word_stat_argsStandardSchemeFactory implements SchemeFactory {
            private done_word_stat_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public done_word_stat_argsStandardScheme getScheme() {
                return new done_word_stat_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class done_word_stat_argsTupleScheme extends TupleScheme<done_word_stat_args> {
            private done_word_stat_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, done_word_stat_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.book_id = tTupleProtocol.readI32();
                struct.setBook_idIsSet(true);
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.stat_logs = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    DoneWordStatLog doneWordStatLog = new DoneWordStatLog();
                    doneWordStatLog.read(tTupleProtocol);
                    struct.stat_logs.add(doneWordStatLog);
                }
                struct.setStat_logsIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, done_word_stat_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.book_id);
                tTupleProtocol.writeI32(struct.stat_logs.size());
                Iterator<DoneWordStatLog> it = struct.stat_logs.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class done_word_stat_argsTupleSchemeFactory implements SchemeFactory {
            private done_word_stat_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public done_word_stat_argsTupleScheme getScheme() {
                return new done_word_stat_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new done_word_stat_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new done_word_stat_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.STAT_LOGS, (_Fields) new FieldMetaData("stat_logs", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, DoneWordStatLog.class))));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(done_word_stat_args.class, unmodifiableMap);
        }

        public done_word_stat_args() {
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

        public void addToStat_logs(DoneWordStatLog elem) {
            if (this.stat_logs == null) {
                this.stat_logs = new ArrayList();
            }
            this.stat_logs.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            setBook_idIsSet(false);
            this.book_id = 0;
            this.stat_logs = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof done_word_stat_args)) {
                return equals((done_word_stat_args) that);
            }
            return false;
        }

        public int getBook_id() {
            return this.book_id;
        }

        public List<DoneWordStatLog> getStat_logs() {
            return this.stat_logs;
        }

        public Iterator<DoneWordStatLog> getStat_logsIterator() {
            List<DoneWordStatLog> list = this.stat_logs;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getStat_logsSize() {
            List<DoneWordStatLog> list = this.stat_logs;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBook_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        public boolean isSetStat_logs() {
            return this.stat_logs != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public done_word_stat_args setBook_id(int book_id) {
            this.book_id = book_id;
            setBook_idIsSet(true);
            return this;
        }

        public void setBook_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public done_word_stat_args setStat_logs(List<DoneWordStatLog> stat_logs) {
            this.stat_logs = stat_logs;
            return this;
        }

        public void setStat_logsIsSet(boolean value) {
            if (value) {
                return;
            }
            this.stat_logs = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("done_word_stat_args(");
            sb2.append("book_id:");
            sb2.append(this.book_id);
            sb2.append(j2.O);
            sb2.append("stat_logs:");
            List<DoneWordStatLog> list = this.stat_logs;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetBook_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        public void unsetStat_logs() {
            this.stat_logs = null;
        }

        public void validate() throws TException {
            if (this.stat_logs != null) {
                return;
            }
            throw new TProtocolException("Required field 'stat_logs' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(done_word_stat_args other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetBook_id()).compareTo(Boolean.valueOf(other.isSetBook_id()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetBook_id() && (compareTo2 = TBaseHelper.compareTo(this.book_id, other.book_id)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetStat_logs()).compareTo(Boolean.valueOf(other.isSetStat_logs()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetStat_logs() || (compareTo = TBaseHelper.compareTo((List) this.stat_logs, (List) other.stat_logs)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<done_word_stat_args, _Fields> deepCopy2() {
            return new done_word_stat_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$done_word_stat_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getBook_id());
            }
            if (i11 == 2) {
                return getStat_logs();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$done_word_stat_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetBook_id();
            }
            if (i11 == 2) {
                return isSetStat_logs();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$done_word_stat_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetBook_id();
                    return;
                } else {
                    setBook_id(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetStat_logs();
            } else {
                setStat_logs((List) value);
            }
        }

        public done_word_stat_args(int book_id, List<DoneWordStatLog> stat_logs) {
            this();
            this.book_id = book_id;
            setBook_idIsSet(true);
            this.stat_logs = stat_logs;
        }

        public boolean equals(done_word_stat_args that) {
            if (that == null || this.book_id != that.book_id) {
                return false;
            }
            boolean isSetStat_logs = isSetStat_logs();
            boolean isSetStat_logs2 = that.isSetStat_logs();
            if (isSetStat_logs || isSetStat_logs2) {
                return isSetStat_logs && isSetStat_logs2 && this.stat_logs.equals(that.stat_logs);
            }
            return true;
        }

        public done_word_stat_args(done_word_stat_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.book_id = other.book_id;
            if (other.isSetStat_logs()) {
                ArrayList arrayList = new ArrayList(other.stat_logs.size());
                Iterator<DoneWordStatLog> it = other.stat_logs.iterator();
                while (it.hasNext()) {
                    arrayList.add(new DoneWordStatLog(it.next()));
                }
                this.stat_logs = arrayList;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class done_word_stat_result implements TBase<done_word_stat_result, _Fields>, Serializable, Cloneable, Comparable<done_word_stat_result> {
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public LogicException bomb;
        public SystemException boom;
        public int success;
        private static final TStruct STRUCT_DESC = new TStruct("done_word_stat_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 8, 0);
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
        public static class done_word_stat_resultStandardScheme extends StandardScheme<done_word_stat_result> {
            private done_word_stat_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, done_word_stat_result struct) throws TException {
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
            public void write(TProtocol oprot, done_word_stat_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(done_word_stat_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(done_word_stat_result.SUCCESS_FIELD_DESC);
                    oprot.writeI32(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(done_word_stat_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(done_word_stat_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class done_word_stat_resultStandardSchemeFactory implements SchemeFactory {
            private done_word_stat_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public done_word_stat_resultStandardScheme getScheme() {
                return new done_word_stat_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class done_word_stat_resultTupleScheme extends TupleScheme<done_word_stat_result> {
            private done_word_stat_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, done_word_stat_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    struct.success = tTupleProtocol.readI32();
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
            public void write(TProtocol prot, done_word_stat_result struct) throws TException {
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
                    tTupleProtocol.writeI32(struct.success);
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
        public static class done_word_stat_resultTupleSchemeFactory implements SchemeFactory {
            private done_word_stat_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public done_word_stat_resultTupleScheme getScheme() {
                return new done_word_stat_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new done_word_stat_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new done_word_stat_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(done_word_stat_result.class, unmodifiableMap);
        }

        public done_word_stat_result() {
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
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof done_word_stat_result)) {
                return equals((done_word_stat_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public int getSuccess() {
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
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public done_word_stat_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public done_word_stat_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public done_word_stat_result setSuccess(int success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("done_word_stat_result(");
            sb2.append("success:");
            sb2.append(this.success);
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
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(done_word_stat_result other) {
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
        public TBase<done_word_stat_result, _Fields> deepCopy2() {
            return new done_word_stat_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$done_word_stat_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getSuccess());
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$done_word_stat_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$done_word_stat_result$_Fields[field.ordinal()];
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

        public done_word_stat_result(int success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.boom = boom;
            this.bomb = bomb;
        }

        public boolean equals(done_word_stat_result that) {
            if (that == null || this.success != that.success) {
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

        public done_word_stat_result(done_word_stat_result other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.success = other.success;
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
    public static class get_activity_updated_time_args implements TBase<get_activity_updated_time_args, _Fields>, Serializable, Cloneable, Comparable<get_activity_updated_time_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_activity_updated_time_args");
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
        public static class get_activity_updated_time_argsStandardScheme extends StandardScheme<get_activity_updated_time_args> {
            private get_activity_updated_time_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_activity_updated_time_args struct) throws TException {
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
            public void write(TProtocol oprot, get_activity_updated_time_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_activity_updated_time_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_activity_updated_time_argsStandardSchemeFactory implements SchemeFactory {
            private get_activity_updated_time_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_activity_updated_time_argsStandardScheme getScheme() {
                return new get_activity_updated_time_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_activity_updated_time_argsTupleScheme extends TupleScheme<get_activity_updated_time_args> {
            private get_activity_updated_time_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_activity_updated_time_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_activity_updated_time_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_activity_updated_time_argsTupleSchemeFactory implements SchemeFactory {
            private get_activity_updated_time_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_activity_updated_time_argsTupleScheme getScheme() {
                return new get_activity_updated_time_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_activity_updated_time_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_activity_updated_time_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_activity_updated_time_args.class, unmodifiableMap);
        }

        public get_activity_updated_time_args() {
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

        public boolean equals(get_activity_updated_time_args that) {
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
            return "get_activity_updated_time_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_activity_updated_time_args(get_activity_updated_time_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_activity_updated_time_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_activity_updated_time_args, _Fields> deepCopy2() {
            return new get_activity_updated_time_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_activity_updated_time_args)) {
                return equals((get_activity_updated_time_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_activity_updated_time_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_activity_updated_time_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_activity_updated_time_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_activity_updated_time_result implements TBase<get_activity_updated_time_result, _Fields>, Serializable, Cloneable, Comparable<get_activity_updated_time_result> {
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public LogicException bomb;
        public SystemException boom;
        public int success;
        private static final TStruct STRUCT_DESC = new TStruct("get_activity_updated_time_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 8, 0);
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
        public static class get_activity_updated_time_resultStandardScheme extends StandardScheme<get_activity_updated_time_result> {
            private get_activity_updated_time_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_activity_updated_time_result struct) throws TException {
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
            public void write(TProtocol oprot, get_activity_updated_time_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_activity_updated_time_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(get_activity_updated_time_result.SUCCESS_FIELD_DESC);
                    oprot.writeI32(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_activity_updated_time_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_activity_updated_time_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_activity_updated_time_resultStandardSchemeFactory implements SchemeFactory {
            private get_activity_updated_time_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_activity_updated_time_resultStandardScheme getScheme() {
                return new get_activity_updated_time_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_activity_updated_time_resultTupleScheme extends TupleScheme<get_activity_updated_time_result> {
            private get_activity_updated_time_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_activity_updated_time_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    struct.success = tTupleProtocol.readI32();
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
            public void write(TProtocol prot, get_activity_updated_time_result struct) throws TException {
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
                    tTupleProtocol.writeI32(struct.success);
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
        public static class get_activity_updated_time_resultTupleSchemeFactory implements SchemeFactory {
            private get_activity_updated_time_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_activity_updated_time_resultTupleScheme getScheme() {
                return new get_activity_updated_time_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_activity_updated_time_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_activity_updated_time_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_activity_updated_time_result.class, unmodifiableMap);
        }

        public get_activity_updated_time_result() {
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
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_activity_updated_time_result)) {
                return equals((get_activity_updated_time_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public int getSuccess() {
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
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_activity_updated_time_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_activity_updated_time_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_activity_updated_time_result setSuccess(int success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_activity_updated_time_result(");
            sb2.append("success:");
            sb2.append(this.success);
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
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_activity_updated_time_result other) {
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
        public TBase<get_activity_updated_time_result, _Fields> deepCopy2() {
            return new get_activity_updated_time_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_activity_updated_time_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getSuccess());
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_activity_updated_time_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_activity_updated_time_result$_Fields[field.ordinal()];
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

        public get_activity_updated_time_result(int success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.boom = boom;
            this.bomb = bomb;
        }

        public boolean equals(get_activity_updated_time_result that) {
            if (that == null || this.success != that.success) {
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

        public get_activity_updated_time_result(get_activity_updated_time_result other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.success = other.success;
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
    public static class get_beta_user_types_args implements TBase<get_beta_user_types_args, _Fields>, Serializable, Cloneable, Comparable<get_beta_user_types_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_beta_user_types_args");
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
        public static class get_beta_user_types_argsStandardScheme extends StandardScheme<get_beta_user_types_args> {
            private get_beta_user_types_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_beta_user_types_args struct) throws TException {
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
            public void write(TProtocol oprot, get_beta_user_types_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_beta_user_types_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_beta_user_types_argsStandardSchemeFactory implements SchemeFactory {
            private get_beta_user_types_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_beta_user_types_argsStandardScheme getScheme() {
                return new get_beta_user_types_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_beta_user_types_argsTupleScheme extends TupleScheme<get_beta_user_types_args> {
            private get_beta_user_types_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_beta_user_types_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_beta_user_types_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_beta_user_types_argsTupleSchemeFactory implements SchemeFactory {
            private get_beta_user_types_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_beta_user_types_argsTupleScheme getScheme() {
                return new get_beta_user_types_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_beta_user_types_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_beta_user_types_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_beta_user_types_args.class, unmodifiableMap);
        }

        public get_beta_user_types_args() {
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

        public boolean equals(get_beta_user_types_args that) {
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
            return "get_beta_user_types_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_beta_user_types_args(get_beta_user_types_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_beta_user_types_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_beta_user_types_args, _Fields> deepCopy2() {
            return new get_beta_user_types_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_beta_user_types_args)) {
                return equals((get_beta_user_types_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_beta_user_types_result implements TBase<get_beta_user_types_result, _Fields>, Serializable, Cloneable, Comparable<get_beta_user_types_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<Integer> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_beta_user_types_result");
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
        public static class get_beta_user_types_resultStandardScheme extends StandardScheme<get_beta_user_types_result> {
            private get_beta_user_types_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_beta_user_types_result struct) throws TException {
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
            public void write(TProtocol oprot, get_beta_user_types_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_beta_user_types_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_beta_user_types_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 8, struct.success.size()));
                    Iterator<Integer> it = struct.success.iterator();
                    while (it.hasNext()) {
                        oprot.writeI32(it.next().intValue());
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_beta_user_types_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_beta_user_types_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_beta_user_types_resultStandardSchemeFactory implements SchemeFactory {
            private get_beta_user_types_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_beta_user_types_resultStandardScheme getScheme() {
                return new get_beta_user_types_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_beta_user_types_resultTupleScheme extends TupleScheme<get_beta_user_types_result> {
            private get_beta_user_types_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_beta_user_types_result struct) throws TException {
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
            public void write(TProtocol prot, get_beta_user_types_result struct) throws TException {
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
                    Iterator<Integer> it = struct.success.iterator();
                    while (it.hasNext()) {
                        tTupleProtocol.writeI32(it.next().intValue());
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
        public static class get_beta_user_types_resultTupleSchemeFactory implements SchemeFactory {
            private get_beta_user_types_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_beta_user_types_resultTupleScheme getScheme() {
                return new get_beta_user_types_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_beta_user_types_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_beta_user_types_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_beta_user_types_result.class, unmodifiableMap);
        }

        public get_beta_user_types_result() {
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
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_beta_user_types_result)) {
                return equals((get_beta_user_types_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
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

        public get_beta_user_types_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_beta_user_types_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_beta_user_types_result setSuccess(List<Integer> success) {
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
            StringBuilder sb2 = new StringBuilder("get_beta_user_types_result(");
            sb2.append("success:");
            List<Integer> list = this.success;
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
            sb2.append(j.f81007d);
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

        public get_beta_user_types_result(List<Integer> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_beta_user_types_result other) {
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
        public TBase<get_beta_user_types_result, _Fields> deepCopy2() {
            return new get_beta_user_types_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_result$_Fields[field.ordinal()];
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

        public boolean equals(get_beta_user_types_result that) {
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

        public get_beta_user_types_result(get_beta_user_types_result other) {
            if (other.isSetSuccess()) {
                this.success = new ArrayList(other.success);
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
    public static class get_beta_user_types_v2_args implements TBase<get_beta_user_types_v2_args, _Fields>, Serializable, Cloneable, Comparable<get_beta_user_types_v2_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_beta_user_types_v2_args");
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
        public static class get_beta_user_types_v2_argsStandardScheme extends StandardScheme<get_beta_user_types_v2_args> {
            private get_beta_user_types_v2_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_beta_user_types_v2_args struct) throws TException {
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
            public void write(TProtocol oprot, get_beta_user_types_v2_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_beta_user_types_v2_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_beta_user_types_v2_argsStandardSchemeFactory implements SchemeFactory {
            private get_beta_user_types_v2_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_beta_user_types_v2_argsStandardScheme getScheme() {
                return new get_beta_user_types_v2_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_beta_user_types_v2_argsTupleScheme extends TupleScheme<get_beta_user_types_v2_args> {
            private get_beta_user_types_v2_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_beta_user_types_v2_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_beta_user_types_v2_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_beta_user_types_v2_argsTupleSchemeFactory implements SchemeFactory {
            private get_beta_user_types_v2_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_beta_user_types_v2_argsTupleScheme getScheme() {
                return new get_beta_user_types_v2_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_beta_user_types_v2_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_beta_user_types_v2_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_beta_user_types_v2_args.class, unmodifiableMap);
        }

        public get_beta_user_types_v2_args() {
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

        public boolean equals(get_beta_user_types_v2_args that) {
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
            return "get_beta_user_types_v2_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_beta_user_types_v2_args(get_beta_user_types_v2_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_beta_user_types_v2_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_beta_user_types_v2_args, _Fields> deepCopy2() {
            return new get_beta_user_types_v2_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_beta_user_types_v2_args)) {
                return equals((get_beta_user_types_v2_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_v2_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_v2_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_v2_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_beta_user_types_v2_result implements TBase<get_beta_user_types_v2_result, _Fields>, Serializable, Cloneable, Comparable<get_beta_user_types_v2_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public UserBetaInfo success;
        private static final TStruct STRUCT_DESC = new TStruct("get_beta_user_types_v2_result");
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
        public static class get_beta_user_types_v2_resultStandardScheme extends StandardScheme<get_beta_user_types_v2_result> {
            private get_beta_user_types_v2_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_beta_user_types_v2_result struct) throws TException {
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
                        UserBetaInfo userBetaInfo = new UserBetaInfo();
                        struct.success = userBetaInfo;
                        userBetaInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_beta_user_types_v2_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_beta_user_types_v2_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_beta_user_types_v2_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_beta_user_types_v2_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_beta_user_types_v2_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_beta_user_types_v2_resultStandardSchemeFactory implements SchemeFactory {
            private get_beta_user_types_v2_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_beta_user_types_v2_resultStandardScheme getScheme() {
                return new get_beta_user_types_v2_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_beta_user_types_v2_resultTupleScheme extends TupleScheme<get_beta_user_types_v2_result> {
            private get_beta_user_types_v2_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_beta_user_types_v2_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    UserBetaInfo userBetaInfo = new UserBetaInfo();
                    struct.success = userBetaInfo;
                    userBetaInfo.read(tTupleProtocol);
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
            public void write(TProtocol prot, get_beta_user_types_v2_result struct) throws TException {
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
        public static class get_beta_user_types_v2_resultTupleSchemeFactory implements SchemeFactory {
            private get_beta_user_types_v2_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_beta_user_types_v2_resultTupleScheme getScheme() {
                return new get_beta_user_types_v2_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_beta_user_types_v2_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_beta_user_types_v2_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, UserBetaInfo.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_beta_user_types_v2_result.class, unmodifiableMap);
        }

        public get_beta_user_types_v2_result() {
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
            if (that != null && (that instanceof get_beta_user_types_v2_result)) {
                return equals((get_beta_user_types_v2_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public UserBetaInfo getSuccess() {
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

        public get_beta_user_types_v2_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_beta_user_types_v2_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_beta_user_types_v2_result setSuccess(UserBetaInfo success) {
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
            StringBuilder sb2 = new StringBuilder("get_beta_user_types_v2_result(");
            sb2.append("success:");
            UserBetaInfo userBetaInfo = this.success;
            if (userBetaInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(userBetaInfo);
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
            sb2.append(j.f81007d);
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
            UserBetaInfo userBetaInfo = this.success;
            if (userBetaInfo != null) {
                userBetaInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_beta_user_types_v2_result(UserBetaInfo success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_beta_user_types_v2_result other) {
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
        public TBase<get_beta_user_types_v2_result, _Fields> deepCopy2() {
            return new get_beta_user_types_v2_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_v2_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_v2_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_beta_user_types_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((UserBetaInfo) value);
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

        public boolean equals(get_beta_user_types_v2_result that) {
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

        public get_beta_user_types_v2_result(get_beta_user_types_v2_result other) {
            if (other.isSetSuccess()) {
                this.success = new UserBetaInfo(other.success);
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
    public static class get_credit_args implements TBase<get_credit_args, _Fields>, Serializable, Cloneable, Comparable<get_credit_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_credit_args");
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
        public static class get_credit_argsStandardScheme extends StandardScheme<get_credit_args> {
            private get_credit_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_credit_args struct) throws TException {
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
            public void write(TProtocol oprot, get_credit_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_credit_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_credit_argsStandardSchemeFactory implements SchemeFactory {
            private get_credit_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_credit_argsStandardScheme getScheme() {
                return new get_credit_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_credit_argsTupleScheme extends TupleScheme<get_credit_args> {
            private get_credit_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_credit_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_credit_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_credit_argsTupleSchemeFactory implements SchemeFactory {
            private get_credit_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_credit_argsTupleScheme getScheme() {
                return new get_credit_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_credit_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_credit_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_credit_args.class, unmodifiableMap);
        }

        public get_credit_args() {
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

        public boolean equals(get_credit_args that) {
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
            return "get_credit_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_credit_args(get_credit_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_credit_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_credit_args, _Fields> deepCopy2() {
            return new get_credit_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_credit_args)) {
                return equals((get_credit_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_credit_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_credit_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_credit_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_credit_result implements TBase<get_credit_result, _Fields>, Serializable, Cloneable, Comparable<get_credit_result> {
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public LogicException bomb;
        public SystemException boom;
        public int success;
        private static final TStruct STRUCT_DESC = new TStruct("get_credit_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 8, 0);
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
        public static class get_credit_resultStandardScheme extends StandardScheme<get_credit_result> {
            private get_credit_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_credit_result struct) throws TException {
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
            public void write(TProtocol oprot, get_credit_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_credit_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(get_credit_result.SUCCESS_FIELD_DESC);
                    oprot.writeI32(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_credit_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_credit_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_credit_resultStandardSchemeFactory implements SchemeFactory {
            private get_credit_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_credit_resultStandardScheme getScheme() {
                return new get_credit_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_credit_resultTupleScheme extends TupleScheme<get_credit_result> {
            private get_credit_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_credit_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    struct.success = tTupleProtocol.readI32();
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
            public void write(TProtocol prot, get_credit_result struct) throws TException {
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
                    tTupleProtocol.writeI32(struct.success);
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
        public static class get_credit_resultTupleSchemeFactory implements SchemeFactory {
            private get_credit_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_credit_resultTupleScheme getScheme() {
                return new get_credit_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_credit_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_credit_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_credit_result.class, unmodifiableMap);
        }

        public get_credit_result() {
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
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_credit_result)) {
                return equals((get_credit_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public int getSuccess() {
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
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_credit_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_credit_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_credit_result setSuccess(int success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_credit_result(");
            sb2.append("success:");
            sb2.append(this.success);
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
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_credit_result other) {
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
        public TBase<get_credit_result, _Fields> deepCopy2() {
            return new get_credit_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_credit_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getSuccess());
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_credit_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_credit_result$_Fields[field.ordinal()];
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

        public get_credit_result(int success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.boom = boom;
            this.bomb = bomb;
        }

        public boolean equals(get_credit_result that) {
            if (that == null || this.success != that.success) {
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

        public get_credit_result(get_credit_result other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.success = other.success;
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
    public static class get_exploration_items_args implements TBase<get_exploration_items_args, _Fields>, Serializable, Cloneable, Comparable<get_exploration_items_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_exploration_items_args");
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
        public static class get_exploration_items_argsStandardScheme extends StandardScheme<get_exploration_items_args> {
            private get_exploration_items_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_exploration_items_args struct) throws TException {
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
            public void write(TProtocol oprot, get_exploration_items_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_exploration_items_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_exploration_items_argsStandardSchemeFactory implements SchemeFactory {
            private get_exploration_items_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_exploration_items_argsStandardScheme getScheme() {
                return new get_exploration_items_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_exploration_items_argsTupleScheme extends TupleScheme<get_exploration_items_args> {
            private get_exploration_items_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_exploration_items_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_exploration_items_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_exploration_items_argsTupleSchemeFactory implements SchemeFactory {
            private get_exploration_items_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_exploration_items_argsTupleScheme getScheme() {
                return new get_exploration_items_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_exploration_items_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_exploration_items_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_exploration_items_args.class, unmodifiableMap);
        }

        public get_exploration_items_args() {
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

        public boolean equals(get_exploration_items_args that) {
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
            return "get_exploration_items_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_exploration_items_args(get_exploration_items_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_exploration_items_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_exploration_items_args, _Fields> deepCopy2() {
            return new get_exploration_items_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_exploration_items_args)) {
                return equals((get_exploration_items_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_exploration_items_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_exploration_items_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_exploration_items_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_exploration_items_result implements TBase<get_exploration_items_result, _Fields>, Serializable, Cloneable, Comparable<get_exploration_items_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<ExplorationItem> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_exploration_items_result");
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
        public static class get_exploration_items_resultStandardScheme extends StandardScheme<get_exploration_items_result> {
            private get_exploration_items_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_exploration_items_result struct) throws TException {
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
                            ExplorationItem explorationItem = new ExplorationItem();
                            explorationItem.read(iprot);
                            struct.success.add(explorationItem);
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
            public void write(TProtocol oprot, get_exploration_items_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_exploration_items_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_exploration_items_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<ExplorationItem> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_exploration_items_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_exploration_items_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_exploration_items_resultStandardSchemeFactory implements SchemeFactory {
            private get_exploration_items_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_exploration_items_resultStandardScheme getScheme() {
                return new get_exploration_items_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_exploration_items_resultTupleScheme extends TupleScheme<get_exploration_items_result> {
            private get_exploration_items_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_exploration_items_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        ExplorationItem explorationItem = new ExplorationItem();
                        explorationItem.read(tTupleProtocol);
                        struct.success.add(explorationItem);
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
            public void write(TProtocol prot, get_exploration_items_result struct) throws TException {
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
                    Iterator<ExplorationItem> it = struct.success.iterator();
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
        public static class get_exploration_items_resultTupleSchemeFactory implements SchemeFactory {
            private get_exploration_items_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_exploration_items_resultTupleScheme getScheme() {
                return new get_exploration_items_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_exploration_items_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_exploration_items_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, ExplorationItem.class))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_exploration_items_result.class, unmodifiableMap);
        }

        public get_exploration_items_result() {
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

        public void addToSuccess(ExplorationItem elem) {
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
            if (that != null && (that instanceof get_exploration_items_result)) {
                return equals((get_exploration_items_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public List<ExplorationItem> getSuccess() {
            return this.success;
        }

        public Iterator<ExplorationItem> getSuccessIterator() {
            List<ExplorationItem> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<ExplorationItem> list = this.success;
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

        public get_exploration_items_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_exploration_items_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_exploration_items_result setSuccess(List<ExplorationItem> success) {
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
            StringBuilder sb2 = new StringBuilder("get_exploration_items_result(");
            sb2.append("success:");
            List<ExplorationItem> list = this.success;
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
            sb2.append(j.f81007d);
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

        public get_exploration_items_result(List<ExplorationItem> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_exploration_items_result other) {
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
        public TBase<get_exploration_items_result, _Fields> deepCopy2() {
            return new get_exploration_items_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_exploration_items_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_exploration_items_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$get_exploration_items_result$_Fields[field.ordinal()];
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

        public boolean equals(get_exploration_items_result that) {
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

        public get_exploration_items_result(get_exploration_items_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<ExplorationItem> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ExplorationItem(it.next()));
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
    public static class huawei_pay_args implements TBase<huawei_pay_args, _Fields>, Serializable, Cloneable, Comparable<huawei_pay_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public HuaweiPayInfo pay_info;
        private static final TStruct STRUCT_DESC = new TStruct("huawei_pay_args");
        private static final TField PAY_INFO_FIELD_DESC = new TField("pay_info", (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            PAY_INFO(1, "pay_info");

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
                return PAY_INFO;
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
        public static class huawei_pay_argsStandardScheme extends StandardScheme<huawei_pay_args> {
            private huawei_pay_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, huawei_pay_args struct) throws TException {
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
                        HuaweiPayInfo huaweiPayInfo = new HuaweiPayInfo();
                        struct.pay_info = huaweiPayInfo;
                        huaweiPayInfo.read(iprot);
                        struct.setPay_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, huawei_pay_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(huawei_pay_args.STRUCT_DESC);
                if (struct.pay_info != null) {
                    oprot.writeFieldBegin(huawei_pay_args.PAY_INFO_FIELD_DESC);
                    struct.pay_info.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class huawei_pay_argsStandardSchemeFactory implements SchemeFactory {
            private huawei_pay_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public huawei_pay_argsStandardScheme getScheme() {
                return new huawei_pay_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class huawei_pay_argsTupleScheme extends TupleScheme<huawei_pay_args> {
            private huawei_pay_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, huawei_pay_args struct) throws TException {
                HuaweiPayInfo huaweiPayInfo = new HuaweiPayInfo();
                struct.pay_info = huaweiPayInfo;
                huaweiPayInfo.read((TTupleProtocol) prot);
                struct.setPay_infoIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, huawei_pay_args struct) throws TException {
                struct.pay_info.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class huawei_pay_argsTupleSchemeFactory implements SchemeFactory {
            private huawei_pay_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public huawei_pay_argsTupleScheme getScheme() {
                return new huawei_pay_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new huawei_pay_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new huawei_pay_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.PAY_INFO, (_Fields) new FieldMetaData("pay_info", (byte) 1, new StructMetaData((byte) 12, HuaweiPayInfo.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(huawei_pay_args.class, unmodifiableMap);
        }

        public huawei_pay_args() {
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
            this.pay_info = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof huawei_pay_args)) {
                return equals((huawei_pay_args) that);
            }
            return false;
        }

        public HuaweiPayInfo getPay_info() {
            return this.pay_info;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetPay_info() {
            return this.pay_info != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public huawei_pay_args setPay_info(HuaweiPayInfo pay_info) {
            this.pay_info = pay_info;
            return this;
        }

        public void setPay_infoIsSet(boolean value) {
            if (value) {
                return;
            }
            this.pay_info = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("huawei_pay_args(");
            sb2.append("pay_info:");
            HuaweiPayInfo huaweiPayInfo = this.pay_info;
            if (huaweiPayInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(huaweiPayInfo);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetPay_info() {
            this.pay_info = null;
        }

        public void validate() throws TException {
            HuaweiPayInfo huaweiPayInfo = this.pay_info;
            if (huaweiPayInfo != null) {
                if (huaweiPayInfo != null) {
                    huaweiPayInfo.validate();
                }
            } else {
                throw new TProtocolException("Required field 'pay_info' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public huawei_pay_args(HuaweiPayInfo pay_info) {
            this();
            this.pay_info = pay_info;
        }

        @Override // java.lang.Comparable
        public int compareTo(huawei_pay_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetPay_info()).compareTo(Boolean.valueOf(other.isSetPay_info()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetPay_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.pay_info, (Comparable) other.pay_info)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<huawei_pay_args, _Fields> deepCopy2() {
            return new huawei_pay_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$huawei_pay_args$_Fields[field.ordinal()] == 1) {
                return getPay_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$huawei_pay_args$_Fields[field.ordinal()] == 1) {
                return isSetPay_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$huawei_pay_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetPay_info();
            } else {
                setPay_info((HuaweiPayInfo) value);
            }
        }

        public boolean equals(huawei_pay_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetPay_info = isSetPay_info();
            boolean isSetPay_info2 = that.isSetPay_info();
            if (isSetPay_info || isSetPay_info2) {
                return isSetPay_info && isSetPay_info2 && this.pay_info.equals(that.pay_info);
            }
            return true;
        }

        public huawei_pay_args(huawei_pay_args other) {
            if (other.isSetPay_info()) {
                this.pay_info = new HuaweiPayInfo(other.pay_info);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class huawei_pay_result implements TBase<huawei_pay_result, _Fields>, Serializable, Cloneable, Comparable<huawei_pay_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public PayResp success;
        private static final TStruct STRUCT_DESC = new TStruct("huawei_pay_result");
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
        public static class huawei_pay_resultStandardScheme extends StandardScheme<huawei_pay_result> {
            private huawei_pay_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, huawei_pay_result struct) throws TException {
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
                        PayResp payResp = new PayResp();
                        struct.success = payResp;
                        payResp.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, huawei_pay_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(huawei_pay_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(huawei_pay_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(huawei_pay_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(huawei_pay_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class huawei_pay_resultStandardSchemeFactory implements SchemeFactory {
            private huawei_pay_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public huawei_pay_resultStandardScheme getScheme() {
                return new huawei_pay_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class huawei_pay_resultTupleScheme extends TupleScheme<huawei_pay_result> {
            private huawei_pay_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, huawei_pay_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    PayResp payResp = new PayResp();
                    struct.success = payResp;
                    payResp.read(tTupleProtocol);
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
            public void write(TProtocol prot, huawei_pay_result struct) throws TException {
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
        public static class huawei_pay_resultTupleSchemeFactory implements SchemeFactory {
            private huawei_pay_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public huawei_pay_resultTupleScheme getScheme() {
                return new huawei_pay_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new huawei_pay_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new huawei_pay_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, PayResp.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(huawei_pay_result.class, unmodifiableMap);
        }

        public huawei_pay_result() {
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
            if (that != null && (that instanceof huawei_pay_result)) {
                return equals((huawei_pay_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public PayResp getSuccess() {
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

        public huawei_pay_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public huawei_pay_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public huawei_pay_result setSuccess(PayResp success) {
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
            StringBuilder sb2 = new StringBuilder("huawei_pay_result(");
            sb2.append("success:");
            PayResp payResp = this.success;
            if (payResp == null) {
                sb2.append("null");
            } else {
                sb2.append(payResp);
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
            sb2.append(j.f81007d);
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
            PayResp payResp = this.success;
            if (payResp != null) {
                payResp.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public huawei_pay_result(PayResp success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(huawei_pay_result other) {
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
        public TBase<huawei_pay_result, _Fields> deepCopy2() {
            return new huawei_pay_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$huawei_pay_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$huawei_pay_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserAssistantApiService$huawei_pay_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((PayResp) value);
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

        public boolean equals(huawei_pay_result that) {
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

        public huawei_pay_result(huawei_pay_result other) {
            if (other.isSetSuccess()) {
                this.success = new PayResp(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }
}
