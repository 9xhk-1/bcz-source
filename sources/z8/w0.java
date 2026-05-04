package z8;

import com.tencent.open.SocialConstants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class w0 implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f102195e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<w0, a> f102196f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102197a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102198b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f102199c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f102200d;

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
                            if (s11 != 4) {
                                at.b.a(protocol, b11);
                            } else if (b11 == 11) {
                                builder.e(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.a(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.d(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.b(protocol.readString());
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
            protocol.g6("TrainPageBannerItem");
            protocol.Q6("aid", 1, (byte) 11);
            protocol.p1(struct.f102197a);
            protocol.N2();
            protocol.Q6(SocialConstants.PARAM_IMG_URL, 2, (byte) 11);
            protocol.p1(struct.f102198b);
            protocol.N2();
            protocol.Q6("action", 3, (byte) 8);
            protocol.l5(struct.f102199c);
            protocol.N2();
            if (struct.f102200d != null) {
                protocol.Q6(y9.b.f99687c, 4, (byte) 11);
                protocol.p1(struct.f102200d);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public w0(@m80.k String aid, @m80.k String img, int i11, @m80.l String str) {
        kotlin.jvm.internal.g0.p(aid, "aid");
        kotlin.jvm.internal.g0.p(img, "img");
        this.f102197a = aid;
        this.f102198b = img;
        this.f102199c = i11;
        this.f102200d = str;
    }

    public static /* synthetic */ w0 f(w0 w0Var, String str, String str2, int i11, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = w0Var.f102197a;
        }
        if ((i12 & 2) != 0) {
            str2 = w0Var.f102198b;
        }
        if ((i12 & 4) != 0) {
            i11 = w0Var.f102199c;
        }
        if ((i12 & 8) != 0) {
            str3 = w0Var.f102200d;
        }
        return w0Var.e(str, str2, i11, str3);
    }

    @m80.k
    public final String a() {
        return this.f102197a;
    }

    @m80.k
    public final String b() {
        return this.f102198b;
    }

    public final int c() {
        return this.f102199c;
    }

    @m80.l
    public final String d() {
        return this.f102200d;
    }

    @m80.k
    public final w0 e(@m80.k String aid, @m80.k String img, int i11, @m80.l String str) {
        kotlin.jvm.internal.g0.p(aid, "aid");
        kotlin.jvm.internal.g0.p(img, "img");
        return new w0(aid, img, i11, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return kotlin.jvm.internal.g0.g(this.f102197a, w0Var.f102197a) && kotlin.jvm.internal.g0.g(this.f102198b, w0Var.f102198b) && this.f102199c == w0Var.f102199c && kotlin.jvm.internal.g0.g(this.f102200d, w0Var.f102200d);
    }

    public int hashCode() {
        int hashCode = ((((this.f102197a.hashCode() * 31) + this.f102198b.hashCode()) * 31) + Integer.hashCode(this.f102199c)) * 31;
        String str = this.f102200d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "TrainPageBannerItem(aid=" + this.f102197a + ", img=" + this.f102198b + ", action=" + this.f102199c + ", link=" + this.f102200d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102196f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nTrainPageBannerItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainPageBannerItem.kt\ncom/baicizhan/biz/online/user_study_api/TrainPageBannerItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
    public static final class a implements ts.f<w0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f102201a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f102202b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f102203c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f102204d;

        public a() {
            this.f102201a = null;
            this.f102202b = null;
            this.f102203c = null;
            this.f102204d = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f102203c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a b(@m80.k String aid) {
            kotlin.jvm.internal.g0.p(aid, "aid");
            this.f102201a = aid;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public w0 build() {
            String str = this.f102201a;
            if (str == null) {
                throw new IllegalStateException("Required field 'aid' is missing");
            }
            String str2 = this.f102202b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'img' is missing");
            }
            Integer num = this.f102203c;
            if (num != null) {
                return new w0(str, str2, num.intValue(), this.f102204d);
            }
            throw new IllegalStateException("Required field 'action' is missing");
        }

        @m80.k
        public final a d(@m80.k String img) {
            kotlin.jvm.internal.g0.p(img, "img");
            this.f102202b = img;
            return this;
        }

        @m80.k
        public final a e(@m80.l String str) {
            this.f102204d = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102201a = null;
            this.f102202b = null;
            this.f102203c = null;
            this.f102204d = null;
        }

        public a(@m80.k w0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102201a = source.f102197a;
            this.f102202b = source.f102198b;
            this.f102203c = Integer.valueOf(source.f102199c);
            this.f102204d = source.f102200d;
        }
    }
}
