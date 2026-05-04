package yw;

import cx.w;
import ix.e1;
import ix.q0;
import ix.t2;
import kotlin.jvm.internal.g0;
import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f100340a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final mw.a f100341b;

    public e(@m80.k mw.a call, @m80.k w origin) {
        g0.p(call, "call");
        g0.p(origin, "origin");
        this.f100340a = origin;
        this.f100341b = call;
    }

    @Override // ix.a1
    @m80.k
    public q0 a() {
        return this.f100340a.a();
    }

    @Override // cx.w
    @m80.k
    public mw.a c() {
        return this.f100341b;
    }

    @Override // cx.w
    @m80.k
    public xy.b getAttributes() {
        return this.f100340a.getAttributes();
    }

    @Override // cx.w, c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f100340a.getCoroutineContext();
    }

    @Override // cx.w
    @m80.k
    public e1 getMethod() {
        return this.f100340a.getMethod();
    }

    @Override // cx.w
    @m80.k
    public t2 getUrl() {
        return this.f100340a.getUrl();
    }

    @Override // cx.w
    @m80.k
    public v w() {
        return this.f100340a.w();
    }
}
