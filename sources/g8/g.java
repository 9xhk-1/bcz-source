package g8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f53257c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<g, b> f53258d = new a();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final j f53259a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final b0 f53260b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<g, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g read(@m80.k ws.i protocol, @m80.k b builder) {
            g0.p(protocol, "protocol");
            g0.p(builder, "builder");
            protocol.u0();
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    protocol.I4();
                    return builder.build();
                }
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        builder.c(b0.f53183c.read(protocol));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.b(j.f53298c.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k g struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BczLaunchAd");
            if (struct.f53259a != null) {
                protocol.Q6("own_ad", 1, (byte) 12);
                j.f53298c.write(protocol, struct.f53259a);
                protocol.N2();
            }
            if (struct.f53260b != null) {
                protocol.Q6("third_ad", 2, (byte) 12);
                b0.f53183c.write(protocol, struct.f53260b);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public c() {
        }
    }

    public g(@m80.l j jVar, @m80.l b0 b0Var) {
        this.f53259a = jVar;
        this.f53260b = b0Var;
    }

    public static /* synthetic */ g d(g gVar, j jVar, b0 b0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jVar = gVar.f53259a;
        }
        if ((i11 & 2) != 0) {
            b0Var = gVar.f53260b;
        }
        return gVar.c(jVar, b0Var);
    }

    @m80.l
    public final j a() {
        return this.f53259a;
    }

    @m80.l
    public final b0 b() {
        return this.f53260b;
    }

    @m80.k
    public final g c(@m80.l j jVar, @m80.l b0 b0Var) {
        return new g(jVar, b0Var);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return g0.g(this.f53259a, gVar.f53259a) && g0.g(this.f53260b, gVar.f53260b);
    }

    public int hashCode() {
        j jVar = this.f53259a;
        int hashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        b0 b0Var = this.f53260b;
        return hashCode + (b0Var != null ? b0Var.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "BczLaunchAd(own_ad=" + this.f53259a + ", third_ad=" + this.f53260b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53258d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBczLaunchAd.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczLaunchAd.kt\ncom/baicizhan/biz/online/advertise_api/BczLaunchAd$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
    public static final class b implements ts.f<g> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public j f53261a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public b0 f53262b;

        public b() {
            this.f53261a = null;
            this.f53262b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g build() {
            return new g(this.f53261a, this.f53262b);
        }

        @m80.k
        public final b b(@m80.l j jVar) {
            this.f53261a = jVar;
            return this;
        }

        @m80.k
        public final b c(@m80.l b0 b0Var) {
            this.f53262b = b0Var;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53261a = null;
            this.f53262b = null;
        }

        public b(@m80.k g source) {
            g0.p(source, "source");
            this.f53261a = source.f53259a;
            this.f53262b = source.f53260b;
        }
    }
}
