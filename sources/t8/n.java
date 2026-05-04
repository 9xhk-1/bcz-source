package t8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class n implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f90138f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<n, a> f90139g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f90140a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f90141b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f90142c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f90143d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90144e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<n, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                } else if (b11 == 11) {
                                    builder.c(protocol.readString());
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 8) {
                                builder.e(protocol.s8());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 10) {
                            builder.b(protocol.T1());
                        } else {
                            at.b.a(protocol, b11);
                        }
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
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k n struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("SynAntInfo");
            protocol.Q6("syn_ant_id", 1, (byte) 10);
            protocol.q7(struct.f90140a);
            protocol.N2();
            protocol.Q6("topic_id", 2, (byte) 8);
            protocol.l5(struct.f90141b);
            protocol.N2();
            protocol.Q6("chn_mean_id", 3, (byte) 10);
            protocol.q7(struct.f90142c);
            protocol.N2();
            protocol.Q6("syn_ant_topic_id", 4, (byte) 8);
            protocol.l5(struct.f90143d);
            protocol.N2();
            protocol.Q6("syn_ant", 5, (byte) 11);
            protocol.p1(struct.f90144e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public n(long j11, int i11, long j12, int i12, @m80.k String syn_ant) {
        g0.p(syn_ant, "syn_ant");
        this.f90140a = j11;
        this.f90141b = i11;
        this.f90142c = j12;
        this.f90143d = i12;
        this.f90144e = syn_ant;
    }

    public static /* synthetic */ n g(n nVar, long j11, int i11, long j12, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j11 = nVar.f90140a;
        }
        long j13 = j11;
        if ((i13 & 2) != 0) {
            i11 = nVar.f90141b;
        }
        int i14 = i11;
        if ((i13 & 4) != 0) {
            j12 = nVar.f90142c;
        }
        long j14 = j12;
        if ((i13 & 8) != 0) {
            i12 = nVar.f90143d;
        }
        int i15 = i12;
        if ((i13 & 16) != 0) {
            str = nVar.f90144e;
        }
        return nVar.f(j13, i14, j14, i15, str);
    }

    public final long a() {
        return this.f90140a;
    }

    public final int b() {
        return this.f90141b;
    }

    public final long c() {
        return this.f90142c;
    }

    public final int d() {
        return this.f90143d;
    }

    @m80.k
    public final String e() {
        return this.f90144e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f90140a == nVar.f90140a && this.f90141b == nVar.f90141b && this.f90142c == nVar.f90142c && this.f90143d == nVar.f90143d && g0.g(this.f90144e, nVar.f90144e);
    }

    @m80.k
    public final n f(long j11, int i11, long j12, int i12, @m80.k String syn_ant) {
        g0.p(syn_ant, "syn_ant");
        return new n(j11, i11, j12, i12, syn_ant);
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f90140a) * 31) + Integer.hashCode(this.f90141b)) * 31) + Long.hashCode(this.f90142c)) * 31) + Integer.hashCode(this.f90143d)) * 31) + this.f90144e.hashCode();
    }

    @m80.k
    public String toString() {
        return "SynAntInfo(syn_ant_id=" + this.f90140a + ", topic_id=" + this.f90141b + ", chn_mean_id=" + this.f90142c + ", syn_ant_topic_id=" + this.f90143d + ", syn_ant=" + this.f90144e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90139g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSynAntInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynAntInfo.kt\ncom/baicizhan/biz/online/resource_api/SynAntInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
    public static final class a implements ts.f<n> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f90145a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f90146b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f90147c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f90148d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f90149e;

        public a() {
            this.f90145a = null;
            this.f90146b = null;
            this.f90147c = null;
            this.f90148d = null;
            this.f90149e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n build() {
            Long l11 = this.f90145a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'syn_ant_id' is missing");
            }
            long longValue = l11.longValue();
            Integer num = this.f90146b;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Long l12 = this.f90147c;
            if (l12 == null) {
                throw new IllegalStateException("Required field 'chn_mean_id' is missing");
            }
            long longValue2 = l12.longValue();
            Integer num2 = this.f90148d;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'syn_ant_topic_id' is missing");
            }
            int intValue2 = num2.intValue();
            String str = this.f90149e;
            if (str != null) {
                return new n(longValue, intValue, longValue2, intValue2, str);
            }
            throw new IllegalStateException("Required field 'syn_ant' is missing");
        }

        @m80.k
        public final a b(long j11) {
            this.f90147c = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a c(@m80.k String syn_ant) {
            g0.p(syn_ant, "syn_ant");
            this.f90149e = syn_ant;
            return this;
        }

        @m80.k
        public final a d(long j11) {
            this.f90145a = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f90148d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f90146b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90145a = null;
            this.f90146b = null;
            this.f90147c = null;
            this.f90148d = null;
            this.f90149e = null;
        }

        public a(@m80.k n source) {
            g0.p(source, "source");
            this.f90145a = Long.valueOf(source.f90140a);
            this.f90146b = Integer.valueOf(source.f90141b);
            this.f90147c = Long.valueOf(source.f90142c);
            this.f90148d = Integer.valueOf(source.f90143d);
            this.f90149e = source.f90144e;
        }
    }
}
