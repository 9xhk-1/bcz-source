package t8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final c f89971g = new c(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<a, b> f89972h = new C1192a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f89973a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final long f89974b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f89975c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final long f89976d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final long f89977e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final long f89978f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: t8.a$a, reason: collision with other inner class name */
    public static final class C1192a implements ts.a<a, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            builder.a(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.T1());
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.T1());
                            break;
                        }
                    case 4:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.T1());
                            break;
                        }
                    case 5:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.T1());
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.T1());
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
        public void write(@m80.k ws.i protocol, @m80.k a struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BookResourceUpdateInfo");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(struct.f89973a);
            protocol.N2();
            protocol.Q6("zpk_updated_at", 2, (byte) 10);
            protocol.q7(struct.f89974b);
            protocol.N2();
            protocol.Q6("word_fm_updated_at", 3, (byte) 10);
            protocol.q7(struct.f89975c);
            protocol.N2();
            protocol.Q6("poster_updated_at", 4, (byte) 10);
            protocol.q7(struct.f89976d);
            protocol.N2();
            protocol.Q6("roadmap_version", 5, (byte) 10);
            protocol.q7(struct.f89977e);
            protocol.N2();
            protocol.Q6("tv_topic_updated_at", 6, (byte) 10);
            protocol.q7(struct.f89978f);
            protocol.N2();
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

    public a(int i11, long j11, long j12, long j13, long j14, long j15) {
        this.f89973a = i11;
        this.f89974b = j11;
        this.f89975c = j12;
        this.f89976d = j13;
        this.f89977e = j14;
        this.f89978f = j15;
    }

    public static /* synthetic */ a h(a aVar, int i11, long j11, long j12, long j13, long j14, long j15, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = aVar.f89973a;
        }
        if ((i12 & 2) != 0) {
            j11 = aVar.f89974b;
        }
        if ((i12 & 4) != 0) {
            j12 = aVar.f89975c;
        }
        if ((i12 & 8) != 0) {
            j13 = aVar.f89976d;
        }
        if ((i12 & 16) != 0) {
            j14 = aVar.f89977e;
        }
        if ((i12 & 32) != 0) {
            j15 = aVar.f89978f;
        }
        long j16 = j15;
        long j17 = j14;
        long j18 = j13;
        return aVar.g(i11, j11, j12, j18, j17, j16);
    }

    public final int a() {
        return this.f89973a;
    }

    public final long b() {
        return this.f89974b;
    }

    public final long c() {
        return this.f89975c;
    }

    public final long d() {
        return this.f89976d;
    }

    public final long e() {
        return this.f89977e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f89973a == aVar.f89973a && this.f89974b == aVar.f89974b && this.f89975c == aVar.f89975c && this.f89976d == aVar.f89976d && this.f89977e == aVar.f89977e && this.f89978f == aVar.f89978f;
    }

    public final long f() {
        return this.f89978f;
    }

    @m80.k
    public final a g(int i11, long j11, long j12, long j13, long j14, long j15) {
        return new a(i11, j11, j12, j13, j14, j15);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f89973a) * 31) + Long.hashCode(this.f89974b)) * 31) + Long.hashCode(this.f89975c)) * 31) + Long.hashCode(this.f89976d)) * 31) + Long.hashCode(this.f89977e)) * 31) + Long.hashCode(this.f89978f);
    }

    @m80.k
    public String toString() {
        return "BookResourceUpdateInfo(book_id=" + this.f89973a + ", zpk_updated_at=" + this.f89974b + ", word_fm_updated_at=" + this.f89975c + ", poster_updated_at=" + this.f89976d + ", roadmap_version=" + this.f89977e + ", tv_topic_updated_at=" + this.f89978f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f89972h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBookResourceUpdateInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookResourceUpdateInfo.kt\ncom/baicizhan/biz/online/resource_api/BookResourceUpdateInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,229:1\n1#2:230\n*E\n"})
    public static final class b implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f89979a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Long f89980b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f89981c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Long f89982d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Long f89983e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Long f89984f;

        public b() {
            this.f89979a = null;
            this.f89980b = null;
            this.f89981c = null;
            this.f89982d = null;
            this.f89983e = null;
            this.f89984f = null;
        }

        @m80.k
        public final b a(int i11) {
            this.f89979a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a build() {
            Integer num = this.f89979a;
            if (num == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue = num.intValue();
            Long l11 = this.f89980b;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'zpk_updated_at' is missing");
            }
            long longValue = l11.longValue();
            Long l12 = this.f89981c;
            if (l12 == null) {
                throw new IllegalStateException("Required field 'word_fm_updated_at' is missing");
            }
            long longValue2 = l12.longValue();
            Long l13 = this.f89982d;
            if (l13 == null) {
                throw new IllegalStateException("Required field 'poster_updated_at' is missing");
            }
            long longValue3 = l13.longValue();
            Long l14 = this.f89983e;
            if (l14 == null) {
                throw new IllegalStateException("Required field 'roadmap_version' is missing");
            }
            long longValue4 = l14.longValue();
            Long l15 = this.f89984f;
            if (l15 != null) {
                return new a(intValue, longValue, longValue2, longValue3, longValue4, l15.longValue());
            }
            throw new IllegalStateException("Required field 'tv_topic_updated_at' is missing");
        }

        @m80.k
        public final b c(long j11) {
            this.f89982d = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final b d(long j11) {
            this.f89983e = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final b e(long j11) {
            this.f89984f = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final b f(long j11) {
            this.f89981c = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final b g(long j11) {
            this.f89980b = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f89979a = null;
            this.f89980b = null;
            this.f89981c = null;
            this.f89982d = null;
            this.f89983e = null;
            this.f89984f = null;
        }

        public b(@m80.k a source) {
            g0.p(source, "source");
            this.f89979a = Integer.valueOf(source.f89973a);
            this.f89980b = Long.valueOf(source.f89974b);
            this.f89981c = Long.valueOf(source.f89975c);
            this.f89982d = Long.valueOf(source.f89976d);
            this.f89983e = Long.valueOf(source.f89977e);
            this.f89984f = Long.valueOf(source.f89978f);
        }
    }
}
