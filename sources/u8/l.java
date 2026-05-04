package u8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class l implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final b f91974h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<l, a> f91975i = new c();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final f f91976a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final u8.c f91977b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final u8.b f91978c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final g f91979d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final u8.c f91980e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final u8.b f91981f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<f> f91982g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<l, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol, @m80.k a builder) {
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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 == 12) {
                            builder.b(f.f91923g.read(protocol));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 12) {
                            builder.h(u8.c.f91899e.read(protocol));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 12) {
                            builder.g(u8.b.f91893d.read(protocol));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 12) {
                            builder.d(g.f91935c.read(protocol));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 12) {
                            builder.f(u8.c.f91899e.read(protocol));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 12) {
                            builder.e(u8.b.f91893d.read(protocol));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 7:
                        if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i11 = v42.f96838b;
                            for (int i12 = 0; i12 < i11; i12++) {
                                arrayList.add(f.f91923g.read(protocol));
                            }
                            protocol.l8();
                            builder.c(arrayList);
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    default:
                        at.b.a(protocol, b11);
                        break;
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k l struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserEntitlementSaleInfo");
            if (struct.f91976a != null) {
                protocol.Q6("member_sale_info", 1, (byte) 12);
                f.f91923g.write(protocol, struct.f91976a);
                protocol.N2();
            }
            if (struct.f91977b != null) {
                protocol.Q6("word_energy_sale_info", 2, (byte) 12);
                u8.c.f91899e.write(protocol, struct.f91977b);
                protocol.N2();
            }
            if (struct.f91978c != null) {
                protocol.Q6("word_energy_ad_info", 3, (byte) 12);
                u8.b.f91893d.write(protocol, struct.f91978c);
                protocol.N2();
            }
            if (struct.f91979d != null) {
                protocol.Q6("red_heart_sale_info", 4, (byte) 12);
                g.f91935c.write(protocol, struct.f91979d);
                protocol.N2();
            }
            if (struct.f91980e != null) {
                protocol.Q6("sentence_energy_sale_info", 5, (byte) 12);
                u8.c.f91899e.write(protocol, struct.f91980e);
                protocol.N2();
            }
            if (struct.f91981f != null) {
                protocol.Q6("sentence_energy_ad_info", 6, (byte) 12);
                u8.b.f91893d.write(protocol, struct.f91981f);
                protocol.N2();
            }
            if (struct.f91982g != null) {
                protocol.Q6("member_sale_info_list", 7, (byte) 15);
                protocol.y2((byte) 12, struct.f91982g.size());
                Iterator<f> it = struct.f91982g.iterator();
                while (it.hasNext()) {
                    f.f91923g.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public l(@m80.l f fVar, @m80.l u8.c cVar, @m80.l u8.b bVar, @m80.l g gVar, @m80.l u8.c cVar2, @m80.l u8.b bVar2, @m80.l List<f> list) {
        this.f91976a = fVar;
        this.f91977b = cVar;
        this.f91978c = bVar;
        this.f91979d = gVar;
        this.f91980e = cVar2;
        this.f91981f = bVar2;
        this.f91982g = list;
    }

    public static /* synthetic */ l i(l lVar, f fVar, u8.c cVar, u8.b bVar, g gVar, u8.c cVar2, u8.b bVar2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fVar = lVar.f91976a;
        }
        if ((i11 & 2) != 0) {
            cVar = lVar.f91977b;
        }
        if ((i11 & 4) != 0) {
            bVar = lVar.f91978c;
        }
        if ((i11 & 8) != 0) {
            gVar = lVar.f91979d;
        }
        if ((i11 & 16) != 0) {
            cVar2 = lVar.f91980e;
        }
        if ((i11 & 32) != 0) {
            bVar2 = lVar.f91981f;
        }
        if ((i11 & 64) != 0) {
            list = lVar.f91982g;
        }
        u8.b bVar3 = bVar2;
        List list2 = list;
        u8.c cVar3 = cVar2;
        u8.b bVar4 = bVar;
        return lVar.h(fVar, cVar, bVar4, gVar, cVar3, bVar3, list2);
    }

    @m80.l
    public final f a() {
        return this.f91976a;
    }

    @m80.l
    public final u8.c b() {
        return this.f91977b;
    }

    @m80.l
    public final u8.b c() {
        return this.f91978c;
    }

    @m80.l
    public final g d() {
        return this.f91979d;
    }

    @m80.l
    public final u8.c e() {
        return this.f91980e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return g0.g(this.f91976a, lVar.f91976a) && g0.g(this.f91977b, lVar.f91977b) && g0.g(this.f91978c, lVar.f91978c) && g0.g(this.f91979d, lVar.f91979d) && g0.g(this.f91980e, lVar.f91980e) && g0.g(this.f91981f, lVar.f91981f) && g0.g(this.f91982g, lVar.f91982g);
    }

    @m80.l
    public final u8.b f() {
        return this.f91981f;
    }

    @m80.l
    public final List<f> g() {
        return this.f91982g;
    }

    @m80.k
    public final l h(@m80.l f fVar, @m80.l u8.c cVar, @m80.l u8.b bVar, @m80.l g gVar, @m80.l u8.c cVar2, @m80.l u8.b bVar2, @m80.l List<f> list) {
        return new l(fVar, cVar, bVar, gVar, cVar2, bVar2, list);
    }

    public int hashCode() {
        f fVar = this.f91976a;
        int hashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        u8.c cVar = this.f91977b;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        u8.b bVar = this.f91978c;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        g gVar = this.f91979d;
        int hashCode4 = (hashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        u8.c cVar2 = this.f91980e;
        int hashCode5 = (hashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        u8.b bVar2 = this.f91981f;
        int hashCode6 = (hashCode5 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        List<f> list = this.f91982g;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "UserEntitlementSaleInfo(member_sale_info=" + this.f91976a + ", word_energy_sale_info=" + this.f91977b + ", word_energy_ad_info=" + this.f91978c + ", red_heart_sale_info=" + this.f91979d + ", sentence_energy_sale_info=" + this.f91980e + ", sentence_energy_ad_info=" + this.f91981f + ", member_sale_info_list=" + this.f91982g + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f91975i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserEntitlementSaleInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserEntitlementSaleInfo.kt\ncom/baicizhan/biz/online/strategy_api/UserEntitlementSaleInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
    public static final class a implements ts.f<l> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public f f91983a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public u8.c f91984b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public u8.b f91985c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public g f91986d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public u8.c f91987e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public u8.b f91988f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public List<f> f91989g;

        public a() {
            this.f91983a = null;
            this.f91984b = null;
            this.f91985c = null;
            this.f91986d = null;
            this.f91987e = null;
            this.f91988f = null;
            this.f91989g = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l build() {
            return new l(this.f91983a, this.f91984b, this.f91985c, this.f91986d, this.f91987e, this.f91988f, this.f91989g);
        }

        @m80.k
        public final a b(@m80.l f fVar) {
            this.f91983a = fVar;
            return this;
        }

        @m80.k
        public final a c(@m80.l List<f> list) {
            this.f91989g = list;
            return this;
        }

        @m80.k
        public final a d(@m80.l g gVar) {
            this.f91986d = gVar;
            return this;
        }

        @m80.k
        public final a e(@m80.l u8.b bVar) {
            this.f91988f = bVar;
            return this;
        }

        @m80.k
        public final a f(@m80.l u8.c cVar) {
            this.f91987e = cVar;
            return this;
        }

        @m80.k
        public final a g(@m80.l u8.b bVar) {
            this.f91985c = bVar;
            return this;
        }

        @m80.k
        public final a h(@m80.l u8.c cVar) {
            this.f91984b = cVar;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f91983a = null;
            this.f91984b = null;
            this.f91985c = null;
            this.f91986d = null;
            this.f91987e = null;
            this.f91988f = null;
            this.f91989g = null;
        }

        public a(@m80.k l source) {
            g0.p(source, "source");
            this.f91983a = source.f91976a;
            this.f91984b = source.f91977b;
            this.f91985c = source.f91978c;
            this.f91986d = source.f91979d;
            this.f91987e = source.f91980e;
            this.f91988f = source.f91981f;
            this.f91989g = source.f91982g;
        }
    }
}
