package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class r implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f101937f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<r, a> f101938g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101939a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101940b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101941c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101942d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101943e;

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
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r read(@m80.k ws.i protocol, @m80.k a builder) {
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
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    at.b.a(protocol, b11);
                                } else if (b11 == 11) {
                                    builder.b(protocol.readString());
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 11) {
                                builder.e(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.c(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.d(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.f(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k r struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("ExamPreparation");
            protocol.Q6("userType", 1, (byte) 8);
            protocol.l5(struct.f101939a);
            protocol.N2();
            protocol.Q6("questionnaireUrl", 2, (byte) 11);
            protocol.p1(struct.f101940b);
            protocol.N2();
            protocol.Q6("newStudyUrl", 3, (byte) 11);
            protocol.p1(struct.f101941c);
            protocol.N2();
            protocol.Q6("reviewUrl", 4, (byte) 11);
            protocol.p1(struct.f101942d);
            protocol.N2();
            protocol.Q6("generalReviewUrl", 5, (byte) 11);
            protocol.p1(struct.f101943e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public r(int i11, @m80.k String questionnaireUrl, @m80.k String newStudyUrl, @m80.k String reviewUrl, @m80.k String generalReviewUrl) {
        kotlin.jvm.internal.g0.p(questionnaireUrl, "questionnaireUrl");
        kotlin.jvm.internal.g0.p(newStudyUrl, "newStudyUrl");
        kotlin.jvm.internal.g0.p(reviewUrl, "reviewUrl");
        kotlin.jvm.internal.g0.p(generalReviewUrl, "generalReviewUrl");
        this.f101939a = i11;
        this.f101940b = questionnaireUrl;
        this.f101941c = newStudyUrl;
        this.f101942d = reviewUrl;
        this.f101943e = generalReviewUrl;
    }

    public static /* synthetic */ r g(r rVar, int i11, String str, String str2, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = rVar.f101939a;
        }
        if ((i12 & 2) != 0) {
            str = rVar.f101940b;
        }
        if ((i12 & 4) != 0) {
            str2 = rVar.f101941c;
        }
        if ((i12 & 8) != 0) {
            str3 = rVar.f101942d;
        }
        if ((i12 & 16) != 0) {
            str4 = rVar.f101943e;
        }
        String str5 = str4;
        String str6 = str2;
        return rVar.f(i11, str, str6, str3, str5);
    }

    public final int a() {
        return this.f101939a;
    }

    @m80.k
    public final String b() {
        return this.f101940b;
    }

    @m80.k
    public final String c() {
        return this.f101941c;
    }

    @m80.k
    public final String d() {
        return this.f101942d;
    }

    @m80.k
    public final String e() {
        return this.f101943e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f101939a == rVar.f101939a && kotlin.jvm.internal.g0.g(this.f101940b, rVar.f101940b) && kotlin.jvm.internal.g0.g(this.f101941c, rVar.f101941c) && kotlin.jvm.internal.g0.g(this.f101942d, rVar.f101942d) && kotlin.jvm.internal.g0.g(this.f101943e, rVar.f101943e);
    }

    @m80.k
    public final r f(int i11, @m80.k String questionnaireUrl, @m80.k String newStudyUrl, @m80.k String reviewUrl, @m80.k String generalReviewUrl) {
        kotlin.jvm.internal.g0.p(questionnaireUrl, "questionnaireUrl");
        kotlin.jvm.internal.g0.p(newStudyUrl, "newStudyUrl");
        kotlin.jvm.internal.g0.p(reviewUrl, "reviewUrl");
        kotlin.jvm.internal.g0.p(generalReviewUrl, "generalReviewUrl");
        return new r(i11, questionnaireUrl, newStudyUrl, reviewUrl, generalReviewUrl);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f101939a) * 31) + this.f101940b.hashCode()) * 31) + this.f101941c.hashCode()) * 31) + this.f101942d.hashCode()) * 31) + this.f101943e.hashCode();
    }

    @m80.k
    public String toString() {
        return "ExamPreparation(userType=" + this.f101939a + ", questionnaireUrl=" + this.f101940b + ", newStudyUrl=" + this.f101941c + ", reviewUrl=" + this.f101942d + ", generalReviewUrl=" + this.f101943e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101938g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nExamPreparation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExamPreparation.kt\ncom/baicizhan/biz/online/user_study_api/ExamPreparation$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
    public static final class a implements ts.f<r> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101944a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101945b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f101946c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f101947d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f101948e;

        public a() {
            this.f101944a = null;
            this.f101945b = null;
            this.f101946c = null;
            this.f101947d = null;
            this.f101948e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r build() {
            Integer num = this.f101944a;
            if (num == null) {
                throw new IllegalStateException("Required field 'userType' is missing");
            }
            int intValue = num.intValue();
            String str = this.f101945b;
            if (str == null) {
                throw new IllegalStateException("Required field 'questionnaireUrl' is missing");
            }
            String str2 = this.f101946c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'newStudyUrl' is missing");
            }
            String str3 = this.f101947d;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'reviewUrl' is missing");
            }
            String str4 = this.f101948e;
            if (str4 != null) {
                return new r(intValue, str, str2, str3, str4);
            }
            throw new IllegalStateException("Required field 'generalReviewUrl' is missing");
        }

        @m80.k
        public final a b(@m80.k String generalReviewUrl) {
            kotlin.jvm.internal.g0.p(generalReviewUrl, "generalReviewUrl");
            this.f101948e = generalReviewUrl;
            return this;
        }

        @m80.k
        public final a c(@m80.k String newStudyUrl) {
            kotlin.jvm.internal.g0.p(newStudyUrl, "newStudyUrl");
            this.f101946c = newStudyUrl;
            return this;
        }

        @m80.k
        public final a d(@m80.k String questionnaireUrl) {
            kotlin.jvm.internal.g0.p(questionnaireUrl, "questionnaireUrl");
            this.f101945b = questionnaireUrl;
            return this;
        }

        @m80.k
        public final a e(@m80.k String reviewUrl) {
            kotlin.jvm.internal.g0.p(reviewUrl, "reviewUrl");
            this.f101947d = reviewUrl;
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f101944a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101944a = null;
            this.f101945b = null;
            this.f101946c = null;
            this.f101947d = null;
            this.f101948e = null;
        }

        public a(@m80.k r source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101944a = Integer.valueOf(source.f101939a);
            this.f101945b = source.f101940b;
            this.f101946c = source.f101941c;
            this.f101947d = source.f101942d;
            this.f101948e = source.f101943e;
        }
    }
}
