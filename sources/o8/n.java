package o8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class n implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f76467g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<n, a> f76468h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f76469a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76470b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76471c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76472d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f76473e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f76474f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
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
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(Long.valueOf(protocol.T1()));
                            break;
                        }
                    case 6:
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
        public void write(@m80.k ws.i protocol, @m80.k n struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("MarkTopicInfo");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f76469a);
            protocol.N2();
            protocol.Q6("word", 2, (byte) 11);
            protocol.p1(struct.f76470b);
            protocol.N2();
            protocol.Q6("audio_url", 3, (byte) 11);
            protocol.p1(struct.f76471c);
            protocol.N2();
            protocol.Q6("cn_means", 4, (byte) 11);
            protocol.p1(struct.f76472d);
            protocol.N2();
            if (struct.f76473e != null) {
                protocol.Q6("word_add_time", 5, (byte) 10);
                protocol.q7(struct.f76473e.longValue());
                protocol.N2();
            }
            if (struct.f76474f != null) {
                protocol.Q6("accent", 6, (byte) 11);
                protocol.p1(struct.f76474f);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public n(int i11, @m80.k String word, @m80.k String audio_url, @m80.k String cn_means, @m80.l Long l11, @m80.l String str) {
        g0.p(word, "word");
        g0.p(audio_url, "audio_url");
        g0.p(cn_means, "cn_means");
        this.f76469a = i11;
        this.f76470b = word;
        this.f76471c = audio_url;
        this.f76472d = cn_means;
        this.f76473e = l11;
        this.f76474f = str;
    }

    public static /* synthetic */ n h(n nVar, int i11, String str, String str2, String str3, Long l11, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = nVar.f76469a;
        }
        if ((i12 & 2) != 0) {
            str = nVar.f76470b;
        }
        if ((i12 & 4) != 0) {
            str2 = nVar.f76471c;
        }
        if ((i12 & 8) != 0) {
            str3 = nVar.f76472d;
        }
        if ((i12 & 16) != 0) {
            l11 = nVar.f76473e;
        }
        if ((i12 & 32) != 0) {
            str4 = nVar.f76474f;
        }
        Long l12 = l11;
        String str5 = str4;
        return nVar.g(i11, str, str2, str3, l12, str5);
    }

    public final int a() {
        return this.f76469a;
    }

    @m80.k
    public final String b() {
        return this.f76470b;
    }

    @m80.k
    public final String c() {
        return this.f76471c;
    }

    @m80.k
    public final String d() {
        return this.f76472d;
    }

    @m80.l
    public final Long e() {
        return this.f76473e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f76469a == nVar.f76469a && g0.g(this.f76470b, nVar.f76470b) && g0.g(this.f76471c, nVar.f76471c) && g0.g(this.f76472d, nVar.f76472d) && g0.g(this.f76473e, nVar.f76473e) && g0.g(this.f76474f, nVar.f76474f);
    }

    @m80.l
    public final String f() {
        return this.f76474f;
    }

    @m80.k
    public final n g(int i11, @m80.k String word, @m80.k String audio_url, @m80.k String cn_means, @m80.l Long l11, @m80.l String str) {
        g0.p(word, "word");
        g0.p(audio_url, "audio_url");
        g0.p(cn_means, "cn_means");
        return new n(i11, word, audio_url, cn_means, l11, str);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f76469a) * 31) + this.f76470b.hashCode()) * 31) + this.f76471c.hashCode()) * 31) + this.f76472d.hashCode()) * 31;
        Long l11 = this.f76473e;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.f76474f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "MarkTopicInfo(topic_id=" + this.f76469a + ", word=" + this.f76470b + ", audio_url=" + this.f76471c + ", cn_means=" + this.f76472d + ", word_add_time=" + this.f76473e + ", accent=" + this.f76474f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76468h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMarkTopicInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkTopicInfo.kt\ncom/baicizhan/biz/online/course_api/MarkTopicInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n1#2:243\n*E\n"})
    public static final class a implements ts.f<n> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f76475a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f76476b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f76477c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f76478d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Long f76479e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f76480f;

        public a() {
            this.f76475a = null;
            this.f76476b = null;
            this.f76477c = null;
            this.f76478d = null;
            this.f76479e = null;
            this.f76480f = null;
        }

        @m80.k
        public final a a(@m80.l String str) {
            this.f76480f = str;
            return this;
        }

        @m80.k
        public final a b(@m80.k String audio_url) {
            g0.p(audio_url, "audio_url");
            this.f76477c = audio_url;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public n build() {
            Integer num = this.f76475a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f76476b;
            if (str == null) {
                throw new IllegalStateException("Required field 'word' is missing");
            }
            String str2 = this.f76477c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'audio_url' is missing");
            }
            String str3 = this.f76478d;
            if (str3 != null) {
                return new n(intValue, str, str2, str3, this.f76479e, this.f76480f);
            }
            throw new IllegalStateException("Required field 'cn_means' is missing");
        }

        @m80.k
        public final a d(@m80.k String cn_means) {
            g0.p(cn_means, "cn_means");
            this.f76478d = cn_means;
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f76475a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(@m80.k String word) {
            g0.p(word, "word");
            this.f76476b = word;
            return this;
        }

        @m80.k
        public final a g(@m80.l Long l11) {
            this.f76479e = l11;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76475a = null;
            this.f76476b = null;
            this.f76477c = null;
            this.f76478d = null;
            this.f76479e = null;
            this.f76480f = null;
        }

        public a(@m80.k n source) {
            g0.p(source, "source");
            this.f76475a = Integer.valueOf(source.f76469a);
            this.f76476b = source.f76470b;
            this.f76477c = source.f76471c;
            this.f76478d = source.f76472d;
            this.f76479e = source.f76473e;
            this.f76480f = source.f76474f;
        }
    }
}
