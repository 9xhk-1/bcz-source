package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g2 implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f101553f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<g2, a> f101554g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101555a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101556b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101557c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f101558d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f101559e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<g2, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g2 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g2 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                    builder.d(protocol.s8());
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 8) {
                                builder.a(protocol.s8());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.c(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.e(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.f(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k g2 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserTask");
            protocol.Q6("userTaskId", 1, (byte) 8);
            protocol.l5(struct.f101555a);
            protocol.N2();
            protocol.Q6("taskName", 2, (byte) 11);
            protocol.p1(struct.f101556b);
            protocol.N2();
            protocol.Q6("progress", 3, (byte) 8);
            protocol.l5(struct.f101557c);
            protocol.N2();
            protocol.Q6("actionCnt", 4, (byte) 8);
            protocol.l5(struct.f101558d);
            protocol.N2();
            protocol.Q6("status", 5, (byte) 8);
            protocol.l5(struct.f101559e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public g2(int i11, @m80.k String taskName, int i12, int i13, int i14) {
        kotlin.jvm.internal.g0.p(taskName, "taskName");
        this.f101555a = i11;
        this.f101556b = taskName;
        this.f101557c = i12;
        this.f101558d = i13;
        this.f101559e = i14;
    }

    public static /* synthetic */ g2 g(g2 g2Var, int i11, String str, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = g2Var.f101555a;
        }
        if ((i15 & 2) != 0) {
            str = g2Var.f101556b;
        }
        if ((i15 & 4) != 0) {
            i12 = g2Var.f101557c;
        }
        if ((i15 & 8) != 0) {
            i13 = g2Var.f101558d;
        }
        if ((i15 & 16) != 0) {
            i14 = g2Var.f101559e;
        }
        int i16 = i14;
        int i17 = i12;
        return g2Var.f(i11, str, i17, i13, i16);
    }

    public final int a() {
        return this.f101555a;
    }

    @m80.k
    public final String b() {
        return this.f101556b;
    }

    public final int c() {
        return this.f101557c;
    }

    public final int d() {
        return this.f101558d;
    }

    public final int e() {
        return this.f101559e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return this.f101555a == g2Var.f101555a && kotlin.jvm.internal.g0.g(this.f101556b, g2Var.f101556b) && this.f101557c == g2Var.f101557c && this.f101558d == g2Var.f101558d && this.f101559e == g2Var.f101559e;
    }

    @m80.k
    public final g2 f(int i11, @m80.k String taskName, int i12, int i13, int i14) {
        kotlin.jvm.internal.g0.p(taskName, "taskName");
        return new g2(i11, taskName, i12, i13, i14);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f101555a) * 31) + this.f101556b.hashCode()) * 31) + Integer.hashCode(this.f101557c)) * 31) + Integer.hashCode(this.f101558d)) * 31) + Integer.hashCode(this.f101559e);
    }

    @m80.k
    public String toString() {
        return "UserTask(userTaskId=" + this.f101555a + ", taskName=" + this.f101556b + ", progress=" + this.f101557c + ", actionCnt=" + this.f101558d + ", status=" + this.f101559e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101554g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTask.kt\ncom/baicizhan/biz/online/user_study_api/UserTask$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
    public static final class a implements ts.f<g2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101560a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101561b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101562c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f101563d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f101564e;

        public a() {
            this.f101560a = null;
            this.f101561b = null;
            this.f101562c = null;
            this.f101563d = null;
            this.f101564e = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f101563d = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g2 build() {
            Integer num = this.f101560a;
            if (num == null) {
                throw new IllegalStateException("Required field 'userTaskId' is missing");
            }
            int intValue = num.intValue();
            String str = this.f101561b;
            if (str == null) {
                throw new IllegalStateException("Required field 'taskName' is missing");
            }
            Integer num2 = this.f101562c;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'progress' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f101563d;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'actionCnt' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f101564e;
            if (num4 != null) {
                return new g2(intValue, str, intValue2, intValue3, num4.intValue());
            }
            throw new IllegalStateException("Required field 'status' is missing");
        }

        @m80.k
        public final a c(int i11) {
            this.f101562c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f101564e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(@m80.k String taskName) {
            kotlin.jvm.internal.g0.p(taskName, "taskName");
            this.f101561b = taskName;
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f101560a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101560a = null;
            this.f101561b = null;
            this.f101562c = null;
            this.f101563d = null;
            this.f101564e = null;
        }

        public a(@m80.k g2 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101560a = Integer.valueOf(source.f101555a);
            this.f101561b = source.f101556b;
            this.f101562c = Integer.valueOf(source.f101557c);
            this.f101563d = Integer.valueOf(source.f101558d);
            this.f101564e = Integer.valueOf(source.f101559e);
        }
    }
}
