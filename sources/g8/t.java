package g8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class t implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f53387g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<t, a> f53388h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53389a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53390b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53391c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final long f53392d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final long f53393e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53394f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<t, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
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
                            builder.e(protocol.readString());
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
                            builder.c(protocol.T1());
                            break;
                        }
                    case 6:
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
        public void write(@m80.k ws.i protocol, @m80.k t struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("MallIconItem");
            protocol.Q6("aid", 1, (byte) 11);
            protocol.p1(struct.f53389a);
            protocol.N2();
            protocol.Q6("icon_normal", 2, (byte) 11);
            protocol.p1(struct.f53390b);
            protocol.N2();
            protocol.Q6("icon_press", 3, (byte) 11);
            protocol.p1(struct.f53391c);
            protocol.N2();
            protocol.Q6("start_time", 4, (byte) 10);
            protocol.q7(struct.f53392d);
            protocol.N2();
            protocol.Q6("end_time", 5, (byte) 10);
            protocol.q7(struct.f53393e);
            protocol.N2();
            if (struct.f53394f != null) {
                protocol.Q6("mall_name", 6, (byte) 11);
                protocol.p1(struct.f53394f);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public t(@m80.k String aid, @m80.k String icon_normal, @m80.k String icon_press, long j11, long j12, @m80.l String str) {
        g0.p(aid, "aid");
        g0.p(icon_normal, "icon_normal");
        g0.p(icon_press, "icon_press");
        this.f53389a = aid;
        this.f53390b = icon_normal;
        this.f53391c = icon_press;
        this.f53392d = j11;
        this.f53393e = j12;
        this.f53394f = str;
    }

    public static /* synthetic */ t h(t tVar, String str, String str2, String str3, long j11, long j12, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tVar.f53389a;
        }
        if ((i11 & 2) != 0) {
            str2 = tVar.f53390b;
        }
        if ((i11 & 4) != 0) {
            str3 = tVar.f53391c;
        }
        if ((i11 & 8) != 0) {
            j11 = tVar.f53392d;
        }
        if ((i11 & 16) != 0) {
            j12 = tVar.f53393e;
        }
        if ((i11 & 32) != 0) {
            str4 = tVar.f53394f;
        }
        String str5 = str4;
        long j13 = j12;
        String str6 = str3;
        return tVar.g(str, str2, str6, j11, j13, str5);
    }

    @m80.k
    public final String a() {
        return this.f53389a;
    }

    @m80.k
    public final String b() {
        return this.f53390b;
    }

    @m80.k
    public final String c() {
        return this.f53391c;
    }

    public final long d() {
        return this.f53392d;
    }

    public final long e() {
        return this.f53393e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return g0.g(this.f53389a, tVar.f53389a) && g0.g(this.f53390b, tVar.f53390b) && g0.g(this.f53391c, tVar.f53391c) && this.f53392d == tVar.f53392d && this.f53393e == tVar.f53393e && g0.g(this.f53394f, tVar.f53394f);
    }

    @m80.l
    public final String f() {
        return this.f53394f;
    }

    @m80.k
    public final t g(@m80.k String aid, @m80.k String icon_normal, @m80.k String icon_press, long j11, long j12, @m80.l String str) {
        g0.p(aid, "aid");
        g0.p(icon_normal, "icon_normal");
        g0.p(icon_press, "icon_press");
        return new t(aid, icon_normal, icon_press, j11, j12, str);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f53389a.hashCode() * 31) + this.f53390b.hashCode()) * 31) + this.f53391c.hashCode()) * 31) + Long.hashCode(this.f53392d)) * 31) + Long.hashCode(this.f53393e)) * 31;
        String str = this.f53394f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "MallIconItem(aid=" + this.f53389a + ", icon_normal=" + this.f53390b + ", icon_press=" + this.f53391c + ", start_time=" + this.f53392d + ", end_time=" + this.f53393e + ", mall_name=" + this.f53394f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53388h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMallIconItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MallIconItem.kt\ncom/baicizhan/biz/online/advertise_api/MallIconItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n1#2:225\n*E\n"})
    public static final class a implements ts.f<t> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f53395a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f53396b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f53397c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Long f53398d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Long f53399e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f53400f;

        public a() {
            this.f53395a = null;
            this.f53396b = null;
            this.f53397c = null;
            this.f53398d = null;
            this.f53399e = null;
            this.f53400f = null;
        }

        @m80.k
        public final a a(@m80.k String aid) {
            g0.p(aid, "aid");
            this.f53395a = aid;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t build() {
            String str = this.f53395a;
            if (str == null) {
                throw new IllegalStateException("Required field 'aid' is missing");
            }
            String str2 = this.f53396b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'icon_normal' is missing");
            }
            String str3 = this.f53397c;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'icon_press' is missing");
            }
            Long l11 = this.f53398d;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'start_time' is missing");
            }
            long longValue = l11.longValue();
            Long l12 = this.f53399e;
            if (l12 != null) {
                return new t(str, str2, str3, longValue, l12.longValue(), this.f53400f);
            }
            throw new IllegalStateException("Required field 'end_time' is missing");
        }

        @m80.k
        public final a c(long j11) {
            this.f53399e = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a d(@m80.k String icon_normal) {
            g0.p(icon_normal, "icon_normal");
            this.f53396b = icon_normal;
            return this;
        }

        @m80.k
        public final a e(@m80.k String icon_press) {
            g0.p(icon_press, "icon_press");
            this.f53397c = icon_press;
            return this;
        }

        @m80.k
        public final a f(@m80.l String str) {
            this.f53400f = str;
            return this;
        }

        @m80.k
        public final a g(long j11) {
            this.f53398d = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53395a = null;
            this.f53396b = null;
            this.f53397c = null;
            this.f53398d = null;
            this.f53399e = null;
            this.f53400f = null;
        }

        public a(@m80.k t source) {
            g0.p(source, "source");
            this.f53395a = source.f53389a;
            this.f53396b = source.f53390b;
            this.f53397c = source.f53391c;
            this.f53398d = Long.valueOf(source.f53392d);
            this.f53399e = Long.valueOf(source.f53393e);
            this.f53400f = source.f53394f;
        }
    }
}
