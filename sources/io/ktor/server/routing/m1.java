package io.ktor.server.routing;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m1 implements py.g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l1 f61669a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final py.c f61670b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final py.g f61671c;

    public m1(@m80.k l1 call, @m80.k py.c pipeline, @m80.k py.g engineRequest) {
        kotlin.jvm.internal.g0.p(call, "call");
        kotlin.jvm.internal.g0.p(pipeline, "pipeline");
        kotlin.jvm.internal.g0.p(engineRequest, "engineRequest");
        this.f61669a = call;
        this.f61670b = pipeline;
        this.f61671c = engineRequest;
    }

    @Override // py.d
    @m80.k
    public ix.q0 a() {
        return this.f61671c.a();
    }

    @Override // py.g
    @m80.k
    public py.c b() {
        return this.f61670b;
    }

    @Override // py.d
    @m80.k
    public ix.p1 d() {
        return this.f61671c.d();
    }

    @Override // py.g
    @io.ktor.utils.io.b0
    public void e(@m80.k String name, @m80.l List<String> list) {
        kotlin.jvm.internal.g0.p(name, "name");
        this.f61671c.e(name, list);
    }

    @Override // py.g, py.d
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public l1 c() {
        return this.f61669a;
    }

    @m80.k
    public final py.g g() {
        return this.f61671c;
    }

    @Override // py.d
    @m80.k
    public py.k getCookies() {
        return this.f61671c.getCookies();
    }

    @Override // py.d
    @m80.k
    public ix.z1 h() {
        return this.f61671c.h();
    }

    @Override // py.d
    @m80.k
    public io.ktor.utils.io.g i() {
        return this.f61671c.i();
    }

    @Override // py.g
    @io.ktor.utils.io.b0
    public void l(@m80.k io.ktor.utils.io.g channel) {
        kotlin.jvm.internal.g0.p(channel, "channel");
        this.f61671c.l(channel);
    }

    @Override // py.d
    @m80.k
    public ix.p1 m() {
        return this.f61671c.m();
    }
}
