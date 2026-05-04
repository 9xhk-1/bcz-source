package mw;

import io.ktor.utils.io.g;
import ix.f1;
import ix.g1;
import ix.q0;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f extends ex.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f73751a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final byte[] f73752b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g1 f73753c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f1 f73754d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final bz.b f73755e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final bz.b f73756f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final q0 f73757g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final kotlin.coroutines.d f73758h;

    public f(@k d call, @k byte[] body, @k ex.c origin) {
        g0.p(call, "call");
        g0.p(body, "body");
        g0.p(origin, "origin");
        this.f73751a = call;
        this.f73752b = body;
        this.f73753c = origin.i();
        this.f73754d = origin.l();
        this.f73755e = origin.e();
        this.f73756f = origin.h();
        this.f73757g = origin.a();
        this.f73758h = origin.getCoroutineContext();
    }

    @Override // ix.a1
    @k
    public q0 a() {
        return this.f73757g;
    }

    @Override // ex.c
    @k
    public g b() {
        return io.ktor.utils.io.c.e(this.f73752b, 0, 0, 6, null);
    }

    @Override // ex.c
    @k
    public bz.b e() {
        return this.f73755e;
    }

    @Override // c40.r0
    @k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f73758h;
    }

    @Override // ex.c
    @k
    public bz.b h() {
        return this.f73756f;
    }

    @Override // ex.c
    @k
    public g1 i() {
        return this.f73753c;
    }

    @Override // ex.c
    @k
    public f1 l() {
        return this.f73754d;
    }

    @Override // ex.c
    @k
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public d c() {
        return this.f73751a;
    }

    public static /* synthetic */ void d() {
    }
}
