package j8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class n implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f63856f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<n, a> f63857g = new c();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f63858a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f63859b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f63860c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f63861d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f63862e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<n, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n read(@m80.k ws.i protocol, @m80.k a builder) {
            g0.p(protocol, "protocol");
            g0.p(builder, "builder");
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
                                    builder.d(Integer.valueOf(protocol.s8()));
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 11) {
                                builder.e(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.b(Integer.valueOf(protocol.s8()));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.c(Integer.valueOf(protocol.s8()));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.f(Integer.valueOf(protocol.s8()));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k n struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("QRCodeRedirect");
            if (struct.f63858a != null) {
                protocol.Q6(ma.b.f72894c, 1, (byte) 8);
                protocol.l5(struct.f63858a.intValue());
                protocol.N2();
            }
            if (struct.f63859b != null) {
                protocol.Q6("exam_id", 2, (byte) 8);
                protocol.l5(struct.f63859b.intValue());
                protocol.N2();
            }
            if (struct.f63860c != null) {
                protocol.Q6("exam_category_id", 3, (byte) 8);
                protocol.l5(struct.f63860c.intValue());
                protocol.N2();
            }
            if (struct.f63861d != null) {
                protocol.Q6("url", 4, (byte) 11);
                protocol.p1(struct.f63861d);
                protocol.N2();
            }
            if (struct.f63862e != null) {
                protocol.Q6("reading_plan_id", 5, (byte) 8);
                protocol.l5(struct.f63862e.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public n(@m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l String str, @m80.l Integer num4) {
        this.f63858a = num;
        this.f63859b = num2;
        this.f63860c = num3;
        this.f63861d = str;
        this.f63862e = num4;
    }

    public static /* synthetic */ n g(n nVar, Integer num, Integer num2, Integer num3, String str, Integer num4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = nVar.f63858a;
        }
        if ((i11 & 2) != 0) {
            num2 = nVar.f63859b;
        }
        if ((i11 & 4) != 0) {
            num3 = nVar.f63860c;
        }
        if ((i11 & 8) != 0) {
            str = nVar.f63861d;
        }
        if ((i11 & 16) != 0) {
            num4 = nVar.f63862e;
        }
        Integer num5 = num4;
        Integer num6 = num3;
        return nVar.f(num, num2, num6, str, num5);
    }

    @m80.l
    public final Integer a() {
        return this.f63858a;
    }

    @m80.l
    public final Integer b() {
        return this.f63859b;
    }

    @m80.l
    public final Integer c() {
        return this.f63860c;
    }

    @m80.l
    public final String d() {
        return this.f63861d;
    }

    @m80.l
    public final Integer e() {
        return this.f63862e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return g0.g(this.f63858a, nVar.f63858a) && g0.g(this.f63859b, nVar.f63859b) && g0.g(this.f63860c, nVar.f63860c) && g0.g(this.f63861d, nVar.f63861d) && g0.g(this.f63862e, nVar.f63862e);
    }

    @m80.k
    public final n f(@m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l String str, @m80.l Integer num4) {
        return new n(num, num2, num3, str, num4);
    }

    public int hashCode() {
        Integer num = this.f63858a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f63859b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f63860c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f63861d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num4 = this.f63862e;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "QRCodeRedirect(word_level_id=" + this.f63858a + ", exam_id=" + this.f63859b + ", exam_category_id=" + this.f63860c + ", url=" + this.f63861d + ", reading_plan_id=" + this.f63862e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f63857g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nQRCodeRedirect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QRCodeRedirect.kt\ncom/baicizhan/biz/online/bcz_system_api/QRCodeRedirect$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
    public static final class a implements ts.f<n> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f63863a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f63864b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f63865c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f63866d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f63867e;

        public a() {
            this.f63863a = null;
            this.f63864b = null;
            this.f63865c = null;
            this.f63866d = null;
            this.f63867e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n build() {
            return new n(this.f63863a, this.f63864b, this.f63865c, this.f63866d, this.f63867e);
        }

        @m80.k
        public final a b(@m80.l Integer num) {
            this.f63865c = num;
            return this;
        }

        @m80.k
        public final a c(@m80.l Integer num) {
            this.f63864b = num;
            return this;
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f63867e = num;
            return this;
        }

        @m80.k
        public final a e(@m80.l String str) {
            this.f63866d = str;
            return this;
        }

        @m80.k
        public final a f(@m80.l Integer num) {
            this.f63863a = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f63863a = null;
            this.f63864b = null;
            this.f63865c = null;
            this.f63866d = null;
            this.f63867e = null;
        }

        public a(@m80.k n source) {
            g0.p(source, "source");
            this.f63863a = source.f63858a;
            this.f63864b = source.f63859b;
            this.f63865c = source.f63860c;
            this.f63866d = source.f63861d;
            this.f63867e = source.f63862e;
        }
    }
}
