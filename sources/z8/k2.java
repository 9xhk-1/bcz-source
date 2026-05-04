package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k2 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f101715d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<k2, a> f101716e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101717a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101718b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101719c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<k2, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k2 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k2 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                    } else if (b11 == 11) {
                        builder.b(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k k2 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("WordNote");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f101717a);
            protocol.N2();
            protocol.Q6("note", 2, (byte) 11);
            protocol.p1(struct.f101718b);
            protocol.N2();
            protocol.Q6("version", 3, (byte) 8);
            protocol.l5(struct.f101719c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public k2(int i11, @m80.k String note, int i12) {
        kotlin.jvm.internal.g0.p(note, "note");
        this.f101717a = i11;
        this.f101718b = note;
        this.f101719c = i12;
    }

    public static /* synthetic */ k2 e(k2 k2Var, int i11, String str, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = k2Var.f101717a;
        }
        if ((i13 & 2) != 0) {
            str = k2Var.f101718b;
        }
        if ((i13 & 4) != 0) {
            i12 = k2Var.f101719c;
        }
        return k2Var.d(i11, str, i12);
    }

    public final int a() {
        return this.f101717a;
    }

    @m80.k
    public final String b() {
        return this.f101718b;
    }

    public final int c() {
        return this.f101719c;
    }

    @m80.k
    public final k2 d(int i11, @m80.k String note, int i12) {
        kotlin.jvm.internal.g0.p(note, "note");
        return new k2(i11, note, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return this.f101717a == k2Var.f101717a && kotlin.jvm.internal.g0.g(this.f101718b, k2Var.f101718b) && this.f101719c == k2Var.f101719c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f101717a) * 31) + this.f101718b.hashCode()) * 31) + Integer.hashCode(this.f101719c);
    }

    @m80.k
    public String toString() {
        return "WordNote(topic_id=" + this.f101717a + ", note=" + this.f101718b + ", version=" + this.f101719c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101716e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordNote.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordNote.kt\ncom/baicizhan/biz/online/user_study_api/WordNote$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"})
    public static final class a implements ts.f<k2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101720a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101721b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101722c;

        public a() {
            this.f101720a = null;
            this.f101721b = null;
            this.f101722c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k2 build() {
            Integer num = this.f101720a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f101721b;
            if (str == null) {
                throw new IllegalStateException("Required field 'note' is missing");
            }
            Integer num2 = this.f101722c;
            if (num2 != null) {
                return new k2(intValue, str, num2.intValue());
            }
            throw new IllegalStateException("Required field 'version' is missing");
        }

        @m80.k
        public final a b(@m80.k String note) {
            kotlin.jvm.internal.g0.p(note, "note");
            this.f101721b = note;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f101720a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f101722c = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101720a = null;
            this.f101721b = null;
            this.f101722c = null;
        }

        public a(@m80.k k2 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101720a = Integer.valueOf(source.f101717a);
            this.f101721b = source.f101718b;
            this.f101722c = Integer.valueOf(source.f101719c);
        }
    }
}
