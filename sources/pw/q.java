package pw;

import c40.z;
import e40.l0;
import io.ktor.client.plugins.sse.SSEClientException;
import ix.g1;
import ix.k;
import ix.y0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import zw.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOkHttpSSESession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpSSESession.kt\nio/ktor/client/engine/okhttp/OkHttpSSESession\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
/* loaded from: classes8.dex */
public final class q extends k60.b implements x {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f81271a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k60.a f81272b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c40.x<okhttp3.n> f81273c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final e40.o<vy.a> f81274d;

    public q(@m80.k t50.q engine, @m80.k okhttp3.l engineRequest, @m80.k kotlin.coroutines.d coroutineContext) {
        g0.p(engine, "engine");
        g0.p(engineRequest, "engineRequest");
        g0.p(coroutineContext, "coroutineContext");
        this.f81271a = coroutineContext;
        this.f81272b = k60.d.b(engine).a(engineRequest, this);
        this.f81273c = z.c(null, 1, null);
        this.f81274d = e40.r.d(8, null, null, 6, null);
    }

    @Override // k60.b
    public void a(@m80.k k60.a eventSource) {
        g0.p(eventSource, "eventSource");
        l0.a.a(this.f81274d, null, 1, null);
        this.f81272b.cancel();
    }

    @Override // k60.b
    public void b(@m80.k k60.a eventSource, @m80.l String str, @m80.l String str2, @m80.k String data) {
        g0.p(eventSource, "eventSource");
        g0.p(data, "data");
        e40.u.m0(this.f81274d, new vy.a(data, str2, str, null, null, 24, null));
    }

    @Override // k60.b
    public void d(@m80.k k60.a eventSource, @m80.l Throwable th2, @m80.l okhttp3.n nVar) {
        SSEClientException i11;
        okhttp3.h k02;
        g0.p(eventSource, "eventSource");
        Integer valueOf = nVar != null ? Integer.valueOf(nVar.Z()) : null;
        String d11 = (nVar == null || (k02 = nVar.k0()) == null) ? null : k02.d(y0.f63006a.C());
        if (nVar != null) {
            int p02 = g1.f62797c.C().p0();
            if (valueOf == null || valueOf.intValue() != p02 || !g0.g(d11, k.h.f62902a.d().toString())) {
                this.f81273c.c0(nVar);
                l0.a.a(this.f81274d, null, 1, null);
                this.f81272b.cancel();
            }
        }
        if (th2 != null) {
            i11 = new SSEClientException(null, th2, "Exception during OkHttpSSESession: " + th2.getMessage(), 1, null);
        } else {
            i11 = i(nVar);
        }
        this.f81273c.r(i11);
        l0.a.a(this.f81274d, null, 1, null);
        this.f81272b.cancel();
    }

    @Override // k60.b
    public void e(@m80.k k60.a eventSource, @m80.k okhttp3.n response) {
        g0.p(eventSource, "eventSource");
        g0.p(response, "response");
        this.f81273c.c0(response);
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f81271a;
    }

    @m80.k
    public final c40.x<okhttp3.n> h() {
        return this.f81273c;
    }

    public final SSEClientException i(okhttp3.n nVar) {
        ix.k b11;
        if (nVar != null) {
            int Z = nVar.Z();
            g1.a aVar = g1.f62797c;
            if (Z != aVar.C().p0()) {
                return new SSEClientException(null, null, "Expected status code " + aVar.C().p0() + " but was " + nVar.Z(), 3, null);
            }
        }
        if (nVar != null) {
            okhttp3.h k02 = nVar.k0();
            y0 y0Var = y0.f63006a;
            String d11 = k02.d(y0Var.C());
            ix.k k11 = (d11 == null || (b11 = ix.k.f62843f.b(d11)) == null) ? null : b11.k();
            k.h hVar = k.h.f62902a;
            if (!g0.g(k11, hVar.d())) {
                return new SSEClientException(null, null, "Content type must be " + hVar.d() + " but was " + nVar.k0().d(y0Var.C()), 3, null);
            }
        }
        return new SSEClientException(null, null, "Unexpected error occurred in OkHttpSSESession", 3, null);
    }

    @Override // zw.x
    @m80.k
    public kotlinx.coroutines.flow.i<vy.a> j() {
        return kotlinx.coroutines.flow.k.u1(this.f81274d);
    }
}
