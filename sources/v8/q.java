package v8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class q implements ts.e {

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final b f93377k = new b(null);

    /* renamed from: l, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<q, a> f93378l = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final boolean f93379a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f93380b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f93381c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f93382d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<o> f93383e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<String> f93384f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<String> f93385g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<String> f93386h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<String> f93387i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<o> f93388j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<q, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readBool());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
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
                                arrayList.add(o.f93350f.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.j(arrayList);
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
                                arrayList2.add(protocol.readString());
                                i11++;
                            }
                            protocol.l8();
                            builder.c(arrayList2);
                            break;
                        }
                    case 7:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v44 = protocol.v4();
                            ArrayList arrayList3 = new ArrayList(v44.f96838b);
                            int i14 = v44.f96838b;
                            while (i11 < i14) {
                                arrayList3.add(protocol.readString());
                                i11++;
                            }
                            protocol.l8();
                            builder.i(arrayList3);
                            break;
                        }
                    case 8:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v45 = protocol.v4();
                            ArrayList arrayList4 = new ArrayList(v45.f96838b);
                            int i15 = v45.f96838b;
                            while (i11 < i15) {
                                arrayList4.add(protocol.readString());
                                i11++;
                            }
                            protocol.l8();
                            builder.b(arrayList4);
                            break;
                        }
                    case 9:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v46 = protocol.v4();
                            ArrayList arrayList5 = new ArrayList(v46.f96838b);
                            int i16 = v46.f96838b;
                            while (i11 < i16) {
                                arrayList5.add(protocol.readString());
                                i11++;
                            }
                            protocol.l8();
                            builder.d(arrayList5);
                            break;
                        }
                    case 10:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v47 = protocol.v4();
                            ArrayList arrayList6 = new ArrayList(v47.f96838b);
                            int i17 = v47.f96838b;
                            while (i11 < i17) {
                                arrayList6.add(o.f93350f.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.k(arrayList6);
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
        public void write(@m80.k ws.i protocol, @m80.k q struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("SearchSchoolResult");
            protocol.Q6("has_next", 1, (byte) 2);
            protocol.a4(struct.f93379a);
            protocol.N2();
            protocol.Q6("page_num", 2, (byte) 8);
            protocol.l5(struct.f93380b);
            protocol.N2();
            protocol.Q6("page_size", 3, (byte) 8);
            protocol.l5(struct.f93381c);
            protocol.N2();
            protocol.Q6("number", 4, (byte) 8);
            protocol.l5(struct.f93382d);
            protocol.N2();
            if (struct.f93383e != null) {
                protocol.Q6("schools", 5, (byte) 15);
                protocol.y2((byte) 12, struct.f93383e.size());
                Iterator<o> it = struct.f93383e.iterator();
                while (it.hasNext()) {
                    o.f93350f.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f93384f != null) {
                protocol.Q6("countrys", 6, (byte) 15);
                protocol.y2((byte) 11, struct.f93384f.size());
                Iterator<String> it2 = struct.f93384f.iterator();
                while (it2.hasNext()) {
                    protocol.p1(it2.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f93385g != null) {
                protocol.Q6("provinces", 7, (byte) 15);
                protocol.y2((byte) 11, struct.f93385g.size());
                Iterator<String> it3 = struct.f93385g.iterator();
                while (it3.hasNext()) {
                    protocol.p1(it3.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f93386h != null) {
                protocol.Q6("citys", 8, (byte) 15);
                protocol.y2((byte) 11, struct.f93386h.size());
                Iterator<String> it4 = struct.f93386h.iterator();
                while (it4.hasNext()) {
                    protocol.p1(it4.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f93387i != null) {
                protocol.Q6("countys", 9, (byte) 15);
                protocol.y2((byte) 11, struct.f93387i.size());
                Iterator<String> it5 = struct.f93387i.iterator();
                while (it5.hasNext()) {
                    protocol.p1(it5.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f93388j != null) {
                protocol.Q6("sp_schools", 10, (byte) 15);
                protocol.y2((byte) 12, struct.f93388j.size());
                Iterator<o> it6 = struct.f93388j.iterator();
                while (it6.hasNext()) {
                    o.f93350f.write(protocol, it6.next());
                }
                protocol.i5();
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public q(boolean z11, int i11, int i12, int i13, @m80.l List<o> list, @m80.l List<String> list2, @m80.l List<String> list3, @m80.l List<String> list4, @m80.l List<String> list5, @m80.l List<o> list6) {
        this.f93379a = z11;
        this.f93380b = i11;
        this.f93381c = i12;
        this.f93382d = i13;
        this.f93383e = list;
        this.f93384f = list2;
        this.f93385g = list3;
        this.f93386h = list4;
        this.f93387i = list5;
        this.f93388j = list6;
    }

    public static /* synthetic */ q l(q qVar, boolean z11, int i11, int i12, int i13, List list, List list2, List list3, List list4, List list5, List list6, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z11 = qVar.f93379a;
        }
        if ((i14 & 2) != 0) {
            i11 = qVar.f93380b;
        }
        if ((i14 & 4) != 0) {
            i12 = qVar.f93381c;
        }
        if ((i14 & 8) != 0) {
            i13 = qVar.f93382d;
        }
        if ((i14 & 16) != 0) {
            list = qVar.f93383e;
        }
        if ((i14 & 32) != 0) {
            list2 = qVar.f93384f;
        }
        if ((i14 & 64) != 0) {
            list3 = qVar.f93385g;
        }
        if ((i14 & 128) != 0) {
            list4 = qVar.f93386h;
        }
        if ((i14 & 256) != 0) {
            list5 = qVar.f93387i;
        }
        if ((i14 & 512) != 0) {
            list6 = qVar.f93388j;
        }
        List list7 = list5;
        List list8 = list6;
        List list9 = list3;
        List list10 = list4;
        List list11 = list;
        List list12 = list2;
        return qVar.k(z11, i11, i12, i13, list11, list12, list9, list10, list7, list8);
    }

    public final boolean a() {
        return this.f93379a;
    }

    @m80.l
    public final List<o> b() {
        return this.f93388j;
    }

    public final int c() {
        return this.f93380b;
    }

    public final int d() {
        return this.f93381c;
    }

    public final int e() {
        return this.f93382d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f93379a == qVar.f93379a && this.f93380b == qVar.f93380b && this.f93381c == qVar.f93381c && this.f93382d == qVar.f93382d && g0.g(this.f93383e, qVar.f93383e) && g0.g(this.f93384f, qVar.f93384f) && g0.g(this.f93385g, qVar.f93385g) && g0.g(this.f93386h, qVar.f93386h) && g0.g(this.f93387i, qVar.f93387i) && g0.g(this.f93388j, qVar.f93388j);
    }

    @m80.l
    public final List<o> f() {
        return this.f93383e;
    }

    @m80.l
    public final List<String> g() {
        return this.f93384f;
    }

    @m80.l
    public final List<String> h() {
        return this.f93385g;
    }

    public int hashCode() {
        int hashCode = ((((((Boolean.hashCode(this.f93379a) * 31) + Integer.hashCode(this.f93380b)) * 31) + Integer.hashCode(this.f93381c)) * 31) + Integer.hashCode(this.f93382d)) * 31;
        List<o> list = this.f93383e;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f93384f;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f93385g;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.f93386h;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.f93387i;
        int hashCode6 = (hashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<o> list6 = this.f93388j;
        return hashCode6 + (list6 != null ? list6.hashCode() : 0);
    }

    @m80.l
    public final List<String> i() {
        return this.f93386h;
    }

    @m80.l
    public final List<String> j() {
        return this.f93387i;
    }

    @m80.k
    public final q k(boolean z11, int i11, int i12, int i13, @m80.l List<o> list, @m80.l List<String> list2, @m80.l List<String> list3, @m80.l List<String> list4, @m80.l List<String> list5, @m80.l List<o> list6) {
        return new q(z11, i11, i12, i13, list, list2, list3, list4, list5, list6);
    }

    @m80.k
    public String toString() {
        return "SearchSchoolResult(has_next=" + this.f93379a + ", page_num=" + this.f93380b + ", page_size=" + this.f93381c + ", number=" + this.f93382d + ", schools=" + this.f93383e + ", countrys=" + this.f93384f + ", provinces=" + this.f93385g + ", citys=" + this.f93386h + ", countys=" + this.f93387i + ", sp_schools=" + this.f93388j + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93378l.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSearchSchoolResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchSchoolResult.kt\ncom/baicizhan/biz/online/unified_user_service/SearchSchoolResult$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,410:1\n1#2:411\n*E\n"})
    public static final class a implements ts.f<q> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Boolean f93389a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f93390b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f93391c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f93392d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public List<o> f93393e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public List<String> f93394f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public List<String> f93395g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public List<String> f93396h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public List<String> f93397i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public List<o> f93398j;

        public a() {
            this.f93389a = null;
            this.f93390b = null;
            this.f93391c = null;
            this.f93392d = null;
            this.f93393e = null;
            this.f93394f = null;
            this.f93395g = null;
            this.f93396h = null;
            this.f93397i = null;
            this.f93398j = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q build() {
            Boolean bool = this.f93389a;
            if (bool == null) {
                throw new IllegalStateException("Required field 'has_next' is missing");
            }
            boolean booleanValue = bool.booleanValue();
            Integer num = this.f93390b;
            if (num == null) {
                throw new IllegalStateException("Required field 'page_num' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f93391c;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'page_size' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f93392d;
            if (num3 != null) {
                return new q(booleanValue, intValue, intValue2, num3.intValue(), this.f93393e, this.f93394f, this.f93395g, this.f93396h, this.f93397i, this.f93398j);
            }
            throw new IllegalStateException("Required field 'number' is missing");
        }

        @m80.k
        public final a b(@m80.l List<String> list) {
            this.f93396h = list;
            return this;
        }

        @m80.k
        public final a c(@m80.l List<String> list) {
            this.f93394f = list;
            return this;
        }

        @m80.k
        public final a d(@m80.l List<String> list) {
            this.f93397i = list;
            return this;
        }

        @m80.k
        public final a e(boolean z11) {
            this.f93389a = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f93392d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f93390b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a h(int i11) {
            this.f93391c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a i(@m80.l List<String> list) {
            this.f93395g = list;
            return this;
        }

        @m80.k
        public final a j(@m80.l List<o> list) {
            this.f93393e = list;
            return this;
        }

        @m80.k
        public final a k(@m80.l List<o> list) {
            this.f93398j = list;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93389a = null;
            this.f93390b = null;
            this.f93391c = null;
            this.f93392d = null;
            this.f93393e = null;
            this.f93394f = null;
            this.f93395g = null;
            this.f93396h = null;
            this.f93397i = null;
            this.f93398j = null;
        }

        public a(@m80.k q source) {
            g0.p(source, "source");
            this.f93389a = Boolean.valueOf(source.f93379a);
            this.f93390b = Integer.valueOf(source.f93380b);
            this.f93391c = Integer.valueOf(source.f93381c);
            this.f93392d = Integer.valueOf(source.f93382d);
            this.f93393e = source.f93383e;
            this.f93394f = source.f93384f;
            this.f93395g = source.f93385g;
            this.f93396h = source.f93386h;
            this.f93397i = source.f93387i;
            this.f93398j = source.f93388j;
        }
    }
}
