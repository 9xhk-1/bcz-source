package n8;

import com.baicizhan.client.business.dataset.provider.a;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class p implements ts.e {

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final c f74822k = new c(null);

    /* renamed from: l, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<p, b> f74823l = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f74824a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74825b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74826c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74827d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74828e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74829f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74830g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f74831h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f74832i;

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    public final long f74833j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<p, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            builder.g(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
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
                            builder.e(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(protocol.readString());
                            break;
                        }
                    case 10:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.T1());
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
        public void write(@m80.k ws.i protocol, @m80.k p struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBWordMediaV3");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f74824a);
            protocol.N2();
            protocol.Q6("word", 2, (byte) 11);
            protocol.p1(struct.f74825b);
            protocol.N2();
            protocol.Q6("accent", 3, (byte) 11);
            protocol.p1(struct.f74826c);
            protocol.N2();
            protocol.Q6(a.e.C0246a.f16184d, 4, (byte) 11);
            protocol.p1(struct.f74827d);
            protocol.N2();
            protocol.Q6("sentence", 5, (byte) 11);
            protocol.p1(struct.f74828e);
            protocol.N2();
            protocol.Q6("sentence_trans", 6, (byte) 11);
            protocol.p1(struct.f74829f);
            protocol.N2();
            protocol.Q6(a.v.C0263a.f16322h, 7, (byte) 11);
            protocol.p1(struct.f74830g);
            protocol.N2();
            if (struct.f74831h != null) {
                protocol.Q6(a.v.C0263a.f16323i, 8, (byte) 11);
                protocol.p1(struct.f74831h);
                protocol.N2();
            }
            if (struct.f74832i != null) {
                protocol.Q6("word_audio_path", 9, (byte) 11);
                protocol.p1(struct.f74832i);
                protocol.N2();
            }
            protocol.Q6("created_at", 10, (byte) 10);
            protocol.q7(struct.f74833j);
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

    public p(int i11, @m80.k String word, @m80.k String accent, @m80.k String mean_cn, @m80.k String sentence, @m80.k String sentence_trans, @m80.k String tv_path, @m80.l String str, @m80.l String str2, long j11) {
        g0.p(word, "word");
        g0.p(accent, "accent");
        g0.p(mean_cn, "mean_cn");
        g0.p(sentence, "sentence");
        g0.p(sentence_trans, "sentence_trans");
        g0.p(tv_path, "tv_path");
        this.f74824a = i11;
        this.f74825b = word;
        this.f74826c = accent;
        this.f74827d = mean_cn;
        this.f74828e = sentence;
        this.f74829f = sentence_trans;
        this.f74830g = tv_path;
        this.f74831h = str;
        this.f74832i = str2;
        this.f74833j = j11;
    }

    public static /* synthetic */ p l(p pVar, int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = pVar.f74824a;
        }
        if ((i12 & 2) != 0) {
            str = pVar.f74825b;
        }
        if ((i12 & 4) != 0) {
            str2 = pVar.f74826c;
        }
        if ((i12 & 8) != 0) {
            str3 = pVar.f74827d;
        }
        if ((i12 & 16) != 0) {
            str4 = pVar.f74828e;
        }
        if ((i12 & 32) != 0) {
            str5 = pVar.f74829f;
        }
        if ((i12 & 64) != 0) {
            str6 = pVar.f74830g;
        }
        if ((i12 & 128) != 0) {
            str7 = pVar.f74831h;
        }
        if ((i12 & 256) != 0) {
            str8 = pVar.f74832i;
        }
        if ((i12 & 512) != 0) {
            j11 = pVar.f74833j;
        }
        long j12 = j11;
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        String str13 = str4;
        String str14 = str2;
        return pVar.k(i11, str, str14, str3, str13, str11, str12, str9, str10, j12);
    }

    public final int a() {
        return this.f74824a;
    }

    public final long b() {
        return this.f74833j;
    }

    @m80.k
    public final String c() {
        return this.f74825b;
    }

    @m80.k
    public final String d() {
        return this.f74826c;
    }

    @m80.k
    public final String e() {
        return this.f74827d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f74824a == pVar.f74824a && g0.g(this.f74825b, pVar.f74825b) && g0.g(this.f74826c, pVar.f74826c) && g0.g(this.f74827d, pVar.f74827d) && g0.g(this.f74828e, pVar.f74828e) && g0.g(this.f74829f, pVar.f74829f) && g0.g(this.f74830g, pVar.f74830g) && g0.g(this.f74831h, pVar.f74831h) && g0.g(this.f74832i, pVar.f74832i) && this.f74833j == pVar.f74833j;
    }

    @m80.k
    public final String f() {
        return this.f74828e;
    }

    @m80.k
    public final String g() {
        return this.f74829f;
    }

    @m80.k
    public final String h() {
        return this.f74830g;
    }

    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.f74824a) * 31) + this.f74825b.hashCode()) * 31) + this.f74826c.hashCode()) * 31) + this.f74827d.hashCode()) * 31) + this.f74828e.hashCode()) * 31) + this.f74829f.hashCode()) * 31) + this.f74830g.hashCode()) * 31;
        String str = this.f74831h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f74832i;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.f74833j);
    }

    @m80.l
    public final String i() {
        return this.f74831h;
    }

    @m80.l
    public final String j() {
        return this.f74832i;
    }

    @m80.k
    public final p k(int i11, @m80.k String word, @m80.k String accent, @m80.k String mean_cn, @m80.k String sentence, @m80.k String sentence_trans, @m80.k String tv_path, @m80.l String str, @m80.l String str2, long j11) {
        g0.p(word, "word");
        g0.p(accent, "accent");
        g0.p(mean_cn, "mean_cn");
        g0.p(sentence, "sentence");
        g0.p(sentence_trans, "sentence_trans");
        g0.p(tv_path, "tv_path");
        return new p(i11, word, accent, mean_cn, sentence, sentence_trans, tv_path, str, str2, j11);
    }

    @m80.k
    public String toString() {
        return "BBWordMediaV3(topic_id=" + this.f74824a + ", word=" + this.f74825b + ", accent=" + this.f74826c + ", mean_cn=" + this.f74827d + ", sentence=" + this.f74828e + ", sentence_trans=" + this.f74829f + ", tv_path=" + this.f74830g + ", tv_snapshot_path=" + this.f74831h + ", word_audio_path=" + this.f74832i + ", created_at=" + this.f74833j + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74823l.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBWordMediaV3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBWordMediaV3.kt\ncom/baicizhan/biz/online/bs_words/BBWordMediaV3$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,357:1\n1#2:358\n*E\n"})
    public static final class b implements ts.f<p> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f74834a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f74835b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f74836c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f74837d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f74838e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f74839f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f74840g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f74841h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public String f74842i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public Long f74843j;

        public b() {
            this.f74834a = null;
            this.f74835b = null;
            this.f74836c = null;
            this.f74837d = null;
            this.f74838e = null;
            this.f74839f = null;
            this.f74840g = null;
            this.f74841h = null;
            this.f74842i = null;
            this.f74843j = null;
        }

        @m80.k
        public final b a(@m80.k String accent) {
            g0.p(accent, "accent");
            this.f74836c = accent;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p build() {
            Integer num = this.f74834a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f74835b;
            if (str == null) {
                throw new IllegalStateException("Required field 'word' is missing");
            }
            String str2 = this.f74836c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'accent' is missing");
            }
            String str3 = this.f74837d;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'mean_cn' is missing");
            }
            String str4 = this.f74838e;
            if (str4 == null) {
                throw new IllegalStateException("Required field 'sentence' is missing");
            }
            String str5 = this.f74839f;
            if (str5 == null) {
                throw new IllegalStateException("Required field 'sentence_trans' is missing");
            }
            String str6 = this.f74840g;
            if (str6 == null) {
                throw new IllegalStateException("Required field 'tv_path' is missing");
            }
            String str7 = this.f74841h;
            String str8 = this.f74842i;
            Long l11 = this.f74843j;
            if (l11 != null) {
                return new p(intValue, str, str2, str3, str4, str5, str6, str7, str8, l11.longValue());
            }
            throw new IllegalStateException("Required field 'created_at' is missing");
        }

        @m80.k
        public final b c(long j11) {
            this.f74843j = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final b d(@m80.k String mean_cn) {
            g0.p(mean_cn, "mean_cn");
            this.f74837d = mean_cn;
            return this;
        }

        @m80.k
        public final b e(@m80.k String sentence) {
            g0.p(sentence, "sentence");
            this.f74838e = sentence;
            return this;
        }

        @m80.k
        public final b f(@m80.k String sentence_trans) {
            g0.p(sentence_trans, "sentence_trans");
            this.f74839f = sentence_trans;
            return this;
        }

        @m80.k
        public final b g(int i11) {
            this.f74834a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b h(@m80.k String tv_path) {
            g0.p(tv_path, "tv_path");
            this.f74840g = tv_path;
            return this;
        }

        @m80.k
        public final b i(@m80.l String str) {
            this.f74841h = str;
            return this;
        }

        @m80.k
        public final b j(@m80.k String word) {
            g0.p(word, "word");
            this.f74835b = word;
            return this;
        }

        @m80.k
        public final b k(@m80.l String str) {
            this.f74842i = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74834a = null;
            this.f74835b = null;
            this.f74836c = null;
            this.f74837d = null;
            this.f74838e = null;
            this.f74839f = null;
            this.f74840g = null;
            this.f74841h = null;
            this.f74842i = null;
            this.f74843j = null;
        }

        public b(@m80.k p source) {
            g0.p(source, "source");
            this.f74834a = Integer.valueOf(source.f74824a);
            this.f74835b = source.f74825b;
            this.f74836c = source.f74826c;
            this.f74837d = source.f74827d;
            this.f74838e = source.f74828e;
            this.f74839f = source.f74829f;
            this.f74840g = source.f74830g;
            this.f74841h = source.f74831h;
            this.f74842i = source.f74832i;
            this.f74843j = Long.valueOf(source.f74833j);
        }
    }
}
