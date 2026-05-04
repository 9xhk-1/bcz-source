package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class y implements ts.e {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final b f80252j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<y, a> f80253k = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f80254a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f80255b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f80256c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f80257d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f80258e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final long f80259f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f80260g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f80261h;

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f80262i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<y, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.i(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.T1());
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k y struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("LavaQuest");
            protocol.Q6("status", 1, (byte) 8);
            protocol.l5(struct.f80254a);
            protocol.N2();
            protocol.Q6("current", 2, (byte) 8);
            protocol.l5(struct.f80255b);
            protocol.N2();
            protocol.Q6(hb.d.f59153d, 3, (byte) 8);
            protocol.l5(struct.f80256c);
            protocol.N2();
            protocol.Q6("props_remain_count", 4, (byte) 8);
            protocol.l5(struct.f80257d);
            protocol.N2();
            protocol.Q6("revival_coin_cost", 5, (byte) 8);
            protocol.l5(struct.f80258e);
            protocol.N2();
            protocol.Q6("end_time", 6, (byte) 10);
            protocol.q7(struct.f80259f);
            protocol.N2();
            protocol.Q6("icon_img", 7, (byte) 11);
            protocol.p1(struct.f80260g);
            protocol.N2();
            protocol.Q6("background_color", 8, (byte) 11);
            protocol.p1(struct.f80261h);
            protocol.N2();
            protocol.Q6("border_color", 9, (byte) 11);
            protocol.p1(struct.f80262i);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public y(int i11, int i12, int i13, int i14, int i15, long j11, @m80.k String icon_img, @m80.k String background_color, @m80.k String border_color) {
        kotlin.jvm.internal.g0.p(icon_img, "icon_img");
        kotlin.jvm.internal.g0.p(background_color, "background_color");
        kotlin.jvm.internal.g0.p(border_color, "border_color");
        this.f80254a = i11;
        this.f80255b = i12;
        this.f80256c = i13;
        this.f80257d = i14;
        this.f80258e = i15;
        this.f80259f = j11;
        this.f80260g = icon_img;
        this.f80261h = background_color;
        this.f80262i = border_color;
    }

    public static /* synthetic */ y k(y yVar, int i11, int i12, int i13, int i14, int i15, long j11, String str, String str2, String str3, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = yVar.f80254a;
        }
        if ((i16 & 2) != 0) {
            i12 = yVar.f80255b;
        }
        if ((i16 & 4) != 0) {
            i13 = yVar.f80256c;
        }
        if ((i16 & 8) != 0) {
            i14 = yVar.f80257d;
        }
        if ((i16 & 16) != 0) {
            i15 = yVar.f80258e;
        }
        if ((i16 & 32) != 0) {
            j11 = yVar.f80259f;
        }
        if ((i16 & 64) != 0) {
            str = yVar.f80260g;
        }
        if ((i16 & 128) != 0) {
            str2 = yVar.f80261h;
        }
        if ((i16 & 256) != 0) {
            str3 = yVar.f80262i;
        }
        String str4 = str3;
        String str5 = str;
        long j12 = j11;
        int i17 = i14;
        int i18 = i15;
        int i19 = i13;
        return yVar.j(i11, i12, i19, i17, i18, j12, str5, str2, str4);
    }

    public final int a() {
        return this.f80254a;
    }

    public final int b() {
        return this.f80255b;
    }

    public final int c() {
        return this.f80256c;
    }

    public final int d() {
        return this.f80257d;
    }

    public final int e() {
        return this.f80258e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f80254a == yVar.f80254a && this.f80255b == yVar.f80255b && this.f80256c == yVar.f80256c && this.f80257d == yVar.f80257d && this.f80258e == yVar.f80258e && this.f80259f == yVar.f80259f && kotlin.jvm.internal.g0.g(this.f80260g, yVar.f80260g) && kotlin.jvm.internal.g0.g(this.f80261h, yVar.f80261h) && kotlin.jvm.internal.g0.g(this.f80262i, yVar.f80262i);
    }

    public final long f() {
        return this.f80259f;
    }

    @m80.k
    public final String g() {
        return this.f80260g;
    }

    @m80.k
    public final String h() {
        return this.f80261h;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f80254a) * 31) + Integer.hashCode(this.f80255b)) * 31) + Integer.hashCode(this.f80256c)) * 31) + Integer.hashCode(this.f80257d)) * 31) + Integer.hashCode(this.f80258e)) * 31) + Long.hashCode(this.f80259f)) * 31) + this.f80260g.hashCode()) * 31) + this.f80261h.hashCode()) * 31) + this.f80262i.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f80262i;
    }

    @m80.k
    public final y j(int i11, int i12, int i13, int i14, int i15, long j11, @m80.k String icon_img, @m80.k String background_color, @m80.k String border_color) {
        kotlin.jvm.internal.g0.p(icon_img, "icon_img");
        kotlin.jvm.internal.g0.p(background_color, "background_color");
        kotlin.jvm.internal.g0.p(border_color, "border_color");
        return new y(i11, i12, i13, i14, i15, j11, icon_img, background_color, border_color);
    }

    @m80.k
    public String toString() {
        return "LavaQuest(status=" + this.f80254a + ", current=" + this.f80255b + ", total=" + this.f80256c + ", props_remain_count=" + this.f80257d + ", revival_coin_cost=" + this.f80258e + ", end_time=" + this.f80259f + ", icon_img=" + this.f80260g + ", background_color=" + this.f80261h + ", border_color=" + this.f80262i + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80253k.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nLavaQuest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LavaQuest.kt\ncom/baicizhan/biz/online/game_api/LavaQuest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,326:1\n1#2:327\n*E\n"})
    public static final class a implements ts.f<y> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f80263a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f80264b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f80265c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f80266d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f80267e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Long f80268f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f80269g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f80270h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public String f80271i;

        public a() {
            this.f80263a = null;
            this.f80264b = null;
            this.f80265c = null;
            this.f80266d = null;
            this.f80267e = null;
            this.f80268f = null;
            this.f80269g = null;
            this.f80270h = null;
            this.f80271i = null;
        }

        @m80.k
        public final a a(@m80.k String background_color) {
            kotlin.jvm.internal.g0.p(background_color, "background_color");
            this.f80270h = background_color;
            return this;
        }

        @m80.k
        public final a b(@m80.k String border_color) {
            kotlin.jvm.internal.g0.p(border_color, "border_color");
            this.f80271i = border_color;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public y build() {
            Integer num = this.f80263a;
            if (num == null) {
                throw new IllegalStateException("Required field 'status' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f80264b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'current' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f80265c;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'total' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f80266d;
            if (num4 == null) {
                throw new IllegalStateException("Required field 'props_remain_count' is missing");
            }
            int intValue4 = num4.intValue();
            Integer num5 = this.f80267e;
            if (num5 == null) {
                throw new IllegalStateException("Required field 'revival_coin_cost' is missing");
            }
            int intValue5 = num5.intValue();
            Long l11 = this.f80268f;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'end_time' is missing");
            }
            long longValue = l11.longValue();
            String str = this.f80269g;
            if (str == null) {
                throw new IllegalStateException("Required field 'icon_img' is missing");
            }
            String str2 = this.f80270h;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'background_color' is missing");
            }
            String str3 = this.f80271i;
            if (str3 != null) {
                return new y(intValue, intValue2, intValue3, intValue4, intValue5, longValue, str, str2, str3);
            }
            throw new IllegalStateException("Required field 'border_color' is missing");
        }

        @m80.k
        public final a d(int i11) {
            this.f80264b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(long j11) {
            this.f80268f = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a f(@m80.k String icon_img) {
            kotlin.jvm.internal.g0.p(icon_img, "icon_img");
            this.f80269g = icon_img;
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f80266d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a h(int i11) {
            this.f80267e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a i(int i11) {
            this.f80263a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a j(int i11) {
            this.f80265c = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80263a = null;
            this.f80264b = null;
            this.f80265c = null;
            this.f80266d = null;
            this.f80267e = null;
            this.f80268f = null;
            this.f80269g = null;
            this.f80270h = null;
            this.f80271i = null;
        }

        public a(@m80.k y source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80263a = Integer.valueOf(source.f80254a);
            this.f80264b = Integer.valueOf(source.f80255b);
            this.f80265c = Integer.valueOf(source.f80256c);
            this.f80266d = Integer.valueOf(source.f80257d);
            this.f80267e = Integer.valueOf(source.f80258e);
            this.f80268f = Long.valueOf(source.f80259f);
            this.f80269g = source.f80260g;
            this.f80270h = source.f80261h;
            this.f80271i = source.f80262i;
        }
    }
}
