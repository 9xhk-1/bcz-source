package io.ktor.server.routing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class w1 implements qy.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b1 f61759a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final qy.o f61760b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final qy.q f61761c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final qy.p f61762d;

    public w1(@m80.k b1 call, @m80.k qy.o applicationResponse) {
        kotlin.jvm.internal.g0.p(call, "call");
        kotlin.jvm.internal.g0.p(applicationResponse, "applicationResponse");
        this.f61759a = call;
        this.f61760b = applicationResponse;
        this.f61761c = applicationResponse.a();
        this.f61762d = applicationResponse.getCookies();
    }

    @Override // qy.a
    @m80.k
    public qy.q a() {
        return this.f61761c;
    }

    @Override // qy.a
    public boolean d() {
        return this.f61760b.d();
    }

    @Override // qy.a
    public boolean e() {
        return this.f61760b.e();
    }

    @m80.k
    public final qy.o f() {
        return this.f61760b;
    }

    @Override // qy.a
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public b1 c() {
        return this.f61759a;
    }

    @Override // qy.a
    @m80.k
    public qy.p getCookies() {
        return this.f61762d;
    }

    @Override // qy.a
    public void h(@m80.k ix.g1 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        this.f61760b.h(value);
    }

    @Override // qy.a
    @qy.u
    public void i(@m80.k qy.s builder) {
        kotlin.jvm.internal.g0.p(builder, "builder");
        this.f61760b.i(builder);
    }

    @Override // qy.a
    @m80.l
    public ix.g1 l() {
        return this.f61760b.l();
    }
}
