package cx;

import ix.f1;
import ix.g1;
import ix.q0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g1 f46873a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final bz.b f46874b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final q0 f46875c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final f1 f46876d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Object f46877e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f46878f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final bz.b f46879g;

    public f0(@m80.k g1 statusCode, @m80.k bz.b requestTime, @m80.k q0 headers, @m80.k f1 version, @m80.k Object body, @m80.k kotlin.coroutines.d callContext) {
        kotlin.jvm.internal.g0.p(statusCode, "statusCode");
        kotlin.jvm.internal.g0.p(requestTime, "requestTime");
        kotlin.jvm.internal.g0.p(headers, "headers");
        kotlin.jvm.internal.g0.p(version, "version");
        kotlin.jvm.internal.g0.p(body, "body");
        kotlin.jvm.internal.g0.p(callContext, "callContext");
        this.f46873a = statusCode;
        this.f46874b = requestTime;
        this.f46875c = headers;
        this.f46876d = version;
        this.f46877e = body;
        this.f46878f = callContext;
        this.f46879g = io.ktor.util.date.a.c(null, 1, null);
    }

    @m80.k
    public final Object a() {
        return this.f46877e;
    }

    @m80.k
    public final kotlin.coroutines.d b() {
        return this.f46878f;
    }

    @m80.k
    public final q0 c() {
        return this.f46875c;
    }

    @m80.k
    public final bz.b d() {
        return this.f46874b;
    }

    @m80.k
    public final bz.b e() {
        return this.f46879g;
    }

    @m80.k
    public final g1 f() {
        return this.f46873a;
    }

    @m80.k
    public final f1 g() {
        return this.f46876d;
    }

    @m80.k
    public String toString() {
        return "HttpResponseData=(statusCode=" + this.f46873a + ')';
    }
}
