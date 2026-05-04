package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class j2 implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f101669g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<j2, a> f101670h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101671a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101672b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f101673c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final boolean f101674d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f101675e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final int f101676f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<j2, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j2 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j2 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.T1());
                            break;
                        }
                    case 4:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readBool());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k j2 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("WordListItem");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f101671a);
            protocol.N2();
            protocol.Q6("mastered", 2, (byte) 8);
            protocol.l5(struct.f101672b);
            protocol.N2();
            protocol.Q6("modify_time", 3, (byte) 10);
            protocol.q7(struct.f101673c);
            protocol.N2();
            protocol.Q6("cut", 4, (byte) 2);
            protocol.a4(struct.f101674d);
            protocol.N2();
            protocol.Q6("next_review_day", 5, (byte) 8);
            protocol.l5(struct.f101675e);
            protocol.N2();
            protocol.Q6("status", 6, (byte) 8);
            protocol.l5(struct.f101676f);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public j2(int i11, int i12, long j11, boolean z11, int i13, int i14) {
        this.f101671a = i11;
        this.f101672b = i12;
        this.f101673c = j11;
        this.f101674d = z11;
        this.f101675e = i13;
        this.f101676f = i14;
    }

    public static /* synthetic */ j2 h(j2 j2Var, int i11, int i12, long j11, boolean z11, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = j2Var.f101671a;
        }
        if ((i15 & 2) != 0) {
            i12 = j2Var.f101672b;
        }
        if ((i15 & 4) != 0) {
            j11 = j2Var.f101673c;
        }
        if ((i15 & 8) != 0) {
            z11 = j2Var.f101674d;
        }
        if ((i15 & 16) != 0) {
            i13 = j2Var.f101675e;
        }
        if ((i15 & 32) != 0) {
            i14 = j2Var.f101676f;
        }
        int i16 = i14;
        boolean z12 = z11;
        long j12 = j11;
        return j2Var.g(i11, i12, j12, z12, i13, i16);
    }

    public final int a() {
        return this.f101671a;
    }

    public final int b() {
        return this.f101672b;
    }

    public final long c() {
        return this.f101673c;
    }

    public final boolean d() {
        return this.f101674d;
    }

    public final int e() {
        return this.f101675e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return this.f101671a == j2Var.f101671a && this.f101672b == j2Var.f101672b && this.f101673c == j2Var.f101673c && this.f101674d == j2Var.f101674d && this.f101675e == j2Var.f101675e && this.f101676f == j2Var.f101676f;
    }

    public final int f() {
        return this.f101676f;
    }

    @m80.k
    public final j2 g(int i11, int i12, long j11, boolean z11, int i13, int i14) {
        return new j2(i11, i12, j11, z11, i13, i14);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f101671a) * 31) + Integer.hashCode(this.f101672b)) * 31) + Long.hashCode(this.f101673c)) * 31) + Boolean.hashCode(this.f101674d)) * 31) + Integer.hashCode(this.f101675e)) * 31) + Integer.hashCode(this.f101676f);
    }

    @m80.k
    public String toString() {
        return "WordListItem(topic_id=" + this.f101671a + ", mastered=" + this.f101672b + ", modify_time=" + this.f101673c + ", cut=" + this.f101674d + ", next_review_day=" + this.f101675e + ", status=" + this.f101676f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101670h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordListItem.kt\ncom/baicizhan/biz/online/user_study_api/WordListItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,237:1\n1#2:238\n*E\n"})
    public static final class a implements ts.f<j2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101677a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101678b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f101679c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Boolean f101680d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f101681e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f101682f;

        public a() {
            this.f101677a = null;
            this.f101678b = null;
            this.f101679c = null;
            this.f101680d = null;
            this.f101681e = null;
            this.f101682f = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j2 build() {
            Integer num = this.f101677a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101678b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'mastered' is missing");
            }
            int intValue2 = num2.intValue();
            Long l11 = this.f101679c;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'modify_time' is missing");
            }
            long longValue = l11.longValue();
            Boolean bool = this.f101680d;
            if (bool == null) {
                throw new IllegalStateException("Required field 'cut' is missing");
            }
            boolean booleanValue = bool.booleanValue();
            Integer num3 = this.f101681e;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'next_review_day' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f101682f;
            if (num4 != null) {
                return new j2(intValue, intValue2, longValue, booleanValue, intValue3, num4.intValue());
            }
            throw new IllegalStateException("Required field 'status' is missing");
        }

        @m80.k
        public final a b(boolean z11) {
            this.f101680d = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f101678b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(long j11) {
            this.f101679c = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f101681e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f101682f = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f101677a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101677a = null;
            this.f101678b = null;
            this.f101679c = null;
            this.f101680d = null;
            this.f101681e = null;
            this.f101682f = null;
        }

        public a(@m80.k j2 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101677a = Integer.valueOf(source.f101671a);
            this.f101678b = Integer.valueOf(source.f101672b);
            this.f101679c = Long.valueOf(source.f101673c);
            this.f101680d = Boolean.valueOf(source.f101674d);
            this.f101681e = Integer.valueOf(source.f101675e);
            this.f101682f = Integer.valueOf(source.f101676f);
        }
    }
}
