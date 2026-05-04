package t8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class v implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f90298e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<v, a> f90299f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f90300a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f90301b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f90302c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f90303d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<v, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public v read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            } else if (b11 == 10) {
                                builder.c(Long.valueOf(protocol.T1()));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 10) {
                            builder.e(Long.valueOf(protocol.T1()));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 10) {
                        builder.b(Long.valueOf(protocol.T1()));
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
        public void write(@m80.k ws.i protocol, @m80.k v struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("WordMediaUpdateInfo");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f90300a);
            protocol.N2();
            if (struct.f90301b != null) {
                protocol.Q6("fm_updated_at", 2, (byte) 10);
                protocol.q7(struct.f90301b.longValue());
                protocol.N2();
            }
            if (struct.f90302c != null) {
                protocol.Q6("tv_updated_at", 3, (byte) 10);
                protocol.q7(struct.f90302c.longValue());
                protocol.N2();
            }
            if (struct.f90303d != null) {
                protocol.Q6("poster_updated_at", 4, (byte) 10);
                protocol.q7(struct.f90303d.longValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public v(int i11, @m80.l Long l11, @m80.l Long l12, @m80.l Long l13) {
        this.f90300a = i11;
        this.f90301b = l11;
        this.f90302c = l12;
        this.f90303d = l13;
    }

    public static /* synthetic */ v f(v vVar, int i11, Long l11, Long l12, Long l13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = vVar.f90300a;
        }
        if ((i12 & 2) != 0) {
            l11 = vVar.f90301b;
        }
        if ((i12 & 4) != 0) {
            l12 = vVar.f90302c;
        }
        if ((i12 & 8) != 0) {
            l13 = vVar.f90303d;
        }
        return vVar.e(i11, l11, l12, l13);
    }

    public final int a() {
        return this.f90300a;
    }

    @m80.l
    public final Long b() {
        return this.f90301b;
    }

    @m80.l
    public final Long c() {
        return this.f90302c;
    }

    @m80.l
    public final Long d() {
        return this.f90303d;
    }

    @m80.k
    public final v e(int i11, @m80.l Long l11, @m80.l Long l12, @m80.l Long l13) {
        return new v(i11, l11, l12, l13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f90300a == vVar.f90300a && g0.g(this.f90301b, vVar.f90301b) && g0.g(this.f90302c, vVar.f90302c) && g0.g(this.f90303d, vVar.f90303d);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f90300a) * 31;
        Long l11 = this.f90301b;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f90302c;
        int hashCode3 = (hashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f90303d;
        return hashCode3 + (l13 != null ? l13.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "WordMediaUpdateInfo(topic_id=" + this.f90300a + ", fm_updated_at=" + this.f90301b + ", tv_updated_at=" + this.f90302c + ", poster_updated_at=" + this.f90303d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90299f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nWordMediaUpdateInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordMediaUpdateInfo.kt\ncom/baicizhan/biz/online/resource_api/WordMediaUpdateInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
    public static final class a implements ts.f<v> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f90304a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Long f90305b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f90306c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Long f90307d;

        public a() {
            this.f90304a = null;
            this.f90305b = null;
            this.f90306c = null;
            this.f90307d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v build() {
            Integer num = this.f90304a;
            if (num != null) {
                return new v(num.intValue(), this.f90305b, this.f90306c, this.f90307d);
            }
            throw new IllegalStateException("Required field 'topic_id' is missing");
        }

        @m80.k
        public final a b(@m80.l Long l11) {
            this.f90305b = l11;
            return this;
        }

        @m80.k
        public final a c(@m80.l Long l11) {
            this.f90307d = l11;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f90304a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(@m80.l Long l11) {
            this.f90306c = l11;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90304a = null;
            this.f90305b = null;
            this.f90306c = null;
            this.f90307d = null;
        }

        public a(@m80.k v source) {
            g0.p(source, "source");
            this.f90304a = Integer.valueOf(source.f90300a);
            this.f90305b = source.f90301b;
            this.f90306c = source.f90302c;
            this.f90307d = source.f90303d;
        }
    }
}
