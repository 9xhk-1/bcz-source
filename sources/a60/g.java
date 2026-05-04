package a60;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;
import t50.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRealInterceptorChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealInterceptorChain.kt\nokhttp3/internal/http/RealInterceptorChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
/* loaded from: classes8.dex */
public final class g implements n.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final z50.e f2008a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<n> f2009b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2010c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final z50.c f2011d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final okhttp3.l f2012e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2013f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2014g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2015h;

    /* renamed from: i, reason: collision with root package name */
    public int f2016i;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@m80.k z50.e call, @m80.k List<? extends n> interceptors, int i11, @l z50.c cVar, @m80.k okhttp3.l request, int i12, int i13, int i14) {
        g0.p(call, "call");
        g0.p(interceptors, "interceptors");
        g0.p(request, "request");
        this.f2008a = call;
        this.f2009b = interceptors;
        this.f2010c = i11;
        this.f2011d = cVar;
        this.f2012e = request;
        this.f2013f = i12;
        this.f2014g = i13;
        this.f2015h = i14;
    }

    public static /* synthetic */ g i(g gVar, int i11, z50.c cVar, okhttp3.l lVar, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = gVar.f2010c;
        }
        if ((i15 & 2) != 0) {
            cVar = gVar.f2011d;
        }
        if ((i15 & 4) != 0) {
            lVar = gVar.f2012e;
        }
        if ((i15 & 8) != 0) {
            i12 = gVar.f2013f;
        }
        if ((i15 & 16) != 0) {
            i13 = gVar.f2014g;
        }
        if ((i15 & 32) != 0) {
            i14 = gVar.f2015h;
        }
        int i16 = i13;
        int i17 = i14;
        return gVar.h(i11, cVar, lVar, i12, i16, i17);
    }

    @Override // t50.n.a
    public int a() {
        return this.f2014g;
    }

    @Override // t50.n.a
    @m80.k
    public n.a b(int i11, @m80.k TimeUnit unit) {
        g0.p(unit, "unit");
        if (this.f2011d == null) {
            return i(this, 0, null, null, u50.f.m("connectTimeout", i11, unit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // t50.n.a
    @m80.k
    public okhttp3.n c(@m80.k okhttp3.l request) throws IOException {
        g0.p(request, "request");
        if (this.f2010c >= this.f2009b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f2016i++;
        z50.c cVar = this.f2011d;
        if (cVar != null) {
            if (!cVar.j().g(request.q())) {
                throw new IllegalStateException(("network interceptor " + this.f2009b.get(this.f2010c - 1) + " must retain the same host and port").toString());
            }
            if (this.f2016i != 1) {
                throw new IllegalStateException(("network interceptor " + this.f2009b.get(this.f2010c - 1) + " must call proceed() exactly once").toString());
            }
        }
        g i11 = i(this, this.f2010c + 1, null, request, 0, 0, 0, 58, null);
        n nVar = this.f2009b.get(this.f2010c);
        okhttp3.n intercept = nVar.intercept(i11);
        if (intercept == null) {
            throw new NullPointerException("interceptor " + nVar + " returned null");
        }
        if (this.f2011d != null && this.f2010c + 1 < this.f2009b.size() && i11.f2016i != 1) {
            throw new IllegalStateException(("network interceptor " + nVar + " must call proceed() exactly once").toString());
        }
        if (intercept.L() != null) {
            return intercept;
        }
        throw new IllegalStateException(("interceptor " + nVar + " returned a response with no body").toString());
    }

    @Override // t50.n.a
    @m80.k
    public t50.b call() {
        return this.f2008a;
    }

    @Override // t50.n.a
    @l
    public t50.f connection() {
        z50.c cVar = this.f2011d;
        if (cVar != null) {
            return cVar.h();
        }
        return null;
    }

    @Override // t50.n.a
    @m80.k
    public n.a d(int i11, @m80.k TimeUnit unit) {
        g0.p(unit, "unit");
        if (this.f2011d == null) {
            return i(this, 0, null, null, 0, u50.f.m("readTimeout", i11, unit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // t50.n.a
    @m80.k
    public n.a e(int i11, @m80.k TimeUnit unit) {
        g0.p(unit, "unit");
        if (this.f2011d == null) {
            return i(this, 0, null, null, 0, 0, u50.f.m("writeTimeout", i11, unit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // t50.n.a
    public int f() {
        return this.f2015h;
    }

    @Override // t50.n.a
    public int g() {
        return this.f2013f;
    }

    @m80.k
    public final g h(int i11, @l z50.c cVar, @m80.k okhttp3.l request, int i12, int i13, int i14) {
        g0.p(request, "request");
        return new g(this.f2008a, this.f2009b, i11, cVar, request, i12, i13, i14);
    }

    @m80.k
    public final z50.e j() {
        return this.f2008a;
    }

    public final int k() {
        return this.f2013f;
    }

    @l
    public final z50.c l() {
        return this.f2011d;
    }

    public final int m() {
        return this.f2014g;
    }

    @m80.k
    public final okhttp3.l n() {
        return this.f2012e;
    }

    public final int o() {
        return this.f2015h;
    }

    @Override // t50.n.a
    @m80.k
    public okhttp3.l request() {
        return this.f2012e;
    }
}
