package n8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class m implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f74796c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<m, b> f74797d = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74798a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final double f74799b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<m, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m read(@m80.k ws.i protocol, @m80.k b builder) {
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
                    } else if (b11 == 4) {
                        builder.b(protocol.readDouble());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.c(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k m struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBVideoStatArg");
            protocol.Q6(dc.a.f47674g, 1, (byte) 11);
            protocol.p1(struct.f74798a);
            protocol.N2();
            protocol.Q6("done_rate", 2, (byte) 4);
            protocol.writeDouble(struct.f74799b);
            protocol.N2();
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

    public m(@m80.k String video_name, double d11) {
        g0.p(video_name, "video_name");
        this.f74798a = video_name;
        this.f74799b = d11;
    }

    public static /* synthetic */ m d(m mVar, String str, double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mVar.f74798a;
        }
        if ((i11 & 2) != 0) {
            d11 = mVar.f74799b;
        }
        return mVar.c(str, d11);
    }

    @m80.k
    public final String a() {
        return this.f74798a;
    }

    public final double b() {
        return this.f74799b;
    }

    @m80.k
    public final m c(@m80.k String video_name, double d11) {
        g0.p(video_name, "video_name");
        return new m(video_name, d11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return g0.g(this.f74798a, mVar.f74798a) && Double.compare(this.f74799b, mVar.f74799b) == 0;
    }

    public int hashCode() {
        return (this.f74798a.hashCode() * 31) + Double.hashCode(this.f74799b);
    }

    @m80.k
    public String toString() {
        return "BBVideoStatArg(video_name=" + this.f74798a + ", done_rate=" + this.f74799b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74797d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBVideoStatArg.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBVideoStatArg.kt\ncom/baicizhan/biz/online/bs_words/BBVideoStatArg$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
    public static final class b implements ts.f<m> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f74800a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Double f74801b;

        public b() {
            this.f74800a = null;
            this.f74801b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m build() {
            String str = this.f74800a;
            if (str == null) {
                throw new IllegalStateException("Required field 'video_name' is missing");
            }
            Double d11 = this.f74801b;
            if (d11 != null) {
                return new m(str, d11.doubleValue());
            }
            throw new IllegalStateException("Required field 'done_rate' is missing");
        }

        @m80.k
        public final b b(double d11) {
            this.f74801b = Double.valueOf(d11);
            return this;
        }

        @m80.k
        public final b c(@m80.k String video_name) {
            g0.p(video_name, "video_name");
            this.f74800a = video_name;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74800a = null;
            this.f74801b = null;
        }

        public b(@m80.k m source) {
            g0.p(source, "source");
            this.f74800a = source.f74798a;
            this.f74801b = Double.valueOf(source.f74799b);
        }
    }
}
