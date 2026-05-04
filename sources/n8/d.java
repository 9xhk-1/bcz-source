package n8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final c f74642e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<d, b> f74643f = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f74644a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74645b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74646c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final com.baicizhan.biz.online.bs_users.a f74647d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<d, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d read(@m80.k ws.i protocol, @m80.k b builder) {
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
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                at.b.a(protocol, b11);
                            } else if (b11 == 12) {
                                builder.e(com.baicizhan.biz.online.bs_users.a.f15923g.read(protocol));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.d(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.c(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.b(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k d struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBExamAudioCategory");
            protocol.Q6("category_id", 1, (byte) 8);
            protocol.l5(struct.f74644a);
            protocol.N2();
            protocol.Q6("category_name", 2, (byte) 11);
            protocol.p1(struct.f74645b);
            protocol.N2();
            protocol.Q6(com.baicizhan.main.activity.schedule_v2.e.f19255e, 3, (byte) 11);
            protocol.p1(struct.f74646c);
            protocol.N2();
            if (struct.f74647d != null) {
                protocol.Q6("mall_info", 4, (byte) 12);
                com.baicizhan.biz.online.bs_users.a.f15923g.write(protocol, struct.f74647d);
                protocol.N2();
            }
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

    public d(int i11, @m80.k String category_name, @m80.k String img_url, @m80.l com.baicizhan.biz.online.bs_users.a aVar) {
        g0.p(category_name, "category_name");
        g0.p(img_url, "img_url");
        this.f74644a = i11;
        this.f74645b = category_name;
        this.f74646c = img_url;
        this.f74647d = aVar;
    }

    public static /* synthetic */ d f(d dVar, int i11, String str, String str2, com.baicizhan.biz.online.bs_users.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = dVar.f74644a;
        }
        if ((i12 & 2) != 0) {
            str = dVar.f74645b;
        }
        if ((i12 & 4) != 0) {
            str2 = dVar.f74646c;
        }
        if ((i12 & 8) != 0) {
            aVar = dVar.f74647d;
        }
        return dVar.e(i11, str, str2, aVar);
    }

    public final int a() {
        return this.f74644a;
    }

    @m80.k
    public final String b() {
        return this.f74645b;
    }

    @m80.k
    public final String c() {
        return this.f74646c;
    }

    @m80.l
    public final com.baicizhan.biz.online.bs_users.a d() {
        return this.f74647d;
    }

    @m80.k
    public final d e(int i11, @m80.k String category_name, @m80.k String img_url, @m80.l com.baicizhan.biz.online.bs_users.a aVar) {
        g0.p(category_name, "category_name");
        g0.p(img_url, "img_url");
        return new d(i11, category_name, img_url, aVar);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f74644a == dVar.f74644a && g0.g(this.f74645b, dVar.f74645b) && g0.g(this.f74646c, dVar.f74646c) && g0.g(this.f74647d, dVar.f74647d);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f74644a) * 31) + this.f74645b.hashCode()) * 31) + this.f74646c.hashCode()) * 31;
        com.baicizhan.biz.online.bs_users.a aVar = this.f74647d;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @m80.k
    public String toString() {
        return "BBExamAudioCategory(category_id=" + this.f74644a + ", category_name=" + this.f74645b + ", img_url=" + this.f74646c + ", mall_info=" + this.f74647d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74643f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBExamAudioCategory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBExamAudioCategory.kt\ncom/baicizhan/biz/online/bs_words/BBExamAudioCategory$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"})
    public static final class b implements ts.f<d> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f74648a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f74649b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f74650c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public com.baicizhan.biz.online.bs_users.a f74651d;

        public b() {
            this.f74648a = null;
            this.f74649b = null;
            this.f74650c = null;
            this.f74651d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d build() {
            Integer num = this.f74648a;
            if (num == null) {
                throw new IllegalStateException("Required field 'category_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f74649b;
            if (str == null) {
                throw new IllegalStateException("Required field 'category_name' is missing");
            }
            String str2 = this.f74650c;
            if (str2 != null) {
                return new d(intValue, str, str2, this.f74651d);
            }
            throw new IllegalStateException("Required field 'img_url' is missing");
        }

        @m80.k
        public final b b(int i11) {
            this.f74648a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b c(@m80.k String category_name) {
            g0.p(category_name, "category_name");
            this.f74649b = category_name;
            return this;
        }

        @m80.k
        public final b d(@m80.k String img_url) {
            g0.p(img_url, "img_url");
            this.f74650c = img_url;
            return this;
        }

        @m80.k
        public final b e(@m80.l com.baicizhan.biz.online.bs_users.a aVar) {
            this.f74651d = aVar;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74648a = null;
            this.f74649b = null;
            this.f74650c = null;
            this.f74651d = null;
        }

        public b(@m80.k d source) {
            g0.p(source, "source");
            this.f74648a = Integer.valueOf(source.f74644a);
            this.f74649b = source.f74645b;
            this.f74650c = source.f74646c;
            this.f74651d = source.f74647d;
        }
    }
}
