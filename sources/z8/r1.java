package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class r1 implements ts.e {

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final b f101967l = new b(null);

    /* renamed from: m, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<r1, a> f101968m = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101969a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101970b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101971c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f101972d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f101973e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101974f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101975g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101976h;

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101977i;

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101978j;

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    public final int f101979k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<r1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.l(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 10:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 11:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k r1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserFinishBookFlauntInfo");
            protocol.Q6(ma.b.f72894c, 1, (byte) 8);
            protocol.l5(struct.f101969a);
            protocol.N2();
            protocol.Q6("book_name", 2, (byte) 11);
            protocol.p1(struct.f101970b);
            protocol.N2();
            protocol.Q6("total_daka_days", 3, (byte) 8);
            protocol.l5(struct.f101971c);
            protocol.N2();
            protocol.Q6("total_words", 4, (byte) 8);
            protocol.l5(struct.f101972d);
            protocol.N2();
            protocol.Q6("review_round", 5, (byte) 8);
            protocol.l5(struct.f101973e);
            protocol.N2();
            protocol.Q6("share_url_weixin", 6, (byte) 11);
            protocol.p1(struct.f101974f);
            protocol.N2();
            protocol.Q6("share_url_qq", 7, (byte) 11);
            protocol.p1(struct.f101975g);
            protocol.N2();
            protocol.Q6("share_title", 8, (byte) 11);
            protocol.p1(struct.f101976h);
            protocol.N2();
            protocol.Q6("share_desc", 9, (byte) 11);
            protocol.p1(struct.f101977i);
            protocol.N2();
            protocol.Q6("share_img_url", 10, (byte) 11);
            protocol.p1(struct.f101978j);
            protocol.N2();
            protocol.Q6("user_unfinish_percentage", 11, (byte) 8);
            protocol.l5(struct.f101979k);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public r1(int i11, @m80.k String book_name, int i12, int i13, int i14, @m80.k String share_url_weixin, @m80.k String share_url_qq, @m80.k String share_title, @m80.k String share_desc, @m80.k String share_img_url, int i15) {
        kotlin.jvm.internal.g0.p(book_name, "book_name");
        kotlin.jvm.internal.g0.p(share_url_weixin, "share_url_weixin");
        kotlin.jvm.internal.g0.p(share_url_qq, "share_url_qq");
        kotlin.jvm.internal.g0.p(share_title, "share_title");
        kotlin.jvm.internal.g0.p(share_desc, "share_desc");
        kotlin.jvm.internal.g0.p(share_img_url, "share_img_url");
        this.f101969a = i11;
        this.f101970b = book_name;
        this.f101971c = i12;
        this.f101972d = i13;
        this.f101973e = i14;
        this.f101974f = share_url_weixin;
        this.f101975g = share_url_qq;
        this.f101976h = share_title;
        this.f101977i = share_desc;
        this.f101978j = share_img_url;
        this.f101979k = i15;
    }

    public static /* synthetic */ r1 m(r1 r1Var, int i11, String str, int i12, int i13, int i14, String str2, String str3, String str4, String str5, String str6, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = r1Var.f101969a;
        }
        if ((i16 & 2) != 0) {
            str = r1Var.f101970b;
        }
        if ((i16 & 4) != 0) {
            i12 = r1Var.f101971c;
        }
        if ((i16 & 8) != 0) {
            i13 = r1Var.f101972d;
        }
        if ((i16 & 16) != 0) {
            i14 = r1Var.f101973e;
        }
        if ((i16 & 32) != 0) {
            str2 = r1Var.f101974f;
        }
        if ((i16 & 64) != 0) {
            str3 = r1Var.f101975g;
        }
        if ((i16 & 128) != 0) {
            str4 = r1Var.f101976h;
        }
        if ((i16 & 256) != 0) {
            str5 = r1Var.f101977i;
        }
        if ((i16 & 512) != 0) {
            str6 = r1Var.f101978j;
        }
        if ((i16 & 1024) != 0) {
            i15 = r1Var.f101979k;
        }
        String str7 = str6;
        int i17 = i15;
        String str8 = str4;
        String str9 = str5;
        String str10 = str2;
        String str11 = str3;
        int i18 = i14;
        int i19 = i12;
        return r1Var.l(i11, str, i19, i13, i18, str10, str11, str8, str9, str7, i17);
    }

    public final int a() {
        return this.f101969a;
    }

    @m80.k
    public final String b() {
        return this.f101978j;
    }

    public final int c() {
        return this.f101979k;
    }

    @m80.k
    public final String d() {
        return this.f101970b;
    }

    public final int e() {
        return this.f101971c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return this.f101969a == r1Var.f101969a && kotlin.jvm.internal.g0.g(this.f101970b, r1Var.f101970b) && this.f101971c == r1Var.f101971c && this.f101972d == r1Var.f101972d && this.f101973e == r1Var.f101973e && kotlin.jvm.internal.g0.g(this.f101974f, r1Var.f101974f) && kotlin.jvm.internal.g0.g(this.f101975g, r1Var.f101975g) && kotlin.jvm.internal.g0.g(this.f101976h, r1Var.f101976h) && kotlin.jvm.internal.g0.g(this.f101977i, r1Var.f101977i) && kotlin.jvm.internal.g0.g(this.f101978j, r1Var.f101978j) && this.f101979k == r1Var.f101979k;
    }

    public final int f() {
        return this.f101972d;
    }

    public final int g() {
        return this.f101973e;
    }

    @m80.k
    public final String h() {
        return this.f101974f;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.f101969a) * 31) + this.f101970b.hashCode()) * 31) + Integer.hashCode(this.f101971c)) * 31) + Integer.hashCode(this.f101972d)) * 31) + Integer.hashCode(this.f101973e)) * 31) + this.f101974f.hashCode()) * 31) + this.f101975g.hashCode()) * 31) + this.f101976h.hashCode()) * 31) + this.f101977i.hashCode()) * 31) + this.f101978j.hashCode()) * 31) + Integer.hashCode(this.f101979k);
    }

    @m80.k
    public final String i() {
        return this.f101975g;
    }

    @m80.k
    public final String j() {
        return this.f101976h;
    }

    @m80.k
    public final String k() {
        return this.f101977i;
    }

    @m80.k
    public final r1 l(int i11, @m80.k String book_name, int i12, int i13, int i14, @m80.k String share_url_weixin, @m80.k String share_url_qq, @m80.k String share_title, @m80.k String share_desc, @m80.k String share_img_url, int i15) {
        kotlin.jvm.internal.g0.p(book_name, "book_name");
        kotlin.jvm.internal.g0.p(share_url_weixin, "share_url_weixin");
        kotlin.jvm.internal.g0.p(share_url_qq, "share_url_qq");
        kotlin.jvm.internal.g0.p(share_title, "share_title");
        kotlin.jvm.internal.g0.p(share_desc, "share_desc");
        kotlin.jvm.internal.g0.p(share_img_url, "share_img_url");
        return new r1(i11, book_name, i12, i13, i14, share_url_weixin, share_url_qq, share_title, share_desc, share_img_url, i15);
    }

    @m80.k
    public String toString() {
        return "UserFinishBookFlauntInfo(word_level_id=" + this.f101969a + ", book_name=" + this.f101970b + ", total_daka_days=" + this.f101971c + ", total_words=" + this.f101972d + ", review_round=" + this.f101973e + ", share_url_weixin=" + this.f101974f + ", share_url_qq=" + this.f101975g + ", share_title=" + this.f101976h + ", share_desc=" + this.f101977i + ", share_img_url=" + this.f101978j + ", user_unfinish_percentage=" + this.f101979k + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101968m.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserFinishBookFlauntInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserFinishBookFlauntInfo.kt\ncom/baicizhan/biz/online/user_study_api/UserFinishBookFlauntInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,359:1\n1#2:360\n*E\n"})
    public static final class a implements ts.f<r1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101980a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101981b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101982c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f101983d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f101984e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f101985f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f101986g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f101987h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public String f101988i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public String f101989j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public Integer f101990k;

        public a() {
            this.f101980a = null;
            this.f101981b = null;
            this.f101982c = null;
            this.f101983d = null;
            this.f101984e = null;
            this.f101985f = null;
            this.f101986g = null;
            this.f101987h = null;
            this.f101988i = null;
            this.f101989j = null;
            this.f101990k = null;
        }

        @m80.k
        public final a a(@m80.k String book_name) {
            kotlin.jvm.internal.g0.p(book_name, "book_name");
            this.f101981b = book_name;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r1 build() {
            Integer num = this.f101980a;
            if (num == null) {
                throw new IllegalStateException("Required field 'word_level_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f101981b;
            if (str == null) {
                throw new IllegalStateException("Required field 'book_name' is missing");
            }
            Integer num2 = this.f101982c;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'total_daka_days' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f101983d;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'total_words' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f101984e;
            if (num4 == null) {
                throw new IllegalStateException("Required field 'review_round' is missing");
            }
            int intValue4 = num4.intValue();
            String str2 = this.f101985f;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'share_url_weixin' is missing");
            }
            String str3 = this.f101986g;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'share_url_qq' is missing");
            }
            String str4 = this.f101987h;
            if (str4 == null) {
                throw new IllegalStateException("Required field 'share_title' is missing");
            }
            String str5 = this.f101988i;
            if (str5 == null) {
                throw new IllegalStateException("Required field 'share_desc' is missing");
            }
            String str6 = this.f101989j;
            if (str6 == null) {
                throw new IllegalStateException("Required field 'share_img_url' is missing");
            }
            Integer num5 = this.f101990k;
            if (num5 != null) {
                return new r1(intValue, str, intValue2, intValue3, intValue4, str2, str3, str4, str5, str6, num5.intValue());
            }
            throw new IllegalStateException("Required field 'user_unfinish_percentage' is missing");
        }

        @m80.k
        public final a c(int i11) {
            this.f101984e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.k String share_desc) {
            kotlin.jvm.internal.g0.p(share_desc, "share_desc");
            this.f101988i = share_desc;
            return this;
        }

        @m80.k
        public final a e(@m80.k String share_img_url) {
            kotlin.jvm.internal.g0.p(share_img_url, "share_img_url");
            this.f101989j = share_img_url;
            return this;
        }

        @m80.k
        public final a f(@m80.k String share_title) {
            kotlin.jvm.internal.g0.p(share_title, "share_title");
            this.f101987h = share_title;
            return this;
        }

        @m80.k
        public final a g(@m80.k String share_url_qq) {
            kotlin.jvm.internal.g0.p(share_url_qq, "share_url_qq");
            this.f101986g = share_url_qq;
            return this;
        }

        @m80.k
        public final a h(@m80.k String share_url_weixin) {
            kotlin.jvm.internal.g0.p(share_url_weixin, "share_url_weixin");
            this.f101985f = share_url_weixin;
            return this;
        }

        @m80.k
        public final a i(int i11) {
            this.f101982c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a j(int i11) {
            this.f101983d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a k(int i11) {
            this.f101990k = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a l(int i11) {
            this.f101980a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101980a = null;
            this.f101981b = null;
            this.f101982c = null;
            this.f101983d = null;
            this.f101984e = null;
            this.f101985f = null;
            this.f101986g = null;
            this.f101987h = null;
            this.f101988i = null;
            this.f101989j = null;
            this.f101990k = null;
        }

        public a(@m80.k r1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101980a = Integer.valueOf(source.f101969a);
            this.f101981b = source.f101970b;
            this.f101982c = Integer.valueOf(source.f101971c);
            this.f101983d = Integer.valueOf(source.f101972d);
            this.f101984e = Integer.valueOf(source.f101973e);
            this.f101985f = source.f101974f;
            this.f101986g = source.f101975g;
            this.f101987h = source.f101976h;
            this.f101988i = source.f101977i;
            this.f101989j = source.f101978j;
            this.f101990k = Integer.valueOf(source.f101979k);
        }
    }
}
