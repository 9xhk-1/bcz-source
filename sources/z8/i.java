package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class i implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final b f101593h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<i, a> f101594i = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101595a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101596b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101597c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<String> f101598d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f101599e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101600f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<t0> f101601g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<i, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i read(@m80.k ws.i protocol, @m80.k a builder) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(builder, "builder");
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
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v42 = protocol.v4();
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
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v43 = protocol.v4();
                            ArrayList arrayList2 = new ArrayList(v43.f96838b);
                            int i13 = v43.f96838b;
                            while (i11 < i13) {
                                arrayList2.add(t0.f102042k.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.h(arrayList2);
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
        public void write(@m80.k ws.i protocol, @m80.k i struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("CreditCenter");
            protocol.Q6("show_credit_center", 1, (byte) 8);
            protocol.l5(struct.f101595a);
            protocol.N2();
            protocol.Q6("credit", 2, (byte) 8);
            protocol.l5(struct.f101596b);
            protocol.N2();
            protocol.Q6("daily_inc_credit", 3, (byte) 8);
            protocol.l5(struct.f101597c);
            protocol.N2();
            protocol.Q6("credit_item_img", 4, (byte) 15);
            protocol.y2((byte) 11, struct.f101598d.size());
            Iterator<String> it = struct.f101598d.iterator();
            while (it.hasNext()) {
                protocol.p1(it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("new_flag", 5, (byte) 8);
            protocol.l5(struct.f101599e);
            protocol.N2();
            protocol.Q6("credit_mall_url", 6, (byte) 11);
            protocol.p1(struct.f101600f);
            protocol.N2();
            if (struct.f101601g != null) {
                protocol.Q6("task", 7, (byte) 15);
                protocol.y2((byte) 12, struct.f101601g.size());
                Iterator<t0> it2 = struct.f101601g.iterator();
                while (it2.hasNext()) {
                    t0.f102042k.write(protocol, it2.next());
                }
                protocol.i5();
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public i(int i11, int i12, int i13, @m80.k List<String> credit_item_img, int i14, @m80.k String credit_mall_url, @m80.l List<t0> list) {
        kotlin.jvm.internal.g0.p(credit_item_img, "credit_item_img");
        kotlin.jvm.internal.g0.p(credit_mall_url, "credit_mall_url");
        this.f101595a = i11;
        this.f101596b = i12;
        this.f101597c = i13;
        this.f101598d = credit_item_img;
        this.f101599e = i14;
        this.f101600f = credit_mall_url;
        this.f101601g = list;
    }

    public static /* synthetic */ i i(i iVar, int i11, int i12, int i13, List list, int i14, String str, List list2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = iVar.f101595a;
        }
        if ((i15 & 2) != 0) {
            i12 = iVar.f101596b;
        }
        if ((i15 & 4) != 0) {
            i13 = iVar.f101597c;
        }
        if ((i15 & 8) != 0) {
            list = iVar.f101598d;
        }
        if ((i15 & 16) != 0) {
            i14 = iVar.f101599e;
        }
        if ((i15 & 32) != 0) {
            str = iVar.f101600f;
        }
        if ((i15 & 64) != 0) {
            list2 = iVar.f101601g;
        }
        String str2 = str;
        List list3 = list2;
        int i16 = i14;
        int i17 = i13;
        return iVar.h(i11, i12, i17, list, i16, str2, list3);
    }

    public final int a() {
        return this.f101595a;
    }

    public final int b() {
        return this.f101596b;
    }

    public final int c() {
        return this.f101597c;
    }

    @m80.k
    public final List<String> d() {
        return this.f101598d;
    }

    public final int e() {
        return this.f101599e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f101595a == iVar.f101595a && this.f101596b == iVar.f101596b && this.f101597c == iVar.f101597c && kotlin.jvm.internal.g0.g(this.f101598d, iVar.f101598d) && this.f101599e == iVar.f101599e && kotlin.jvm.internal.g0.g(this.f101600f, iVar.f101600f) && kotlin.jvm.internal.g0.g(this.f101601g, iVar.f101601g);
    }

    @m80.k
    public final String f() {
        return this.f101600f;
    }

    @m80.l
    public final List<t0> g() {
        return this.f101601g;
    }

    @m80.k
    public final i h(int i11, int i12, int i13, @m80.k List<String> credit_item_img, int i14, @m80.k String credit_mall_url, @m80.l List<t0> list) {
        kotlin.jvm.internal.g0.p(credit_item_img, "credit_item_img");
        kotlin.jvm.internal.g0.p(credit_mall_url, "credit_mall_url");
        return new i(i11, i12, i13, credit_item_img, i14, credit_mall_url, list);
    }

    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(this.f101595a) * 31) + Integer.hashCode(this.f101596b)) * 31) + Integer.hashCode(this.f101597c)) * 31) + this.f101598d.hashCode()) * 31) + Integer.hashCode(this.f101599e)) * 31) + this.f101600f.hashCode()) * 31;
        List<t0> list = this.f101601g;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @m80.k
    public String toString() {
        return "CreditCenter(show_credit_center=" + this.f101595a + ", credit=" + this.f101596b + ", daily_inc_credit=" + this.f101597c + ", credit_item_img=" + this.f101598d + ", new_flag=" + this.f101599e + ", credit_mall_url=" + this.f101600f + ", task=" + this.f101601g + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101594i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nCreditCenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreditCenter.kt\ncom/baicizhan/biz/online/user_study_api/CreditCenter$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n1#2:283\n*E\n"})
    public static final class a implements ts.f<i> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101602a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101603b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101604c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public List<String> f101605d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f101606e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f101607f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public List<t0> f101608g;

        public a() {
            this.f101602a = null;
            this.f101603b = null;
            this.f101604c = null;
            this.f101605d = null;
            this.f101606e = null;
            this.f101607f = null;
            this.f101608g = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i build() {
            Integer num = this.f101602a;
            if (num == null) {
                throw new IllegalStateException("Required field 'show_credit_center' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101603b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'credit' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f101604c;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'daily_inc_credit' is missing");
            }
            int intValue3 = num3.intValue();
            List<String> list = this.f101605d;
            if (list == null) {
                throw new IllegalStateException("Required field 'credit_item_img' is missing");
            }
            Integer num4 = this.f101606e;
            if (num4 == null) {
                throw new IllegalStateException("Required field 'new_flag' is missing");
            }
            int intValue4 = num4.intValue();
            String str = this.f101607f;
            if (str != null) {
                return new i(intValue, intValue2, intValue3, list, intValue4, str, this.f101608g);
            }
            throw new IllegalStateException("Required field 'credit_mall_url' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f101603b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.k List<String> credit_item_img) {
            kotlin.jvm.internal.g0.p(credit_item_img, "credit_item_img");
            this.f101605d = credit_item_img;
            return this;
        }

        @m80.k
        public final a d(@m80.k String credit_mall_url) {
            kotlin.jvm.internal.g0.p(credit_mall_url, "credit_mall_url");
            this.f101607f = credit_mall_url;
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f101604c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f101606e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f101602a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a h(@m80.l List<t0> list) {
            this.f101608g = list;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101602a = null;
            this.f101603b = null;
            this.f101604c = null;
            this.f101605d = null;
            this.f101606e = null;
            this.f101607f = null;
            this.f101608g = null;
        }

        public a(@m80.k i source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101602a = Integer.valueOf(source.f101595a);
            this.f101603b = Integer.valueOf(source.f101596b);
            this.f101604c = Integer.valueOf(source.f101597c);
            this.f101605d = source.f101598d;
            this.f101606e = Integer.valueOf(source.f101599e);
            this.f101607f = source.f101600f;
            this.f101608g = source.f101601g;
        }
    }
}
