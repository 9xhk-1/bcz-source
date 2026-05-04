package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g0 implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f101533g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<g0, a> f101534h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101535a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101536b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101537c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101538d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101539e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101540f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<g0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.g(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k g0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("PrimarySchoolModeConfig");
            protocol.Q6("state", 1, (byte) 8);
            protocol.l5(struct.f101535a);
            protocol.N2();
            protocol.Q6("h5_link", 2, (byte) 11);
            protocol.p1(struct.f101536b);
            protocol.N2();
            protocol.Q6("has_done_final_exam", 3, (byte) 8);
            protocol.l5(struct.f101537c);
            protocol.N2();
            protocol.Q6("final_exam_link_popup", 4, (byte) 11);
            protocol.p1(struct.f101538d);
            protocol.N2();
            protocol.Q6("final_exam_link_button", 5, (byte) 11);
            protocol.p1(struct.f101539e);
            protocol.N2();
            protocol.Q6("final_exam_result_link", 6, (byte) 11);
            protocol.p1(struct.f101540f);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public g0(int i11, @m80.k String h5_link, int i12, @m80.k String final_exam_link_popup, @m80.k String final_exam_link_button, @m80.k String final_exam_result_link) {
        kotlin.jvm.internal.g0.p(h5_link, "h5_link");
        kotlin.jvm.internal.g0.p(final_exam_link_popup, "final_exam_link_popup");
        kotlin.jvm.internal.g0.p(final_exam_link_button, "final_exam_link_button");
        kotlin.jvm.internal.g0.p(final_exam_result_link, "final_exam_result_link");
        this.f101535a = i11;
        this.f101536b = h5_link;
        this.f101537c = i12;
        this.f101538d = final_exam_link_popup;
        this.f101539e = final_exam_link_button;
        this.f101540f = final_exam_result_link;
    }

    public static /* synthetic */ g0 h(g0 g0Var, int i11, String str, int i12, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = g0Var.f101535a;
        }
        if ((i13 & 2) != 0) {
            str = g0Var.f101536b;
        }
        if ((i13 & 4) != 0) {
            i12 = g0Var.f101537c;
        }
        if ((i13 & 8) != 0) {
            str2 = g0Var.f101538d;
        }
        if ((i13 & 16) != 0) {
            str3 = g0Var.f101539e;
        }
        if ((i13 & 32) != 0) {
            str4 = g0Var.f101540f;
        }
        String str5 = str3;
        String str6 = str4;
        return g0Var.g(i11, str, i12, str2, str5, str6);
    }

    public final int a() {
        return this.f101535a;
    }

    @m80.k
    public final String b() {
        return this.f101536b;
    }

    public final int c() {
        return this.f101537c;
    }

    @m80.k
    public final String d() {
        return this.f101538d;
    }

    @m80.k
    public final String e() {
        return this.f101539e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f101535a == g0Var.f101535a && kotlin.jvm.internal.g0.g(this.f101536b, g0Var.f101536b) && this.f101537c == g0Var.f101537c && kotlin.jvm.internal.g0.g(this.f101538d, g0Var.f101538d) && kotlin.jvm.internal.g0.g(this.f101539e, g0Var.f101539e) && kotlin.jvm.internal.g0.g(this.f101540f, g0Var.f101540f);
    }

    @m80.k
    public final String f() {
        return this.f101540f;
    }

    @m80.k
    public final g0 g(int i11, @m80.k String h5_link, int i12, @m80.k String final_exam_link_popup, @m80.k String final_exam_link_button, @m80.k String final_exam_result_link) {
        kotlin.jvm.internal.g0.p(h5_link, "h5_link");
        kotlin.jvm.internal.g0.p(final_exam_link_popup, "final_exam_link_popup");
        kotlin.jvm.internal.g0.p(final_exam_link_button, "final_exam_link_button");
        kotlin.jvm.internal.g0.p(final_exam_result_link, "final_exam_result_link");
        return new g0(i11, h5_link, i12, final_exam_link_popup, final_exam_link_button, final_exam_result_link);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f101535a) * 31) + this.f101536b.hashCode()) * 31) + Integer.hashCode(this.f101537c)) * 31) + this.f101538d.hashCode()) * 31) + this.f101539e.hashCode()) * 31) + this.f101540f.hashCode();
    }

    @m80.k
    public String toString() {
        return "PrimarySchoolModeConfig(state=" + this.f101535a + ", h5_link=" + this.f101536b + ", has_done_final_exam=" + this.f101537c + ", final_exam_link_popup=" + this.f101538d + ", final_exam_link_button=" + this.f101539e + ", final_exam_result_link=" + this.f101540f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101534h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nPrimarySchoolModeConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimarySchoolModeConfig.kt\ncom/baicizhan/biz/online/user_study_api/PrimarySchoolModeConfig$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1#2:246\n*E\n"})
    public static final class a implements ts.f<g0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101541a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101542b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101543c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f101544d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f101545e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f101546f;

        public a() {
            this.f101541a = null;
            this.f101542b = null;
            this.f101543c = null;
            this.f101544d = null;
            this.f101545e = null;
            this.f101546f = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g0 build() {
            Integer num = this.f101541a;
            if (num == null) {
                throw new IllegalStateException("Required field 'state' is missing");
            }
            int intValue = num.intValue();
            String str = this.f101542b;
            if (str == null) {
                throw new IllegalStateException("Required field 'h5_link' is missing");
            }
            Integer num2 = this.f101543c;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'has_done_final_exam' is missing");
            }
            int intValue2 = num2.intValue();
            String str2 = this.f101544d;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'final_exam_link_popup' is missing");
            }
            String str3 = this.f101545e;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'final_exam_link_button' is missing");
            }
            String str4 = this.f101546f;
            if (str4 != null) {
                return new g0(intValue, str, intValue2, str2, str3, str4);
            }
            throw new IllegalStateException("Required field 'final_exam_result_link' is missing");
        }

        @m80.k
        public final a b(@m80.k String final_exam_link_button) {
            kotlin.jvm.internal.g0.p(final_exam_link_button, "final_exam_link_button");
            this.f101545e = final_exam_link_button;
            return this;
        }

        @m80.k
        public final a c(@m80.k String final_exam_link_popup) {
            kotlin.jvm.internal.g0.p(final_exam_link_popup, "final_exam_link_popup");
            this.f101544d = final_exam_link_popup;
            return this;
        }

        @m80.k
        public final a d(@m80.k String final_exam_result_link) {
            kotlin.jvm.internal.g0.p(final_exam_result_link, "final_exam_result_link");
            this.f101546f = final_exam_result_link;
            return this;
        }

        @m80.k
        public final a e(@m80.k String h5_link) {
            kotlin.jvm.internal.g0.p(h5_link, "h5_link");
            this.f101542b = h5_link;
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f101543c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f101541a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101541a = null;
            this.f101542b = null;
            this.f101543c = null;
            this.f101544d = null;
            this.f101545e = null;
            this.f101546f = null;
        }

        public a(@m80.k g0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101541a = Integer.valueOf(source.f101535a);
            this.f101542b = source.f101536b;
            this.f101543c = Integer.valueOf(source.f101537c);
            this.f101544d = source.f101538d;
            this.f101545e = source.f101539e;
            this.f101546f = source.f101540f;
        }
    }
}
