package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class z0 implements ts.e {

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final b f102301p = new b(null);

    /* renamed from: q, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<z0, a> f102302q = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f102303a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102304b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102305c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f102306d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f102307e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102308f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f102309g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f102310h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f102311i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    @w00.g
    public final q f102312j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f102313k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f102314l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    @w00.g
    public final k0 f102315m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    @w00.g
    public final r f102316n;

    /* renamed from: o, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f102317o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<z0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.f(protocol.s8());
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
                            builder.p(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.l(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(Long.valueOf(protocol.T1()));
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.m(protocol.readString());
                            break;
                        }
                    case 10:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.o(q.f101888i.read(protocol));
                            break;
                        }
                    case 11:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 12:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 13:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.n(k0.f101704d.read(protocol));
                            break;
                        }
                    case 14:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(r.f101938g.read(protocol));
                            break;
                        }
                    case 15:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k z0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6(n7.f.f74611a);
            protocol.Q6("current_word_level_id", 1, (byte) 8);
            protocol.l5(struct.f102303a);
            protocol.N2();
            protocol.Q6("current_word_level_name", 2, (byte) 11);
            protocol.p1(struct.f102304b);
            protocol.N2();
            protocol.Q6("word_level_alias", 3, (byte) 11);
            protocol.p1(struct.f102305c);
            protocol.N2();
            protocol.Q6("is_try_user", 4, (byte) 8);
            protocol.l5(struct.f102306d);
            protocol.N2();
            protocol.Q6("gender_id", 5, (byte) 8);
            protocol.l5(struct.f102307e);
            protocol.N2();
            protocol.Q6("nickname", 6, (byte) 11);
            protocol.p1(struct.f102308f);
            protocol.N2();
            if (struct.f102309g != null) {
                protocol.Q6(q9.h.f81940d, 7, (byte) 11);
                protocol.p1(struct.f102309g);
                protocol.N2();
            }
            if (struct.f102310h != null) {
                protocol.Q6("birthday", 8, (byte) 10);
                protocol.q7(struct.f102310h.longValue());
                protocol.N2();
            }
            if (struct.f102311i != null) {
                protocol.Q6("position", 9, (byte) 11);
                protocol.p1(struct.f102311i);
                protocol.N2();
            }
            if (struct.f102312j != null) {
                protocol.Q6("user_education_info", 10, (byte) 12);
                q.f101888i.write(protocol, struct.f102312j);
                protocol.N2();
            }
            if (struct.f102313k != null) {
                protocol.Q6("current_book_desc", 11, (byte) 11);
                protocol.p1(struct.f102313k);
                protocol.N2();
            }
            if (struct.f102314l != null) {
                protocol.Q6("current_book_desc_img", 12, (byte) 11);
                protocol.p1(struct.f102314l);
                protocol.N2();
            }
            if (struct.f102315m != null) {
                protocol.Q6("role", 13, (byte) 12);
                k0.f101704d.write(protocol, struct.f102315m);
                protocol.N2();
            }
            if (struct.f102316n != null) {
                protocol.Q6("examPreparation", 14, (byte) 12);
                r.f101938g.write(protocol, struct.f102316n);
                protocol.N2();
            }
            if (struct.f102317o != null) {
                protocol.Q6("ip_desc", 15, (byte) 11);
                protocol.p1(struct.f102317o);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public z0(int i11, @m80.k String current_word_level_name, @m80.k String word_level_alias, int i12, int i13, @m80.k String nickname, @m80.l String str, @m80.l Long l11, @m80.l String str2, @m80.l q qVar, @m80.l String str3, @m80.l String str4, @m80.l k0 k0Var, @m80.l r rVar, @m80.l String str5) {
        kotlin.jvm.internal.g0.p(current_word_level_name, "current_word_level_name");
        kotlin.jvm.internal.g0.p(word_level_alias, "word_level_alias");
        kotlin.jvm.internal.g0.p(nickname, "nickname");
        this.f102303a = i11;
        this.f102304b = current_word_level_name;
        this.f102305c = word_level_alias;
        this.f102306d = i12;
        this.f102307e = i13;
        this.f102308f = nickname;
        this.f102309g = str;
        this.f102310h = l11;
        this.f102311i = str2;
        this.f102312j = qVar;
        this.f102313k = str3;
        this.f102314l = str4;
        this.f102315m = k0Var;
        this.f102316n = rVar;
        this.f102317o = str5;
    }

    public final int a() {
        return this.f102303a;
    }

    @m80.l
    public final q b() {
        return this.f102312j;
    }

    @m80.l
    public final String c() {
        return this.f102313k;
    }

    @m80.l
    public final String d() {
        return this.f102314l;
    }

    @m80.l
    public final k0 e() {
        return this.f102315m;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f102303a == z0Var.f102303a && kotlin.jvm.internal.g0.g(this.f102304b, z0Var.f102304b) && kotlin.jvm.internal.g0.g(this.f102305c, z0Var.f102305c) && this.f102306d == z0Var.f102306d && this.f102307e == z0Var.f102307e && kotlin.jvm.internal.g0.g(this.f102308f, z0Var.f102308f) && kotlin.jvm.internal.g0.g(this.f102309g, z0Var.f102309g) && kotlin.jvm.internal.g0.g(this.f102310h, z0Var.f102310h) && kotlin.jvm.internal.g0.g(this.f102311i, z0Var.f102311i) && kotlin.jvm.internal.g0.g(this.f102312j, z0Var.f102312j) && kotlin.jvm.internal.g0.g(this.f102313k, z0Var.f102313k) && kotlin.jvm.internal.g0.g(this.f102314l, z0Var.f102314l) && kotlin.jvm.internal.g0.g(this.f102315m, z0Var.f102315m) && kotlin.jvm.internal.g0.g(this.f102316n, z0Var.f102316n) && kotlin.jvm.internal.g0.g(this.f102317o, z0Var.f102317o);
    }

    @m80.l
    public final r f() {
        return this.f102316n;
    }

    @m80.l
    public final String g() {
        return this.f102317o;
    }

    @m80.k
    public final String h() {
        return this.f102304b;
    }

    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(this.f102303a) * 31) + this.f102304b.hashCode()) * 31) + this.f102305c.hashCode()) * 31) + Integer.hashCode(this.f102306d)) * 31) + Integer.hashCode(this.f102307e)) * 31) + this.f102308f.hashCode()) * 31;
        String str = this.f102309g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.f102310h;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.f102311i;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        q qVar = this.f102312j;
        int hashCode5 = (hashCode4 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        String str3 = this.f102313k;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f102314l;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        k0 k0Var = this.f102315m;
        int hashCode8 = (hashCode7 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        r rVar = this.f102316n;
        int hashCode9 = (hashCode8 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        String str5 = this.f102317o;
        return hashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    @m80.k
    public final String i() {
        return this.f102305c;
    }

    public final int j() {
        return this.f102306d;
    }

    public final int k() {
        return this.f102307e;
    }

    @m80.k
    public final String l() {
        return this.f102308f;
    }

    @m80.l
    public final String m() {
        return this.f102309g;
    }

    @m80.l
    public final Long n() {
        return this.f102310h;
    }

    @m80.l
    public final String o() {
        return this.f102311i;
    }

    @m80.k
    public final z0 p(int i11, @m80.k String current_word_level_name, @m80.k String word_level_alias, int i12, int i13, @m80.k String nickname, @m80.l String str, @m80.l Long l11, @m80.l String str2, @m80.l q qVar, @m80.l String str3, @m80.l String str4, @m80.l k0 k0Var, @m80.l r rVar, @m80.l String str5) {
        kotlin.jvm.internal.g0.p(current_word_level_name, "current_word_level_name");
        kotlin.jvm.internal.g0.p(word_level_alias, "word_level_alias");
        kotlin.jvm.internal.g0.p(nickname, "nickname");
        return new z0(i11, current_word_level_name, word_level_alias, i12, i13, nickname, str, l11, str2, qVar, str3, str4, k0Var, rVar, str5);
    }

    @m80.k
    public String toString() {
        return "UserBasicInfo(current_word_level_id=" + this.f102303a + ", current_word_level_name=" + this.f102304b + ", word_level_alias=" + this.f102305c + ", is_try_user=" + this.f102306d + ", gender_id=" + this.f102307e + ", nickname=" + this.f102308f + ", avatar=" + this.f102309g + ", birthday=" + this.f102310h + ", position=" + this.f102311i + ", user_education_info=" + this.f102312j + ", current_book_desc=" + this.f102313k + ", current_book_desc_img=" + this.f102314l + ", role=" + this.f102315m + ", examPreparation=" + this.f102316n + ", ip_desc=" + this.f102317o + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102302q.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserBasicInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBasicInfo.kt\ncom/baicizhan/biz/online/user_study_api/UserBasicInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,497:1\n1#2:498\n*E\n"})
    public static final class a implements ts.f<z0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f102318a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f102319b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f102320c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f102321d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f102322e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f102323f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f102324g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Long f102325h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public String f102326i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public q f102327j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public String f102328k;

        /* renamed from: l, reason: collision with root package name */
        @m80.l
        public String f102329l;

        /* renamed from: m, reason: collision with root package name */
        @m80.l
        public k0 f102330m;

        /* renamed from: n, reason: collision with root package name */
        @m80.l
        public r f102331n;

        /* renamed from: o, reason: collision with root package name */
        @m80.l
        public String f102332o;

        public a() {
            this.f102318a = null;
            this.f102319b = null;
            this.f102320c = null;
            this.f102321d = null;
            this.f102322e = null;
            this.f102323f = null;
            this.f102324g = null;
            this.f102325h = null;
            this.f102326i = null;
            this.f102327j = null;
            this.f102328k = null;
            this.f102329l = null;
            this.f102330m = null;
            this.f102331n = null;
            this.f102332o = null;
        }

        @m80.k
        public final a a(@m80.l String str) {
            this.f102324g = str;
            return this;
        }

        @m80.k
        public final a b(@m80.l Long l11) {
            this.f102325h = l11;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public z0 build() {
            Integer num = this.f102318a;
            if (num == null) {
                throw new IllegalStateException("Required field 'current_word_level_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f102319b;
            if (str == null) {
                throw new IllegalStateException("Required field 'current_word_level_name' is missing");
            }
            String str2 = this.f102320c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'word_level_alias' is missing");
            }
            Integer num2 = this.f102321d;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'is_try_user' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f102322e;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'gender_id' is missing");
            }
            int intValue3 = num3.intValue();
            String str3 = this.f102323f;
            if (str3 != null) {
                return new z0(intValue, str, str2, intValue2, intValue3, str3, this.f102324g, this.f102325h, this.f102326i, this.f102327j, this.f102328k, this.f102329l, this.f102330m, this.f102331n, this.f102332o);
            }
            throw new IllegalStateException("Required field 'nickname' is missing");
        }

        @m80.k
        public final a d(@m80.l String str) {
            this.f102328k = str;
            return this;
        }

        @m80.k
        public final a e(@m80.l String str) {
            this.f102329l = str;
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f102318a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(@m80.k String current_word_level_name) {
            kotlin.jvm.internal.g0.p(current_word_level_name, "current_word_level_name");
            this.f102319b = current_word_level_name;
            return this;
        }

        @m80.k
        public final a h(@m80.l r rVar) {
            this.f102331n = rVar;
            return this;
        }

        @m80.k
        public final a i(int i11) {
            this.f102322e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a j(@m80.l String str) {
            this.f102332o = str;
            return this;
        }

        @m80.k
        public final a k(int i11) {
            this.f102321d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a l(@m80.k String nickname) {
            kotlin.jvm.internal.g0.p(nickname, "nickname");
            this.f102323f = nickname;
            return this;
        }

        @m80.k
        public final a m(@m80.l String str) {
            this.f102326i = str;
            return this;
        }

        @m80.k
        public final a n(@m80.l k0 k0Var) {
            this.f102330m = k0Var;
            return this;
        }

        @m80.k
        public final a o(@m80.l q qVar) {
            this.f102327j = qVar;
            return this;
        }

        @m80.k
        public final a p(@m80.k String word_level_alias) {
            kotlin.jvm.internal.g0.p(word_level_alias, "word_level_alias");
            this.f102320c = word_level_alias;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102318a = null;
            this.f102319b = null;
            this.f102320c = null;
            this.f102321d = null;
            this.f102322e = null;
            this.f102323f = null;
            this.f102324g = null;
            this.f102325h = null;
            this.f102326i = null;
            this.f102327j = null;
            this.f102328k = null;
            this.f102329l = null;
            this.f102330m = null;
            this.f102331n = null;
            this.f102332o = null;
        }

        public a(@m80.k z0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102318a = Integer.valueOf(source.f102303a);
            this.f102319b = source.f102304b;
            this.f102320c = source.f102305c;
            this.f102321d = Integer.valueOf(source.f102306d);
            this.f102322e = Integer.valueOf(source.f102307e);
            this.f102323f = source.f102308f;
            this.f102324g = source.f102309g;
            this.f102325h = source.f102310h;
            this.f102326i = source.f102311i;
            this.f102327j = source.f102312j;
            this.f102328k = source.f102313k;
            this.f102329l = source.f102314l;
            this.f102330m = source.f102315m;
            this.f102331n = source.f102316n;
            this.f102332o = source.f102317o;
        }
    }
}
