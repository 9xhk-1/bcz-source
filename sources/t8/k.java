package t8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final b f90098i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<k, a> f90099j = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f90100a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f90101b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f90102c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90103d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90104e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90105f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90106g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90107h;

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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.T1());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.T1());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k k struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("SentenceInfo");
            protocol.Q6("id", 1, (byte) 10);
            protocol.q7(struct.f90100a);
            protocol.N2();
            protocol.Q6("topic_id", 2, (byte) 8);
            protocol.l5(struct.f90101b);
            protocol.N2();
            protocol.Q6("chn_mean_id", 3, (byte) 10);
            protocol.q7(struct.f90102c);
            protocol.N2();
            protocol.Q6("sentence", 4, (byte) 11);
            protocol.p1(struct.f90103d);
            protocol.N2();
            protocol.Q6("sentence_trans", 5, (byte) 11);
            protocol.p1(struct.f90104e);
            protocol.N2();
            if (struct.f90105f != null) {
                protocol.Q6("highlight_phrase", 6, (byte) 11);
                protocol.p1(struct.f90105f);
                protocol.N2();
            }
            if (struct.f90106g != null) {
                protocol.Q6("img_uri", 7, (byte) 11);
                protocol.p1(struct.f90106g);
                protocol.N2();
            }
            if (struct.f90107h != null) {
                protocol.Q6("audio_uri", 8, (byte) 11);
                protocol.p1(struct.f90107h);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public k(long j11, int i11, long j12, @m80.k String sentence, @m80.k String sentence_trans, @m80.l String str, @m80.l String str2, @m80.l String str3) {
        g0.p(sentence, "sentence");
        g0.p(sentence_trans, "sentence_trans");
        this.f90100a = j11;
        this.f90101b = i11;
        this.f90102c = j12;
        this.f90103d = sentence;
        this.f90104e = sentence_trans;
        this.f90105f = str;
        this.f90106g = str2;
        this.f90107h = str3;
    }

    public static /* synthetic */ k j(k kVar, long j11, int i11, long j12, String str, String str2, String str3, String str4, String str5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = kVar.f90100a;
        }
        long j13 = j11;
        if ((i12 & 2) != 0) {
            i11 = kVar.f90101b;
        }
        return kVar.i(j13, i11, (i12 & 4) != 0 ? kVar.f90102c : j12, (i12 & 8) != 0 ? kVar.f90103d : str, (i12 & 16) != 0 ? kVar.f90104e : str2, (i12 & 32) != 0 ? kVar.f90105f : str3, (i12 & 64) != 0 ? kVar.f90106g : str4, (i12 & 128) != 0 ? kVar.f90107h : str5);
    }

    public final long a() {
        return this.f90100a;
    }

    public final int b() {
        return this.f90101b;
    }

    public final long c() {
        return this.f90102c;
    }

    @m80.k
    public final String d() {
        return this.f90103d;
    }

    @m80.k
    public final String e() {
        return this.f90104e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f90100a == kVar.f90100a && this.f90101b == kVar.f90101b && this.f90102c == kVar.f90102c && g0.g(this.f90103d, kVar.f90103d) && g0.g(this.f90104e, kVar.f90104e) && g0.g(this.f90105f, kVar.f90105f) && g0.g(this.f90106g, kVar.f90106g) && g0.g(this.f90107h, kVar.f90107h);
    }

    @m80.l
    public final String f() {
        return this.f90105f;
    }

    @m80.l
    public final String g() {
        return this.f90106g;
    }

    @m80.l
    public final String h() {
        return this.f90107h;
    }

    public int hashCode() {
        int hashCode = ((((((((Long.hashCode(this.f90100a) * 31) + Integer.hashCode(this.f90101b)) * 31) + Long.hashCode(this.f90102c)) * 31) + this.f90103d.hashCode()) * 31) + this.f90104e.hashCode()) * 31;
        String str = this.f90105f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f90106g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f90107h;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @m80.k
    public final k i(long j11, int i11, long j12, @m80.k String sentence, @m80.k String sentence_trans, @m80.l String str, @m80.l String str2, @m80.l String str3) {
        g0.p(sentence, "sentence");
        g0.p(sentence_trans, "sentence_trans");
        return new k(j11, i11, j12, sentence, sentence_trans, str, str2, str3);
    }

    @m80.k
    public String toString() {
        return "SentenceInfo(id=" + this.f90100a + ", topic_id=" + this.f90101b + ", chn_mean_id=" + this.f90102c + ", sentence=" + this.f90103d + ", sentence_trans=" + this.f90104e + ", highlight_phrase=" + this.f90105f + ", img_uri=" + this.f90106g + ", audio_uri=" + this.f90107h + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90099j.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSentenceInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceInfo.kt\ncom/baicizhan/biz/online/resource_api/SentenceInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n1#2:290\n*E\n"})
    public static final class a implements ts.f<k> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f90108a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f90109b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f90110c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f90111d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f90112e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f90113f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f90114g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f90115h;

        public a() {
            this.f90108a = null;
            this.f90109b = null;
            this.f90110c = null;
            this.f90111d = null;
            this.f90112e = null;
            this.f90113f = null;
            this.f90114g = null;
            this.f90115h = null;
        }

        @m80.k
        public final a a(@m80.l String str) {
            this.f90115h = str;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k build() {
            Long l11 = this.f90108a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            long longValue = l11.longValue();
            Integer num = this.f90109b;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Long l12 = this.f90110c;
            if (l12 == null) {
                throw new IllegalStateException("Required field 'chn_mean_id' is missing");
            }
            long longValue2 = l12.longValue();
            String str = this.f90111d;
            if (str == null) {
                throw new IllegalStateException("Required field 'sentence' is missing");
            }
            String str2 = this.f90112e;
            if (str2 != null) {
                return new k(longValue, intValue, longValue2, str, str2, this.f90113f, this.f90114g, this.f90115h);
            }
            throw new IllegalStateException("Required field 'sentence_trans' is missing");
        }

        @m80.k
        public final a c(long j11) {
            this.f90110c = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a d(@m80.l String str) {
            this.f90113f = str;
            return this;
        }

        @m80.k
        public final a e(long j11) {
            this.f90108a = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a f(@m80.l String str) {
            this.f90114g = str;
            return this;
        }

        @m80.k
        public final a g(@m80.k String sentence) {
            g0.p(sentence, "sentence");
            this.f90111d = sentence;
            return this;
        }

        @m80.k
        public final a h(@m80.k String sentence_trans) {
            g0.p(sentence_trans, "sentence_trans");
            this.f90112e = sentence_trans;
            return this;
        }

        @m80.k
        public final a i(int i11) {
            this.f90109b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90108a = null;
            this.f90109b = null;
            this.f90110c = null;
            this.f90111d = null;
            this.f90112e = null;
            this.f90113f = null;
            this.f90114g = null;
            this.f90115h = null;
        }

        public a(@m80.k k source) {
            g0.p(source, "source");
            this.f90108a = Long.valueOf(source.f90100a);
            this.f90109b = Integer.valueOf(source.f90101b);
            this.f90110c = Long.valueOf(source.f90102c);
            this.f90111d = source.f90103d;
            this.f90112e = source.f90104e;
            this.f90113f = source.f90105f;
            this.f90114g = source.f90106g;
            this.f90115h = source.f90107h;
        }
    }
}
