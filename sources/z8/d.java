package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final c f101401g = new c(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<d, a> f101402h = new b();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101403a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101404b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101405c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101406d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101407e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final int f101408f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements ts.a<d, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d read(@m80.k ws.i protocol, @m80.k a builder) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(builder, "builder");
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
                            builder.d(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k d struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("CalendarDailyWord");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f101403a);
            protocol.N2();
            protocol.Q6("word", 2, (byte) 11);
            protocol.p1(struct.f101404b);
            protocol.N2();
            protocol.Q6(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, 3, (byte) 11);
            protocol.p1(struct.f101405c);
            protocol.N2();
            protocol.Q6("accent", 4, (byte) 11);
            protocol.p1(struct.f101406d);
            protocol.N2();
            protocol.Q6("audio_uri", 5, (byte) 11);
            protocol.p1(struct.f101407e);
            protocol.N2();
            protocol.Q6(ma.b.f72894c, 6, (byte) 8);
            protocol.l5(struct.f101408f);
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

    public d(int i11, @m80.k String word, @m80.k String mean, @m80.k String accent, @m80.k String audio_uri, int i12) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(accent, "accent");
        kotlin.jvm.internal.g0.p(audio_uri, "audio_uri");
        this.f101403a = i11;
        this.f101404b = word;
        this.f101405c = mean;
        this.f101406d = accent;
        this.f101407e = audio_uri;
        this.f101408f = i12;
    }

    public static /* synthetic */ d h(d dVar, int i11, String str, String str2, String str3, String str4, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = dVar.f101403a;
        }
        if ((i13 & 2) != 0) {
            str = dVar.f101404b;
        }
        if ((i13 & 4) != 0) {
            str2 = dVar.f101405c;
        }
        if ((i13 & 8) != 0) {
            str3 = dVar.f101406d;
        }
        if ((i13 & 16) != 0) {
            str4 = dVar.f101407e;
        }
        if ((i13 & 32) != 0) {
            i12 = dVar.f101408f;
        }
        String str5 = str4;
        int i14 = i12;
        return dVar.g(i11, str, str2, str3, str5, i14);
    }

    public final int a() {
        return this.f101403a;
    }

    @m80.k
    public final String b() {
        return this.f101404b;
    }

    @m80.k
    public final String c() {
        return this.f101405c;
    }

    @m80.k
    public final String d() {
        return this.f101406d;
    }

    @m80.k
    public final String e() {
        return this.f101407e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f101403a == dVar.f101403a && kotlin.jvm.internal.g0.g(this.f101404b, dVar.f101404b) && kotlin.jvm.internal.g0.g(this.f101405c, dVar.f101405c) && kotlin.jvm.internal.g0.g(this.f101406d, dVar.f101406d) && kotlin.jvm.internal.g0.g(this.f101407e, dVar.f101407e) && this.f101408f == dVar.f101408f;
    }

    public final int f() {
        return this.f101408f;
    }

    @m80.k
    public final d g(int i11, @m80.k String word, @m80.k String mean, @m80.k String accent, @m80.k String audio_uri, int i12) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(accent, "accent");
        kotlin.jvm.internal.g0.p(audio_uri, "audio_uri");
        return new d(i11, word, mean, accent, audio_uri, i12);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f101403a) * 31) + this.f101404b.hashCode()) * 31) + this.f101405c.hashCode()) * 31) + this.f101406d.hashCode()) * 31) + this.f101407e.hashCode()) * 31) + Integer.hashCode(this.f101408f);
    }

    @m80.k
    public String toString() {
        return "CalendarDailyWord(topic_id=" + this.f101403a + ", word=" + this.f101404b + ", mean=" + this.f101405c + ", accent=" + this.f101406d + ", audio_uri=" + this.f101407e + ", word_level_id=" + this.f101408f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101402h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nCalendarDailyWord.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarDailyWord.kt\ncom/baicizhan/biz/online/user_study_api/CalendarDailyWord$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n1#2:221\n*E\n"})
    public static final class a implements ts.f<d> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101409a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101410b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f101411c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f101412d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f101413e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f101414f;

        public a() {
            this.f101409a = null;
            this.f101410b = null;
            this.f101411c = null;
            this.f101412d = null;
            this.f101413e = null;
            this.f101414f = null;
        }

        @m80.k
        public final a a(@m80.k String accent) {
            kotlin.jvm.internal.g0.p(accent, "accent");
            this.f101412d = accent;
            return this;
        }

        @m80.k
        public final a b(@m80.k String audio_uri) {
            kotlin.jvm.internal.g0.p(audio_uri, "audio_uri");
            this.f101413e = audio_uri;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d build() {
            Integer num = this.f101409a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f101410b;
            if (str == null) {
                throw new IllegalStateException("Required field 'word' is missing");
            }
            String str2 = this.f101411c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'mean' is missing");
            }
            String str3 = this.f101412d;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'accent' is missing");
            }
            String str4 = this.f101413e;
            if (str4 == null) {
                throw new IllegalStateException("Required field 'audio_uri' is missing");
            }
            Integer num2 = this.f101414f;
            if (num2 != null) {
                return new d(intValue, str, str2, str3, str4, num2.intValue());
            }
            throw new IllegalStateException("Required field 'word_level_id' is missing");
        }

        @m80.k
        public final a d(@m80.k String mean) {
            kotlin.jvm.internal.g0.p(mean, "mean");
            this.f101411c = mean;
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f101409a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(@m80.k String word) {
            kotlin.jvm.internal.g0.p(word, "word");
            this.f101410b = word;
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f101414f = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101409a = null;
            this.f101410b = null;
            this.f101411c = null;
            this.f101412d = null;
            this.f101413e = null;
            this.f101414f = null;
        }

        public a(@m80.k d source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101409a = Integer.valueOf(source.f101403a);
            this.f101410b = source.f101404b;
            this.f101411c = source.f101405c;
            this.f101412d = source.f101406d;
            this.f101413e = source.f101407e;
            this.f101414f = Integer.valueOf(source.f101408f);
        }
    }
}
