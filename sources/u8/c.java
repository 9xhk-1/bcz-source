package u8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f91898d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<c, a> f91899e = new C1229c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f91900a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f91901b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final d f91902c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: u8.c$c, reason: collision with other inner class name */
    public static final class C1229c implements ts.a<c, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (s11 != 3) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            builder.c(d.f91907e.read(protocol));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.d(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
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
        public void write(@m80.k ws.i protocol, @m80.k c struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("EnergySaleInfo");
            protocol.Q6("buy_energy", 1, (byte) 8);
            protocol.l5(struct.f91900a);
            protocol.N2();
            protocol.Q6("price", 2, (byte) 8);
            protocol.l5(struct.f91901b);
            protocol.N2();
            if (struct.f91902c != null) {
                protocol.Q6("energy_goods_info", 3, (byte) 12);
                d.f91907e.write(protocol, struct.f91902c);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public c(int i11, int i12, @m80.l d dVar) {
        this.f91900a = i11;
        this.f91901b = i12;
        this.f91902c = dVar;
    }

    public static /* synthetic */ c e(c cVar, int i11, int i12, d dVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = cVar.f91900a;
        }
        if ((i13 & 2) != 0) {
            i12 = cVar.f91901b;
        }
        if ((i13 & 4) != 0) {
            dVar = cVar.f91902c;
        }
        return cVar.d(i11, i12, dVar);
    }

    public final int a() {
        return this.f91900a;
    }

    public final int b() {
        return this.f91901b;
    }

    @m80.l
    public final d c() {
        return this.f91902c;
    }

    @m80.k
    public final c d(int i11, int i12, @m80.l d dVar) {
        return new c(i11, i12, dVar);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f91900a == cVar.f91900a && this.f91901b == cVar.f91901b && g0.g(this.f91902c, cVar.f91902c);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f91900a) * 31) + Integer.hashCode(this.f91901b)) * 31;
        d dVar = this.f91902c;
        return hashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @m80.k
    public String toString() {
        return "EnergySaleInfo(buy_energy=" + this.f91900a + ", price=" + this.f91901b + ", energy_goods_info=" + this.f91902c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f91899e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nEnergySaleInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnergySaleInfo.kt\ncom/baicizhan/biz/online/strategy_api/EnergySaleInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
    public static final class a implements ts.f<c> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f91903a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f91904b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public d f91905c;

        public a() {
            this.f91903a = null;
            this.f91904b = null;
            this.f91905c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c build() {
            Integer num = this.f91903a;
            if (num == null) {
                throw new IllegalStateException("Required field 'buy_energy' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f91904b;
            if (num2 != null) {
                return new c(intValue, num2.intValue(), this.f91905c);
            }
            throw new IllegalStateException("Required field 'price' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f91903a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.l d dVar) {
            this.f91905c = dVar;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f91904b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f91903a = null;
            this.f91904b = null;
            this.f91905c = null;
        }

        public a(@m80.k c source) {
            g0.p(source, "source");
            this.f91903a = Integer.valueOf(source.f91900a);
            this.f91904b = Integer.valueOf(source.f91901b);
            this.f91905c = source.f91902c;
        }
    }
}
