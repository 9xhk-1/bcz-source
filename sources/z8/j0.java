package z8;

import com.tencent.open.SocialConstants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class j0 implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f101643g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<j0, a> f101644h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101645a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101646b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101647c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f101648d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101649e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101650f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<j0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                if (s11 != 6) {
                                    if (s11 != 7) {
                                        at.b.a(protocol, b11);
                                    } else if (b11 == 8) {
                                        builder.g(Integer.valueOf(protocol.s8()));
                                    } else {
                                        at.b.a(protocol, b11);
                                    }
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
                        builder.f(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.b(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k j0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("ResourceItem");
            protocol.Q6("aid", 1, (byte) 8);
            protocol.l5(struct.f101645a);
            protocol.N2();
            protocol.Q6("title", 2, (byte) 11);
            protocol.p1(struct.f101646b);
            protocol.N2();
            protocol.Q6(SocialConstants.PARAM_IMG_URL, 3, (byte) 11);
            protocol.p1(struct.f101647c);
            protocol.N2();
            protocol.Q6("action", 4, (byte) 8);
            protocol.l5(struct.f101648d);
            protocol.N2();
            if (struct.f101649e != null) {
                protocol.Q6(y9.b.f99687c, 6, (byte) 11);
                protocol.p1(struct.f101649e);
                protocol.N2();
            }
            if (struct.f101650f != null) {
                protocol.Q6("type", 7, (byte) 8);
                protocol.l5(struct.f101650f.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public j0(int i11, @m80.k String title, @m80.k String img, int i12, @m80.l String str, @m80.l Integer num) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(img, "img");
        this.f101645a = i11;
        this.f101646b = title;
        this.f101647c = img;
        this.f101648d = i12;
        this.f101649e = str;
        this.f101650f = num;
    }

    public static /* synthetic */ j0 h(j0 j0Var, int i11, String str, String str2, int i12, String str3, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = j0Var.f101645a;
        }
        if ((i13 & 2) != 0) {
            str = j0Var.f101646b;
        }
        if ((i13 & 4) != 0) {
            str2 = j0Var.f101647c;
        }
        if ((i13 & 8) != 0) {
            i12 = j0Var.f101648d;
        }
        if ((i13 & 16) != 0) {
            str3 = j0Var.f101649e;
        }
        if ((i13 & 32) != 0) {
            num = j0Var.f101650f;
        }
        String str4 = str3;
        Integer num2 = num;
        return j0Var.g(i11, str, str2, i12, str4, num2);
    }

    public final int a() {
        return this.f101645a;
    }

    @m80.k
    public final String b() {
        return this.f101646b;
    }

    @m80.k
    public final String c() {
        return this.f101647c;
    }

    public final int d() {
        return this.f101648d;
    }

    @m80.l
    public final String e() {
        return this.f101649e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f101645a == j0Var.f101645a && kotlin.jvm.internal.g0.g(this.f101646b, j0Var.f101646b) && kotlin.jvm.internal.g0.g(this.f101647c, j0Var.f101647c) && this.f101648d == j0Var.f101648d && kotlin.jvm.internal.g0.g(this.f101649e, j0Var.f101649e) && kotlin.jvm.internal.g0.g(this.f101650f, j0Var.f101650f);
    }

    @m80.l
    public final Integer f() {
        return this.f101650f;
    }

    @m80.k
    public final j0 g(int i11, @m80.k String title, @m80.k String img, int i12, @m80.l String str, @m80.l Integer num) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(img, "img");
        return new j0(i11, title, img, i12, str, num);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f101645a) * 31) + this.f101646b.hashCode()) * 31) + this.f101647c.hashCode()) * 31) + Integer.hashCode(this.f101648d)) * 31;
        String str = this.f101649e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f101650f;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "ResourceItem(aid=" + this.f101645a + ", title=" + this.f101646b + ", img=" + this.f101647c + ", action=" + this.f101648d + ", link=" + this.f101649e + ", type=" + this.f101650f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101644h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nResourceItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceItem.kt\ncom/baicizhan/biz/online/user_study_api/ResourceItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,231:1\n1#2:232\n*E\n"})
    public static final class a implements ts.f<j0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101651a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101652b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f101653c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f101654d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f101655e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f101656f;

        public a() {
            this.f101651a = null;
            this.f101652b = null;
            this.f101653c = null;
            this.f101654d = null;
            this.f101655e = null;
            this.f101656f = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f101654d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a b(int i11) {
            this.f101651a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public j0 build() {
            Integer num = this.f101651a;
            if (num == null) {
                throw new IllegalStateException("Required field 'aid' is missing");
            }
            int intValue = num.intValue();
            String str = this.f101652b;
            if (str == null) {
                throw new IllegalStateException("Required field 'title' is missing");
            }
            String str2 = this.f101653c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'img' is missing");
            }
            Integer num2 = this.f101654d;
            if (num2 != null) {
                return new j0(intValue, str, str2, num2.intValue(), this.f101655e, this.f101656f);
            }
            throw new IllegalStateException("Required field 'action' is missing");
        }

        @m80.k
        public final a d(@m80.k String img) {
            kotlin.jvm.internal.g0.p(img, "img");
            this.f101653c = img;
            return this;
        }

        @m80.k
        public final a e(@m80.l String str) {
            this.f101655e = str;
            return this;
        }

        @m80.k
        public final a f(@m80.k String title) {
            kotlin.jvm.internal.g0.p(title, "title");
            this.f101652b = title;
            return this;
        }

        @m80.k
        public final a g(@m80.l Integer num) {
            this.f101656f = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101651a = null;
            this.f101652b = null;
            this.f101653c = null;
            this.f101654d = null;
            this.f101655e = null;
            this.f101656f = null;
        }

        public a(@m80.k j0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101651a = Integer.valueOf(source.f101645a);
            this.f101652b = source.f101646b;
            this.f101653c = source.f101647c;
            this.f101654d = Integer.valueOf(source.f101648d);
            this.f101655e = source.f101649e;
            this.f101656f = source.f101650f;
        }
    }
}
