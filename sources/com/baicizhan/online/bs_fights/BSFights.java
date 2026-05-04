package com.baicizhan.online.bs_fights;

import androidx.media3.extractor.text.ttml.TtmlNode;
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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BSFights {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_fights.BSFights$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$exit_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$exit_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$heartbeat_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$heartbeat_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$join_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$join_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$match_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$match_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$problem_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$problem_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$promotion_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$promotion_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$random_match_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$random_match_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$rank_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$rank_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$ready_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$ready_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$result_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$result_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$start_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$start_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$submit_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$submit_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$user_score_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BSFights$user_score_result$_Fields;

        static {
            int[] iArr = new int[promotion_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$promotion_result$_Fields = iArr;
            try {
                iArr[promotion_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$promotion_result$_Fields[promotion_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$promotion_args$_Fields = new int[promotion_args._Fields.values().length];
            int[] iArr2 = new int[exit_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$exit_result$_Fields = iArr2;
            try {
                iArr2[exit_result._Fields.SYS_EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$exit_result$_Fields[exit_result._Fields.LOG_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$exit_args$_Fields = new int[exit_args._Fields.values().length];
            int[] iArr3 = new int[heartbeat_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$heartbeat_result$_Fields = iArr3;
            try {
                iArr3[heartbeat_result._Fields.SYS_EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$heartbeat_args$_Fields = new int[heartbeat_args._Fields.values().length];
            int[] iArr4 = new int[result_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$result_result$_Fields = iArr4;
            try {
                iArr4[result_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$result_result$_Fields[result_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$result_result$_Fields[result_result._Fields.LOG_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr5 = new int[result_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$result_args$_Fields = iArr5;
            try {
                iArr5[result_args._Fields.USER_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr6 = new int[submit_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$submit_result$_Fields = iArr6;
            try {
                iArr6[submit_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$submit_result$_Fields[submit_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$submit_result$_Fields[submit_result._Fields.LOG_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr7 = new int[submit_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$submit_args$_Fields = iArr7;
            try {
                iArr7[submit_args._Fields.ANSWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$submit_args$_Fields[submit_args._Fields.FIGHT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$submit_args$_Fields[submit_args._Fields.LOCAL_RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr8 = new int[start_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$start_result$_Fields = iArr8;
            try {
                iArr8[start_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$start_result$_Fields[start_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$start_result$_Fields[start_result._Fields.LOG_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr9 = new int[start_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$start_args$_Fields = iArr9;
            try {
                iArr9[start_args._Fields.USER_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr10 = new int[ready_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$ready_result$_Fields = iArr10;
            try {
                iArr10[ready_result._Fields.SYS_EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$ready_result$_Fields[ready_result._Fields.LOG_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            int[] iArr11 = new int[ready_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$ready_args$_Fields = iArr11;
            try {
                iArr11[ready_args._Fields.USER_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            int[] iArr12 = new int[problem_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$problem_result$_Fields = iArr12;
            try {
                iArr12[problem_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$problem_result$_Fields[problem_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$problem_result$_Fields[problem_result._Fields.LOG_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            int[] iArr13 = new int[problem_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$problem_args$_Fields = iArr13;
            try {
                iArr13[problem_args._Fields.USER_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$problem_args$_Fields[problem_args._Fields.FIGHT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            int[] iArr14 = new int[random_match_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$random_match_result$_Fields = iArr14;
            try {
                iArr14[random_match_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$random_match_result$_Fields[random_match_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$random_match_result$_Fields[random_match_result._Fields.LOG_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            int[] iArr15 = new int[random_match_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$random_match_args$_Fields = iArr15;
            try {
                iArr15[random_match_args._Fields.USER_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            int[] iArr16 = new int[match_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$match_result$_Fields = iArr16;
            try {
                iArr16[match_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$match_result$_Fields[match_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$match_result$_Fields[match_result._Fields.LOG_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr17 = new int[match_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$match_args$_Fields = iArr17;
            try {
                iArr17[match_args._Fields.SELECT_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            int[] iArr18 = new int[join_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$join_result$_Fields = iArr18;
            try {
                iArr18[join_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$join_result$_Fields[join_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$join_result$_Fields[join_result._Fields.LOG_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            int[] iArr19 = new int[join_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$join_args$_Fields = iArr19;
            try {
                iArr19[join_args._Fields.USER_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$join_args$_Fields[join_args._Fields.POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            int[] iArr20 = new int[rank_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$rank_result$_Fields = iArr20;
            try {
                iArr20[rank_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$rank_result$_Fields[rank_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused42) {
            }
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$rank_args$_Fields = new int[rank_args._Fields.values().length];
            int[] iArr21 = new int[user_score_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$user_score_result$_Fields = iArr21;
            try {
                iArr21[user_score_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BSFights$user_score_result$_Fields[user_score_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused44) {
            }
            $SwitchMap$com$baicizhan$online$bs_fights$BSFights$user_score_args$_Fields = new int[user_score_args._Fields.values().length];
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
        public static class exit_call extends TAsyncMethodCall {
            public exit_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public void getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_exit();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("exit", (byte) 1, 0));
                new exit_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class heartbeat_call extends TAsyncMethodCall {
            public heartbeat_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public void getResult() throws BESystemException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_heartbeat();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("heartbeat", (byte) 1, 0));
                new heartbeat_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class join_call extends TAsyncMethodCall {
            private BBPosition position;
            private BBUserInfo user_info;

            public join_call(BBUserInfo user_info, BBPosition position, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.user_info = user_info;
                this.position = position;
            }

            public int getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_join();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("join", (byte) 1, 0));
                join_args join_argsVar = new join_args();
                join_argsVar.setUser_info(this.user_info);
                join_argsVar.setPosition(this.position);
                join_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class match_call extends TAsyncMethodCall {
            private BBSelectInfo select_info;

            public match_call(BBSelectInfo select_info, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.select_info = select_info;
            }

            public BBMatchInfo getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_match();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("match", (byte) 1, 0));
                match_args match_argsVar = new match_args();
                match_argsVar.setSelect_info(this.select_info);
                match_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class problem_call extends TAsyncMethodCall {
            private String fight_id;
            private BBUserInfo user_info;

            public problem_call(BBUserInfo user_info, String fight_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.user_info = user_info;
                this.fight_id = fight_id;
            }

            public List<BBProblem> getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_problem();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("problem", (byte) 1, 0));
                problem_args problem_argsVar = new problem_args();
                problem_argsVar.setUser_info(this.user_info);
                problem_argsVar.setFight_id(this.fight_id);
                problem_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class promotion_call extends TAsyncMethodCall {
            public promotion_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public String getResult() throws BESystemException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_promotion();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("promotion", (byte) 1, 0));
                new promotion_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class random_match_call extends TAsyncMethodCall {
            private BBUserInfo user_info;

            public random_match_call(BBUserInfo user_info, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.user_info = user_info;
            }

            public BBRandomMatchInfo getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_random_match();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("random_match", (byte) 1, 0));
                random_match_args random_match_argsVar = new random_match_args();
                random_match_argsVar.setUser_info(this.user_info);
                random_match_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class rank_call extends TAsyncMethodCall {
            public rank_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public List<BBRankInfo> getResult() throws BESystemException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_rank();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("rank", (byte) 1, 0));
                new rank_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ready_call extends TAsyncMethodCall {
            private BBUserInfo user_info;

            public ready_call(BBUserInfo user_info, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.user_info = user_info;
            }

            public void getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_ready();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("ready", (byte) 1, 0));
                ready_args ready_argsVar = new ready_args();
                ready_argsVar.setUser_info(this.user_info);
                ready_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class result_call extends TAsyncMethodCall {
            private BBUserInfo user_info;

            public result_call(BBUserInfo user_info, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.user_info = user_info;
            }

            public BBResult getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_result();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("result", (byte) 1, 0));
                result_args result_argsVar = new result_args();
                result_argsVar.setUser_info(this.user_info);
                result_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class start_call extends TAsyncMethodCall {
            private BBUserInfo user_info;

            public start_call(BBUserInfo user_info, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.user_info = user_info;
            }

            public boolean getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_start();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage(TtmlNode.START, (byte) 1, 0));
                start_args start_argsVar = new start_args();
                start_argsVar.setUser_info(this.user_info);
                start_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_call extends TAsyncMethodCall {
            private BBAnswer answer;
            private String fight_id;
            private int local_result;

            public submit_call(BBAnswer answer, String fight_id, int local_result, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.answer = answer;
                this.fight_id = fight_id;
                this.local_result = local_result;
            }

            public BBSubmitReply getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_submit();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("submit", (byte) 1, 0));
                submit_args submit_argsVar = new submit_args();
                submit_argsVar.setAnswer(this.answer);
                submit_argsVar.setFight_id(this.fight_id);
                submit_argsVar.setLocal_result(this.local_result);
                submit_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class user_score_call extends TAsyncMethodCall {
            public user_score_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public BBScoreInfo getResult() throws BESystemException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_user_score();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("user_score", (byte) 1, 0));
                new user_score_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        public AsyncClient(TProtocolFactory protocolFactory, TAsyncClientManager clientManager, TNonblockingTransport transport) {
            super(protocolFactory, clientManager, transport);
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.AsyncIface
        public void exit(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            exit_call exit_callVar = new exit_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = exit_callVar;
            this.___manager.call(exit_callVar);
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.AsyncIface
        public void heartbeat(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            heartbeat_call heartbeat_callVar = new heartbeat_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = heartbeat_callVar;
            this.___manager.call(heartbeat_callVar);
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.AsyncIface
        public void join(BBUserInfo user_info, BBPosition position, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            join_call join_callVar = new join_call(user_info, position, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = join_callVar;
            this.___manager.call(join_callVar);
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.AsyncIface
        public void match(BBSelectInfo select_info, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            match_call match_callVar = new match_call(select_info, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = match_callVar;
            this.___manager.call(match_callVar);
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.AsyncIface
        public void problem(BBUserInfo user_info, String fight_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            problem_call problem_callVar = new problem_call(user_info, fight_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = problem_callVar;
            this.___manager.call(problem_callVar);
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.AsyncIface
        public void promotion(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            promotion_call promotion_callVar = new promotion_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = promotion_callVar;
            this.___manager.call(promotion_callVar);
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.AsyncIface
        public void random_match(BBUserInfo user_info, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            random_match_call random_match_callVar = new random_match_call(user_info, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = random_match_callVar;
            this.___manager.call(random_match_callVar);
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.AsyncIface
        public void rank(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            rank_call rank_callVar = new rank_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = rank_callVar;
            this.___manager.call(rank_callVar);
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.AsyncIface
        public void ready(BBUserInfo user_info, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            ready_call ready_callVar = new ready_call(user_info, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = ready_callVar;
            this.___manager.call(ready_callVar);
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.AsyncIface
        public void result(BBUserInfo user_info, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            result_call result_callVar = new result_call(user_info, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = result_callVar;
            this.___manager.call(result_callVar);
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.AsyncIface
        public void start(BBUserInfo user_info, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            start_call start_callVar = new start_call(user_info, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = start_callVar;
            this.___manager.call(start_callVar);
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.AsyncIface
        public void submit(BBAnswer answer, String fight_id, int local_result, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            submit_call submit_callVar = new submit_call(answer, fight_id, local_result, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = submit_callVar;
            this.___manager.call(submit_callVar);
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.AsyncIface
        public void user_score(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            user_score_call user_score_callVar = new user_score_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = user_score_callVar;
            this.___manager.call(user_score_callVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AsyncIface {
        void exit(AsyncMethodCallback resultHandler) throws TException;

        void heartbeat(AsyncMethodCallback resultHandler) throws TException;

        void join(BBUserInfo user_info, BBPosition position, AsyncMethodCallback resultHandler) throws TException;

        void match(BBSelectInfo select_info, AsyncMethodCallback resultHandler) throws TException;

        void problem(BBUserInfo user_info, String fight_id, AsyncMethodCallback resultHandler) throws TException;

        void promotion(AsyncMethodCallback resultHandler) throws TException;

        void random_match(BBUserInfo user_info, AsyncMethodCallback resultHandler) throws TException;

        void rank(AsyncMethodCallback resultHandler) throws TException;

        void ready(BBUserInfo user_info, AsyncMethodCallback resultHandler) throws TException;

        void result(BBUserInfo user_info, AsyncMethodCallback resultHandler) throws TException;

        void start(BBUserInfo user_info, AsyncMethodCallback resultHandler) throws TException;

        void submit(BBAnswer answer, String fight_id, int local_result, AsyncMethodCallback resultHandler) throws TException;

        void user_score(AsyncMethodCallback resultHandler) throws TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AsyncProcessor<I extends AsyncIface> extends TBaseAsyncProcessor<I> {
        private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class exit<I extends AsyncIface> extends AsyncProcessFunction<I, exit_args, Void> {
            public exit() {
                super("exit");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.bs_fights.BSFights.AsyncProcessor.exit.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        exit_result exit_resultVar;
                        exit_result exit_resultVar2 = new exit_result();
                        try {
                            if (exc instanceof BESystemException) {
                                exit_resultVar2.sysException = (BESystemException) exc;
                                exit_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    exit_resultVar = r02;
                                    this.sendResponse(fb2, exit_resultVar, b11, seqid);
                                    return;
                                }
                                exit_resultVar2.logException = (BELogicException) exc;
                                exit_resultVar2.setLogExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, exit_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        exit_resultVar = exit_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new exit_result(), (byte) 2, seqid);
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
            public exit_args getEmptyArgsInstance() {
                return new exit_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, exit_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.exit(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class heartbeat<I extends AsyncIface> extends AsyncProcessFunction<I, heartbeat_args, Void> {
            public heartbeat() {
                super("heartbeat");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.bs_fights.BSFights.AsyncProcessor.heartbeat.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        heartbeat_result heartbeat_resultVar;
                        heartbeat_result heartbeat_resultVar2 = new heartbeat_result();
                        if (exc instanceof BESystemException) {
                            heartbeat_resultVar2.sysException = (BESystemException) exc;
                            heartbeat_resultVar2.setSysExceptionIsSet(true);
                            b11 = 2;
                            heartbeat_resultVar = heartbeat_resultVar2;
                        } else {
                            ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                            b11 = 3;
                            heartbeat_resultVar = r02;
                        }
                        try {
                            this.sendResponse(fb2, heartbeat_resultVar, b11, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new heartbeat_result(), (byte) 2, seqid);
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
            public heartbeat_args getEmptyArgsInstance() {
                return new heartbeat_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, heartbeat_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.heartbeat(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class join<I extends AsyncIface> extends AsyncProcessFunction<I, join_args, Integer> {
            public join() {
                super("join");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Integer> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Integer>() { // from class: com.baicizhan.online.bs_fights.BSFights.AsyncProcessor.join.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        join_result join_resultVar;
                        join_result join_resultVar2 = new join_result();
                        try {
                            if (exc instanceof BESystemException) {
                                join_resultVar2.sysException = (BESystemException) exc;
                                join_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    join_resultVar = r02;
                                    this.sendResponse(fb2, join_resultVar, b11, seqid);
                                    return;
                                }
                                join_resultVar2.logException = (BELogicException) exc;
                                join_resultVar2.setLogExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, join_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        join_resultVar = join_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Integer o11) {
                        join_result join_resultVar = new join_result();
                        join_resultVar.success = o11.intValue();
                        join_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, join_resultVar, (byte) 2, seqid);
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
            public join_args getEmptyArgsInstance() {
                return new join_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, join_args args, AsyncMethodCallback<Integer> resultHandler) throws TException {
                iface.join(args.user_info, args.position, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class match<I extends AsyncIface> extends AsyncProcessFunction<I, match_args, BBMatchInfo> {
            public match() {
                super("match");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<BBMatchInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<BBMatchInfo>() { // from class: com.baicizhan.online.bs_fights.BSFights.AsyncProcessor.match.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        match_result match_resultVar;
                        match_result match_resultVar2 = new match_result();
                        try {
                            if (exc instanceof BESystemException) {
                                match_resultVar2.sysException = (BESystemException) exc;
                                match_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    match_resultVar = r02;
                                    this.sendResponse(fb2, match_resultVar, b11, seqid);
                                    return;
                                }
                                match_resultVar2.logException = (BELogicException) exc;
                                match_resultVar2.setLogExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, match_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        match_resultVar = match_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(BBMatchInfo o11) {
                        match_result match_resultVar = new match_result();
                        match_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, match_resultVar, (byte) 2, seqid);
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
            public match_args getEmptyArgsInstance() {
                return new match_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, match_args args, AsyncMethodCallback<BBMatchInfo> resultHandler) throws TException {
                iface.match(args.select_info, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class problem<I extends AsyncIface> extends AsyncProcessFunction<I, problem_args, List<BBProblem>> {
            public problem() {
                super("problem");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<BBProblem>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<BBProblem>>() { // from class: com.baicizhan.online.bs_fights.BSFights.AsyncProcessor.problem.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        problem_result problem_resultVar;
                        problem_result problem_resultVar2 = new problem_result();
                        try {
                            if (exc instanceof BESystemException) {
                                problem_resultVar2.sysException = (BESystemException) exc;
                                problem_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    problem_resultVar = r02;
                                    this.sendResponse(fb2, problem_resultVar, b11, seqid);
                                    return;
                                }
                                problem_resultVar2.logException = (BELogicException) exc;
                                problem_resultVar2.setLogExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, problem_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        problem_resultVar = problem_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<BBProblem> o11) {
                        problem_result problem_resultVar = new problem_result();
                        problem_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, problem_resultVar, (byte) 2, seqid);
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
            public problem_args getEmptyArgsInstance() {
                return new problem_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, problem_args args, AsyncMethodCallback<List<BBProblem>> resultHandler) throws TException {
                iface.problem(args.user_info, args.fight_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class promotion<I extends AsyncIface> extends AsyncProcessFunction<I, promotion_args, String> {
            public promotion() {
                super("promotion");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<String> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<String>() { // from class: com.baicizhan.online.bs_fights.BSFights.AsyncProcessor.promotion.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        promotion_result promotion_resultVar;
                        promotion_result promotion_resultVar2 = new promotion_result();
                        if (exc instanceof BESystemException) {
                            promotion_resultVar2.sysException = (BESystemException) exc;
                            promotion_resultVar2.setSysExceptionIsSet(true);
                            b11 = 2;
                            promotion_resultVar = promotion_resultVar2;
                        } else {
                            ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                            b11 = 3;
                            promotion_resultVar = r02;
                        }
                        try {
                            this.sendResponse(fb2, promotion_resultVar, b11, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(String o11) {
                        promotion_result promotion_resultVar = new promotion_result();
                        promotion_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, promotion_resultVar, (byte) 2, seqid);
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
            public promotion_args getEmptyArgsInstance() {
                return new promotion_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, promotion_args args, AsyncMethodCallback<String> resultHandler) throws TException {
                iface.promotion(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class random_match<I extends AsyncIface> extends AsyncProcessFunction<I, random_match_args, BBRandomMatchInfo> {
            public random_match() {
                super("random_match");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<BBRandomMatchInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<BBRandomMatchInfo>() { // from class: com.baicizhan.online.bs_fights.BSFights.AsyncProcessor.random_match.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        random_match_result random_match_resultVar;
                        random_match_result random_match_resultVar2 = new random_match_result();
                        try {
                            if (exc instanceof BESystemException) {
                                random_match_resultVar2.sysException = (BESystemException) exc;
                                random_match_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    random_match_resultVar = r02;
                                    this.sendResponse(fb2, random_match_resultVar, b11, seqid);
                                    return;
                                }
                                random_match_resultVar2.logException = (BELogicException) exc;
                                random_match_resultVar2.setLogExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, random_match_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        random_match_resultVar = random_match_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(BBRandomMatchInfo o11) {
                        random_match_result random_match_resultVar = new random_match_result();
                        random_match_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, random_match_resultVar, (byte) 2, seqid);
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
            public random_match_args getEmptyArgsInstance() {
                return new random_match_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, random_match_args args, AsyncMethodCallback<BBRandomMatchInfo> resultHandler) throws TException {
                iface.random_match(args.user_info, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class rank<I extends AsyncIface> extends AsyncProcessFunction<I, rank_args, List<BBRankInfo>> {
            public rank() {
                super("rank");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<BBRankInfo>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<BBRankInfo>>() { // from class: com.baicizhan.online.bs_fights.BSFights.AsyncProcessor.rank.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        rank_result rank_resultVar;
                        rank_result rank_resultVar2 = new rank_result();
                        if (exc instanceof BESystemException) {
                            rank_resultVar2.sysException = (BESystemException) exc;
                            rank_resultVar2.setSysExceptionIsSet(true);
                            b11 = 2;
                            rank_resultVar = rank_resultVar2;
                        } else {
                            ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                            b11 = 3;
                            rank_resultVar = r02;
                        }
                        try {
                            this.sendResponse(fb2, rank_resultVar, b11, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<BBRankInfo> o11) {
                        rank_result rank_resultVar = new rank_result();
                        rank_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, rank_resultVar, (byte) 2, seqid);
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
            public rank_args getEmptyArgsInstance() {
                return new rank_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, rank_args args, AsyncMethodCallback<List<BBRankInfo>> resultHandler) throws TException {
                iface.rank(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ready<I extends AsyncIface> extends AsyncProcessFunction<I, ready_args, Void> {
            public ready() {
                super("ready");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.bs_fights.BSFights.AsyncProcessor.ready.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        ready_result ready_resultVar;
                        ready_result ready_resultVar2 = new ready_result();
                        try {
                            if (exc instanceof BESystemException) {
                                ready_resultVar2.sysException = (BESystemException) exc;
                                ready_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    ready_resultVar = r02;
                                    this.sendResponse(fb2, ready_resultVar, b11, seqid);
                                    return;
                                }
                                ready_resultVar2.logException = (BELogicException) exc;
                                ready_resultVar2.setLogExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, ready_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        ready_resultVar = ready_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new ready_result(), (byte) 2, seqid);
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
            public ready_args getEmptyArgsInstance() {
                return new ready_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, ready_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.ready(args.user_info, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class result<I extends AsyncIface> extends AsyncProcessFunction<I, result_args, BBResult> {
            public result() {
                super("result");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<BBResult> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<BBResult>() { // from class: com.baicizhan.online.bs_fights.BSFights.AsyncProcessor.result.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        result_result result_resultVar;
                        result_result result_resultVar2 = new result_result();
                        try {
                            if (exc instanceof BESystemException) {
                                result_resultVar2.sysException = (BESystemException) exc;
                                result_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    result_resultVar = r02;
                                    this.sendResponse(fb2, result_resultVar, b11, seqid);
                                    return;
                                }
                                result_resultVar2.logException = (BELogicException) exc;
                                result_resultVar2.setLogExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, result_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        result_resultVar = result_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(BBResult o11) {
                        result_result result_resultVar = new result_result();
                        result_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, result_resultVar, (byte) 2, seqid);
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
            public result_args getEmptyArgsInstance() {
                return new result_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, result_args args, AsyncMethodCallback<BBResult> resultHandler) throws TException {
                iface.result(args.user_info, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class start<I extends AsyncIface> extends AsyncProcessFunction<I, start_args, Boolean> {
            public start() {
                super(TtmlNode.START);
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Boolean> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Boolean>() { // from class: com.baicizhan.online.bs_fights.BSFights.AsyncProcessor.start.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        start_result start_resultVar;
                        start_result start_resultVar2 = new start_result();
                        try {
                            if (exc instanceof BESystemException) {
                                start_resultVar2.sysException = (BESystemException) exc;
                                start_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    start_resultVar = r02;
                                    this.sendResponse(fb2, start_resultVar, b11, seqid);
                                    return;
                                }
                                start_resultVar2.logException = (BELogicException) exc;
                                start_resultVar2.setLogExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, start_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        start_resultVar = start_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Boolean o11) {
                        start_result start_resultVar = new start_result();
                        start_resultVar.success = o11.booleanValue();
                        start_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, start_resultVar, (byte) 2, seqid);
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
            public start_args getEmptyArgsInstance() {
                return new start_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, start_args args, AsyncMethodCallback<Boolean> resultHandler) throws TException {
                iface.start(args.user_info, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit<I extends AsyncIface> extends AsyncProcessFunction<I, submit_args, BBSubmitReply> {
            public submit() {
                super("submit");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<BBSubmitReply> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<BBSubmitReply>() { // from class: com.baicizhan.online.bs_fights.BSFights.AsyncProcessor.submit.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        submit_result submit_resultVar;
                        submit_result submit_resultVar2 = new submit_result();
                        try {
                            if (exc instanceof BESystemException) {
                                submit_resultVar2.sysException = (BESystemException) exc;
                                submit_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    submit_resultVar = r02;
                                    this.sendResponse(fb2, submit_resultVar, b11, seqid);
                                    return;
                                }
                                submit_resultVar2.logException = (BELogicException) exc;
                                submit_resultVar2.setLogExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, submit_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        submit_resultVar = submit_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(BBSubmitReply o11) {
                        submit_result submit_resultVar = new submit_result();
                        submit_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, submit_resultVar, (byte) 2, seqid);
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
            public void start(I iface, submit_args args, AsyncMethodCallback<BBSubmitReply> resultHandler) throws TException {
                iface.submit(args.answer, args.fight_id, args.local_result, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class user_score<I extends AsyncIface> extends AsyncProcessFunction<I, user_score_args, BBScoreInfo> {
            public user_score() {
                super("user_score");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<BBScoreInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<BBScoreInfo>() { // from class: com.baicizhan.online.bs_fights.BSFights.AsyncProcessor.user_score.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        user_score_result user_score_resultVar;
                        user_score_result user_score_resultVar2 = new user_score_result();
                        if (exc instanceof BESystemException) {
                            user_score_resultVar2.sysException = (BESystemException) exc;
                            user_score_resultVar2.setSysExceptionIsSet(true);
                            b11 = 2;
                            user_score_resultVar = user_score_resultVar2;
                        } else {
                            ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                            b11 = 3;
                            user_score_resultVar = r02;
                        }
                        try {
                            this.sendResponse(fb2, user_score_resultVar, b11, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(BBScoreInfo o11) {
                        user_score_result user_score_resultVar = new user_score_result();
                        user_score_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, user_score_resultVar, (byte) 2, seqid);
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
            public user_score_args getEmptyArgsInstance() {
                return new user_score_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, user_score_args args, AsyncMethodCallback<BBScoreInfo> resultHandler) throws TException {
                iface.user_score(resultHandler);
            }
        }

        public AsyncProcessor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends AsyncIface> Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> getProcessMap(Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> processMap) {
            processMap.put("user_score", new user_score());
            processMap.put("rank", new rank());
            processMap.put("join", new join());
            processMap.put("match", new match());
            processMap.put("random_match", new random_match());
            processMap.put("problem", new problem());
            processMap.put("ready", new ready());
            processMap.put(TtmlNode.START, new start());
            processMap.put("submit", new submit());
            processMap.put("result", new result());
            processMap.put("heartbeat", new heartbeat());
            processMap.put("exit", new exit());
            processMap.put("promotion", new promotion());
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

        @Override // com.baicizhan.online.bs_fights.BSFights.Iface
        public void exit() throws BESystemException, BELogicException, TException {
            send_exit();
            recv_exit();
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.Iface
        public void heartbeat() throws BESystemException, TException {
            send_heartbeat();
            recv_heartbeat();
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.Iface
        public int join(BBUserInfo user_info, BBPosition position) throws BESystemException, BELogicException, TException {
            send_join(user_info, position);
            return recv_join();
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.Iface
        public BBMatchInfo match(BBSelectInfo select_info) throws BESystemException, BELogicException, TException {
            send_match(select_info);
            return recv_match();
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.Iface
        public List<BBProblem> problem(BBUserInfo user_info, String fight_id) throws BESystemException, BELogicException, TException {
            send_problem(user_info, fight_id);
            return recv_problem();
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.Iface
        public String promotion() throws BESystemException, TException {
            send_promotion();
            return recv_promotion();
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.Iface
        public BBRandomMatchInfo random_match(BBUserInfo user_info) throws BESystemException, BELogicException, TException {
            send_random_match(user_info);
            return recv_random_match();
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.Iface
        public List<BBRankInfo> rank() throws BESystemException, TException {
            send_rank();
            return recv_rank();
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.Iface
        public void ready(BBUserInfo user_info) throws BESystemException, BELogicException, TException {
            send_ready(user_info);
            recv_ready();
        }

        public void recv_exit() throws BESystemException, BELogicException, TException {
            exit_result exit_resultVar = new exit_result();
            receiveBase(exit_resultVar, "exit");
            BESystemException bESystemException = exit_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = exit_resultVar.logException;
            if (bELogicException != null) {
                throw bELogicException;
            }
        }

        public void recv_heartbeat() throws BESystemException, TException {
            heartbeat_result heartbeat_resultVar = new heartbeat_result();
            receiveBase(heartbeat_resultVar, "heartbeat");
            BESystemException bESystemException = heartbeat_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
        }

        public int recv_join() throws BESystemException, BELogicException, TException {
            join_result join_resultVar = new join_result();
            receiveBase(join_resultVar, "join");
            if (join_resultVar.isSetSuccess()) {
                return join_resultVar.success;
            }
            BESystemException bESystemException = join_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = join_resultVar.logException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "join failed: unknown result");
        }

        public BBMatchInfo recv_match() throws BESystemException, BELogicException, TException {
            match_result match_resultVar = new match_result();
            receiveBase(match_resultVar, "match");
            if (match_resultVar.isSetSuccess()) {
                return match_resultVar.success;
            }
            BESystemException bESystemException = match_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = match_resultVar.logException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "match failed: unknown result");
        }

        public List<BBProblem> recv_problem() throws BESystemException, BELogicException, TException {
            problem_result problem_resultVar = new problem_result();
            receiveBase(problem_resultVar, "problem");
            if (problem_resultVar.isSetSuccess()) {
                return problem_resultVar.success;
            }
            BESystemException bESystemException = problem_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = problem_resultVar.logException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "problem failed: unknown result");
        }

        public String recv_promotion() throws BESystemException, TException {
            promotion_result promotion_resultVar = new promotion_result();
            receiveBase(promotion_resultVar, "promotion");
            if (promotion_resultVar.isSetSuccess()) {
                return promotion_resultVar.success;
            }
            BESystemException bESystemException = promotion_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            throw new TApplicationException(5, "promotion failed: unknown result");
        }

        public BBRandomMatchInfo recv_random_match() throws BESystemException, BELogicException, TException {
            random_match_result random_match_resultVar = new random_match_result();
            receiveBase(random_match_resultVar, "random_match");
            if (random_match_resultVar.isSetSuccess()) {
                return random_match_resultVar.success;
            }
            BESystemException bESystemException = random_match_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = random_match_resultVar.logException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "random_match failed: unknown result");
        }

        public List<BBRankInfo> recv_rank() throws BESystemException, TException {
            rank_result rank_resultVar = new rank_result();
            receiveBase(rank_resultVar, "rank");
            if (rank_resultVar.isSetSuccess()) {
                return rank_resultVar.success;
            }
            BESystemException bESystemException = rank_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            throw new TApplicationException(5, "rank failed: unknown result");
        }

        public void recv_ready() throws BESystemException, BELogicException, TException {
            ready_result ready_resultVar = new ready_result();
            receiveBase(ready_resultVar, "ready");
            BESystemException bESystemException = ready_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = ready_resultVar.logException;
            if (bELogicException != null) {
                throw bELogicException;
            }
        }

        public BBResult recv_result() throws BESystemException, BELogicException, TException {
            result_result result_resultVar = new result_result();
            receiveBase(result_resultVar, "result");
            if (result_resultVar.isSetSuccess()) {
                return result_resultVar.success;
            }
            BESystemException bESystemException = result_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = result_resultVar.logException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "result failed: unknown result");
        }

        public boolean recv_start() throws BESystemException, BELogicException, TException {
            start_result start_resultVar = new start_result();
            receiveBase(start_resultVar, TtmlNode.START);
            if (start_resultVar.isSetSuccess()) {
                return start_resultVar.success;
            }
            BESystemException bESystemException = start_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = start_resultVar.logException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "start failed: unknown result");
        }

        public BBSubmitReply recv_submit() throws BESystemException, BELogicException, TException {
            submit_result submit_resultVar = new submit_result();
            receiveBase(submit_resultVar, "submit");
            if (submit_resultVar.isSetSuccess()) {
                return submit_resultVar.success;
            }
            BESystemException bESystemException = submit_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = submit_resultVar.logException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "submit failed: unknown result");
        }

        public BBScoreInfo recv_user_score() throws BESystemException, TException {
            user_score_result user_score_resultVar = new user_score_result();
            receiveBase(user_score_resultVar, "user_score");
            if (user_score_resultVar.isSetSuccess()) {
                return user_score_resultVar.success;
            }
            BESystemException bESystemException = user_score_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            throw new TApplicationException(5, "user_score failed: unknown result");
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.Iface
        public BBResult result(BBUserInfo user_info) throws BESystemException, BELogicException, TException {
            send_result(user_info);
            return recv_result();
        }

        public void send_exit() throws TException {
            sendBase("exit", new exit_args());
        }

        public void send_heartbeat() throws TException {
            sendBase("heartbeat", new heartbeat_args());
        }

        public void send_join(BBUserInfo user_info, BBPosition position) throws TException {
            join_args join_argsVar = new join_args();
            join_argsVar.setUser_info(user_info);
            join_argsVar.setPosition(position);
            sendBase("join", join_argsVar);
        }

        public void send_match(BBSelectInfo select_info) throws TException {
            match_args match_argsVar = new match_args();
            match_argsVar.setSelect_info(select_info);
            sendBase("match", match_argsVar);
        }

        public void send_problem(BBUserInfo user_info, String fight_id) throws TException {
            problem_args problem_argsVar = new problem_args();
            problem_argsVar.setUser_info(user_info);
            problem_argsVar.setFight_id(fight_id);
            sendBase("problem", problem_argsVar);
        }

        public void send_promotion() throws TException {
            sendBase("promotion", new promotion_args());
        }

        public void send_random_match(BBUserInfo user_info) throws TException {
            random_match_args random_match_argsVar = new random_match_args();
            random_match_argsVar.setUser_info(user_info);
            sendBase("random_match", random_match_argsVar);
        }

        public void send_rank() throws TException {
            sendBase("rank", new rank_args());
        }

        public void send_ready(BBUserInfo user_info) throws TException {
            ready_args ready_argsVar = new ready_args();
            ready_argsVar.setUser_info(user_info);
            sendBase("ready", ready_argsVar);
        }

        public void send_result(BBUserInfo user_info) throws TException {
            result_args result_argsVar = new result_args();
            result_argsVar.setUser_info(user_info);
            sendBase("result", result_argsVar);
        }

        public void send_start(BBUserInfo user_info) throws TException {
            start_args start_argsVar = new start_args();
            start_argsVar.setUser_info(user_info);
            sendBase(TtmlNode.START, start_argsVar);
        }

        public void send_submit(BBAnswer answer, String fight_id, int local_result) throws TException {
            submit_args submit_argsVar = new submit_args();
            submit_argsVar.setAnswer(answer);
            submit_argsVar.setFight_id(fight_id);
            submit_argsVar.setLocal_result(local_result);
            sendBase("submit", submit_argsVar);
        }

        public void send_user_score() throws TException {
            sendBase("user_score", new user_score_args());
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.Iface
        public boolean start(BBUserInfo user_info) throws BESystemException, BELogicException, TException {
            send_start(user_info);
            return recv_start();
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.Iface
        public BBSubmitReply submit(BBAnswer answer, String fight_id, int local_result) throws BESystemException, BELogicException, TException {
            send_submit(answer, fight_id, local_result);
            return recv_submit();
        }

        @Override // com.baicizhan.online.bs_fights.BSFights.Iface
        public BBScoreInfo user_score() throws BESystemException, TException {
            send_user_score();
            return recv_user_score();
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
        void exit() throws BESystemException, BELogicException, TException;

        void heartbeat() throws BESystemException, TException;

        int join(BBUserInfo user_info, BBPosition position) throws BESystemException, BELogicException, TException;

        BBMatchInfo match(BBSelectInfo select_info) throws BESystemException, BELogicException, TException;

        List<BBProblem> problem(BBUserInfo user_info, String fight_id) throws BESystemException, BELogicException, TException;

        String promotion() throws BESystemException, TException;

        BBRandomMatchInfo random_match(BBUserInfo user_info) throws BESystemException, BELogicException, TException;

        List<BBRankInfo> rank() throws BESystemException, TException;

        void ready(BBUserInfo user_info) throws BESystemException, BELogicException, TException;

        BBResult result(BBUserInfo user_info) throws BESystemException, BELogicException, TException;

        boolean start(BBUserInfo user_info) throws BESystemException, BELogicException, TException;

        BBSubmitReply submit(BBAnswer answer, String fight_id, int local_result) throws BESystemException, BELogicException, TException;

        BBScoreInfo user_score() throws BESystemException, TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Processor<I extends Iface> extends TBaseProcessor<I> implements TProcessor {
        private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class exit<I extends Iface> extends ProcessFunction<I, exit_args> {
            public exit() {
                super("exit");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public exit_args getEmptyArgsInstance() {
                return new exit_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public exit_result getResult(I iface, exit_args args) throws TException {
                exit_result exit_resultVar = new exit_result();
                try {
                    iface.exit();
                    return exit_resultVar;
                } catch (BELogicException e11) {
                    exit_resultVar.logException = e11;
                    return exit_resultVar;
                } catch (BESystemException e12) {
                    exit_resultVar.sysException = e12;
                    return exit_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class heartbeat<I extends Iface> extends ProcessFunction<I, heartbeat_args> {
            public heartbeat() {
                super("heartbeat");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public heartbeat_args getEmptyArgsInstance() {
                return new heartbeat_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public heartbeat_result getResult(I iface, heartbeat_args args) throws TException {
                heartbeat_result heartbeat_resultVar = new heartbeat_result();
                try {
                    iface.heartbeat();
                    return heartbeat_resultVar;
                } catch (BESystemException e11) {
                    heartbeat_resultVar.sysException = e11;
                    return heartbeat_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class join<I extends Iface> extends ProcessFunction<I, join_args> {
            public join() {
                super("join");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public join_args getEmptyArgsInstance() {
                return new join_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public join_result getResult(I iface, join_args args) throws TException {
                join_result join_resultVar = new join_result();
                try {
                    join_resultVar.success = iface.join(args.user_info, args.position);
                    join_resultVar.setSuccessIsSet(true);
                    return join_resultVar;
                } catch (BELogicException e11) {
                    join_resultVar.logException = e11;
                    return join_resultVar;
                } catch (BESystemException e12) {
                    join_resultVar.sysException = e12;
                    return join_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class match<I extends Iface> extends ProcessFunction<I, match_args> {
            public match() {
                super("match");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public match_args getEmptyArgsInstance() {
                return new match_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public match_result getResult(I iface, match_args args) throws TException {
                match_result match_resultVar = new match_result();
                try {
                    match_resultVar.success = iface.match(args.select_info);
                    return match_resultVar;
                } catch (BELogicException e11) {
                    match_resultVar.logException = e11;
                    return match_resultVar;
                } catch (BESystemException e12) {
                    match_resultVar.sysException = e12;
                    return match_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class problem<I extends Iface> extends ProcessFunction<I, problem_args> {
            public problem() {
                super("problem");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public problem_args getEmptyArgsInstance() {
                return new problem_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public problem_result getResult(I iface, problem_args args) throws TException {
                problem_result problem_resultVar = new problem_result();
                try {
                    problem_resultVar.success = iface.problem(args.user_info, args.fight_id);
                    return problem_resultVar;
                } catch (BELogicException e11) {
                    problem_resultVar.logException = e11;
                    return problem_resultVar;
                } catch (BESystemException e12) {
                    problem_resultVar.sysException = e12;
                    return problem_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class promotion<I extends Iface> extends ProcessFunction<I, promotion_args> {
            public promotion() {
                super("promotion");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public promotion_args getEmptyArgsInstance() {
                return new promotion_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public promotion_result getResult(I iface, promotion_args args) throws TException {
                promotion_result promotion_resultVar = new promotion_result();
                try {
                    promotion_resultVar.success = iface.promotion();
                    return promotion_resultVar;
                } catch (BESystemException e11) {
                    promotion_resultVar.sysException = e11;
                    return promotion_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class random_match<I extends Iface> extends ProcessFunction<I, random_match_args> {
            public random_match() {
                super("random_match");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public random_match_args getEmptyArgsInstance() {
                return new random_match_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public random_match_result getResult(I iface, random_match_args args) throws TException {
                random_match_result random_match_resultVar = new random_match_result();
                try {
                    random_match_resultVar.success = iface.random_match(args.user_info);
                    return random_match_resultVar;
                } catch (BELogicException e11) {
                    random_match_resultVar.logException = e11;
                    return random_match_resultVar;
                } catch (BESystemException e12) {
                    random_match_resultVar.sysException = e12;
                    return random_match_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class rank<I extends Iface> extends ProcessFunction<I, rank_args> {
            public rank() {
                super("rank");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public rank_args getEmptyArgsInstance() {
                return new rank_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public rank_result getResult(I iface, rank_args args) throws TException {
                rank_result rank_resultVar = new rank_result();
                try {
                    rank_resultVar.success = iface.rank();
                    return rank_resultVar;
                } catch (BESystemException e11) {
                    rank_resultVar.sysException = e11;
                    return rank_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ready<I extends Iface> extends ProcessFunction<I, ready_args> {
            public ready() {
                super("ready");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public ready_args getEmptyArgsInstance() {
                return new ready_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public ready_result getResult(I iface, ready_args args) throws TException {
                ready_result ready_resultVar = new ready_result();
                try {
                    iface.ready(args.user_info);
                    return ready_resultVar;
                } catch (BELogicException e11) {
                    ready_resultVar.logException = e11;
                    return ready_resultVar;
                } catch (BESystemException e12) {
                    ready_resultVar.sysException = e12;
                    return ready_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class result<I extends Iface> extends ProcessFunction<I, result_args> {
            public result() {
                super("result");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public result_args getEmptyArgsInstance() {
                return new result_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public result_result getResult(I iface, result_args args) throws TException {
                result_result result_resultVar = new result_result();
                try {
                    result_resultVar.success = iface.result(args.user_info);
                    return result_resultVar;
                } catch (BELogicException e11) {
                    result_resultVar.logException = e11;
                    return result_resultVar;
                } catch (BESystemException e12) {
                    result_resultVar.sysException = e12;
                    return result_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class start<I extends Iface> extends ProcessFunction<I, start_args> {
            public start() {
                super(TtmlNode.START);
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public start_args getEmptyArgsInstance() {
                return new start_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public start_result getResult(I iface, start_args args) throws TException {
                start_result start_resultVar = new start_result();
                try {
                    start_resultVar.success = iface.start(args.user_info);
                    start_resultVar.setSuccessIsSet(true);
                    return start_resultVar;
                } catch (BELogicException e11) {
                    start_resultVar.logException = e11;
                    return start_resultVar;
                } catch (BESystemException e12) {
                    start_resultVar.sysException = e12;
                    return start_resultVar;
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
                    submit_resultVar.success = iface.submit(args.answer, args.fight_id, args.local_result);
                    return submit_resultVar;
                } catch (BELogicException e11) {
                    submit_resultVar.logException = e11;
                    return submit_resultVar;
                } catch (BESystemException e12) {
                    submit_resultVar.sysException = e12;
                    return submit_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class user_score<I extends Iface> extends ProcessFunction<I, user_score_args> {
            public user_score() {
                super("user_score");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public user_score_args getEmptyArgsInstance() {
                return new user_score_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public user_score_result getResult(I iface, user_score_args args) throws TException {
                user_score_result user_score_resultVar = new user_score_result();
                try {
                    user_score_resultVar.success = iface.user_score();
                    return user_score_resultVar;
                } catch (BESystemException e11) {
                    user_score_resultVar.sysException = e11;
                    return user_score_resultVar;
                }
            }
        }

        public Processor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends Iface> Map<String, ProcessFunction<I, ? extends TBase>> getProcessMap(Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            processMap.put("user_score", new user_score());
            processMap.put("rank", new rank());
            processMap.put("join", new join());
            processMap.put("match", new match());
            processMap.put("random_match", new random_match());
            processMap.put("problem", new problem());
            processMap.put("ready", new ready());
            processMap.put(TtmlNode.START, new start());
            processMap.put("submit", new submit());
            processMap.put("result", new result());
            processMap.put("heartbeat", new heartbeat());
            processMap.put("exit", new exit());
            processMap.put("promotion", new promotion());
            return processMap;
        }

        public Processor(I iface, Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            super(iface, getProcessMap(processMap));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class exit_args implements TBase<exit_args, _Fields>, Serializable, Cloneable, Comparable<exit_args> {
        private static final TStruct STRUCT_DESC = new TStruct("exit_args");
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
        public static class exit_argsStandardScheme extends StandardScheme<exit_args> {
            private exit_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, exit_args struct) throws TException {
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
            public void write(TProtocol oprot, exit_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(exit_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class exit_argsStandardSchemeFactory implements SchemeFactory {
            private exit_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public exit_argsStandardScheme getScheme() {
                return new exit_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class exit_argsTupleScheme extends TupleScheme<exit_args> {
            private exit_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, exit_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, exit_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class exit_argsTupleSchemeFactory implements SchemeFactory {
            private exit_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public exit_argsTupleScheme getScheme() {
                return new exit_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new exit_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new exit_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(exit_args.class, unmodifiableMap);
        }

        public exit_args() {
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

        public boolean equals(exit_args that) {
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
            return "exit_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public exit_args(exit_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(exit_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<exit_args, _Fields> deepCopy2() {
            return new exit_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof exit_args)) {
                return equals((exit_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$exit_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$exit_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$exit_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class exit_result implements TBase<exit_result, _Fields>, Serializable, Cloneable, Comparable<exit_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logException;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("exit_result");
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
        public static class exit_resultStandardScheme extends StandardScheme<exit_result> {
            private exit_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, exit_result struct) throws TException {
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
            public void write(TProtocol oprot, exit_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(exit_result.STRUCT_DESC);
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(exit_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logException != null) {
                    oprot.writeFieldBegin(exit_result.LOG_EXCEPTION_FIELD_DESC);
                    struct.logException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class exit_resultStandardSchemeFactory implements SchemeFactory {
            private exit_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public exit_resultStandardScheme getScheme() {
                return new exit_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class exit_resultTupleScheme extends TupleScheme<exit_result> {
            private exit_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, exit_result struct) throws TException {
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
            public void write(TProtocol prot, exit_result struct) throws TException {
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
        public static class exit_resultTupleSchemeFactory implements SchemeFactory {
            private exit_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public exit_resultTupleScheme getScheme() {
                return new exit_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new exit_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new exit_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOG_EXCEPTION, (_Fields) new FieldMetaData("logException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(exit_result.class, unmodifiableMap);
        }

        public exit_result() {
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
            if (that != null && (that instanceof exit_result)) {
                return equals((exit_result) that);
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

        public exit_result setLogException(BELogicException logException) {
            this.logException = logException;
            return this;
        }

        public void setLogExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logException = null;
        }

        public exit_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("exit_result(");
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
            sb2.append(pn.j.f81007d);
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

        public exit_result(BESystemException sysException, BELogicException logException) {
            this();
            this.sysException = sysException;
            this.logException = logException;
        }

        @Override // java.lang.Comparable
        public int compareTo(exit_result other) {
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
        public TBase<exit_result, _Fields> deepCopy2() {
            return new exit_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$exit_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$exit_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$exit_result$_Fields[field.ordinal()];
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

        public boolean equals(exit_result that) {
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

        public exit_result(exit_result other) {
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
    public static class heartbeat_args implements TBase<heartbeat_args, _Fields>, Serializable, Cloneable, Comparable<heartbeat_args> {
        private static final TStruct STRUCT_DESC = new TStruct("heartbeat_args");
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
        public static class heartbeat_argsStandardScheme extends StandardScheme<heartbeat_args> {
            private heartbeat_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, heartbeat_args struct) throws TException {
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
            public void write(TProtocol oprot, heartbeat_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(heartbeat_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class heartbeat_argsStandardSchemeFactory implements SchemeFactory {
            private heartbeat_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public heartbeat_argsStandardScheme getScheme() {
                return new heartbeat_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class heartbeat_argsTupleScheme extends TupleScheme<heartbeat_args> {
            private heartbeat_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, heartbeat_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, heartbeat_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class heartbeat_argsTupleSchemeFactory implements SchemeFactory {
            private heartbeat_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public heartbeat_argsTupleScheme getScheme() {
                return new heartbeat_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new heartbeat_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new heartbeat_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(heartbeat_args.class, unmodifiableMap);
        }

        public heartbeat_args() {
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

        public boolean equals(heartbeat_args that) {
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
            return "heartbeat_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public heartbeat_args(heartbeat_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(heartbeat_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<heartbeat_args, _Fields> deepCopy2() {
            return new heartbeat_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof heartbeat_args)) {
                return equals((heartbeat_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$heartbeat_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$heartbeat_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$heartbeat_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class heartbeat_result implements TBase<heartbeat_result, _Fields>, Serializable, Cloneable, Comparable<heartbeat_result> {
        private static final TStruct STRUCT_DESC = new TStruct("heartbeat_result");
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BESystemException sysException;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
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
        public static class heartbeat_resultStandardScheme extends StandardScheme<heartbeat_result> {
            private heartbeat_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, heartbeat_result struct) throws TException {
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
            public void write(TProtocol oprot, heartbeat_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(heartbeat_result.STRUCT_DESC);
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(heartbeat_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class heartbeat_resultStandardSchemeFactory implements SchemeFactory {
            private heartbeat_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public heartbeat_resultStandardScheme getScheme() {
                return new heartbeat_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class heartbeat_resultTupleScheme extends TupleScheme<heartbeat_result> {
            private heartbeat_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, heartbeat_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                if (tTupleProtocol.readBitSet(1).get(0)) {
                    BESystemException bESystemException = new BESystemException();
                    struct.sysException = bESystemException;
                    bESystemException.read(tTupleProtocol);
                    struct.setSysExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, heartbeat_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSysException()) {
                    bitSet.set(0);
                }
                tTupleProtocol.writeBitSet(bitSet, 1);
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class heartbeat_resultTupleSchemeFactory implements SchemeFactory {
            private heartbeat_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public heartbeat_resultTupleScheme getScheme() {
                return new heartbeat_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new heartbeat_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new heartbeat_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(heartbeat_result.class, unmodifiableMap);
        }

        public heartbeat_result() {
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
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof heartbeat_result)) {
                return equals((heartbeat_result) that);
            }
            return false;
        }

        public BESystemException getSysException() {
            return this.sysException;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public heartbeat_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("heartbeat_result(");
            sb2.append("sysException:");
            BESystemException bESystemException = this.sysException;
            if (bESystemException == null) {
                sb2.append("null");
            } else {
                sb2.append(bESystemException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public heartbeat_result(BESystemException sysException) {
            this();
            this.sysException = sysException;
        }

        @Override // java.lang.Comparable
        public int compareTo(heartbeat_result other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetSysException()).compareTo(Boolean.valueOf(other.isSetSysException()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetSysException() || (compareTo = TBaseHelper.compareTo((Comparable) this.sysException, (Comparable) other.sysException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<heartbeat_result, _Fields> deepCopy2() {
            return new heartbeat_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$heartbeat_result$_Fields[field.ordinal()] == 1) {
                return getSysException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$heartbeat_result$_Fields[field.ordinal()] == 1) {
                return isSetSysException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$heartbeat_result$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetSysException();
            } else {
                setSysException((BESystemException) value);
            }
        }

        public boolean equals(heartbeat_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSysException = isSetSysException();
            boolean isSetSysException2 = that.isSetSysException();
            if (isSetSysException || isSetSysException2) {
                return isSetSysException && isSetSysException2 && this.sysException.equals(that.sysException);
            }
            return true;
        }

        public heartbeat_result(heartbeat_result other) {
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class join_args implements TBase<join_args, _Fields>, Serializable, Cloneable, Comparable<join_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BBPosition position;
        public BBUserInfo user_info;
        private static final TStruct STRUCT_DESC = new TStruct("join_args");
        private static final TField USER_INFO_FIELD_DESC = new TField(i9.m.f60424b, (byte) 12, 1);
        private static final TField POSITION_FIELD_DESC = new TField("position", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            USER_INFO(1, i9.m.f60424b),
            POSITION(2, "position");

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
                    return USER_INFO;
                }
                if (fieldId != 2) {
                    return null;
                }
                return POSITION;
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
        public static class join_argsStandardScheme extends StandardScheme<join_args> {
            private join_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, join_args struct) throws TException {
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
                            BBPosition bBPosition = new BBPosition();
                            struct.position = bBPosition;
                            bBPosition.read(iprot);
                            struct.setPositionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        BBUserInfo bBUserInfo = new BBUserInfo();
                        struct.user_info = bBUserInfo;
                        bBUserInfo.read(iprot);
                        struct.setUser_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, join_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(join_args.STRUCT_DESC);
                if (struct.user_info != null) {
                    oprot.writeFieldBegin(join_args.USER_INFO_FIELD_DESC);
                    struct.user_info.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.position != null) {
                    oprot.writeFieldBegin(join_args.POSITION_FIELD_DESC);
                    struct.position.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class join_argsStandardSchemeFactory implements SchemeFactory {
            private join_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public join_argsStandardScheme getScheme() {
                return new join_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class join_argsTupleScheme extends TupleScheme<join_args> {
            private join_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, join_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BBUserInfo bBUserInfo = new BBUserInfo();
                struct.user_info = bBUserInfo;
                bBUserInfo.read(tTupleProtocol);
                struct.setUser_infoIsSet(true);
                BBPosition bBPosition = new BBPosition();
                struct.position = bBPosition;
                bBPosition.read(tTupleProtocol);
                struct.setPositionIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, join_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.user_info.write(tTupleProtocol);
                struct.position.write(tTupleProtocol);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class join_argsTupleSchemeFactory implements SchemeFactory {
            private join_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public join_argsTupleScheme getScheme() {
                return new join_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new join_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new join_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.USER_INFO, (_Fields) new FieldMetaData(i9.m.f60424b, (byte) 1, new StructMetaData((byte) 12, BBUserInfo.class)));
            enumMap.put((EnumMap) _Fields.POSITION, (_Fields) new FieldMetaData("position", (byte) 1, new StructMetaData((byte) 12, BBPosition.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(join_args.class, unmodifiableMap);
        }

        public join_args() {
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
            this.user_info = null;
            this.position = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof join_args)) {
                return equals((join_args) that);
            }
            return false;
        }

        public BBPosition getPosition() {
            return this.position;
        }

        public BBUserInfo getUser_info() {
            return this.user_info;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetPosition() {
            return this.position != null;
        }

        public boolean isSetUser_info() {
            return this.user_info != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public join_args setPosition(BBPosition position) {
            this.position = position;
            return this;
        }

        public void setPositionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.position = null;
        }

        public join_args setUser_info(BBUserInfo user_info) {
            this.user_info = user_info;
            return this;
        }

        public void setUser_infoIsSet(boolean value) {
            if (value) {
                return;
            }
            this.user_info = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("join_args(");
            sb2.append("user_info:");
            BBUserInfo bBUserInfo = this.user_info;
            if (bBUserInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBUserInfo);
            }
            sb2.append(j2.O);
            sb2.append("position:");
            BBPosition bBPosition = this.position;
            if (bBPosition == null) {
                sb2.append("null");
            } else {
                sb2.append(bBPosition);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetPosition() {
            this.position = null;
        }

        public void unsetUser_info() {
            this.user_info = null;
        }

        public void validate() throws TException {
            BBUserInfo bBUserInfo = this.user_info;
            if (bBUserInfo == null) {
                throw new TProtocolException("Required field 'user_info' was not present! Struct: " + toString());
            }
            if (this.position == null) {
                throw new TProtocolException("Required field 'position' was not present! Struct: " + toString());
            }
            if (bBUserInfo != null) {
                bBUserInfo.validate();
            }
            BBPosition bBPosition = this.position;
            if (bBPosition != null) {
                bBPosition.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public join_args(BBUserInfo user_info, BBPosition position) {
            this();
            this.user_info = user_info;
            this.position = position;
        }

        @Override // java.lang.Comparable
        public int compareTo(join_args other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetUser_info()).compareTo(Boolean.valueOf(other.isSetUser_info()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetUser_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.user_info, (Comparable) other.user_info)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetPosition()).compareTo(Boolean.valueOf(other.isSetPosition()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetPosition() || (compareTo = TBaseHelper.compareTo((Comparable) this.position, (Comparable) other.position)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<join_args, _Fields> deepCopy2() {
            return new join_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$join_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getUser_info();
            }
            if (i11 == 2) {
                return getPosition();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$join_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetUser_info();
            }
            if (i11 == 2) {
                return isSetPosition();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$join_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetUser_info();
                    return;
                } else {
                    setUser_info((BBUserInfo) value);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetPosition();
            } else {
                setPosition((BBPosition) value);
            }
        }

        public boolean equals(join_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetUser_info = isSetUser_info();
            boolean isSetUser_info2 = that.isSetUser_info();
            if ((isSetUser_info || isSetUser_info2) && !(isSetUser_info && isSetUser_info2 && this.user_info.equals(that.user_info))) {
                return false;
            }
            boolean isSetPosition = isSetPosition();
            boolean isSetPosition2 = that.isSetPosition();
            if (isSetPosition || isSetPosition2) {
                return isSetPosition && isSetPosition2 && this.position.equals(that.position);
            }
            return true;
        }

        public join_args(join_args other) {
            if (other.isSetUser_info()) {
                this.user_info = new BBUserInfo(other.user_info);
            }
            if (other.isSetPosition()) {
                this.position = new BBPosition(other.position);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class join_result implements TBase<join_result, _Fields>, Serializable, Cloneable, Comparable<join_result> {
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public BELogicException logException;
        public int success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("join_result");
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
        public static class join_resultStandardScheme extends StandardScheme<join_result> {
            private join_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, join_result struct) throws TException {
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
            public void write(TProtocol oprot, join_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(join_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(join_result.SUCCESS_FIELD_DESC);
                    oprot.writeI32(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(join_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logException != null) {
                    oprot.writeFieldBegin(join_result.LOG_EXCEPTION_FIELD_DESC);
                    struct.logException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class join_resultStandardSchemeFactory implements SchemeFactory {
            private join_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public join_resultStandardScheme getScheme() {
                return new join_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class join_resultTupleScheme extends TupleScheme<join_result> {
            private join_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, join_result struct) throws TException {
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
            public void write(TProtocol prot, join_result struct) throws TException {
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
        public static class join_resultTupleSchemeFactory implements SchemeFactory {
            private join_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public join_resultTupleScheme getScheme() {
                return new join_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new join_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new join_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOG_EXCEPTION, (_Fields) new FieldMetaData("logException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(join_result.class, unmodifiableMap);
        }

        public join_result() {
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
            if (that != null && (that instanceof join_result)) {
                return equals((join_result) that);
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

        public join_result setLogException(BELogicException logException) {
            this.logException = logException;
            return this;
        }

        public void setLogExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logException = null;
        }

        public join_result setSuccess(int success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public join_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("join_result(");
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
            sb2.append(pn.j.f81007d);
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
        public int compareTo(join_result other) {
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
        public TBase<join_result, _Fields> deepCopy2() {
            return new join_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$join_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$join_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$join_result$_Fields[field.ordinal()];
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

        public join_result(int success, BESystemException sysException, BELogicException logException) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.sysException = sysException;
            this.logException = logException;
        }

        public boolean equals(join_result that) {
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

        public join_result(join_result other) {
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
    public static class match_args implements TBase<match_args, _Fields>, Serializable, Cloneable, Comparable<match_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BBSelectInfo select_info;
        private static final TStruct STRUCT_DESC = new TStruct("match_args");
        private static final TField SELECT_INFO_FIELD_DESC = new TField("select_info", (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SELECT_INFO(1, "select_info");

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
                return SELECT_INFO;
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
        public static class match_argsStandardScheme extends StandardScheme<match_args> {
            private match_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, match_args struct) throws TException {
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
                        BBSelectInfo bBSelectInfo = new BBSelectInfo();
                        struct.select_info = bBSelectInfo;
                        bBSelectInfo.read(iprot);
                        struct.setSelect_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, match_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(match_args.STRUCT_DESC);
                if (struct.select_info != null) {
                    oprot.writeFieldBegin(match_args.SELECT_INFO_FIELD_DESC);
                    struct.select_info.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class match_argsStandardSchemeFactory implements SchemeFactory {
            private match_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public match_argsStandardScheme getScheme() {
                return new match_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class match_argsTupleScheme extends TupleScheme<match_args> {
            private match_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, match_args struct) throws TException {
                BBSelectInfo bBSelectInfo = new BBSelectInfo();
                struct.select_info = bBSelectInfo;
                bBSelectInfo.read((TTupleProtocol) prot);
                struct.setSelect_infoIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, match_args struct) throws TException {
                struct.select_info.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class match_argsTupleSchemeFactory implements SchemeFactory {
            private match_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public match_argsTupleScheme getScheme() {
                return new match_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new match_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new match_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SELECT_INFO, (_Fields) new FieldMetaData("select_info", (byte) 1, new StructMetaData((byte) 12, BBSelectInfo.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(match_args.class, unmodifiableMap);
        }

        public match_args() {
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
            this.select_info = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof match_args)) {
                return equals((match_args) that);
            }
            return false;
        }

        public BBSelectInfo getSelect_info() {
            return this.select_info;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetSelect_info() {
            return this.select_info != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public match_args setSelect_info(BBSelectInfo select_info) {
            this.select_info = select_info;
            return this;
        }

        public void setSelect_infoIsSet(boolean value) {
            if (value) {
                return;
            }
            this.select_info = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("match_args(");
            sb2.append("select_info:");
            BBSelectInfo bBSelectInfo = this.select_info;
            if (bBSelectInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBSelectInfo);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetSelect_info() {
            this.select_info = null;
        }

        public void validate() throws TException {
            BBSelectInfo bBSelectInfo = this.select_info;
            if (bBSelectInfo != null) {
                if (bBSelectInfo != null) {
                    bBSelectInfo.validate();
                }
            } else {
                throw new TProtocolException("Required field 'select_info' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public match_args(BBSelectInfo select_info) {
            this();
            this.select_info = select_info;
        }

        @Override // java.lang.Comparable
        public int compareTo(match_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetSelect_info()).compareTo(Boolean.valueOf(other.isSetSelect_info()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetSelect_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.select_info, (Comparable) other.select_info)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<match_args, _Fields> deepCopy2() {
            return new match_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$match_args$_Fields[field.ordinal()] == 1) {
                return getSelect_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$match_args$_Fields[field.ordinal()] == 1) {
                return isSetSelect_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$match_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetSelect_info();
            } else {
                setSelect_info((BBSelectInfo) value);
            }
        }

        public boolean equals(match_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetSelect_info = isSetSelect_info();
            boolean isSetSelect_info2 = that.isSetSelect_info();
            if (isSetSelect_info || isSetSelect_info2) {
                return isSetSelect_info && isSetSelect_info2 && this.select_info.equals(that.select_info);
            }
            return true;
        }

        public match_args(match_args other) {
            if (other.isSetSelect_info()) {
                this.select_info = new BBSelectInfo(other.select_info);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class match_result implements TBase<match_result, _Fields>, Serializable, Cloneable, Comparable<match_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logException;
        public BBMatchInfo success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("match_result");
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
        public static class match_resultStandardScheme extends StandardScheme<match_result> {
            private match_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, match_result struct) throws TException {
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
                        BBMatchInfo bBMatchInfo = new BBMatchInfo();
                        struct.success = bBMatchInfo;
                        bBMatchInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, match_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(match_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(match_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(match_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logException != null) {
                    oprot.writeFieldBegin(match_result.LOG_EXCEPTION_FIELD_DESC);
                    struct.logException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class match_resultStandardSchemeFactory implements SchemeFactory {
            private match_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public match_resultStandardScheme getScheme() {
                return new match_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class match_resultTupleScheme extends TupleScheme<match_result> {
            private match_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, match_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    BBMatchInfo bBMatchInfo = new BBMatchInfo();
                    struct.success = bBMatchInfo;
                    bBMatchInfo.read(tTupleProtocol);
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
            public void write(TProtocol prot, match_result struct) throws TException {
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
        public static class match_resultTupleSchemeFactory implements SchemeFactory {
            private match_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public match_resultTupleScheme getScheme() {
                return new match_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new match_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new match_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, BBMatchInfo.class)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOG_EXCEPTION, (_Fields) new FieldMetaData("logException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(match_result.class, unmodifiableMap);
        }

        public match_result() {
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
            if (that != null && (that instanceof match_result)) {
                return equals((match_result) that);
            }
            return false;
        }

        public BELogicException getLogException() {
            return this.logException;
        }

        public BBMatchInfo getSuccess() {
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

        public match_result setLogException(BELogicException logException) {
            this.logException = logException;
            return this;
        }

        public void setLogExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logException = null;
        }

        public match_result setSuccess(BBMatchInfo success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public match_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("match_result(");
            sb2.append("success:");
            BBMatchInfo bBMatchInfo = this.success;
            if (bBMatchInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBMatchInfo);
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
            sb2.append(pn.j.f81007d);
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
            BBMatchInfo bBMatchInfo = this.success;
            if (bBMatchInfo != null) {
                bBMatchInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public match_result(BBMatchInfo success, BESystemException sysException, BELogicException logException) {
            this();
            this.success = success;
            this.sysException = sysException;
            this.logException = logException;
        }

        @Override // java.lang.Comparable
        public int compareTo(match_result other) {
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
        public TBase<match_result, _Fields> deepCopy2() {
            return new match_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$match_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$match_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$match_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((BBMatchInfo) value);
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

        public boolean equals(match_result that) {
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

        public match_result(match_result other) {
            if (other.isSetSuccess()) {
                this.success = new BBMatchInfo(other.success);
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
    public static class problem_args implements TBase<problem_args, _Fields>, Serializable, Cloneable, Comparable<problem_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public String fight_id;
        public BBUserInfo user_info;
        private static final TStruct STRUCT_DESC = new TStruct("problem_args");
        private static final TField USER_INFO_FIELD_DESC = new TField(i9.m.f60424b, (byte) 12, 1);
        private static final TField FIGHT_ID_FIELD_DESC = new TField("fight_id", (byte) 11, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            USER_INFO(1, i9.m.f60424b),
            FIGHT_ID(2, "fight_id");

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
                    return USER_INFO;
                }
                if (fieldId != 2) {
                    return null;
                }
                return FIGHT_ID;
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
        public static class problem_argsStandardScheme extends StandardScheme<problem_args> {
            private problem_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, problem_args struct) throws TException {
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
                        } else if (b11 == 11) {
                            struct.fight_id = iprot.readString();
                            struct.setFight_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        BBUserInfo bBUserInfo = new BBUserInfo();
                        struct.user_info = bBUserInfo;
                        bBUserInfo.read(iprot);
                        struct.setUser_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, problem_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(problem_args.STRUCT_DESC);
                if (struct.user_info != null) {
                    oprot.writeFieldBegin(problem_args.USER_INFO_FIELD_DESC);
                    struct.user_info.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.fight_id != null) {
                    oprot.writeFieldBegin(problem_args.FIGHT_ID_FIELD_DESC);
                    oprot.writeString(struct.fight_id);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class problem_argsStandardSchemeFactory implements SchemeFactory {
            private problem_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public problem_argsStandardScheme getScheme() {
                return new problem_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class problem_argsTupleScheme extends TupleScheme<problem_args> {
            private problem_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, problem_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BBUserInfo bBUserInfo = new BBUserInfo();
                struct.user_info = bBUserInfo;
                bBUserInfo.read(tTupleProtocol);
                struct.setUser_infoIsSet(true);
                if (tTupleProtocol.readBitSet(1).get(0)) {
                    struct.fight_id = tTupleProtocol.readString();
                    struct.setFight_idIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, problem_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.user_info.write(tTupleProtocol);
                BitSet bitSet = new BitSet();
                if (struct.isSetFight_id()) {
                    bitSet.set(0);
                }
                tTupleProtocol.writeBitSet(bitSet, 1);
                if (struct.isSetFight_id()) {
                    tTupleProtocol.writeString(struct.fight_id);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class problem_argsTupleSchemeFactory implements SchemeFactory {
            private problem_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public problem_argsTupleScheme getScheme() {
                return new problem_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new problem_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new problem_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.USER_INFO, (_Fields) new FieldMetaData(i9.m.f60424b, (byte) 1, new StructMetaData((byte) 12, BBUserInfo.class)));
            enumMap.put((EnumMap) _Fields.FIGHT_ID, (_Fields) new FieldMetaData("fight_id", (byte) 3, new FieldValueMetaData((byte) 11)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(problem_args.class, unmodifiableMap);
        }

        public problem_args() {
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
            this.user_info = null;
            this.fight_id = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof problem_args)) {
                return equals((problem_args) that);
            }
            return false;
        }

        public String getFight_id() {
            return this.fight_id;
        }

        public BBUserInfo getUser_info() {
            return this.user_info;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetFight_id() {
            return this.fight_id != null;
        }

        public boolean isSetUser_info() {
            return this.user_info != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public problem_args setFight_id(String fight_id) {
            this.fight_id = fight_id;
            return this;
        }

        public void setFight_idIsSet(boolean value) {
            if (value) {
                return;
            }
            this.fight_id = null;
        }

        public problem_args setUser_info(BBUserInfo user_info) {
            this.user_info = user_info;
            return this;
        }

        public void setUser_infoIsSet(boolean value) {
            if (value) {
                return;
            }
            this.user_info = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("problem_args(");
            sb2.append("user_info:");
            BBUserInfo bBUserInfo = this.user_info;
            if (bBUserInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBUserInfo);
            }
            sb2.append(j2.O);
            sb2.append("fight_id:");
            String str = this.fight_id;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetFight_id() {
            this.fight_id = null;
        }

        public void unsetUser_info() {
            this.user_info = null;
        }

        public void validate() throws TException {
            BBUserInfo bBUserInfo = this.user_info;
            if (bBUserInfo != null) {
                if (bBUserInfo != null) {
                    bBUserInfo.validate();
                }
            } else {
                throw new TProtocolException("Required field 'user_info' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public problem_args(BBUserInfo user_info, String fight_id) {
            this();
            this.user_info = user_info;
            this.fight_id = fight_id;
        }

        @Override // java.lang.Comparable
        public int compareTo(problem_args other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetUser_info()).compareTo(Boolean.valueOf(other.isSetUser_info()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetUser_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.user_info, (Comparable) other.user_info)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetFight_id()).compareTo(Boolean.valueOf(other.isSetFight_id()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetFight_id() || (compareTo = TBaseHelper.compareTo(this.fight_id, other.fight_id)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<problem_args, _Fields> deepCopy2() {
            return new problem_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$problem_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getUser_info();
            }
            if (i11 == 2) {
                return getFight_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$problem_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetUser_info();
            }
            if (i11 == 2) {
                return isSetFight_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$problem_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetUser_info();
                    return;
                } else {
                    setUser_info((BBUserInfo) value);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetFight_id();
            } else {
                setFight_id((String) value);
            }
        }

        public boolean equals(problem_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetUser_info = isSetUser_info();
            boolean isSetUser_info2 = that.isSetUser_info();
            if ((isSetUser_info || isSetUser_info2) && !(isSetUser_info && isSetUser_info2 && this.user_info.equals(that.user_info))) {
                return false;
            }
            boolean isSetFight_id = isSetFight_id();
            boolean isSetFight_id2 = that.isSetFight_id();
            if (isSetFight_id || isSetFight_id2) {
                return isSetFight_id && isSetFight_id2 && this.fight_id.equals(that.fight_id);
            }
            return true;
        }

        public problem_args(problem_args other) {
            if (other.isSetUser_info()) {
                this.user_info = new BBUserInfo(other.user_info);
            }
            if (other.isSetFight_id()) {
                this.fight_id = other.fight_id;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class problem_result implements TBase<problem_result, _Fields>, Serializable, Cloneable, Comparable<problem_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logException;
        public List<BBProblem> success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("problem_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
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
        public static class problem_resultStandardScheme extends StandardScheme<problem_result> {
            private problem_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, problem_result struct) throws TException {
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
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.success = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            BBProblem bBProblem = new BBProblem();
                            bBProblem.read(iprot);
                            struct.success.add(bBProblem);
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
            public void write(TProtocol oprot, problem_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(problem_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(problem_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<BBProblem> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(problem_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logException != null) {
                    oprot.writeFieldBegin(problem_result.LOG_EXCEPTION_FIELD_DESC);
                    struct.logException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class problem_resultStandardSchemeFactory implements SchemeFactory {
            private problem_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public problem_resultStandardScheme getScheme() {
                return new problem_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class problem_resultTupleScheme extends TupleScheme<problem_result> {
            private problem_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, problem_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        BBProblem bBProblem = new BBProblem();
                        bBProblem.read(tTupleProtocol);
                        struct.success.add(bBProblem);
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
                    struct.logException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, problem_result struct) throws TException {
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
                    tTupleProtocol.writeI32(struct.success.size());
                    Iterator<BBProblem> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(tTupleProtocol);
                    }
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
        public static class problem_resultTupleSchemeFactory implements SchemeFactory {
            private problem_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public problem_resultTupleScheme getScheme() {
                return new problem_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new problem_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new problem_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BBProblem.class))));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOG_EXCEPTION, (_Fields) new FieldMetaData("logException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(problem_result.class, unmodifiableMap);
        }

        public problem_result() {
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

        public void addToSuccess(BBProblem elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.sysException = null;
            this.logException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof problem_result)) {
                return equals((problem_result) that);
            }
            return false;
        }

        public BELogicException getLogException() {
            return this.logException;
        }

        public List<BBProblem> getSuccess() {
            return this.success;
        }

        public Iterator<BBProblem> getSuccessIterator() {
            List<BBProblem> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<BBProblem> list = this.success;
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

        public problem_result setLogException(BELogicException logException) {
            this.logException = logException;
            return this;
        }

        public void setLogExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logException = null;
        }

        public problem_result setSuccess(List<BBProblem> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public problem_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("problem_result(");
            sb2.append("success:");
            List<BBProblem> list = this.success;
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
            sb2.append("logException:");
            BELogicException bELogicException = this.logException;
            if (bELogicException == null) {
                sb2.append("null");
            } else {
                sb2.append(bELogicException);
            }
            sb2.append(pn.j.f81007d);
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

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public problem_result(List<BBProblem> success, BESystemException sysException, BELogicException logException) {
            this();
            this.success = success;
            this.sysException = sysException;
            this.logException = logException;
        }

        @Override // java.lang.Comparable
        public int compareTo(problem_result other) {
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
        public TBase<problem_result, _Fields> deepCopy2() {
            return new problem_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$problem_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$problem_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$problem_result$_Fields[field.ordinal()];
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
                unsetLogException();
            } else {
                setLogException((BELogicException) value);
            }
        }

        public boolean equals(problem_result that) {
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

        public problem_result(problem_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<BBProblem> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BBProblem(it.next()));
                }
                this.success = arrayList;
            }
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
    public static class promotion_args implements TBase<promotion_args, _Fields>, Serializable, Cloneable, Comparable<promotion_args> {
        private static final TStruct STRUCT_DESC = new TStruct("promotion_args");
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
        public static class promotion_argsStandardScheme extends StandardScheme<promotion_args> {
            private promotion_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, promotion_args struct) throws TException {
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
            public void write(TProtocol oprot, promotion_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(promotion_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class promotion_argsStandardSchemeFactory implements SchemeFactory {
            private promotion_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public promotion_argsStandardScheme getScheme() {
                return new promotion_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class promotion_argsTupleScheme extends TupleScheme<promotion_args> {
            private promotion_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, promotion_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, promotion_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class promotion_argsTupleSchemeFactory implements SchemeFactory {
            private promotion_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public promotion_argsTupleScheme getScheme() {
                return new promotion_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new promotion_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new promotion_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(promotion_args.class, unmodifiableMap);
        }

        public promotion_args() {
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

        public boolean equals(promotion_args that) {
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
            return "promotion_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public promotion_args(promotion_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(promotion_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<promotion_args, _Fields> deepCopy2() {
            return new promotion_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof promotion_args)) {
                return equals((promotion_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$promotion_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$promotion_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$promotion_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class promotion_result implements TBase<promotion_result, _Fields>, Serializable, Cloneable, Comparable<promotion_result> {
        private static final TStruct STRUCT_DESC = new TStruct("promotion_result");
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
        public static class promotion_resultStandardScheme extends StandardScheme<promotion_result> {
            private promotion_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, promotion_result struct) throws TException {
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
            public void write(TProtocol oprot, promotion_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(promotion_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(promotion_result.SUCCESS_FIELD_DESC);
                    oprot.writeString(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(promotion_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class promotion_resultStandardSchemeFactory implements SchemeFactory {
            private promotion_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public promotion_resultStandardScheme getScheme() {
                return new promotion_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class promotion_resultTupleScheme extends TupleScheme<promotion_result> {
            private promotion_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, promotion_result struct) throws TException {
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
            public void write(TProtocol prot, promotion_result struct) throws TException {
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
        public static class promotion_resultTupleSchemeFactory implements SchemeFactory {
            private promotion_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public promotion_resultTupleScheme getScheme() {
                return new promotion_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new promotion_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new promotion_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 11)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(promotion_result.class, unmodifiableMap);
        }

        public promotion_result() {
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
            if (that != null && (that instanceof promotion_result)) {
                return equals((promotion_result) that);
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

        public promotion_result setSuccess(String success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public promotion_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("promotion_result(");
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
            sb2.append(pn.j.f81007d);
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

        public promotion_result(String success, BESystemException sysException) {
            this();
            this.success = success;
            this.sysException = sysException;
        }

        @Override // java.lang.Comparable
        public int compareTo(promotion_result other) {
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
        public TBase<promotion_result, _Fields> deepCopy2() {
            return new promotion_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$promotion_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$promotion_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$promotion_result$_Fields[field.ordinal()];
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

        public boolean equals(promotion_result that) {
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

        public promotion_result(promotion_result other) {
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
    public static class random_match_args implements TBase<random_match_args, _Fields>, Serializable, Cloneable, Comparable<random_match_args> {
        private static final TStruct STRUCT_DESC = new TStruct("random_match_args");
        private static final TField USER_INFO_FIELD_DESC = new TField(i9.m.f60424b, (byte) 12, 1);
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BBUserInfo user_info;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            USER_INFO(1, i9.m.f60424b);

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
                return USER_INFO;
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
        public static class random_match_argsStandardScheme extends StandardScheme<random_match_args> {
            private random_match_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, random_match_args struct) throws TException {
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
                        BBUserInfo bBUserInfo = new BBUserInfo();
                        struct.user_info = bBUserInfo;
                        bBUserInfo.read(iprot);
                        struct.setUser_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, random_match_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(random_match_args.STRUCT_DESC);
                if (struct.user_info != null) {
                    oprot.writeFieldBegin(random_match_args.USER_INFO_FIELD_DESC);
                    struct.user_info.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class random_match_argsStandardSchemeFactory implements SchemeFactory {
            private random_match_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public random_match_argsStandardScheme getScheme() {
                return new random_match_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class random_match_argsTupleScheme extends TupleScheme<random_match_args> {
            private random_match_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, random_match_args struct) throws TException {
                BBUserInfo bBUserInfo = new BBUserInfo();
                struct.user_info = bBUserInfo;
                bBUserInfo.read((TTupleProtocol) prot);
                struct.setUser_infoIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, random_match_args struct) throws TException {
                struct.user_info.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class random_match_argsTupleSchemeFactory implements SchemeFactory {
            private random_match_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public random_match_argsTupleScheme getScheme() {
                return new random_match_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new random_match_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new random_match_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.USER_INFO, (_Fields) new FieldMetaData(i9.m.f60424b, (byte) 1, new StructMetaData((byte) 12, BBUserInfo.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(random_match_args.class, unmodifiableMap);
        }

        public random_match_args() {
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
            this.user_info = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof random_match_args)) {
                return equals((random_match_args) that);
            }
            return false;
        }

        public BBUserInfo getUser_info() {
            return this.user_info;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetUser_info() {
            return this.user_info != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public random_match_args setUser_info(BBUserInfo user_info) {
            this.user_info = user_info;
            return this;
        }

        public void setUser_infoIsSet(boolean value) {
            if (value) {
                return;
            }
            this.user_info = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("random_match_args(");
            sb2.append("user_info:");
            BBUserInfo bBUserInfo = this.user_info;
            if (bBUserInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBUserInfo);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetUser_info() {
            this.user_info = null;
        }

        public void validate() throws TException {
            BBUserInfo bBUserInfo = this.user_info;
            if (bBUserInfo != null) {
                if (bBUserInfo != null) {
                    bBUserInfo.validate();
                }
            } else {
                throw new TProtocolException("Required field 'user_info' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public random_match_args(BBUserInfo user_info) {
            this();
            this.user_info = user_info;
        }

        @Override // java.lang.Comparable
        public int compareTo(random_match_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetUser_info()).compareTo(Boolean.valueOf(other.isSetUser_info()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetUser_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.user_info, (Comparable) other.user_info)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<random_match_args, _Fields> deepCopy2() {
            return new random_match_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$random_match_args$_Fields[field.ordinal()] == 1) {
                return getUser_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$random_match_args$_Fields[field.ordinal()] == 1) {
                return isSetUser_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$random_match_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetUser_info();
            } else {
                setUser_info((BBUserInfo) value);
            }
        }

        public boolean equals(random_match_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetUser_info = isSetUser_info();
            boolean isSetUser_info2 = that.isSetUser_info();
            if (isSetUser_info || isSetUser_info2) {
                return isSetUser_info && isSetUser_info2 && this.user_info.equals(that.user_info);
            }
            return true;
        }

        public random_match_args(random_match_args other) {
            if (other.isSetUser_info()) {
                this.user_info = new BBUserInfo(other.user_info);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class random_match_result implements TBase<random_match_result, _Fields>, Serializable, Cloneable, Comparable<random_match_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logException;
        public BBRandomMatchInfo success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("random_match_result");
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
        public static class random_match_resultStandardScheme extends StandardScheme<random_match_result> {
            private random_match_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, random_match_result struct) throws TException {
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
                        BBRandomMatchInfo bBRandomMatchInfo = new BBRandomMatchInfo();
                        struct.success = bBRandomMatchInfo;
                        bBRandomMatchInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, random_match_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(random_match_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(random_match_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(random_match_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logException != null) {
                    oprot.writeFieldBegin(random_match_result.LOG_EXCEPTION_FIELD_DESC);
                    struct.logException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class random_match_resultStandardSchemeFactory implements SchemeFactory {
            private random_match_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public random_match_resultStandardScheme getScheme() {
                return new random_match_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class random_match_resultTupleScheme extends TupleScheme<random_match_result> {
            private random_match_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, random_match_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    BBRandomMatchInfo bBRandomMatchInfo = new BBRandomMatchInfo();
                    struct.success = bBRandomMatchInfo;
                    bBRandomMatchInfo.read(tTupleProtocol);
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
            public void write(TProtocol prot, random_match_result struct) throws TException {
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
        public static class random_match_resultTupleSchemeFactory implements SchemeFactory {
            private random_match_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public random_match_resultTupleScheme getScheme() {
                return new random_match_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new random_match_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new random_match_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, BBRandomMatchInfo.class)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOG_EXCEPTION, (_Fields) new FieldMetaData("logException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(random_match_result.class, unmodifiableMap);
        }

        public random_match_result() {
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
            if (that != null && (that instanceof random_match_result)) {
                return equals((random_match_result) that);
            }
            return false;
        }

        public BELogicException getLogException() {
            return this.logException;
        }

        public BBRandomMatchInfo getSuccess() {
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

        public random_match_result setLogException(BELogicException logException) {
            this.logException = logException;
            return this;
        }

        public void setLogExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logException = null;
        }

        public random_match_result setSuccess(BBRandomMatchInfo success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public random_match_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("random_match_result(");
            sb2.append("success:");
            BBRandomMatchInfo bBRandomMatchInfo = this.success;
            if (bBRandomMatchInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBRandomMatchInfo);
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
            sb2.append(pn.j.f81007d);
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
            BBRandomMatchInfo bBRandomMatchInfo = this.success;
            if (bBRandomMatchInfo != null) {
                bBRandomMatchInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public random_match_result(BBRandomMatchInfo success, BESystemException sysException, BELogicException logException) {
            this();
            this.success = success;
            this.sysException = sysException;
            this.logException = logException;
        }

        @Override // java.lang.Comparable
        public int compareTo(random_match_result other) {
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
        public TBase<random_match_result, _Fields> deepCopy2() {
            return new random_match_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$random_match_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$random_match_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$random_match_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((BBRandomMatchInfo) value);
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

        public boolean equals(random_match_result that) {
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

        public random_match_result(random_match_result other) {
            if (other.isSetSuccess()) {
                this.success = new BBRandomMatchInfo(other.success);
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
    public static class rank_args implements TBase<rank_args, _Fields>, Serializable, Cloneable, Comparable<rank_args> {
        private static final TStruct STRUCT_DESC = new TStruct("rank_args");
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
        public static class rank_argsStandardScheme extends StandardScheme<rank_args> {
            private rank_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, rank_args struct) throws TException {
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
            public void write(TProtocol oprot, rank_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(rank_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class rank_argsStandardSchemeFactory implements SchemeFactory {
            private rank_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public rank_argsStandardScheme getScheme() {
                return new rank_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class rank_argsTupleScheme extends TupleScheme<rank_args> {
            private rank_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, rank_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, rank_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class rank_argsTupleSchemeFactory implements SchemeFactory {
            private rank_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public rank_argsTupleScheme getScheme() {
                return new rank_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new rank_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new rank_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(rank_args.class, unmodifiableMap);
        }

        public rank_args() {
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

        public boolean equals(rank_args that) {
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
            return "rank_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public rank_args(rank_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(rank_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<rank_args, _Fields> deepCopy2() {
            return new rank_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof rank_args)) {
                return equals((rank_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$rank_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$rank_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$rank_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class rank_result implements TBase<rank_result, _Fields>, Serializable, Cloneable, Comparable<rank_result> {
        private static final TStruct STRUCT_DESC = new TStruct("rank_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public List<BBRankInfo> success;
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
        public static class rank_resultStandardScheme extends StandardScheme<rank_result> {
            private rank_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, rank_result struct) throws TException {
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
                            BBRankInfo bBRankInfo = new BBRankInfo();
                            bBRankInfo.read(iprot);
                            struct.success.add(bBRankInfo);
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
            public void write(TProtocol oprot, rank_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(rank_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(rank_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<BBRankInfo> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(rank_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class rank_resultStandardSchemeFactory implements SchemeFactory {
            private rank_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public rank_resultStandardScheme getScheme() {
                return new rank_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class rank_resultTupleScheme extends TupleScheme<rank_result> {
            private rank_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, rank_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(2);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        BBRankInfo bBRankInfo = new BBRankInfo();
                        bBRankInfo.read(tTupleProtocol);
                        struct.success.add(bBRankInfo);
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
            public void write(TProtocol prot, rank_result struct) throws TException {
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
                    Iterator<BBRankInfo> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(tTupleProtocol);
                    }
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class rank_resultTupleSchemeFactory implements SchemeFactory {
            private rank_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public rank_resultTupleScheme getScheme() {
                return new rank_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new rank_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new rank_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BBRankInfo.class))));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(rank_result.class, unmodifiableMap);
        }

        public rank_result() {
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

        public void addToSuccess(BBRankInfo elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.sysException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof rank_result)) {
                return equals((rank_result) that);
            }
            return false;
        }

        public List<BBRankInfo> getSuccess() {
            return this.success;
        }

        public Iterator<BBRankInfo> getSuccessIterator() {
            List<BBRankInfo> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<BBRankInfo> list = this.success;
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

        public rank_result setSuccess(List<BBRankInfo> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public rank_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("rank_result(");
            sb2.append("success:");
            List<BBRankInfo> list = this.success;
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
            sb2.append(pn.j.f81007d);
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

        public rank_result(List<BBRankInfo> success, BESystemException sysException) {
            this();
            this.success = success;
            this.sysException = sysException;
        }

        @Override // java.lang.Comparable
        public int compareTo(rank_result other) {
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
        public TBase<rank_result, _Fields> deepCopy2() {
            return new rank_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$rank_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$rank_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$rank_result$_Fields[field.ordinal()];
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

        public boolean equals(rank_result that) {
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

        public rank_result(rank_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<BBRankInfo> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BBRankInfo(it.next()));
                }
                this.success = arrayList;
            }
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ready_args implements TBase<ready_args, _Fields>, Serializable, Cloneable, Comparable<ready_args> {
        private static final TStruct STRUCT_DESC = new TStruct("ready_args");
        private static final TField USER_INFO_FIELD_DESC = new TField(i9.m.f60424b, (byte) 12, 1);
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BBUserInfo user_info;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            USER_INFO(1, i9.m.f60424b);

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
                return USER_INFO;
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
        public static class ready_argsStandardScheme extends StandardScheme<ready_args> {
            private ready_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, ready_args struct) throws TException {
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
                        BBUserInfo bBUserInfo = new BBUserInfo();
                        struct.user_info = bBUserInfo;
                        bBUserInfo.read(iprot);
                        struct.setUser_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, ready_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(ready_args.STRUCT_DESC);
                if (struct.user_info != null) {
                    oprot.writeFieldBegin(ready_args.USER_INFO_FIELD_DESC);
                    struct.user_info.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ready_argsStandardSchemeFactory implements SchemeFactory {
            private ready_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public ready_argsStandardScheme getScheme() {
                return new ready_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ready_argsTupleScheme extends TupleScheme<ready_args> {
            private ready_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, ready_args struct) throws TException {
                BBUserInfo bBUserInfo = new BBUserInfo();
                struct.user_info = bBUserInfo;
                bBUserInfo.read((TTupleProtocol) prot);
                struct.setUser_infoIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, ready_args struct) throws TException {
                struct.user_info.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ready_argsTupleSchemeFactory implements SchemeFactory {
            private ready_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public ready_argsTupleScheme getScheme() {
                return new ready_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new ready_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new ready_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.USER_INFO, (_Fields) new FieldMetaData(i9.m.f60424b, (byte) 1, new StructMetaData((byte) 12, BBUserInfo.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(ready_args.class, unmodifiableMap);
        }

        public ready_args() {
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
            this.user_info = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof ready_args)) {
                return equals((ready_args) that);
            }
            return false;
        }

        public BBUserInfo getUser_info() {
            return this.user_info;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetUser_info() {
            return this.user_info != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public ready_args setUser_info(BBUserInfo user_info) {
            this.user_info = user_info;
            return this;
        }

        public void setUser_infoIsSet(boolean value) {
            if (value) {
                return;
            }
            this.user_info = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ready_args(");
            sb2.append("user_info:");
            BBUserInfo bBUserInfo = this.user_info;
            if (bBUserInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBUserInfo);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetUser_info() {
            this.user_info = null;
        }

        public void validate() throws TException {
            BBUserInfo bBUserInfo = this.user_info;
            if (bBUserInfo != null) {
                if (bBUserInfo != null) {
                    bBUserInfo.validate();
                }
            } else {
                throw new TProtocolException("Required field 'user_info' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public ready_args(BBUserInfo user_info) {
            this();
            this.user_info = user_info;
        }

        @Override // java.lang.Comparable
        public int compareTo(ready_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetUser_info()).compareTo(Boolean.valueOf(other.isSetUser_info()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetUser_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.user_info, (Comparable) other.user_info)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<ready_args, _Fields> deepCopy2() {
            return new ready_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$ready_args$_Fields[field.ordinal()] == 1) {
                return getUser_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$ready_args$_Fields[field.ordinal()] == 1) {
                return isSetUser_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$ready_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetUser_info();
            } else {
                setUser_info((BBUserInfo) value);
            }
        }

        public boolean equals(ready_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetUser_info = isSetUser_info();
            boolean isSetUser_info2 = that.isSetUser_info();
            if (isSetUser_info || isSetUser_info2) {
                return isSetUser_info && isSetUser_info2 && this.user_info.equals(that.user_info);
            }
            return true;
        }

        public ready_args(ready_args other) {
            if (other.isSetUser_info()) {
                this.user_info = new BBUserInfo(other.user_info);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ready_result implements TBase<ready_result, _Fields>, Serializable, Cloneable, Comparable<ready_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logException;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("ready_result");
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
        public static class ready_resultStandardScheme extends StandardScheme<ready_result> {
            private ready_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, ready_result struct) throws TException {
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
            public void write(TProtocol oprot, ready_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(ready_result.STRUCT_DESC);
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(ready_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logException != null) {
                    oprot.writeFieldBegin(ready_result.LOG_EXCEPTION_FIELD_DESC);
                    struct.logException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ready_resultStandardSchemeFactory implements SchemeFactory {
            private ready_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public ready_resultStandardScheme getScheme() {
                return new ready_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ready_resultTupleScheme extends TupleScheme<ready_result> {
            private ready_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, ready_result struct) throws TException {
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
            public void write(TProtocol prot, ready_result struct) throws TException {
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
        public static class ready_resultTupleSchemeFactory implements SchemeFactory {
            private ready_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public ready_resultTupleScheme getScheme() {
                return new ready_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new ready_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new ready_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOG_EXCEPTION, (_Fields) new FieldMetaData("logException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(ready_result.class, unmodifiableMap);
        }

        public ready_result() {
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
            if (that != null && (that instanceof ready_result)) {
                return equals((ready_result) that);
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

        public ready_result setLogException(BELogicException logException) {
            this.logException = logException;
            return this;
        }

        public void setLogExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logException = null;
        }

        public ready_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("ready_result(");
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
            sb2.append(pn.j.f81007d);
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

        public ready_result(BESystemException sysException, BELogicException logException) {
            this();
            this.sysException = sysException;
            this.logException = logException;
        }

        @Override // java.lang.Comparable
        public int compareTo(ready_result other) {
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
        public TBase<ready_result, _Fields> deepCopy2() {
            return new ready_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$ready_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$ready_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$ready_result$_Fields[field.ordinal()];
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

        public boolean equals(ready_result that) {
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

        public ready_result(ready_result other) {
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
    public static class result_args implements TBase<result_args, _Fields>, Serializable, Cloneable, Comparable<result_args> {
        private static final TStruct STRUCT_DESC = new TStruct("result_args");
        private static final TField USER_INFO_FIELD_DESC = new TField(i9.m.f60424b, (byte) 12, 1);
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BBUserInfo user_info;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            USER_INFO(1, i9.m.f60424b);

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
                return USER_INFO;
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
        public static class result_argsStandardScheme extends StandardScheme<result_args> {
            private result_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, result_args struct) throws TException {
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
                        BBUserInfo bBUserInfo = new BBUserInfo();
                        struct.user_info = bBUserInfo;
                        bBUserInfo.read(iprot);
                        struct.setUser_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, result_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(result_args.STRUCT_DESC);
                if (struct.user_info != null) {
                    oprot.writeFieldBegin(result_args.USER_INFO_FIELD_DESC);
                    struct.user_info.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class result_argsStandardSchemeFactory implements SchemeFactory {
            private result_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public result_argsStandardScheme getScheme() {
                return new result_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class result_argsTupleScheme extends TupleScheme<result_args> {
            private result_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, result_args struct) throws TException {
                BBUserInfo bBUserInfo = new BBUserInfo();
                struct.user_info = bBUserInfo;
                bBUserInfo.read((TTupleProtocol) prot);
                struct.setUser_infoIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, result_args struct) throws TException {
                struct.user_info.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class result_argsTupleSchemeFactory implements SchemeFactory {
            private result_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public result_argsTupleScheme getScheme() {
                return new result_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new result_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new result_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.USER_INFO, (_Fields) new FieldMetaData(i9.m.f60424b, (byte) 1, new StructMetaData((byte) 12, BBUserInfo.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(result_args.class, unmodifiableMap);
        }

        public result_args() {
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
            this.user_info = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof result_args)) {
                return equals((result_args) that);
            }
            return false;
        }

        public BBUserInfo getUser_info() {
            return this.user_info;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetUser_info() {
            return this.user_info != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public result_args setUser_info(BBUserInfo user_info) {
            this.user_info = user_info;
            return this;
        }

        public void setUser_infoIsSet(boolean value) {
            if (value) {
                return;
            }
            this.user_info = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("result_args(");
            sb2.append("user_info:");
            BBUserInfo bBUserInfo = this.user_info;
            if (bBUserInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBUserInfo);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetUser_info() {
            this.user_info = null;
        }

        public void validate() throws TException {
            BBUserInfo bBUserInfo = this.user_info;
            if (bBUserInfo != null) {
                if (bBUserInfo != null) {
                    bBUserInfo.validate();
                }
            } else {
                throw new TProtocolException("Required field 'user_info' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public result_args(BBUserInfo user_info) {
            this();
            this.user_info = user_info;
        }

        @Override // java.lang.Comparable
        public int compareTo(result_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetUser_info()).compareTo(Boolean.valueOf(other.isSetUser_info()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetUser_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.user_info, (Comparable) other.user_info)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<result_args, _Fields> deepCopy2() {
            return new result_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$result_args$_Fields[field.ordinal()] == 1) {
                return getUser_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$result_args$_Fields[field.ordinal()] == 1) {
                return isSetUser_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$result_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetUser_info();
            } else {
                setUser_info((BBUserInfo) value);
            }
        }

        public boolean equals(result_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetUser_info = isSetUser_info();
            boolean isSetUser_info2 = that.isSetUser_info();
            if (isSetUser_info || isSetUser_info2) {
                return isSetUser_info && isSetUser_info2 && this.user_info.equals(that.user_info);
            }
            return true;
        }

        public result_args(result_args other) {
            if (other.isSetUser_info()) {
                this.user_info = new BBUserInfo(other.user_info);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class result_result implements TBase<result_result, _Fields>, Serializable, Cloneable, Comparable<result_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logException;
        public BBResult success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("result_result");
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
        public static class result_resultStandardScheme extends StandardScheme<result_result> {
            private result_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, result_result struct) throws TException {
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
                        BBResult bBResult = new BBResult();
                        struct.success = bBResult;
                        bBResult.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, result_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(result_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(result_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(result_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logException != null) {
                    oprot.writeFieldBegin(result_result.LOG_EXCEPTION_FIELD_DESC);
                    struct.logException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class result_resultStandardSchemeFactory implements SchemeFactory {
            private result_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public result_resultStandardScheme getScheme() {
                return new result_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class result_resultTupleScheme extends TupleScheme<result_result> {
            private result_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, result_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    BBResult bBResult = new BBResult();
                    struct.success = bBResult;
                    bBResult.read(tTupleProtocol);
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
            public void write(TProtocol prot, result_result struct) throws TException {
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
        public static class result_resultTupleSchemeFactory implements SchemeFactory {
            private result_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public result_resultTupleScheme getScheme() {
                return new result_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new result_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new result_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, BBResult.class)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOG_EXCEPTION, (_Fields) new FieldMetaData("logException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(result_result.class, unmodifiableMap);
        }

        public result_result() {
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
            if (that != null && (that instanceof result_result)) {
                return equals((result_result) that);
            }
            return false;
        }

        public BELogicException getLogException() {
            return this.logException;
        }

        public BBResult getSuccess() {
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

        public result_result setLogException(BELogicException logException) {
            this.logException = logException;
            return this;
        }

        public void setLogExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logException = null;
        }

        public result_result setSuccess(BBResult success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public result_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("result_result(");
            sb2.append("success:");
            BBResult bBResult = this.success;
            if (bBResult == null) {
                sb2.append("null");
            } else {
                sb2.append(bBResult);
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
            sb2.append(pn.j.f81007d);
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
            BBResult bBResult = this.success;
            if (bBResult != null) {
                bBResult.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public result_result(BBResult success, BESystemException sysException, BELogicException logException) {
            this();
            this.success = success;
            this.sysException = sysException;
            this.logException = logException;
        }

        @Override // java.lang.Comparable
        public int compareTo(result_result other) {
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
        public TBase<result_result, _Fields> deepCopy2() {
            return new result_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$result_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$result_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$result_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((BBResult) value);
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

        public boolean equals(result_result that) {
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

        public result_result(result_result other) {
            if (other.isSetSuccess()) {
                this.success = new BBResult(other.success);
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
    public static class start_args implements TBase<start_args, _Fields>, Serializable, Cloneable, Comparable<start_args> {
        private static final TStruct STRUCT_DESC = new TStruct("start_args");
        private static final TField USER_INFO_FIELD_DESC = new TField(i9.m.f60424b, (byte) 12, 1);
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BBUserInfo user_info;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            USER_INFO(1, i9.m.f60424b);

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
                return USER_INFO;
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
        public static class start_argsStandardScheme extends StandardScheme<start_args> {
            private start_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, start_args struct) throws TException {
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
                        BBUserInfo bBUserInfo = new BBUserInfo();
                        struct.user_info = bBUserInfo;
                        bBUserInfo.read(iprot);
                        struct.setUser_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, start_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(start_args.STRUCT_DESC);
                if (struct.user_info != null) {
                    oprot.writeFieldBegin(start_args.USER_INFO_FIELD_DESC);
                    struct.user_info.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class start_argsStandardSchemeFactory implements SchemeFactory {
            private start_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public start_argsStandardScheme getScheme() {
                return new start_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class start_argsTupleScheme extends TupleScheme<start_args> {
            private start_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, start_args struct) throws TException {
                BBUserInfo bBUserInfo = new BBUserInfo();
                struct.user_info = bBUserInfo;
                bBUserInfo.read((TTupleProtocol) prot);
                struct.setUser_infoIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, start_args struct) throws TException {
                struct.user_info.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class start_argsTupleSchemeFactory implements SchemeFactory {
            private start_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public start_argsTupleScheme getScheme() {
                return new start_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new start_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new start_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.USER_INFO, (_Fields) new FieldMetaData(i9.m.f60424b, (byte) 1, new StructMetaData((byte) 12, BBUserInfo.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(start_args.class, unmodifiableMap);
        }

        public start_args() {
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
            this.user_info = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof start_args)) {
                return equals((start_args) that);
            }
            return false;
        }

        public BBUserInfo getUser_info() {
            return this.user_info;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetUser_info() {
            return this.user_info != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public start_args setUser_info(BBUserInfo user_info) {
            this.user_info = user_info;
            return this;
        }

        public void setUser_infoIsSet(boolean value) {
            if (value) {
                return;
            }
            this.user_info = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("start_args(");
            sb2.append("user_info:");
            BBUserInfo bBUserInfo = this.user_info;
            if (bBUserInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBUserInfo);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetUser_info() {
            this.user_info = null;
        }

        public void validate() throws TException {
            BBUserInfo bBUserInfo = this.user_info;
            if (bBUserInfo != null) {
                if (bBUserInfo != null) {
                    bBUserInfo.validate();
                }
            } else {
                throw new TProtocolException("Required field 'user_info' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public start_args(BBUserInfo user_info) {
            this();
            this.user_info = user_info;
        }

        @Override // java.lang.Comparable
        public int compareTo(start_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetUser_info()).compareTo(Boolean.valueOf(other.isSetUser_info()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetUser_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.user_info, (Comparable) other.user_info)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<start_args, _Fields> deepCopy2() {
            return new start_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$start_args$_Fields[field.ordinal()] == 1) {
                return getUser_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$start_args$_Fields[field.ordinal()] == 1) {
                return isSetUser_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$start_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetUser_info();
            } else {
                setUser_info((BBUserInfo) value);
            }
        }

        public boolean equals(start_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetUser_info = isSetUser_info();
            boolean isSetUser_info2 = that.isSetUser_info();
            if (isSetUser_info || isSetUser_info2) {
                return isSetUser_info && isSetUser_info2 && this.user_info.equals(that.user_info);
            }
            return true;
        }

        public start_args(start_args other) {
            if (other.isSetUser_info()) {
                this.user_info = new BBUserInfo(other.user_info);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class start_result implements TBase<start_result, _Fields>, Serializable, Cloneable, Comparable<start_result> {
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public BELogicException logException;
        public boolean success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("start_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 2, 0);
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
        public static class start_resultStandardScheme extends StandardScheme<start_result> {
            private start_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, start_result struct) throws TException {
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
                    } else if (b11 == 2) {
                        struct.success = iprot.readBool();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, start_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(start_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(start_result.SUCCESS_FIELD_DESC);
                    oprot.writeBool(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(start_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logException != null) {
                    oprot.writeFieldBegin(start_result.LOG_EXCEPTION_FIELD_DESC);
                    struct.logException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class start_resultStandardSchemeFactory implements SchemeFactory {
            private start_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public start_resultStandardScheme getScheme() {
                return new start_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class start_resultTupleScheme extends TupleScheme<start_result> {
            private start_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, start_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    struct.success = tTupleProtocol.readBool();
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
            public void write(TProtocol prot, start_result struct) throws TException {
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
                    tTupleProtocol.writeBool(struct.success);
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
        public static class start_resultTupleSchemeFactory implements SchemeFactory {
            private start_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public start_resultTupleScheme getScheme() {
                return new start_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new start_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new start_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 2)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOG_EXCEPTION, (_Fields) new FieldMetaData("logException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(start_result.class, unmodifiableMap);
        }

        public start_result() {
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
            this.success = false;
            this.sysException = null;
            this.logException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof start_result)) {
                return equals((start_result) that);
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

        public boolean isSetSuccess() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        public boolean isSuccess() {
            return this.success;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public start_result setLogException(BELogicException logException) {
            this.logException = logException;
            return this;
        }

        public void setLogExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logException = null;
        }

        public start_result setSuccess(boolean success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public start_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("start_result(");
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
            sb2.append(pn.j.f81007d);
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
        public int compareTo(start_result other) {
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
        public TBase<start_result, _Fields> deepCopy2() {
            return new start_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$start_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Boolean.valueOf(isSuccess());
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$start_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$start_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess(((Boolean) value).booleanValue());
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

        public start_result(boolean success, BESystemException sysException, BELogicException logException) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.sysException = sysException;
            this.logException = logException;
        }

        public boolean equals(start_result that) {
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

        public start_result(start_result other) {
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
    public static class submit_args implements TBase<submit_args, _Fields>, Serializable, Cloneable, Comparable<submit_args> {
        private static final int __LOCAL_RESULT_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public BBAnswer answer;
        public String fight_id;
        public int local_result;
        private static final TStruct STRUCT_DESC = new TStruct("submit_args");
        private static final TField ANSWER_FIELD_DESC = new TField("answer", (byte) 12, 1);
        private static final TField FIGHT_ID_FIELD_DESC = new TField("fight_id", (byte) 11, 2);
        private static final TField LOCAL_RESULT_FIELD_DESC = new TField("local_result", (byte) 8, 3);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ANSWER(1, "answer"),
            FIGHT_ID(2, "fight_id"),
            LOCAL_RESULT(3, "local_result");

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
                    return ANSWER;
                }
                if (fieldId == 2) {
                    return FIGHT_ID;
                }
                if (fieldId != 3) {
                    return null;
                }
                return LOCAL_RESULT;
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
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 1) {
                        if (s11 != 2) {
                            if (s11 != 3) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 8) {
                                struct.local_result = iprot.readI32();
                                struct.setLocal_resultIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.fight_id = iprot.readString();
                            struct.setFight_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        BBAnswer bBAnswer = new BBAnswer();
                        struct.answer = bBAnswer;
                        bBAnswer.read(iprot);
                        struct.setAnswerIsSet(true);
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
                if (struct.answer != null) {
                    oprot.writeFieldBegin(submit_args.ANSWER_FIELD_DESC);
                    struct.answer.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.fight_id != null) {
                    oprot.writeFieldBegin(submit_args.FIGHT_ID_FIELD_DESC);
                    oprot.writeString(struct.fight_id);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldBegin(submit_args.LOCAL_RESULT_FIELD_DESC);
                oprot.writeI32(struct.local_result);
                oprot.writeFieldEnd();
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
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BBAnswer bBAnswer = new BBAnswer();
                struct.answer = bBAnswer;
                bBAnswer.read(tTupleProtocol);
                struct.setAnswerIsSet(true);
                struct.fight_id = tTupleProtocol.readString();
                struct.setFight_idIsSet(true);
                if (tTupleProtocol.readBitSet(1).get(0)) {
                    struct.local_result = tTupleProtocol.readI32();
                    struct.setLocal_resultIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, submit_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.answer.write(tTupleProtocol);
                tTupleProtocol.writeString(struct.fight_id);
                BitSet bitSet = new BitSet();
                if (struct.isSetLocal_result()) {
                    bitSet.set(0);
                }
                tTupleProtocol.writeBitSet(bitSet, 1);
                if (struct.isSetLocal_result()) {
                    tTupleProtocol.writeI32(struct.local_result);
                }
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
            enumMap.put((EnumMap) _Fields.ANSWER, (_Fields) new FieldMetaData("answer", (byte) 1, new StructMetaData((byte) 12, BBAnswer.class)));
            enumMap.put((EnumMap) _Fields.FIGHT_ID, (_Fields) new FieldMetaData("fight_id", (byte) 1, new FieldValueMetaData((byte) 11)));
            enumMap.put((EnumMap) _Fields.LOCAL_RESULT, (_Fields) new FieldMetaData("local_result", (byte) 3, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(submit_args.class, unmodifiableMap);
        }

        public submit_args() {
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
            this.answer = null;
            this.fight_id = null;
            setLocal_resultIsSet(false);
            this.local_result = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof submit_args)) {
                return equals((submit_args) that);
            }
            return false;
        }

        public BBAnswer getAnswer() {
            return this.answer;
        }

        public String getFight_id() {
            return this.fight_id;
        }

        public int getLocal_result() {
            return this.local_result;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetAnswer() {
            return this.answer != null;
        }

        public boolean isSetFight_id() {
            return this.fight_id != null;
        }

        public boolean isSetLocal_result() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public submit_args setAnswer(BBAnswer answer) {
            this.answer = answer;
            return this;
        }

        public void setAnswerIsSet(boolean value) {
            if (value) {
                return;
            }
            this.answer = null;
        }

        public submit_args setFight_id(String fight_id) {
            this.fight_id = fight_id;
            return this;
        }

        public void setFight_idIsSet(boolean value) {
            if (value) {
                return;
            }
            this.fight_id = null;
        }

        public submit_args setLocal_result(int local_result) {
            this.local_result = local_result;
            setLocal_resultIsSet(true);
            return this;
        }

        public void setLocal_resultIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("submit_args(");
            sb2.append("answer:");
            BBAnswer bBAnswer = this.answer;
            if (bBAnswer == null) {
                sb2.append("null");
            } else {
                sb2.append(bBAnswer);
            }
            sb2.append(j2.O);
            sb2.append("fight_id:");
            String str = this.fight_id;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j2.O);
            sb2.append("local_result:");
            sb2.append(this.local_result);
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetAnswer() {
            this.answer = null;
        }

        public void unsetFight_id() {
            this.fight_id = null;
        }

        public void unsetLocal_result() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        public void validate() throws TException {
            BBAnswer bBAnswer = this.answer;
            if (bBAnswer == null) {
                throw new TProtocolException("Required field 'answer' was not present! Struct: " + toString());
            }
            if (this.fight_id != null) {
                if (bBAnswer != null) {
                    bBAnswer.validate();
                }
            } else {
                throw new TProtocolException("Required field 'fight_id' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(submit_args other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetAnswer()).compareTo(Boolean.valueOf(other.isSetAnswer()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetAnswer() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.answer, (Comparable) other.answer)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetFight_id()).compareTo(Boolean.valueOf(other.isSetFight_id()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetFight_id() && (compareTo2 = TBaseHelper.compareTo(this.fight_id, other.fight_id)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetLocal_result()).compareTo(Boolean.valueOf(other.isSetLocal_result()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetLocal_result() || (compareTo = TBaseHelper.compareTo(this.local_result, other.local_result)) == 0) {
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$submit_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getAnswer();
            }
            if (i11 == 2) {
                return getFight_id();
            }
            if (i11 == 3) {
                return Integer.valueOf(getLocal_result());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$submit_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetAnswer();
            }
            if (i11 == 2) {
                return isSetFight_id();
            }
            if (i11 == 3) {
                return isSetLocal_result();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$submit_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetAnswer();
                    return;
                } else {
                    setAnswer((BBAnswer) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetFight_id();
                    return;
                } else {
                    setFight_id((String) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetLocal_result();
            } else {
                setLocal_result(((Integer) value).intValue());
            }
        }

        public submit_args(BBAnswer answer, String fight_id, int local_result) {
            this();
            this.answer = answer;
            this.fight_id = fight_id;
            this.local_result = local_result;
            setLocal_resultIsSet(true);
        }

        public boolean equals(submit_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetAnswer = isSetAnswer();
            boolean isSetAnswer2 = that.isSetAnswer();
            if ((isSetAnswer || isSetAnswer2) && !(isSetAnswer && isSetAnswer2 && this.answer.equals(that.answer))) {
                return false;
            }
            boolean isSetFight_id = isSetFight_id();
            boolean isSetFight_id2 = that.isSetFight_id();
            return (!(isSetFight_id || isSetFight_id2) || (isSetFight_id && isSetFight_id2 && this.fight_id.equals(that.fight_id))) && this.local_result == that.local_result;
        }

        public submit_args(submit_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            if (other.isSetAnswer()) {
                this.answer = new BBAnswer(other.answer);
            }
            if (other.isSetFight_id()) {
                this.fight_id = other.fight_id;
            }
            this.local_result = other.local_result;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class submit_result implements TBase<submit_result, _Fields>, Serializable, Cloneable, Comparable<submit_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logException;
        public BBSubmitReply success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("submit_result");
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
                        BBSubmitReply bBSubmitReply = new BBSubmitReply();
                        struct.success = bBSubmitReply;
                        bBSubmitReply.read(iprot);
                        struct.setSuccessIsSet(true);
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
                if (struct.success != null) {
                    oprot.writeFieldBegin(submit_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(submit_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logException != null) {
                    oprot.writeFieldBegin(submit_result.LOG_EXCEPTION_FIELD_DESC);
                    struct.logException.write(oprot);
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
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    BBSubmitReply bBSubmitReply = new BBSubmitReply();
                    struct.success = bBSubmitReply;
                    bBSubmitReply.read(tTupleProtocol);
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
            public void write(TProtocol prot, submit_result struct) throws TException {
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
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, BBSubmitReply.class)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOG_EXCEPTION, (_Fields) new FieldMetaData("logException", (byte) 3, new FieldValueMetaData((byte) 12)));
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
            this.success = null;
            this.sysException = null;
            this.logException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof submit_result)) {
                return equals((submit_result) that);
            }
            return false;
        }

        public BELogicException getLogException() {
            return this.logException;
        }

        public BBSubmitReply getSuccess() {
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

        public submit_result setLogException(BELogicException logException) {
            this.logException = logException;
            return this;
        }

        public void setLogExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logException = null;
        }

        public submit_result setSuccess(BBSubmitReply success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public submit_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("submit_result(");
            sb2.append("success:");
            BBSubmitReply bBSubmitReply = this.success;
            if (bBSubmitReply == null) {
                sb2.append("null");
            } else {
                sb2.append(bBSubmitReply);
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
            sb2.append(pn.j.f81007d);
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
            BBSubmitReply bBSubmitReply = this.success;
            if (bBSubmitReply != null) {
                bBSubmitReply.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public submit_result(BBSubmitReply success, BESystemException sysException, BELogicException logException) {
            this();
            this.success = success;
            this.sysException = sysException;
            this.logException = logException;
        }

        @Override // java.lang.Comparable
        public int compareTo(submit_result other) {
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$submit_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$submit_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$submit_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((BBSubmitReply) value);
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

        public boolean equals(submit_result that) {
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

        public submit_result(submit_result other) {
            if (other.isSetSuccess()) {
                this.success = new BBSubmitReply(other.success);
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
    public static class user_score_args implements TBase<user_score_args, _Fields>, Serializable, Cloneable, Comparable<user_score_args> {
        private static final TStruct STRUCT_DESC = new TStruct("user_score_args");
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
        public static class user_score_argsStandardScheme extends StandardScheme<user_score_args> {
            private user_score_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, user_score_args struct) throws TException {
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
            public void write(TProtocol oprot, user_score_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(user_score_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class user_score_argsStandardSchemeFactory implements SchemeFactory {
            private user_score_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public user_score_argsStandardScheme getScheme() {
                return new user_score_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class user_score_argsTupleScheme extends TupleScheme<user_score_args> {
            private user_score_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, user_score_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, user_score_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class user_score_argsTupleSchemeFactory implements SchemeFactory {
            private user_score_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public user_score_argsTupleScheme getScheme() {
                return new user_score_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new user_score_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new user_score_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(user_score_args.class, unmodifiableMap);
        }

        public user_score_args() {
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

        public boolean equals(user_score_args that) {
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
            return "user_score_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public user_score_args(user_score_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(user_score_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<user_score_args, _Fields> deepCopy2() {
            return new user_score_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof user_score_args)) {
                return equals((user_score_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$user_score_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$user_score_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$user_score_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class user_score_result implements TBase<user_score_result, _Fields>, Serializable, Cloneable, Comparable<user_score_result> {
        private static final TStruct STRUCT_DESC = new TStruct("user_score_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BBScoreInfo success;
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
        public static class user_score_resultStandardScheme extends StandardScheme<user_score_result> {
            private user_score_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, user_score_result struct) throws TException {
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
                    } else if (b11 == 12) {
                        BBScoreInfo bBScoreInfo = new BBScoreInfo();
                        struct.success = bBScoreInfo;
                        bBScoreInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, user_score_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(user_score_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(user_score_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(user_score_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class user_score_resultStandardSchemeFactory implements SchemeFactory {
            private user_score_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public user_score_resultStandardScheme getScheme() {
                return new user_score_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class user_score_resultTupleScheme extends TupleScheme<user_score_result> {
            private user_score_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, user_score_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(2);
                if (readBitSet.get(0)) {
                    BBScoreInfo bBScoreInfo = new BBScoreInfo();
                    struct.success = bBScoreInfo;
                    bBScoreInfo.read(tTupleProtocol);
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
            public void write(TProtocol prot, user_score_result struct) throws TException {
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
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class user_score_resultTupleSchemeFactory implements SchemeFactory {
            private user_score_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public user_score_resultTupleScheme getScheme() {
                return new user_score_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new user_score_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new user_score_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, BBScoreInfo.class)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(user_score_result.class, unmodifiableMap);
        }

        public user_score_result() {
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
            if (that != null && (that instanceof user_score_result)) {
                return equals((user_score_result) that);
            }
            return false;
        }

        public BBScoreInfo getSuccess() {
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

        public user_score_result setSuccess(BBScoreInfo success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public user_score_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("user_score_result(");
            sb2.append("success:");
            BBScoreInfo bBScoreInfo = this.success;
            if (bBScoreInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBScoreInfo);
            }
            sb2.append(j2.O);
            sb2.append("sysException:");
            BESystemException bESystemException = this.sysException;
            if (bESystemException == null) {
                sb2.append("null");
            } else {
                sb2.append(bESystemException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void unsetSysException() {
            this.sysException = null;
        }

        public void validate() throws TException {
            BBScoreInfo bBScoreInfo = this.success;
            if (bBScoreInfo != null) {
                bBScoreInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public user_score_result(BBScoreInfo success, BESystemException sysException) {
            this();
            this.success = success;
            this.sysException = sysException;
        }

        @Override // java.lang.Comparable
        public int compareTo(user_score_result other) {
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
        public TBase<user_score_result, _Fields> deepCopy2() {
            return new user_score_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$user_score_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$user_score_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BSFights$user_score_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((BBScoreInfo) value);
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

        public boolean equals(user_score_result that) {
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

        public user_score_result(user_score_result other) {
            if (other.isSetSuccess()) {
                this.success = new BBScoreInfo(other.success);
            }
            if (other.isSetSysException()) {
                this.sysException = new BESystemException(other.sysException);
            }
        }
    }
}
