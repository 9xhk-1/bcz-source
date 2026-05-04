package com.baicizhan.online.strategy_api;

import com.baicizhan.online.thrift.basic.LogicException;
import com.baicizhan.online.thrift.basic.SystemException;
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
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TProtocol;
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
public class StrategyApiService {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.strategy_api.StrategyApiService$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_app_home_page_member_stage_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_app_home_page_member_stage_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_free_member_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_free_member_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_member_popup_sale_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_member_popup_sale_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_infos_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_infos_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_sale_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_sale_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_member_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_member_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_sentence_energy_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_sentence_energy_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_word_energy_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_word_energy_info_result$_Fields;

        static {
            int[] iArr = new int[get_app_home_page_member_stage_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_app_home_page_member_stage_info_result$_Fields = iArr;
            try {
                iArr[get_app_home_page_member_stage_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_app_home_page_member_stage_info_result$_Fields[get_app_home_page_member_stage_info_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_app_home_page_member_stage_info_result$_Fields[get_app_home_page_member_stage_info_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_app_home_page_member_stage_info_args$_Fields = new int[get_app_home_page_member_stage_info_args._Fields.values().length];
            int[] iArr2 = new int[get_free_member_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_free_member_result$_Fields = iArr2;
            try {
                iArr2[get_free_member_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_free_member_result$_Fields[get_free_member_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_free_member_result$_Fields[get_free_member_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[get_free_member_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_free_member_args$_Fields = iArr3;
            try {
                iArr3[get_free_member_args._Fields.MEMBER_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr4 = new int[get_user_entitlement_infos_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_infos_result$_Fields = iArr4;
            try {
                iArr4[get_user_entitlement_infos_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_infos_result$_Fields[get_user_entitlement_infos_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_infos_result$_Fields[get_user_entitlement_infos_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_infos_args$_Fields = new int[get_user_entitlement_infos_args._Fields.values().length];
            int[] iArr5 = new int[get_user_sentence_energy_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_sentence_energy_info_result$_Fields = iArr5;
            try {
                iArr5[get_user_sentence_energy_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_sentence_energy_info_result$_Fields[get_user_sentence_energy_info_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_sentence_energy_info_result$_Fields[get_user_sentence_energy_info_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_sentence_energy_info_args$_Fields = new int[get_user_sentence_energy_info_args._Fields.values().length];
            int[] iArr6 = new int[get_user_word_energy_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_word_energy_info_result$_Fields = iArr6;
            try {
                iArr6[get_user_word_energy_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_word_energy_info_result$_Fields[get_user_word_energy_info_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_word_energy_info_result$_Fields[get_user_word_energy_info_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_word_energy_info_args$_Fields = new int[get_user_word_energy_info_args._Fields.values().length];
            int[] iArr7 = new int[get_user_member_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_member_info_result$_Fields = iArr7;
            try {
                iArr7[get_user_member_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_member_info_result$_Fields[get_user_member_info_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_member_info_result$_Fields[get_user_member_info_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_member_info_args$_Fields = new int[get_user_member_info_args._Fields.values().length];
            int[] iArr8 = new int[get_user_entitlement_sale_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_sale_info_result$_Fields = iArr8;
            try {
                iArr8[get_user_entitlement_sale_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_sale_info_result$_Fields[get_user_entitlement_sale_info_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_sale_info_result$_Fields[get_user_entitlement_sale_info_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            int[] iArr9 = new int[get_user_entitlement_sale_info_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_sale_info_args$_Fields = iArr9;
            try {
                iArr9[get_user_entitlement_sale_info_args._Fields.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            int[] iArr10 = new int[get_member_popup_sale_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_member_popup_sale_info_result$_Fields = iArr10;
            try {
                iArr10[get_member_popup_sale_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_member_popup_sale_info_result$_Fields[get_member_popup_sale_info_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_member_popup_sale_info_result$_Fields[get_member_popup_sale_info_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            $SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_member_popup_sale_info_args$_Fields = new int[get_member_popup_sale_info_args._Fields.values().length];
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
        public static class get_app_home_page_member_stage_info_call extends TAsyncMethodCall {
            public get_app_home_page_member_stage_info_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public AppHomePageMemberStageInfo getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_app_home_page_member_stage_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_app_home_page_member_stage_info", (byte) 1, 0));
                new get_app_home_page_member_stage_info_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_free_member_call extends TAsyncMethodCall {
            private int member_type;

            public get_free_member_call(int member_type, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.member_type = member_type;
            }

            public UserEntitlement getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_free_member();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_free_member", (byte) 1, 0));
                get_free_member_args get_free_member_argsVar = new get_free_member_args();
                get_free_member_argsVar.setMember_type(this.member_type);
                get_free_member_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_member_popup_sale_info_call extends TAsyncMethodCall {
            public get_member_popup_sale_info_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public MemberPopupSaleInfo getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_member_popup_sale_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_member_popup_sale_info", (byte) 1, 0));
                new get_member_popup_sale_info_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_entitlement_infos_call extends TAsyncMethodCall {
            public get_user_entitlement_infos_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public UserEntitlementInfos getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_user_entitlement_infos();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_user_entitlement_infos", (byte) 1, 0));
                new get_user_entitlement_infos_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_entitlement_sale_info_call extends TAsyncMethodCall {
            private int source;

            public get_user_entitlement_sale_info_call(int source, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.source = source;
            }

            public UserEntitlementSaleInfo getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_user_entitlement_sale_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_user_entitlement_sale_info", (byte) 1, 0));
                get_user_entitlement_sale_info_args get_user_entitlement_sale_info_argsVar = new get_user_entitlement_sale_info_args();
                get_user_entitlement_sale_info_argsVar.setSource(this.source);
                get_user_entitlement_sale_info_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_member_info_call extends TAsyncMethodCall {
            public get_user_member_info_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public UserEntitlement getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_user_member_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_user_member_info", (byte) 1, 0));
                new get_user_member_info_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_sentence_energy_info_call extends TAsyncMethodCall {
            public get_user_sentence_energy_info_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public UserEntitlement getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_user_sentence_energy_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_user_sentence_energy_info", (byte) 1, 0));
                new get_user_sentence_energy_info_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_word_energy_info_call extends TAsyncMethodCall {
            public get_user_word_energy_info_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public UserEntitlement getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_user_word_energy_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_user_word_energy_info", (byte) 1, 0));
                new get_user_word_energy_info_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        public AsyncClient(TProtocolFactory protocolFactory, TAsyncClientManager clientManager, TNonblockingTransport transport) {
            super(protocolFactory, clientManager, transport);
        }

        @Override // com.baicizhan.online.strategy_api.StrategyApiService.AsyncIface
        public void get_app_home_page_member_stage_info(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_app_home_page_member_stage_info_call get_app_home_page_member_stage_info_callVar = new get_app_home_page_member_stage_info_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_app_home_page_member_stage_info_callVar;
            this.___manager.call(get_app_home_page_member_stage_info_callVar);
        }

        @Override // com.baicizhan.online.strategy_api.StrategyApiService.AsyncIface
        public void get_free_member(int member_type, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_free_member_call get_free_member_callVar = new get_free_member_call(member_type, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_free_member_callVar;
            this.___manager.call(get_free_member_callVar);
        }

        @Override // com.baicizhan.online.strategy_api.StrategyApiService.AsyncIface
        public void get_member_popup_sale_info(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_member_popup_sale_info_call get_member_popup_sale_info_callVar = new get_member_popup_sale_info_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_member_popup_sale_info_callVar;
            this.___manager.call(get_member_popup_sale_info_callVar);
        }

        @Override // com.baicizhan.online.strategy_api.StrategyApiService.AsyncIface
        public void get_user_entitlement_infos(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_user_entitlement_infos_call get_user_entitlement_infos_callVar = new get_user_entitlement_infos_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_user_entitlement_infos_callVar;
            this.___manager.call(get_user_entitlement_infos_callVar);
        }

        @Override // com.baicizhan.online.strategy_api.StrategyApiService.AsyncIface
        public void get_user_entitlement_sale_info(int source, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_user_entitlement_sale_info_call get_user_entitlement_sale_info_callVar = new get_user_entitlement_sale_info_call(source, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_user_entitlement_sale_info_callVar;
            this.___manager.call(get_user_entitlement_sale_info_callVar);
        }

        @Override // com.baicizhan.online.strategy_api.StrategyApiService.AsyncIface
        public void get_user_member_info(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_user_member_info_call get_user_member_info_callVar = new get_user_member_info_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_user_member_info_callVar;
            this.___manager.call(get_user_member_info_callVar);
        }

        @Override // com.baicizhan.online.strategy_api.StrategyApiService.AsyncIface
        public void get_user_sentence_energy_info(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_user_sentence_energy_info_call get_user_sentence_energy_info_callVar = new get_user_sentence_energy_info_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_user_sentence_energy_info_callVar;
            this.___manager.call(get_user_sentence_energy_info_callVar);
        }

        @Override // com.baicizhan.online.strategy_api.StrategyApiService.AsyncIface
        public void get_user_word_energy_info(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_user_word_energy_info_call get_user_word_energy_info_callVar = new get_user_word_energy_info_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_user_word_energy_info_callVar;
            this.___manager.call(get_user_word_energy_info_callVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AsyncIface {
        void get_app_home_page_member_stage_info(AsyncMethodCallback resultHandler) throws TException;

        void get_free_member(int member_type, AsyncMethodCallback resultHandler) throws TException;

        void get_member_popup_sale_info(AsyncMethodCallback resultHandler) throws TException;

        void get_user_entitlement_infos(AsyncMethodCallback resultHandler) throws TException;

        void get_user_entitlement_sale_info(int source, AsyncMethodCallback resultHandler) throws TException;

        void get_user_member_info(AsyncMethodCallback resultHandler) throws TException;

        void get_user_sentence_energy_info(AsyncMethodCallback resultHandler) throws TException;

        void get_user_word_energy_info(AsyncMethodCallback resultHandler) throws TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AsyncProcessor<I extends AsyncIface> extends TBaseAsyncProcessor<I> {
        private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_home_page_member_stage_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_app_home_page_member_stage_info_args, AppHomePageMemberStageInfo> {
            public get_app_home_page_member_stage_info() {
                super("get_app_home_page_member_stage_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<AppHomePageMemberStageInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<AppHomePageMemberStageInfo>() { // from class: com.baicizhan.online.strategy_api.StrategyApiService.AsyncProcessor.get_app_home_page_member_stage_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_app_home_page_member_stage_info_result get_app_home_page_member_stage_info_resultVar;
                        get_app_home_page_member_stage_info_result get_app_home_page_member_stage_info_resultVar2 = new get_app_home_page_member_stage_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_app_home_page_member_stage_info_resultVar2.boom = (SystemException) exc;
                                get_app_home_page_member_stage_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_app_home_page_member_stage_info_resultVar = r02;
                                    this.sendResponse(fb2, get_app_home_page_member_stage_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_app_home_page_member_stage_info_resultVar2.bomb = (LogicException) exc;
                                get_app_home_page_member_stage_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_app_home_page_member_stage_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_app_home_page_member_stage_info_resultVar = get_app_home_page_member_stage_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(AppHomePageMemberStageInfo o11) {
                        get_app_home_page_member_stage_info_result get_app_home_page_member_stage_info_resultVar = new get_app_home_page_member_stage_info_result();
                        get_app_home_page_member_stage_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_app_home_page_member_stage_info_resultVar, (byte) 2, seqid);
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
            public get_app_home_page_member_stage_info_args getEmptyArgsInstance() {
                return new get_app_home_page_member_stage_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_app_home_page_member_stage_info_args args, AsyncMethodCallback<AppHomePageMemberStageInfo> resultHandler) throws TException {
                iface.get_app_home_page_member_stage_info(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_free_member<I extends AsyncIface> extends AsyncProcessFunction<I, get_free_member_args, UserEntitlement> {
            public get_free_member() {
                super("get_free_member");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<UserEntitlement> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<UserEntitlement>() { // from class: com.baicizhan.online.strategy_api.StrategyApiService.AsyncProcessor.get_free_member.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_free_member_result get_free_member_resultVar;
                        get_free_member_result get_free_member_resultVar2 = new get_free_member_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_free_member_resultVar2.boom = (SystemException) exc;
                                get_free_member_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_free_member_resultVar = r02;
                                    this.sendResponse(fb2, get_free_member_resultVar, b11, seqid);
                                    return;
                                }
                                get_free_member_resultVar2.bomb = (LogicException) exc;
                                get_free_member_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_free_member_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_free_member_resultVar = get_free_member_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(UserEntitlement o11) {
                        get_free_member_result get_free_member_resultVar = new get_free_member_result();
                        get_free_member_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_free_member_resultVar, (byte) 2, seqid);
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
            public get_free_member_args getEmptyArgsInstance() {
                return new get_free_member_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_free_member_args args, AsyncMethodCallback<UserEntitlement> resultHandler) throws TException {
                iface.get_free_member(args.member_type, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_member_popup_sale_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_member_popup_sale_info_args, MemberPopupSaleInfo> {
            public get_member_popup_sale_info() {
                super("get_member_popup_sale_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<MemberPopupSaleInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<MemberPopupSaleInfo>() { // from class: com.baicizhan.online.strategy_api.StrategyApiService.AsyncProcessor.get_member_popup_sale_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_member_popup_sale_info_result get_member_popup_sale_info_resultVar;
                        get_member_popup_sale_info_result get_member_popup_sale_info_resultVar2 = new get_member_popup_sale_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_member_popup_sale_info_resultVar2.boom = (SystemException) exc;
                                get_member_popup_sale_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_member_popup_sale_info_resultVar = r02;
                                    this.sendResponse(fb2, get_member_popup_sale_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_member_popup_sale_info_resultVar2.bomb = (LogicException) exc;
                                get_member_popup_sale_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_member_popup_sale_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_member_popup_sale_info_resultVar = get_member_popup_sale_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(MemberPopupSaleInfo o11) {
                        get_member_popup_sale_info_result get_member_popup_sale_info_resultVar = new get_member_popup_sale_info_result();
                        get_member_popup_sale_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_member_popup_sale_info_resultVar, (byte) 2, seqid);
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
            public get_member_popup_sale_info_args getEmptyArgsInstance() {
                return new get_member_popup_sale_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_member_popup_sale_info_args args, AsyncMethodCallback<MemberPopupSaleInfo> resultHandler) throws TException {
                iface.get_member_popup_sale_info(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_entitlement_infos<I extends AsyncIface> extends AsyncProcessFunction<I, get_user_entitlement_infos_args, UserEntitlementInfos> {
            public get_user_entitlement_infos() {
                super("get_user_entitlement_infos");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<UserEntitlementInfos> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<UserEntitlementInfos>() { // from class: com.baicizhan.online.strategy_api.StrategyApiService.AsyncProcessor.get_user_entitlement_infos.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_user_entitlement_infos_result get_user_entitlement_infos_resultVar;
                        get_user_entitlement_infos_result get_user_entitlement_infos_resultVar2 = new get_user_entitlement_infos_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_user_entitlement_infos_resultVar2.boom = (SystemException) exc;
                                get_user_entitlement_infos_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_user_entitlement_infos_resultVar = r02;
                                    this.sendResponse(fb2, get_user_entitlement_infos_resultVar, b11, seqid);
                                    return;
                                }
                                get_user_entitlement_infos_resultVar2.bomb = (LogicException) exc;
                                get_user_entitlement_infos_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_user_entitlement_infos_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_user_entitlement_infos_resultVar = get_user_entitlement_infos_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(UserEntitlementInfos o11) {
                        get_user_entitlement_infos_result get_user_entitlement_infos_resultVar = new get_user_entitlement_infos_result();
                        get_user_entitlement_infos_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_user_entitlement_infos_resultVar, (byte) 2, seqid);
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
            public get_user_entitlement_infos_args getEmptyArgsInstance() {
                return new get_user_entitlement_infos_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_user_entitlement_infos_args args, AsyncMethodCallback<UserEntitlementInfos> resultHandler) throws TException {
                iface.get_user_entitlement_infos(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_entitlement_sale_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_user_entitlement_sale_info_args, UserEntitlementSaleInfo> {
            public get_user_entitlement_sale_info() {
                super("get_user_entitlement_sale_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<UserEntitlementSaleInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<UserEntitlementSaleInfo>() { // from class: com.baicizhan.online.strategy_api.StrategyApiService.AsyncProcessor.get_user_entitlement_sale_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_user_entitlement_sale_info_result get_user_entitlement_sale_info_resultVar;
                        get_user_entitlement_sale_info_result get_user_entitlement_sale_info_resultVar2 = new get_user_entitlement_sale_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_user_entitlement_sale_info_resultVar2.boom = (SystemException) exc;
                                get_user_entitlement_sale_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_user_entitlement_sale_info_resultVar = r02;
                                    this.sendResponse(fb2, get_user_entitlement_sale_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_user_entitlement_sale_info_resultVar2.bomb = (LogicException) exc;
                                get_user_entitlement_sale_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_user_entitlement_sale_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_user_entitlement_sale_info_resultVar = get_user_entitlement_sale_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(UserEntitlementSaleInfo o11) {
                        get_user_entitlement_sale_info_result get_user_entitlement_sale_info_resultVar = new get_user_entitlement_sale_info_result();
                        get_user_entitlement_sale_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_user_entitlement_sale_info_resultVar, (byte) 2, seqid);
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
            public get_user_entitlement_sale_info_args getEmptyArgsInstance() {
                return new get_user_entitlement_sale_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_user_entitlement_sale_info_args args, AsyncMethodCallback<UserEntitlementSaleInfo> resultHandler) throws TException {
                iface.get_user_entitlement_sale_info(args.source, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_member_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_user_member_info_args, UserEntitlement> {
            public get_user_member_info() {
                super("get_user_member_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<UserEntitlement> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<UserEntitlement>() { // from class: com.baicizhan.online.strategy_api.StrategyApiService.AsyncProcessor.get_user_member_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_user_member_info_result get_user_member_info_resultVar;
                        get_user_member_info_result get_user_member_info_resultVar2 = new get_user_member_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_user_member_info_resultVar2.boom = (SystemException) exc;
                                get_user_member_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_user_member_info_resultVar = r02;
                                    this.sendResponse(fb2, get_user_member_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_user_member_info_resultVar2.bomb = (LogicException) exc;
                                get_user_member_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_user_member_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_user_member_info_resultVar = get_user_member_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(UserEntitlement o11) {
                        get_user_member_info_result get_user_member_info_resultVar = new get_user_member_info_result();
                        get_user_member_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_user_member_info_resultVar, (byte) 2, seqid);
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
            public get_user_member_info_args getEmptyArgsInstance() {
                return new get_user_member_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_user_member_info_args args, AsyncMethodCallback<UserEntitlement> resultHandler) throws TException {
                iface.get_user_member_info(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_sentence_energy_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_user_sentence_energy_info_args, UserEntitlement> {
            public get_user_sentence_energy_info() {
                super("get_user_sentence_energy_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<UserEntitlement> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<UserEntitlement>() { // from class: com.baicizhan.online.strategy_api.StrategyApiService.AsyncProcessor.get_user_sentence_energy_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_user_sentence_energy_info_result get_user_sentence_energy_info_resultVar;
                        get_user_sentence_energy_info_result get_user_sentence_energy_info_resultVar2 = new get_user_sentence_energy_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_user_sentence_energy_info_resultVar2.boom = (SystemException) exc;
                                get_user_sentence_energy_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_user_sentence_energy_info_resultVar = r02;
                                    this.sendResponse(fb2, get_user_sentence_energy_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_user_sentence_energy_info_resultVar2.bomb = (LogicException) exc;
                                get_user_sentence_energy_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_user_sentence_energy_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_user_sentence_energy_info_resultVar = get_user_sentence_energy_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(UserEntitlement o11) {
                        get_user_sentence_energy_info_result get_user_sentence_energy_info_resultVar = new get_user_sentence_energy_info_result();
                        get_user_sentence_energy_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_user_sentence_energy_info_resultVar, (byte) 2, seqid);
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
            public get_user_sentence_energy_info_args getEmptyArgsInstance() {
                return new get_user_sentence_energy_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_user_sentence_energy_info_args args, AsyncMethodCallback<UserEntitlement> resultHandler) throws TException {
                iface.get_user_sentence_energy_info(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_word_energy_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_user_word_energy_info_args, UserEntitlement> {
            public get_user_word_energy_info() {
                super("get_user_word_energy_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<UserEntitlement> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<UserEntitlement>() { // from class: com.baicizhan.online.strategy_api.StrategyApiService.AsyncProcessor.get_user_word_energy_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_user_word_energy_info_result get_user_word_energy_info_resultVar;
                        get_user_word_energy_info_result get_user_word_energy_info_resultVar2 = new get_user_word_energy_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_user_word_energy_info_resultVar2.boom = (SystemException) exc;
                                get_user_word_energy_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_user_word_energy_info_resultVar = r02;
                                    this.sendResponse(fb2, get_user_word_energy_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_user_word_energy_info_resultVar2.bomb = (LogicException) exc;
                                get_user_word_energy_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_user_word_energy_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_user_word_energy_info_resultVar = get_user_word_energy_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(UserEntitlement o11) {
                        get_user_word_energy_info_result get_user_word_energy_info_resultVar = new get_user_word_energy_info_result();
                        get_user_word_energy_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_user_word_energy_info_resultVar, (byte) 2, seqid);
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
            public get_user_word_energy_info_args getEmptyArgsInstance() {
                return new get_user_word_energy_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_user_word_energy_info_args args, AsyncMethodCallback<UserEntitlement> resultHandler) throws TException {
                iface.get_user_word_energy_info(resultHandler);
            }
        }

        public AsyncProcessor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends AsyncIface> Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> getProcessMap(Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> processMap) {
            processMap.put("get_member_popup_sale_info", new get_member_popup_sale_info());
            processMap.put("get_user_entitlement_sale_info", new get_user_entitlement_sale_info());
            processMap.put("get_user_member_info", new get_user_member_info());
            processMap.put("get_user_word_energy_info", new get_user_word_energy_info());
            processMap.put("get_user_sentence_energy_info", new get_user_sentence_energy_info());
            processMap.put("get_user_entitlement_infos", new get_user_entitlement_infos());
            processMap.put("get_free_member", new get_free_member());
            processMap.put("get_app_home_page_member_stage_info", new get_app_home_page_member_stage_info());
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

        @Override // com.baicizhan.online.strategy_api.StrategyApiService.Iface
        public AppHomePageMemberStageInfo get_app_home_page_member_stage_info() throws SystemException, LogicException, TException {
            send_get_app_home_page_member_stage_info();
            return recv_get_app_home_page_member_stage_info();
        }

        @Override // com.baicizhan.online.strategy_api.StrategyApiService.Iface
        public UserEntitlement get_free_member(int member_type) throws SystemException, LogicException, TException {
            send_get_free_member(member_type);
            return recv_get_free_member();
        }

        @Override // com.baicizhan.online.strategy_api.StrategyApiService.Iface
        public MemberPopupSaleInfo get_member_popup_sale_info() throws SystemException, LogicException, TException {
            send_get_member_popup_sale_info();
            return recv_get_member_popup_sale_info();
        }

        @Override // com.baicizhan.online.strategy_api.StrategyApiService.Iface
        public UserEntitlementInfos get_user_entitlement_infos() throws SystemException, LogicException, TException {
            send_get_user_entitlement_infos();
            return recv_get_user_entitlement_infos();
        }

        @Override // com.baicizhan.online.strategy_api.StrategyApiService.Iface
        public UserEntitlementSaleInfo get_user_entitlement_sale_info(int source) throws SystemException, LogicException, TException {
            send_get_user_entitlement_sale_info(source);
            return recv_get_user_entitlement_sale_info();
        }

        @Override // com.baicizhan.online.strategy_api.StrategyApiService.Iface
        public UserEntitlement get_user_member_info() throws SystemException, LogicException, TException {
            send_get_user_member_info();
            return recv_get_user_member_info();
        }

        @Override // com.baicizhan.online.strategy_api.StrategyApiService.Iface
        public UserEntitlement get_user_sentence_energy_info() throws SystemException, LogicException, TException {
            send_get_user_sentence_energy_info();
            return recv_get_user_sentence_energy_info();
        }

        @Override // com.baicizhan.online.strategy_api.StrategyApiService.Iface
        public UserEntitlement get_user_word_energy_info() throws SystemException, LogicException, TException {
            send_get_user_word_energy_info();
            return recv_get_user_word_energy_info();
        }

        public AppHomePageMemberStageInfo recv_get_app_home_page_member_stage_info() throws SystemException, LogicException, TException {
            get_app_home_page_member_stage_info_result get_app_home_page_member_stage_info_resultVar = new get_app_home_page_member_stage_info_result();
            receiveBase(get_app_home_page_member_stage_info_resultVar, "get_app_home_page_member_stage_info");
            if (get_app_home_page_member_stage_info_resultVar.isSetSuccess()) {
                return get_app_home_page_member_stage_info_resultVar.success;
            }
            SystemException systemException = get_app_home_page_member_stage_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_app_home_page_member_stage_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_app_home_page_member_stage_info failed: unknown result");
        }

        public UserEntitlement recv_get_free_member() throws SystemException, LogicException, TException {
            get_free_member_result get_free_member_resultVar = new get_free_member_result();
            receiveBase(get_free_member_resultVar, "get_free_member");
            if (get_free_member_resultVar.isSetSuccess()) {
                return get_free_member_resultVar.success;
            }
            SystemException systemException = get_free_member_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_free_member_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_free_member failed: unknown result");
        }

        public MemberPopupSaleInfo recv_get_member_popup_sale_info() throws SystemException, LogicException, TException {
            get_member_popup_sale_info_result get_member_popup_sale_info_resultVar = new get_member_popup_sale_info_result();
            receiveBase(get_member_popup_sale_info_resultVar, "get_member_popup_sale_info");
            if (get_member_popup_sale_info_resultVar.isSetSuccess()) {
                return get_member_popup_sale_info_resultVar.success;
            }
            SystemException systemException = get_member_popup_sale_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_member_popup_sale_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_member_popup_sale_info failed: unknown result");
        }

        public UserEntitlementInfos recv_get_user_entitlement_infos() throws SystemException, LogicException, TException {
            get_user_entitlement_infos_result get_user_entitlement_infos_resultVar = new get_user_entitlement_infos_result();
            receiveBase(get_user_entitlement_infos_resultVar, "get_user_entitlement_infos");
            if (get_user_entitlement_infos_resultVar.isSetSuccess()) {
                return get_user_entitlement_infos_resultVar.success;
            }
            SystemException systemException = get_user_entitlement_infos_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_user_entitlement_infos_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_user_entitlement_infos failed: unknown result");
        }

        public UserEntitlementSaleInfo recv_get_user_entitlement_sale_info() throws SystemException, LogicException, TException {
            get_user_entitlement_sale_info_result get_user_entitlement_sale_info_resultVar = new get_user_entitlement_sale_info_result();
            receiveBase(get_user_entitlement_sale_info_resultVar, "get_user_entitlement_sale_info");
            if (get_user_entitlement_sale_info_resultVar.isSetSuccess()) {
                return get_user_entitlement_sale_info_resultVar.success;
            }
            SystemException systemException = get_user_entitlement_sale_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_user_entitlement_sale_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_user_entitlement_sale_info failed: unknown result");
        }

        public UserEntitlement recv_get_user_member_info() throws SystemException, LogicException, TException {
            get_user_member_info_result get_user_member_info_resultVar = new get_user_member_info_result();
            receiveBase(get_user_member_info_resultVar, "get_user_member_info");
            if (get_user_member_info_resultVar.isSetSuccess()) {
                return get_user_member_info_resultVar.success;
            }
            SystemException systemException = get_user_member_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_user_member_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_user_member_info failed: unknown result");
        }

        public UserEntitlement recv_get_user_sentence_energy_info() throws SystemException, LogicException, TException {
            get_user_sentence_energy_info_result get_user_sentence_energy_info_resultVar = new get_user_sentence_energy_info_result();
            receiveBase(get_user_sentence_energy_info_resultVar, "get_user_sentence_energy_info");
            if (get_user_sentence_energy_info_resultVar.isSetSuccess()) {
                return get_user_sentence_energy_info_resultVar.success;
            }
            SystemException systemException = get_user_sentence_energy_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_user_sentence_energy_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_user_sentence_energy_info failed: unknown result");
        }

        public UserEntitlement recv_get_user_word_energy_info() throws SystemException, LogicException, TException {
            get_user_word_energy_info_result get_user_word_energy_info_resultVar = new get_user_word_energy_info_result();
            receiveBase(get_user_word_energy_info_resultVar, "get_user_word_energy_info");
            if (get_user_word_energy_info_resultVar.isSetSuccess()) {
                return get_user_word_energy_info_resultVar.success;
            }
            SystemException systemException = get_user_word_energy_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_user_word_energy_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_user_word_energy_info failed: unknown result");
        }

        public void send_get_app_home_page_member_stage_info() throws TException {
            sendBase("get_app_home_page_member_stage_info", new get_app_home_page_member_stage_info_args());
        }

        public void send_get_free_member(int member_type) throws TException {
            get_free_member_args get_free_member_argsVar = new get_free_member_args();
            get_free_member_argsVar.setMember_type(member_type);
            sendBase("get_free_member", get_free_member_argsVar);
        }

        public void send_get_member_popup_sale_info() throws TException {
            sendBase("get_member_popup_sale_info", new get_member_popup_sale_info_args());
        }

        public void send_get_user_entitlement_infos() throws TException {
            sendBase("get_user_entitlement_infos", new get_user_entitlement_infos_args());
        }

        public void send_get_user_entitlement_sale_info(int source) throws TException {
            get_user_entitlement_sale_info_args get_user_entitlement_sale_info_argsVar = new get_user_entitlement_sale_info_args();
            get_user_entitlement_sale_info_argsVar.setSource(source);
            sendBase("get_user_entitlement_sale_info", get_user_entitlement_sale_info_argsVar);
        }

        public void send_get_user_member_info() throws TException {
            sendBase("get_user_member_info", new get_user_member_info_args());
        }

        public void send_get_user_sentence_energy_info() throws TException {
            sendBase("get_user_sentence_energy_info", new get_user_sentence_energy_info_args());
        }

        public void send_get_user_word_energy_info() throws TException {
            sendBase("get_user_word_energy_info", new get_user_word_energy_info_args());
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
        AppHomePageMemberStageInfo get_app_home_page_member_stage_info() throws SystemException, LogicException, TException;

        UserEntitlement get_free_member(int member_type) throws SystemException, LogicException, TException;

        MemberPopupSaleInfo get_member_popup_sale_info() throws SystemException, LogicException, TException;

        UserEntitlementInfos get_user_entitlement_infos() throws SystemException, LogicException, TException;

        UserEntitlementSaleInfo get_user_entitlement_sale_info(int source) throws SystemException, LogicException, TException;

        UserEntitlement get_user_member_info() throws SystemException, LogicException, TException;

        UserEntitlement get_user_sentence_energy_info() throws SystemException, LogicException, TException;

        UserEntitlement get_user_word_energy_info() throws SystemException, LogicException, TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Processor<I extends Iface> extends TBaseProcessor<I> implements TProcessor {
        private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_home_page_member_stage_info<I extends Iface> extends ProcessFunction<I, get_app_home_page_member_stage_info_args> {
            public get_app_home_page_member_stage_info() {
                super("get_app_home_page_member_stage_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_app_home_page_member_stage_info_args getEmptyArgsInstance() {
                return new get_app_home_page_member_stage_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_app_home_page_member_stage_info_result getResult(I iface, get_app_home_page_member_stage_info_args args) throws TException {
                get_app_home_page_member_stage_info_result get_app_home_page_member_stage_info_resultVar = new get_app_home_page_member_stage_info_result();
                try {
                    get_app_home_page_member_stage_info_resultVar.success = iface.get_app_home_page_member_stage_info();
                    return get_app_home_page_member_stage_info_resultVar;
                } catch (LogicException e11) {
                    get_app_home_page_member_stage_info_resultVar.bomb = e11;
                    return get_app_home_page_member_stage_info_resultVar;
                } catch (SystemException e12) {
                    get_app_home_page_member_stage_info_resultVar.boom = e12;
                    return get_app_home_page_member_stage_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_free_member<I extends Iface> extends ProcessFunction<I, get_free_member_args> {
            public get_free_member() {
                super("get_free_member");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_free_member_args getEmptyArgsInstance() {
                return new get_free_member_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_free_member_result getResult(I iface, get_free_member_args args) throws TException {
                get_free_member_result get_free_member_resultVar = new get_free_member_result();
                try {
                    get_free_member_resultVar.success = iface.get_free_member(args.member_type);
                    return get_free_member_resultVar;
                } catch (LogicException e11) {
                    get_free_member_resultVar.bomb = e11;
                    return get_free_member_resultVar;
                } catch (SystemException e12) {
                    get_free_member_resultVar.boom = e12;
                    return get_free_member_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_member_popup_sale_info<I extends Iface> extends ProcessFunction<I, get_member_popup_sale_info_args> {
            public get_member_popup_sale_info() {
                super("get_member_popup_sale_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_member_popup_sale_info_args getEmptyArgsInstance() {
                return new get_member_popup_sale_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_member_popup_sale_info_result getResult(I iface, get_member_popup_sale_info_args args) throws TException {
                get_member_popup_sale_info_result get_member_popup_sale_info_resultVar = new get_member_popup_sale_info_result();
                try {
                    get_member_popup_sale_info_resultVar.success = iface.get_member_popup_sale_info();
                    return get_member_popup_sale_info_resultVar;
                } catch (LogicException e11) {
                    get_member_popup_sale_info_resultVar.bomb = e11;
                    return get_member_popup_sale_info_resultVar;
                } catch (SystemException e12) {
                    get_member_popup_sale_info_resultVar.boom = e12;
                    return get_member_popup_sale_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_entitlement_infos<I extends Iface> extends ProcessFunction<I, get_user_entitlement_infos_args> {
            public get_user_entitlement_infos() {
                super("get_user_entitlement_infos");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_user_entitlement_infos_args getEmptyArgsInstance() {
                return new get_user_entitlement_infos_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_user_entitlement_infos_result getResult(I iface, get_user_entitlement_infos_args args) throws TException {
                get_user_entitlement_infos_result get_user_entitlement_infos_resultVar = new get_user_entitlement_infos_result();
                try {
                    get_user_entitlement_infos_resultVar.success = iface.get_user_entitlement_infos();
                    return get_user_entitlement_infos_resultVar;
                } catch (LogicException e11) {
                    get_user_entitlement_infos_resultVar.bomb = e11;
                    return get_user_entitlement_infos_resultVar;
                } catch (SystemException e12) {
                    get_user_entitlement_infos_resultVar.boom = e12;
                    return get_user_entitlement_infos_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_entitlement_sale_info<I extends Iface> extends ProcessFunction<I, get_user_entitlement_sale_info_args> {
            public get_user_entitlement_sale_info() {
                super("get_user_entitlement_sale_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_user_entitlement_sale_info_args getEmptyArgsInstance() {
                return new get_user_entitlement_sale_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_user_entitlement_sale_info_result getResult(I iface, get_user_entitlement_sale_info_args args) throws TException {
                get_user_entitlement_sale_info_result get_user_entitlement_sale_info_resultVar = new get_user_entitlement_sale_info_result();
                try {
                    get_user_entitlement_sale_info_resultVar.success = iface.get_user_entitlement_sale_info(args.source);
                    return get_user_entitlement_sale_info_resultVar;
                } catch (LogicException e11) {
                    get_user_entitlement_sale_info_resultVar.bomb = e11;
                    return get_user_entitlement_sale_info_resultVar;
                } catch (SystemException e12) {
                    get_user_entitlement_sale_info_resultVar.boom = e12;
                    return get_user_entitlement_sale_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_member_info<I extends Iface> extends ProcessFunction<I, get_user_member_info_args> {
            public get_user_member_info() {
                super("get_user_member_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_user_member_info_args getEmptyArgsInstance() {
                return new get_user_member_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_user_member_info_result getResult(I iface, get_user_member_info_args args) throws TException {
                get_user_member_info_result get_user_member_info_resultVar = new get_user_member_info_result();
                try {
                    get_user_member_info_resultVar.success = iface.get_user_member_info();
                    return get_user_member_info_resultVar;
                } catch (LogicException e11) {
                    get_user_member_info_resultVar.bomb = e11;
                    return get_user_member_info_resultVar;
                } catch (SystemException e12) {
                    get_user_member_info_resultVar.boom = e12;
                    return get_user_member_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_sentence_energy_info<I extends Iface> extends ProcessFunction<I, get_user_sentence_energy_info_args> {
            public get_user_sentence_energy_info() {
                super("get_user_sentence_energy_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_user_sentence_energy_info_args getEmptyArgsInstance() {
                return new get_user_sentence_energy_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_user_sentence_energy_info_result getResult(I iface, get_user_sentence_energy_info_args args) throws TException {
                get_user_sentence_energy_info_result get_user_sentence_energy_info_resultVar = new get_user_sentence_energy_info_result();
                try {
                    get_user_sentence_energy_info_resultVar.success = iface.get_user_sentence_energy_info();
                    return get_user_sentence_energy_info_resultVar;
                } catch (LogicException e11) {
                    get_user_sentence_energy_info_resultVar.bomb = e11;
                    return get_user_sentence_energy_info_resultVar;
                } catch (SystemException e12) {
                    get_user_sentence_energy_info_resultVar.boom = e12;
                    return get_user_sentence_energy_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_word_energy_info<I extends Iface> extends ProcessFunction<I, get_user_word_energy_info_args> {
            public get_user_word_energy_info() {
                super("get_user_word_energy_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_user_word_energy_info_args getEmptyArgsInstance() {
                return new get_user_word_energy_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_user_word_energy_info_result getResult(I iface, get_user_word_energy_info_args args) throws TException {
                get_user_word_energy_info_result get_user_word_energy_info_resultVar = new get_user_word_energy_info_result();
                try {
                    get_user_word_energy_info_resultVar.success = iface.get_user_word_energy_info();
                    return get_user_word_energy_info_resultVar;
                } catch (LogicException e11) {
                    get_user_word_energy_info_resultVar.bomb = e11;
                    return get_user_word_energy_info_resultVar;
                } catch (SystemException e12) {
                    get_user_word_energy_info_resultVar.boom = e12;
                    return get_user_word_energy_info_resultVar;
                }
            }
        }

        public Processor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends Iface> Map<String, ProcessFunction<I, ? extends TBase>> getProcessMap(Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            processMap.put("get_member_popup_sale_info", new get_member_popup_sale_info());
            processMap.put("get_user_entitlement_sale_info", new get_user_entitlement_sale_info());
            processMap.put("get_user_member_info", new get_user_member_info());
            processMap.put("get_user_word_energy_info", new get_user_word_energy_info());
            processMap.put("get_user_sentence_energy_info", new get_user_sentence_energy_info());
            processMap.put("get_user_entitlement_infos", new get_user_entitlement_infos());
            processMap.put("get_free_member", new get_free_member());
            processMap.put("get_app_home_page_member_stage_info", new get_app_home_page_member_stage_info());
            return processMap;
        }

        public Processor(I iface, Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            super(iface, getProcessMap(processMap));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_app_home_page_member_stage_info_args implements TBase<get_app_home_page_member_stage_info_args, _Fields>, Serializable, Cloneable, Comparable<get_app_home_page_member_stage_info_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_app_home_page_member_stage_info_args");
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
        public static class get_app_home_page_member_stage_info_argsStandardScheme extends StandardScheme<get_app_home_page_member_stage_info_args> {
            private get_app_home_page_member_stage_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_app_home_page_member_stage_info_args struct) throws TException {
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
            public void write(TProtocol oprot, get_app_home_page_member_stage_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_app_home_page_member_stage_info_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_home_page_member_stage_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_app_home_page_member_stage_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_app_home_page_member_stage_info_argsStandardScheme getScheme() {
                return new get_app_home_page_member_stage_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_home_page_member_stage_info_argsTupleScheme extends TupleScheme<get_app_home_page_member_stage_info_args> {
            private get_app_home_page_member_stage_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_app_home_page_member_stage_info_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_app_home_page_member_stage_info_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_home_page_member_stage_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_app_home_page_member_stage_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_app_home_page_member_stage_info_argsTupleScheme getScheme() {
                return new get_app_home_page_member_stage_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_app_home_page_member_stage_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_app_home_page_member_stage_info_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_app_home_page_member_stage_info_args.class, unmodifiableMap);
        }

        public get_app_home_page_member_stage_info_args() {
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

        public boolean equals(get_app_home_page_member_stage_info_args that) {
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
            return "get_app_home_page_member_stage_info_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_app_home_page_member_stage_info_args(get_app_home_page_member_stage_info_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_app_home_page_member_stage_info_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_app_home_page_member_stage_info_args, _Fields> deepCopy2() {
            return new get_app_home_page_member_stage_info_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_app_home_page_member_stage_info_args)) {
                return equals((get_app_home_page_member_stage_info_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_app_home_page_member_stage_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_app_home_page_member_stage_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_app_home_page_member_stage_info_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_app_home_page_member_stage_info_result implements TBase<get_app_home_page_member_stage_info_result, _Fields>, Serializable, Cloneable, Comparable<get_app_home_page_member_stage_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public AppHomePageMemberStageInfo success;
        private static final TStruct STRUCT_DESC = new TStruct("get_app_home_page_member_stage_info_result");
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
        public static class get_app_home_page_member_stage_info_resultStandardScheme extends StandardScheme<get_app_home_page_member_stage_info_result> {
            private get_app_home_page_member_stage_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_app_home_page_member_stage_info_result struct) throws TException {
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
                        AppHomePageMemberStageInfo appHomePageMemberStageInfo = new AppHomePageMemberStageInfo();
                        struct.success = appHomePageMemberStageInfo;
                        appHomePageMemberStageInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_app_home_page_member_stage_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_app_home_page_member_stage_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_app_home_page_member_stage_info_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_app_home_page_member_stage_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_app_home_page_member_stage_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_home_page_member_stage_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_app_home_page_member_stage_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_app_home_page_member_stage_info_resultStandardScheme getScheme() {
                return new get_app_home_page_member_stage_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_home_page_member_stage_info_resultTupleScheme extends TupleScheme<get_app_home_page_member_stage_info_result> {
            private get_app_home_page_member_stage_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_app_home_page_member_stage_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    AppHomePageMemberStageInfo appHomePageMemberStageInfo = new AppHomePageMemberStageInfo();
                    struct.success = appHomePageMemberStageInfo;
                    appHomePageMemberStageInfo.read(tTupleProtocol);
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
            public void write(TProtocol prot, get_app_home_page_member_stage_info_result struct) throws TException {
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
        public static class get_app_home_page_member_stage_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_app_home_page_member_stage_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_app_home_page_member_stage_info_resultTupleScheme getScheme() {
                return new get_app_home_page_member_stage_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_app_home_page_member_stage_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_app_home_page_member_stage_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, AppHomePageMemberStageInfo.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_app_home_page_member_stage_info_result.class, unmodifiableMap);
        }

        public get_app_home_page_member_stage_info_result() {
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
            if (that != null && (that instanceof get_app_home_page_member_stage_info_result)) {
                return equals((get_app_home_page_member_stage_info_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public AppHomePageMemberStageInfo getSuccess() {
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

        public get_app_home_page_member_stage_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_app_home_page_member_stage_info_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_app_home_page_member_stage_info_result setSuccess(AppHomePageMemberStageInfo success) {
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
            StringBuilder sb2 = new StringBuilder("get_app_home_page_member_stage_info_result(");
            sb2.append("success:");
            AppHomePageMemberStageInfo appHomePageMemberStageInfo = this.success;
            if (appHomePageMemberStageInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(appHomePageMemberStageInfo);
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
            AppHomePageMemberStageInfo appHomePageMemberStageInfo = this.success;
            if (appHomePageMemberStageInfo != null) {
                appHomePageMemberStageInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_app_home_page_member_stage_info_result(AppHomePageMemberStageInfo success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_app_home_page_member_stage_info_result other) {
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
        public TBase<get_app_home_page_member_stage_info_result, _Fields> deepCopy2() {
            return new get_app_home_page_member_stage_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_app_home_page_member_stage_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_app_home_page_member_stage_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_app_home_page_member_stage_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((AppHomePageMemberStageInfo) value);
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

        public boolean equals(get_app_home_page_member_stage_info_result that) {
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

        public get_app_home_page_member_stage_info_result(get_app_home_page_member_stage_info_result other) {
            if (other.isSetSuccess()) {
                this.success = new AppHomePageMemberStageInfo(other.success);
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
    public static class get_free_member_args implements TBase<get_free_member_args, _Fields>, Serializable, Cloneable, Comparable<get_free_member_args> {
        private static final int __MEMBER_TYPE_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int member_type;
        private static final TStruct STRUCT_DESC = new TStruct("get_free_member_args");
        private static final TField MEMBER_TYPE_FIELD_DESC = new TField("member_type", (byte) 8, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            MEMBER_TYPE(1, "member_type");

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
                return MEMBER_TYPE;
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
        public static class get_free_member_argsStandardScheme extends StandardScheme<get_free_member_args> {
            private get_free_member_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_free_member_args struct) throws TException {
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
                    } else if (b11 == 8) {
                        struct.member_type = iprot.readI32();
                        struct.setMember_typeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_free_member_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_free_member_args.STRUCT_DESC);
                oprot.writeFieldBegin(get_free_member_args.MEMBER_TYPE_FIELD_DESC);
                oprot.writeI32(struct.member_type);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_free_member_argsStandardSchemeFactory implements SchemeFactory {
            private get_free_member_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_free_member_argsStandardScheme getScheme() {
                return new get_free_member_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_free_member_argsTupleScheme extends TupleScheme<get_free_member_args> {
            private get_free_member_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_free_member_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                if (tTupleProtocol.readBitSet(1).get(0)) {
                    struct.member_type = tTupleProtocol.readI32();
                    struct.setMember_typeIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_free_member_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetMember_type()) {
                    bitSet.set(0);
                }
                tTupleProtocol.writeBitSet(bitSet, 1);
                if (struct.isSetMember_type()) {
                    tTupleProtocol.writeI32(struct.member_type);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_free_member_argsTupleSchemeFactory implements SchemeFactory {
            private get_free_member_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_free_member_argsTupleScheme getScheme() {
                return new get_free_member_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_free_member_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_free_member_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.MEMBER_TYPE, (_Fields) new FieldMetaData("member_type", (byte) 3, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_free_member_args.class, unmodifiableMap);
        }

        public get_free_member_args() {
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
            setMember_typeIsSet(false);
            this.member_type = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_free_member_args)) {
                return equals((get_free_member_args) that);
            }
            return false;
        }

        public int getMember_type() {
            return this.member_type;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetMember_type() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_free_member_args setMember_type(int member_type) {
            this.member_type = member_type;
            setMember_typeIsSet(true);
            return this;
        }

        public void setMember_typeIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "get_free_member_args(member_type:" + this.member_type + pn.j.f81007d;
        }

        public void unsetMember_type() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_free_member_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetMember_type()).compareTo(Boolean.valueOf(other.isSetMember_type()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetMember_type() || (compareTo = TBaseHelper.compareTo(this.member_type, other.member_type)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_free_member_args, _Fields> deepCopy2() {
            return new get_free_member_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_free_member_args$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getMember_type());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_free_member_args$_Fields[field.ordinal()] == 1) {
                return isSetMember_type();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_free_member_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetMember_type();
            } else {
                setMember_type(((Integer) value).intValue());
            }
        }

        public get_free_member_args(int member_type) {
            this();
            this.member_type = member_type;
            setMember_typeIsSet(true);
        }

        public boolean equals(get_free_member_args that) {
            return that != null && this.member_type == that.member_type;
        }

        public get_free_member_args(get_free_member_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.member_type = other.member_type;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_free_member_result implements TBase<get_free_member_result, _Fields>, Serializable, Cloneable, Comparable<get_free_member_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public UserEntitlement success;
        private static final TStruct STRUCT_DESC = new TStruct("get_free_member_result");
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
        public static class get_free_member_resultStandardScheme extends StandardScheme<get_free_member_result> {
            private get_free_member_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_free_member_result struct) throws TException {
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
                        UserEntitlement userEntitlement = new UserEntitlement();
                        struct.success = userEntitlement;
                        userEntitlement.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_free_member_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_free_member_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_free_member_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_free_member_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_free_member_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_free_member_resultStandardSchemeFactory implements SchemeFactory {
            private get_free_member_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_free_member_resultStandardScheme getScheme() {
                return new get_free_member_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_free_member_resultTupleScheme extends TupleScheme<get_free_member_result> {
            private get_free_member_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_free_member_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    UserEntitlement userEntitlement = new UserEntitlement();
                    struct.success = userEntitlement;
                    userEntitlement.read(tTupleProtocol);
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
            public void write(TProtocol prot, get_free_member_result struct) throws TException {
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
        public static class get_free_member_resultTupleSchemeFactory implements SchemeFactory {
            private get_free_member_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_free_member_resultTupleScheme getScheme() {
                return new get_free_member_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_free_member_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_free_member_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, UserEntitlement.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_free_member_result.class, unmodifiableMap);
        }

        public get_free_member_result() {
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
            if (that != null && (that instanceof get_free_member_result)) {
                return equals((get_free_member_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public UserEntitlement getSuccess() {
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

        public get_free_member_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_free_member_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_free_member_result setSuccess(UserEntitlement success) {
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
            StringBuilder sb2 = new StringBuilder("get_free_member_result(");
            sb2.append("success:");
            UserEntitlement userEntitlement = this.success;
            if (userEntitlement == null) {
                sb2.append("null");
            } else {
                sb2.append(userEntitlement);
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
            UserEntitlement userEntitlement = this.success;
            if (userEntitlement != null) {
                userEntitlement.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_free_member_result(UserEntitlement success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_free_member_result other) {
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
        public TBase<get_free_member_result, _Fields> deepCopy2() {
            return new get_free_member_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_free_member_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_free_member_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_free_member_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((UserEntitlement) value);
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

        public boolean equals(get_free_member_result that) {
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

        public get_free_member_result(get_free_member_result other) {
            if (other.isSetSuccess()) {
                this.success = new UserEntitlement(other.success);
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
    public static class get_member_popup_sale_info_args implements TBase<get_member_popup_sale_info_args, _Fields>, Serializable, Cloneable, Comparable<get_member_popup_sale_info_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_member_popup_sale_info_args");
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
        public static class get_member_popup_sale_info_argsStandardScheme extends StandardScheme<get_member_popup_sale_info_args> {
            private get_member_popup_sale_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_member_popup_sale_info_args struct) throws TException {
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
            public void write(TProtocol oprot, get_member_popup_sale_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_member_popup_sale_info_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_member_popup_sale_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_member_popup_sale_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_member_popup_sale_info_argsStandardScheme getScheme() {
                return new get_member_popup_sale_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_member_popup_sale_info_argsTupleScheme extends TupleScheme<get_member_popup_sale_info_args> {
            private get_member_popup_sale_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_member_popup_sale_info_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_member_popup_sale_info_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_member_popup_sale_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_member_popup_sale_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_member_popup_sale_info_argsTupleScheme getScheme() {
                return new get_member_popup_sale_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_member_popup_sale_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_member_popup_sale_info_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_member_popup_sale_info_args.class, unmodifiableMap);
        }

        public get_member_popup_sale_info_args() {
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

        public boolean equals(get_member_popup_sale_info_args that) {
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
            return "get_member_popup_sale_info_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_member_popup_sale_info_args(get_member_popup_sale_info_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_member_popup_sale_info_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_member_popup_sale_info_args, _Fields> deepCopy2() {
            return new get_member_popup_sale_info_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_member_popup_sale_info_args)) {
                return equals((get_member_popup_sale_info_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_member_popup_sale_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_member_popup_sale_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_member_popup_sale_info_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_member_popup_sale_info_result implements TBase<get_member_popup_sale_info_result, _Fields>, Serializable, Cloneable, Comparable<get_member_popup_sale_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public MemberPopupSaleInfo success;
        private static final TStruct STRUCT_DESC = new TStruct("get_member_popup_sale_info_result");
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
        public static class get_member_popup_sale_info_resultStandardScheme extends StandardScheme<get_member_popup_sale_info_result> {
            private get_member_popup_sale_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_member_popup_sale_info_result struct) throws TException {
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
                        MemberPopupSaleInfo memberPopupSaleInfo = new MemberPopupSaleInfo();
                        struct.success = memberPopupSaleInfo;
                        memberPopupSaleInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_member_popup_sale_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_member_popup_sale_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_member_popup_sale_info_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_member_popup_sale_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_member_popup_sale_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_member_popup_sale_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_member_popup_sale_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_member_popup_sale_info_resultStandardScheme getScheme() {
                return new get_member_popup_sale_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_member_popup_sale_info_resultTupleScheme extends TupleScheme<get_member_popup_sale_info_result> {
            private get_member_popup_sale_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_member_popup_sale_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    MemberPopupSaleInfo memberPopupSaleInfo = new MemberPopupSaleInfo();
                    struct.success = memberPopupSaleInfo;
                    memberPopupSaleInfo.read(tTupleProtocol);
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
            public void write(TProtocol prot, get_member_popup_sale_info_result struct) throws TException {
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
        public static class get_member_popup_sale_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_member_popup_sale_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_member_popup_sale_info_resultTupleScheme getScheme() {
                return new get_member_popup_sale_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_member_popup_sale_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_member_popup_sale_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, MemberPopupSaleInfo.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_member_popup_sale_info_result.class, unmodifiableMap);
        }

        public get_member_popup_sale_info_result() {
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
            if (that != null && (that instanceof get_member_popup_sale_info_result)) {
                return equals((get_member_popup_sale_info_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public MemberPopupSaleInfo getSuccess() {
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

        public get_member_popup_sale_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_member_popup_sale_info_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_member_popup_sale_info_result setSuccess(MemberPopupSaleInfo success) {
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
            StringBuilder sb2 = new StringBuilder("get_member_popup_sale_info_result(");
            sb2.append("success:");
            MemberPopupSaleInfo memberPopupSaleInfo = this.success;
            if (memberPopupSaleInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(memberPopupSaleInfo);
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
            MemberPopupSaleInfo memberPopupSaleInfo = this.success;
            if (memberPopupSaleInfo != null) {
                memberPopupSaleInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_member_popup_sale_info_result(MemberPopupSaleInfo success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_member_popup_sale_info_result other) {
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
        public TBase<get_member_popup_sale_info_result, _Fields> deepCopy2() {
            return new get_member_popup_sale_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_member_popup_sale_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_member_popup_sale_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_member_popup_sale_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((MemberPopupSaleInfo) value);
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

        public boolean equals(get_member_popup_sale_info_result that) {
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

        public get_member_popup_sale_info_result(get_member_popup_sale_info_result other) {
            if (other.isSetSuccess()) {
                this.success = new MemberPopupSaleInfo(other.success);
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
    public static class get_user_entitlement_infos_args implements TBase<get_user_entitlement_infos_args, _Fields>, Serializable, Cloneable, Comparable<get_user_entitlement_infos_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_user_entitlement_infos_args");
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
        public static class get_user_entitlement_infos_argsStandardScheme extends StandardScheme<get_user_entitlement_infos_args> {
            private get_user_entitlement_infos_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_user_entitlement_infos_args struct) throws TException {
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
            public void write(TProtocol oprot, get_user_entitlement_infos_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_user_entitlement_infos_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_entitlement_infos_argsStandardSchemeFactory implements SchemeFactory {
            private get_user_entitlement_infos_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_entitlement_infos_argsStandardScheme getScheme() {
                return new get_user_entitlement_infos_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_entitlement_infos_argsTupleScheme extends TupleScheme<get_user_entitlement_infos_args> {
            private get_user_entitlement_infos_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_user_entitlement_infos_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_user_entitlement_infos_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_entitlement_infos_argsTupleSchemeFactory implements SchemeFactory {
            private get_user_entitlement_infos_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_entitlement_infos_argsTupleScheme getScheme() {
                return new get_user_entitlement_infos_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_user_entitlement_infos_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_user_entitlement_infos_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_user_entitlement_infos_args.class, unmodifiableMap);
        }

        public get_user_entitlement_infos_args() {
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

        public boolean equals(get_user_entitlement_infos_args that) {
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
            return "get_user_entitlement_infos_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_user_entitlement_infos_args(get_user_entitlement_infos_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_user_entitlement_infos_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_user_entitlement_infos_args, _Fields> deepCopy2() {
            return new get_user_entitlement_infos_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_user_entitlement_infos_args)) {
                return equals((get_user_entitlement_infos_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_infos_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_infos_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_infos_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_user_entitlement_infos_result implements TBase<get_user_entitlement_infos_result, _Fields>, Serializable, Cloneable, Comparable<get_user_entitlement_infos_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public UserEntitlementInfos success;
        private static final TStruct STRUCT_DESC = new TStruct("get_user_entitlement_infos_result");
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
        public static class get_user_entitlement_infos_resultStandardScheme extends StandardScheme<get_user_entitlement_infos_result> {
            private get_user_entitlement_infos_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_user_entitlement_infos_result struct) throws TException {
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
                        UserEntitlementInfos userEntitlementInfos = new UserEntitlementInfos();
                        struct.success = userEntitlementInfos;
                        userEntitlementInfos.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_user_entitlement_infos_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_user_entitlement_infos_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_user_entitlement_infos_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_user_entitlement_infos_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_user_entitlement_infos_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_entitlement_infos_resultStandardSchemeFactory implements SchemeFactory {
            private get_user_entitlement_infos_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_entitlement_infos_resultStandardScheme getScheme() {
                return new get_user_entitlement_infos_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_entitlement_infos_resultTupleScheme extends TupleScheme<get_user_entitlement_infos_result> {
            private get_user_entitlement_infos_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_user_entitlement_infos_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    UserEntitlementInfos userEntitlementInfos = new UserEntitlementInfos();
                    struct.success = userEntitlementInfos;
                    userEntitlementInfos.read(tTupleProtocol);
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
            public void write(TProtocol prot, get_user_entitlement_infos_result struct) throws TException {
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
        public static class get_user_entitlement_infos_resultTupleSchemeFactory implements SchemeFactory {
            private get_user_entitlement_infos_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_entitlement_infos_resultTupleScheme getScheme() {
                return new get_user_entitlement_infos_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_user_entitlement_infos_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_user_entitlement_infos_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, UserEntitlementInfos.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_user_entitlement_infos_result.class, unmodifiableMap);
        }

        public get_user_entitlement_infos_result() {
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
            if (that != null && (that instanceof get_user_entitlement_infos_result)) {
                return equals((get_user_entitlement_infos_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public UserEntitlementInfos getSuccess() {
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

        public get_user_entitlement_infos_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_user_entitlement_infos_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_user_entitlement_infos_result setSuccess(UserEntitlementInfos success) {
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
            StringBuilder sb2 = new StringBuilder("get_user_entitlement_infos_result(");
            sb2.append("success:");
            UserEntitlementInfos userEntitlementInfos = this.success;
            if (userEntitlementInfos == null) {
                sb2.append("null");
            } else {
                sb2.append(userEntitlementInfos);
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
            UserEntitlementInfos userEntitlementInfos = this.success;
            if (userEntitlementInfos != null) {
                userEntitlementInfos.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_user_entitlement_infos_result(UserEntitlementInfos success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_user_entitlement_infos_result other) {
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
        public TBase<get_user_entitlement_infos_result, _Fields> deepCopy2() {
            return new get_user_entitlement_infos_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_infos_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_infos_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_infos_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((UserEntitlementInfos) value);
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

        public boolean equals(get_user_entitlement_infos_result that) {
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

        public get_user_entitlement_infos_result(get_user_entitlement_infos_result other) {
            if (other.isSetSuccess()) {
                this.success = new UserEntitlementInfos(other.success);
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
    public static class get_user_entitlement_sale_info_args implements TBase<get_user_entitlement_sale_info_args, _Fields>, Serializable, Cloneable, Comparable<get_user_entitlement_sale_info_args> {
        private static final int __SOURCE_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int source;
        private static final TStruct STRUCT_DESC = new TStruct("get_user_entitlement_sale_info_args");
        private static final TField SOURCE_FIELD_DESC = new TField("source", (byte) 8, 1);

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
        public static class get_user_entitlement_sale_info_argsStandardScheme extends StandardScheme<get_user_entitlement_sale_info_args> {
            private get_user_entitlement_sale_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_user_entitlement_sale_info_args struct) throws TException {
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
                    } else if (b11 == 8) {
                        struct.source = iprot.readI32();
                        struct.setSourceIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_user_entitlement_sale_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_user_entitlement_sale_info_args.STRUCT_DESC);
                oprot.writeFieldBegin(get_user_entitlement_sale_info_args.SOURCE_FIELD_DESC);
                oprot.writeI32(struct.source);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_entitlement_sale_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_user_entitlement_sale_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_entitlement_sale_info_argsStandardScheme getScheme() {
                return new get_user_entitlement_sale_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_entitlement_sale_info_argsTupleScheme extends TupleScheme<get_user_entitlement_sale_info_args> {
            private get_user_entitlement_sale_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_user_entitlement_sale_info_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                if (tTupleProtocol.readBitSet(1).get(0)) {
                    struct.source = tTupleProtocol.readI32();
                    struct.setSourceIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_user_entitlement_sale_info_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSource()) {
                    bitSet.set(0);
                }
                tTupleProtocol.writeBitSet(bitSet, 1);
                if (struct.isSetSource()) {
                    tTupleProtocol.writeI32(struct.source);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_entitlement_sale_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_user_entitlement_sale_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_entitlement_sale_info_argsTupleScheme getScheme() {
                return new get_user_entitlement_sale_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_user_entitlement_sale_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_user_entitlement_sale_info_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SOURCE, (_Fields) new FieldMetaData("source", (byte) 3, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_user_entitlement_sale_info_args.class, unmodifiableMap);
        }

        public get_user_entitlement_sale_info_args() {
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
            setSourceIsSet(false);
            this.source = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_user_entitlement_sale_info_args)) {
                return equals((get_user_entitlement_sale_info_args) that);
            }
            return false;
        }

        public int getSource() {
            return this.source;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetSource() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_user_entitlement_sale_info_args setSource(int source) {
            this.source = source;
            setSourceIsSet(true);
            return this;
        }

        public void setSourceIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "get_user_entitlement_sale_info_args(source:" + this.source + pn.j.f81007d;
        }

        public void unsetSource() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_user_entitlement_sale_info_args other) {
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
        public TBase<get_user_entitlement_sale_info_args, _Fields> deepCopy2() {
            return new get_user_entitlement_sale_info_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_sale_info_args$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getSource());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_sale_info_args$_Fields[field.ordinal()] == 1) {
                return isSetSource();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_sale_info_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetSource();
            } else {
                setSource(((Integer) value).intValue());
            }
        }

        public get_user_entitlement_sale_info_args(int source) {
            this();
            this.source = source;
            setSourceIsSet(true);
        }

        public boolean equals(get_user_entitlement_sale_info_args that) {
            return that != null && this.source == that.source;
        }

        public get_user_entitlement_sale_info_args(get_user_entitlement_sale_info_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.source = other.source;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_user_entitlement_sale_info_result implements TBase<get_user_entitlement_sale_info_result, _Fields>, Serializable, Cloneable, Comparable<get_user_entitlement_sale_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public UserEntitlementSaleInfo success;
        private static final TStruct STRUCT_DESC = new TStruct("get_user_entitlement_sale_info_result");
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
        public static class get_user_entitlement_sale_info_resultStandardScheme extends StandardScheme<get_user_entitlement_sale_info_result> {
            private get_user_entitlement_sale_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_user_entitlement_sale_info_result struct) throws TException {
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
                        UserEntitlementSaleInfo userEntitlementSaleInfo = new UserEntitlementSaleInfo();
                        struct.success = userEntitlementSaleInfo;
                        userEntitlementSaleInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_user_entitlement_sale_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_user_entitlement_sale_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_user_entitlement_sale_info_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_user_entitlement_sale_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_user_entitlement_sale_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_entitlement_sale_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_user_entitlement_sale_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_entitlement_sale_info_resultStandardScheme getScheme() {
                return new get_user_entitlement_sale_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_entitlement_sale_info_resultTupleScheme extends TupleScheme<get_user_entitlement_sale_info_result> {
            private get_user_entitlement_sale_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_user_entitlement_sale_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    UserEntitlementSaleInfo userEntitlementSaleInfo = new UserEntitlementSaleInfo();
                    struct.success = userEntitlementSaleInfo;
                    userEntitlementSaleInfo.read(tTupleProtocol);
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
            public void write(TProtocol prot, get_user_entitlement_sale_info_result struct) throws TException {
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
        public static class get_user_entitlement_sale_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_user_entitlement_sale_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_entitlement_sale_info_resultTupleScheme getScheme() {
                return new get_user_entitlement_sale_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_user_entitlement_sale_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_user_entitlement_sale_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, UserEntitlementSaleInfo.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_user_entitlement_sale_info_result.class, unmodifiableMap);
        }

        public get_user_entitlement_sale_info_result() {
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
            if (that != null && (that instanceof get_user_entitlement_sale_info_result)) {
                return equals((get_user_entitlement_sale_info_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public UserEntitlementSaleInfo getSuccess() {
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

        public get_user_entitlement_sale_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_user_entitlement_sale_info_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_user_entitlement_sale_info_result setSuccess(UserEntitlementSaleInfo success) {
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
            StringBuilder sb2 = new StringBuilder("get_user_entitlement_sale_info_result(");
            sb2.append("success:");
            UserEntitlementSaleInfo userEntitlementSaleInfo = this.success;
            if (userEntitlementSaleInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(userEntitlementSaleInfo);
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
            UserEntitlementSaleInfo userEntitlementSaleInfo = this.success;
            if (userEntitlementSaleInfo != null) {
                userEntitlementSaleInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_user_entitlement_sale_info_result(UserEntitlementSaleInfo success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_user_entitlement_sale_info_result other) {
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
        public TBase<get_user_entitlement_sale_info_result, _Fields> deepCopy2() {
            return new get_user_entitlement_sale_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_sale_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_sale_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_entitlement_sale_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((UserEntitlementSaleInfo) value);
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

        public boolean equals(get_user_entitlement_sale_info_result that) {
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

        public get_user_entitlement_sale_info_result(get_user_entitlement_sale_info_result other) {
            if (other.isSetSuccess()) {
                this.success = new UserEntitlementSaleInfo(other.success);
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
    public static class get_user_member_info_args implements TBase<get_user_member_info_args, _Fields>, Serializable, Cloneable, Comparable<get_user_member_info_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_user_member_info_args");
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
        public static class get_user_member_info_argsStandardScheme extends StandardScheme<get_user_member_info_args> {
            private get_user_member_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_user_member_info_args struct) throws TException {
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
            public void write(TProtocol oprot, get_user_member_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_user_member_info_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_member_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_user_member_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_member_info_argsStandardScheme getScheme() {
                return new get_user_member_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_member_info_argsTupleScheme extends TupleScheme<get_user_member_info_args> {
            private get_user_member_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_user_member_info_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_user_member_info_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_member_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_user_member_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_member_info_argsTupleScheme getScheme() {
                return new get_user_member_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_user_member_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_user_member_info_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_user_member_info_args.class, unmodifiableMap);
        }

        public get_user_member_info_args() {
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

        public boolean equals(get_user_member_info_args that) {
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
            return "get_user_member_info_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_user_member_info_args(get_user_member_info_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_user_member_info_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_user_member_info_args, _Fields> deepCopy2() {
            return new get_user_member_info_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_user_member_info_args)) {
                return equals((get_user_member_info_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_member_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_member_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_member_info_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_user_member_info_result implements TBase<get_user_member_info_result, _Fields>, Serializable, Cloneable, Comparable<get_user_member_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public UserEntitlement success;
        private static final TStruct STRUCT_DESC = new TStruct("get_user_member_info_result");
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
        public static class get_user_member_info_resultStandardScheme extends StandardScheme<get_user_member_info_result> {
            private get_user_member_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_user_member_info_result struct) throws TException {
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
                        UserEntitlement userEntitlement = new UserEntitlement();
                        struct.success = userEntitlement;
                        userEntitlement.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_user_member_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_user_member_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_user_member_info_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_user_member_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_user_member_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_member_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_user_member_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_member_info_resultStandardScheme getScheme() {
                return new get_user_member_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_member_info_resultTupleScheme extends TupleScheme<get_user_member_info_result> {
            private get_user_member_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_user_member_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    UserEntitlement userEntitlement = new UserEntitlement();
                    struct.success = userEntitlement;
                    userEntitlement.read(tTupleProtocol);
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
            public void write(TProtocol prot, get_user_member_info_result struct) throws TException {
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
        public static class get_user_member_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_user_member_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_member_info_resultTupleScheme getScheme() {
                return new get_user_member_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_user_member_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_user_member_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, UserEntitlement.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_user_member_info_result.class, unmodifiableMap);
        }

        public get_user_member_info_result() {
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
            if (that != null && (that instanceof get_user_member_info_result)) {
                return equals((get_user_member_info_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public UserEntitlement getSuccess() {
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

        public get_user_member_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_user_member_info_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_user_member_info_result setSuccess(UserEntitlement success) {
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
            StringBuilder sb2 = new StringBuilder("get_user_member_info_result(");
            sb2.append("success:");
            UserEntitlement userEntitlement = this.success;
            if (userEntitlement == null) {
                sb2.append("null");
            } else {
                sb2.append(userEntitlement);
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
            UserEntitlement userEntitlement = this.success;
            if (userEntitlement != null) {
                userEntitlement.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_user_member_info_result(UserEntitlement success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_user_member_info_result other) {
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
        public TBase<get_user_member_info_result, _Fields> deepCopy2() {
            return new get_user_member_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_member_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_member_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_member_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((UserEntitlement) value);
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

        public boolean equals(get_user_member_info_result that) {
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

        public get_user_member_info_result(get_user_member_info_result other) {
            if (other.isSetSuccess()) {
                this.success = new UserEntitlement(other.success);
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
    public static class get_user_sentence_energy_info_args implements TBase<get_user_sentence_energy_info_args, _Fields>, Serializable, Cloneable, Comparable<get_user_sentence_energy_info_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_user_sentence_energy_info_args");
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
        public static class get_user_sentence_energy_info_argsStandardScheme extends StandardScheme<get_user_sentence_energy_info_args> {
            private get_user_sentence_energy_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_user_sentence_energy_info_args struct) throws TException {
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
            public void write(TProtocol oprot, get_user_sentence_energy_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_user_sentence_energy_info_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_sentence_energy_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_user_sentence_energy_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_sentence_energy_info_argsStandardScheme getScheme() {
                return new get_user_sentence_energy_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_sentence_energy_info_argsTupleScheme extends TupleScheme<get_user_sentence_energy_info_args> {
            private get_user_sentence_energy_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_user_sentence_energy_info_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_user_sentence_energy_info_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_sentence_energy_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_user_sentence_energy_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_sentence_energy_info_argsTupleScheme getScheme() {
                return new get_user_sentence_energy_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_user_sentence_energy_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_user_sentence_energy_info_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_user_sentence_energy_info_args.class, unmodifiableMap);
        }

        public get_user_sentence_energy_info_args() {
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

        public boolean equals(get_user_sentence_energy_info_args that) {
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
            return "get_user_sentence_energy_info_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_user_sentence_energy_info_args(get_user_sentence_energy_info_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_user_sentence_energy_info_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_user_sentence_energy_info_args, _Fields> deepCopy2() {
            return new get_user_sentence_energy_info_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_user_sentence_energy_info_args)) {
                return equals((get_user_sentence_energy_info_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_sentence_energy_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_sentence_energy_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_sentence_energy_info_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_user_sentence_energy_info_result implements TBase<get_user_sentence_energy_info_result, _Fields>, Serializable, Cloneable, Comparable<get_user_sentence_energy_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public UserEntitlement success;
        private static final TStruct STRUCT_DESC = new TStruct("get_user_sentence_energy_info_result");
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
        public static class get_user_sentence_energy_info_resultStandardScheme extends StandardScheme<get_user_sentence_energy_info_result> {
            private get_user_sentence_energy_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_user_sentence_energy_info_result struct) throws TException {
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
                        UserEntitlement userEntitlement = new UserEntitlement();
                        struct.success = userEntitlement;
                        userEntitlement.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_user_sentence_energy_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_user_sentence_energy_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_user_sentence_energy_info_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_user_sentence_energy_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_user_sentence_energy_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_sentence_energy_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_user_sentence_energy_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_sentence_energy_info_resultStandardScheme getScheme() {
                return new get_user_sentence_energy_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_sentence_energy_info_resultTupleScheme extends TupleScheme<get_user_sentence_energy_info_result> {
            private get_user_sentence_energy_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_user_sentence_energy_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    UserEntitlement userEntitlement = new UserEntitlement();
                    struct.success = userEntitlement;
                    userEntitlement.read(tTupleProtocol);
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
            public void write(TProtocol prot, get_user_sentence_energy_info_result struct) throws TException {
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
        public static class get_user_sentence_energy_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_user_sentence_energy_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_sentence_energy_info_resultTupleScheme getScheme() {
                return new get_user_sentence_energy_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_user_sentence_energy_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_user_sentence_energy_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, UserEntitlement.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_user_sentence_energy_info_result.class, unmodifiableMap);
        }

        public get_user_sentence_energy_info_result() {
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
            if (that != null && (that instanceof get_user_sentence_energy_info_result)) {
                return equals((get_user_sentence_energy_info_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public UserEntitlement getSuccess() {
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

        public get_user_sentence_energy_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_user_sentence_energy_info_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_user_sentence_energy_info_result setSuccess(UserEntitlement success) {
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
            StringBuilder sb2 = new StringBuilder("get_user_sentence_energy_info_result(");
            sb2.append("success:");
            UserEntitlement userEntitlement = this.success;
            if (userEntitlement == null) {
                sb2.append("null");
            } else {
                sb2.append(userEntitlement);
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
            UserEntitlement userEntitlement = this.success;
            if (userEntitlement != null) {
                userEntitlement.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_user_sentence_energy_info_result(UserEntitlement success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_user_sentence_energy_info_result other) {
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
        public TBase<get_user_sentence_energy_info_result, _Fields> deepCopy2() {
            return new get_user_sentence_energy_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_sentence_energy_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_sentence_energy_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_sentence_energy_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((UserEntitlement) value);
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

        public boolean equals(get_user_sentence_energy_info_result that) {
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

        public get_user_sentence_energy_info_result(get_user_sentence_energy_info_result other) {
            if (other.isSetSuccess()) {
                this.success = new UserEntitlement(other.success);
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
    public static class get_user_word_energy_info_args implements TBase<get_user_word_energy_info_args, _Fields>, Serializable, Cloneable, Comparable<get_user_word_energy_info_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_user_word_energy_info_args");
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
        public static class get_user_word_energy_info_argsStandardScheme extends StandardScheme<get_user_word_energy_info_args> {
            private get_user_word_energy_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_user_word_energy_info_args struct) throws TException {
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
            public void write(TProtocol oprot, get_user_word_energy_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_user_word_energy_info_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_word_energy_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_user_word_energy_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_word_energy_info_argsStandardScheme getScheme() {
                return new get_user_word_energy_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_word_energy_info_argsTupleScheme extends TupleScheme<get_user_word_energy_info_args> {
            private get_user_word_energy_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_user_word_energy_info_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_user_word_energy_info_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_word_energy_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_user_word_energy_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_word_energy_info_argsTupleScheme getScheme() {
                return new get_user_word_energy_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_user_word_energy_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_user_word_energy_info_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_user_word_energy_info_args.class, unmodifiableMap);
        }

        public get_user_word_energy_info_args() {
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

        public boolean equals(get_user_word_energy_info_args that) {
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
            return "get_user_word_energy_info_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_user_word_energy_info_args(get_user_word_energy_info_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_user_word_energy_info_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_user_word_energy_info_args, _Fields> deepCopy2() {
            return new get_user_word_energy_info_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_user_word_energy_info_args)) {
                return equals((get_user_word_energy_info_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_word_energy_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_word_energy_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_word_energy_info_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_user_word_energy_info_result implements TBase<get_user_word_energy_info_result, _Fields>, Serializable, Cloneable, Comparable<get_user_word_energy_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public UserEntitlement success;
        private static final TStruct STRUCT_DESC = new TStruct("get_user_word_energy_info_result");
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
        public static class get_user_word_energy_info_resultStandardScheme extends StandardScheme<get_user_word_energy_info_result> {
            private get_user_word_energy_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_user_word_energy_info_result struct) throws TException {
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
                        UserEntitlement userEntitlement = new UserEntitlement();
                        struct.success = userEntitlement;
                        userEntitlement.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_user_word_energy_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_user_word_energy_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_user_word_energy_info_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_user_word_energy_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_user_word_energy_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_word_energy_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_user_word_energy_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_word_energy_info_resultStandardScheme getScheme() {
                return new get_user_word_energy_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_word_energy_info_resultTupleScheme extends TupleScheme<get_user_word_energy_info_result> {
            private get_user_word_energy_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_user_word_energy_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    UserEntitlement userEntitlement = new UserEntitlement();
                    struct.success = userEntitlement;
                    userEntitlement.read(tTupleProtocol);
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
            public void write(TProtocol prot, get_user_word_energy_info_result struct) throws TException {
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
        public static class get_user_word_energy_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_user_word_energy_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_word_energy_info_resultTupleScheme getScheme() {
                return new get_user_word_energy_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_user_word_energy_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_user_word_energy_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, UserEntitlement.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_user_word_energy_info_result.class, unmodifiableMap);
        }

        public get_user_word_energy_info_result() {
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
            if (that != null && (that instanceof get_user_word_energy_info_result)) {
                return equals((get_user_word_energy_info_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public UserEntitlement getSuccess() {
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

        public get_user_word_energy_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_user_word_energy_info_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_user_word_energy_info_result setSuccess(UserEntitlement success) {
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
            StringBuilder sb2 = new StringBuilder("get_user_word_energy_info_result(");
            sb2.append("success:");
            UserEntitlement userEntitlement = this.success;
            if (userEntitlement == null) {
                sb2.append("null");
            } else {
                sb2.append(userEntitlement);
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
            UserEntitlement userEntitlement = this.success;
            if (userEntitlement != null) {
                userEntitlement.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_user_word_energy_info_result(UserEntitlement success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_user_word_energy_info_result other) {
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
        public TBase<get_user_word_energy_info_result, _Fields> deepCopy2() {
            return new get_user_word_energy_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_word_energy_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_word_energy_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$StrategyApiService$get_user_word_energy_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((UserEntitlement) value);
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

        public boolean equals(get_user_word_energy_info_result that) {
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

        public get_user_word_energy_info_result(get_user_word_energy_info_result other) {
            if (other.isSetSuccess()) {
                this.success = new UserEntitlement(other.success);
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
