package cx;

import c40.l2;
import c40.l3;
import ix.b1;
import ix.b2;
import ix.e1;
import ix.q0;
import ix.r0;
import ix.t2;
import java.util.LinkedHashMap;
import java.util.Map;
import xy.c2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class y implements b1 {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final a f46927g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b2 f46928a = new b2(null, null, 0, null, null, null, null, null, false, 511, null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public e1 f46929b = e1.f62753b.c();

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final r0 f46930c = new r0(0, 1, null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public Object f46931d = fx.h.f52422b;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public l2 f46932e = l3.c(null, 1, null);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final xy.b f46933f = xy.d.a(true);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public static final Map o() {
        return new LinkedHashMap();
    }

    @Override // ix.b1
    @m80.k
    public r0 a() {
        return this.f46930c;
    }

    @m80.k
    public final z c() {
        t2 b11 = this.f46928a.b();
        e1 e1Var = this.f46929b;
        q0 build = a().build();
        Object obj = this.f46931d;
        mx.v vVar = obj instanceof mx.v ? (mx.v) obj : null;
        if (vVar != null) {
            return new z(b11, e1Var, build, vVar, this.f46932e, this.f46933f);
        }
        throw new IllegalStateException(("No request transformation found: " + this.f46931d).toString());
    }

    @m80.k
    public final xy.b d() {
        return this.f46933f;
    }

    @m80.k
    public final Object e() {
        return this.f46931d;
    }

    @m80.l
    public final gz.a f() {
        return (gz.a) this.f46933f.a(h0.a());
    }

    @m80.l
    public final <T> T g(@m80.k ow.h<T> key) {
        kotlin.jvm.internal.g0.p(key, "key");
        Map map = (Map) this.f46933f.a(ow.i.b());
        if (map != null) {
            return (T) map.get(key);
        }
        return null;
    }

    @m80.k
    public final l2 h() {
        return this.f46932e;
    }

    @m80.k
    public final e1 i() {
        return this.f46929b;
    }

    @m80.k
    public final b2 j() {
        return this.f46928a;
    }

    public final void k(@m80.k x00.l<? super xy.b, g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        block.invoke(this.f46933f);
    }

    @io.ktor.utils.io.b0
    public final void l(@m80.k Object obj) {
        kotlin.jvm.internal.g0.p(obj, "<set-?>");
        this.f46931d = obj;
    }

    @io.ktor.utils.io.b0
    public final void m(@m80.l gz.a aVar) {
        if (aVar != null) {
            this.f46933f.e(h0.a(), aVar);
        } else {
            this.f46933f.b(h0.a());
        }
    }

    public final <T> void n(@m80.k ow.h<T> key, @m80.k T capability) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(capability, "capability");
        ((Map) this.f46933f.i(ow.i.b(), new x00.a() { // from class: cx.x
            @Override // x00.a
            public final Object invoke() {
                Map o11;
                o11 = y.o();
                return o11;
            }
        })).put(key, capability);
    }

    public final void p(@m80.k l2 l2Var) {
        kotlin.jvm.internal.g0.p(l2Var, "<set-?>");
        this.f46932e = l2Var;
    }

    public final void q(@m80.k e1 e1Var) {
        kotlin.jvm.internal.g0.p(e1Var, "<set-?>");
        this.f46929b = e1Var;
    }

    @m80.k
    public final y r(@m80.k y builder) {
        kotlin.jvm.internal.g0.p(builder, "builder");
        this.f46929b = builder.f46929b;
        this.f46931d = builder.f46931d;
        m(builder.f());
        ix.l2.t(this.f46928a, builder.f46928a);
        b2 b2Var = this.f46928a;
        b2Var.v(b2Var.g());
        c2.e(a(), builder.a());
        xy.e.c(this.f46933f, builder.f46933f);
        return this;
    }

    @io.ktor.utils.io.b0
    @m80.k
    public final y s(@m80.k y builder) {
        kotlin.jvm.internal.g0.p(builder, "builder");
        this.f46932e = builder.f46932e;
        return r(builder);
    }

    public final void t(@m80.k x00.p<? super b2, ? super b2, g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        b2 b2Var = this.f46928a;
        block.invoke(b2Var, b2Var);
    }
}
