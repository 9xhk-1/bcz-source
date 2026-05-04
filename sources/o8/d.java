package o8;

import com.baicizhan.biz.online.thrift.basic.LogicException;
import com.baicizhan.biz.online.thrift.basic.SystemException;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.thrifty.ThriftException;
import com.microsoft.thrifty.service.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d extends com.microsoft.thrifty.service.b implements o8.c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends xs.d<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final int f76373a;

        /* renamed from: b, reason: collision with root package name */
        public final int f76374b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, int i12, @m80.k xs.e<g2> callback) {
            super("delete_mark_word", (byte) 1, callback);
            g0.p(callback, "callback");
            this.f76373a = i11;
            this.f76374b = i12;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(this.f76373a);
            protocol.N2();
            protocol.Q6("paper_id", 2, (byte) 8);
            protocol.l5(this.f76374b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
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
    public static final class b extends xs.d<g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final o8.g f76375a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k o8.g req, @m80.k xs.e<g2> callback) {
            super("feedback", (byte) 1, callback);
            g0.p(req, "req");
            g0.p(callback, "callback");
            this.f76375a = req;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(HiAnalyticsConstant.Direction.REQUEST, 1, (byte) 12);
            o8.g.f76414e.write(protocol, this.f76375a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
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
    public static final class c extends xs.d<o8.j> {

        /* renamed from: a, reason: collision with root package name */
        public final long f76376a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j11, @m80.k xs.e<o8.j> callback) {
            super("get_improve_video_info", (byte) 1, callback);
            g0.p(callback, "callback");
            this.f76376a = j11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o8.j receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            o8.j jVar = null;
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
                    jVar = o8.j.f76436g.read(protocol);
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
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("chapter_id", 1, (byte) 10);
            protocol.q7(this.f76376a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: o8.d$d, reason: collision with other inner class name */
    public static final class C0934d extends xs.d<List<? extends o8.n>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f76377a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0934d(int i11, @m80.k xs.e<List<o8.n>> callback) {
            super("get_mark_book_list", (byte) 1, callback);
            g0.p(callback, "callback");
            this.f76377a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<o8.n> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
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
                        arrayList2.add(o8.n.f76468h.read(protocol));
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
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("paper_id", 1, (byte) 8);
            protocol.l5(this.f76377a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends xs.d<u> {

        /* renamed from: a, reason: collision with root package name */
        public final int f76378a;

        /* renamed from: b, reason: collision with root package name */
        public final int f76379b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i11, int i12, @m80.k xs.e<u> callback) {
            super("get_vocab_live_info", (byte) 1, callback);
            g0.p(callback, "callback");
            this.f76378a = i11;
            this.f76379b = i12;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            u uVar = null;
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
                    uVar = u.f76540l.read(protocol);
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
            if (uVar != null) {
                return uVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("course_id", 1, (byte) 8);
            protocol.l5(this.f76378a);
            protocol.N2();
            protocol.Q6(ma.b.f72902e1, 2, (byte) 8);
            protocol.l5(this.f76379b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends xs.d<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final int f76380a;

        /* renamed from: b, reason: collision with root package name */
        public final int f76381b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i11, int i12, @m80.k xs.e<g2> callback) {
            super("livedone", (byte) 1, callback);
            g0.p(callback, "callback");
            this.f76380a = i11;
            this.f76381b = i12;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("course_id", 1, (byte) 8);
            protocol.l5(this.f76380a);
            protocol.N2();
            protocol.Q6(ma.b.f72902e1, 2, (byte) 8);
            protocol.l5(this.f76381b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
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
    public static final class g extends xs.d<o8.o> {

        /* renamed from: a, reason: collision with root package name */
        public final int f76382a;

        /* renamed from: b, reason: collision with root package name */
        public final int f76383b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i11, int i12, @m80.k xs.e<o8.o> callback) {
            super("polling_info", (byte) 1, callback);
            g0.p(callback, "callback");
            this.f76382a = i11;
            this.f76383b = i12;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o8.o receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            o8.o oVar = null;
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
                    oVar = o8.o.f76482e.read(protocol);
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
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("course_id", 1, (byte) 8);
            protocol.l5(this.f76382a);
            protocol.N2();
            protocol.Q6(ma.b.f72902e1, 2, (byte) 8);
            protocol.l5(this.f76383b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends xs.d<g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final o8.i f76384a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@m80.k o8.i chapter_done_info, @m80.k xs.e<g2> callback) {
            super("submit_improve_chapter_done", (byte) 1, callback);
            g0.p(chapter_done_info, "chapter_done_info");
            g0.p(callback, "callback");
            this.f76384a = chapter_done_info;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("chapter_done_info", 1, (byte) 12);
            o8.i.f76430d.write(protocol, this.f76384a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
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
    public static final class i extends xs.d<g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final o8.b f76385a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(@m80.k o8.b req, @m80.k xs.e<g2> callback) {
            super("submitugc", (byte) 1, callback);
            g0.p(req, "req");
            g0.p(callback, "callback");
            this.f76385a = req;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ g2 receive(ws.i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return g2.f100423a;
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(HiAnalyticsConstant.Direction.REQUEST, 1, (byte) 12);
            o8.b.f76364f.write(protocol, this.f76385a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
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
    public static final class j implements xs.e<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<g2> f76386a;

        /* JADX WARN: Multi-variable type inference failed */
        public j(j00.c<? super g2> cVar) {
            this.f76386a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k g2 result) {
            g0.p(result, "result");
            j00.c<g2> cVar = this.f76386a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<g2> cVar = this.f76386a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k implements xs.e<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<g2> f76387a;

        /* JADX WARN: Multi-variable type inference failed */
        public k(j00.c<? super g2> cVar) {
            this.f76387a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k g2 result) {
            g0.p(result, "result");
            j00.c<g2> cVar = this.f76387a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<g2> cVar = this.f76387a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l implements xs.e<o8.j> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<o8.j> f76388a;

        /* JADX WARN: Multi-variable type inference failed */
        public l(j00.c<? super o8.j> cVar) {
            this.f76388a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k o8.j result) {
            g0.p(result, "result");
            j00.c<o8.j> cVar = this.f76388a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<o8.j> cVar = this.f76388a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m implements xs.e<List<? extends o8.n>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<o8.n>> f76389a;

        /* JADX WARN: Multi-variable type inference failed */
        public m(j00.c<? super List<o8.n>> cVar) {
            this.f76389a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<o8.n> result) {
            g0.p(result, "result");
            j00.c<List<o8.n>> cVar = this.f76389a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<List<o8.n>> cVar = this.f76389a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n implements xs.e<u> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<u> f76390a;

        /* JADX WARN: Multi-variable type inference failed */
        public n(j00.c<? super u> cVar) {
            this.f76390a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k u result) {
            g0.p(result, "result");
            j00.c<u> cVar = this.f76390a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<u> cVar = this.f76390a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o implements xs.e<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<g2> f76391a;

        /* JADX WARN: Multi-variable type inference failed */
        public o(j00.c<? super g2> cVar) {
            this.f76391a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k g2 result) {
            g0.p(result, "result");
            j00.c<g2> cVar = this.f76391a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<g2> cVar = this.f76391a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p implements xs.e<o8.o> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<o8.o> f76392a;

        /* JADX WARN: Multi-variable type inference failed */
        public p(j00.c<? super o8.o> cVar) {
            this.f76392a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k o8.o result) {
            g0.p(result, "result");
            j00.c<o8.o> cVar = this.f76392a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<o8.o> cVar = this.f76392a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q implements xs.e<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<g2> f76393a;

        /* JADX WARN: Multi-variable type inference failed */
        public q(j00.c<? super g2> cVar) {
            this.f76393a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k g2 result) {
            g0.p(result, "result");
            j00.c<g2> cVar = this.f76393a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<g2> cVar = this.f76393a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r implements xs.e<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<g2> f76394a;

        /* JADX WARN: Multi-variable type inference failed */
        public r(j00.c<? super g2> cVar) {
            this.f76394a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k g2 result) {
            g0.p(result, "result");
            j00.c<g2> cVar = this.f76394a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<g2> cVar = this.f76394a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@m80.k ws.i protocol, @m80.k a.InterfaceC0480a listener) {
        super(protocol, listener);
        g0.p(protocol, "protocol");
        g0.p(listener, "listener");
    }

    @Override // o8.c
    @m80.l
    public Object B3(@m80.k o8.b bVar, @m80.k j00.c<? super g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new i(bVar, new r(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    @Override // o8.c
    @m80.l
    public Object H5(int i11, int i12, @m80.k j00.c<? super g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new a(i11, i12, new j(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    @Override // o8.c
    @m80.l
    public Object W0(int i11, int i12, @m80.k j00.c<? super o8.o> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new g(i11, i12, new p(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // o8.c
    @m80.l
    public Object e5(@m80.k o8.i iVar, @m80.k j00.c<? super g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new h(iVar, new q(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    @Override // o8.c
    @m80.l
    public Object i1(int i11, int i12, @m80.k j00.c<? super u> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new e(i11, i12, new n(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // o8.c
    @m80.l
    public Object l3(int i11, int i12, @m80.k j00.c<? super g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new f(i11, i12, new o(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    @Override // o8.c
    @m80.l
    public Object s1(@m80.k o8.g gVar, @m80.k j00.c<? super g2> cVar) {
        j00.g gVar2 = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new b(gVar, new k(gVar2)));
        Object b11 = gVar2.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    @Override // o8.c
    @m80.l
    public Object u6(long j11, @m80.k j00.c<? super o8.j> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new c(j11, new l(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // o8.c
    @m80.l
    public Object x1(int i11, @m80.k j00.c<? super List<o8.n>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new C0934d(i11, new m(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }
}
