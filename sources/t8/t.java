package t8;

import com.baicizhan.client.business.dataset.provider.a;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class t implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f90260e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<t, a> f90261f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final o f90262a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90263b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90264c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90265d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<t, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            } else if (b11 == 11) {
                                builder.a(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.c(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k t struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("WordListWordMetaV2");
            protocol.Q6("topic_key", 1, (byte) 12);
            o.f90151e.write(protocol, struct.f90262a);
            protocol.N2();
            protocol.Q6("word", 2, (byte) 11);
            protocol.p1(struct.f90263b);
            protocol.N2();
            protocol.Q6(a.e.C0246a.f16184d, 3, (byte) 11);
            protocol.p1(struct.f90264c);
            protocol.N2();
            if (struct.f90265d != null) {
                protocol.Q6("accent_usa_audio_uri", 4, (byte) 11);
                protocol.p1(struct.f90265d);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public t(@m80.k o topic_key, @m80.k String word, @m80.k String mean_cn, @m80.l String str) {
        g0.p(topic_key, "topic_key");
        g0.p(word, "word");
        g0.p(mean_cn, "mean_cn");
        this.f90262a = topic_key;
        this.f90263b = word;
        this.f90264c = mean_cn;
        this.f90265d = str;
    }

    public static /* synthetic */ t f(t tVar, o oVar, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            oVar = tVar.f90262a;
        }
        if ((i11 & 2) != 0) {
            str = tVar.f90263b;
        }
        if ((i11 & 4) != 0) {
            str2 = tVar.f90264c;
        }
        if ((i11 & 8) != 0) {
            str3 = tVar.f90265d;
        }
        return tVar.e(oVar, str, str2, str3);
    }

    @m80.k
    public final o a() {
        return this.f90262a;
    }

    @m80.k
    public final String b() {
        return this.f90263b;
    }

    @m80.k
    public final String c() {
        return this.f90264c;
    }

    @m80.l
    public final String d() {
        return this.f90265d;
    }

    @m80.k
    public final t e(@m80.k o topic_key, @m80.k String word, @m80.k String mean_cn, @m80.l String str) {
        g0.p(topic_key, "topic_key");
        g0.p(word, "word");
        g0.p(mean_cn, "mean_cn");
        return new t(topic_key, word, mean_cn, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return g0.g(this.f90262a, tVar.f90262a) && g0.g(this.f90263b, tVar.f90263b) && g0.g(this.f90264c, tVar.f90264c) && g0.g(this.f90265d, tVar.f90265d);
    }

    public int hashCode() {
        int hashCode = ((((this.f90262a.hashCode() * 31) + this.f90263b.hashCode()) * 31) + this.f90264c.hashCode()) * 31;
        String str = this.f90265d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "WordListWordMetaV2(topic_key=" + this.f90262a + ", word=" + this.f90263b + ", mean_cn=" + this.f90264c + ", accent_usa_audio_uri=" + this.f90265d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90261f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nWordListWordMetaV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordListWordMetaV2.kt\ncom/baicizhan/biz/online/resource_api/WordListWordMetaV2$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
    public static final class a implements ts.f<t> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public o f90266a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f90267b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f90268c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f90269d;

        public a() {
            this.f90266a = null;
            this.f90267b = null;
            this.f90268c = null;
            this.f90269d = null;
        }

        @m80.k
        public final a a(@m80.l String str) {
            this.f90269d = str;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t build() {
            o oVar = this.f90266a;
            if (oVar == null) {
                throw new IllegalStateException("Required field 'topic_key' is missing");
            }
            String str = this.f90267b;
            if (str == null) {
                throw new IllegalStateException("Required field 'word' is missing");
            }
            String str2 = this.f90268c;
            if (str2 != null) {
                return new t(oVar, str, str2, this.f90269d);
            }
            throw new IllegalStateException("Required field 'mean_cn' is missing");
        }

        @m80.k
        public final a c(@m80.k String mean_cn) {
            g0.p(mean_cn, "mean_cn");
            this.f90268c = mean_cn;
            return this;
        }

        @m80.k
        public final a d(@m80.k o topic_key) {
            g0.p(topic_key, "topic_key");
            this.f90266a = topic_key;
            return this;
        }

        @m80.k
        public final a e(@m80.k String word) {
            g0.p(word, "word");
            this.f90267b = word;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90266a = null;
            this.f90267b = null;
            this.f90268c = null;
            this.f90269d = null;
        }

        public a(@m80.k t source) {
            g0.p(source, "source");
            this.f90266a = source.f90262a;
            this.f90267b = source.f90263b;
            this.f90268c = source.f90264c;
            this.f90269d = source.f90265d;
        }
    }
}
