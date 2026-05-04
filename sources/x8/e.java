package x8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final b f97720i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<e, a> f97721j = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @k
    public final String f97722a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public final String f97723b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @k
    public final String f97724c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @k
    public final String f97725d;

    /* renamed from: e, reason: collision with root package name */
    @l
    @w00.g
    public final List<g> f97726e;

    /* renamed from: f, reason: collision with root package name */
    @l
    @w00.g
    public final String f97727f;

    /* renamed from: g, reason: collision with root package name */
    @l
    @w00.g
    public final Integer f97728g;

    /* renamed from: h, reason: collision with root package name */
    @l
    @w00.g
    public final d f97729h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<e, a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e read(@k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e read(@k ws.i protocol, @k a builder) {
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
                        if (b11 == 11) {
                            builder.e(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 11) {
                            builder.g(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 11) {
                            builder.h(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 11) {
                            builder.a(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i11 = v42.f96838b;
                            for (int i12 = 0; i12 < i11; i12++) {
                                arrayList.add(g.f97755d.read(protocol));
                            }
                            protocol.l8();
                            builder.i(arrayList);
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 11) {
                            builder.c(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 7:
                        if (b11 == 8) {
                            builder.f(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 8:
                        if (b11 == 12) {
                            builder.d(d.f97713e.read(protocol));
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
        public void write(@k ws.i protocol, @k e struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("HuaweiPayInfo");
            protocol.Q6("order_id", 1, (byte) 11);
            protocol.p1(struct.f97722a);
            protocol.N2();
            protocol.Q6("product_id", 2, (byte) 11);
            protocol.p1(struct.f97723b);
            protocol.N2();
            protocol.Q6("purchase_token", 3, (byte) 11);
            protocol.p1(struct.f97724c);
            protocol.N2();
            protocol.Q6("application_id", 4, (byte) 11);
            protocol.p1(struct.f97725d);
            protocol.N2();
            if (struct.f97726e != null) {
                protocol.Q6("sub_items", 5, (byte) 15);
                protocol.y2((byte) 12, struct.f97726e.size());
                Iterator<g> it = struct.f97726e.iterator();
                while (it.hasNext()) {
                    g.f97755d.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f97727f != null) {
                protocol.Q6("extra", 6, (byte) 11);
                protocol.p1(struct.f97727f);
                protocol.N2();
            }
            if (struct.f97728g != null) {
                protocol.Q6("pay_type", 7, (byte) 8);
                protocol.l5(struct.f97728g.intValue());
                protocol.N2();
            }
            if (struct.f97729h != null) {
                protocol.Q6("harmony", 8, (byte) 12);
                d.f97713e.write(protocol, struct.f97729h);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public e(@k String order_id, @k String product_id, @k String purchase_token, @k String application_id, @l List<g> list, @l String str, @l Integer num, @l d dVar) {
        g0.p(order_id, "order_id");
        g0.p(product_id, "product_id");
        g0.p(purchase_token, "purchase_token");
        g0.p(application_id, "application_id");
        this.f97722a = order_id;
        this.f97723b = product_id;
        this.f97724c = purchase_token;
        this.f97725d = application_id;
        this.f97726e = list;
        this.f97727f = str;
        this.f97728g = num;
        this.f97729h = dVar;
    }

    public static /* synthetic */ e j(e eVar, String str, String str2, String str3, String str4, List list, String str5, Integer num, d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = eVar.f97722a;
        }
        if ((i11 & 2) != 0) {
            str2 = eVar.f97723b;
        }
        if ((i11 & 4) != 0) {
            str3 = eVar.f97724c;
        }
        if ((i11 & 8) != 0) {
            str4 = eVar.f97725d;
        }
        if ((i11 & 16) != 0) {
            list = eVar.f97726e;
        }
        if ((i11 & 32) != 0) {
            str5 = eVar.f97727f;
        }
        if ((i11 & 64) != 0) {
            num = eVar.f97728g;
        }
        if ((i11 & 128) != 0) {
            dVar = eVar.f97729h;
        }
        Integer num2 = num;
        d dVar2 = dVar;
        List list2 = list;
        String str6 = str5;
        return eVar.i(str, str2, str3, str4, list2, str6, num2, dVar2);
    }

    @k
    public final String a() {
        return this.f97722a;
    }

    @k
    public final String b() {
        return this.f97723b;
    }

    @k
    public final String c() {
        return this.f97724c;
    }

    @k
    public final String d() {
        return this.f97725d;
    }

    @l
    public final List<g> e() {
        return this.f97726e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return g0.g(this.f97722a, eVar.f97722a) && g0.g(this.f97723b, eVar.f97723b) && g0.g(this.f97724c, eVar.f97724c) && g0.g(this.f97725d, eVar.f97725d) && g0.g(this.f97726e, eVar.f97726e) && g0.g(this.f97727f, eVar.f97727f) && g0.g(this.f97728g, eVar.f97728g) && g0.g(this.f97729h, eVar.f97729h);
    }

    @l
    public final String f() {
        return this.f97727f;
    }

    @l
    public final Integer g() {
        return this.f97728g;
    }

    @l
    public final d h() {
        return this.f97729h;
    }

    public int hashCode() {
        int hashCode = ((((((this.f97722a.hashCode() * 31) + this.f97723b.hashCode()) * 31) + this.f97724c.hashCode()) * 31) + this.f97725d.hashCode()) * 31;
        List<g> list = this.f97726e;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f97727f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f97728g;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        d dVar = this.f97729h;
        return hashCode4 + (dVar != null ? dVar.hashCode() : 0);
    }

    @k
    public final e i(@k String order_id, @k String product_id, @k String purchase_token, @k String application_id, @l List<g> list, @l String str, @l Integer num, @l d dVar) {
        g0.p(order_id, "order_id");
        g0.p(product_id, "product_id");
        g0.p(purchase_token, "purchase_token");
        g0.p(application_id, "application_id");
        return new e(order_id, product_id, purchase_token, application_id, list, str, num, dVar);
    }

    @k
    public String toString() {
        return "HuaweiPayInfo(order_id=" + this.f97722a + ", product_id=" + this.f97723b + ", purchase_token=" + this.f97724c + ", application_id=" + this.f97725d + ", sub_items=" + this.f97726e + ", extra=" + this.f97727f + ", pay_type=" + this.f97728g + ", harmony=" + this.f97729h + ')';
    }

    @Override // ts.e
    public void write(@k ws.i protocol) {
        g0.p(protocol, "protocol");
        f97721j.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHuaweiPayInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuaweiPayInfo.kt\ncom/baicizhan/biz/online/user_assistant_api/HuaweiPayInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
    public static final class a implements ts.f<e> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public String f97730a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f97731b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f97732c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public String f97733d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public List<g> f97734e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public String f97735f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public Integer f97736g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public d f97737h;

        public a() {
            this.f97730a = null;
            this.f97731b = null;
            this.f97732c = null;
            this.f97733d = null;
            this.f97734e = null;
            this.f97735f = null;
            this.f97736g = null;
            this.f97737h = null;
        }

        @k
        public final a a(@k String application_id) {
            g0.p(application_id, "application_id");
            this.f97733d = application_id;
            return this;
        }

        @Override // ts.f
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e build() {
            String str = this.f97730a;
            if (str == null) {
                throw new IllegalStateException("Required field 'order_id' is missing");
            }
            String str2 = this.f97731b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'product_id' is missing");
            }
            String str3 = this.f97732c;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'purchase_token' is missing");
            }
            String str4 = this.f97733d;
            if (str4 != null) {
                return new e(str, str2, str3, str4, this.f97734e, this.f97735f, this.f97736g, this.f97737h);
            }
            throw new IllegalStateException("Required field 'application_id' is missing");
        }

        @k
        public final a c(@l String str) {
            this.f97735f = str;
            return this;
        }

        @k
        public final a d(@l d dVar) {
            this.f97737h = dVar;
            return this;
        }

        @k
        public final a e(@k String order_id) {
            g0.p(order_id, "order_id");
            this.f97730a = order_id;
            return this;
        }

        @k
        public final a f(@l Integer num) {
            this.f97736g = num;
            return this;
        }

        @k
        public final a g(@k String product_id) {
            g0.p(product_id, "product_id");
            this.f97731b = product_id;
            return this;
        }

        @k
        public final a h(@k String purchase_token) {
            g0.p(purchase_token, "purchase_token");
            this.f97732c = purchase_token;
            return this;
        }

        @k
        public final a i(@l List<g> list) {
            this.f97734e = list;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f97730a = null;
            this.f97731b = null;
            this.f97732c = null;
            this.f97733d = null;
            this.f97734e = null;
            this.f97735f = null;
            this.f97736g = null;
            this.f97737h = null;
        }

        public a(@k e source) {
            g0.p(source, "source");
            this.f97730a = source.f97722a;
            this.f97731b = source.f97723b;
            this.f97732c = source.f97724c;
            this.f97733d = source.f97725d;
            this.f97734e = source.f97726e;
            this.f97735f = source.f97727f;
            this.f97736g = source.f97728g;
            this.f97737h = source.f97729h;
        }
    }
}
