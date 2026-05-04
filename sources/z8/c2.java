package z8;

import com.baicizhan.biz.online.thrift.basic.LogicException;
import com.baicizhan.biz.online.thrift.basic.SystemException;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.thrifty.ThriftException;
import com.microsoft.thrifty.service.a;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import okio.ByteString;
import z8.l1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c2 extends com.microsoft.thrifty.service.b implements z8.b2 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<z8.i1> f101244a;

        /* renamed from: b, reason: collision with root package name */
        public final long f101245b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k List<z8.i1> words, long j11, @m80.k xs.e<Integer> callback) {
            super("add_collect_words", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(words, "words");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101244a = words;
            this.f101245b = j11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(xd.a.f98002r, 1, (byte) 15);
            protocol.y2((byte) 12, this.f101244a.size());
            Iterator<z8.i1> it = this.f101244a.iterator();
            while (it.hasNext()) {
                z8.i1.f101618f.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("last_updated_at", 2, (byte) 10);
            protocol.q7(this.f101245b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a0 extends xs.d<z8.f> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101246a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(int i11, @m80.k xs.e<z8.f> callback) {
            super("get_copper_exchange_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101246a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.f receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.f fVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    fVar = z8.f.f101490i.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (fVar != null) {
                return fVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("type", 1, (byte) 8);
            protocol.l5(this.f101246a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a1 extends xs.d<List<? extends z8.j2>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101247a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<Integer> f101248b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(int i11, @m80.k List<Integer> topic_ids, @m80.k xs.e<List<z8.j2>> callback) {
            super("relearn_word_list", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(topic_ids, "topic_ids");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101247a = i11;
            this.f101248b = topic_ids;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<z8.j2> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            ArrayList arrayList = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(z8.j2.f101670h.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(this.f101247a);
            protocol.N2();
            protocol.Q6("topic_ids", 2, (byte) 15);
            protocol.y2((byte) 8, this.f101248b.size());
            Iterator<Integer> it = this.f101248b.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a2 extends xs.d<z8.r1> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101249a;

        /* renamed from: b, reason: collision with root package name */
        public final int f101250b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a2(int i11, int i12, @m80.k xs.e<z8.r1> callback) {
            super("user_finish_book_faunt", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101249a = i11;
            this.f101250b = i12;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.r1 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.r1 r1Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    r1Var = z8.r1.f101968m.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (r1Var != null) {
                return r1Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(ma.b.f72894c, 1, (byte) 8);
            protocol.l5(this.f101249a);
            protocol.N2();
            protocol.Q6("review_round", 2, (byte) 8);
            protocol.l5(this.f101250b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a3 implements xs.e<List<? extends z8.b>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<z8.b>> f101251a;

        /* JADX WARN: Multi-variable type inference failed */
        public a3(j00.c<? super List<z8.b>> cVar) {
            this.f101251a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<z8.b> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<z8.b>> cVar = this.f101251a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<z8.b>> cVar = this.f101251a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a4 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f101252a;

        /* JADX WARN: Multi-variable type inference failed */
        public a4(j00.c<? super Integer> cVar) {
            this.f101252a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f101252a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f101252a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a5 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f101253a;

        /* JADX WARN: Multi-variable type inference failed */
        public a5(j00.c<? super yz.g2> cVar) {
            this.f101253a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f101253a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f101253a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends xs.d<List<? extends z8.d0>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k xs.e<List<z8.d0>> callback) {
            super("book_mode_list", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<z8.d0> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            ArrayList arrayList = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(z8.d0.f101416g.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b0 extends xs.d<z8.j> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(@m80.k xs.e<z8.j> callback) {
            super("get_daily_task", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.j receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.j jVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    jVar = z8.j.f101640c.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (jVar != null) {
                return jVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b1 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101254a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b1(int i11, @m80.k xs.e<yz.g2> callback) {
            super("report_finish_book", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101254a = i11;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ yz.g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return yz.g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(this.f101254a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        logicException = LogicException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    systemException = SystemException.ADAPTER.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b2 extends xs.d<z8.v1> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b2(@m80.k xs.e<z8.v1> callback) {
            super("user_limit_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.v1 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.v1 v1Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    v1Var = z8.v1.B.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (v1Var != null) {
                return v1Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b3 implements xs.e<z8.c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.c> f101255a;

        /* JADX WARN: Multi-variable type inference failed */
        public b3(j00.c<? super z8.c> cVar) {
            this.f101255a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.c result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.c> cVar = this.f101255a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.c> cVar = this.f101255a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b4 implements xs.e<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<String> f101256a;

        /* JADX WARN: Multi-variable type inference failed */
        public b4(j00.c<? super String> cVar) {
            this.f101256a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k String result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<String> cVar = this.f101256a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<String> cVar = this.f101256a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b5 implements xs.e<z8.a1> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.a1> f101257a;

        /* JADX WARN: Multi-variable type inference failed */
        public b5(j00.c<? super z8.a1> cVar) {
            this.f101257a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.a1 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.a1> cVar = this.f101257a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.a1> cVar = this.f101257a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends xs.d<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final long f101258a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j11, @m80.k xs.e<Boolean> callback) {
            super("can_open_box", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101258a = j11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            Boolean bool = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 2) {
                    bool = Boolean.valueOf(protocol.readBool());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (bool != null) {
                return bool;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("client_timestamp_ms", 1, (byte) 10);
            protocol.q7(this.f101258a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c0 extends xs.d<z8.l> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<Integer> f101259a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(@m80.k List<Integer> topic_ids, @m80.k xs.e<z8.l> callback) {
            super("get_daka_background_datas", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(topic_ids, "topic_ids");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101259a = topic_ids;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.l receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.l lVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    lVar = z8.l.f101724f.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (lVar != null) {
                return lVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("topic_ids", 1, (byte) 15);
            protocol.y2((byte) 8, this.f101259a.size());
            Iterator<Integer> it = this.f101259a.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c1 extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101260a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c1(int i11, @m80.k xs.e<Integer> callback) {
            super("reset_done_score_data", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101260a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(this.f101260a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: z8.c2$c2, reason: collision with other inner class name */
    public static final class C1388c2 extends xs.d<z8.w1> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1388c2(@m80.k xs.e<z8.w1> callback) {
            super("user_limit_info_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.w1 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.w1 w1Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    w1Var = z8.w1.f102206v.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (w1Var != null) {
                return w1Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c3 implements xs.e<z8.e> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.e> f101261a;

        /* JADX WARN: Multi-variable type inference failed */
        public c3(j00.c<? super z8.e> cVar) {
            this.f101261a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.e result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.e> cVar = this.f101261a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.e> cVar = this.f101261a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c4 implements xs.e<z8.e0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.e0> f101262a;

        /* JADX WARN: Multi-variable type inference failed */
        public c4(j00.c<? super z8.e0> cVar) {
            this.f101262a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.e0 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.e0> cVar = this.f101262a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.e0> cVar = this.f101262a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c5 implements xs.e<z8.b1> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.b1> f101263a;

        /* JADX WARN: Multi-variable type inference failed */
        public c5(j00.c<? super z8.b1> cVar) {
            this.f101263a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.b1 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.b1> cVar = this.f101263a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.b1> cVar = this.f101263a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends xs.d<List<? extends z8.j2>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101264a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<Integer> f101265b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i11, @m80.k List<Integer> topic_ids, @m80.k xs.e<List<z8.j2>> callback) {
            super("cancel_cut_word_list", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(topic_ids, "topic_ids");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101264a = i11;
            this.f101265b = topic_ids;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<z8.j2> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            ArrayList arrayList = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(z8.j2.f101670h.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(this.f101264a);
            protocol.N2();
            protocol.Q6("topic_ids", 2, (byte) 15);
            protocol.y2((byte) 8, this.f101265b.size());
            Iterator<Integer> it = this.f101265b.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d0 extends xs.d<z8.k1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final z8.l1 f101266a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final z8.l1 f101267b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(@m80.k z8.l1 begin_date, @m80.k z8.l1 end_date, @m80.k xs.e<z8.k1> callback) {
            super("get_daka_base_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(begin_date, "begin_date");
            kotlin.jvm.internal.g0.p(end_date, "end_date");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101266a = begin_date;
            this.f101267b = end_date;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.k1 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.k1 k1Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    k1Var = z8.k1.f101710d.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (k1Var != null) {
                return k1Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("begin_date", 1, (byte) 12);
            ts.a<z8.l1, l1.a> aVar = z8.l1.f101744f;
            aVar.write(protocol, this.f101266a);
            protocol.N2();
            protocol.Q6("end_date", 2, (byte) 12);
            aVar.write(protocol, this.f101267b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d1 extends xs.d<List<? extends z8.y1>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101268a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(int i11, @m80.k xs.e<List<z8.y1>> callback) {
            super("roadmap_by_word_level_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101268a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<z8.y1> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            ArrayList arrayList = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(z8.y1.f102286f.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(this.f101268a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d2 extends xs.d<z8.i2> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101269a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d2(int i11, @m80.k xs.e<z8.i2> callback) {
            super("win_streak_status", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101269a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.i2 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.i2 i2Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    i2Var = z8.i2.f101628g.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (i2Var != null) {
                return i2Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("client_date", 1, (byte) 8);
            protocol.l5(this.f101269a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d3 implements xs.e<Long> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Long> f101270a;

        /* JADX WARN: Multi-variable type inference failed */
        public d3(j00.c<? super Long> cVar) {
            this.f101270a = cVar;
        }

        public void a(long j11) {
            j00.c<Long> cVar = this.f101270a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Long.valueOf(j11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Long> cVar = this.f101270a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Long l11) {
            a(l11.longValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d4 implements xs.e<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<String> f101271a;

        /* JADX WARN: Multi-variable type inference failed */
        public d4(j00.c<? super String> cVar) {
            this.f101271a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k String result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<String> cVar = this.f101271a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<String> cVar = this.f101271a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d5 implements xs.e<z8.n1> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.n1> f101272a;

        /* JADX WARN: Multi-variable type inference failed */
        public d5(j00.c<? super z8.n1> cVar) {
            this.f101272a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.n1 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.n1> cVar = this.f101272a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.n1> cVar = this.f101272a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends xs.d<z8.h> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final z8.g f101273a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k z8.g req, @m80.k xs.e<z8.h> callback) {
            super("copper_exchange", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(req, "req");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101273a = req;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.h receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.h hVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    hVar = z8.h.f101566d.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (hVar != null) {
                return hVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(HiAnalyticsConstant.Direction.REQUEST, 1, (byte) 12);
            z8.g.f101530c.write(protocol, this.f101273a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e0 extends xs.d<z8.w> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(@m80.k xs.e<z8.w> callback) {
            super("get_first_day_test_task_result", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.w receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.w wVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    wVar = z8.w.f102190d.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (wVar != null) {
                return wVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e1 extends xs.d<z8.a2> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101274a;

        /* renamed from: b, reason: collision with root package name */
        public final int f101275b;

        /* renamed from: c, reason: collision with root package name */
        public final int f101276c;

        /* renamed from: d, reason: collision with root package name */
        public final int f101277d;

        /* renamed from: e, reason: collision with root package name */
        public final int f101278e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ e1(int r2, int r3, int r4, int r5, int r6, xs.e r7, int r8, kotlin.jvm.internal.v r9) {
            /*
                r1 = this;
                r9 = r8 & 4
                r0 = 0
                if (r9 == 0) goto L6
                r4 = r0
            L6:
                r9 = r8 & 8
                if (r9 == 0) goto Lb
                r5 = -1
            Lb:
                r8 = r8 & 16
                if (r8 == 0) goto L17
                r8 = r7
                r7 = r0
            L11:
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                goto L1a
            L17:
                r8 = r7
                r7 = r6
                goto L11
            L1a:
                r2.<init>(r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z8.c2.e1.<init>(int, int, int, int, int, xs.e, int, kotlin.jvm.internal.v):void");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.a2 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.a2 a2Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    a2Var = z8.a2.f101135p.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (a2Var != null) {
                return a2Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(this.f101274a);
            protocol.N2();
            protocol.Q6("daily_plan_count", 2, (byte) 8);
            protocol.l5(this.f101275b);
            protocol.N2();
            protocol.Q6("review_plan_count", 3, (byte) 8);
            protocol.l5(this.f101276c);
            protocol.N2();
            protocol.Q6("mode", 4, (byte) 8);
            protocol.l5(this.f101277d);
            protocol.N2();
            protocol.Q6("group_count", 5, (byte) 8);
            protocol.l5(this.f101278e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e1(int i11, int i12, int i13, int i14, int i15, @m80.k xs.e<z8.a2> callback) {
            super("select_book", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101274a = i11;
            this.f101275b = i12;
            this.f101276c = i13;
            this.f101277d = i14;
            this.f101278e = i15;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e2 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f101279a;

        /* JADX WARN: Multi-variable type inference failed */
        public e2(j00.c<? super Integer> cVar) {
            this.f101279a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f101279a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f101279a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e3 implements xs.e<z8.f> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.f> f101280a;

        /* JADX WARN: Multi-variable type inference failed */
        public e3(j00.c<? super z8.f> cVar) {
            this.f101280a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.f result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.f> cVar = this.f101280a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.f> cVar = this.f101280a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e4 implements xs.e<List<? extends z8.j2>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<z8.j2>> f101281a;

        /* JADX WARN: Multi-variable type inference failed */
        public e4(j00.c<? super List<z8.j2>> cVar) {
            this.f101281a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<z8.j2> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<z8.j2>> cVar = this.f101281a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<z8.j2>> cVar = this.f101281a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e5 implements xs.e<z8.r1> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.r1> f101282a;

        /* JADX WARN: Multi-variable type inference failed */
        public e5(j00.c<? super z8.r1> cVar) {
            this.f101282a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.r1 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.r1> cVar = this.f101282a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.r1> cVar = this.f101282a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends xs.d<z8.i> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@m80.k xs.e<z8.i> callback) {
            super("credit_task_center", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.i receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.i iVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    iVar = z8.i.f101594i.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (iVar != null) {
                return iVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f0 extends xs.d<List<? extends z8.u1>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101283a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(int i11, @m80.k xs.e<List<z8.u1>> callback) {
            super("get_learned_words_list", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101283a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<z8.u1> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            ArrayList arrayList = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(z8.u1.f102088n.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(this.f101283a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f1 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101284a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f1(int i11, @m80.k xs.e<yz.g2> callback) {
            super("set_primary_school_mode_config", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101284a = i11;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ yz.g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return yz.g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("state", 1, (byte) 8);
            protocol.l5(this.f101284a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        logicException = LogicException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    systemException = SystemException.ADAPTER.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f2 implements xs.e<List<? extends z8.d0>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<z8.d0>> f101285a;

        /* JADX WARN: Multi-variable type inference failed */
        public f2(j00.c<? super List<z8.d0>> cVar) {
            this.f101285a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<z8.d0> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<z8.d0>> cVar = this.f101285a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<z8.d0>> cVar = this.f101285a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f3 implements xs.e<z8.j> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.j> f101286a;

        /* JADX WARN: Multi-variable type inference failed */
        public f3(j00.c<? super z8.j> cVar) {
            this.f101286a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.j result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.j> cVar = this.f101286a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.j> cVar = this.f101286a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f4 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f101287a;

        /* JADX WARN: Multi-variable type inference failed */
        public f4(j00.c<? super yz.g2> cVar) {
            this.f101287a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f101287a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f101287a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f5 implements xs.e<z8.v1> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.v1> f101288a;

        /* JADX WARN: Multi-variable type inference failed */
        public f5(j00.c<? super z8.v1> cVar) {
            this.f101288a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.v1 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.v1> cVar = this.f101288a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.v1> cVar = this.f101288a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends xs.d<List<? extends z8.j2>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101289a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<Integer> f101290b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i11, @m80.k List<Integer> topic_ids, @m80.k xs.e<List<z8.j2>> callback) {
            super("cut_word_list", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(topic_ids, "topic_ids");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101289a = i11;
            this.f101290b = topic_ids;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<z8.j2> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            ArrayList arrayList = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(z8.j2.f101670h.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(this.f101289a);
            protocol.N2();
            protocol.Q6("topic_ids", 2, (byte) 15);
            protocol.y2((byte) 8, this.f101290b.size());
            Iterator<Integer> it = this.f101290b.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g0 extends xs.d<z8.z> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(@m80.k xs.e<z8.z> callback) {
            super("get_main_page_js", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.z receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.z zVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    zVar = z8.z.f102296d.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (zVar != null) {
                return zVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g1 extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101291a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g1(int i11, @m80.k xs.e<Integer> callback) {
            super("set_study_chn_mode", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101291a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("chn_mode", 1, (byte) 8);
            protocol.l5(this.f101291a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g2 implements xs.e<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Boolean> f101292a;

        /* JADX WARN: Multi-variable type inference failed */
        public g2(j00.c<? super Boolean> cVar) {
            this.f101292a = cVar;
        }

        public void a(boolean z11) {
            j00.c<Boolean> cVar = this.f101292a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Boolean.valueOf(z11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Boolean> cVar = this.f101292a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Boolean bool) {
            a(bool.booleanValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g3 implements xs.e<z8.l> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.l> f101293a;

        /* JADX WARN: Multi-variable type inference failed */
        public g3(j00.c<? super z8.l> cVar) {
            this.f101293a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.l result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.l> cVar = this.f101293a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.l> cVar = this.f101293a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g4 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f101294a;

        /* JADX WARN: Multi-variable type inference failed */
        public g4(j00.c<? super Integer> cVar) {
            this.f101294a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f101294a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f101294a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g5 implements xs.e<z8.w1> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.w1> f101295a;

        /* JADX WARN: Multi-variable type inference failed */
        public g5(j00.c<? super z8.w1> cVar) {
            this.f101295a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.w1 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.w1> cVar = this.f101295a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.w1> cVar = this.f101295a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends xs.d<z8.m> {

        /* renamed from: a, reason: collision with root package name */
        public final long f101296a;

        /* renamed from: b, reason: collision with root package name */
        public final long f101297b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j11, long j12, @m80.k xs.e<z8.m> callback) {
            super("daka_rescue", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101296a = j11;
            this.f101297b = j12;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.m receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.m mVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    mVar = z8.m.f101754d.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (mVar != null) {
                return mVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(com.alipay.sdk.m.t.a.f11034k, 1, (byte) 10);
            protocol.q7(this.f101296a);
            protocol.N2();
            protocol.Q6("minute_timezone", 2, (byte) 10);
            protocol.q7(this.f101297b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h0 extends xs.d<z8.b0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f101298a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(@m80.k String id2, @m80.k xs.e<z8.b0> callback) {
            super("get_merge_state", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(id2, "id");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101298a = id2;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.b0 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.b0 b0Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    b0Var = z8.b0.f101181e.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (b0Var != null) {
                return b0Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("id", 1, (byte) 11);
            protocol.p1(this.f101298a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h1 extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f101299a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h1(@m80.k String extra_config, @m80.k xs.e<Integer> callback) {
            super("set_study_extra_config", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(extra_config, "extra_config");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101299a = extra_config;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("extra_config", 1, (byte) 11);
            protocol.p1(this.f101299a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h2 implements xs.e<List<? extends z8.j2>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<z8.j2>> f101300a;

        /* JADX WARN: Multi-variable type inference failed */
        public h2(j00.c<? super List<z8.j2>> cVar) {
            this.f101300a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<z8.j2> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<z8.j2>> cVar = this.f101300a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<z8.j2>> cVar = this.f101300a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h3 implements xs.e<z8.k1> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.k1> f101301a;

        /* JADX WARN: Multi-variable type inference failed */
        public h3(j00.c<? super z8.k1> cVar) {
            this.f101301a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.k1 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.k1> cVar = this.f101301a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.k1> cVar = this.f101301a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h4 implements xs.e<List<? extends z8.y1>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<z8.y1>> f101302a;

        /* JADX WARN: Multi-variable type inference failed */
        public h4(j00.c<? super List<z8.y1>> cVar) {
            this.f101302a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<z8.y1> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<z8.y1>> cVar = this.f101302a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<z8.y1>> cVar = this.f101302a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h5 implements xs.e<z8.i2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.i2> f101303a;

        /* JADX WARN: Multi-variable type inference failed */
        public h5(j00.c<? super z8.i2> cVar) {
            this.f101303a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.i2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.i2> cVar = this.f101303a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.i2> cVar = this.f101303a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends xs.d<z8.m> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f101304a;

        /* renamed from: b, reason: collision with root package name */
        public final long f101305b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(@m80.k String yyyyMMdd, long j11, @m80.k xs.e<z8.m> callback) {
            super("daka_rescue_by_str", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(yyyyMMdd, "yyyyMMdd");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101304a = yyyyMMdd;
            this.f101305b = j11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.m receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.m mVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    mVar = z8.m.f101754d.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (mVar != null) {
                return mVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("yyyyMMdd", 1, (byte) 11);
            protocol.p1(this.f101304a);
            protocol.N2();
            protocol.Q6("minute_timezone", 2, (byte) 10);
            protocol.q7(this.f101305b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i0 extends xs.d<List<? extends Integer>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(@m80.k xs.e<List<Integer>> callback) {
            super("get_payed_books", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Integer> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            ArrayList arrayList = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(Integer.valueOf(protocol.s8()));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i1 extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101306a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i1(int i11, @m80.k xs.e<Integer> callback) {
            super("set_study_fast_mode", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101306a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("fast_mode", 1, (byte) 8);
            protocol.l5(this.f101306a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i2 implements xs.e<z8.h> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.h> f101307a;

        /* JADX WARN: Multi-variable type inference failed */
        public i2(j00.c<? super z8.h> cVar) {
            this.f101307a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.h result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.h> cVar = this.f101307a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.h> cVar = this.f101307a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i3 implements xs.e<z8.w> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.w> f101308a;

        /* JADX WARN: Multi-variable type inference failed */
        public i3(j00.c<? super z8.w> cVar) {
            this.f101308a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.w result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.w> cVar = this.f101308a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.w> cVar = this.f101308a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i4 implements xs.e<z8.a2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.a2> f101309a;

        /* JADX WARN: Multi-variable type inference failed */
        public i4(j00.c<? super z8.a2> cVar) {
            this.f101309a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.a2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.a2> cVar = this.f101309a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.a2> cVar = this.f101309a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<z8.i1> f101310a;

        /* renamed from: b, reason: collision with root package name */
        public final long f101311b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(@m80.k List<z8.i1> words, long j11, @m80.k xs.e<Integer> callback) {
            super("delete_collect_words", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(words, "words");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101310a = words;
            this.f101311b = j11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(xd.a.f98002r, 1, (byte) 15);
            protocol.y2((byte) 12, this.f101310a.size());
            Iterator<z8.i1> it = this.f101310a.iterator();
            while (it.hasNext()) {
                z8.i1.f101618f.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("last_updated_at", 2, (byte) 10);
            protocol.q7(this.f101311b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j0 extends xs.d<z8.g0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(@m80.k xs.e<z8.g0> callback) {
            super("get_primary_school_mode_config", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.g0 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.g0 g0Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    g0Var = z8.g0.f101534h.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (g0Var != null) {
                return g0Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j1 extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101312a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j1(int i11, @m80.k xs.e<Integer> callback) {
            super("set_study_listening_mode", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101312a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("listening_mode", 1, (byte) 8);
            protocol.l5(this.f101312a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j2 implements xs.e<z8.i> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.i> f101313a;

        /* JADX WARN: Multi-variable type inference failed */
        public j2(j00.c<? super z8.i> cVar) {
            this.f101313a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.i result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.i> cVar = this.f101313a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.i> cVar = this.f101313a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j3 implements xs.e<List<? extends z8.u1>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<z8.u1>> f101314a;

        /* JADX WARN: Multi-variable type inference failed */
        public j3(j00.c<? super List<z8.u1>> cVar) {
            this.f101314a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<z8.u1> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<z8.u1>> cVar = this.f101314a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<z8.u1>> cVar = this.f101314a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j4 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f101315a;

        /* JADX WARN: Multi-variable type inference failed */
        public j4(j00.c<? super yz.g2> cVar) {
            this.f101315a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f101315a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f101315a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101316a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i11, @m80.k xs.e<Integer> callback) {
            super("delete_done_score_data", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101316a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(this.f101316a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k0 extends xs.d<z8.s> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(@m80.k xs.e<z8.s> callback) {
            super("get_rank_detail", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.s receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.s sVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    sVar = z8.s.f101992e.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (sVar != null) {
                return sVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k1 extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101317a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k1(int i11, @m80.k xs.e<Integer> callback) {
            super("set_study_spell_mode", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101317a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("spell_mode", 1, (byte) 8);
            protocol.l5(this.f101317a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k2 implements xs.e<List<? extends z8.j2>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<z8.j2>> f101318a;

        /* JADX WARN: Multi-variable type inference failed */
        public k2(j00.c<? super List<z8.j2>> cVar) {
            this.f101318a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<z8.j2> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<z8.j2>> cVar = this.f101318a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<z8.j2>> cVar = this.f101318a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k3 implements xs.e<z8.z> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.z> f101319a;

        /* JADX WARN: Multi-variable type inference failed */
        public k3(j00.c<? super z8.z> cVar) {
            this.f101319a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.z result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.z> cVar = this.f101319a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.z> cVar = this.f101319a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k4 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f101320a;

        /* JADX WARN: Multi-variable type inference failed */
        public k4(j00.c<? super Integer> cVar) {
            this.f101320a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f101320a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f101320a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101321a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(int i11, @m80.k xs.e<yz.g2> callback) {
            super("delete_word_note", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101321a = i11;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ yz.g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return yz.g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(this.f101321a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        logicException = LogicException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    systemException = SystemException.ADAPTER.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l0 extends xs.d<z8.t> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(@m80.k xs.e<z8.t> callback) {
            super("get_rank_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.t receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.t tVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    tVar = z8.t.f102028h.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (tVar != null) {
                return tVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l1 extends xs.d<z8.o> {

        /* renamed from: a, reason: collision with root package name */
        public final long f101322a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l1(long j11, @m80.k xs.e<z8.o> callback) {
            super("share_bonus", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101322a = j11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.o receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.o oVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    oVar = z8.o.f101834i.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (oVar != null) {
                return oVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("client_timestamp_ms", 1, (byte) 10);
            protocol.q7(this.f101322a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l2 implements xs.e<z8.m> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.m> f101323a;

        /* JADX WARN: Multi-variable type inference failed */
        public l2(j00.c<? super z8.m> cVar) {
            this.f101323a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.m result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.m> cVar = this.f101323a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.m> cVar = this.f101323a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l3 implements xs.e<z8.b0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.b0> f101324a;

        /* JADX WARN: Multi-variable type inference failed */
        public l3(j00.c<? super z8.b0> cVar) {
            this.f101324a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.b0 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.b0> cVar = this.f101324a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.b0> cVar = this.f101324a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l4 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f101325a;

        /* JADX WARN: Multi-variable type inference failed */
        public l4(j00.c<? super Integer> cVar) {
            this.f101325a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f101325a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f101325a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101326a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i11, @m80.k xs.e<yz.g2> callback) {
            super("exam_change_mode", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101326a = i11;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ yz.g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return yz.g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("mode", 1, (byte) 8);
            protocol.l5(this.f101326a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        logicException = LogicException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    systemException = SystemException.ADAPTER.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m0 extends xs.d<z8.h0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(@m80.k xs.e<z8.h0> callback) {
            super("get_recommendation", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.h0 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.h0 h0Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    h0Var = z8.h0.f101572c.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (h0Var != null) {
                return h0Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m1 extends xs.d<z8.o> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final z8.n f101327a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m1(@m80.k z8.n req, @m80.k xs.e<z8.o> callback) {
            super("share_bonus_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(req, "req");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101327a = req;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.o receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.o oVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    oVar = z8.o.f101834i.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (oVar != null) {
                return oVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(HiAnalyticsConstant.Direction.REQUEST, 1, (byte) 12);
            z8.n.f101784d.write(protocol, this.f101327a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m2 implements xs.e<z8.m> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.m> f101328a;

        /* JADX WARN: Multi-variable type inference failed */
        public m2(j00.c<? super z8.m> cVar) {
            this.f101328a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.m result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.m> cVar = this.f101328a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.m> cVar = this.f101328a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m3 implements xs.e<List<? extends Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<Integer>> f101329a;

        /* JADX WARN: Multi-variable type inference failed */
        public m3(j00.c<? super List<Integer>> cVar) {
            this.f101329a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<Integer> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<Integer>> cVar = this.f101329a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<Integer>> cVar = this.f101329a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m4 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f101330a;

        /* JADX WARN: Multi-variable type inference failed */
        public m4(j00.c<? super Integer> cVar) {
            this.f101330a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f101330a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f101330a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n extends xs.d<z8.y0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(@m80.k xs.e<z8.y0> callback) {
            super("get_achievement", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.y0 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.y0 y0Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    y0Var = z8.y0.f102280d.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (y0Var != null) {
                return y0Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n0 extends xs.d<List<? extends z8.m0>> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<Integer> f101331a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(@m80.k List<Integer> search_modules, @m80.k xs.e<List<z8.m0>> callback) {
            super("get_search_page_resource", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(search_modules, "search_modules");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101331a = search_modules;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<z8.m0> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            ArrayList arrayList = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(z8.m0.f101760f.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("search_modules", 1, (byte) 15);
            protocol.y2((byte) 8, this.f101331a.size());
            Iterator<Integer> it = this.f101331a.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n1 extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101332a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n1(int i11, @m80.k xs.e<Integer> callback) {
            super("show_color_egg", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101332a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("what", 1, (byte) 8);
            protocol.l5(this.f101332a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n2 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f101333a;

        /* JADX WARN: Multi-variable type inference failed */
        public n2(j00.c<? super Integer> cVar) {
            this.f101333a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f101333a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f101333a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n3 implements xs.e<z8.g0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.g0> f101334a;

        /* JADX WARN: Multi-variable type inference failed */
        public n3(j00.c<? super z8.g0> cVar) {
            this.f101334a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.g0 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.g0> cVar = this.f101334a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.g0> cVar = this.f101334a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n4 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f101335a;

        /* JADX WARN: Multi-variable type inference failed */
        public n4(j00.c<? super Integer> cVar) {
            this.f101335a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f101335a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f101335a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o extends xs.d<z8.h1> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(@m80.k xs.e<z8.h1> callback) {
            super("get_all_books_basic_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.h1 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.h1 h1Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    h1Var = z8.h1.f101576f.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (h1Var != null) {
                return h1Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o0 extends xs.d<z8.p0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(@m80.k xs.e<z8.p0> callback) {
            super("get_study_home", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.p0 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.p0 p0Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    p0Var = z8.p0.f101870f.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (p0Var != null) {
                return p0Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o1 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101336a;

        /* renamed from: b, reason: collision with root package name */
        public final int f101337b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o1(int i11, int i12, @m80.k xs.e<yz.g2> callback) {
            super("study_addition", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101336a = i11;
            this.f101337b = i12;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ yz.g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return yz.g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("add_count", 1, (byte) 8);
            protocol.l5(this.f101336a);
            protocol.N2();
            protocol.Q6("add_type", 2, (byte) 8);
            protocol.l5(this.f101337b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        logicException = LogicException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    systemException = SystemException.ADAPTER.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o2 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f101338a;

        /* JADX WARN: Multi-variable type inference failed */
        public o2(j00.c<? super Integer> cVar) {
            this.f101338a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f101338a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f101338a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o3 implements xs.e<z8.s> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.s> f101339a;

        /* JADX WARN: Multi-variable type inference failed */
        public o3(j00.c<? super z8.s> cVar) {
            this.f101339a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.s result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.s> cVar = this.f101339a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.s> cVar = this.f101339a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o4 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f101340a;

        /* JADX WARN: Multi-variable type inference failed */
        public o4(j00.c<? super Integer> cVar) {
            this.f101340a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f101340a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f101340a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p extends xs.d<z8.h1> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(@m80.k xs.e<z8.h1> callback) {
            super("get_all_books_basic_info_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.h1 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.h1 h1Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    h1Var = z8.h1.f101576f.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (h1Var != null) {
                return h1Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p0 extends xs.d<z8.s0> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101341a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(int i11, @m80.k xs.e<z8.s0> callback) {
            super("get_study_home_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101341a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.s0 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.s0 s0Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    s0Var = z8.s0.f102000d.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (s0Var != null) {
                return s0Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(this.f101341a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p1 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<z8.o0> f101342a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p1(@m80.k List<z8.o0> records, @m80.k xs.e<yz.g2> callback) {
            super("submit_experience_record", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(records, "records");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101342a = records;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ yz.g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return yz.g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("records", 1, (byte) 15);
            protocol.y2((byte) 12, this.f101342a.size());
            Iterator<z8.o0> it = this.f101342a.iterator();
            while (it.hasNext()) {
                z8.o0.f101850e.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        logicException = LogicException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    systemException = SystemException.ADAPTER.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p2 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f101343a;

        /* JADX WARN: Multi-variable type inference failed */
        public p2(j00.c<? super yz.g2> cVar) {
            this.f101343a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f101343a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f101343a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p3 implements xs.e<z8.t> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.t> f101344a;

        /* JADX WARN: Multi-variable type inference failed */
        public p3(j00.c<? super z8.t> cVar) {
            this.f101344a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.t result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.t> cVar = this.f101344a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.t> cVar = this.f101344a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p4 implements xs.e<z8.o> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.o> f101345a;

        /* JADX WARN: Multi-variable type inference failed */
        public p4(j00.c<? super z8.o> cVar) {
            this.f101345a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.o result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.o> cVar = this.f101345a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.o> cVar = this.f101345a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q extends xs.d<z8.h1> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(@m80.k xs.e<z8.h1> callback) {
            super("get_all_books_basic_info_v3", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.h1 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.h1 h1Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    h1Var = z8.h1.f101576f.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (h1Var != null) {
                return h1Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q0 extends xs.d<z8.x0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(@m80.k xs.e<z8.x0> callback) {
            super("get_train_page_resource", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.x0 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.x0 x0Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    x0Var = z8.x0.f102254g.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (x0Var != null) {
                return x0Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q1 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final z8.v0 f101346a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q1(@m80.k z8.v0 req, @m80.k xs.e<yz.g2> callback) {
            super("submit_topic_correction", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(req, "req");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101346a = req;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ yz.g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return yz.g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(HiAnalyticsConstant.Direction.REQUEST, 1, (byte) 12);
            z8.v0.f102124h.write(protocol, this.f101346a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        logicException = LogicException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    systemException = SystemException.ADAPTER.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q2 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f101347a;

        /* JADX WARN: Multi-variable type inference failed */
        public q2(j00.c<? super yz.g2> cVar) {
            this.f101347a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f101347a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f101347a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q3 implements xs.e<z8.h0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.h0> f101348a;

        /* JADX WARN: Multi-variable type inference failed */
        public q3(j00.c<? super z8.h0> cVar) {
            this.f101348a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.h0 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.h0> cVar = this.f101348a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.h0> cVar = this.f101348a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q4 implements xs.e<z8.o> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.o> f101349a;

        /* JADX WARN: Multi-variable type inference failed */
        public q4(j00.c<? super z8.o> cVar) {
            this.f101349a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.o result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.o> cVar = this.f101349a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.o> cVar = this.f101349a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r extends xs.d<List<? extends z8.j1>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(@m80.k xs.e<List<z8.j1>> callback) {
            super("get_all_collect_words_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<z8.j1> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            ArrayList arrayList = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(z8.j1.f101658g.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r0 extends xs.d<z8.d2> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(@m80.k xs.e<z8.d2> callback) {
            super("get_user_study_config", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.d2 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.d2 d2Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    d2Var = z8.d2.f101446h.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (d2Var != null) {
                return d2Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r1 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101350a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<Integer> f101351b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r1(int i11, @m80.k List<Integer> win_streak_dates, @m80.k xs.e<yz.g2> callback) {
            super("submit_win_streak_records", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(win_streak_dates, "win_streak_dates");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101350a = i11;
            this.f101351b = win_streak_dates;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ yz.g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return yz.g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("client_date", 1, (byte) 8);
            protocol.l5(this.f101350a);
            protocol.N2();
            protocol.Q6("win_streak_dates", 2, (byte) 15);
            protocol.y2((byte) 8, this.f101351b.size());
            Iterator<Integer> it = this.f101351b.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        logicException = LogicException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    systemException = SystemException.ADAPTER.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r2 implements xs.e<z8.y0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.y0> f101352a;

        /* JADX WARN: Multi-variable type inference failed */
        public r2(j00.c<? super z8.y0> cVar) {
            this.f101352a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.y0 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.y0> cVar = this.f101352a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.y0> cVar = this.f101352a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r3 implements xs.e<List<? extends z8.m0>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<z8.m0>> f101353a;

        /* JADX WARN: Multi-variable type inference failed */
        public r3(j00.c<? super List<z8.m0>> cVar) {
            this.f101353a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<z8.m0> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<z8.m0>> cVar = this.f101353a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<z8.m0>> cVar = this.f101353a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r4 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f101354a;

        /* JADX WARN: Multi-variable type inference failed */
        public r4(j00.c<? super Integer> cVar) {
            this.f101354a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f101354a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f101354a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class s extends xs.d<List<? extends z8.n0>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(@m80.k xs.e<List<z8.n0>> callback) {
            super("get_all_selected_book_plan_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<z8.n0> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            ArrayList arrayList = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(z8.n0.f101790j.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class s0 extends xs.d<z8.e2> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(@m80.k xs.e<z8.e2> callback) {
            super("get_user_study_mode", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.e2 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.e2 e2Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    e2Var = z8.e2.f101486c.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (e2Var != null) {
                return e2Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class s1 extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final long f101355a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<z8.q1> f101356b;

        /* renamed from: c, reason: collision with root package name */
        public final int f101357c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f101358d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s1(long j11, @m80.k List<z8.q1> arr_done_records, int i11, boolean z11, @m80.k xs.e<Integer> callback) {
            super("update_done_data", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(arr_done_records, "arr_done_records");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101355a = j11;
            this.f101356b = arr_done_records;
            this.f101357c = i11;
            this.f101358d = z11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("last_sync_at", 1, (byte) 10);
            protocol.q7(this.f101355a);
            protocol.N2();
            protocol.Q6("arr_done_records", 2, (byte) 15);
            protocol.y2((byte) 12, this.f101356b.size());
            Iterator<z8.q1> it = this.f101356b.iterator();
            while (it.hasNext()) {
                z8.q1.f101912n.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("current_word_level_id", 3, (byte) 8);
            protocol.l5(this.f101357c);
            protocol.N2();
            protocol.Q6("is_today_completed", 4, (byte) 2);
            protocol.a4(this.f101358d);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class s2 implements xs.e<z8.h1> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.h1> f101359a;

        /* JADX WARN: Multi-variable type inference failed */
        public s2(j00.c<? super z8.h1> cVar) {
            this.f101359a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.h1 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.h1> cVar = this.f101359a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.h1> cVar = this.f101359a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class s3 implements xs.e<z8.p0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.p0> f101360a;

        /* JADX WARN: Multi-variable type inference failed */
        public s3(j00.c<? super z8.p0> cVar) {
            this.f101360a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.p0 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.p0> cVar = this.f101360a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.p0> cVar = this.f101360a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class s4 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f101361a;

        /* JADX WARN: Multi-variable type inference failed */
        public s4(j00.c<? super yz.g2> cVar) {
            this.f101361a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f101361a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f101361a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t extends xs.d<String> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101362a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(int i11, @m80.k xs.e<String> callback) {
            super("get_book_description", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101362a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            String str = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    str = protocol.readString();
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (str != null) {
                return str;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(this.f101362a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t0 extends xs.d<List<? extends z8.j2>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101363a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(int i11, @m80.k xs.e<List<z8.j2>> callback) {
            super("get_word_list_status", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101363a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<z8.j2> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            ArrayList arrayList = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(z8.j2.f101670h.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(this.f101363a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t1 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final z8.k2 f101364a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t1(@m80.k z8.k2 note, @m80.k xs.e<yz.g2> callback) {
            super("update_word_note", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(note, "note");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101364a = note;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ yz.g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return yz.g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("note", 1, (byte) 12);
            z8.k2.f101716e.write(protocol, this.f101364a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        logicException = LogicException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    systemException = SystemException.ADAPTER.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t2 implements xs.e<z8.h1> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.h1> f101365a;

        /* JADX WARN: Multi-variable type inference failed */
        public t2(j00.c<? super z8.h1> cVar) {
            this.f101365a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.h1 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.h1> cVar = this.f101365a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.h1> cVar = this.f101365a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t3 implements xs.e<z8.s0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.s0> f101366a;

        /* JADX WARN: Multi-variable type inference failed */
        public t3(j00.c<? super z8.s0> cVar) {
            this.f101366a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.s0 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.s0> cVar = this.f101366a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.s0> cVar = this.f101366a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t4 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f101367a;

        /* JADX WARN: Multi-variable type inference failed */
        public t4(j00.c<? super yz.g2> cVar) {
            this.f101367a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f101367a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f101367a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101368a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(int i11, @m80.k xs.e<Integer> callback) {
            super("get_book_mode", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101368a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(this.f101368a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u0 extends xs.d<List<? extends z8.k2>> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<Integer> f101369a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(@m80.k List<Integer> topic_ids, @m80.k xs.e<List<z8.k2>> callback) {
            super("get_word_note", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(topic_ids, "topic_ids");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101369a = topic_ids;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<z8.k2> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            ArrayList arrayList = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(z8.k2.f101716e.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("topic_ids", 1, (byte) 15);
            protocol.y2((byte) 8, this.f101369a.size());
            Iterator<Integer> it = this.f101369a.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u1 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101370a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u1(int i11, @m80.k xs.e<yz.g2> callback) {
            super("upgrade_4in1", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101370a = i11;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ yz.g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return yz.g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(this.f101370a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        logicException = LogicException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    systemException = SystemException.ADAPTER.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u2 implements xs.e<z8.h1> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.h1> f101371a;

        /* JADX WARN: Multi-variable type inference failed */
        public u2(j00.c<? super z8.h1> cVar) {
            this.f101371a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.h1 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.h1> cVar = this.f101371a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.h1> cVar = this.f101371a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u3 implements xs.e<z8.x0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.x0> f101372a;

        /* JADX WARN: Multi-variable type inference failed */
        public u3(j00.c<? super z8.x0> cVar) {
            this.f101372a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.x0 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.x0> cVar = this.f101372a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.x0> cVar = this.f101372a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u4 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f101373a;

        /* JADX WARN: Multi-variable type inference failed */
        public u4(j00.c<? super yz.g2> cVar) {
            this.f101373a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f101373a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f101373a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v extends xs.d<z8.g1> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(@m80.k xs.e<z8.g1> callback) {
            super("get_books_japan", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.g1 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.g1 g1Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    g1Var = z8.g1.f101548d.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (g1Var != null) {
                return g1Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v0 extends xs.d<Map<Integer, ? extends Integer>> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<Integer> f101374a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(@m80.k List<Integer> topic_ids, @m80.k xs.e<Map<Integer, Integer>> callback) {
            super("get_word_note_version", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(topic_ids, "topic_ids");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101374a = topic_ids;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<Integer, Integer> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            LinkedHashMap linkedHashMap = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 13) {
                    ws.g O = protocol.O();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(O.f96841c);
                    int i11 = O.f96841c;
                    for (int i12 = 0; i12 < i11; i12++) {
                        linkedHashMap2.put(Integer.valueOf(protocol.s8()), Integer.valueOf(protocol.s8()));
                    }
                    protocol.b6();
                    linkedHashMap = linkedHashMap2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (linkedHashMap != null) {
                return linkedHashMap;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("topic_ids", 1, (byte) 15);
            protocol.y2((byte) 8, this.f101374a.size());
            Iterator<Integer> it = this.f101374a.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v1 extends xs.d<String> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final ByteString f101375a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v1(@m80.k ByteString img, @m80.k xs.e<String> callback) {
            super("upload_img", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(img, "img");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101375a = img;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            String str = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    str = protocol.readString();
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (str != null) {
                return str;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(SocialConstants.PARAM_IMG_URL, 1, (byte) 11);
            protocol.z1(this.f101375a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v2 implements xs.e<List<? extends z8.j1>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<z8.j1>> f101376a;

        /* JADX WARN: Multi-variable type inference failed */
        public v2(j00.c<? super List<z8.j1>> cVar) {
            this.f101376a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<z8.j1> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<z8.j1>> cVar = this.f101376a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<z8.j1>> cVar = this.f101376a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v3 implements xs.e<z8.d2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.d2> f101377a;

        /* JADX WARN: Multi-variable type inference failed */
        public v3(j00.c<? super z8.d2> cVar) {
            this.f101377a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.d2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.d2> cVar = this.f101377a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.d2> cVar = this.f101377a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v4 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f101378a;

        /* JADX WARN: Multi-variable type inference failed */
        public v4(j00.c<? super yz.g2> cVar) {
            this.f101378a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f101378a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f101378a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class w extends xs.d<List<? extends z8.b>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(@m80.k xs.e<List<z8.b>> callback) {
            super("get_books_replace_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<z8.b> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            ArrayList arrayList = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(z8.b.f101165i.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class w0 extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101379a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(int i11, @m80.k xs.e<Integer> callback) {
            super("merge_already_learned_words", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101379a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(this.f101379a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class w1 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<z8.u0> f101380a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w1(@m80.k List<z8.u0> req, @m80.k xs.e<yz.g2> callback) {
            super("upload_task_action", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(req, "req");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101380a = req;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ yz.g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return yz.g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(HiAnalyticsConstant.Direction.REQUEST, 1, (byte) 15);
            protocol.y2((byte) 12, this.f101380a.size());
            Iterator<z8.u0> it = this.f101380a.iterator();
            while (it.hasNext()) {
                z8.u0.f102082d.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        logicException = LogicException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    systemException = SystemException.ADAPTER.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class w2 implements xs.e<List<? extends z8.n0>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<z8.n0>> f101381a;

        /* JADX WARN: Multi-variable type inference failed */
        public w2(j00.c<? super List<z8.n0>> cVar) {
            this.f101381a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<z8.n0> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<z8.n0>> cVar = this.f101381a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<z8.n0>> cVar = this.f101381a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class w3 implements xs.e<z8.e2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.e2> f101382a;

        /* JADX WARN: Multi-variable type inference failed */
        public w3(j00.c<? super z8.e2> cVar) {
            this.f101382a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.e2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.e2> cVar = this.f101382a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.e2> cVar = this.f101382a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class w4 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f101383a;

        /* JADX WARN: Multi-variable type inference failed */
        public w4(j00.c<? super Integer> cVar) {
            this.f101383a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f101383a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f101383a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class x extends xs.d<z8.c> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101384a;

        /* renamed from: b, reason: collision with root package name */
        public final int f101385b;

        /* renamed from: c, reason: collision with root package name */
        public final int f101386c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(int i11, int i12, int i13, @m80.k xs.e<z8.c> callback) {
            super("get_calendar_daily_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101384a = i11;
            this.f101385b = i12;
            this.f101386c = i13;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.c receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.c cVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    cVar = z8.c.f101197h.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (cVar != null) {
                return cVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("date", 1, (byte) 8);
            protocol.l5(this.f101384a);
            protocol.N2();
            protocol.Q6("page_offset", 2, (byte) 8);
            protocol.l5(this.f101385b);
            protocol.N2();
            protocol.Q6("page_size", 3, (byte) 8);
            protocol.l5(this.f101386c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class x0 extends xs.d<String> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101387a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<Integer> f101388b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(int i11, @m80.k List<Integer> old_book_ids, @m80.k xs.e<String> callback) {
            super("merge_already_learned_words_async", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(old_book_ids, "old_book_ids");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101387a = i11;
            this.f101388b = old_book_ids;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            String str = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    str = protocol.readString();
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (str != null) {
                return str;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(this.f101387a);
            protocol.N2();
            protocol.Q6("old_book_ids", 2, (byte) 15);
            protocol.y2((byte) 8, this.f101388b.size());
            Iterator<Integer> it = this.f101388b.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class x1 extends xs.d<z8.a1> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x1(@m80.k xs.e<z8.a1> callback) {
            super("user_basic_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.a1 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.a1 a1Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    a1Var = z8.a1.f101125f.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (a1Var != null) {
                return a1Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class x2 implements xs.e<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<String> f101389a;

        /* JADX WARN: Multi-variable type inference failed */
        public x2(j00.c<? super String> cVar) {
            this.f101389a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k String result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<String> cVar = this.f101389a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<String> cVar = this.f101389a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class x3 implements xs.e<List<? extends z8.j2>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<z8.j2>> f101390a;

        /* JADX WARN: Multi-variable type inference failed */
        public x3(j00.c<? super List<z8.j2>> cVar) {
            this.f101390a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<z8.j2> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<z8.j2>> cVar = this.f101390a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<z8.j2>> cVar = this.f101390a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class x4 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f101391a;

        /* JADX WARN: Multi-variable type inference failed */
        public x4(j00.c<? super yz.g2> cVar) {
            this.f101391a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f101391a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f101391a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class y extends xs.d<z8.e> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(@m80.k xs.e<z8.e> callback) {
            super("get_calendar_resign_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.e receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.e eVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    eVar = z8.e.f101460h.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (eVar != null) {
                return eVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class y0 extends xs.d<z8.e0> {

        /* renamed from: a, reason: collision with root package name */
        public final long f101392a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(long j11, @m80.k xs.e<z8.e0> callback) {
            super("open_box", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101392a = j11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.e0 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.e0 e0Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    e0Var = z8.e0.f101474d.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (e0Var != null) {
                return e0Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("client_timestamp_ms", 1, (byte) 10);
            protocol.q7(this.f101392a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class y1 extends xs.d<z8.b1> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y1(@m80.k xs.e<z8.b1> callback) {
            super("user_basic_info_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.b1 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.b1 b1Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    b1Var = z8.b1.f101189e.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (b1Var != null) {
                return b1Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class y2 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f101393a;

        /* JADX WARN: Multi-variable type inference failed */
        public y2(j00.c<? super Integer> cVar) {
            this.f101393a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f101393a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f101393a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class y3 implements xs.e<List<? extends z8.k2>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<z8.k2>> f101394a;

        /* JADX WARN: Multi-variable type inference failed */
        public y3(j00.c<? super List<z8.k2>> cVar) {
            this.f101394a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<z8.k2> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<z8.k2>> cVar = this.f101394a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<z8.k2>> cVar = this.f101394a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class y4 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f101395a;

        /* JADX WARN: Multi-variable type inference failed */
        public y4(j00.c<? super yz.g2> cVar) {
            this.f101395a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f101395a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f101395a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class z extends xs.d<Long> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(@m80.k xs.e<Long> callback) {
            super("get_collect_words_updated_at", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            Long l11 = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 10) {
                    l11 = Long.valueOf(protocol.T1());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (l11 != null) {
                return l11;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class z0 extends xs.d<String> {

        /* renamed from: a, reason: collision with root package name */
        public final int f101396a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(int i11, @m80.k xs.e<String> callback) {
            super("receive_task_award", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101396a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            String str = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    str = protocol.readString();
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (str != null) {
                return str;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("task_id", 1, (byte) 8);
            protocol.l5(this.f101396a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class z1 extends xs.d<z8.n1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final z8.m1 f101397a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z1(@m80.k z8.m1 daka_request, @m80.k xs.e<z8.n1> callback) {
            super("user_daka_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(daka_request, "daka_request");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f101397a = daka_request;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z8.n1 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            z8.n1 n1Var = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    n1Var = z8.n1.f101808n.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (n1Var != null) {
                return n1Var;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("daka_request", 1, (byte) 12);
            z8.m1.f101770h.write(protocol, this.f101397a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class z2 implements xs.e<z8.g1> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<z8.g1> f101398a;

        /* JADX WARN: Multi-variable type inference failed */
        public z2(j00.c<? super z8.g1> cVar) {
            this.f101398a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k z8.g1 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<z8.g1> cVar = this.f101398a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<z8.g1> cVar = this.f101398a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class z3 implements xs.e<Map<Integer, ? extends Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Map<Integer, Integer>> f101399a;

        /* JADX WARN: Multi-variable type inference failed */
        public z3(j00.c<? super Map<Integer, Integer>> cVar) {
            this.f101399a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k Map<Integer, Integer> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<Map<Integer, Integer>> cVar = this.f101399a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Map<Integer, Integer>> cVar = this.f101399a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class z4 implements xs.e<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<String> f101400a;

        /* JADX WARN: Multi-variable type inference failed */
        public z4(j00.c<? super String> cVar) {
            this.f101400a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k String result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<String> cVar = this.f101400a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<String> cVar = this.f101400a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(@m80.k ws.i protocol, @m80.k a.InterfaceC0480a listener) {
        super(protocol, listener);
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        kotlin.jvm.internal.g0.p(listener, "listener");
    }

    @Override // z8.b2
    @m80.l
    public Object A8(@m80.k z8.l1 l1Var, @m80.k z8.l1 l1Var2, @m80.k j00.c<? super z8.k1> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new d0(l1Var, l1Var2, new h3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object C(@m80.k j00.c<? super z8.y0> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new n(new r2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object C1(int i11, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new j1(i11, new n4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object C2(int i11, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new b1(i11, new f4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // z8.b2
    @m80.l
    public Object C3(@m80.k j00.c<? super z8.h0> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new m0(new q3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object D3(@m80.k j00.c<? super z8.s> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new k0(new o3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object D7(@m80.k j00.c<? super z8.b1> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new y1(new c5(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object D8(@m80.k j00.c<? super z8.i> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new f(new j2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object E1(@m80.k j00.c<? super List<z8.n0>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new s(new w2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object E2(int i11, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new l(i11, new p2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // z8.b2
    @m80.l
    public Object E4(int i11, @m80.k List<Integer> list, @m80.k j00.c<? super String> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new x0(i11, list, new b4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object F2(int i11, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new i1(i11, new m4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object F5(int i11, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new c1(i11, new g4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object F7(@m80.k j00.c<? super z8.p0> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new o0(new s3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object G0(@m80.k j00.c<? super z8.h1> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new o(new s2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object H4(int i11, @m80.k List<Integer> list, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new r1(i11, list, new v4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // z8.b2
    @m80.l
    public Object I3(int i11, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new m(i11, new q2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // z8.b2
    @m80.l
    public Object J4(@m80.k z8.m1 m1Var, @m80.k j00.c<? super z8.n1> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new z1(m1Var, new d5(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object J8(int i11, int i12, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new o1(i11, i12, new s4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // z8.b2
    @m80.l
    public Object L1(long j11, @m80.k j00.c<? super Boolean> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new c(j11, new g2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object L4(int i11, @m80.k List<Integer> list, @m80.k j00.c<? super List<z8.j2>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new d(i11, list, new h2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object M8(long j11, @m80.k List<z8.q1> list, int i11, boolean z11, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new s1(j11, list, i11, z11, new w4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object N7(@m80.k String str, @m80.k j00.c<? super z8.b0> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new h0(str, new l3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object O2(@m80.k List<z8.u0> list, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new w1(list, new a5(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // z8.b2
    @m80.l
    public Object O7(long j11, @m80.k j00.c<? super z8.e0> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new y0(j11, new c4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object P1(int i11, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new k(i11, new o2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object P7(int i11, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new f1(i11, new j4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // z8.b2
    @m80.l
    public Object Q0(@m80.k j00.c<? super z8.w> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new e0(new i3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object Q2(int i11, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new n1(i11, new r4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object R0(int i11, @m80.k j00.c<? super List<z8.j2>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new t0(i11, new x3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object S4(int i11, @m80.k j00.c<? super List<z8.u1>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new f0(i11, new j3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object S7(@m80.k j00.c<? super z8.h1> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new p(new t2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object T3(@m80.k j00.c<? super z8.g1> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new v(new z2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object U4(@m80.k List<Integer> list, @m80.k j00.c<? super z8.l> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new c0(list, new g3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object U5(@m80.k j00.c<? super z8.v1> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new b2(new f5(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object X5(@m80.k String str, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new h1(str, new l4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object Y0(@m80.k j00.c<? super z8.a1> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new x1(new b5(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object Y4(int i11, @m80.k List<Integer> list, @m80.k j00.c<? super List<z8.j2>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new g(i11, list, new k2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object Z(int i11, int i12, int i13, int i14, int i15, @m80.k j00.c<? super z8.a2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new e1(i11, i12, i13, i14, i15, new i4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object Z2(int i11, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new u1(i11, new y4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // z8.b2
    @m80.l
    public Object a5(int i11, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new w0(i11, new a4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object b7(@m80.k List<Integer> list, @m80.k j00.c<? super List<z8.m0>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new n0(list, new r3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object f1(@m80.k j00.c<? super List<z8.b>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new w(new a3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object f7(@m80.k j00.c<? super z8.g0> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new j0(new n3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object g3(int i11, @m80.k j00.c<? super z8.i2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new d2(i11, new h5(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object g5(@m80.k j00.c<? super z8.e2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new s0(new w3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object g7(int i11, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new k1(i11, new o4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object h0(@m80.k j00.c<? super z8.j> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new b0(new f3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object i2(@m80.k List<Integer> list, @m80.k j00.c<? super List<z8.k2>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new u0(list, new y3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object i3(@m80.k j00.c<? super z8.d2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new r0(new v3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object i7(int i11, @m80.k j00.c<? super String> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new t(i11, new x2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object i8(@m80.k j00.c<? super z8.h1> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new q(new u2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object j3(int i11, @m80.k j00.c<? super z8.s0> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new p0(i11, new t3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object j7(int i11, @m80.k j00.c<? super z8.f> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new a0(i11, new e3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object j8(@m80.k List<z8.i1> list, long j11, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new a(list, j11, new e2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object k0(@m80.k j00.c<? super z8.x0> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new q0(new u3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object k2(@m80.k z8.n nVar, @m80.k j00.c<? super z8.o> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new m1(nVar, new q4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object l1(@m80.k j00.c<? super Long> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new z(new d3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object l6(@m80.k j00.c<? super z8.w1> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new C1388c2(new g5(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object m0(@m80.k List<z8.i1> list, long j11, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new j(list, j11, new n2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object m1(@m80.k j00.c<? super z8.t> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new l0(new p3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object m6(long j11, @m80.k j00.c<? super z8.o> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new l1(j11, new p4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object m8(int i11, @m80.k List<Integer> list, @m80.k j00.c<? super List<z8.j2>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new a1(i11, list, new e4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object n3(int i11, @m80.k j00.c<? super String> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new z0(i11, new d4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object n7(@m80.k j00.c<? super z8.e> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new y(new c3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object o0(int i11, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new g1(i11, new k4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object o3(@m80.k j00.c<? super z8.z> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new g0(new k3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object o4(@m80.k ByteString byteString, @m80.k j00.c<? super String> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new v1(byteString, new z4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object o5(@m80.k z8.g gVar, @m80.k j00.c<? super z8.h> cVar) {
        j00.g gVar2 = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new e(gVar, new i2(gVar2)));
        Object b11 = gVar2.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object o6(@m80.k List<z8.o0> list, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new p1(list, new t4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // z8.b2
    @m80.l
    public Object p2(long j11, long j12, @m80.k j00.c<? super z8.m> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new h(j11, j12, new l2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object p7(int i11, int i12, @m80.k j00.c<? super z8.r1> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new a2(i11, i12, new e5(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object q2(int i11, int i12, int i13, @m80.k j00.c<? super z8.c> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new x(i11, i12, i13, new b3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object q4(@m80.k z8.v0 v0Var, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new q1(v0Var, new u4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // z8.b2
    @m80.l
    public Object r4(@m80.k List<Integer> list, @m80.k j00.c<? super Map<Integer, Integer>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new v0(list, new z3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object t1(@m80.k z8.k2 k2Var, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new t1(k2Var, new x4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // z8.b2
    @m80.l
    public Object t3(@m80.k j00.c<? super List<z8.j1>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new r(new v2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object t5(@m80.k String str, long j11, @m80.k j00.c<? super z8.m> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new i(str, j11, new m2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object t6(@m80.k j00.c<? super List<Integer>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new i0(new m3(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object t8(int i11, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new u(i11, new y2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object w0(@m80.k j00.c<? super List<z8.d0>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new b(new f2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // z8.b2
    @m80.l
    public Object x6(int i11, @m80.k j00.c<? super List<z8.y1>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new d1(i11, new h4(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }
}
