package tw;

import cx.w;
import cx.z;
import ix.e1;
import ix.q0;
import ix.t2;
import kotlin.jvm.internal.g0;
import m80.k;
import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i implements w {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e1 f91055a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final t2 f91056b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final xy.b f91057c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final v f91058d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final q0 f91059e;

    public i(@k z data) {
        g0.p(data, "data");
        this.f91055a = data.f();
        this.f91056b = data.h();
        this.f91057c = data.a();
        this.f91058d = data.b();
        this.f91059e = data.e();
    }

    @Override // ix.a1
    @k
    public q0 a() {
        return this.f91059e;
    }

    @Override // cx.w
    @k
    public mw.a c() {
        throw new IllegalStateException("This request has no call");
    }

    @Override // cx.w
    @k
    public xy.b getAttributes() {
        return this.f91057c;
    }

    @Override // cx.w, c40.r0
    @k
    public kotlin.coroutines.d getCoroutineContext() {
        return w.a.a(this);
    }

    @Override // cx.w
    @k
    public e1 getMethod() {
        return this.f91055a;
    }

    @Override // cx.w
    @k
    public t2 getUrl() {
        return this.f91056b;
    }

    @Override // cx.w
    @k
    public v w() {
        return this.f91058d;
    }
}
