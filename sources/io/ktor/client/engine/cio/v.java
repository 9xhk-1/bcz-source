package io.ktor.client.engine.cio;

import c40.a1;
import c40.b2;
import c40.l2;
import c40.n2;
import c40.r0;
import cx.d0;
import io.ktor.client.plugins.HttpRequestTimeoutException;
import ix.i2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import org.slf4j.Logger;
import rw.c1;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Logger f61005a = ez.a.a("io.ktor.client.engine.cio.Endpoint");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.EndpointKt$setupTimeout$timeoutJob$1", f = "Endpoint.kt", i = {}, l = {311}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61006a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f61007b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlin.coroutines.d f61008c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ cx.z f61009d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j11, kotlin.coroutines.d dVar, cx.z zVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f61007b = j11;
            this.f61008c = dVar;
            this.f61009d = zVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f61007b, this.f61008c, this.f61009d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61006a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                long j11 = this.f61007b;
                this.f61006a = 1;
                if (a1.b(j11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            n2.e(n2.A(this.f61008c), "Request is timed out", new HttpRequestTimeoutException(this.f61009d));
            return g2.f100423a;
        }
    }

    public static final long d(@m80.k cx.z request, @m80.k e engineConfig) {
        g0.p(request, "request");
        g0.p(engineConfig, "engineConfig");
        boolean b11 = i2.b(request.h().A());
        if (request.c(c1.f84603a) != null || b11 || d0.k(request) || d0.j(request)) {
            return Long.MAX_VALUE;
        }
        return engineConfig.m();
    }

    public static final void e(kotlin.coroutines.d dVar, cx.z zVar, long j11) {
        final l2 f11;
        if (j11 == Long.MAX_VALUE || j11 == 0) {
            return;
        }
        f11 = c40.k.f(b2.f7824a, null, null, new a(j11, dVar, zVar, null), 3, null);
        n2.A(dVar).z0(new x00.l() { // from class: io.ktor.client.engine.cio.u
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f12;
                f12 = v.f(l2.this, (Throwable) obj);
                return f12;
            }
        });
    }

    public static final g2 f(l2 l2Var, Throwable th2) {
        l2.a.b(l2Var, null, 1, null);
        return g2.f100423a;
    }
}
