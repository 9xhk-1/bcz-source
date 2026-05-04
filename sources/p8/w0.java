package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class w0 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f80230d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<w0, a> f80231e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f80232a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final boolean f80233b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final boolean f80234c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<w0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public w0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        } else if (b11 == 2) {
                            builder.d(protocol.readBool());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 2) {
                        builder.c(protocol.readBool());
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
        public void write(@m80.k ws.i protocol, @m80.k w0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("StudyRecordReq");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(struct.f80232a);
            protocol.N2();
            protocol.Q6("study_record", 2, (byte) 2);
            protocol.a4(struct.f80233b);
            protocol.N2();
            protocol.Q6("word_ability", 3, (byte) 2);
            protocol.a4(struct.f80234c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public w0(int i11, boolean z11, boolean z12) {
        this.f80232a = i11;
        this.f80233b = z11;
        this.f80234c = z12;
    }

    public static /* synthetic */ w0 e(w0 w0Var, int i11, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = w0Var.f80232a;
        }
        if ((i12 & 2) != 0) {
            z11 = w0Var.f80233b;
        }
        if ((i12 & 4) != 0) {
            z12 = w0Var.f80234c;
        }
        return w0Var.d(i11, z11, z12);
    }

    public final int a() {
        return this.f80232a;
    }

    public final boolean b() {
        return this.f80233b;
    }

    public final boolean c() {
        return this.f80234c;
    }

    @m80.k
    public final w0 d(int i11, boolean z11, boolean z12) {
        return new w0(i11, z11, z12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f80232a == w0Var.f80232a && this.f80233b == w0Var.f80233b && this.f80234c == w0Var.f80234c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f80232a) * 31) + Boolean.hashCode(this.f80233b)) * 31) + Boolean.hashCode(this.f80234c);
    }

    @m80.k
    public String toString() {
        return "StudyRecordReq(book_id=" + this.f80232a + ", study_record=" + this.f80233b + ", word_ability=" + this.f80234c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80231e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nStudyRecordReq.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyRecordReq.kt\ncom/baicizhan/biz/online/game_api/StudyRecordReq$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"})
    public static final class a implements ts.f<w0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f80235a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Boolean f80236b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Boolean f80237c;

        public a() {
            this.f80235a = null;
            this.f80236b = null;
            this.f80237c = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f80235a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public w0 build() {
            Integer num = this.f80235a;
            if (num == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue = num.intValue();
            Boolean bool = this.f80236b;
            if (bool == null) {
                throw new IllegalStateException("Required field 'study_record' is missing");
            }
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = this.f80237c;
            if (bool2 != null) {
                return new w0(intValue, booleanValue, bool2.booleanValue());
            }
            throw new IllegalStateException("Required field 'word_ability' is missing");
        }

        @m80.k
        public final a c(boolean z11) {
            this.f80236b = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a d(boolean z11) {
            this.f80237c = Boolean.valueOf(z11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80235a = null;
            this.f80236b = null;
            this.f80237c = null;
        }

        public a(@m80.k w0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80235a = Integer.valueOf(source.f80232a);
            this.f80236b = Boolean.valueOf(source.f80233b);
            this.f80237c = Boolean.valueOf(source.f80234c);
        }
    }
}
