package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class s0 implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f101999c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<s0, a> f102000d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f102001a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final p0 f102002b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<s0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        builder.c(p0.f101870f.read(protocol));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.a(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k s0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("StudyHomeV2");
            protocol.Q6("book_status", 1, (byte) 8);
            protocol.l5(struct.f102001a);
            protocol.N2();
            if (struct.f102002b != null) {
                protocol.Q6("home", 2, (byte) 12);
                p0.f101870f.write(protocol, struct.f102002b);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public s0(int i11, @m80.l p0 p0Var) {
        this.f102001a = i11;
        this.f102002b = p0Var;
    }

    public static /* synthetic */ s0 d(s0 s0Var, int i11, p0 p0Var, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = s0Var.f102001a;
        }
        if ((i12 & 2) != 0) {
            p0Var = s0Var.f102002b;
        }
        return s0Var.c(i11, p0Var);
    }

    public final int a() {
        return this.f102001a;
    }

    @m80.l
    public final p0 b() {
        return this.f102002b;
    }

    @m80.k
    public final s0 c(int i11, @m80.l p0 p0Var) {
        return new s0(i11, p0Var);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f102001a == s0Var.f102001a && kotlin.jvm.internal.g0.g(this.f102002b, s0Var.f102002b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f102001a) * 31;
        p0 p0Var = this.f102002b;
        return hashCode + (p0Var == null ? 0 : p0Var.hashCode());
    }

    @m80.k
    public String toString() {
        return "StudyHomeV2(book_status=" + this.f102001a + ", home=" + this.f102002b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102000d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nStudyHomeV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyHomeV2.kt\ncom/baicizhan/biz/online/user_study_api/StudyHomeV2$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
    public static final class a implements ts.f<s0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f102003a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public p0 f102004b;

        public a() {
            this.f102003a = null;
            this.f102004b = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f102003a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s0 build() {
            Integer num = this.f102003a;
            if (num != null) {
                return new s0(num.intValue(), this.f102004b);
            }
            throw new IllegalStateException("Required field 'book_status' is missing");
        }

        @m80.k
        public final a c(@m80.l p0 p0Var) {
            this.f102004b = p0Var;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102003a = null;
            this.f102004b = null;
        }

        public a(@m80.k s0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102003a = Integer.valueOf(source.f102001a);
            this.f102004b = source.f102002b;
        }
    }
}
