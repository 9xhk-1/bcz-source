package t8;

import com.baicizhan.client.business.dataset.provider.a;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class y implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f90320f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<y, a> f90321g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final o f90322a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90323b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90324c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final long f90325d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f90326e;

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
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                if (s11 != 5) {
                                    at.b.a(protocol, b11);
                                } else if (b11 == 8) {
                                    builder.f(protocol.s8());
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 10) {
                                builder.d(protocol.T1());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.c(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.e(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.b(o.f90151e.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k y struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ZpkInfo");
            protocol.Q6("topic_key", 1, (byte) 12);
            o.f90151e.write(protocol, struct.f90322a);
            protocol.N2();
            protocol.Q6("zpk_uri", 2, (byte) 11);
            protocol.p1(struct.f90323b);
            protocol.N2();
            protocol.Q6("zpk_md5", 3, (byte) 11);
            protocol.p1(struct.f90324c);
            protocol.N2();
            protocol.Q6("zpk_size", 4, (byte) 10);
            protocol.q7(struct.f90325d);
            protocol.N2();
            protocol.Q6(a.i.C0250a.f16203e, 5, (byte) 8);
            protocol.l5(struct.f90326e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public y(@m80.k o topic_key, @m80.k String zpk_uri, @m80.k String zpk_md5, long j11, int i11) {
        g0.p(topic_key, "topic_key");
        g0.p(zpk_uri, "zpk_uri");
        g0.p(zpk_md5, "zpk_md5");
        this.f90322a = topic_key;
        this.f90323b = zpk_uri;
        this.f90324c = zpk_md5;
        this.f90325d = j11;
        this.f90326e = i11;
    }

    public static /* synthetic */ y g(y yVar, o oVar, String str, String str2, long j11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            oVar = yVar.f90322a;
        }
        if ((i12 & 2) != 0) {
            str = yVar.f90323b;
        }
        if ((i12 & 4) != 0) {
            str2 = yVar.f90324c;
        }
        if ((i12 & 8) != 0) {
            j11 = yVar.f90325d;
        }
        if ((i12 & 16) != 0) {
            i11 = yVar.f90326e;
        }
        int i13 = i11;
        String str3 = str2;
        return yVar.f(oVar, str, str3, j11, i13);
    }

    @m80.k
    public final o a() {
        return this.f90322a;
    }

    @m80.k
    public final String b() {
        return this.f90323b;
    }

    @m80.k
    public final String c() {
        return this.f90324c;
    }

    public final long d() {
        return this.f90325d;
    }

    public final int e() {
        return this.f90326e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return g0.g(this.f90322a, yVar.f90322a) && g0.g(this.f90323b, yVar.f90323b) && g0.g(this.f90324c, yVar.f90324c) && this.f90325d == yVar.f90325d && this.f90326e == yVar.f90326e;
    }

    @m80.k
    public final y f(@m80.k o topic_key, @m80.k String zpk_uri, @m80.k String zpk_md5, long j11, int i11) {
        g0.p(topic_key, "topic_key");
        g0.p(zpk_uri, "zpk_uri");
        g0.p(zpk_md5, "zpk_md5");
        return new y(topic_key, zpk_uri, zpk_md5, j11, i11);
    }

    public int hashCode() {
        return (((((((this.f90322a.hashCode() * 31) + this.f90323b.hashCode()) * 31) + this.f90324c.hashCode()) * 31) + Long.hashCode(this.f90325d)) * 31) + Integer.hashCode(this.f90326e);
    }

    @m80.k
    public String toString() {
        return "ZpkInfo(topic_key=" + this.f90322a + ", zpk_uri=" + this.f90323b + ", zpk_md5=" + this.f90324c + ", zpk_size=" + this.f90325d + ", zpk_version=" + this.f90326e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90321g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nZpkInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZpkInfo.kt\ncom/baicizhan/biz/online/resource_api/ZpkInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
    public static final class a implements ts.f<y> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public o f90327a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f90328b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f90329c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Long f90330d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f90331e;

        public a() {
            this.f90327a = null;
            this.f90328b = null;
            this.f90329c = null;
            this.f90330d = null;
            this.f90331e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y build() {
            o oVar = this.f90327a;
            if (oVar == null) {
                throw new IllegalStateException("Required field 'topic_key' is missing");
            }
            String str = this.f90328b;
            if (str == null) {
                throw new IllegalStateException("Required field 'zpk_uri' is missing");
            }
            String str2 = this.f90329c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'zpk_md5' is missing");
            }
            Long l11 = this.f90330d;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'zpk_size' is missing");
            }
            long longValue = l11.longValue();
            Integer num = this.f90331e;
            if (num != null) {
                return new y(oVar, str, str2, longValue, num.intValue());
            }
            throw new IllegalStateException("Required field 'zpk_version' is missing");
        }

        @m80.k
        public final a b(@m80.k o topic_key) {
            g0.p(topic_key, "topic_key");
            this.f90327a = topic_key;
            return this;
        }

        @m80.k
        public final a c(@m80.k String zpk_md5) {
            g0.p(zpk_md5, "zpk_md5");
            this.f90329c = zpk_md5;
            return this;
        }

        @m80.k
        public final a d(long j11) {
            this.f90330d = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a e(@m80.k String zpk_uri) {
            g0.p(zpk_uri, "zpk_uri");
            this.f90328b = zpk_uri;
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f90331e = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90327a = null;
            this.f90328b = null;
            this.f90329c = null;
            this.f90330d = null;
            this.f90331e = null;
        }

        public a(@m80.k y source) {
            g0.p(source, "source");
            this.f90327a = source.f90322a;
            this.f90328b = source.f90323b;
            this.f90329c = source.f90324c;
            this.f90330d = Long.valueOf(source.f90325d);
            this.f90331e = Integer.valueOf(source.f90326e);
        }
    }
}
