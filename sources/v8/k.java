package v8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f93313e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<k, a> f93314f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f93315a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f93316b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f93317c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f93318d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<k, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            } else if (b11 == 8) {
                                builder.c(Integer.valueOf(protocol.s8()));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.b(Integer.valueOf(protocol.s8()));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 10) {
                        builder.e(Long.valueOf(protocol.T1()));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.d(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k k struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("SchoolInfoRequest");
            protocol.Q6("school_id", 1, (byte) 8);
            protocol.l5(struct.f93315a);
            protocol.N2();
            if (struct.f93316b != null) {
                protocol.Q6("school_year", 2, (byte) 10);
                protocol.q7(struct.f93316b.longValue());
                protocol.N2();
            }
            if (struct.f93317c != null) {
                protocol.Q6("major_id", 3, (byte) 8);
                protocol.l5(struct.f93317c.intValue());
                protocol.N2();
            }
            if (struct.f93318d != null) {
                protocol.Q6("school_bg", 4, (byte) 8);
                protocol.l5(struct.f93318d.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public k(int i11, @m80.l Long l11, @m80.l Integer num, @m80.l Integer num2) {
        this.f93315a = i11;
        this.f93316b = l11;
        this.f93317c = num;
        this.f93318d = num2;
    }

    public static /* synthetic */ k f(k kVar, int i11, Long l11, Integer num, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = kVar.f93315a;
        }
        if ((i12 & 2) != 0) {
            l11 = kVar.f93316b;
        }
        if ((i12 & 4) != 0) {
            num = kVar.f93317c;
        }
        if ((i12 & 8) != 0) {
            num2 = kVar.f93318d;
        }
        return kVar.e(i11, l11, num, num2);
    }

    public final int a() {
        return this.f93315a;
    }

    @m80.l
    public final Long b() {
        return this.f93316b;
    }

    @m80.l
    public final Integer c() {
        return this.f93317c;
    }

    @m80.l
    public final Integer d() {
        return this.f93318d;
    }

    @m80.k
    public final k e(int i11, @m80.l Long l11, @m80.l Integer num, @m80.l Integer num2) {
        return new k(i11, l11, num, num2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f93315a == kVar.f93315a && g0.g(this.f93316b, kVar.f93316b) && g0.g(this.f93317c, kVar.f93317c) && g0.g(this.f93318d, kVar.f93318d);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f93315a) * 31;
        Long l11 = this.f93316b;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.f93317c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f93318d;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "SchoolInfoRequest(school_id=" + this.f93315a + ", school_year=" + this.f93316b + ", major_id=" + this.f93317c + ", school_bg=" + this.f93318d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93314f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSchoolInfoRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchoolInfoRequest.kt\ncom/baicizhan/biz/online/unified_user_service/SchoolInfoRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
    public static final class a implements ts.f<k> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f93319a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Long f93320b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f93321c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f93322d;

        public a() {
            this.f93319a = null;
            this.f93320b = null;
            this.f93321c = null;
            this.f93322d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k build() {
            Integer num = this.f93319a;
            if (num != null) {
                return new k(num.intValue(), this.f93320b, this.f93321c, this.f93322d);
            }
            throw new IllegalStateException("Required field 'school_id' is missing");
        }

        @m80.k
        public final a b(@m80.l Integer num) {
            this.f93321c = num;
            return this;
        }

        @m80.k
        public final a c(@m80.l Integer num) {
            this.f93322d = num;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f93319a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(@m80.l Long l11) {
            this.f93320b = l11;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93319a = null;
            this.f93320b = null;
            this.f93321c = null;
            this.f93322d = null;
        }

        public a(@m80.k k source) {
            g0.p(source, "source");
            this.f93319a = Integer.valueOf(source.f93315a);
            this.f93320b = source.f93316b;
            this.f93321c = source.f93317c;
            this.f93322d = source.f93318d;
        }
    }
}
