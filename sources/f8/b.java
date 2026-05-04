package f8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ts.e;
import w00.g;
import ws.f;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements e {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final c f51264h = new c(null);

    /* renamed from: i, reason: collision with root package name */
    @g
    @k
    public static final ts.a<b, C0611b> f51265i = new a();

    /* renamed from: a, reason: collision with root package name */
    @l
    @g
    public final d f51266a;

    /* renamed from: b, reason: collision with root package name */
    @l
    @g
    public final f8.c f51267b;

    /* renamed from: c, reason: collision with root package name */
    @l
    @g
    public final List<String> f51268c;

    /* renamed from: d, reason: collision with root package name */
    @l
    @g
    public final List<String> f51269d;

    /* renamed from: e, reason: collision with root package name */
    @l
    @g
    public final List<String> f51270e;

    /* renamed from: f, reason: collision with root package name */
    @l
    @g
    public final List<String> f51271f;

    /* renamed from: g, reason: collision with root package name */
    @l
    @g
    public final Integer f51272g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<b, C0611b> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new C0611b());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b read(@k i protocol, @k C0611b builder) {
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
                            builder.f(d.f51285f.read(protocol));
                            break;
                        }
                    case 2:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(f8.c.f51281c.read(protocol));
                            break;
                        }
                    case 3:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i12 = v42.f96838b;
                            while (i11 < i12) {
                                arrayList.add(protocol.readString());
                                i11++;
                            }
                            protocol.l8();
                            builder.c(arrayList);
                            break;
                        }
                    case 4:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            f v43 = protocol.v4();
                            ArrayList arrayList2 = new ArrayList(v43.f96838b);
                            int i13 = v43.f96838b;
                            while (i11 < i13) {
                                arrayList2.add(protocol.readString());
                                i11++;
                            }
                            protocol.l8();
                            builder.b(arrayList2);
                            break;
                        }
                    case 5:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            f v44 = protocol.v4();
                            ArrayList arrayList3 = new ArrayList(v44.f96838b);
                            int i14 = v44.f96838b;
                            while (i11 < i14) {
                                arrayList3.add(protocol.readString());
                                i11++;
                            }
                            protocol.l8();
                            builder.g(arrayList3);
                            break;
                        }
                    case 6:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            f v45 = protocol.v4();
                            ArrayList arrayList4 = new ArrayList(v45.f96838b);
                            int i15 = v45.f96838b;
                            while (i11 < i15) {
                                arrayList4.add(protocol.readString());
                                i11++;
                            }
                            protocol.l8();
                            builder.e(arrayList4);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(Integer.valueOf(protocol.s8()));
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
        public void write(@k i protocol, @k b struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AdExtraResp");
            if (struct.f51266a != null) {
                protocol.Q6("launch_wechat_program", 1, (byte) 12);
                d.f51285f.write(protocol, struct.f51266a);
                protocol.N2();
            }
            if (struct.f51267b != null) {
                protocol.Q6("launch_app", 2, (byte) 12);
                f8.c.f51281c.write(protocol, struct.f51267b);
                protocol.N2();
            }
            if (struct.f51268c != null) {
                protocol.Q6("imp_trackers", 3, (byte) 15);
                protocol.y2((byte) 11, struct.f51268c.size());
                Iterator<String> it = struct.f51268c.iterator();
                while (it.hasNext()) {
                    protocol.p1(it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f51269d != null) {
                protocol.Q6("click_trackers", 4, (byte) 15);
                protocol.y2((byte) 11, struct.f51269d.size());
                Iterator<String> it2 = struct.f51269d.iterator();
                while (it2.hasNext()) {
                    protocol.p1(it2.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f51270e != null) {
                protocol.Q6("launch_wechat_program_trackers", 5, (byte) 15);
                protocol.y2((byte) 11, struct.f51270e.size());
                Iterator<String> it3 = struct.f51270e.iterator();
                while (it3.hasNext()) {
                    protocol.p1(it3.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f51271f != null) {
                protocol.Q6("launch_app_trackers", 6, (byte) 15);
                protocol.y2((byte) 11, struct.f51271f.size());
                Iterator<String> it4 = struct.f51271f.iterator();
                while (it4.hasNext()) {
                    protocol.p1(it4.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f51272g != null) {
                protocol.Q6("price", 7, (byte) 8);
                protocol.l5(struct.f51272g.intValue());
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

    public b(@l d dVar, @l f8.c cVar, @l List<String> list, @l List<String> list2, @l List<String> list3, @l List<String> list4, @l Integer num) {
        this.f51266a = dVar;
        this.f51267b = cVar;
        this.f51268c = list;
        this.f51269d = list2;
        this.f51270e = list3;
        this.f51271f = list4;
        this.f51272g = num;
    }

    public static /* synthetic */ b i(b bVar, d dVar, f8.c cVar, List list, List list2, List list3, List list4, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = bVar.f51266a;
        }
        if ((i11 & 2) != 0) {
            cVar = bVar.f51267b;
        }
        if ((i11 & 4) != 0) {
            list = bVar.f51268c;
        }
        if ((i11 & 8) != 0) {
            list2 = bVar.f51269d;
        }
        if ((i11 & 16) != 0) {
            list3 = bVar.f51270e;
        }
        if ((i11 & 32) != 0) {
            list4 = bVar.f51271f;
        }
        if ((i11 & 64) != 0) {
            num = bVar.f51272g;
        }
        List list5 = list4;
        Integer num2 = num;
        List list6 = list3;
        List list7 = list;
        return bVar.h(dVar, cVar, list7, list2, list6, list5, num2);
    }

    @l
    public final d a() {
        return this.f51266a;
    }

    @l
    public final f8.c b() {
        return this.f51267b;
    }

    @l
    public final List<String> c() {
        return this.f51268c;
    }

    @l
    public final List<String> d() {
        return this.f51269d;
    }

    @l
    public final List<String> e() {
        return this.f51270e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g0.g(this.f51266a, bVar.f51266a) && g0.g(this.f51267b, bVar.f51267b) && g0.g(this.f51268c, bVar.f51268c) && g0.g(this.f51269d, bVar.f51269d) && g0.g(this.f51270e, bVar.f51270e) && g0.g(this.f51271f, bVar.f51271f) && g0.g(this.f51272g, bVar.f51272g);
    }

    @l
    public final List<String> f() {
        return this.f51271f;
    }

    @l
    public final Integer g() {
        return this.f51272g;
    }

    @k
    public final b h(@l d dVar, @l f8.c cVar, @l List<String> list, @l List<String> list2, @l List<String> list3, @l List<String> list4, @l Integer num) {
        return new b(dVar, cVar, list, list2, list3, list4, num);
    }

    public int hashCode() {
        d dVar = this.f51266a;
        int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        f8.c cVar = this.f51267b;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        List<String> list = this.f51268c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f51269d;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f51270e;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.f51271f;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num = this.f51272g;
        return hashCode6 + (num != null ? num.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AdExtraResp(launch_wechat_program=" + this.f51266a + ", launch_app=" + this.f51267b + ", imp_trackers=" + this.f51268c + ", click_trackers=" + this.f51269d + ", launch_wechat_program_trackers=" + this.f51270e + ", launch_app_trackers=" + this.f51271f + ", price=" + this.f51272g + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f51265i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAdExtraResp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdExtraResp.kt\ncom/baicizhan/biz/online/ad_property/AdExtraResp$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"})
    /* renamed from: f8.b$b, reason: collision with other inner class name */
    public static final class C0611b implements ts.f<b> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public d f51273a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public f8.c f51274b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public List<String> f51275c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public List<String> f51276d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public List<String> f51277e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public List<String> f51278f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public Integer f51279g;

        public C0611b() {
            this.f51273a = null;
            this.f51274b = null;
            this.f51275c = null;
            this.f51276d = null;
            this.f51277e = null;
            this.f51278f = null;
            this.f51279g = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b build() {
            return new b(this.f51273a, this.f51274b, this.f51275c, this.f51276d, this.f51277e, this.f51278f, this.f51279g);
        }

        @k
        public final C0611b b(@l List<String> list) {
            this.f51276d = list;
            return this;
        }

        @k
        public final C0611b c(@l List<String> list) {
            this.f51275c = list;
            return this;
        }

        @k
        public final C0611b d(@l f8.c cVar) {
            this.f51274b = cVar;
            return this;
        }

        @k
        public final C0611b e(@l List<String> list) {
            this.f51278f = list;
            return this;
        }

        @k
        public final C0611b f(@l d dVar) {
            this.f51273a = dVar;
            return this;
        }

        @k
        public final C0611b g(@l List<String> list) {
            this.f51277e = list;
            return this;
        }

        @k
        public final C0611b h(@l Integer num) {
            this.f51279g = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f51273a = null;
            this.f51274b = null;
            this.f51275c = null;
            this.f51276d = null;
            this.f51277e = null;
            this.f51278f = null;
            this.f51279g = null;
        }

        public C0611b(@k b source) {
            g0.p(source, "source");
            this.f51273a = source.f51266a;
            this.f51274b = source.f51267b;
            this.f51275c = source.f51268c;
            this.f51276d = source.f51269d;
            this.f51277e = source.f51270e;
            this.f51278f = source.f51271f;
            this.f51279g = source.f51272g;
        }
    }
}
