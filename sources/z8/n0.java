package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class n0 implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final b f101789i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<n0, a> f101790j = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101791a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101792b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101793c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101794d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101795e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101796f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101797g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101798h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<n0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.b(protocol.s8());
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
                            builder.f(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k n0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("SelectBookPlanInfo");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(struct.f101791a);
            protocol.N2();
            protocol.Q6("learned_words_count", 2, (byte) 8);
            protocol.l5(struct.f101792b);
            protocol.N2();
            if (struct.f101793c != null) {
                protocol.Q6("group_id", 3, (byte) 8);
                protocol.l5(struct.f101793c.intValue());
                protocol.N2();
            }
            if (struct.f101794d != null) {
                protocol.Q6("daily_plan_count", 4, (byte) 8);
                protocol.l5(struct.f101794d.intValue());
                protocol.N2();
            }
            if (struct.f101795e != null) {
                protocol.Q6("review_plan_count", 5, (byte) 8);
                protocol.l5(struct.f101795e.intValue());
                protocol.N2();
            }
            if (struct.f101796f != null) {
                protocol.Q6("mastered", 6, (byte) 8);
                protocol.l5(struct.f101796f.intValue());
                protocol.N2();
            }
            if (struct.f101797g != null) {
                protocol.Q6("book_group", 7, (byte) 8);
                protocol.l5(struct.f101797g.intValue());
                protocol.N2();
            }
            if (struct.f101798h != null) {
                protocol.Q6("count_per_round", 8, (byte) 8);
                protocol.l5(struct.f101798h.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public n0(int i11, int i12, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l Integer num4, @m80.l Integer num5, @m80.l Integer num6) {
        this.f101791a = i11;
        this.f101792b = i12;
        this.f101793c = num;
        this.f101794d = num2;
        this.f101795e = num3;
        this.f101796f = num4;
        this.f101797g = num5;
        this.f101798h = num6;
    }

    public static /* synthetic */ n0 j(n0 n0Var, int i11, int i12, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = n0Var.f101791a;
        }
        if ((i13 & 2) != 0) {
            i12 = n0Var.f101792b;
        }
        if ((i13 & 4) != 0) {
            num = n0Var.f101793c;
        }
        if ((i13 & 8) != 0) {
            num2 = n0Var.f101794d;
        }
        if ((i13 & 16) != 0) {
            num3 = n0Var.f101795e;
        }
        if ((i13 & 32) != 0) {
            num4 = n0Var.f101796f;
        }
        if ((i13 & 64) != 0) {
            num5 = n0Var.f101797g;
        }
        if ((i13 & 128) != 0) {
            num6 = n0Var.f101798h;
        }
        Integer num7 = num5;
        Integer num8 = num6;
        Integer num9 = num3;
        Integer num10 = num4;
        return n0Var.i(i11, i12, num, num2, num9, num10, num7, num8);
    }

    public final int a() {
        return this.f101791a;
    }

    public final int b() {
        return this.f101792b;
    }

    @m80.l
    public final Integer c() {
        return this.f101793c;
    }

    @m80.l
    public final Integer d() {
        return this.f101794d;
    }

    @m80.l
    public final Integer e() {
        return this.f101795e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f101791a == n0Var.f101791a && this.f101792b == n0Var.f101792b && kotlin.jvm.internal.g0.g(this.f101793c, n0Var.f101793c) && kotlin.jvm.internal.g0.g(this.f101794d, n0Var.f101794d) && kotlin.jvm.internal.g0.g(this.f101795e, n0Var.f101795e) && kotlin.jvm.internal.g0.g(this.f101796f, n0Var.f101796f) && kotlin.jvm.internal.g0.g(this.f101797g, n0Var.f101797g) && kotlin.jvm.internal.g0.g(this.f101798h, n0Var.f101798h);
    }

    @m80.l
    public final Integer f() {
        return this.f101796f;
    }

    @m80.l
    public final Integer g() {
        return this.f101797g;
    }

    @m80.l
    public final Integer h() {
        return this.f101798h;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f101791a) * 31) + Integer.hashCode(this.f101792b)) * 31;
        Integer num = this.f101793c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f101794d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f101795e;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f101796f;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f101797g;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f101798h;
        return hashCode6 + (num6 != null ? num6.hashCode() : 0);
    }

    @m80.k
    public final n0 i(int i11, int i12, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l Integer num4, @m80.l Integer num5, @m80.l Integer num6) {
        return new n0(i11, i12, num, num2, num3, num4, num5, num6);
    }

    @m80.k
    public String toString() {
        return "SelectBookPlanInfo(book_id=" + this.f101791a + ", learned_words_count=" + this.f101792b + ", group_id=" + this.f101793c + ", daily_plan_count=" + this.f101794d + ", review_plan_count=" + this.f101795e + ", mastered=" + this.f101796f + ", book_group=" + this.f101797g + ", count_per_round=" + this.f101798h + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101790j.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSelectBookPlanInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectBookPlanInfo.kt\ncom/baicizhan/biz/online/user_study_api/SelectBookPlanInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n1#2:292\n*E\n"})
    public static final class a implements ts.f<n0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101799a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101800b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101801c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f101802d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f101803e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f101804f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f101805g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Integer f101806h;

        public a() {
            this.f101799a = null;
            this.f101800b = null;
            this.f101801c = null;
            this.f101802d = null;
            this.f101803e = null;
            this.f101804f = null;
            this.f101805g = null;
            this.f101806h = null;
        }

        @m80.k
        public final a a(@m80.l Integer num) {
            this.f101805g = num;
            return this;
        }

        @m80.k
        public final a b(int i11) {
            this.f101799a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public n0 build() {
            Integer num = this.f101799a;
            if (num == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101800b;
            if (num2 != null) {
                return new n0(intValue, num2.intValue(), this.f101801c, this.f101802d, this.f101803e, this.f101804f, this.f101805g, this.f101806h);
            }
            throw new IllegalStateException("Required field 'learned_words_count' is missing");
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f101806h = num;
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f101802d = num;
            return this;
        }

        @m80.k
        public final a f(@m80.l Integer num) {
            this.f101801c = num;
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f101800b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a h(@m80.l Integer num) {
            this.f101804f = num;
            return this;
        }

        @m80.k
        public final a i(@m80.l Integer num) {
            this.f101803e = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101799a = null;
            this.f101800b = null;
            this.f101801c = null;
            this.f101802d = null;
            this.f101803e = null;
            this.f101804f = null;
            this.f101805g = null;
            this.f101806h = null;
        }

        public a(@m80.k n0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101799a = Integer.valueOf(source.f101791a);
            this.f101800b = Integer.valueOf(source.f101792b);
            this.f101801c = source.f101793c;
            this.f101802d = source.f101794d;
            this.f101803e = source.f101795e;
            this.f101804f = source.f101796f;
            this.f101805g = source.f101797g;
            this.f101806h = source.f101798h;
        }
    }
}
