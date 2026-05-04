package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class r0 implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final b f101949i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<r0, a> f101950j = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101951a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101952b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101953c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f101954d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final boolean f101955e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final boolean f101956f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    public final boolean f101957g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    public final boolean f101958h;

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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readBool());
                            break;
                        }
                    case 6:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readBool());
                            break;
                        }
                    case 7:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readBool());
                            break;
                        }
                    case 8:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readBool());
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
        public void write(@m80.k ws.i protocol, @m80.k r0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("StudyHomeToday");
            protocol.Q6("learned", 1, (byte) 8);
            protocol.l5(struct.f101951a);
            protocol.N2();
            protocol.Q6("learning_plan", 2, (byte) 8);
            protocol.l5(struct.f101952b);
            protocol.N2();
            protocol.Q6("reviewed", 3, (byte) 8);
            protocol.l5(struct.f101953c);
            protocol.N2();
            protocol.Q6("review_plan", 4, (byte) 8);
            protocol.l5(struct.f101954d);
            protocol.N2();
            protocol.Q6("finished", 5, (byte) 2);
            protocol.a4(struct.f101955e);
            protocol.N2();
            protocol.Q6("book_finished", 6, (byte) 2);
            protocol.a4(struct.f101956f);
            protocol.N2();
            protocol.Q6("learning_finished_today", 7, (byte) 2);
            protocol.a4(struct.f101957g);
            protocol.N2();
            protocol.Q6("learning_finished", 8, (byte) 2);
            protocol.a4(struct.f101958h);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public r0(int i11, int i12, int i13, int i14, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f101951a = i11;
        this.f101952b = i12;
        this.f101953c = i13;
        this.f101954d = i14;
        this.f101955e = z11;
        this.f101956f = z12;
        this.f101957g = z13;
        this.f101958h = z14;
    }

    public static /* synthetic */ r0 j(r0 r0Var, int i11, int i12, int i13, int i14, boolean z11, boolean z12, boolean z13, boolean z14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = r0Var.f101951a;
        }
        if ((i15 & 2) != 0) {
            i12 = r0Var.f101952b;
        }
        if ((i15 & 4) != 0) {
            i13 = r0Var.f101953c;
        }
        if ((i15 & 8) != 0) {
            i14 = r0Var.f101954d;
        }
        if ((i15 & 16) != 0) {
            z11 = r0Var.f101955e;
        }
        if ((i15 & 32) != 0) {
            z12 = r0Var.f101956f;
        }
        if ((i15 & 64) != 0) {
            z13 = r0Var.f101957g;
        }
        if ((i15 & 128) != 0) {
            z14 = r0Var.f101958h;
        }
        boolean z15 = z13;
        boolean z16 = z14;
        boolean z17 = z11;
        boolean z18 = z12;
        return r0Var.i(i11, i12, i13, i14, z17, z18, z15, z16);
    }

    public final int a() {
        return this.f101951a;
    }

    public final int b() {
        return this.f101952b;
    }

    public final int c() {
        return this.f101953c;
    }

    public final int d() {
        return this.f101954d;
    }

    public final boolean e() {
        return this.f101955e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f101951a == r0Var.f101951a && this.f101952b == r0Var.f101952b && this.f101953c == r0Var.f101953c && this.f101954d == r0Var.f101954d && this.f101955e == r0Var.f101955e && this.f101956f == r0Var.f101956f && this.f101957g == r0Var.f101957g && this.f101958h == r0Var.f101958h;
    }

    public final boolean f() {
        return this.f101956f;
    }

    public final boolean g() {
        return this.f101957g;
    }

    public final boolean h() {
        return this.f101958h;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f101951a) * 31) + Integer.hashCode(this.f101952b)) * 31) + Integer.hashCode(this.f101953c)) * 31) + Integer.hashCode(this.f101954d)) * 31) + Boolean.hashCode(this.f101955e)) * 31) + Boolean.hashCode(this.f101956f)) * 31) + Boolean.hashCode(this.f101957g)) * 31) + Boolean.hashCode(this.f101958h);
    }

    @m80.k
    public final r0 i(int i11, int i12, int i13, int i14, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new r0(i11, i12, i13, i14, z11, z12, z13, z14);
    }

    @m80.k
    public String toString() {
        return "StudyHomeToday(learned=" + this.f101951a + ", learning_plan=" + this.f101952b + ", reviewed=" + this.f101953c + ", review_plan=" + this.f101954d + ", finished=" + this.f101955e + ", book_finished=" + this.f101956f + ", learning_finished_today=" + this.f101957g + ", learning_finished=" + this.f101958h + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101950j.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nStudyHomeToday.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyHomeToday.kt\ncom/baicizhan/biz/online/user_study_api/StudyHomeToday$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,297:1\n1#2:298\n*E\n"})
    public static final class a implements ts.f<r0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101959a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101960b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101961c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f101962d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Boolean f101963e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Boolean f101964f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Boolean f101965g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Boolean f101966h;

        public a() {
            this.f101959a = null;
            this.f101960b = null;
            this.f101961c = null;
            this.f101962d = null;
            this.f101963e = null;
            this.f101964f = null;
            this.f101965g = null;
            this.f101966h = null;
        }

        @m80.k
        public final a a(boolean z11) {
            this.f101964f = Boolean.valueOf(z11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r0 build() {
            Integer num = this.f101959a;
            if (num == null) {
                throw new IllegalStateException("Required field 'learned' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101960b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'learning_plan' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f101961c;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'reviewed' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f101962d;
            if (num4 == null) {
                throw new IllegalStateException("Required field 'review_plan' is missing");
            }
            int intValue4 = num4.intValue();
            Boolean bool = this.f101963e;
            if (bool == null) {
                throw new IllegalStateException("Required field 'finished' is missing");
            }
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = this.f101964f;
            if (bool2 == null) {
                throw new IllegalStateException("Required field 'book_finished' is missing");
            }
            boolean booleanValue2 = bool2.booleanValue();
            Boolean bool3 = this.f101965g;
            if (bool3 == null) {
                throw new IllegalStateException("Required field 'learning_finished_today' is missing");
            }
            boolean booleanValue3 = bool3.booleanValue();
            Boolean bool4 = this.f101966h;
            if (bool4 != null) {
                return new r0(intValue, intValue2, intValue3, intValue4, booleanValue, booleanValue2, booleanValue3, bool4.booleanValue());
            }
            throw new IllegalStateException("Required field 'learning_finished' is missing");
        }

        @m80.k
        public final a c(boolean z11) {
            this.f101963e = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f101959a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(boolean z11) {
            this.f101966h = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a f(boolean z11) {
            this.f101965g = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f101960b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a h(int i11) {
            this.f101962d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a i(int i11) {
            this.f101961c = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101959a = null;
            this.f101960b = null;
            this.f101961c = null;
            this.f101962d = null;
            this.f101963e = null;
            this.f101964f = null;
            this.f101965g = null;
            this.f101966h = null;
        }

        public a(@m80.k r0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101959a = Integer.valueOf(source.f101951a);
            this.f101960b = Integer.valueOf(source.f101952b);
            this.f101961c = Integer.valueOf(source.f101953c);
            this.f101962d = Integer.valueOf(source.f101954d);
            this.f101963e = Boolean.valueOf(source.f101955e);
            this.f101964f = Boolean.valueOf(source.f101956f);
            this.f101965g = Boolean.valueOf(source.f101957g);
            this.f101966h = Boolean.valueOf(source.f101958h);
        }
    }
}
