package io.ktor.client.engine.cio;

import cx.f0;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final cx.z f61010a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c40.x<f0> f61011b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f61012c;

    public z(@m80.k cx.z request, @m80.k c40.x<f0> response, @m80.k kotlin.coroutines.d context) {
        g0.p(request, "request");
        g0.p(response, "response");
        g0.p(context, "context");
        this.f61010a = request;
        this.f61011b = response;
        this.f61012c = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ z e(z zVar, cx.z zVar2, c40.x xVar, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            zVar2 = zVar.f61010a;
        }
        if ((i11 & 2) != 0) {
            xVar = zVar.f61011b;
        }
        if ((i11 & 4) != 0) {
            dVar = zVar.f61012c;
        }
        return zVar.d(zVar2, xVar, dVar);
    }

    @m80.k
    public final cx.z a() {
        return this.f61010a;
    }

    @m80.k
    public final c40.x<f0> b() {
        return this.f61011b;
    }

    @m80.k
    public final kotlin.coroutines.d c() {
        return this.f61012c;
    }

    @m80.k
    public final z d(@m80.k cx.z request, @m80.k c40.x<f0> response, @m80.k kotlin.coroutines.d context) {
        g0.p(request, "request");
        g0.p(response, "response");
        g0.p(context, "context");
        return new z(request, response, context);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return g0.g(this.f61010a, zVar.f61010a) && g0.g(this.f61011b, zVar.f61011b) && g0.g(this.f61012c, zVar.f61012c);
    }

    @m80.k
    public final kotlin.coroutines.d f() {
        return this.f61012c;
    }

    @m80.k
    public final cx.z g() {
        return this.f61010a;
    }

    @m80.k
    public final c40.x<f0> h() {
        return this.f61011b;
    }

    public int hashCode() {
        return (((this.f61010a.hashCode() * 31) + this.f61011b.hashCode()) * 31) + this.f61012c.hashCode();
    }

    @m80.k
    public String toString() {
        return "RequestTask(request=" + this.f61010a + ", response=" + this.f61011b + ", context=" + this.f61012c + ')';
    }
}
