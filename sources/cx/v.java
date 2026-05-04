package cx;

import ix.e1;
import ix.q0;
import ix.t2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.b0
/* loaded from: classes8.dex */
public class v implements w {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final mw.a f46921a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final e1 f46922b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final t2 f46923c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final mx.v f46924d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final q0 f46925e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final xy.b f46926f;

    public v(@m80.k mw.a call, @m80.k z data) {
        kotlin.jvm.internal.g0.p(call, "call");
        kotlin.jvm.internal.g0.p(data, "data");
        this.f46921a = call;
        this.f46922b = data.f();
        this.f46923c = data.h();
        this.f46924d = data.b();
        this.f46925e = data.e();
        this.f46926f = data.a();
    }

    @Override // ix.a1
    @m80.k
    public q0 a() {
        return this.f46925e;
    }

    @Override // cx.w
    @m80.k
    public mw.a c() {
        return this.f46921a;
    }

    @Override // cx.w
    @m80.k
    public xy.b getAttributes() {
        return this.f46926f;
    }

    @Override // cx.w, c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return c().getCoroutineContext();
    }

    @Override // cx.w
    @m80.k
    public e1 getMethod() {
        return this.f46922b;
    }

    @Override // cx.w
    @m80.k
    public t2 getUrl() {
        return this.f46923c;
    }

    @Override // cx.w
    @m80.k
    public mx.v w() {
        return this.f46924d;
    }
}
