package com.baicizhan.online.course_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class CourseApiService {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.CourseApiService$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$delete_mark_word_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$delete_mark_word_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$feedback_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$feedback_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_improve_video_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_improve_video_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_mark_book_list_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_mark_book_list_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_vocab_live_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_vocab_live_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$livedone_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$livedone_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$polling_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$polling_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$submit_improve_chapter_done_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$submit_improve_chapter_done_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$submitugc_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseApiService$submitugc_result$_Fields;

        static {
            int[] iArr = new int[delete_mark_word_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$delete_mark_word_result$_Fields = iArr;
            try {
                iArr[delete_mark_word_result._Fields.BOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseApiService$delete_mark_word_result$_Fields[delete_mark_word_result._Fields.BOMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[delete_mark_word_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$delete_mark_word_args$_Fields = iArr2;
            try {
                iArr2[delete_mark_word_args._Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseApiService$delete_mark_word_args$_Fields[delete_mark_word_args._Fields.PAPER_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[get_mark_book_list_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_mark_book_list_result$_Fields = iArr3;
            try {
                iArr3[get_mark_book_list_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_mark_book_list_result$_Fields[get_mark_book_list_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_mark_book_list_result$_Fields[get_mark_book_list_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr4 = new int[get_mark_book_list_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_mark_book_list_args$_Fields = iArr4;
            try {
                iArr4[get_mark_book_list_args._Fields.PAPER_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr5 = new int[feedback_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$feedback_result$_Fields = iArr5;
            try {
                iArr5[feedback_result._Fields.BOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseApiService$feedback_result$_Fields[feedback_result._Fields.BOMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr6 = new int[feedback_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$feedback_args$_Fields = iArr6;
            try {
                iArr6[feedback_args._Fields.REQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr7 = new int[submitugc_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$submitugc_result$_Fields = iArr7;
            try {
                iArr7[submitugc_result._Fields.BOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseApiService$submitugc_result$_Fields[submitugc_result._Fields.BOMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr8 = new int[submitugc_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$submitugc_args$_Fields = iArr8;
            try {
                iArr8[submitugc_args._Fields.REQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr9 = new int[livedone_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$livedone_result$_Fields = iArr9;
            try {
                iArr9[livedone_result._Fields.BOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseApiService$livedone_result$_Fields[livedone_result._Fields.BOMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr10 = new int[livedone_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$livedone_args$_Fields = iArr10;
            try {
                iArr10[livedone_args._Fields.COURSE_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseApiService$livedone_args$_Fields[livedone_args._Fields.ARTICLE_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr11 = new int[polling_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$polling_info_result$_Fields = iArr11;
            try {
                iArr11[polling_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseApiService$polling_info_result$_Fields[polling_info_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseApiService$polling_info_result$_Fields[polling_info_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            int[] iArr12 = new int[polling_info_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$polling_info_args$_Fields = iArr12;
            try {
                iArr12[polling_info_args._Fields.COURSE_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseApiService$polling_info_args$_Fields[polling_info_args._Fields.ARTICLE_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            int[] iArr13 = new int[get_vocab_live_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_vocab_live_info_result$_Fields = iArr13;
            try {
                iArr13[get_vocab_live_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_vocab_live_info_result$_Fields[get_vocab_live_info_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_vocab_live_info_result$_Fields[get_vocab_live_info_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr14 = new int[get_vocab_live_info_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_vocab_live_info_args$_Fields = iArr14;
            try {
                iArr14[get_vocab_live_info_args._Fields.COURSE_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_vocab_live_info_args$_Fields[get_vocab_live_info_args._Fields.ARTICLE_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            int[] iArr15 = new int[submit_improve_chapter_done_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$submit_improve_chapter_done_result$_Fields = iArr15;
            try {
                iArr15[submit_improve_chapter_done_result._Fields.BOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseApiService$submit_improve_chapter_done_result$_Fields[submit_improve_chapter_done_result._Fields.BOMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            int[] iArr16 = new int[submit_improve_chapter_done_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$submit_improve_chapter_done_args$_Fields = iArr16;
            try {
                iArr16[submit_improve_chapter_done_args._Fields.CHAPTER_DONE_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            int[] iArr17 = new int[get_improve_video_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_improve_video_info_result$_Fields = iArr17;
            try {
                iArr17[get_improve_video_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_improve_video_info_result$_Fields[get_improve_video_info_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_improve_video_info_result$_Fields[get_improve_video_info_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr18 = new int[get_improve_video_info_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_improve_video_info_args$_Fields = iArr18;
            try {
                iArr18[get_improve_video_info_args._Fields.CHAPTER_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
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
        public static class delete_mark_word_call extends TAsyncMethodCall {
            private int paper_id;
            private int topic_id;

            public delete_mark_word_call(int topic_id, int paper_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.topic_id = topic_id;
                this.paper_id = paper_id;
            }

            public void getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_delete_mark_word();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("delete_mark_word", (byte) 1, 0));
                delete_mark_word_args delete_mark_word_argsVar = new delete_mark_word_args();
                delete_mark_word_argsVar.setTopic_id(this.topic_id);
                delete_mark_word_argsVar.setPaper_id(this.paper_id);
                delete_mark_word_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class feedback_call extends TAsyncMethodCall {
            private FeedBackReq req;

            public feedback_call(FeedBackReq req, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.req = req;
            }

            public void getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_feedback();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("feedback", (byte) 1, 0));
                feedback_args feedback_argsVar = new feedback_args();
                feedback_argsVar.setReq(this.req);
                feedback_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_improve_video_info_call extends TAsyncMethodCall {
            private long chapter_id;

            public get_improve_video_info_call(long chapter_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.chapter_id = chapter_id;
            }

            public ImproveVideoInfo getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_improve_video_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_improve_video_info", (byte) 1, 0));
                get_improve_video_info_args get_improve_video_info_argsVar = new get_improve_video_info_args();
                get_improve_video_info_argsVar.setChapter_id(this.chapter_id);
                get_improve_video_info_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_mark_book_list_call extends TAsyncMethodCall {
            private int paper_id;

            public get_mark_book_list_call(int paper_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.paper_id = paper_id;
            }

            public List<MarkTopicInfo> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_mark_book_list();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_mark_book_list", (byte) 1, 0));
                get_mark_book_list_args get_mark_book_list_argsVar = new get_mark_book_list_args();
                get_mark_book_list_argsVar.setPaper_id(this.paper_id);
                get_mark_book_list_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_vocab_live_info_call extends TAsyncMethodCall {
            private int article_id;
            private int course_id;

            public get_vocab_live_info_call(int course_id, int article_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.course_id = course_id;
                this.article_id = article_id;
            }

            public VocabLiveInfo getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_vocab_live_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_vocab_live_info", (byte) 1, 0));
                get_vocab_live_info_args get_vocab_live_info_argsVar = new get_vocab_live_info_args();
                get_vocab_live_info_argsVar.setCourse_id(this.course_id);
                get_vocab_live_info_argsVar.setArticle_id(this.article_id);
                get_vocab_live_info_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class livedone_call extends TAsyncMethodCall {
            private int article_id;
            private int course_id;

            public livedone_call(int course_id, int article_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.course_id = course_id;
                this.article_id = article_id;
            }

            public void getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_livedone();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("livedone", (byte) 1, 0));
                livedone_args livedone_argsVar = new livedone_args();
                livedone_argsVar.setCourse_id(this.course_id);
                livedone_argsVar.setArticle_id(this.article_id);
                livedone_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class polling_info_call extends TAsyncMethodCall {
            private int article_id;
            private int course_id;

            public polling_info_call(int course_id, int article_id, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.course_id = course_id;
                this.article_id = article_id;
            }

            public Message getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_polling_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("polling_info", (byte) 1, 0));
                polling_info_args polling_info_argsVar = new polling_info_args();
                polling_info_argsVar.setCourse_id(this.course_id);
                polling_info_argsVar.setArticle_id(this.article_id);
                polling_info_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_improve_chapter_done_call extends TAsyncMethodCall {
            private ImproveChapterDoneReq chapter_done_info;

            public submit_improve_chapter_done_call(ImproveChapterDoneReq chapter_done_info, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.chapter_done_info = chapter_done_info;
            }

            public void getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_submit_improve_chapter_done();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("submit_improve_chapter_done", (byte) 1, 0));
                submit_improve_chapter_done_args submit_improve_chapter_done_argsVar = new submit_improve_chapter_done_args();
                submit_improve_chapter_done_argsVar.setChapter_done_info(this.chapter_done_info);
                submit_improve_chapter_done_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submitugc_call extends TAsyncMethodCall {
            private CommentReq req;

            public submitugc_call(CommentReq req, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.req = req;
            }

            public void getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_submitugc();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("submitugc", (byte) 1, 0));
                submitugc_args submitugc_argsVar = new submitugc_args();
                submitugc_argsVar.setReq(this.req);
                submitugc_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        public AsyncClient(TProtocolFactory protocolFactory, TAsyncClientManager clientManager, TNonblockingTransport transport) {
            super(protocolFactory, clientManager, transport);
        }

        @Override // com.baicizhan.online.course_api.CourseApiService.AsyncIface
        public void delete_mark_word(int topic_id, int paper_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            delete_mark_word_call delete_mark_word_callVar = new delete_mark_word_call(topic_id, paper_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = delete_mark_word_callVar;
            this.___manager.call(delete_mark_word_callVar);
        }

        @Override // com.baicizhan.online.course_api.CourseApiService.AsyncIface
        public void feedback(FeedBackReq req, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            feedback_call feedback_callVar = new feedback_call(req, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = feedback_callVar;
            this.___manager.call(feedback_callVar);
        }

        @Override // com.baicizhan.online.course_api.CourseApiService.AsyncIface
        public void get_improve_video_info(long chapter_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_improve_video_info_call get_improve_video_info_callVar = new get_improve_video_info_call(chapter_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_improve_video_info_callVar;
            this.___manager.call(get_improve_video_info_callVar);
        }

        @Override // com.baicizhan.online.course_api.CourseApiService.AsyncIface
        public void get_mark_book_list(int paper_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_mark_book_list_call get_mark_book_list_callVar = new get_mark_book_list_call(paper_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_mark_book_list_callVar;
            this.___manager.call(get_mark_book_list_callVar);
        }

        @Override // com.baicizhan.online.course_api.CourseApiService.AsyncIface
        public void get_vocab_live_info(int course_id, int article_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_vocab_live_info_call get_vocab_live_info_callVar = new get_vocab_live_info_call(course_id, article_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_vocab_live_info_callVar;
            this.___manager.call(get_vocab_live_info_callVar);
        }

        @Override // com.baicizhan.online.course_api.CourseApiService.AsyncIface
        public void livedone(int course_id, int article_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            livedone_call livedone_callVar = new livedone_call(course_id, article_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = livedone_callVar;
            this.___manager.call(livedone_callVar);
        }

        @Override // com.baicizhan.online.course_api.CourseApiService.AsyncIface
        public void polling_info(int course_id, int article_id, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            polling_info_call polling_info_callVar = new polling_info_call(course_id, article_id, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = polling_info_callVar;
            this.___manager.call(polling_info_callVar);
        }

        @Override // com.baicizhan.online.course_api.CourseApiService.AsyncIface
        public void submit_improve_chapter_done(ImproveChapterDoneReq chapter_done_info, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            submit_improve_chapter_done_call submit_improve_chapter_done_callVar = new submit_improve_chapter_done_call(chapter_done_info, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = submit_improve_chapter_done_callVar;
            this.___manager.call(submit_improve_chapter_done_callVar);
        }

        @Override // com.baicizhan.online.course_api.CourseApiService.AsyncIface
        public void submitugc(CommentReq req, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            submitugc_call submitugc_callVar = new submitugc_call(req, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = submitugc_callVar;
            this.___manager.call(submitugc_callVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AsyncIface {
        void delete_mark_word(int topic_id, int paper_id, AsyncMethodCallback resultHandler) throws TException;

        void feedback(FeedBackReq req, AsyncMethodCallback resultHandler) throws TException;

        void get_improve_video_info(long chapter_id, AsyncMethodCallback resultHandler) throws TException;

        void get_mark_book_list(int paper_id, AsyncMethodCallback resultHandler) throws TException;

        void get_vocab_live_info(int course_id, int article_id, AsyncMethodCallback resultHandler) throws TException;

        void livedone(int course_id, int article_id, AsyncMethodCallback resultHandler) throws TException;

        void polling_info(int course_id, int article_id, AsyncMethodCallback resultHandler) throws TException;

        void submit_improve_chapter_done(ImproveChapterDoneReq chapter_done_info, AsyncMethodCallback resultHandler) throws TException;

        void submitugc(CommentReq req, AsyncMethodCallback resultHandler) throws TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AsyncProcessor<I extends AsyncIface> extends TBaseAsyncProcessor<I> {
        private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_mark_word<I extends AsyncIface> extends AsyncProcessFunction<I, delete_mark_word_args, Void> {
            public delete_mark_word() {
                super("delete_mark_word");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.course_api.CourseApiService.AsyncProcessor.delete_mark_word.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        delete_mark_word_result delete_mark_word_resultVar;
                        delete_mark_word_result delete_mark_word_resultVar2 = new delete_mark_word_result();
                        try {
                            if (exc instanceof SystemException) {
                                delete_mark_word_resultVar2.boom = (SystemException) exc;
                                delete_mark_word_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    delete_mark_word_resultVar = r02;
                                    this.sendResponse(fb2, delete_mark_word_resultVar, b11, seqid);
                                    return;
                                }
                                delete_mark_word_resultVar2.bomb = (LogicException) exc;
                                delete_mark_word_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, delete_mark_word_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        delete_mark_word_resultVar = delete_mark_word_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new delete_mark_word_result(), (byte) 2, seqid);
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
            public delete_mark_word_args getEmptyArgsInstance() {
                return new delete_mark_word_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, delete_mark_word_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.delete_mark_word(args.topic_id, args.paper_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class feedback<I extends AsyncIface> extends AsyncProcessFunction<I, feedback_args, Void> {
            public feedback() {
                super("feedback");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.course_api.CourseApiService.AsyncProcessor.feedback.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        feedback_result feedback_resultVar;
                        feedback_result feedback_resultVar2 = new feedback_result();
                        try {
                            if (exc instanceof SystemException) {
                                feedback_resultVar2.boom = (SystemException) exc;
                                feedback_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    feedback_resultVar = r02;
                                    this.sendResponse(fb2, feedback_resultVar, b11, seqid);
                                    return;
                                }
                                feedback_resultVar2.bomb = (LogicException) exc;
                                feedback_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, feedback_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        feedback_resultVar = feedback_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new feedback_result(), (byte) 2, seqid);
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
            public feedback_args getEmptyArgsInstance() {
                return new feedback_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, feedback_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.feedback(args.req, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_improve_video_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_improve_video_info_args, ImproveVideoInfo> {
            public get_improve_video_info() {
                super("get_improve_video_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<ImproveVideoInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<ImproveVideoInfo>() { // from class: com.baicizhan.online.course_api.CourseApiService.AsyncProcessor.get_improve_video_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_improve_video_info_result get_improve_video_info_resultVar;
                        get_improve_video_info_result get_improve_video_info_resultVar2 = new get_improve_video_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_improve_video_info_resultVar2.boom = (SystemException) exc;
                                get_improve_video_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_improve_video_info_resultVar = r02;
                                    this.sendResponse(fb2, get_improve_video_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_improve_video_info_resultVar2.bomb = (LogicException) exc;
                                get_improve_video_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_improve_video_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_improve_video_info_resultVar = get_improve_video_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(ImproveVideoInfo o11) {
                        get_improve_video_info_result get_improve_video_info_resultVar = new get_improve_video_info_result();
                        get_improve_video_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_improve_video_info_resultVar, (byte) 2, seqid);
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
            public get_improve_video_info_args getEmptyArgsInstance() {
                return new get_improve_video_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_improve_video_info_args args, AsyncMethodCallback<ImproveVideoInfo> resultHandler) throws TException {
                iface.get_improve_video_info(args.chapter_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_mark_book_list<I extends AsyncIface> extends AsyncProcessFunction<I, get_mark_book_list_args, List<MarkTopicInfo>> {
            public get_mark_book_list() {
                super("get_mark_book_list");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<MarkTopicInfo>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<MarkTopicInfo>>() { // from class: com.baicizhan.online.course_api.CourseApiService.AsyncProcessor.get_mark_book_list.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_mark_book_list_result get_mark_book_list_resultVar;
                        get_mark_book_list_result get_mark_book_list_resultVar2 = new get_mark_book_list_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_mark_book_list_resultVar2.boom = (SystemException) exc;
                                get_mark_book_list_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_mark_book_list_resultVar = r02;
                                    this.sendResponse(fb2, get_mark_book_list_resultVar, b11, seqid);
                                    return;
                                }
                                get_mark_book_list_resultVar2.bomb = (LogicException) exc;
                                get_mark_book_list_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_mark_book_list_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_mark_book_list_resultVar = get_mark_book_list_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<MarkTopicInfo> o11) {
                        get_mark_book_list_result get_mark_book_list_resultVar = new get_mark_book_list_result();
                        get_mark_book_list_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_mark_book_list_resultVar, (byte) 2, seqid);
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
            public get_mark_book_list_args getEmptyArgsInstance() {
                return new get_mark_book_list_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_mark_book_list_args args, AsyncMethodCallback<List<MarkTopicInfo>> resultHandler) throws TException {
                iface.get_mark_book_list(args.paper_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_vocab_live_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_vocab_live_info_args, VocabLiveInfo> {
            public get_vocab_live_info() {
                super("get_vocab_live_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<VocabLiveInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<VocabLiveInfo>() { // from class: com.baicizhan.online.course_api.CourseApiService.AsyncProcessor.get_vocab_live_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_vocab_live_info_result get_vocab_live_info_resultVar;
                        get_vocab_live_info_result get_vocab_live_info_resultVar2 = new get_vocab_live_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_vocab_live_info_resultVar2.boom = (SystemException) exc;
                                get_vocab_live_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_vocab_live_info_resultVar = r02;
                                    this.sendResponse(fb2, get_vocab_live_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_vocab_live_info_resultVar2.bomb = (LogicException) exc;
                                get_vocab_live_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_vocab_live_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_vocab_live_info_resultVar = get_vocab_live_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(VocabLiveInfo o11) {
                        get_vocab_live_info_result get_vocab_live_info_resultVar = new get_vocab_live_info_result();
                        get_vocab_live_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_vocab_live_info_resultVar, (byte) 2, seqid);
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
            public get_vocab_live_info_args getEmptyArgsInstance() {
                return new get_vocab_live_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_vocab_live_info_args args, AsyncMethodCallback<VocabLiveInfo> resultHandler) throws TException {
                iface.get_vocab_live_info(args.course_id, args.article_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class livedone<I extends AsyncIface> extends AsyncProcessFunction<I, livedone_args, Void> {
            public livedone() {
                super("livedone");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.course_api.CourseApiService.AsyncProcessor.livedone.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        livedone_result livedone_resultVar;
                        livedone_result livedone_resultVar2 = new livedone_result();
                        try {
                            if (exc instanceof SystemException) {
                                livedone_resultVar2.boom = (SystemException) exc;
                                livedone_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    livedone_resultVar = r02;
                                    this.sendResponse(fb2, livedone_resultVar, b11, seqid);
                                    return;
                                }
                                livedone_resultVar2.bomb = (LogicException) exc;
                                livedone_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, livedone_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        livedone_resultVar = livedone_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new livedone_result(), (byte) 2, seqid);
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
            public livedone_args getEmptyArgsInstance() {
                return new livedone_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, livedone_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.livedone(args.course_id, args.article_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class polling_info<I extends AsyncIface> extends AsyncProcessFunction<I, polling_info_args, Message> {
            public polling_info() {
                super("polling_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Message> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Message>() { // from class: com.baicizhan.online.course_api.CourseApiService.AsyncProcessor.polling_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        polling_info_result polling_info_resultVar;
                        polling_info_result polling_info_resultVar2 = new polling_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                polling_info_resultVar2.boom = (SystemException) exc;
                                polling_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    polling_info_resultVar = r02;
                                    this.sendResponse(fb2, polling_info_resultVar, b11, seqid);
                                    return;
                                }
                                polling_info_resultVar2.bomb = (LogicException) exc;
                                polling_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, polling_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        polling_info_resultVar = polling_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Message o11) {
                        polling_info_result polling_info_resultVar = new polling_info_result();
                        polling_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, polling_info_resultVar, (byte) 2, seqid);
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
            public polling_info_args getEmptyArgsInstance() {
                return new polling_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, polling_info_args args, AsyncMethodCallback<Message> resultHandler) throws TException {
                iface.polling_info(args.course_id, args.article_id, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_improve_chapter_done<I extends AsyncIface> extends AsyncProcessFunction<I, submit_improve_chapter_done_args, Void> {
            public submit_improve_chapter_done() {
                super("submit_improve_chapter_done");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.course_api.CourseApiService.AsyncProcessor.submit_improve_chapter_done.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        submit_improve_chapter_done_result submit_improve_chapter_done_resultVar;
                        submit_improve_chapter_done_result submit_improve_chapter_done_resultVar2 = new submit_improve_chapter_done_result();
                        try {
                            if (exc instanceof SystemException) {
                                submit_improve_chapter_done_resultVar2.boom = (SystemException) exc;
                                submit_improve_chapter_done_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    submit_improve_chapter_done_resultVar = r02;
                                    this.sendResponse(fb2, submit_improve_chapter_done_resultVar, b11, seqid);
                                    return;
                                }
                                submit_improve_chapter_done_resultVar2.bomb = (LogicException) exc;
                                submit_improve_chapter_done_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, submit_improve_chapter_done_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        submit_improve_chapter_done_resultVar = submit_improve_chapter_done_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new submit_improve_chapter_done_result(), (byte) 2, seqid);
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
            public submit_improve_chapter_done_args getEmptyArgsInstance() {
                return new submit_improve_chapter_done_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, submit_improve_chapter_done_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.submit_improve_chapter_done(args.chapter_done_info, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submitugc<I extends AsyncIface> extends AsyncProcessFunction<I, submitugc_args, Void> {
            public submitugc() {
                super("submitugc");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.course_api.CourseApiService.AsyncProcessor.submitugc.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        submitugc_result submitugc_resultVar;
                        submitugc_result submitugc_resultVar2 = new submitugc_result();
                        try {
                            if (exc instanceof SystemException) {
                                submitugc_resultVar2.boom = (SystemException) exc;
                                submitugc_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    submitugc_resultVar = r02;
                                    this.sendResponse(fb2, submitugc_resultVar, b11, seqid);
                                    return;
                                }
                                submitugc_resultVar2.bomb = (LogicException) exc;
                                submitugc_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, submitugc_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        submitugc_resultVar = submitugc_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new submitugc_result(), (byte) 2, seqid);
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
            public submitugc_args getEmptyArgsInstance() {
                return new submitugc_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, submitugc_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.submitugc(args.req, resultHandler);
            }
        }

        public AsyncProcessor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends AsyncIface> Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> getProcessMap(Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> processMap) {
            processMap.put("get_improve_video_info", new get_improve_video_info());
            processMap.put("submit_improve_chapter_done", new submit_improve_chapter_done());
            processMap.put("get_vocab_live_info", new get_vocab_live_info());
            processMap.put("polling_info", new polling_info());
            processMap.put("livedone", new livedone());
            processMap.put("submitugc", new submitugc());
            processMap.put("feedback", new feedback());
            processMap.put("get_mark_book_list", new get_mark_book_list());
            processMap.put("delete_mark_word", new delete_mark_word());
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

        @Override // com.baicizhan.online.course_api.CourseApiService.Iface
        public void delete_mark_word(int topic_id, int paper_id) throws SystemException, LogicException, TException {
            send_delete_mark_word(topic_id, paper_id);
            recv_delete_mark_word();
        }

        @Override // com.baicizhan.online.course_api.CourseApiService.Iface
        public void feedback(FeedBackReq req) throws SystemException, LogicException, TException {
            send_feedback(req);
            recv_feedback();
        }

        @Override // com.baicizhan.online.course_api.CourseApiService.Iface
        public ImproveVideoInfo get_improve_video_info(long chapter_id) throws SystemException, LogicException, TException {
            send_get_improve_video_info(chapter_id);
            return recv_get_improve_video_info();
        }

        @Override // com.baicizhan.online.course_api.CourseApiService.Iface
        public List<MarkTopicInfo> get_mark_book_list(int paper_id) throws SystemException, LogicException, TException {
            send_get_mark_book_list(paper_id);
            return recv_get_mark_book_list();
        }

        @Override // com.baicizhan.online.course_api.CourseApiService.Iface
        public VocabLiveInfo get_vocab_live_info(int course_id, int article_id) throws SystemException, LogicException, TException {
            send_get_vocab_live_info(course_id, article_id);
            return recv_get_vocab_live_info();
        }

        @Override // com.baicizhan.online.course_api.CourseApiService.Iface
        public void livedone(int course_id, int article_id) throws SystemException, LogicException, TException {
            send_livedone(course_id, article_id);
            recv_livedone();
        }

        @Override // com.baicizhan.online.course_api.CourseApiService.Iface
        public Message polling_info(int course_id, int article_id) throws SystemException, LogicException, TException {
            send_polling_info(course_id, article_id);
            return recv_polling_info();
        }

        public void recv_delete_mark_word() throws SystemException, LogicException, TException {
            delete_mark_word_result delete_mark_word_resultVar = new delete_mark_word_result();
            receiveBase(delete_mark_word_resultVar, "delete_mark_word");
            SystemException systemException = delete_mark_word_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = delete_mark_word_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
        }

        public void recv_feedback() throws SystemException, LogicException, TException {
            feedback_result feedback_resultVar = new feedback_result();
            receiveBase(feedback_resultVar, "feedback");
            SystemException systemException = feedback_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = feedback_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
        }

        public ImproveVideoInfo recv_get_improve_video_info() throws SystemException, LogicException, TException {
            get_improve_video_info_result get_improve_video_info_resultVar = new get_improve_video_info_result();
            receiveBase(get_improve_video_info_resultVar, "get_improve_video_info");
            if (get_improve_video_info_resultVar.isSetSuccess()) {
                return get_improve_video_info_resultVar.success;
            }
            SystemException systemException = get_improve_video_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_improve_video_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_improve_video_info failed: unknown result");
        }

        public List<MarkTopicInfo> recv_get_mark_book_list() throws SystemException, LogicException, TException {
            get_mark_book_list_result get_mark_book_list_resultVar = new get_mark_book_list_result();
            receiveBase(get_mark_book_list_resultVar, "get_mark_book_list");
            if (get_mark_book_list_resultVar.isSetSuccess()) {
                return get_mark_book_list_resultVar.success;
            }
            SystemException systemException = get_mark_book_list_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_mark_book_list_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_mark_book_list failed: unknown result");
        }

        public VocabLiveInfo recv_get_vocab_live_info() throws SystemException, LogicException, TException {
            get_vocab_live_info_result get_vocab_live_info_resultVar = new get_vocab_live_info_result();
            receiveBase(get_vocab_live_info_resultVar, "get_vocab_live_info");
            if (get_vocab_live_info_resultVar.isSetSuccess()) {
                return get_vocab_live_info_resultVar.success;
            }
            SystemException systemException = get_vocab_live_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_vocab_live_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_vocab_live_info failed: unknown result");
        }

        public void recv_livedone() throws SystemException, LogicException, TException {
            livedone_result livedone_resultVar = new livedone_result();
            receiveBase(livedone_resultVar, "livedone");
            SystemException systemException = livedone_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = livedone_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
        }

        public Message recv_polling_info() throws SystemException, LogicException, TException {
            polling_info_result polling_info_resultVar = new polling_info_result();
            receiveBase(polling_info_resultVar, "polling_info");
            if (polling_info_resultVar.isSetSuccess()) {
                return polling_info_resultVar.success;
            }
            SystemException systemException = polling_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = polling_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "polling_info failed: unknown result");
        }

        public void recv_submit_improve_chapter_done() throws SystemException, LogicException, TException {
            submit_improve_chapter_done_result submit_improve_chapter_done_resultVar = new submit_improve_chapter_done_result();
            receiveBase(submit_improve_chapter_done_resultVar, "submit_improve_chapter_done");
            SystemException systemException = submit_improve_chapter_done_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = submit_improve_chapter_done_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
        }

        public void recv_submitugc() throws SystemException, LogicException, TException {
            submitugc_result submitugc_resultVar = new submitugc_result();
            receiveBase(submitugc_resultVar, "submitugc");
            SystemException systemException = submitugc_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = submitugc_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
        }

        public void send_delete_mark_word(int topic_id, int paper_id) throws TException {
            delete_mark_word_args delete_mark_word_argsVar = new delete_mark_word_args();
            delete_mark_word_argsVar.setTopic_id(topic_id);
            delete_mark_word_argsVar.setPaper_id(paper_id);
            sendBase("delete_mark_word", delete_mark_word_argsVar);
        }

        public void send_feedback(FeedBackReq req) throws TException {
            feedback_args feedback_argsVar = new feedback_args();
            feedback_argsVar.setReq(req);
            sendBase("feedback", feedback_argsVar);
        }

        public void send_get_improve_video_info(long chapter_id) throws TException {
            get_improve_video_info_args get_improve_video_info_argsVar = new get_improve_video_info_args();
            get_improve_video_info_argsVar.setChapter_id(chapter_id);
            sendBase("get_improve_video_info", get_improve_video_info_argsVar);
        }

        public void send_get_mark_book_list(int paper_id) throws TException {
            get_mark_book_list_args get_mark_book_list_argsVar = new get_mark_book_list_args();
            get_mark_book_list_argsVar.setPaper_id(paper_id);
            sendBase("get_mark_book_list", get_mark_book_list_argsVar);
        }

        public void send_get_vocab_live_info(int course_id, int article_id) throws TException {
            get_vocab_live_info_args get_vocab_live_info_argsVar = new get_vocab_live_info_args();
            get_vocab_live_info_argsVar.setCourse_id(course_id);
            get_vocab_live_info_argsVar.setArticle_id(article_id);
            sendBase("get_vocab_live_info", get_vocab_live_info_argsVar);
        }

        public void send_livedone(int course_id, int article_id) throws TException {
            livedone_args livedone_argsVar = new livedone_args();
            livedone_argsVar.setCourse_id(course_id);
            livedone_argsVar.setArticle_id(article_id);
            sendBase("livedone", livedone_argsVar);
        }

        public void send_polling_info(int course_id, int article_id) throws TException {
            polling_info_args polling_info_argsVar = new polling_info_args();
            polling_info_argsVar.setCourse_id(course_id);
            polling_info_argsVar.setArticle_id(article_id);
            sendBase("polling_info", polling_info_argsVar);
        }

        public void send_submit_improve_chapter_done(ImproveChapterDoneReq chapter_done_info) throws TException {
            submit_improve_chapter_done_args submit_improve_chapter_done_argsVar = new submit_improve_chapter_done_args();
            submit_improve_chapter_done_argsVar.setChapter_done_info(chapter_done_info);
            sendBase("submit_improve_chapter_done", submit_improve_chapter_done_argsVar);
        }

        public void send_submitugc(CommentReq req) throws TException {
            submitugc_args submitugc_argsVar = new submitugc_args();
            submitugc_argsVar.setReq(req);
            sendBase("submitugc", submitugc_argsVar);
        }

        @Override // com.baicizhan.online.course_api.CourseApiService.Iface
        public void submit_improve_chapter_done(ImproveChapterDoneReq chapter_done_info) throws SystemException, LogicException, TException {
            send_submit_improve_chapter_done(chapter_done_info);
            recv_submit_improve_chapter_done();
        }

        @Override // com.baicizhan.online.course_api.CourseApiService.Iface
        public void submitugc(CommentReq req) throws SystemException, LogicException, TException {
            send_submitugc(req);
            recv_submitugc();
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
        void delete_mark_word(int topic_id, int paper_id) throws SystemException, LogicException, TException;

        void feedback(FeedBackReq req) throws SystemException, LogicException, TException;

        ImproveVideoInfo get_improve_video_info(long chapter_id) throws SystemException, LogicException, TException;

        List<MarkTopicInfo> get_mark_book_list(int paper_id) throws SystemException, LogicException, TException;

        VocabLiveInfo get_vocab_live_info(int course_id, int article_id) throws SystemException, LogicException, TException;

        void livedone(int course_id, int article_id) throws SystemException, LogicException, TException;

        Message polling_info(int course_id, int article_id) throws SystemException, LogicException, TException;

        void submit_improve_chapter_done(ImproveChapterDoneReq chapter_done_info) throws SystemException, LogicException, TException;

        void submitugc(CommentReq req) throws SystemException, LogicException, TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Processor<I extends Iface> extends TBaseProcessor<I> implements TProcessor {
        private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_mark_word<I extends Iface> extends ProcessFunction<I, delete_mark_word_args> {
            public delete_mark_word() {
                super("delete_mark_word");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public delete_mark_word_args getEmptyArgsInstance() {
                return new delete_mark_word_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public delete_mark_word_result getResult(I iface, delete_mark_word_args args) throws TException {
                delete_mark_word_result delete_mark_word_resultVar = new delete_mark_word_result();
                try {
                    iface.delete_mark_word(args.topic_id, args.paper_id);
                    return delete_mark_word_resultVar;
                } catch (LogicException e11) {
                    delete_mark_word_resultVar.bomb = e11;
                    return delete_mark_word_resultVar;
                } catch (SystemException e12) {
                    delete_mark_word_resultVar.boom = e12;
                    return delete_mark_word_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class feedback<I extends Iface> extends ProcessFunction<I, feedback_args> {
            public feedback() {
                super("feedback");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public feedback_args getEmptyArgsInstance() {
                return new feedback_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public feedback_result getResult(I iface, feedback_args args) throws TException {
                feedback_result feedback_resultVar = new feedback_result();
                try {
                    iface.feedback(args.req);
                    return feedback_resultVar;
                } catch (LogicException e11) {
                    feedback_resultVar.bomb = e11;
                    return feedback_resultVar;
                } catch (SystemException e12) {
                    feedback_resultVar.boom = e12;
                    return feedback_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_improve_video_info<I extends Iface> extends ProcessFunction<I, get_improve_video_info_args> {
            public get_improve_video_info() {
                super("get_improve_video_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_improve_video_info_args getEmptyArgsInstance() {
                return new get_improve_video_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_improve_video_info_result getResult(I iface, get_improve_video_info_args args) throws TException {
                get_improve_video_info_result get_improve_video_info_resultVar = new get_improve_video_info_result();
                try {
                    get_improve_video_info_resultVar.success = iface.get_improve_video_info(args.chapter_id);
                    return get_improve_video_info_resultVar;
                } catch (LogicException e11) {
                    get_improve_video_info_resultVar.bomb = e11;
                    return get_improve_video_info_resultVar;
                } catch (SystemException e12) {
                    get_improve_video_info_resultVar.boom = e12;
                    return get_improve_video_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_mark_book_list<I extends Iface> extends ProcessFunction<I, get_mark_book_list_args> {
            public get_mark_book_list() {
                super("get_mark_book_list");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_mark_book_list_args getEmptyArgsInstance() {
                return new get_mark_book_list_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_mark_book_list_result getResult(I iface, get_mark_book_list_args args) throws TException {
                get_mark_book_list_result get_mark_book_list_resultVar = new get_mark_book_list_result();
                try {
                    get_mark_book_list_resultVar.success = iface.get_mark_book_list(args.paper_id);
                    return get_mark_book_list_resultVar;
                } catch (LogicException e11) {
                    get_mark_book_list_resultVar.bomb = e11;
                    return get_mark_book_list_resultVar;
                } catch (SystemException e12) {
                    get_mark_book_list_resultVar.boom = e12;
                    return get_mark_book_list_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_vocab_live_info<I extends Iface> extends ProcessFunction<I, get_vocab_live_info_args> {
            public get_vocab_live_info() {
                super("get_vocab_live_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_vocab_live_info_args getEmptyArgsInstance() {
                return new get_vocab_live_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_vocab_live_info_result getResult(I iface, get_vocab_live_info_args args) throws TException {
                get_vocab_live_info_result get_vocab_live_info_resultVar = new get_vocab_live_info_result();
                try {
                    get_vocab_live_info_resultVar.success = iface.get_vocab_live_info(args.course_id, args.article_id);
                    return get_vocab_live_info_resultVar;
                } catch (LogicException e11) {
                    get_vocab_live_info_resultVar.bomb = e11;
                    return get_vocab_live_info_resultVar;
                } catch (SystemException e12) {
                    get_vocab_live_info_resultVar.boom = e12;
                    return get_vocab_live_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class livedone<I extends Iface> extends ProcessFunction<I, livedone_args> {
            public livedone() {
                super("livedone");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public livedone_args getEmptyArgsInstance() {
                return new livedone_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public livedone_result getResult(I iface, livedone_args args) throws TException {
                livedone_result livedone_resultVar = new livedone_result();
                try {
                    iface.livedone(args.course_id, args.article_id);
                    return livedone_resultVar;
                } catch (LogicException e11) {
                    livedone_resultVar.bomb = e11;
                    return livedone_resultVar;
                } catch (SystemException e12) {
                    livedone_resultVar.boom = e12;
                    return livedone_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class polling_info<I extends Iface> extends ProcessFunction<I, polling_info_args> {
            public polling_info() {
                super("polling_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public polling_info_args getEmptyArgsInstance() {
                return new polling_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public polling_info_result getResult(I iface, polling_info_args args) throws TException {
                polling_info_result polling_info_resultVar = new polling_info_result();
                try {
                    polling_info_resultVar.success = iface.polling_info(args.course_id, args.article_id);
                    return polling_info_resultVar;
                } catch (LogicException e11) {
                    polling_info_resultVar.bomb = e11;
                    return polling_info_resultVar;
                } catch (SystemException e12) {
                    polling_info_resultVar.boom = e12;
                    return polling_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_improve_chapter_done<I extends Iface> extends ProcessFunction<I, submit_improve_chapter_done_args> {
            public submit_improve_chapter_done() {
                super("submit_improve_chapter_done");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public submit_improve_chapter_done_args getEmptyArgsInstance() {
                return new submit_improve_chapter_done_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public submit_improve_chapter_done_result getResult(I iface, submit_improve_chapter_done_args args) throws TException {
                submit_improve_chapter_done_result submit_improve_chapter_done_resultVar = new submit_improve_chapter_done_result();
                try {
                    iface.submit_improve_chapter_done(args.chapter_done_info);
                    return submit_improve_chapter_done_resultVar;
                } catch (LogicException e11) {
                    submit_improve_chapter_done_resultVar.bomb = e11;
                    return submit_improve_chapter_done_resultVar;
                } catch (SystemException e12) {
                    submit_improve_chapter_done_resultVar.boom = e12;
                    return submit_improve_chapter_done_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submitugc<I extends Iface> extends ProcessFunction<I, submitugc_args> {
            public submitugc() {
                super("submitugc");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public submitugc_args getEmptyArgsInstance() {
                return new submitugc_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public submitugc_result getResult(I iface, submitugc_args args) throws TException {
                submitugc_result submitugc_resultVar = new submitugc_result();
                try {
                    iface.submitugc(args.req);
                    return submitugc_resultVar;
                } catch (LogicException e11) {
                    submitugc_resultVar.bomb = e11;
                    return submitugc_resultVar;
                } catch (SystemException e12) {
                    submitugc_resultVar.boom = e12;
                    return submitugc_resultVar;
                }
            }
        }

        public Processor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends Iface> Map<String, ProcessFunction<I, ? extends TBase>> getProcessMap(Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            processMap.put("get_improve_video_info", new get_improve_video_info());
            processMap.put("submit_improve_chapter_done", new submit_improve_chapter_done());
            processMap.put("get_vocab_live_info", new get_vocab_live_info());
            processMap.put("polling_info", new polling_info());
            processMap.put("livedone", new livedone());
            processMap.put("submitugc", new submitugc());
            processMap.put("feedback", new feedback());
            processMap.put("get_mark_book_list", new get_mark_book_list());
            processMap.put("delete_mark_word", new delete_mark_word());
            return processMap;
        }

        public Processor(I iface, Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            super(iface, getProcessMap(processMap));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class delete_mark_word_args implements TBase<delete_mark_word_args, _Fields>, Serializable, Cloneable, Comparable<delete_mark_word_args> {
        private static final int __PAPER_ID_ISSET_ID = 1;
        private static final int __TOPIC_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int paper_id;
        public int topic_id;
        private static final TStruct STRUCT_DESC = new TStruct("delete_mark_word_args");
        private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
        private static final TField PAPER_ID_FIELD_DESC = new TField("paper_id", (byte) 8, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            TOPIC_ID(1, "topic_id"),
            PAPER_ID(2, "paper_id");

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
                    return TOPIC_ID;
                }
                if (fieldId != 2) {
                    return null;
                }
                return PAPER_ID;
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
        public static class delete_mark_word_argsStandardScheme extends StandardScheme<delete_mark_word_args> {
            private delete_mark_word_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, delete_mark_word_args struct) throws TException {
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
                        } else if (b11 == 8) {
                            struct.paper_id = iprot.readI32();
                            struct.setPaper_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.topic_id = iprot.readI32();
                        struct.setTopic_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (!struct.isSetTopic_id()) {
                    throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
                }
                if (struct.isSetPaper_id()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'paper_id' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, delete_mark_word_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(delete_mark_word_args.STRUCT_DESC);
                oprot.writeFieldBegin(delete_mark_word_args.TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.topic_id);
                oprot.writeFieldEnd();
                oprot.writeFieldBegin(delete_mark_word_args.PAPER_ID_FIELD_DESC);
                oprot.writeI32(struct.paper_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_mark_word_argsStandardSchemeFactory implements SchemeFactory {
            private delete_mark_word_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public delete_mark_word_argsStandardScheme getScheme() {
                return new delete_mark_word_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_mark_word_argsTupleScheme extends TupleScheme<delete_mark_word_args> {
            private delete_mark_word_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, delete_mark_word_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.topic_id = tTupleProtocol.readI32();
                struct.setTopic_idIsSet(true);
                struct.paper_id = tTupleProtocol.readI32();
                struct.setPaper_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, delete_mark_word_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.topic_id);
                tTupleProtocol.writeI32(struct.paper_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_mark_word_argsTupleSchemeFactory implements SchemeFactory {
            private delete_mark_word_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public delete_mark_word_argsTupleScheme getScheme() {
                return new delete_mark_word_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new delete_mark_word_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new delete_mark_word_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.PAPER_ID, (_Fields) new FieldMetaData("paper_id", (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(delete_mark_word_args.class, unmodifiableMap);
        }

        public delete_mark_word_args() {
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
            setTopic_idIsSet(false);
            this.topic_id = 0;
            setPaper_idIsSet(false);
            this.paper_id = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof delete_mark_word_args)) {
                return equals((delete_mark_word_args) that);
            }
            return false;
        }

        public int getPaper_id() {
            return this.paper_id;
        }

        public int getTopic_id() {
            return this.topic_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetPaper_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 1);
        }

        public boolean isSetTopic_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public delete_mark_word_args setPaper_id(int paper_id) {
            this.paper_id = paper_id;
            setPaper_idIsSet(true);
            return this;
        }

        public void setPaper_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
        }

        public delete_mark_word_args setTopic_id(int topic_id) {
            this.topic_id = topic_id;
            setTopic_idIsSet(true);
            return this;
        }

        public void setTopic_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "delete_mark_word_args(topic_id:" + this.topic_id + j2.O + "paper_id:" + this.paper_id + pn.j.f81007d;
        }

        public void unsetPaper_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
        }

        public void unsetTopic_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(delete_mark_word_args other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetTopic_id() && (compareTo2 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetPaper_id()).compareTo(Boolean.valueOf(other.isSetPaper_id()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetPaper_id() || (compareTo = TBaseHelper.compareTo(this.paper_id, other.paper_id)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<delete_mark_word_args, _Fields> deepCopy2() {
            return new delete_mark_word_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$delete_mark_word_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getTopic_id());
            }
            if (i11 == 2) {
                return Integer.valueOf(getPaper_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$delete_mark_word_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetTopic_id();
            }
            if (i11 == 2) {
                return isSetPaper_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$delete_mark_word_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetTopic_id();
                    return;
                } else {
                    setTopic_id(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetPaper_id();
            } else {
                setPaper_id(((Integer) value).intValue());
            }
        }

        public delete_mark_word_args(int topic_id, int paper_id) {
            this();
            this.topic_id = topic_id;
            setTopic_idIsSet(true);
            this.paper_id = paper_id;
            setPaper_idIsSet(true);
        }

        public boolean equals(delete_mark_word_args that) {
            return that != null && this.topic_id == that.topic_id && this.paper_id == that.paper_id;
        }

        public delete_mark_word_args(delete_mark_word_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.topic_id = other.topic_id;
            this.paper_id = other.paper_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class delete_mark_word_result implements TBase<delete_mark_word_result, _Fields>, Serializable, Cloneable, Comparable<delete_mark_word_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        private static final TStruct STRUCT_DESC = new TStruct("delete_mark_word_result");
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
        public static class delete_mark_word_resultStandardScheme extends StandardScheme<delete_mark_word_result> {
            private delete_mark_word_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, delete_mark_word_result struct) throws TException {
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
            public void write(TProtocol oprot, delete_mark_word_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(delete_mark_word_result.STRUCT_DESC);
                if (struct.boom != null) {
                    oprot.writeFieldBegin(delete_mark_word_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(delete_mark_word_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_mark_word_resultStandardSchemeFactory implements SchemeFactory {
            private delete_mark_word_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public delete_mark_word_resultStandardScheme getScheme() {
                return new delete_mark_word_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class delete_mark_word_resultTupleScheme extends TupleScheme<delete_mark_word_result> {
            private delete_mark_word_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, delete_mark_word_result struct) throws TException {
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
            public void write(TProtocol prot, delete_mark_word_result struct) throws TException {
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
        public static class delete_mark_word_resultTupleSchemeFactory implements SchemeFactory {
            private delete_mark_word_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public delete_mark_word_resultTupleScheme getScheme() {
                return new delete_mark_word_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new delete_mark_word_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new delete_mark_word_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(delete_mark_word_result.class, unmodifiableMap);
        }

        public delete_mark_word_result() {
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
            if (that != null && (that instanceof delete_mark_word_result)) {
                return equals((delete_mark_word_result) that);
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

        public delete_mark_word_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public delete_mark_word_result setBoom(SystemException boom) {
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
            StringBuilder sb2 = new StringBuilder("delete_mark_word_result(");
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

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public delete_mark_word_result(SystemException boom, LogicException bomb) {
            this();
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(delete_mark_word_result other) {
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
        public TBase<delete_mark_word_result, _Fields> deepCopy2() {
            return new delete_mark_word_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$delete_mark_word_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$delete_mark_word_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$delete_mark_word_result$_Fields[field.ordinal()];
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

        public boolean equals(delete_mark_word_result that) {
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

        public delete_mark_word_result(delete_mark_word_result other) {
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
    public static class feedback_args implements TBase<feedback_args, _Fields>, Serializable, Cloneable, Comparable<feedback_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public FeedBackReq req;
        private static final TStruct STRUCT_DESC = new TStruct("feedback_args");
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
        public static class feedback_argsStandardScheme extends StandardScheme<feedback_args> {
            private feedback_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, feedback_args struct) throws TException {
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
                        FeedBackReq feedBackReq = new FeedBackReq();
                        struct.req = feedBackReq;
                        feedBackReq.read(iprot);
                        struct.setReqIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, feedback_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(feedback_args.STRUCT_DESC);
                if (struct.req != null) {
                    oprot.writeFieldBegin(feedback_args.REQ_FIELD_DESC);
                    struct.req.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class feedback_argsStandardSchemeFactory implements SchemeFactory {
            private feedback_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public feedback_argsStandardScheme getScheme() {
                return new feedback_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class feedback_argsTupleScheme extends TupleScheme<feedback_args> {
            private feedback_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, feedback_args struct) throws TException {
                FeedBackReq feedBackReq = new FeedBackReq();
                struct.req = feedBackReq;
                feedBackReq.read((TTupleProtocol) prot);
                struct.setReqIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, feedback_args struct) throws TException {
                struct.req.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class feedback_argsTupleSchemeFactory implements SchemeFactory {
            private feedback_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public feedback_argsTupleScheme getScheme() {
                return new feedback_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new feedback_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new feedback_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.REQ, (_Fields) new FieldMetaData(HiAnalyticsConstant.Direction.REQUEST, (byte) 1, new StructMetaData((byte) 12, FeedBackReq.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(feedback_args.class, unmodifiableMap);
        }

        public feedback_args() {
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
            if (that != null && (that instanceof feedback_args)) {
                return equals((feedback_args) that);
            }
            return false;
        }

        public FeedBackReq getReq() {
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

        public feedback_args setReq(FeedBackReq req) {
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
            StringBuilder sb2 = new StringBuilder("feedback_args(");
            sb2.append("req:");
            FeedBackReq feedBackReq = this.req;
            if (feedBackReq == null) {
                sb2.append("null");
            } else {
                sb2.append(feedBackReq);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetReq() {
            this.req = null;
        }

        public void validate() throws TException {
            FeedBackReq feedBackReq = this.req;
            if (feedBackReq != null) {
                if (feedBackReq != null) {
                    feedBackReq.validate();
                }
            } else {
                throw new TProtocolException("Required field 'req' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public feedback_args(FeedBackReq req) {
            this();
            this.req = req;
        }

        @Override // java.lang.Comparable
        public int compareTo(feedback_args other) {
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
        public TBase<feedback_args, _Fields> deepCopy2() {
            return new feedback_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$feedback_args$_Fields[field.ordinal()] == 1) {
                return getReq();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$feedback_args$_Fields[field.ordinal()] == 1) {
                return isSetReq();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$feedback_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetReq();
            } else {
                setReq((FeedBackReq) value);
            }
        }

        public boolean equals(feedback_args that) {
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

        public feedback_args(feedback_args other) {
            if (other.isSetReq()) {
                this.req = new FeedBackReq(other.req);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class feedback_result implements TBase<feedback_result, _Fields>, Serializable, Cloneable, Comparable<feedback_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        private static final TStruct STRUCT_DESC = new TStruct("feedback_result");
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
        public static class feedback_resultStandardScheme extends StandardScheme<feedback_result> {
            private feedback_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, feedback_result struct) throws TException {
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
            public void write(TProtocol oprot, feedback_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(feedback_result.STRUCT_DESC);
                if (struct.boom != null) {
                    oprot.writeFieldBegin(feedback_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(feedback_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class feedback_resultStandardSchemeFactory implements SchemeFactory {
            private feedback_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public feedback_resultStandardScheme getScheme() {
                return new feedback_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class feedback_resultTupleScheme extends TupleScheme<feedback_result> {
            private feedback_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, feedback_result struct) throws TException {
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
            public void write(TProtocol prot, feedback_result struct) throws TException {
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
        public static class feedback_resultTupleSchemeFactory implements SchemeFactory {
            private feedback_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public feedback_resultTupleScheme getScheme() {
                return new feedback_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new feedback_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new feedback_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(feedback_result.class, unmodifiableMap);
        }

        public feedback_result() {
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
            if (that != null && (that instanceof feedback_result)) {
                return equals((feedback_result) that);
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

        public feedback_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public feedback_result setBoom(SystemException boom) {
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
            StringBuilder sb2 = new StringBuilder("feedback_result(");
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

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public feedback_result(SystemException boom, LogicException bomb) {
            this();
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(feedback_result other) {
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
        public TBase<feedback_result, _Fields> deepCopy2() {
            return new feedback_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$feedback_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$feedback_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$feedback_result$_Fields[field.ordinal()];
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

        public boolean equals(feedback_result that) {
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

        public feedback_result(feedback_result other) {
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
    public static class get_improve_video_info_args implements TBase<get_improve_video_info_args, _Fields>, Serializable, Cloneable, Comparable<get_improve_video_info_args> {
        private static final int __CHAPTER_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public long chapter_id;
        private static final TStruct STRUCT_DESC = new TStruct("get_improve_video_info_args");
        private static final TField CHAPTER_ID_FIELD_DESC = new TField("chapter_id", (byte) 10, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            CHAPTER_ID(1, "chapter_id");

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
                return CHAPTER_ID;
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
        public static class get_improve_video_info_argsStandardScheme extends StandardScheme<get_improve_video_info_args> {
            private get_improve_video_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_improve_video_info_args struct) throws TException {
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
                        struct.chapter_id = iprot.readI64();
                        struct.setChapter_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (struct.isSetChapter_id()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'chapter_id' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_improve_video_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_improve_video_info_args.STRUCT_DESC);
                oprot.writeFieldBegin(get_improve_video_info_args.CHAPTER_ID_FIELD_DESC);
                oprot.writeI64(struct.chapter_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_improve_video_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_improve_video_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_improve_video_info_argsStandardScheme getScheme() {
                return new get_improve_video_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_improve_video_info_argsTupleScheme extends TupleScheme<get_improve_video_info_args> {
            private get_improve_video_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_improve_video_info_args struct) throws TException {
                struct.chapter_id = ((TTupleProtocol) prot).readI64();
                struct.setChapter_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_improve_video_info_args struct) throws TException {
                ((TTupleProtocol) prot).writeI64(struct.chapter_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_improve_video_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_improve_video_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_improve_video_info_argsTupleScheme getScheme() {
                return new get_improve_video_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_improve_video_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_improve_video_info_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.CHAPTER_ID, (_Fields) new FieldMetaData("chapter_id", (byte) 1, new FieldValueMetaData((byte) 10)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_improve_video_info_args.class, unmodifiableMap);
        }

        public get_improve_video_info_args() {
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
            setChapter_idIsSet(false);
            this.chapter_id = 0L;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_improve_video_info_args)) {
                return equals((get_improve_video_info_args) that);
            }
            return false;
        }

        public long getChapter_id() {
            return this.chapter_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetChapter_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_improve_video_info_args setChapter_id(long chapter_id) {
            this.chapter_id = chapter_id;
            setChapter_idIsSet(true);
            return this;
        }

        public void setChapter_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "get_improve_video_info_args(chapter_id:" + this.chapter_id + pn.j.f81007d;
        }

        public void unsetChapter_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_improve_video_info_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetChapter_id()).compareTo(Boolean.valueOf(other.isSetChapter_id()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetChapter_id() || (compareTo = TBaseHelper.compareTo(this.chapter_id, other.chapter_id)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_improve_video_info_args, _Fields> deepCopy2() {
            return new get_improve_video_info_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_improve_video_info_args$_Fields[field.ordinal()] == 1) {
                return Long.valueOf(getChapter_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_improve_video_info_args$_Fields[field.ordinal()] == 1) {
                return isSetChapter_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_improve_video_info_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetChapter_id();
            } else {
                setChapter_id(((Long) value).longValue());
            }
        }

        public get_improve_video_info_args(long chapter_id) {
            this();
            this.chapter_id = chapter_id;
            setChapter_idIsSet(true);
        }

        public boolean equals(get_improve_video_info_args that) {
            return that != null && this.chapter_id == that.chapter_id;
        }

        public get_improve_video_info_args(get_improve_video_info_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.chapter_id = other.chapter_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_improve_video_info_result implements TBase<get_improve_video_info_result, _Fields>, Serializable, Cloneable, Comparable<get_improve_video_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public ImproveVideoInfo success;
        private static final TStruct STRUCT_DESC = new TStruct("get_improve_video_info_result");
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
        public static class get_improve_video_info_resultStandardScheme extends StandardScheme<get_improve_video_info_result> {
            private get_improve_video_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_improve_video_info_result struct) throws TException {
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
                        ImproveVideoInfo improveVideoInfo = new ImproveVideoInfo();
                        struct.success = improveVideoInfo;
                        improveVideoInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_improve_video_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_improve_video_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_improve_video_info_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_improve_video_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_improve_video_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_improve_video_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_improve_video_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_improve_video_info_resultStandardScheme getScheme() {
                return new get_improve_video_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_improve_video_info_resultTupleScheme extends TupleScheme<get_improve_video_info_result> {
            private get_improve_video_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_improve_video_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    ImproveVideoInfo improveVideoInfo = new ImproveVideoInfo();
                    struct.success = improveVideoInfo;
                    improveVideoInfo.read(tTupleProtocol);
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
            public void write(TProtocol prot, get_improve_video_info_result struct) throws TException {
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
        public static class get_improve_video_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_improve_video_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_improve_video_info_resultTupleScheme getScheme() {
                return new get_improve_video_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_improve_video_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_improve_video_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, ImproveVideoInfo.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_improve_video_info_result.class, unmodifiableMap);
        }

        public get_improve_video_info_result() {
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
            if (that != null && (that instanceof get_improve_video_info_result)) {
                return equals((get_improve_video_info_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public ImproveVideoInfo getSuccess() {
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

        public get_improve_video_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_improve_video_info_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_improve_video_info_result setSuccess(ImproveVideoInfo success) {
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
            StringBuilder sb2 = new StringBuilder("get_improve_video_info_result(");
            sb2.append("success:");
            ImproveVideoInfo improveVideoInfo = this.success;
            if (improveVideoInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(improveVideoInfo);
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
            ImproveVideoInfo improveVideoInfo = this.success;
            if (improveVideoInfo != null) {
                improveVideoInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_improve_video_info_result(ImproveVideoInfo success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_improve_video_info_result other) {
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
        public TBase<get_improve_video_info_result, _Fields> deepCopy2() {
            return new get_improve_video_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_improve_video_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_improve_video_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_improve_video_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((ImproveVideoInfo) value);
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

        public boolean equals(get_improve_video_info_result that) {
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

        public get_improve_video_info_result(get_improve_video_info_result other) {
            if (other.isSetSuccess()) {
                this.success = new ImproveVideoInfo(other.success);
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
    public static class get_mark_book_list_args implements TBase<get_mark_book_list_args, _Fields>, Serializable, Cloneable, Comparable<get_mark_book_list_args> {
        private static final int __PAPER_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int paper_id;
        private static final TStruct STRUCT_DESC = new TStruct("get_mark_book_list_args");
        private static final TField PAPER_ID_FIELD_DESC = new TField("paper_id", (byte) 8, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            PAPER_ID(1, "paper_id");

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
                return PAPER_ID;
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
        public static class get_mark_book_list_argsStandardScheme extends StandardScheme<get_mark_book_list_args> {
            private get_mark_book_list_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_mark_book_list_args struct) throws TException {
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
                        struct.paper_id = iprot.readI32();
                        struct.setPaper_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (struct.isSetPaper_id()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'paper_id' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_mark_book_list_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_mark_book_list_args.STRUCT_DESC);
                oprot.writeFieldBegin(get_mark_book_list_args.PAPER_ID_FIELD_DESC);
                oprot.writeI32(struct.paper_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_mark_book_list_argsStandardSchemeFactory implements SchemeFactory {
            private get_mark_book_list_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_mark_book_list_argsStandardScheme getScheme() {
                return new get_mark_book_list_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_mark_book_list_argsTupleScheme extends TupleScheme<get_mark_book_list_args> {
            private get_mark_book_list_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_mark_book_list_args struct) throws TException {
                struct.paper_id = ((TTupleProtocol) prot).readI32();
                struct.setPaper_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_mark_book_list_args struct) throws TException {
                ((TTupleProtocol) prot).writeI32(struct.paper_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_mark_book_list_argsTupleSchemeFactory implements SchemeFactory {
            private get_mark_book_list_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_mark_book_list_argsTupleScheme getScheme() {
                return new get_mark_book_list_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_mark_book_list_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_mark_book_list_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.PAPER_ID, (_Fields) new FieldMetaData("paper_id", (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_mark_book_list_args.class, unmodifiableMap);
        }

        public get_mark_book_list_args() {
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
            setPaper_idIsSet(false);
            this.paper_id = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_mark_book_list_args)) {
                return equals((get_mark_book_list_args) that);
            }
            return false;
        }

        public int getPaper_id() {
            return this.paper_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetPaper_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_mark_book_list_args setPaper_id(int paper_id) {
            this.paper_id = paper_id;
            setPaper_idIsSet(true);
            return this;
        }

        public void setPaper_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "get_mark_book_list_args(paper_id:" + this.paper_id + pn.j.f81007d;
        }

        public void unsetPaper_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_mark_book_list_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetPaper_id()).compareTo(Boolean.valueOf(other.isSetPaper_id()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetPaper_id() || (compareTo = TBaseHelper.compareTo(this.paper_id, other.paper_id)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_mark_book_list_args, _Fields> deepCopy2() {
            return new get_mark_book_list_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_mark_book_list_args$_Fields[field.ordinal()] == 1) {
                return Integer.valueOf(getPaper_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_mark_book_list_args$_Fields[field.ordinal()] == 1) {
                return isSetPaper_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_mark_book_list_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetPaper_id();
            } else {
                setPaper_id(((Integer) value).intValue());
            }
        }

        public get_mark_book_list_args(int paper_id) {
            this();
            this.paper_id = paper_id;
            setPaper_idIsSet(true);
        }

        public boolean equals(get_mark_book_list_args that) {
            return that != null && this.paper_id == that.paper_id;
        }

        public get_mark_book_list_args(get_mark_book_list_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.paper_id = other.paper_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_mark_book_list_result implements TBase<get_mark_book_list_result, _Fields>, Serializable, Cloneable, Comparable<get_mark_book_list_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<MarkTopicInfo> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_mark_book_list_result");
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
        public static class get_mark_book_list_resultStandardScheme extends StandardScheme<get_mark_book_list_result> {
            private get_mark_book_list_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_mark_book_list_result struct) throws TException {
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
                            MarkTopicInfo markTopicInfo = new MarkTopicInfo();
                            markTopicInfo.read(iprot);
                            struct.success.add(markTopicInfo);
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
            public void write(TProtocol oprot, get_mark_book_list_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_mark_book_list_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_mark_book_list_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<MarkTopicInfo> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_mark_book_list_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_mark_book_list_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_mark_book_list_resultStandardSchemeFactory implements SchemeFactory {
            private get_mark_book_list_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_mark_book_list_resultStandardScheme getScheme() {
                return new get_mark_book_list_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_mark_book_list_resultTupleScheme extends TupleScheme<get_mark_book_list_result> {
            private get_mark_book_list_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_mark_book_list_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        MarkTopicInfo markTopicInfo = new MarkTopicInfo();
                        markTopicInfo.read(tTupleProtocol);
                        struct.success.add(markTopicInfo);
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
            public void write(TProtocol prot, get_mark_book_list_result struct) throws TException {
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
                    Iterator<MarkTopicInfo> it = struct.success.iterator();
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
        public static class get_mark_book_list_resultTupleSchemeFactory implements SchemeFactory {
            private get_mark_book_list_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_mark_book_list_resultTupleScheme getScheme() {
                return new get_mark_book_list_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_mark_book_list_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_mark_book_list_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, MarkTopicInfo.class))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_mark_book_list_result.class, unmodifiableMap);
        }

        public get_mark_book_list_result() {
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

        public void addToSuccess(MarkTopicInfo elem) {
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
            if (that != null && (that instanceof get_mark_book_list_result)) {
                return equals((get_mark_book_list_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public List<MarkTopicInfo> getSuccess() {
            return this.success;
        }

        public Iterator<MarkTopicInfo> getSuccessIterator() {
            List<MarkTopicInfo> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<MarkTopicInfo> list = this.success;
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

        public get_mark_book_list_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_mark_book_list_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_mark_book_list_result setSuccess(List<MarkTopicInfo> success) {
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
            StringBuilder sb2 = new StringBuilder("get_mark_book_list_result(");
            sb2.append("success:");
            List<MarkTopicInfo> list = this.success;
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

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_mark_book_list_result(List<MarkTopicInfo> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_mark_book_list_result other) {
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
        public TBase<get_mark_book_list_result, _Fields> deepCopy2() {
            return new get_mark_book_list_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_mark_book_list_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_mark_book_list_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_mark_book_list_result$_Fields[field.ordinal()];
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

        public boolean equals(get_mark_book_list_result that) {
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

        public get_mark_book_list_result(get_mark_book_list_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<MarkTopicInfo> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new MarkTopicInfo(it.next()));
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
    public static class get_vocab_live_info_args implements TBase<get_vocab_live_info_args, _Fields>, Serializable, Cloneable, Comparable<get_vocab_live_info_args> {
        private static final int __ARTICLE_ID_ISSET_ID = 1;
        private static final int __COURSE_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int article_id;
        public int course_id;
        private static final TStruct STRUCT_DESC = new TStruct("get_vocab_live_info_args");
        private static final TField COURSE_ID_FIELD_DESC = new TField("course_id", (byte) 8, 1);
        private static final TField ARTICLE_ID_FIELD_DESC = new TField(ma.b.f72902e1, (byte) 8, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            COURSE_ID(1, "course_id"),
            ARTICLE_ID(2, ma.b.f72902e1);

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
                    return COURSE_ID;
                }
                if (fieldId != 2) {
                    return null;
                }
                return ARTICLE_ID;
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
        public static class get_vocab_live_info_argsStandardScheme extends StandardScheme<get_vocab_live_info_args> {
            private get_vocab_live_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_vocab_live_info_args struct) throws TException {
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
                        } else if (b11 == 8) {
                            struct.article_id = iprot.readI32();
                            struct.setArticle_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.course_id = iprot.readI32();
                        struct.setCourse_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (!struct.isSetCourse_id()) {
                    throw new TProtocolException("Required field 'course_id' was not found in serialized data! Struct: " + toString());
                }
                if (struct.isSetArticle_id()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'article_id' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_vocab_live_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_vocab_live_info_args.STRUCT_DESC);
                oprot.writeFieldBegin(get_vocab_live_info_args.COURSE_ID_FIELD_DESC);
                oprot.writeI32(struct.course_id);
                oprot.writeFieldEnd();
                oprot.writeFieldBegin(get_vocab_live_info_args.ARTICLE_ID_FIELD_DESC);
                oprot.writeI32(struct.article_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_vocab_live_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_vocab_live_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_vocab_live_info_argsStandardScheme getScheme() {
                return new get_vocab_live_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_vocab_live_info_argsTupleScheme extends TupleScheme<get_vocab_live_info_args> {
            private get_vocab_live_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_vocab_live_info_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.course_id = tTupleProtocol.readI32();
                struct.setCourse_idIsSet(true);
                struct.article_id = tTupleProtocol.readI32();
                struct.setArticle_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_vocab_live_info_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.course_id);
                tTupleProtocol.writeI32(struct.article_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_vocab_live_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_vocab_live_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_vocab_live_info_argsTupleScheme getScheme() {
                return new get_vocab_live_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_vocab_live_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_vocab_live_info_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.COURSE_ID, (_Fields) new FieldMetaData("course_id", (byte) 1, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.ARTICLE_ID, (_Fields) new FieldMetaData(ma.b.f72902e1, (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_vocab_live_info_args.class, unmodifiableMap);
        }

        public get_vocab_live_info_args() {
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
            setCourse_idIsSet(false);
            this.course_id = 0;
            setArticle_idIsSet(false);
            this.article_id = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_vocab_live_info_args)) {
                return equals((get_vocab_live_info_args) that);
            }
            return false;
        }

        public int getArticle_id() {
            return this.article_id;
        }

        public int getCourse_id() {
            return this.course_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetArticle_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 1);
        }

        public boolean isSetCourse_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_vocab_live_info_args setArticle_id(int article_id) {
            this.article_id = article_id;
            setArticle_idIsSet(true);
            return this;
        }

        public void setArticle_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
        }

        public get_vocab_live_info_args setCourse_id(int course_id) {
            this.course_id = course_id;
            setCourse_idIsSet(true);
            return this;
        }

        public void setCourse_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "get_vocab_live_info_args(course_id:" + this.course_id + j2.O + "article_id:" + this.article_id + pn.j.f81007d;
        }

        public void unsetArticle_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
        }

        public void unsetCourse_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(get_vocab_live_info_args other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetCourse_id()).compareTo(Boolean.valueOf(other.isSetCourse_id()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetCourse_id() && (compareTo2 = TBaseHelper.compareTo(this.course_id, other.course_id)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetArticle_id()).compareTo(Boolean.valueOf(other.isSetArticle_id()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetArticle_id() || (compareTo = TBaseHelper.compareTo(this.article_id, other.article_id)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_vocab_live_info_args, _Fields> deepCopy2() {
            return new get_vocab_live_info_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_vocab_live_info_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getCourse_id());
            }
            if (i11 == 2) {
                return Integer.valueOf(getArticle_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_vocab_live_info_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetCourse_id();
            }
            if (i11 == 2) {
                return isSetArticle_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_vocab_live_info_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetCourse_id();
                    return;
                } else {
                    setCourse_id(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetArticle_id();
            } else {
                setArticle_id(((Integer) value).intValue());
            }
        }

        public get_vocab_live_info_args(int course_id, int article_id) {
            this();
            this.course_id = course_id;
            setCourse_idIsSet(true);
            this.article_id = article_id;
            setArticle_idIsSet(true);
        }

        public boolean equals(get_vocab_live_info_args that) {
            return that != null && this.course_id == that.course_id && this.article_id == that.article_id;
        }

        public get_vocab_live_info_args(get_vocab_live_info_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.course_id = other.course_id;
            this.article_id = other.article_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_vocab_live_info_result implements TBase<get_vocab_live_info_result, _Fields>, Serializable, Cloneable, Comparable<get_vocab_live_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public VocabLiveInfo success;
        private static final TStruct STRUCT_DESC = new TStruct("get_vocab_live_info_result");
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
        public static class get_vocab_live_info_resultStandardScheme extends StandardScheme<get_vocab_live_info_result> {
            private get_vocab_live_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_vocab_live_info_result struct) throws TException {
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
                        VocabLiveInfo vocabLiveInfo = new VocabLiveInfo();
                        struct.success = vocabLiveInfo;
                        vocabLiveInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_vocab_live_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_vocab_live_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_vocab_live_info_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_vocab_live_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_vocab_live_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_vocab_live_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_vocab_live_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_vocab_live_info_resultStandardScheme getScheme() {
                return new get_vocab_live_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_vocab_live_info_resultTupleScheme extends TupleScheme<get_vocab_live_info_result> {
            private get_vocab_live_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_vocab_live_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    VocabLiveInfo vocabLiveInfo = new VocabLiveInfo();
                    struct.success = vocabLiveInfo;
                    vocabLiveInfo.read(tTupleProtocol);
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
            public void write(TProtocol prot, get_vocab_live_info_result struct) throws TException {
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
        public static class get_vocab_live_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_vocab_live_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_vocab_live_info_resultTupleScheme getScheme() {
                return new get_vocab_live_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_vocab_live_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_vocab_live_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, VocabLiveInfo.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_vocab_live_info_result.class, unmodifiableMap);
        }

        public get_vocab_live_info_result() {
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
            if (that != null && (that instanceof get_vocab_live_info_result)) {
                return equals((get_vocab_live_info_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public VocabLiveInfo getSuccess() {
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

        public get_vocab_live_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_vocab_live_info_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_vocab_live_info_result setSuccess(VocabLiveInfo success) {
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
            StringBuilder sb2 = new StringBuilder("get_vocab_live_info_result(");
            sb2.append("success:");
            VocabLiveInfo vocabLiveInfo = this.success;
            if (vocabLiveInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(vocabLiveInfo);
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
            VocabLiveInfo vocabLiveInfo = this.success;
            if (vocabLiveInfo != null) {
                vocabLiveInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_vocab_live_info_result(VocabLiveInfo success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_vocab_live_info_result other) {
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
        public TBase<get_vocab_live_info_result, _Fields> deepCopy2() {
            return new get_vocab_live_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_vocab_live_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_vocab_live_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$get_vocab_live_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((VocabLiveInfo) value);
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

        public boolean equals(get_vocab_live_info_result that) {
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

        public get_vocab_live_info_result(get_vocab_live_info_result other) {
            if (other.isSetSuccess()) {
                this.success = new VocabLiveInfo(other.success);
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
    public static class livedone_args implements TBase<livedone_args, _Fields>, Serializable, Cloneable, Comparable<livedone_args> {
        private static final int __ARTICLE_ID_ISSET_ID = 1;
        private static final int __COURSE_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int article_id;
        public int course_id;
        private static final TStruct STRUCT_DESC = new TStruct("livedone_args");
        private static final TField COURSE_ID_FIELD_DESC = new TField("course_id", (byte) 8, 1);
        private static final TField ARTICLE_ID_FIELD_DESC = new TField(ma.b.f72902e1, (byte) 8, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            COURSE_ID(1, "course_id"),
            ARTICLE_ID(2, ma.b.f72902e1);

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
                    return COURSE_ID;
                }
                if (fieldId != 2) {
                    return null;
                }
                return ARTICLE_ID;
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
        public static class livedone_argsStandardScheme extends StandardScheme<livedone_args> {
            private livedone_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, livedone_args struct) throws TException {
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
                        } else if (b11 == 8) {
                            struct.article_id = iprot.readI32();
                            struct.setArticle_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.course_id = iprot.readI32();
                        struct.setCourse_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (!struct.isSetCourse_id()) {
                    throw new TProtocolException("Required field 'course_id' was not found in serialized data! Struct: " + toString());
                }
                if (struct.isSetArticle_id()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'article_id' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, livedone_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(livedone_args.STRUCT_DESC);
                oprot.writeFieldBegin(livedone_args.COURSE_ID_FIELD_DESC);
                oprot.writeI32(struct.course_id);
                oprot.writeFieldEnd();
                oprot.writeFieldBegin(livedone_args.ARTICLE_ID_FIELD_DESC);
                oprot.writeI32(struct.article_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class livedone_argsStandardSchemeFactory implements SchemeFactory {
            private livedone_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public livedone_argsStandardScheme getScheme() {
                return new livedone_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class livedone_argsTupleScheme extends TupleScheme<livedone_args> {
            private livedone_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, livedone_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.course_id = tTupleProtocol.readI32();
                struct.setCourse_idIsSet(true);
                struct.article_id = tTupleProtocol.readI32();
                struct.setArticle_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, livedone_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.course_id);
                tTupleProtocol.writeI32(struct.article_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class livedone_argsTupleSchemeFactory implements SchemeFactory {
            private livedone_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public livedone_argsTupleScheme getScheme() {
                return new livedone_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new livedone_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new livedone_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.COURSE_ID, (_Fields) new FieldMetaData("course_id", (byte) 1, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.ARTICLE_ID, (_Fields) new FieldMetaData(ma.b.f72902e1, (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(livedone_args.class, unmodifiableMap);
        }

        public livedone_args() {
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
            setCourse_idIsSet(false);
            this.course_id = 0;
            setArticle_idIsSet(false);
            this.article_id = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof livedone_args)) {
                return equals((livedone_args) that);
            }
            return false;
        }

        public int getArticle_id() {
            return this.article_id;
        }

        public int getCourse_id() {
            return this.course_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetArticle_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 1);
        }

        public boolean isSetCourse_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public livedone_args setArticle_id(int article_id) {
            this.article_id = article_id;
            setArticle_idIsSet(true);
            return this;
        }

        public void setArticle_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
        }

        public livedone_args setCourse_id(int course_id) {
            this.course_id = course_id;
            setCourse_idIsSet(true);
            return this;
        }

        public void setCourse_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "livedone_args(course_id:" + this.course_id + j2.O + "article_id:" + this.article_id + pn.j.f81007d;
        }

        public void unsetArticle_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
        }

        public void unsetCourse_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(livedone_args other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetCourse_id()).compareTo(Boolean.valueOf(other.isSetCourse_id()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetCourse_id() && (compareTo2 = TBaseHelper.compareTo(this.course_id, other.course_id)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetArticle_id()).compareTo(Boolean.valueOf(other.isSetArticle_id()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetArticle_id() || (compareTo = TBaseHelper.compareTo(this.article_id, other.article_id)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<livedone_args, _Fields> deepCopy2() {
            return new livedone_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$livedone_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getCourse_id());
            }
            if (i11 == 2) {
                return Integer.valueOf(getArticle_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$livedone_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetCourse_id();
            }
            if (i11 == 2) {
                return isSetArticle_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$livedone_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetCourse_id();
                    return;
                } else {
                    setCourse_id(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetArticle_id();
            } else {
                setArticle_id(((Integer) value).intValue());
            }
        }

        public livedone_args(int course_id, int article_id) {
            this();
            this.course_id = course_id;
            setCourse_idIsSet(true);
            this.article_id = article_id;
            setArticle_idIsSet(true);
        }

        public boolean equals(livedone_args that) {
            return that != null && this.course_id == that.course_id && this.article_id == that.article_id;
        }

        public livedone_args(livedone_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.course_id = other.course_id;
            this.article_id = other.article_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class livedone_result implements TBase<livedone_result, _Fields>, Serializable, Cloneable, Comparable<livedone_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        private static final TStruct STRUCT_DESC = new TStruct("livedone_result");
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
        public static class livedone_resultStandardScheme extends StandardScheme<livedone_result> {
            private livedone_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, livedone_result struct) throws TException {
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
            public void write(TProtocol oprot, livedone_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(livedone_result.STRUCT_DESC);
                if (struct.boom != null) {
                    oprot.writeFieldBegin(livedone_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(livedone_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class livedone_resultStandardSchemeFactory implements SchemeFactory {
            private livedone_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public livedone_resultStandardScheme getScheme() {
                return new livedone_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class livedone_resultTupleScheme extends TupleScheme<livedone_result> {
            private livedone_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, livedone_result struct) throws TException {
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
            public void write(TProtocol prot, livedone_result struct) throws TException {
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
        public static class livedone_resultTupleSchemeFactory implements SchemeFactory {
            private livedone_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public livedone_resultTupleScheme getScheme() {
                return new livedone_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new livedone_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new livedone_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(livedone_result.class, unmodifiableMap);
        }

        public livedone_result() {
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
            if (that != null && (that instanceof livedone_result)) {
                return equals((livedone_result) that);
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

        public livedone_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public livedone_result setBoom(SystemException boom) {
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
            StringBuilder sb2 = new StringBuilder("livedone_result(");
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

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public livedone_result(SystemException boom, LogicException bomb) {
            this();
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(livedone_result other) {
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
        public TBase<livedone_result, _Fields> deepCopy2() {
            return new livedone_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$livedone_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$livedone_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$livedone_result$_Fields[field.ordinal()];
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

        public boolean equals(livedone_result that) {
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

        public livedone_result(livedone_result other) {
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
    public static class polling_info_args implements TBase<polling_info_args, _Fields>, Serializable, Cloneable, Comparable<polling_info_args> {
        private static final int __ARTICLE_ID_ISSET_ID = 1;
        private static final int __COURSE_ID_ISSET_ID = 0;
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        private byte __isset_bitfield;
        public int article_id;
        public int course_id;
        private static final TStruct STRUCT_DESC = new TStruct("polling_info_args");
        private static final TField COURSE_ID_FIELD_DESC = new TField("course_id", (byte) 8, 1);
        private static final TField ARTICLE_ID_FIELD_DESC = new TField(ma.b.f72902e1, (byte) 8, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            COURSE_ID(1, "course_id"),
            ARTICLE_ID(2, ma.b.f72902e1);

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
                    return COURSE_ID;
                }
                if (fieldId != 2) {
                    return null;
                }
                return ARTICLE_ID;
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
        public static class polling_info_argsStandardScheme extends StandardScheme<polling_info_args> {
            private polling_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, polling_info_args struct) throws TException {
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
                        } else if (b11 == 8) {
                            struct.article_id = iprot.readI32();
                            struct.setArticle_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.course_id = iprot.readI32();
                        struct.setCourse_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                if (!struct.isSetCourse_id()) {
                    throw new TProtocolException("Required field 'course_id' was not found in serialized data! Struct: " + toString());
                }
                if (struct.isSetArticle_id()) {
                    struct.validate();
                    return;
                }
                throw new TProtocolException("Required field 'article_id' was not found in serialized data! Struct: " + toString());
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, polling_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(polling_info_args.STRUCT_DESC);
                oprot.writeFieldBegin(polling_info_args.COURSE_ID_FIELD_DESC);
                oprot.writeI32(struct.course_id);
                oprot.writeFieldEnd();
                oprot.writeFieldBegin(polling_info_args.ARTICLE_ID_FIELD_DESC);
                oprot.writeI32(struct.article_id);
                oprot.writeFieldEnd();
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class polling_info_argsStandardSchemeFactory implements SchemeFactory {
            private polling_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public polling_info_argsStandardScheme getScheme() {
                return new polling_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class polling_info_argsTupleScheme extends TupleScheme<polling_info_args> {
            private polling_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, polling_info_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                struct.course_id = tTupleProtocol.readI32();
                struct.setCourse_idIsSet(true);
                struct.article_id = tTupleProtocol.readI32();
                struct.setArticle_idIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, polling_info_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.course_id);
                tTupleProtocol.writeI32(struct.article_id);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class polling_info_argsTupleSchemeFactory implements SchemeFactory {
            private polling_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public polling_info_argsTupleScheme getScheme() {
                return new polling_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new polling_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new polling_info_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.COURSE_ID, (_Fields) new FieldMetaData("course_id", (byte) 1, new FieldValueMetaData((byte) 8)));
            enumMap.put((EnumMap) _Fields.ARTICLE_ID, (_Fields) new FieldMetaData(ma.b.f72902e1, (byte) 1, new FieldValueMetaData((byte) 8)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(polling_info_args.class, unmodifiableMap);
        }

        public polling_info_args() {
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
            setCourse_idIsSet(false);
            this.course_id = 0;
            setArticle_idIsSet(false);
            this.article_id = 0;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof polling_info_args)) {
                return equals((polling_info_args) that);
            }
            return false;
        }

        public int getArticle_id() {
            return this.article_id;
        }

        public int getCourse_id() {
            return this.course_id;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetArticle_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 1);
        }

        public boolean isSetCourse_id() {
            return EncodingUtils.testBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public polling_info_args setArticle_id(int article_id) {
            this.article_id = article_id;
            setArticle_idIsSet(true);
            return this;
        }

        public void setArticle_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
        }

        public polling_info_args setCourse_id(int course_id) {
            this.course_id = course_id;
            setCourse_idIsSet(true);
            return this;
        }

        public void setCourse_idIsSet(boolean value) {
            this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
        }

        public String toString() {
            return "polling_info_args(course_id:" + this.course_id + j2.O + "article_id:" + this.article_id + pn.j.f81007d;
        }

        public void unsetArticle_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
        }

        public void unsetCourse_id() {
            this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        @Override // java.lang.Comparable
        public int compareTo(polling_info_args other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetCourse_id()).compareTo(Boolean.valueOf(other.isSetCourse_id()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetCourse_id() && (compareTo2 = TBaseHelper.compareTo(this.course_id, other.course_id)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetArticle_id()).compareTo(Boolean.valueOf(other.isSetArticle_id()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetArticle_id() || (compareTo = TBaseHelper.compareTo(this.article_id, other.article_id)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<polling_info_args, _Fields> deepCopy2() {
            return new polling_info_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$polling_info_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return Integer.valueOf(getCourse_id());
            }
            if (i11 == 2) {
                return Integer.valueOf(getArticle_id());
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$polling_info_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetCourse_id();
            }
            if (i11 == 2) {
                return isSetArticle_id();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$polling_info_args$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetCourse_id();
                    return;
                } else {
                    setCourse_id(((Integer) value).intValue());
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetArticle_id();
            } else {
                setArticle_id(((Integer) value).intValue());
            }
        }

        public polling_info_args(int course_id, int article_id) {
            this();
            this.course_id = course_id;
            setCourse_idIsSet(true);
            this.article_id = article_id;
            setArticle_idIsSet(true);
        }

        public boolean equals(polling_info_args that) {
            return that != null && this.course_id == that.course_id && this.article_id == that.article_id;
        }

        public polling_info_args(polling_info_args other) {
            this.__isset_bitfield = (byte) 0;
            this.__isset_bitfield = other.__isset_bitfield;
            this.course_id = other.course_id;
            this.article_id = other.article_id;
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class polling_info_result implements TBase<polling_info_result, _Fields>, Serializable, Cloneable, Comparable<polling_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public Message success;
        private static final TStruct STRUCT_DESC = new TStruct("polling_info_result");
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
        public static class polling_info_resultStandardScheme extends StandardScheme<polling_info_result> {
            private polling_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, polling_info_result struct) throws TException {
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
                        Message message = new Message();
                        struct.success = message;
                        message.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, polling_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(polling_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(polling_info_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(polling_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(polling_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class polling_info_resultStandardSchemeFactory implements SchemeFactory {
            private polling_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public polling_info_resultStandardScheme getScheme() {
                return new polling_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class polling_info_resultTupleScheme extends TupleScheme<polling_info_result> {
            private polling_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, polling_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    Message message = new Message();
                    struct.success = message;
                    message.read(tTupleProtocol);
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
            public void write(TProtocol prot, polling_info_result struct) throws TException {
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
        public static class polling_info_resultTupleSchemeFactory implements SchemeFactory {
            private polling_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public polling_info_resultTupleScheme getScheme() {
                return new polling_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new polling_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new polling_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, Message.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(polling_info_result.class, unmodifiableMap);
        }

        public polling_info_result() {
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
            if (that != null && (that instanceof polling_info_result)) {
                return equals((polling_info_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public Message getSuccess() {
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

        public polling_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public polling_info_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public polling_info_result setSuccess(Message success) {
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
            StringBuilder sb2 = new StringBuilder("polling_info_result(");
            sb2.append("success:");
            Message message = this.success;
            if (message == null) {
                sb2.append("null");
            } else {
                sb2.append(message);
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
            Message message = this.success;
            if (message != null) {
                message.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public polling_info_result(Message success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(polling_info_result other) {
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
        public TBase<polling_info_result, _Fields> deepCopy2() {
            return new polling_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$polling_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$polling_info_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$polling_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((Message) value);
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

        public boolean equals(polling_info_result that) {
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

        public polling_info_result(polling_info_result other) {
            if (other.isSetSuccess()) {
                this.success = new Message(other.success);
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
    public static class submit_improve_chapter_done_args implements TBase<submit_improve_chapter_done_args, _Fields>, Serializable, Cloneable, Comparable<submit_improve_chapter_done_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public ImproveChapterDoneReq chapter_done_info;
        private static final TStruct STRUCT_DESC = new TStruct("submit_improve_chapter_done_args");
        private static final TField CHAPTER_DONE_INFO_FIELD_DESC = new TField("chapter_done_info", (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            CHAPTER_DONE_INFO(1, "chapter_done_info");

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
                return CHAPTER_DONE_INFO;
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
        public static class submit_improve_chapter_done_argsStandardScheme extends StandardScheme<submit_improve_chapter_done_args> {
            private submit_improve_chapter_done_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, submit_improve_chapter_done_args struct) throws TException {
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
                        ImproveChapterDoneReq improveChapterDoneReq = new ImproveChapterDoneReq();
                        struct.chapter_done_info = improveChapterDoneReq;
                        improveChapterDoneReq.read(iprot);
                        struct.setChapter_done_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, submit_improve_chapter_done_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(submit_improve_chapter_done_args.STRUCT_DESC);
                if (struct.chapter_done_info != null) {
                    oprot.writeFieldBegin(submit_improve_chapter_done_args.CHAPTER_DONE_INFO_FIELD_DESC);
                    struct.chapter_done_info.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_improve_chapter_done_argsStandardSchemeFactory implements SchemeFactory {
            private submit_improve_chapter_done_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_improve_chapter_done_argsStandardScheme getScheme() {
                return new submit_improve_chapter_done_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_improve_chapter_done_argsTupleScheme extends TupleScheme<submit_improve_chapter_done_args> {
            private submit_improve_chapter_done_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, submit_improve_chapter_done_args struct) throws TException {
                ImproveChapterDoneReq improveChapterDoneReq = new ImproveChapterDoneReq();
                struct.chapter_done_info = improveChapterDoneReq;
                improveChapterDoneReq.read((TTupleProtocol) prot);
                struct.setChapter_done_infoIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, submit_improve_chapter_done_args struct) throws TException {
                struct.chapter_done_info.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_improve_chapter_done_argsTupleSchemeFactory implements SchemeFactory {
            private submit_improve_chapter_done_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_improve_chapter_done_argsTupleScheme getScheme() {
                return new submit_improve_chapter_done_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new submit_improve_chapter_done_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new submit_improve_chapter_done_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.CHAPTER_DONE_INFO, (_Fields) new FieldMetaData("chapter_done_info", (byte) 1, new StructMetaData((byte) 12, ImproveChapterDoneReq.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(submit_improve_chapter_done_args.class, unmodifiableMap);
        }

        public submit_improve_chapter_done_args() {
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
            this.chapter_done_info = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof submit_improve_chapter_done_args)) {
                return equals((submit_improve_chapter_done_args) that);
            }
            return false;
        }

        public ImproveChapterDoneReq getChapter_done_info() {
            return this.chapter_done_info;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetChapter_done_info() {
            return this.chapter_done_info != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public submit_improve_chapter_done_args setChapter_done_info(ImproveChapterDoneReq chapter_done_info) {
            this.chapter_done_info = chapter_done_info;
            return this;
        }

        public void setChapter_done_infoIsSet(boolean value) {
            if (value) {
                return;
            }
            this.chapter_done_info = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("submit_improve_chapter_done_args(");
            sb2.append("chapter_done_info:");
            ImproveChapterDoneReq improveChapterDoneReq = this.chapter_done_info;
            if (improveChapterDoneReq == null) {
                sb2.append("null");
            } else {
                sb2.append(improveChapterDoneReq);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetChapter_done_info() {
            this.chapter_done_info = null;
        }

        public void validate() throws TException {
            ImproveChapterDoneReq improveChapterDoneReq = this.chapter_done_info;
            if (improveChapterDoneReq != null) {
                if (improveChapterDoneReq != null) {
                    improveChapterDoneReq.validate();
                }
            } else {
                throw new TProtocolException("Required field 'chapter_done_info' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public submit_improve_chapter_done_args(ImproveChapterDoneReq chapter_done_info) {
            this();
            this.chapter_done_info = chapter_done_info;
        }

        @Override // java.lang.Comparable
        public int compareTo(submit_improve_chapter_done_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetChapter_done_info()).compareTo(Boolean.valueOf(other.isSetChapter_done_info()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetChapter_done_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.chapter_done_info, (Comparable) other.chapter_done_info)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<submit_improve_chapter_done_args, _Fields> deepCopy2() {
            return new submit_improve_chapter_done_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$submit_improve_chapter_done_args$_Fields[field.ordinal()] == 1) {
                return getChapter_done_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$submit_improve_chapter_done_args$_Fields[field.ordinal()] == 1) {
                return isSetChapter_done_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$submit_improve_chapter_done_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetChapter_done_info();
            } else {
                setChapter_done_info((ImproveChapterDoneReq) value);
            }
        }

        public boolean equals(submit_improve_chapter_done_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetChapter_done_info = isSetChapter_done_info();
            boolean isSetChapter_done_info2 = that.isSetChapter_done_info();
            if (isSetChapter_done_info || isSetChapter_done_info2) {
                return isSetChapter_done_info && isSetChapter_done_info2 && this.chapter_done_info.equals(that.chapter_done_info);
            }
            return true;
        }

        public submit_improve_chapter_done_args(submit_improve_chapter_done_args other) {
            if (other.isSetChapter_done_info()) {
                this.chapter_done_info = new ImproveChapterDoneReq(other.chapter_done_info);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class submit_improve_chapter_done_result implements TBase<submit_improve_chapter_done_result, _Fields>, Serializable, Cloneable, Comparable<submit_improve_chapter_done_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        private static final TStruct STRUCT_DESC = new TStruct("submit_improve_chapter_done_result");
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
        public static class submit_improve_chapter_done_resultStandardScheme extends StandardScheme<submit_improve_chapter_done_result> {
            private submit_improve_chapter_done_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, submit_improve_chapter_done_result struct) throws TException {
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
            public void write(TProtocol oprot, submit_improve_chapter_done_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(submit_improve_chapter_done_result.STRUCT_DESC);
                if (struct.boom != null) {
                    oprot.writeFieldBegin(submit_improve_chapter_done_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(submit_improve_chapter_done_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_improve_chapter_done_resultStandardSchemeFactory implements SchemeFactory {
            private submit_improve_chapter_done_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_improve_chapter_done_resultStandardScheme getScheme() {
                return new submit_improve_chapter_done_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submit_improve_chapter_done_resultTupleScheme extends TupleScheme<submit_improve_chapter_done_result> {
            private submit_improve_chapter_done_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, submit_improve_chapter_done_result struct) throws TException {
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
            public void write(TProtocol prot, submit_improve_chapter_done_result struct) throws TException {
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
        public static class submit_improve_chapter_done_resultTupleSchemeFactory implements SchemeFactory {
            private submit_improve_chapter_done_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submit_improve_chapter_done_resultTupleScheme getScheme() {
                return new submit_improve_chapter_done_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new submit_improve_chapter_done_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new submit_improve_chapter_done_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(submit_improve_chapter_done_result.class, unmodifiableMap);
        }

        public submit_improve_chapter_done_result() {
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
            if (that != null && (that instanceof submit_improve_chapter_done_result)) {
                return equals((submit_improve_chapter_done_result) that);
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

        public submit_improve_chapter_done_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public submit_improve_chapter_done_result setBoom(SystemException boom) {
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
            StringBuilder sb2 = new StringBuilder("submit_improve_chapter_done_result(");
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

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public submit_improve_chapter_done_result(SystemException boom, LogicException bomb) {
            this();
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(submit_improve_chapter_done_result other) {
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
        public TBase<submit_improve_chapter_done_result, _Fields> deepCopy2() {
            return new submit_improve_chapter_done_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$submit_improve_chapter_done_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$submit_improve_chapter_done_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$submit_improve_chapter_done_result$_Fields[field.ordinal()];
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

        public boolean equals(submit_improve_chapter_done_result that) {
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

        public submit_improve_chapter_done_result(submit_improve_chapter_done_result other) {
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
    public static class submitugc_args implements TBase<submitugc_args, _Fields>, Serializable, Cloneable, Comparable<submitugc_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public CommentReq req;
        private static final TStruct STRUCT_DESC = new TStruct("submitugc_args");
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
        public static class submitugc_argsStandardScheme extends StandardScheme<submitugc_args> {
            private submitugc_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, submitugc_args struct) throws TException {
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
                        CommentReq commentReq = new CommentReq();
                        struct.req = commentReq;
                        commentReq.read(iprot);
                        struct.setReqIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, submitugc_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(submitugc_args.STRUCT_DESC);
                if (struct.req != null) {
                    oprot.writeFieldBegin(submitugc_args.REQ_FIELD_DESC);
                    struct.req.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submitugc_argsStandardSchemeFactory implements SchemeFactory {
            private submitugc_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submitugc_argsStandardScheme getScheme() {
                return new submitugc_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submitugc_argsTupleScheme extends TupleScheme<submitugc_args> {
            private submitugc_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, submitugc_args struct) throws TException {
                CommentReq commentReq = new CommentReq();
                struct.req = commentReq;
                commentReq.read((TTupleProtocol) prot);
                struct.setReqIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, submitugc_args struct) throws TException {
                struct.req.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submitugc_argsTupleSchemeFactory implements SchemeFactory {
            private submitugc_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submitugc_argsTupleScheme getScheme() {
                return new submitugc_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new submitugc_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new submitugc_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.REQ, (_Fields) new FieldMetaData(HiAnalyticsConstant.Direction.REQUEST, (byte) 1, new StructMetaData((byte) 12, CommentReq.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(submitugc_args.class, unmodifiableMap);
        }

        public submitugc_args() {
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
            if (that != null && (that instanceof submitugc_args)) {
                return equals((submitugc_args) that);
            }
            return false;
        }

        public CommentReq getReq() {
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

        public submitugc_args setReq(CommentReq req) {
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
            StringBuilder sb2 = new StringBuilder("submitugc_args(");
            sb2.append("req:");
            CommentReq commentReq = this.req;
            if (commentReq == null) {
                sb2.append("null");
            } else {
                sb2.append(commentReq);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetReq() {
            this.req = null;
        }

        public void validate() throws TException {
            CommentReq commentReq = this.req;
            if (commentReq != null) {
                if (commentReq != null) {
                    commentReq.validate();
                }
            } else {
                throw new TProtocolException("Required field 'req' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public submitugc_args(CommentReq req) {
            this();
            this.req = req;
        }

        @Override // java.lang.Comparable
        public int compareTo(submitugc_args other) {
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
        public TBase<submitugc_args, _Fields> deepCopy2() {
            return new submitugc_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$submitugc_args$_Fields[field.ordinal()] == 1) {
                return getReq();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$submitugc_args$_Fields[field.ordinal()] == 1) {
                return isSetReq();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$submitugc_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetReq();
            } else {
                setReq((CommentReq) value);
            }
        }

        public boolean equals(submitugc_args that) {
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

        public submitugc_args(submitugc_args other) {
            if (other.isSetReq()) {
                this.req = new CommentReq(other.req);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class submitugc_result implements TBase<submitugc_result, _Fields>, Serializable, Cloneable, Comparable<submitugc_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        private static final TStruct STRUCT_DESC = new TStruct("submitugc_result");
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
        public static class submitugc_resultStandardScheme extends StandardScheme<submitugc_result> {
            private submitugc_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, submitugc_result struct) throws TException {
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
            public void write(TProtocol oprot, submitugc_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(submitugc_result.STRUCT_DESC);
                if (struct.boom != null) {
                    oprot.writeFieldBegin(submitugc_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(submitugc_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submitugc_resultStandardSchemeFactory implements SchemeFactory {
            private submitugc_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submitugc_resultStandardScheme getScheme() {
                return new submitugc_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class submitugc_resultTupleScheme extends TupleScheme<submitugc_result> {
            private submitugc_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, submitugc_result struct) throws TException {
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
            public void write(TProtocol prot, submitugc_result struct) throws TException {
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
        public static class submitugc_resultTupleSchemeFactory implements SchemeFactory {
            private submitugc_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public submitugc_resultTupleScheme getScheme() {
                return new submitugc_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new submitugc_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new submitugc_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(submitugc_result.class, unmodifiableMap);
        }

        public submitugc_result() {
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
            if (that != null && (that instanceof submitugc_result)) {
                return equals((submitugc_result) that);
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

        public submitugc_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public submitugc_result setBoom(SystemException boom) {
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
            StringBuilder sb2 = new StringBuilder("submitugc_result(");
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

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public submitugc_result(SystemException boom, LogicException bomb) {
            this();
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(submitugc_result other) {
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
        public TBase<submitugc_result, _Fields> deepCopy2() {
            return new submitugc_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$submitugc_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$submitugc_result$_Fields[field.ordinal()];
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
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseApiService$submitugc_result$_Fields[field.ordinal()];
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

        public boolean equals(submitugc_result that) {
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

        public submitugc_result(submitugc_result other) {
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
