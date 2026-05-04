package t8;

import com.baicizhan.client.business.dataset.provider.a;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class u implements ts.e {

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final b f90270n = new b(null);

    /* renamed from: o, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<u, a> f90271o = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f90272a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90273b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90274c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90275d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90276e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90277f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90278g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90279h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90280i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f90281j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f90282k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f90283l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90284m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<u, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.g(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(protocol.readString());
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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.n(protocol.readString());
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
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(Long.valueOf(protocol.T1()));
                            break;
                        }
                    case 11:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(Long.valueOf(protocol.T1()));
                            break;
                        }
                    case 12:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(Long.valueOf(protocol.T1()));
                            break;
                        }
                    case 13:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k u struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("WordMedia");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f90272a);
            protocol.N2();
            if (struct.f90273b != null) {
                protocol.Q6(a.v.C0263a.f16320f, 2, (byte) 11);
                protocol.p1(struct.f90273b);
                protocol.N2();
            }
            if (struct.f90274c != null) {
                protocol.Q6(a.v.C0263a.f16321g, 3, (byte) 11);
                protocol.p1(struct.f90274c);
                protocol.N2();
            }
            if (struct.f90275d != null) {
                protocol.Q6(a.v.C0263a.f16322h, 4, (byte) 11);
                protocol.p1(struct.f90275d);
                protocol.N2();
            }
            if (struct.f90276e != null) {
                protocol.Q6(a.v.C0263a.f16323i, 5, (byte) 11);
                protocol.p1(struct.f90276e);
                protocol.N2();
            }
            if (struct.f90277f != null) {
                protocol.Q6("word", 6, (byte) 11);
                protocol.p1(struct.f90277f);
                protocol.N2();
            }
            if (struct.f90278g != null) {
                protocol.Q6("word_mean_cn", 7, (byte) 11);
                protocol.p1(struct.f90278g);
                protocol.N2();
            }
            if (struct.f90279h != null) {
                protocol.Q6("word_type", 8, (byte) 11);
                protocol.p1(struct.f90279h);
                protocol.N2();
            }
            if (struct.f90280i != null) {
                protocol.Q6("word_sentence", 9, (byte) 11);
                protocol.p1(struct.f90280i);
                protocol.N2();
            }
            if (struct.f90281j != null) {
                protocol.Q6("fm_updated_at", 10, (byte) 10);
                protocol.q7(struct.f90281j.longValue());
                protocol.N2();
            }
            if (struct.f90282k != null) {
                protocol.Q6("tv_updated_at", 11, (byte) 10);
                protocol.q7(struct.f90282k.longValue());
                protocol.N2();
            }
            if (struct.f90283l != null) {
                protocol.Q6("poster_updated_at", 12, (byte) 10);
                protocol.q7(struct.f90283l.longValue());
                protocol.N2();
            }
            if (struct.f90284m != null) {
                protocol.Q6("poster_zpk", 13, (byte) 11);
                protocol.p1(struct.f90284m);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public u(int i11, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4, @m80.l String str5, @m80.l String str6, @m80.l String str7, @m80.l String str8, @m80.l Long l11, @m80.l Long l12, @m80.l Long l13, @m80.l String str9) {
        this.f90272a = i11;
        this.f90273b = str;
        this.f90274c = str2;
        this.f90275d = str3;
        this.f90276e = str4;
        this.f90277f = str5;
        this.f90278g = str6;
        this.f90279h = str7;
        this.f90280i = str8;
        this.f90281j = l11;
        this.f90282k = l12;
        this.f90283l = l13;
        this.f90284m = str9;
    }

    public static /* synthetic */ u o(u uVar, int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l11, Long l12, Long l13, String str9, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = uVar.f90272a;
        }
        return uVar.n(i11, (i12 & 2) != 0 ? uVar.f90273b : str, (i12 & 4) != 0 ? uVar.f90274c : str2, (i12 & 8) != 0 ? uVar.f90275d : str3, (i12 & 16) != 0 ? uVar.f90276e : str4, (i12 & 32) != 0 ? uVar.f90277f : str5, (i12 & 64) != 0 ? uVar.f90278g : str6, (i12 & 128) != 0 ? uVar.f90279h : str7, (i12 & 256) != 0 ? uVar.f90280i : str8, (i12 & 512) != 0 ? uVar.f90281j : l11, (i12 & 1024) != 0 ? uVar.f90282k : l12, (i12 & 2048) != 0 ? uVar.f90283l : l13, (i12 & 4096) != 0 ? uVar.f90284m : str9);
    }

    public final int a() {
        return this.f90272a;
    }

    @m80.l
    public final Long b() {
        return this.f90281j;
    }

    @m80.l
    public final Long c() {
        return this.f90282k;
    }

    @m80.l
    public final Long d() {
        return this.f90283l;
    }

    @m80.l
    public final String e() {
        return this.f90284m;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f90272a == uVar.f90272a && g0.g(this.f90273b, uVar.f90273b) && g0.g(this.f90274c, uVar.f90274c) && g0.g(this.f90275d, uVar.f90275d) && g0.g(this.f90276e, uVar.f90276e) && g0.g(this.f90277f, uVar.f90277f) && g0.g(this.f90278g, uVar.f90278g) && g0.g(this.f90279h, uVar.f90279h) && g0.g(this.f90280i, uVar.f90280i) && g0.g(this.f90281j, uVar.f90281j) && g0.g(this.f90282k, uVar.f90282k) && g0.g(this.f90283l, uVar.f90283l) && g0.g(this.f90284m, uVar.f90284m);
    }

    @m80.l
    public final String f() {
        return this.f90273b;
    }

    @m80.l
    public final String g() {
        return this.f90274c;
    }

    @m80.l
    public final String h() {
        return this.f90275d;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f90272a) * 31;
        String str = this.f90273b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f90274c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f90275d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f90276e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f90277f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f90278g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f90279h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f90280i;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l11 = this.f90281j;
        int hashCode10 = (hashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f90282k;
        int hashCode11 = (hashCode10 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f90283l;
        int hashCode12 = (hashCode11 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str9 = this.f90284m;
        return hashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    @m80.l
    public final String i() {
        return this.f90276e;
    }

    @m80.l
    public final String j() {
        return this.f90277f;
    }

    @m80.l
    public final String k() {
        return this.f90278g;
    }

    @m80.l
    public final String l() {
        return this.f90279h;
    }

    @m80.l
    public final String m() {
        return this.f90280i;
    }

    @m80.k
    public final u n(int i11, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4, @m80.l String str5, @m80.l String str6, @m80.l String str7, @m80.l String str8, @m80.l Long l11, @m80.l Long l12, @m80.l Long l13, @m80.l String str9) {
        return new u(i11, str, str2, str3, str4, str5, str6, str7, str8, l11, l12, l13, str9);
    }

    @m80.k
    public String toString() {
        return "WordMedia(topic_id=" + this.f90272a + ", m4a_audio_path=" + this.f90273b + ", amr_audio_path=" + this.f90274c + ", tv_path=" + this.f90275d + ", tv_snapshot_path=" + this.f90276e + ", word=" + this.f90277f + ", word_mean_cn=" + this.f90278g + ", word_type=" + this.f90279h + ", word_sentence=" + this.f90280i + ", fm_updated_at=" + this.f90281j + ", tv_updated_at=" + this.f90282k + ", poster_updated_at=" + this.f90283l + ", poster_zpk=" + this.f90284m + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90271o.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nWordMedia.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordMedia.kt\ncom/baicizhan/biz/online/resource_api/WordMedia$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n1#2:422\n*E\n"})
    public static final class a implements ts.f<u> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f90285a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f90286b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f90287c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f90288d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f90289e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f90290f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f90291g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f90292h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public String f90293i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public Long f90294j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public Long f90295k;

        /* renamed from: l, reason: collision with root package name */
        @m80.l
        public Long f90296l;

        /* renamed from: m, reason: collision with root package name */
        @m80.l
        public String f90297m;

        public a() {
            this.f90285a = null;
            this.f90286b = null;
            this.f90287c = null;
            this.f90288d = null;
            this.f90289e = null;
            this.f90290f = null;
            this.f90291g = null;
            this.f90292h = null;
            this.f90293i = null;
            this.f90294j = null;
            this.f90295k = null;
            this.f90296l = null;
            this.f90297m = null;
        }

        @m80.k
        public final a a(@m80.l String str) {
            this.f90287c = str;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u build() {
            Integer num = this.f90285a;
            if (num != null) {
                return new u(num.intValue(), this.f90286b, this.f90287c, this.f90288d, this.f90289e, this.f90290f, this.f90291g, this.f90292h, this.f90293i, this.f90294j, this.f90295k, this.f90296l, this.f90297m);
            }
            throw new IllegalStateException("Required field 'topic_id' is missing");
        }

        @m80.k
        public final a c(@m80.l Long l11) {
            this.f90294j = l11;
            return this;
        }

        @m80.k
        public final a d(@m80.l String str) {
            this.f90286b = str;
            return this;
        }

        @m80.k
        public final a e(@m80.l Long l11) {
            this.f90296l = l11;
            return this;
        }

        @m80.k
        public final a f(@m80.l String str) {
            this.f90297m = str;
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f90285a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a h(@m80.l String str) {
            this.f90288d = str;
            return this;
        }

        @m80.k
        public final a i(@m80.l String str) {
            this.f90289e = str;
            return this;
        }

        @m80.k
        public final a j(@m80.l Long l11) {
            this.f90295k = l11;
            return this;
        }

        @m80.k
        public final a k(@m80.l String str) {
            this.f90290f = str;
            return this;
        }

        @m80.k
        public final a l(@m80.l String str) {
            this.f90291g = str;
            return this;
        }

        @m80.k
        public final a m(@m80.l String str) {
            this.f90293i = str;
            return this;
        }

        @m80.k
        public final a n(@m80.l String str) {
            this.f90292h = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90285a = null;
            this.f90286b = null;
            this.f90287c = null;
            this.f90288d = null;
            this.f90289e = null;
            this.f90290f = null;
            this.f90291g = null;
            this.f90292h = null;
            this.f90293i = null;
            this.f90294j = null;
            this.f90295k = null;
            this.f90296l = null;
            this.f90297m = null;
        }

        public a(@m80.k u source) {
            g0.p(source, "source");
            this.f90285a = Integer.valueOf(source.f90272a);
            this.f90286b = source.f90273b;
            this.f90287c = source.f90274c;
            this.f90288d = source.f90275d;
            this.f90289e = source.f90276e;
            this.f90290f = source.f90277f;
            this.f90291g = source.f90278g;
            this.f90292h = source.f90279h;
            this.f90293i = source.f90280i;
            this.f90294j = source.f90281j;
            this.f90295k = source.f90282k;
            this.f90296l = source.f90283l;
            this.f90297m = source.f90284m;
        }
    }
}
