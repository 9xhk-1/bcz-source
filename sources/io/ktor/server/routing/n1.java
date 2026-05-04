package io.ktor.server.routing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n1 implements qy.o {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l1 f61674a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final qy.m f61675b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final qy.o f61676c;

    public n1(@m80.k l1 call, @m80.k qy.m pipeline, @m80.k qy.o engineResponse) {
        kotlin.jvm.internal.g0.p(call, "call");
        kotlin.jvm.internal.g0.p(pipeline, "pipeline");
        kotlin.jvm.internal.g0.p(engineResponse, "engineResponse");
        this.f61674a = call;
        this.f61675b = pipeline;
        this.f61676c = engineResponse;
    }

    @Override // qy.a
    @m80.k
    public qy.q a() {
        return this.f61676c.a();
    }

    @Override // qy.o
    @m80.k
    public qy.m b() {
        return this.f61675b;
    }

    @Override // qy.a
    public boolean d() {
        return this.f61676c.d();
    }

    @Override // qy.a
    public boolean e() {
        return this.f61676c.e();
    }

    @Override // qy.o, qy.a
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public l1 c() {
        return this.f61674a;
    }

    @m80.k
    public final qy.o g() {
        return this.f61676c;
    }

    @Override // qy.a
    @m80.k
    public qy.p getCookies() {
        return this.f61676c.getCookies();
    }

    @Override // qy.a
    public void h(@m80.k ix.g1 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        this.f61676c.h(value);
    }

    @Override // qy.a
    @qy.u
    public void i(@m80.k qy.s builder) {
        kotlin.jvm.internal.g0.p(builder, "builder");
        this.f61676c.i(builder);
    }

    @Override // qy.a
    @m80.l
    public ix.g1 l() {
        return this.f61676c.l();
    }
}
