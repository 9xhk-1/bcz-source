package z8;

import com.tencent.open.SocialConstants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class v0 implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f102123g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<v0, a> f102124h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f102125a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f102126b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f102127c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f102128d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102129e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f102130f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<v0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public v0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.a(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k v0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("TopicCorrectionReq");
            protocol.Q6("bookId", 1, (byte) 8);
            protocol.l5(struct.f102125a);
            protocol.N2();
            protocol.Q6("topicId", 2, (byte) 8);
            protocol.l5(struct.f102126b);
            protocol.N2();
            protocol.Q6("mode", 3, (byte) 8);
            protocol.l5(struct.f102127c);
            protocol.N2();
            protocol.Q6("cateIdx", 4, (byte) 8);
            protocol.l5(struct.f102128d);
            protocol.N2();
            protocol.Q6(SocialConstants.PARAM_APP_DESC, 5, (byte) 11);
            protocol.p1(struct.f102129e);
            protocol.N2();
            if (struct.f102130f != null) {
                protocol.Q6("imgUrl", 6, (byte) 11);
                protocol.p1(struct.f102130f);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public v0(int i11, int i12, int i13, int i14, @m80.k String desc, @m80.l String str) {
        kotlin.jvm.internal.g0.p(desc, "desc");
        this.f102125a = i11;
        this.f102126b = i12;
        this.f102127c = i13;
        this.f102128d = i14;
        this.f102129e = desc;
        this.f102130f = str;
    }

    public static /* synthetic */ v0 h(v0 v0Var, int i11, int i12, int i13, int i14, String str, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = v0Var.f102125a;
        }
        if ((i15 & 2) != 0) {
            i12 = v0Var.f102126b;
        }
        if ((i15 & 4) != 0) {
            i13 = v0Var.f102127c;
        }
        if ((i15 & 8) != 0) {
            i14 = v0Var.f102128d;
        }
        if ((i15 & 16) != 0) {
            str = v0Var.f102129e;
        }
        if ((i15 & 32) != 0) {
            str2 = v0Var.f102130f;
        }
        String str3 = str;
        String str4 = str2;
        return v0Var.g(i11, i12, i13, i14, str3, str4);
    }

    public final int a() {
        return this.f102125a;
    }

    public final int b() {
        return this.f102126b;
    }

    public final int c() {
        return this.f102127c;
    }

    public final int d() {
        return this.f102128d;
    }

    @m80.k
    public final String e() {
        return this.f102129e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f102125a == v0Var.f102125a && this.f102126b == v0Var.f102126b && this.f102127c == v0Var.f102127c && this.f102128d == v0Var.f102128d && kotlin.jvm.internal.g0.g(this.f102129e, v0Var.f102129e) && kotlin.jvm.internal.g0.g(this.f102130f, v0Var.f102130f);
    }

    @m80.l
    public final String f() {
        return this.f102130f;
    }

    @m80.k
    public final v0 g(int i11, int i12, int i13, int i14, @m80.k String desc, @m80.l String str) {
        kotlin.jvm.internal.g0.p(desc, "desc");
        return new v0(i11, i12, i13, i14, desc, str);
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f102125a) * 31) + Integer.hashCode(this.f102126b)) * 31) + Integer.hashCode(this.f102127c)) * 31) + Integer.hashCode(this.f102128d)) * 31) + this.f102129e.hashCode()) * 31;
        String str = this.f102130f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "TopicCorrectionReq(bookId=" + this.f102125a + ", topicId=" + this.f102126b + ", mode=" + this.f102127c + ", cateIdx=" + this.f102128d + ", desc=" + this.f102129e + ", imgUrl=" + this.f102130f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102124h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nTopicCorrectionReq.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicCorrectionReq.kt\ncom/baicizhan/biz/online/user_study_api/TopicCorrectionReq$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n1#2:231\n*E\n"})
    public static final class a implements ts.f<v0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f102131a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f102132b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f102133c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f102134d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f102135e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f102136f;

        public a() {
            this.f102131a = null;
            this.f102132b = null;
            this.f102133c = null;
            this.f102134d = null;
            this.f102135e = null;
            this.f102136f = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f102131a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public v0 build() {
            Integer num = this.f102131a;
            if (num == null) {
                throw new IllegalStateException("Required field 'bookId' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f102132b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'topicId' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f102133c;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'mode' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f102134d;
            if (num4 == null) {
                throw new IllegalStateException("Required field 'cateIdx' is missing");
            }
            int intValue4 = num4.intValue();
            String str = this.f102135e;
            if (str != null) {
                return new v0(intValue, intValue2, intValue3, intValue4, str, this.f102136f);
            }
            throw new IllegalStateException("Required field 'desc' is missing");
        }

        @m80.k
        public final a c(int i11) {
            this.f102134d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.k String desc) {
            kotlin.jvm.internal.g0.p(desc, "desc");
            this.f102135e = desc;
            return this;
        }

        @m80.k
        public final a e(@m80.l String str) {
            this.f102136f = str;
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f102133c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f102132b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102131a = null;
            this.f102132b = null;
            this.f102133c = null;
            this.f102134d = null;
            this.f102135e = null;
            this.f102136f = null;
        }

        public a(@m80.k v0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102131a = Integer.valueOf(source.f102125a);
            this.f102132b = Integer.valueOf(source.f102126b);
            this.f102133c = Integer.valueOf(source.f102127c);
            this.f102134d = Integer.valueOf(source.f102128d);
            this.f102135e = source.f102129e;
            this.f102136f = source.f102130f;
        }
    }
}
