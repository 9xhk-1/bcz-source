package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a1 implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f101124e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<a1, a> f101125f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final z0 f101126a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final v1 f101127b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final s1 f101128c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final v f101129d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<a1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                at.b.a(protocol, b11);
                            } else if (b11 == 12) {
                                builder.b(v.f102114f.read(protocol));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 12) {
                            builder.c(s1.f102006l.read(protocol));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        builder.d(v1.B.read(protocol));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.e(z0.f102302q.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k a1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserBasicInfoPlus");
            protocol.Q6(i9.m.f60424b, 1, (byte) 12);
            z0.f102302q.write(protocol, struct.f101126a);
            protocol.N2();
            protocol.Q6("limit_info", 2, (byte) 12);
            v1.B.write(protocol, struct.f101127b);
            protocol.N2();
            protocol.Q6("learn_info", 3, (byte) 12);
            s1.f102006l.write(protocol, struct.f101128c);
            protocol.N2();
            if (struct.f101129d != null) {
                protocol.Q6("extra_info", 4, (byte) 12);
                v.f102114f.write(protocol, struct.f101129d);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public a1(@m80.k z0 user_info, @m80.k v1 limit_info, @m80.k s1 learn_info, @m80.l v vVar) {
        kotlin.jvm.internal.g0.p(user_info, "user_info");
        kotlin.jvm.internal.g0.p(limit_info, "limit_info");
        kotlin.jvm.internal.g0.p(learn_info, "learn_info");
        this.f101126a = user_info;
        this.f101127b = limit_info;
        this.f101128c = learn_info;
        this.f101129d = vVar;
    }

    public static /* synthetic */ a1 f(a1 a1Var, z0 z0Var, v1 v1Var, s1 s1Var, v vVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z0Var = a1Var.f101126a;
        }
        if ((i11 & 2) != 0) {
            v1Var = a1Var.f101127b;
        }
        if ((i11 & 4) != 0) {
            s1Var = a1Var.f101128c;
        }
        if ((i11 & 8) != 0) {
            vVar = a1Var.f101129d;
        }
        return a1Var.e(z0Var, v1Var, s1Var, vVar);
    }

    @m80.k
    public final z0 a() {
        return this.f101126a;
    }

    @m80.k
    public final v1 b() {
        return this.f101127b;
    }

    @m80.k
    public final s1 c() {
        return this.f101128c;
    }

    @m80.l
    public final v d() {
        return this.f101129d;
    }

    @m80.k
    public final a1 e(@m80.k z0 user_info, @m80.k v1 limit_info, @m80.k s1 learn_info, @m80.l v vVar) {
        kotlin.jvm.internal.g0.p(user_info, "user_info");
        kotlin.jvm.internal.g0.p(limit_info, "limit_info");
        kotlin.jvm.internal.g0.p(learn_info, "learn_info");
        return new a1(user_info, limit_info, learn_info, vVar);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return kotlin.jvm.internal.g0.g(this.f101126a, a1Var.f101126a) && kotlin.jvm.internal.g0.g(this.f101127b, a1Var.f101127b) && kotlin.jvm.internal.g0.g(this.f101128c, a1Var.f101128c) && kotlin.jvm.internal.g0.g(this.f101129d, a1Var.f101129d);
    }

    public int hashCode() {
        int hashCode = ((((this.f101126a.hashCode() * 31) + this.f101127b.hashCode()) * 31) + this.f101128c.hashCode()) * 31;
        v vVar = this.f101129d;
        return hashCode + (vVar == null ? 0 : vVar.hashCode());
    }

    @m80.k
    public String toString() {
        return "UserBasicInfoPlus(user_info=" + this.f101126a + ", limit_info=" + this.f101127b + ", learn_info=" + this.f101128c + ", extra_info=" + this.f101129d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101125f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserBasicInfoPlus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBasicInfoPlus.kt\ncom/baicizhan/biz/online/user_study_api/UserBasicInfoPlus$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
    public static final class a implements ts.f<a1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public z0 f101130a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public v1 f101131b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public s1 f101132c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public v f101133d;

        public a() {
            this.f101130a = null;
            this.f101131b = null;
            this.f101132c = null;
            this.f101133d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a1 build() {
            z0 z0Var = this.f101130a;
            if (z0Var == null) {
                throw new IllegalStateException("Required field 'user_info' is missing");
            }
            v1 v1Var = this.f101131b;
            if (v1Var == null) {
                throw new IllegalStateException("Required field 'limit_info' is missing");
            }
            s1 s1Var = this.f101132c;
            if (s1Var != null) {
                return new a1(z0Var, v1Var, s1Var, this.f101133d);
            }
            throw new IllegalStateException("Required field 'learn_info' is missing");
        }

        @m80.k
        public final a b(@m80.l v vVar) {
            this.f101133d = vVar;
            return this;
        }

        @m80.k
        public final a c(@m80.k s1 learn_info) {
            kotlin.jvm.internal.g0.p(learn_info, "learn_info");
            this.f101132c = learn_info;
            return this;
        }

        @m80.k
        public final a d(@m80.k v1 limit_info) {
            kotlin.jvm.internal.g0.p(limit_info, "limit_info");
            this.f101131b = limit_info;
            return this;
        }

        @m80.k
        public final a e(@m80.k z0 user_info) {
            kotlin.jvm.internal.g0.p(user_info, "user_info");
            this.f101130a = user_info;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101130a = null;
            this.f101131b = null;
            this.f101132c = null;
            this.f101133d = null;
        }

        public a(@m80.k a1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101130a = source.f101126a;
            this.f101131b = source.f101127b;
            this.f101132c = source.f101128c;
            this.f101133d = source.f101129d;
        }
    }
}
