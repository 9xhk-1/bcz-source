package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class p implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f101863c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<p, a> f101864d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101865a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101866b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<p, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p read(@m80.k ws.i protocol, @m80.k a builder) {
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
        public void write(@m80.k ws.i protocol, @m80.k p struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("DualMode");
            protocol.Q6("userType", 1, (byte) 8);
            protocol.l5(struct.f101865a);
            protocol.N2();
            protocol.Q6("current_mode", 2, (byte) 8);
            protocol.l5(struct.f101866b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public p(int i11, int i12) {
        this.f101865a = i11;
        this.f101866b = i12;
    }

    public static /* synthetic */ p d(p pVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = pVar.f101865a;
        }
        if ((i13 & 2) != 0) {
            i12 = pVar.f101866b;
        }
        return pVar.c(i11, i12);
    }

    public final int a() {
        return this.f101865a;
    }

    public final int b() {
        return this.f101866b;
    }

    @m80.k
    public final p c(int i11, int i12) {
        return new p(i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f101865a == pVar.f101865a && this.f101866b == pVar.f101866b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f101865a) * 31) + Integer.hashCode(this.f101866b);
    }

    @m80.k
    public String toString() {
        return "DualMode(userType=" + this.f101865a + ", current_mode=" + this.f101866b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101864d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nDualMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DualMode.kt\ncom/baicizhan/biz/online/user_study_api/DualMode$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
    public static final class a implements ts.f<p> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101867a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101868b;

        public a() {
            this.f101867a = null;
            this.f101868b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p build() {
            Integer num = this.f101867a;
            if (num == null) {
                throw new IllegalStateException("Required field 'userType' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101868b;
            if (num2 != null) {
                return new p(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'current_mode' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f101868b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f101867a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101867a = null;
            this.f101868b = null;
        }

        public a(@m80.k p source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101867a = Integer.valueOf(source.f101865a);
            this.f101868b = Integer.valueOf(source.f101866b);
        }
    }
}
