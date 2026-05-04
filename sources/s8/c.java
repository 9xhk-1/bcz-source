package s8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ts.e;
import ts.f;
import w00.g;
import ws.d;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements e {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final b f88124d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @g
    @k
    public static final ts.a<c, a> f88125e = new C1155c();

    /* renamed from: a, reason: collision with root package name */
    @g
    @k
    public final String f88126a;

    /* renamed from: b, reason: collision with root package name */
    @g
    public final long f88127b;

    /* renamed from: c, reason: collision with root package name */
    @g
    public final long f88128c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: s8.c$c, reason: collision with other inner class name */
    public static final class C1155c implements ts.a<c, a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c read(@k i protocol, @k a builder) {
            g0.p(protocol, "protocol");
            g0.p(builder, "builder");
            protocol.u0();
            while (true) {
                d a62 = protocol.a6();
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
                        } else if (b11 == 10) {
                            builder.c(protocol.T1());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 10) {
                        builder.a(protocol.T1());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.d(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@k i protocol, @k c struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("RankPkEntry");
            protocol.Q6("url", 1, (byte) 11);
            protocol.p1(struct.f88126a);
            protocol.N2();
            protocol.Q6("beginTime", 2, (byte) 10);
            protocol.q7(struct.f88127b);
            protocol.N2();
            protocol.Q6("endTime", 3, (byte) 10);
            protocol.q7(struct.f88128c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public c(@k String url, long j11, long j12) {
        g0.p(url, "url");
        this.f88126a = url;
        this.f88127b = j11;
        this.f88128c = j12;
    }

    public static /* synthetic */ c e(c cVar, String str, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cVar.f88126a;
        }
        if ((i11 & 2) != 0) {
            j11 = cVar.f88127b;
        }
        if ((i11 & 4) != 0) {
            j12 = cVar.f88128c;
        }
        return cVar.d(str, j11, j12);
    }

    @k
    public final String a() {
        return this.f88126a;
    }

    public final long b() {
        return this.f88127b;
    }

    public final long c() {
        return this.f88128c;
    }

    @k
    public final c d(@k String url, long j11, long j12) {
        g0.p(url, "url");
        return new c(url, j11, j12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return g0.g(this.f88126a, cVar.f88126a) && this.f88127b == cVar.f88127b && this.f88128c == cVar.f88128c;
    }

    public int hashCode() {
        return (((this.f88126a.hashCode() * 31) + Long.hashCode(this.f88127b)) * 31) + Long.hashCode(this.f88128c);
    }

    @k
    public String toString() {
        return "RankPkEntry(url=" + this.f88126a + ", beginTime=" + this.f88127b + ", endTime=" + this.f88128c + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f88125e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRankPkEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankPkEntry.kt\ncom/baicizhan/biz/online/pk_api/RankPkEntry$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
    public static final class a implements f<c> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public String f88129a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public Long f88130b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Long f88131c;

        public a() {
            this.f88129a = null;
            this.f88130b = null;
            this.f88131c = null;
        }

        @k
        public final a a(long j11) {
            this.f88130b = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c build() {
            String str = this.f88129a;
            if (str == null) {
                throw new IllegalStateException("Required field 'url' is missing");
            }
            Long l11 = this.f88130b;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'beginTime' is missing");
            }
            long longValue = l11.longValue();
            Long l12 = this.f88131c;
            if (l12 != null) {
                return new c(str, longValue, l12.longValue());
            }
            throw new IllegalStateException("Required field 'endTime' is missing");
        }

        @k
        public final a c(long j11) {
            this.f88131c = Long.valueOf(j11);
            return this;
        }

        @k
        public final a d(@k String url) {
            g0.p(url, "url");
            this.f88129a = url;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f88129a = null;
            this.f88130b = null;
            this.f88131c = null;
        }

        public a(@k c source) {
            g0.p(source, "source");
            this.f88129a = source.f88126a;
            this.f88130b = Long.valueOf(source.f88127b);
            this.f88131c = Long.valueOf(source.f88128c);
        }
    }
}
