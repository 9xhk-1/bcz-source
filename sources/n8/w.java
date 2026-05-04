package n8;

import com.baicizhan.biz.online.structs.BELogicException;
import com.baicizhan.biz.online.structs.BESystemException;
import com.baicizhan.client.video.activity.TVPlayActivity;
import com.microsoft.thrifty.ThriftException;
import com.microsoft.thrifty.service.a;
import ix.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class w extends com.microsoft.thrifty.service.b implements n8.v {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends xs.d<List<? extends n8.c>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f74900a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, @m80.k xs.e<List<n8.c>> callback) {
            super("get_exam_audios", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74900a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<n8.c> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(n8.c.f74629h.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
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
            protocol.Q6("exam_id", 1, (byte) 8);
            protocol.l5(this.f74900a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a0 implements xs.e<List<? extends n8.d>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<n8.d>> f74901a;

        /* JADX WARN: Multi-variable type inference failed */
        public a0(j00.c<? super List<n8.d>> cVar) {
            this.f74901a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<n8.d> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<n8.d>> cVar = this.f74901a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<n8.d>> cVar = this.f74901a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends xs.d<List<? extends n8.d>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k xs.e<List<n8.d>> callback) {
            super("get_exam_categories", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<n8.d> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(n8.d.f74643f.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
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
    public static final class b0 implements xs.e<List<? extends n8.b>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<n8.b>> f74902a;

        /* JADX WARN: Multi-variable type inference failed */
        public b0(j00.c<? super List<n8.b>> cVar) {
            this.f74902a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<n8.b> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<n8.b>> cVar = this.f74902a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<n8.b>> cVar = this.f74902a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends xs.d<List<? extends n8.b>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f74903a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i11, @m80.k xs.e<List<n8.b>> callback) {
            super("get_exams", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74903a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<n8.b> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(n8.b.f74623d.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
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
            protocol.Q6("category_id", 1, (byte) 8);
            protocol.l5(this.f74903a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c0 implements xs.e<List<? extends n8.h>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<n8.h>> f74904a;

        /* JADX WARN: Multi-variable type inference failed */
        public c0(j00.c<? super List<n8.h>> cVar) {
            this.f74904a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<n8.h> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<n8.h>> cVar = this.f74904a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<n8.h>> cVar = this.f74904a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends xs.d<List<? extends n8.h>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f74905a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i11, @m80.k xs.e<List<n8.h>> callback) {
            super("get_reading_plan_details", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74905a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<n8.h> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(n8.h.f74685i.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
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
            protocol.Q6("plan_id", 1, (byte) 8);
            protocol.l5(this.f74905a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d0 implements xs.e<List<? extends n8.g>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<n8.g>> f74906a;

        /* JADX WARN: Multi-variable type inference failed */
        public d0(j00.c<? super List<n8.g>> cVar) {
            this.f74906a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<n8.g> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<n8.g>> cVar = this.f74906a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<n8.g>> cVar = this.f74906a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends xs.d<List<? extends n8.g>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k xs.e<List<n8.g>> callback) {
            super("get_reading_plans", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<n8.g> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(n8.g.f74667j.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
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
    public static final class e0 implements xs.e<n8.q> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<n8.q> f74907a;

        /* JADX WARN: Multi-variable type inference failed */
        public e0(j00.c<? super n8.q> cVar) {
            this.f74907a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k n8.q result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<n8.q> cVar = this.f74907a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<n8.q> cVar = this.f74907a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends xs.d<n8.q> {

        /* renamed from: a, reason: collision with root package name */
        public final int f74908a;

        /* renamed from: b, reason: collision with root package name */
        public final int f74909b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i11, int i12, @m80.k xs.e<n8.q> callback) {
            super("get_search_word_package", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74908a = i11;
            this.f74909b = i12;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n8.q receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
            n8.q qVar = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    qVar = n8.q.f74845i.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
            }
            if (qVar != null) {
                return qVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("prefer_word_level_id", 1, (byte) 8);
            protocol.l5(this.f74908a);
            protocol.N2();
            protocol.Q6("topic_id", 2, (byte) 8);
            protocol.l5(this.f74909b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f0 implements xs.e<List<? extends n8.i>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<n8.i>> f74910a;

        /* JADX WARN: Multi-variable type inference failed */
        public f0(j00.c<? super List<n8.i>> cVar) {
            this.f74910a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<n8.i> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<n8.i>> cVar = this.f74910a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<n8.i>> cVar = this.f74910a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends xs.d<List<? extends n8.i>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f74911a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<Integer> f74912b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i11, @m80.k List<Integer> arr_topic_ids, @m80.k xs.e<List<n8.i>> callback) {
            super("get_similar_words_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(arr_topic_ids, "arr_topic_ids");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74911a = i11;
            this.f74912b = arr_topic_ids;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<n8.i> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
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
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(n8.i.f74701g.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
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
            protocol.l5(this.f74911a);
            protocol.N2();
            protocol.Q6("arr_topic_ids", 2, (byte) 15);
            protocol.y2((byte) 8, this.f74912b.size());
            Iterator<Integer> it = this.f74912b.iterator();
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
    public static final class g0 implements xs.e<List<? extends n8.p>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<n8.p>> f74913a;

        /* JADX WARN: Multi-variable type inference failed */
        public g0(j00.c<? super List<n8.p>> cVar) {
            this.f74913a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<n8.p> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<n8.p>> cVar = this.f74913a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<n8.p>> cVar = this.f74913a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends xs.d<List<? extends n8.p>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f74914a;

        /* renamed from: b, reason: collision with root package name */
        public final int f74915b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i11, int i12, @m80.k xs.e<List<n8.p>> callback) {
            super("get_video_list_explore", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74914a = i11;
            this.f74915b = i12;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<n8.p> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(n8.p.f74823l.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
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
            protocol.Q6("last_topic_id", 1, (byte) 8);
            protocol.l5(this.f74914a);
            protocol.N2();
            protocol.Q6(g.b.f62794h, 2, (byte) 8);
            protocol.l5(this.f74915b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h0 implements xs.e<List<? extends n8.p>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<n8.p>> f74916a;

        /* JADX WARN: Multi-variable type inference failed */
        public h0(j00.c<? super List<n8.p>> cVar) {
            this.f74916a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<n8.p> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<n8.p>> cVar = this.f74916a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<n8.p>> cVar = this.f74916a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends xs.d<List<? extends n8.p>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f74917a;

        /* renamed from: b, reason: collision with root package name */
        public final int f74918b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i11, int i12, @m80.k xs.e<List<n8.p>> callback) {
            super("get_video_list_explore_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74917a = i11;
            this.f74918b = i12;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<n8.p> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(n8.p.f74823l.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
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
            protocol.Q6("last_topic_id", 1, (byte) 8);
            protocol.l5(this.f74917a);
            protocol.N2();
            protocol.Q6(g.b.f62794h, 2, (byte) 8);
            protocol.l5(this.f74918b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i0 implements xs.e<List<? extends n8.p>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<n8.p>> f74919a;

        /* JADX WARN: Multi-variable type inference failed */
        public i0(j00.c<? super List<n8.p>> cVar) {
            this.f74919a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<n8.p> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<n8.p>> cVar = this.f74919a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<n8.p>> cVar = this.f74919a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends xs.d<List<? extends n8.p>> {

        /* renamed from: a, reason: collision with root package name */
        public final long f74920a;

        /* renamed from: b, reason: collision with root package name */
        public final int f74921b;

        /* renamed from: c, reason: collision with root package name */
        public final int f74922c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long j11, int i11, int i12, @m80.k xs.e<List<n8.p>> callback) {
            super("get_video_list_learned", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74920a = j11;
            this.f74921b = i11;
            this.f74922c = i12;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<n8.p> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(n8.p.f74823l.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
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
            protocol.Q6("before_time", 1, (byte) 10);
            protocol.q7(this.f74920a);
            protocol.N2();
            protocol.Q6(g.b.f62794h, 2, (byte) 8);
            protocol.l5(this.f74921b);
            protocol.N2();
            protocol.Q6("last_topic_id", 3, (byte) 8);
            protocol.l5(this.f74922c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j0 implements xs.e<List<? extends n8.p>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<n8.p>> f74923a;

        /* JADX WARN: Multi-variable type inference failed */
        public j0(j00.c<? super List<n8.p>> cVar) {
            this.f74923a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<n8.p> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<n8.p>> cVar = this.f74923a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<n8.p>> cVar = this.f74923a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k extends xs.d<List<? extends n8.p>> {

        /* renamed from: a, reason: collision with root package name */
        public final long f74924a;

        /* renamed from: b, reason: collision with root package name */
        public final int f74925b;

        /* renamed from: c, reason: collision with root package name */
        public final int f74926c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(long j11, int i11, int i12, @m80.k xs.e<List<n8.p>> callback) {
            super("get_video_list_learned_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74924a = j11;
            this.f74925b = i11;
            this.f74926c = i12;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<n8.p> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(n8.p.f74823l.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
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
            protocol.Q6("before_time", 1, (byte) 10);
            protocol.q7(this.f74924a);
            protocol.N2();
            protocol.Q6(g.b.f62794h, 2, (byte) 8);
            protocol.l5(this.f74925b);
            protocol.N2();
            protocol.Q6("last_topic_id", 3, (byte) 8);
            protocol.l5(this.f74926c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k0 implements xs.e<List<? extends n8.p>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<n8.p>> f74927a;

        /* JADX WARN: Multi-variable type inference failed */
        public k0(j00.c<? super List<n8.p>> cVar) {
            this.f74927a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<n8.p> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<n8.p>> cVar = this.f74927a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<n8.p>> cVar = this.f74927a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l extends xs.d<List<? extends n8.p>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f74928a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(int i11, @m80.k xs.e<List<n8.p>> callback) {
            super("get_video_list_of_topic", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74928a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<n8.p> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(n8.p.f74823l.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
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
            protocol.Q6(TVPlayActivity.A, 1, (byte) 8);
            protocol.l5(this.f74928a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l0 implements xs.e<n8.o> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<n8.o> f74929a;

        /* JADX WARN: Multi-variable type inference failed */
        public l0(j00.c<? super n8.o> cVar) {
            this.f74929a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k n8.o result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<n8.o> cVar = this.f74929a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<n8.o> cVar = this.f74929a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m extends xs.d<n8.o> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(@m80.k xs.e<n8.o> callback) {
            super("get_word_media_halftime_list", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n8.o receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            n8.o oVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    oVar = n8.o.f74813f.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
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
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m0 implements xs.e<n8.s> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<n8.s> f74930a;

        /* JADX WARN: Multi-variable type inference failed */
        public m0(j00.c<? super n8.s> cVar) {
            this.f74930a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k n8.s result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<n8.s> cVar = this.f74930a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<n8.s> cVar = this.f74930a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n extends xs.d<n8.s> {

        /* renamed from: a, reason: collision with root package name */
        public final int f74931a;

        /* renamed from: b, reason: collision with root package name */
        public final int f74932b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i11, int i12, @m80.k xs.e<n8.s> callback) {
            super("get_word_share_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74931a = i11;
            this.f74932b = i12;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n8.s receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
            n8.s sVar = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    sVar = n8.s.f74873e.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
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
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(this.f74931a);
            protocol.N2();
            protocol.Q6("book_id", 2, (byte) 8);
            protocol.l5(this.f74932b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n0 implements xs.e<n8.s> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<n8.s> f74933a;

        /* JADX WARN: Multi-variable type inference failed */
        public n0(j00.c<? super n8.s> cVar) {
            this.f74933a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k n8.s result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<n8.s> cVar = this.f74933a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<n8.s> cVar = this.f74933a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o extends xs.d<n8.s> {

        /* renamed from: a, reason: collision with root package name */
        public final int f74934a;

        /* renamed from: b, reason: collision with root package name */
        public final int f74935b;

        /* renamed from: c, reason: collision with root package name */
        public final int f74936c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(int i11, int i12, int i13, @m80.k xs.e<n8.s> callback) {
            super("get_word_share_info_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74934a = i11;
            this.f74935b = i12;
            this.f74936c = i13;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n8.s receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
            n8.s sVar = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    sVar = n8.s.f74873e.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
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
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(this.f74934a);
            protocol.N2();
            protocol.Q6("book_id", 2, (byte) 8);
            protocol.l5(this.f74935b);
            protocol.N2();
            protocol.Q6("tag_id", 3, (byte) 8);
            protocol.l5(this.f74936c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o0 implements xs.e<List<? extends n8.t>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<n8.t>> f74937a;

        /* JADX WARN: Multi-variable type inference failed */
        public o0(j00.c<? super List<n8.t>> cVar) {
            this.f74937a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<n8.t> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<n8.t>> cVar = this.f74937a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<n8.t>> cVar = this.f74937a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p extends xs.d<List<? extends n8.t>> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<Integer> f74938a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(@m80.k List<Integer> arr_topic_ids, @m80.k xs.e<List<n8.t>> callback) {
            super("get_word_syllable_data", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(arr_topic_ids, "arr_topic_ids");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74938a = arr_topic_ids;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<n8.t> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(n8.t.f74881h.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
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
            protocol.Q6("arr_topic_ids", 1, (byte) 15);
            protocol.y2((byte) 8, this.f74938a.size());
            Iterator<Integer> it = this.f74938a.iterator();
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
    public static final class p0 implements xs.e<List<? extends n8.k>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<n8.k>> f74939a;

        /* JADX WARN: Multi-variable type inference failed */
        public p0(j00.c<? super List<n8.k>> cVar) {
            this.f74939a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<n8.k> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<n8.k>> cVar = this.f74939a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<n8.k>> cVar = this.f74939a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q extends xs.d<List<? extends n8.k>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f74940a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<Integer> f74941b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(int i11, @m80.k List<Integer> topic_ids, @m80.k xs.e<List<n8.k>> callback) {
            super("get_word_topic_assets", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(topic_ids, "topic_ids");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74940a = i11;
            this.f74941b = topic_ids;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<n8.k> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
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
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(n8.k.f74723s.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
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
            protocol.Q6(ma.b.f72894c, 1, (byte) 8);
            protocol.l5(this.f74940a);
            protocol.N2();
            protocol.Q6("topic_ids", 2, (byte) 15);
            protocol.y2((byte) 8, this.f74941b.size());
            Iterator<Integer> it = this.f74941b.iterator();
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
    public static final class q0 implements xs.e<List<? extends n8.l>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<n8.l>> f74942a;

        /* JADX WARN: Multi-variable type inference failed */
        public q0(j00.c<? super List<n8.l>> cVar) {
            this.f74942a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<n8.l> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<n8.l>> cVar = this.f74942a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<n8.l>> cVar = this.f74942a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r extends xs.d<List<? extends n8.l>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f74943a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<Integer> f74944b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(int i11, @m80.k List<Integer> topic_ids, @m80.k xs.e<List<n8.l>> callback) {
            super("get_word_topic_assets_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(topic_ids, "topic_ids");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74943a = i11;
            this.f74944b = topic_ids;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<n8.l> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
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
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(n8.l.f74759t.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
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
            protocol.Q6(ma.b.f72894c, 1, (byte) 8);
            protocol.l5(this.f74943a);
            protocol.N2();
            protocol.Q6("topic_ids", 2, (byte) 15);
            protocol.y2((byte) 8, this.f74944b.size());
            Iterator<Integer> it = this.f74944b.iterator();
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
    public static final class r0 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f74945a;

        /* JADX WARN: Multi-variable type inference failed */
        public r0(j00.c<? super Integer> cVar) {
            this.f74945a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f74945a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f74945a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class s extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final int f74946a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<n8.j> f74947b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(int i11, @m80.k List<n8.j> similar_words_votes, @m80.k xs.e<Integer> callback) {
            super("similar_words_vote", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(similar_words_votes, "similar_words_votes");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74946a = i11;
            this.f74947b = similar_words_votes;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
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
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
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
            if (bESystemException != null) {
                throw bESystemException;
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
            protocol.l5(this.f74946a);
            protocol.N2();
            protocol.Q6("similar_words_votes", 2, (byte) 15);
            protocol.y2((byte) 12, this.f74947b.size());
            Iterator<n8.j> it = this.f74947b.iterator();
            while (it.hasNext()) {
                n8.j.f74713f.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class s0 implements xs.e<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<g2> f74948a;

        /* JADX WARN: Multi-variable type inference failed */
        public s0(j00.c<? super g2> cVar) {
            this.f74948a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<g2> cVar = this.f74948a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<g2> cVar = this.f74948a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t extends xs.d<g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<n8.m> f74949a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(@m80.k List<n8.m> stats, @m80.k xs.e<g2> callback) {
            super("submit_video_stat", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(stats, "stats");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74949a = stats;
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
            protocol.Q6("stats", 1, (byte) 15);
            protocol.y2((byte) 12, this.f74949a.size());
            Iterator<n8.m> it = this.f74949a.iterator();
            while (it.hasNext()) {
                n8.m.f74797d.write(protocol, it.next());
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
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
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
                        bELogicException = BELogicException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    bESystemException = BESystemException.ADAPTER.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t0 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f74950a;

        /* JADX WARN: Multi-variable type inference failed */
        public t0(j00.c<? super Integer> cVar) {
            this.f74950a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f74950a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f74950a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final int f74951a;

        /* renamed from: b, reason: collision with root package name */
        public final int f74952b;

        /* renamed from: c, reason: collision with root package name */
        public final int f74953c;

        /* renamed from: d, reason: collision with root package name */
        public final int f74954d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final String f74955e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(int i11, int i12, int i13, int i14, @m80.k String signed_key, @m80.k xs.e<Integer> callback) {
            super("update_online_topic", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(signed_key, "signed_key");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74951a = i11;
            this.f74952b = i12;
            this.f74953c = i13;
            this.f74954d = i14;
            this.f74955e = signed_key;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
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
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
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
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(this.f74951a);
            protocol.N2();
            protocol.Q6(ma.b.f72894c, 2, (byte) 8);
            protocol.l5(this.f74952b);
            protocol.N2();
            protocol.Q6("tag_id", 3, (byte) 8);
            protocol.l5(this.f74953c);
            protocol.N2();
            protocol.Q6("version", 4, (byte) 8);
            protocol.l5(this.f74954d);
            protocol.N2();
            protocol.Q6("signed_key", 5, (byte) 11);
            protocol.p1(this.f74955e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u0 implements xs.e<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<g2> f74956a;

        /* JADX WARN: Multi-variable type inference failed */
        public u0(j00.c<? super g2> cVar) {
            this.f74956a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<g2> cVar = this.f74956a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<g2> cVar = this.f74956a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v extends xs.d<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final int f74957a;

        /* renamed from: b, reason: collision with root package name */
        public final int f74958b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(int i11, int i12, @m80.k xs.e<g2> callback) {
            super("update_reading_plan_play_times", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74957a = i11;
            this.f74958b = i12;
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
            protocol.Q6("plan_id", 1, (byte) 8);
            protocol.l5(this.f74957a);
            protocol.N2();
            protocol.Q6("play_times", 2, (byte) 8);
            protocol.l5(this.f74958b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
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
                        bELogicException = BELogicException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    bESystemException = BESystemException.ADAPTER.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v0 implements xs.e<List<? extends n8.r>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<n8.r>> f74959a;

        /* JADX WARN: Multi-variable type inference failed */
        public v0(j00.c<? super List<n8.r>> cVar) {
            this.f74959a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<n8.r> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<n8.r>> cVar = this.f74959a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<n8.r>> cVar = this.f74959a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: n8.w$w, reason: collision with other inner class name */
    public static final class C0906w extends xs.d<List<? extends n8.r>> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f74960a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0906w(@m80.k String query_str, @m80.k xs.e<List<n8.r>> callback) {
            super("word_search", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(query_str, "query_str");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74960a = query_str;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<n8.r> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(n8.r.f74861g.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
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
            protocol.p1(this.f74960a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class w0 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f74961a;

        /* JADX WARN: Multi-variable type inference failed */
        public w0(j00.c<? super Integer> cVar) {
            this.f74961a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f74961a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f74961a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class x extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final int f74962a;

        /* renamed from: b, reason: collision with root package name */
        public final int f74963b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(int i11, int i12, @m80.k xs.e<Integer> callback) {
            super("word_share_notify", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74962a = i11;
            this.f74963b = i12;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
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
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
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
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(this.f74962a);
            protocol.N2();
            protocol.Q6("book_id", 2, (byte) 8);
            protocol.l5(this.f74963b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class x0 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f74964a;

        /* JADX WARN: Multi-variable type inference failed */
        public x0(j00.c<? super Integer> cVar) {
            this.f74964a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f74964a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f74964a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class y extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final int f74965a;

        /* renamed from: b, reason: collision with root package name */
        public final int f74966b;

        /* renamed from: c, reason: collision with root package name */
        public final int f74967c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(int i11, int i12, int i13, @m80.k xs.e<Integer> callback) {
            super("word_share_notify_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f74965a = i11;
            this.f74966b = i12;
            this.f74967c = i13;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
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
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
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
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
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
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(this.f74965a);
            protocol.N2();
            protocol.Q6("book_id", 2, (byte) 8);
            protocol.l5(this.f74966b);
            protocol.N2();
            protocol.Q6("tag_id", 3, (byte) 8);
            protocol.l5(this.f74967c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class z implements xs.e<List<? extends n8.c>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<n8.c>> f74968a;

        /* JADX WARN: Multi-variable type inference failed */
        public z(j00.c<? super List<n8.c>> cVar) {
            this.f74968a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<n8.c> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<n8.c>> cVar = this.f74968a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<n8.c>> cVar = this.f74968a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@m80.k ws.i protocol, @m80.k a.InterfaceC0480a listener) {
        super(protocol, listener);
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        kotlin.jvm.internal.g0.p(listener, "listener");
    }

    @Override // n8.v
    @m80.l
    public Object C8(int i11, int i12, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new x(i11, i12, new w0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object E0(int i11, int i12, @m80.k j00.c<? super List<n8.p>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new i(i11, i12, new h0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object E7(int i11, @m80.k List<n8.j> list, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new s(i11, list, new r0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object F4(int i11, @m80.k List<Integer> list, @m80.k j00.c<? super List<n8.k>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new q(i11, list, new p0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object G8(int i11, @m80.k List<Integer> list, @m80.k j00.c<? super List<n8.l>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new r(i11, list, new q0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object I6(int i11, @m80.k List<Integer> list, @m80.k j00.c<? super List<n8.i>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new g(i11, list, new f0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object I7(int i11, int i12, @m80.k j00.c<? super n8.q> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new f(i11, i12, new e0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object J2(@m80.k List<Integer> list, @m80.k j00.c<? super List<n8.t>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new p(list, new o0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object K6(int i11, int i12, int i13, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new y(i11, i12, i13, new x0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object K7(long j11, int i11, int i12, @m80.k j00.c<? super List<n8.p>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new j(j11, i11, i12, new i0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object Q7(int i11, @m80.k j00.c<? super List<n8.h>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new d(i11, new c0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object R5(int i11, int i12, int i13, @m80.k j00.c<? super n8.s> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new o(i11, i12, i13, new n0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object S8(int i11, int i12, @m80.k j00.c<? super List<n8.p>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new h(i11, i12, new g0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object T2(int i11, @m80.k j00.c<? super List<n8.c>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new a(i11, new z(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object V1(int i11, @m80.k j00.c<? super List<n8.b>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new c(i11, new b0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object W4(@m80.k j00.c<? super n8.o> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new m(new l0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object Y5(@m80.k List<n8.m> list, @m80.k j00.c<? super g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new t(list, new s0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    @Override // n8.v
    @m80.l
    public Object g4(int i11, int i12, int i13, int i14, @m80.k String str, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new u(i11, i12, i13, i14, str, new t0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object i0(int i11, int i12, @m80.k j00.c<? super g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new v(i11, i12, new u0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    @Override // n8.v
    @m80.l
    public Object j4(@m80.k j00.c<? super List<n8.d>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new b(new a0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object k6(@m80.k String str, @m80.k j00.c<? super List<n8.r>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new C0906w(str, new v0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object o7(int i11, int i12, @m80.k j00.c<? super n8.s> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new n(i11, i12, new m0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object q6(@m80.k j00.c<? super List<n8.g>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new e(new d0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object u5(int i11, @m80.k j00.c<? super List<n8.p>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new l(i11, new k0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // n8.v
    @m80.l
    public Object y0(long j11, int i11, int i12, @m80.k j00.c<? super List<n8.p>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new k(j11, i11, i12, new j0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }
}
