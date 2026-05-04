package u8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g implements ts.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final b f91934b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<g, a> f91935c = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f91936a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<g, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g read(@m80.k ws.i protocol, @m80.k a builder) {
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
                if (a62.f96797c != 1) {
                    at.b.a(protocol, b11);
                } else if (b11 == 8) {
                    builder.b(protocol.s8());
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
            protocol.g6("RedHeartSaleInfo");
            protocol.Q6("need_credit", 1, (byte) 8);
            protocol.l5(struct.f91936a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public g(int i11) {
        this.f91936a = i11;
    }

    public static /* synthetic */ g c(g gVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = gVar.f91936a;
        }
        return gVar.b(i11);
    }

    public final int a() {
        return this.f91936a;
    }

    @m80.k
    public final g b(int i11) {
        return new g(i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f91936a == ((g) obj).f91936a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f91936a);
    }

    @m80.k
    public String toString() {
        return "RedHeartSaleInfo(need_credit=" + this.f91936a + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f91935c.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRedHeartSaleInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedHeartSaleInfo.kt\ncom/baicizhan/biz/online/strategy_api/RedHeartSaleInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
    public static final class a implements ts.f<g> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f91937a;

        public a() {
            this.f91937a = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g build() {
            Integer num = this.f91937a;
            if (num != null) {
                return new g(num.intValue());
            }
            throw new IllegalStateException("Required field 'need_credit' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f91937a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f91937a = null;
        }

        public a(@m80.k g source) {
            g0.p(source, "source");
            this.f91937a = Integer.valueOf(source.f91936a);
        }
    }
}
