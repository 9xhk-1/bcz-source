package o8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f76421d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<h, a> f76422e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f76423a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final long f76424b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f76425c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<h, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            at.b.a(protocol, b11);
                        } else if (b11 == 8) {
                            builder.b(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 10) {
                        builder.c(protocol.T1());
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
        public void write(@m80.k ws.i protocol, @m80.k h struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("HeartBeat");
            protocol.Q6("now", 1, (byte) 10);
            protocol.q7(struct.f76423a);
            protocol.N2();
            protocol.Q6("live_process", 2, (byte) 10);
            protocol.q7(struct.f76424b);
            protocol.N2();
            protocol.Q6("is_end", 3, (byte) 8);
            protocol.l5(struct.f76425c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public h(long j11, long j12, int i11) {
        this.f76423a = j11;
        this.f76424b = j12;
        this.f76425c = i11;
    }

    public static /* synthetic */ h e(h hVar, long j11, long j12, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = hVar.f76423a;
        }
        long j13 = j11;
        if ((i12 & 2) != 0) {
            j12 = hVar.f76424b;
        }
        long j14 = j12;
        if ((i12 & 4) != 0) {
            i11 = hVar.f76425c;
        }
        return hVar.d(j13, j14, i11);
    }

    public final long a() {
        return this.f76423a;
    }

    public final long b() {
        return this.f76424b;
    }

    public final int c() {
        return this.f76425c;
    }

    @m80.k
    public final h d(long j11, long j12, int i11) {
        return new h(j11, j12, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f76423a == hVar.f76423a && this.f76424b == hVar.f76424b && this.f76425c == hVar.f76425c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f76423a) * 31) + Long.hashCode(this.f76424b)) * 31) + Integer.hashCode(this.f76425c);
    }

    @m80.k
    public String toString() {
        return "HeartBeat(now=" + this.f76423a + ", live_process=" + this.f76424b + ", is_end=" + this.f76425c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76422e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHeartBeat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartBeat.kt\ncom/baicizhan/biz/online/course_api/HeartBeat$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
    public static final class a implements ts.f<h> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f76426a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Long f76427b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f76428c;

        public a() {
            this.f76426a = null;
            this.f76427b = null;
            this.f76428c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h build() {
            Long l11 = this.f76426a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'now' is missing");
            }
            long longValue = l11.longValue();
            Long l12 = this.f76427b;
            if (l12 == null) {
                throw new IllegalStateException("Required field 'live_process' is missing");
            }
            long longValue2 = l12.longValue();
            Integer num = this.f76428c;
            if (num != null) {
                return new h(longValue, longValue2, num.intValue());
            }
            throw new IllegalStateException("Required field 'is_end' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f76428c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(long j11) {
            this.f76427b = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a d(long j11) {
            this.f76426a = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76426a = null;
            this.f76427b = null;
            this.f76428c = null;
        }

        public a(@m80.k h source) {
            g0.p(source, "source");
            this.f76426a = Long.valueOf(source.f76423a);
            this.f76427b = Long.valueOf(source.f76424b);
            this.f76428c = Integer.valueOf(source.f76425c);
        }
    }
}
