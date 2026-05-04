package com.baicizhan.online.notify;

import com.baicizhan.online.ad_property.AdDeviceInfo;
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
public class NotifyService {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.notify.NotifyService$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_v2_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_v2_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_msgs_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_msgs_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$notify$NotifyService$push_confirm_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$notify$NotifyService$push_confirm_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$notify$NotifyService$set_remind_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$notify$NotifyService$set_remind_info_result$_Fields;

        static {
            int[] iArr = new int[push_confirm_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$notify$NotifyService$push_confirm_result$_Fields = iArr;
            try {
                iArr[push_confirm_result._Fields.BOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyService$push_confirm_result$_Fields[push_confirm_result._Fields.BOMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[push_confirm_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$notify$NotifyService$push_confirm_args$_Fields = iArr2;
            try {
                iArr2[push_confirm_args._Fields.PARAMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr3 = new int[get_remind_msgs_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_msgs_result$_Fields = iArr3;
            try {
                iArr3[get_remind_msgs_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_msgs_result$_Fields[get_remind_msgs_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_msgs_result$_Fields[get_remind_msgs_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_msgs_args$_Fields = new int[get_remind_msgs_args._Fields.values().length];
            int[] iArr4 = new int[get_remind_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_info_result$_Fields = iArr4;
            try {
                iArr4[get_remind_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_info_result$_Fields[get_remind_info_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_info_result$_Fields[get_remind_info_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_info_args$_Fields = new int[get_remind_info_args._Fields.values().length];
            int[] iArr5 = new int[set_remind_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$notify$NotifyService$set_remind_info_result$_Fields = iArr5;
            try {
                iArr5[set_remind_info_result._Fields.BOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyService$set_remind_info_result$_Fields[set_remind_info_result._Fields.BOMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr6 = new int[set_remind_info_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$notify$NotifyService$set_remind_info_args$_Fields = iArr6;
            try {
                iArr6[set_remind_info_args._Fields.REMIND.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr7 = new int[get_latest_notify_v2_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_v2_result$_Fields = iArr7;
            try {
                iArr7[get_latest_notify_v2_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_v2_result$_Fields[get_latest_notify_v2_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_v2_result$_Fields[get_latest_notify_v2_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr8 = new int[get_latest_notify_v2_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_v2_args$_Fields = iArr8;
            try {
                iArr8[get_latest_notify_v2_args._Fields.DEVICE_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr9 = new int[get_latest_notify_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_result$_Fields = iArr9;
            try {
                iArr9[get_latest_notify_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_result$_Fields[get_latest_notify_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_result$_Fields[get_latest_notify_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            $SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_args$_Fields = new int[get_latest_notify_args._Fields.values().length];
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
        public static class get_latest_notify_call extends TAsyncMethodCall {
            public get_latest_notify_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public NotifyResult getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_latest_notify();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_latest_notify", (byte) 1, 0));
                new get_latest_notify_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_notify_v2_call extends TAsyncMethodCall {
            private AdDeviceInfo device_info;

            public get_latest_notify_v2_call(AdDeviceInfo device_info, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.device_info = device_info;
            }

            public NotifyResult getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_latest_notify_v2();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_latest_notify_v2", (byte) 1, 0));
                get_latest_notify_v2_args get_latest_notify_v2_argsVar = new get_latest_notify_v2_args();
                get_latest_notify_v2_argsVar.setDevice_info(this.device_info);
                get_latest_notify_v2_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_remind_info_call extends TAsyncMethodCall {
            public get_remind_info_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public UserRemindInfo getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_remind_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_remind_info", (byte) 1, 0));
                new get_remind_info_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_remind_msgs_call extends TAsyncMethodCall {
            public get_remind_msgs_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public List<UserRemindMsg> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_remind_msgs();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_remind_msgs", (byte) 1, 0));
                new get_remind_msgs_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class push_confirm_call extends TAsyncMethodCall {
            private PushConfirmParams params;

            public push_confirm_call(PushConfirmParams params, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.params = params;
            }

            public void getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_push_confirm();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("push_confirm", (byte) 1, 0));
                push_confirm_args push_confirm_argsVar = new push_confirm_args();
                push_confirm_argsVar.setParams(this.params);
                push_confirm_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class set_remind_info_call extends TAsyncMethodCall {
            private UserRemindInfo remind;

            public set_remind_info_call(UserRemindInfo remind, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.remind = remind;
            }

            public void getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_set_remind_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("set_remind_info", (byte) 1, 0));
                set_remind_info_args set_remind_info_argsVar = new set_remind_info_args();
                set_remind_info_argsVar.setRemind(this.remind);
                set_remind_info_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        public AsyncClient(TProtocolFactory protocolFactory, TAsyncClientManager clientManager, TNonblockingTransport transport) {
            super(protocolFactory, clientManager, transport);
        }

        @Override // com.baicizhan.online.notify.NotifyService.AsyncIface
        public void get_latest_notify(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_latest_notify_call get_latest_notify_callVar = new get_latest_notify_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_latest_notify_callVar;
            this.___manager.call(get_latest_notify_callVar);
        }

        @Override // com.baicizhan.online.notify.NotifyService.AsyncIface
        public void get_latest_notify_v2(AdDeviceInfo device_info, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_latest_notify_v2_call get_latest_notify_v2_callVar = new get_latest_notify_v2_call(device_info, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_latest_notify_v2_callVar;
            this.___manager.call(get_latest_notify_v2_callVar);
        }

        @Override // com.baicizhan.online.notify.NotifyService.AsyncIface
        public void get_remind_info(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_remind_info_call get_remind_info_callVar = new get_remind_info_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_remind_info_callVar;
            this.___manager.call(get_remind_info_callVar);
        }

        @Override // com.baicizhan.online.notify.NotifyService.AsyncIface
        public void get_remind_msgs(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_remind_msgs_call get_remind_msgs_callVar = new get_remind_msgs_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_remind_msgs_callVar;
            this.___manager.call(get_remind_msgs_callVar);
        }

        @Override // com.baicizhan.online.notify.NotifyService.AsyncIface
        public void push_confirm(PushConfirmParams params, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            push_confirm_call push_confirm_callVar = new push_confirm_call(params, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = push_confirm_callVar;
            this.___manager.call(push_confirm_callVar);
        }

        @Override // com.baicizhan.online.notify.NotifyService.AsyncIface
        public void set_remind_info(UserRemindInfo remind, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            set_remind_info_call set_remind_info_callVar = new set_remind_info_call(remind, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = set_remind_info_callVar;
            this.___manager.call(set_remind_info_callVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AsyncIface {
        void get_latest_notify(AsyncMethodCallback resultHandler) throws TException;

        void get_latest_notify_v2(AdDeviceInfo device_info, AsyncMethodCallback resultHandler) throws TException;

        void get_remind_info(AsyncMethodCallback resultHandler) throws TException;

        void get_remind_msgs(AsyncMethodCallback resultHandler) throws TException;

        void push_confirm(PushConfirmParams params, AsyncMethodCallback resultHandler) throws TException;

        void set_remind_info(UserRemindInfo remind, AsyncMethodCallback resultHandler) throws TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AsyncProcessor<I extends AsyncIface> extends TBaseAsyncProcessor<I> {
        private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_notify<I extends AsyncIface> extends AsyncProcessFunction<I, get_latest_notify_args, NotifyResult> {
            public get_latest_notify() {
                super("get_latest_notify");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<NotifyResult> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<NotifyResult>() { // from class: com.baicizhan.online.notify.NotifyService.AsyncProcessor.get_latest_notify.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_latest_notify_result get_latest_notify_resultVar;
                        get_latest_notify_result get_latest_notify_resultVar2 = new get_latest_notify_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_latest_notify_resultVar2.boom = (SystemException) exc;
                                get_latest_notify_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_latest_notify_resultVar = r02;
                                    this.sendResponse(fb2, get_latest_notify_resultVar, b11, seqid);
                                    return;
                                }
                                get_latest_notify_resultVar2.bomb = (LogicException) exc;
                                get_latest_notify_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_latest_notify_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_latest_notify_resultVar = get_latest_notify_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(NotifyResult o11) {
                        get_latest_notify_result get_latest_notify_resultVar = new get_latest_notify_result();
                        get_latest_notify_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_latest_notify_resultVar, (byte) 2, seqid);
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
            public get_latest_notify_args getEmptyArgsInstance() {
                return new get_latest_notify_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_latest_notify_args args, AsyncMethodCallback<NotifyResult> resultHandler) throws TException {
                iface.get_latest_notify(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_notify_v2<I extends AsyncIface> extends AsyncProcessFunction<I, get_latest_notify_v2_args, NotifyResult> {
            public get_latest_notify_v2() {
                super("get_latest_notify_v2");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<NotifyResult> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<NotifyResult>() { // from class: com.baicizhan.online.notify.NotifyService.AsyncProcessor.get_latest_notify_v2.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_latest_notify_v2_result get_latest_notify_v2_resultVar;
                        get_latest_notify_v2_result get_latest_notify_v2_resultVar2 = new get_latest_notify_v2_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_latest_notify_v2_resultVar2.boom = (SystemException) exc;
                                get_latest_notify_v2_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_latest_notify_v2_resultVar = r02;
                                    this.sendResponse(fb2, get_latest_notify_v2_resultVar, b11, seqid);
                                    return;
                                }
                                get_latest_notify_v2_resultVar2.bomb = (LogicException) exc;
                                get_latest_notify_v2_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_latest_notify_v2_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_latest_notify_v2_resultVar = get_latest_notify_v2_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(NotifyResult o11) {
                        get_latest_notify_v2_result get_latest_notify_v2_resultVar = new get_latest_notify_v2_result();
                        get_latest_notify_v2_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_latest_notify_v2_resultVar, (byte) 2, seqid);
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
            public get_latest_notify_v2_args getEmptyArgsInstance() {
                return new get_latest_notify_v2_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_latest_notify_v2_args args, AsyncMethodCallback<NotifyResult> resultHandler) throws TException {
                iface.get_latest_notify_v2(args.device_info, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_remind_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_remind_info_args, UserRemindInfo> {
            public get_remind_info() {
                super("get_remind_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<UserRemindInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<UserRemindInfo>() { // from class: com.baicizhan.online.notify.NotifyService.AsyncProcessor.get_remind_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_remind_info_result get_remind_info_resultVar;
                        get_remind_info_result get_remind_info_resultVar2 = new get_remind_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_remind_info_resultVar2.boom = (SystemException) exc;
                                get_remind_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_remind_info_resultVar = r02;
                                    this.sendResponse(fb2, get_remind_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_remind_info_resultVar2.bomb = (LogicException) exc;
                                get_remind_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_remind_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_remind_info_resultVar = get_remind_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(UserRemindInfo o11) {
                        get_remind_info_result get_remind_info_resultVar = new get_remind_info_result();
                        get_remind_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_remind_info_resultVar, (byte) 2, seqid);
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
            public get_remind_info_args getEmptyArgsInstance() {
                return new get_remind_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_remind_info_args args, AsyncMethodCallback<UserRemindInfo> resultHandler) throws TException {
                iface.get_remind_info(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_remind_msgs<I extends AsyncIface> extends AsyncProcessFunction<I, get_remind_msgs_args, List<UserRemindMsg>> {
            public get_remind_msgs() {
                super("get_remind_msgs");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<UserRemindMsg>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<UserRemindMsg>>() { // from class: com.baicizhan.online.notify.NotifyService.AsyncProcessor.get_remind_msgs.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_remind_msgs_result get_remind_msgs_resultVar;
                        get_remind_msgs_result get_remind_msgs_resultVar2 = new get_remind_msgs_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_remind_msgs_resultVar2.boom = (SystemException) exc;
                                get_remind_msgs_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_remind_msgs_resultVar = r02;
                                    this.sendResponse(fb2, get_remind_msgs_resultVar, b11, seqid);
                                    return;
                                }
                                get_remind_msgs_resultVar2.bomb = (LogicException) exc;
                                get_remind_msgs_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_remind_msgs_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_remind_msgs_resultVar = get_remind_msgs_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<UserRemindMsg> o11) {
                        get_remind_msgs_result get_remind_msgs_resultVar = new get_remind_msgs_result();
                        get_remind_msgs_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_remind_msgs_resultVar, (byte) 2, seqid);
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
            public get_remind_msgs_args getEmptyArgsInstance() {
                return new get_remind_msgs_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_remind_msgs_args args, AsyncMethodCallback<List<UserRemindMsg>> resultHandler) throws TException {
                iface.get_remind_msgs(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class push_confirm<I extends AsyncIface> extends AsyncProcessFunction<I, push_confirm_args, Void> {
            public push_confirm() {
                super("push_confirm");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.notify.NotifyService.AsyncProcessor.push_confirm.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        push_confirm_result push_confirm_resultVar;
                        push_confirm_result push_confirm_resultVar2 = new push_confirm_result();
                        try {
                            if (exc instanceof SystemException) {
                                push_confirm_resultVar2.boom = (SystemException) exc;
                                push_confirm_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    push_confirm_resultVar = r02;
                                    this.sendResponse(fb2, push_confirm_resultVar, b11, seqid);
                                    return;
                                }
                                push_confirm_resultVar2.bomb = (LogicException) exc;
                                push_confirm_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, push_confirm_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        push_confirm_resultVar = push_confirm_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new push_confirm_result(), (byte) 2, seqid);
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
            public push_confirm_args getEmptyArgsInstance() {
                return new push_confirm_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, push_confirm_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.push_confirm(args.params, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class set_remind_info<I extends AsyncIface> extends AsyncProcessFunction<I, set_remind_info_args, Void> {
            public set_remind_info() {
                super("set_remind_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.notify.NotifyService.AsyncProcessor.set_remind_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        set_remind_info_result set_remind_info_resultVar;
                        set_remind_info_result set_remind_info_resultVar2 = new set_remind_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                set_remind_info_resultVar2.boom = (SystemException) exc;
                                set_remind_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    set_remind_info_resultVar = r02;
                                    this.sendResponse(fb2, set_remind_info_resultVar, b11, seqid);
                                    return;
                                }
                                set_remind_info_resultVar2.bomb = (LogicException) exc;
                                set_remind_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, set_remind_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        set_remind_info_resultVar = set_remind_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new set_remind_info_result(), (byte) 2, seqid);
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
            public set_remind_info_args getEmptyArgsInstance() {
                return new set_remind_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, set_remind_info_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.set_remind_info(args.remind, resultHandler);
            }
        }

        public AsyncProcessor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends AsyncIface> Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> getProcessMap(Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> processMap) {
            processMap.put("get_latest_notify", new get_latest_notify());
            processMap.put("get_latest_notify_v2", new get_latest_notify_v2());
            processMap.put("set_remind_info", new set_remind_info());
            processMap.put("get_remind_info", new get_remind_info());
            processMap.put("get_remind_msgs", new get_remind_msgs());
            processMap.put("push_confirm", new push_confirm());
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

        @Override // com.baicizhan.online.notify.NotifyService.Iface
        public NotifyResult get_latest_notify() throws SystemException, LogicException, TException {
            send_get_latest_notify();
            return recv_get_latest_notify();
        }

        @Override // com.baicizhan.online.notify.NotifyService.Iface
        public NotifyResult get_latest_notify_v2(AdDeviceInfo device_info) throws SystemException, LogicException, TException {
            send_get_latest_notify_v2(device_info);
            return recv_get_latest_notify_v2();
        }

        @Override // com.baicizhan.online.notify.NotifyService.Iface
        public UserRemindInfo get_remind_info() throws SystemException, LogicException, TException {
            send_get_remind_info();
            return recv_get_remind_info();
        }

        @Override // com.baicizhan.online.notify.NotifyService.Iface
        public List<UserRemindMsg> get_remind_msgs() throws SystemException, LogicException, TException {
            send_get_remind_msgs();
            return recv_get_remind_msgs();
        }

        @Override // com.baicizhan.online.notify.NotifyService.Iface
        public void push_confirm(PushConfirmParams params) throws SystemException, LogicException, TException {
            send_push_confirm(params);
            recv_push_confirm();
        }

        public NotifyResult recv_get_latest_notify() throws SystemException, LogicException, TException {
            get_latest_notify_result get_latest_notify_resultVar = new get_latest_notify_result();
            receiveBase(get_latest_notify_resultVar, "get_latest_notify");
            if (get_latest_notify_resultVar.isSetSuccess()) {
                return get_latest_notify_resultVar.success;
            }
            SystemException systemException = get_latest_notify_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_latest_notify_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_latest_notify failed: unknown result");
        }

        public NotifyResult recv_get_latest_notify_v2() throws SystemException, LogicException, TException {
            get_latest_notify_v2_result get_latest_notify_v2_resultVar = new get_latest_notify_v2_result();
            receiveBase(get_latest_notify_v2_resultVar, "get_latest_notify_v2");
            if (get_latest_notify_v2_resultVar.isSetSuccess()) {
                return get_latest_notify_v2_resultVar.success;
            }
            SystemException systemException = get_latest_notify_v2_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_latest_notify_v2_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_latest_notify_v2 failed: unknown result");
        }

        public UserRemindInfo recv_get_remind_info() throws SystemException, LogicException, TException {
            get_remind_info_result get_remind_info_resultVar = new get_remind_info_result();
            receiveBase(get_remind_info_resultVar, "get_remind_info");
            if (get_remind_info_resultVar.isSetSuccess()) {
                return get_remind_info_resultVar.success;
            }
            SystemException systemException = get_remind_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_remind_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_remind_info failed: unknown result");
        }

        public List<UserRemindMsg> recv_get_remind_msgs() throws SystemException, LogicException, TException {
            get_remind_msgs_result get_remind_msgs_resultVar = new get_remind_msgs_result();
            receiveBase(get_remind_msgs_resultVar, "get_remind_msgs");
            if (get_remind_msgs_resultVar.isSetSuccess()) {
                return get_remind_msgs_resultVar.success;
            }
            SystemException systemException = get_remind_msgs_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_remind_msgs_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_remind_msgs failed: unknown result");
        }

        public void recv_push_confirm() throws SystemException, LogicException, TException {
            push_confirm_result push_confirm_resultVar = new push_confirm_result();
            receiveBase(push_confirm_resultVar, "push_confirm");
            SystemException systemException = push_confirm_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = push_confirm_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
        }

        public void recv_set_remind_info() throws SystemException, LogicException, TException {
            set_remind_info_result set_remind_info_resultVar = new set_remind_info_result();
            receiveBase(set_remind_info_resultVar, "set_remind_info");
            SystemException systemException = set_remind_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = set_remind_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
        }

        public void send_get_latest_notify() throws TException {
            sendBase("get_latest_notify", new get_latest_notify_args());
        }

        public void send_get_latest_notify_v2(AdDeviceInfo device_info) throws TException {
            get_latest_notify_v2_args get_latest_notify_v2_argsVar = new get_latest_notify_v2_args();
            get_latest_notify_v2_argsVar.setDevice_info(device_info);
            sendBase("get_latest_notify_v2", get_latest_notify_v2_argsVar);
        }

        public void send_get_remind_info() throws TException {
            sendBase("get_remind_info", new get_remind_info_args());
        }

        public void send_get_remind_msgs() throws TException {
            sendBase("get_remind_msgs", new get_remind_msgs_args());
        }

        public void send_push_confirm(PushConfirmParams params) throws TException {
            push_confirm_args push_confirm_argsVar = new push_confirm_args();
            push_confirm_argsVar.setParams(params);
            sendBase("push_confirm", push_confirm_argsVar);
        }

        public void send_set_remind_info(UserRemindInfo remind) throws TException {
            set_remind_info_args set_remind_info_argsVar = new set_remind_info_args();
            set_remind_info_argsVar.setRemind(remind);
            sendBase("set_remind_info", set_remind_info_argsVar);
        }

        @Override // com.baicizhan.online.notify.NotifyService.Iface
        public void set_remind_info(UserRemindInfo remind) throws SystemException, LogicException, TException {
            send_set_remind_info(remind);
            recv_set_remind_info();
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
        NotifyResult get_latest_notify() throws SystemException, LogicException, TException;

        NotifyResult get_latest_notify_v2(AdDeviceInfo device_info) throws SystemException, LogicException, TException;

        UserRemindInfo get_remind_info() throws SystemException, LogicException, TException;

        List<UserRemindMsg> get_remind_msgs() throws SystemException, LogicException, TException;

        void push_confirm(PushConfirmParams params) throws SystemException, LogicException, TException;

        void set_remind_info(UserRemindInfo remind) throws SystemException, LogicException, TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Processor<I extends Iface> extends TBaseProcessor<I> implements TProcessor {
        private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_notify<I extends Iface> extends ProcessFunction<I, get_latest_notify_args> {
            public get_latest_notify() {
                super("get_latest_notify");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_latest_notify_args getEmptyArgsInstance() {
                return new get_latest_notify_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_latest_notify_result getResult(I iface, get_latest_notify_args args) throws TException {
                get_latest_notify_result get_latest_notify_resultVar = new get_latest_notify_result();
                try {
                    get_latest_notify_resultVar.success = iface.get_latest_notify();
                    return get_latest_notify_resultVar;
                } catch (LogicException e11) {
                    get_latest_notify_resultVar.bomb = e11;
                    return get_latest_notify_resultVar;
                } catch (SystemException e12) {
                    get_latest_notify_resultVar.boom = e12;
                    return get_latest_notify_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_notify_v2<I extends Iface> extends ProcessFunction<I, get_latest_notify_v2_args> {
            public get_latest_notify_v2() {
                super("get_latest_notify_v2");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_latest_notify_v2_args getEmptyArgsInstance() {
                return new get_latest_notify_v2_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_latest_notify_v2_result getResult(I iface, get_latest_notify_v2_args args) throws TException {
                get_latest_notify_v2_result get_latest_notify_v2_resultVar = new get_latest_notify_v2_result();
                try {
                    get_latest_notify_v2_resultVar.success = iface.get_latest_notify_v2(args.device_info);
                    return get_latest_notify_v2_resultVar;
                } catch (LogicException e11) {
                    get_latest_notify_v2_resultVar.bomb = e11;
                    return get_latest_notify_v2_resultVar;
                } catch (SystemException e12) {
                    get_latest_notify_v2_resultVar.boom = e12;
                    return get_latest_notify_v2_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_remind_info<I extends Iface> extends ProcessFunction<I, get_remind_info_args> {
            public get_remind_info() {
                super("get_remind_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_remind_info_args getEmptyArgsInstance() {
                return new get_remind_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_remind_info_result getResult(I iface, get_remind_info_args args) throws TException {
                get_remind_info_result get_remind_info_resultVar = new get_remind_info_result();
                try {
                    get_remind_info_resultVar.success = iface.get_remind_info();
                    return get_remind_info_resultVar;
                } catch (LogicException e11) {
                    get_remind_info_resultVar.bomb = e11;
                    return get_remind_info_resultVar;
                } catch (SystemException e12) {
                    get_remind_info_resultVar.boom = e12;
                    return get_remind_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_remind_msgs<I extends Iface> extends ProcessFunction<I, get_remind_msgs_args> {
            public get_remind_msgs() {
                super("get_remind_msgs");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_remind_msgs_args getEmptyArgsInstance() {
                return new get_remind_msgs_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_remind_msgs_result getResult(I iface, get_remind_msgs_args args) throws TException {
                get_remind_msgs_result get_remind_msgs_resultVar = new get_remind_msgs_result();
                try {
                    get_remind_msgs_resultVar.success = iface.get_remind_msgs();
                    return get_remind_msgs_resultVar;
                } catch (LogicException e11) {
                    get_remind_msgs_resultVar.bomb = e11;
                    return get_remind_msgs_resultVar;
                } catch (SystemException e12) {
                    get_remind_msgs_resultVar.boom = e12;
                    return get_remind_msgs_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class push_confirm<I extends Iface> extends ProcessFunction<I, push_confirm_args> {
            public push_confirm() {
                super("push_confirm");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public push_confirm_args getEmptyArgsInstance() {
                return new push_confirm_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public push_confirm_result getResult(I iface, push_confirm_args args) throws TException {
                push_confirm_result push_confirm_resultVar = new push_confirm_result();
                try {
                    iface.push_confirm(args.params);
                    return push_confirm_resultVar;
                } catch (LogicException e11) {
                    push_confirm_resultVar.bomb = e11;
                    return push_confirm_resultVar;
                } catch (SystemException e12) {
                    push_confirm_resultVar.boom = e12;
                    return push_confirm_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class set_remind_info<I extends Iface> extends ProcessFunction<I, set_remind_info_args> {
            public set_remind_info() {
                super("set_remind_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public set_remind_info_args getEmptyArgsInstance() {
                return new set_remind_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public set_remind_info_result getResult(I iface, set_remind_info_args args) throws TException {
                set_remind_info_result set_remind_info_resultVar = new set_remind_info_result();
                try {
                    iface.set_remind_info(args.remind);
                    return set_remind_info_resultVar;
                } catch (LogicException e11) {
                    set_remind_info_resultVar.bomb = e11;
                    return set_remind_info_resultVar;
                } catch (SystemException e12) {
                    set_remind_info_resultVar.boom = e12;
                    return set_remind_info_resultVar;
                }
            }
        }

        public Processor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends Iface> Map<String, ProcessFunction<I, ? extends TBase>> getProcessMap(Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            processMap.put("get_latest_notify", new get_latest_notify());
            processMap.put("get_latest_notify_v2", new get_latest_notify_v2());
            processMap.put("set_remind_info", new set_remind_info());
            processMap.put("get_remind_info", new get_remind_info());
            processMap.put("get_remind_msgs", new get_remind_msgs());
            processMap.put("push_confirm", new push_confirm());
            return processMap;
        }

        public Processor(I iface, Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            super(iface, getProcessMap(processMap));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_latest_notify_args implements TBase<get_latest_notify_args, _Fields>, Serializable, Cloneable, Comparable<get_latest_notify_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_latest_notify_args");
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
        public static class get_latest_notify_argsStandardScheme extends StandardScheme<get_latest_notify_args> {
            private get_latest_notify_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_latest_notify_args struct) throws TException {
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
            public void write(TProtocol oprot, get_latest_notify_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_latest_notify_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_notify_argsStandardSchemeFactory implements SchemeFactory {
            private get_latest_notify_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_latest_notify_argsStandardScheme getScheme() {
                return new get_latest_notify_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_notify_argsTupleScheme extends TupleScheme<get_latest_notify_args> {
            private get_latest_notify_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_latest_notify_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_latest_notify_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_notify_argsTupleSchemeFactory implements SchemeFactory {
            private get_latest_notify_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_latest_notify_argsTupleScheme getScheme() {
                return new get_latest_notify_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_latest_notify_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_latest_notify_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_latest_notify_args.class, unmodifiableMap);
        }

        public get_latest_notify_args() {
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

        public boolean equals(get_latest_notify_args that) {
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
            return "get_latest_notify_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_latest_notify_args(get_latest_notify_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_latest_notify_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_latest_notify_args, _Fields> deepCopy2() {
            return new get_latest_notify_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_latest_notify_args)) {
                return equals((get_latest_notify_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_latest_notify_result implements TBase<get_latest_notify_result, _Fields>, Serializable, Cloneable, Comparable<get_latest_notify_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public NotifyResult success;
        private static final TStruct STRUCT_DESC = new TStruct("get_latest_notify_result");
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
        public static class get_latest_notify_resultStandardScheme extends StandardScheme<get_latest_notify_result> {
            private get_latest_notify_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_latest_notify_result struct) throws TException {
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
                        NotifyResult notifyResult = new NotifyResult();
                        struct.success = notifyResult;
                        notifyResult.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_latest_notify_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_latest_notify_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_latest_notify_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_latest_notify_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_latest_notify_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_notify_resultStandardSchemeFactory implements SchemeFactory {
            private get_latest_notify_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_latest_notify_resultStandardScheme getScheme() {
                return new get_latest_notify_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_notify_resultTupleScheme extends TupleScheme<get_latest_notify_result> {
            private get_latest_notify_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_latest_notify_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    NotifyResult notifyResult = new NotifyResult();
                    struct.success = notifyResult;
                    notifyResult.read(tTupleProtocol);
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
            public void write(TProtocol prot, get_latest_notify_result struct) throws TException {
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
        public static class get_latest_notify_resultTupleSchemeFactory implements SchemeFactory {
            private get_latest_notify_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_latest_notify_resultTupleScheme getScheme() {
                return new get_latest_notify_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_latest_notify_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_latest_notify_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, NotifyResult.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_latest_notify_result.class, unmodifiableMap);
        }

        public get_latest_notify_result() {
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
            if (that != null && (that instanceof get_latest_notify_result)) {
                return equals((get_latest_notify_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public NotifyResult getSuccess() {
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

        public get_latest_notify_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_latest_notify_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_latest_notify_result setSuccess(NotifyResult success) {
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
            StringBuilder sb2 = new StringBuilder("get_latest_notify_result(");
            sb2.append("success:");
            NotifyResult notifyResult = this.success;
            if (notifyResult == null) {
                sb2.append("null");
            } else {
                sb2.append(notifyResult);
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
            NotifyResult notifyResult = this.success;
            if (notifyResult != null) {
                notifyResult.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_latest_notify_result(NotifyResult success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_latest_notify_result other) {
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
        public TBase<get_latest_notify_result, _Fields> deepCopy2() {
            return new get_latest_notify_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((NotifyResult) value);
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

        public boolean equals(get_latest_notify_result that) {
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

        public get_latest_notify_result(get_latest_notify_result other) {
            if (other.isSetSuccess()) {
                this.success = new NotifyResult(other.success);
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
    public static class get_latest_notify_v2_args implements TBase<get_latest_notify_v2_args, _Fields>, Serializable, Cloneable, Comparable<get_latest_notify_v2_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public AdDeviceInfo device_info;
        private static final TStruct STRUCT_DESC = new TStruct("get_latest_notify_v2_args");
        private static final TField DEVICE_INFO_FIELD_DESC = new TField("device_info", (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            DEVICE_INFO(1, "device_info");

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
                return DEVICE_INFO;
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
        public static class get_latest_notify_v2_argsStandardScheme extends StandardScheme<get_latest_notify_v2_args> {
            private get_latest_notify_v2_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_latest_notify_v2_args struct) throws TException {
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
                        AdDeviceInfo adDeviceInfo = new AdDeviceInfo();
                        struct.device_info = adDeviceInfo;
                        adDeviceInfo.read(iprot);
                        struct.setDevice_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_latest_notify_v2_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_latest_notify_v2_args.STRUCT_DESC);
                if (struct.device_info != null) {
                    oprot.writeFieldBegin(get_latest_notify_v2_args.DEVICE_INFO_FIELD_DESC);
                    struct.device_info.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_notify_v2_argsStandardSchemeFactory implements SchemeFactory {
            private get_latest_notify_v2_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_latest_notify_v2_argsStandardScheme getScheme() {
                return new get_latest_notify_v2_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_notify_v2_argsTupleScheme extends TupleScheme<get_latest_notify_v2_args> {
            private get_latest_notify_v2_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_latest_notify_v2_args struct) throws TException {
                AdDeviceInfo adDeviceInfo = new AdDeviceInfo();
                struct.device_info = adDeviceInfo;
                adDeviceInfo.read((TTupleProtocol) prot);
                struct.setDevice_infoIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_latest_notify_v2_args struct) throws TException {
                struct.device_info.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_notify_v2_argsTupleSchemeFactory implements SchemeFactory {
            private get_latest_notify_v2_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_latest_notify_v2_argsTupleScheme getScheme() {
                return new get_latest_notify_v2_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_latest_notify_v2_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_latest_notify_v2_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.DEVICE_INFO, (_Fields) new FieldMetaData("device_info", (byte) 1, new StructMetaData((byte) 12, AdDeviceInfo.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_latest_notify_v2_args.class, unmodifiableMap);
        }

        public get_latest_notify_v2_args() {
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
            this.device_info = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_latest_notify_v2_args)) {
                return equals((get_latest_notify_v2_args) that);
            }
            return false;
        }

        public AdDeviceInfo getDevice_info() {
            return this.device_info;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetDevice_info() {
            return this.device_info != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_latest_notify_v2_args setDevice_info(AdDeviceInfo device_info) {
            this.device_info = device_info;
            return this;
        }

        public void setDevice_infoIsSet(boolean value) {
            if (value) {
                return;
            }
            this.device_info = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_latest_notify_v2_args(");
            sb2.append("device_info:");
            AdDeviceInfo adDeviceInfo = this.device_info;
            if (adDeviceInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(adDeviceInfo);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetDevice_info() {
            this.device_info = null;
        }

        public void validate() throws TException {
            AdDeviceInfo adDeviceInfo = this.device_info;
            if (adDeviceInfo != null) {
                if (adDeviceInfo != null) {
                    adDeviceInfo.validate();
                }
            } else {
                throw new TProtocolException("Required field 'device_info' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_latest_notify_v2_args(AdDeviceInfo device_info) {
            this();
            this.device_info = device_info;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_latest_notify_v2_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetDevice_info()).compareTo(Boolean.valueOf(other.isSetDevice_info()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetDevice_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.device_info, (Comparable) other.device_info)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_latest_notify_v2_args, _Fields> deepCopy2() {
            return new get_latest_notify_v2_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_v2_args$_Fields[field.ordinal()] == 1) {
                return getDevice_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_v2_args$_Fields[field.ordinal()] == 1) {
                return isSetDevice_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_v2_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetDevice_info();
            } else {
                setDevice_info((AdDeviceInfo) value);
            }
        }

        public boolean equals(get_latest_notify_v2_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetDevice_info = isSetDevice_info();
            boolean isSetDevice_info2 = that.isSetDevice_info();
            if (isSetDevice_info || isSetDevice_info2) {
                return isSetDevice_info && isSetDevice_info2 && this.device_info.equals(that.device_info);
            }
            return true;
        }

        public get_latest_notify_v2_args(get_latest_notify_v2_args other) {
            if (other.isSetDevice_info()) {
                this.device_info = new AdDeviceInfo(other.device_info);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_latest_notify_v2_result implements TBase<get_latest_notify_v2_result, _Fields>, Serializable, Cloneable, Comparable<get_latest_notify_v2_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public NotifyResult success;
        private static final TStruct STRUCT_DESC = new TStruct("get_latest_notify_v2_result");
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
        public static class get_latest_notify_v2_resultStandardScheme extends StandardScheme<get_latest_notify_v2_result> {
            private get_latest_notify_v2_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_latest_notify_v2_result struct) throws TException {
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
                        NotifyResult notifyResult = new NotifyResult();
                        struct.success = notifyResult;
                        notifyResult.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_latest_notify_v2_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_latest_notify_v2_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_latest_notify_v2_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_latest_notify_v2_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_latest_notify_v2_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_notify_v2_resultStandardSchemeFactory implements SchemeFactory {
            private get_latest_notify_v2_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_latest_notify_v2_resultStandardScheme getScheme() {
                return new get_latest_notify_v2_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_latest_notify_v2_resultTupleScheme extends TupleScheme<get_latest_notify_v2_result> {
            private get_latest_notify_v2_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_latest_notify_v2_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    NotifyResult notifyResult = new NotifyResult();
                    struct.success = notifyResult;
                    notifyResult.read(tTupleProtocol);
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
            public void write(TProtocol prot, get_latest_notify_v2_result struct) throws TException {
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
        public static class get_latest_notify_v2_resultTupleSchemeFactory implements SchemeFactory {
            private get_latest_notify_v2_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_latest_notify_v2_resultTupleScheme getScheme() {
                return new get_latest_notify_v2_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_latest_notify_v2_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_latest_notify_v2_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, NotifyResult.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_latest_notify_v2_result.class, unmodifiableMap);
        }

        public get_latest_notify_v2_result() {
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
            if (that != null && (that instanceof get_latest_notify_v2_result)) {
                return equals((get_latest_notify_v2_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public NotifyResult getSuccess() {
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

        public get_latest_notify_v2_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_latest_notify_v2_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_latest_notify_v2_result setSuccess(NotifyResult success) {
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
            StringBuilder sb2 = new StringBuilder("get_latest_notify_v2_result(");
            sb2.append("success:");
            NotifyResult notifyResult = this.success;
            if (notifyResult == null) {
                sb2.append("null");
            } else {
                sb2.append(notifyResult);
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
            NotifyResult notifyResult = this.success;
            if (notifyResult != null) {
                notifyResult.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_latest_notify_v2_result(NotifyResult success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_latest_notify_v2_result other) {
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
        public TBase<get_latest_notify_v2_result, _Fields> deepCopy2() {
            return new get_latest_notify_v2_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_v2_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_v2_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_latest_notify_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((NotifyResult) value);
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

        public boolean equals(get_latest_notify_v2_result that) {
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

        public get_latest_notify_v2_result(get_latest_notify_v2_result other) {
            if (other.isSetSuccess()) {
                this.success = new NotifyResult(other.success);
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
    public static class get_remind_info_args implements TBase<get_remind_info_args, _Fields>, Serializable, Cloneable, Comparable<get_remind_info_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_remind_info_args");
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
        public static class get_remind_info_argsStandardScheme extends StandardScheme<get_remind_info_args> {
            private get_remind_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_remind_info_args struct) throws TException {
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
            public void write(TProtocol oprot, get_remind_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_remind_info_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_remind_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_remind_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_remind_info_argsStandardScheme getScheme() {
                return new get_remind_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_remind_info_argsTupleScheme extends TupleScheme<get_remind_info_args> {
            private get_remind_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_remind_info_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_remind_info_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_remind_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_remind_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_remind_info_argsTupleScheme getScheme() {
                return new get_remind_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_remind_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_remind_info_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_remind_info_args.class, unmodifiableMap);
        }

        public get_remind_info_args() {
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

        public boolean equals(get_remind_info_args that) {
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
            return "get_remind_info_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_remind_info_args(get_remind_info_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_remind_info_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_remind_info_args, _Fields> deepCopy2() {
            return new get_remind_info_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_remind_info_args)) {
                return equals((get_remind_info_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_info_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_remind_info_result implements TBase<get_remind_info_result, _Fields>, Serializable, Cloneable, Comparable<get_remind_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public UserRemindInfo success;
        private static final TStruct STRUCT_DESC = new TStruct("get_remind_info_result");
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
        public static class get_remind_info_resultStandardScheme extends StandardScheme<get_remind_info_result> {
            private get_remind_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_remind_info_result struct) throws TException {
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
                        UserRemindInfo userRemindInfo = new UserRemindInfo();
                        struct.success = userRemindInfo;
                        userRemindInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_remind_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_remind_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_remind_info_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_remind_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_remind_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_remind_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_remind_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_remind_info_resultStandardScheme getScheme() {
                return new get_remind_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_remind_info_resultTupleScheme extends TupleScheme<get_remind_info_result> {
            private get_remind_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_remind_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    UserRemindInfo userRemindInfo = new UserRemindInfo();
                    struct.success = userRemindInfo;
                    userRemindInfo.read(tTupleProtocol);
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
            public void write(TProtocol prot, get_remind_info_result struct) throws TException {
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
        public static class get_remind_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_remind_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_remind_info_resultTupleScheme getScheme() {
                return new get_remind_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_remind_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_remind_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, UserRemindInfo.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_remind_info_result.class, unmodifiableMap);
        }

        public get_remind_info_result() {
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
            if (that != null && (that instanceof get_remind_info_result)) {
                return equals((get_remind_info_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public UserRemindInfo getSuccess() {
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

        public get_remind_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_remind_info_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_remind_info_result setSuccess(UserRemindInfo success) {
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
            StringBuilder sb2 = new StringBuilder("get_remind_info_result(");
            sb2.append("success:");
            UserRemindInfo userRemindInfo = this.success;
            if (userRemindInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(userRemindInfo);
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
            UserRemindInfo userRemindInfo = this.success;
            if (userRemindInfo != null) {
                userRemindInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_remind_info_result(UserRemindInfo success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_remind_info_result other) {
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
        public TBase<get_remind_info_result, _Fields> deepCopy2() {
            return new get_remind_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((UserRemindInfo) value);
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

        public boolean equals(get_remind_info_result that) {
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

        public get_remind_info_result(get_remind_info_result other) {
            if (other.isSetSuccess()) {
                this.success = new UserRemindInfo(other.success);
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
    public static class get_remind_msgs_args implements TBase<get_remind_msgs_args, _Fields>, Serializable, Cloneable, Comparable<get_remind_msgs_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_remind_msgs_args");
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
        public static class get_remind_msgs_argsStandardScheme extends StandardScheme<get_remind_msgs_args> {
            private get_remind_msgs_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_remind_msgs_args struct) throws TException {
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
            public void write(TProtocol oprot, get_remind_msgs_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_remind_msgs_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_remind_msgs_argsStandardSchemeFactory implements SchemeFactory {
            private get_remind_msgs_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_remind_msgs_argsStandardScheme getScheme() {
                return new get_remind_msgs_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_remind_msgs_argsTupleScheme extends TupleScheme<get_remind_msgs_args> {
            private get_remind_msgs_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_remind_msgs_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_remind_msgs_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_remind_msgs_argsTupleSchemeFactory implements SchemeFactory {
            private get_remind_msgs_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_remind_msgs_argsTupleScheme getScheme() {
                return new get_remind_msgs_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_remind_msgs_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_remind_msgs_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_remind_msgs_args.class, unmodifiableMap);
        }

        public get_remind_msgs_args() {
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

        public boolean equals(get_remind_msgs_args that) {
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
            return "get_remind_msgs_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_remind_msgs_args(get_remind_msgs_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_remind_msgs_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_remind_msgs_args, _Fields> deepCopy2() {
            return new get_remind_msgs_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_remind_msgs_args)) {
                return equals((get_remind_msgs_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_msgs_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_msgs_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_msgs_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_remind_msgs_result implements TBase<get_remind_msgs_result, _Fields>, Serializable, Cloneable, Comparable<get_remind_msgs_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<UserRemindMsg> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_remind_msgs_result");
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
        public static class get_remind_msgs_resultStandardScheme extends StandardScheme<get_remind_msgs_result> {
            private get_remind_msgs_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_remind_msgs_result struct) throws TException {
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
                            UserRemindMsg userRemindMsg = new UserRemindMsg();
                            userRemindMsg.read(iprot);
                            struct.success.add(userRemindMsg);
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
            public void write(TProtocol oprot, get_remind_msgs_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_remind_msgs_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_remind_msgs_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<UserRemindMsg> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_remind_msgs_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_remind_msgs_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_remind_msgs_resultStandardSchemeFactory implements SchemeFactory {
            private get_remind_msgs_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_remind_msgs_resultStandardScheme getScheme() {
                return new get_remind_msgs_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_remind_msgs_resultTupleScheme extends TupleScheme<get_remind_msgs_result> {
            private get_remind_msgs_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_remind_msgs_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        UserRemindMsg userRemindMsg = new UserRemindMsg();
                        userRemindMsg.read(tTupleProtocol);
                        struct.success.add(userRemindMsg);
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
            public void write(TProtocol prot, get_remind_msgs_result struct) throws TException {
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
                    Iterator<UserRemindMsg> it = struct.success.iterator();
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
        public static class get_remind_msgs_resultTupleSchemeFactory implements SchemeFactory {
            private get_remind_msgs_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_remind_msgs_resultTupleScheme getScheme() {
                return new get_remind_msgs_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_remind_msgs_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_remind_msgs_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserRemindMsg.class))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_remind_msgs_result.class, unmodifiableMap);
        }

        public get_remind_msgs_result() {
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

        public void addToSuccess(UserRemindMsg elem) {
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
            if (that != null && (that instanceof get_remind_msgs_result)) {
                return equals((get_remind_msgs_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public List<UserRemindMsg> getSuccess() {
            return this.success;
        }

        public Iterator<UserRemindMsg> getSuccessIterator() {
            List<UserRemindMsg> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<UserRemindMsg> list = this.success;
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

        public get_remind_msgs_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_remind_msgs_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_remind_msgs_result setSuccess(List<UserRemindMsg> success) {
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
            StringBuilder sb2 = new StringBuilder("get_remind_msgs_result(");
            sb2.append("success:");
            List<UserRemindMsg> list = this.success;
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

        public get_remind_msgs_result(List<UserRemindMsg> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_remind_msgs_result other) {
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
        public TBase<get_remind_msgs_result, _Fields> deepCopy2() {
            return new get_remind_msgs_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_msgs_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_msgs_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$get_remind_msgs_result$_Fields[field.ordinal()];
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

        public boolean equals(get_remind_msgs_result that) {
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

        public get_remind_msgs_result(get_remind_msgs_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<UserRemindMsg> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new UserRemindMsg(it.next()));
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
    public static class push_confirm_args implements TBase<push_confirm_args, _Fields>, Serializable, Cloneable, Comparable<push_confirm_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public PushConfirmParams params;
        private static final TStruct STRUCT_DESC = new TStruct("push_confirm_args");
        private static final TField PARAMS_FIELD_DESC = new TField("params", (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            PARAMS(1, "params");

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
                return PARAMS;
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
        public static class push_confirm_argsStandardScheme extends StandardScheme<push_confirm_args> {
            private push_confirm_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, push_confirm_args struct) throws TException {
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
                        PushConfirmParams pushConfirmParams = new PushConfirmParams();
                        struct.params = pushConfirmParams;
                        pushConfirmParams.read(iprot);
                        struct.setParamsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, push_confirm_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(push_confirm_args.STRUCT_DESC);
                if (struct.params != null) {
                    oprot.writeFieldBegin(push_confirm_args.PARAMS_FIELD_DESC);
                    struct.params.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class push_confirm_argsStandardSchemeFactory implements SchemeFactory {
            private push_confirm_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public push_confirm_argsStandardScheme getScheme() {
                return new push_confirm_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class push_confirm_argsTupleScheme extends TupleScheme<push_confirm_args> {
            private push_confirm_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, push_confirm_args struct) throws TException {
                PushConfirmParams pushConfirmParams = new PushConfirmParams();
                struct.params = pushConfirmParams;
                pushConfirmParams.read((TTupleProtocol) prot);
                struct.setParamsIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, push_confirm_args struct) throws TException {
                struct.params.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class push_confirm_argsTupleSchemeFactory implements SchemeFactory {
            private push_confirm_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public push_confirm_argsTupleScheme getScheme() {
                return new push_confirm_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new push_confirm_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new push_confirm_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.PARAMS, (_Fields) new FieldMetaData("params", (byte) 1, new StructMetaData((byte) 12, PushConfirmParams.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(push_confirm_args.class, unmodifiableMap);
        }

        public push_confirm_args() {
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
            this.params = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof push_confirm_args)) {
                return equals((push_confirm_args) that);
            }
            return false;
        }

        public PushConfirmParams getParams() {
            return this.params;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetParams() {
            return this.params != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public push_confirm_args setParams(PushConfirmParams params) {
            this.params = params;
            return this;
        }

        public void setParamsIsSet(boolean value) {
            if (value) {
                return;
            }
            this.params = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("push_confirm_args(");
            sb2.append("params:");
            PushConfirmParams pushConfirmParams = this.params;
            if (pushConfirmParams == null) {
                sb2.append("null");
            } else {
                sb2.append(pushConfirmParams);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetParams() {
            this.params = null;
        }

        public void validate() throws TException {
            PushConfirmParams pushConfirmParams = this.params;
            if (pushConfirmParams != null) {
                if (pushConfirmParams != null) {
                    pushConfirmParams.validate();
                }
            } else {
                throw new TProtocolException("Required field 'params' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public push_confirm_args(PushConfirmParams params) {
            this();
            this.params = params;
        }

        @Override // java.lang.Comparable
        public int compareTo(push_confirm_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetParams()).compareTo(Boolean.valueOf(other.isSetParams()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetParams() || (compareTo = TBaseHelper.compareTo((Comparable) this.params, (Comparable) other.params)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<push_confirm_args, _Fields> deepCopy2() {
            return new push_confirm_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$push_confirm_args$_Fields[field.ordinal()] == 1) {
                return getParams();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$push_confirm_args$_Fields[field.ordinal()] == 1) {
                return isSetParams();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$push_confirm_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetParams();
            } else {
                setParams((PushConfirmParams) value);
            }
        }

        public boolean equals(push_confirm_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetParams = isSetParams();
            boolean isSetParams2 = that.isSetParams();
            if (isSetParams || isSetParams2) {
                return isSetParams && isSetParams2 && this.params.equals(that.params);
            }
            return true;
        }

        public push_confirm_args(push_confirm_args other) {
            if (other.isSetParams()) {
                this.params = new PushConfirmParams(other.params);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class push_confirm_result implements TBase<push_confirm_result, _Fields>, Serializable, Cloneable, Comparable<push_confirm_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        private static final TStruct STRUCT_DESC = new TStruct("push_confirm_result");
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
        public static class push_confirm_resultStandardScheme extends StandardScheme<push_confirm_result> {
            private push_confirm_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, push_confirm_result struct) throws TException {
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
            public void write(TProtocol oprot, push_confirm_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(push_confirm_result.STRUCT_DESC);
                if (struct.boom != null) {
                    oprot.writeFieldBegin(push_confirm_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(push_confirm_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class push_confirm_resultStandardSchemeFactory implements SchemeFactory {
            private push_confirm_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public push_confirm_resultStandardScheme getScheme() {
                return new push_confirm_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class push_confirm_resultTupleScheme extends TupleScheme<push_confirm_result> {
            private push_confirm_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, push_confirm_result struct) throws TException {
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
            public void write(TProtocol prot, push_confirm_result struct) throws TException {
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
        public static class push_confirm_resultTupleSchemeFactory implements SchemeFactory {
            private push_confirm_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public push_confirm_resultTupleScheme getScheme() {
                return new push_confirm_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new push_confirm_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new push_confirm_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(push_confirm_result.class, unmodifiableMap);
        }

        public push_confirm_result() {
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
            if (that != null && (that instanceof push_confirm_result)) {
                return equals((push_confirm_result) that);
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

        public push_confirm_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public push_confirm_result setBoom(SystemException boom) {
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
            StringBuilder sb2 = new StringBuilder("push_confirm_result(");
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

        public push_confirm_result(SystemException boom, LogicException bomb) {
            this();
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(push_confirm_result other) {
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
        public TBase<push_confirm_result, _Fields> deepCopy2() {
            return new push_confirm_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$push_confirm_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$push_confirm_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$push_confirm_result$_Fields[field.ordinal()];
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

        public boolean equals(push_confirm_result that) {
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

        public push_confirm_result(push_confirm_result other) {
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
    public static class set_remind_info_args implements TBase<set_remind_info_args, _Fields>, Serializable, Cloneable, Comparable<set_remind_info_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public UserRemindInfo remind;
        private static final TStruct STRUCT_DESC = new TStruct("set_remind_info_args");
        private static final TField REMIND_FIELD_DESC = new TField("remind", (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            REMIND(1, "remind");

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
                return REMIND;
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
        public static class set_remind_info_argsStandardScheme extends StandardScheme<set_remind_info_args> {
            private set_remind_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, set_remind_info_args struct) throws TException {
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
                        UserRemindInfo userRemindInfo = new UserRemindInfo();
                        struct.remind = userRemindInfo;
                        userRemindInfo.read(iprot);
                        struct.setRemindIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, set_remind_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(set_remind_info_args.STRUCT_DESC);
                if (struct.remind != null) {
                    oprot.writeFieldBegin(set_remind_info_args.REMIND_FIELD_DESC);
                    struct.remind.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class set_remind_info_argsStandardSchemeFactory implements SchemeFactory {
            private set_remind_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public set_remind_info_argsStandardScheme getScheme() {
                return new set_remind_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class set_remind_info_argsTupleScheme extends TupleScheme<set_remind_info_args> {
            private set_remind_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, set_remind_info_args struct) throws TException {
                UserRemindInfo userRemindInfo = new UserRemindInfo();
                struct.remind = userRemindInfo;
                userRemindInfo.read((TTupleProtocol) prot);
                struct.setRemindIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, set_remind_info_args struct) throws TException {
                struct.remind.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class set_remind_info_argsTupleSchemeFactory implements SchemeFactory {
            private set_remind_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public set_remind_info_argsTupleScheme getScheme() {
                return new set_remind_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new set_remind_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new set_remind_info_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.REMIND, (_Fields) new FieldMetaData("remind", (byte) 1, new StructMetaData((byte) 12, UserRemindInfo.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(set_remind_info_args.class, unmodifiableMap);
        }

        public set_remind_info_args() {
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
            this.remind = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof set_remind_info_args)) {
                return equals((set_remind_info_args) that);
            }
            return false;
        }

        public UserRemindInfo getRemind() {
            return this.remind;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetRemind() {
            return this.remind != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public set_remind_info_args setRemind(UserRemindInfo remind) {
            this.remind = remind;
            return this;
        }

        public void setRemindIsSet(boolean value) {
            if (value) {
                return;
            }
            this.remind = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("set_remind_info_args(");
            sb2.append("remind:");
            UserRemindInfo userRemindInfo = this.remind;
            if (userRemindInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(userRemindInfo);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetRemind() {
            this.remind = null;
        }

        public void validate() throws TException {
            UserRemindInfo userRemindInfo = this.remind;
            if (userRemindInfo != null) {
                if (userRemindInfo != null) {
                    userRemindInfo.validate();
                }
            } else {
                throw new TProtocolException("Required field 'remind' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public set_remind_info_args(UserRemindInfo remind) {
            this();
            this.remind = remind;
        }

        @Override // java.lang.Comparable
        public int compareTo(set_remind_info_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetRemind()).compareTo(Boolean.valueOf(other.isSetRemind()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetRemind() || (compareTo = TBaseHelper.compareTo((Comparable) this.remind, (Comparable) other.remind)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<set_remind_info_args, _Fields> deepCopy2() {
            return new set_remind_info_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$set_remind_info_args$_Fields[field.ordinal()] == 1) {
                return getRemind();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$set_remind_info_args$_Fields[field.ordinal()] == 1) {
                return isSetRemind();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$set_remind_info_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetRemind();
            } else {
                setRemind((UserRemindInfo) value);
            }
        }

        public boolean equals(set_remind_info_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetRemind = isSetRemind();
            boolean isSetRemind2 = that.isSetRemind();
            if (isSetRemind || isSetRemind2) {
                return isSetRemind && isSetRemind2 && this.remind.equals(that.remind);
            }
            return true;
        }

        public set_remind_info_args(set_remind_info_args other) {
            if (other.isSetRemind()) {
                this.remind = new UserRemindInfo(other.remind);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class set_remind_info_result implements TBase<set_remind_info_result, _Fields>, Serializable, Cloneable, Comparable<set_remind_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        private static final TStruct STRUCT_DESC = new TStruct("set_remind_info_result");
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
        public static class set_remind_info_resultStandardScheme extends StandardScheme<set_remind_info_result> {
            private set_remind_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, set_remind_info_result struct) throws TException {
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
            public void write(TProtocol oprot, set_remind_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(set_remind_info_result.STRUCT_DESC);
                if (struct.boom != null) {
                    oprot.writeFieldBegin(set_remind_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(set_remind_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class set_remind_info_resultStandardSchemeFactory implements SchemeFactory {
            private set_remind_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public set_remind_info_resultStandardScheme getScheme() {
                return new set_remind_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class set_remind_info_resultTupleScheme extends TupleScheme<set_remind_info_result> {
            private set_remind_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, set_remind_info_result struct) throws TException {
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
            public void write(TProtocol prot, set_remind_info_result struct) throws TException {
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
        public static class set_remind_info_resultTupleSchemeFactory implements SchemeFactory {
            private set_remind_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public set_remind_info_resultTupleScheme getScheme() {
                return new set_remind_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new set_remind_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new set_remind_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(set_remind_info_result.class, unmodifiableMap);
        }

        public set_remind_info_result() {
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
            if (that != null && (that instanceof set_remind_info_result)) {
                return equals((set_remind_info_result) that);
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

        public set_remind_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public set_remind_info_result setBoom(SystemException boom) {
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
            StringBuilder sb2 = new StringBuilder("set_remind_info_result(");
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

        public set_remind_info_result(SystemException boom, LogicException bomb) {
            this();
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(set_remind_info_result other) {
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
        public TBase<set_remind_info_result, _Fields> deepCopy2() {
            return new set_remind_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$set_remind_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$set_remind_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$NotifyService$set_remind_info_result$_Fields[field.ordinal()];
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

        public boolean equals(set_remind_info_result that) {
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

        public set_remind_info_result(set_remind_info_result other) {
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
