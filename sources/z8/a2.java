package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a2 implements ts.e {

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final b f101134o = new b(null);

    /* renamed from: p, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<a2, a> f101135p = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101136a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f101137b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101138c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final long f101139d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final long f101140e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final long f101141f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101142g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101143h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f101144i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101145j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101146k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    @w00.g
    public final r f101147l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101148m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101149n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<a2, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a2 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a2 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.a(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.n(Long.valueOf(protocol.T1()));
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
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.T1());
                            break;
                        }
                    case 5:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.m(protocol.T1());
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.o(protocol.T1());
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 9:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(Long.valueOf(protocol.T1()));
                            break;
                        }
                    case 10:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 11:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.l(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 12:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(r.f101938g.read(protocol));
                            break;
                        }
                    case 13:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
                            break;
                        }
                    case 14:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k a2 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserSelectedBookInfo");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(struct.f101136a);
            protocol.N2();
            if (struct.f101137b != null) {
                protocol.Q6("selected_end_time", 2, (byte) 10);
                protocol.q7(struct.f101137b.longValue());
                protocol.N2();
            }
            protocol.Q6("learned_words_count", 3, (byte) 8);
            protocol.l5(struct.f101138c);
            protocol.N2();
            protocol.Q6("last_touch_at", 4, (byte) 10);
            protocol.q7(struct.f101139d);
            protocol.N2();
            protocol.Q6("roadmap_version", 5, (byte) 10);
            protocol.q7(struct.f101140e);
            protocol.N2();
            protocol.Q6("word_fm_updated_at", 6, (byte) 10);
            protocol.q7(struct.f101141f);
            protocol.N2();
            if (struct.f101142g != null) {
                protocol.Q6("group_id", 7, (byte) 8);
                protocol.l5(struct.f101142g.intValue());
                protocol.N2();
            }
            if (struct.f101143h != null) {
                protocol.Q6("daily_plan_count", 8, (byte) 8);
                protocol.l5(struct.f101143h.intValue());
                protocol.N2();
            }
            if (struct.f101144i != null) {
                protocol.Q6("poster_updated_at", 9, (byte) 10);
                protocol.q7(struct.f101144i.longValue());
                protocol.N2();
            }
            if (struct.f101145j != null) {
                protocol.Q6("need_merge_count", 10, (byte) 8);
                protocol.l5(struct.f101145j.intValue());
                protocol.N2();
            }
            if (struct.f101146k != null) {
                protocol.Q6("review_plan_count", 11, (byte) 8);
                protocol.l5(struct.f101146k.intValue());
                protocol.N2();
            }
            if (struct.f101147l != null) {
                protocol.Q6("examPreparation", 12, (byte) 12);
                r.f101938g.write(protocol, struct.f101147l);
                protocol.N2();
            }
            if (struct.f101148m != null) {
                protocol.Q6("mode_switch_url", 13, (byte) 11);
                protocol.p1(struct.f101148m);
                protocol.N2();
            }
            if (struct.f101149n != null) {
                protocol.Q6("game_mode", 14, (byte) 8);
                protocol.l5(struct.f101149n.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public a2(int i11, @m80.l Long l11, int i12, long j11, long j12, long j13, @m80.l Integer num, @m80.l Integer num2, @m80.l Long l12, @m80.l Integer num3, @m80.l Integer num4, @m80.l r rVar, @m80.l String str, @m80.l Integer num5) {
        this.f101136a = i11;
        this.f101137b = l11;
        this.f101138c = i12;
        this.f101139d = j11;
        this.f101140e = j12;
        this.f101141f = j13;
        this.f101142g = num;
        this.f101143h = num2;
        this.f101144i = l12;
        this.f101145j = num3;
        this.f101146k = num4;
        this.f101147l = rVar;
        this.f101148m = str;
        this.f101149n = num5;
    }

    public final int a() {
        return this.f101136a;
    }

    @m80.l
    public final Integer b() {
        return this.f101145j;
    }

    @m80.l
    public final Integer c() {
        return this.f101146k;
    }

    @m80.l
    public final r d() {
        return this.f101147l;
    }

    @m80.l
    public final String e() {
        return this.f101148m;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return this.f101136a == a2Var.f101136a && kotlin.jvm.internal.g0.g(this.f101137b, a2Var.f101137b) && this.f101138c == a2Var.f101138c && this.f101139d == a2Var.f101139d && this.f101140e == a2Var.f101140e && this.f101141f == a2Var.f101141f && kotlin.jvm.internal.g0.g(this.f101142g, a2Var.f101142g) && kotlin.jvm.internal.g0.g(this.f101143h, a2Var.f101143h) && kotlin.jvm.internal.g0.g(this.f101144i, a2Var.f101144i) && kotlin.jvm.internal.g0.g(this.f101145j, a2Var.f101145j) && kotlin.jvm.internal.g0.g(this.f101146k, a2Var.f101146k) && kotlin.jvm.internal.g0.g(this.f101147l, a2Var.f101147l) && kotlin.jvm.internal.g0.g(this.f101148m, a2Var.f101148m) && kotlin.jvm.internal.g0.g(this.f101149n, a2Var.f101149n);
    }

    @m80.l
    public final Integer f() {
        return this.f101149n;
    }

    @m80.l
    public final Long g() {
        return this.f101137b;
    }

    public final int h() {
        return this.f101138c;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f101136a) * 31;
        Long l11 = this.f101137b;
        int hashCode2 = (((((((((hashCode + (l11 == null ? 0 : l11.hashCode())) * 31) + Integer.hashCode(this.f101138c)) * 31) + Long.hashCode(this.f101139d)) * 31) + Long.hashCode(this.f101140e)) * 31) + Long.hashCode(this.f101141f)) * 31;
        Integer num = this.f101142g;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f101143h;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l12 = this.f101144i;
        int hashCode5 = (hashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num3 = this.f101145j;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f101146k;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        r rVar = this.f101147l;
        int hashCode8 = (hashCode7 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        String str = this.f101148m;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num5 = this.f101149n;
        return hashCode9 + (num5 != null ? num5.hashCode() : 0);
    }

    public final long i() {
        return this.f101139d;
    }

    public final long j() {
        return this.f101140e;
    }

    public final long k() {
        return this.f101141f;
    }

    @m80.l
    public final Integer l() {
        return this.f101142g;
    }

    @m80.l
    public final Integer m() {
        return this.f101143h;
    }

    @m80.l
    public final Long n() {
        return this.f101144i;
    }

    @m80.k
    public final a2 o(int i11, @m80.l Long l11, int i12, long j11, long j12, long j13, @m80.l Integer num, @m80.l Integer num2, @m80.l Long l12, @m80.l Integer num3, @m80.l Integer num4, @m80.l r rVar, @m80.l String str, @m80.l Integer num5) {
        return new a2(i11, l11, i12, j11, j12, j13, num, num2, l12, num3, num4, rVar, str, num5);
    }

    @m80.k
    public String toString() {
        return "UserSelectedBookInfo(book_id=" + this.f101136a + ", selected_end_time=" + this.f101137b + ", learned_words_count=" + this.f101138c + ", last_touch_at=" + this.f101139d + ", roadmap_version=" + this.f101140e + ", word_fm_updated_at=" + this.f101141f + ", group_id=" + this.f101142g + ", daily_plan_count=" + this.f101143h + ", poster_updated_at=" + this.f101144i + ", need_merge_count=" + this.f101145j + ", review_plan_count=" + this.f101146k + ", examPreparation=" + this.f101147l + ", mode_switch_url=" + this.f101148m + ", game_mode=" + this.f101149n + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101135p.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserSelectedBookInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserSelectedBookInfo.kt\ncom/baicizhan/biz/online/user_study_api/UserSelectedBookInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,485:1\n1#2:486\n*E\n"})
    public static final class a implements ts.f<a2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101150a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Long f101151b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101152c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Long f101153d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Long f101154e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Long f101155f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f101156g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Integer f101157h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public Long f101158i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public Integer f101159j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public Integer f101160k;

        /* renamed from: l, reason: collision with root package name */
        @m80.l
        public r f101161l;

        /* renamed from: m, reason: collision with root package name */
        @m80.l
        public String f101162m;

        /* renamed from: n, reason: collision with root package name */
        @m80.l
        public Integer f101163n;

        public a() {
            this.f101150a = null;
            this.f101151b = null;
            this.f101152c = null;
            this.f101153d = null;
            this.f101154e = null;
            this.f101155f = null;
            this.f101156g = null;
            this.f101157h = null;
            this.f101158i = null;
            this.f101159j = null;
            this.f101160k = null;
            this.f101161l = null;
            this.f101162m = null;
            this.f101163n = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f101150a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a2 build() {
            Integer num = this.f101150a;
            if (num == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue = num.intValue();
            Long l11 = this.f101151b;
            Integer num2 = this.f101152c;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'learned_words_count' is missing");
            }
            int intValue2 = num2.intValue();
            Long l12 = this.f101153d;
            if (l12 == null) {
                throw new IllegalStateException("Required field 'last_touch_at' is missing");
            }
            long longValue = l12.longValue();
            Long l13 = this.f101154e;
            if (l13 == null) {
                throw new IllegalStateException("Required field 'roadmap_version' is missing");
            }
            long longValue2 = l13.longValue();
            Long l14 = this.f101155f;
            if (l14 != null) {
                return new a2(intValue, l11, intValue2, longValue, longValue2, l14.longValue(), this.f101156g, this.f101157h, this.f101158i, this.f101159j, this.f101160k, this.f101161l, this.f101162m, this.f101163n);
            }
            throw new IllegalStateException("Required field 'word_fm_updated_at' is missing");
        }

        @m80.k
        public final a c(@m80.l Integer num) {
            this.f101157h = num;
            return this;
        }

        @m80.k
        public final a d(@m80.l r rVar) {
            this.f101161l = rVar;
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f101163n = num;
            return this;
        }

        @m80.k
        public final a f(@m80.l Integer num) {
            this.f101156g = num;
            return this;
        }

        @m80.k
        public final a g(long j11) {
            this.f101153d = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a h(int i11) {
            this.f101152c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a i(@m80.l String str) {
            this.f101162m = str;
            return this;
        }

        @m80.k
        public final a j(@m80.l Integer num) {
            this.f101159j = num;
            return this;
        }

        @m80.k
        public final a k(@m80.l Long l11) {
            this.f101158i = l11;
            return this;
        }

        @m80.k
        public final a l(@m80.l Integer num) {
            this.f101160k = num;
            return this;
        }

        @m80.k
        public final a m(long j11) {
            this.f101154e = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a n(@m80.l Long l11) {
            this.f101151b = l11;
            return this;
        }

        @m80.k
        public final a o(long j11) {
            this.f101155f = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101150a = null;
            this.f101151b = null;
            this.f101152c = null;
            this.f101153d = null;
            this.f101154e = null;
            this.f101155f = null;
            this.f101156g = null;
            this.f101157h = null;
            this.f101158i = null;
            this.f101159j = null;
            this.f101160k = null;
            this.f101161l = null;
            this.f101162m = null;
            this.f101163n = null;
        }

        public a(@m80.k a2 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101150a = Integer.valueOf(source.f101136a);
            this.f101151b = source.f101137b;
            this.f101152c = Integer.valueOf(source.f101138c);
            this.f101153d = Long.valueOf(source.f101139d);
            this.f101154e = Long.valueOf(source.f101140e);
            this.f101155f = Long.valueOf(source.f101141f);
            this.f101156g = source.f101142g;
            this.f101157h = source.f101143h;
            this.f101158i = source.f101144i;
            this.f101159j = source.f101145j;
            this.f101160k = source.f101146k;
            this.f101161l = source.f101147l;
            this.f101162m = source.f101148m;
            this.f101163n = source.f101149n;
        }
    }
}
