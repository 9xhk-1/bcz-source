package v8;

import androidx.autofill.HintConstants;
import com.baicizhan.biz.online.thrift.basic.LogicException;
import com.baicizhan.biz.online.thrift.basic.SystemException;
import com.baicizhan.biz.online.unified_user_service.SendCaptchaAction;
import com.baicizhan.main.auth.AccountVerificationActivity;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.microsoft.thrifty.ThriftException;
import com.microsoft.thrifty.service.a;
import com.tencent.open.SocialConstants;
import com.tencent.open.SocialOperation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class u extends com.microsoft.thrifty.service.b implements v8.t {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends xs.d<v8.x> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final v8.b f93445a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k v8.b request, @m80.k xs.e<v8.x> callback) {
            super("apple_login", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(request, "request");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93445a = request;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v8.x receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            v8.x xVar = null;
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
                    xVar = v8.x.f93574m.read(protocol);
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
            protocol.Q6(SocialConstants.TYPE_REQUEST, 1, (byte) 12);
            v8.b.f93242h.write(protocol, this.f93445a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a0 extends xs.d<v8.n> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final v8.m f93446a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(@m80.k v8.m param_, @m80.k xs.e<v8.n> callback) {
            super("search_major", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(param_, "param_");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93446a = param_;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v8.n receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            v8.n nVar = null;
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
                    nVar = v8.n.f93338g.read(protocol);
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
            if (nVar != null) {
                return nVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(RemoteMessageConst.MessageBody.PARAM, 1, (byte) 12);
            v8.m.f93330e.write(protocol, this.f93446a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a1 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93447a;

        /* JADX WARN: Multi-variable type inference failed */
        public a1(j00.c<? super yz.g2> cVar) {
            this.f93447a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93447a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93447a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a2 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93448a;

        /* JADX WARN: Multi-variable type inference failed */
        public a2(j00.c<? super yz.g2> cVar) {
            this.f93448a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93448a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93448a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends xs.d<v8.x> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final v8.c f93449a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k v8.c param_, @m80.k xs.e<v8.x> callback) {
            super("bcz_bind_try_user", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(param_, "param_");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93449a = param_;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v8.x receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            v8.x xVar = null;
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
                    xVar = v8.x.f93574m.read(protocol);
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
            protocol.Q6(RemoteMessageConst.MessageBody.PARAM, 1, (byte) 12);
            v8.c.f93256f.write(protocol, this.f93449a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b0 extends xs.d<v8.q> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final v8.p f93450a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(@m80.k v8.p param_, @m80.k xs.e<v8.q> callback) {
            super("search_school", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(param_, "param_");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93450a = param_;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v8.q receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            v8.q qVar = null;
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
                    qVar = v8.q.f93378l.read(protocol);
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
            if (qVar != null) {
                return qVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(RemoteMessageConst.MessageBody.PARAM, 1, (byte) 12);
            v8.p.f93360j.write(protocol, this.f93450a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b1 implements xs.e<List<? extends v8.v>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<v8.v>> f93451a;

        /* JADX WARN: Multi-variable type inference failed */
        public b1(j00.c<? super List<v8.v>> cVar) {
            this.f93451a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<v8.v> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<v8.v>> cVar = this.f93451a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<v8.v>> cVar = this.f93451a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b2 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93452a;

        /* JADX WARN: Multi-variable type inference failed */
        public b2(j00.c<? super yz.g2> cVar) {
            this.f93452a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93452a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93452a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends xs.d<v8.x> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final v8.c f93453a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k v8.c param_, @m80.k xs.e<v8.x> callback) {
            super("bcz_login", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(param_, "param_");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93453a = param_;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v8.x receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            v8.x xVar = null;
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
                    xVar = v8.x.f93574m.read(protocol);
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
            protocol.Q6(RemoteMessageConst.MessageBody.PARAM, 1, (byte) 12);
            v8.c.f93256f.write(protocol, this.f93453a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c0 extends xs.d<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f93454a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final SendCaptchaAction f93455b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(@m80.k String account, @m80.k SendCaptchaAction action, @m80.k xs.e<Boolean> callback) {
            super("send_captcha", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(account, "account");
            kotlin.jvm.internal.g0.p(action, "action");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93454a = account;
            this.f93455b = action;
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
            protocol.Q6(AccountVerificationActivity.f19910x, 1, (byte) 11);
            protocol.p1(this.f93454a);
            protocol.N2();
            protocol.Q6("action", 2, (byte) 8);
            protocol.l5(this.f93455b.value);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c1 implements xs.e<v8.e> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<v8.e> f93456a;

        /* JADX WARN: Multi-variable type inference failed */
        public c1(j00.c<? super v8.e> cVar) {
            this.f93456a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k v8.e result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<v8.e> cVar = this.f93456a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<v8.e> cVar = this.f93456a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c2 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93457a;

        /* JADX WARN: Multi-variable type inference failed */
        public c2(j00.c<? super yz.g2> cVar) {
            this.f93457a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93457a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93457a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f93458a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f93459b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f93460c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k String phone, @m80.k String code, @m80.k String password, @m80.k xs.e<yz.g2> callback) {
            super("bind_phone", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(phone, "phone");
            kotlin.jvm.internal.g0.p(code, "code");
            kotlin.jvm.internal.g0.p(password, "password");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93458a = phone;
            this.f93459b = code;
            this.f93460c = password;
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
            protocol.Q6("phone", 1, (byte) 11);
            protocol.p1(this.f93458a);
            protocol.N2();
            protocol.Q6("code", 2, (byte) 11);
            protocol.p1(this.f93459b);
            protocol.N2();
            protocol.Q6(HintConstants.AUTOFILL_HINT_PASSWORD, 3, (byte) 11);
            protocol.p1(this.f93460c);
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
    public static final class d0 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f93461a;

        /* renamed from: b, reason: collision with root package name */
        public final int f93462b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(@m80.k String email, int i11, @m80.k xs.e<yz.g2> callback) {
            super("send_email_verify_code", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(email, "email");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93461a = email;
            this.f93462b = i11;
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
            protocol.Q6("email", 1, (byte) 11);
            protocol.p1(this.f93461a);
            protocol.N2();
            protocol.Q6("verify_type", 2, (byte) 8);
            protocol.l5(this.f93462b);
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
    public static final class d1 implements xs.e<List<? extends v8.i>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<v8.i>> f93463a;

        /* JADX WARN: Multi-variable type inference failed */
        public d1(j00.c<? super List<v8.i>> cVar) {
            this.f93463a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<v8.i> result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<List<v8.i>> cVar = this.f93463a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<List<v8.i>> cVar = this.f93463a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d2 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93464a;

        /* JADX WARN: Multi-variable type inference failed */
        public d2(j00.c<? super yz.g2> cVar) {
            this.f93464a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93464a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93464a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f93465a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f93466b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k String phone, @m80.k String code, @m80.k xs.e<yz.g2> callback) {
            super("bind_phone_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(phone, "phone");
            kotlin.jvm.internal.g0.p(code, "code");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93465a = phone;
            this.f93466b = code;
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
            protocol.Q6("phone", 1, (byte) 11);
            protocol.p1(this.f93465a);
            protocol.N2();
            protocol.Q6("code", 2, (byte) 11);
            protocol.p1(this.f93466b);
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
    public static final class e0 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f93467a;

        /* renamed from: b, reason: collision with root package name */
        public final int f93468b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(@m80.k String phone, int i11, @m80.k xs.e<yz.g2> callback) {
            super("send_sms_verify_code", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(phone, "phone");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93467a = phone;
            this.f93468b = i11;
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
            protocol.Q6("phone", 1, (byte) 11);
            protocol.p1(this.f93467a);
            protocol.N2();
            protocol.Q6("verify_type", 2, (byte) 8);
            protocol.l5(this.f93468b);
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
    public static final class e1 implements xs.e<v8.y> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<v8.y> f93469a;

        /* JADX WARN: Multi-variable type inference failed */
        public e1(j00.c<? super v8.y> cVar) {
            this.f93469a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k v8.y result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<v8.y> cVar = this.f93469a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<v8.y> cVar = this.f93469a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e2 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93470a;

        /* JADX WARN: Multi-variable type inference failed */
        public e2(j00.c<? super yz.g2> cVar) {
            this.f93470a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93470a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93470a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends xs.d<v8.d> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final v8.g f93471a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@m80.k v8.g request, @m80.k xs.e<v8.d> callback) {
            super("bind_phone_v3", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(request, "request");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93471a = request;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v8.d receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            v8.d dVar = null;
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
                    dVar = v8.d.f93266c.read(protocol);
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
            if (dVar != null) {
                return dVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(SocialConstants.TYPE_REQUEST, 1, (byte) 12);
            v8.g.f93286e.write(protocol, this.f93471a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f0 extends xs.d<v8.x> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final v8.r f93472a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(@m80.k v8.r param_, @m80.k xs.e<v8.x> callback) {
            super("third_party_bind_try_user", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(param_, "param_");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93472a = param_;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v8.x receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            v8.x xVar = null;
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
                    xVar = v8.x.f93574m.read(protocol);
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
            protocol.Q6(RemoteMessageConst.MessageBody.PARAM, 1, (byte) 12);
            v8.r.f93400m.write(protocol, this.f93472a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f1 implements xs.e<v8.s> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<v8.s> f93473a;

        /* JADX WARN: Multi-variable type inference failed */
        public f1(j00.c<? super v8.s> cVar) {
            this.f93473a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k v8.s result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<v8.s> cVar = this.f93473a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<v8.s> cVar = this.f93473a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f2 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93474a;

        /* JADX WARN: Multi-variable type inference failed */
        public f2(j00.c<? super yz.g2> cVar) {
            this.f93474a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93474a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93474a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends xs.d<v8.a> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f93475a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@m80.k String device, @m80.k xs.e<v8.a> callback) {
            super("check_access_token", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(device, "device");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93475a = device;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v8.a receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            v8.a aVar = null;
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
                    aVar = v8.a.f93230e.read(protocol);
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
            protocol.Q6("device", 1, (byte) 11);
            protocol.p1(this.f93475a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g0 extends xs.d<v8.x> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final v8.r f93476a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(@m80.k v8.r param_, @m80.k xs.e<v8.x> callback) {
            super("third_party_login", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(param_, "param_");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93476a = param_;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v8.x receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            v8.x xVar = null;
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
                    xVar = v8.x.f93574m.read(protocol);
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
            protocol.Q6(RemoteMessageConst.MessageBody.PARAM, 1, (byte) 12);
            v8.r.f93400m.write(protocol, this.f93476a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g1 implements xs.e<v8.x> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<v8.x> f93477a;

        /* JADX WARN: Multi-variable type inference failed */
        public g1(j00.c<? super v8.x> cVar) {
            this.f93477a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k v8.x result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<v8.x> cVar = this.f93477a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<v8.x> cVar = this.f93477a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g2 implements xs.e<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<String> f93478a;

        /* JADX WARN: Multi-variable type inference failed */
        public g2(j00.c<? super String> cVar) {
            this.f93478a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k String result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<String> cVar = this.f93478a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<String> cVar = this.f93478a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f93479a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f93480b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@m80.k String phone, @m80.k String verify_code, @m80.k xs.e<yz.g2> callback) {
            super("check_verify_code_for_old_phone", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(phone, "phone");
            kotlin.jvm.internal.g0.p(verify_code, "verify_code");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93479a = phone;
            this.f93480b = verify_code;
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
            protocol.Q6("phone", 1, (byte) 11);
            protocol.p1(this.f93479a);
            protocol.N2();
            protocol.Q6("verify_code", 2, (byte) 11);
            protocol.p1(this.f93480b);
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
    public static final class h0 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f93481a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f93482b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f93483c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(@m80.k String provider, @m80.k String openid, @m80.k String unionid, @m80.k xs.e<yz.g2> callback) {
            super("unbind_third_party", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(provider, "provider");
            kotlin.jvm.internal.g0.p(openid, "openid");
            kotlin.jvm.internal.g0.p(unionid, "unionid");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93481a = provider;
            this.f93482b = openid;
            this.f93483c = unionid;
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
            protocol.Q6(ma.b.f72911h1, 1, (byte) 11);
            protocol.p1(this.f93481a);
            protocol.N2();
            protocol.Q6("openid", 2, (byte) 11);
            protocol.p1(this.f93482b);
            protocol.N2();
            protocol.Q6(SocialOperation.GAME_UNION_ID, 3, (byte) 11);
            protocol.p1(this.f93483c);
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
    public static final class h1 implements xs.e<v8.z> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<v8.z> f93484a;

        /* JADX WARN: Multi-variable type inference failed */
        public h1(j00.c<? super v8.z> cVar) {
            this.f93484a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k v8.z result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<v8.z> cVar = this.f93484a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<v8.z> cVar = this.f93484a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h2 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93485a;

        /* JADX WARN: Multi-variable type inference failed */
        public h2(j00.c<? super yz.g2> cVar) {
            this.f93485a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93485a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93485a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f93486a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(@m80.k String account, @m80.k xs.e<yz.g2> callback) {
            super("delete_account", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(account, "account");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93486a = account;
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
            protocol.Q6(AccountVerificationActivity.f19910x, 1, (byte) 11);
            protocol.p1(this.f93486a);
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
    public static final class i0 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final long f93487a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(long j11, @m80.k xs.e<yz.g2> callback) {
            super("update_birthday", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93487a = j11;
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
            protocol.Q6("birthday", 1, (byte) 10);
            protocol.q7(this.f93487a);
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
    public static final class i1 implements xs.e<v8.a0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<v8.a0> f93488a;

        /* JADX WARN: Multi-variable type inference failed */
        public i1(j00.c<? super v8.a0> cVar) {
            this.f93488a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k v8.a0 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<v8.a0> cVar = this.f93488a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<v8.a0> cVar = this.f93488a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i2 implements xs.e<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Boolean> f93489a;

        /* JADX WARN: Multi-variable type inference failed */
        public i2(j00.c<? super Boolean> cVar) {
            this.f93489a = cVar;
        }

        public void a(boolean z11) {
            j00.c<Boolean> cVar = this.f93489a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Boolean.valueOf(z11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Boolean> cVar = this.f93489a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Boolean bool) {
            a(bool.booleanValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends xs.d<List<? extends v8.v>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(@m80.k xs.e<List<v8.v>> callback) {
            super("get_bind_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<v8.v> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
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
                        arrayList2.add(v8.v.f93548f.read(protocol));
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
    public static final class j0 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final int f93490a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(int i11, @m80.k xs.e<yz.g2> callback) {
            super("update_gender", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93490a = i11;
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
            protocol.Q6("gender_id", 1, (byte) 8);
            protocol.l5(this.f93490a);
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
    public static final class j1 implements xs.e<v8.x> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<v8.x> f93491a;

        /* JADX WARN: Multi-variable type inference failed */
        public j1(j00.c<? super v8.x> cVar) {
            this.f93491a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k v8.x result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<v8.x> cVar = this.f93491a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<v8.x> cVar = this.f93491a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j2 implements xs.e<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<String> f93492a;

        /* JADX WARN: Multi-variable type inference failed */
        public j2(j00.c<? super String> cVar) {
            this.f93492a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k String result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<String> cVar = this.f93492a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<String> cVar = this.f93492a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k extends xs.d<v8.e> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final SendCaptchaAction f93493a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(@m80.k SendCaptchaAction action, @m80.k xs.e<v8.e> callback) {
            super("get_img_captcha", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(action, "action");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93493a = action;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v8.e receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            v8.e eVar = null;
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
                    eVar = v8.e.f93270e.read(protocol);
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
            protocol.Q6("action", 1, (byte) 8);
            protocol.l5(this.f93493a.value);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k0 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f93494a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(@m80.k String nickname, @m80.k xs.e<yz.g2> callback) {
            super("update_nickname", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(nickname, "nickname");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93494a = nickname;
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
            protocol.Q6("nickname", 1, (byte) 11);
            protocol.p1(this.f93494a);
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
    public static final class k1 implements xs.e<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<String> f93495a;

        /* JADX WARN: Multi-variable type inference failed */
        public k1(j00.c<? super String> cVar) {
            this.f93495a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k String result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<String> cVar = this.f93495a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<String> cVar = this.f93495a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l extends xs.d<List<? extends v8.i>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(@m80.k xs.e<List<v8.i>> callback) {
            super("get_position_list", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<v8.i> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
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
                        arrayList2.add(v8.i.f93300e.read(protocol));
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
    public static final class l0 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final int f93496a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(int i11, @m80.k xs.e<yz.g2> callback) {
            super("update_position", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93496a = i11;
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
            protocol.Q6("position_code", 1, (byte) 8);
            protocol.l5(this.f93496a);
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
    public static final class l1 implements xs.e<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<String> f93497a;

        /* JADX WARN: Multi-variable type inference failed */
        public l1(j00.c<? super String> cVar) {
            this.f93497a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k String result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<String> cVar = this.f93497a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<String> cVar = this.f93497a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m extends xs.d<v8.y> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(@m80.k xs.e<v8.y> callback) {
            super("get_profile", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v8.y receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            v8.y yVar = null;
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
                    yVar = v8.y.f93598f.read(protocol);
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
            if (yVar != null) {
                return yVar;
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
    public static final class m0 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final int f93498a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f93499b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(int i11, @m80.k String nickname, @m80.k xs.e<yz.g2> callback) {
            super("update_profile", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(nickname, "nickname");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93498a = i11;
            this.f93499b = nickname;
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
            protocol.Q6("gender_id", 1, (byte) 8);
            protocol.l5(this.f93498a);
            protocol.N2();
            protocol.Q6("nickname", 2, (byte) 11);
            protocol.p1(this.f93499b);
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
    public static final class m1 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93500a;

        /* JADX WARN: Multi-variable type inference failed */
        public m1(j00.c<? super yz.g2> cVar) {
            this.f93500a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93500a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93500a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n extends xs.d<v8.s> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(@m80.k xs.e<v8.s> callback) {
            super("get_third_party_user_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v8.s receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            v8.s sVar = null;
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
                    sVar = v8.s.f93424l.read(protocol);
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
    public static final class n0 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final int f93501a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(int i11, @m80.k xs.e<yz.g2> callback) {
            super("update_role", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93501a = i11;
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
            protocol.Q6("rule_id", 1, (byte) 8);
            protocol.l5(this.f93501a);
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
    public static final class n1 implements xs.e<v8.x> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<v8.x> f93502a;

        /* JADX WARN: Multi-variable type inference failed */
        public n1(j00.c<? super v8.x> cVar) {
            this.f93502a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k v8.x result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<v8.x> cVar = this.f93502a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<v8.x> cVar = this.f93502a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o extends xs.d<v8.x> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(@m80.k xs.e<v8.x> callback) {
            super("have_a_try", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v8.x receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            v8.x xVar = null;
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
                    xVar = v8.x.f93574m.read(protocol);
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
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o0 extends xs.d<String> {

        /* renamed from: a, reason: collision with root package name */
        public final int f93503a;

        /* renamed from: b, reason: collision with root package name */
        public final int f93504b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(int i11, int i12, @m80.k xs.e<String> callback) {
            super("update_role_extra", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93503a = i11;
            this.f93504b = i12;
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
            protocol.Q6("role_up", 1, (byte) 8);
            protocol.l5(this.f93503a);
            protocol.N2();
            protocol.Q6("grade", 2, (byte) 8);
            protocol.l5(this.f93504b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o1 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93505a;

        /* JADX WARN: Multi-variable type inference failed */
        public o1(j00.c<? super yz.g2> cVar) {
            this.f93505a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93505a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93505a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p extends xs.d<v8.z> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(@m80.k xs.e<v8.z> callback) {
            super("have_a_try_v2", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v8.z receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            v8.z zVar = null;
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
                    zVar = v8.z.f93608d.read(protocol);
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
    public static final class p0 extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final v8.k f93506a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(@m80.k v8.k param_, @m80.k xs.e<yz.g2> callback) {
            super("update_school", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(param_, "param_");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93506a = param_;
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
            protocol.Q6(RemoteMessageConst.MessageBody.PARAM, 1, (byte) 12);
            v8.k.f93314f.write(protocol, this.f93506a);
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
    public static final class p1 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93507a;

        /* JADX WARN: Multi-variable type inference failed */
        public p1(j00.c<? super yz.g2> cVar) {
            this.f93507a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93507a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93507a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q extends xs.d<v8.a0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(@m80.k xs.e<v8.a0> callback) {
            super("have_a_try_v3", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v8.a0 receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            v8.a0 a0Var = null;
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
                    a0Var = v8.a0.f93238c.read(protocol);
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
            if (a0Var != null) {
                return a0Var;
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
    public static final class q0 extends xs.d<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f93508a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f93509b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f93510c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final SendCaptchaAction f93511d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(@m80.k String answer, @m80.k String trace_id, @m80.k String captcha, @m80.k SendCaptchaAction action, @m80.k xs.e<Boolean> callback) {
            super("verify_img_captcha", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(answer, "answer");
            kotlin.jvm.internal.g0.p(trace_id, "trace_id");
            kotlin.jvm.internal.g0.p(captcha, "captcha");
            kotlin.jvm.internal.g0.p(action, "action");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93508a = answer;
            this.f93509b = trace_id;
            this.f93510c = captcha;
            this.f93511d = action;
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
            protocol.Q6("answer", 1, (byte) 11);
            protocol.p1(this.f93508a);
            protocol.N2();
            protocol.Q6("trace_id", 2, (byte) 11);
            protocol.p1(this.f93509b);
            protocol.N2();
            protocol.Q6("captcha", 3, (byte) 11);
            protocol.p1(this.f93510c);
            protocol.N2();
            protocol.Q6("action", 4, (byte) 8);
            protocol.l5(this.f93511d.value);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q1 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f93512a;

        /* JADX WARN: Multi-variable type inference failed */
        public q1(j00.c<? super Integer> cVar) {
            this.f93512a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f93512a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Integer> cVar = this.f93512a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r extends xs.d<v8.x> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final v8.g f93513a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(@m80.k v8.g request, @m80.k xs.e<v8.x> callback) {
            super("login_with_phone", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(request, "request");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93513a = request;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v8.x receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            v8.x xVar = null;
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
                    xVar = v8.x.f93574m.read(protocol);
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
            protocol.Q6(SocialConstants.TYPE_REQUEST, 1, (byte) 12);
            v8.g.f93286e.write(protocol, this.f93513a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r0 extends xs.d<String> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f93514a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(@m80.k String watch_uuid, @m80.k xs.e<String> callback) {
            super("watch_poll_login", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(watch_uuid, "watch_uuid");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93514a = watch_uuid;
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
            protocol.Q6("watch_uuid", 1, (byte) 11);
            protocol.p1(this.f93514a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r1 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93515a;

        /* JADX WARN: Multi-variable type inference failed */
        public r1(j00.c<? super yz.g2> cVar) {
            this.f93515a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93515a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93515a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class s extends xs.d<String> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f93516a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final SendCaptchaAction f93517b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(@m80.k String account, @m80.k SendCaptchaAction action, @m80.k xs.e<String> callback) {
            super("mock_send_captcha", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(account, "account");
            kotlin.jvm.internal.g0.p(action, "action");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93516a = account;
            this.f93517b = action;
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
            protocol.Q6(AccountVerificationActivity.f19910x, 1, (byte) 11);
            protocol.p1(this.f93516a);
            protocol.N2();
            protocol.Q6("action", 2, (byte) 8);
            protocol.l5(this.f93517b.value);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class s0 implements xs.e<v8.x> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<v8.x> f93518a;

        /* JADX WARN: Multi-variable type inference failed */
        public s0(j00.c<? super v8.x> cVar) {
            this.f93518a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k v8.x result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<v8.x> cVar = this.f93518a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<v8.x> cVar = this.f93518a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class s1 implements xs.e<v8.n> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<v8.n> f93519a;

        /* JADX WARN: Multi-variable type inference failed */
        public s1(j00.c<? super v8.n> cVar) {
            this.f93519a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k v8.n result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<v8.n> cVar = this.f93519a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<v8.n> cVar = this.f93519a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t extends xs.d<String> {

        /* renamed from: a, reason: collision with root package name */
        public final int f93520a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(int i11, @m80.k xs.e<String> callback) {
            super("post_select_role_action_config", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93520a = i11;
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
            protocol.Q6("role", 1, (byte) 8);
            protocol.l5(this.f93520a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t0 implements xs.e<v8.x> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<v8.x> f93521a;

        /* JADX WARN: Multi-variable type inference failed */
        public t0(j00.c<? super v8.x> cVar) {
            this.f93521a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k v8.x result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<v8.x> cVar = this.f93521a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<v8.x> cVar = this.f93521a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t1 implements xs.e<v8.q> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<v8.q> f93522a;

        /* JADX WARN: Multi-variable type inference failed */
        public t1(j00.c<? super v8.q> cVar) {
            this.f93522a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k v8.q result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<v8.q> cVar = this.f93522a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<v8.q> cVar = this.f93522a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: v8.u$u, reason: collision with other inner class name */
    public static final class C1258u extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f93523a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f93524b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f93525c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f93526d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1258u(@m80.k String oldphone, @m80.k String newphone, @m80.k String code, @m80.k String password, @m80.k xs.e<yz.g2> callback) {
            super("rebind_phone", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(oldphone, "oldphone");
            kotlin.jvm.internal.g0.p(newphone, "newphone");
            kotlin.jvm.internal.g0.p(code, "code");
            kotlin.jvm.internal.g0.p(password, "password");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93523a = oldphone;
            this.f93524b = newphone;
            this.f93525c = code;
            this.f93526d = password;
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
            protocol.Q6("oldphone", 1, (byte) 11);
            protocol.p1(this.f93523a);
            protocol.N2();
            protocol.Q6("newphone", 2, (byte) 11);
            protocol.p1(this.f93524b);
            protocol.N2();
            protocol.Q6("code", 3, (byte) 11);
            protocol.p1(this.f93525c);
            protocol.N2();
            protocol.Q6(HintConstants.AUTOFILL_HINT_PASSWORD, 4, (byte) 11);
            protocol.p1(this.f93526d);
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
    public static final class u0 implements xs.e<v8.x> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<v8.x> f93527a;

        /* JADX WARN: Multi-variable type inference failed */
        public u0(j00.c<? super v8.x> cVar) {
            this.f93527a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k v8.x result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<v8.x> cVar = this.f93527a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<v8.x> cVar = this.f93527a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u1 implements xs.e<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Boolean> f93528a;

        /* JADX WARN: Multi-variable type inference failed */
        public u1(j00.c<? super Boolean> cVar) {
            this.f93528a = cVar;
        }

        public void a(boolean z11) {
            j00.c<Boolean> cVar = this.f93528a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Boolean.valueOf(z11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<Boolean> cVar = this.f93528a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Boolean bool) {
            a(bool.booleanValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v extends xs.d<v8.x> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final v8.c f93529a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(@m80.k v8.c param_, @m80.k xs.e<v8.x> callback) {
            super("register_user", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(param_, "param_");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93529a = param_;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v8.x receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            v8.x xVar = null;
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
                    xVar = v8.x.f93574m.read(protocol);
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
            protocol.Q6(RemoteMessageConst.MessageBody.PARAM, 1, (byte) 12);
            v8.c.f93256f.write(protocol, this.f93529a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v0 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93530a;

        /* JADX WARN: Multi-variable type inference failed */
        public v0(j00.c<? super yz.g2> cVar) {
            this.f93530a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93530a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93530a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v1 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93531a;

        /* JADX WARN: Multi-variable type inference failed */
        public v1(j00.c<? super yz.g2> cVar) {
            this.f93531a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93531a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93531a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class w extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f93532a;

        /* renamed from: b, reason: collision with root package name */
        public final int f93533b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(@m80.k String school_name, int i11, @m80.k xs.e<yz.g2> callback) {
            super("report_school", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(school_name, "school_name");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93532a = school_name;
            this.f93533b = i11;
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
            protocol.Q6("school_name", 1, (byte) 11);
            protocol.p1(this.f93532a);
            protocol.N2();
            protocol.Q6("type", 2, (byte) 8);
            protocol.l5(this.f93533b);
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
    public static final class w0 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93534a;

        /* JADX WARN: Multi-variable type inference failed */
        public w0(j00.c<? super yz.g2> cVar) {
            this.f93534a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93534a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93534a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class w1 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93535a;

        /* JADX WARN: Multi-variable type inference failed */
        public w1(j00.c<? super yz.g2> cVar) {
            this.f93535a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93535a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93535a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class x extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f93536a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f93537b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f93538c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(@m80.k String account, @m80.k String password, @m80.k String code, @m80.k xs.e<yz.g2> callback) {
            super("reset_password", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(account, "account");
            kotlin.jvm.internal.g0.p(password, "password");
            kotlin.jvm.internal.g0.p(code, "code");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93536a = account;
            this.f93537b = password;
            this.f93538c = code;
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
            protocol.Q6(AccountVerificationActivity.f19910x, 1, (byte) 11);
            protocol.p1(this.f93536a);
            protocol.N2();
            protocol.Q6(HintConstants.AUTOFILL_HINT_PASSWORD, 2, (byte) 11);
            protocol.p1(this.f93537b);
            protocol.N2();
            protocol.Q6("code", 3, (byte) 11);
            protocol.p1(this.f93538c);
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
    public static final class x0 implements xs.e<v8.d> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<v8.d> f93539a;

        /* JADX WARN: Multi-variable type inference failed */
        public x0(j00.c<? super v8.d> cVar) {
            this.f93539a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k v8.d result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<v8.d> cVar = this.f93539a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<v8.d> cVar = this.f93539a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class x1 implements xs.e<v8.x> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<v8.x> f93540a;

        /* JADX WARN: Multi-variable type inference failed */
        public x1(j00.c<? super v8.x> cVar) {
            this.f93540a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k v8.x result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<v8.x> cVar = this.f93540a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<v8.x> cVar = this.f93540a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class y extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final v8.w f93541a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(@m80.k v8.w ext_info, @m80.k xs.e<Integer> callback) {
            super("save_user_ext_info", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(ext_info, "ext_info");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93541a = ext_info;
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
            protocol.Q6("ext_info", 1, (byte) 12);
            v8.w.f93558i.write(protocol, this.f93541a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class y0 implements xs.e<v8.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<v8.a> f93542a;

        /* JADX WARN: Multi-variable type inference failed */
        public y0(j00.c<? super v8.a> cVar) {
            this.f93542a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k v8.a result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<v8.a> cVar = this.f93542a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<v8.a> cVar = this.f93542a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class y1 implements xs.e<v8.x> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<v8.x> f93543a;

        /* JADX WARN: Multi-variable type inference failed */
        public y1(j00.c<? super v8.x> cVar) {
            this.f93543a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k v8.x result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<v8.x> cVar = this.f93543a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<v8.x> cVar = this.f93543a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class z extends xs.d<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f93544a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(@m80.k String watch_uuid, @m80.k xs.e<yz.g2> callback) {
            super("scan_for_watch_login", (byte) 1, callback);
            kotlin.jvm.internal.g0.p(watch_uuid, "watch_uuid");
            kotlin.jvm.internal.g0.p(callback, "callback");
            this.f93544a = watch_uuid;
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
            protocol.Q6("watch_uuid", 1, (byte) 11);
            protocol.p1(this.f93544a);
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
    public static final class z0 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93545a;

        /* JADX WARN: Multi-variable type inference failed */
        public z0(j00.c<? super yz.g2> cVar) {
            this.f93545a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93545a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93545a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class z1 implements xs.e<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<yz.g2> f93546a;

        /* JADX WARN: Multi-variable type inference failed */
        public z1(j00.c<? super yz.g2> cVar) {
            this.f93546a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k yz.g2 result) {
            kotlin.jvm.internal.g0.p(result, "result");
            j00.c<yz.g2> cVar = this.f93546a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            kotlin.jvm.internal.g0.p(error, "error");
            j00.c<yz.g2> cVar = this.f93546a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(@m80.k ws.i protocol, @m80.k a.InterfaceC0480a listener) {
        super(protocol, listener);
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        kotlin.jvm.internal.g0.p(listener, "listener");
    }

    @Override // v8.t
    @m80.l
    public Object A4(@m80.k String str, @m80.k SendCaptchaAction sendCaptchaAction, @m80.k j00.c<? super String> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new s(str, sendCaptchaAction, new k1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object G3(@m80.k v8.c cVar, @m80.k j00.c<? super v8.x> cVar2) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar2));
        enqueue(new b(cVar, new t0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar2);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object G4(@m80.k String str, @m80.k String str2, @m80.k String str3, @m80.k String str4, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new C1258u(str, str2, str3, str4, new m1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // v8.t
    @m80.l
    public Object H1(@m80.k v8.k kVar, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new p0(kVar, new h2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // v8.t
    @m80.l
    public Object H2(@m80.k String str, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new i(str, new a1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // v8.t
    @m80.l
    public Object L7(@m80.k v8.p pVar, @m80.k j00.c<? super v8.q> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new b0(pVar, new t1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object N3(@m80.k String str, @m80.k SendCaptchaAction sendCaptchaAction, @m80.k j00.c<? super Boolean> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new c0(str, sendCaptchaAction, new u1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object O6(@m80.k v8.g gVar, @m80.k j00.c<? super v8.d> cVar) {
        j00.g gVar2 = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new f(gVar, new x0(gVar2)));
        Object b11 = gVar2.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object P6(@m80.k j00.c<? super List<v8.v>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new j(new b1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object P8(int i11, int i12, @m80.k j00.c<? super String> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new o0(i11, i12, new g2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object Q3(int i11, @m80.k String str, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new m0(i11, str, new e2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // v8.t
    @m80.l
    public Object Q4(@m80.k String str, int i11, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new w(str, i11, new o1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // v8.t
    @m80.l
    public Object Q5(@m80.k String str, @m80.k String str2, @m80.k String str3, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new x(str, str2, str3, new p1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // v8.t
    @m80.l
    public Object R4(@m80.k v8.r rVar, @m80.k j00.c<? super v8.x> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new g0(rVar, new y1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object S6(@m80.k v8.w wVar, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new y(wVar, new q1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object U(int i11, @m80.k j00.c<? super String> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new t(i11, new l1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object V4(int i11, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new l0(i11, new d2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // v8.t
    @m80.l
    public Object W6(@m80.k SendCaptchaAction sendCaptchaAction, @m80.k j00.c<? super v8.e> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new k(sendCaptchaAction, new c1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object Y2(@m80.k j00.c<? super v8.y> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new m(new e1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object Z1(@m80.k String str, @m80.k j00.c<? super v8.a> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new g(str, new y0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object c0(@m80.k v8.m mVar, @m80.k j00.c<? super v8.n> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new a0(mVar, new s1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object c6(@m80.k v8.r rVar, @m80.k j00.c<? super v8.x> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new f0(rVar, new x1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object d1(long j11, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new i0(j11, new a2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // v8.t
    @m80.l
    public Object d7(@m80.k j00.c<? super List<v8.i>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new l(new d1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object e4(int i11, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new j0(i11, new b2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // v8.t
    @m80.l
    public Object f5(@m80.k String str, @m80.k String str2, @m80.k String str3, @m80.k SendCaptchaAction sendCaptchaAction, @m80.k j00.c<? super Boolean> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new q0(str, str2, str3, sendCaptchaAction, new i2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object h7(@m80.k String str, int i11, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new e0(str, i11, new w1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // v8.t
    @m80.l
    public Object i(@m80.k j00.c<? super v8.s> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new n(new f1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object i4(@m80.k v8.c cVar, @m80.k j00.c<? super v8.x> cVar2) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar2));
        enqueue(new c(cVar, new u0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar2);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object j2(@m80.k String str, @m80.k j00.c<? super String> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new r0(str, new j2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object k8(@m80.k v8.b bVar, @m80.k j00.c<? super v8.x> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new a(bVar, new s0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object m2(@m80.k String str, @m80.k String str2, @m80.k String str3, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new h0(str, str2, str3, new z1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // v8.t
    @m80.l
    public Object m7(@m80.k String str, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new k0(str, new c2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // v8.t
    @m80.l
    public Object r6(@m80.k String str, @m80.k String str2, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new h(str, str2, new z0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // v8.t
    @m80.l
    public Object u2(@m80.k j00.c<? super v8.a0> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new q(new i1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object u3(int i11, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new n0(i11, new f2(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // v8.t
    @m80.l
    public Object w3(@m80.k v8.g gVar, @m80.k j00.c<? super v8.x> cVar) {
        j00.g gVar2 = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new r(gVar, new j1(gVar2)));
        Object b11 = gVar2.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object w8(@m80.k String str, @m80.k String str2, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new e(str, str2, new w0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // v8.t
    @m80.l
    public Object x0(@m80.k v8.c cVar, @m80.k j00.c<? super v8.x> cVar2) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar2));
        enqueue(new v(cVar, new n1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar2);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object x8(@m80.k String str, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new z(str, new r1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // v8.t
    @m80.l
    public Object y1(@m80.k j00.c<? super v8.z> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new p(new h1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object y7(@m80.k j00.c<? super v8.x> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new o(new g1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // v8.t
    @m80.l
    public Object z3(@m80.k String str, int i11, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new d0(str, i11, new v1(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @Override // v8.t
    @m80.l
    public Object z6(@m80.k String str, @m80.k String str2, @m80.k String str3, @m80.k j00.c<? super yz.g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new d(str, str2, str3, new v0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }
}
