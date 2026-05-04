package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class n1 implements ts.e {

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final b f101807m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<n1, a> f101808n = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101809a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101810b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101811c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101812d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<String> f101813e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101814f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    public final int f101815g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<l1> f101816h;

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<o1> f101817i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101818j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101819k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101820l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<n1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(protocol.readString());
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
                                arrayList.add(protocol.readString());
                                i11++;
                            }
                            protocol.l8();
                            builder.i(arrayList);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.s8());
                            break;
                        }
                    case 8:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v43 = protocol.v4();
                            ArrayList arrayList2 = new ArrayList(v43.f96838b);
                            int i13 = v43.f96838b;
                            while (i11 < i13) {
                                arrayList2.add(l1.f101744f.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.b(arrayList2);
                            break;
                        }
                    case 9:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v44 = protocol.v4();
                            ArrayList arrayList3 = new ArrayList(v44.f96838b);
                            int i14 = v44.f96838b;
                            while (i11 < i14) {
                                arrayList3.add(o1.f101858d.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.d(arrayList3);
                            break;
                        }
                    case 10:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.m(protocol.readString());
                            break;
                        }
                    case 11:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.l(protocol.readString());
                            break;
                        }
                    case 12:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k n1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserDakaShareInfo");
            protocol.Q6("weibo_share_txt", 1, (byte) 11);
            protocol.p1(struct.f101809a);
            protocol.N2();
            protocol.Q6("weibo_share_img_url", 2, (byte) 11);
            protocol.p1(struct.f101810b);
            protocol.N2();
            protocol.Q6("weixin_share_title", 3, (byte) 11);
            protocol.p1(struct.f101811c);
            protocol.N2();
            protocol.Q6("weixin_share_url", 4, (byte) 11);
            protocol.p1(struct.f101812d);
            protocol.N2();
            protocol.Q6("weixin_share_pic_urls", 5, (byte) 15);
            protocol.y2((byte) 11, struct.f101813e.size());
            Iterator<String> it = struct.f101813e.iterator();
            while (it.hasNext()) {
                protocol.p1(it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("qzone_share_url", 6, (byte) 11);
            protocol.p1(struct.f101814f);
            protocol.N2();
            protocol.Q6("total_daka_days", 7, (byte) 8);
            protocol.l5(struct.f101815g);
            protocol.N2();
            protocol.Q6("daka_dates", 8, (byte) 15);
            protocol.y2((byte) 12, struct.f101816h.size());
            Iterator<l1> it2 = struct.f101816h.iterator();
            while (it2.hasNext()) {
                l1.f101744f.write(protocol, it2.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("special_days", 9, (byte) 15);
            protocol.y2((byte) 12, struct.f101817i.size());
            Iterator<o1> it3 = struct.f101817i.iterator();
            while (it3.hasNext()) {
                o1.f101858d.write(protocol, it3.next());
            }
            protocol.i5();
            protocol.N2();
            if (struct.f101818j != null) {
                protocol.Q6("xhs_share_title", 10, (byte) 11);
                protocol.p1(struct.f101818j);
                protocol.N2();
            }
            if (struct.f101819k != null) {
                protocol.Q6("xhs_share_content", 11, (byte) 11);
                protocol.p1(struct.f101819k);
                protocol.N2();
            }
            if (struct.f101820l != null) {
                protocol.Q6("total_words", 12, (byte) 8);
                protocol.l5(struct.f101820l.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public n1(@m80.k String weibo_share_txt, @m80.k String weibo_share_img_url, @m80.k String weixin_share_title, @m80.k String weixin_share_url, @m80.k List<String> weixin_share_pic_urls, @m80.k String qzone_share_url, int i11, @m80.k List<l1> daka_dates, @m80.k List<o1> special_days, @m80.l String str, @m80.l String str2, @m80.l Integer num) {
        kotlin.jvm.internal.g0.p(weibo_share_txt, "weibo_share_txt");
        kotlin.jvm.internal.g0.p(weibo_share_img_url, "weibo_share_img_url");
        kotlin.jvm.internal.g0.p(weixin_share_title, "weixin_share_title");
        kotlin.jvm.internal.g0.p(weixin_share_url, "weixin_share_url");
        kotlin.jvm.internal.g0.p(weixin_share_pic_urls, "weixin_share_pic_urls");
        kotlin.jvm.internal.g0.p(qzone_share_url, "qzone_share_url");
        kotlin.jvm.internal.g0.p(daka_dates, "daka_dates");
        kotlin.jvm.internal.g0.p(special_days, "special_days");
        this.f101809a = weibo_share_txt;
        this.f101810b = weibo_share_img_url;
        this.f101811c = weixin_share_title;
        this.f101812d = weixin_share_url;
        this.f101813e = weixin_share_pic_urls;
        this.f101814f = qzone_share_url;
        this.f101815g = i11;
        this.f101816h = daka_dates;
        this.f101817i = special_days;
        this.f101818j = str;
        this.f101819k = str2;
        this.f101820l = num;
    }

    public static /* synthetic */ n1 n(n1 n1Var, String str, String str2, String str3, String str4, List list, String str5, int i11, List list2, List list3, String str6, String str7, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = n1Var.f101809a;
        }
        if ((i12 & 2) != 0) {
            str2 = n1Var.f101810b;
        }
        if ((i12 & 4) != 0) {
            str3 = n1Var.f101811c;
        }
        if ((i12 & 8) != 0) {
            str4 = n1Var.f101812d;
        }
        if ((i12 & 16) != 0) {
            list = n1Var.f101813e;
        }
        if ((i12 & 32) != 0) {
            str5 = n1Var.f101814f;
        }
        if ((i12 & 64) != 0) {
            i11 = n1Var.f101815g;
        }
        if ((i12 & 128) != 0) {
            list2 = n1Var.f101816h;
        }
        if ((i12 & 256) != 0) {
            list3 = n1Var.f101817i;
        }
        if ((i12 & 512) != 0) {
            str6 = n1Var.f101818j;
        }
        if ((i12 & 1024) != 0) {
            str7 = n1Var.f101819k;
        }
        if ((i12 & 2048) != 0) {
            num = n1Var.f101820l;
        }
        String str8 = str7;
        Integer num2 = num;
        List list4 = list3;
        String str9 = str6;
        int i13 = i11;
        List list5 = list2;
        List list6 = list;
        String str10 = str5;
        return n1Var.m(str, str2, str3, str4, list6, str10, i13, list5, list4, str9, str8, num2);
    }

    @m80.k
    public final String a() {
        return this.f101809a;
    }

    @m80.l
    public final String b() {
        return this.f101818j;
    }

    @m80.l
    public final String c() {
        return this.f101819k;
    }

    @m80.l
    public final Integer d() {
        return this.f101820l;
    }

    @m80.k
    public final String e() {
        return this.f101810b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return kotlin.jvm.internal.g0.g(this.f101809a, n1Var.f101809a) && kotlin.jvm.internal.g0.g(this.f101810b, n1Var.f101810b) && kotlin.jvm.internal.g0.g(this.f101811c, n1Var.f101811c) && kotlin.jvm.internal.g0.g(this.f101812d, n1Var.f101812d) && kotlin.jvm.internal.g0.g(this.f101813e, n1Var.f101813e) && kotlin.jvm.internal.g0.g(this.f101814f, n1Var.f101814f) && this.f101815g == n1Var.f101815g && kotlin.jvm.internal.g0.g(this.f101816h, n1Var.f101816h) && kotlin.jvm.internal.g0.g(this.f101817i, n1Var.f101817i) && kotlin.jvm.internal.g0.g(this.f101818j, n1Var.f101818j) && kotlin.jvm.internal.g0.g(this.f101819k, n1Var.f101819k) && kotlin.jvm.internal.g0.g(this.f101820l, n1Var.f101820l);
    }

    @m80.k
    public final String f() {
        return this.f101811c;
    }

    @m80.k
    public final String g() {
        return this.f101812d;
    }

    @m80.k
    public final List<String> h() {
        return this.f101813e;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f101809a.hashCode() * 31) + this.f101810b.hashCode()) * 31) + this.f101811c.hashCode()) * 31) + this.f101812d.hashCode()) * 31) + this.f101813e.hashCode()) * 31) + this.f101814f.hashCode()) * 31) + Integer.hashCode(this.f101815g)) * 31) + this.f101816h.hashCode()) * 31) + this.f101817i.hashCode()) * 31;
        String str = this.f101818j;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f101819k;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f101820l;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    @m80.k
    public final String i() {
        return this.f101814f;
    }

    public final int j() {
        return this.f101815g;
    }

    @m80.k
    public final List<l1> k() {
        return this.f101816h;
    }

    @m80.k
    public final List<o1> l() {
        return this.f101817i;
    }

    @m80.k
    public final n1 m(@m80.k String weibo_share_txt, @m80.k String weibo_share_img_url, @m80.k String weixin_share_title, @m80.k String weixin_share_url, @m80.k List<String> weixin_share_pic_urls, @m80.k String qzone_share_url, int i11, @m80.k List<l1> daka_dates, @m80.k List<o1> special_days, @m80.l String str, @m80.l String str2, @m80.l Integer num) {
        kotlin.jvm.internal.g0.p(weibo_share_txt, "weibo_share_txt");
        kotlin.jvm.internal.g0.p(weibo_share_img_url, "weibo_share_img_url");
        kotlin.jvm.internal.g0.p(weixin_share_title, "weixin_share_title");
        kotlin.jvm.internal.g0.p(weixin_share_url, "weixin_share_url");
        kotlin.jvm.internal.g0.p(weixin_share_pic_urls, "weixin_share_pic_urls");
        kotlin.jvm.internal.g0.p(qzone_share_url, "qzone_share_url");
        kotlin.jvm.internal.g0.p(daka_dates, "daka_dates");
        kotlin.jvm.internal.g0.p(special_days, "special_days");
        return new n1(weibo_share_txt, weibo_share_img_url, weixin_share_title, weixin_share_url, weixin_share_pic_urls, qzone_share_url, i11, daka_dates, special_days, str, str2, num);
    }

    @m80.k
    public String toString() {
        return "UserDakaShareInfo(weibo_share_txt=" + this.f101809a + ", weibo_share_img_url=" + this.f101810b + ", weixin_share_title=" + this.f101811c + ", weixin_share_url=" + this.f101812d + ", weixin_share_pic_urls=" + this.f101813e + ", qzone_share_url=" + this.f101814f + ", total_daka_days=" + this.f101815g + ", daka_dates=" + this.f101816h + ", special_days=" + this.f101817i + ", xhs_share_title=" + this.f101818j + ", xhs_share_content=" + this.f101819k + ", total_words=" + this.f101820l + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101808n.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserDakaShareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserDakaShareInfo.kt\ncom/baicizhan/biz/online/user_study_api/UserDakaShareInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,456:1\n1#2:457\n*E\n"})
    public static final class a implements ts.f<n1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f101821a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101822b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f101823c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f101824d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public List<String> f101825e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f101826f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f101827g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public List<l1> f101828h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public List<o1> f101829i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public String f101830j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public String f101831k;

        /* renamed from: l, reason: collision with root package name */
        @m80.l
        public Integer f101832l;

        public a() {
            this.f101821a = null;
            this.f101822b = null;
            this.f101823c = null;
            this.f101824d = null;
            this.f101825e = null;
            this.f101826f = null;
            this.f101827g = null;
            this.f101828h = null;
            this.f101829i = null;
            this.f101830j = null;
            this.f101831k = null;
            this.f101832l = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n1 build() {
            String str = this.f101821a;
            if (str == null) {
                throw new IllegalStateException("Required field 'weibo_share_txt' is missing");
            }
            String str2 = this.f101822b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'weibo_share_img_url' is missing");
            }
            String str3 = this.f101823c;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'weixin_share_title' is missing");
            }
            String str4 = this.f101824d;
            if (str4 == null) {
                throw new IllegalStateException("Required field 'weixin_share_url' is missing");
            }
            List<String> list = this.f101825e;
            if (list == null) {
                throw new IllegalStateException("Required field 'weixin_share_pic_urls' is missing");
            }
            String str5 = this.f101826f;
            if (str5 == null) {
                throw new IllegalStateException("Required field 'qzone_share_url' is missing");
            }
            Integer num = this.f101827g;
            if (num == null) {
                throw new IllegalStateException("Required field 'total_daka_days' is missing");
            }
            int intValue = num.intValue();
            List<l1> list2 = this.f101828h;
            if (list2 == null) {
                throw new IllegalStateException("Required field 'daka_dates' is missing");
            }
            List<o1> list3 = this.f101829i;
            if (list3 != null) {
                return new n1(str, str2, str3, str4, list, str5, intValue, list2, list3, this.f101830j, this.f101831k, this.f101832l);
            }
            throw new IllegalStateException("Required field 'special_days' is missing");
        }

        @m80.k
        public final a b(@m80.k List<l1> daka_dates) {
            kotlin.jvm.internal.g0.p(daka_dates, "daka_dates");
            this.f101828h = daka_dates;
            return this;
        }

        @m80.k
        public final a c(@m80.k String qzone_share_url) {
            kotlin.jvm.internal.g0.p(qzone_share_url, "qzone_share_url");
            this.f101826f = qzone_share_url;
            return this;
        }

        @m80.k
        public final a d(@m80.k List<o1> special_days) {
            kotlin.jvm.internal.g0.p(special_days, "special_days");
            this.f101829i = special_days;
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f101827g = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(@m80.l Integer num) {
            this.f101832l = num;
            return this;
        }

        @m80.k
        public final a g(@m80.k String weibo_share_img_url) {
            kotlin.jvm.internal.g0.p(weibo_share_img_url, "weibo_share_img_url");
            this.f101822b = weibo_share_img_url;
            return this;
        }

        @m80.k
        public final a h(@m80.k String weibo_share_txt) {
            kotlin.jvm.internal.g0.p(weibo_share_txt, "weibo_share_txt");
            this.f101821a = weibo_share_txt;
            return this;
        }

        @m80.k
        public final a i(@m80.k List<String> weixin_share_pic_urls) {
            kotlin.jvm.internal.g0.p(weixin_share_pic_urls, "weixin_share_pic_urls");
            this.f101825e = weixin_share_pic_urls;
            return this;
        }

        @m80.k
        public final a j(@m80.k String weixin_share_title) {
            kotlin.jvm.internal.g0.p(weixin_share_title, "weixin_share_title");
            this.f101823c = weixin_share_title;
            return this;
        }

        @m80.k
        public final a k(@m80.k String weixin_share_url) {
            kotlin.jvm.internal.g0.p(weixin_share_url, "weixin_share_url");
            this.f101824d = weixin_share_url;
            return this;
        }

        @m80.k
        public final a l(@m80.l String str) {
            this.f101831k = str;
            return this;
        }

        @m80.k
        public final a m(@m80.l String str) {
            this.f101830j = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101821a = null;
            this.f101822b = null;
            this.f101823c = null;
            this.f101824d = null;
            this.f101825e = null;
            this.f101826f = null;
            this.f101827g = null;
            this.f101828h = null;
            this.f101829i = null;
            this.f101830j = null;
            this.f101831k = null;
            this.f101832l = null;
        }

        public a(@m80.k n1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101821a = source.f101809a;
            this.f101822b = source.f101810b;
            this.f101823c = source.f101811c;
            this.f101824d = source.f101812d;
            this.f101825e = source.f101813e;
            this.f101826f = source.f101814f;
            this.f101827g = Integer.valueOf(source.f101815g);
            this.f101828h = source.f101816h;
            this.f101829i = source.f101817i;
            this.f101830j = source.f101818j;
            this.f101831k = source.f101819k;
            this.f101832l = source.f101820l;
        }
    }
}
