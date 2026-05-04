package s8;

import com.baicizhan.biz.online.thrift.basic.LogicException;
import com.baicizhan.biz.online.thrift.basic.SystemException;
import com.microsoft.thrifty.ThriftException;
import com.microsoft.thrifty.service.a;
import j00.g;
import java.io.IOException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.g0;
import l00.f;
import m80.k;
import m80.l;
import ws.h;
import ws.i;
import xs.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b extends com.microsoft.thrifty.service.b implements s8.a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends xs.d<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@k e<String> callback) {
            super("get_pk_address", (byte) 1, callback);
            g0.p(callback, "callback");
        }

        @Override // xs.d
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String receive(@k i protocol, @k h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
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
        public void send(@k i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: s8.b$b, reason: collision with other inner class name */
    public static final class C1154b extends xs.d<s8.c> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1154b(@k e<s8.c> callback) {
            super("get_rank_pk_address", (byte) 1, callback);
            g0.p(callback, "callback");
        }

        @Override // xs.d
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s8.c receive(@k i protocol, @k h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            s8.c cVar = null;
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
                    cVar = s8.c.f88125e.read(protocol);
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
        public void send(@k i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements e<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<String> f88122a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(j00.c<? super String> cVar) {
            this.f88122a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@k String result) {
            g0.p(result, "result");
            j00.c<String> cVar = this.f88122a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@k Throwable error) {
            g0.p(error, "error");
            j00.c<String> cVar = this.f88122a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements e<s8.c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<s8.c> f88123a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(j00.c<? super s8.c> cVar) {
            this.f88123a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@k s8.c result) {
            g0.p(result, "result");
            j00.c<s8.c> cVar = this.f88123a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@k Throwable error) {
            g0.p(error, "error");
            j00.c<s8.c> cVar = this.f88123a;
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

    @Override // s8.a
    @l
    public Object f2(@k j00.c<? super s8.c> cVar) {
        g gVar = new g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new C1154b(new d(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            f.c(cVar);
        }
        return b11;
    }

    @Override // s8.a
    @l
    public Object z0(@k j00.c<? super String> cVar) {
        g gVar = new g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new a(new c(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            f.c(cVar);
        }
        return b11;
    }
}
