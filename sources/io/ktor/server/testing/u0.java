package io.ktor.server.testing;

import ix.p1;
import ix.q0;
import ix.v1;
import ix.z1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTestApplicationRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestApplicationRequest.kt\nio/ktor/server/testing/TestApplicationRequest\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 Headers.kt\nio/ktor/http/Headers$Companion\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,143:1\n381#2,7:144\n23#3:151\n216#4,2:152\n*S KotlinDebug\n*F\n+ 1 TestApplicationRequest.kt\nio/ktor/server/testing/TestApplicationRequest\n*L\n106#1:144,7\n112#1:151\n113#1:152,2\n*E\n"})
/* loaded from: classes8.dex */
public final class u0 extends io.ktor.server.engine.n implements c40.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0 f61928d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public ix.e1 f61929e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public String f61930f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public Integer f61931g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public String f61932h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public String f61933i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final z1 f61934j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public io.ktor.utils.io.g f61935k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61936l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61937m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final py.k f61938n;

    /* renamed from: o, reason: collision with root package name */
    @m80.l
    public Map<String, List<String>> f61939o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61940p;

    public /* synthetic */ u0(f0 f0Var, boolean z11, ix.e1 e1Var, String str, Integer num, String str2, int i11, kotlin.jvm.internal.v vVar) {
        this(f0Var, z11, (i11 & 4) != 0 ? ix.e1.f62753b.c() : e1Var, (i11 & 8) != 0 ? "/" : str, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? "HTTP/1.1" : str2);
    }

    public static final p1 D(u0 u0Var) {
        p1 b11;
        b11 = v0.b(py.h.a(u0Var, u0Var.d()));
        return b11;
    }

    public static final p1 F(u0 u0Var) {
        return v1.d(py.e.y(u0Var), 0, 0, false, 6, null);
    }

    public static final ix.q0 x(u0 u0Var) {
        Map<String, List<String>> map = u0Var.f61939o;
        if (map == null) {
            throw new Exception("Headers were already acquired for this request");
        }
        u0Var.f61939o = null;
        q0.a aVar = ix.q0.f62976a;
        ix.r0 r0Var = new ix.r0(0, 1, null);
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            r0Var.f(entry.getKey(), entry.getValue());
        }
        return r0Var.build();
    }

    @m80.k
    public final String A() {
        return this.f61933i;
    }

    @m80.k
    public final String B() {
        return this.f61930f;
    }

    @m80.k
    public final String C() {
        return this.f61932h;
    }

    public final void G(@m80.k io.ktor.utils.io.g gVar) {
        kotlin.jvm.internal.g0.p(gVar, "<set-?>");
        this.f61935k = gVar;
    }

    public final void H(@m80.k ix.e1 e1Var) {
        kotlin.jvm.internal.g0.p(e1Var, "<set-?>");
        this.f61929e = e1Var;
    }

    public final void J(@m80.l Integer num) {
        this.f61931g = num;
    }

    public final void K(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f61933i = str;
    }

    public final void M(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f61930f = str;
    }

    public final void N(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f61932h = str;
    }

    @Override // py.d
    @m80.k
    public p1 d() {
        return (p1) this.f61937m.getValue();
    }

    @Override // py.d
    @m80.k
    public py.k getCookies() {
        return this.f61938n;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f61928d.getCoroutineContext();
    }

    @m80.k
    public final ix.e1 getMethod() {
        return this.f61929e;
    }

    @Override // py.d
    @m80.k
    public z1 h() {
        return this.f61934j;
    }

    @Override // py.d
    @m80.k
    public p1 m() {
        return (p1) this.f61936l.getValue();
    }

    @Override // io.ktor.server.engine.n
    @m80.k
    public ix.q0 o() {
        return (ix.q0) this.f61940p.getValue();
    }

    @Override // io.ktor.server.engine.n
    @m80.k
    public io.ktor.utils.io.g p() {
        return this.f61935k;
    }

    public final void v(@m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        Map<String, List<String>> map = this.f61939o;
        if (map == null) {
            throw new Exception("Headers were already acquired for this request");
        }
        List<String> list = map.get(name);
        if (list == null) {
            list = new ArrayList<>();
            map.put(name, list);
        }
        list.add(value);
    }

    @m80.k
    public final io.ktor.utils.io.g y() {
        return this.f61935k;
    }

    @m80.l
    public final Integer z() {
        return this.f61931g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(@m80.k f0 call, boolean z11, @m80.k ix.e1 method, @m80.k String uri, @m80.l Integer num, @m80.k String version) {
        super(call);
        kotlin.jvm.internal.g0.p(call, "call");
        kotlin.jvm.internal.g0.p(method, "method");
        kotlin.jvm.internal.g0.p(uri, "uri");
        kotlin.jvm.internal.g0.p(version, "version");
        this.f61928d = call;
        this.f61929e = method;
        this.f61930f = uri;
        this.f61931g = num;
        this.f61932h = version;
        this.f61933i = "http";
        this.f61934j = new a();
        this.f61935k = z11 ? io.ktor.utils.io.g.f62105a.a() : new io.ktor.utils.io.b(false, 1, null);
        this.f61936l = yz.e0.c(new x00.a() { // from class: io.ktor.server.testing.r0
            @Override // x00.a
            public final Object invoke() {
                p1 D;
                D = u0.D(u0.this);
                return D;
            }
        });
        this.f61937m = yz.e0.c(new x00.a() { // from class: io.ktor.server.testing.s0
            @Override // x00.a
            public final Object invoke() {
                p1 F;
                F = u0.F(u0.this);
                return F;
            }
        });
        this.f61938n = new py.k(this);
        this.f61939o = new LinkedHashMap();
        this.f61940p = yz.e0.c(new x00.a() { // from class: io.ktor.server.testing.t0
            @Override // x00.a
            public final Object invoke() {
                ix.q0 x11;
                x11 = u0.x(u0.this);
                return x11;
            }
        });
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements z1 {
        public a() {
        }

        @Override // ix.z1
        public String A() {
            String U5;
            String r11 = py.e.r(u0.this, ix.y0.f63006a.P());
            return (r11 == null || (U5 = u30.k0.U5(r11, ":", null, 2, null)) == null) ? B() : U5;
        }

        @Override // ix.z1
        public String B() {
            return "localhost";
        }

        @Override // ix.z1
        public int C() {
            String K5;
            String r11 = py.e.r(u0.this, ix.y0.f63006a.P());
            return (r11 == null || (K5 = u30.k0.K5(r11, ":", "80")) == null) ? getLocalPort() : Integer.parseInt(K5);
        }

        @Override // ix.z1
        public int a() {
            String K5;
            Integer z11 = u0.this.z();
            if (z11 != null) {
                return z11.intValue();
            }
            String r11 = py.e.r(u0.this, ix.y0.f63006a.P());
            Integer valueOf = (r11 == null || (K5 = u30.k0.K5(r11, ":", "80")) == null) ? null : Integer.valueOf(Integer.parseInt(K5));
            if (valueOf != null) {
                return valueOf.intValue();
            }
            return 80;
        }

        @Override // ix.z1
        public String b() {
            String U5;
            String r11 = py.e.r(u0.this, ix.y0.f63006a.P());
            return (r11 == null || (U5 = u30.k0.U5(r11, ":", null, 2, null)) == null) ? "localhost" : U5;
        }

        @Override // ix.z1
        public String getLocalAddress() {
            return "localhost";
        }

        @Override // ix.z1
        public int getLocalPort() {
            Integer z11 = u0.this.z();
            if (z11 != null) {
                return z11.intValue();
            }
            return 80;
        }

        @Override // ix.z1
        public ix.e1 getMethod() {
            return u0.this.getMethod();
        }

        @Override // ix.z1
        public String getScheme() {
            return u0.this.A();
        }

        @Override // ix.z1
        public String getUri() {
            return u0.this.B();
        }

        @Override // ix.z1
        public String getVersion() {
            return u0.this.C();
        }

        @Override // ix.z1
        public String l() {
            return "localhost";
        }

        public String toString() {
            return "TestConnectionPoint(uri=" + getUri() + ", method=" + getMethod() + ", version=" + getVersion() + ", localAddress=" + getLocalAddress() + ", localPort=" + getLocalPort() + ", remoteAddress=" + l() + ", remotePort=" + y() + ')';
        }

        @Override // ix.z1
        public int y() {
            return 0;
        }

        @Override // ix.z1
        public String z() {
            return "localhost";
        }

        @yz.n(level = DeprecationLevel.ERROR, message = "Use localHost or serverHost instead")
        public static /* synthetic */ void c() {
        }

        @yz.n(level = DeprecationLevel.ERROR, message = "Use localPort or serverPort instead")
        public static /* synthetic */ void d() {
        }
    }
}
