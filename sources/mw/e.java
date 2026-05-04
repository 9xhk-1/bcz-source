package mw;

import cx.w;
import ix.e1;
import ix.q0;
import ix.t2;
import kotlin.jvm.internal.g0;
import m80.k;
import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f73749a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f73750b;

    public e(@k d call, @k w origin) {
        g0.p(call, "call");
        g0.p(origin, "origin");
        this.f73749a = origin;
        this.f73750b = call;
    }

    @Override // ix.a1
    @k
    public q0 a() {
        return this.f73749a.a();
    }

    @Override // cx.w
    @k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d c() {
        return this.f73750b;
    }

    @Override // cx.w
    @k
    public xy.b getAttributes() {
        return this.f73749a.getAttributes();
    }

    @Override // cx.w, c40.r0
    @k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f73749a.getCoroutineContext();
    }

    @Override // cx.w
    @k
    public e1 getMethod() {
        return this.f73749a.getMethod();
    }

    @Override // cx.w
    @k
    public t2 getUrl() {
        return this.f73749a.getUrl();
    }

    @Override // cx.w
    @k
    public v w() {
        return this.f73749a.w();
    }
}
