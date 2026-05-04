package n8;

import com.baicizhan.client.business.dataset.provider.a;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k implements ts.e {

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public static final c f74722r = new c(null);

    /* renamed from: s, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<k, b> f74723s = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f74724a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74725b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74726c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74727d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74728e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74729f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74730g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74731h;

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74732i;

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74733j;

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74734k;

    /* renamed from: l, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74735l;

    /* renamed from: m, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74736m;

    /* renamed from: n, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74737n;

    /* renamed from: o, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74738o;

    /* renamed from: p, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74739p;

    /* renamed from: q, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74740q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<k, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            builder.o(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.r(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.p(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.q(protocol.readString());
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
            protocol.g6("BBTopicAsset");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f74724a);
            protocol.N2();
            protocol.Q6("word", 2, (byte) 11);
            protocol.p1(struct.f74725b);
            protocol.N2();
            protocol.Q6("word_variants", 3, (byte) 11);
            protocol.p1(struct.f74726c);
            protocol.N2();
            protocol.Q6("word_audio", 4, (byte) 11);
            protocol.p1(struct.f74727d);
            protocol.N2();
            protocol.Q6("word_etyma", 5, (byte) 11);
            protocol.p1(struct.f74728e);
            protocol.N2();
            protocol.Q6("image_file", 6, (byte) 11);
            protocol.p1(struct.f74729f);
            protocol.N2();
            protocol.Q6("accent", 7, (byte) 11);
            protocol.p1(struct.f74730g);
            protocol.N2();
            protocol.Q6(a.e.C0246a.f16184d, 8, (byte) 11);
            protocol.p1(struct.f74731h);
            protocol.N2();
            protocol.Q6("mean_en", 9, (byte) 11);
            protocol.p1(struct.f74732i);
            protocol.N2();
            protocol.Q6("short_phrase", 10, (byte) 11);
            protocol.p1(struct.f74733j);
            protocol.N2();
            protocol.Q6("deformation_img", 11, (byte) 11);
            protocol.p1(struct.f74734k);
            protocol.N2();
            protocol.Q6("deformation_desc", 12, (byte) 11);
            protocol.p1(struct.f74735l);
            protocol.N2();
            protocol.Q6("sentence", 13, (byte) 11);
            protocol.p1(struct.f74736m);
            protocol.N2();
            protocol.Q6("sentence_trans", 14, (byte) 11);
            protocol.p1(struct.f74737n);
            protocol.N2();
            protocol.Q6("sentence_audio", 15, (byte) 11);
            protocol.p1(struct.f74738o);
            protocol.N2();
            protocol.Q6("update_flag", 16, (byte) 11);
            protocol.p1(struct.f74739p);
            protocol.N2();
            protocol.Q6("asset_pack_path", 17, (byte) 11);
            protocol.p1(struct.f74740q);
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

    public k(int i11, @m80.k String word, @m80.k String word_variants, @m80.k String word_audio, @m80.k String word_etyma, @m80.k String image_file, @m80.k String accent, @m80.k String mean_cn, @m80.k String mean_en, @m80.k String short_phrase, @m80.k String deformation_img, @m80.k String deformation_desc, @m80.k String sentence, @m80.k String sentence_trans, @m80.k String sentence_audio, @m80.k String update_flag, @m80.k String asset_pack_path) {
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
        this.f74724a = i11;
        this.f74725b = word;
        this.f74726c = word_variants;
        this.f74727d = word_audio;
        this.f74728e = word_etyma;
        this.f74729f = image_file;
        this.f74730g = accent;
        this.f74731h = mean_cn;
        this.f74732i = mean_en;
        this.f74733j = short_phrase;
        this.f74734k = deformation_img;
        this.f74735l = deformation_desc;
        this.f74736m = sentence;
        this.f74737n = sentence_trans;
        this.f74738o = sentence_audio;
        this.f74739p = update_flag;
        this.f74740q = asset_pack_path;
    }

    public static /* synthetic */ k s(k kVar, int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i12, Object obj) {
        String str17;
        String str18;
        int i13;
        k kVar2;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        int i14 = (i12 & 1) != 0 ? kVar.f74724a : i11;
        String str33 = (i12 & 2) != 0 ? kVar.f74725b : str;
        String str34 = (i12 & 4) != 0 ? kVar.f74726c : str2;
        String str35 = (i12 & 8) != 0 ? kVar.f74727d : str3;
        String str36 = (i12 & 16) != 0 ? kVar.f74728e : str4;
        String str37 = (i12 & 32) != 0 ? kVar.f74729f : str5;
        String str38 = (i12 & 64) != 0 ? kVar.f74730g : str6;
        String str39 = (i12 & 128) != 0 ? kVar.f74731h : str7;
        String str40 = (i12 & 256) != 0 ? kVar.f74732i : str8;
        String str41 = (i12 & 512) != 0 ? kVar.f74733j : str9;
        String str42 = (i12 & 1024) != 0 ? kVar.f74734k : str10;
        String str43 = (i12 & 2048) != 0 ? kVar.f74735l : str11;
        String str44 = (i12 & 4096) != 0 ? kVar.f74736m : str12;
        String str45 = (i12 & 8192) != 0 ? kVar.f74737n : str13;
        int i15 = i14;
        String str46 = (i12 & 16384) != 0 ? kVar.f74738o : str14;
        String str47 = (i12 & 32768) != 0 ? kVar.f74739p : str15;
        if ((i12 & 65536) != 0) {
            str18 = str47;
            str17 = kVar.f74740q;
            str19 = str46;
            str20 = str33;
            str21 = str34;
            str22 = str35;
            str23 = str36;
            str24 = str37;
            str25 = str38;
            str26 = str39;
            str27 = str40;
            str28 = str41;
            str29 = str42;
            str30 = str43;
            str31 = str44;
            str32 = str45;
            i13 = i15;
            kVar2 = kVar;
        } else {
            str17 = str16;
            str18 = str47;
            i13 = i15;
            kVar2 = kVar;
            str19 = str46;
            str20 = str33;
            str21 = str34;
            str22 = str35;
            str23 = str36;
            str24 = str37;
            str25 = str38;
            str26 = str39;
            str27 = str40;
            str28 = str41;
            str29 = str42;
            str30 = str43;
            str31 = str44;
            str32 = str45;
        }
        return kVar2.r(i13, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str19, str18, str17);
    }

    public final int a() {
        return this.f74724a;
    }

    @m80.k
    public final String b() {
        return this.f74733j;
    }

    @m80.k
    public final String c() {
        return this.f74734k;
    }

    @m80.k
    public final String d() {
        return this.f74735l;
    }

    @m80.k
    public final String e() {
        return this.f74736m;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f74724a == kVar.f74724a && g0.g(this.f74725b, kVar.f74725b) && g0.g(this.f74726c, kVar.f74726c) && g0.g(this.f74727d, kVar.f74727d) && g0.g(this.f74728e, kVar.f74728e) && g0.g(this.f74729f, kVar.f74729f) && g0.g(this.f74730g, kVar.f74730g) && g0.g(this.f74731h, kVar.f74731h) && g0.g(this.f74732i, kVar.f74732i) && g0.g(this.f74733j, kVar.f74733j) && g0.g(this.f74734k, kVar.f74734k) && g0.g(this.f74735l, kVar.f74735l) && g0.g(this.f74736m, kVar.f74736m) && g0.g(this.f74737n, kVar.f74737n) && g0.g(this.f74738o, kVar.f74738o) && g0.g(this.f74739p, kVar.f74739p) && g0.g(this.f74740q, kVar.f74740q);
    }

    @m80.k
    public final String f() {
        return this.f74737n;
    }

    @m80.k
    public final String g() {
        return this.f74738o;
    }

    @m80.k
    public final String h() {
        return this.f74739p;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((Integer.hashCode(this.f74724a) * 31) + this.f74725b.hashCode()) * 31) + this.f74726c.hashCode()) * 31) + this.f74727d.hashCode()) * 31) + this.f74728e.hashCode()) * 31) + this.f74729f.hashCode()) * 31) + this.f74730g.hashCode()) * 31) + this.f74731h.hashCode()) * 31) + this.f74732i.hashCode()) * 31) + this.f74733j.hashCode()) * 31) + this.f74734k.hashCode()) * 31) + this.f74735l.hashCode()) * 31) + this.f74736m.hashCode()) * 31) + this.f74737n.hashCode()) * 31) + this.f74738o.hashCode()) * 31) + this.f74739p.hashCode()) * 31) + this.f74740q.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f74740q;
    }

    @m80.k
    public final String j() {
        return this.f74725b;
    }

    @m80.k
    public final String k() {
        return this.f74726c;
    }

    @m80.k
    public final String l() {
        return this.f74727d;
    }

    @m80.k
    public final String m() {
        return this.f74728e;
    }

    @m80.k
    public final String n() {
        return this.f74729f;
    }

    @m80.k
    public final String o() {
        return this.f74730g;
    }

    @m80.k
    public final String p() {
        return this.f74731h;
    }

    @m80.k
    public final String q() {
        return this.f74732i;
    }

    @m80.k
    public final k r(int i11, @m80.k String word, @m80.k String word_variants, @m80.k String word_audio, @m80.k String word_etyma, @m80.k String image_file, @m80.k String accent, @m80.k String mean_cn, @m80.k String mean_en, @m80.k String short_phrase, @m80.k String deformation_img, @m80.k String deformation_desc, @m80.k String sentence, @m80.k String sentence_trans, @m80.k String sentence_audio, @m80.k String update_flag, @m80.k String asset_pack_path) {
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
        return new k(i11, word, word_variants, word_audio, word_etyma, image_file, accent, mean_cn, mean_en, short_phrase, deformation_img, deformation_desc, sentence, sentence_trans, sentence_audio, update_flag, asset_pack_path);
    }

    @m80.k
    public String toString() {
        return "BBTopicAsset(topic_id=" + this.f74724a + ", word=" + this.f74725b + ", word_variants=" + this.f74726c + ", word_audio=" + this.f74727d + ", word_etyma=" + this.f74728e + ", image_file=" + this.f74729f + ", accent=" + this.f74730g + ", mean_cn=" + this.f74731h + ", mean_en=" + this.f74732i + ", short_phrase=" + this.f74733j + ", deformation_img=" + this.f74734k + ", deformation_desc=" + this.f74735l + ", sentence=" + this.f74736m + ", sentence_trans=" + this.f74737n + ", sentence_audio=" + this.f74738o + ", update_flag=" + this.f74739p + ", asset_pack_path=" + this.f74740q + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74723s.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBTopicAsset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBTopicAsset.kt\ncom/baicizhan/biz/online/bs_words/BBTopicAsset$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,555:1\n1#2:556\n*E\n"})
    public static final class b implements ts.f<k> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f74741a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f74742b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f74743c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f74744d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f74745e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f74746f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f74747g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f74748h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public String f74749i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public String f74750j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public String f74751k;

        /* renamed from: l, reason: collision with root package name */
        @m80.l
        public String f74752l;

        /* renamed from: m, reason: collision with root package name */
        @m80.l
        public String f74753m;

        /* renamed from: n, reason: collision with root package name */
        @m80.l
        public String f74754n;

        /* renamed from: o, reason: collision with root package name */
        @m80.l
        public String f74755o;

        /* renamed from: p, reason: collision with root package name */
        @m80.l
        public String f74756p;

        /* renamed from: q, reason: collision with root package name */
        @m80.l
        public String f74757q;

        public b() {
            this.f74741a = null;
            this.f74742b = null;
            this.f74743c = null;
            this.f74744d = null;
            this.f74745e = null;
            this.f74746f = null;
            this.f74747g = null;
            this.f74748h = null;
            this.f74749i = null;
            this.f74750j = null;
            this.f74751k = null;
            this.f74752l = null;
            this.f74753m = null;
            this.f74754n = null;
            this.f74755o = null;
            this.f74756p = null;
            this.f74757q = null;
        }

        @m80.k
        public final b a(@m80.k String accent) {
            g0.p(accent, "accent");
            this.f74747g = accent;
            return this;
        }

        @m80.k
        public final b b(@m80.k String asset_pack_path) {
            g0.p(asset_pack_path, "asset_pack_path");
            this.f74757q = asset_pack_path;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public k build() {
            Integer num = this.f74741a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f74742b;
            if (str == null) {
                throw new IllegalStateException("Required field 'word' is missing");
            }
            String str2 = this.f74743c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'word_variants' is missing");
            }
            String str3 = this.f74744d;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'word_audio' is missing");
            }
            String str4 = this.f74745e;
            if (str4 == null) {
                throw new IllegalStateException("Required field 'word_etyma' is missing");
            }
            String str5 = this.f74746f;
            if (str5 == null) {
                throw new IllegalStateException("Required field 'image_file' is missing");
            }
            String str6 = this.f74747g;
            if (str6 == null) {
                throw new IllegalStateException("Required field 'accent' is missing");
            }
            String str7 = this.f74748h;
            if (str7 == null) {
                throw new IllegalStateException("Required field 'mean_cn' is missing");
            }
            String str8 = this.f74749i;
            if (str8 == null) {
                throw new IllegalStateException("Required field 'mean_en' is missing");
            }
            String str9 = this.f74750j;
            if (str9 == null) {
                throw new IllegalStateException("Required field 'short_phrase' is missing");
            }
            String str10 = this.f74751k;
            if (str10 == null) {
                throw new IllegalStateException("Required field 'deformation_img' is missing");
            }
            String str11 = this.f74752l;
            if (str11 == null) {
                throw new IllegalStateException("Required field 'deformation_desc' is missing");
            }
            String str12 = this.f74753m;
            if (str12 == null) {
                throw new IllegalStateException("Required field 'sentence' is missing");
            }
            String str13 = this.f74754n;
            if (str13 == null) {
                throw new IllegalStateException("Required field 'sentence_trans' is missing");
            }
            String str14 = this.f74755o;
            if (str14 == null) {
                throw new IllegalStateException("Required field 'sentence_audio' is missing");
            }
            String str15 = this.f74756p;
            if (str15 == null) {
                throw new IllegalStateException("Required field 'update_flag' is missing");
            }
            String str16 = this.f74757q;
            if (str16 != null) {
                return new k(intValue, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
            }
            throw new IllegalStateException("Required field 'asset_pack_path' is missing");
        }

        @m80.k
        public final b d(@m80.k String deformation_desc) {
            g0.p(deformation_desc, "deformation_desc");
            this.f74752l = deformation_desc;
            return this;
        }

        @m80.k
        public final b e(@m80.k String deformation_img) {
            g0.p(deformation_img, "deformation_img");
            this.f74751k = deformation_img;
            return this;
        }

        @m80.k
        public final b f(@m80.k String image_file) {
            g0.p(image_file, "image_file");
            this.f74746f = image_file;
            return this;
        }

        @m80.k
        public final b g(@m80.k String mean_cn) {
            g0.p(mean_cn, "mean_cn");
            this.f74748h = mean_cn;
            return this;
        }

        @m80.k
        public final b h(@m80.k String mean_en) {
            g0.p(mean_en, "mean_en");
            this.f74749i = mean_en;
            return this;
        }

        @m80.k
        public final b i(@m80.k String sentence) {
            g0.p(sentence, "sentence");
            this.f74753m = sentence;
            return this;
        }

        @m80.k
        public final b j(@m80.k String sentence_audio) {
            g0.p(sentence_audio, "sentence_audio");
            this.f74755o = sentence_audio;
            return this;
        }

        @m80.k
        public final b k(@m80.k String sentence_trans) {
            g0.p(sentence_trans, "sentence_trans");
            this.f74754n = sentence_trans;
            return this;
        }

        @m80.k
        public final b l(@m80.k String short_phrase) {
            g0.p(short_phrase, "short_phrase");
            this.f74750j = short_phrase;
            return this;
        }

        @m80.k
        public final b m(int i11) {
            this.f74741a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b n(@m80.k String update_flag) {
            g0.p(update_flag, "update_flag");
            this.f74756p = update_flag;
            return this;
        }

        @m80.k
        public final b o(@m80.k String word) {
            g0.p(word, "word");
            this.f74742b = word;
            return this;
        }

        @m80.k
        public final b p(@m80.k String word_audio) {
            g0.p(word_audio, "word_audio");
            this.f74744d = word_audio;
            return this;
        }

        @m80.k
        public final b q(@m80.k String word_etyma) {
            g0.p(word_etyma, "word_etyma");
            this.f74745e = word_etyma;
            return this;
        }

        @m80.k
        public final b r(@m80.k String word_variants) {
            g0.p(word_variants, "word_variants");
            this.f74743c = word_variants;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74741a = null;
            this.f74742b = null;
            this.f74743c = null;
            this.f74744d = null;
            this.f74745e = null;
            this.f74746f = null;
            this.f74747g = null;
            this.f74748h = null;
            this.f74749i = null;
            this.f74750j = null;
            this.f74751k = null;
            this.f74752l = null;
            this.f74753m = null;
            this.f74754n = null;
            this.f74755o = null;
            this.f74756p = null;
            this.f74757q = null;
        }

        public b(@m80.k k source) {
            g0.p(source, "source");
            this.f74741a = Integer.valueOf(source.f74724a);
            this.f74742b = source.f74725b;
            this.f74743c = source.f74726c;
            this.f74744d = source.f74727d;
            this.f74745e = source.f74728e;
            this.f74746f = source.f74729f;
            this.f74747g = source.f74730g;
            this.f74748h = source.f74731h;
            this.f74749i = source.f74732i;
            this.f74750j = source.f74733j;
            this.f74751k = source.f74734k;
            this.f74752l = source.f74735l;
            this.f74753m = source.f74736m;
            this.f74754n = source.f74737n;
            this.f74755o = source.f74738o;
            this.f74756p = source.f74739p;
            this.f74757q = source.f74740q;
        }
    }
}
