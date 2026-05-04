package com.baicizhan.online.bs_socials;

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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BSSocials {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_socials.BSSocials$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$accept_friend_apply_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$accept_friend_apply_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$apply_friend_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$apply_friend_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$delete_friend_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$delete_friend_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_feeds_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_feeds_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msg_count_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msg_count_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msgs_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msgs_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friends_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friends_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_rank_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_rank_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_suggest_friends_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_suggest_friends_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_feeds_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_feeds_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_friend_msgs_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_friend_msgs_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$ignore_friend_apply_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$ignore_friend_apply_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$search_user_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$search_user_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$send_share_success_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$send_share_success_result$_Fields;

        static {
            int[] iArr = new int[send_share_success_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$send_share_success_result$_Fields = iArr;
            try {
                iArr[send_share_success_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$send_share_success_result$_Fields[send_share_success_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$send_share_success_result$_Fields[send_share_success_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[send_share_success_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$send_share_success_args$_Fields = iArr2;
            try {
                iArr2[send_share_success_args._Fields.MODULE_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$send_share_success_args$_Fields[send_share_success_args._Fields.CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$send_share_success_args$_Fields[send_share_success_args._Fields.TIMESTAMP.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[get_suggest_friends_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_suggest_friends_result$_Fields = iArr3;
            try {
                iArr3[get_suggest_friends_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_suggest_friends_result$_Fields[get_suggest_friends_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_suggest_friends_result$_Fields[get_suggest_friends_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_suggest_friends_args$_Fields = new int[get_suggest_friends_args._Fields.values().length];
            int[] iArr4 = new int[get_feeds_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_feeds_result$_Fields = iArr4;
            try {
                iArr4[get_feeds_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_feeds_result$_Fields[get_feeds_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_feeds_result$_Fields[get_feeds_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr5 = new int[get_feeds_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_feeds_args$_Fields = iArr5;
            try {
                iArr5[get_feeds_args._Fields.BEFORE_TIMESTAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr6 = new int[has_new_feeds_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_feeds_result$_Fields = iArr6;
            try {
                iArr6[has_new_feeds_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_feeds_result$_Fields[has_new_feeds_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_feeds_result$_Fields[has_new_feeds_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_feeds_args$_Fields = new int[has_new_feeds_args._Fields.values().length];
            int[] iArr7 = new int[get_rank_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_rank_result$_Fields = iArr7;
            try {
                iArr7[get_rank_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_rank_result$_Fields[get_rank_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_rank_result$_Fields[get_rank_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_rank_args$_Fields = new int[get_rank_args._Fields.values().length];
            int[] iArr8 = new int[get_friends_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friends_result$_Fields = iArr8;
            try {
                iArr8[get_friends_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friends_result$_Fields[get_friends_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friends_result$_Fields[get_friends_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friends_args$_Fields = new int[get_friends_args._Fields.values().length];
            int[] iArr9 = new int[delete_friend_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$delete_friend_result$_Fields = iArr9;
            try {
                iArr9[delete_friend_result._Fields.SYS_EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$delete_friend_result$_Fields[delete_friend_result._Fields.LOGIC_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr10 = new int[delete_friend_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$delete_friend_args$_Fields = iArr10;
            try {
                iArr10[delete_friend_args._Fields.PUBLICKEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            int[] iArr11 = new int[apply_friend_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$apply_friend_result$_Fields = iArr11;
            try {
                iArr11[apply_friend_result._Fields.SYS_EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$apply_friend_result$_Fields[apply_friend_result._Fields.LOGIC_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            int[] iArr12 = new int[apply_friend_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$apply_friend_args$_Fields = iArr12;
            try {
                iArr12[apply_friend_args._Fields.PUBLICKEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            int[] iArr13 = new int[ignore_friend_apply_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$ignore_friend_apply_result$_Fields = iArr13;
            try {
                iArr13[ignore_friend_apply_result._Fields.SYS_EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$ignore_friend_apply_result$_Fields[ignore_friend_apply_result._Fields.LOGIC_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            int[] iArr14 = new int[ignore_friend_apply_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$ignore_friend_apply_args$_Fields = iArr14;
            try {
                iArr14[ignore_friend_apply_args._Fields.MSG_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            int[] iArr15 = new int[accept_friend_apply_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$accept_friend_apply_result$_Fields = iArr15;
            try {
                iArr15[accept_friend_apply_result._Fields.SYS_EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$accept_friend_apply_result$_Fields[accept_friend_apply_result._Fields.LOGIC_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            int[] iArr16 = new int[accept_friend_apply_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$accept_friend_apply_args$_Fields = iArr16;
            try {
                iArr16[accept_friend_apply_args._Fields.MSG_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$accept_friend_apply_args$_Fields[accept_friend_apply_args._Fields.PUBLICKEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            int[] iArr17 = new int[get_friend_msg_count_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msg_count_result$_Fields = iArr17;
            try {
                iArr17[get_friend_msg_count_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msg_count_result$_Fields[get_friend_msg_count_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msg_count_result$_Fields[get_friend_msg_count_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msg_count_args$_Fields = new int[get_friend_msg_count_args._Fields.values().length];
            int[] iArr18 = new int[get_friend_msgs_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msgs_result$_Fields = iArr18;
            try {
                iArr18[get_friend_msgs_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msgs_result$_Fields[get_friend_msgs_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msgs_result$_Fields[get_friend_msgs_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msgs_args$_Fields = new int[get_friend_msgs_args._Fields.values().length];
            int[] iArr19 = new int[has_new_friend_msgs_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_friend_msgs_result$_Fields = iArr19;
            try {
                iArr19[has_new_friend_msgs_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_friend_msgs_result$_Fields[has_new_friend_msgs_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_friend_msgs_result$_Fields[has_new_friend_msgs_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused44) {
            }
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_friend_msgs_args$_Fields = new int[has_new_friend_msgs_args._Fields.values().length];
            int[] iArr20 = new int[search_user_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$search_user_result$_Fields = iArr20;
            try {
                iArr20[search_user_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$search_user_result$_Fields[search_user_result._Fields.SYS_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$search_user_result$_Fields[search_user_result._Fields.LOGIC_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused47) {
            }
            int[] iArr21 = new int[search_user_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BSSocials$search_user_args$_Fields = iArr21;
            try {
                iArr21[search_user_args._Fields.QUERY_STR.ordinal()] = 1;
            } catch (NoSuchFieldError unused48) {
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
        public static class accept_friend_apply_call extends TAsyncMethodCall {
            private int msg_id;
            private String publickey;

            public accept_friend_apply_call(int msg_id, String publickey, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.msg_id = msg_id;
                this.publickey = publickey;
            }

            public void getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_accept_friend_apply();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("accept_friend_apply", (byte) 1, 0));
                accept_friend_apply_args accept_friend_apply_argsVar = new accept_friend_apply_args();
                accept_friend_apply_argsVar.setMsg_id(this.msg_id);
                accept_friend_apply_argsVar.setPublickey(this.publickey);
                accept_friend_apply_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class apply_friend_call extends TAsyncMethodCall {
            private String publickey;

            public apply_friend_call(String publickey, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.publickey = publickey;
            }

            public void getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_apply_friend();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("apply_friend", (byte) 1, 0));
                apply_friend_args apply_friend_argsVar = new apply_friend_args();
                apply_friend_argsVar.setPublickey(this.publickey);
                apply_friend_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_friend_call extends TAsyncMethodCall {
            private String publickey;

            public delete_friend_call(String publickey, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.publickey = publickey;
            }

            public void getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_delete_friend();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("delete_friend", (byte) 1, 0));
                delete_friend_args delete_friend_argsVar = new delete_friend_args();
                delete_friend_argsVar.setPublickey(this.publickey);
                delete_friend_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_feeds_call extends TAsyncMethodCall {
            private long before_timestamp;

            public get_feeds_call(long before_timestamp, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.before_timestamp = before_timestamp;
            }

            public List<BBFeed> getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_feeds();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_feeds", (byte) 1, 0));
                get_feeds_args get_feeds_argsVar = new get_feeds_args();
                get_feeds_argsVar.setBefore_timestamp(this.before_timestamp);
                get_feeds_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friend_msg_count_call extends TAsyncMethodCall {
            public get_friend_msg_count_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public int getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_friend_msg_count();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_friend_msg_count", (byte) 1, 0));
                new get_friend_msg_count_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friend_msgs_call extends TAsyncMethodCall {
            public get_friend_msgs_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public List<BBFriendMsg> getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_friend_msgs();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_friend_msgs", (byte) 1, 0));
                new get_friend_msgs_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friends_call extends TAsyncMethodCall {
            public get_friends_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public List<BBFriendInfo> getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_friends();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_friends", (byte) 1, 0));
                new get_friends_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_rank_call extends TAsyncMethodCall {
            public get_rank_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public BBRankResult getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_rank();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_rank", (byte) 1, 0));
                new get_rank_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_suggest_friends_call extends TAsyncMethodCall {
            public get_suggest_friends_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public List<BBSearchResult> getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_suggest_friends();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_suggest_friends", (byte) 1, 0));
                new get_suggest_friends_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class has_new_feeds_call extends TAsyncMethodCall {
            public has_new_feeds_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public boolean getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_has_new_feeds();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("has_new_feeds", (byte) 1, 0));
                new has_new_feeds_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class has_new_friend_msgs_call extends TAsyncMethodCall {
            public has_new_friend_msgs_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public boolean getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_has_new_friend_msgs();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("has_new_friend_msgs", (byte) 1, 0));
                new has_new_friend_msgs_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ignore_friend_apply_call extends TAsyncMethodCall {
            private int msg_id;

            public ignore_friend_apply_call(int msg_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.msg_id = msg_id;
            }

            public void getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_ignore_friend_apply();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("ignore_friend_apply", (byte) 1, 0));
                ignore_friend_apply_args ignore_friend_apply_argsVar = new ignore_friend_apply_args();
                ignore_friend_apply_argsVar.setMsg_id(this.msg_id);
                ignore_friend_apply_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_user_call extends TAsyncMethodCall {
            private String query_str;

            public search_user_call(String query_str, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.query_str = query_str;
            }

            public List<BBSearchResult> getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_search_user();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("search_user", (byte) 1, 0));
                search_user_args search_user_argsVar = new search_user_args();
                search_user_argsVar.setQuery_str(this.query_str);
                search_user_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class send_share_success_call extends TAsyncMethodCall {
            private BBShareChannel channel;
            private BBShareModule module_name;
            private long timestamp;

            public send_share_success_call(BBShareModule module_name, BBShareChannel channel, long timestamp, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.module_name = module_name;
                this.channel = channel;
                this.timestamp = timestamp;
            }

            public boolean getResult() throws BESystemException, BELogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_send_share_success();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("send_share_success", (byte) 1, 0));
                send_share_success_args send_share_success_argsVar = new send_share_success_args();
                send_share_success_argsVar.setModule_name(this.module_name);
                send_share_success_argsVar.setChannel(this.channel);
                send_share_success_argsVar.setTimestamp(this.timestamp);
                send_share_success_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        public AsyncClient(TProtocolFactory protocolFactory, TAsyncClientManager clientManager, TNonblockingTransport transport) {
            super(protocolFactory, clientManager, transport);
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.AsyncIface
        public void accept_friend_apply(int msg_id, String publickey, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            accept_friend_apply_call accept_friend_apply_callVar = new accept_friend_apply_call(msg_id, publickey, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = accept_friend_apply_callVar;
            this.___manager.call(accept_friend_apply_callVar);
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.AsyncIface
        public void apply_friend(String publickey, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            apply_friend_call apply_friend_callVar = new apply_friend_call(publickey, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = apply_friend_callVar;
            this.___manager.call(apply_friend_callVar);
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.AsyncIface
        public void delete_friend(String publickey, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            delete_friend_call delete_friend_callVar = new delete_friend_call(publickey, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = delete_friend_callVar;
            this.___manager.call(delete_friend_callVar);
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.AsyncIface
        public void get_feeds(long before_timestamp, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_feeds_call get_feeds_callVar = new get_feeds_call(before_timestamp, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_feeds_callVar;
            this.___manager.call(get_feeds_callVar);
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.AsyncIface
        public void get_friend_msg_count(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_friend_msg_count_call get_friend_msg_count_callVar = new get_friend_msg_count_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_friend_msg_count_callVar;
            this.___manager.call(get_friend_msg_count_callVar);
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.AsyncIface
        public void get_friend_msgs(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_friend_msgs_call get_friend_msgs_callVar = new get_friend_msgs_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_friend_msgs_callVar;
            this.___manager.call(get_friend_msgs_callVar);
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.AsyncIface
        public void get_friends(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_friends_call get_friends_callVar = new get_friends_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_friends_callVar;
            this.___manager.call(get_friends_callVar);
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.AsyncIface
        public void get_rank(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_rank_call get_rank_callVar = new get_rank_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_rank_callVar;
            this.___manager.call(get_rank_callVar);
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.AsyncIface
        public void get_suggest_friends(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_suggest_friends_call get_suggest_friends_callVar = new get_suggest_friends_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_suggest_friends_callVar;
            this.___manager.call(get_suggest_friends_callVar);
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.AsyncIface
        public void has_new_feeds(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            has_new_feeds_call has_new_feeds_callVar = new has_new_feeds_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = has_new_feeds_callVar;
            this.___manager.call(has_new_feeds_callVar);
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.AsyncIface
        public void has_new_friend_msgs(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            has_new_friend_msgs_call has_new_friend_msgs_callVar = new has_new_friend_msgs_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = has_new_friend_msgs_callVar;
            this.___manager.call(has_new_friend_msgs_callVar);
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.AsyncIface
        public void ignore_friend_apply(int msg_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            ignore_friend_apply_call ignore_friend_apply_callVar = new ignore_friend_apply_call(msg_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = ignore_friend_apply_callVar;
            this.___manager.call(ignore_friend_apply_callVar);
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.AsyncIface
        public void search_user(String query_str, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            search_user_call search_user_callVar = new search_user_call(query_str, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = search_user_callVar;
            this.___manager.call(search_user_callVar);
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.AsyncIface
        public void send_share_success(BBShareModule module_name, BBShareChannel channel, long timestamp, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            send_share_success_call send_share_success_callVar = new send_share_success_call(module_name, channel, timestamp, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = send_share_success_callVar;
            this.___manager.call(send_share_success_callVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AsyncIface {
        void accept_friend_apply(int msg_id, String publickey, AsyncMethodCallback resultHandler) throws TException;

        void apply_friend(String publickey, AsyncMethodCallback resultHandler) throws TException;

        void delete_friend(String publickey, AsyncMethodCallback resultHandler) throws TException;

        void get_feeds(long before_timestamp, AsyncMethodCallback resultHandler) throws TException;

        void get_friend_msg_count(AsyncMethodCallback resultHandler) throws TException;

        void get_friend_msgs(AsyncMethodCallback resultHandler) throws TException;

        void get_friends(AsyncMethodCallback resultHandler) throws TException;

        void get_rank(AsyncMethodCallback resultHandler) throws TException;

        void get_suggest_friends(AsyncMethodCallback resultHandler) throws TException;

        void has_new_feeds(AsyncMethodCallback resultHandler) throws TException;

        void has_new_friend_msgs(AsyncMethodCallback resultHandler) throws TException;

        void ignore_friend_apply(int msg_id, AsyncMethodCallback resultHandler) throws TException;

        void search_user(String query_str, AsyncMethodCallback resultHandler) throws TException;

        void send_share_success(BBShareModule module_name, BBShareChannel channel, long timestamp, AsyncMethodCallback resultHandler) throws TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AsyncProcessor<I extends AsyncIface> extends TBaseAsyncProcessor<I> {
        private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class accept_friend_apply<I extends AsyncIface> extends AsyncProcessFunction<I, accept_friend_apply_args, Void> {
            public accept_friend_apply() {
                super("accept_friend_apply");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.bs_socials.BSSocials.AsyncProcessor.accept_friend_apply.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        accept_friend_apply_result accept_friend_apply_resultVar;
                        accept_friend_apply_result accept_friend_apply_resultVar2 = new accept_friend_apply_result();
                        try {
                            if (exc instanceof BESystemException) {
                                accept_friend_apply_resultVar2.sysException = (BESystemException) exc;
                                accept_friend_apply_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    accept_friend_apply_resultVar = r02;
                                    this.sendResponse(fb2, accept_friend_apply_resultVar, b11, seqid);
                                    return;
                                }
                                accept_friend_apply_resultVar2.logicException = (BELogicException) exc;
                                accept_friend_apply_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, accept_friend_apply_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        accept_friend_apply_resultVar = accept_friend_apply_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new accept_friend_apply_result(), (byte) 2, seqid);
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
            public accept_friend_apply_args getEmptyArgsInstance() {
                return new accept_friend_apply_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, accept_friend_apply_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.accept_friend_apply(args.msg_id, args.publickey, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class apply_friend<I extends AsyncIface> extends AsyncProcessFunction<I, apply_friend_args, Void> {
            public apply_friend() {
                super("apply_friend");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.bs_socials.BSSocials.AsyncProcessor.apply_friend.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        apply_friend_result apply_friend_resultVar;
                        apply_friend_result apply_friend_resultVar2 = new apply_friend_result();
                        try {
                            if (exc instanceof BESystemException) {
                                apply_friend_resultVar2.sysException = (BESystemException) exc;
                                apply_friend_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    apply_friend_resultVar = r02;
                                    this.sendResponse(fb2, apply_friend_resultVar, b11, seqid);
                                    return;
                                }
                                apply_friend_resultVar2.logicException = (BELogicException) exc;
                                apply_friend_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, apply_friend_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        apply_friend_resultVar = apply_friend_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new apply_friend_result(), (byte) 2, seqid);
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
            public apply_friend_args getEmptyArgsInstance() {
                return new apply_friend_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, apply_friend_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.apply_friend(args.publickey, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_friend<I extends AsyncIface> extends AsyncProcessFunction<I, delete_friend_args, Void> {
            public delete_friend() {
                super("delete_friend");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.bs_socials.BSSocials.AsyncProcessor.delete_friend.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        delete_friend_result delete_friend_resultVar;
                        delete_friend_result delete_friend_resultVar2 = new delete_friend_result();
                        try {
                            if (exc instanceof BESystemException) {
                                delete_friend_resultVar2.sysException = (BESystemException) exc;
                                delete_friend_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    delete_friend_resultVar = r02;
                                    this.sendResponse(fb2, delete_friend_resultVar, b11, seqid);
                                    return;
                                }
                                delete_friend_resultVar2.logicException = (BELogicException) exc;
                                delete_friend_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, delete_friend_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        delete_friend_resultVar = delete_friend_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new delete_friend_result(), (byte) 2, seqid);
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
            public delete_friend_args getEmptyArgsInstance() {
                return new delete_friend_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, delete_friend_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.delete_friend(args.publickey, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_feeds<I extends AsyncIface> extends AsyncProcessFunction<I, get_feeds_args, List<BBFeed>> {
            public get_feeds() {
                super("get_feeds");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<BBFeed>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<BBFeed>>() { // from class: com.baicizhan.online.bs_socials.BSSocials.AsyncProcessor.get_feeds.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_feeds_result get_feeds_resultVar;
                        get_feeds_result get_feeds_resultVar2 = new get_feeds_result();
                        try {
                            if (exc instanceof BESystemException) {
                                get_feeds_resultVar2.sysException = (BESystemException) exc;
                                get_feeds_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_feeds_resultVar = r02;
                                    this.sendResponse(fb2, get_feeds_resultVar, b11, seqid);
                                    return;
                                }
                                get_feeds_resultVar2.logicException = (BELogicException) exc;
                                get_feeds_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, get_feeds_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_feeds_resultVar = get_feeds_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<BBFeed> o11) {
                        get_feeds_result get_feeds_resultVar = new get_feeds_result();
                        get_feeds_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_feeds_resultVar, (byte) 2, seqid);
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
            public get_feeds_args getEmptyArgsInstance() {
                return new get_feeds_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_feeds_args args, AsyncMethodCallback<List<BBFeed>> resultHandler) throws TException {
                iface.get_feeds(args.before_timestamp, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friend_msg_count<I extends AsyncIface> extends AsyncProcessFunction<I, get_friend_msg_count_args, Integer> {
            public get_friend_msg_count() {
                super("get_friend_msg_count");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Integer> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Integer>() { // from class: com.baicizhan.online.bs_socials.BSSocials.AsyncProcessor.get_friend_msg_count.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_friend_msg_count_result get_friend_msg_count_resultVar;
                        get_friend_msg_count_result get_friend_msg_count_resultVar2 = new get_friend_msg_count_result();
                        try {
                            if (exc instanceof BESystemException) {
                                get_friend_msg_count_resultVar2.sysException = (BESystemException) exc;
                                get_friend_msg_count_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_friend_msg_count_resultVar = r02;
                                    this.sendResponse(fb2, get_friend_msg_count_resultVar, b11, seqid);
                                    return;
                                }
                                get_friend_msg_count_resultVar2.logicException = (BELogicException) exc;
                                get_friend_msg_count_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, get_friend_msg_count_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_friend_msg_count_resultVar = get_friend_msg_count_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Integer o11) {
                        get_friend_msg_count_result get_friend_msg_count_resultVar = new get_friend_msg_count_result();
                        get_friend_msg_count_resultVar.success = o11.intValue();
                        get_friend_msg_count_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, get_friend_msg_count_resultVar, (byte) 2, seqid);
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
            public get_friend_msg_count_args getEmptyArgsInstance() {
                return new get_friend_msg_count_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_friend_msg_count_args args, AsyncMethodCallback<Integer> resultHandler) throws TException {
                iface.get_friend_msg_count(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friend_msgs<I extends AsyncIface> extends AsyncProcessFunction<I, get_friend_msgs_args, List<BBFriendMsg>> {
            public get_friend_msgs() {
                super("get_friend_msgs");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<BBFriendMsg>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<BBFriendMsg>>() { // from class: com.baicizhan.online.bs_socials.BSSocials.AsyncProcessor.get_friend_msgs.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_friend_msgs_result get_friend_msgs_resultVar;
                        get_friend_msgs_result get_friend_msgs_resultVar2 = new get_friend_msgs_result();
                        try {
                            if (exc instanceof BESystemException) {
                                get_friend_msgs_resultVar2.sysException = (BESystemException) exc;
                                get_friend_msgs_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_friend_msgs_resultVar = r02;
                                    this.sendResponse(fb2, get_friend_msgs_resultVar, b11, seqid);
                                    return;
                                }
                                get_friend_msgs_resultVar2.logicException = (BELogicException) exc;
                                get_friend_msgs_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, get_friend_msgs_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_friend_msgs_resultVar = get_friend_msgs_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<BBFriendMsg> o11) {
                        get_friend_msgs_result get_friend_msgs_resultVar = new get_friend_msgs_result();
                        get_friend_msgs_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_friend_msgs_resultVar, (byte) 2, seqid);
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
            public get_friend_msgs_args getEmptyArgsInstance() {
                return new get_friend_msgs_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_friend_msgs_args args, AsyncMethodCallback<List<BBFriendMsg>> resultHandler) throws TException {
                iface.get_friend_msgs(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friends<I extends AsyncIface> extends AsyncProcessFunction<I, get_friends_args, List<BBFriendInfo>> {
            public get_friends() {
                super("get_friends");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<BBFriendInfo>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<BBFriendInfo>>() { // from class: com.baicizhan.online.bs_socials.BSSocials.AsyncProcessor.get_friends.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_friends_result get_friends_resultVar;
                        get_friends_result get_friends_resultVar2 = new get_friends_result();
                        try {
                            if (exc instanceof BESystemException) {
                                get_friends_resultVar2.sysException = (BESystemException) exc;
                                get_friends_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_friends_resultVar = r02;
                                    this.sendResponse(fb2, get_friends_resultVar, b11, seqid);
                                    return;
                                }
                                get_friends_resultVar2.logicException = (BELogicException) exc;
                                get_friends_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, get_friends_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_friends_resultVar = get_friends_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<BBFriendInfo> o11) {
                        get_friends_result get_friends_resultVar = new get_friends_result();
                        get_friends_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_friends_resultVar, (byte) 2, seqid);
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
            public get_friends_args getEmptyArgsInstance() {
                return new get_friends_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_friends_args args, AsyncMethodCallback<List<BBFriendInfo>> resultHandler) throws TException {
                iface.get_friends(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_rank<I extends AsyncIface> extends AsyncProcessFunction<I, get_rank_args, BBRankResult> {
            public get_rank() {
                super("get_rank");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<BBRankResult> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<BBRankResult>() { // from class: com.baicizhan.online.bs_socials.BSSocials.AsyncProcessor.get_rank.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_rank_result get_rank_resultVar;
                        get_rank_result get_rank_resultVar2 = new get_rank_result();
                        try {
                            if (exc instanceof BESystemException) {
                                get_rank_resultVar2.sysException = (BESystemException) exc;
                                get_rank_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_rank_resultVar = r02;
                                    this.sendResponse(fb2, get_rank_resultVar, b11, seqid);
                                    return;
                                }
                                get_rank_resultVar2.logicException = (BELogicException) exc;
                                get_rank_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, get_rank_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_rank_resultVar = get_rank_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(BBRankResult o11) {
                        get_rank_result get_rank_resultVar = new get_rank_result();
                        get_rank_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_rank_resultVar, (byte) 2, seqid);
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
            public get_rank_args getEmptyArgsInstance() {
                return new get_rank_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_rank_args args, AsyncMethodCallback<BBRankResult> resultHandler) throws TException {
                iface.get_rank(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_suggest_friends<I extends AsyncIface> extends AsyncProcessFunction<I, get_suggest_friends_args, List<BBSearchResult>> {
            public get_suggest_friends() {
                super("get_suggest_friends");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<BBSearchResult>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<BBSearchResult>>() { // from class: com.baicizhan.online.bs_socials.BSSocials.AsyncProcessor.get_suggest_friends.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_suggest_friends_result get_suggest_friends_resultVar;
                        get_suggest_friends_result get_suggest_friends_resultVar2 = new get_suggest_friends_result();
                        try {
                            if (exc instanceof BESystemException) {
                                get_suggest_friends_resultVar2.sysException = (BESystemException) exc;
                                get_suggest_friends_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_suggest_friends_resultVar = r02;
                                    this.sendResponse(fb2, get_suggest_friends_resultVar, b11, seqid);
                                    return;
                                }
                                get_suggest_friends_resultVar2.logicException = (BELogicException) exc;
                                get_suggest_friends_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, get_suggest_friends_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_suggest_friends_resultVar = get_suggest_friends_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<BBSearchResult> o11) {
                        get_suggest_friends_result get_suggest_friends_resultVar = new get_suggest_friends_result();
                        get_suggest_friends_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_suggest_friends_resultVar, (byte) 2, seqid);
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
            public get_suggest_friends_args getEmptyArgsInstance() {
                return new get_suggest_friends_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_suggest_friends_args args, AsyncMethodCallback<List<BBSearchResult>> resultHandler) throws TException {
                iface.get_suggest_friends(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class has_new_feeds<I extends AsyncIface> extends AsyncProcessFunction<I, has_new_feeds_args, Boolean> {
            public has_new_feeds() {
                super("has_new_feeds");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Boolean> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Boolean>() { // from class: com.baicizhan.online.bs_socials.BSSocials.AsyncProcessor.has_new_feeds.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        has_new_feeds_result has_new_feeds_resultVar;
                        has_new_feeds_result has_new_feeds_resultVar2 = new has_new_feeds_result();
                        try {
                            if (exc instanceof BESystemException) {
                                has_new_feeds_resultVar2.sysException = (BESystemException) exc;
                                has_new_feeds_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    has_new_feeds_resultVar = r02;
                                    this.sendResponse(fb2, has_new_feeds_resultVar, b11, seqid);
                                    return;
                                }
                                has_new_feeds_resultVar2.logicException = (BELogicException) exc;
                                has_new_feeds_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, has_new_feeds_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        has_new_feeds_resultVar = has_new_feeds_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Boolean o11) {
                        has_new_feeds_result has_new_feeds_resultVar = new has_new_feeds_result();
                        has_new_feeds_resultVar.success = o11.booleanValue();
                        has_new_feeds_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, has_new_feeds_resultVar, (byte) 2, seqid);
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
            public has_new_feeds_args getEmptyArgsInstance() {
                return new has_new_feeds_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, has_new_feeds_args args, AsyncMethodCallback<Boolean> resultHandler) throws TException {
                iface.has_new_feeds(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class has_new_friend_msgs<I extends AsyncIface> extends AsyncProcessFunction<I, has_new_friend_msgs_args, Boolean> {
            public has_new_friend_msgs() {
                super("has_new_friend_msgs");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Boolean> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Boolean>() { // from class: com.baicizhan.online.bs_socials.BSSocials.AsyncProcessor.has_new_friend_msgs.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        has_new_friend_msgs_result has_new_friend_msgs_resultVar;
                        has_new_friend_msgs_result has_new_friend_msgs_resultVar2 = new has_new_friend_msgs_result();
                        try {
                            if (exc instanceof BESystemException) {
                                has_new_friend_msgs_resultVar2.sysException = (BESystemException) exc;
                                has_new_friend_msgs_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    has_new_friend_msgs_resultVar = r02;
                                    this.sendResponse(fb2, has_new_friend_msgs_resultVar, b11, seqid);
                                    return;
                                }
                                has_new_friend_msgs_resultVar2.logicException = (BELogicException) exc;
                                has_new_friend_msgs_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, has_new_friend_msgs_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        has_new_friend_msgs_resultVar = has_new_friend_msgs_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Boolean o11) {
                        has_new_friend_msgs_result has_new_friend_msgs_resultVar = new has_new_friend_msgs_result();
                        has_new_friend_msgs_resultVar.success = o11.booleanValue();
                        has_new_friend_msgs_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, has_new_friend_msgs_resultVar, (byte) 2, seqid);
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
            public has_new_friend_msgs_args getEmptyArgsInstance() {
                return new has_new_friend_msgs_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, has_new_friend_msgs_args args, AsyncMethodCallback<Boolean> resultHandler) throws TException {
                iface.has_new_friend_msgs(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ignore_friend_apply<I extends AsyncIface> extends AsyncProcessFunction<I, ignore_friend_apply_args, Void> {
            public ignore_friend_apply() {
                super("ignore_friend_apply");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.bs_socials.BSSocials.AsyncProcessor.ignore_friend_apply.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        ignore_friend_apply_result ignore_friend_apply_resultVar;
                        ignore_friend_apply_result ignore_friend_apply_resultVar2 = new ignore_friend_apply_result();
                        try {
                            if (exc instanceof BESystemException) {
                                ignore_friend_apply_resultVar2.sysException = (BESystemException) exc;
                                ignore_friend_apply_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    ignore_friend_apply_resultVar = r02;
                                    this.sendResponse(fb2, ignore_friend_apply_resultVar, b11, seqid);
                                    return;
                                }
                                ignore_friend_apply_resultVar2.logicException = (BELogicException) exc;
                                ignore_friend_apply_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, ignore_friend_apply_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        ignore_friend_apply_resultVar = ignore_friend_apply_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new ignore_friend_apply_result(), (byte) 2, seqid);
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
            public ignore_friend_apply_args getEmptyArgsInstance() {
                return new ignore_friend_apply_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, ignore_friend_apply_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.ignore_friend_apply(args.msg_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_user<I extends AsyncIface> extends AsyncProcessFunction<I, search_user_args, List<BBSearchResult>> {
            public search_user() {
                super("search_user");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<BBSearchResult>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<BBSearchResult>>() { // from class: com.baicizhan.online.bs_socials.BSSocials.AsyncProcessor.search_user.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        search_user_result search_user_resultVar;
                        search_user_result search_user_resultVar2 = new search_user_result();
                        try {
                            if (exc instanceof BESystemException) {
                                search_user_resultVar2.sysException = (BESystemException) exc;
                                search_user_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    search_user_resultVar = r02;
                                    this.sendResponse(fb2, search_user_resultVar, b11, seqid);
                                    return;
                                }
                                search_user_resultVar2.logicException = (BELogicException) exc;
                                search_user_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, search_user_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        search_user_resultVar = search_user_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<BBSearchResult> o11) {
                        search_user_result search_user_resultVar = new search_user_result();
                        search_user_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, search_user_resultVar, (byte) 2, seqid);
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
            public search_user_args getEmptyArgsInstance() {
                return new search_user_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, search_user_args args, AsyncMethodCallback<List<BBSearchResult>> resultHandler) throws TException {
                iface.search_user(args.query_str, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class send_share_success<I extends AsyncIface> extends AsyncProcessFunction<I, send_share_success_args, Boolean> {
            public send_share_success() {
                super("send_share_success");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Boolean> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Boolean>() { // from class: com.baicizhan.online.bs_socials.BSSocials.AsyncProcessor.send_share_success.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        send_share_success_result send_share_success_resultVar;
                        send_share_success_result send_share_success_resultVar2 = new send_share_success_result();
                        try {
                            if (exc instanceof BESystemException) {
                                send_share_success_resultVar2.sysException = (BESystemException) exc;
                                send_share_success_resultVar2.setSysExceptionIsSet(true);
                            } else {
                                if (!(exc instanceof BELogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    send_share_success_resultVar = r02;
                                    this.sendResponse(fb2, send_share_success_resultVar, b11, seqid);
                                    return;
                                }
                                send_share_success_resultVar2.logicException = (BELogicException) exc;
                                send_share_success_resultVar2.setLogicExceptionIsSet(true);
                            }
                            this.sendResponse(fb2, send_share_success_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        send_share_success_resultVar = send_share_success_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Boolean o11) {
                        send_share_success_result send_share_success_resultVar = new send_share_success_result();
                        send_share_success_resultVar.success = o11.booleanValue();
                        send_share_success_resultVar.setSuccessIsSet(true);
                        try {
                            this.sendResponse(fb2, send_share_success_resultVar, (byte) 2, seqid);
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
            public send_share_success_args getEmptyArgsInstance() {
                return new send_share_success_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, send_share_success_args args, AsyncMethodCallback<Boolean> resultHandler) throws TException {
                iface.send_share_success(args.module_name, args.channel, args.timestamp, resultHandler);
            }
        }

        public AsyncProcessor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends AsyncIface> Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> getProcessMap(Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> processMap) {
            processMap.put("search_user", new search_user());
            processMap.put("has_new_friend_msgs", new has_new_friend_msgs());
            processMap.put("get_friend_msgs", new get_friend_msgs());
            processMap.put("get_friend_msg_count", new get_friend_msg_count());
            processMap.put("accept_friend_apply", new accept_friend_apply());
            processMap.put("ignore_friend_apply", new ignore_friend_apply());
            processMap.put("apply_friend", new apply_friend());
            processMap.put("delete_friend", new delete_friend());
            processMap.put("get_friends", new get_friends());
            processMap.put("get_rank", new get_rank());
            processMap.put("has_new_feeds", new has_new_feeds());
            processMap.put("get_feeds", new get_feeds());
            processMap.put("get_suggest_friends", new get_suggest_friends());
            processMap.put("send_share_success", new send_share_success());
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

        @Override // com.baicizhan.online.bs_socials.BSSocials.Iface
        public void accept_friend_apply(int msg_id, String publickey) throws BESystemException, BELogicException, TException {
            send_accept_friend_apply(msg_id, publickey);
            recv_accept_friend_apply();
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.Iface
        public void apply_friend(String publickey) throws BESystemException, BELogicException, TException {
            send_apply_friend(publickey);
            recv_apply_friend();
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.Iface
        public void delete_friend(String publickey) throws BESystemException, BELogicException, TException {
            send_delete_friend(publickey);
            recv_delete_friend();
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.Iface
        public List<BBFeed> get_feeds(long before_timestamp) throws BESystemException, BELogicException, TException {
            send_get_feeds(before_timestamp);
            return recv_get_feeds();
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.Iface
        public int get_friend_msg_count() throws BESystemException, BELogicException, TException {
            send_get_friend_msg_count();
            return recv_get_friend_msg_count();
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.Iface
        public List<BBFriendMsg> get_friend_msgs() throws BESystemException, BELogicException, TException {
            send_get_friend_msgs();
            return recv_get_friend_msgs();
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.Iface
        public List<BBFriendInfo> get_friends() throws BESystemException, BELogicException, TException {
            send_get_friends();
            return recv_get_friends();
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.Iface
        public BBRankResult get_rank() throws BESystemException, BELogicException, TException {
            send_get_rank();
            return recv_get_rank();
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.Iface
        public List<BBSearchResult> get_suggest_friends() throws BESystemException, BELogicException, TException {
            send_get_suggest_friends();
            return recv_get_suggest_friends();
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.Iface
        public boolean has_new_feeds() throws BESystemException, BELogicException, TException {
            send_has_new_feeds();
            return recv_has_new_feeds();
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.Iface
        public boolean has_new_friend_msgs() throws BESystemException, BELogicException, TException {
            send_has_new_friend_msgs();
            return recv_has_new_friend_msgs();
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.Iface
        public void ignore_friend_apply(int msg_id) throws BESystemException, BELogicException, TException {
            send_ignore_friend_apply(msg_id);
            recv_ignore_friend_apply();
        }

        public void recv_accept_friend_apply() throws BESystemException, BELogicException, TException {
            accept_friend_apply_result accept_friend_apply_resultVar = new accept_friend_apply_result();
            receiveBase(accept_friend_apply_resultVar, "accept_friend_apply");
            BESystemException bESystemException = accept_friend_apply_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = accept_friend_apply_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
        }

        public void recv_apply_friend() throws BESystemException, BELogicException, TException {
            apply_friend_result apply_friend_resultVar = new apply_friend_result();
            receiveBase(apply_friend_resultVar, "apply_friend");
            BESystemException bESystemException = apply_friend_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = apply_friend_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
        }

        public void recv_delete_friend() throws BESystemException, BELogicException, TException {
            delete_friend_result delete_friend_resultVar = new delete_friend_result();
            receiveBase(delete_friend_resultVar, "delete_friend");
            BESystemException bESystemException = delete_friend_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = delete_friend_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
        }

        public List<BBFeed> recv_get_feeds() throws BESystemException, BELogicException, TException {
            get_feeds_result get_feeds_resultVar = new get_feeds_result();
            receiveBase(get_feeds_resultVar, "get_feeds");
            if (get_feeds_resultVar.isSetSuccess()) {
                return get_feeds_resultVar.success;
            }
            BESystemException bESystemException = get_feeds_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = get_feeds_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "get_feeds failed: unknown result");
        }

        public int recv_get_friend_msg_count() throws BESystemException, BELogicException, TException {
            get_friend_msg_count_result get_friend_msg_count_resultVar = new get_friend_msg_count_result();
            receiveBase(get_friend_msg_count_resultVar, "get_friend_msg_count");
            if (get_friend_msg_count_resultVar.isSetSuccess()) {
                return get_friend_msg_count_resultVar.success;
            }
            BESystemException bESystemException = get_friend_msg_count_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = get_friend_msg_count_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "get_friend_msg_count failed: unknown result");
        }

        public List<BBFriendMsg> recv_get_friend_msgs() throws BESystemException, BELogicException, TException {
            get_friend_msgs_result get_friend_msgs_resultVar = new get_friend_msgs_result();
            receiveBase(get_friend_msgs_resultVar, "get_friend_msgs");
            if (get_friend_msgs_resultVar.isSetSuccess()) {
                return get_friend_msgs_resultVar.success;
            }
            BESystemException bESystemException = get_friend_msgs_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = get_friend_msgs_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "get_friend_msgs failed: unknown result");
        }

        public List<BBFriendInfo> recv_get_friends() throws BESystemException, BELogicException, TException {
            get_friends_result get_friends_resultVar = new get_friends_result();
            receiveBase(get_friends_resultVar, "get_friends");
            if (get_friends_resultVar.isSetSuccess()) {
                return get_friends_resultVar.success;
            }
            BESystemException bESystemException = get_friends_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = get_friends_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "get_friends failed: unknown result");
        }

        public BBRankResult recv_get_rank() throws BESystemException, BELogicException, TException {
            get_rank_result get_rank_resultVar = new get_rank_result();
            receiveBase(get_rank_resultVar, "get_rank");
            if (get_rank_resultVar.isSetSuccess()) {
                return get_rank_resultVar.success;
            }
            BESystemException bESystemException = get_rank_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = get_rank_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "get_rank failed: unknown result");
        }

        public List<BBSearchResult> recv_get_suggest_friends() throws BESystemException, BELogicException, TException {
            get_suggest_friends_result get_suggest_friends_resultVar = new get_suggest_friends_result();
            receiveBase(get_suggest_friends_resultVar, "get_suggest_friends");
            if (get_suggest_friends_resultVar.isSetSuccess()) {
                return get_suggest_friends_resultVar.success;
            }
            BESystemException bESystemException = get_suggest_friends_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = get_suggest_friends_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "get_suggest_friends failed: unknown result");
        }

        public boolean recv_has_new_feeds() throws BESystemException, BELogicException, TException {
            has_new_feeds_result has_new_feeds_resultVar = new has_new_feeds_result();
            receiveBase(has_new_feeds_resultVar, "has_new_feeds");
            if (has_new_feeds_resultVar.isSetSuccess()) {
                return has_new_feeds_resultVar.success;
            }
            BESystemException bESystemException = has_new_feeds_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = has_new_feeds_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "has_new_feeds failed: unknown result");
        }

        public boolean recv_has_new_friend_msgs() throws BESystemException, BELogicException, TException {
            has_new_friend_msgs_result has_new_friend_msgs_resultVar = new has_new_friend_msgs_result();
            receiveBase(has_new_friend_msgs_resultVar, "has_new_friend_msgs");
            if (has_new_friend_msgs_resultVar.isSetSuccess()) {
                return has_new_friend_msgs_resultVar.success;
            }
            BESystemException bESystemException = has_new_friend_msgs_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = has_new_friend_msgs_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "has_new_friend_msgs failed: unknown result");
        }

        public void recv_ignore_friend_apply() throws BESystemException, BELogicException, TException {
            ignore_friend_apply_result ignore_friend_apply_resultVar = new ignore_friend_apply_result();
            receiveBase(ignore_friend_apply_resultVar, "ignore_friend_apply");
            BESystemException bESystemException = ignore_friend_apply_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = ignore_friend_apply_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
        }

        public List<BBSearchResult> recv_search_user() throws BESystemException, BELogicException, TException {
            search_user_result search_user_resultVar = new search_user_result();
            receiveBase(search_user_resultVar, "search_user");
            if (search_user_resultVar.isSetSuccess()) {
                return search_user_resultVar.success;
            }
            BESystemException bESystemException = search_user_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = search_user_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "search_user failed: unknown result");
        }

        public boolean recv_send_share_success() throws BESystemException, BELogicException, TException {
            send_share_success_result send_share_success_resultVar = new send_share_success_result();
            receiveBase(send_share_success_resultVar, "send_share_success");
            if (send_share_success_resultVar.isSetSuccess()) {
                return send_share_success_resultVar.success;
            }
            BESystemException bESystemException = send_share_success_resultVar.sysException;
            if (bESystemException != null) {
                throw bESystemException;
            }
            BELogicException bELogicException = send_share_success_resultVar.logicException;
            if (bELogicException != null) {
                throw bELogicException;
            }
            throw new TApplicationException(5, "send_share_success failed: unknown result");
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.Iface
        public List<BBSearchResult> search_user(String query_str) throws BESystemException, BELogicException, TException {
            send_search_user(query_str);
            return recv_search_user();
        }

        public void send_accept_friend_apply(int msg_id, String publickey) throws TException {
            accept_friend_apply_args accept_friend_apply_argsVar = new accept_friend_apply_args();
            accept_friend_apply_argsVar.setMsg_id(msg_id);
            accept_friend_apply_argsVar.setPublickey(publickey);
            sendBase("accept_friend_apply", accept_friend_apply_argsVar);
        }

        public void send_apply_friend(String publickey) throws TException {
            apply_friend_args apply_friend_argsVar = new apply_friend_args();
            apply_friend_argsVar.setPublickey(publickey);
            sendBase("apply_friend", apply_friend_argsVar);
        }

        public void send_delete_friend(String publickey) throws TException {
            delete_friend_args delete_friend_argsVar = new delete_friend_args();
            delete_friend_argsVar.setPublickey(publickey);
            sendBase("delete_friend", delete_friend_argsVar);
        }

        public void send_get_feeds(long before_timestamp) throws TException {
            get_feeds_args get_feeds_argsVar = new get_feeds_args();
            get_feeds_argsVar.setBefore_timestamp(before_timestamp);
            sendBase("get_feeds", get_feeds_argsVar);
        }

        public void send_get_friend_msg_count() throws TException {
            sendBase("get_friend_msg_count", new get_friend_msg_count_args());
        }

        public void send_get_friend_msgs() throws TException {
            sendBase("get_friend_msgs", new get_friend_msgs_args());
        }

        public void send_get_friends() throws TException {
            sendBase("get_friends", new get_friends_args());
        }

        public void send_get_rank() throws TException {
            sendBase("get_rank", new get_rank_args());
        }

        public void send_get_suggest_friends() throws TException {
            sendBase("get_suggest_friends", new get_suggest_friends_args());
        }

        public void send_has_new_feeds() throws TException {
            sendBase("has_new_feeds", new has_new_feeds_args());
        }

        public void send_has_new_friend_msgs() throws TException {
            sendBase("has_new_friend_msgs", new has_new_friend_msgs_args());
        }

        public void send_ignore_friend_apply(int msg_id) throws TException {
            ignore_friend_apply_args ignore_friend_apply_argsVar = new ignore_friend_apply_args();
            ignore_friend_apply_argsVar.setMsg_id(msg_id);
            sendBase("ignore_friend_apply", ignore_friend_apply_argsVar);
        }

        public void send_search_user(String query_str) throws TException {
            search_user_args search_user_argsVar = new search_user_args();
            search_user_argsVar.setQuery_str(query_str);
            sendBase("search_user", search_user_argsVar);
        }

        public void send_send_share_success(BBShareModule module_name, BBShareChannel channel, long timestamp) throws TException {
            send_share_success_args send_share_success_argsVar = new send_share_success_args();
            send_share_success_argsVar.setModule_name(module_name);
            send_share_success_argsVar.setChannel(channel);
            send_share_success_argsVar.setTimestamp(timestamp);
            sendBase("send_share_success", send_share_success_argsVar);
        }

        @Override // com.baicizhan.online.bs_socials.BSSocials.Iface
        public boolean send_share_success(BBShareModule module_name, BBShareChannel channel, long timestamp) throws BESystemException, BELogicException, TException {
            send_send_share_success(module_name, channel, timestamp);
            return recv_send_share_success();
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
        void accept_friend_apply(int msg_id, String publickey) throws BESystemException, BELogicException, TException;

        void apply_friend(String publickey) throws BESystemException, BELogicException, TException;

        void delete_friend(String publickey) throws BESystemException, BELogicException, TException;

        List<BBFeed> get_feeds(long before_timestamp) throws BESystemException, BELogicException, TException;

        int get_friend_msg_count() throws BESystemException, BELogicException, TException;

        List<BBFriendMsg> get_friend_msgs() throws BESystemException, BELogicException, TException;

        List<BBFriendInfo> get_friends() throws BESystemException, BELogicException, TException;

        BBRankResult get_rank() throws BESystemException, BELogicException, TException;

        List<BBSearchResult> get_suggest_friends() throws BESystemException, BELogicException, TException;

        boolean has_new_feeds() throws BESystemException, BELogicException, TException;

        boolean has_new_friend_msgs() throws BESystemException, BELogicException, TException;

        void ignore_friend_apply(int msg_id) throws BESystemException, BELogicException, TException;

        List<BBSearchResult> search_user(String query_str) throws BESystemException, BELogicException, TException;

        boolean send_share_success(BBShareModule module_name, BBShareChannel channel, long timestamp) throws BESystemException, BELogicException, TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Processor<I extends Iface> extends TBaseProcessor<I> implements TProcessor {
        private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class accept_friend_apply<I extends Iface> extends ProcessFunction<I, accept_friend_apply_args> {
            public accept_friend_apply() {
                super("accept_friend_apply");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public accept_friend_apply_args getEmptyArgsInstance() {
                return new accept_friend_apply_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public accept_friend_apply_result getResult(I iface, accept_friend_apply_args args) throws TException {
                accept_friend_apply_result accept_friend_apply_resultVar = new accept_friend_apply_result();
                try {
                    iface.accept_friend_apply(args.msg_id, args.publickey);
                    return accept_friend_apply_resultVar;
                } catch (BELogicException e11) {
                    accept_friend_apply_resultVar.logicException = e11;
                    return accept_friend_apply_resultVar;
                } catch (BESystemException e12) {
                    accept_friend_apply_resultVar.sysException = e12;
                    return accept_friend_apply_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class apply_friend<I extends Iface> extends ProcessFunction<I, apply_friend_args> {
            public apply_friend() {
                super("apply_friend");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public apply_friend_args getEmptyArgsInstance() {
                return new apply_friend_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public apply_friend_result getResult(I iface, apply_friend_args args) throws TException {
                apply_friend_result apply_friend_resultVar = new apply_friend_result();
                try {
                    iface.apply_friend(args.publickey);
                    return apply_friend_resultVar;
                } catch (BELogicException e11) {
                    apply_friend_resultVar.logicException = e11;
                    return apply_friend_resultVar;
                } catch (BESystemException e12) {
                    apply_friend_resultVar.sysException = e12;
                    return apply_friend_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_friend<I extends Iface> extends ProcessFunction<I, delete_friend_args> {
            public delete_friend() {
                super("delete_friend");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public delete_friend_args getEmptyArgsInstance() {
                return new delete_friend_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public delete_friend_result getResult(I iface, delete_friend_args args) throws TException {
                delete_friend_result delete_friend_resultVar = new delete_friend_result();
                try {
                    iface.delete_friend(args.publickey);
                    return delete_friend_resultVar;
                } catch (BELogicException e11) {
                    delete_friend_resultVar.logicException = e11;
                    return delete_friend_resultVar;
                } catch (BESystemException e12) {
                    delete_friend_resultVar.sysException = e12;
                    return delete_friend_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_feeds<I extends Iface> extends ProcessFunction<I, get_feeds_args> {
            public get_feeds() {
                super("get_feeds");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_feeds_args getEmptyArgsInstance() {
                return new get_feeds_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_feeds_result getResult(I iface, get_feeds_args args) throws TException {
                get_feeds_result get_feeds_resultVar = new get_feeds_result();
                try {
                    get_feeds_resultVar.success = iface.get_feeds(args.before_timestamp);
                    return get_feeds_resultVar;
                } catch (BELogicException e11) {
                    get_feeds_resultVar.logicException = e11;
                    return get_feeds_resultVar;
                } catch (BESystemException e12) {
                    get_feeds_resultVar.sysException = e12;
                    return get_feeds_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friend_msg_count<I extends Iface> extends ProcessFunction<I, get_friend_msg_count_args> {
            public get_friend_msg_count() {
                super("get_friend_msg_count");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_friend_msg_count_args getEmptyArgsInstance() {
                return new get_friend_msg_count_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_friend_msg_count_result getResult(I iface, get_friend_msg_count_args args) throws TException {
                get_friend_msg_count_result get_friend_msg_count_resultVar = new get_friend_msg_count_result();
                try {
                    get_friend_msg_count_resultVar.success = iface.get_friend_msg_count();
                    get_friend_msg_count_resultVar.setSuccessIsSet(true);
                    return get_friend_msg_count_resultVar;
                } catch (BELogicException e11) {
                    get_friend_msg_count_resultVar.logicException = e11;
                    return get_friend_msg_count_resultVar;
                } catch (BESystemException e12) {
                    get_friend_msg_count_resultVar.sysException = e12;
                    return get_friend_msg_count_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friend_msgs<I extends Iface> extends ProcessFunction<I, get_friend_msgs_args> {
            public get_friend_msgs() {
                super("get_friend_msgs");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_friend_msgs_args getEmptyArgsInstance() {
                return new get_friend_msgs_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_friend_msgs_result getResult(I iface, get_friend_msgs_args args) throws TException {
                get_friend_msgs_result get_friend_msgs_resultVar = new get_friend_msgs_result();
                try {
                    get_friend_msgs_resultVar.success = iface.get_friend_msgs();
                    return get_friend_msgs_resultVar;
                } catch (BELogicException e11) {
                    get_friend_msgs_resultVar.logicException = e11;
                    return get_friend_msgs_resultVar;
                } catch (BESystemException e12) {
                    get_friend_msgs_resultVar.sysException = e12;
                    return get_friend_msgs_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friends<I extends Iface> extends ProcessFunction<I, get_friends_args> {
            public get_friends() {
                super("get_friends");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_friends_args getEmptyArgsInstance() {
                return new get_friends_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_friends_result getResult(I iface, get_friends_args args) throws TException {
                get_friends_result get_friends_resultVar = new get_friends_result();
                try {
                    get_friends_resultVar.success = iface.get_friends();
                    return get_friends_resultVar;
                } catch (BELogicException e11) {
                    get_friends_resultVar.logicException = e11;
                    return get_friends_resultVar;
                } catch (BESystemException e12) {
                    get_friends_resultVar.sysException = e12;
                    return get_friends_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_rank<I extends Iface> extends ProcessFunction<I, get_rank_args> {
            public get_rank() {
                super("get_rank");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_rank_args getEmptyArgsInstance() {
                return new get_rank_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_rank_result getResult(I iface, get_rank_args args) throws TException {
                get_rank_result get_rank_resultVar = new get_rank_result();
                try {
                    get_rank_resultVar.success = iface.get_rank();
                    return get_rank_resultVar;
                } catch (BELogicException e11) {
                    get_rank_resultVar.logicException = e11;
                    return get_rank_resultVar;
                } catch (BESystemException e12) {
                    get_rank_resultVar.sysException = e12;
                    return get_rank_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_suggest_friends<I extends Iface> extends ProcessFunction<I, get_suggest_friends_args> {
            public get_suggest_friends() {
                super("get_suggest_friends");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_suggest_friends_args getEmptyArgsInstance() {
                return new get_suggest_friends_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_suggest_friends_result getResult(I iface, get_suggest_friends_args args) throws TException {
                get_suggest_friends_result get_suggest_friends_resultVar = new get_suggest_friends_result();
                try {
                    get_suggest_friends_resultVar.success = iface.get_suggest_friends();
                    return get_suggest_friends_resultVar;
                } catch (BELogicException e11) {
                    get_suggest_friends_resultVar.logicException = e11;
                    return get_suggest_friends_resultVar;
                } catch (BESystemException e12) {
                    get_suggest_friends_resultVar.sysException = e12;
                    return get_suggest_friends_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class has_new_feeds<I extends Iface> extends ProcessFunction<I, has_new_feeds_args> {
            public has_new_feeds() {
                super("has_new_feeds");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public has_new_feeds_args getEmptyArgsInstance() {
                return new has_new_feeds_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public has_new_feeds_result getResult(I iface, has_new_feeds_args args) throws TException {
                has_new_feeds_result has_new_feeds_resultVar = new has_new_feeds_result();
                try {
                    has_new_feeds_resultVar.success = iface.has_new_feeds();
                    has_new_feeds_resultVar.setSuccessIsSet(true);
                    return has_new_feeds_resultVar;
                } catch (BELogicException e11) {
                    has_new_feeds_resultVar.logicException = e11;
                    return has_new_feeds_resultVar;
                } catch (BESystemException e12) {
                    has_new_feeds_resultVar.sysException = e12;
                    return has_new_feeds_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class has_new_friend_msgs<I extends Iface> extends ProcessFunction<I, has_new_friend_msgs_args> {
            public has_new_friend_msgs() {
                super("has_new_friend_msgs");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public has_new_friend_msgs_args getEmptyArgsInstance() {
                return new has_new_friend_msgs_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public has_new_friend_msgs_result getResult(I iface, has_new_friend_msgs_args args) throws TException {
                has_new_friend_msgs_result has_new_friend_msgs_resultVar = new has_new_friend_msgs_result();
                try {
                    has_new_friend_msgs_resultVar.success = iface.has_new_friend_msgs();
                    has_new_friend_msgs_resultVar.setSuccessIsSet(true);
                    return has_new_friend_msgs_resultVar;
                } catch (BELogicException e11) {
                    has_new_friend_msgs_resultVar.logicException = e11;
                    return has_new_friend_msgs_resultVar;
                } catch (BESystemException e12) {
                    has_new_friend_msgs_resultVar.sysException = e12;
                    return has_new_friend_msgs_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ignore_friend_apply<I extends Iface> extends ProcessFunction<I, ignore_friend_apply_args> {
            public ignore_friend_apply() {
                super("ignore_friend_apply");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public ignore_friend_apply_args getEmptyArgsInstance() {
                return new ignore_friend_apply_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public ignore_friend_apply_result getResult(I iface, ignore_friend_apply_args args) throws TException {
                ignore_friend_apply_result ignore_friend_apply_resultVar = new ignore_friend_apply_result();
                try {
                    iface.ignore_friend_apply(args.msg_id);
                    return ignore_friend_apply_resultVar;
                } catch (BELogicException e11) {
                    ignore_friend_apply_resultVar.logicException = e11;
                    return ignore_friend_apply_resultVar;
                } catch (BESystemException e12) {
                    ignore_friend_apply_resultVar.sysException = e12;
                    return ignore_friend_apply_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_user<I extends Iface> extends ProcessFunction<I, search_user_args> {
            public search_user() {
                super("search_user");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public search_user_args getEmptyArgsInstance() {
                return new search_user_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public search_user_result getResult(I iface, search_user_args args) throws TException {
                search_user_result search_user_resultVar = new search_user_result();
                try {
                    search_user_resultVar.success = iface.search_user(args.query_str);
                    return search_user_resultVar;
                } catch (BELogicException e11) {
                    search_user_resultVar.logicException = e11;
                    return search_user_resultVar;
                } catch (BESystemException e12) {
                    search_user_resultVar.sysException = e12;
                    return search_user_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class send_share_success<I extends Iface> extends ProcessFunction<I, send_share_success_args> {
            public send_share_success() {
                super("send_share_success");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public send_share_success_args getEmptyArgsInstance() {
                return new send_share_success_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public send_share_success_result getResult(I iface, send_share_success_args args) throws TException {
                send_share_success_result send_share_success_resultVar = new send_share_success_result();
                try {
                    send_share_success_resultVar.success = iface.send_share_success(args.module_name, args.channel, args.timestamp);
                    send_share_success_resultVar.setSuccessIsSet(true);
                    return send_share_success_resultVar;
                } catch (BELogicException e11) {
                    send_share_success_resultVar.logicException = e11;
                    return send_share_success_resultVar;
                } catch (BESystemException e12) {
                    send_share_success_resultVar.sysException = e12;
                    return send_share_success_resultVar;
                }
            }
        }

        public Processor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends Iface> Map<String, ProcessFunction<I, ? extends TBase>> getProcessMap(Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            processMap.put("search_user", new search_user());
            processMap.put("has_new_friend_msgs", new has_new_friend_msgs());
            processMap.put("get_friend_msgs", new get_friend_msgs());
            processMap.put("get_friend_msg_count", new get_friend_msg_count());
            processMap.put("accept_friend_apply", new accept_friend_apply());
            processMap.put("ignore_friend_apply", new ignore_friend_apply());
            processMap.put("apply_friend", new apply_friend());
            processMap.put("delete_friend", new delete_friend());
            processMap.put("get_friends", new get_friends());
            processMap.put("get_rank", new get_rank());
            processMap.put("has_new_feeds", new has_new_feeds());
            processMap.put("get_feeds", new get_feeds());
            processMap.put("get_suggest_friends", new get_suggest_friends());
            processMap.put("send_share_success", new send_share_success());
            return processMap;
        }

        public Processor(I iface, Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            super(iface, getProcessMap(processMap));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class accept_friend_apply_args implements TBase<accept_friend_apply_args, _Fields>, Serializable, Cloneable, Comparable<accept_friend_apply_args> {
        private static final int __MSG_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int msg_id;
        public String publickey;
        private static final TStruct STRUCT_DESC = new TStruct("accept_friend_apply_args");
        private static final TField MSG_ID_FIELD_DESC = new TField("msg_id", (byte) 8, 1);
        private static final TField PUBLICKEY_FIELD_DESC = new TField("publickey", (byte) 11, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            MSG_ID(1, "msg_id"),
            PUBLICKEY(2, "publickey");

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
                    return MSG_ID;
                }
                if (fieldId != 2) {
                    return null;
                }
                return PUBLICKEY;
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
        public static class accept_friend_apply_argsStandardScheme extends StandardScheme<accept_friend_apply_args> {
            private accept_friend_apply_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, accept_friend_apply_args struct) throws TException {
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
                            struct.publickey = iprot.readString();
                            struct.setPublickeyIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.msg_id = iprot.readI32();
                        struct.setMsg_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (struct.isSetMsg_id()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'msg_id' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, accept_friend_apply_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(accept_friend_apply_args.STRUCT_DESC);
                oprot.writeFieldBegin(accept_friend_apply_args.MSG_ID_FIELD_DESC);
                oprot.writeI32(struct.msg_id);
                oprot.writeFieldEnd();
                if (struct.publickey != null) {
                    oprot.writeFieldBegin(accept_friend_apply_args.PUBLICKEY_FIELD_DESC);
                    oprot.writeString(struct.publickey);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class accept_friend_apply_argsStandardSchemeFactory implements SchemeFactory {
            private accept_friend_apply_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public accept_friend_apply_argsStandardScheme getScheme() {
                return new accept_friend_apply_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class accept_friend_apply_argsTupleScheme extends TupleScheme<accept_friend_apply_args> {
            private accept_friend_apply_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, accept_friend_apply_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.msg_id = tTupleProtocol.readI32();
                struct.setMsg_idIsSet(true);
                struct.publickey = tTupleProtocol.readString();
                struct.setPublickeyIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, accept_friend_apply_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.msg_id);
                tTupleProtocol.writeString(struct.publickey);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class accept_friend_apply_argsTupleSchemeFactory implements SchemeFactory {
            private accept_friend_apply_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public accept_friend_apply_argsTupleScheme getScheme() {
                return new accept_friend_apply_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new accept_friend_apply_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new accept_friend_apply_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.MSG_ID, (_Fields) new FieldMetaData("msg_id", (byte) 1, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.PUBLICKEY, (_Fields) new FieldMetaData("publickey", (byte) 1, new FieldValueMetaData((byte) 11)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(accept_friend_apply_args.class, unmodifiableMap);
        }

        public accept_friend_apply_args() {
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
            setMsg_idIsSet(false);
            this.msg_id = 0;
            this.publickey = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof accept_friend_apply_args)) {
                return equals((accept_friend_apply_args) that);
            }
            return false;
        }

        public int getMsg_id() {
            return this.msg_id;
        }

        public String getPublickey() {
            return this.publickey;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetMsg_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        public boolean isSetPublickey() {
            return this.publickey != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public accept_friend_apply_args setMsg_id(int msg_id) {
            this.msg_id = msg_id;
            setMsg_idIsSet(true);
            return this;
        }

        public void setMsg_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public accept_friend_apply_args setPublickey(String publickey) {
            this.publickey = publickey;
            return this;
        }

        public void setPublickeyIsSet(boolean value) {
            if (value) {
                return;
            }
            this.publickey = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("accept_friend_apply_args(");
            sb2.append("msg_id:");
            sb2.append(this.msg_id);
            sb2.append(j2.O);
            sb2.append("publickey:");
            String str = this.publickey;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetMsg_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        public void unsetPublickey() {
            this.publickey = null;
        }

        public void validate() throws TException {
            if (this.publickey != null) {
                return;
            }
            throw new TProtocolException("Required field 'publickey' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(accept_friend_apply_args other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetMsg_id()).compareTo(Boolean.valueOf(other.isSetMsg_id()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetMsg_id() && (compareTo2 = TBaseHelper.compareTo(this.msg_id, other.msg_id)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetPublickey()).compareTo(Boolean.valueOf(other.isSetPublickey()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetPublickey() || (compareTo = TBaseHelper.compareTo(this.publickey, other.publickey)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<accept_friend_apply_args, _Fields> deepCopy2() {
            return new accept_friend_apply_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$accept_friend_apply_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getMsg_id());
            }
            if (i11 == 2) {
                return getPublickey();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$accept_friend_apply_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetMsg_id();
            }
            if (i11 == 2) {
                return isSetPublickey();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$accept_friend_apply_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetMsg_id();
                    return;
                } else {
                    setMsg_id(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetPublickey();
            } else {
                setPublickey((String) value);
            }
        }

        public accept_friend_apply_args(int msg_id, String publickey) {
            this();
            this.msg_id = msg_id;
            setMsg_idIsSet(true);
            this.publickey = publickey;
        }

        public boolean equals(accept_friend_apply_args that) {
            if (that == null || this.msg_id != that.msg_id) {
                return false;
            }
            boolean isSetPublickey = isSetPublickey();
            boolean isSetPublickey2 = that.isSetPublickey();
            if (isSetPublickey || isSetPublickey2) {
                return isSetPublickey && isSetPublickey2 && this.publickey.equals(that.publickey);
            }
            return true;
        }

        public accept_friend_apply_args(accept_friend_apply_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.msg_id = other.msg_id;
            if (other.isSetPublickey()) {
                this.publickey = other.publickey;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class accept_friend_apply_result implements TBase<accept_friend_apply_result, _Fields>, Serializable, Cloneable, Comparable<accept_friend_apply_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logicException;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("accept_friend_apply_result");
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOGIC_EXCEPTION_FIELD_DESC = new TField("logicException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
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
        public static class accept_friend_apply_resultStandardScheme extends StandardScheme<accept_friend_apply_result> {
            private accept_friend_apply_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, accept_friend_apply_result struct) throws TException {
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
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, accept_friend_apply_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(accept_friend_apply_result.STRUCT_DESC);
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(accept_friend_apply_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(accept_friend_apply_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class accept_friend_apply_resultStandardSchemeFactory implements SchemeFactory {
            private accept_friend_apply_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public accept_friend_apply_resultStandardScheme getScheme() {
                return new accept_friend_apply_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class accept_friend_apply_resultTupleScheme extends TupleScheme<accept_friend_apply_result> {
            private accept_friend_apply_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, accept_friend_apply_result struct) throws TException {
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
                    struct.logicException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogicExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, accept_friend_apply_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSysException()) {
                    bitSet.set(0);
                }
                if (struct.isSetLogicException()) {
                    bitSet.set(1);
                }
                tTupleProtocol.writeBitSet(bitSet, 2);
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogicException()) {
                    struct.logicException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class accept_friend_apply_resultTupleSchemeFactory implements SchemeFactory {
            private accept_friend_apply_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public accept_friend_apply_resultTupleScheme getScheme() {
                return new accept_friend_apply_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new accept_friend_apply_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new accept_friend_apply_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(accept_friend_apply_result.class, unmodifiableMap);
        }

        public accept_friend_apply_result() {
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
            this.logicException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof accept_friend_apply_result)) {
                return equals((accept_friend_apply_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
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

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public accept_friend_apply_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public accept_friend_apply_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("accept_friend_apply_result(");
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

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public accept_friend_apply_result(BESystemException sysException, BELogicException logicException) {
            this();
            this.sysException = sysException;
            this.logicException = logicException;
        }

        @Override // java.lang.Comparable
        public int compareTo(accept_friend_apply_result other) {
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
            int compareTo4 = Boolean.valueOf(isSetLogicException()).compareTo(Boolean.valueOf(other.isSetLogicException()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetLogicException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logicException, (Comparable) other.logicException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<accept_friend_apply_result, _Fields> deepCopy2() {
            return new accept_friend_apply_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$accept_friend_apply_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSysException();
            }
            if (i11 == 2) {
                return getLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$accept_friend_apply_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSysException();
            }
            if (i11 == 2) {
                return isSetLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$accept_friend_apply_result$_Fields[field.ordinal()];
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
                unsetLogicException();
            } else {
                setLogicException((BELogicException) value);
            }
        }

        public boolean equals(accept_friend_apply_result that) {
            if (that == null) {
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

        public accept_friend_apply_result(accept_friend_apply_result other) {
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
    public static class apply_friend_args implements TBase<apply_friend_args, _Fields>, Serializable, Cloneable, Comparable<apply_friend_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public String publickey;
        private static final TStruct STRUCT_DESC = new TStruct("apply_friend_args");
        private static final TField PUBLICKEY_FIELD_DESC = new TField("publickey", (byte) 11, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            PUBLICKEY(1, "publickey");

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
                return PUBLICKEY;
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
        public static class apply_friend_argsStandardScheme extends StandardScheme<apply_friend_args> {
            private apply_friend_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, apply_friend_args struct) throws TException {
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
                        struct.publickey = iprot.readString();
                        struct.setPublickeyIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, apply_friend_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(apply_friend_args.STRUCT_DESC);
                if (struct.publickey != null) {
                    oprot.writeFieldBegin(apply_friend_args.PUBLICKEY_FIELD_DESC);
                    oprot.writeString(struct.publickey);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class apply_friend_argsStandardSchemeFactory implements SchemeFactory {
            private apply_friend_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public apply_friend_argsStandardScheme getScheme() {
                return new apply_friend_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class apply_friend_argsTupleScheme extends TupleScheme<apply_friend_args> {
            private apply_friend_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, apply_friend_args struct) throws TException {
                struct.publickey = ((TTupleProtocol) prot).readString();
                struct.setPublickeyIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, apply_friend_args struct) throws TException {
                ((TTupleProtocol) prot).writeString(struct.publickey);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class apply_friend_argsTupleSchemeFactory implements SchemeFactory {
            private apply_friend_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public apply_friend_argsTupleScheme getScheme() {
                return new apply_friend_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new apply_friend_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new apply_friend_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.PUBLICKEY, (_Fields) new FieldMetaData("publickey", (byte) 1, new FieldValueMetaData((byte) 11)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(apply_friend_args.class, unmodifiableMap);
        }

        public apply_friend_args() {
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
            this.publickey = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof apply_friend_args)) {
                return equals((apply_friend_args) that);
            }
            return false;
        }

        public String getPublickey() {
            return this.publickey;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetPublickey() {
            return this.publickey != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public apply_friend_args setPublickey(String publickey) {
            this.publickey = publickey;
            return this;
        }

        public void setPublickeyIsSet(boolean value) {
            if (value) {
                return;
            }
            this.publickey = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("apply_friend_args(");
            sb2.append("publickey:");
            String str = this.publickey;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetPublickey() {
            this.publickey = null;
        }

        public void validate() throws TException {
            if (this.publickey != null) {
                return;
            }
            throw new TProtocolException("Required field 'publickey' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public apply_friend_args(String publickey) {
            this();
            this.publickey = publickey;
        }

        @Override // java.lang.Comparable
        public int compareTo(apply_friend_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetPublickey()).compareTo(Boolean.valueOf(other.isSetPublickey()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetPublickey() || (compareTo = TBaseHelper.compareTo(this.publickey, other.publickey)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<apply_friend_args, _Fields> deepCopy2() {
            return new apply_friend_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$apply_friend_args$_Fields[field.ordinal()] == 1) {
                return getPublickey();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$apply_friend_args$_Fields[field.ordinal()] == 1) {
                return isSetPublickey();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$apply_friend_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetPublickey();
            } else {
                setPublickey((String) value);
            }
        }

        public boolean equals(apply_friend_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetPublickey = isSetPublickey();
            boolean isSetPublickey2 = that.isSetPublickey();
            if (isSetPublickey || isSetPublickey2) {
                return isSetPublickey && isSetPublickey2 && this.publickey.equals(that.publickey);
            }
            return true;
        }

        public apply_friend_args(apply_friend_args other) {
            if (other.isSetPublickey()) {
                this.publickey = other.publickey;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class apply_friend_result implements TBase<apply_friend_result, _Fields>, Serializable, Cloneable, Comparable<apply_friend_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logicException;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("apply_friend_result");
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOGIC_EXCEPTION_FIELD_DESC = new TField("logicException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
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
        public static class apply_friend_resultStandardScheme extends StandardScheme<apply_friend_result> {
            private apply_friend_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, apply_friend_result struct) throws TException {
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
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, apply_friend_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(apply_friend_result.STRUCT_DESC);
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(apply_friend_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(apply_friend_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class apply_friend_resultStandardSchemeFactory implements SchemeFactory {
            private apply_friend_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public apply_friend_resultStandardScheme getScheme() {
                return new apply_friend_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class apply_friend_resultTupleScheme extends TupleScheme<apply_friend_result> {
            private apply_friend_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, apply_friend_result struct) throws TException {
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
                    struct.logicException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogicExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, apply_friend_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSysException()) {
                    bitSet.set(0);
                }
                if (struct.isSetLogicException()) {
                    bitSet.set(1);
                }
                tTupleProtocol.writeBitSet(bitSet, 2);
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogicException()) {
                    struct.logicException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class apply_friend_resultTupleSchemeFactory implements SchemeFactory {
            private apply_friend_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public apply_friend_resultTupleScheme getScheme() {
                return new apply_friend_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new apply_friend_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new apply_friend_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(apply_friend_result.class, unmodifiableMap);
        }

        public apply_friend_result() {
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
            this.logicException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof apply_friend_result)) {
                return equals((apply_friend_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
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

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public apply_friend_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public apply_friend_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("apply_friend_result(");
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

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public apply_friend_result(BESystemException sysException, BELogicException logicException) {
            this();
            this.sysException = sysException;
            this.logicException = logicException;
        }

        @Override // java.lang.Comparable
        public int compareTo(apply_friend_result other) {
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
            int compareTo4 = Boolean.valueOf(isSetLogicException()).compareTo(Boolean.valueOf(other.isSetLogicException()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetLogicException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logicException, (Comparable) other.logicException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<apply_friend_result, _Fields> deepCopy2() {
            return new apply_friend_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$apply_friend_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSysException();
            }
            if (i11 == 2) {
                return getLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$apply_friend_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSysException();
            }
            if (i11 == 2) {
                return isSetLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$apply_friend_result$_Fields[field.ordinal()];
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
                unsetLogicException();
            } else {
                setLogicException((BELogicException) value);
            }
        }

        public boolean equals(apply_friend_result that) {
            if (that == null) {
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

        public apply_friend_result(apply_friend_result other) {
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
    public static class delete_friend_args implements TBase<delete_friend_args, _Fields>, Serializable, Cloneable, Comparable<delete_friend_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public String publickey;
        private static final TStruct STRUCT_DESC = new TStruct("delete_friend_args");
        private static final TField PUBLICKEY_FIELD_DESC = new TField("publickey", (byte) 11, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            PUBLICKEY(1, "publickey");

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
                return PUBLICKEY;
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
        public static class delete_friend_argsStandardScheme extends StandardScheme<delete_friend_args> {
            private delete_friend_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, delete_friend_args struct) throws TException {
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
                        struct.publickey = iprot.readString();
                        struct.setPublickeyIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, delete_friend_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(delete_friend_args.STRUCT_DESC);
                if (struct.publickey != null) {
                    oprot.writeFieldBegin(delete_friend_args.PUBLICKEY_FIELD_DESC);
                    oprot.writeString(struct.publickey);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_friend_argsStandardSchemeFactory implements SchemeFactory {
            private delete_friend_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public delete_friend_argsStandardScheme getScheme() {
                return new delete_friend_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_friend_argsTupleScheme extends TupleScheme<delete_friend_args> {
            private delete_friend_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, delete_friend_args struct) throws TException {
                struct.publickey = ((TTupleProtocol) prot).readString();
                struct.setPublickeyIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, delete_friend_args struct) throws TException {
                ((TTupleProtocol) prot).writeString(struct.publickey);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_friend_argsTupleSchemeFactory implements SchemeFactory {
            private delete_friend_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public delete_friend_argsTupleScheme getScheme() {
                return new delete_friend_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new delete_friend_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new delete_friend_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.PUBLICKEY, (_Fields) new FieldMetaData("publickey", (byte) 1, new FieldValueMetaData((byte) 11)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(delete_friend_args.class, unmodifiableMap);
        }

        public delete_friend_args() {
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
            this.publickey = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof delete_friend_args)) {
                return equals((delete_friend_args) that);
            }
            return false;
        }

        public String getPublickey() {
            return this.publickey;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetPublickey() {
            return this.publickey != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public delete_friend_args setPublickey(String publickey) {
            this.publickey = publickey;
            return this;
        }

        public void setPublickeyIsSet(boolean value) {
            if (value) {
                return;
            }
            this.publickey = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("delete_friend_args(");
            sb2.append("publickey:");
            String str = this.publickey;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetPublickey() {
            this.publickey = null;
        }

        public void validate() throws TException {
            if (this.publickey != null) {
                return;
            }
            throw new TProtocolException("Required field 'publickey' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public delete_friend_args(String publickey) {
            this();
            this.publickey = publickey;
        }

        @Override // java.lang.Comparable
        public int compareTo(delete_friend_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetPublickey()).compareTo(Boolean.valueOf(other.isSetPublickey()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetPublickey() || (compareTo = TBaseHelper.compareTo(this.publickey, other.publickey)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<delete_friend_args, _Fields> deepCopy2() {
            return new delete_friend_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$delete_friend_args$_Fields[field.ordinal()] == 1) {
                return getPublickey();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$delete_friend_args$_Fields[field.ordinal()] == 1) {
                return isSetPublickey();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$delete_friend_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetPublickey();
            } else {
                setPublickey((String) value);
            }
        }

        public boolean equals(delete_friend_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetPublickey = isSetPublickey();
            boolean isSetPublickey2 = that.isSetPublickey();
            if (isSetPublickey || isSetPublickey2) {
                return isSetPublickey && isSetPublickey2 && this.publickey.equals(that.publickey);
            }
            return true;
        }

        public delete_friend_args(delete_friend_args other) {
            if (other.isSetPublickey()) {
                this.publickey = other.publickey;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class delete_friend_result implements TBase<delete_friend_result, _Fields>, Serializable, Cloneable, Comparable<delete_friend_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logicException;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("delete_friend_result");
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOGIC_EXCEPTION_FIELD_DESC = new TField("logicException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
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
        public static class delete_friend_resultStandardScheme extends StandardScheme<delete_friend_result> {
            private delete_friend_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, delete_friend_result struct) throws TException {
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
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, delete_friend_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(delete_friend_result.STRUCT_DESC);
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(delete_friend_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(delete_friend_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_friend_resultStandardSchemeFactory implements SchemeFactory {
            private delete_friend_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public delete_friend_resultStandardScheme getScheme() {
                return new delete_friend_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_friend_resultTupleScheme extends TupleScheme<delete_friend_result> {
            private delete_friend_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, delete_friend_result struct) throws TException {
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
                    struct.logicException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogicExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, delete_friend_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSysException()) {
                    bitSet.set(0);
                }
                if (struct.isSetLogicException()) {
                    bitSet.set(1);
                }
                tTupleProtocol.writeBitSet(bitSet, 2);
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogicException()) {
                    struct.logicException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_friend_resultTupleSchemeFactory implements SchemeFactory {
            private delete_friend_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public delete_friend_resultTupleScheme getScheme() {
                return new delete_friend_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new delete_friend_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new delete_friend_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(delete_friend_result.class, unmodifiableMap);
        }

        public delete_friend_result() {
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
            this.logicException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof delete_friend_result)) {
                return equals((delete_friend_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
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

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public delete_friend_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public delete_friend_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("delete_friend_result(");
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

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public delete_friend_result(BESystemException sysException, BELogicException logicException) {
            this();
            this.sysException = sysException;
            this.logicException = logicException;
        }

        @Override // java.lang.Comparable
        public int compareTo(delete_friend_result other) {
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
            int compareTo4 = Boolean.valueOf(isSetLogicException()).compareTo(Boolean.valueOf(other.isSetLogicException()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetLogicException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logicException, (Comparable) other.logicException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<delete_friend_result, _Fields> deepCopy2() {
            return new delete_friend_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$delete_friend_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSysException();
            }
            if (i11 == 2) {
                return getLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$delete_friend_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSysException();
            }
            if (i11 == 2) {
                return isSetLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$delete_friend_result$_Fields[field.ordinal()];
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
                unsetLogicException();
            } else {
                setLogicException((BELogicException) value);
            }
        }

        public boolean equals(delete_friend_result that) {
            if (that == null) {
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

        public delete_friend_result(delete_friend_result other) {
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
    public static class get_feeds_args implements TBase<get_feeds_args, _Fields>, Serializable, Cloneable, Comparable<get_feeds_args> {
        private static final int __BEFORE_TIMESTAMP_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public long before_timestamp;
        private static final TStruct STRUCT_DESC = new TStruct("get_feeds_args");
        private static final TField BEFORE_TIMESTAMP_FIELD_DESC = new TField("before_timestamp", (byte) 10, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            BEFORE_TIMESTAMP(1, "before_timestamp");

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
                return BEFORE_TIMESTAMP;
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
        public static class get_feeds_argsStandardScheme extends StandardScheme<get_feeds_args> {
            private get_feeds_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_feeds_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        break;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 10) {
                        struct.before_timestamp = iprot.readI64();
                        struct.setBefore_timestampIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (struct.isSetBefore_timestamp()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'before_timestamp' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_feeds_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_feeds_args.STRUCT_DESC);
                oprot.writeFieldBegin(get_feeds_args.BEFORE_TIMESTAMP_FIELD_DESC);
                oprot.writeI64(struct.before_timestamp);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_feeds_argsStandardSchemeFactory implements SchemeFactory {
            private get_feeds_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_feeds_argsStandardScheme getScheme() {
                return new get_feeds_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_feeds_argsTupleScheme extends TupleScheme<get_feeds_args> {
            private get_feeds_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_feeds_args struct) throws TException {
                struct.before_timestamp = ((TTupleProtocol) prot).readI64();
                struct.setBefore_timestampIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_feeds_args struct) throws TException {
                ((TTupleProtocol) prot).writeI64(struct.before_timestamp);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_feeds_argsTupleSchemeFactory implements SchemeFactory {
            private get_feeds_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_feeds_argsTupleScheme getScheme() {
                return new get_feeds_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_feeds_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_feeds_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BEFORE_TIMESTAMP, (_Fields) new FieldMetaData("before_timestamp", (byte) 1, new FieldValueMetaData((byte) 10)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_feeds_args.class, unmodifiableMap);
        }

        public get_feeds_args() {
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
            setBefore_timestampIsSet(false);
            this.before_timestamp = 0L;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_feeds_args)) {
                return equals((get_feeds_args) that);
            }
            return false;
        }

        public long getBefore_timestamp() {
            return this.before_timestamp;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBefore_timestamp() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_feeds_args setBefore_timestamp(long before_timestamp) {
            this.before_timestamp = before_timestamp;
            setBefore_timestampIsSet(true);
            return this;
        }

        public void setBefore_timestampIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "get_feeds_args(before_timestamp:" + this.before_timestamp + j.f81007d;
        }

        public void unsetBefore_timestamp() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_feeds_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetBefore_timestamp()).compareTo(Boolean.valueOf(other.isSetBefore_timestamp()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetBefore_timestamp() || (compareTo = TBaseHelper.compareTo(this.before_timestamp, other.before_timestamp)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_feeds_args, _Fields> deepCopy2() {
            return new get_feeds_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_feeds_args$_Fields[field.ordinal()] == 1) {
                return Long.valueOf(getBefore_timestamp());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_feeds_args$_Fields[field.ordinal()] == 1) {
                return isSetBefore_timestamp();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_feeds_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetBefore_timestamp();
            } else {
                setBefore_timestamp(((Long) value).longValue());
            }
        }

        public get_feeds_args(long before_timestamp) {
            this();
            this.before_timestamp = before_timestamp;
            setBefore_timestampIsSet(true);
        }

        public boolean equals(get_feeds_args that) {
            return that != null && this.before_timestamp == that.before_timestamp;
        }

        public get_feeds_args(get_feeds_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.before_timestamp = other.before_timestamp;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_feeds_result implements TBase<get_feeds_result, _Fields>, Serializable, Cloneable, Comparable<get_feeds_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logicException;
        public List<BBFeed> success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("get_feeds_result");
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
        public static class get_feeds_resultStandardScheme extends StandardScheme<get_feeds_result> {
            private get_feeds_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_feeds_result struct) throws TException {
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
                            BBFeed bBFeed = new BBFeed();
                            bBFeed.read(iprot);
                            struct.success.add(bBFeed);
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
            public void write(TProtocol oprot, get_feeds_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_feeds_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_feeds_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<BBFeed> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(get_feeds_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(get_feeds_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_feeds_resultStandardSchemeFactory implements SchemeFactory {
            private get_feeds_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_feeds_resultStandardScheme getScheme() {
                return new get_feeds_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_feeds_resultTupleScheme extends TupleScheme<get_feeds_result> {
            private get_feeds_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_feeds_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        BBFeed bBFeed = new BBFeed();
                        bBFeed.read(tTupleProtocol);
                        struct.success.add(bBFeed);
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
            public void write(TProtocol prot, get_feeds_result struct) throws TException {
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
                    Iterator<BBFeed> it = struct.success.iterator();
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
        public static class get_feeds_resultTupleSchemeFactory implements SchemeFactory {
            private get_feeds_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_feeds_resultTupleScheme getScheme() {
                return new get_feeds_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_feeds_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_feeds_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BBFeed.class))));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_feeds_result.class, unmodifiableMap);
        }

        public get_feeds_result() {
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

        public void addToSuccess(BBFeed elem) {
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
            if (that != null && (that instanceof get_feeds_result)) {
                return equals((get_feeds_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
        }

        public List<BBFeed> getSuccess() {
            return this.success;
        }

        public Iterator<BBFeed> getSuccessIterator() {
            List<BBFeed> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<BBFeed> list = this.success;
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

        public get_feeds_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public get_feeds_result setSuccess(List<BBFeed> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public get_feeds_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("get_feeds_result(");
            sb2.append("success:");
            List<BBFeed> list = this.success;
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

        public get_feeds_result(List<BBFeed> success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            this.sysException = sysException;
            this.logicException = logicException;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_feeds_result other) {
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
        public TBase<get_feeds_result, _Fields> deepCopy2() {
            return new get_feeds_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_feeds_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_feeds_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_feeds_result$_Fields[field.ordinal()];
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

        public boolean equals(get_feeds_result that) {
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

        public get_feeds_result(get_feeds_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<BBFeed> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BBFeed(it.next()));
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
    public static class get_friend_msg_count_args implements TBase<get_friend_msg_count_args, _Fields>, Serializable, Cloneable, Comparable<get_friend_msg_count_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_friend_msg_count_args");
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
        public static class get_friend_msg_count_argsStandardScheme extends StandardScheme<get_friend_msg_count_args> {
            private get_friend_msg_count_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_friend_msg_count_args struct) throws TException {
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
            public void write(TProtocol oprot, get_friend_msg_count_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_friend_msg_count_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friend_msg_count_argsStandardSchemeFactory implements SchemeFactory {
            private get_friend_msg_count_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_friend_msg_count_argsStandardScheme getScheme() {
                return new get_friend_msg_count_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friend_msg_count_argsTupleScheme extends TupleScheme<get_friend_msg_count_args> {
            private get_friend_msg_count_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_friend_msg_count_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_friend_msg_count_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friend_msg_count_argsTupleSchemeFactory implements SchemeFactory {
            private get_friend_msg_count_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_friend_msg_count_argsTupleScheme getScheme() {
                return new get_friend_msg_count_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_friend_msg_count_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_friend_msg_count_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_friend_msg_count_args.class, unmodifiableMap);
        }

        public get_friend_msg_count_args() {
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

        public boolean equals(get_friend_msg_count_args that) {
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
            return "get_friend_msg_count_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_friend_msg_count_args(get_friend_msg_count_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_friend_msg_count_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_friend_msg_count_args, _Fields> deepCopy2() {
            return new get_friend_msg_count_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_friend_msg_count_args)) {
                return equals((get_friend_msg_count_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msg_count_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msg_count_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msg_count_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_friend_msg_count_result implements TBase<get_friend_msg_count_result, _Fields>, Serializable, Cloneable, Comparable<get_friend_msg_count_result> {
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public BELogicException logicException;
        public int success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("get_friend_msg_count_result");
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
        public static class get_friend_msg_count_resultStandardScheme extends StandardScheme<get_friend_msg_count_result> {
            private get_friend_msg_count_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_friend_msg_count_result struct) throws TException {
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
            public void write(TProtocol oprot, get_friend_msg_count_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_friend_msg_count_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(get_friend_msg_count_result.SUCCESS_FIELD_DESC);
                    oprot.writeI32(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(get_friend_msg_count_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(get_friend_msg_count_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friend_msg_count_resultStandardSchemeFactory implements SchemeFactory {
            private get_friend_msg_count_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_friend_msg_count_resultStandardScheme getScheme() {
                return new get_friend_msg_count_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friend_msg_count_resultTupleScheme extends TupleScheme<get_friend_msg_count_result> {
            private get_friend_msg_count_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_friend_msg_count_result struct) throws TException {
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
            public void write(TProtocol prot, get_friend_msg_count_result struct) throws TException {
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
        public static class get_friend_msg_count_resultTupleSchemeFactory implements SchemeFactory {
            private get_friend_msg_count_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_friend_msg_count_resultTupleScheme getScheme() {
                return new get_friend_msg_count_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_friend_msg_count_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_friend_msg_count_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_friend_msg_count_result.class, unmodifiableMap);
        }

        public get_friend_msg_count_result() {
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
            if (that != null && (that instanceof get_friend_msg_count_result)) {
                return equals((get_friend_msg_count_result) that);
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

        public get_friend_msg_count_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public get_friend_msg_count_result setSuccess(int success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public get_friend_msg_count_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("get_friend_msg_count_result(");
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
        public int compareTo(get_friend_msg_count_result other) {
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
        public TBase<get_friend_msg_count_result, _Fields> deepCopy2() {
            return new get_friend_msg_count_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msg_count_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msg_count_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msg_count_result$_Fields[field.ordinal()];
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

        public get_friend_msg_count_result(int success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.sysException = sysException;
            this.logicException = logicException;
        }

        public boolean equals(get_friend_msg_count_result that) {
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

        public get_friend_msg_count_result(get_friend_msg_count_result other) {
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
    public static class get_friend_msgs_args implements TBase<get_friend_msgs_args, _Fields>, Serializable, Cloneable, Comparable<get_friend_msgs_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_friend_msgs_args");
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
        public static class get_friend_msgs_argsStandardScheme extends StandardScheme<get_friend_msgs_args> {
            private get_friend_msgs_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_friend_msgs_args struct) throws TException {
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
            public void write(TProtocol oprot, get_friend_msgs_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_friend_msgs_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friend_msgs_argsStandardSchemeFactory implements SchemeFactory {
            private get_friend_msgs_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_friend_msgs_argsStandardScheme getScheme() {
                return new get_friend_msgs_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friend_msgs_argsTupleScheme extends TupleScheme<get_friend_msgs_args> {
            private get_friend_msgs_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_friend_msgs_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_friend_msgs_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friend_msgs_argsTupleSchemeFactory implements SchemeFactory {
            private get_friend_msgs_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_friend_msgs_argsTupleScheme getScheme() {
                return new get_friend_msgs_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_friend_msgs_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_friend_msgs_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_friend_msgs_args.class, unmodifiableMap);
        }

        public get_friend_msgs_args() {
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

        public boolean equals(get_friend_msgs_args that) {
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
            return "get_friend_msgs_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_friend_msgs_args(get_friend_msgs_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_friend_msgs_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_friend_msgs_args, _Fields> deepCopy2() {
            return new get_friend_msgs_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_friend_msgs_args)) {
                return equals((get_friend_msgs_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msgs_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msgs_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msgs_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_friend_msgs_result implements TBase<get_friend_msgs_result, _Fields>, Serializable, Cloneable, Comparable<get_friend_msgs_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logicException;
        public List<BBFriendMsg> success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("get_friend_msgs_result");
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
        public static class get_friend_msgs_resultStandardScheme extends StandardScheme<get_friend_msgs_result> {
            private get_friend_msgs_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_friend_msgs_result struct) throws TException {
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
                            BBFriendMsg bBFriendMsg = new BBFriendMsg();
                            bBFriendMsg.read(iprot);
                            struct.success.add(bBFriendMsg);
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
            public void write(TProtocol oprot, get_friend_msgs_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_friend_msgs_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_friend_msgs_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<BBFriendMsg> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(get_friend_msgs_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(get_friend_msgs_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friend_msgs_resultStandardSchemeFactory implements SchemeFactory {
            private get_friend_msgs_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_friend_msgs_resultStandardScheme getScheme() {
                return new get_friend_msgs_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friend_msgs_resultTupleScheme extends TupleScheme<get_friend_msgs_result> {
            private get_friend_msgs_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_friend_msgs_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        BBFriendMsg bBFriendMsg = new BBFriendMsg();
                        bBFriendMsg.read(tTupleProtocol);
                        struct.success.add(bBFriendMsg);
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
            public void write(TProtocol prot, get_friend_msgs_result struct) throws TException {
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
                    Iterator<BBFriendMsg> it = struct.success.iterator();
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
        public static class get_friend_msgs_resultTupleSchemeFactory implements SchemeFactory {
            private get_friend_msgs_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_friend_msgs_resultTupleScheme getScheme() {
                return new get_friend_msgs_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_friend_msgs_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_friend_msgs_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BBFriendMsg.class))));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_friend_msgs_result.class, unmodifiableMap);
        }

        public get_friend_msgs_result() {
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

        public void addToSuccess(BBFriendMsg elem) {
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
            if (that != null && (that instanceof get_friend_msgs_result)) {
                return equals((get_friend_msgs_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
        }

        public List<BBFriendMsg> getSuccess() {
            return this.success;
        }

        public Iterator<BBFriendMsg> getSuccessIterator() {
            List<BBFriendMsg> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<BBFriendMsg> list = this.success;
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

        public get_friend_msgs_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public get_friend_msgs_result setSuccess(List<BBFriendMsg> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public get_friend_msgs_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("get_friend_msgs_result(");
            sb2.append("success:");
            List<BBFriendMsg> list = this.success;
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

        public get_friend_msgs_result(List<BBFriendMsg> success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            this.sysException = sysException;
            this.logicException = logicException;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_friend_msgs_result other) {
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
        public TBase<get_friend_msgs_result, _Fields> deepCopy2() {
            return new get_friend_msgs_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msgs_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msgs_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friend_msgs_result$_Fields[field.ordinal()];
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

        public boolean equals(get_friend_msgs_result that) {
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

        public get_friend_msgs_result(get_friend_msgs_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<BBFriendMsg> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BBFriendMsg(it.next()));
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
    public static class get_friends_args implements TBase<get_friends_args, _Fields>, Serializable, Cloneable, Comparable<get_friends_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_friends_args");
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
        public static class get_friends_argsStandardScheme extends StandardScheme<get_friends_args> {
            private get_friends_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_friends_args struct) throws TException {
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
            public void write(TProtocol oprot, get_friends_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_friends_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friends_argsStandardSchemeFactory implements SchemeFactory {
            private get_friends_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_friends_argsStandardScheme getScheme() {
                return new get_friends_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friends_argsTupleScheme extends TupleScheme<get_friends_args> {
            private get_friends_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_friends_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_friends_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friends_argsTupleSchemeFactory implements SchemeFactory {
            private get_friends_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_friends_argsTupleScheme getScheme() {
                return new get_friends_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_friends_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_friends_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_friends_args.class, unmodifiableMap);
        }

        public get_friends_args() {
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

        public boolean equals(get_friends_args that) {
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
            return "get_friends_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_friends_args(get_friends_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_friends_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_friends_args, _Fields> deepCopy2() {
            return new get_friends_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_friends_args)) {
                return equals((get_friends_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friends_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friends_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friends_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_friends_result implements TBase<get_friends_result, _Fields>, Serializable, Cloneable, Comparable<get_friends_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logicException;
        public List<BBFriendInfo> success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("get_friends_result");
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
        public static class get_friends_resultStandardScheme extends StandardScheme<get_friends_result> {
            private get_friends_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_friends_result struct) throws TException {
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
                            BBFriendInfo bBFriendInfo = new BBFriendInfo();
                            bBFriendInfo.read(iprot);
                            struct.success.add(bBFriendInfo);
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
            public void write(TProtocol oprot, get_friends_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_friends_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_friends_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<BBFriendInfo> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(get_friends_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(get_friends_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friends_resultStandardSchemeFactory implements SchemeFactory {
            private get_friends_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_friends_resultStandardScheme getScheme() {
                return new get_friends_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_friends_resultTupleScheme extends TupleScheme<get_friends_result> {
            private get_friends_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_friends_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        BBFriendInfo bBFriendInfo = new BBFriendInfo();
                        bBFriendInfo.read(tTupleProtocol);
                        struct.success.add(bBFriendInfo);
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
            public void write(TProtocol prot, get_friends_result struct) throws TException {
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
                    Iterator<BBFriendInfo> it = struct.success.iterator();
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
        public static class get_friends_resultTupleSchemeFactory implements SchemeFactory {
            private get_friends_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_friends_resultTupleScheme getScheme() {
                return new get_friends_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_friends_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_friends_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BBFriendInfo.class))));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_friends_result.class, unmodifiableMap);
        }

        public get_friends_result() {
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

        public void addToSuccess(BBFriendInfo elem) {
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
            if (that != null && (that instanceof get_friends_result)) {
                return equals((get_friends_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
        }

        public List<BBFriendInfo> getSuccess() {
            return this.success;
        }

        public Iterator<BBFriendInfo> getSuccessIterator() {
            List<BBFriendInfo> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<BBFriendInfo> list = this.success;
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

        public get_friends_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public get_friends_result setSuccess(List<BBFriendInfo> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public get_friends_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("get_friends_result(");
            sb2.append("success:");
            List<BBFriendInfo> list = this.success;
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

        public get_friends_result(List<BBFriendInfo> success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            this.sysException = sysException;
            this.logicException = logicException;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_friends_result other) {
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
        public TBase<get_friends_result, _Fields> deepCopy2() {
            return new get_friends_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friends_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friends_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_friends_result$_Fields[field.ordinal()];
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

        public boolean equals(get_friends_result that) {
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

        public get_friends_result(get_friends_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<BBFriendInfo> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BBFriendInfo(it.next()));
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
    public static class get_rank_args implements TBase<get_rank_args, _Fields>, Serializable, Cloneable, Comparable<get_rank_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_rank_args");
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
        public static class get_rank_argsStandardScheme extends StandardScheme<get_rank_args> {
            private get_rank_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_rank_args struct) throws TException {
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
            public void write(TProtocol oprot, get_rank_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_rank_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_rank_argsStandardSchemeFactory implements SchemeFactory {
            private get_rank_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_rank_argsStandardScheme getScheme() {
                return new get_rank_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_rank_argsTupleScheme extends TupleScheme<get_rank_args> {
            private get_rank_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_rank_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_rank_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_rank_argsTupleSchemeFactory implements SchemeFactory {
            private get_rank_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_rank_argsTupleScheme getScheme() {
                return new get_rank_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_rank_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_rank_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_rank_args.class, unmodifiableMap);
        }

        public get_rank_args() {
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

        public boolean equals(get_rank_args that) {
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
            return "get_rank_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_rank_args(get_rank_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_rank_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_rank_args, _Fields> deepCopy2() {
            return new get_rank_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_rank_args)) {
                return equals((get_rank_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_rank_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_rank_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_rank_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_rank_result implements TBase<get_rank_result, _Fields>, Serializable, Cloneable, Comparable<get_rank_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logicException;
        public BBRankResult success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("get_rank_result");
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
        public static class get_rank_resultStandardScheme extends StandardScheme<get_rank_result> {
            private get_rank_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_rank_result struct) throws TException {
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
                        BBRankResult bBRankResult = new BBRankResult();
                        struct.success = bBRankResult;
                        bBRankResult.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_rank_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_rank_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_rank_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(get_rank_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(get_rank_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_rank_resultStandardSchemeFactory implements SchemeFactory {
            private get_rank_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_rank_resultStandardScheme getScheme() {
                return new get_rank_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_rank_resultTupleScheme extends TupleScheme<get_rank_result> {
            private get_rank_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_rank_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    BBRankResult bBRankResult = new BBRankResult();
                    struct.success = bBRankResult;
                    bBRankResult.read(tTupleProtocol);
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
            public void write(TProtocol prot, get_rank_result struct) throws TException {
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
        public static class get_rank_resultTupleSchemeFactory implements SchemeFactory {
            private get_rank_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_rank_resultTupleScheme getScheme() {
                return new get_rank_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_rank_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_rank_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, BBRankResult.class)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_rank_result.class, unmodifiableMap);
        }

        public get_rank_result() {
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
            if (that != null && (that instanceof get_rank_result)) {
                return equals((get_rank_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
        }

        public BBRankResult getSuccess() {
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

        public get_rank_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public get_rank_result setSuccess(BBRankResult success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public get_rank_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("get_rank_result(");
            sb2.append("success:");
            BBRankResult bBRankResult = this.success;
            if (bBRankResult == null) {
                sb2.append("null");
            } else {
                sb2.append(bBRankResult);
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
            BBRankResult bBRankResult = this.success;
            if (bBRankResult != null) {
                bBRankResult.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_rank_result(BBRankResult success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            this.sysException = sysException;
            this.logicException = logicException;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_rank_result other) {
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
        public TBase<get_rank_result, _Fields> deepCopy2() {
            return new get_rank_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_rank_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_rank_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_rank_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((BBRankResult) value);
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

        public boolean equals(get_rank_result that) {
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

        public get_rank_result(get_rank_result other) {
            if (other.isSetSuccess()) {
                this.success = new BBRankResult(other.success);
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
    public static class get_suggest_friends_args implements TBase<get_suggest_friends_args, _Fields>, Serializable, Cloneable, Comparable<get_suggest_friends_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_suggest_friends_args");
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
        public static class get_suggest_friends_argsStandardScheme extends StandardScheme<get_suggest_friends_args> {
            private get_suggest_friends_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_suggest_friends_args struct) throws TException {
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
            public void write(TProtocol oprot, get_suggest_friends_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_suggest_friends_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_suggest_friends_argsStandardSchemeFactory implements SchemeFactory {
            private get_suggest_friends_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_suggest_friends_argsStandardScheme getScheme() {
                return new get_suggest_friends_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_suggest_friends_argsTupleScheme extends TupleScheme<get_suggest_friends_args> {
            private get_suggest_friends_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_suggest_friends_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_suggest_friends_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_suggest_friends_argsTupleSchemeFactory implements SchemeFactory {
            private get_suggest_friends_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_suggest_friends_argsTupleScheme getScheme() {
                return new get_suggest_friends_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_suggest_friends_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_suggest_friends_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_suggest_friends_args.class, unmodifiableMap);
        }

        public get_suggest_friends_args() {
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

        public boolean equals(get_suggest_friends_args that) {
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
            return "get_suggest_friends_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_suggest_friends_args(get_suggest_friends_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_suggest_friends_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_suggest_friends_args, _Fields> deepCopy2() {
            return new get_suggest_friends_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_suggest_friends_args)) {
                return equals((get_suggest_friends_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_suggest_friends_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_suggest_friends_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_suggest_friends_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_suggest_friends_result implements TBase<get_suggest_friends_result, _Fields>, Serializable, Cloneable, Comparable<get_suggest_friends_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logicException;
        public List<BBSearchResult> success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("get_suggest_friends_result");
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
        public static class get_suggest_friends_resultStandardScheme extends StandardScheme<get_suggest_friends_result> {
            private get_suggest_friends_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_suggest_friends_result struct) throws TException {
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
                            BBSearchResult bBSearchResult = new BBSearchResult();
                            bBSearchResult.read(iprot);
                            struct.success.add(bBSearchResult);
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
            public void write(TProtocol oprot, get_suggest_friends_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_suggest_friends_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_suggest_friends_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<BBSearchResult> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(get_suggest_friends_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(get_suggest_friends_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_suggest_friends_resultStandardSchemeFactory implements SchemeFactory {
            private get_suggest_friends_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_suggest_friends_resultStandardScheme getScheme() {
                return new get_suggest_friends_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_suggest_friends_resultTupleScheme extends TupleScheme<get_suggest_friends_result> {
            private get_suggest_friends_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_suggest_friends_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        BBSearchResult bBSearchResult = new BBSearchResult();
                        bBSearchResult.read(tTupleProtocol);
                        struct.success.add(bBSearchResult);
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
            public void write(TProtocol prot, get_suggest_friends_result struct) throws TException {
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
                    Iterator<BBSearchResult> it = struct.success.iterator();
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
        public static class get_suggest_friends_resultTupleSchemeFactory implements SchemeFactory {
            private get_suggest_friends_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_suggest_friends_resultTupleScheme getScheme() {
                return new get_suggest_friends_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_suggest_friends_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_suggest_friends_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BBSearchResult.class))));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_suggest_friends_result.class, unmodifiableMap);
        }

        public get_suggest_friends_result() {
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

        public void addToSuccess(BBSearchResult elem) {
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
            if (that != null && (that instanceof get_suggest_friends_result)) {
                return equals((get_suggest_friends_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
        }

        public List<BBSearchResult> getSuccess() {
            return this.success;
        }

        public Iterator<BBSearchResult> getSuccessIterator() {
            List<BBSearchResult> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<BBSearchResult> list = this.success;
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

        public get_suggest_friends_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public get_suggest_friends_result setSuccess(List<BBSearchResult> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public get_suggest_friends_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("get_suggest_friends_result(");
            sb2.append("success:");
            List<BBSearchResult> list = this.success;
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

        public get_suggest_friends_result(List<BBSearchResult> success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            this.sysException = sysException;
            this.logicException = logicException;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_suggest_friends_result other) {
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
        public TBase<get_suggest_friends_result, _Fields> deepCopy2() {
            return new get_suggest_friends_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_suggest_friends_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_suggest_friends_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$get_suggest_friends_result$_Fields[field.ordinal()];
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

        public boolean equals(get_suggest_friends_result that) {
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

        public get_suggest_friends_result(get_suggest_friends_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<BBSearchResult> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BBSearchResult(it.next()));
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
    public static class has_new_feeds_args implements TBase<has_new_feeds_args, _Fields>, Serializable, Cloneable, Comparable<has_new_feeds_args> {
        private static final TStruct STRUCT_DESC = new TStruct("has_new_feeds_args");
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
        public static class has_new_feeds_argsStandardScheme extends StandardScheme<has_new_feeds_args> {
            private has_new_feeds_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, has_new_feeds_args struct) throws TException {
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
            public void write(TProtocol oprot, has_new_feeds_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(has_new_feeds_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class has_new_feeds_argsStandardSchemeFactory implements SchemeFactory {
            private has_new_feeds_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public has_new_feeds_argsStandardScheme getScheme() {
                return new has_new_feeds_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class has_new_feeds_argsTupleScheme extends TupleScheme<has_new_feeds_args> {
            private has_new_feeds_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, has_new_feeds_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, has_new_feeds_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class has_new_feeds_argsTupleSchemeFactory implements SchemeFactory {
            private has_new_feeds_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public has_new_feeds_argsTupleScheme getScheme() {
                return new has_new_feeds_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new has_new_feeds_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new has_new_feeds_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(has_new_feeds_args.class, unmodifiableMap);
        }

        public has_new_feeds_args() {
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

        public boolean equals(has_new_feeds_args that) {
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
            return "has_new_feeds_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public has_new_feeds_args(has_new_feeds_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(has_new_feeds_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<has_new_feeds_args, _Fields> deepCopy2() {
            return new has_new_feeds_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof has_new_feeds_args)) {
                return equals((has_new_feeds_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_feeds_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_feeds_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_feeds_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class has_new_feeds_result implements TBase<has_new_feeds_result, _Fields>, Serializable, Cloneable, Comparable<has_new_feeds_result> {
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public BELogicException logicException;
        public boolean success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("has_new_feeds_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 2, 0);
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
        public static class has_new_feeds_resultStandardScheme extends StandardScheme<has_new_feeds_result> {
            private has_new_feeds_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, has_new_feeds_result struct) throws TException {
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
            public void write(TProtocol oprot, has_new_feeds_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(has_new_feeds_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(has_new_feeds_result.SUCCESS_FIELD_DESC);
                    oprot.writeBool(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(has_new_feeds_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(has_new_feeds_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class has_new_feeds_resultStandardSchemeFactory implements SchemeFactory {
            private has_new_feeds_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public has_new_feeds_resultStandardScheme getScheme() {
                return new has_new_feeds_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class has_new_feeds_resultTupleScheme extends TupleScheme<has_new_feeds_result> {
            private has_new_feeds_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, has_new_feeds_result struct) throws TException {
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
                    struct.logicException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogicExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, has_new_feeds_result struct) throws TException {
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
                    tTupleProtocol.writeBool(struct.success);
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
        public static class has_new_feeds_resultTupleSchemeFactory implements SchemeFactory {
            private has_new_feeds_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public has_new_feeds_resultTupleScheme getScheme() {
                return new has_new_feeds_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new has_new_feeds_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new has_new_feeds_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 2)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(has_new_feeds_result.class, unmodifiableMap);
        }

        public has_new_feeds_result() {
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
            this.logicException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof has_new_feeds_result)) {
                return equals((has_new_feeds_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
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

        public boolean isSuccess() {
            return this.success;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public has_new_feeds_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public has_new_feeds_result setSuccess(boolean success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public has_new_feeds_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("has_new_feeds_result(");
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
        public int compareTo(has_new_feeds_result other) {
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
        public TBase<has_new_feeds_result, _Fields> deepCopy2() {
            return new has_new_feeds_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_feeds_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Boolean.valueOf(isSuccess());
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_feeds_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_feeds_result$_Fields[field.ordinal()];
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
                unsetLogicException();
            } else {
                setLogicException((BELogicException) value);
            }
        }

        public has_new_feeds_result(boolean success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.sysException = sysException;
            this.logicException = logicException;
        }

        public boolean equals(has_new_feeds_result that) {
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

        public has_new_feeds_result(has_new_feeds_result other) {
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
    public static class has_new_friend_msgs_args implements TBase<has_new_friend_msgs_args, _Fields>, Serializable, Cloneable, Comparable<has_new_friend_msgs_args> {
        private static final TStruct STRUCT_DESC = new TStruct("has_new_friend_msgs_args");
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
        public static class has_new_friend_msgs_argsStandardScheme extends StandardScheme<has_new_friend_msgs_args> {
            private has_new_friend_msgs_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, has_new_friend_msgs_args struct) throws TException {
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
            public void write(TProtocol oprot, has_new_friend_msgs_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(has_new_friend_msgs_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class has_new_friend_msgs_argsStandardSchemeFactory implements SchemeFactory {
            private has_new_friend_msgs_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public has_new_friend_msgs_argsStandardScheme getScheme() {
                return new has_new_friend_msgs_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class has_new_friend_msgs_argsTupleScheme extends TupleScheme<has_new_friend_msgs_args> {
            private has_new_friend_msgs_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, has_new_friend_msgs_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, has_new_friend_msgs_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class has_new_friend_msgs_argsTupleSchemeFactory implements SchemeFactory {
            private has_new_friend_msgs_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public has_new_friend_msgs_argsTupleScheme getScheme() {
                return new has_new_friend_msgs_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new has_new_friend_msgs_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new has_new_friend_msgs_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(has_new_friend_msgs_args.class, unmodifiableMap);
        }

        public has_new_friend_msgs_args() {
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

        public boolean equals(has_new_friend_msgs_args that) {
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
            return "has_new_friend_msgs_args(" + j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public has_new_friend_msgs_args(has_new_friend_msgs_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(has_new_friend_msgs_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<has_new_friend_msgs_args, _Fields> deepCopy2() {
            return new has_new_friend_msgs_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof has_new_friend_msgs_args)) {
                return equals((has_new_friend_msgs_args) that);
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_friend_msgs_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_friend_msgs_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_friend_msgs_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class has_new_friend_msgs_result implements TBase<has_new_friend_msgs_result, _Fields>, Serializable, Cloneable, Comparable<has_new_friend_msgs_result> {
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public BELogicException logicException;
        public boolean success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("has_new_friend_msgs_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 2, 0);
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
        public static class has_new_friend_msgs_resultStandardScheme extends StandardScheme<has_new_friend_msgs_result> {
            private has_new_friend_msgs_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, has_new_friend_msgs_result struct) throws TException {
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
            public void write(TProtocol oprot, has_new_friend_msgs_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(has_new_friend_msgs_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(has_new_friend_msgs_result.SUCCESS_FIELD_DESC);
                    oprot.writeBool(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(has_new_friend_msgs_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(has_new_friend_msgs_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class has_new_friend_msgs_resultStandardSchemeFactory implements SchemeFactory {
            private has_new_friend_msgs_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public has_new_friend_msgs_resultStandardScheme getScheme() {
                return new has_new_friend_msgs_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class has_new_friend_msgs_resultTupleScheme extends TupleScheme<has_new_friend_msgs_result> {
            private has_new_friend_msgs_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, has_new_friend_msgs_result struct) throws TException {
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
                    struct.logicException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogicExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, has_new_friend_msgs_result struct) throws TException {
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
                    tTupleProtocol.writeBool(struct.success);
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
        public static class has_new_friend_msgs_resultTupleSchemeFactory implements SchemeFactory {
            private has_new_friend_msgs_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public has_new_friend_msgs_resultTupleScheme getScheme() {
                return new has_new_friend_msgs_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new has_new_friend_msgs_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new has_new_friend_msgs_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 2)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(has_new_friend_msgs_result.class, unmodifiableMap);
        }

        public has_new_friend_msgs_result() {
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
            this.logicException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof has_new_friend_msgs_result)) {
                return equals((has_new_friend_msgs_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
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

        public boolean isSuccess() {
            return this.success;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public has_new_friend_msgs_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public has_new_friend_msgs_result setSuccess(boolean success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public has_new_friend_msgs_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("has_new_friend_msgs_result(");
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
        public int compareTo(has_new_friend_msgs_result other) {
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
        public TBase<has_new_friend_msgs_result, _Fields> deepCopy2() {
            return new has_new_friend_msgs_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_friend_msgs_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Boolean.valueOf(isSuccess());
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_friend_msgs_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$has_new_friend_msgs_result$_Fields[field.ordinal()];
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
                unsetLogicException();
            } else {
                setLogicException((BELogicException) value);
            }
        }

        public has_new_friend_msgs_result(boolean success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.sysException = sysException;
            this.logicException = logicException;
        }

        public boolean equals(has_new_friend_msgs_result that) {
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

        public has_new_friend_msgs_result(has_new_friend_msgs_result other) {
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
    public static class ignore_friend_apply_args implements TBase<ignore_friend_apply_args, _Fields>, Serializable, Cloneable, Comparable<ignore_friend_apply_args> {
        private static final int __MSG_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int msg_id;
        private static final TStruct STRUCT_DESC = new TStruct("ignore_friend_apply_args");
        private static final TField MSG_ID_FIELD_DESC = new TField("msg_id", (byte) 8, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            MSG_ID(1, "msg_id");

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
                return MSG_ID;
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
        public static class ignore_friend_apply_argsStandardScheme extends StandardScheme<ignore_friend_apply_args> {
            private ignore_friend_apply_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, ignore_friend_apply_args struct) throws TException {
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
                        struct.msg_id = iprot.readI32();
                        struct.setMsg_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (struct.isSetMsg_id()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'msg_id' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, ignore_friend_apply_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(ignore_friend_apply_args.STRUCT_DESC);
                oprot.writeFieldBegin(ignore_friend_apply_args.MSG_ID_FIELD_DESC);
                oprot.writeI32(struct.msg_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ignore_friend_apply_argsStandardSchemeFactory implements SchemeFactory {
            private ignore_friend_apply_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public ignore_friend_apply_argsStandardScheme getScheme() {
                return new ignore_friend_apply_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ignore_friend_apply_argsTupleScheme extends TupleScheme<ignore_friend_apply_args> {
            private ignore_friend_apply_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, ignore_friend_apply_args struct) throws TException {
                struct.msg_id = ((TTupleProtocol) prot).readI32();
                struct.setMsg_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, ignore_friend_apply_args struct) throws TException {
                ((TTupleProtocol) prot).writeI32(struct.msg_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ignore_friend_apply_argsTupleSchemeFactory implements SchemeFactory {
            private ignore_friend_apply_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public ignore_friend_apply_argsTupleScheme getScheme() {
                return new ignore_friend_apply_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new ignore_friend_apply_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new ignore_friend_apply_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.MSG_ID, (_Fields) new FieldMetaData("msg_id", (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(ignore_friend_apply_args.class, unmodifiableMap);
        }

        public ignore_friend_apply_args() {
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
            setMsg_idIsSet(false);
            this.msg_id = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof ignore_friend_apply_args)) {
                return equals((ignore_friend_apply_args) that);
            }
            return false;
        }

        public int getMsg_id() {
            return this.msg_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetMsg_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public ignore_friend_apply_args setMsg_id(int msg_id) {
            this.msg_id = msg_id;
            setMsg_idIsSet(true);
            return this;
        }

        public void setMsg_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "ignore_friend_apply_args(msg_id:" + this.msg_id + j.f81007d;
        }

        public void unsetMsg_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(ignore_friend_apply_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetMsg_id()).compareTo(Boolean.valueOf(other.isSetMsg_id()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetMsg_id() || (compareTo = TBaseHelper.compareTo(this.msg_id, other.msg_id)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<ignore_friend_apply_args, _Fields> deepCopy2() {
            return new ignore_friend_apply_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$ignore_friend_apply_args$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getMsg_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$ignore_friend_apply_args$_Fields[field.ordinal()] == 1) {
                return isSetMsg_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$ignore_friend_apply_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetMsg_id();
            } else {
                setMsg_id(((Integer) value).intValue());
            }
        }

        public ignore_friend_apply_args(int msg_id) {
            this();
            this.msg_id = msg_id;
            setMsg_idIsSet(true);
        }

        public boolean equals(ignore_friend_apply_args that) {
            return that != null && this.msg_id == that.msg_id;
        }

        public ignore_friend_apply_args(ignore_friend_apply_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.msg_id = other.msg_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ignore_friend_apply_result implements TBase<ignore_friend_apply_result, _Fields>, Serializable, Cloneable, Comparable<ignore_friend_apply_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logicException;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("ignore_friend_apply_result");
        private static final TField SYS_EXCEPTION_FIELD_DESC = new TField("sysException", (byte) 12, 1);
        private static final TField LOGIC_EXCEPTION_FIELD_DESC = new TField("logicException", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
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
        public static class ignore_friend_apply_resultStandardScheme extends StandardScheme<ignore_friend_apply_result> {
            private ignore_friend_apply_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, ignore_friend_apply_result struct) throws TException {
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
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, ignore_friend_apply_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(ignore_friend_apply_result.STRUCT_DESC);
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(ignore_friend_apply_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(ignore_friend_apply_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ignore_friend_apply_resultStandardSchemeFactory implements SchemeFactory {
            private ignore_friend_apply_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public ignore_friend_apply_resultStandardScheme getScheme() {
                return new ignore_friend_apply_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ignore_friend_apply_resultTupleScheme extends TupleScheme<ignore_friend_apply_result> {
            private ignore_friend_apply_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, ignore_friend_apply_result struct) throws TException {
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
                    struct.logicException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogicExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, ignore_friend_apply_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSysException()) {
                    bitSet.set(0);
                }
                if (struct.isSetLogicException()) {
                    bitSet.set(1);
                }
                tTupleProtocol.writeBitSet(bitSet, 2);
                if (struct.isSetSysException()) {
                    struct.sysException.write(tTupleProtocol);
                }
                if (struct.isSetLogicException()) {
                    struct.logicException.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ignore_friend_apply_resultTupleSchemeFactory implements SchemeFactory {
            private ignore_friend_apply_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public ignore_friend_apply_resultTupleScheme getScheme() {
                return new ignore_friend_apply_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new ignore_friend_apply_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new ignore_friend_apply_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(ignore_friend_apply_result.class, unmodifiableMap);
        }

        public ignore_friend_apply_result() {
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
            this.logicException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof ignore_friend_apply_result)) {
                return equals((ignore_friend_apply_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
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

        public boolean isSetSysException() {
            return this.sysException != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public ignore_friend_apply_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public ignore_friend_apply_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("ignore_friend_apply_result(");
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

        public void unsetSysException() {
            this.sysException = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public ignore_friend_apply_result(BESystemException sysException, BELogicException logicException) {
            this();
            this.sysException = sysException;
            this.logicException = logicException;
        }

        @Override // java.lang.Comparable
        public int compareTo(ignore_friend_apply_result other) {
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
            int compareTo4 = Boolean.valueOf(isSetLogicException()).compareTo(Boolean.valueOf(other.isSetLogicException()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetLogicException() || (compareTo = TBaseHelper.compareTo((Comparable) this.logicException, (Comparable) other.logicException)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<ignore_friend_apply_result, _Fields> deepCopy2() {
            return new ignore_friend_apply_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$ignore_friend_apply_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSysException();
            }
            if (i11 == 2) {
                return getLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$ignore_friend_apply_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSysException();
            }
            if (i11 == 2) {
                return isSetLogicException();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$ignore_friend_apply_result$_Fields[field.ordinal()];
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
                unsetLogicException();
            } else {
                setLogicException((BELogicException) value);
            }
        }

        public boolean equals(ignore_friend_apply_result that) {
            if (that == null) {
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

        public ignore_friend_apply_result(ignore_friend_apply_result other) {
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
    public static class search_user_args implements TBase<search_user_args, _Fields>, Serializable, Cloneable, Comparable<search_user_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public String query_str;
        private static final TStruct STRUCT_DESC = new TStruct("search_user_args");
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
        public static class search_user_argsStandardScheme extends StandardScheme<search_user_args> {
            private search_user_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, search_user_args struct) throws TException {
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
            public void write(TProtocol oprot, search_user_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(search_user_args.STRUCT_DESC);
                if (struct.query_str != null) {
                    oprot.writeFieldBegin(search_user_args.QUERY_STR_FIELD_DESC);
                    oprot.writeString(struct.query_str);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_user_argsStandardSchemeFactory implements SchemeFactory {
            private search_user_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public search_user_argsStandardScheme getScheme() {
                return new search_user_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_user_argsTupleScheme extends TupleScheme<search_user_args> {
            private search_user_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, search_user_args struct) throws TException {
                struct.query_str = ((TTupleProtocol) prot).readString();
                struct.setQuery_strIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, search_user_args struct) throws TException {
                ((TTupleProtocol) prot).writeString(struct.query_str);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_user_argsTupleSchemeFactory implements SchemeFactory {
            private search_user_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public search_user_argsTupleScheme getScheme() {
                return new search_user_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new search_user_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new search_user_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.QUERY_STR, (_Fields) new FieldMetaData("query_str", (byte) 1, new FieldValueMetaData((byte) 11)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(search_user_args.class, unmodifiableMap);
        }

        public search_user_args() {
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
            if (that != null && (that instanceof search_user_args)) {
                return equals((search_user_args) that);
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

        public search_user_args setQuery_str(String query_str) {
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
            StringBuilder sb2 = new StringBuilder("search_user_args(");
            sb2.append("query_str:");
            String str = this.query_str;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j.f81007d);
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

        public search_user_args(String query_str) {
            this();
            this.query_str = query_str;
        }

        @Override // java.lang.Comparable
        public int compareTo(search_user_args other) {
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
        public TBase<search_user_args, _Fields> deepCopy2() {
            return new search_user_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$search_user_args$_Fields[field.ordinal()] == 1) {
                return getQuery_str();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$search_user_args$_Fields[field.ordinal()] == 1) {
                return isSetQuery_str();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$search_user_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetQuery_str();
            } else {
                setQuery_str((String) value);
            }
        }

        public boolean equals(search_user_args that) {
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

        public search_user_args(search_user_args other) {
            if (other.isSetQuery_str()) {
                this.query_str = other.query_str;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class search_user_result implements TBase<search_user_result, _Fields>, Serializable, Cloneable, Comparable<search_user_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BELogicException logicException;
        public List<BBSearchResult> success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("search_user_result");
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
        public static class search_user_resultStandardScheme extends StandardScheme<search_user_result> {
            private search_user_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, search_user_result struct) throws TException {
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
                            BBSearchResult bBSearchResult = new BBSearchResult();
                            bBSearchResult.read(iprot);
                            struct.success.add(bBSearchResult);
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
            public void write(TProtocol oprot, search_user_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(search_user_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(search_user_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<BBSearchResult> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(search_user_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(search_user_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_user_resultStandardSchemeFactory implements SchemeFactory {
            private search_user_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public search_user_resultStandardScheme getScheme() {
                return new search_user_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class search_user_resultTupleScheme extends TupleScheme<search_user_result> {
            private search_user_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, search_user_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        BBSearchResult bBSearchResult = new BBSearchResult();
                        bBSearchResult.read(tTupleProtocol);
                        struct.success.add(bBSearchResult);
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
            public void write(TProtocol prot, search_user_result struct) throws TException {
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
                    Iterator<BBSearchResult> it = struct.success.iterator();
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
        public static class search_user_resultTupleSchemeFactory implements SchemeFactory {
            private search_user_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public search_user_resultTupleScheme getScheme() {
                return new search_user_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new search_user_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new search_user_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BBSearchResult.class))));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(search_user_result.class, unmodifiableMap);
        }

        public search_user_result() {
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

        public void addToSuccess(BBSearchResult elem) {
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
            if (that != null && (that instanceof search_user_result)) {
                return equals((search_user_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
        }

        public List<BBSearchResult> getSuccess() {
            return this.success;
        }

        public Iterator<BBSearchResult> getSuccessIterator() {
            List<BBSearchResult> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<BBSearchResult> list = this.success;
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

        public search_user_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public search_user_result setSuccess(List<BBSearchResult> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public search_user_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("search_user_result(");
            sb2.append("success:");
            List<BBSearchResult> list = this.success;
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

        public search_user_result(List<BBSearchResult> success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            this.sysException = sysException;
            this.logicException = logicException;
        }

        @Override // java.lang.Comparable
        public int compareTo(search_user_result other) {
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
        public TBase<search_user_result, _Fields> deepCopy2() {
            return new search_user_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$search_user_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$search_user_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$search_user_result$_Fields[field.ordinal()];
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

        public boolean equals(search_user_result that) {
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

        public search_user_result(search_user_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<BBSearchResult> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BBSearchResult(it.next()));
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
    public static class send_share_success_args implements TBase<send_share_success_args, _Fields>, Serializable, Cloneable, Comparable<send_share_success_args> {
        private static final int __TIMESTAMP_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public BBShareChannel channel;
        public BBShareModule module_name;
        public long timestamp;
        private static final TStruct STRUCT_DESC = new TStruct("send_share_success_args");
        private static final TField MODULE_NAME_FIELD_DESC = new TField("module_name", (byte) 8, 1);
        private static final TField CHANNEL_FIELD_DESC = new TField("channel", (byte) 8, 3);
        private static final TField TIMESTAMP_FIELD_DESC = new TField(com.alipay.sdk.m.t.a.f11034k, (byte) 10, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            MODULE_NAME(1, "module_name"),
            CHANNEL(3, "channel"),
            TIMESTAMP(2, com.alipay.sdk.m.t.a.f11034k);

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
                    return MODULE_NAME;
                }
                if (fieldId == 2) {
                    return TIMESTAMP;
                }
                if (fieldId != 3) {
                    return null;
                }
                return CHANNEL;
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
        public static class send_share_success_argsStandardScheme extends StandardScheme<send_share_success_args> {
            private send_share_success_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, send_share_success_args struct) throws TException {
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
                                struct.channel = BBShareChannel.findByValue(iprot.readI32());
                                struct.setChannelIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 10) {
                            struct.timestamp = iprot.readI64();
                            struct.setTimestampIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.module_name = BBShareModule.findByValue(iprot.readI32());
                        struct.setModule_nameIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (struct.isSetTimestamp()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'timestamp' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, send_share_success_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(send_share_success_args.STRUCT_DESC);
                if (struct.module_name != null) {
                    oprot.writeFieldBegin(send_share_success_args.MODULE_NAME_FIELD_DESC);
                    oprot.writeI32(struct.module_name.getValue());
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldBegin(send_share_success_args.TIMESTAMP_FIELD_DESC);
                oprot.writeI64(struct.timestamp);
                oprot.writeFieldEnd();
                if (struct.channel != null) {
                    oprot.writeFieldBegin(send_share_success_args.CHANNEL_FIELD_DESC);
                    oprot.writeI32(struct.channel.getValue());
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class send_share_success_argsStandardSchemeFactory implements SchemeFactory {
            private send_share_success_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public send_share_success_argsStandardScheme getScheme() {
                return new send_share_success_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class send_share_success_argsTupleScheme extends TupleScheme<send_share_success_args> {
            private send_share_success_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, send_share_success_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.module_name = BBShareModule.findByValue(tTupleProtocol.readI32());
                struct.setModule_nameIsSet(true);
                struct.channel = BBShareChannel.findByValue(tTupleProtocol.readI32());
                struct.setChannelIsSet(true);
                struct.timestamp = tTupleProtocol.readI64();
                struct.setTimestampIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, send_share_success_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.module_name.getValue());
                tTupleProtocol.writeI32(struct.channel.getValue());
                tTupleProtocol.writeI64(struct.timestamp);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class send_share_success_argsTupleSchemeFactory implements SchemeFactory {
            private send_share_success_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public send_share_success_argsTupleScheme getScheme() {
                return new send_share_success_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new send_share_success_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new send_share_success_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.MODULE_NAME, (_Fields) new FieldMetaData("module_name", (byte) 1, new EnumMetaData((byte) 16, BBShareModule.class)));
            enumMap.put((EnumMap) _Fields.CHANNEL, (_Fields) new FieldMetaData("channel", (byte) 1, new EnumMetaData((byte) 16, BBShareChannel.class)));
            enumMap.put((EnumMap) _Fields.TIMESTAMP, (_Fields) new FieldMetaData(com.alipay.sdk.m.t.a.f11034k, (byte) 1, new FieldValueMetaData((byte) 10)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(send_share_success_args.class, unmodifiableMap);
        }

        public send_share_success_args() {
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
            this.module_name = null;
            this.channel = null;
            setTimestampIsSet(false);
            this.timestamp = 0L;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof send_share_success_args)) {
                return equals((send_share_success_args) that);
            }
            return false;
        }

        public BBShareChannel getChannel() {
            return this.channel;
        }

        public BBShareModule getModule_name() {
            return this.module_name;
        }

        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetChannel() {
            return this.channel != null;
        }

        public boolean isSetModule_name() {
            return this.module_name != null;
        }

        public boolean isSetTimestamp() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public send_share_success_args setChannel(BBShareChannel channel) {
            this.channel = channel;
            return this;
        }

        public void setChannelIsSet(boolean value) {
            if (value) {
                return;
            }
            this.channel = null;
        }

        public send_share_success_args setModule_name(BBShareModule module_name) {
            this.module_name = module_name;
            return this;
        }

        public void setModule_nameIsSet(boolean value) {
            if (value) {
                return;
            }
            this.module_name = null;
        }

        public send_share_success_args setTimestamp(long timestamp) {
            this.timestamp = timestamp;
            setTimestampIsSet(true);
            return this;
        }

        public void setTimestampIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("send_share_success_args(");
            sb2.append("module_name:");
            BBShareModule bBShareModule = this.module_name;
            if (bBShareModule == null) {
                sb2.append("null");
            } else {
                sb2.append(bBShareModule);
            }
            sb2.append(j2.O);
            sb2.append("channel:");
            BBShareChannel bBShareChannel = this.channel;
            if (bBShareChannel == null) {
                sb2.append("null");
            } else {
                sb2.append(bBShareChannel);
            }
            sb2.append(j2.O);
            sb2.append("timestamp:");
            sb2.append(this.timestamp);
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetChannel() {
            this.channel = null;
        }

        public void unsetModule_name() {
            this.module_name = null;
        }

        public void unsetTimestamp() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        public void validate() throws TException {
            if (this.module_name == null) {
                throw new TProtocolException("Required field 'module_name' was not present! Struct: " + toString());
            }
            if (this.channel != null) {
                return;
            }
            throw new TProtocolException("Required field 'channel' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(send_share_success_args other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetModule_name()).compareTo(Boolean.valueOf(other.isSetModule_name()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetModule_name() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.module_name, (Comparable) other.module_name)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetChannel()).compareTo(Boolean.valueOf(other.isSetChannel()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetChannel() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.channel, (Comparable) other.channel)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetTimestamp()).compareTo(Boolean.valueOf(other.isSetTimestamp()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetTimestamp() || (compareTo = TBaseHelper.compareTo(this.timestamp, other.timestamp)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<send_share_success_args, _Fields> deepCopy2() {
            return new send_share_success_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$send_share_success_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getModule_name();
            }
            if (i11 == 2) {
                return getChannel();
            }
            if (i11 == 3) {
                return Long.valueOf(getTimestamp());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$send_share_success_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetModule_name();
            }
            if (i11 == 2) {
                return isSetChannel();
            }
            if (i11 == 3) {
                return isSetTimestamp();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$send_share_success_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetModule_name();
                    return;
                } else {
                    setModule_name((BBShareModule) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetChannel();
                    return;
                } else {
                    setChannel((BBShareChannel) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetTimestamp();
            } else {
                setTimestamp(((Long) value).longValue());
            }
        }

        public send_share_success_args(BBShareModule module_name, BBShareChannel channel, long timestamp) {
            this();
            this.module_name = module_name;
            this.channel = channel;
            this.timestamp = timestamp;
            setTimestampIsSet(true);
        }

        public boolean equals(send_share_success_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetModule_name = isSetModule_name();
            boolean isSetModule_name2 = that.isSetModule_name();
            if ((isSetModule_name || isSetModule_name2) && !(isSetModule_name && isSetModule_name2 && this.module_name.equals(that.module_name))) {
                return false;
            }
            boolean isSetChannel = isSetChannel();
            boolean isSetChannel2 = that.isSetChannel();
            return (!(isSetChannel || isSetChannel2) || (isSetChannel && isSetChannel2 && this.channel.equals(that.channel))) && this.timestamp == that.timestamp;
        }

        public send_share_success_args(send_share_success_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            if (other.isSetModule_name()) {
                this.module_name = other.module_name;
            }
            if (other.isSetChannel()) {
                this.channel = other.channel;
            }
            this.timestamp = other.timestamp;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class send_share_success_result implements TBase<send_share_success_result, _Fields>, Serializable, Cloneable, Comparable<send_share_success_result> {
        private static final int __SUCCESS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public BELogicException logicException;
        public boolean success;
        public BESystemException sysException;
        private static final TStruct STRUCT_DESC = new TStruct("send_share_success_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 2, 0);
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
        public static class send_share_success_resultStandardScheme extends StandardScheme<send_share_success_result> {
            private send_share_success_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, send_share_success_result struct) throws TException {
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
            public void write(TProtocol oprot, send_share_success_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(send_share_success_result.STRUCT_DESC);
                if (struct.isSetSuccess()) {
                    oprot.writeFieldBegin(send_share_success_result.SUCCESS_FIELD_DESC);
                    oprot.writeBool(struct.success);
                    oprot.writeFieldEnd();
                }
                if (struct.sysException != null) {
                    oprot.writeFieldBegin(send_share_success_result.SYS_EXCEPTION_FIELD_DESC);
                    struct.sysException.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.logicException != null) {
                    oprot.writeFieldBegin(send_share_success_result.LOGIC_EXCEPTION_FIELD_DESC);
                    struct.logicException.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class send_share_success_resultStandardSchemeFactory implements SchemeFactory {
            private send_share_success_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public send_share_success_resultStandardScheme getScheme() {
                return new send_share_success_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class send_share_success_resultTupleScheme extends TupleScheme<send_share_success_result> {
            private send_share_success_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, send_share_success_result struct) throws TException {
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
                    struct.logicException = bELogicException;
                    bELogicException.read(tTupleProtocol);
                    struct.setLogicExceptionIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, send_share_success_result struct) throws TException {
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
                    tTupleProtocol.writeBool(struct.success);
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
        public static class send_share_success_resultTupleSchemeFactory implements SchemeFactory {
            private send_share_success_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public send_share_success_resultTupleScheme getScheme() {
                return new send_share_success_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new send_share_success_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new send_share_success_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new FieldValueMetaData((byte) 2)));
            enumMap.put((EnumMap) _Fields.SYS_EXCEPTION, (_Fields) new FieldMetaData("sysException", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.LOGIC_EXCEPTION, (_Fields) new FieldMetaData("logicException", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(send_share_success_result.class, unmodifiableMap);
        }

        public send_share_success_result() {
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
            this.logicException = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof send_share_success_result)) {
                return equals((send_share_success_result) that);
            }
            return false;
        }

        public BELogicException getLogicException() {
            return this.logicException;
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

        public boolean isSuccess() {
            return this.success;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public send_share_success_result setLogicException(BELogicException logicException) {
            this.logicException = logicException;
            return this;
        }

        public void setLogicExceptionIsSet(boolean value) {
            if (value) {
                return;
            }
            this.logicException = null;
        }

        public send_share_success_result setSuccess(boolean success) {
            this.success = success;
            setSuccessIsSet(true);
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public send_share_success_result setSysException(BESystemException sysException) {
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
            StringBuilder sb2 = new StringBuilder("send_share_success_result(");
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
        public int compareTo(send_share_success_result other) {
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
        public TBase<send_share_success_result, _Fields> deepCopy2() {
            return new send_share_success_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$send_share_success_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Boolean.valueOf(isSuccess());
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$send_share_success_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BSSocials$send_share_success_result$_Fields[field.ordinal()];
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
                unsetLogicException();
            } else {
                setLogicException((BELogicException) value);
            }
        }

        public send_share_success_result(boolean success, BESystemException sysException, BELogicException logicException) {
            this();
            this.success = success;
            setSuccessIsSet(true);
            this.sysException = sysException;
            this.logicException = logicException;
        }

        public boolean equals(send_share_success_result that) {
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

        public send_share_success_result(send_share_success_result other) {
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
}
