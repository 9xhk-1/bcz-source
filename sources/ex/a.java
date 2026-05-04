package ex;

import cx.f0;
import io.ktor.utils.io.b0;
import ix.f1;
import ix.g1;
import ix.q0;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@b0
/* loaded from: classes8.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final mw.a f50173a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final kotlin.coroutines.d f50174b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g1 f50175c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f1 f50176d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final bz.b f50177e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final bz.b f50178f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final io.ktor.utils.io.g f50179g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final q0 f50180h;

    public a(@k mw.a call, @k f0 responseData) {
        g0.p(call, "call");
        g0.p(responseData, "responseData");
        this.f50173a = call;
        this.f50174b = responseData.b();
        this.f50175c = responseData.f();
        this.f50176d = responseData.g();
        this.f50177e = responseData.d();
        this.f50178f = responseData.e();
        Object a11 = responseData.a();
        io.ktor.utils.io.g gVar = a11 instanceof io.ktor.utils.io.g ? (io.ktor.utils.io.g) a11 : null;
        this.f50179g = gVar == null ? io.ktor.utils.io.g.f62105a.a() : gVar;
        this.f50180h = responseData.c();
    }

    @Override // ix.a1
    @k
    public q0 a() {
        return this.f50180h;
    }

    @Override // ex.c
    @k
    public io.ktor.utils.io.g b() {
        return this.f50179g;
    }

    @Override // ex.c
    @k
    public mw.a c() {
        return this.f50173a;
    }

    @Override // ex.c
    @k
    public bz.b e() {
        return this.f50177e;
    }

    @Override // c40.r0
    @k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f50174b;
    }

    @Override // ex.c
    @k
    public bz.b h() {
        return this.f50178f;
    }

    @Override // ex.c
    @k
    public g1 i() {
        return this.f50175c;
    }

    @Override // ex.c
    @k
    public f1 l() {
        return this.f50176d;
    }
}
