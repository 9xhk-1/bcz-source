package com.baicizhan.online.mall_proxy;

import com.baicizhan.online.thrift.basic.LogicException;
import com.baicizhan.online.thrift.basic.SystemException;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
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
public class MallProxyService {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.mall_proxy.MallProxyService$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$choice_address_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$choice_address_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$create_user_address_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$create_user_address_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$delete_user_address_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$delete_user_address_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_child_address_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_child_address_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_user_address_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_user_address_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$match_address_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$match_address_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$update_user_address_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$update_user_address_result$_Fields;

        static {
            int[] iArr = new int[match_address_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$match_address_result$_Fields = iArr;
            try {
                iArr[match_address_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$match_address_result$_Fields[match_address_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$match_address_result$_Fields[match_address_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[match_address_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$match_address_args$_Fields = iArr2;
            try {
                iArr2[match_address_args._Fields.REQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[update_user_address_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$update_user_address_result$_Fields = iArr3;
            try {
                iArr3[update_user_address_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$update_user_address_result$_Fields[update_user_address_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$update_user_address_result$_Fields[update_user_address_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr4 = new int[update_user_address_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$update_user_address_args$_Fields = iArr4;
            try {
                iArr4[update_user_address_args._Fields.USER_ADDRESS_REQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr5 = new int[delete_user_address_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$delete_user_address_result$_Fields = iArr5;
            try {
                iArr5[delete_user_address_result._Fields.BOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$delete_user_address_result$_Fields[delete_user_address_result._Fields.BOMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr6 = new int[delete_user_address_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$delete_user_address_args$_Fields = iArr6;
            try {
                iArr6[delete_user_address_args._Fields.ADDRESS_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr7 = new int[create_user_address_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$create_user_address_result$_Fields = iArr7;
            try {
                iArr7[create_user_address_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$create_user_address_result$_Fields[create_user_address_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$create_user_address_result$_Fields[create_user_address_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr8 = new int[create_user_address_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$create_user_address_args$_Fields = iArr8;
            try {
                iArr8[create_user_address_args._Fields.USER_ADDRESS_REQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr9 = new int[choice_address_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$choice_address_result$_Fields = iArr9;
            try {
                iArr9[choice_address_result._Fields.BOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$choice_address_result$_Fields[choice_address_result._Fields.BOMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr10 = new int[choice_address_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$choice_address_args$_Fields = iArr10;
            try {
                iArr10[choice_address_args._Fields.ADDRESS_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr11 = new int[get_child_address_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_child_address_result$_Fields = iArr11;
            try {
                iArr11[get_child_address_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_child_address_result$_Fields[get_child_address_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_child_address_result$_Fields[get_child_address_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            int[] iArr12 = new int[get_child_address_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_child_address_args$_Fields = iArr12;
            try {
                iArr12[get_child_address_args._Fields.PARENT_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            int[] iArr13 = new int[get_user_address_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_user_address_result$_Fields = iArr13;
            try {
                iArr13[get_user_address_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_user_address_result$_Fields[get_user_address_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_user_address_result$_Fields[get_user_address_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            int[] iArr14 = new int[get_user_address_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_user_address_args$_Fields = iArr14;
            try {
                iArr14[get_user_address_args._Fields.STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
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
        public static class choice_address_call extends TAsyncMethodCall {
            private int address_id;

            public choice_address_call(int address_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.address_id = address_id;
            }

            public void getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_choice_address();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("choice_address", (byte) 1, 0));
                choice_address_args choice_address_argsVar = new choice_address_args();
                choice_address_argsVar.setAddress_id(this.address_id);
                choice_address_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class create_user_address_call extends TAsyncMethodCall {
            private UserAddressReq user_address_req;

            public create_user_address_call(UserAddressReq user_address_req, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.user_address_req = user_address_req;
            }

            public UserAddress getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_create_user_address();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("create_user_address", (byte) 1, 0));
                create_user_address_args create_user_address_argsVar = new create_user_address_args();
                create_user_address_argsVar.setUser_address_req(this.user_address_req);
                create_user_address_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_user_address_call extends TAsyncMethodCall {
            private int address_id;

            public delete_user_address_call(int address_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.address_id = address_id;
            }

            public void getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_delete_user_address();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("delete_user_address", (byte) 1, 0));
                delete_user_address_args delete_user_address_argsVar = new delete_user_address_args();
                delete_user_address_argsVar.setAddress_id(this.address_id);
                delete_user_address_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_child_address_call extends TAsyncMethodCall {
            private int parent_id;

            public get_child_address_call(int parent_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.parent_id = parent_id;
            }

            public List<ChildAddress> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_child_address();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_child_address", (byte) 1, 0));
                get_child_address_args get_child_address_argsVar = new get_child_address_args();
                get_child_address_argsVar.setParent_id(this.parent_id);
                get_child_address_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_address_call extends TAsyncMethodCall {
            private int status;

            public get_user_address_call(int status, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.status = status;
            }

            public List<UserAddress> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_user_address();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_user_address", (byte) 1, 0));
                get_user_address_args get_user_address_argsVar = new get_user_address_args();
                get_user_address_argsVar.setStatus(this.status);
                get_user_address_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class match_address_call extends TAsyncMethodCall {
            private AddressMatchReq req;

            public match_address_call(AddressMatchReq req, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.req = req;
            }

            public AddressMatchResp getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_match_address();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("match_address", (byte) 1, 0));
                match_address_args match_address_argsVar = new match_address_args();
                match_address_argsVar.setReq(this.req);
                match_address_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class update_user_address_call extends TAsyncMethodCall {
            private UserAddressReq user_address_req;

            public update_user_address_call(UserAddressReq user_address_req, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.user_address_req = user_address_req;
            }

            public UserAddress getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_update_user_address();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("update_user_address", (byte) 1, 0));
                update_user_address_args update_user_address_argsVar = new update_user_address_args();
                update_user_address_argsVar.setUser_address_req(this.user_address_req);
                update_user_address_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        public AsyncClient(TProtocolFactory protocolFactory, TAsyncClientManager clientManager, TNonblockingTransport transport) {
            super(protocolFactory, clientManager, transport);
        }

        @Override // com.baicizhan.online.mall_proxy.MallProxyService.AsyncIface
        public void choice_address(int address_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            choice_address_call choice_address_callVar = new choice_address_call(address_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = choice_address_callVar;
            this.___manager.call(choice_address_callVar);
        }

        @Override // com.baicizhan.online.mall_proxy.MallProxyService.AsyncIface
        public void create_user_address(UserAddressReq user_address_req, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            create_user_address_call create_user_address_callVar = new create_user_address_call(user_address_req, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = create_user_address_callVar;
            this.___manager.call(create_user_address_callVar);
        }

        @Override // com.baicizhan.online.mall_proxy.MallProxyService.AsyncIface
        public void delete_user_address(int address_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            delete_user_address_call delete_user_address_callVar = new delete_user_address_call(address_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = delete_user_address_callVar;
            this.___manager.call(delete_user_address_callVar);
        }

        @Override // com.baicizhan.online.mall_proxy.MallProxyService.AsyncIface
        public void get_child_address(int parent_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_child_address_call get_child_address_callVar = new get_child_address_call(parent_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_child_address_callVar;
            this.___manager.call(get_child_address_callVar);
        }

        @Override // com.baicizhan.online.mall_proxy.MallProxyService.AsyncIface
        public void get_user_address(int status, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_user_address_call get_user_address_callVar = new get_user_address_call(status, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_user_address_callVar;
            this.___manager.call(get_user_address_callVar);
        }

        @Override // com.baicizhan.online.mall_proxy.MallProxyService.AsyncIface
        public void match_address(AddressMatchReq req, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            match_address_call match_address_callVar = new match_address_call(req, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = match_address_callVar;
            this.___manager.call(match_address_callVar);
        }

        @Override // com.baicizhan.online.mall_proxy.MallProxyService.AsyncIface
        public void update_user_address(UserAddressReq user_address_req, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            update_user_address_call update_user_address_callVar = new update_user_address_call(user_address_req, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = update_user_address_callVar;
            this.___manager.call(update_user_address_callVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AsyncIface {
        void choice_address(int address_id, AsyncMethodCallback resultHandler) throws TException;

        void create_user_address(UserAddressReq user_address_req, AsyncMethodCallback resultHandler) throws TException;

        void delete_user_address(int address_id, AsyncMethodCallback resultHandler) throws TException;

        void get_child_address(int parent_id, AsyncMethodCallback resultHandler) throws TException;

        void get_user_address(int status, AsyncMethodCallback resultHandler) throws TException;

        void match_address(AddressMatchReq req, AsyncMethodCallback resultHandler) throws TException;

        void update_user_address(UserAddressReq user_address_req, AsyncMethodCallback resultHandler) throws TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AsyncProcessor<I extends AsyncIface> extends TBaseAsyncProcessor<I> {
        private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class choice_address<I extends AsyncIface> extends AsyncProcessFunction<I, choice_address_args, Void> {
            public choice_address() {
                super("choice_address");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.mall_proxy.MallProxyService.AsyncProcessor.choice_address.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        choice_address_result choice_address_resultVar;
                        choice_address_result choice_address_resultVar2 = new choice_address_result();
                        try {
                            if (exc instanceof SystemException) {
                                choice_address_resultVar2.boom = (SystemException) exc;
                                choice_address_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    choice_address_resultVar = r02;
                                    this.sendResponse(fb2, choice_address_resultVar, b11, seqid);
                                    return;
                                }
                                choice_address_resultVar2.bomb = (LogicException) exc;
                                choice_address_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, choice_address_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        choice_address_resultVar = choice_address_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new choice_address_result(), (byte) 2, seqid);
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
            public choice_address_args getEmptyArgsInstance() {
                return new choice_address_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, choice_address_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.choice_address(args.address_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class create_user_address<I extends AsyncIface> extends AsyncProcessFunction<I, create_user_address_args, UserAddress> {
            public create_user_address() {
                super("create_user_address");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<UserAddress> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<UserAddress>() { // from class: com.baicizhan.online.mall_proxy.MallProxyService.AsyncProcessor.create_user_address.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        create_user_address_result create_user_address_resultVar;
                        create_user_address_result create_user_address_resultVar2 = new create_user_address_result();
                        try {
                            if (exc instanceof SystemException) {
                                create_user_address_resultVar2.boom = (SystemException) exc;
                                create_user_address_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    create_user_address_resultVar = r02;
                                    this.sendResponse(fb2, create_user_address_resultVar, b11, seqid);
                                    return;
                                }
                                create_user_address_resultVar2.bomb = (LogicException) exc;
                                create_user_address_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, create_user_address_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        create_user_address_resultVar = create_user_address_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(UserAddress o11) {
                        create_user_address_result create_user_address_resultVar = new create_user_address_result();
                        create_user_address_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, create_user_address_resultVar, (byte) 2, seqid);
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
            public create_user_address_args getEmptyArgsInstance() {
                return new create_user_address_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, create_user_address_args args, AsyncMethodCallback<UserAddress> resultHandler) throws TException {
                iface.create_user_address(args.user_address_req, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_user_address<I extends AsyncIface> extends AsyncProcessFunction<I, delete_user_address_args, Void> {
            public delete_user_address() {
                super("delete_user_address");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.mall_proxy.MallProxyService.AsyncProcessor.delete_user_address.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        delete_user_address_result delete_user_address_resultVar;
                        delete_user_address_result delete_user_address_resultVar2 = new delete_user_address_result();
                        try {
                            if (exc instanceof SystemException) {
                                delete_user_address_resultVar2.boom = (SystemException) exc;
                                delete_user_address_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    delete_user_address_resultVar = r02;
                                    this.sendResponse(fb2, delete_user_address_resultVar, b11, seqid);
                                    return;
                                }
                                delete_user_address_resultVar2.bomb = (LogicException) exc;
                                delete_user_address_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, delete_user_address_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        delete_user_address_resultVar = delete_user_address_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new delete_user_address_result(), (byte) 2, seqid);
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
            public delete_user_address_args getEmptyArgsInstance() {
                return new delete_user_address_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, delete_user_address_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.delete_user_address(args.address_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_child_address<I extends AsyncIface> extends AsyncProcessFunction<I, get_child_address_args, List<ChildAddress>> {
            public get_child_address() {
                super("get_child_address");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<ChildAddress>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<ChildAddress>>() { // from class: com.baicizhan.online.mall_proxy.MallProxyService.AsyncProcessor.get_child_address.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_child_address_result get_child_address_resultVar;
                        get_child_address_result get_child_address_resultVar2 = new get_child_address_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_child_address_resultVar2.boom = (SystemException) exc;
                                get_child_address_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_child_address_resultVar = r02;
                                    this.sendResponse(fb2, get_child_address_resultVar, b11, seqid);
                                    return;
                                }
                                get_child_address_resultVar2.bomb = (LogicException) exc;
                                get_child_address_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_child_address_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_child_address_resultVar = get_child_address_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<ChildAddress> o11) {
                        get_child_address_result get_child_address_resultVar = new get_child_address_result();
                        get_child_address_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_child_address_resultVar, (byte) 2, seqid);
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
            public get_child_address_args getEmptyArgsInstance() {
                return new get_child_address_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_child_address_args args, AsyncMethodCallback<List<ChildAddress>> resultHandler) throws TException {
                iface.get_child_address(args.parent_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_address<I extends AsyncIface> extends AsyncProcessFunction<I, get_user_address_args, List<UserAddress>> {
            public get_user_address() {
                super("get_user_address");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<UserAddress>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<UserAddress>>() { // from class: com.baicizhan.online.mall_proxy.MallProxyService.AsyncProcessor.get_user_address.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_user_address_result get_user_address_resultVar;
                        get_user_address_result get_user_address_resultVar2 = new get_user_address_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_user_address_resultVar2.boom = (SystemException) exc;
                                get_user_address_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_user_address_resultVar = r02;
                                    this.sendResponse(fb2, get_user_address_resultVar, b11, seqid);
                                    return;
                                }
                                get_user_address_resultVar2.bomb = (LogicException) exc;
                                get_user_address_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_user_address_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_user_address_resultVar = get_user_address_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<UserAddress> o11) {
                        get_user_address_result get_user_address_resultVar = new get_user_address_result();
                        get_user_address_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_user_address_resultVar, (byte) 2, seqid);
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
            public get_user_address_args getEmptyArgsInstance() {
                return new get_user_address_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_user_address_args args, AsyncMethodCallback<List<UserAddress>> resultHandler) throws TException {
                iface.get_user_address(args.status, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class match_address<I extends AsyncIface> extends AsyncProcessFunction<I, match_address_args, AddressMatchResp> {
            public match_address() {
                super("match_address");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<AddressMatchResp> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<AddressMatchResp>() { // from class: com.baicizhan.online.mall_proxy.MallProxyService.AsyncProcessor.match_address.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        match_address_result match_address_resultVar;
                        match_address_result match_address_resultVar2 = new match_address_result();
                        try {
                            if (exc instanceof SystemException) {
                                match_address_resultVar2.boom = (SystemException) exc;
                                match_address_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    match_address_resultVar = r02;
                                    this.sendResponse(fb2, match_address_resultVar, b11, seqid);
                                    return;
                                }
                                match_address_resultVar2.bomb = (LogicException) exc;
                                match_address_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, match_address_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        match_address_resultVar = match_address_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(AddressMatchResp o11) {
                        match_address_result match_address_resultVar = new match_address_result();
                        match_address_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, match_address_resultVar, (byte) 2, seqid);
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
            public match_address_args getEmptyArgsInstance() {
                return new match_address_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, match_address_args args, AsyncMethodCallback<AddressMatchResp> resultHandler) throws TException {
                iface.match_address(args.req, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class update_user_address<I extends AsyncIface> extends AsyncProcessFunction<I, update_user_address_args, UserAddress> {
            public update_user_address() {
                super("update_user_address");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<UserAddress> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<UserAddress>() { // from class: com.baicizhan.online.mall_proxy.MallProxyService.AsyncProcessor.update_user_address.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        update_user_address_result update_user_address_resultVar;
                        update_user_address_result update_user_address_resultVar2 = new update_user_address_result();
                        try {
                            if (exc instanceof SystemException) {
                                update_user_address_resultVar2.boom = (SystemException) exc;
                                update_user_address_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    update_user_address_resultVar = r02;
                                    this.sendResponse(fb2, update_user_address_resultVar, b11, seqid);
                                    return;
                                }
                                update_user_address_resultVar2.bomb = (LogicException) exc;
                                update_user_address_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, update_user_address_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        update_user_address_resultVar = update_user_address_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(UserAddress o11) {
                        update_user_address_result update_user_address_resultVar = new update_user_address_result();
                        update_user_address_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, update_user_address_resultVar, (byte) 2, seqid);
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
            public update_user_address_args getEmptyArgsInstance() {
                return new update_user_address_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, update_user_address_args args, AsyncMethodCallback<UserAddress> resultHandler) throws TException {
                iface.update_user_address(args.user_address_req, resultHandler);
            }
        }

        public AsyncProcessor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends AsyncIface> Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> getProcessMap(Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> processMap) {
            processMap.put("get_user_address", new get_user_address());
            processMap.put("get_child_address", new get_child_address());
            processMap.put("choice_address", new choice_address());
            processMap.put("create_user_address", new create_user_address());
            processMap.put("delete_user_address", new delete_user_address());
            processMap.put("update_user_address", new update_user_address());
            processMap.put("match_address", new match_address());
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

        @Override // com.baicizhan.online.mall_proxy.MallProxyService.Iface
        public void choice_address(int address_id) throws SystemException, LogicException, TException {
            send_choice_address(address_id);
            recv_choice_address();
        }

        @Override // com.baicizhan.online.mall_proxy.MallProxyService.Iface
        public UserAddress create_user_address(UserAddressReq user_address_req) throws SystemException, LogicException, TException {
            send_create_user_address(user_address_req);
            return recv_create_user_address();
        }

        @Override // com.baicizhan.online.mall_proxy.MallProxyService.Iface
        public void delete_user_address(int address_id) throws SystemException, LogicException, TException {
            send_delete_user_address(address_id);
            recv_delete_user_address();
        }

        @Override // com.baicizhan.online.mall_proxy.MallProxyService.Iface
        public List<ChildAddress> get_child_address(int parent_id) throws SystemException, LogicException, TException {
            send_get_child_address(parent_id);
            return recv_get_child_address();
        }

        @Override // com.baicizhan.online.mall_proxy.MallProxyService.Iface
        public List<UserAddress> get_user_address(int status) throws SystemException, LogicException, TException {
            send_get_user_address(status);
            return recv_get_user_address();
        }

        @Override // com.baicizhan.online.mall_proxy.MallProxyService.Iface
        public AddressMatchResp match_address(AddressMatchReq req) throws SystemException, LogicException, TException {
            send_match_address(req);
            return recv_match_address();
        }

        public void recv_choice_address() throws SystemException, LogicException, TException {
            choice_address_result choice_address_resultVar = new choice_address_result();
            receiveBase(choice_address_resultVar, "choice_address");
            SystemException systemException = choice_address_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = choice_address_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
        }

        public UserAddress recv_create_user_address() throws SystemException, LogicException, TException {
            create_user_address_result create_user_address_resultVar = new create_user_address_result();
            receiveBase(create_user_address_resultVar, "create_user_address");
            if (create_user_address_resultVar.isSetSuccess()) {
                return create_user_address_resultVar.success;
            }
            SystemException systemException = create_user_address_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = create_user_address_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "create_user_address failed: unknown result");
        }

        public void recv_delete_user_address() throws SystemException, LogicException, TException {
            delete_user_address_result delete_user_address_resultVar = new delete_user_address_result();
            receiveBase(delete_user_address_resultVar, "delete_user_address");
            SystemException systemException = delete_user_address_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = delete_user_address_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
        }

        public List<ChildAddress> recv_get_child_address() throws SystemException, LogicException, TException {
            get_child_address_result get_child_address_resultVar = new get_child_address_result();
            receiveBase(get_child_address_resultVar, "get_child_address");
            if (get_child_address_resultVar.isSetSuccess()) {
                return get_child_address_resultVar.success;
            }
            SystemException systemException = get_child_address_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_child_address_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_child_address failed: unknown result");
        }

        public List<UserAddress> recv_get_user_address() throws SystemException, LogicException, TException {
            get_user_address_result get_user_address_resultVar = new get_user_address_result();
            receiveBase(get_user_address_resultVar, "get_user_address");
            if (get_user_address_resultVar.isSetSuccess()) {
                return get_user_address_resultVar.success;
            }
            SystemException systemException = get_user_address_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_user_address_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_user_address failed: unknown result");
        }

        public AddressMatchResp recv_match_address() throws SystemException, LogicException, TException {
            match_address_result match_address_resultVar = new match_address_result();
            receiveBase(match_address_resultVar, "match_address");
            if (match_address_resultVar.isSetSuccess()) {
                return match_address_resultVar.success;
            }
            SystemException systemException = match_address_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = match_address_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "match_address failed: unknown result");
        }

        public UserAddress recv_update_user_address() throws SystemException, LogicException, TException {
            update_user_address_result update_user_address_resultVar = new update_user_address_result();
            receiveBase(update_user_address_resultVar, "update_user_address");
            if (update_user_address_resultVar.isSetSuccess()) {
                return update_user_address_resultVar.success;
            }
            SystemException systemException = update_user_address_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = update_user_address_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "update_user_address failed: unknown result");
        }

        public void send_choice_address(int address_id) throws TException {
            choice_address_args choice_address_argsVar = new choice_address_args();
            choice_address_argsVar.setAddress_id(address_id);
            sendBase("choice_address", choice_address_argsVar);
        }

        public void send_create_user_address(UserAddressReq user_address_req) throws TException {
            create_user_address_args create_user_address_argsVar = new create_user_address_args();
            create_user_address_argsVar.setUser_address_req(user_address_req);
            sendBase("create_user_address", create_user_address_argsVar);
        }

        public void send_delete_user_address(int address_id) throws TException {
            delete_user_address_args delete_user_address_argsVar = new delete_user_address_args();
            delete_user_address_argsVar.setAddress_id(address_id);
            sendBase("delete_user_address", delete_user_address_argsVar);
        }

        public void send_get_child_address(int parent_id) throws TException {
            get_child_address_args get_child_address_argsVar = new get_child_address_args();
            get_child_address_argsVar.setParent_id(parent_id);
            sendBase("get_child_address", get_child_address_argsVar);
        }

        public void send_get_user_address(int status) throws TException {
            get_user_address_args get_user_address_argsVar = new get_user_address_args();
            get_user_address_argsVar.setStatus(status);
            sendBase("get_user_address", get_user_address_argsVar);
        }

        public void send_match_address(AddressMatchReq req) throws TException {
            match_address_args match_address_argsVar = new match_address_args();
            match_address_argsVar.setReq(req);
            sendBase("match_address", match_address_argsVar);
        }

        public void send_update_user_address(UserAddressReq user_address_req) throws TException {
            update_user_address_args update_user_address_argsVar = new update_user_address_args();
            update_user_address_argsVar.setUser_address_req(user_address_req);
            sendBase("update_user_address", update_user_address_argsVar);
        }

        @Override // com.baicizhan.online.mall_proxy.MallProxyService.Iface
        public UserAddress update_user_address(UserAddressReq user_address_req) throws SystemException, LogicException, TException {
            send_update_user_address(user_address_req);
            return recv_update_user_address();
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
        void choice_address(int address_id) throws SystemException, LogicException, TException;

        UserAddress create_user_address(UserAddressReq user_address_req) throws SystemException, LogicException, TException;

        void delete_user_address(int address_id) throws SystemException, LogicException, TException;

        List<ChildAddress> get_child_address(int parent_id) throws SystemException, LogicException, TException;

        List<UserAddress> get_user_address(int status) throws SystemException, LogicException, TException;

        AddressMatchResp match_address(AddressMatchReq req) throws SystemException, LogicException, TException;

        UserAddress update_user_address(UserAddressReq user_address_req) throws SystemException, LogicException, TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Processor<I extends Iface> extends TBaseProcessor<I> implements TProcessor {
        private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class choice_address<I extends Iface> extends ProcessFunction<I, choice_address_args> {
            public choice_address() {
                super("choice_address");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public choice_address_args getEmptyArgsInstance() {
                return new choice_address_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public choice_address_result getResult(I iface, choice_address_args args) throws TException {
                choice_address_result choice_address_resultVar = new choice_address_result();
                try {
                    iface.choice_address(args.address_id);
                    return choice_address_resultVar;
                } catch (LogicException e11) {
                    choice_address_resultVar.bomb = e11;
                    return choice_address_resultVar;
                } catch (SystemException e12) {
                    choice_address_resultVar.boom = e12;
                    return choice_address_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class create_user_address<I extends Iface> extends ProcessFunction<I, create_user_address_args> {
            public create_user_address() {
                super("create_user_address");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public create_user_address_args getEmptyArgsInstance() {
                return new create_user_address_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public create_user_address_result getResult(I iface, create_user_address_args args) throws TException {
                create_user_address_result create_user_address_resultVar = new create_user_address_result();
                try {
                    create_user_address_resultVar.success = iface.create_user_address(args.user_address_req);
                    return create_user_address_resultVar;
                } catch (LogicException e11) {
                    create_user_address_resultVar.bomb = e11;
                    return create_user_address_resultVar;
                } catch (SystemException e12) {
                    create_user_address_resultVar.boom = e12;
                    return create_user_address_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_user_address<I extends Iface> extends ProcessFunction<I, delete_user_address_args> {
            public delete_user_address() {
                super("delete_user_address");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public delete_user_address_args getEmptyArgsInstance() {
                return new delete_user_address_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public delete_user_address_result getResult(I iface, delete_user_address_args args) throws TException {
                delete_user_address_result delete_user_address_resultVar = new delete_user_address_result();
                try {
                    iface.delete_user_address(args.address_id);
                    return delete_user_address_resultVar;
                } catch (LogicException e11) {
                    delete_user_address_resultVar.bomb = e11;
                    return delete_user_address_resultVar;
                } catch (SystemException e12) {
                    delete_user_address_resultVar.boom = e12;
                    return delete_user_address_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_child_address<I extends Iface> extends ProcessFunction<I, get_child_address_args> {
            public get_child_address() {
                super("get_child_address");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_child_address_args getEmptyArgsInstance() {
                return new get_child_address_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_child_address_result getResult(I iface, get_child_address_args args) throws TException {
                get_child_address_result get_child_address_resultVar = new get_child_address_result();
                try {
                    get_child_address_resultVar.success = iface.get_child_address(args.parent_id);
                    return get_child_address_resultVar;
                } catch (LogicException e11) {
                    get_child_address_resultVar.bomb = e11;
                    return get_child_address_resultVar;
                } catch (SystemException e12) {
                    get_child_address_resultVar.boom = e12;
                    return get_child_address_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_address<I extends Iface> extends ProcessFunction<I, get_user_address_args> {
            public get_user_address() {
                super("get_user_address");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_user_address_args getEmptyArgsInstance() {
                return new get_user_address_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_user_address_result getResult(I iface, get_user_address_args args) throws TException {
                get_user_address_result get_user_address_resultVar = new get_user_address_result();
                try {
                    get_user_address_resultVar.success = iface.get_user_address(args.status);
                    return get_user_address_resultVar;
                } catch (LogicException e11) {
                    get_user_address_resultVar.bomb = e11;
                    return get_user_address_resultVar;
                } catch (SystemException e12) {
                    get_user_address_resultVar.boom = e12;
                    return get_user_address_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class match_address<I extends Iface> extends ProcessFunction<I, match_address_args> {
            public match_address() {
                super("match_address");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public match_address_args getEmptyArgsInstance() {
                return new match_address_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public match_address_result getResult(I iface, match_address_args args) throws TException {
                match_address_result match_address_resultVar = new match_address_result();
                try {
                    match_address_resultVar.success = iface.match_address(args.req);
                    return match_address_resultVar;
                } catch (LogicException e11) {
                    match_address_resultVar.bomb = e11;
                    return match_address_resultVar;
                } catch (SystemException e12) {
                    match_address_resultVar.boom = e12;
                    return match_address_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class update_user_address<I extends Iface> extends ProcessFunction<I, update_user_address_args> {
            public update_user_address() {
                super("update_user_address");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public update_user_address_args getEmptyArgsInstance() {
                return new update_user_address_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public update_user_address_result getResult(I iface, update_user_address_args args) throws TException {
                update_user_address_result update_user_address_resultVar = new update_user_address_result();
                try {
                    update_user_address_resultVar.success = iface.update_user_address(args.user_address_req);
                    return update_user_address_resultVar;
                } catch (LogicException e11) {
                    update_user_address_resultVar.bomb = e11;
                    return update_user_address_resultVar;
                } catch (SystemException e12) {
                    update_user_address_resultVar.boom = e12;
                    return update_user_address_resultVar;
                }
            }
        }

        public Processor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends Iface> Map<String, ProcessFunction<I, ? extends TBase>> getProcessMap(Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            processMap.put("get_user_address", new get_user_address());
            processMap.put("get_child_address", new get_child_address());
            processMap.put("choice_address", new choice_address());
            processMap.put("create_user_address", new create_user_address());
            processMap.put("delete_user_address", new delete_user_address());
            processMap.put("update_user_address", new update_user_address());
            processMap.put("match_address", new match_address());
            return processMap;
        }

        public Processor(I iface, Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            super(iface, getProcessMap(processMap));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class choice_address_args implements TBase<choice_address_args, _Fields>, Serializable, Cloneable, Comparable<choice_address_args> {
        private static final int __ADDRESS_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int address_id;
        private static final TStruct STRUCT_DESC = new TStruct("choice_address_args");
        private static final TField ADDRESS_ID_FIELD_DESC = new TField("address_id", (byte) 8, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ADDRESS_ID(1, "address_id");

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
                return ADDRESS_ID;
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
        public static class choice_address_argsStandardScheme extends StandardScheme<choice_address_args> {
            private choice_address_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, choice_address_args struct) throws TException {
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
                        struct.address_id = iprot.readI32();
                        struct.setAddress_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (struct.isSetAddress_id()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'address_id' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, choice_address_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(choice_address_args.STRUCT_DESC);
                oprot.writeFieldBegin(choice_address_args.ADDRESS_ID_FIELD_DESC);
                oprot.writeI32(struct.address_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class choice_address_argsStandardSchemeFactory implements SchemeFactory {
            private choice_address_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public choice_address_argsStandardScheme getScheme() {
                return new choice_address_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class choice_address_argsTupleScheme extends TupleScheme<choice_address_args> {
            private choice_address_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, choice_address_args struct) throws TException {
                struct.address_id = ((TTupleProtocol) prot).readI32();
                struct.setAddress_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, choice_address_args struct) throws TException {
                ((TTupleProtocol) prot).writeI32(struct.address_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class choice_address_argsTupleSchemeFactory implements SchemeFactory {
            private choice_address_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public choice_address_argsTupleScheme getScheme() {
                return new choice_address_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new choice_address_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new choice_address_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.ADDRESS_ID, (_Fields) new FieldMetaData("address_id", (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(choice_address_args.class, unmodifiableMap);
        }

        public choice_address_args() {
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
            setAddress_idIsSet(false);
            this.address_id = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof choice_address_args)) {
                return equals((choice_address_args) that);
            }
            return false;
        }

        public int getAddress_id() {
            return this.address_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetAddress_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public choice_address_args setAddress_id(int address_id) {
            this.address_id = address_id;
            setAddress_idIsSet(true);
            return this;
        }

        public void setAddress_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "choice_address_args(address_id:" + this.address_id + j.f81007d;
        }

        public void unsetAddress_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(choice_address_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetAddress_id()).compareTo(Boolean.valueOf(other.isSetAddress_id()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetAddress_id() || (compareTo = TBaseHelper.compareTo(this.address_id, other.address_id)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<choice_address_args, _Fields> deepCopy2() {
            return new choice_address_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$choice_address_args$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getAddress_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$choice_address_args$_Fields[field.ordinal()] == 1) {
                return isSetAddress_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$choice_address_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetAddress_id();
            } else {
                setAddress_id(((Integer) value).intValue());
            }
        }

        public choice_address_args(int address_id) {
            this();
            this.address_id = address_id;
            setAddress_idIsSet(true);
        }

        public boolean equals(choice_address_args that) {
            return that != null && this.address_id == that.address_id;
        }

        public choice_address_args(choice_address_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.address_id = other.address_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class choice_address_result implements TBase<choice_address_result, _Fields>, Serializable, Cloneable, Comparable<choice_address_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        private static final TStruct STRUCT_DESC = new TStruct("choice_address_result");
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
        public static class choice_address_resultStandardScheme extends StandardScheme<choice_address_result> {
            private choice_address_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, choice_address_result struct) throws TException {
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
            public void write(TProtocol oprot, choice_address_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(choice_address_result.STRUCT_DESC);
                if (struct.boom != null) {
                    oprot.writeFieldBegin(choice_address_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(choice_address_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class choice_address_resultStandardSchemeFactory implements SchemeFactory {
            private choice_address_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public choice_address_resultStandardScheme getScheme() {
                return new choice_address_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class choice_address_resultTupleScheme extends TupleScheme<choice_address_result> {
            private choice_address_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, choice_address_result struct) throws TException {
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
            public void write(TProtocol prot, choice_address_result struct) throws TException {
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
        public static class choice_address_resultTupleSchemeFactory implements SchemeFactory {
            private choice_address_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public choice_address_resultTupleScheme getScheme() {
                return new choice_address_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new choice_address_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new choice_address_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(choice_address_result.class, unmodifiableMap);
        }

        public choice_address_result() {
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
            if (that != null && (that instanceof choice_address_result)) {
                return equals((choice_address_result) that);
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

        public choice_address_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public choice_address_result setBoom(SystemException boom) {
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
            StringBuilder sb2 = new StringBuilder("choice_address_result(");
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

        public choice_address_result(SystemException boom, LogicException bomb) {
            this();
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(choice_address_result other) {
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
        public TBase<choice_address_result, _Fields> deepCopy2() {
            return new choice_address_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$choice_address_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$choice_address_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$choice_address_result$_Fields[field.ordinal()];
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

        public boolean equals(choice_address_result that) {
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

        public choice_address_result(choice_address_result other) {
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
    public static class create_user_address_args implements TBase<create_user_address_args, _Fields>, Serializable, Cloneable, Comparable<create_user_address_args> {
        private static final TStruct STRUCT_DESC = new TStruct("create_user_address_args");
        private static final TField USER_ADDRESS_REQ_FIELD_DESC = new TField("user_address_req", (byte) 12, 1);
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public UserAddressReq user_address_req;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            USER_ADDRESS_REQ(1, "user_address_req");

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
                return USER_ADDRESS_REQ;
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
        public static class create_user_address_argsStandardScheme extends StandardScheme<create_user_address_args> {
            private create_user_address_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, create_user_address_args struct) throws TException {
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
                        UserAddressReq userAddressReq = new UserAddressReq();
                        struct.user_address_req = userAddressReq;
                        userAddressReq.read(iprot);
                        struct.setUser_address_reqIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, create_user_address_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(create_user_address_args.STRUCT_DESC);
                if (struct.user_address_req != null) {
                    oprot.writeFieldBegin(create_user_address_args.USER_ADDRESS_REQ_FIELD_DESC);
                    struct.user_address_req.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class create_user_address_argsStandardSchemeFactory implements SchemeFactory {
            private create_user_address_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public create_user_address_argsStandardScheme getScheme() {
                return new create_user_address_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class create_user_address_argsTupleScheme extends TupleScheme<create_user_address_args> {
            private create_user_address_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, create_user_address_args struct) throws TException {
                UserAddressReq userAddressReq = new UserAddressReq();
                struct.user_address_req = userAddressReq;
                userAddressReq.read((TTupleProtocol) prot);
                struct.setUser_address_reqIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, create_user_address_args struct) throws TException {
                struct.user_address_req.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class create_user_address_argsTupleSchemeFactory implements SchemeFactory {
            private create_user_address_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public create_user_address_argsTupleScheme getScheme() {
                return new create_user_address_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new create_user_address_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new create_user_address_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.USER_ADDRESS_REQ, (_Fields) new FieldMetaData("user_address_req", (byte) 1, new StructMetaData((byte) 12, UserAddressReq.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(create_user_address_args.class, unmodifiableMap);
        }

        public create_user_address_args() {
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
            this.user_address_req = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof create_user_address_args)) {
                return equals((create_user_address_args) that);
            }
            return false;
        }

        public UserAddressReq getUser_address_req() {
            return this.user_address_req;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetUser_address_req() {
            return this.user_address_req != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public create_user_address_args setUser_address_req(UserAddressReq user_address_req) {
            this.user_address_req = user_address_req;
            return this;
        }

        public void setUser_address_reqIsSet(boolean value) {
            if (value) {
                return;
            }
            this.user_address_req = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("create_user_address_args(");
            sb2.append("user_address_req:");
            UserAddressReq userAddressReq = this.user_address_req;
            if (userAddressReq == null) {
                sb2.append("null");
            } else {
                sb2.append(userAddressReq);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetUser_address_req() {
            this.user_address_req = null;
        }

        public void validate() throws TException {
            UserAddressReq userAddressReq = this.user_address_req;
            if (userAddressReq != null) {
                if (userAddressReq != null) {
                    userAddressReq.validate();
                }
            } else {
                throw new TProtocolException("Required field 'user_address_req' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public create_user_address_args(UserAddressReq user_address_req) {
            this();
            this.user_address_req = user_address_req;
        }

        @Override // java.lang.Comparable
        public int compareTo(create_user_address_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetUser_address_req()).compareTo(Boolean.valueOf(other.isSetUser_address_req()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetUser_address_req() || (compareTo = TBaseHelper.compareTo((Comparable) this.user_address_req, (Comparable) other.user_address_req)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<create_user_address_args, _Fields> deepCopy2() {
            return new create_user_address_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$create_user_address_args$_Fields[field.ordinal()] == 1) {
                return getUser_address_req();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$create_user_address_args$_Fields[field.ordinal()] == 1) {
                return isSetUser_address_req();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$create_user_address_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetUser_address_req();
            } else {
                setUser_address_req((UserAddressReq) value);
            }
        }

        public boolean equals(create_user_address_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetUser_address_req = isSetUser_address_req();
            boolean isSetUser_address_req2 = that.isSetUser_address_req();
            if (isSetUser_address_req || isSetUser_address_req2) {
                return isSetUser_address_req && isSetUser_address_req2 && this.user_address_req.equals(that.user_address_req);
            }
            return true;
        }

        public create_user_address_args(create_user_address_args other) {
            if (other.isSetUser_address_req()) {
                this.user_address_req = new UserAddressReq(other.user_address_req);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class create_user_address_result implements TBase<create_user_address_result, _Fields>, Serializable, Cloneable, Comparable<create_user_address_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public UserAddress success;
        private static final TStruct STRUCT_DESC = new TStruct("create_user_address_result");
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
        public static class create_user_address_resultStandardScheme extends StandardScheme<create_user_address_result> {
            private create_user_address_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, create_user_address_result struct) throws TException {
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
                        UserAddress userAddress = new UserAddress();
                        struct.success = userAddress;
                        userAddress.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, create_user_address_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(create_user_address_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(create_user_address_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(create_user_address_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(create_user_address_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class create_user_address_resultStandardSchemeFactory implements SchemeFactory {
            private create_user_address_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public create_user_address_resultStandardScheme getScheme() {
                return new create_user_address_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class create_user_address_resultTupleScheme extends TupleScheme<create_user_address_result> {
            private create_user_address_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, create_user_address_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    UserAddress userAddress = new UserAddress();
                    struct.success = userAddress;
                    userAddress.read(tTupleProtocol);
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
            public void write(TProtocol prot, create_user_address_result struct) throws TException {
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
        public static class create_user_address_resultTupleSchemeFactory implements SchemeFactory {
            private create_user_address_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public create_user_address_resultTupleScheme getScheme() {
                return new create_user_address_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new create_user_address_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new create_user_address_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, UserAddress.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(create_user_address_result.class, unmodifiableMap);
        }

        public create_user_address_result() {
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
            if (that != null && (that instanceof create_user_address_result)) {
                return equals((create_user_address_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public UserAddress getSuccess() {
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

        public create_user_address_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public create_user_address_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public create_user_address_result setSuccess(UserAddress success) {
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
            StringBuilder sb2 = new StringBuilder("create_user_address_result(");
            sb2.append("success:");
            UserAddress userAddress = this.success;
            if (userAddress == null) {
                sb2.append("null");
            } else {
                sb2.append(userAddress);
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
            UserAddress userAddress = this.success;
            if (userAddress != null) {
                userAddress.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public create_user_address_result(UserAddress success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(create_user_address_result other) {
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
        public TBase<create_user_address_result, _Fields> deepCopy2() {
            return new create_user_address_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$create_user_address_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$create_user_address_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$create_user_address_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((UserAddress) value);
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

        public boolean equals(create_user_address_result that) {
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

        public create_user_address_result(create_user_address_result other) {
            if (other.isSetSuccess()) {
                this.success = new UserAddress(other.success);
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
    public static class delete_user_address_args implements TBase<delete_user_address_args, _Fields>, Serializable, Cloneable, Comparable<delete_user_address_args> {
        private static final int __ADDRESS_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int address_id;
        private static final TStruct STRUCT_DESC = new TStruct("delete_user_address_args");
        private static final TField ADDRESS_ID_FIELD_DESC = new TField("address_id", (byte) 8, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ADDRESS_ID(1, "address_id");

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
                return ADDRESS_ID;
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
        public static class delete_user_address_argsStandardScheme extends StandardScheme<delete_user_address_args> {
            private delete_user_address_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, delete_user_address_args struct) throws TException {
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
                        struct.address_id = iprot.readI32();
                        struct.setAddress_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (struct.isSetAddress_id()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'address_id' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, delete_user_address_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(delete_user_address_args.STRUCT_DESC);
                oprot.writeFieldBegin(delete_user_address_args.ADDRESS_ID_FIELD_DESC);
                oprot.writeI32(struct.address_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_user_address_argsStandardSchemeFactory implements SchemeFactory {
            private delete_user_address_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public delete_user_address_argsStandardScheme getScheme() {
                return new delete_user_address_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_user_address_argsTupleScheme extends TupleScheme<delete_user_address_args> {
            private delete_user_address_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, delete_user_address_args struct) throws TException {
                struct.address_id = ((TTupleProtocol) prot).readI32();
                struct.setAddress_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, delete_user_address_args struct) throws TException {
                ((TTupleProtocol) prot).writeI32(struct.address_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_user_address_argsTupleSchemeFactory implements SchemeFactory {
            private delete_user_address_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public delete_user_address_argsTupleScheme getScheme() {
                return new delete_user_address_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new delete_user_address_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new delete_user_address_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.ADDRESS_ID, (_Fields) new FieldMetaData("address_id", (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(delete_user_address_args.class, unmodifiableMap);
        }

        public delete_user_address_args() {
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
            setAddress_idIsSet(false);
            this.address_id = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof delete_user_address_args)) {
                return equals((delete_user_address_args) that);
            }
            return false;
        }

        public int getAddress_id() {
            return this.address_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetAddress_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public delete_user_address_args setAddress_id(int address_id) {
            this.address_id = address_id;
            setAddress_idIsSet(true);
            return this;
        }

        public void setAddress_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "delete_user_address_args(address_id:" + this.address_id + j.f81007d;
        }

        public void unsetAddress_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(delete_user_address_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetAddress_id()).compareTo(Boolean.valueOf(other.isSetAddress_id()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetAddress_id() || (compareTo = TBaseHelper.compareTo(this.address_id, other.address_id)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<delete_user_address_args, _Fields> deepCopy2() {
            return new delete_user_address_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$delete_user_address_args$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getAddress_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$delete_user_address_args$_Fields[field.ordinal()] == 1) {
                return isSetAddress_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$delete_user_address_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetAddress_id();
            } else {
                setAddress_id(((Integer) value).intValue());
            }
        }

        public delete_user_address_args(int address_id) {
            this();
            this.address_id = address_id;
            setAddress_idIsSet(true);
        }

        public boolean equals(delete_user_address_args that) {
            return that != null && this.address_id == that.address_id;
        }

        public delete_user_address_args(delete_user_address_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.address_id = other.address_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class delete_user_address_result implements TBase<delete_user_address_result, _Fields>, Serializable, Cloneable, Comparable<delete_user_address_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        private static final TStruct STRUCT_DESC = new TStruct("delete_user_address_result");
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
        public static class delete_user_address_resultStandardScheme extends StandardScheme<delete_user_address_result> {
            private delete_user_address_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, delete_user_address_result struct) throws TException {
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
            public void write(TProtocol oprot, delete_user_address_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(delete_user_address_result.STRUCT_DESC);
                if (struct.boom != null) {
                    oprot.writeFieldBegin(delete_user_address_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(delete_user_address_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_user_address_resultStandardSchemeFactory implements SchemeFactory {
            private delete_user_address_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public delete_user_address_resultStandardScheme getScheme() {
                return new delete_user_address_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_user_address_resultTupleScheme extends TupleScheme<delete_user_address_result> {
            private delete_user_address_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, delete_user_address_result struct) throws TException {
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
            public void write(TProtocol prot, delete_user_address_result struct) throws TException {
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
        public static class delete_user_address_resultTupleSchemeFactory implements SchemeFactory {
            private delete_user_address_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public delete_user_address_resultTupleScheme getScheme() {
                return new delete_user_address_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new delete_user_address_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new delete_user_address_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(delete_user_address_result.class, unmodifiableMap);
        }

        public delete_user_address_result() {
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
            if (that != null && (that instanceof delete_user_address_result)) {
                return equals((delete_user_address_result) that);
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

        public delete_user_address_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public delete_user_address_result setBoom(SystemException boom) {
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
            StringBuilder sb2 = new StringBuilder("delete_user_address_result(");
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

        public delete_user_address_result(SystemException boom, LogicException bomb) {
            this();
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(delete_user_address_result other) {
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
        public TBase<delete_user_address_result, _Fields> deepCopy2() {
            return new delete_user_address_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$delete_user_address_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$delete_user_address_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$delete_user_address_result$_Fields[field.ordinal()];
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

        public boolean equals(delete_user_address_result that) {
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

        public delete_user_address_result(delete_user_address_result other) {
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
    public static class get_child_address_args implements TBase<get_child_address_args, _Fields>, Serializable, Cloneable, Comparable<get_child_address_args> {
        private static final int __PARENT_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int parent_id;
        private static final TStruct STRUCT_DESC = new TStruct("get_child_address_args");
        private static final TField PARENT_ID_FIELD_DESC = new TField("parent_id", (byte) 8, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            PARENT_ID(1, "parent_id");

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
                return PARENT_ID;
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
        public static class get_child_address_argsStandardScheme extends StandardScheme<get_child_address_args> {
            private get_child_address_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_child_address_args struct) throws TException {
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
                        struct.parent_id = iprot.readI32();
                        struct.setParent_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (struct.isSetParent_id()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'parent_id' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_child_address_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_child_address_args.STRUCT_DESC);
                oprot.writeFieldBegin(get_child_address_args.PARENT_ID_FIELD_DESC);
                oprot.writeI32(struct.parent_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_child_address_argsStandardSchemeFactory implements SchemeFactory {
            private get_child_address_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_child_address_argsStandardScheme getScheme() {
                return new get_child_address_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_child_address_argsTupleScheme extends TupleScheme<get_child_address_args> {
            private get_child_address_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_child_address_args struct) throws TException {
                struct.parent_id = ((TTupleProtocol) prot).readI32();
                struct.setParent_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_child_address_args struct) throws TException {
                ((TTupleProtocol) prot).writeI32(struct.parent_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_child_address_argsTupleSchemeFactory implements SchemeFactory {
            private get_child_address_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_child_address_argsTupleScheme getScheme() {
                return new get_child_address_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_child_address_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_child_address_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.PARENT_ID, (_Fields) new FieldMetaData("parent_id", (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_child_address_args.class, unmodifiableMap);
        }

        public get_child_address_args() {
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
            setParent_idIsSet(false);
            this.parent_id = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_child_address_args)) {
                return equals((get_child_address_args) that);
            }
            return false;
        }

        public int getParent_id() {
            return this.parent_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetParent_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_child_address_args setParent_id(int parent_id) {
            this.parent_id = parent_id;
            setParent_idIsSet(true);
            return this;
        }

        public void setParent_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "get_child_address_args(parent_id:" + this.parent_id + j.f81007d;
        }

        public void unsetParent_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_child_address_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetParent_id()).compareTo(Boolean.valueOf(other.isSetParent_id()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetParent_id() || (compareTo = TBaseHelper.compareTo(this.parent_id, other.parent_id)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_child_address_args, _Fields> deepCopy2() {
            return new get_child_address_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_child_address_args$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getParent_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_child_address_args$_Fields[field.ordinal()] == 1) {
                return isSetParent_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_child_address_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetParent_id();
            } else {
                setParent_id(((Integer) value).intValue());
            }
        }

        public get_child_address_args(int parent_id) {
            this();
            this.parent_id = parent_id;
            setParent_idIsSet(true);
        }

        public boolean equals(get_child_address_args that) {
            return that != null && this.parent_id == that.parent_id;
        }

        public get_child_address_args(get_child_address_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.parent_id = other.parent_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_child_address_result implements TBase<get_child_address_result, _Fields>, Serializable, Cloneable, Comparable<get_child_address_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<ChildAddress> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_child_address_result");
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
        public static class get_child_address_resultStandardScheme extends StandardScheme<get_child_address_result> {
            private get_child_address_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_child_address_result struct) throws TException {
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
                            ChildAddress childAddress = new ChildAddress();
                            childAddress.read(iprot);
                            struct.success.add(childAddress);
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
            public void write(TProtocol oprot, get_child_address_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_child_address_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_child_address_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<ChildAddress> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_child_address_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_child_address_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_child_address_resultStandardSchemeFactory implements SchemeFactory {
            private get_child_address_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_child_address_resultStandardScheme getScheme() {
                return new get_child_address_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_child_address_resultTupleScheme extends TupleScheme<get_child_address_result> {
            private get_child_address_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_child_address_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        ChildAddress childAddress = new ChildAddress();
                        childAddress.read(tTupleProtocol);
                        struct.success.add(childAddress);
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
            public void write(TProtocol prot, get_child_address_result struct) throws TException {
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
                    Iterator<ChildAddress> it = struct.success.iterator();
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
        public static class get_child_address_resultTupleSchemeFactory implements SchemeFactory {
            private get_child_address_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_child_address_resultTupleScheme getScheme() {
                return new get_child_address_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_child_address_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_child_address_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, ChildAddress.class))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_child_address_result.class, unmodifiableMap);
        }

        public get_child_address_result() {
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

        public void addToSuccess(ChildAddress elem) {
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
            if (that != null && (that instanceof get_child_address_result)) {
                return equals((get_child_address_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public List<ChildAddress> getSuccess() {
            return this.success;
        }

        public Iterator<ChildAddress> getSuccessIterator() {
            List<ChildAddress> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<ChildAddress> list = this.success;
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

        public get_child_address_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_child_address_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_child_address_result setSuccess(List<ChildAddress> success) {
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
            StringBuilder sb2 = new StringBuilder("get_child_address_result(");
            sb2.append("success:");
            List<ChildAddress> list = this.success;
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

        public get_child_address_result(List<ChildAddress> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_child_address_result other) {
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
        public TBase<get_child_address_result, _Fields> deepCopy2() {
            return new get_child_address_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_child_address_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_child_address_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_child_address_result$_Fields[field.ordinal()];
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

        public boolean equals(get_child_address_result that) {
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

        public get_child_address_result(get_child_address_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<ChildAddress> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ChildAddress(it.next()));
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
    public static class get_user_address_args implements TBase<get_user_address_args, _Fields>, Serializable, Cloneable, Comparable<get_user_address_args> {
        private static final int __STATUS_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int status;
        private static final TStruct STRUCT_DESC = new TStruct("get_user_address_args");
        private static final TField STATUS_FIELD_DESC = new TField("status", (byte) 8, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            STATUS(1, "status");

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
                return STATUS;
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
        public static class get_user_address_argsStandardScheme extends StandardScheme<get_user_address_args> {
            private get_user_address_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_user_address_args struct) throws TException {
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
                        struct.status = iprot.readI32();
                        struct.setStatusIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (struct.isSetStatus()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'status' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_user_address_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_user_address_args.STRUCT_DESC);
                oprot.writeFieldBegin(get_user_address_args.STATUS_FIELD_DESC);
                oprot.writeI32(struct.status);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_address_argsStandardSchemeFactory implements SchemeFactory {
            private get_user_address_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_address_argsStandardScheme getScheme() {
                return new get_user_address_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_address_argsTupleScheme extends TupleScheme<get_user_address_args> {
            private get_user_address_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_user_address_args struct) throws TException {
                struct.status = ((TTupleProtocol) prot).readI32();
                struct.setStatusIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_user_address_args struct) throws TException {
                ((TTupleProtocol) prot).writeI32(struct.status);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_address_argsTupleSchemeFactory implements SchemeFactory {
            private get_user_address_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_address_argsTupleScheme getScheme() {
                return new get_user_address_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_user_address_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_user_address_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.STATUS, (_Fields) new FieldMetaData("status", (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_user_address_args.class, unmodifiableMap);
        }

        public get_user_address_args() {
            this.__isset_bitfield = (byte) 0;
            this.status = 0;
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
            this.status = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_user_address_args)) {
                return equals((get_user_address_args) that);
            }
            return false;
        }

        public int getStatus() {
            return this.status;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetStatus() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_user_address_args setStatus(int status) {
            this.status = status;
            setStatusIsSet(true);
            return this;
        }

        public void setStatusIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "get_user_address_args(status:" + this.status + j.f81007d;
        }

        public void unsetStatus() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_user_address_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetStatus()).compareTo(Boolean.valueOf(other.isSetStatus()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetStatus() || (compareTo = TBaseHelper.compareTo(this.status, other.status)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_user_address_args, _Fields> deepCopy2() {
            return new get_user_address_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_user_address_args$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getStatus());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_user_address_args$_Fields[field.ordinal()] == 1) {
                return isSetStatus();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_user_address_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetStatus();
            } else {
                setStatus(((Integer) value).intValue());
            }
        }

        public boolean equals(get_user_address_args that) {
            return that != null && this.status == that.status;
        }

        public get_user_address_args(int status) {
            this();
            this.status = status;
            setStatusIsSet(true);
        }

        public get_user_address_args(get_user_address_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.status = other.status;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_user_address_result implements TBase<get_user_address_result, _Fields>, Serializable, Cloneable, Comparable<get_user_address_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<UserAddress> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_user_address_result");
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
        public static class get_user_address_resultStandardScheme extends StandardScheme<get_user_address_result> {
            private get_user_address_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_user_address_result struct) throws TException {
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
                            UserAddress userAddress = new UserAddress();
                            userAddress.read(iprot);
                            struct.success.add(userAddress);
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
            public void write(TProtocol oprot, get_user_address_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_user_address_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_user_address_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<UserAddress> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_user_address_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_user_address_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_address_resultStandardSchemeFactory implements SchemeFactory {
            private get_user_address_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_address_resultStandardScheme getScheme() {
                return new get_user_address_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_user_address_resultTupleScheme extends TupleScheme<get_user_address_result> {
            private get_user_address_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_user_address_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        UserAddress userAddress = new UserAddress();
                        userAddress.read(tTupleProtocol);
                        struct.success.add(userAddress);
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
            public void write(TProtocol prot, get_user_address_result struct) throws TException {
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
                    Iterator<UserAddress> it = struct.success.iterator();
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
        public static class get_user_address_resultTupleSchemeFactory implements SchemeFactory {
            private get_user_address_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_user_address_resultTupleScheme getScheme() {
                return new get_user_address_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_user_address_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_user_address_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserAddress.class))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_user_address_result.class, unmodifiableMap);
        }

        public get_user_address_result() {
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

        public void addToSuccess(UserAddress elem) {
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
            if (that != null && (that instanceof get_user_address_result)) {
                return equals((get_user_address_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public List<UserAddress> getSuccess() {
            return this.success;
        }

        public Iterator<UserAddress> getSuccessIterator() {
            List<UserAddress> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<UserAddress> list = this.success;
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

        public get_user_address_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_user_address_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_user_address_result setSuccess(List<UserAddress> success) {
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
            StringBuilder sb2 = new StringBuilder("get_user_address_result(");
            sb2.append("success:");
            List<UserAddress> list = this.success;
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

        public get_user_address_result(List<UserAddress> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_user_address_result other) {
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
        public TBase<get_user_address_result, _Fields> deepCopy2() {
            return new get_user_address_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_user_address_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_user_address_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$get_user_address_result$_Fields[field.ordinal()];
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

        public boolean equals(get_user_address_result that) {
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

        public get_user_address_result(get_user_address_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<UserAddress> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new UserAddress(it.next()));
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
    public static class match_address_args implements TBase<match_address_args, _Fields>, Serializable, Cloneable, Comparable<match_address_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public AddressMatchReq req;
        private static final TStruct STRUCT_DESC = new TStruct("match_address_args");
        private static final TField REQ_FIELD_DESC = new TField(HiAnalyticsConstant.Direction.REQUEST, (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            REQ(1, HiAnalyticsConstant.Direction.REQUEST);

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
                return REQ;
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
        public static class match_address_argsStandardScheme extends StandardScheme<match_address_args> {
            private match_address_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, match_address_args struct) throws TException {
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
                        AddressMatchReq addressMatchReq = new AddressMatchReq();
                        struct.req = addressMatchReq;
                        addressMatchReq.read(iprot);
                        struct.setReqIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, match_address_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(match_address_args.STRUCT_DESC);
                if (struct.req != null) {
                    oprot.writeFieldBegin(match_address_args.REQ_FIELD_DESC);
                    struct.req.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class match_address_argsStandardSchemeFactory implements SchemeFactory {
            private match_address_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public match_address_argsStandardScheme getScheme() {
                return new match_address_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class match_address_argsTupleScheme extends TupleScheme<match_address_args> {
            private match_address_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, match_address_args struct) throws TException {
                AddressMatchReq addressMatchReq = new AddressMatchReq();
                struct.req = addressMatchReq;
                addressMatchReq.read((TTupleProtocol) prot);
                struct.setReqIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, match_address_args struct) throws TException {
                struct.req.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class match_address_argsTupleSchemeFactory implements SchemeFactory {
            private match_address_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public match_address_argsTupleScheme getScheme() {
                return new match_address_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new match_address_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new match_address_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.REQ, (_Fields) new FieldMetaData(HiAnalyticsConstant.Direction.REQUEST, (byte) 1, new StructMetaData((byte) 12, AddressMatchReq.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(match_address_args.class, unmodifiableMap);
        }

        public match_address_args() {
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
            this.req = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof match_address_args)) {
                return equals((match_address_args) that);
            }
            return false;
        }

        public AddressMatchReq getReq() {
            return this.req;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetReq() {
            return this.req != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public match_address_args setReq(AddressMatchReq req) {
            this.req = req;
            return this;
        }

        public void setReqIsSet(boolean value) {
            if (value) {
                return;
            }
            this.req = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("match_address_args(");
            sb2.append("req:");
            AddressMatchReq addressMatchReq = this.req;
            if (addressMatchReq == null) {
                sb2.append("null");
            } else {
                sb2.append(addressMatchReq);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetReq() {
            this.req = null;
        }

        public void validate() throws TException {
            AddressMatchReq addressMatchReq = this.req;
            if (addressMatchReq != null) {
                if (addressMatchReq != null) {
                    addressMatchReq.validate();
                }
            } else {
                throw new TProtocolException("Required field 'req' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public match_address_args(AddressMatchReq req) {
            this();
            this.req = req;
        }

        @Override // java.lang.Comparable
        public int compareTo(match_address_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetReq()).compareTo(Boolean.valueOf(other.isSetReq()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetReq() || (compareTo = TBaseHelper.compareTo((Comparable) this.req, (Comparable) other.req)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<match_address_args, _Fields> deepCopy2() {
            return new match_address_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$match_address_args$_Fields[field.ordinal()] == 1) {
                return getReq();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$match_address_args$_Fields[field.ordinal()] == 1) {
                return isSetReq();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$match_address_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetReq();
            } else {
                setReq((AddressMatchReq) value);
            }
        }

        public boolean equals(match_address_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetReq = isSetReq();
            boolean isSetReq2 = that.isSetReq();
            if (isSetReq || isSetReq2) {
                return isSetReq && isSetReq2 && this.req.equals(that.req);
            }
            return true;
        }

        public match_address_args(match_address_args other) {
            if (other.isSetReq()) {
                this.req = new AddressMatchReq(other.req);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class match_address_result implements TBase<match_address_result, _Fields>, Serializable, Cloneable, Comparable<match_address_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public AddressMatchResp success;
        private static final TStruct STRUCT_DESC = new TStruct("match_address_result");
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
        public static class match_address_resultStandardScheme extends StandardScheme<match_address_result> {
            private match_address_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, match_address_result struct) throws TException {
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
                        AddressMatchResp addressMatchResp = new AddressMatchResp();
                        struct.success = addressMatchResp;
                        addressMatchResp.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, match_address_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(match_address_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(match_address_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(match_address_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(match_address_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class match_address_resultStandardSchemeFactory implements SchemeFactory {
            private match_address_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public match_address_resultStandardScheme getScheme() {
                return new match_address_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class match_address_resultTupleScheme extends TupleScheme<match_address_result> {
            private match_address_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, match_address_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    AddressMatchResp addressMatchResp = new AddressMatchResp();
                    struct.success = addressMatchResp;
                    addressMatchResp.read(tTupleProtocol);
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
            public void write(TProtocol prot, match_address_result struct) throws TException {
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
        public static class match_address_resultTupleSchemeFactory implements SchemeFactory {
            private match_address_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public match_address_resultTupleScheme getScheme() {
                return new match_address_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new match_address_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new match_address_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, AddressMatchResp.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(match_address_result.class, unmodifiableMap);
        }

        public match_address_result() {
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
            if (that != null && (that instanceof match_address_result)) {
                return equals((match_address_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public AddressMatchResp getSuccess() {
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

        public match_address_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public match_address_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public match_address_result setSuccess(AddressMatchResp success) {
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
            StringBuilder sb2 = new StringBuilder("match_address_result(");
            sb2.append("success:");
            AddressMatchResp addressMatchResp = this.success;
            if (addressMatchResp == null) {
                sb2.append("null");
            } else {
                sb2.append(addressMatchResp);
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
            AddressMatchResp addressMatchResp = this.success;
            if (addressMatchResp != null) {
                addressMatchResp.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public match_address_result(AddressMatchResp success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(match_address_result other) {
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
        public TBase<match_address_result, _Fields> deepCopy2() {
            return new match_address_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$match_address_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$match_address_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$match_address_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((AddressMatchResp) value);
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

        public boolean equals(match_address_result that) {
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

        public match_address_result(match_address_result other) {
            if (other.isSetSuccess()) {
                this.success = new AddressMatchResp(other.success);
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
    public static class update_user_address_args implements TBase<update_user_address_args, _Fields>, Serializable, Cloneable, Comparable<update_user_address_args> {
        private static final TStruct STRUCT_DESC = new TStruct("update_user_address_args");
        private static final TField USER_ADDRESS_REQ_FIELD_DESC = new TField("user_address_req", (byte) 12, 1);
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public UserAddressReq user_address_req;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            USER_ADDRESS_REQ(1, "user_address_req");

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
                return USER_ADDRESS_REQ;
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
        public static class update_user_address_argsStandardScheme extends StandardScheme<update_user_address_args> {
            private update_user_address_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, update_user_address_args struct) throws TException {
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
                        UserAddressReq userAddressReq = new UserAddressReq();
                        struct.user_address_req = userAddressReq;
                        userAddressReq.read(iprot);
                        struct.setUser_address_reqIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, update_user_address_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(update_user_address_args.STRUCT_DESC);
                if (struct.user_address_req != null) {
                    oprot.writeFieldBegin(update_user_address_args.USER_ADDRESS_REQ_FIELD_DESC);
                    struct.user_address_req.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class update_user_address_argsStandardSchemeFactory implements SchemeFactory {
            private update_user_address_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public update_user_address_argsStandardScheme getScheme() {
                return new update_user_address_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class update_user_address_argsTupleScheme extends TupleScheme<update_user_address_args> {
            private update_user_address_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, update_user_address_args struct) throws TException {
                UserAddressReq userAddressReq = new UserAddressReq();
                struct.user_address_req = userAddressReq;
                userAddressReq.read((TTupleProtocol) prot);
                struct.setUser_address_reqIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, update_user_address_args struct) throws TException {
                struct.user_address_req.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class update_user_address_argsTupleSchemeFactory implements SchemeFactory {
            private update_user_address_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public update_user_address_argsTupleScheme getScheme() {
                return new update_user_address_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new update_user_address_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new update_user_address_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.USER_ADDRESS_REQ, (_Fields) new FieldMetaData("user_address_req", (byte) 1, new StructMetaData((byte) 12, UserAddressReq.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(update_user_address_args.class, unmodifiableMap);
        }

        public update_user_address_args() {
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
            this.user_address_req = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof update_user_address_args)) {
                return equals((update_user_address_args) that);
            }
            return false;
        }

        public UserAddressReq getUser_address_req() {
            return this.user_address_req;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetUser_address_req() {
            return this.user_address_req != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public update_user_address_args setUser_address_req(UserAddressReq user_address_req) {
            this.user_address_req = user_address_req;
            return this;
        }

        public void setUser_address_reqIsSet(boolean value) {
            if (value) {
                return;
            }
            this.user_address_req = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("update_user_address_args(");
            sb2.append("user_address_req:");
            UserAddressReq userAddressReq = this.user_address_req;
            if (userAddressReq == null) {
                sb2.append("null");
            } else {
                sb2.append(userAddressReq);
            }
            sb2.append(j.f81007d);
            return sb2.toString();
        }

        public void unsetUser_address_req() {
            this.user_address_req = null;
        }

        public void validate() throws TException {
            UserAddressReq userAddressReq = this.user_address_req;
            if (userAddressReq != null) {
                if (userAddressReq != null) {
                    userAddressReq.validate();
                }
            } else {
                throw new TProtocolException("Required field 'user_address_req' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public update_user_address_args(UserAddressReq user_address_req) {
            this();
            this.user_address_req = user_address_req;
        }

        @Override // java.lang.Comparable
        public int compareTo(update_user_address_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetUser_address_req()).compareTo(Boolean.valueOf(other.isSetUser_address_req()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetUser_address_req() || (compareTo = TBaseHelper.compareTo((Comparable) this.user_address_req, (Comparable) other.user_address_req)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<update_user_address_args, _Fields> deepCopy2() {
            return new update_user_address_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$update_user_address_args$_Fields[field.ordinal()] == 1) {
                return getUser_address_req();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$update_user_address_args$_Fields[field.ordinal()] == 1) {
                return isSetUser_address_req();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$update_user_address_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetUser_address_req();
            } else {
                setUser_address_req((UserAddressReq) value);
            }
        }

        public boolean equals(update_user_address_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetUser_address_req = isSetUser_address_req();
            boolean isSetUser_address_req2 = that.isSetUser_address_req();
            if (isSetUser_address_req || isSetUser_address_req2) {
                return isSetUser_address_req && isSetUser_address_req2 && this.user_address_req.equals(that.user_address_req);
            }
            return true;
        }

        public update_user_address_args(update_user_address_args other) {
            if (other.isSetUser_address_req()) {
                this.user_address_req = new UserAddressReq(other.user_address_req);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class update_user_address_result implements TBase<update_user_address_result, _Fields>, Serializable, Cloneable, Comparable<update_user_address_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public UserAddress success;
        private static final TStruct STRUCT_DESC = new TStruct("update_user_address_result");
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
        public static class update_user_address_resultStandardScheme extends StandardScheme<update_user_address_result> {
            private update_user_address_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, update_user_address_result struct) throws TException {
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
                        UserAddress userAddress = new UserAddress();
                        struct.success = userAddress;
                        userAddress.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, update_user_address_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(update_user_address_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(update_user_address_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(update_user_address_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(update_user_address_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class update_user_address_resultStandardSchemeFactory implements SchemeFactory {
            private update_user_address_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public update_user_address_resultStandardScheme getScheme() {
                return new update_user_address_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class update_user_address_resultTupleScheme extends TupleScheme<update_user_address_result> {
            private update_user_address_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, update_user_address_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    UserAddress userAddress = new UserAddress();
                    struct.success = userAddress;
                    userAddress.read(tTupleProtocol);
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
            public void write(TProtocol prot, update_user_address_result struct) throws TException {
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
        public static class update_user_address_resultTupleSchemeFactory implements SchemeFactory {
            private update_user_address_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public update_user_address_resultTupleScheme getScheme() {
                return new update_user_address_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new update_user_address_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new update_user_address_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, UserAddress.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(update_user_address_result.class, unmodifiableMap);
        }

        public update_user_address_result() {
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
            if (that != null && (that instanceof update_user_address_result)) {
                return equals((update_user_address_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public UserAddress getSuccess() {
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

        public update_user_address_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public update_user_address_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public update_user_address_result setSuccess(UserAddress success) {
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
            StringBuilder sb2 = new StringBuilder("update_user_address_result(");
            sb2.append("success:");
            UserAddress userAddress = this.success;
            if (userAddress == null) {
                sb2.append("null");
            } else {
                sb2.append(userAddress);
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
            UserAddress userAddress = this.success;
            if (userAddress != null) {
                userAddress.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public update_user_address_result(UserAddress success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(update_user_address_result other) {
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
        public TBase<update_user_address_result, _Fields> deepCopy2() {
            return new update_user_address_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$update_user_address_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$update_user_address_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$MallProxyService$update_user_address_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((UserAddress) value);
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

        public boolean equals(update_user_address_result that) {
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

        public update_user_address_result(update_user_address_result other) {
            if (other.isSetSuccess()) {
                this.success = new UserAddress(other.success);
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
