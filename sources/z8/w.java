package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class w implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f102189c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<w, a> f102190d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f102191a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f102192b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<w, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public w read(@m80.k ws.i protocol, @m80.k a builder) {
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
        public void write(@m80.k ws.i protocol, @m80.k w struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("FirstDayTestTaskResult");
            protocol.Q6("state", 1, (byte) 8);
            protocol.l5(struct.f102191a);
            protocol.N2();
            protocol.Q6("has_read", 2, (byte) 8);
            protocol.l5(struct.f102192b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public w(int i11, int i12) {
        this.f102191a = i11;
        this.f102192b = i12;
    }

    public static /* synthetic */ w d(w wVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = wVar.f102191a;
        }
        if ((i13 & 2) != 0) {
            i12 = wVar.f102192b;
        }
        return wVar.c(i11, i12);
    }

    public final int a() {
        return this.f102191a;
    }

    public final int b() {
        return this.f102192b;
    }

    @m80.k
    public final w c(int i11, int i12) {
        return new w(i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f102191a == wVar.f102191a && this.f102192b == wVar.f102192b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f102191a) * 31) + Integer.hashCode(this.f102192b);
    }

    @m80.k
    public String toString() {
        return "FirstDayTestTaskResult(state=" + this.f102191a + ", has_read=" + this.f102192b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102190d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nFirstDayTestTaskResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirstDayTestTaskResult.kt\ncom/baicizhan/biz/online/user_study_api/FirstDayTestTaskResult$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
    public static final class a implements ts.f<w> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f102193a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f102194b;

        public a() {
            this.f102193a = null;
            this.f102194b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w build() {
            Integer num = this.f102193a;
            if (num == null) {
                throw new IllegalStateException("Required field 'state' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f102194b;
            if (num2 != null) {
                return new w(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'has_read' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f102194b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f102193a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102193a = null;
            this.f102194b = null;
        }

        public a(@m80.k w source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102193a = Integer.valueOf(source.f102191a);
            this.f102194b = Integer.valueOf(source.f102192b);
        }
    }
}
