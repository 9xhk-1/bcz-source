package com.baicizhan.online.hero_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class HeroApi {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.hero_api.HeroApi$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$hero_api$HeroApi$first_entry_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$hero_api$HeroApi$first_entry_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$hero_api$HeroApi$ping_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$hero_api$HeroApi$ping_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$hero_api$HeroApi$submit_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$hero_api$HeroApi$submit_result$_Fields;

        static {
            int[] iArr = new int[first_entry_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$hero_api$HeroApi$first_entry_result$_Fields = iArr;
            try {
                iArr[first_entry_result._Fields.E.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $SwitchMap$com$baicizhan$online$hero_api$HeroApi$first_entry_args$_Fields = new int[first_entry_args._Fields.values().length];
            int[] iArr2 = new int[submit_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$hero_api$HeroApi$submit_result$_Fields = iArr2;
            try {
                iArr2[submit_result._Fields.E.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr3 = new int[submit_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$hero_api$HeroApi$submit_args$_Fields = iArr3;
            try {
                iArr3[submit_args._Fields.DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr4 = new int[ping_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$hero_api$HeroApi$ping_result$_Fields = iArr4;
            try {
                iArr4[ping_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$HeroApi$ping_result$_Fields[ping_result._Fields.E.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $SwitchMap$com$baicizhan$online$hero_api$HeroApi$ping_args$_Fields = new int[ping_args._Fields.values().length];
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
        public static class first_entry_call extends TAsyncMethodCall {
            public first_entry_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public void getResult() throws HeroApiException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_first_entry();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("first_entry", (byte) 1, 0));
                new first_entry_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ping_call extends TAsyncMethodCall {
            public ping_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public EchoInfo getResult() throws HeroApiException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_ping();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("ping", (byte) 1, 0));
                new ping_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_call extends TAsyncMethodCall {
            private SubmitInfo data;

            public submit_call(SubmitInfo data, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.data = data;
            }

            public void getResult() throws HeroApiException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_submit();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("submit", (byte) 1, 0));
                submit_args submit_argsVar = new submit_args();
                submit_argsVar.setData(this.data);
                submit_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        public AsyncClient(TProtocolFactory protocolFactory, TAsyncClientManager clientManager, TNonblockingTransport transport) {
            super(protocolFactory, clientManager, transport);
        }

        @Override // com.baicizhan.online.hero_api.HeroApi.AsyncIface
        public void first_entry(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            first_entry_call first_entry_callVar = new first_entry_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = first_entry_callVar;
            this.___manager.call(first_entry_callVar);
        }

        @Override // com.baicizhan.online.hero_api.HeroApi.AsyncIface
        public void ping(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            ping_call ping_callVar = new ping_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = ping_callVar;
            this.___manager.call(ping_callVar);
        }

        @Override // com.baicizhan.online.hero_api.HeroApi.AsyncIface
        public void submit(SubmitInfo data, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            submit_call submit_callVar = new submit_call(data, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = submit_callVar;
            this.___manager.call(submit_callVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AsyncIface {
        void first_entry(AsyncMethodCallback resultHandler) throws TException;

        void ping(AsyncMethodCallback resultHandler) throws TException;

        void submit(SubmitInfo data, AsyncMethodCallback resultHandler) throws TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AsyncProcessor<I extends AsyncIface> extends TBaseAsyncProcessor<I> {
        private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class first_entry<I extends AsyncIface> extends AsyncProcessFunction<I, first_entry_args, Void> {
            public first_entry() {
                super("first_entry");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.hero_api.HeroApi.AsyncProcessor.first_entry.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        first_entry_result first_entry_resultVar;
                        first_entry_result first_entry_resultVar2 = new first_entry_result();
                        if (exc instanceof HeroApiException) {
                            first_entry_resultVar2.f28152e = (HeroApiException) exc;
                            first_entry_resultVar2.setEIsSet(true);
                            b11 = 2;
                            first_entry_resultVar = first_entry_resultVar2;
                        } else {
                            ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                            b11 = 3;
                            first_entry_resultVar = r02;
                        }
                        try {
                            this.sendResponse(fb2, first_entry_resultVar, b11, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new first_entry_result(), (byte) 2, seqid);
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
            public first_entry_args getEmptyArgsInstance() {
                return new first_entry_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, first_entry_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.first_entry(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ping<I extends AsyncIface> extends AsyncProcessFunction<I, ping_args, EchoInfo> {
            public ping() {
                super("ping");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<EchoInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<EchoInfo>() { // from class: com.baicizhan.online.hero_api.HeroApi.AsyncProcessor.ping.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        ping_result ping_resultVar;
                        ping_result ping_resultVar2 = new ping_result();
                        if (exc instanceof HeroApiException) {
                            ping_resultVar2.f28153e = (HeroApiException) exc;
                            ping_resultVar2.setEIsSet(true);
                            b11 = 2;
                            ping_resultVar = ping_resultVar2;
                        } else {
                            ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                            b11 = 3;
                            ping_resultVar = r02;
                        }
                        try {
                            this.sendResponse(fb2, ping_resultVar, b11, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(EchoInfo o11) {
                        ping_result ping_resultVar = new ping_result();
                        ping_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, ping_resultVar, (byte) 2, seqid);
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
            public ping_args getEmptyArgsInstance() {
                return new ping_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, ping_args args, AsyncMethodCallback<EchoInfo> resultHandler) throws TException {
                iface.ping(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit<I extends AsyncIface> extends AsyncProcessFunction<I, submit_args, Void> {
            public submit() {
                super("submit");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.hero_api.HeroApi.AsyncProcessor.submit.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        submit_result submit_resultVar;
                        submit_result submit_resultVar2 = new submit_result();
                        if (exc instanceof HeroApiException) {
                            submit_resultVar2.f28154e = (HeroApiException) exc;
                            submit_resultVar2.setEIsSet(true);
                            b11 = 2;
                            submit_resultVar = submit_resultVar2;
                        } else {
                            ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                            b11 = 3;
                            submit_resultVar = r02;
                        }
                        try {
                            this.sendResponse(fb2, submit_resultVar, b11, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new submit_result(), (byte) 2, seqid);
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
            public submit_args getEmptyArgsInstance() {
                return new submit_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, submit_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.submit(args.data, resultHandler);
            }
        }

        public AsyncProcessor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends AsyncIface> Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> getProcessMap(Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> processMap) {
            processMap.put("ping", new ping());
            processMap.put("submit", new submit());
            processMap.put("first_entry", new first_entry());
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

        @Override // com.baicizhan.online.hero_api.HeroApi.Iface
        public void first_entry() throws HeroApiException, TException {
            send_first_entry();
            recv_first_entry();
        }

        @Override // com.baicizhan.online.hero_api.HeroApi.Iface
        public EchoInfo ping() throws HeroApiException, TException {
            send_ping();
            return recv_ping();
        }

        public void recv_first_entry() throws HeroApiException, TException {
            first_entry_result first_entry_resultVar = new first_entry_result();
            receiveBase(first_entry_resultVar, "first_entry");
            HeroApiException heroApiException = first_entry_resultVar.f28152e;
            if (heroApiException != null) {
                throw heroApiException;
            }
        }

        public EchoInfo recv_ping() throws HeroApiException, TException {
            ping_result ping_resultVar = new ping_result();
            receiveBase(ping_resultVar, "ping");
            if (ping_resultVar.isSetSuccess()) {
                return ping_resultVar.success;
            }
            HeroApiException heroApiException = ping_resultVar.f28153e;
            if (heroApiException != null) {
                throw heroApiException;
            }
            throw new TApplicationException(5, "ping failed: unknown result");
        }

        public void recv_submit() throws HeroApiException, TException {
            submit_result submit_resultVar = new submit_result();
            receiveBase(submit_resultVar, "submit");
            HeroApiException heroApiException = submit_resultVar.f28154e;
            if (heroApiException != null) {
                throw heroApiException;
            }
        }

        public void send_first_entry() throws TException {
            sendBase("first_entry", new first_entry_args());
        }

        public void send_ping() throws TException {
            sendBase("ping", new ping_args());
        }

        public void send_submit(SubmitInfo data) throws TException {
            submit_args submit_argsVar = new submit_args();
            submit_argsVar.setData(data);
            sendBase("submit", submit_argsVar);
        }

        @Override // com.baicizhan.online.hero_api.HeroApi.Iface
        public void submit(SubmitInfo data) throws HeroApiException, TException {
            send_submit(data);
            recv_submit();
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
        void first_entry() throws HeroApiException, TException;

        EchoInfo ping() throws HeroApiException, TException;

        void submit(SubmitInfo data) throws HeroApiException, TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Processor<I extends Iface> extends TBaseProcessor<I> implements TProcessor {
        private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class first_entry<I extends Iface> extends ProcessFunction<I, first_entry_args> {
            public first_entry() {
                super("first_entry");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public first_entry_args getEmptyArgsInstance() {
                return new first_entry_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public first_entry_result getResult(I iface, first_entry_args args) throws TException {
                first_entry_result first_entry_resultVar = new first_entry_result();
                try {
                    iface.first_entry();
                    return first_entry_resultVar;
                } catch (HeroApiException e11) {
                    first_entry_resultVar.f28152e = e11;
                    return first_entry_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ping<I extends Iface> extends ProcessFunction<I, ping_args> {
            public ping() {
                super("ping");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public ping_args getEmptyArgsInstance() {
                return new ping_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public ping_result getResult(I iface, ping_args args) throws TException {
                ping_result ping_resultVar = new ping_result();
                try {
                    ping_resultVar.success = iface.ping();
                    return ping_resultVar;
                } catch (HeroApiException e11) {
                    ping_resultVar.f28153e = e11;
                    return ping_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit<I extends Iface> extends ProcessFunction<I, submit_args> {
            public submit() {
                super("submit");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public submit_args getEmptyArgsInstance() {
                return new submit_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public submit_result getResult(I iface, submit_args args) throws TException {
                submit_result submit_resultVar = new submit_result();
                try {
                    iface.submit(args.data);
                    return submit_resultVar;
                } catch (HeroApiException e11) {
                    submit_resultVar.f28154e = e11;
                    return submit_resultVar;
                }
            }
        }

        public Processor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends Iface> Map<String, ProcessFunction<I, ? extends TBase>> getProcessMap(Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            processMap.put("ping", new ping());
            processMap.put("submit", new submit());
            processMap.put("first_entry", new first_entry());
            return processMap;
        }

        public Processor(I iface, Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            super(iface, getProcessMap(processMap));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class first_entry_args implements TBase<first_entry_args, _Fields>, Serializable, Cloneable, Comparable<first_entry_args> {
        private static final TStruct STRUCT_DESC = new TStruct("first_entry_args");
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
        public static class first_entry_argsStandardScheme extends StandardScheme<first_entry_args> {
            private first_entry_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, first_entry_args struct) throws TException {
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
            public void write(TProtocol oprot, first_entry_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(first_entry_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class first_entry_argsStandardSchemeFactory implements SchemeFactory {
            private first_entry_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public first_entry_argsStandardScheme getScheme() {
                return new first_entry_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class first_entry_argsTupleScheme extends TupleScheme<first_entry_args> {
            private first_entry_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, first_entry_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, first_entry_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class first_entry_argsTupleSchemeFactory implements SchemeFactory {
            private first_entry_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public first_entry_argsTupleScheme getScheme() {
                return new first_entry_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new first_entry_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new first_entry_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(first_entry_args.class, unmodifiableMap);
        }

        public first_entry_args() {
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

        public boolean equals(first_entry_args that) {
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
            return "first_entry_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public first_entry_args(first_entry_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(first_entry_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<first_entry_args, _Fields> deepCopy2() {
            return new first_entry_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof first_entry_args)) {
                return equals((first_entry_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$first_entry_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$first_entry_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$first_entry_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class first_entry_result implements TBase<first_entry_result, _Fields>, Serializable, Cloneable, Comparable<first_entry_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* renamed from: e, reason: collision with root package name */
        public HeroApiException f28152e;
        private static final TStruct STRUCT_DESC = new TStruct("first_entry_result");
        private static final TField E_FIELD_DESC = new TField("e", (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            E(1, "e");

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
                return E;
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
        public static class first_entry_resultStandardScheme extends StandardScheme<first_entry_result> {
            private first_entry_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, first_entry_result struct) throws TException {
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
                        HeroApiException heroApiException = new HeroApiException();
                        struct.f28152e = heroApiException;
                        heroApiException.read(iprot);
                        struct.setEIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, first_entry_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(first_entry_result.STRUCT_DESC);
                if (struct.f28152e != null) {
                    oprot.writeFieldBegin(first_entry_result.E_FIELD_DESC);
                    struct.f28152e.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class first_entry_resultStandardSchemeFactory implements SchemeFactory {
            private first_entry_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public first_entry_resultStandardScheme getScheme() {
                return new first_entry_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class first_entry_resultTupleScheme extends TupleScheme<first_entry_result> {
            private first_entry_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, first_entry_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                if (tTupleProtocol.readBitSet(1).get(0)) {
                    HeroApiException heroApiException = new HeroApiException();
                    struct.f28152e = heroApiException;
                    heroApiException.read(tTupleProtocol);
                    struct.setEIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, first_entry_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetE()) {
                    bitSet.set(0);
                }
                tTupleProtocol.writeBitSet(bitSet, 1);
                if (struct.isSetE()) {
                    struct.f28152e.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class first_entry_resultTupleSchemeFactory implements SchemeFactory {
            private first_entry_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public first_entry_resultTupleScheme getScheme() {
                return new first_entry_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new first_entry_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new first_entry_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.E, (_Fields) new FieldMetaData("e", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(first_entry_result.class, unmodifiableMap);
        }

        public first_entry_result() {
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
            this.f28152e = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof first_entry_result)) {
                return equals((first_entry_result) that);
            }
            return false;
        }

        public HeroApiException getE() {
            return this.f28152e;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetE() {
            return this.f28152e != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public first_entry_result setE(HeroApiException e11) {
            this.f28152e = e11;
            return this;
        }

        public void setEIsSet(boolean value) {
            if (value) {
                return;
            }
            this.f28152e = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("first_entry_result(");
            sb2.append("e:");
            HeroApiException heroApiException = this.f28152e;
            if (heroApiException == null) {
                sb2.append("null");
            } else {
                sb2.append(heroApiException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetE() {
            this.f28152e = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public first_entry_result(HeroApiException e11) {
            this();
            this.f28152e = e11;
        }

        @Override // java.lang.Comparable
        public int compareTo(first_entry_result other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetE()).compareTo(Boolean.valueOf(other.isSetE()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetE() || (compareTo = TBaseHelper.compareTo((Comparable) this.f28152e, (Comparable) other.f28152e)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<first_entry_result, _Fields> deepCopy2() {
            return new first_entry_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$first_entry_result$_Fields[field.ordinal()] == 1) {
                return getE();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$first_entry_result$_Fields[field.ordinal()] == 1) {
                return isSetE();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$first_entry_result$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetE();
            } else {
                setE((HeroApiException) value);
            }
        }

        public boolean equals(first_entry_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetE = isSetE();
            boolean isSetE2 = that.isSetE();
            if (isSetE || isSetE2) {
                return isSetE && isSetE2 && this.f28152e.equals(that.f28152e);
            }
            return true;
        }

        public first_entry_result(first_entry_result other) {
            if (other.isSetE()) {
                this.f28152e = new HeroApiException(other.f28152e);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ping_args implements TBase<ping_args, _Fields>, Serializable, Cloneable, Comparable<ping_args> {
        private static final TStruct STRUCT_DESC = new TStruct("ping_args");
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
        public static class ping_argsStandardScheme extends StandardScheme<ping_args> {
            private ping_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, ping_args struct) throws TException {
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
            public void write(TProtocol oprot, ping_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(ping_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ping_argsStandardSchemeFactory implements SchemeFactory {
            private ping_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public ping_argsStandardScheme getScheme() {
                return new ping_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ping_argsTupleScheme extends TupleScheme<ping_args> {
            private ping_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, ping_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, ping_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ping_argsTupleSchemeFactory implements SchemeFactory {
            private ping_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public ping_argsTupleScheme getScheme() {
                return new ping_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new ping_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new ping_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(ping_args.class, unmodifiableMap);
        }

        public ping_args() {
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

        public boolean equals(ping_args that) {
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
            return "ping_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public ping_args(ping_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(ping_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<ping_args, _Fields> deepCopy2() {
            return new ping_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof ping_args)) {
                return equals((ping_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$ping_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$ping_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$ping_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ping_result implements TBase<ping_result, _Fields>, Serializable, Cloneable, Comparable<ping_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* renamed from: e, reason: collision with root package name */
        public HeroApiException f28153e;
        public EchoInfo success;
        private static final TStruct STRUCT_DESC = new TStruct("ping_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField E_FIELD_DESC = new TField("e", (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            E(1, "e");

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
                return E;
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
        public static class ping_resultStandardScheme extends StandardScheme<ping_result> {
            private ping_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, ping_result struct) throws TException {
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
                            HeroApiException heroApiException = new HeroApiException();
                            struct.f28153e = heroApiException;
                            heroApiException.read(iprot);
                            struct.setEIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        EchoInfo echoInfo = new EchoInfo();
                        struct.success = echoInfo;
                        echoInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, ping_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(ping_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(ping_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.f28153e != null) {
                    oprot.writeFieldBegin(ping_result.E_FIELD_DESC);
                    struct.f28153e.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ping_resultStandardSchemeFactory implements SchemeFactory {
            private ping_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public ping_resultStandardScheme getScheme() {
                return new ping_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ping_resultTupleScheme extends TupleScheme<ping_result> {
            private ping_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, ping_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(2);
                if (readBitSet.get(0)) {
                    EchoInfo echoInfo = new EchoInfo();
                    struct.success = echoInfo;
                    echoInfo.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    HeroApiException heroApiException = new HeroApiException();
                    struct.f28153e = heroApiException;
                    heroApiException.read(tTupleProtocol);
                    struct.setEIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, ping_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetE()) {
                    bitSet.set(1);
                }
                tTupleProtocol.writeBitSet(bitSet, 2);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetE()) {
                    struct.f28153e.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ping_resultTupleSchemeFactory implements SchemeFactory {
            private ping_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public ping_resultTupleScheme getScheme() {
                return new ping_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new ping_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new ping_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, EchoInfo.class)));
            enumMap.put((EnumMap) _Fields.E, (_Fields) new FieldMetaData("e", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(ping_result.class, unmodifiableMap);
        }

        public ping_result() {
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
            this.f28153e = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof ping_result)) {
                return equals((ping_result) that);
            }
            return false;
        }

        public HeroApiException getE() {
            return this.f28153e;
        }

        public EchoInfo getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetE() {
            return this.f28153e != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public ping_result setE(HeroApiException e11) {
            this.f28153e = e11;
            return this;
        }

        public void setEIsSet(boolean value) {
            if (value) {
                return;
            }
            this.f28153e = null;
        }

        public ping_result setSuccess(EchoInfo success) {
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
            StringBuilder sb2 = new StringBuilder("ping_result(");
            sb2.append("success:");
            EchoInfo echoInfo = this.success;
            if (echoInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(echoInfo);
            }
            sb2.append(j2.O);
            sb2.append("e:");
            HeroApiException heroApiException = this.f28153e;
            if (heroApiException == null) {
                sb2.append("null");
            } else {
                sb2.append(heroApiException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetE() {
            this.f28153e = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            EchoInfo echoInfo = this.success;
            if (echoInfo != null) {
                echoInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public ping_result(EchoInfo success, HeroApiException e11) {
            this();
            this.success = success;
            this.f28153e = e11;
        }

        @Override // java.lang.Comparable
        public int compareTo(ping_result other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetSuccess() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetE()).compareTo(Boolean.valueOf(other.isSetE()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetE() || (compareTo = TBaseHelper.compareTo((Comparable) this.f28153e, (Comparable) other.f28153e)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<ping_result, _Fields> deepCopy2() {
            return new ping_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$ping_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getE();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$ping_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetE();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$ping_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((EchoInfo) value);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetE();
            } else {
                setE((HeroApiException) value);
            }
        }

        public boolean equals(ping_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetE = isSetE();
            boolean isSetE2 = that.isSetE();
            if (isSetE || isSetE2) {
                return isSetE && isSetE2 && this.f28153e.equals(that.f28153e);
            }
            return true;
        }

        public ping_result(ping_result other) {
            if (other.isSetSuccess()) {
                this.success = new EchoInfo(other.success);
            }
            if (other.isSetE()) {
                this.f28153e = new HeroApiException(other.f28153e);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class submit_args implements TBase<submit_args, _Fields>, Serializable, Cloneable, Comparable<submit_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public SubmitInfo data;
        private static final TStruct STRUCT_DESC = new TStruct("submit_args");
        private static final TField DATA_FIELD_DESC = new TField("data", (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            DATA(1, "data");

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
                return DATA;
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
        public static class submit_argsStandardScheme extends StandardScheme<submit_args> {
            private submit_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, submit_args struct) throws TException {
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
                        SubmitInfo submitInfo = new SubmitInfo();
                        struct.data = submitInfo;
                        submitInfo.read(iprot);
                        struct.setDataIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, submit_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(submit_args.STRUCT_DESC);
                if (struct.data != null) {
                    oprot.writeFieldBegin(submit_args.DATA_FIELD_DESC);
                    struct.data.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_argsStandardSchemeFactory implements SchemeFactory {
            private submit_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_argsStandardScheme getScheme() {
                return new submit_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_argsTupleScheme extends TupleScheme<submit_args> {
            private submit_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, submit_args struct) throws TException {
                SubmitInfo submitInfo = new SubmitInfo();
                struct.data = submitInfo;
                submitInfo.read((TTupleProtocol) prot);
                struct.setDataIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, submit_args struct) throws TException {
                struct.data.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_argsTupleSchemeFactory implements SchemeFactory {
            private submit_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_argsTupleScheme getScheme() {
                return new submit_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new submit_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new submit_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.DATA, (_Fields) new FieldMetaData("data", (byte) 1, new StructMetaData((byte) 12, SubmitInfo.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(submit_args.class, unmodifiableMap);
        }

        public submit_args() {
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
            this.data = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof submit_args)) {
                return equals((submit_args) that);
            }
            return false;
        }

        public SubmitInfo getData() {
            return this.data;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetData() {
            return this.data != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public submit_args setData(SubmitInfo data) {
            this.data = data;
            return this;
        }

        public void setDataIsSet(boolean value) {
            if (value) {
                return;
            }
            this.data = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("submit_args(");
            sb2.append("data:");
            SubmitInfo submitInfo = this.data;
            if (submitInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(submitInfo);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetData() {
            this.data = null;
        }

        public void validate() throws TException {
            SubmitInfo submitInfo = this.data;
            if (submitInfo != null) {
                if (submitInfo != null) {
                    submitInfo.validate();
                }
            } else {
                throw new TProtocolException("Required field 'data' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public submit_args(SubmitInfo data) {
            this();
            this.data = data;
        }

        @Override // java.lang.Comparable
        public int compareTo(submit_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetData()).compareTo(Boolean.valueOf(other.isSetData()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetData() || (compareTo = TBaseHelper.compareTo((Comparable) this.data, (Comparable) other.data)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<submit_args, _Fields> deepCopy2() {
            return new submit_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$submit_args$_Fields[field.ordinal()] == 1) {
                return getData();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$submit_args$_Fields[field.ordinal()] == 1) {
                return isSetData();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$submit_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetData();
            } else {
                setData((SubmitInfo) value);
            }
        }

        public boolean equals(submit_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetData = isSetData();
            boolean isSetData2 = that.isSetData();
            if (isSetData || isSetData2) {
                return isSetData && isSetData2 && this.data.equals(that.data);
            }
            return true;
        }

        public submit_args(submit_args other) {
            if (other.isSetData()) {
                this.data = new SubmitInfo(other.data);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class submit_result implements TBase<submit_result, _Fields>, Serializable, Cloneable, Comparable<submit_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* renamed from: e, reason: collision with root package name */
        public HeroApiException f28154e;
        private static final TStruct STRUCT_DESC = new TStruct("submit_result");
        private static final TField E_FIELD_DESC = new TField("e", (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            E(1, "e");

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
                return E;
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
        public static class submit_resultStandardScheme extends StandardScheme<submit_result> {
            private submit_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, submit_result struct) throws TException {
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
                        HeroApiException heroApiException = new HeroApiException();
                        struct.f28154e = heroApiException;
                        heroApiException.read(iprot);
                        struct.setEIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, submit_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(submit_result.STRUCT_DESC);
                if (struct.f28154e != null) {
                    oprot.writeFieldBegin(submit_result.E_FIELD_DESC);
                    struct.f28154e.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_resultStandardSchemeFactory implements SchemeFactory {
            private submit_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_resultStandardScheme getScheme() {
                return new submit_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_resultTupleScheme extends TupleScheme<submit_result> {
            private submit_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, submit_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                if (tTupleProtocol.readBitSet(1).get(0)) {
                    HeroApiException heroApiException = new HeroApiException();
                    struct.f28154e = heroApiException;
                    heroApiException.read(tTupleProtocol);
                    struct.setEIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, submit_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetE()) {
                    bitSet.set(0);
                }
                tTupleProtocol.writeBitSet(bitSet, 1);
                if (struct.isSetE()) {
                    struct.f28154e.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_resultTupleSchemeFactory implements SchemeFactory {
            private submit_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_resultTupleScheme getScheme() {
                return new submit_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new submit_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new submit_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.E, (_Fields) new FieldMetaData("e", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(submit_result.class, unmodifiableMap);
        }

        public submit_result() {
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
            this.f28154e = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof submit_result)) {
                return equals((submit_result) that);
            }
            return false;
        }

        public HeroApiException getE() {
            return this.f28154e;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetE() {
            return this.f28154e != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public submit_result setE(HeroApiException e11) {
            this.f28154e = e11;
            return this;
        }

        public void setEIsSet(boolean value) {
            if (value) {
                return;
            }
            this.f28154e = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("submit_result(");
            sb2.append("e:");
            HeroApiException heroApiException = this.f28154e;
            if (heroApiException == null) {
                sb2.append("null");
            } else {
                sb2.append(heroApiException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetE() {
            this.f28154e = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public submit_result(HeroApiException e11) {
            this();
            this.f28154e = e11;
        }

        @Override // java.lang.Comparable
        public int compareTo(submit_result other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetE()).compareTo(Boolean.valueOf(other.isSetE()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetE() || (compareTo = TBaseHelper.compareTo((Comparable) this.f28154e, (Comparable) other.f28154e)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<submit_result, _Fields> deepCopy2() {
            return new submit_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$submit_result$_Fields[field.ordinal()] == 1) {
                return getE();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$submit_result$_Fields[field.ordinal()] == 1) {
                return isSetE();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApi$submit_result$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetE();
            } else {
                setE((HeroApiException) value);
            }
        }

        public boolean equals(submit_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetE = isSetE();
            boolean isSetE2 = that.isSetE();
            if (isSetE || isSetE2) {
                return isSetE && isSetE2 && this.f28154e.equals(that.f28154e);
            }
            return true;
        }

        public submit_result(submit_result other) {
            if (other.isSetE()) {
                this.f28154e = new HeroApiException(other.f28154e);
            }
        }

        public void validate() throws TException {
        }
    }
}
