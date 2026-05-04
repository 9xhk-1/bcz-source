package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class q0 implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f80072g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<q0, a> f80073h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f80074a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f80075b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f80076c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f80077d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f80078e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final int f80079f;

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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k q0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("SentenceLesson");
            protocol.Q6("lessonId", 1, (byte) 8);
            protocol.l5(struct.f80074a);
            protocol.N2();
            protocol.Q6("name", 2, (byte) 11);
            protocol.p1(struct.f80075b);
            protocol.N2();
            protocol.Q6("chapterId", 3, (byte) 8);
            protocol.l5(struct.f80076c);
            protocol.N2();
            protocol.Q6("lessonType", 4, (byte) 8);
            protocol.l5(struct.f80077d);
            protocol.N2();
            protocol.Q6("globalSeqNo", 5, (byte) 8);
            protocol.l5(struct.f80078e);
            protocol.N2();
            protocol.Q6("seqNo", 6, (byte) 8);
            protocol.l5(struct.f80079f);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public q0(int i11, @m80.k String name, int i12, int i13, int i14, int i15) {
        kotlin.jvm.internal.g0.p(name, "name");
        this.f80074a = i11;
        this.f80075b = name;
        this.f80076c = i12;
        this.f80077d = i13;
        this.f80078e = i14;
        this.f80079f = i15;
    }

    public static /* synthetic */ q0 h(q0 q0Var, int i11, String str, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = q0Var.f80074a;
        }
        if ((i16 & 2) != 0) {
            str = q0Var.f80075b;
        }
        if ((i16 & 4) != 0) {
            i12 = q0Var.f80076c;
        }
        if ((i16 & 8) != 0) {
            i13 = q0Var.f80077d;
        }
        if ((i16 & 16) != 0) {
            i14 = q0Var.f80078e;
        }
        if ((i16 & 32) != 0) {
            i15 = q0Var.f80079f;
        }
        int i17 = i14;
        int i18 = i15;
        return q0Var.g(i11, str, i12, i13, i17, i18);
    }

    public final int a() {
        return this.f80074a;
    }

    @m80.k
    public final String b() {
        return this.f80075b;
    }

    public final int c() {
        return this.f80076c;
    }

    public final int d() {
        return this.f80077d;
    }

    public final int e() {
        return this.f80078e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f80074a == q0Var.f80074a && kotlin.jvm.internal.g0.g(this.f80075b, q0Var.f80075b) && this.f80076c == q0Var.f80076c && this.f80077d == q0Var.f80077d && this.f80078e == q0Var.f80078e && this.f80079f == q0Var.f80079f;
    }

    public final int f() {
        return this.f80079f;
    }

    @m80.k
    public final q0 g(int i11, @m80.k String name, int i12, int i13, int i14, int i15) {
        kotlin.jvm.internal.g0.p(name, "name");
        return new q0(i11, name, i12, i13, i14, i15);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f80074a) * 31) + this.f80075b.hashCode()) * 31) + Integer.hashCode(this.f80076c)) * 31) + Integer.hashCode(this.f80077d)) * 31) + Integer.hashCode(this.f80078e)) * 31) + Integer.hashCode(this.f80079f);
    }

    @m80.k
    public String toString() {
        return "SentenceLesson(lessonId=" + this.f80074a + ", name=" + this.f80075b + ", chapterId=" + this.f80076c + ", lessonType=" + this.f80077d + ", globalSeqNo=" + this.f80078e + ", seqNo=" + this.f80079f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80073h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSentenceLesson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceLesson.kt\ncom/baicizhan/biz/online/game_api/SentenceLesson$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1#2:224\n*E\n"})
    public static final class a implements ts.f<q0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f80080a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f80081b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f80082c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f80083d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f80084e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f80085f;

        public a() {
            this.f80080a = null;
            this.f80081b = null;
            this.f80082c = null;
            this.f80083d = null;
            this.f80084e = null;
            this.f80085f = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q0 build() {
            Integer num = this.f80080a;
            if (num == null) {
                throw new IllegalStateException("Required field 'lessonId' is missing");
            }
            int intValue = num.intValue();
            String str = this.f80081b;
            if (str == null) {
                throw new IllegalStateException("Required field 'name' is missing");
            }
            Integer num2 = this.f80082c;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'chapterId' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f80083d;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'lessonType' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f80084e;
            if (num4 == null) {
                throw new IllegalStateException("Required field 'globalSeqNo' is missing");
            }
            int intValue4 = num4.intValue();
            Integer num5 = this.f80085f;
            if (num5 != null) {
                return new q0(intValue, str, intValue2, intValue3, intValue4, num5.intValue());
            }
            throw new IllegalStateException("Required field 'seqNo' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f80082c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f80084e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f80080a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f80083d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(@m80.k String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            this.f80081b = name;
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f80085f = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80080a = null;
            this.f80081b = null;
            this.f80082c = null;
            this.f80083d = null;
            this.f80084e = null;
            this.f80085f = null;
        }

        public a(@m80.k q0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80080a = Integer.valueOf(source.f80074a);
            this.f80081b = source.f80075b;
            this.f80082c = Integer.valueOf(source.f80076c);
            this.f80083d = Integer.valueOf(source.f80077d);
            this.f80084e = Integer.valueOf(source.f80078e);
            this.f80085f = Integer.valueOf(source.f80079f);
        }
    }
}
