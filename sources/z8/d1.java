package z8;

import com.baicizhan.client.business.dataset.provider.a;
import com.tencent.open.SocialConstants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d1 implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final b f101427i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<d1, a> f101428j = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101429a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101430b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101431c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Boolean f101432d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101433e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101434f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101435g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101436h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<d1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.e(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
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
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(Boolean.valueOf(protocol.readBool()));
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(Integer.valueOf(protocol.s8()));
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
                            builder.c(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k d1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserBookBasicInfo");
            protocol.Q6("id", 1, (byte) 8);
            protocol.l5(struct.f101429a);
            protocol.N2();
            protocol.Q6("name", 2, (byte) 11);
            protocol.p1(struct.f101430b);
            protocol.N2();
            protocol.Q6("total_words_count", 3, (byte) 8);
            protocol.l5(struct.f101431c);
            protocol.N2();
            if (struct.f101432d != null) {
                protocol.Q6("is_word_course", 4, (byte) 2);
                protocol.a4(struct.f101432d.booleanValue());
                protocol.N2();
            }
            if (struct.f101433e != null) {
                protocol.Q6("group_count", 5, (byte) 8);
                protocol.l5(struct.f101433e.intValue());
                protocol.N2();
            }
            if (struct.f101434f != null) {
                protocol.Q6(a.z.C0267a.f16364o, 6, (byte) 8);
                protocol.l5(struct.f101434f.intValue());
                protocol.N2();
            }
            if (struct.f101435g != null) {
                protocol.Q6(SocialConstants.PARAM_IMG_URL, 7, (byte) 11);
                protocol.p1(struct.f101435g);
                protocol.N2();
            }
            if (struct.f101436h != null) {
                protocol.Q6(SocialConstants.PARAM_APP_DESC, 8, (byte) 11);
                protocol.p1(struct.f101436h);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public d1(int i11, @m80.k String name, int i12, @m80.l Boolean bool, @m80.l Integer num, @m80.l Integer num2, @m80.l String str, @m80.l String str2) {
        kotlin.jvm.internal.g0.p(name, "name");
        this.f101429a = i11;
        this.f101430b = name;
        this.f101431c = i12;
        this.f101432d = bool;
        this.f101433e = num;
        this.f101434f = num2;
        this.f101435g = str;
        this.f101436h = str2;
    }

    public static /* synthetic */ d1 j(d1 d1Var, int i11, String str, int i12, Boolean bool, Integer num, Integer num2, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = d1Var.f101429a;
        }
        if ((i13 & 2) != 0) {
            str = d1Var.f101430b;
        }
        if ((i13 & 4) != 0) {
            i12 = d1Var.f101431c;
        }
        if ((i13 & 8) != 0) {
            bool = d1Var.f101432d;
        }
        if ((i13 & 16) != 0) {
            num = d1Var.f101433e;
        }
        if ((i13 & 32) != 0) {
            num2 = d1Var.f101434f;
        }
        if ((i13 & 64) != 0) {
            str2 = d1Var.f101435g;
        }
        if ((i13 & 128) != 0) {
            str3 = d1Var.f101436h;
        }
        String str4 = str2;
        String str5 = str3;
        Integer num3 = num;
        Integer num4 = num2;
        return d1Var.i(i11, str, i12, bool, num3, num4, str4, str5);
    }

    public final int a() {
        return this.f101429a;
    }

    @m80.k
    public final String b() {
        return this.f101430b;
    }

    public final int c() {
        return this.f101431c;
    }

    @m80.l
    public final Boolean d() {
        return this.f101432d;
    }

    @m80.l
    public final Integer e() {
        return this.f101433e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.f101429a == d1Var.f101429a && kotlin.jvm.internal.g0.g(this.f101430b, d1Var.f101430b) && this.f101431c == d1Var.f101431c && kotlin.jvm.internal.g0.g(this.f101432d, d1Var.f101432d) && kotlin.jvm.internal.g0.g(this.f101433e, d1Var.f101433e) && kotlin.jvm.internal.g0.g(this.f101434f, d1Var.f101434f) && kotlin.jvm.internal.g0.g(this.f101435g, d1Var.f101435g) && kotlin.jvm.internal.g0.g(this.f101436h, d1Var.f101436h);
    }

    @m80.l
    public final Integer f() {
        return this.f101434f;
    }

    @m80.l
    public final String g() {
        return this.f101435g;
    }

    @m80.l
    public final String h() {
        return this.f101436h;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f101429a) * 31) + this.f101430b.hashCode()) * 31) + Integer.hashCode(this.f101431c)) * 31;
        Boolean bool = this.f101432d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f101433e;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f101434f;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f101435g;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f101436h;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.k
    public final d1 i(int i11, @m80.k String name, int i12, @m80.l Boolean bool, @m80.l Integer num, @m80.l Integer num2, @m80.l String str, @m80.l String str2) {
        kotlin.jvm.internal.g0.p(name, "name");
        return new d1(i11, name, i12, bool, num, num2, str, str2);
    }

    @m80.k
    public String toString() {
        return "UserBookBasicInfo(id=" + this.f101429a + ", name=" + this.f101430b + ", total_words_count=" + this.f101431c + ", is_word_course=" + this.f101432d + ", group_count=" + this.f101433e + ", book_flag=" + this.f101434f + ", img=" + this.f101435g + ", desc=" + this.f101436h + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101428j.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserBookBasicInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBookBasicInfo.kt\ncom/baicizhan/biz/online/user_study_api/UserBookBasicInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n1#2:305\n*E\n"})
    public static final class a implements ts.f<d1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101437a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101438b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101439c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Boolean f101440d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f101441e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f101442f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f101443g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f101444h;

        public a() {
            this.f101437a = null;
            this.f101438b = null;
            this.f101439c = null;
            this.f101440d = null;
            this.f101441e = null;
            this.f101442f = null;
            this.f101443g = null;
            this.f101444h = null;
        }

        @m80.k
        public final a a(@m80.l Integer num) {
            this.f101442f = num;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d1 build() {
            Integer num = this.f101437a;
            if (num == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f101438b;
            if (str == null) {
                throw new IllegalStateException("Required field 'name' is missing");
            }
            Integer num2 = this.f101439c;
            if (num2 != null) {
                return new d1(intValue, str, num2.intValue(), this.f101440d, this.f101441e, this.f101442f, this.f101443g, this.f101444h);
            }
            throw new IllegalStateException("Required field 'total_words_count' is missing");
        }

        @m80.k
        public final a c(@m80.l String str) {
            this.f101444h = str;
            return this;
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f101441e = num;
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f101437a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(@m80.l String str) {
            this.f101443g = str;
            return this;
        }

        @m80.k
        public final a g(@m80.l Boolean bool) {
            this.f101440d = bool;
            return this;
        }

        @m80.k
        public final a h(@m80.k String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            this.f101438b = name;
            return this;
        }

        @m80.k
        public final a i(int i11) {
            this.f101439c = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101437a = null;
            this.f101438b = null;
            this.f101439c = null;
            this.f101440d = null;
            this.f101441e = null;
            this.f101442f = null;
            this.f101443g = null;
            this.f101444h = null;
        }

        public a(@m80.k d1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101437a = Integer.valueOf(source.f101429a);
            this.f101438b = source.f101430b;
            this.f101439c = Integer.valueOf(source.f101431c);
            this.f101440d = source.f101432d;
            this.f101441e = source.f101433e;
            this.f101442f = source.f101434f;
            this.f101443g = source.f101435g;
            this.f101444h = source.f101436h;
        }
    }
}
