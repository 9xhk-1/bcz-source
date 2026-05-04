package io.ktor.server.routing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o1 implements py.d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ix.p1 f61686a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final py.g f61687b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final b1 f61688c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final ix.p1 f61689d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final ix.p1 f61690e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final ix.q0 f61691f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final ix.z1 f61692g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final py.k f61693h;

    public o1(@m80.k ix.p1 pathVariables, @m80.k py.g request, @m80.k b1 call) {
        kotlin.jvm.internal.g0.p(pathVariables, "pathVariables");
        kotlin.jvm.internal.g0.p(request, "request");
        kotlin.jvm.internal.g0.p(call, "call");
        this.f61686a = pathVariables;
        this.f61687b = request;
        this.f61688c = call;
        this.f61689d = request.m();
        this.f61690e = request.d();
        this.f61691f = request.a();
        this.f61692g = request.h();
        this.f61693h = request.getCookies();
    }

    @Override // py.d
    @m80.k
    public ix.q0 a() {
        return this.f61691f;
    }

    @Override // py.d
    @m80.k
    public ix.p1 d() {
        return this.f61690e;
    }

    @Override // py.d
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b1 c() {
        return this.f61688c;
    }

    @m80.k
    public final ix.p1 g() {
        return this.f61686a;
    }

    @Override // py.d
    @m80.k
    public py.k getCookies() {
        return this.f61693h;
    }

    @Override // py.d
    @m80.k
    public ix.z1 h() {
        return this.f61692g;
    }

    @Override // py.d
    @m80.k
    public io.ktor.utils.io.g i() {
        return this.f61687b.i();
    }

    @m80.k
    public final py.g j() {
        return this.f61687b;
    }

    @Override // py.d
    @m80.k
    public ix.p1 m() {
        return this.f61689d;
    }
}
