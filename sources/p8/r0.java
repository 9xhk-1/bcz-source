package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class r0 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f80102d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<r0, a> f80103e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f80104a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f80105b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f80106c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<r0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            at.b.a(protocol, b11);
                        } else if (b11 == 11) {
                            builder.c(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.b(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.d(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k r0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("SentenceLessonInfo");
            protocol.Q6("unit_no", 1, (byte) 8);
            protocol.l5(struct.f80104a);
            protocol.N2();
            protocol.Q6("lesson_no", 2, (byte) 8);
            protocol.l5(struct.f80105b);
            protocol.N2();
            protocol.Q6("lesson_type", 3, (byte) 11);
            protocol.p1(struct.f80106c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public r0(int i11, int i12, @m80.k String lesson_type) {
        kotlin.jvm.internal.g0.p(lesson_type, "lesson_type");
        this.f80104a = i11;
        this.f80105b = i12;
        this.f80106c = lesson_type;
    }

    public static /* synthetic */ r0 e(r0 r0Var, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = r0Var.f80104a;
        }
        if ((i13 & 2) != 0) {
            i12 = r0Var.f80105b;
        }
        if ((i13 & 4) != 0) {
            str = r0Var.f80106c;
        }
        return r0Var.d(i11, i12, str);
    }

    public final int a() {
        return this.f80104a;
    }

    public final int b() {
        return this.f80105b;
    }

    @m80.k
    public final String c() {
        return this.f80106c;
    }

    @m80.k
    public final r0 d(int i11, int i12, @m80.k String lesson_type) {
        kotlin.jvm.internal.g0.p(lesson_type, "lesson_type");
        return new r0(i11, i12, lesson_type);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f80104a == r0Var.f80104a && this.f80105b == r0Var.f80105b && kotlin.jvm.internal.g0.g(this.f80106c, r0Var.f80106c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f80104a) * 31) + Integer.hashCode(this.f80105b)) * 31) + this.f80106c.hashCode();
    }

    @m80.k
    public String toString() {
        return "SentenceLessonInfo(unit_no=" + this.f80104a + ", lesson_no=" + this.f80105b + ", lesson_type=" + this.f80106c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80103e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSentenceLessonInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceLessonInfo.kt\ncom/baicizhan/biz/online/game_api/SentenceLessonInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"})
    public static final class a implements ts.f<r0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f80107a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f80108b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f80109c;

        public a() {
            this.f80107a = null;
            this.f80108b = null;
            this.f80109c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r0 build() {
            Integer num = this.f80107a;
            if (num == null) {
                throw new IllegalStateException("Required field 'unit_no' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f80108b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'lesson_no' is missing");
            }
            int intValue2 = num2.intValue();
            String str = this.f80109c;
            if (str != null) {
                return new r0(intValue, intValue2, str);
            }
            throw new IllegalStateException("Required field 'lesson_type' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f80108b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.k String lesson_type) {
            kotlin.jvm.internal.g0.p(lesson_type, "lesson_type");
            this.f80109c = lesson_type;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f80107a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80107a = null;
            this.f80108b = null;
            this.f80109c = null;
        }

        public a(@m80.k r0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80107a = Integer.valueOf(source.f80104a);
            this.f80108b = Integer.valueOf(source.f80105b);
            this.f80109c = source.f80106c;
        }
    }
}
