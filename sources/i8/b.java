package i8;

import com.baicizhan.biz.online.thrift.basic.LogicException;
import com.baicizhan.biz.online.thrift.basic.SystemException;
import com.microsoft.thrifty.service.a;
import j00.g;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.g0;
import l00.f;
import m80.k;
import m80.l;
import ws.h;
import ws.i;
import xs.e;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b extends com.microsoft.thrifty.service.b implements i8.a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends xs.d<g2> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f60250a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@k List<String> jsons, @k e<g2> callback) {
            super("report_event", (byte) 1, callback);
            g0.p(jsons, "jsons");
            g0.p(callback, "callback");
            this.f60250a = jsons;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ g2 receive(i iVar, h hVar) {
            receive2(iVar, hVar);
            return g2.f100423a;
        }

        @Override // xs.d
        public void send(@k i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("jsons", 1, (byte) 15);
            protocol.y2((byte) 11, this.f60250a.size());
            Iterator<String> it = this.f60250a.iterator();
            while (it.hasNext()) {
                protocol.p1(it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@k i protocol, @k h metadata) throws Exception {
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
    /* renamed from: i8.b$b, reason: collision with other inner class name */
    public static final class C0695b extends xs.d<g2> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f60251a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0695b(@k List<String> jsons, @k e<g2> callback) {
            super("report_event_without_login", (byte) 1, callback);
            g0.p(jsons, "jsons");
            g0.p(callback, "callback");
            this.f60251a = jsons;
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ g2 receive(i iVar, h hVar) {
            receive2(iVar, hVar);
            return g2.f100423a;
        }

        @Override // xs.d
        public void send(@k i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("jsons", 1, (byte) 15);
            protocol.y2((byte) 11, this.f60251a.size());
            Iterator<String> it = this.f60251a.iterator();
            while (it.hasNext()) {
                protocol.p1(it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@k i protocol, @k h metadata) throws Exception {
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
    public static final class c implements e<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<g2> f60252a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(j00.c<? super g2> cVar) {
            this.f60252a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@k g2 result) {
            g0.p(result, "result");
            j00.c<g2> cVar = this.f60252a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@k Throwable error) {
            g0.p(error, "error");
            j00.c<g2> cVar = this.f60252a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements e<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<g2> f60253a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(j00.c<? super g2> cVar) {
            this.f60253a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@k g2 result) {
            g0.p(result, "result");
            j00.c<g2> cVar = this.f60253a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@k Throwable error) {
            g0.p(error, "error");
            j00.c<g2> cVar = this.f60253a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@k i protocol, @k a.InterfaceC0480a listener) {
        super(protocol, listener);
        g0.p(protocol, "protocol");
        g0.p(listener, "listener");
    }

    @Override // i8.a
    @l
    public Object a(@k List<String> list, @k j00.c<? super g2> cVar) {
        g gVar = new g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new C0695b(list, new d(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    @Override // i8.a
    @l
    public Object f(@k List<String> list, @k j00.c<? super g2> cVar) {
        g gVar = new g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new a(list, new c(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }
}
