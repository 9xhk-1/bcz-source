package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class j1 implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f101657f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<j1, a> f101658g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101659a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101660b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101661c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final long f101662d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101663e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<j1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                } else if (b11 == 8) {
                                    builder.d(Integer.valueOf(protocol.s8()));
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 10) {
                                builder.c(protocol.T1());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.a(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.e(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.f(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k j1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserCollectWordV2");
            protocol.Q6("word", 1, (byte) 11);
            protocol.p1(struct.f101659a);
            protocol.N2();
            protocol.Q6("topic_id", 2, (byte) 8);
            protocol.l5(struct.f101660b);
            protocol.N2();
            protocol.Q6("book_id", 3, (byte) 8);
            protocol.l5(struct.f101661c);
            protocol.N2();
            protocol.Q6("created_at", 4, (byte) 10);
            protocol.q7(struct.f101662d);
            protocol.N2();
            if (struct.f101663e != null) {
                protocol.Q6("tag_id", 5, (byte) 8);
                protocol.l5(struct.f101663e.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public j1(@m80.k String word, int i11, int i12, long j11, @m80.l Integer num) {
        kotlin.jvm.internal.g0.p(word, "word");
        this.f101659a = word;
        this.f101660b = i11;
        this.f101661c = i12;
        this.f101662d = j11;
        this.f101663e = num;
    }

    public static /* synthetic */ j1 g(j1 j1Var, String str, int i11, int i12, long j11, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = j1Var.f101659a;
        }
        if ((i13 & 2) != 0) {
            i11 = j1Var.f101660b;
        }
        if ((i13 & 4) != 0) {
            i12 = j1Var.f101661c;
        }
        if ((i13 & 8) != 0) {
            j11 = j1Var.f101662d;
        }
        if ((i13 & 16) != 0) {
            num = j1Var.f101663e;
        }
        Integer num2 = num;
        int i14 = i12;
        return j1Var.f(str, i11, i14, j11, num2);
    }

    @m80.k
    public final String a() {
        return this.f101659a;
    }

    public final int b() {
        return this.f101660b;
    }

    public final int c() {
        return this.f101661c;
    }

    public final long d() {
        return this.f101662d;
    }

    @m80.l
    public final Integer e() {
        return this.f101663e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return kotlin.jvm.internal.g0.g(this.f101659a, j1Var.f101659a) && this.f101660b == j1Var.f101660b && this.f101661c == j1Var.f101661c && this.f101662d == j1Var.f101662d && kotlin.jvm.internal.g0.g(this.f101663e, j1Var.f101663e);
    }

    @m80.k
    public final j1 f(@m80.k String word, int i11, int i12, long j11, @m80.l Integer num) {
        kotlin.jvm.internal.g0.p(word, "word");
        return new j1(word, i11, i12, j11, num);
    }

    public int hashCode() {
        int hashCode = ((((((this.f101659a.hashCode() * 31) + Integer.hashCode(this.f101660b)) * 31) + Integer.hashCode(this.f101661c)) * 31) + Long.hashCode(this.f101662d)) * 31;
        Integer num = this.f101663e;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @m80.k
    public String toString() {
        return "UserCollectWordV2(word=" + this.f101659a + ", topic_id=" + this.f101660b + ", book_id=" + this.f101661c + ", created_at=" + this.f101662d + ", tag_id=" + this.f101663e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101658g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserCollectWordV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserCollectWordV2.kt\ncom/baicizhan/biz/online/user_study_api/UserCollectWordV2$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,197:1\n1#2:198\n*E\n"})
    public static final class a implements ts.f<j1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f101664a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101665b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101666c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Long f101667d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f101668e;

        public a() {
            this.f101664a = null;
            this.f101665b = null;
            this.f101666c = null;
            this.f101667d = null;
            this.f101668e = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f101666c = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j1 build() {
            String str = this.f101664a;
            if (str == null) {
                throw new IllegalStateException("Required field 'word' is missing");
            }
            Integer num = this.f101665b;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101666c;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue2 = num2.intValue();
            Long l11 = this.f101667d;
            if (l11 != null) {
                return new j1(str, intValue, intValue2, l11.longValue(), this.f101668e);
            }
            throw new IllegalStateException("Required field 'created_at' is missing");
        }

        @m80.k
        public final a c(long j11) {
            this.f101667d = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f101668e = num;
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f101665b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(@m80.k String word) {
            kotlin.jvm.internal.g0.p(word, "word");
            this.f101664a = word;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101664a = null;
            this.f101665b = null;
            this.f101666c = null;
            this.f101667d = null;
            this.f101668e = null;
        }

        public a(@m80.k j1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101664a = source.f101659a;
            this.f101665b = Integer.valueOf(source.f101660b);
            this.f101666c = Integer.valueOf(source.f101661c);
            this.f101667d = Long.valueOf(source.f101662d);
            this.f101668e = source.f101663e;
        }
    }
}
