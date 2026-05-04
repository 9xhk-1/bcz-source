package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class n0 implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f80008f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<n0, a> f80009g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f80010a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f80011b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f80012c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f80013d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f80014e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<n0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    at.b.a(protocol, b11);
                                } else if (b11 == 8) {
                                    builder.b(protocol.s8());
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 8) {
                                builder.f(protocol.s8());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.e(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.d(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k n0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("SentenceChapter");
            protocol.Q6("chapterId", 1, (byte) 8);
            protocol.l5(struct.f80010a);
            protocol.N2();
            protocol.Q6("name", 2, (byte) 11);
            protocol.p1(struct.f80011b);
            protocol.N2();
            protocol.Q6("parentId", 3, (byte) 8);
            protocol.l5(struct.f80012c);
            protocol.N2();
            protocol.Q6("seqNo", 4, (byte) 8);
            protocol.l5(struct.f80013d);
            protocol.N2();
            protocol.Q6("buildingId", 5, (byte) 8);
            protocol.l5(struct.f80014e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public n0(int i11, @m80.k String name, int i12, int i13, int i14) {
        kotlin.jvm.internal.g0.p(name, "name");
        this.f80010a = i11;
        this.f80011b = name;
        this.f80012c = i12;
        this.f80013d = i13;
        this.f80014e = i14;
    }

    public static /* synthetic */ n0 g(n0 n0Var, int i11, String str, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = n0Var.f80010a;
        }
        if ((i15 & 2) != 0) {
            str = n0Var.f80011b;
        }
        if ((i15 & 4) != 0) {
            i12 = n0Var.f80012c;
        }
        if ((i15 & 8) != 0) {
            i13 = n0Var.f80013d;
        }
        if ((i15 & 16) != 0) {
            i14 = n0Var.f80014e;
        }
        int i16 = i14;
        int i17 = i12;
        return n0Var.f(i11, str, i17, i13, i16);
    }

    public final int a() {
        return this.f80010a;
    }

    @m80.k
    public final String b() {
        return this.f80011b;
    }

    public final int c() {
        return this.f80012c;
    }

    public final int d() {
        return this.f80013d;
    }

    public final int e() {
        return this.f80014e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f80010a == n0Var.f80010a && kotlin.jvm.internal.g0.g(this.f80011b, n0Var.f80011b) && this.f80012c == n0Var.f80012c && this.f80013d == n0Var.f80013d && this.f80014e == n0Var.f80014e;
    }

    @m80.k
    public final n0 f(int i11, @m80.k String name, int i12, int i13, int i14) {
        kotlin.jvm.internal.g0.p(name, "name");
        return new n0(i11, name, i12, i13, i14);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f80010a) * 31) + this.f80011b.hashCode()) * 31) + Integer.hashCode(this.f80012c)) * 31) + Integer.hashCode(this.f80013d)) * 31) + Integer.hashCode(this.f80014e);
    }

    @m80.k
    public String toString() {
        return "SentenceChapter(chapterId=" + this.f80010a + ", name=" + this.f80011b + ", parentId=" + this.f80012c + ", seqNo=" + this.f80013d + ", buildingId=" + this.f80014e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80009g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSentenceChapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceChapter.kt\ncom/baicizhan/biz/online/game_api/SentenceChapter$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
    public static final class a implements ts.f<n0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f80015a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f80016b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f80017c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f80018d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f80019e;

        public a() {
            this.f80015a = null;
            this.f80016b = null;
            this.f80017c = null;
            this.f80018d = null;
            this.f80019e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n0 build() {
            Integer num = this.f80015a;
            if (num == null) {
                throw new IllegalStateException("Required field 'chapterId' is missing");
            }
            int intValue = num.intValue();
            String str = this.f80016b;
            if (str == null) {
                throw new IllegalStateException("Required field 'name' is missing");
            }
            Integer num2 = this.f80017c;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'parentId' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f80018d;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'seqNo' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f80019e;
            if (num4 != null) {
                return new n0(intValue, str, intValue2, intValue3, num4.intValue());
            }
            throw new IllegalStateException("Required field 'buildingId' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f80019e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f80015a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.k String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            this.f80016b = name;
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f80017c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f80018d = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80015a = null;
            this.f80016b = null;
            this.f80017c = null;
            this.f80018d = null;
            this.f80019e = null;
        }

        public a(@m80.k n0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80015a = Integer.valueOf(source.f80010a);
            this.f80016b = source.f80011b;
            this.f80017c = Integer.valueOf(source.f80012c);
            this.f80018d = Integer.valueOf(source.f80013d);
            this.f80019e = Integer.valueOf(source.f80014e);
        }
    }
}
