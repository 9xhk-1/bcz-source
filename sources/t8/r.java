package t8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class r implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final b f90222i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<r, a> f90223j = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f90224a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90225b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90226c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90227d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90228e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90229f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90230g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90231h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<r, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.h(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
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
                            builder.d(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
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
                            builder.g(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k r struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("WordBasicInfo");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f90224a);
            protocol.N2();
            protocol.Q6("word", 2, (byte) 11);
            protocol.p1(struct.f90225b);
            protocol.N2();
            if (struct.f90226c != null) {
                protocol.Q6("accent_usa", 3, (byte) 11);
                protocol.p1(struct.f90226c);
                protocol.N2();
            }
            if (struct.f90227d != null) {
                protocol.Q6("accent_uk", 4, (byte) 11);
                protocol.p1(struct.f90227d);
                protocol.N2();
            }
            if (struct.f90228e != null) {
                protocol.Q6("accent_usa_audio_uri", 5, (byte) 11);
                protocol.p1(struct.f90228e);
                protocol.N2();
            }
            if (struct.f90229f != null) {
                protocol.Q6("accent_uk_audio_uri", 6, (byte) 11);
                protocol.p1(struct.f90229f);
                protocol.N2();
            }
            if (struct.f90230g != null) {
                protocol.Q6("deformation_img_uri", 7, (byte) 11);
                protocol.p1(struct.f90230g);
                protocol.N2();
            }
            if (struct.f90231h != null) {
                protocol.Q6("etyma", 8, (byte) 11);
                protocol.p1(struct.f90231h);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public r(int i11, @m80.k String word, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4, @m80.l String str5, @m80.l String str6) {
        g0.p(word, "word");
        this.f90224a = i11;
        this.f90225b = word;
        this.f90226c = str;
        this.f90227d = str2;
        this.f90228e = str3;
        this.f90229f = str4;
        this.f90230g = str5;
        this.f90231h = str6;
    }

    public static /* synthetic */ r j(r rVar, int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = rVar.f90224a;
        }
        if ((i12 & 2) != 0) {
            str = rVar.f90225b;
        }
        if ((i12 & 4) != 0) {
            str2 = rVar.f90226c;
        }
        if ((i12 & 8) != 0) {
            str3 = rVar.f90227d;
        }
        if ((i12 & 16) != 0) {
            str4 = rVar.f90228e;
        }
        if ((i12 & 32) != 0) {
            str5 = rVar.f90229f;
        }
        if ((i12 & 64) != 0) {
            str6 = rVar.f90230g;
        }
        if ((i12 & 128) != 0) {
            str7 = rVar.f90231h;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return rVar.i(i11, str, str2, str3, str10, str11, str8, str9);
    }

    public final int a() {
        return this.f90224a;
    }

    @m80.k
    public final String b() {
        return this.f90225b;
    }

    @m80.l
    public final String c() {
        return this.f90226c;
    }

    @m80.l
    public final String d() {
        return this.f90227d;
    }

    @m80.l
    public final String e() {
        return this.f90228e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f90224a == rVar.f90224a && g0.g(this.f90225b, rVar.f90225b) && g0.g(this.f90226c, rVar.f90226c) && g0.g(this.f90227d, rVar.f90227d) && g0.g(this.f90228e, rVar.f90228e) && g0.g(this.f90229f, rVar.f90229f) && g0.g(this.f90230g, rVar.f90230g) && g0.g(this.f90231h, rVar.f90231h);
    }

    @m80.l
    public final String f() {
        return this.f90229f;
    }

    @m80.l
    public final String g() {
        return this.f90230g;
    }

    @m80.l
    public final String h() {
        return this.f90231h;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f90224a) * 31) + this.f90225b.hashCode()) * 31;
        String str = this.f90226c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f90227d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f90228e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f90229f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f90230g;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f90231h;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @m80.k
    public final r i(int i11, @m80.k String word, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4, @m80.l String str5, @m80.l String str6) {
        g0.p(word, "word");
        return new r(i11, word, str, str2, str3, str4, str5, str6);
    }

    @m80.k
    public String toString() {
        return "WordBasicInfo(topic_id=" + this.f90224a + ", word=" + this.f90225b + ", accent_usa=" + this.f90226c + ", accent_uk=" + this.f90227d + ", accent_usa_audio_uri=" + this.f90228e + ", accent_uk_audio_uri=" + this.f90229f + ", deformation_img_uri=" + this.f90230g + ", etyma=" + this.f90231h + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90223j.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nWordBasicInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBasicInfo.kt\ncom/baicizhan/biz/online/resource_api/WordBasicInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n1#2:292\n*E\n"})
    public static final class a implements ts.f<r> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f90232a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f90233b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f90234c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f90235d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f90236e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f90237f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f90238g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f90239h;

        public a() {
            this.f90232a = null;
            this.f90233b = null;
            this.f90234c = null;
            this.f90235d = null;
            this.f90236e = null;
            this.f90237f = null;
            this.f90238g = null;
            this.f90239h = null;
        }

        @m80.k
        public final a a(@m80.l String str) {
            this.f90235d = str;
            return this;
        }

        @m80.k
        public final a b(@m80.l String str) {
            this.f90237f = str;
            return this;
        }

        @m80.k
        public final a c(@m80.l String str) {
            this.f90234c = str;
            return this;
        }

        @m80.k
        public final a d(@m80.l String str) {
            this.f90236e = str;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public r build() {
            Integer num = this.f90232a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f90233b;
            if (str != null) {
                return new r(intValue, str, this.f90234c, this.f90235d, this.f90236e, this.f90237f, this.f90238g, this.f90239h);
            }
            throw new IllegalStateException("Required field 'word' is missing");
        }

        @m80.k
        public final a f(@m80.l String str) {
            this.f90238g = str;
            return this;
        }

        @m80.k
        public final a g(@m80.l String str) {
            this.f90239h = str;
            return this;
        }

        @m80.k
        public final a h(int i11) {
            this.f90232a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a i(@m80.k String word) {
            g0.p(word, "word");
            this.f90233b = word;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90232a = null;
            this.f90233b = null;
            this.f90234c = null;
            this.f90235d = null;
            this.f90236e = null;
            this.f90237f = null;
            this.f90238g = null;
            this.f90239h = null;
        }

        public a(@m80.k r source) {
            g0.p(source, "source");
            this.f90232a = Integer.valueOf(source.f90224a);
            this.f90233b = source.f90225b;
            this.f90234c = source.f90226c;
            this.f90235d = source.f90227d;
            this.f90236e = source.f90228e;
            this.f90237f = source.f90229f;
            this.f90238g = source.f90230g;
            this.f90239h = source.f90231h;
        }
    }
}
