package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class y implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f102271d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<y, a> f102272e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f102273a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102274b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102275c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<y, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        } else if (b11 == 11) {
                            builder.c(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.b(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.d(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k y struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("HomeButton");
            protocol.Q6("type", 1, (byte) 8);
            protocol.l5(struct.f102273a);
            protocol.N2();
            protocol.Q6(y9.b.f99687c, 2, (byte) 11);
            protocol.p1(struct.f102274b);
            protocol.N2();
            protocol.Q6("msg", 3, (byte) 11);
            protocol.p1(struct.f102275c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public y(int i11, @m80.k String link, @m80.k String msg) {
        kotlin.jvm.internal.g0.p(link, "link");
        kotlin.jvm.internal.g0.p(msg, "msg");
        this.f102273a = i11;
        this.f102274b = link;
        this.f102275c = msg;
    }

    public static /* synthetic */ y e(y yVar, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = yVar.f102273a;
        }
        if ((i12 & 2) != 0) {
            str = yVar.f102274b;
        }
        if ((i12 & 4) != 0) {
            str2 = yVar.f102275c;
        }
        return yVar.d(i11, str, str2);
    }

    public final int a() {
        return this.f102273a;
    }

    @m80.k
    public final String b() {
        return this.f102274b;
    }

    @m80.k
    public final String c() {
        return this.f102275c;
    }

    @m80.k
    public final y d(int i11, @m80.k String link, @m80.k String msg) {
        kotlin.jvm.internal.g0.p(link, "link");
        kotlin.jvm.internal.g0.p(msg, "msg");
        return new y(i11, link, msg);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f102273a == yVar.f102273a && kotlin.jvm.internal.g0.g(this.f102274b, yVar.f102274b) && kotlin.jvm.internal.g0.g(this.f102275c, yVar.f102275c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f102273a) * 31) + this.f102274b.hashCode()) * 31) + this.f102275c.hashCode();
    }

    @m80.k
    public String toString() {
        return "HomeButton(type=" + this.f102273a + ", link=" + this.f102274b + ", msg=" + this.f102275c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102272e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nHomeButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeButton.kt\ncom/baicizhan/biz/online/user_study_api/HomeButton$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
    public static final class a implements ts.f<y> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f102276a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f102277b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f102278c;

        public a() {
            this.f102276a = null;
            this.f102277b = null;
            this.f102278c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y build() {
            Integer num = this.f102276a;
            if (num == null) {
                throw new IllegalStateException("Required field 'type' is missing");
            }
            int intValue = num.intValue();
            String str = this.f102277b;
            if (str == null) {
                throw new IllegalStateException("Required field 'link' is missing");
            }
            String str2 = this.f102278c;
            if (str2 != null) {
                return new y(intValue, str, str2);
            }
            throw new IllegalStateException("Required field 'msg' is missing");
        }

        @m80.k
        public final a b(@m80.k String link) {
            kotlin.jvm.internal.g0.p(link, "link");
            this.f102277b = link;
            return this;
        }

        @m80.k
        public final a c(@m80.k String msg) {
            kotlin.jvm.internal.g0.p(msg, "msg");
            this.f102278c = msg;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f102276a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102276a = null;
            this.f102277b = null;
            this.f102278c = null;
        }

        public a(@m80.k y source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102276a = Integer.valueOf(source.f102273a);
            this.f102277b = source.f102274b;
            this.f102278c = source.f102275c;
        }
    }
}
