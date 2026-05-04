package t8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class l implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f90116g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<l, a> f90117h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f90118a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f90119b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f90120c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90121d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90122e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f90123f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<l, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.T1());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.T1());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k l struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ShortPhraseInfo");
            protocol.Q6("id", 1, (byte) 10);
            protocol.q7(struct.f90118a);
            protocol.N2();
            protocol.Q6("topic_id", 2, (byte) 8);
            protocol.l5(struct.f90119b);
            protocol.N2();
            protocol.Q6("chn_mean_id", 3, (byte) 10);
            protocol.q7(struct.f90120c);
            protocol.N2();
            protocol.Q6("short_phrase", 4, (byte) 11);
            protocol.p1(struct.f90121d);
            protocol.N2();
            protocol.Q6("short_phrase_trans", 5, (byte) 11);
            protocol.p1(struct.f90122e);
            protocol.N2();
            if (struct.f90123f != null) {
                protocol.Q6("short_phrase_topic_id", 6, (byte) 8);
                protocol.l5(struct.f90123f.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public l(long j11, int i11, long j12, @m80.k String short_phrase, @m80.k String short_phrase_trans, @m80.l Integer num) {
        g0.p(short_phrase, "short_phrase");
        g0.p(short_phrase_trans, "short_phrase_trans");
        this.f90118a = j11;
        this.f90119b = i11;
        this.f90120c = j12;
        this.f90121d = short_phrase;
        this.f90122e = short_phrase_trans;
        this.f90123f = num;
    }

    public static /* synthetic */ l h(l lVar, long j11, int i11, long j12, String str, String str2, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = lVar.f90118a;
        }
        long j13 = j11;
        if ((i12 & 2) != 0) {
            i11 = lVar.f90119b;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            j12 = lVar.f90120c;
        }
        long j14 = j12;
        if ((i12 & 8) != 0) {
            str = lVar.f90121d;
        }
        return lVar.g(j13, i13, j14, str, (i12 & 16) != 0 ? lVar.f90122e : str2, (i12 & 32) != 0 ? lVar.f90123f : num);
    }

    public final long a() {
        return this.f90118a;
    }

    public final int b() {
        return this.f90119b;
    }

    public final long c() {
        return this.f90120c;
    }

    @m80.k
    public final String d() {
        return this.f90121d;
    }

    @m80.k
    public final String e() {
        return this.f90122e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f90118a == lVar.f90118a && this.f90119b == lVar.f90119b && this.f90120c == lVar.f90120c && g0.g(this.f90121d, lVar.f90121d) && g0.g(this.f90122e, lVar.f90122e) && g0.g(this.f90123f, lVar.f90123f);
    }

    @m80.l
    public final Integer f() {
        return this.f90123f;
    }

    @m80.k
    public final l g(long j11, int i11, long j12, @m80.k String short_phrase, @m80.k String short_phrase_trans, @m80.l Integer num) {
        g0.p(short_phrase, "short_phrase");
        g0.p(short_phrase_trans, "short_phrase_trans");
        return new l(j11, i11, j12, short_phrase, short_phrase_trans, num);
    }

    public int hashCode() {
        int hashCode = ((((((((Long.hashCode(this.f90118a) * 31) + Integer.hashCode(this.f90119b)) * 31) + Long.hashCode(this.f90120c)) * 31) + this.f90121d.hashCode()) * 31) + this.f90122e.hashCode()) * 31;
        Integer num = this.f90123f;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @m80.k
    public String toString() {
        return "ShortPhraseInfo(id=" + this.f90118a + ", topic_id=" + this.f90119b + ", chn_mean_id=" + this.f90120c + ", short_phrase=" + this.f90121d + ", short_phrase_trans=" + this.f90122e + ", short_phrase_topic_id=" + this.f90123f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90117h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nShortPhraseInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortPhraseInfo.kt\ncom/baicizhan/biz/online/resource_api/ShortPhraseInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
    public static final class a implements ts.f<l> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f90124a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f90125b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f90126c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f90127d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f90128e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f90129f;

        public a() {
            this.f90124a = null;
            this.f90125b = null;
            this.f90126c = null;
            this.f90127d = null;
            this.f90128e = null;
            this.f90129f = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l build() {
            Long l11 = this.f90124a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            long longValue = l11.longValue();
            Integer num = this.f90125b;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Long l12 = this.f90126c;
            if (l12 == null) {
                throw new IllegalStateException("Required field 'chn_mean_id' is missing");
            }
            long longValue2 = l12.longValue();
            String str = this.f90127d;
            if (str == null) {
                throw new IllegalStateException("Required field 'short_phrase' is missing");
            }
            String str2 = this.f90128e;
            if (str2 != null) {
                return new l(longValue, intValue, longValue2, str, str2, this.f90129f);
            }
            throw new IllegalStateException("Required field 'short_phrase_trans' is missing");
        }

        @m80.k
        public final a b(long j11) {
            this.f90126c = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a c(long j11) {
            this.f90124a = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a d(@m80.k String short_phrase) {
            g0.p(short_phrase, "short_phrase");
            this.f90127d = short_phrase;
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f90129f = num;
            return this;
        }

        @m80.k
        public final a f(@m80.k String short_phrase_trans) {
            g0.p(short_phrase_trans, "short_phrase_trans");
            this.f90128e = short_phrase_trans;
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f90125b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90124a = null;
            this.f90125b = null;
            this.f90126c = null;
            this.f90127d = null;
            this.f90128e = null;
            this.f90129f = null;
        }

        public a(@m80.k l source) {
            g0.p(source, "source");
            this.f90124a = Long.valueOf(source.f90118a);
            this.f90125b = Integer.valueOf(source.f90119b);
            this.f90126c = Long.valueOf(source.f90120c);
            this.f90127d = source.f90121d;
            this.f90128e = source.f90122e;
            this.f90129f = source.f90123f;
        }
    }
}
