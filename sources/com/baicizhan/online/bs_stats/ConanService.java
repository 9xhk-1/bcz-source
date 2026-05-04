package com.baicizhan.online.bs_stats;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
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
/* loaded from: classes5.dex */
public class ConanService {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_stats.ConanService$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_gzip_json_array_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_gzip_json_array_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_text_json_array_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_text_json_array_result$_Fields;

        static {
            int[] iArr = new int[submit_gzip_json_array_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_gzip_json_array_result$_Fields = iArr;
            try {
                iArr[submit_gzip_json_array_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[submit_gzip_json_array_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_gzip_json_array_args$_Fields = iArr2;
            try {
                iArr2[submit_gzip_json_array_args._Fields.GZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_gzip_json_array_args$_Fields[submit_gzip_json_array_args._Fields.CHECKCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_gzip_json_array_args$_Fields[submit_gzip_json_array_args._Fields.LOGID.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[submit_text_json_array_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_text_json_array_result$_Fields = iArr3;
            try {
                iArr3[submit_text_json_array_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr4 = new int[submit_text_json_array_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_text_json_array_args$_Fields = iArr4;
            try {
                iArr4[submit_text_json_array_args._Fields.JSONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_text_json_array_args$_Fields[submit_text_json_array_args._Fields.CHECKCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_text_json_array_args$_Fields[submit_text_json_array_args._Fields.LOGID.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
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
        public static class submit_gzip_json_array_call extends TAsyncMethodCall {
            private String checkcode;
            private ByteBuffer gzip;
            private String logid;

            public submit_gzip_json_array_call(ByteBuffer gzip, String checkcode, String logid, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.gzip = gzip;
                this.checkcode = checkcode;
                this.logid = logid;
            }

            public int getResult() throws TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_submit_gzip_json_array();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("submit_gzip_json_array", (byte) 1, 0));
                submit_gzip_json_array_args submit_gzip_json_array_argsVar = new submit_gzip_json_array_args();
                submit_gzip_json_array_argsVar.setGzip(this.gzip);
                submit_gzip_json_array_argsVar.setCheckcode(this.checkcode);
                submit_gzip_json_array_argsVar.setLogid(this.logid);
                submit_gzip_json_array_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_text_json_array_call extends TAsyncMethodCall {
            private String checkcode;
            private String jsons;
            private String logid;

            public submit_text_json_array_call(String jsons, String checkcode, String logid, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.jsons = jsons;
                this.checkcode = checkcode;
                this.logid = logid;
            }

            public int getResult() throws TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_submit_text_json_array();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("submit_text_json_array", (byte) 1, 0));
                submit_text_json_array_args submit_text_json_array_argsVar = new submit_text_json_array_args();
                submit_text_json_array_argsVar.setJsons(this.jsons);
                submit_text_json_array_argsVar.setCheckcode(this.checkcode);
                submit_text_json_array_argsVar.setLogid(this.logid);
                submit_text_json_array_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        public AsyncClient(TProtocolFactory protocolFactory, TAsyncClientManager clientManager, TNonblockingTransport transport) {
            super(protocolFactory, clientManager, transport);
        }

        @Override // com.baicizhan.online.bs_stats.ConanService.AsyncIface
        public void submit_gzip_json_array(ByteBuffer gzip, String checkcode, String logid, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            submit_gzip_json_array_call submit_gzip_json_array_callVar = new submit_gzip_json_array_call(gzip, checkcode, logid, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = submit_gzip_json_array_callVar;
            this.___manager.call(submit_gzip_json_array_callVar);
        }

        @Override // com.baicizhan.online.bs_stats.ConanService.AsyncIface
        public void submit_text_json_array(String jsons, String checkcode, String logid, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            submit_text_json_array_call submit_text_json_array_callVar = new submit_text_json_array_call(jsons, checkcode, logid, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = submit_text_json_array_callVar;
            this.___manager.call(submit_text_json_array_callVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AsyncIface {
        void submit_gzip_json_array(ByteBuffer gzip, String checkcode, String logid, AsyncMethodCallback resultHandler) throws TException;

        void submit_text_json_array(String jsons, String checkcode, String logid, AsyncMethodCallback resultHandler) throws TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AsyncProcessor<I extends AsyncIface> extends TBaseAsyncProcessor<I> {
        private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_gzip_json_array<I extends AsyncIface> extends AsyncProcessFunction<I, submit_gzip_json_array_args, Integer> {
            public submit_gzip_json_array() {
                super("submit_gzip_json_array");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Integer> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Integer>() { // from class: com.baicizhan.online.bs_stats.ConanService.AsyncProcessor.submit_gzip_json_array.1
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception e11) {
                        new submit_gzip_json_array_result();
                        try {
                            this.sendResponse(fb2, (TBase) new TApplicationException(6, e11.getMessage()), (byte) 3, seqid);
                        } catch (Exception e12) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e12);
                            fb2.close();
                        }
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Integer o11) {
                        submit_gzip_json_array_result submit_gzip_json_array_resultVar = new submit_gzip_json_array_result();
                        submit_gzip_json_array_resultVar.success = o11.intValue();
                        submit_gzip_json_array_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, submit_gzip_json_array_resultVar, (byte) 2, seqid);
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
            public submit_gzip_json_array_args getEmptyArgsInstance() {
                return new submit_gzip_json_array_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, submit_gzip_json_array_args args, AsyncMethodCallback<Integer> resultHandler) throws TException {
                iface.submit_gzip_json_array(args.gzip, args.checkcode, args.logid, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_text_json_array<I extends AsyncIface> extends AsyncProcessFunction<I, submit_text_json_array_args, Integer> {
            public submit_text_json_array() {
                super("submit_text_json_array");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Integer> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Integer>() { // from class: com.baicizhan.online.bs_stats.ConanService.AsyncProcessor.submit_text_json_array.1
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception e11) {
                        new submit_text_json_array_result();
                        try {
                            this.sendResponse(fb2, (TBase) new TApplicationException(6, e11.getMessage()), (byte) 3, seqid);
                        } catch (Exception e12) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e12);
                            fb2.close();
                        }
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Integer o11) {
                        submit_text_json_array_result submit_text_json_array_resultVar = new submit_text_json_array_result();
                        submit_text_json_array_resultVar.success = o11.intValue();
                        submit_text_json_array_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, submit_text_json_array_resultVar, (byte) 2, seqid);
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
            public submit_text_json_array_args getEmptyArgsInstance() {
                return new submit_text_json_array_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, submit_text_json_array_args args, AsyncMethodCallback<Integer> resultHandler) throws TException {
                iface.submit_text_json_array(args.jsons, args.checkcode, args.logid, resultHandler);
            }
        }

        public AsyncProcessor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends AsyncIface> Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> getProcessMap(Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> processMap) {
            processMap.put("submit_text_json_array", new submit_text_json_array());
            processMap.put("submit_gzip_json_array", new submit_gzip_json_array());
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

        public int recv_submit_gzip_json_array() throws TException {
            submit_gzip_json_array_result submit_gzip_json_array_resultVar = new submit_gzip_json_array_result();
            receiveBase(submit_gzip_json_array_resultVar, "submit_gzip_json_array");
            if (submit_gzip_json_array_resultVar.isSetSuccess()) {
                return submit_gzip_json_array_resultVar.success;
            }
            throw new TApplicationException(5, "submit_gzip_json_array failed: unknown result");
        }

        public int recv_submit_text_json_array() throws TException {
            submit_text_json_array_result submit_text_json_array_resultVar = new submit_text_json_array_result();
            receiveBase(submit_text_json_array_resultVar, "submit_text_json_array");
            if (submit_text_json_array_resultVar.isSetSuccess()) {
                return submit_text_json_array_resultVar.success;
            }
            throw new TApplicationException(5, "submit_text_json_array failed: unknown result");
        }

        public void send_submit_gzip_json_array(ByteBuffer gzip, String checkcode, String logid) throws TException {
            submit_gzip_json_array_args submit_gzip_json_array_argsVar = new submit_gzip_json_array_args();
            submit_gzip_json_array_argsVar.setGzip(gzip);
            submit_gzip_json_array_argsVar.setCheckcode(checkcode);
            submit_gzip_json_array_argsVar.setLogid(logid);
            sendBase("submit_gzip_json_array", submit_gzip_json_array_argsVar);
        }

        public void send_submit_text_json_array(String jsons, String checkcode, String logid) throws TException {
            submit_text_json_array_args submit_text_json_array_argsVar = new submit_text_json_array_args();
            submit_text_json_array_argsVar.setJsons(jsons);
            submit_text_json_array_argsVar.setCheckcode(checkcode);
            submit_text_json_array_argsVar.setLogid(logid);
            sendBase("submit_text_json_array", submit_text_json_array_argsVar);
        }

        @Override // com.baicizhan.online.bs_stats.ConanService.Iface
        public int submit_gzip_json_array(ByteBuffer gzip, String checkcode, String logid) throws TException {
            send_submit_gzip_json_array(gzip, checkcode, logid);
            return recv_submit_gzip_json_array();
        }

        @Override // com.baicizhan.online.bs_stats.ConanService.Iface
        public int submit_text_json_array(String jsons, String checkcode, String logid) throws TException {
            send_submit_text_json_array(jsons, checkcode, logid);
            return recv_submit_text_json_array();
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
        int submit_gzip_json_array(ByteBuffer gzip, String checkcode, String logid) throws TException;

        int submit_text_json_array(String jsons, String checkcode, String logid) throws TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Processor<I extends Iface> extends TBaseProcessor<I> implements TProcessor {
        private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_gzip_json_array<I extends Iface> extends ProcessFunction<I, submit_gzip_json_array_args> {
            public submit_gzip_json_array() {
                super("submit_gzip_json_array");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public submit_gzip_json_array_args getEmptyArgsInstance() {
                return new submit_gzip_json_array_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public submit_gzip_json_array_result getResult(I iface, submit_gzip_json_array_args args) throws TException {
                submit_gzip_json_array_result submit_gzip_json_array_resultVar = new submit_gzip_json_array_result();
                submit_gzip_json_array_resultVar.success = iface.submit_gzip_json_array(args.gzip, args.checkcode, args.logid);
                submit_gzip_json_array_resultVar.setSuccessIsSet(true);
                return submit_gzip_json_array_resultVar;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_text_json_array<I extends Iface> extends ProcessFunction<I, submit_text_json_array_args> {
            public submit_text_json_array() {
                super("submit_text_json_array");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public submit_text_json_array_args getEmptyArgsInstance() {
                return new submit_text_json_array_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public submit_text_json_array_result getResult(I iface, submit_text_json_array_args args) throws TException {
                submit_text_json_array_result submit_text_json_array_resultVar = new submit_text_json_array_result();
                submit_text_json_array_resultVar.success = iface.submit_text_json_array(args.jsons, args.checkcode, args.logid);
                submit_text_json_array_resultVar.setSuccessIsSet(true);
                return submit_text_json_array_resultVar;
            }
        }

        public Processor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends Iface> Map<String, ProcessFunction<I, ? extends TBase>> getProcessMap(Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            processMap.put("submit_text_json_array", new submit_text_json_array());
            processMap.put("submit_gzip_json_array", new submit_gzip_json_array());
            return processMap;
        }

        public Processor(I iface, Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            super(iface, getProcessMap(processMap));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class submit_gzip_json_array_args implements TBase<submit_gzip_json_array_args, _Fields>, Serializable, Cloneable, Comparable<submit_gzip_json_array_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public String checkcode;
        public ByteBuffer gzip;
        public String logid;
        private static final TStruct STRUCT_DESC = new TStruct("submit_gzip_json_array_args");
        private static final TField GZIP_FIELD_DESC = new TField("gzip", (byte) 11, 1);
        private static final TField CHECKCODE_FIELD_DESC = new TField("checkcode", (byte) 11, 2);
        private static final TField LOGID_FIELD_DESC = new TField("logid", (byte) 11, 3);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            GZIP(1, "gzip"),
            CHECKCODE(2, "checkcode"),
            LOGID(3, "logid");

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
                    return GZIP;
                }
                if (fieldId == 2) {
                    return CHECKCODE;
                }
                if (fieldId != 3) {
                    return null;
                }
                return LOGID;
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
        public static class submit_gzip_json_array_argsStandardScheme extends StandardScheme<submit_gzip_json_array_args> {
            private submit_gzip_json_array_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, submit_gzip_json_array_args struct) throws TException {
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
                            if (s11 != 3) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 11) {
                                struct.logid = iprot.readString();
                                struct.setLogidIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.checkcode = iprot.readString();
                            struct.setCheckcodeIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.gzip = iprot.readBinary();
                        struct.setGzipIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, submit_gzip_json_array_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(submit_gzip_json_array_args.STRUCT_DESC);
                if (struct.gzip != null) {
                    oprot.writeFieldBegin(submit_gzip_json_array_args.GZIP_FIELD_DESC);
                    oprot.writeBinary(struct.gzip);
                    oprot.writeFieldEnd();
                }
                if (struct.checkcode != null) {
                    oprot.writeFieldBegin(submit_gzip_json_array_args.CHECKCODE_FIELD_DESC);
                    oprot.writeString(struct.checkcode);
                    oprot.writeFieldEnd();
                }
                if (struct.logid != null) {
                    oprot.writeFieldBegin(submit_gzip_json_array_args.LOGID_FIELD_DESC);
                    oprot.writeString(struct.logid);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_gzip_json_array_argsStandardSchemeFactory implements SchemeFactory {
            private submit_gzip_json_array_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_gzip_json_array_argsStandardScheme getScheme() {
                return new submit_gzip_json_array_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_gzip_json_array_argsTupleScheme extends TupleScheme<submit_gzip_json_array_args> {
            private submit_gzip_json_array_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, submit_gzip_json_array_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.gzip = tTupleProtocol.readBinary();
                struct.setGzipIsSet(true);
                struct.checkcode = tTupleProtocol.readString();
                struct.setCheckcodeIsSet(true);
                struct.logid = tTupleProtocol.readString();
                struct.setLogidIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, submit_gzip_json_array_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeBinary(struct.gzip);
                tTupleProtocol.writeString(struct.checkcode);
                tTupleProtocol.writeString(struct.logid);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_gzip_json_array_argsTupleSchemeFactory implements SchemeFactory {
            private submit_gzip_json_array_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_gzip_json_array_argsTupleScheme getScheme() {
                return new submit_gzip_json_array_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new submit_gzip_json_array_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new submit_gzip_json_array_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.GZIP, (_Fields) new FieldMetaData("gzip", (byte) 1, new FieldValueMetaData((byte) 11, true)));
            enumMap.put((EnumMap) _Fields.CHECKCODE, (_Fields) new FieldMetaData("checkcode", (byte) 1, new FieldValueMetaData((byte) 11)));
            enumMap.put((EnumMap) _Fields.LOGID, (_Fields) new FieldMetaData("logid", (byte) 1, new FieldValueMetaData((byte) 11)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(submit_gzip_json_array_args.class, unmodifiableMap);
        }

        public submit_gzip_json_array_args() {
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

        public ByteBuffer bufferForGzip() {
            return this.gzip;
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.gzip = null;
            this.checkcode = null;
            this.logid = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof submit_gzip_json_array_args)) {
                return equals((submit_gzip_json_array_args) that);
            }
            return false;
        }

        public String getCheckcode() {
            return this.checkcode;
        }

        public byte[] getGzip() {
            setGzip(TBaseHelper.rightSize(this.gzip));
            ByteBuffer byteBuffer = this.gzip;
            if (byteBuffer == null) {
                return null;
            }
            return byteBuffer.array();
        }

        public String getLogid() {
            return this.logid;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetCheckcode() {
            return this.checkcode != null;
        }

        public boolean isSetGzip() {
            return this.gzip != null;
        }

        public boolean isSetLogid() {
            return this.logid != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public submit_gzip_json_array_args setCheckcode(String checkcode) {
            this.checkcode = checkcode;
            return this;
        }

        public void setCheckcodeIsSet(boolean value) {
            if (value) {
                return;
            }
            this.checkcode = null;
        }

        public submit_gzip_json_array_args setGzip(byte[] gzip) {
            setGzip(gzip == null ? null : ByteBuffer.wrap(gzip));
            return this;
        }

        public void setGzipIsSet(boolean value) {
            if (value) {
                return;
            }
            this.gzip = null;
        }

        public submit_gzip_json_array_args setLogid(String logid) {
            this.logid = logid;
            return this;
        }

        public void setLogidIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logid = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("submit_gzip_json_array_args(");
            sb2.append("gzip:");
            ByteBuffer byteBuffer = this.gzip;
            if (byteBuffer == null) {
                sb2.append("null");
            } else {
                TBaseHelper.toString(byteBuffer, sb2);
            }
            sb2.append(j2.O);
            sb2.append("checkcode:");
            String str = this.checkcode;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j2.O);
            sb2.append("logid:");
            String str2 = this.logid;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetCheckcode() {
            this.checkcode = null;
        }

        public void unsetGzip() {
            this.gzip = null;
        }

        public void unsetLogid() {
            this.logid = null;
        }

        public void validate() throws TException {
            if (this.gzip == null) {
                throw new TProtocolException("Required field 'gzip' was not present! Struct: " + toString());
            }
            if (this.checkcode == null) {
                throw new TProtocolException("Required field 'checkcode' was not present! Struct: " + toString());
            }
            if (this.logid != null) {
                return;
            }
            throw new TProtocolException("Required field 'logid' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public submit_gzip_json_array_args(ByteBuffer gzip, String checkcode, String logid) {
            this();
            this.gzip = gzip;
            this.checkcode = checkcode;
            this.logid = logid;
        }

        @Override // java.lang.Comparable
        public int compareTo(submit_gzip_json_array_args other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetGzip()).compareTo(Boolean.valueOf(other.isSetGzip()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetGzip() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.gzip, (Comparable) other.gzip)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetCheckcode()).compareTo(Boolean.valueOf(other.isSetCheckcode()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetCheckcode() && (compareTo2 = TBaseHelper.compareTo(this.checkcode, other.checkcode)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetLogid()).compareTo(Boolean.valueOf(other.isSetLogid()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetLogid() || (compareTo = TBaseHelper.compareTo(this.logid, other.logid)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<submit_gzip_json_array_args, _Fields> deepCopy2() {
            return new submit_gzip_json_array_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_gzip_json_array_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getGzip();
            }
            if (i11 == 2) {
                return getCheckcode();
            }
            if (i11 == 3) {
                return getLogid();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_gzip_json_array_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetGzip();
            }
            if (i11 == 2) {
                return isSetCheckcode();
            }
            if (i11 == 3) {
                return isSetLogid();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_gzip_json_array_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetGzip();
                    return;
                } else {
                    setGzip((ByteBuffer) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetCheckcode();
                    return;
                } else {
                    setCheckcode((String) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetLogid();
            } else {
                setLogid((String) value);
            }
        }

        public submit_gzip_json_array_args setGzip(ByteBuffer gzip) {
            this.gzip = gzip;
            return this;
        }

        public boolean equals(submit_gzip_json_array_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetGzip = isSetGzip();
            boolean isSetGzip2 = that.isSetGzip();
            if ((isSetGzip || isSetGzip2) && !(isSetGzip && isSetGzip2 && this.gzip.equals(that.gzip))) {
                return false;
            }
            boolean isSetCheckcode = isSetCheckcode();
            boolean isSetCheckcode2 = that.isSetCheckcode();
            if ((isSetCheckcode || isSetCheckcode2) && !(isSetCheckcode && isSetCheckcode2 && this.checkcode.equals(that.checkcode))) {
                return false;
            }
            boolean isSetLogid = isSetLogid();
            boolean isSetLogid2 = that.isSetLogid();
            if (isSetLogid || isSetLogid2) {
                return isSetLogid && isSetLogid2 && this.logid.equals(that.logid);
            }
            return true;
        }

        public submit_gzip_json_array_args(submit_gzip_json_array_args other) {
            if (other.isSetGzip()) {
                this.gzip = TBaseHelper.copyBinary(other.gzip);
            }
            if (other.isSetCheckcode()) {
                this.checkcode = other.checkcode;
            }
            if (other.isSetLogid()) {
                this.logid = other.logid;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class submit_gzip_json_array_result implements TBase<submit_gzip_json_array_result, _Fields>, Serializable, Cloneable, Comparable<submit_gzip_json_array_result> {
        private static final TStruct STRUCT_DESC = new TStruct("submit_gzip_json_array_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 8, 0);
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int success;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success");

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
                if (fieldId != 0) {
                    return null;
                }
                return SUCCESS;
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
        public static class submit_gzip_json_array_resultStandardScheme extends StandardScheme<submit_gzip_json_array_result> {
            private submit_gzip_json_array_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, submit_gzip_json_array_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 0) {
                        TProtocolUtil.skip(iprot, b11);
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
            public void write(TProtocol oprot, submit_gzip_json_array_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(submit_gzip_json_array_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(submit_gzip_json_array_result.SUCCESS_FIELD_DESC);
                    oprot.writeI32(struct.success);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_gzip_json_array_resultStandardSchemeFactory implements SchemeFactory {
            private submit_gzip_json_array_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_gzip_json_array_resultStandardScheme getScheme() {
                return new submit_gzip_json_array_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_gzip_json_array_resultTupleScheme extends TupleScheme<submit_gzip_json_array_result> {
            private submit_gzip_json_array_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, submit_gzip_json_array_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                if (tTupleProtocol.readBitSet(1).get(0)) {
                    struct.success = tTupleProtocol.readI32();
                    struct.setSuccessIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, submit_gzip_json_array_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                tTupleProtocol.writeBitSet(bitSet, 1);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_gzip_json_array_resultTupleSchemeFactory implements SchemeFactory {
            private submit_gzip_json_array_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_gzip_json_array_resultTupleScheme getScheme() {
                return new submit_gzip_json_array_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new submit_gzip_json_array_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new submit_gzip_json_array_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(submit_gzip_json_array_result.class, unmodifiableMap);
        }

        public submit_gzip_json_array_result() {
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
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof submit_gzip_json_array_result)) {
                return equals((submit_gzip_json_array_result) that);
            }
            return false;
        }

        public int getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetSuccess() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public submit_gzip_json_array_result setSuccess(int success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "submit_gzip_json_array_result(success:" + this.success + j.f81007d;
        }

        public void unsetSuccess() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(submit_gzip_json_array_result other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetSuccess() || (compareTo = TBaseHelper.compareTo(this.success, other.success)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<submit_gzip_json_array_result, _Fields> deepCopy2() {
            return new submit_gzip_json_array_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_gzip_json_array_result$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getSuccess());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_gzip_json_array_result$_Fields[field.ordinal()] == 1) {
                return isSetSuccess();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_gzip_json_array_result$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetSuccess();
            } else {
                setSuccess(((Integer) value).intValue());
            }
        }

        public submit_gzip_json_array_result(int success) {
            this();
            this.success = success;
            setSuccessIsSet(true);
        }

        public boolean equals(submit_gzip_json_array_result that) {
            return that != null && this.success == that.success;
        }

        public submit_gzip_json_array_result(submit_gzip_json_array_result other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.success = other.success;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class submit_text_json_array_args implements TBase<submit_text_json_array_args, _Fields>, Serializable, Cloneable, Comparable<submit_text_json_array_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public String checkcode;
        public String jsons;
        public String logid;
        private static final TStruct STRUCT_DESC = new TStruct("submit_text_json_array_args");
        private static final TField JSONS_FIELD_DESC = new TField("jsons", (byte) 11, 1);
        private static final TField CHECKCODE_FIELD_DESC = new TField("checkcode", (byte) 11, 2);
        private static final TField LOGID_FIELD_DESC = new TField("logid", (byte) 11, 3);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            JSONS(1, "jsons"),
            CHECKCODE(2, "checkcode"),
            LOGID(3, "logid");

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
                    return JSONS;
                }
                if (fieldId == 2) {
                    return CHECKCODE;
                }
                if (fieldId != 3) {
                    return null;
                }
                return LOGID;
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
        public static class submit_text_json_array_argsStandardScheme extends StandardScheme<submit_text_json_array_args> {
            private submit_text_json_array_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, submit_text_json_array_args struct) throws TException {
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
                            if (s11 != 3) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 11) {
                                struct.logid = iprot.readString();
                                struct.setLogidIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.checkcode = iprot.readString();
                            struct.setCheckcodeIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.jsons = iprot.readString();
                        struct.setJsonsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, submit_text_json_array_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(submit_text_json_array_args.STRUCT_DESC);
                if (struct.jsons != null) {
                    oprot.writeFieldBegin(submit_text_json_array_args.JSONS_FIELD_DESC);
                    oprot.writeString(struct.jsons);
                    oprot.writeFieldEnd();
                }
                if (struct.checkcode != null) {
                    oprot.writeFieldBegin(submit_text_json_array_args.CHECKCODE_FIELD_DESC);
                    oprot.writeString(struct.checkcode);
                    oprot.writeFieldEnd();
                }
                if (struct.logid != null) {
                    oprot.writeFieldBegin(submit_text_json_array_args.LOGID_FIELD_DESC);
                    oprot.writeString(struct.logid);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_text_json_array_argsStandardSchemeFactory implements SchemeFactory {
            private submit_text_json_array_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_text_json_array_argsStandardScheme getScheme() {
                return new submit_text_json_array_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_text_json_array_argsTupleScheme extends TupleScheme<submit_text_json_array_args> {
            private submit_text_json_array_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, submit_text_json_array_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.jsons = tTupleProtocol.readString();
                struct.setJsonsIsSet(true);
                struct.checkcode = tTupleProtocol.readString();
                struct.setCheckcodeIsSet(true);
                struct.logid = tTupleProtocol.readString();
                struct.setLogidIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, submit_text_json_array_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeString(struct.jsons);
                tTupleProtocol.writeString(struct.checkcode);
                tTupleProtocol.writeString(struct.logid);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_text_json_array_argsTupleSchemeFactory implements SchemeFactory {
            private submit_text_json_array_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_text_json_array_argsTupleScheme getScheme() {
                return new submit_text_json_array_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new submit_text_json_array_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new submit_text_json_array_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.JSONS, (_Fields) new FieldMetaData("jsons", (byte) 1, new FieldValueMetaData((byte) 11)));
            enumMap.put((EnumMap) _Fields.CHECKCODE, (_Fields) new FieldMetaData("checkcode", (byte) 1, new FieldValueMetaData((byte) 11)));
            enumMap.put((EnumMap) _Fields.LOGID, (_Fields) new FieldMetaData("logid", (byte) 1, new FieldValueMetaData((byte) 11)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(submit_text_json_array_args.class, unmodifiableMap);
        }

        public submit_text_json_array_args() {
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
            this.jsons = null;
            this.checkcode = null;
            this.logid = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof submit_text_json_array_args)) {
                return equals((submit_text_json_array_args) that);
            }
            return false;
        }

        public String getCheckcode() {
            return this.checkcode;
        }

        public String getJsons() {
            return this.jsons;
        }

        public String getLogid() {
            return this.logid;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetCheckcode() {
            return this.checkcode != null;
        }

        public boolean isSetJsons() {
            return this.jsons != null;
        }

        public boolean isSetLogid() {
            return this.logid != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public submit_text_json_array_args setCheckcode(String checkcode) {
            this.checkcode = checkcode;
            return this;
        }

        public void setCheckcodeIsSet(boolean value) {
            if (value) {
                return;
            }
            this.checkcode = null;
        }

        public submit_text_json_array_args setJsons(String jsons) {
            this.jsons = jsons;
            return this;
        }

        public void setJsonsIsSet(boolean value) {
            if (value) {
                return;
            }
            this.jsons = null;
        }

        public submit_text_json_array_args setLogid(String logid) {
            this.logid = logid;
            return this;
        }

        public void setLogidIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logid = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("submit_text_json_array_args(");
            sb2.append("jsons:");
            String str = this.jsons;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j2.O);
            sb2.append("checkcode:");
            String str2 = this.checkcode;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
            sb2.append(j2.O);
            sb2.append("logid:");
            String str3 = this.logid;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetCheckcode() {
            this.checkcode = null;
        }

        public void unsetJsons() {
            this.jsons = null;
        }

        public void unsetLogid() {
            this.logid = null;
        }

        public void validate() throws TException {
            if (this.jsons == null) {
                throw new TProtocolException("Required field 'jsons' was not present! Struct: " + toString());
            }
            if (this.checkcode == null) {
                throw new TProtocolException("Required field 'checkcode' was not present! Struct: " + toString());
            }
            if (this.logid != null) {
                return;
            }
            throw new TProtocolException("Required field 'logid' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public submit_text_json_array_args(String jsons, String checkcode, String logid) {
            this();
            this.jsons = jsons;
            this.checkcode = checkcode;
            this.logid = logid;
        }

        @Override // java.lang.Comparable
        public int compareTo(submit_text_json_array_args other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetJsons()).compareTo(Boolean.valueOf(other.isSetJsons()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetJsons() && (compareTo3 = TBaseHelper.compareTo(this.jsons, other.jsons)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetCheckcode()).compareTo(Boolean.valueOf(other.isSetCheckcode()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetCheckcode() && (compareTo2 = TBaseHelper.compareTo(this.checkcode, other.checkcode)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetLogid()).compareTo(Boolean.valueOf(other.isSetLogid()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetLogid() || (compareTo = TBaseHelper.compareTo(this.logid, other.logid)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<submit_text_json_array_args, _Fields> deepCopy2() {
            return new submit_text_json_array_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_text_json_array_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getJsons();
            }
            if (i11 == 2) {
                return getCheckcode();
            }
            if (i11 == 3) {
                return getLogid();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_text_json_array_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetJsons();
            }
            if (i11 == 2) {
                return isSetCheckcode();
            }
            if (i11 == 3) {
                return isSetLogid();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_text_json_array_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetJsons();
                    return;
                } else {
                    setJsons((String) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetCheckcode();
                    return;
                } else {
                    setCheckcode((String) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetLogid();
            } else {
                setLogid((String) value);
            }
        }

        public boolean equals(submit_text_json_array_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetJsons = isSetJsons();
            boolean isSetJsons2 = that.isSetJsons();
            if ((isSetJsons || isSetJsons2) && !(isSetJsons && isSetJsons2 && this.jsons.equals(that.jsons))) {
                return false;
            }
            boolean isSetCheckcode = isSetCheckcode();
            boolean isSetCheckcode2 = that.isSetCheckcode();
            if ((isSetCheckcode || isSetCheckcode2) && !(isSetCheckcode && isSetCheckcode2 && this.checkcode.equals(that.checkcode))) {
                return false;
            }
            boolean isSetLogid = isSetLogid();
            boolean isSetLogid2 = that.isSetLogid();
            if (isSetLogid || isSetLogid2) {
                return isSetLogid && isSetLogid2 && this.logid.equals(that.logid);
            }
            return true;
        }

        public submit_text_json_array_args(submit_text_json_array_args other) {
            if (other.isSetJsons()) {
                this.jsons = other.jsons;
            }
            if (other.isSetCheckcode()) {
                this.checkcode = other.checkcode;
            }
            if (other.isSetLogid()) {
                this.logid = other.logid;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class submit_text_json_array_result implements TBase<submit_text_json_array_result, _Fields>, Serializable, Cloneable, Comparable<submit_text_json_array_result> {
        private static final TStruct STRUCT_DESC = new TStruct("submit_text_json_array_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 8, 0);
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int success;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success");

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
                if (fieldId != 0) {
                    return null;
                }
                return SUCCESS;
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
        public static class submit_text_json_array_resultStandardScheme extends StandardScheme<submit_text_json_array_result> {
            private submit_text_json_array_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, submit_text_json_array_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 0) {
                        TProtocolUtil.skip(iprot, b11);
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
            public void write(TProtocol oprot, submit_text_json_array_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(submit_text_json_array_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(submit_text_json_array_result.SUCCESS_FIELD_DESC);
                    oprot.writeI32(struct.success);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_text_json_array_resultStandardSchemeFactory implements SchemeFactory {
            private submit_text_json_array_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_text_json_array_resultStandardScheme getScheme() {
                return new submit_text_json_array_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_text_json_array_resultTupleScheme extends TupleScheme<submit_text_json_array_result> {
            private submit_text_json_array_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, submit_text_json_array_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                if (tTupleProtocol.readBitSet(1).get(0)) {
                    struct.success = tTupleProtocol.readI32();
                    struct.setSuccessIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, submit_text_json_array_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                tTupleProtocol.writeBitSet(bitSet, 1);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_text_json_array_resultTupleSchemeFactory implements SchemeFactory {
            private submit_text_json_array_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_text_json_array_resultTupleScheme getScheme() {
                return new submit_text_json_array_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new submit_text_json_array_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new submit_text_json_array_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(submit_text_json_array_result.class, unmodifiableMap);
        }

        public submit_text_json_array_result() {
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
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof submit_text_json_array_result)) {
                return equals((submit_text_json_array_result) that);
            }
            return false;
        }

        public int getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetSuccess() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public submit_text_json_array_result setSuccess(int success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "submit_text_json_array_result(success:" + this.success + j.f81007d;
        }

        public void unsetSuccess() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(submit_text_json_array_result other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetSuccess() || (compareTo = TBaseHelper.compareTo(this.success, other.success)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<submit_text_json_array_result, _Fields> deepCopy2() {
            return new submit_text_json_array_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_text_json_array_result$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getSuccess());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_text_json_array_result$_Fields[field.ordinal()] == 1) {
                return isSetSuccess();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_stats$ConanService$submit_text_json_array_result$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetSuccess();
            } else {
                setSuccess(((Integer) value).intValue());
            }
        }

        public submit_text_json_array_result(int success) {
            this();
            this.success = success;
            setSuccessIsSet(true);
        }

        public boolean equals(submit_text_json_array_result that) {
            return that != null && this.success == that.success;
        }

        public submit_text_json_array_result(submit_text_json_array_result other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.success = other.success;
        }

        public void validate() throws TException {
        }
    }
}
