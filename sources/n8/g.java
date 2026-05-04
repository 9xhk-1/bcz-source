package n8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final c f74666i = new c(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<g, b> f74667j = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f74668a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74669b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74670c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f74671d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f74672e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final com.baicizhan.biz.online.bs_users.a f74673f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74674g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74675h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<g, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            builder.h(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(com.baicizhan.biz.online.bs_users.a.f15923g.read(protocol));
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
                            break;
                        }
                    case 8:
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
        public void write(@m80.k ws.i protocol, @m80.k g struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBReadingPlan");
            protocol.Q6("plan_id", 1, (byte) 8);
            protocol.l5(struct.f74668a);
            protocol.N2();
            protocol.Q6("plan_name", 2, (byte) 11);
            protocol.p1(struct.f74669b);
            protocol.N2();
            protocol.Q6("plan_descrp", 3, (byte) 11);
            protocol.p1(struct.f74670c);
            protocol.N2();
            protocol.Q6("play_times", 4, (byte) 8);
            protocol.l5(struct.f74671d);
            protocol.N2();
            protocol.Q6("plan_level", 5, (byte) 8);
            protocol.l5(struct.f74672e);
            protocol.N2();
            if (struct.f74673f != null) {
                protocol.Q6("mall_info", 6, (byte) 12);
                com.baicizhan.biz.online.bs_users.a.f15923g.write(protocol, struct.f74673f);
                protocol.N2();
            }
            protocol.Q6(com.baicizhan.main.activity.schedule_v2.e.f19255e, 7, (byte) 11);
            protocol.p1(struct.f74674g);
            protocol.N2();
            protocol.Q6("img_file_name", 8, (byte) 11);
            protocol.p1(struct.f74675h);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public c() {
        }
    }

    public g(int i11, @m80.k String plan_name, @m80.k String plan_descrp, int i12, int i13, @m80.l com.baicizhan.biz.online.bs_users.a aVar, @m80.k String img_url, @m80.k String img_file_name) {
        g0.p(plan_name, "plan_name");
        g0.p(plan_descrp, "plan_descrp");
        g0.p(img_url, "img_url");
        g0.p(img_file_name, "img_file_name");
        this.f74668a = i11;
        this.f74669b = plan_name;
        this.f74670c = plan_descrp;
        this.f74671d = i12;
        this.f74672e = i13;
        this.f74673f = aVar;
        this.f74674g = img_url;
        this.f74675h = img_file_name;
    }

    public static /* synthetic */ g j(g gVar, int i11, String str, String str2, int i12, int i13, com.baicizhan.biz.online.bs_users.a aVar, String str3, String str4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = gVar.f74668a;
        }
        if ((i14 & 2) != 0) {
            str = gVar.f74669b;
        }
        if ((i14 & 4) != 0) {
            str2 = gVar.f74670c;
        }
        if ((i14 & 8) != 0) {
            i12 = gVar.f74671d;
        }
        if ((i14 & 16) != 0) {
            i13 = gVar.f74672e;
        }
        if ((i14 & 32) != 0) {
            aVar = gVar.f74673f;
        }
        if ((i14 & 64) != 0) {
            str3 = gVar.f74674g;
        }
        if ((i14 & 128) != 0) {
            str4 = gVar.f74675h;
        }
        String str5 = str3;
        String str6 = str4;
        int i15 = i13;
        com.baicizhan.biz.online.bs_users.a aVar2 = aVar;
        return gVar.i(i11, str, str2, i12, i15, aVar2, str5, str6);
    }

    public final int a() {
        return this.f74668a;
    }

    @m80.k
    public final String b() {
        return this.f74669b;
    }

    @m80.k
    public final String c() {
        return this.f74670c;
    }

    public final int d() {
        return this.f74671d;
    }

    public final int e() {
        return this.f74672e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f74668a == gVar.f74668a && g0.g(this.f74669b, gVar.f74669b) && g0.g(this.f74670c, gVar.f74670c) && this.f74671d == gVar.f74671d && this.f74672e == gVar.f74672e && g0.g(this.f74673f, gVar.f74673f) && g0.g(this.f74674g, gVar.f74674g) && g0.g(this.f74675h, gVar.f74675h);
    }

    @m80.l
    public final com.baicizhan.biz.online.bs_users.a f() {
        return this.f74673f;
    }

    @m80.k
    public final String g() {
        return this.f74674g;
    }

    @m80.k
    public final String h() {
        return this.f74675h;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f74668a) * 31) + this.f74669b.hashCode()) * 31) + this.f74670c.hashCode()) * 31) + Integer.hashCode(this.f74671d)) * 31) + Integer.hashCode(this.f74672e)) * 31;
        com.baicizhan.biz.online.bs_users.a aVar = this.f74673f;
        return ((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f74674g.hashCode()) * 31) + this.f74675h.hashCode();
    }

    @m80.k
    public final g i(int i11, @m80.k String plan_name, @m80.k String plan_descrp, int i12, int i13, @m80.l com.baicizhan.biz.online.bs_users.a aVar, @m80.k String img_url, @m80.k String img_file_name) {
        g0.p(plan_name, "plan_name");
        g0.p(plan_descrp, "plan_descrp");
        g0.p(img_url, "img_url");
        g0.p(img_file_name, "img_file_name");
        return new g(i11, plan_name, plan_descrp, i12, i13, aVar, img_url, img_file_name);
    }

    @m80.k
    public String toString() {
        return "BBReadingPlan(plan_id=" + this.f74668a + ", plan_name=" + this.f74669b + ", plan_descrp=" + this.f74670c + ", play_times=" + this.f74671d + ", plan_level=" + this.f74672e + ", mall_info=" + this.f74673f + ", img_url=" + this.f74674g + ", img_file_name=" + this.f74675h + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74667j.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBReadingPlan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBReadingPlan.kt\ncom/baicizhan/biz/online/bs_words/BBReadingPlan$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
    public static final class b implements ts.f<g> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f74676a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f74677b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f74678c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f74679d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f74680e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public com.baicizhan.biz.online.bs_users.a f74681f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f74682g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f74683h;

        public b() {
            this.f74676a = null;
            this.f74677b = null;
            this.f74678c = null;
            this.f74679d = null;
            this.f74680e = null;
            this.f74681f = null;
            this.f74682g = null;
            this.f74683h = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g build() {
            Integer num = this.f74676a;
            if (num == null) {
                throw new IllegalStateException("Required field 'plan_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f74677b;
            if (str == null) {
                throw new IllegalStateException("Required field 'plan_name' is missing");
            }
            String str2 = this.f74678c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'plan_descrp' is missing");
            }
            Integer num2 = this.f74679d;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'play_times' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f74680e;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'plan_level' is missing");
            }
            int intValue3 = num3.intValue();
            com.baicizhan.biz.online.bs_users.a aVar = this.f74681f;
            String str3 = this.f74682g;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'img_url' is missing");
            }
            String str4 = this.f74683h;
            if (str4 != null) {
                return new g(intValue, str, str2, intValue2, intValue3, aVar, str3, str4);
            }
            throw new IllegalStateException("Required field 'img_file_name' is missing");
        }

        @m80.k
        public final b b(@m80.k String img_file_name) {
            g0.p(img_file_name, "img_file_name");
            this.f74683h = img_file_name;
            return this;
        }

        @m80.k
        public final b c(@m80.k String img_url) {
            g0.p(img_url, "img_url");
            this.f74682g = img_url;
            return this;
        }

        @m80.k
        public final b d(@m80.l com.baicizhan.biz.online.bs_users.a aVar) {
            this.f74681f = aVar;
            return this;
        }

        @m80.k
        public final b e(@m80.k String plan_descrp) {
            g0.p(plan_descrp, "plan_descrp");
            this.f74678c = plan_descrp;
            return this;
        }

        @m80.k
        public final b f(int i11) {
            this.f74676a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b g(int i11) {
            this.f74680e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b h(@m80.k String plan_name) {
            g0.p(plan_name, "plan_name");
            this.f74677b = plan_name;
            return this;
        }

        @m80.k
        public final b i(int i11) {
            this.f74679d = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74676a = null;
            this.f74677b = null;
            this.f74678c = null;
            this.f74679d = null;
            this.f74680e = null;
            this.f74681f = null;
            this.f74682g = null;
            this.f74683h = null;
        }

        public b(@m80.k g source) {
            g0.p(source, "source");
            this.f74676a = Integer.valueOf(source.f74668a);
            this.f74677b = source.f74669b;
            this.f74678c = source.f74670c;
            this.f74679d = Integer.valueOf(source.f74671d);
            this.f74680e = Integer.valueOf(source.f74672e);
            this.f74681f = source.f74673f;
            this.f74682g = source.f74674g;
            this.f74683h = source.f74675h;
        }
    }
}
