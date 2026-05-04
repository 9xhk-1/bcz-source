package n8;

import com.baicizhan.client.business.dataset.provider.a;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class l implements ts.e {

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public static final c f74758s = new c(null);

    /* renamed from: t, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<l, b> f74759t = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f74760a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74761b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74762c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74763d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74764e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74765f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74766g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74767h;

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74768i;

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74769j;

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74770k;

    /* renamed from: l, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74771l;

    /* renamed from: m, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74772m;

    /* renamed from: n, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74773n;

    /* renamed from: o, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74774o;

    /* renamed from: p, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74775p;

    /* renamed from: q, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74776q;

    /* renamed from: r, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74777r;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<l, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            builder.m(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.p(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.s(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.q(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.r(protocol.readString());
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
                            builder.a(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
                            break;
                        }
                    case 10:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.l(protocol.readString());
                            break;
                        }
                    case 11:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 12:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 13:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
                            break;
                        }
                    case 14:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(protocol.readString());
                            break;
                        }
                    case 15:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.readString());
                            break;
                        }
                    case 16:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.n(protocol.readString());
                            break;
                        }
                    case 17:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
                            break;
                        }
                    case 18:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.o(protocol.readString());
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
            protocol.g6("BBTopicAssetV2");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f74760a);
            protocol.N2();
            protocol.Q6("word", 2, (byte) 11);
            protocol.p1(struct.f74761b);
            protocol.N2();
            protocol.Q6("word_variants", 3, (byte) 11);
            protocol.p1(struct.f74762c);
            protocol.N2();
            protocol.Q6("word_audio", 4, (byte) 11);
            protocol.p1(struct.f74763d);
            protocol.N2();
            protocol.Q6("word_etyma", 5, (byte) 11);
            protocol.p1(struct.f74764e);
            protocol.N2();
            protocol.Q6("image_file", 6, (byte) 11);
            protocol.p1(struct.f74765f);
            protocol.N2();
            protocol.Q6("accent", 7, (byte) 11);
            protocol.p1(struct.f74766g);
            protocol.N2();
            protocol.Q6(a.e.C0246a.f16184d, 8, (byte) 11);
            protocol.p1(struct.f74767h);
            protocol.N2();
            protocol.Q6("mean_en", 9, (byte) 11);
            protocol.p1(struct.f74768i);
            protocol.N2();
            protocol.Q6("short_phrase", 10, (byte) 11);
            protocol.p1(struct.f74769j);
            protocol.N2();
            protocol.Q6("deformation_img", 11, (byte) 11);
            protocol.p1(struct.f74770k);
            protocol.N2();
            protocol.Q6("deformation_desc", 12, (byte) 11);
            protocol.p1(struct.f74771l);
            protocol.N2();
            protocol.Q6("sentence", 13, (byte) 11);
            protocol.p1(struct.f74772m);
            protocol.N2();
            protocol.Q6("sentence_trans", 14, (byte) 11);
            protocol.p1(struct.f74773n);
            protocol.N2();
            protocol.Q6("sentence_audio", 15, (byte) 11);
            protocol.p1(struct.f74774o);
            protocol.N2();
            protocol.Q6("update_flag", 16, (byte) 11);
            protocol.p1(struct.f74775p);
            protocol.N2();
            protocol.Q6("asset_pack_path", 17, (byte) 11);
            protocol.p1(struct.f74776q);
            protocol.N2();
            protocol.Q6(a.i.C0250a.f16201c, 18, (byte) 11);
            protocol.p1(struct.f74777r);
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

    public l(int i11, @m80.k String word, @m80.k String word_variants, @m80.k String word_audio, @m80.k String word_etyma, @m80.k String image_file, @m80.k String accent, @m80.k String mean_cn, @m80.k String mean_en, @m80.k String short_phrase, @m80.k String deformation_img, @m80.k String deformation_desc, @m80.k String sentence, @m80.k String sentence_trans, @m80.k String sentence_audio, @m80.k String update_flag, @m80.k String asset_pack_path, @m80.k String update_flag_md5) {
        g0.p(word, "word");
        g0.p(word_variants, "word_variants");
        g0.p(word_audio, "word_audio");
        g0.p(word_etyma, "word_etyma");
        g0.p(image_file, "image_file");
        g0.p(accent, "accent");
        g0.p(mean_cn, "mean_cn");
        g0.p(mean_en, "mean_en");
        g0.p(short_phrase, "short_phrase");
        g0.p(deformation_img, "deformation_img");
        g0.p(deformation_desc, "deformation_desc");
        g0.p(sentence, "sentence");
        g0.p(sentence_trans, "sentence_trans");
        g0.p(sentence_audio, "sentence_audio");
        g0.p(update_flag, "update_flag");
        g0.p(asset_pack_path, "asset_pack_path");
        g0.p(update_flag_md5, "update_flag_md5");
        this.f74760a = i11;
        this.f74761b = word;
        this.f74762c = word_variants;
        this.f74763d = word_audio;
        this.f74764e = word_etyma;
        this.f74765f = image_file;
        this.f74766g = accent;
        this.f74767h = mean_cn;
        this.f74768i = mean_en;
        this.f74769j = short_phrase;
        this.f74770k = deformation_img;
        this.f74771l = deformation_desc;
        this.f74772m = sentence;
        this.f74773n = sentence_trans;
        this.f74774o = sentence_audio;
        this.f74775p = update_flag;
        this.f74776q = asset_pack_path;
        this.f74777r = update_flag_md5;
    }

    public static /* synthetic */ l t(l lVar, int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i12, Object obj) {
        String str18;
        String str19;
        int i13 = (i12 & 1) != 0 ? lVar.f74760a : i11;
        String str20 = (i12 & 2) != 0 ? lVar.f74761b : str;
        String str21 = (i12 & 4) != 0 ? lVar.f74762c : str2;
        String str22 = (i12 & 8) != 0 ? lVar.f74763d : str3;
        String str23 = (i12 & 16) != 0 ? lVar.f74764e : str4;
        String str24 = (i12 & 32) != 0 ? lVar.f74765f : str5;
        String str25 = (i12 & 64) != 0 ? lVar.f74766g : str6;
        String str26 = (i12 & 128) != 0 ? lVar.f74767h : str7;
        String str27 = (i12 & 256) != 0 ? lVar.f74768i : str8;
        String str28 = (i12 & 512) != 0 ? lVar.f74769j : str9;
        String str29 = (i12 & 1024) != 0 ? lVar.f74770k : str10;
        String str30 = (i12 & 2048) != 0 ? lVar.f74771l : str11;
        String str31 = (i12 & 4096) != 0 ? lVar.f74772m : str12;
        String str32 = (i12 & 8192) != 0 ? lVar.f74773n : str13;
        int i14 = i13;
        String str33 = (i12 & 16384) != 0 ? lVar.f74774o : str14;
        String str34 = (i12 & 32768) != 0 ? lVar.f74775p : str15;
        String str35 = (i12 & 65536) != 0 ? lVar.f74776q : str16;
        if ((i12 & 131072) != 0) {
            str19 = str35;
            str18 = lVar.f74777r;
        } else {
            str18 = str17;
            str19 = str35;
        }
        return lVar.s(i14, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str19, str18);
    }

    public final int a() {
        return this.f74760a;
    }

    @m80.k
    public final String b() {
        return this.f74769j;
    }

    @m80.k
    public final String c() {
        return this.f74770k;
    }

    @m80.k
    public final String d() {
        return this.f74771l;
    }

    @m80.k
    public final String e() {
        return this.f74772m;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f74760a == lVar.f74760a && g0.g(this.f74761b, lVar.f74761b) && g0.g(this.f74762c, lVar.f74762c) && g0.g(this.f74763d, lVar.f74763d) && g0.g(this.f74764e, lVar.f74764e) && g0.g(this.f74765f, lVar.f74765f) && g0.g(this.f74766g, lVar.f74766g) && g0.g(this.f74767h, lVar.f74767h) && g0.g(this.f74768i, lVar.f74768i) && g0.g(this.f74769j, lVar.f74769j) && g0.g(this.f74770k, lVar.f74770k) && g0.g(this.f74771l, lVar.f74771l) && g0.g(this.f74772m, lVar.f74772m) && g0.g(this.f74773n, lVar.f74773n) && g0.g(this.f74774o, lVar.f74774o) && g0.g(this.f74775p, lVar.f74775p) && g0.g(this.f74776q, lVar.f74776q) && g0.g(this.f74777r, lVar.f74777r);
    }

    @m80.k
    public final String f() {
        return this.f74773n;
    }

    @m80.k
    public final String g() {
        return this.f74774o;
    }

    @m80.k
    public final String h() {
        return this.f74775p;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((Integer.hashCode(this.f74760a) * 31) + this.f74761b.hashCode()) * 31) + this.f74762c.hashCode()) * 31) + this.f74763d.hashCode()) * 31) + this.f74764e.hashCode()) * 31) + this.f74765f.hashCode()) * 31) + this.f74766g.hashCode()) * 31) + this.f74767h.hashCode()) * 31) + this.f74768i.hashCode()) * 31) + this.f74769j.hashCode()) * 31) + this.f74770k.hashCode()) * 31) + this.f74771l.hashCode()) * 31) + this.f74772m.hashCode()) * 31) + this.f74773n.hashCode()) * 31) + this.f74774o.hashCode()) * 31) + this.f74775p.hashCode()) * 31) + this.f74776q.hashCode()) * 31) + this.f74777r.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f74776q;
    }

    @m80.k
    public final String j() {
        return this.f74777r;
    }

    @m80.k
    public final String k() {
        return this.f74761b;
    }

    @m80.k
    public final String l() {
        return this.f74762c;
    }

    @m80.k
    public final String m() {
        return this.f74763d;
    }

    @m80.k
    public final String n() {
        return this.f74764e;
    }

    @m80.k
    public final String o() {
        return this.f74765f;
    }

    @m80.k
    public final String p() {
        return this.f74766g;
    }

    @m80.k
    public final String q() {
        return this.f74767h;
    }

    @m80.k
    public final String r() {
        return this.f74768i;
    }

    @m80.k
    public final l s(int i11, @m80.k String word, @m80.k String word_variants, @m80.k String word_audio, @m80.k String word_etyma, @m80.k String image_file, @m80.k String accent, @m80.k String mean_cn, @m80.k String mean_en, @m80.k String short_phrase, @m80.k String deformation_img, @m80.k String deformation_desc, @m80.k String sentence, @m80.k String sentence_trans, @m80.k String sentence_audio, @m80.k String update_flag, @m80.k String asset_pack_path, @m80.k String update_flag_md5) {
        g0.p(word, "word");
        g0.p(word_variants, "word_variants");
        g0.p(word_audio, "word_audio");
        g0.p(word_etyma, "word_etyma");
        g0.p(image_file, "image_file");
        g0.p(accent, "accent");
        g0.p(mean_cn, "mean_cn");
        g0.p(mean_en, "mean_en");
        g0.p(short_phrase, "short_phrase");
        g0.p(deformation_img, "deformation_img");
        g0.p(deformation_desc, "deformation_desc");
        g0.p(sentence, "sentence");
        g0.p(sentence_trans, "sentence_trans");
        g0.p(sentence_audio, "sentence_audio");
        g0.p(update_flag, "update_flag");
        g0.p(asset_pack_path, "asset_pack_path");
        g0.p(update_flag_md5, "update_flag_md5");
        return new l(i11, word, word_variants, word_audio, word_etyma, image_file, accent, mean_cn, mean_en, short_phrase, deformation_img, deformation_desc, sentence, sentence_trans, sentence_audio, update_flag, asset_pack_path, update_flag_md5);
    }

    @m80.k
    public String toString() {
        return "BBTopicAssetV2(topic_id=" + this.f74760a + ", word=" + this.f74761b + ", word_variants=" + this.f74762c + ", word_audio=" + this.f74763d + ", word_etyma=" + this.f74764e + ", image_file=" + this.f74765f + ", accent=" + this.f74766g + ", mean_cn=" + this.f74767h + ", mean_en=" + this.f74768i + ", short_phrase=" + this.f74769j + ", deformation_img=" + this.f74770k + ", deformation_desc=" + this.f74771l + ", sentence=" + this.f74772m + ", sentence_trans=" + this.f74773n + ", sentence_audio=" + this.f74774o + ", update_flag=" + this.f74775p + ", asset_pack_path=" + this.f74776q + ", update_flag_md5=" + this.f74777r + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74759t.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBTopicAssetV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBTopicAssetV2.kt\ncom/baicizhan/biz/online/bs_words/BBTopicAssetV2$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,582:1\n1#2:583\n*E\n"})
    public static final class b implements ts.f<l> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f74778a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f74779b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f74780c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f74781d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f74782e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f74783f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f74784g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f74785h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public String f74786i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public String f74787j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public String f74788k;

        /* renamed from: l, reason: collision with root package name */
        @m80.l
        public String f74789l;

        /* renamed from: m, reason: collision with root package name */
        @m80.l
        public String f74790m;

        /* renamed from: n, reason: collision with root package name */
        @m80.l
        public String f74791n;

        /* renamed from: o, reason: collision with root package name */
        @m80.l
        public String f74792o;

        /* renamed from: p, reason: collision with root package name */
        @m80.l
        public String f74793p;

        /* renamed from: q, reason: collision with root package name */
        @m80.l
        public String f74794q;

        /* renamed from: r, reason: collision with root package name */
        @m80.l
        public String f74795r;

        public b() {
            this.f74778a = null;
            this.f74779b = null;
            this.f74780c = null;
            this.f74781d = null;
            this.f74782e = null;
            this.f74783f = null;
            this.f74784g = null;
            this.f74785h = null;
            this.f74786i = null;
            this.f74787j = null;
            this.f74788k = null;
            this.f74789l = null;
            this.f74790m = null;
            this.f74791n = null;
            this.f74792o = null;
            this.f74793p = null;
            this.f74794q = null;
            this.f74795r = null;
        }

        @m80.k
        public final b a(@m80.k String accent) {
            g0.p(accent, "accent");
            this.f74784g = accent;
            return this;
        }

        @m80.k
        public final b b(@m80.k String asset_pack_path) {
            g0.p(asset_pack_path, "asset_pack_path");
            this.f74794q = asset_pack_path;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public l build() {
            Integer num = this.f74778a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f74779b;
            if (str == null) {
                throw new IllegalStateException("Required field 'word' is missing");
            }
            String str2 = this.f74780c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'word_variants' is missing");
            }
            String str3 = this.f74781d;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'word_audio' is missing");
            }
            String str4 = this.f74782e;
            if (str4 == null) {
                throw new IllegalStateException("Required field 'word_etyma' is missing");
            }
            String str5 = this.f74783f;
            if (str5 == null) {
                throw new IllegalStateException("Required field 'image_file' is missing");
            }
            String str6 = this.f74784g;
            if (str6 == null) {
                throw new IllegalStateException("Required field 'accent' is missing");
            }
            String str7 = this.f74785h;
            if (str7 == null) {
                throw new IllegalStateException("Required field 'mean_cn' is missing");
            }
            String str8 = this.f74786i;
            if (str8 == null) {
                throw new IllegalStateException("Required field 'mean_en' is missing");
            }
            String str9 = this.f74787j;
            if (str9 == null) {
                throw new IllegalStateException("Required field 'short_phrase' is missing");
            }
            String str10 = this.f74788k;
            if (str10 == null) {
                throw new IllegalStateException("Required field 'deformation_img' is missing");
            }
            String str11 = this.f74789l;
            if (str11 == null) {
                throw new IllegalStateException("Required field 'deformation_desc' is missing");
            }
            String str12 = this.f74790m;
            if (str12 == null) {
                throw new IllegalStateException("Required field 'sentence' is missing");
            }
            String str13 = this.f74791n;
            if (str13 == null) {
                throw new IllegalStateException("Required field 'sentence_trans' is missing");
            }
            String str14 = this.f74792o;
            if (str14 == null) {
                throw new IllegalStateException("Required field 'sentence_audio' is missing");
            }
            String str15 = this.f74793p;
            if (str15 == null) {
                throw new IllegalStateException("Required field 'update_flag' is missing");
            }
            String str16 = this.f74794q;
            if (str16 == null) {
                throw new IllegalStateException("Required field 'asset_pack_path' is missing");
            }
            String str17 = this.f74795r;
            if (str17 != null) {
                return new l(intValue, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
            }
            throw new IllegalStateException("Required field 'update_flag_md5' is missing");
        }

        @m80.k
        public final b d(@m80.k String deformation_desc) {
            g0.p(deformation_desc, "deformation_desc");
            this.f74789l = deformation_desc;
            return this;
        }

        @m80.k
        public final b e(@m80.k String deformation_img) {
            g0.p(deformation_img, "deformation_img");
            this.f74788k = deformation_img;
            return this;
        }

        @m80.k
        public final b f(@m80.k String image_file) {
            g0.p(image_file, "image_file");
            this.f74783f = image_file;
            return this;
        }

        @m80.k
        public final b g(@m80.k String mean_cn) {
            g0.p(mean_cn, "mean_cn");
            this.f74785h = mean_cn;
            return this;
        }

        @m80.k
        public final b h(@m80.k String mean_en) {
            g0.p(mean_en, "mean_en");
            this.f74786i = mean_en;
            return this;
        }

        @m80.k
        public final b i(@m80.k String sentence) {
            g0.p(sentence, "sentence");
            this.f74790m = sentence;
            return this;
        }

        @m80.k
        public final b j(@m80.k String sentence_audio) {
            g0.p(sentence_audio, "sentence_audio");
            this.f74792o = sentence_audio;
            return this;
        }

        @m80.k
        public final b k(@m80.k String sentence_trans) {
            g0.p(sentence_trans, "sentence_trans");
            this.f74791n = sentence_trans;
            return this;
        }

        @m80.k
        public final b l(@m80.k String short_phrase) {
            g0.p(short_phrase, "short_phrase");
            this.f74787j = short_phrase;
            return this;
        }

        @m80.k
        public final b m(int i11) {
            this.f74778a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b n(@m80.k String update_flag) {
            g0.p(update_flag, "update_flag");
            this.f74793p = update_flag;
            return this;
        }

        @m80.k
        public final b o(@m80.k String update_flag_md5) {
            g0.p(update_flag_md5, "update_flag_md5");
            this.f74795r = update_flag_md5;
            return this;
        }

        @m80.k
        public final b p(@m80.k String word) {
            g0.p(word, "word");
            this.f74779b = word;
            return this;
        }

        @m80.k
        public final b q(@m80.k String word_audio) {
            g0.p(word_audio, "word_audio");
            this.f74781d = word_audio;
            return this;
        }

        @m80.k
        public final b r(@m80.k String word_etyma) {
            g0.p(word_etyma, "word_etyma");
            this.f74782e = word_etyma;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74778a = null;
            this.f74779b = null;
            this.f74780c = null;
            this.f74781d = null;
            this.f74782e = null;
            this.f74783f = null;
            this.f74784g = null;
            this.f74785h = null;
            this.f74786i = null;
            this.f74787j = null;
            this.f74788k = null;
            this.f74789l = null;
            this.f74790m = null;
            this.f74791n = null;
            this.f74792o = null;
            this.f74793p = null;
            this.f74794q = null;
            this.f74795r = null;
        }

        @m80.k
        public final b s(@m80.k String word_variants) {
            g0.p(word_variants, "word_variants");
            this.f74780c = word_variants;
            return this;
        }

        public b(@m80.k l source) {
            g0.p(source, "source");
            this.f74778a = Integer.valueOf(source.f74760a);
            this.f74779b = source.f74761b;
            this.f74780c = source.f74762c;
            this.f74781d = source.f74763d;
            this.f74782e = source.f74764e;
            this.f74783f = source.f74765f;
            this.f74784g = source.f74766g;
            this.f74785h = source.f74767h;
            this.f74786i = source.f74768i;
            this.f74787j = source.f74769j;
            this.f74788k = source.f74770k;
            this.f74789l = source.f74771l;
            this.f74790m = source.f74772m;
            this.f74791n = source.f74773n;
            this.f74792o = source.f74774o;
            this.f74793p = source.f74775p;
            this.f74794q = source.f74776q;
            this.f74795r = source.f74777r;
        }
    }
}
