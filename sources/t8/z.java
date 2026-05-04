package t8;

import com.baicizhan.client.business.dataset.provider.a;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class z implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f90332f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<z, a> f90333g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final o f90334a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90335b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f90336c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f90337d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f90338e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<z, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                    builder.c(Integer.valueOf(protocol.s8()));
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 8) {
                                builder.f(protocol.s8());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.b(Integer.valueOf(protocol.s8()));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.e(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.d(o.f90151e.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k z struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ZpkMd5");
            protocol.Q6("topic_key", 1, (byte) 12);
            o.f90151e.write(protocol, struct.f90334a);
            protocol.N2();
            protocol.Q6("zpk_md5", 2, (byte) 11);
            protocol.p1(struct.f90335b);
            protocol.N2();
            if (struct.f90336c != null) {
                protocol.Q6("force_update", 3, (byte) 8);
                protocol.l5(struct.f90336c.intValue());
                protocol.N2();
            }
            protocol.Q6(a.i.C0250a.f16203e, 4, (byte) 8);
            protocol.l5(struct.f90337d);
            protocol.N2();
            if (struct.f90338e != null) {
                protocol.Q6("force_update_zpk_version", 5, (byte) 8);
                protocol.l5(struct.f90338e.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public z(@m80.k o topic_key, @m80.k String zpk_md5, @m80.l Integer num, int i11, @m80.l Integer num2) {
        g0.p(topic_key, "topic_key");
        g0.p(zpk_md5, "zpk_md5");
        this.f90334a = topic_key;
        this.f90335b = zpk_md5;
        this.f90336c = num;
        this.f90337d = i11;
        this.f90338e = num2;
    }

    public static /* synthetic */ z g(z zVar, o oVar, String str, Integer num, int i11, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            oVar = zVar.f90334a;
        }
        if ((i12 & 2) != 0) {
            str = zVar.f90335b;
        }
        if ((i12 & 4) != 0) {
            num = zVar.f90336c;
        }
        if ((i12 & 8) != 0) {
            i11 = zVar.f90337d;
        }
        if ((i12 & 16) != 0) {
            num2 = zVar.f90338e;
        }
        Integer num3 = num2;
        Integer num4 = num;
        return zVar.f(oVar, str, num4, i11, num3);
    }

    @m80.k
    public final o a() {
        return this.f90334a;
    }

    @m80.k
    public final String b() {
        return this.f90335b;
    }

    @m80.l
    public final Integer c() {
        return this.f90336c;
    }

    public final int d() {
        return this.f90337d;
    }

    @m80.l
    public final Integer e() {
        return this.f90338e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return g0.g(this.f90334a, zVar.f90334a) && g0.g(this.f90335b, zVar.f90335b) && g0.g(this.f90336c, zVar.f90336c) && this.f90337d == zVar.f90337d && g0.g(this.f90338e, zVar.f90338e);
    }

    @m80.k
    public final z f(@m80.k o topic_key, @m80.k String zpk_md5, @m80.l Integer num, int i11, @m80.l Integer num2) {
        g0.p(topic_key, "topic_key");
        g0.p(zpk_md5, "zpk_md5");
        return new z(topic_key, zpk_md5, num, i11, num2);
    }

    public int hashCode() {
        int hashCode = ((this.f90334a.hashCode() * 31) + this.f90335b.hashCode()) * 31;
        Integer num = this.f90336c;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.f90337d)) * 31;
        Integer num2 = this.f90338e;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "ZpkMd5(topic_key=" + this.f90334a + ", zpk_md5=" + this.f90335b + ", force_update=" + this.f90336c + ", zpk_version=" + this.f90337d + ", force_update_zpk_version=" + this.f90338e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90333g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nZpkMd5.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZpkMd5.kt\ncom/baicizhan/biz/online/resource_api/ZpkMd5$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"})
    public static final class a implements ts.f<z> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public o f90339a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f90340b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f90341c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f90342d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f90343e;

        public a() {
            this.f90339a = null;
            this.f90340b = null;
            this.f90341c = null;
            this.f90342d = null;
            this.f90343e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z build() {
            o oVar = this.f90339a;
            if (oVar == null) {
                throw new IllegalStateException("Required field 'topic_key' is missing");
            }
            String str = this.f90340b;
            if (str == null) {
                throw new IllegalStateException("Required field 'zpk_md5' is missing");
            }
            Integer num = this.f90341c;
            Integer num2 = this.f90342d;
            if (num2 != null) {
                return new z(oVar, str, num, num2.intValue(), this.f90343e);
            }
            throw new IllegalStateException("Required field 'zpk_version' is missing");
        }

        @m80.k
        public final a b(@m80.l Integer num) {
            this.f90341c = num;
            return this;
        }

        @m80.k
        public final a c(@m80.l Integer num) {
            this.f90343e = num;
            return this;
        }

        @m80.k
        public final a d(@m80.k o topic_key) {
            g0.p(topic_key, "topic_key");
            this.f90339a = topic_key;
            return this;
        }

        @m80.k
        public final a e(@m80.k String zpk_md5) {
            g0.p(zpk_md5, "zpk_md5");
            this.f90340b = zpk_md5;
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f90342d = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90339a = null;
            this.f90340b = null;
            this.f90341c = null;
            this.f90342d = null;
            this.f90343e = null;
        }

        public a(@m80.k z source) {
            g0.p(source, "source");
            this.f90339a = source.f90334a;
            this.f90340b = source.f90335b;
            this.f90341c = source.f90336c;
            this.f90342d = Integer.valueOf(source.f90337d);
            this.f90343e = source.f90338e;
        }
    }
}
