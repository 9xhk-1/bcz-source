package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class o0 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f101849d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<o0, a> f101850e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101851a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101852b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101853c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<o0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        } else if (b11 == 8) {
                            builder.c(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.a(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.d(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k o0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("StudyExperienceRecord");
            protocol.Q6("questionType", 1, (byte) 11);
            protocol.p1(struct.f101851a);
            protocol.N2();
            protocol.Q6("behavior", 2, (byte) 8);
            protocol.l5(struct.f101852b);
            protocol.N2();
            protocol.Q6("cnt", 3, (byte) 8);
            protocol.l5(struct.f101853c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public o0(@m80.k String questionType, int i11, int i12) {
        kotlin.jvm.internal.g0.p(questionType, "questionType");
        this.f101851a = questionType;
        this.f101852b = i11;
        this.f101853c = i12;
    }

    public static /* synthetic */ o0 e(o0 o0Var, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = o0Var.f101851a;
        }
        if ((i13 & 2) != 0) {
            i11 = o0Var.f101852b;
        }
        if ((i13 & 4) != 0) {
            i12 = o0Var.f101853c;
        }
        return o0Var.d(str, i11, i12);
    }

    @m80.k
    public final String a() {
        return this.f101851a;
    }

    public final int b() {
        return this.f101852b;
    }

    public final int c() {
        return this.f101853c;
    }

    @m80.k
    public final o0 d(@m80.k String questionType, int i11, int i12) {
        kotlin.jvm.internal.g0.p(questionType, "questionType");
        return new o0(questionType, i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.g0.g(this.f101851a, o0Var.f101851a) && this.f101852b == o0Var.f101852b && this.f101853c == o0Var.f101853c;
    }

    public int hashCode() {
        return (((this.f101851a.hashCode() * 31) + Integer.hashCode(this.f101852b)) * 31) + Integer.hashCode(this.f101853c);
    }

    @m80.k
    public String toString() {
        return "StudyExperienceRecord(questionType=" + this.f101851a + ", behavior=" + this.f101852b + ", cnt=" + this.f101853c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101850e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nStudyExperienceRecord.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyExperienceRecord.kt\ncom/baicizhan/biz/online/user_study_api/StudyExperienceRecord$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"})
    public static final class a implements ts.f<o0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f101854a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101855b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101856c;

        public a() {
            this.f101854a = null;
            this.f101855b = null;
            this.f101856c = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f101855b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o0 build() {
            String str = this.f101854a;
            if (str == null) {
                throw new IllegalStateException("Required field 'questionType' is missing");
            }
            Integer num = this.f101855b;
            if (num == null) {
                throw new IllegalStateException("Required field 'behavior' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101856c;
            if (num2 != null) {
                return new o0(str, intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'cnt' is missing");
        }

        @m80.k
        public final a c(int i11) {
            this.f101856c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.k String questionType) {
            kotlin.jvm.internal.g0.p(questionType, "questionType");
            this.f101854a = questionType;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101854a = null;
            this.f101855b = null;
            this.f101856c = null;
        }

        public a(@m80.k o0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101854a = source.f101851a;
            this.f101855b = Integer.valueOf(source.f101852b);
            this.f101856c = Integer.valueOf(source.f101853c);
        }
    }
}
