package h8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final c f58869h = new c(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<d, b> f58870i = new a();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final l f58871a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final k f58872b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Boolean f58873c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final boolean f58874d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<i> f58875e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<h8.a> f58876f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final e f58877g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<d, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d read(@m80.k ws.i protocol, @m80.k b builder) {
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
                int i11 = 0;
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(l.f58974h.read(protocol));
                            break;
                        }
                    case 2:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(k.f58966e.read(protocol));
                            break;
                        }
                    case 3:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(Boolean.valueOf(protocol.readBool()));
                            break;
                        }
                    case 4:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readBool());
                            break;
                        }
                    case 5:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i12 = v42.f96838b;
                            while (i11 < i12) {
                                arrayList.add(i.f58944g.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.h(arrayList);
                            break;
                        }
                    case 6:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v43 = protocol.v4();
                            ArrayList arrayList2 = new ArrayList(v43.f96838b);
                            int i13 = v43.f96838b;
                            while (i11 < i13) {
                                arrayList2.add(h8.a.f58850i.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.g(arrayList2);
                            break;
                        }
                    case 7:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(e.f58886i.read(protocol));
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
        public void write(@m80.k ws.i protocol, @m80.k d struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AvatarAppHomePageInfo");
            if (struct.f58871a != null) {
                protocol.Q6("cur_ip_info", 1, (byte) 12);
                l.f58974h.write(protocol, struct.f58871a);
                protocol.N2();
            }
            if (struct.f58872b != null) {
                protocol.Q6("ip_record_info", 2, (byte) 12);
                k.f58966e.write(protocol, struct.f58872b);
                protocol.N2();
            }
            if (struct.f58873c != null) {
                protocol.Q6("travel_is_max", 3, (byte) 2);
                protocol.a4(struct.f58873c.booleanValue());
                protocol.N2();
            }
            protocol.Q6("ip_has", 4, (byte) 2);
            protocol.a4(struct.f58874d);
            protocol.N2();
            if (struct.f58875e != null) {
                protocol.Q6("unlock_skill_list", 5, (byte) 15);
                protocol.y2((byte) 12, struct.f58875e.size());
                Iterator<i> it = struct.f58875e.iterator();
                while (it.hasNext()) {
                    i.f58944g.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f58876f != null) {
                protocol.Q6("unlock_action_list", 6, (byte) 15);
                protocol.y2((byte) 12, struct.f58876f.size());
                Iterator<h8.a> it2 = struct.f58876f.iterator();
                while (it2.hasNext()) {
                    h8.a.f58850i.write(protocol, it2.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f58877g != null) {
                protocol.Q6("cur_travel_area_info", 7, (byte) 12);
                e.f58886i.write(protocol, struct.f58877g);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(v vVar) {
            this();
        }

        public c() {
        }
    }

    public d(@m80.l l lVar, @m80.l k kVar, @m80.l Boolean bool, boolean z11, @m80.l List<i> list, @m80.l List<h8.a> list2, @m80.l e eVar) {
        this.f58871a = lVar;
        this.f58872b = kVar;
        this.f58873c = bool;
        this.f58874d = z11;
        this.f58875e = list;
        this.f58876f = list2;
        this.f58877g = eVar;
    }

    public static /* synthetic */ d i(d dVar, l lVar, k kVar, Boolean bool, boolean z11, List list, List list2, e eVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = dVar.f58871a;
        }
        if ((i11 & 2) != 0) {
            kVar = dVar.f58872b;
        }
        if ((i11 & 4) != 0) {
            bool = dVar.f58873c;
        }
        if ((i11 & 8) != 0) {
            z11 = dVar.f58874d;
        }
        if ((i11 & 16) != 0) {
            list = dVar.f58875e;
        }
        if ((i11 & 32) != 0) {
            list2 = dVar.f58876f;
        }
        if ((i11 & 64) != 0) {
            eVar = dVar.f58877g;
        }
        List list3 = list2;
        e eVar2 = eVar;
        List list4 = list;
        Boolean bool2 = bool;
        return dVar.h(lVar, kVar, bool2, z11, list4, list3, eVar2);
    }

    @m80.l
    public final l a() {
        return this.f58871a;
    }

    @m80.l
    public final k b() {
        return this.f58872b;
    }

    @m80.l
    public final Boolean c() {
        return this.f58873c;
    }

    public final boolean d() {
        return this.f58874d;
    }

    @m80.l
    public final List<i> e() {
        return this.f58875e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return g0.g(this.f58871a, dVar.f58871a) && g0.g(this.f58872b, dVar.f58872b) && g0.g(this.f58873c, dVar.f58873c) && this.f58874d == dVar.f58874d && g0.g(this.f58875e, dVar.f58875e) && g0.g(this.f58876f, dVar.f58876f) && g0.g(this.f58877g, dVar.f58877g);
    }

    @m80.l
    public final List<h8.a> f() {
        return this.f58876f;
    }

    @m80.l
    public final e g() {
        return this.f58877g;
    }

    @m80.k
    public final d h(@m80.l l lVar, @m80.l k kVar, @m80.l Boolean bool, boolean z11, @m80.l List<i> list, @m80.l List<h8.a> list2, @m80.l e eVar) {
        return new d(lVar, kVar, bool, z11, list, list2, eVar);
    }

    public int hashCode() {
        l lVar = this.f58871a;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        k kVar = this.f58872b;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Boolean bool = this.f58873c;
        int hashCode3 = (((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.f58874d)) * 31;
        List<i> list = this.f58875e;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<h8.a> list2 = this.f58876f;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        e eVar = this.f58877g;
        return hashCode5 + (eVar != null ? eVar.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "AvatarAppHomePageInfo(cur_ip_info=" + this.f58871a + ", ip_record_info=" + this.f58872b + ", travel_is_max=" + this.f58873c + ", ip_has=" + this.f58874d + ", unlock_skill_list=" + this.f58875e + ", unlock_action_list=" + this.f58876f + ", cur_travel_area_info=" + this.f58877g + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f58870i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAvatarAppHomePageInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarAppHomePageInfo.kt\ncom/baicizhan/biz/online/avatar_api/AvatarAppHomePageInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
    public static final class b implements ts.f<d> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public l f58878a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public k f58879b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Boolean f58880c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Boolean f58881d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public List<i> f58882e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public List<h8.a> f58883f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public e f58884g;

        public b() {
            this.f58878a = null;
            this.f58879b = null;
            this.f58880c = null;
            this.f58881d = null;
            this.f58882e = null;
            this.f58883f = null;
            this.f58884g = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d build() {
            l lVar = this.f58878a;
            k kVar = this.f58879b;
            Boolean bool = this.f58880c;
            Boolean bool2 = this.f58881d;
            if (bool2 != null) {
                return new d(lVar, kVar, bool, bool2.booleanValue(), this.f58882e, this.f58883f, this.f58884g);
            }
            throw new IllegalStateException("Required field 'ip_has' is missing");
        }

        @m80.k
        public final b b(@m80.l l lVar) {
            this.f58878a = lVar;
            return this;
        }

        @m80.k
        public final b c(@m80.l e eVar) {
            this.f58884g = eVar;
            return this;
        }

        @m80.k
        public final b d(boolean z11) {
            this.f58881d = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final b e(@m80.l k kVar) {
            this.f58879b = kVar;
            return this;
        }

        @m80.k
        public final b f(@m80.l Boolean bool) {
            this.f58880c = bool;
            return this;
        }

        @m80.k
        public final b g(@m80.l List<h8.a> list) {
            this.f58883f = list;
            return this;
        }

        @m80.k
        public final b h(@m80.l List<i> list) {
            this.f58882e = list;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f58878a = null;
            this.f58879b = null;
            this.f58880c = null;
            this.f58881d = null;
            this.f58882e = null;
            this.f58883f = null;
            this.f58884g = null;
        }

        public b(@m80.k d source) {
            g0.p(source, "source");
            this.f58878a = source.f58871a;
            this.f58879b = source.f58872b;
            this.f58880c = source.f58873c;
            this.f58881d = Boolean.valueOf(source.f58874d);
            this.f58882e = source.f58875e;
            this.f58883f = source.f58876f;
            this.f58884g = source.f58877g;
        }
    }
}
