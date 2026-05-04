package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class o implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final b f101833h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<o, a> f101834i = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101835a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101836b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101837c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101838d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101839e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101840f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101841g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<o, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k o struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("DakaShareBonusResult");
            protocol.Q6("coin_count", 1, (byte) 8);
            protocol.l5(struct.f101835a);
            protocol.N2();
            protocol.Q6("status", 2, (byte) 8);
            protocol.l5(struct.f101836b);
            protocol.N2();
            protocol.Q6("message", 3, (byte) 11);
            protocol.p1(struct.f101837c);
            protocol.N2();
            if (struct.f101838d != null) {
                protocol.Q6("shareSuccess", 4, (byte) 11);
                protocol.p1(struct.f101838d);
                protocol.N2();
            }
            if (struct.f101839e != null) {
                protocol.Q6("extraTip", 5, (byte) 11);
                protocol.p1(struct.f101839e);
                protocol.N2();
            }
            if (struct.f101840f != null) {
                protocol.Q6("action", 6, (byte) 11);
                protocol.p1(struct.f101840f);
                protocol.N2();
            }
            if (struct.f101841g != null) {
                protocol.Q6("actionUrl", 7, (byte) 11);
                protocol.p1(struct.f101841g);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public o(int i11, int i12, @m80.k String message, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4) {
        kotlin.jvm.internal.g0.p(message, "message");
        this.f101835a = i11;
        this.f101836b = i12;
        this.f101837c = message;
        this.f101838d = str;
        this.f101839e = str2;
        this.f101840f = str3;
        this.f101841g = str4;
    }

    public static /* synthetic */ o i(o oVar, int i11, int i12, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = oVar.f101835a;
        }
        if ((i13 & 2) != 0) {
            i12 = oVar.f101836b;
        }
        if ((i13 & 4) != 0) {
            str = oVar.f101837c;
        }
        if ((i13 & 8) != 0) {
            str2 = oVar.f101838d;
        }
        if ((i13 & 16) != 0) {
            str3 = oVar.f101839e;
        }
        if ((i13 & 32) != 0) {
            str4 = oVar.f101840f;
        }
        if ((i13 & 64) != 0) {
            str5 = oVar.f101841g;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        String str9 = str;
        return oVar.h(i11, i12, str9, str2, str8, str6, str7);
    }

    public final int a() {
        return this.f101835a;
    }

    public final int b() {
        return this.f101836b;
    }

    @m80.k
    public final String c() {
        return this.f101837c;
    }

    @m80.l
    public final String d() {
        return this.f101838d;
    }

    @m80.l
    public final String e() {
        return this.f101839e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f101835a == oVar.f101835a && this.f101836b == oVar.f101836b && kotlin.jvm.internal.g0.g(this.f101837c, oVar.f101837c) && kotlin.jvm.internal.g0.g(this.f101838d, oVar.f101838d) && kotlin.jvm.internal.g0.g(this.f101839e, oVar.f101839e) && kotlin.jvm.internal.g0.g(this.f101840f, oVar.f101840f) && kotlin.jvm.internal.g0.g(this.f101841g, oVar.f101841g);
    }

    @m80.l
    public final String f() {
        return this.f101840f;
    }

    @m80.l
    public final String g() {
        return this.f101841g;
    }

    @m80.k
    public final o h(int i11, int i12, @m80.k String message, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4) {
        kotlin.jvm.internal.g0.p(message, "message");
        return new o(i11, i12, message, str, str2, str3, str4);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f101835a) * 31) + Integer.hashCode(this.f101836b)) * 31) + this.f101837c.hashCode()) * 31;
        String str = this.f101838d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f101839e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f101840f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f101841g;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "DakaShareBonusResult(coin_count=" + this.f101835a + ", status=" + this.f101836b + ", message=" + this.f101837c + ", shareSuccess=" + this.f101838d + ", extraTip=" + this.f101839e + ", action=" + this.f101840f + ", actionUrl=" + this.f101841g + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101834i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nDakaShareBonusResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DakaShareBonusResult.kt\ncom/baicizhan/biz/online/user_study_api/DakaShareBonusResult$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n1#2:270\n*E\n"})
    public static final class a implements ts.f<o> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101842a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101843b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f101844c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f101845d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f101846e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f101847f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f101848g;

        public a() {
            this.f101842a = null;
            this.f101843b = null;
            this.f101844c = null;
            this.f101845d = null;
            this.f101846e = null;
            this.f101847f = null;
            this.f101848g = null;
        }

        @m80.k
        public final a a(@m80.l String str) {
            this.f101847f = str;
            return this;
        }

        @m80.k
        public final a b(@m80.l String str) {
            this.f101848g = str;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public o build() {
            Integer num = this.f101842a;
            if (num == null) {
                throw new IllegalStateException("Required field 'coin_count' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101843b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'status' is missing");
            }
            int intValue2 = num2.intValue();
            String str = this.f101844c;
            if (str != null) {
                return new o(intValue, intValue2, str, this.f101845d, this.f101846e, this.f101847f, this.f101848g);
            }
            throw new IllegalStateException("Required field 'message' is missing");
        }

        @m80.k
        public final a d(int i11) {
            this.f101842a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(@m80.l String str) {
            this.f101846e = str;
            return this;
        }

        @m80.k
        public final a f(@m80.k String message) {
            kotlin.jvm.internal.g0.p(message, "message");
            this.f101844c = message;
            return this;
        }

        @m80.k
        public final a g(@m80.l String str) {
            this.f101845d = str;
            return this;
        }

        @m80.k
        public final a h(int i11) {
            this.f101843b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101842a = null;
            this.f101843b = null;
            this.f101844c = null;
            this.f101845d = null;
            this.f101846e = null;
            this.f101847f = null;
            this.f101848g = null;
        }

        public a(@m80.k o source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101842a = Integer.valueOf(source.f101835a);
            this.f101843b = Integer.valueOf(source.f101836b);
            this.f101844c = source.f101837c;
            this.f101845d = source.f101838d;
            this.f101846e = source.f101839e;
            this.f101847f = source.f101840f;
            this.f101848g = source.f101841g;
        }
    }
}
