package u8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f91922f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<f, a> f91923g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f91924a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f91925b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f91926c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final d f91927d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f91928e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<f, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    at.b.a(protocol, b11);
                                } else if (b11 == 11) {
                                    builder.f(protocol.readString());
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 12) {
                                builder.b(d.f91907e.read(protocol));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.d(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.e(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.c(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k f struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("MemberSaleInfo");
            protocol.Q6("member_type", 1, (byte) 8);
            protocol.l5(struct.f91924a);
            protocol.N2();
            protocol.Q6("price", 2, (byte) 8);
            protocol.l5(struct.f91925b);
            protocol.N2();
            protocol.Q6("origin_price", 3, (byte) 8);
            protocol.l5(struct.f91926c);
            protocol.N2();
            if (struct.f91927d != null) {
                protocol.Q6("mall_goods_info", 4, (byte) 12);
                d.f91907e.write(protocol, struct.f91927d);
                protocol.N2();
            }
            protocol.Q6("tag", 5, (byte) 11);
            protocol.p1(struct.f91928e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public f(int i11, int i12, int i13, @m80.l d dVar, @m80.k String tag) {
        g0.p(tag, "tag");
        this.f91924a = i11;
        this.f91925b = i12;
        this.f91926c = i13;
        this.f91927d = dVar;
        this.f91928e = tag;
    }

    public static /* synthetic */ f g(f fVar, int i11, int i12, int i13, d dVar, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = fVar.f91924a;
        }
        if ((i14 & 2) != 0) {
            i12 = fVar.f91925b;
        }
        if ((i14 & 4) != 0) {
            i13 = fVar.f91926c;
        }
        if ((i14 & 8) != 0) {
            dVar = fVar.f91927d;
        }
        if ((i14 & 16) != 0) {
            str = fVar.f91928e;
        }
        String str2 = str;
        int i15 = i13;
        return fVar.f(i11, i12, i15, dVar, str2);
    }

    public final int a() {
        return this.f91924a;
    }

    public final int b() {
        return this.f91925b;
    }

    public final int c() {
        return this.f91926c;
    }

    @m80.l
    public final d d() {
        return this.f91927d;
    }

    @m80.k
    public final String e() {
        return this.f91928e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f91924a == fVar.f91924a && this.f91925b == fVar.f91925b && this.f91926c == fVar.f91926c && g0.g(this.f91927d, fVar.f91927d) && g0.g(this.f91928e, fVar.f91928e);
    }

    @m80.k
    public final f f(int i11, int i12, int i13, @m80.l d dVar, @m80.k String tag) {
        g0.p(tag, "tag");
        return new f(i11, i12, i13, dVar, tag);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f91924a) * 31) + Integer.hashCode(this.f91925b)) * 31) + Integer.hashCode(this.f91926c)) * 31;
        d dVar = this.f91927d;
        return ((hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.f91928e.hashCode();
    }

    @m80.k
    public String toString() {
        return "MemberSaleInfo(member_type=" + this.f91924a + ", price=" + this.f91925b + ", origin_price=" + this.f91926c + ", mall_goods_info=" + this.f91927d + ", tag=" + this.f91928e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f91923g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMemberSaleInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberSaleInfo.kt\ncom/baicizhan/biz/online/strategy_api/MemberSaleInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
    public static final class a implements ts.f<f> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f91929a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f91930b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f91931c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public d f91932d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f91933e;

        public a() {
            this.f91929a = null;
            this.f91930b = null;
            this.f91931c = null;
            this.f91932d = null;
            this.f91933e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f build() {
            Integer num = this.f91929a;
            if (num == null) {
                throw new IllegalStateException("Required field 'member_type' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f91930b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'price' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f91931c;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'origin_price' is missing");
            }
            int intValue3 = num3.intValue();
            d dVar = this.f91932d;
            String str = this.f91933e;
            if (str != null) {
                return new f(intValue, intValue2, intValue3, dVar, str);
            }
            throw new IllegalStateException("Required field 'tag' is missing");
        }

        @m80.k
        public final a b(@m80.l d dVar) {
            this.f91932d = dVar;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f91929a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f91931c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f91930b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(@m80.k String tag) {
            g0.p(tag, "tag");
            this.f91933e = tag;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f91929a = null;
            this.f91930b = null;
            this.f91931c = null;
            this.f91932d = null;
            this.f91933e = null;
        }

        public a(@m80.k f source) {
            g0.p(source, "source");
            this.f91929a = Integer.valueOf(source.f91924a);
            this.f91930b = Integer.valueOf(source.f91925b);
            this.f91931c = Integer.valueOf(source.f91926c);
            this.f91932d = source.f91927d;
            this.f91933e = source.f91928e;
        }
    }
}
