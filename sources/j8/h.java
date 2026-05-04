package j8;

import com.baicizhan.biz.online.thrift.basic.LogicException;
import com.baicizhan.biz.online.thrift.basic.SystemException;
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
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h extends com.microsoft.thrifty.service.b implements j8.g {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends xs.d<j8.k> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final j8.d f63780a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k j8.d app_info, @m80.k xs.e<j8.k> callback) {
            super("check_dict_new_version", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(app_info, "app_info");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f63780a = app_info;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j8.k receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            j8.k kVar = null;
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
                    kVar = j8.k.f63827g.read(protocol);
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
            if (kVar != null) {
                return kVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("app_info", 1, (byte) 12);
            j8.d.f63751k.write(protocol, this.f63780a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a0 implements xs.e<List<? extends String>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<String>> f63781a;

        /* JADX WARN: Multi-variable type inference failed */
        public a0(j00.c<? super List<String>> cVar) {
            this.f63781a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<String> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<String>> cVar = this.f63781a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<String>> cVar = this.f63781a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends xs.d<j8.i> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k xs.e<j8.i> callback) {
            super("check_infos", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j8.i receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            j8.i iVar = null;
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
                    iVar = j8.i.f63807f.read(protocol);
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
    public static final class b0 implements xs.e<List<? extends String>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<String>> f63782a;

        /* JADX WARN: Multi-variable type inference failed */
        public b0(j00.c<? super List<String>> cVar) {
            this.f63782a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<String> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<String>> cVar = this.f63782a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<String>> cVar = this.f63782a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends xs.d<j8.k> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final j8.d f63783a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k j8.d app_info, @m80.k xs.e<j8.k> callback) {
            super("check_ireading_new_version", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(app_info, "app_info");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f63783a = app_info;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j8.k receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            j8.k kVar = null;
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
                    kVar = j8.k.f63827g.read(protocol);
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
            if (kVar != null) {
                return kVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("app_info", 1, (byte) 12);
            j8.d.f63751k.write(protocol, this.f63783a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c0 implements xs.e<j8.l> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<j8.l> f63784a;

        /* JADX WARN: Multi-variable type inference failed */
        public c0(j00.c<? super j8.l> cVar) {
            this.f63784a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k j8.l result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<j8.l> cVar = this.f63784a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<j8.l> cVar = this.f63784a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends xs.d<j8.f> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k xs.e<j8.f> callback) {
            super("check_nav_tabs", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j8.f receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            j8.f fVar = null;
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
                    fVar = j8.f.f63777c.read(protocol);
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
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d0 implements xs.e<j8.m> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<j8.m> f63785a;

        /* JADX WARN: Multi-variable type inference failed */
        public d0(j00.c<? super j8.m> cVar) {
            this.f63785a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k j8.m result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<j8.m> cVar = this.f63785a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<j8.m> cVar = this.f63785a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends xs.d<j8.k> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final j8.d f63786a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k j8.d app_info, @m80.k xs.e<j8.k> callback) {
            super("check_new_version", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(app_info, "app_info");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f63786a = app_info;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j8.k receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            j8.k kVar = null;
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
                    kVar = j8.k.f63827g.read(protocol);
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
            if (kVar != null) {
                return kVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("app_info", 1, (byte) 12);
            j8.d.f63751k.write(protocol, this.f63786a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e0 implements xs.e<List<? extends j8.p>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<j8.p>> f63787a;

        /* JADX WARN: Multi-variable type inference failed */
        public e0(j00.c<? super List<j8.p>> cVar) {
            this.f63787a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<j8.p> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<j8.p>> cVar = this.f63787a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<j8.p>> cVar = this.f63787a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends xs.d<j8.b> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final j8.a f63788a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@m80.k j8.a request, @m80.k xs.e<j8.b> callback) {
            super("get_app_beta_update_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(request, "request");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f63788a = request;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j8.b receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            j8.b bVar = null;
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
                    bVar = j8.b.f63725j.read(protocol);
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
            protocol.Q6(SocialConstants.TYPE_REQUEST, 1, (byte) 12);
            j8.a.f63705k.write(protocol, this.f63788a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f0 implements xs.e<j8.e> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<j8.e> f63789a;

        /* JADX WARN: Multi-variable type inference failed */
        public f0(j00.c<? super j8.e> cVar) {
            this.f63789a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k j8.e result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<j8.e> cVar = this.f63789a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<j8.e> cVar = this.f63789a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends xs.d<Map<String, ? extends String>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@m80.k xs.e<Map<String, String>> callback) {
            super("get_app_feedback_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, String> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
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
                        linkedHashMap2.put(protocol.readString(), protocol.readString());
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
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g0 implements xs.e<Map<String, ? extends Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Map<String, Integer>> f63790a;

        /* JADX WARN: Multi-variable type inference failed */
        public g0(j00.c<? super Map<String, Integer>> cVar) {
            this.f63790a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k Map<String, Integer> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<Map<String, Integer>> cVar = this.f63790a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Map<String, Integer>> cVar = this.f63790a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: j8.h$h, reason: collision with other inner class name */
    public static final class C0741h extends xs.d<j8.c> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final j8.a f63791a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0741h(@m80.k j8.a request, @m80.k xs.e<j8.c> callback) {
            super("get_app_new_version_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(request, "request");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f63791a = request;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j8.c receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            j8.c cVar = null;
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
                    cVar = j8.c.f63743e.read(protocol);
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
            protocol.Q6(SocialConstants.TYPE_REQUEST, 1, (byte) 12);
            j8.a.f63705k.write(protocol, this.f63791a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h0 implements xs.e<j8.o> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<j8.o> f63792a;

        /* JADX WARN: Multi-variable type inference failed */
        public h0(j00.c<? super j8.o> cVar) {
            this.f63792a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k j8.o result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<j8.o> cVar = this.f63792a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<j8.o> cVar = this.f63792a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends xs.d<List<? extends String>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(@m80.k xs.e<List<String>> callback) {
            super("get_domain_blacklist", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<String> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
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
                        arrayList2.add(protocol.readString());
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
    public static final class i0 implements xs.e<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<g2> f63793a;

        /* JADX WARN: Multi-variable type inference failed */
        public i0(j00.c<? super g2> cVar) {
            this.f63793a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<g2> cVar = this.f63793a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<g2> cVar = this.f63793a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends xs.d<List<? extends String>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(@m80.k xs.e<List<String>> callback) {
            super("get_domain_whitelist", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<String> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
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
                        arrayList2.add(protocol.readString());
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
    public static final class j0 implements xs.e<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<g2> f63794a;

        /* JADX WARN: Multi-variable type inference failed */
        public j0(j00.c<? super g2> cVar) {
            this.f63794a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<g2> cVar = this.f63794a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<g2> cVar = this.f63794a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k extends xs.d<j8.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(@m80.k xs.e<j8.l> callback) {
            super("get_guide_for_new_strategy", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j8.l receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            j8.l lVar = null;
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
                    lVar = j8.l.f63839f.read(protocol);
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
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l extends xs.d<j8.m> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(@m80.k xs.e<j8.m> callback) {
            super("get_privacy_agreement_version", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j8.m receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            j8.m mVar = null;
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
                    mVar = j8.m.f63849e.read(protocol);
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
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m extends xs.d<List<? extends j8.p>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(@m80.k xs.e<List<j8.p>> callback) {
            super("get_static_config", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<j8.p> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
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
                        arrayList2.add(j8.p.f63877e.read(protocol));
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
    public static final class n extends xs.d<j8.e> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(@m80.k xs.e<j8.e> callback) {
            super("get_switches", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j8.e receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            j8.e eVar = null;
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
                    eVar = j8.e.f63771d.read(protocol);
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
    public static final class o extends xs.d<Map<String, ? extends Integer>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(@m80.k xs.e<Map<String, Integer>> callback) {
            super("get_test_flags", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, Integer> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
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
                        linkedHashMap2.put(protocol.readString(), Integer.valueOf(protocol.s8()));
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
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p extends xs.d<j8.o> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f63795a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(@m80.k String qrcode, @m80.k xs.e<j8.o> callback) {
            super("qrcode_scan", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(qrcode, "qrcode");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f63795a = qrcode;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j8.o receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            j8.o oVar = null;
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
                    oVar = j8.o.f63869e.read(protocol);
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
            protocol.Q6("qrcode", 1, (byte) 11);
            protocol.p1(this.f63795a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q extends xs.d<g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<String> f63796a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(@m80.k List<String> jsons, @m80.k xs.e<g2> callback) {
            super("report_event", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(jsons, "jsons");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f63796a = jsons;
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
            protocol.Q6("jsons", 1, (byte) 15);
            protocol.y2((byte) 11, this.f63796a.size());
            Iterator<String> it = this.f63796a.iterator();
            while (it.hasNext()) {
                protocol.p1(it.next());
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
    public static final class r extends xs.d<g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<String> f63797a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(@m80.k List<String> jsons, @m80.k xs.e<g2> callback) {
            super("report_event_without_login", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(jsons, "jsons");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f63797a = jsons;
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
            protocol.Q6("jsons", 1, (byte) 15);
            protocol.y2((byte) 11, this.f63797a.size());
            Iterator<String> it = this.f63797a.iterator();
            while (it.hasNext()) {
                protocol.p1(it.next());
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
    public static final class s implements xs.e<j8.k> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<j8.k> f63798a;

        /* JADX WARN: Multi-variable type inference failed */
        public s(j00.c<? super j8.k> cVar) {
            this.f63798a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k j8.k result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<j8.k> cVar = this.f63798a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<j8.k> cVar = this.f63798a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t implements xs.e<j8.i> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<j8.i> f63799a;

        /* JADX WARN: Multi-variable type inference failed */
        public t(j00.c<? super j8.i> cVar) {
            this.f63799a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k j8.i result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<j8.i> cVar = this.f63799a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<j8.i> cVar = this.f63799a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u implements xs.e<j8.k> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<j8.k> f63800a;

        /* JADX WARN: Multi-variable type inference failed */
        public u(j00.c<? super j8.k> cVar) {
            this.f63800a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k j8.k result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<j8.k> cVar = this.f63800a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<j8.k> cVar = this.f63800a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v implements xs.e<j8.f> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<j8.f> f63801a;

        /* JADX WARN: Multi-variable type inference failed */
        public v(j00.c<? super j8.f> cVar) {
            this.f63801a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k j8.f result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<j8.f> cVar = this.f63801a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<j8.f> cVar = this.f63801a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class w implements xs.e<j8.k> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<j8.k> f63802a;

        /* JADX WARN: Multi-variable type inference failed */
        public w(j00.c<? super j8.k> cVar) {
            this.f63802a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k j8.k result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<j8.k> cVar = this.f63802a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<j8.k> cVar = this.f63802a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class x implements xs.e<j8.b> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<j8.b> f63803a;

        /* JADX WARN: Multi-variable type inference failed */
        public x(j00.c<? super j8.b> cVar) {
            this.f63803a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k j8.b result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<j8.b> cVar = this.f63803a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<j8.b> cVar = this.f63803a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class y implements xs.e<Map<String, ? extends String>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Map<String, String>> f63804a;

        /* JADX WARN: Multi-variable type inference failed */
        public y(j00.c<? super Map<String, String>> cVar) {
            this.f63804a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k Map<String, String> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<Map<String, String>> cVar = this.f63804a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Map<String, String>> cVar = this.f63804a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class z implements xs.e<j8.c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<j8.c> f63805a;

        /* JADX WARN: Multi-variable type inference failed */
        public z(j00.c<? super j8.c> cVar) {
            this.f63805a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k j8.c result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<j8.c> cVar = this.f63805a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<j8.c> cVar = this.f63805a;
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

    @Override // j8.g
    @m80.l
    public Object A0(@m80.k j8.a aVar, @m80.k j00.c<? super j8.c> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new C0741h(aVar, new z(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // j8.g
    @m80.l
    public Object G6(@m80.k j00.c<? super Map<String, Integer>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new o(new g0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // j8.g
    @m80.l
    public Object J5(@m80.k j00.c<? super List<String>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new i(new a0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // j8.g
    @m80.l
    public Object L8(@m80.k j8.d dVar, @m80.k j00.c<? super j8.k> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new c(dVar, new u(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // j8.g
    @m80.l
    public Object O4(@m80.k j00.c<? super j8.f> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new d(new v(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // j8.g
    @m80.l
    public Object T7(@m80.k j00.c<? super j8.l> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new k(new c0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // j8.g
    @m80.l
    public Object Y7(@m80.k j00.c<? super List<String>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new j(new b0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // j8.g
    @m80.l
    public Object Z0(@m80.k j00.c<? super Map<String, String>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new g(new y(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // j8.g
    @m80.l
    public Object Z4(@m80.k j00.c<? super j8.m> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new l(new d0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // j8.g
    @m80.l
    public Object a(@m80.k List<String> list, @m80.k j00.c<? super g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new r(list, new j0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    @Override // j8.g
    @m80.l
    public Object d3(@m80.k j8.d dVar, @m80.k j00.c<? super j8.k> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new e(dVar, new w(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // j8.g
    @m80.l
    public Object e(@m80.k String str, @m80.k j00.c<? super j8.o> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new p(str, new h0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // j8.g
    @m80.l
    public Object f(@m80.k List<String> list, @m80.k j00.c<? super g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new q(list, new i0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    @Override // j8.g
    @m80.l
    public Object k1(@m80.k j8.d dVar, @m80.k j00.c<? super j8.k> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new a(dVar, new s(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // j8.g
    @m80.l
    public Object q1(@m80.k j00.c<? super j8.e> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new n(new f0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // j8.g
    @m80.l
    public Object r7(@m80.k j00.c<? super List<j8.p>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new m(new e0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // j8.g
    @m80.l
    public Object s0(@m80.k j8.a aVar, @m80.k j00.c<? super j8.b> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new f(aVar, new x(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // j8.g
    @m80.l
    public Object s3(@m80.k j00.c<? super j8.i> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new b(new t(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }
}
