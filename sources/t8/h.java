package t8;

import com.baicizhan.biz.online.resource_api.GetTopicResourceChannel;
import com.baicizhan.biz.online.resource_api.WordBugType;
import com.baicizhan.biz.online.thrift.basic.LogicException;
import com.baicizhan.biz.online.thrift.basic.SystemException;
import com.baicizhan.client.business.dataset.provider.a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.thrifty.ThriftException;
import com.microsoft.thrifty.service.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h extends com.microsoft.thrifty.service.b implements t8.g {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends xs.d<t8.a> {

        /* renamed from: a, reason: collision with root package name */
        public final int f90033a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, @m80.k xs.e<t8.a> callback) {
            super("get_book_resource_update_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90033a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t8.a receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            t8.a aVar = null;
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
                    aVar = t8.a.f89972h.read(protocol);
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
            if (aVar != null) {
                return aVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(ma.b.f72894c, 1, (byte) 8);
            protocol.l5(this.f90033a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a0 implements xs.e<List<? extends t8.t>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<t8.t>> f90034a;

        /* JADX WARN: Multi-variable type inference failed */
        public a0(j00.c<? super List<t8.t>> cVar) {
            this.f90034a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<t8.t> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<t8.t>> cVar = this.f90034a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<t8.t>> cVar = this.f90034a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends xs.d<t8.s> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f90035a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k String word, @m80.k xs.e<t8.s> callback) {
            super("get_dict_by_word_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(word, "word");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90035a = word;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t8.s receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            t8.s sVar = null;
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
                    sVar = t8.s.f90241k.read(protocol);
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
            protocol.Q6("word", 1, (byte) 11);
            protocol.p1(this.f90035a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b0 implements xs.e<List<? extends t8.t>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<t8.t>> f90036a;

        /* JADX WARN: Multi-variable type inference failed */
        public b0(j00.c<? super List<t8.t>> cVar) {
            this.f90036a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<t8.t> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<t8.t>> cVar = this.f90036a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<t8.t>> cVar = this.f90036a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends xs.d<t8.b> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f90037a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k String word, @m80.k xs.e<t8.b> callback) {
            super("get_dict_wiki_by_word", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(word, "word");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90037a = word;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t8.b receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            t8.b bVar = null;
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
                    bVar = t8.b.f89986e.read(protocol);
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
            if (bVar != null) {
                return bVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("word", 1, (byte) 11);
            protocol.p1(this.f90037a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c0 implements xs.e<List<? extends t8.v>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<t8.v>> f90038a;

        /* JADX WARN: Multi-variable type inference failed */
        public c0(j00.c<? super List<t8.v>> cVar) {
            this.f90038a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<t8.v> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<t8.v>> cVar = this.f90038a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<t8.v>> cVar = this.f90038a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends xs.d<List<? extends t8.c>> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final t8.e f90039a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k t8.e req, @m80.k xs.e<List<t8.c>> callback) {
            super("get_game_word_list", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(req, "req");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90039a = req;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<t8.c> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
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
                        arrayList2.add(t8.c.f89994f.read(protocol));
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
            protocol.Q6(HiAnalyticsConstant.Direction.REQUEST, 1, (byte) 12);
            t8.e.f90010d.write(protocol, this.f90039a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d0 implements xs.e<t8.x> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<t8.x> f90040a;

        /* JADX WARN: Multi-variable type inference failed */
        public d0(j00.c<? super t8.x> cVar) {
            this.f90040a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k t8.x result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<t8.x> cVar = this.f90040a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<t8.x> cVar = this.f90040a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends xs.d<List<? extends t8.d>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f90041a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i11, @m80.k xs.e<List<t8.d>> callback) {
            super("get_game_word_update_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90041a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<t8.d> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
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
                        arrayList2.add(t8.d.f90004d.read(protocol));
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
            protocol.l5(this.f90041a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e0 implements xs.e<List<? extends t8.y>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<t8.y>> f90042a;

        /* JADX WARN: Multi-variable type inference failed */
        public e0(j00.c<? super List<t8.y>> cVar) {
            this.f90042a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<t8.y> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<t8.y>> cVar = this.f90042a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<t8.y>> cVar = this.f90042a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends xs.d<List<? extends t8.u>> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<Integer> f90043a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@m80.k List<Integer> topic_ids, @m80.k xs.e<List<t8.u>> callback) {
            super("get_media_by_topic_ids", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(topic_ids, "topic_ids");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90043a = topic_ids;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<t8.u> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
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
                        arrayList2.add(t8.u.f90271o.read(protocol));
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
            protocol.y2((byte) 8, this.f90043a.size());
            Iterator<Integer> it = this.f90043a.iterator();
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
    public static final class f0 implements xs.e<List<? extends t8.z>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<t8.z>> f90044a;

        /* JADX WARN: Multi-variable type inference failed */
        public f0(j00.c<? super List<t8.z>> cVar) {
            this.f90044a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<t8.z> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<t8.z>> cVar = this.f90044a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<t8.z>> cVar = this.f90044a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends xs.d<t8.p> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final t8.o f90045a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final GetTopicResourceChannel f90046b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f90047c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f90048d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f90049e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f90050f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f90051g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@m80.k t8.o key, @m80.k GetTopicResourceChannel channel, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @m80.k xs.e<t8.p> callback) {
            super("get_topic_resource_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(key, "key");
            kotlin.jvm.internal.g0.p(channel, "channel");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90045a = key;
            this.f90046b = channel;
            this.f90047c = z11;
            this.f90048d = z12;
            this.f90049e = z13;
            this.f90050f = z14;
            this.f90051g = z15;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t8.p receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            t8.p pVar = null;
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
                    pVar = t8.p.f90159g.read(protocol);
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
            if (pVar != null) {
                return pVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(a.d.C0245a.f16161a, 1, (byte) 12);
            t8.o.f90151e.write(protocol, this.f90045a);
            protocol.N2();
            protocol.Q6("channel", 2, (byte) 8);
            protocol.l5(this.f90046b.value);
            protocol.N2();
            protocol.Q6("with_zpk", 3, (byte) 2);
            protocol.a4(this.f90047c);
            protocol.N2();
            protocol.Q6("with_dict", 4, (byte) 2);
            protocol.a4(this.f90048d);
            protocol.N2();
            protocol.Q6("with_dict_wiki", 5, (byte) 2);
            protocol.a4(this.f90049e);
            protocol.N2();
            protocol.Q6("with_media", 6, (byte) 2);
            protocol.a4(this.f90050f);
            protocol.N2();
            protocol.Q6("with_similal_words", 7, (byte) 2);
            protocol.a4(this.f90051g);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g0 implements xs.e<List<? extends t8.j>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<t8.j>> f90052a;

        /* JADX WARN: Multi-variable type inference failed */
        public g0(j00.c<? super List<t8.j>> cVar) {
            this.f90052a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<t8.j> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<t8.j>> cVar = this.f90052a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<t8.j>> cVar = this.f90052a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: t8.h$h, reason: collision with other inner class name */
    public static final class C1195h extends xs.d<String> {

        /* renamed from: a, reason: collision with root package name */
        public final int f90053a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1195h(int i11, @m80.k xs.e<String> callback) {
            super("get_topic_resource_v3", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90053a = i11;
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
            protocol.Q6("topicId", 1, (byte) 8);
            protocol.l5(this.f90053a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h0 implements xs.e<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<g2> f90054a;

        /* JADX WARN: Multi-variable type inference failed */
        public h0(j00.c<? super g2> cVar) {
            this.f90054a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<g2> cVar = this.f90054a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<g2> cVar = this.f90054a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends xs.d<List<? extends t8.t>> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<t8.o> f90055a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(@m80.k List<t8.o> keys, @m80.k xs.e<List<t8.t>> callback) {
            super("get_word_list_word_meta_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(keys, "keys");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90055a = keys;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<t8.t> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
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
                        arrayList2.add(t8.t.f90261f.read(protocol));
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
            protocol.Q6("keys", 1, (byte) 15);
            protocol.y2((byte) 12, this.f90055a.size());
            Iterator<t8.o> it = this.f90055a.iterator();
            while (it.hasNext()) {
                t8.o.f90151e.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i0 implements xs.e<com.baicizhan.biz.online.resource_api.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<com.baicizhan.biz.online.resource_api.a> f90056a;

        /* JADX WARN: Multi-variable type inference failed */
        public i0(j00.c<? super com.baicizhan.biz.online.resource_api.a> cVar) {
            this.f90056a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k com.baicizhan.biz.online.resource_api.a result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<com.baicizhan.biz.online.resource_api.a> cVar = this.f90056a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<com.baicizhan.biz.online.resource_api.a> cVar = this.f90056a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends xs.d<List<? extends t8.t>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f90057a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i11, @m80.k xs.e<List<t8.t>> callback) {
            super("get_word_list_word_meta_v3", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90057a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<t8.t> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
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
                        arrayList2.add(t8.t.f90261f.read(protocol));
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
            protocol.l5(this.f90057a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j0 implements xs.e<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<g2> f90058a;

        /* JADX WARN: Multi-variable type inference failed */
        public j0(j00.c<? super g2> cVar) {
            this.f90058a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<g2> cVar = this.f90058a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<g2> cVar = this.f90058a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k extends xs.d<List<? extends t8.v>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f90059a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i11, @m80.k xs.e<List<t8.v>> callback) {
            super("get_word_media_update_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90059a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<t8.v> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
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
                        arrayList2.add(t8.v.f90299f.read(protocol));
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
            protocol.l5(this.f90059a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l extends xs.d<t8.x> {

        /* renamed from: a, reason: collision with root package name */
        public final int f90060a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(int i11, @m80.k xs.e<t8.x> callback) {
            super("get_word_root", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90060a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t8.x receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            t8.x xVar = null;
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
                    xVar = t8.x.f90315d.read(protocol);
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
            if (xVar != null) {
                return xVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(this.f90060a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m extends xs.d<List<? extends t8.y>> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<t8.o> f90061a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(@m80.k List<t8.o> keys, @m80.k xs.e<List<t8.y>> callback) {
            super("get_zpk_infos", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(keys, "keys");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90061a = keys;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<t8.y> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
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
                        arrayList2.add(t8.y.f90321g.read(protocol));
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
            protocol.Q6("keys", 1, (byte) 15);
            protocol.y2((byte) 12, this.f90061a.size());
            Iterator<t8.o> it = this.f90061a.iterator();
            while (it.hasNext()) {
                t8.o.f90151e.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n extends xs.d<List<? extends t8.z>> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<t8.o> f90062a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(@m80.k List<t8.o> keys, @m80.k xs.e<List<t8.z>> callback) {
            super("get_zpk_md5s", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(keys, "keys");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90062a = keys;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<t8.z> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
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
                        arrayList2.add(t8.z.f90333g.read(protocol));
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
            protocol.Q6("keys", 1, (byte) 15);
            protocol.y2((byte) 12, this.f90062a.size());
            Iterator<t8.o> it = this.f90062a.iterator();
            while (it.hasNext()) {
                t8.o.f90151e.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o extends xs.d<List<? extends t8.j>> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f90063a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(@m80.k String query_str, @m80.k xs.e<List<t8.j>> callback) {
            super("search_word_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(query_str, "query_str");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90063a = query_str;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<t8.j> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
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
                        arrayList2.add(t8.j.f90089f.read(protocol));
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
            protocol.Q6("query_str", 1, (byte) 11);
            protocol.p1(this.f90063a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p extends xs.d<g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f90064a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f90065b;

        /* renamed from: c, reason: collision with root package name */
        public final int f90066c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(@m80.k String source, @m80.k String trans, int i11, @m80.k xs.e<g2> callback) {
            super("submit_translate_bug", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(source, "source");
            kotlin.jvm.internal.g0.p(trans, "trans");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90064a = source;
            this.f90065b = trans;
            this.f90066c = i11;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("source", 1, (byte) 11);
            protocol.p1(this.f90064a);
            protocol.N2();
            protocol.Q6("trans", 2, (byte) 11);
            protocol.p1(this.f90065b);
            protocol.N2();
            protocol.Q6(ma.b.f72911h1, 3, (byte) 8);
            protocol.l5(this.f90066c);
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
    public static final class q extends xs.d<com.baicizhan.biz.online.resource_api.a> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f90067a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(@m80.k String source, @m80.k xs.e<com.baicizhan.biz.online.resource_api.a> callback) {
            super("translate_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(source, "source");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90067a = source;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.baicizhan.biz.online.resource_api.a receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            com.baicizhan.biz.online.resource_api.a aVar = null;
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
                    aVar = com.baicizhan.biz.online.resource_api.a.f15935f.read(protocol);
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
            if (aVar != null) {
                return aVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("source", 1, (byte) 11);
            protocol.p1(this.f90067a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r extends xs.d<g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final t8.o f90068a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<WordBugType> f90069b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(@m80.k t8.o key, @m80.k List<? extends WordBugType> types, @m80.k xs.e<g2> callback) {
            super("word_bug_report", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(key, "key");
            kotlin.jvm.internal.g0.p(types, "types");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f90068a = key;
            this.f90069b = types;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(a.d.C0245a.f16161a, 1, (byte) 12);
            t8.o.f90151e.write(protocol, this.f90068a);
            protocol.N2();
            protocol.Q6("types", 2, (byte) 15);
            protocol.y2((byte) 8, this.f90069b.size());
            Iterator<WordBugType> it = this.f90069b.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().value);
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
    public static final class s implements xs.e<t8.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<t8.a> f90070a;

        /* JADX WARN: Multi-variable type inference failed */
        public s(j00.c<? super t8.a> cVar) {
            this.f90070a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k t8.a result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<t8.a> cVar = this.f90070a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<t8.a> cVar = this.f90070a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t implements xs.e<t8.s> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<t8.s> f90071a;

        /* JADX WARN: Multi-variable type inference failed */
        public t(j00.c<? super t8.s> cVar) {
            this.f90071a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k t8.s result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<t8.s> cVar = this.f90071a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<t8.s> cVar = this.f90071a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u implements xs.e<t8.b> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<t8.b> f90072a;

        /* JADX WARN: Multi-variable type inference failed */
        public u(j00.c<? super t8.b> cVar) {
            this.f90072a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k t8.b result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<t8.b> cVar = this.f90072a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<t8.b> cVar = this.f90072a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v implements xs.e<List<? extends t8.c>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<t8.c>> f90073a;

        /* JADX WARN: Multi-variable type inference failed */
        public v(j00.c<? super List<t8.c>> cVar) {
            this.f90073a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<t8.c> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<t8.c>> cVar = this.f90073a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<t8.c>> cVar = this.f90073a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class w implements xs.e<List<? extends t8.d>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<t8.d>> f90074a;

        /* JADX WARN: Multi-variable type inference failed */
        public w(j00.c<? super List<t8.d>> cVar) {
            this.f90074a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<t8.d> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<t8.d>> cVar = this.f90074a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<t8.d>> cVar = this.f90074a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class x implements xs.e<List<? extends t8.u>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<t8.u>> f90075a;

        /* JADX WARN: Multi-variable type inference failed */
        public x(j00.c<? super List<t8.u>> cVar) {
            this.f90075a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<t8.u> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<t8.u>> cVar = this.f90075a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<t8.u>> cVar = this.f90075a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class y implements xs.e<t8.p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<t8.p> f90076a;

        /* JADX WARN: Multi-variable type inference failed */
        public y(j00.c<? super t8.p> cVar) {
            this.f90076a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k t8.p result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<t8.p> cVar = this.f90076a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<t8.p> cVar = this.f90076a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class z implements xs.e<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<String> f90077a;

        /* JADX WARN: Multi-variable type inference failed */
        public z(j00.c<? super String> cVar) {
            this.f90077a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k String result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<String> cVar = this.f90077a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<String> cVar = this.f90077a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@m80.k ws.i protocol, @m80.k a.InterfaceC0480a listener) {
        super(protocol, listener);
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        kotlin.jvm.internal.g0.p(listener, "listener");
    }

    @Override // t8.g
    @m80.l
    public Object A3(int i11, @m80.k j00.c<? super List<t8.v>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new k(i11, new c0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // t8.g
    @m80.l
    public Object C6(@m80.k List<t8.o> list, @m80.k j00.c<? super List<t8.t>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new i(list, new a0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // t8.g
    @m80.l
    public Object G1(@m80.k t8.e eVar, @m80.k j00.c<? super List<t8.c>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new d(eVar, new v(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // t8.g
    @m80.l
    public Object J3(int i11, @m80.k j00.c<? super List<t8.t>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new j(i11, new b0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // t8.g
    @m80.l
    public Object M1(@m80.k String str, @m80.k String str2, int i11, @m80.k j00.c<? super g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new p(str, str2, i11, new h0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    @Override // t8.g
    @m80.l
    public Object M4(int i11, @m80.k j00.c<? super String> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new C1195h(i11, new z(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // t8.g
    @m80.l
    public Object N8(@m80.k String str, @m80.k j00.c<? super t8.s> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new b(str, new t(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // t8.g
    @m80.l
    public Object P3(int i11, @m80.k j00.c<? super List<t8.d>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new e(i11, new w(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // t8.g
    @m80.l
    public Object c3(@m80.k String str, @m80.k j00.c<? super t8.b> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new c(str, new u(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // t8.g
    @m80.l
    public Object j(@m80.k List<t8.o> list, @m80.k j00.c<? super List<t8.y>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new m(list, new e0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // t8.g
    @m80.l
    public Object j1(@m80.k List<t8.o> list, @m80.k j00.c<? super List<t8.z>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new n(list, new f0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // t8.g
    @m80.l
    public Object j5(@m80.k String str, @m80.k j00.c<? super com.baicizhan.biz.online.resource_api.a> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new q(str, new i0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // t8.g
    @m80.l
    public Object q5(int i11, @m80.k j00.c<? super t8.x> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new l(i11, new d0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // t8.g
    @m80.l
    public Object q8(int i11, @m80.k j00.c<? super t8.a> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new a(i11, new s(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // t8.g
    @m80.l
    public Object s2(@m80.k List<Integer> list, @m80.k j00.c<? super List<t8.u>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new f(list, new x(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // t8.g
    @m80.l
    public Object s5(@m80.k t8.o oVar, @m80.k GetTopicResourceChannel getTopicResourceChannel, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @m80.k j00.c<? super t8.p> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new g(oVar, getTopicResourceChannel, z11, z12, z13, z14, z15, new y(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // t8.g
    @m80.l
    public Object w7(@m80.k String str, @m80.k j00.c<? super List<t8.j>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new o(str, new g0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // t8.g
    @m80.l
    public Object z8(@m80.k t8.o oVar, @m80.k List<? extends WordBugType> list, @m80.k j00.c<? super g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new r(oVar, list, new j0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }
}
