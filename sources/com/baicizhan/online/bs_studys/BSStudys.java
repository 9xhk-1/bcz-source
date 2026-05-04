package com.baicizhan.online.bs_studys;

import com.baicizhan.online.structs.BELogicException;
import com.baicizhan.online.structs.BESystemException;
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
public class BSStudys {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_studys.BSStudys$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$cancel_pi_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$cancel_pi_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$get_vocab_init_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$get_vocab_init_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_v2_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_v2_result$_Fields;

        static {
            int[] iArr = new int[cancel_pi_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$cancel_pi_result$_Fields = iArr;
            try {
                iArr[cancel_pi_result._Fields.SYS_EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$cancel_pi_result$_Fields[cancel_pi_result._Fields.LOG_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$cancel_pi_args$_Fields = new int[cancel_pi_args._Fields.values().length];
            int[] iArr2 = new int[save_vocab_info_v2_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_v2_result$_Fields = iArr2;
            try {
                iArr2[save_vocab_info_v2_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_v2_result$_Fields[save_vocab_info_v2_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_v2_result$_Fields[save_vocab_info_v2_result._Fields.LOG_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[save_vocab_info_v2_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_v2_args$_Fields = iArr3;
            try {
                iArr3[save_vocab_info_v2_args._Fields.COUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_v2_args$_Fields[save_vocab_info_v2_args._Fields.STEPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_v2_args$_Fields[save_vocab_info_v2_args._Fields.TEST_VOCAB_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_v2_args$_Fields[save_vocab_info_v2_args._Fields.TEST_VOCAB_COUNT_RANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_v2_args$_Fields[save_vocab_info_v2_args._Fields.IS_VALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr4 = new int[save_vocab_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_result$_Fields = iArr4;
            try {
                iArr4[save_vocab_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_result$_Fields[save_vocab_info_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_result$_Fields[save_vocab_info_result._Fields.LOG_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr5 = new int[save_vocab_info_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_args$_Fields = iArr5;
            try {
                iArr5[save_vocab_info_args._Fields.COUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_args$_Fields[save_vocab_info_args._Fields.STEPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_args$_Fields[save_vocab_info_args._Fields.TEST_VOCAB_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_args$_Fields[save_vocab_info_args._Fields.TEST_VOCAB_COUNT_RANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr6 = new int[get_vocab_init_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$get_vocab_init_info_result$_Fields = iArr6;
            try {
                iArr6[get_vocab_init_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$get_vocab_init_info_result$_Fields[get_vocab_init_info_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$get_vocab_init_info_result$_Fields[get_vocab_init_info_result._Fields.LOG_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            $SwitchMap$com$baicizhan$online$bs_studys$BSStudys$get_vocab_init_info_args$_Fields = new int[get_vocab_init_info_args._Fields.values().length];
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
        public static class cancel_pi_call extends TAsyncMethodCall {
            public cancel_pi_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public void getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_cancel_pi();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("cancel_pi", (byte) 1, 0));
                new cancel_pi_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_vocab_init_info_call extends TAsyncMethodCall {
            public get_vocab_init_info_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public BBUserVocabInfo getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_vocab_init_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_vocab_init_info", (byte) 1, 0));
                new get_vocab_init_info_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info_call extends TAsyncMethodCall {
            private int count;
            private int steps;
            private String test_vocab_count_range;
            private String test_vocab_info;

            public save_vocab_info_call(int count, int steps, String test_vocab_info, String test_vocab_count_range, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.count = count;
                this.steps = steps;
                this.test_vocab_info = test_vocab_info;
                this.test_vocab_count_range = test_vocab_count_range;
            }

            public int getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_save_vocab_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("save_vocab_info", (byte) 1, 0));
                save_vocab_info_args save_vocab_info_argsVar = new save_vocab_info_args();
                save_vocab_info_argsVar.setCount(this.count);
                save_vocab_info_argsVar.setSteps(this.steps);
                save_vocab_info_argsVar.setTest_vocab_info(this.test_vocab_info);
                save_vocab_info_argsVar.setTest_vocab_count_range(this.test_vocab_count_range);
                save_vocab_info_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info_v2_call extends TAsyncMethodCall {
            private int count;
            private boolean isValid;
            private int steps;
            private String test_vocab_count_range;
            private String test_vocab_info;

            public save_vocab_info_v2_call(int count, int steps, String test_vocab_info, String test_vocab_count_range, boolean isValid, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.count = count;
                this.steps = steps;
                this.test_vocab_info = test_vocab_info;
                this.test_vocab_count_range = test_vocab_count_range;
                this.isValid = isValid;
            }

            public int getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_save_vocab_info_v2();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("save_vocab_info_v2", (byte) 1, 0));
                save_vocab_info_v2_args save_vocab_info_v2_argsVar = new save_vocab_info_v2_args();
                save_vocab_info_v2_argsVar.setCount(this.count);
                save_vocab_info_v2_argsVar.setSteps(this.steps);
                save_vocab_info_v2_argsVar.setTest_vocab_info(this.test_vocab_info);
                save_vocab_info_v2_argsVar.setTest_vocab_count_range(this.test_vocab_count_range);
                save_vocab_info_v2_argsVar.setIsValid(this.isValid);
                save_vocab_info_v2_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        public AsyncClient(TProtocolFactory protocolFactory, TAsyncClientManager clientManager, TNonblockingTransport transport) {
            super(protocolFactory, clientManager, transport);
        }

        @Override // com.baicizhan.online.bs_studys.BSStudys.AsyncIface
        public void cancel_pi(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            cancel_pi_call cancel_pi_callVar = new cancel_pi_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = cancel_pi_callVar;
            this.___manager.call(cancel_pi_callVar);
        }

        @Override // com.baicizhan.online.bs_studys.BSStudys.AsyncIface
        public void get_vocab_init_info(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_vocab_init_info_call get_vocab_init_info_callVar = new get_vocab_init_info_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_vocab_init_info_callVar;
            this.___manager.call(get_vocab_init_info_callVar);
        }

        @Override // com.baicizhan.online.bs_studys.BSStudys.AsyncIface
        public void save_vocab_info(int count, int steps, String test_vocab_info, String test_vocab_count_range, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            save_vocab_info_call save_vocab_info_callVar = new save_vocab_info_call(count, steps, test_vocab_info, test_vocab_count_range, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = save_vocab_info_callVar;
            this.___manager.call(save_vocab_info_callVar);
        }

        @Override // com.baicizhan.online.bs_studys.BSStudys.AsyncIface
        public void save_vocab_info_v2(int count, int steps, String test_vocab_info, String test_vocab_count_range, boolean isValid, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            save_vocab_info_v2_call save_vocab_info_v2_callVar = new save_vocab_info_v2_call(count, steps, test_vocab_info, test_vocab_count_range, isValid, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = save_vocab_info_v2_callVar;
            this.___manager.call(save_vocab_info_v2_callVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AsyncIface {
        void cancel_pi(AsyncMethodCallback resultHandler) throws TException;

        void get_vocab_init_info(AsyncMethodCallback resultHandler) throws TException;

        void save_vocab_info(int count, int steps, String test_vocab_info, String test_vocab_count_range, AsyncMethodCallback resultHandler) throws TException;

        void save_vocab_info_v2(int count, int steps, String test_vocab_info, String test_vocab_count_range, boolean isValid, AsyncMethodCallback resultHandler) throws TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AsyncProcessor<I extends AsyncIface> extends TBaseAsyncProcessor<I> {
        private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class cancel_pi<I extends AsyncIface> extends AsyncProcessFunction<I, cancel_pi_args, Void> {
            public cancel_pi() {
                super("cancel_pi");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.bs_studys.BSStudys.AsyncProcessor.cancel_pi.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        cancel_pi_result cancel_pi_resultVar;
                        cancel_pi_result cancel_pi_resultVar2 = new cancel_pi_result();
                        try {
                            if (exc instanceof BESystemException) {
                                cancel_pi_resultVar2.sysException = (BESystemException) exc;
                                cancel_pi_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    cancel_pi_resultVar = r02;
                                    this.sendResponse(fb2, cancel_pi_resultVar, b11, seqid);
                                    return;
                                }
                                cancel_pi_resultVar2.logException = (BELogicException) exc;
                                cancel_pi_resultVar2.setLogExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, cancel_pi_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        cancel_pi_resultVar = cancel_pi_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new cancel_pi_result(), (byte) 2, seqid);
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
            public cancel_pi_args getEmptyArgsInstance() {
                return new cancel_pi_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, cancel_pi_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.cancel_pi(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_vocab_init_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_vocab_init_info_args, BBUserVocabInfo> {
            public get_vocab_init_info() {
                super("get_vocab_init_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<BBUserVocabInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<BBUserVocabInfo>() { // from class: com.baicizhan.online.bs_studys.BSStudys.AsyncProcessor.get_vocab_init_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_vocab_init_info_result get_vocab_init_info_resultVar;
                        get_vocab_init_info_result get_vocab_init_info_resultVar2 = new get_vocab_init_info_result();
                        try {
                            if (exc instanceof BESystemException) {
                                get_vocab_init_info_resultVar2.sysException = (BESystemException) exc;
                                get_vocab_init_info_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_vocab_init_info_resultVar = r02;
                                    this.sendResponse(fb2, get_vocab_init_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_vocab_init_info_resultVar2.logException = (BELogicException) exc;
                                get_vocab_init_info_resultVar2.setLogExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, get_vocab_init_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_vocab_init_info_resultVar = get_vocab_init_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(BBUserVocabInfo o11) {
                        get_vocab_init_info_result get_vocab_init_info_resultVar = new get_vocab_init_info_result();
                        get_vocab_init_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_vocab_init_info_resultVar, (byte) 2, seqid);
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
            public get_vocab_init_info_args getEmptyArgsInstance() {
                return new get_vocab_init_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_vocab_init_info_args args, AsyncMethodCallback<BBUserVocabInfo> resultHandler) throws TException {
                iface.get_vocab_init_info(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info<I extends AsyncIface> extends AsyncProcessFunction<I, save_vocab_info_args, Integer> {
            public save_vocab_info() {
                super("save_vocab_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Integer> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Integer>() { // from class: com.baicizhan.online.bs_studys.BSStudys.AsyncProcessor.save_vocab_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        save_vocab_info_result save_vocab_info_resultVar;
                        save_vocab_info_result save_vocab_info_resultVar2 = new save_vocab_info_result();
                        try {
                            if (exc instanceof BESystemException) {
                                save_vocab_info_resultVar2.sysException = (BESystemException) exc;
                                save_vocab_info_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    save_vocab_info_resultVar = r02;
                                    this.sendResponse(fb2, save_vocab_info_resultVar, b11, seqid);
                                    return;
                                }
                                save_vocab_info_resultVar2.logException = (BELogicException) exc;
                                save_vocab_info_resultVar2.setLogExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, save_vocab_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        save_vocab_info_resultVar = save_vocab_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Integer o11) {
                        save_vocab_info_result save_vocab_info_resultVar = new save_vocab_info_result();
                        save_vocab_info_resultVar.success = o11.intValue();
                        save_vocab_info_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, save_vocab_info_resultVar, (byte) 2, seqid);
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
            public save_vocab_info_args getEmptyArgsInstance() {
                return new save_vocab_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, save_vocab_info_args args, AsyncMethodCallback<Integer> resultHandler) throws TException {
                iface.save_vocab_info(args.count, args.steps, args.test_vocab_info, args.test_vocab_count_range, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info_v2<I extends AsyncIface> extends AsyncProcessFunction<I, save_vocab_info_v2_args, Integer> {
            public save_vocab_info_v2() {
                super("save_vocab_info_v2");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Integer> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Integer>() { // from class: com.baicizhan.online.bs_studys.BSStudys.AsyncProcessor.save_vocab_info_v2.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        save_vocab_info_v2_result save_vocab_info_v2_resultVar;
                        save_vocab_info_v2_result save_vocab_info_v2_resultVar2 = new save_vocab_info_v2_result();
                        try {
                            if (exc instanceof BESystemException) {
                                save_vocab_info_v2_resultVar2.sysException = (BESystemException) exc;
                                save_vocab_info_v2_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    save_vocab_info_v2_resultVar = r02;
                                    this.sendResponse(fb2, save_vocab_info_v2_resultVar, b11, seqid);
                                    return;
                                }
                                save_vocab_info_v2_resultVar2.logException = (BELogicException) exc;
                                save_vocab_info_v2_resultVar2.setLogExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, save_vocab_info_v2_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        save_vocab_info_v2_resultVar = save_vocab_info_v2_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Integer o11) {
                        save_vocab_info_v2_result save_vocab_info_v2_resultVar = new save_vocab_info_v2_result();
                        save_vocab_info_v2_resultVar.success = o11.intValue();
                        save_vocab_info_v2_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, save_vocab_info_v2_resultVar, (byte) 2, seqid);
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
            public save_vocab_info_v2_args getEmptyArgsInstance() {
                return new save_vocab_info_v2_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, save_vocab_info_v2_args args, AsyncMethodCallback<Integer> resultHandler) throws TException {
                iface.save_vocab_info_v2(args.count, args.steps, args.test_vocab_info, args.test_vocab_count_range, args.isValid, resultHandler);
            }
        }

        public AsyncProcessor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends AsyncIface> Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> getProcessMap(Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> processMap) {
            processMap.put("get_vocab_init_info", new get_vocab_init_info());
            processMap.put("save_vocab_info", new save_vocab_info());
            processMap.put("save_vocab_info_v2", new save_vocab_info_v2());
            processMap.put("cancel_pi", new cancel_pi());
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

        @Override // com.baicizhan.online.bs_studys.BSStudys.Iface
        public void cancel_pi() throws BESystemException, BELogicException, TException {
            send_cancel_pi();
            recv_cancel_pi();
        }

        @Override // com.baicizhan.online.bs_studys.BSStudys.Iface
        public BBUserVocabInfo get_vocab_init_info() throws BESystemException, BELogicException, TException {
            send_get_vocab_init_info();
            return recv_get_vocab_init_info();
        }

        public void recv_cancel_pi() throws BESystemException, BELogicException, TException {
            cancel_pi_result cancel_pi_resultVar = new cancel_pi_result();
            receiveBase(cancel_pi_resultVar, "cancel_pi");
            BESystemException bESystemException = cancel_pi_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = cancel_pi_resultVar.logException;
            if (bELogicException != null) {
                throw bELogicException;
            }
        }

        public BBUserVocabInfo recv_get_vocab_init_info() throws BESystemException, BELogicException, TException {
            get_vocab_init_info_result get_vocab_init_info_resultVar = new get_vocab_init_info_result();
            receiveBase(get_vocab_init_info_resultVar, "get_vocab_init_info");
            if (get_vocab_init_info_resultVar.isSetSuccess()) {
                return get_vocab_init_info_resultVar.success;
            }
            BESystemException bESystemException = get_vocab_init_info_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = get_vocab_init_info_resultVar.logException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "get_vocab_init_info failed: unknown result");
        }

        public int recv_save_vocab_info() throws BESystemException, BELogicException, TException {
            save_vocab_info_result save_vocab_info_resultVar = new save_vocab_info_result();
            receiveBase(save_vocab_info_resultVar, "save_vocab_info");
            if (save_vocab_info_resultVar.isSetSuccess()) {
                return save_vocab_info_resultVar.success;
            }
            BESystemException bESystemException = save_vocab_info_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = save_vocab_info_resultVar.logException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "save_vocab_info failed: unknown result");
        }

        public int recv_save_vocab_info_v2() throws BESystemException, BELogicException, TException {
            save_vocab_info_v2_result save_vocab_info_v2_resultVar = new save_vocab_info_v2_result();
            receiveBase(save_vocab_info_v2_resultVar, "save_vocab_info_v2");
            if (save_vocab_info_v2_resultVar.isSetSuccess()) {
                return save_vocab_info_v2_resultVar.success;
            }
            BESystemException bESystemException = save_vocab_info_v2_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = save_vocab_info_v2_resultVar.logException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "save_vocab_info_v2 failed: unknown result");
        }

        @Override // com.baicizhan.online.bs_studys.BSStudys.Iface
        public int save_vocab_info(int count, int steps, String test_vocab_info, String test_vocab_count_range) throws BESystemException, BELogicException, TException {
            send_save_vocab_info(count, steps, test_vocab_info, test_vocab_count_range);
            return recv_save_vocab_info();
        }

        @Override // com.baicizhan.online.bs_studys.BSStudys.Iface
        public int save_vocab_info_v2(int count, int steps, String test_vocab_info, String test_vocab_count_range, boolean isValid) throws BESystemException, BELogicException, TException {
            send_save_vocab_info_v2(count, steps, test_vocab_info, test_vocab_count_range, isValid);
            return recv_save_vocab_info_v2();
        }

        public void send_cancel_pi() throws TException {
            sendBase("cancel_pi", new cancel_pi_args());
        }

        public void send_get_vocab_init_info() throws TException {
            sendBase("get_vocab_init_info", new get_vocab_init_info_args());
        }

        public void send_save_vocab_info(int count, int steps, String test_vocab_info, String test_vocab_count_range) throws TException {
            save_vocab_info_args save_vocab_info_argsVar = new save_vocab_info_args();
            save_vocab_info_argsVar.setCount(count);
            save_vocab_info_argsVar.setSteps(steps);
            save_vocab_info_argsVar.setTest_vocab_info(test_vocab_info);
            save_vocab_info_argsVar.setTest_vocab_count_range(test_vocab_count_range);
            sendBase("save_vocab_info", save_vocab_info_argsVar);
        }

        public void send_save_vocab_info_v2(int count, int steps, String test_vocab_info, String test_vocab_count_range, boolean isValid) throws TException {
            save_vocab_info_v2_args save_vocab_info_v2_argsVar = new save_vocab_info_v2_args();
            save_vocab_info_v2_argsVar.setCount(count);
            save_vocab_info_v2_argsVar.setSteps(steps);
            save_vocab_info_v2_argsVar.setTest_vocab_info(test_vocab_info);
            save_vocab_info_v2_argsVar.setTest_vocab_count_range(test_vocab_count_range);
            save_vocab_info_v2_argsVar.setIsValid(isValid);
            sendBase("save_vocab_info_v2", save_vocab_info_v2_argsVar);
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
        void cancel_pi() throws BESystemException, BELogicException, TException;

        BBUserVocabInfo get_vocab_init_info() throws BESystemException, BELogicException, TException;

        int save_vocab_info(int count, int steps, String test_vocab_info, String test_vocab_count_range) throws BESystemException, BELogicException, TException;

        int save_vocab_info_v2(int count, int steps, String test_vocab_info, String test_vocab_count_range, boolean isValid) throws BESystemException, BELogicException, TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Processor<I extends Iface> extends TBaseProcessor<I> implements TProcessor {
        private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class cancel_pi<I extends Iface> extends ProcessFunction<I, cancel_pi_args> {
            public cancel_pi() {
                super("cancel_pi");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public cancel_pi_args getEmptyArgsInstance() {
                return new cancel_pi_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public cancel_pi_result getResult(I iface, cancel_pi_args args) throws TException {
                cancel_pi_result cancel_pi_resultVar = new cancel_pi_result();
                try {
                    iface.cancel_pi();
                    return cancel_pi_resultVar;
                } catch (BELogicException e11) {
                    cancel_pi_resultVar.logException = e11;
                    return cancel_pi_resultVar;
                } catch (BESystemException e12) {
                    cancel_pi_resultVar.sysException = e12;
                    return cancel_pi_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_vocab_init_info<I extends Iface> extends ProcessFunction<I, get_vocab_init_info_args> {
            public get_vocab_init_info() {
                super("get_vocab_init_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_vocab_init_info_args getEmptyArgsInstance() {
                return new get_vocab_init_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_vocab_init_info_result getResult(I iface, get_vocab_init_info_args args) throws TException {
                get_vocab_init_info_result get_vocab_init_info_resultVar = new get_vocab_init_info_result();
                try {
                    get_vocab_init_info_resultVar.success = iface.get_vocab_init_info();
                    return get_vocab_init_info_resultVar;
                } catch (BELogicException e11) {
                    get_vocab_init_info_resultVar.logException = e11;
                    return get_vocab_init_info_resultVar;
                } catch (BESystemException e12) {
                    get_vocab_init_info_resultVar.sysException = e12;
                    return get_vocab_init_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info<I extends Iface> extends ProcessFunction<I, save_vocab_info_args> {
            public save_vocab_info() {
                super("save_vocab_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public save_vocab_info_args getEmptyArgsInstance() {
                return new save_vocab_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public save_vocab_info_result getResult(I iface, save_vocab_info_args args) throws TException {
                save_vocab_info_result save_vocab_info_resultVar = new save_vocab_info_result();
                try {
                    save_vocab_info_resultVar.success = iface.save_vocab_info(args.count, args.steps, args.test_vocab_info, args.test_vocab_count_range);
                    save_vocab_info_resultVar.setSuccessIsSet(true);
                    return save_vocab_info_resultVar;
                } catch (BELogicException e11) {
                    save_vocab_info_resultVar.logException = e11;
                    return save_vocab_info_resultVar;
                } catch (BESystemException e12) {
                    save_vocab_info_resultVar.sysException = e12;
                    return save_vocab_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info_v2<I extends Iface> extends ProcessFunction<I, save_vocab_info_v2_args> {
            public save_vocab_info_v2() {
                super("save_vocab_info_v2");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public save_vocab_info_v2_args getEmptyArgsInstance() {
                return new save_vocab_info_v2_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public save_vocab_info_v2_result getResult(I iface, save_vocab_info_v2_args args) throws TException {
                save_vocab_info_v2_result save_vocab_info_v2_resultVar = new save_vocab_info_v2_result();
                try {
                    save_vocab_info_v2_resultVar.success = iface.save_vocab_info_v2(args.count, args.steps, args.test_vocab_info, args.test_vocab_count_range, args.isValid);
                    save_vocab_info_v2_resultVar.setSuccessIsSet(true);
                    return save_vocab_info_v2_resultVar;
                } catch (BELogicException e11) {
                    save_vocab_info_v2_resultVar.logException = e11;
                    return save_vocab_info_v2_resultVar;
                } catch (BESystemException e12) {
                    save_vocab_info_v2_resultVar.sysException = e12;
                    return save_vocab_info_v2_resultVar;
                }
            }
        }

        public Processor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends Iface> Map<String, ProcessFunction<I, ? extends TBase>> getProcessMap(Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            processMap.put("get_vocab_init_info", new get_vocab_init_info());
            processMap.put("save_vocab_info", new save_vocab_info());
            processMap.put("save_vocab_info_v2", new save_vocab_info_v2());
            processMap.put("cancel_pi", new cancel_pi());
            return processMap;
        }

        public Processor(I iface, Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            super(iface, getProcessMap(processMap));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class cancel_pi_args implements TBase<cancel_pi_args, _Fields>, Serializable, Cloneable, Comparable<cancel_pi_args> {
        private static final TStruct STRUCT_DESC = new TStruct("cancel_pi_args");
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
        public static class cancel_pi_argsStandardScheme extends StandardScheme<cancel_pi_args> {
            private cancel_pi_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, cancel_pi_args struct) throws TException {
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
            public void write(TProtocol oprot, cancel_pi_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(cancel_pi_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class cancel_pi_argsStandardSchemeFactory implements SchemeFactory {
            private cancel_pi_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public cancel_pi_argsStandardScheme getScheme() {
                return new cancel_pi_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class cancel_pi_argsTupleScheme extends TupleScheme<cancel_pi_args> {
            private cancel_pi_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, cancel_pi_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, cancel_pi_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class cancel_pi_argsTupleSchemeFactory implements SchemeFactory {
            private cancel_pi_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public cancel_pi_argsTupleScheme getScheme() {
                return new cancel_pi_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new cancel_pi_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new cancel_pi_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(cancel_pi_args.class, unmodifiableMap);
        }

        public cancel_pi_args() {
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

        public boolean equals(cancel_pi_args that) {
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
            return "cancel_pi_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public cancel_pi_args(cancel_pi_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(cancel_pi_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<cancel_pi_args, _Fields> deepCopy2() {
            return new cancel_pi_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof cancel_pi_args)) {
                return equals((cancel_pi_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$cancel_pi_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$cancel_pi_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$cancel_pi_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class cancel_pi_result implements TBase<cancel_pi_result, _Fields>, Serializable, Cloneable, Comparable<cancel_pi_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logException;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("cancel_pi_result");
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOG_EXCEPTION_FIELD_DESC = new TField("logException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SYS_EXCEPTION(1, "sysException"),
            LOG_EXCEPTION(2, "logException");

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
                    return SYS_EXCEPTION;
                }
                if (fieldId != 2) {
                    return null;
                }
                return LOG_EXCEPTION;
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
        public static class cancel_pi_resultStandardScheme extends StandardScheme<cancel_pi_result> {
            private cancel_pi_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, cancel_pi_result struct) throws TException {
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
                            BELogicException bELogicException = new BELogicException();
                            struct.logException = bELogicException;
                            bELogicException.read(iprot);
                            struct.setLogExceptionIsSet(true);
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
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, cancel_pi_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(cancel_pi_result.STRUCT_DESC);
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(cancel_pi_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logException != null) {
                    oprot.writeFieldBegin(cancel_pi_result.LOG_EXCEPTION_FIELD_DESC);
                    struct.logException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class cancel_pi_resultStandardSchemeFactory implements SchemeFactory {
            private cancel_pi_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public cancel_pi_resultStandardScheme getScheme() {
                return new cancel_pi_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class cancel_pi_resultTupleScheme extends TupleScheme<cancel_pi_result> {
            private cancel_pi_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, cancel_pi_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(2);
                if (readBitSet.get(0)) {
                    BESystemException bESystemException = new BESystemException();
                    struct.sysException = bESystemException;
                    bESystemException.read(tTupleProtocol);
                    struct.setSysExceptionIsSet(true);
                }
                if (readBitSet.get(1)) {
                    BELogicException bELogicException = new BELogicException();
                    struct.logException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, cancel_pi_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSysException()) {
                    bitSet.set(0);
                }
                if (struct.isSetLogException()) {
                    bitSet.set(1);
                }
                tTupleProtocol.writeBitSet(bitSet, 2);
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogException()) {
                    struct.logException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class cancel_pi_resultTupleSchemeFactory implements SchemeFactory {
            private cancel_pi_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public cancel_pi_resultTupleScheme getScheme() {
                return new cancel_pi_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new cancel_pi_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new cancel_pi_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOG_EXCEPTION, (_Fields) new FieldMetaData("logException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(cancel_pi_result.class, unmodifiableMap);
        }

        public cancel_pi_result() {
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
            this.sysException = null;
            this.logException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof cancel_pi_result)) {
                return equals((cancel_pi_result) that);
            }
            return false;
        }

        public BELogicException getLogException() {
            return this.logException;
        }

        public BESystemException getSysException() {
            return this.sysException;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetLogException() {
            return this.logException != null;
        }

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public cancel_pi_result setLogException(BELogicException logException) {
            this.logException = logException;
            return this;
        }

        public void setLogExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logException = null;
        }

        public cancel_pi_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("cancel_pi_result(");
            sb2.append("sysException:");
            BESystemException bESystemException = this.sysException;
            if (bESystemException == null) {
                sb2.append("null");
            } else {
                sb2.append(bESystemException);
            }
            sb2.append(j2.O);
            sb2.append("logException:");
            BELogicException bELogicException = this.logException;
            if (bELogicException == null) {
                sb2.append("null");
            } else {
                sb2.append(bELogicException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetLogException() {
            this.logException = null;
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public cancel_pi_result(BESystemException sysException, BELogicException logException) {
            this();
            this.sysException = sysException;
            this.logException = logException;
        }

        @Override // java.lang.Comparable
        public int compareTo(cancel_pi_result other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetSysException()).compareTo(Boolean.valueOf(other.isSetSysException()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetSysException() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.sysException, (Comparable) other.sysException)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetLogException()).compareTo(Boolean.valueOf(other.isSetLogException()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetLogException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logException, (Comparable) other.logException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<cancel_pi_result, _Fields> deepCopy2() {
            return new cancel_pi_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$cancel_pi_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSysException();
            }
            if (i11 == 2) {
                return getLogException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$cancel_pi_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSysException();
            }
            if (i11 == 2) {
                return isSetLogException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$cancel_pi_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSysException();
                    return;
                } else {
                    setSysException((BESystemException) value);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetLogException();
            } else {
                setLogException((BELogicException) value);
            }
        }

        public boolean equals(cancel_pi_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if ((isSetSysException || isSetSysException2) && !(isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException))) {
                return false;
            }
            boolean isSetLogException = isSetLogException();
            boolean isSetLogException2 = that.isSetLogException();
            if (isSetLogException || isSetLogException2) {
                return isSetLogException && isSetLogException2 && this.logException.equals(that.logException);
            }
            return true;
        }

        public cancel_pi_result(cancel_pi_result other) {
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
            if (other.isSetLogException()) {
                this.logException = new BELogicException(other.logException);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_vocab_init_info_args implements TBase<get_vocab_init_info_args, _Fields>, Serializable, Cloneable, Comparable<get_vocab_init_info_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_vocab_init_info_args");
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
        public static class get_vocab_init_info_argsStandardScheme extends StandardScheme<get_vocab_init_info_args> {
            private get_vocab_init_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_vocab_init_info_args struct) throws TException {
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
            public void write(TProtocol oprot, get_vocab_init_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_vocab_init_info_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_vocab_init_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_vocab_init_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_vocab_init_info_argsStandardScheme getScheme() {
                return new get_vocab_init_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_vocab_init_info_argsTupleScheme extends TupleScheme<get_vocab_init_info_args> {
            private get_vocab_init_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_vocab_init_info_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_vocab_init_info_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_vocab_init_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_vocab_init_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_vocab_init_info_argsTupleScheme getScheme() {
                return new get_vocab_init_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_vocab_init_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_vocab_init_info_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_vocab_init_info_args.class, unmodifiableMap);
        }

        public get_vocab_init_info_args() {
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

        public boolean equals(get_vocab_init_info_args that) {
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
            return "get_vocab_init_info_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_vocab_init_info_args(get_vocab_init_info_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_vocab_init_info_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_vocab_init_info_args, _Fields> deepCopy2() {
            return new get_vocab_init_info_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_vocab_init_info_args)) {
                return equals((get_vocab_init_info_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$get_vocab_init_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$get_vocab_init_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$get_vocab_init_info_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_vocab_init_info_result implements TBase<get_vocab_init_info_result, _Fields>, Serializable, Cloneable, Comparable<get_vocab_init_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logException;
        public BBUserVocabInfo success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("get_vocab_init_info_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOG_EXCEPTION_FIELD_DESC = new TField("logException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            SYS_EXCEPTION(1, "sysException"),
            LOG_EXCEPTION(2, "logException");

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
                return LOG_EXCEPTION;
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
        public static class get_vocab_init_info_resultStandardScheme extends StandardScheme<get_vocab_init_info_result> {
            private get_vocab_init_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_vocab_init_info_result struct) throws TException {
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
                                struct.logException = bELogicException;
                                bELogicException.read(iprot);
                                struct.setLogExceptionIsSet(true);
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
                        BBUserVocabInfo bBUserVocabInfo = new BBUserVocabInfo();
                        struct.success = bBUserVocabInfo;
                        bBUserVocabInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_vocab_init_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_vocab_init_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_vocab_init_info_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(get_vocab_init_info_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logException != null) {
                    oprot.writeFieldBegin(get_vocab_init_info_result.LOG_EXCEPTION_FIELD_DESC);
                    struct.logException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_vocab_init_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_vocab_init_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_vocab_init_info_resultStandardScheme getScheme() {
                return new get_vocab_init_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_vocab_init_info_resultTupleScheme extends TupleScheme<get_vocab_init_info_result> {
            private get_vocab_init_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_vocab_init_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    BBUserVocabInfo bBUserVocabInfo = new BBUserVocabInfo();
                    struct.success = bBUserVocabInfo;
                    bBUserVocabInfo.read(tTupleProtocol);
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
                    struct.logException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_vocab_init_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetSysException()) {
                    bitSet.set(1);
                }
                if (struct.isSetLogException()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogException()) {
                    struct.logException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_vocab_init_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_vocab_init_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_vocab_init_info_resultTupleScheme getScheme() {
                return new get_vocab_init_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_vocab_init_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_vocab_init_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, BBUserVocabInfo.class)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOG_EXCEPTION, (_Fields) new FieldMetaData("logException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_vocab_init_info_result.class, unmodifiableMap);
        }

        public get_vocab_init_info_result() {
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
            this.logException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_vocab_init_info_result)) {
                return equals((get_vocab_init_info_result) that);
            }
            return false;
        }

        public BELogicException getLogException() {
            return this.logException;
        }

        public BBUserVocabInfo getSuccess() {
            return this.success;
        }

        public BESystemException getSysException() {
            return this.sysException;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetLogException() {
            return this.logException != null;
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

        public get_vocab_init_info_result setLogException(BELogicException logException) {
            this.logException = logException;
            return this;
        }

        public void setLogExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logException = null;
        }

        public get_vocab_init_info_result setSuccess(BBUserVocabInfo success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public get_vocab_init_info_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("get_vocab_init_info_result(");
            sb2.append("success:");
            BBUserVocabInfo bBUserVocabInfo = this.success;
            if (bBUserVocabInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBUserVocabInfo);
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
            sb2.append("logException:");
            BELogicException bELogicException = this.logException;
            if (bELogicException == null) {
                sb2.append("null");
            } else {
                sb2.append(bELogicException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetLogException() {
            this.logException = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        public void validate() throws TException {
            BBUserVocabInfo bBUserVocabInfo = this.success;
            if (bBUserVocabInfo != null) {
                bBUserVocabInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_vocab_init_info_result(BBUserVocabInfo success, BESystemException sysException, BELogicException logException) {
            this();
            this.success = success;
            this.sysException = sysException;
            this.logException = logException;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_vocab_init_info_result other) {
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
            int compareTo6 = Boolean.valueOf(isSetLogException()).compareTo(Boolean.valueOf(other.isSetLogException()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetLogException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logException, (Comparable) other.logException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_vocab_init_info_result, _Fields> deepCopy2() {
            return new get_vocab_init_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$get_vocab_init_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getSysException();
            }
            if (i11 == 3) {
                return getLogException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$get_vocab_init_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetSysException();
            }
            if (i11 == 3) {
                return isSetLogException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$get_vocab_init_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((BBUserVocabInfo) value);
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
                unsetLogException();
            } else {
                setLogException((BELogicException) value);
            }
        }

        public boolean equals(get_vocab_init_info_result that) {
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
            boolean isSetLogException = isSetLogException();
            boolean isSetLogException2 = that.isSetLogException();
            if (isSetLogException || isSetLogException2) {
                return isSetLogException && isSetLogException2 && this.logException.equals(that.logException);
            }
            return true;
        }

        public get_vocab_init_info_result(get_vocab_init_info_result other) {
            if (other.isSetSuccess()) {
                this.success = new BBUserVocabInfo(other.success);
            }
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
            if (other.isSetLogException()) {
                this.logException = new BELogicException(other.logException);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class save_vocab_info_args implements TBase<save_vocab_info_args, _Fields>, Serializable, Cloneable, Comparable<save_vocab_info_args> {
        private static final int __COUNT_ISSET_ID = 0;
        private static final int __STEPS_ISSET_ID = 1;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int count;
        public int steps;
        public String test_vocab_count_range;
        public String test_vocab_info;
        private static final TStruct STRUCT_DESC = new TStruct("save_vocab_info_args");
        private static final TField COUNT_FIELD_DESC = new TField("count", (byte) 8, 1);
        private static final TField STEPS_FIELD_DESC = new TField("steps", (byte) 8, 2);
        private static final TField TEST_VOCAB_INFO_FIELD_DESC = new TField("test_vocab_info", (byte) 11, 3);
        private static final TField TEST_VOCAB_COUNT_RANGE_FIELD_DESC = new TField("test_vocab_count_range", (byte) 11, 4);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            COUNT(1, "count"),
            STEPS(2, "steps"),
            TEST_VOCAB_INFO(3, "test_vocab_info"),
            TEST_VOCAB_COUNT_RANGE(4, "test_vocab_count_range");

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
                    return COUNT;
                }
                if (fieldId == 2) {
                    return STEPS;
                }
                if (fieldId == 3) {
                    return TEST_VOCAB_INFO;
                }
                if (fieldId != 4) {
                    return null;
                }
                return TEST_VOCAB_COUNT_RANGE;
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
        public static class save_vocab_info_argsStandardScheme extends StandardScheme<save_vocab_info_args> {
            private save_vocab_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, save_vocab_info_args struct) throws TException {
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
                                if (s11 != 4) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 11) {
                                    struct.test_vocab_count_range = iprot.readString();
                                    struct.setTest_vocab_count_rangeIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 11) {
                                struct.test_vocab_info = iprot.readString();
                                struct.setTest_vocab_infoIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.steps = iprot.readI32();
                            struct.setStepsIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.count = iprot.readI32();
                        struct.setCountIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (!struct.isSetCount()) {
                    throw new TProtocolException("Required field 'count' was not found in serialized data! Struct: " + toString());
                }
                if (struct.isSetSteps()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'steps' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, save_vocab_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(save_vocab_info_args.STRUCT_DESC);
                oprot.writeFieldBegin(save_vocab_info_args.COUNT_FIELD_DESC);
                oprot.writeI32(struct.count);
                oprot.writeFieldEnd();
                oprot.writeFieldBegin(save_vocab_info_args.STEPS_FIELD_DESC);
                oprot.writeI32(struct.steps);
                oprot.writeFieldEnd();
                if (struct.test_vocab_info != null) {
                    oprot.writeFieldBegin(save_vocab_info_args.TEST_VOCAB_INFO_FIELD_DESC);
                    oprot.writeString(struct.test_vocab_info);
                    oprot.writeFieldEnd();
                }
                if (struct.test_vocab_count_range != null) {
                    oprot.writeFieldBegin(save_vocab_info_args.TEST_VOCAB_COUNT_RANGE_FIELD_DESC);
                    oprot.writeString(struct.test_vocab_count_range);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info_argsStandardSchemeFactory implements SchemeFactory {
            private save_vocab_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public save_vocab_info_argsStandardScheme getScheme() {
                return new save_vocab_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info_argsTupleScheme extends TupleScheme<save_vocab_info_args> {
            private save_vocab_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, save_vocab_info_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.count = tTupleProtocol.readI32();
                struct.setCountIsSet(true);
                struct.steps = tTupleProtocol.readI32();
                struct.setStepsIsSet(true);
                struct.test_vocab_info = tTupleProtocol.readString();
                struct.setTest_vocab_infoIsSet(true);
                struct.test_vocab_count_range = tTupleProtocol.readString();
                struct.setTest_vocab_count_rangeIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, save_vocab_info_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.count);
                tTupleProtocol.writeI32(struct.steps);
                tTupleProtocol.writeString(struct.test_vocab_info);
                tTupleProtocol.writeString(struct.test_vocab_count_range);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info_argsTupleSchemeFactory implements SchemeFactory {
            private save_vocab_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public save_vocab_info_argsTupleScheme getScheme() {
                return new save_vocab_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new save_vocab_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new save_vocab_info_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.COUNT, (_Fields) new FieldMetaData("count", (byte) 1, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.STEPS, (_Fields) new FieldMetaData("steps", (byte) 1, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.TEST_VOCAB_INFO, (_Fields) new FieldMetaData("test_vocab_info", (byte) 1, new FieldValueMetaData((byte) 11)));
            enumMap.put((EnumMap) _Fields.TEST_VOCAB_COUNT_RANGE, (_Fields) new FieldMetaData("test_vocab_count_range", (byte) 1, new FieldValueMetaData((byte) 11)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(save_vocab_info_args.class, unmodifiableMap);
        }

        public save_vocab_info_args() {
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
            setCountIsSet(false);
            this.count = 0;
            setStepsIsSet(false);
            this.steps = 0;
            this.test_vocab_info = null;
            this.test_vocab_count_range = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof save_vocab_info_args)) {
                return equals((save_vocab_info_args) that);
            }
            return false;
        }

        public int getCount() {
            return this.count;
        }

        public int getSteps() {
            return this.steps;
        }

        public String getTest_vocab_count_range() {
            return this.test_vocab_count_range;
        }

        public String getTest_vocab_info() {
            return this.test_vocab_info;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetCount() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        public boolean isSetSteps() {
            return EncodingUtils.testBit(this.__isset_bitfield, 1);
        }

        public boolean isSetTest_vocab_count_range() {
            return this.test_vocab_count_range != null;
        }

        public boolean isSetTest_vocab_info() {
            return this.test_vocab_info != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public save_vocab_info_args setCount(int count) {
            this.count = count;
            setCountIsSet(true);
            return this;
        }

        public void setCountIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public save_vocab_info_args setSteps(int steps) {
            this.steps = steps;
            setStepsIsSet(true);
            return this;
        }

        public void setStepsIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
        }

        public save_vocab_info_args setTest_vocab_count_range(String test_vocab_count_range) {
            this.test_vocab_count_range = test_vocab_count_range;
            return this;
        }

        public void setTest_vocab_count_rangeIsSet(boolean value) {
            if (value) {
                return;
            }
            this.test_vocab_count_range = null;
        }

        public save_vocab_info_args setTest_vocab_info(String test_vocab_info) {
            this.test_vocab_info = test_vocab_info;
            return this;
        }

        public void setTest_vocab_infoIsSet(boolean value) {
            if (value) {
                return;
            }
            this.test_vocab_info = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("save_vocab_info_args(");
            sb2.append("count:");
            sb2.append(this.count);
            sb2.append(j2.O);
            sb2.append("steps:");
            sb2.append(this.steps);
            sb2.append(j2.O);
            sb2.append("test_vocab_info:");
            String str = this.test_vocab_info;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j2.O);
            sb2.append("test_vocab_count_range:");
            String str2 = this.test_vocab_count_range;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetCount() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        public void unsetSteps() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
        }

        public void unsetTest_vocab_count_range() {
            this.test_vocab_count_range = null;
        }

        public void unsetTest_vocab_info() {
            this.test_vocab_info = null;
        }

        public void validate() throws TException {
            if (this.test_vocab_info == null) {
                throw new TProtocolException("Required field 'test_vocab_info' was not present! Struct: " + toString());
            }
            if (this.test_vocab_count_range != null) {
                return;
            }
            throw new TProtocolException("Required field 'test_vocab_count_range' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(save_vocab_info_args other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            int compareTo4;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo5 = Boolean.valueOf(isSetCount()).compareTo(Boolean.valueOf(other.isSetCount()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetCount() && (compareTo4 = TBaseHelper.compareTo(this.count, other.count)) != 0) {
                return compareTo4;
            }
            int compareTo6 = Boolean.valueOf(isSetSteps()).compareTo(Boolean.valueOf(other.isSetSteps()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (isSetSteps() && (compareTo3 = TBaseHelper.compareTo(this.steps, other.steps)) != 0) {
                return compareTo3;
            }
            int compareTo7 = Boolean.valueOf(isSetTest_vocab_info()).compareTo(Boolean.valueOf(other.isSetTest_vocab_info()));
            if (compareTo7 != 0) {
                return compareTo7;
            }
            if (isSetTest_vocab_info() && (compareTo2 = TBaseHelper.compareTo(this.test_vocab_info, other.test_vocab_info)) != 0) {
                return compareTo2;
            }
            int compareTo8 = Boolean.valueOf(isSetTest_vocab_count_range()).compareTo(Boolean.valueOf(other.isSetTest_vocab_count_range()));
            if (compareTo8 != 0) {
                return compareTo8;
            }
            if (!isSetTest_vocab_count_range() || (compareTo = TBaseHelper.compareTo(this.test_vocab_count_range, other.test_vocab_count_range)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<save_vocab_info_args, _Fields> deepCopy2() {
            return new save_vocab_info_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getCount());
            }
            if (i11 == 2) {
                return Integer.valueOf(getSteps());
            }
            if (i11 == 3) {
                return getTest_vocab_info();
            }
            if (i11 == 4) {
                return getTest_vocab_count_range();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetCount();
            }
            if (i11 == 2) {
                return isSetSteps();
            }
            if (i11 == 3) {
                return isSetTest_vocab_info();
            }
            if (i11 == 4) {
                return isSetTest_vocab_count_range();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetCount();
                    return;
                } else {
                    setCount(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetSteps();
                    return;
                } else {
                    setSteps(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 == 3) {
                if (value == null) {
                    unsetTest_vocab_info();
                    return;
                } else {
                    setTest_vocab_info((String) value);
                    return;
                }
            }
            if (i11 != 4) {
                return;
            }
            if (value == null) {
                unsetTest_vocab_count_range();
            } else {
                setTest_vocab_count_range((String) value);
            }
        }

        public save_vocab_info_args(int count, int steps, String test_vocab_info, String test_vocab_count_range) {
            this();
            this.count = count;
            setCountIsSet(true);
            this.steps = steps;
            setStepsIsSet(true);
            this.test_vocab_info = test_vocab_info;
            this.test_vocab_count_range = test_vocab_count_range;
        }

        public boolean equals(save_vocab_info_args that) {
            if (that == null || this.count != that.count || this.steps != that.steps) {
                return false;
            }
            boolean isSetTest_vocab_info = isSetTest_vocab_info();
            boolean isSetTest_vocab_info2 = that.isSetTest_vocab_info();
            if ((isSetTest_vocab_info || isSetTest_vocab_info2) && !(isSetTest_vocab_info && isSetTest_vocab_info2 && this.test_vocab_info.equals(that.test_vocab_info))) {
                return false;
            }
            boolean isSetTest_vocab_count_range = isSetTest_vocab_count_range();
            boolean isSetTest_vocab_count_range2 = that.isSetTest_vocab_count_range();
            if (isSetTest_vocab_count_range || isSetTest_vocab_count_range2) {
                return isSetTest_vocab_count_range && isSetTest_vocab_count_range2 && this.test_vocab_count_range.equals(that.test_vocab_count_range);
            }
            return true;
        }

        public save_vocab_info_args(save_vocab_info_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.count = other.count;
            this.steps = other.steps;
            if (other.isSetTest_vocab_info()) {
                this.test_vocab_info = other.test_vocab_info;
            }
            if (other.isSetTest_vocab_count_range()) {
                this.test_vocab_count_range = other.test_vocab_count_range;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class save_vocab_info_result implements TBase<save_vocab_info_result, _Fields>, Serializable, Cloneable, Comparable<save_vocab_info_result> {
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public BELogicException logException;
        public int success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("save_vocab_info_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 8, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOG_EXCEPTION_FIELD_DESC = new TField("logException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            SYS_EXCEPTION(1, "sysException"),
            LOG_EXCEPTION(2, "logException");

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
                return LOG_EXCEPTION;
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
        public static class save_vocab_info_resultStandardScheme extends StandardScheme<save_vocab_info_result> {
            private save_vocab_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, save_vocab_info_result struct) throws TException {
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
                                struct.logException = bELogicException;
                                bELogicException.read(iprot);
                                struct.setLogExceptionIsSet(true);
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
            public void write(TProtocol oprot, save_vocab_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(save_vocab_info_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(save_vocab_info_result.SUCCESS_FIELD_DESC);
                    oprot.writeI32(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(save_vocab_info_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logException != null) {
                    oprot.writeFieldBegin(save_vocab_info_result.LOG_EXCEPTION_FIELD_DESC);
                    struct.logException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info_resultStandardSchemeFactory implements SchemeFactory {
            private save_vocab_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public save_vocab_info_resultStandardScheme getScheme() {
                return new save_vocab_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info_resultTupleScheme extends TupleScheme<save_vocab_info_result> {
            private save_vocab_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, save_vocab_info_result struct) throws TException {
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
                    struct.logException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, save_vocab_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetSysException()) {
                    bitSet.set(1);
                }
                if (struct.isSetLogException()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success);
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogException()) {
                    struct.logException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info_resultTupleSchemeFactory implements SchemeFactory {
            private save_vocab_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public save_vocab_info_resultTupleScheme getScheme() {
                return new save_vocab_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new save_vocab_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new save_vocab_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOG_EXCEPTION, (_Fields) new FieldMetaData("logException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(save_vocab_info_result.class, unmodifiableMap);
        }

        public save_vocab_info_result() {
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
            this.logException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof save_vocab_info_result)) {
                return equals((save_vocab_info_result) that);
            }
            return false;
        }

        public BELogicException getLogException() {
            return this.logException;
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

        public boolean isSetLogException() {
            return this.logException != null;
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

        public save_vocab_info_result setLogException(BELogicException logException) {
            this.logException = logException;
            return this;
        }

        public void setLogExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logException = null;
        }

        public save_vocab_info_result setSuccess(int success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public save_vocab_info_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("save_vocab_info_result(");
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
            sb2.append("logException:");
            BELogicException bELogicException = this.logException;
            if (bELogicException == null) {
                sb2.append("null");
            } else {
                sb2.append(bELogicException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetLogException() {
            this.logException = null;
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
        public int compareTo(save_vocab_info_result other) {
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
            int compareTo6 = Boolean.valueOf(isSetLogException()).compareTo(Boolean.valueOf(other.isSetLogException()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetLogException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logException, (Comparable) other.logException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<save_vocab_info_result, _Fields> deepCopy2() {
            return new save_vocab_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getSuccess());
            }
            if (i11 == 2) {
                return getSysException();
            }
            if (i11 == 3) {
                return getLogException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetSysException();
            }
            if (i11 == 3) {
                return isSetLogException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_result$_Fields[field.ordinal()];
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
                unsetLogException();
            } else {
                setLogException((BELogicException) value);
            }
        }

        public save_vocab_info_result(int success, BESystemException sysException, BELogicException logException) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.sysException = sysException;
            this.logException = logException;
        }

        public boolean equals(save_vocab_info_result that) {
            if (that == null || this.success != that.success) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if ((isSetSysException || isSetSysException2) && !(isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException))) {
                return false;
            }
            boolean isSetLogException = isSetLogException();
            boolean isSetLogException2 = that.isSetLogException();
            if (isSetLogException || isSetLogException2) {
                return isSetLogException && isSetLogException2 && this.logException.equals(that.logException);
            }
            return true;
        }

        public save_vocab_info_result(save_vocab_info_result other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.success = other.success;
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
            if (other.isSetLogException()) {
                this.logException = new BELogicException(other.logException);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class save_vocab_info_v2_args implements TBase<save_vocab_info_v2_args, _Fields>, Serializable, Cloneable, Comparable<save_vocab_info_v2_args> {
        private static final int __COUNT_ISSET_ID = 0;
        private static final int __ISVALID_ISSET_ID = 2;
        private static final int __STEPS_ISSET_ID = 1;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int count;
        public boolean isValid;
        public int steps;
        public String test_vocab_count_range;
        public String test_vocab_info;
        private static final TStruct STRUCT_DESC = new TStruct("save_vocab_info_v2_args");
        private static final TField COUNT_FIELD_DESC = new TField("count", (byte) 8, 1);
        private static final TField STEPS_FIELD_DESC = new TField("steps", (byte) 8, 2);
        private static final TField TEST_VOCAB_INFO_FIELD_DESC = new TField("test_vocab_info", (byte) 11, 3);
        private static final TField TEST_VOCAB_COUNT_RANGE_FIELD_DESC = new TField("test_vocab_count_range", (byte) 11, 4);
        private static final TField IS_VALID_FIELD_DESC = new TField("isValid", (byte) 2, 5);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            COUNT(1, "count"),
            STEPS(2, "steps"),
            TEST_VOCAB_INFO(3, "test_vocab_info"),
            TEST_VOCAB_COUNT_RANGE(4, "test_vocab_count_range"),
            IS_VALID(5, "isValid");

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
                    return COUNT;
                }
                if (fieldId == 2) {
                    return STEPS;
                }
                if (fieldId == 3) {
                    return TEST_VOCAB_INFO;
                }
                if (fieldId == 4) {
                    return TEST_VOCAB_COUNT_RANGE;
                }
                if (fieldId != 5) {
                    return null;
                }
                return IS_VALID;
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
        public static class save_vocab_info_v2_argsStandardScheme extends StandardScheme<save_vocab_info_v2_args> {
            private save_vocab_info_v2_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, save_vocab_info_v2_args struct) throws TException {
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
                                if (s11 != 4) {
                                    if (s11 != 5) {
                                        TProtocolUtil.skip(iprot, b11);
                                    } else if (b11 == 2) {
                                        struct.isValid = iprot.readBool();
                                        struct.setIsValidIsSet(true);
                                    } else {
                                        TProtocolUtil.skip(iprot, b11);
                                    }
                                } else if (b11 == 11) {
                                    struct.test_vocab_count_range = iprot.readString();
                                    struct.setTest_vocab_count_rangeIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 11) {
                                struct.test_vocab_info = iprot.readString();
                                struct.setTest_vocab_infoIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.steps = iprot.readI32();
                            struct.setStepsIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.count = iprot.readI32();
                        struct.setCountIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (!struct.isSetCount()) {
                    throw new TProtocolException("Required field 'count' was not found in serialized data! Struct: " + toString());
                }
                if (!struct.isSetSteps()) {
                    throw new TProtocolException("Required field 'steps' was not found in serialized data! Struct: " + toString());
                }
                if (struct.isSetIsValid()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'isValid' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, save_vocab_info_v2_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(save_vocab_info_v2_args.STRUCT_DESC);
                oprot.writeFieldBegin(save_vocab_info_v2_args.COUNT_FIELD_DESC);
                oprot.writeI32(struct.count);
                oprot.writeFieldEnd();
                oprot.writeFieldBegin(save_vocab_info_v2_args.STEPS_FIELD_DESC);
                oprot.writeI32(struct.steps);
                oprot.writeFieldEnd();
                if (struct.test_vocab_info != null) {
                    oprot.writeFieldBegin(save_vocab_info_v2_args.TEST_VOCAB_INFO_FIELD_DESC);
                    oprot.writeString(struct.test_vocab_info);
                    oprot.writeFieldEnd();
                }
                if (struct.test_vocab_count_range != null) {
                    oprot.writeFieldBegin(save_vocab_info_v2_args.TEST_VOCAB_COUNT_RANGE_FIELD_DESC);
                    oprot.writeString(struct.test_vocab_count_range);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldBegin(save_vocab_info_v2_args.IS_VALID_FIELD_DESC);
                oprot.writeBool(struct.isValid);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info_v2_argsStandardSchemeFactory implements SchemeFactory {
            private save_vocab_info_v2_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public save_vocab_info_v2_argsStandardScheme getScheme() {
                return new save_vocab_info_v2_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info_v2_argsTupleScheme extends TupleScheme<save_vocab_info_v2_args> {
            private save_vocab_info_v2_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, save_vocab_info_v2_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.count = tTupleProtocol.readI32();
                struct.setCountIsSet(true);
                struct.steps = tTupleProtocol.readI32();
                struct.setStepsIsSet(true);
                struct.test_vocab_info = tTupleProtocol.readString();
                struct.setTest_vocab_infoIsSet(true);
                struct.test_vocab_count_range = tTupleProtocol.readString();
                struct.setTest_vocab_count_rangeIsSet(true);
                struct.isValid = tTupleProtocol.readBool();
                struct.setIsValidIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, save_vocab_info_v2_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.count);
                tTupleProtocol.writeI32(struct.steps);
                tTupleProtocol.writeString(struct.test_vocab_info);
                tTupleProtocol.writeString(struct.test_vocab_count_range);
                tTupleProtocol.writeBool(struct.isValid);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info_v2_argsTupleSchemeFactory implements SchemeFactory {
            private save_vocab_info_v2_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public save_vocab_info_v2_argsTupleScheme getScheme() {
                return new save_vocab_info_v2_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new save_vocab_info_v2_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new save_vocab_info_v2_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.COUNT, (_Fields) new FieldMetaData("count", (byte) 1, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.STEPS, (_Fields) new FieldMetaData("steps", (byte) 1, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.TEST_VOCAB_INFO, (_Fields) new FieldMetaData("test_vocab_info", (byte) 1, new FieldValueMetaData((byte) 11)));
            enumMap.put((EnumMap) _Fields.TEST_VOCAB_COUNT_RANGE, (_Fields) new FieldMetaData("test_vocab_count_range", (byte) 1, new FieldValueMetaData((byte) 11)));
            enumMap.put((EnumMap) _Fields.IS_VALID, (_Fields) new FieldMetaData("isValid", (byte) 1, new FieldValueMetaData((byte) 2)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(save_vocab_info_v2_args.class, unmodifiableMap);
        }

        public save_vocab_info_v2_args() {
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
            setCountIsSet(false);
            this.count = 0;
            setStepsIsSet(false);
            this.steps = 0;
            this.test_vocab_info = null;
            this.test_vocab_count_range = null;
            setIsValidIsSet(false);
            this.isValid = false;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof save_vocab_info_v2_args)) {
                return equals((save_vocab_info_v2_args) that);
            }
            return false;
        }

        public int getCount() {
            return this.count;
        }

        public int getSteps() {
            return this.steps;
        }

        public String getTest_vocab_count_range() {
            return this.test_vocab_count_range;
        }

        public String getTest_vocab_info() {
            return this.test_vocab_info;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isIsValid() {
            return this.isValid;
        }

        public boolean isSetCount() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        public boolean isSetIsValid() {
            return EncodingUtils.testBit(this.__isset_bitfield, 2);
        }

        public boolean isSetSteps() {
            return EncodingUtils.testBit(this.__isset_bitfield, 1);
        }

        public boolean isSetTest_vocab_count_range() {
            return this.test_vocab_count_range != null;
        }

        public boolean isSetTest_vocab_info() {
            return this.test_vocab_info != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public save_vocab_info_v2_args setCount(int count) {
            this.count = count;
            setCountIsSet(true);
            return this;
        }

        public void setCountIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public save_vocab_info_v2_args setIsValid(boolean isValid) {
            this.isValid = isValid;
            setIsValidIsSet(true);
            return this;
        }

        public void setIsValidIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
        }

        public save_vocab_info_v2_args setSteps(int steps) {
            this.steps = steps;
            setStepsIsSet(true);
            return this;
        }

        public void setStepsIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
        }

        public save_vocab_info_v2_args setTest_vocab_count_range(String test_vocab_count_range) {
            this.test_vocab_count_range = test_vocab_count_range;
            return this;
        }

        public void setTest_vocab_count_rangeIsSet(boolean value) {
            if (value) {
                return;
            }
            this.test_vocab_count_range = null;
        }

        public save_vocab_info_v2_args setTest_vocab_info(String test_vocab_info) {
            this.test_vocab_info = test_vocab_info;
            return this;
        }

        public void setTest_vocab_infoIsSet(boolean value) {
            if (value) {
                return;
            }
            this.test_vocab_info = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("save_vocab_info_v2_args(");
            sb2.append("count:");
            sb2.append(this.count);
            sb2.append(j2.O);
            sb2.append("steps:");
            sb2.append(this.steps);
            sb2.append(j2.O);
            sb2.append("test_vocab_info:");
            String str = this.test_vocab_info;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j2.O);
            sb2.append("test_vocab_count_range:");
            String str2 = this.test_vocab_count_range;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
            sb2.append(j2.O);
            sb2.append("isValid:");
            sb2.append(this.isValid);
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetCount() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        public void unsetIsValid() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
        }

        public void unsetSteps() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
        }

        public void unsetTest_vocab_count_range() {
            this.test_vocab_count_range = null;
        }

        public void unsetTest_vocab_info() {
            this.test_vocab_info = null;
        }

        public void validate() throws TException {
            if (this.test_vocab_info == null) {
                throw new TProtocolException("Required field 'test_vocab_info' was not present! Struct: " + toString());
            }
            if (this.test_vocab_count_range != null) {
                return;
            }
            throw new TProtocolException("Required field 'test_vocab_count_range' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(save_vocab_info_v2_args other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            int compareTo4;
            int compareTo5;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo6 = Boolean.valueOf(isSetCount()).compareTo(Boolean.valueOf(other.isSetCount()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (isSetCount() && (compareTo5 = TBaseHelper.compareTo(this.count, other.count)) != 0) {
                return compareTo5;
            }
            int compareTo7 = Boolean.valueOf(isSetSteps()).compareTo(Boolean.valueOf(other.isSetSteps()));
            if (compareTo7 != 0) {
                return compareTo7;
            }
            if (isSetSteps() && (compareTo4 = TBaseHelper.compareTo(this.steps, other.steps)) != 0) {
                return compareTo4;
            }
            int compareTo8 = Boolean.valueOf(isSetTest_vocab_info()).compareTo(Boolean.valueOf(other.isSetTest_vocab_info()));
            if (compareTo8 != 0) {
                return compareTo8;
            }
            if (isSetTest_vocab_info() && (compareTo3 = TBaseHelper.compareTo(this.test_vocab_info, other.test_vocab_info)) != 0) {
                return compareTo3;
            }
            int compareTo9 = Boolean.valueOf(isSetTest_vocab_count_range()).compareTo(Boolean.valueOf(other.isSetTest_vocab_count_range()));
            if (compareTo9 != 0) {
                return compareTo9;
            }
            if (isSetTest_vocab_count_range() && (compareTo2 = TBaseHelper.compareTo(this.test_vocab_count_range, other.test_vocab_count_range)) != 0) {
                return compareTo2;
            }
            int compareTo10 = Boolean.valueOf(isSetIsValid()).compareTo(Boolean.valueOf(other.isSetIsValid()));
            if (compareTo10 != 0) {
                return compareTo10;
            }
            if (!isSetIsValid() || (compareTo = TBaseHelper.compareTo(this.isValid, other.isValid)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<save_vocab_info_v2_args, _Fields> deepCopy2() {
            return new save_vocab_info_v2_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_v2_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getCount());
            }
            if (i11 == 2) {
                return Integer.valueOf(getSteps());
            }
            if (i11 == 3) {
                return getTest_vocab_info();
            }
            if (i11 == 4) {
                return getTest_vocab_count_range();
            }
            if (i11 == 5) {
                return Boolean.valueOf(isIsValid());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_v2_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetCount();
            }
            if (i11 == 2) {
                return isSetSteps();
            }
            if (i11 == 3) {
                return isSetTest_vocab_info();
            }
            if (i11 == 4) {
                return isSetTest_vocab_count_range();
            }
            if (i11 == 5) {
                return isSetIsValid();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_v2_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetCount();
                    return;
                } else {
                    setCount(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetSteps();
                    return;
                } else {
                    setSteps(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 == 3) {
                if (value == null) {
                    unsetTest_vocab_info();
                    return;
                } else {
                    setTest_vocab_info((String) value);
                    return;
                }
            }
            if (i11 == 4) {
                if (value == null) {
                    unsetTest_vocab_count_range();
                    return;
                } else {
                    setTest_vocab_count_range((String) value);
                    return;
                }
            }
            if (i11 != 5) {
                return;
            }
            if (value == null) {
                unsetIsValid();
            } else {
                setIsValid(((Boolean) value).booleanValue());
            }
        }

        public save_vocab_info_v2_args(int count, int steps, String test_vocab_info, String test_vocab_count_range, boolean isValid) {
            this();
            this.count = count;
            setCountIsSet(true);
            this.steps = steps;
            setStepsIsSet(true);
            this.test_vocab_info = test_vocab_info;
            this.test_vocab_count_range = test_vocab_count_range;
            this.isValid = isValid;
            setIsValidIsSet(true);
        }

        public boolean equals(save_vocab_info_v2_args that) {
            if (that == null || this.count != that.count || this.steps != that.steps) {
                return false;
            }
            boolean isSetTest_vocab_info = isSetTest_vocab_info();
            boolean isSetTest_vocab_info2 = that.isSetTest_vocab_info();
            if ((isSetTest_vocab_info || isSetTest_vocab_info2) && !(isSetTest_vocab_info && isSetTest_vocab_info2 && this.test_vocab_info.equals(that.test_vocab_info))) {
                return false;
            }
            boolean isSetTest_vocab_count_range = isSetTest_vocab_count_range();
            boolean isSetTest_vocab_count_range2 = that.isSetTest_vocab_count_range();
            return (!(isSetTest_vocab_count_range || isSetTest_vocab_count_range2) || (isSetTest_vocab_count_range && isSetTest_vocab_count_range2 && this.test_vocab_count_range.equals(that.test_vocab_count_range))) && this.isValid == that.isValid;
        }

        public save_vocab_info_v2_args(save_vocab_info_v2_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.count = other.count;
            this.steps = other.steps;
            if (other.isSetTest_vocab_info()) {
                this.test_vocab_info = other.test_vocab_info;
            }
            if (other.isSetTest_vocab_count_range()) {
                this.test_vocab_count_range = other.test_vocab_count_range;
            }
            this.isValid = other.isValid;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class save_vocab_info_v2_result implements TBase<save_vocab_info_v2_result, _Fields>, Serializable, Cloneable, Comparable<save_vocab_info_v2_result> {
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public BELogicException logException;
        public int success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("save_vocab_info_v2_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 8, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOG_EXCEPTION_FIELD_DESC = new TField("logException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            SYS_EXCEPTION(1, "sysException"),
            LOG_EXCEPTION(2, "logException");

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
                return LOG_EXCEPTION;
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
        public static class save_vocab_info_v2_resultStandardScheme extends StandardScheme<save_vocab_info_v2_result> {
            private save_vocab_info_v2_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, save_vocab_info_v2_result struct) throws TException {
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
                                struct.logException = bELogicException;
                                bELogicException.read(iprot);
                                struct.setLogExceptionIsSet(true);
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
            public void write(TProtocol oprot, save_vocab_info_v2_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(save_vocab_info_v2_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(save_vocab_info_v2_result.SUCCESS_FIELD_DESC);
                    oprot.writeI32(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(save_vocab_info_v2_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logException != null) {
                    oprot.writeFieldBegin(save_vocab_info_v2_result.LOG_EXCEPTION_FIELD_DESC);
                    struct.logException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info_v2_resultStandardSchemeFactory implements SchemeFactory {
            private save_vocab_info_v2_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public save_vocab_info_v2_resultStandardScheme getScheme() {
                return new save_vocab_info_v2_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info_v2_resultTupleScheme extends TupleScheme<save_vocab_info_v2_result> {
            private save_vocab_info_v2_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, save_vocab_info_v2_result struct) throws TException {
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
                    struct.logException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, save_vocab_info_v2_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetSysException()) {
                    bitSet.set(1);
                }
                if (struct.isSetLogException()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success);
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogException()) {
                    struct.logException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class save_vocab_info_v2_resultTupleSchemeFactory implements SchemeFactory {
            private save_vocab_info_v2_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public save_vocab_info_v2_resultTupleScheme getScheme() {
                return new save_vocab_info_v2_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new save_vocab_info_v2_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new save_vocab_info_v2_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOG_EXCEPTION, (_Fields) new FieldMetaData("logException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(save_vocab_info_v2_result.class, unmodifiableMap);
        }

        public save_vocab_info_v2_result() {
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
            this.logException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof save_vocab_info_v2_result)) {
                return equals((save_vocab_info_v2_result) that);
            }
            return false;
        }

        public BELogicException getLogException() {
            return this.logException;
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

        public boolean isSetLogException() {
            return this.logException != null;
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

        public save_vocab_info_v2_result setLogException(BELogicException logException) {
            this.logException = logException;
            return this;
        }

        public void setLogExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logException = null;
        }

        public save_vocab_info_v2_result setSuccess(int success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public save_vocab_info_v2_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("save_vocab_info_v2_result(");
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
            sb2.append("logException:");
            BELogicException bELogicException = this.logException;
            if (bELogicException == null) {
                sb2.append("null");
            } else {
                sb2.append(bELogicException);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetLogException() {
            this.logException = null;
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
        public int compareTo(save_vocab_info_v2_result other) {
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
            int compareTo6 = Boolean.valueOf(isSetLogException()).compareTo(Boolean.valueOf(other.isSetLogException()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetLogException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logException, (Comparable) other.logException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<save_vocab_info_v2_result, _Fields> deepCopy2() {
            return new save_vocab_info_v2_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getSuccess());
            }
            if (i11 == 2) {
                return getSysException();
            }
            if (i11 == 3) {
                return getLogException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_v2_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetSysException();
            }
            if (i11 == 3) {
                return isSetLogException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_studys$BSStudys$save_vocab_info_v2_result$_Fields[field.ordinal()];
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
                unsetLogException();
            } else {
                setLogException((BELogicException) value);
            }
        }

        public save_vocab_info_v2_result(int success, BESystemException sysException, BELogicException logException) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.sysException = sysException;
            this.logException = logException;
        }

        public boolean equals(save_vocab_info_v2_result that) {
            if (that == null || this.success != that.success) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if ((isSetSysException || isSetSysException2) && !(isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException))) {
                return false;
            }
            boolean isSetLogException = isSetLogException();
            boolean isSetLogException2 = that.isSetLogException();
            if (isSetLogException || isSetLogException2) {
                return isSetLogException && isSetLogException2 && this.logException.equals(that.logException);
            }
            return true;
        }

        public save_vocab_info_v2_result(save_vocab_info_v2_result other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.success = other.success;
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
            if (other.isSetLogException()) {
                this.logException = new BELogicException(other.logException);
            }
        }

        public void validate() throws TException {
        }
    }
}
