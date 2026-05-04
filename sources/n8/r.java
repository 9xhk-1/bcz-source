package n8;

import com.baicizhan.client.business.dataset.provider.a;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class r implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final c f74860f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<r, b> f74861g = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74862a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f74863b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f74864c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74865d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f74866e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<r, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r read(@m80.k ws.i protocol, @m80.k b builder) {
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
                                if (s11 != 5) {
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
                        } else if (b11 == 8) {
                            builder.f(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.d(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.e(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k r struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBWordSearchResult");
            protocol.Q6("word", 1, (byte) 11);
            protocol.p1(struct.f74862a);
            protocol.N2();
            protocol.Q6("topic_id", 2, (byte) 8);
            protocol.l5(struct.f74863b);
            protocol.N2();
            protocol.Q6(ma.b.f72894c, 3, (byte) 8);
            protocol.l5(struct.f74864c);
            protocol.N2();
            protocol.Q6(a.e.C0246a.f16184d, 4, (byte) 11);
            protocol.p1(struct.f74865d);
            protocol.N2();
            if (struct.f74866e != null) {
                protocol.Q6("accent", 5, (byte) 11);
                protocol.p1(struct.f74866e);
                protocol.N2();
            }
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

    public r(@m80.k String word, int i11, int i12, @m80.k String mean_cn, @m80.l String str) {
        g0.p(word, "word");
        g0.p(mean_cn, "mean_cn");
        this.f74862a = word;
        this.f74863b = i11;
        this.f74864c = i12;
        this.f74865d = mean_cn;
        this.f74866e = str;
    }

    public static /* synthetic */ r g(r rVar, String str, int i11, int i12, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = rVar.f74862a;
        }
        if ((i13 & 2) != 0) {
            i11 = rVar.f74863b;
        }
        if ((i13 & 4) != 0) {
            i12 = rVar.f74864c;
        }
        if ((i13 & 8) != 0) {
            str2 = rVar.f74865d;
        }
        if ((i13 & 16) != 0) {
            str3 = rVar.f74866e;
        }
        String str4 = str3;
        int i14 = i12;
        return rVar.f(str, i11, i14, str2, str4);
    }

    @m80.k
    public final String a() {
        return this.f74862a;
    }

    public final int b() {
        return this.f74863b;
    }

    public final int c() {
        return this.f74864c;
    }

    @m80.k
    public final String d() {
        return this.f74865d;
    }

    @m80.l
    public final String e() {
        return this.f74866e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return g0.g(this.f74862a, rVar.f74862a) && this.f74863b == rVar.f74863b && this.f74864c == rVar.f74864c && g0.g(this.f74865d, rVar.f74865d) && g0.g(this.f74866e, rVar.f74866e);
    }

    @m80.k
    public final r f(@m80.k String word, int i11, int i12, @m80.k String mean_cn, @m80.l String str) {
        g0.p(word, "word");
        g0.p(mean_cn, "mean_cn");
        return new r(word, i11, i12, mean_cn, str);
    }

    public int hashCode() {
        int hashCode = ((((((this.f74862a.hashCode() * 31) + Integer.hashCode(this.f74863b)) * 31) + Integer.hashCode(this.f74864c)) * 31) + this.f74865d.hashCode()) * 31;
        String str = this.f74866e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "BBWordSearchResult(word=" + this.f74862a + ", topic_id=" + this.f74863b + ", word_level_id=" + this.f74864c + ", mean_cn=" + this.f74865d + ", accent=" + this.f74866e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74861g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBWordSearchResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBWordSearchResult.kt\ncom/baicizhan/biz/online/bs_words/BBWordSearchResult$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"})
    public static final class b implements ts.f<r> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f74867a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f74868b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f74869c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f74870d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f74871e;

        public b() {
            this.f74867a = null;
            this.f74868b = null;
            this.f74869c = null;
            this.f74870d = null;
            this.f74871e = null;
        }

        @m80.k
        public final b a(@m80.l String str) {
            this.f74871e = str;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r build() {
            String str = this.f74867a;
            if (str == null) {
                throw new IllegalStateException("Required field 'word' is missing");
            }
            Integer num = this.f74868b;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f74869c;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'word_level_id' is missing");
            }
            int intValue2 = num2.intValue();
            String str2 = this.f74870d;
            if (str2 != null) {
                return new r(str, intValue, intValue2, str2, this.f74871e);
            }
            throw new IllegalStateException("Required field 'mean_cn' is missing");
        }

        @m80.k
        public final b c(@m80.k String mean_cn) {
            g0.p(mean_cn, "mean_cn");
            this.f74870d = mean_cn;
            return this;
        }

        @m80.k
        public final b d(int i11) {
            this.f74868b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b e(@m80.k String word) {
            g0.p(word, "word");
            this.f74867a = word;
            return this;
        }

        @m80.k
        public final b f(int i11) {
            this.f74869c = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74867a = null;
            this.f74868b = null;
            this.f74869c = null;
            this.f74870d = null;
            this.f74871e = null;
        }

        public b(@m80.k r source) {
            g0.p(source, "source");
            this.f74867a = source.f74862a;
            this.f74868b = Integer.valueOf(source.f74863b);
            this.f74869c = Integer.valueOf(source.f74864c);
            this.f74870d = source.f74865d;
            this.f74871e = source.f74866e;
        }
    }
}
