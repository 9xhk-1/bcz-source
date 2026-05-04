package mx;

import ix.g;
import ix.q0;
import ix.y0;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.u0;
import mx.b0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMultipart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Multipart.kt\nio/ktor/http/content/PartData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
/* loaded from: classes8.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.a<g2> f73762a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final q0 f73763b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final yz.c0 f73764c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final yz.c0 f73765d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends b0 {

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final x00.a<io.ktor.utils.io.g> f73766e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@m80.k x00.a<? extends io.ktor.utils.io.g> provider, @m80.k q0 partHeaders) {
            super(new x00.a() { // from class: mx.a0
                @Override // x00.a
                public final Object invoke() {
                    g2 k11;
                    k11 = b0.a.k();
                    return k11;
                }
            }, partHeaders, null);
            kotlin.jvm.internal.g0.p(provider, "provider");
            kotlin.jvm.internal.g0.p(partHeaders, "partHeaders");
            this.f73766e = provider;
        }

        public static final g2 k() {
            return g2.f100423a;
        }

        @m80.k
        public final x00.a<io.ktor.utils.io.g> l() {
            return this.f73766e;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends b0 {

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final x00.a<y40.c0> f73767e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@m80.k x00.a<? extends y40.c0> provider, @m80.k x00.a<g2> dispose, @m80.k q0 partHeaders) {
            super(dispose, partHeaders, null);
            kotlin.jvm.internal.g0.p(provider, "provider");
            kotlin.jvm.internal.g0.p(dispose, "dispose");
            kotlin.jvm.internal.g0.p(partHeaders, "partHeaders");
            this.f73767e = provider;
        }

        @m80.k
        public final x00.a<y40.c0> j() {
            return this.f73767e;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends b0 {

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final x00.a<io.ktor.utils.io.g> f73768e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public final String f73769f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(@m80.k x00.a<? extends io.ktor.utils.io.g> provider, @m80.k x00.a<g2> dispose, @m80.k q0 partHeaders) {
            super(dispose, partHeaders, 0 == true ? 1 : 0);
            kotlin.jvm.internal.g0.p(provider, "provider");
            kotlin.jvm.internal.g0.p(dispose, "dispose");
            kotlin.jvm.internal.g0.p(partHeaders, "partHeaders");
            this.f73768e = provider;
            ix.g e11 = e();
            this.f73769f = e11 != null ? e11.c(g.b.f62788b) : null;
        }

        @m80.l
        public final String j() {
            return this.f73769f;
        }

        @m80.k
        public final x00.a<io.ktor.utils.io.g> k() {
            return this.f73768e;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends b0 {

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final String f73770e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k String value, @m80.k x00.a<g2> dispose, @m80.k q0 partHeaders) {
            super(dispose, partHeaders, null);
            kotlin.jvm.internal.g0.p(value, "value");
            kotlin.jvm.internal.g0.p(dispose, "dispose");
            kotlin.jvm.internal.g0.p(partHeaders, "partHeaders");
            this.f73770e = value;
        }

        @m80.k
        public final String j() {
            return this.f73770e;
        }
    }

    public /* synthetic */ b0(x00.a aVar, q0 q0Var, kotlin.jvm.internal.v vVar) {
        this(aVar, q0Var);
    }

    public static final ix.g c(b0 b0Var) {
        String str = b0Var.f73763b.get(y0.f63006a.w());
        if (str != null) {
            return ix.g.f62782d.e(str);
        }
        return null;
    }

    public static final ix.k d(b0 b0Var) {
        String str = b0Var.f73763b.get(y0.f63006a.C());
        if (str != null) {
            return ix.k.f62843f.b(str);
        }
        return null;
    }

    @m80.l
    public final ix.g e() {
        return (ix.g) this.f73764c.getValue();
    }

    @m80.l
    public final ix.k f() {
        return (ix.k) this.f73765d.getValue();
    }

    @m80.k
    public final x00.a<g2> g() {
        return this.f73762a;
    }

    @m80.k
    public final q0 h() {
        return this.f73763b;
    }

    @m80.l
    public final String i() {
        ix.g e11 = e();
        if (e11 != null) {
            return e11.i();
        }
        return null;
    }

    public b0(x00.a<g2> aVar, q0 q0Var) {
        this.f73762a = aVar;
        this.f73763b = q0Var;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f73764c = yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: mx.y
            @Override // x00.a
            public final Object invoke() {
                ix.g c11;
                c11 = b0.c(b0.this);
                return c11;
            }
        });
        this.f73765d = yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: mx.z
            @Override // x00.a
            public final Object invoke() {
                ix.k d11;
                d11 = b0.d(b0.this);
                return d11;
            }
        });
    }
}
