package com.baicizhan.online.user_activity_api;

import com.baicizhan.online.thrift.basic.LogicException;
import com.baicizhan.online.thrift.basic.SystemException;
import com.huawei.hms.push.constant.RemoteMessageConst;
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
public class UserActivityApiService {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_activity_api.UserActivityApiService$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$buy_export_quota_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$buy_export_quota_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$export_words_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$export_words_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$get_export_activity_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$get_export_activity_info_result$_Fields;

        static {
            int[] iArr = new int[buy_export_quota_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$buy_export_quota_result$_Fields = iArr;
            try {
                iArr[buy_export_quota_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$buy_export_quota_result$_Fields[buy_export_quota_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$buy_export_quota_result$_Fields[buy_export_quota_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$buy_export_quota_args$_Fields = new int[buy_export_quota_args._Fields.values().length];
            int[] iArr2 = new int[export_words_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$export_words_result$_Fields = iArr2;
            try {
                iArr2[export_words_result._Fields.BOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$export_words_result$_Fields[export_words_result._Fields.BOMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[export_words_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$export_words_args$_Fields = iArr3;
            try {
                iArr3[export_words_args._Fields.PARAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr4 = new int[get_export_activity_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$get_export_activity_info_result$_Fields = iArr4;
            try {
                iArr4[get_export_activity_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$get_export_activity_info_result$_Fields[get_export_activity_info_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$get_export_activity_info_result$_Fields[get_export_activity_info_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$get_export_activity_info_args$_Fields = new int[get_export_activity_info_args._Fields.values().length];
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
        public static class buy_export_quota_call extends TAsyncMethodCall {
            public buy_export_quota_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public ExportQuota getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_buy_export_quota();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("buy_export_quota", (byte) 1, 0));
                new buy_export_quota_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class export_words_call extends TAsyncMethodCall {
            private ExportParam param;

            public export_words_call(ExportParam param, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.param = param;
            }

            public void getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_export_words();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("export_words", (byte) 1, 0));
                export_words_args export_words_argsVar = new export_words_args();
                export_words_argsVar.setParam(this.param);
                export_words_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_export_activity_info_call extends TAsyncMethodCall {
            public get_export_activity_info_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public ExportActivityInfo getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_export_activity_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_export_activity_info", (byte) 1, 0));
                new get_export_activity_info_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        public AsyncClient(TProtocolFactory protocolFactory, TAsyncClientManager clientManager, TNonblockingTransport transport) {
            super(protocolFactory, clientManager, transport);
        }

        @Override // com.baicizhan.online.user_activity_api.UserActivityApiService.AsyncIface
        public void buy_export_quota(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            buy_export_quota_call buy_export_quota_callVar = new buy_export_quota_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = buy_export_quota_callVar;
            this.___manager.call(buy_export_quota_callVar);
        }

        @Override // com.baicizhan.online.user_activity_api.UserActivityApiService.AsyncIface
        public void export_words(ExportParam param, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            export_words_call export_words_callVar = new export_words_call(param, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = export_words_callVar;
            this.___manager.call(export_words_callVar);
        }

        @Override // com.baicizhan.online.user_activity_api.UserActivityApiService.AsyncIface
        public void get_export_activity_info(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_export_activity_info_call get_export_activity_info_callVar = new get_export_activity_info_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_export_activity_info_callVar;
            this.___manager.call(get_export_activity_info_callVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AsyncIface {
        void buy_export_quota(AsyncMethodCallback resultHandler) throws TException;

        void export_words(ExportParam param, AsyncMethodCallback resultHandler) throws TException;

        void get_export_activity_info(AsyncMethodCallback resultHandler) throws TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AsyncProcessor<I extends AsyncIface> extends TBaseAsyncProcessor<I> {
        private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class buy_export_quota<I extends AsyncIface> extends AsyncProcessFunction<I, buy_export_quota_args, ExportQuota> {
            public buy_export_quota() {
                super("buy_export_quota");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<ExportQuota> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<ExportQuota>() { // from class: com.baicizhan.online.user_activity_api.UserActivityApiService.AsyncProcessor.buy_export_quota.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        buy_export_quota_result buy_export_quota_resultVar;
                        buy_export_quota_result buy_export_quota_resultVar2 = new buy_export_quota_result();
                        try {
                            if (exc instanceof SystemException) {
                                buy_export_quota_resultVar2.boom = (SystemException) exc;
                                buy_export_quota_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    buy_export_quota_resultVar = r02;
                                    this.sendResponse(fb2, buy_export_quota_resultVar, b11, seqid);
                                    return;
                                }
                                buy_export_quota_resultVar2.bomb = (LogicException) exc;
                                buy_export_quota_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, buy_export_quota_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        buy_export_quota_resultVar = buy_export_quota_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(ExportQuota o11) {
                        buy_export_quota_result buy_export_quota_resultVar = new buy_export_quota_result();
                        buy_export_quota_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, buy_export_quota_resultVar, (byte) 2, seqid);
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
            public buy_export_quota_args getEmptyArgsInstance() {
                return new buy_export_quota_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, buy_export_quota_args args, AsyncMethodCallback<ExportQuota> resultHandler) throws TException {
                iface.buy_export_quota(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class export_words<I extends AsyncIface> extends AsyncProcessFunction<I, export_words_args, Void> {
            public export_words() {
                super("export_words");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.user_activity_api.UserActivityApiService.AsyncProcessor.export_words.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        export_words_result export_words_resultVar;
                        export_words_result export_words_resultVar2 = new export_words_result();
                        try {
                            if (exc instanceof SystemException) {
                                export_words_resultVar2.boom = (SystemException) exc;
                                export_words_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    export_words_resultVar = r02;
                                    this.sendResponse(fb2, export_words_resultVar, b11, seqid);
                                    return;
                                }
                                export_words_resultVar2.bomb = (LogicException) exc;
                                export_words_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, export_words_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        export_words_resultVar = export_words_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new export_words_result(), (byte) 2, seqid);
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
            public export_words_args getEmptyArgsInstance() {
                return new export_words_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, export_words_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.export_words(args.param, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_export_activity_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_export_activity_info_args, ExportActivityInfo> {
            public get_export_activity_info() {
                super("get_export_activity_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<ExportActivityInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<ExportActivityInfo>() { // from class: com.baicizhan.online.user_activity_api.UserActivityApiService.AsyncProcessor.get_export_activity_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_export_activity_info_result get_export_activity_info_resultVar;
                        get_export_activity_info_result get_export_activity_info_resultVar2 = new get_export_activity_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_export_activity_info_resultVar2.boom = (SystemException) exc;
                                get_export_activity_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_export_activity_info_resultVar = r02;
                                    this.sendResponse(fb2, get_export_activity_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_export_activity_info_resultVar2.bomb = (LogicException) exc;
                                get_export_activity_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_export_activity_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_export_activity_info_resultVar = get_export_activity_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(ExportActivityInfo o11) {
                        get_export_activity_info_result get_export_activity_info_resultVar = new get_export_activity_info_result();
                        get_export_activity_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_export_activity_info_resultVar, (byte) 2, seqid);
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
            public get_export_activity_info_args getEmptyArgsInstance() {
                return new get_export_activity_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_export_activity_info_args args, AsyncMethodCallback<ExportActivityInfo> resultHandler) throws TException {
                iface.get_export_activity_info(resultHandler);
            }
        }

        public AsyncProcessor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends AsyncIface> Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> getProcessMap(Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> processMap) {
            processMap.put("get_export_activity_info", new get_export_activity_info());
            processMap.put("export_words", new export_words());
            processMap.put("buy_export_quota", new buy_export_quota());
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

        @Override // com.baicizhan.online.user_activity_api.UserActivityApiService.Iface
        public ExportQuota buy_export_quota() throws SystemException, LogicException, TException {
            send_buy_export_quota();
            return recv_buy_export_quota();
        }

        @Override // com.baicizhan.online.user_activity_api.UserActivityApiService.Iface
        public void export_words(ExportParam param) throws SystemException, LogicException, TException {
            send_export_words(param);
            recv_export_words();
        }

        @Override // com.baicizhan.online.user_activity_api.UserActivityApiService.Iface
        public ExportActivityInfo get_export_activity_info() throws SystemException, LogicException, TException {
            send_get_export_activity_info();
            return recv_get_export_activity_info();
        }

        public ExportQuota recv_buy_export_quota() throws SystemException, LogicException, TException {
            buy_export_quota_result buy_export_quota_resultVar = new buy_export_quota_result();
            receiveBase(buy_export_quota_resultVar, "buy_export_quota");
            if (buy_export_quota_resultVar.isSetSuccess()) {
                return buy_export_quota_resultVar.success;
            }
            SystemException systemException = buy_export_quota_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = buy_export_quota_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "buy_export_quota failed: unknown result");
        }

        public void recv_export_words() throws SystemException, LogicException, TException {
            export_words_result export_words_resultVar = new export_words_result();
            receiveBase(export_words_resultVar, "export_words");
            SystemException systemException = export_words_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = export_words_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
        }

        public ExportActivityInfo recv_get_export_activity_info() throws SystemException, LogicException, TException {
            get_export_activity_info_result get_export_activity_info_resultVar = new get_export_activity_info_result();
            receiveBase(get_export_activity_info_resultVar, "get_export_activity_info");
            if (get_export_activity_info_resultVar.isSetSuccess()) {
                return get_export_activity_info_resultVar.success;
            }
            SystemException systemException = get_export_activity_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_export_activity_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_export_activity_info failed: unknown result");
        }

        public void send_buy_export_quota() throws TException {
            sendBase("buy_export_quota", new buy_export_quota_args());
        }

        public void send_export_words(ExportParam param) throws TException {
            export_words_args export_words_argsVar = new export_words_args();
            export_words_argsVar.setParam(param);
            sendBase("export_words", export_words_argsVar);
        }

        public void send_get_export_activity_info() throws TException {
            sendBase("get_export_activity_info", new get_export_activity_info_args());
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
        ExportQuota buy_export_quota() throws SystemException, LogicException, TException;

        void export_words(ExportParam param) throws SystemException, LogicException, TException;

        ExportActivityInfo get_export_activity_info() throws SystemException, LogicException, TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Processor<I extends Iface> extends TBaseProcessor<I> implements TProcessor {
        private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class buy_export_quota<I extends Iface> extends ProcessFunction<I, buy_export_quota_args> {
            public buy_export_quota() {
                super("buy_export_quota");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public buy_export_quota_args getEmptyArgsInstance() {
                return new buy_export_quota_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public buy_export_quota_result getResult(I iface, buy_export_quota_args args) throws TException {
                buy_export_quota_result buy_export_quota_resultVar = new buy_export_quota_result();
                try {
                    buy_export_quota_resultVar.success = iface.buy_export_quota();
                    return buy_export_quota_resultVar;
                } catch (LogicException e11) {
                    buy_export_quota_resultVar.bomb = e11;
                    return buy_export_quota_resultVar;
                } catch (SystemException e12) {
                    buy_export_quota_resultVar.boom = e12;
                    return buy_export_quota_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class export_words<I extends Iface> extends ProcessFunction<I, export_words_args> {
            public export_words() {
                super("export_words");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public export_words_args getEmptyArgsInstance() {
                return new export_words_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public export_words_result getResult(I iface, export_words_args args) throws TException {
                export_words_result export_words_resultVar = new export_words_result();
                try {
                    iface.export_words(args.param);
                    return export_words_resultVar;
                } catch (LogicException e11) {
                    export_words_resultVar.bomb = e11;
                    return export_words_resultVar;
                } catch (SystemException e12) {
                    export_words_resultVar.boom = e12;
                    return export_words_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_export_activity_info<I extends Iface> extends ProcessFunction<I, get_export_activity_info_args> {
            public get_export_activity_info() {
                super("get_export_activity_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_export_activity_info_args getEmptyArgsInstance() {
                return new get_export_activity_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_export_activity_info_result getResult(I iface, get_export_activity_info_args args) throws TException {
                get_export_activity_info_result get_export_activity_info_resultVar = new get_export_activity_info_result();
                try {
                    get_export_activity_info_resultVar.success = iface.get_export_activity_info();
                    return get_export_activity_info_resultVar;
                } catch (LogicException e11) {
                    get_export_activity_info_resultVar.bomb = e11;
                    return get_export_activity_info_resultVar;
                } catch (SystemException e12) {
                    get_export_activity_info_resultVar.boom = e12;
                    return get_export_activity_info_resultVar;
                }
            }
        }

        public Processor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends Iface> Map<String, ProcessFunction<I, ? extends TBase>> getProcessMap(Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            processMap.put("get_export_activity_info", new get_export_activity_info());
            processMap.put("export_words", new export_words());
            processMap.put("buy_export_quota", new buy_export_quota());
            return processMap;
        }

        public Processor(I iface, Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            super(iface, getProcessMap(processMap));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class buy_export_quota_args implements TBase<buy_export_quota_args, _Fields>, Serializable, Cloneable, Comparable<buy_export_quota_args> {
        private static final TStruct STRUCT_DESC = new TStruct("buy_export_quota_args");
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
        public static class buy_export_quota_argsStandardScheme extends StandardScheme<buy_export_quota_args> {
            private buy_export_quota_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, buy_export_quota_args struct) throws TException {
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
            public void write(TProtocol oprot, buy_export_quota_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(buy_export_quota_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class buy_export_quota_argsStandardSchemeFactory implements SchemeFactory {
            private buy_export_quota_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public buy_export_quota_argsStandardScheme getScheme() {
                return new buy_export_quota_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class buy_export_quota_argsTupleScheme extends TupleScheme<buy_export_quota_args> {
            private buy_export_quota_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, buy_export_quota_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, buy_export_quota_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class buy_export_quota_argsTupleSchemeFactory implements SchemeFactory {
            private buy_export_quota_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public buy_export_quota_argsTupleScheme getScheme() {
                return new buy_export_quota_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new buy_export_quota_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new buy_export_quota_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(buy_export_quota_args.class, unmodifiableMap);
        }

        public buy_export_quota_args() {
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

        public boolean equals(buy_export_quota_args that) {
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
            return "buy_export_quota_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public buy_export_quota_args(buy_export_quota_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(buy_export_quota_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<buy_export_quota_args, _Fields> deepCopy2() {
            return new buy_export_quota_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof buy_export_quota_args)) {
                return equals((buy_export_quota_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$buy_export_quota_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$buy_export_quota_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$buy_export_quota_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class buy_export_quota_result implements TBase<buy_export_quota_result, _Fields>, Serializable, Cloneable, Comparable<buy_export_quota_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public ExportQuota success;
        private static final TStruct STRUCT_DESC = new TStruct("buy_export_quota_result");
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
        public static class buy_export_quota_resultStandardScheme extends StandardScheme<buy_export_quota_result> {
            private buy_export_quota_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, buy_export_quota_result struct) throws TException {
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
                        ExportQuota exportQuota = new ExportQuota();
                        struct.success = exportQuota;
                        exportQuota.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, buy_export_quota_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(buy_export_quota_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(buy_export_quota_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(buy_export_quota_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(buy_export_quota_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class buy_export_quota_resultStandardSchemeFactory implements SchemeFactory {
            private buy_export_quota_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public buy_export_quota_resultStandardScheme getScheme() {
                return new buy_export_quota_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class buy_export_quota_resultTupleScheme extends TupleScheme<buy_export_quota_result> {
            private buy_export_quota_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, buy_export_quota_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    ExportQuota exportQuota = new ExportQuota();
                    struct.success = exportQuota;
                    exportQuota.read(tTupleProtocol);
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
            public void write(TProtocol prot, buy_export_quota_result struct) throws TException {
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
        public static class buy_export_quota_resultTupleSchemeFactory implements SchemeFactory {
            private buy_export_quota_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public buy_export_quota_resultTupleScheme getScheme() {
                return new buy_export_quota_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new buy_export_quota_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new buy_export_quota_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, ExportQuota.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(buy_export_quota_result.class, unmodifiableMap);
        }

        public buy_export_quota_result() {
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
            if (that != null && (that instanceof buy_export_quota_result)) {
                return equals((buy_export_quota_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public ExportQuota getSuccess() {
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

        public buy_export_quota_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public buy_export_quota_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public buy_export_quota_result setSuccess(ExportQuota success) {
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
            StringBuilder sb2 = new StringBuilder("buy_export_quota_result(");
            sb2.append("success:");
            ExportQuota exportQuota = this.success;
            if (exportQuota == null) {
                sb2.append("null");
            } else {
                sb2.append(exportQuota);
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
            ExportQuota exportQuota = this.success;
            if (exportQuota != null) {
                exportQuota.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public buy_export_quota_result(ExportQuota success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(buy_export_quota_result other) {
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
        public TBase<buy_export_quota_result, _Fields> deepCopy2() {
            return new buy_export_quota_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$buy_export_quota_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$buy_export_quota_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$buy_export_quota_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((ExportQuota) value);
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

        public boolean equals(buy_export_quota_result that) {
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

        public buy_export_quota_result(buy_export_quota_result other) {
            if (other.isSetSuccess()) {
                this.success = new ExportQuota(other.success);
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
    public static class export_words_args implements TBase<export_words_args, _Fields>, Serializable, Cloneable, Comparable<export_words_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public ExportParam param;
        private static final TStruct STRUCT_DESC = new TStruct("export_words_args");
        private static final TField PARAM_FIELD_DESC = new TField(RemoteMessageConst.MessageBody.PARAM, (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            PARAM(1, RemoteMessageConst.MessageBody.PARAM);

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
                return PARAM;
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
        public static class export_words_argsStandardScheme extends StandardScheme<export_words_args> {
            private export_words_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, export_words_args struct) throws TException {
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
                        ExportParam exportParam = new ExportParam();
                        struct.param = exportParam;
                        exportParam.read(iprot);
                        struct.setParamIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, export_words_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(export_words_args.STRUCT_DESC);
                if (struct.param != null) {
                    oprot.writeFieldBegin(export_words_args.PARAM_FIELD_DESC);
                    struct.param.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class export_words_argsStandardSchemeFactory implements SchemeFactory {
            private export_words_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public export_words_argsStandardScheme getScheme() {
                return new export_words_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class export_words_argsTupleScheme extends TupleScheme<export_words_args> {
            private export_words_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, export_words_args struct) throws TException {
                ExportParam exportParam = new ExportParam();
                struct.param = exportParam;
                exportParam.read((TTupleProtocol) prot);
                struct.setParamIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, export_words_args struct) throws TException {
                struct.param.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class export_words_argsTupleSchemeFactory implements SchemeFactory {
            private export_words_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public export_words_argsTupleScheme getScheme() {
                return new export_words_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new export_words_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new export_words_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.PARAM, (_Fields) new FieldMetaData(RemoteMessageConst.MessageBody.PARAM, (byte) 1, new StructMetaData((byte) 12, ExportParam.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(export_words_args.class, unmodifiableMap);
        }

        public export_words_args() {
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
            this.param = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof export_words_args)) {
                return equals((export_words_args) that);
            }
            return false;
        }

        public ExportParam getParam() {
            return this.param;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetParam() {
            return this.param != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public export_words_args setParam(ExportParam param) {
            this.param = param;
            return this;
        }

        public void setParamIsSet(boolean value) {
            if (value) {
                return;
            }
            this.param = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("export_words_args(");
            sb2.append("param:");
            ExportParam exportParam = this.param;
            if (exportParam == null) {
                sb2.append("null");
            } else {
                sb2.append(exportParam);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetParam() {
            this.param = null;
        }

        public void validate() throws TException {
            ExportParam exportParam = this.param;
            if (exportParam != null) {
                if (exportParam != null) {
                    exportParam.validate();
                }
            } else {
                throw new TProtocolException("Required field 'param' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public export_words_args(ExportParam param) {
            this();
            this.param = param;
        }

        @Override // java.lang.Comparable
        public int compareTo(export_words_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetParam()).compareTo(Boolean.valueOf(other.isSetParam()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetParam() || (compareTo = TBaseHelper.compareTo((Comparable) this.param, (Comparable) other.param)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<export_words_args, _Fields> deepCopy2() {
            return new export_words_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$export_words_args$_Fields[field.ordinal()] == 1) {
                return getParam();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$export_words_args$_Fields[field.ordinal()] == 1) {
                return isSetParam();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$export_words_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetParam();
            } else {
                setParam((ExportParam) value);
            }
        }

        public boolean equals(export_words_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetParam = isSetParam();
            boolean isSetParam2 = that.isSetParam();
            if (isSetParam || isSetParam2) {
                return isSetParam && isSetParam2 && this.param.equals(that.param);
            }
            return true;
        }

        public export_words_args(export_words_args other) {
            if (other.isSetParam()) {
                this.param = new ExportParam(other.param);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class export_words_result implements TBase<export_words_result, _Fields>, Serializable, Cloneable, Comparable<export_words_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        private static final TStruct STRUCT_DESC = new TStruct("export_words_result");
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
        public static class export_words_resultStandardScheme extends StandardScheme<export_words_result> {
            private export_words_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, export_words_result struct) throws TException {
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
            public void write(TProtocol oprot, export_words_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(export_words_result.STRUCT_DESC);
                if (struct.boom != null) {
                    oprot.writeFieldBegin(export_words_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(export_words_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class export_words_resultStandardSchemeFactory implements SchemeFactory {
            private export_words_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public export_words_resultStandardScheme getScheme() {
                return new export_words_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class export_words_resultTupleScheme extends TupleScheme<export_words_result> {
            private export_words_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, export_words_result struct) throws TException {
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
            public void write(TProtocol prot, export_words_result struct) throws TException {
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
        public static class export_words_resultTupleSchemeFactory implements SchemeFactory {
            private export_words_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public export_words_resultTupleScheme getScheme() {
                return new export_words_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new export_words_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new export_words_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(export_words_result.class, unmodifiableMap);
        }

        public export_words_result() {
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
            if (that != null && (that instanceof export_words_result)) {
                return equals((export_words_result) that);
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

        public export_words_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public export_words_result setBoom(SystemException boom) {
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
            StringBuilder sb2 = new StringBuilder("export_words_result(");
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

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public export_words_result(SystemException boom, LogicException bomb) {
            this();
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(export_words_result other) {
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
        public TBase<export_words_result, _Fields> deepCopy2() {
            return new export_words_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$export_words_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$export_words_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$export_words_result$_Fields[field.ordinal()];
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

        public boolean equals(export_words_result that) {
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

        public export_words_result(export_words_result other) {
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
    public static class get_export_activity_info_args implements TBase<get_export_activity_info_args, _Fields>, Serializable, Cloneable, Comparable<get_export_activity_info_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_export_activity_info_args");
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
        public static class get_export_activity_info_argsStandardScheme extends StandardScheme<get_export_activity_info_args> {
            private get_export_activity_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_export_activity_info_args struct) throws TException {
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
            public void write(TProtocol oprot, get_export_activity_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_export_activity_info_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_export_activity_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_export_activity_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_export_activity_info_argsStandardScheme getScheme() {
                return new get_export_activity_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_export_activity_info_argsTupleScheme extends TupleScheme<get_export_activity_info_args> {
            private get_export_activity_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_export_activity_info_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_export_activity_info_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_export_activity_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_export_activity_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_export_activity_info_argsTupleScheme getScheme() {
                return new get_export_activity_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_export_activity_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_export_activity_info_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_export_activity_info_args.class, unmodifiableMap);
        }

        public get_export_activity_info_args() {
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

        public boolean equals(get_export_activity_info_args that) {
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
            return "get_export_activity_info_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_export_activity_info_args(get_export_activity_info_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_export_activity_info_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_export_activity_info_args, _Fields> deepCopy2() {
            return new get_export_activity_info_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_export_activity_info_args)) {
                return equals((get_export_activity_info_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$get_export_activity_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$get_export_activity_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$get_export_activity_info_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_export_activity_info_result implements TBase<get_export_activity_info_result, _Fields>, Serializable, Cloneable, Comparable<get_export_activity_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public ExportActivityInfo success;
        private static final TStruct STRUCT_DESC = new TStruct("get_export_activity_info_result");
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
        public static class get_export_activity_info_resultStandardScheme extends StandardScheme<get_export_activity_info_result> {
            private get_export_activity_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_export_activity_info_result struct) throws TException {
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
                        ExportActivityInfo exportActivityInfo = new ExportActivityInfo();
                        struct.success = exportActivityInfo;
                        exportActivityInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_export_activity_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_export_activity_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_export_activity_info_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_export_activity_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_export_activity_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_export_activity_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_export_activity_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_export_activity_info_resultStandardScheme getScheme() {
                return new get_export_activity_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_export_activity_info_resultTupleScheme extends TupleScheme<get_export_activity_info_result> {
            private get_export_activity_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_export_activity_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    ExportActivityInfo exportActivityInfo = new ExportActivityInfo();
                    struct.success = exportActivityInfo;
                    exportActivityInfo.read(tTupleProtocol);
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
            public void write(TProtocol prot, get_export_activity_info_result struct) throws TException {
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
        public static class get_export_activity_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_export_activity_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_export_activity_info_resultTupleScheme getScheme() {
                return new get_export_activity_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_export_activity_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_export_activity_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, ExportActivityInfo.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_export_activity_info_result.class, unmodifiableMap);
        }

        public get_export_activity_info_result() {
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
            if (that != null && (that instanceof get_export_activity_info_result)) {
                return equals((get_export_activity_info_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public ExportActivityInfo getSuccess() {
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

        public get_export_activity_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_export_activity_info_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_export_activity_info_result setSuccess(ExportActivityInfo success) {
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
            StringBuilder sb2 = new StringBuilder("get_export_activity_info_result(");
            sb2.append("success:");
            ExportActivityInfo exportActivityInfo = this.success;
            if (exportActivityInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(exportActivityInfo);
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
            ExportActivityInfo exportActivityInfo = this.success;
            if (exportActivityInfo != null) {
                exportActivityInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_export_activity_info_result(ExportActivityInfo success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_export_activity_info_result other) {
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
        public TBase<get_export_activity_info_result, _Fields> deepCopy2() {
            return new get_export_activity_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$get_export_activity_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$get_export_activity_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$UserActivityApiService$get_export_activity_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((ExportActivityInfo) value);
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

        public boolean equals(get_export_activity_info_result that) {
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

        public get_export_activity_info_result(get_export_activity_info_result other) {
            if (other.isSetSuccess()) {
                this.success = new ExportActivityInfo(other.success);
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
