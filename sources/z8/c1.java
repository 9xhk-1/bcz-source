package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c1 implements ts.e {

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final b f101216n = new b(null);

    /* renamed from: o, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<c1, a> f101217o = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101218a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101219b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101220c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101221d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101222e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f101223f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101224g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final q f101225h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101226i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101227j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    @w00.g
    public final k0 f101228k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101229l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    @w00.g
    public final a0 f101230m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<c1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.s8());
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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(Long.valueOf(protocol.T1()));
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.l(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.n(q.f101888i.read(protocol));
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
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.m(k0.f101704d.read(protocol));
                            break;
                        }
                    case 12:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
                            break;
                        }
                    case 13:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(a0.f101119d.read(protocol));
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
        public void write(@m80.k ws.i protocol, @m80.k c1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserBasicInfoV2");
            protocol.Q6("current_word_level_id", 1, (byte) 8);
            protocol.l5(struct.f101218a);
            protocol.N2();
            protocol.Q6("current_word_level_name", 2, (byte) 11);
            protocol.p1(struct.f101219b);
            protocol.N2();
            protocol.Q6("gender_id", 3, (byte) 8);
            protocol.l5(struct.f101220c);
            protocol.N2();
            protocol.Q6("nickname", 4, (byte) 11);
            protocol.p1(struct.f101221d);
            protocol.N2();
            if (struct.f101222e != null) {
                protocol.Q6(q9.h.f81940d, 5, (byte) 11);
                protocol.p1(struct.f101222e);
                protocol.N2();
            }
            if (struct.f101223f != null) {
                protocol.Q6("birthday", 6, (byte) 10);
                protocol.q7(struct.f101223f.longValue());
                protocol.N2();
            }
            if (struct.f101224g != null) {
                protocol.Q6("position", 7, (byte) 11);
                protocol.p1(struct.f101224g);
                protocol.N2();
            }
            if (struct.f101225h != null) {
                protocol.Q6("user_education_info", 8, (byte) 12);
                q.f101888i.write(protocol, struct.f101225h);
                protocol.N2();
            }
            if (struct.f101226i != null) {
                protocol.Q6("current_book_desc", 9, (byte) 11);
                protocol.p1(struct.f101226i);
                protocol.N2();
            }
            if (struct.f101227j != null) {
                protocol.Q6("current_book_desc_img", 10, (byte) 11);
                protocol.p1(struct.f101227j);
                protocol.N2();
            }
            if (struct.f101228k != null) {
                protocol.Q6("role", 11, (byte) 12);
                k0.f101704d.write(protocol, struct.f101228k);
                protocol.N2();
            }
            if (struct.f101229l != null) {
                protocol.Q6("ip_desc", 12, (byte) 11);
                protocol.p1(struct.f101229l);
                protocol.N2();
            }
            if (struct.f101230m != null) {
                protocol.Q6("member", 13, (byte) 12);
                a0.f101119d.write(protocol, struct.f101230m);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public c1(int i11, @m80.k String current_word_level_name, int i12, @m80.k String nickname, @m80.l String str, @m80.l Long l11, @m80.l String str2, @m80.l q qVar, @m80.l String str3, @m80.l String str4, @m80.l k0 k0Var, @m80.l String str5, @m80.l a0 a0Var) {
        kotlin.jvm.internal.g0.p(current_word_level_name, "current_word_level_name");
        kotlin.jvm.internal.g0.p(nickname, "nickname");
        this.f101218a = i11;
        this.f101219b = current_word_level_name;
        this.f101220c = i12;
        this.f101221d = nickname;
        this.f101222e = str;
        this.f101223f = l11;
        this.f101224g = str2;
        this.f101225h = qVar;
        this.f101226i = str3;
        this.f101227j = str4;
        this.f101228k = k0Var;
        this.f101229l = str5;
        this.f101230m = a0Var;
    }

    public static /* synthetic */ c1 o(c1 c1Var, int i11, String str, int i12, String str2, String str3, Long l11, String str4, q qVar, String str5, String str6, k0 k0Var, String str7, a0 a0Var, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = c1Var.f101218a;
        }
        return c1Var.n(i11, (i13 & 2) != 0 ? c1Var.f101219b : str, (i13 & 4) != 0 ? c1Var.f101220c : i12, (i13 & 8) != 0 ? c1Var.f101221d : str2, (i13 & 16) != 0 ? c1Var.f101222e : str3, (i13 & 32) != 0 ? c1Var.f101223f : l11, (i13 & 64) != 0 ? c1Var.f101224g : str4, (i13 & 128) != 0 ? c1Var.f101225h : qVar, (i13 & 256) != 0 ? c1Var.f101226i : str5, (i13 & 512) != 0 ? c1Var.f101227j : str6, (i13 & 1024) != 0 ? c1Var.f101228k : k0Var, (i13 & 2048) != 0 ? c1Var.f101229l : str7, (i13 & 4096) != 0 ? c1Var.f101230m : a0Var);
    }

    public final int a() {
        return this.f101218a;
    }

    @m80.l
    public final String b() {
        return this.f101227j;
    }

    @m80.l
    public final k0 c() {
        return this.f101228k;
    }

    @m80.l
    public final String d() {
        return this.f101229l;
    }

    @m80.l
    public final a0 e() {
        return this.f101230m;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f101218a == c1Var.f101218a && kotlin.jvm.internal.g0.g(this.f101219b, c1Var.f101219b) && this.f101220c == c1Var.f101220c && kotlin.jvm.internal.g0.g(this.f101221d, c1Var.f101221d) && kotlin.jvm.internal.g0.g(this.f101222e, c1Var.f101222e) && kotlin.jvm.internal.g0.g(this.f101223f, c1Var.f101223f) && kotlin.jvm.internal.g0.g(this.f101224g, c1Var.f101224g) && kotlin.jvm.internal.g0.g(this.f101225h, c1Var.f101225h) && kotlin.jvm.internal.g0.g(this.f101226i, c1Var.f101226i) && kotlin.jvm.internal.g0.g(this.f101227j, c1Var.f101227j) && kotlin.jvm.internal.g0.g(this.f101228k, c1Var.f101228k) && kotlin.jvm.internal.g0.g(this.f101229l, c1Var.f101229l) && kotlin.jvm.internal.g0.g(this.f101230m, c1Var.f101230m);
    }

    @m80.k
    public final String f() {
        return this.f101219b;
    }

    public final int g() {
        return this.f101220c;
    }

    @m80.k
    public final String h() {
        return this.f101221d;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f101218a) * 31) + this.f101219b.hashCode()) * 31) + Integer.hashCode(this.f101220c)) * 31) + this.f101221d.hashCode()) * 31;
        String str = this.f101222e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.f101223f;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.f101224g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        q qVar = this.f101225h;
        int hashCode5 = (hashCode4 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        String str3 = this.f101226i;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f101227j;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        k0 k0Var = this.f101228k;
        int hashCode8 = (hashCode7 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        String str5 = this.f101229l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        a0 a0Var = this.f101230m;
        return hashCode9 + (a0Var != null ? a0Var.hashCode() : 0);
    }

    @m80.l
    public final String i() {
        return this.f101222e;
    }

    @m80.l
    public final Long j() {
        return this.f101223f;
    }

    @m80.l
    public final String k() {
        return this.f101224g;
    }

    @m80.l
    public final q l() {
        return this.f101225h;
    }

    @m80.l
    public final String m() {
        return this.f101226i;
    }

    @m80.k
    public final c1 n(int i11, @m80.k String current_word_level_name, int i12, @m80.k String nickname, @m80.l String str, @m80.l Long l11, @m80.l String str2, @m80.l q qVar, @m80.l String str3, @m80.l String str4, @m80.l k0 k0Var, @m80.l String str5, @m80.l a0 a0Var) {
        kotlin.jvm.internal.g0.p(current_word_level_name, "current_word_level_name");
        kotlin.jvm.internal.g0.p(nickname, "nickname");
        return new c1(i11, current_word_level_name, i12, nickname, str, l11, str2, qVar, str3, str4, k0Var, str5, a0Var);
    }

    @m80.k
    public String toString() {
        return "UserBasicInfoV2(current_word_level_id=" + this.f101218a + ", current_word_level_name=" + this.f101219b + ", gender_id=" + this.f101220c + ", nickname=" + this.f101221d + ", avatar=" + this.f101222e + ", birthday=" + this.f101223f + ", position=" + this.f101224g + ", user_education_info=" + this.f101225h + ", current_book_desc=" + this.f101226i + ", current_book_desc_img=" + this.f101227j + ", role=" + this.f101228k + ", ip_desc=" + this.f101229l + ", member=" + this.f101230m + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101217o.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserBasicInfoV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBasicInfoV2.kt\ncom/baicizhan/biz/online/user_study_api/UserBasicInfoV2$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,438:1\n1#2:439\n*E\n"})
    public static final class a implements ts.f<c1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101231a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101232b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101233c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f101234d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f101235e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Long f101236f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f101237g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public q f101238h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public String f101239i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public String f101240j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public k0 f101241k;

        /* renamed from: l, reason: collision with root package name */
        @m80.l
        public String f101242l;

        /* renamed from: m, reason: collision with root package name */
        @m80.l
        public a0 f101243m;

        public a() {
            this.f101231a = null;
            this.f101232b = null;
            this.f101233c = null;
            this.f101234d = null;
            this.f101235e = null;
            this.f101236f = null;
            this.f101237g = null;
            this.f101238h = null;
            this.f101239i = null;
            this.f101240j = null;
            this.f101241k = null;
            this.f101242l = null;
            this.f101243m = null;
        }

        @m80.k
        public final a a(@m80.l String str) {
            this.f101235e = str;
            return this;
        }

        @m80.k
        public final a b(@m80.l Long l11) {
            this.f101236f = l11;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c1 build() {
            Integer num = this.f101231a;
            if (num == null) {
                throw new IllegalStateException("Required field 'current_word_level_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f101232b;
            if (str == null) {
                throw new IllegalStateException("Required field 'current_word_level_name' is missing");
            }
            Integer num2 = this.f101233c;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'gender_id' is missing");
            }
            int intValue2 = num2.intValue();
            String str2 = this.f101234d;
            if (str2 != null) {
                return new c1(intValue, str, intValue2, str2, this.f101235e, this.f101236f, this.f101237g, this.f101238h, this.f101239i, this.f101240j, this.f101241k, this.f101242l, this.f101243m);
            }
            throw new IllegalStateException("Required field 'nickname' is missing");
        }

        @m80.k
        public final a d(@m80.l String str) {
            this.f101239i = str;
            return this;
        }

        @m80.k
        public final a e(@m80.l String str) {
            this.f101240j = str;
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f101231a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(@m80.k String current_word_level_name) {
            kotlin.jvm.internal.g0.p(current_word_level_name, "current_word_level_name");
            this.f101232b = current_word_level_name;
            return this;
        }

        @m80.k
        public final a h(int i11) {
            this.f101233c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a i(@m80.l String str) {
            this.f101242l = str;
            return this;
        }

        @m80.k
        public final a j(@m80.l a0 a0Var) {
            this.f101243m = a0Var;
            return this;
        }

        @m80.k
        public final a k(@m80.k String nickname) {
            kotlin.jvm.internal.g0.p(nickname, "nickname");
            this.f101234d = nickname;
            return this;
        }

        @m80.k
        public final a l(@m80.l String str) {
            this.f101237g = str;
            return this;
        }

        @m80.k
        public final a m(@m80.l k0 k0Var) {
            this.f101241k = k0Var;
            return this;
        }

        @m80.k
        public final a n(@m80.l q qVar) {
            this.f101238h = qVar;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101231a = null;
            this.f101232b = null;
            this.f101233c = null;
            this.f101234d = null;
            this.f101235e = null;
            this.f101236f = null;
            this.f101237g = null;
            this.f101238h = null;
            this.f101239i = null;
            this.f101240j = null;
            this.f101241k = null;
            this.f101242l = null;
            this.f101243m = null;
        }

        public a(@m80.k c1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101231a = Integer.valueOf(source.f101218a);
            this.f101232b = source.f101219b;
            this.f101233c = Integer.valueOf(source.f101220c);
            this.f101234d = source.f101221d;
            this.f101235e = source.f101222e;
            this.f101236f = source.f101223f;
            this.f101237g = source.f101224g;
            this.f101238h = source.f101225h;
            this.f101239i = source.f101226i;
            this.f101240j = source.f101227j;
            this.f101241k = source.f101228k;
            this.f101242l = source.f101229l;
            this.f101243m = source.f101230m;
        }
    }
}
