package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class q0 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f101903d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<q0, a> f101904e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101905a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101906b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101907c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<q0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.d(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.b(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.c(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k q0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("StudyHomeProgress");
            protocol.Q6("mastered", 1, (byte) 8);
            protocol.l5(struct.f101905a);
            protocol.N2();
            protocol.Q6("learned", 2, (byte) 8);
            protocol.l5(struct.f101906b);
            protocol.N2();
            protocol.Q6(hb.d.f59153d, 3, (byte) 8);
            protocol.l5(struct.f101907c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public q0(int i11, int i12, int i13) {
        this.f101905a = i11;
        this.f101906b = i12;
        this.f101907c = i13;
    }

    public static /* synthetic */ q0 e(q0 q0Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = q0Var.f101905a;
        }
        if ((i14 & 2) != 0) {
            i12 = q0Var.f101906b;
        }
        if ((i14 & 4) != 0) {
            i13 = q0Var.f101907c;
        }
        return q0Var.d(i11, i12, i13);
    }

    public final int a() {
        return this.f101905a;
    }

    public final int b() {
        return this.f101906b;
    }

    public final int c() {
        return this.f101907c;
    }

    @m80.k
    public final q0 d(int i11, int i12, int i13) {
        return new q0(i11, i12, i13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f101905a == q0Var.f101905a && this.f101906b == q0Var.f101906b && this.f101907c == q0Var.f101907c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f101905a) * 31) + Integer.hashCode(this.f101906b)) * 31) + Integer.hashCode(this.f101907c);
    }

    @m80.k
    public String toString() {
        return "StudyHomeProgress(mastered=" + this.f101905a + ", learned=" + this.f101906b + ", total=" + this.f101907c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101904e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nStudyHomeProgress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyHomeProgress.kt\ncom/baicizhan/biz/online/user_study_api/StudyHomeProgress$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    public static final class a implements ts.f<q0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101908a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101909b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101910c;

        public a() {
            this.f101908a = null;
            this.f101909b = null;
            this.f101910c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q0 build() {
            Integer num = this.f101908a;
            if (num == null) {
                throw new IllegalStateException("Required field 'mastered' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101909b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'learned' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f101910c;
            if (num3 != null) {
                return new q0(intValue, intValue2, num3.intValue());
            }
            throw new IllegalStateException("Required field 'total' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f101909b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f101908a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f101910c = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101908a = null;
            this.f101909b = null;
            this.f101910c = null;
        }

        public a(@m80.k q0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101908a = Integer.valueOf(source.f101905a);
            this.f101909b = Integer.valueOf(source.f101906b);
            this.f101910c = Integer.valueOf(source.f101907c);
        }
    }
}
