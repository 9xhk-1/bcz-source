package o8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f76403e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<f, a> f76404f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f76405a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76406b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76407c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76408d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<f, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                at.b.a(protocol, b11);
                            } else if (b11 == 11) {
                                builder.e(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.b(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.a(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k f struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("DiscountCoupon");
            protocol.Q6("show_time", 1, (byte) 8);
            protocol.l5(struct.f76405a);
            protocol.N2();
            protocol.Q6("big_close_url", 2, (byte) 11);
            protocol.p1(struct.f76406b);
            protocol.N2();
            protocol.Q6("big_open_url", 3, (byte) 11);
            protocol.p1(struct.f76407c);
            protocol.N2();
            protocol.Q6("small_url", 4, (byte) 11);
            protocol.p1(struct.f76408d);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public f(int i11, @m80.k String big_close_url, @m80.k String big_open_url, @m80.k String small_url) {
        g0.p(big_close_url, "big_close_url");
        g0.p(big_open_url, "big_open_url");
        g0.p(small_url, "small_url");
        this.f76405a = i11;
        this.f76406b = big_close_url;
        this.f76407c = big_open_url;
        this.f76408d = small_url;
    }

    public static /* synthetic */ f f(f fVar, int i11, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = fVar.f76405a;
        }
        if ((i12 & 2) != 0) {
            str = fVar.f76406b;
        }
        if ((i12 & 4) != 0) {
            str2 = fVar.f76407c;
        }
        if ((i12 & 8) != 0) {
            str3 = fVar.f76408d;
        }
        return fVar.e(i11, str, str2, str3);
    }

    public final int a() {
        return this.f76405a;
    }

    @m80.k
    public final String b() {
        return this.f76406b;
    }

    @m80.k
    public final String c() {
        return this.f76407c;
    }

    @m80.k
    public final String d() {
        return this.f76408d;
    }

    @m80.k
    public final f e(int i11, @m80.k String big_close_url, @m80.k String big_open_url, @m80.k String small_url) {
        g0.p(big_close_url, "big_close_url");
        g0.p(big_open_url, "big_open_url");
        g0.p(small_url, "small_url");
        return new f(i11, big_close_url, big_open_url, small_url);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f76405a == fVar.f76405a && g0.g(this.f76406b, fVar.f76406b) && g0.g(this.f76407c, fVar.f76407c) && g0.g(this.f76408d, fVar.f76408d);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f76405a) * 31) + this.f76406b.hashCode()) * 31) + this.f76407c.hashCode()) * 31) + this.f76408d.hashCode();
    }

    @m80.k
    public String toString() {
        return "DiscountCoupon(show_time=" + this.f76405a + ", big_close_url=" + this.f76406b + ", big_open_url=" + this.f76407c + ", small_url=" + this.f76408d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76404f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDiscountCoupon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscountCoupon.kt\ncom/baicizhan/biz/online/course_api/DiscountCoupon$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
    public static final class a implements ts.f<f> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f76409a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f76410b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f76411c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f76412d;

        public a() {
            this.f76409a = null;
            this.f76410b = null;
            this.f76411c = null;
            this.f76412d = null;
        }

        @m80.k
        public final a a(@m80.k String big_close_url) {
            g0.p(big_close_url, "big_close_url");
            this.f76410b = big_close_url;
            return this;
        }

        @m80.k
        public final a b(@m80.k String big_open_url) {
            g0.p(big_open_url, "big_open_url");
            this.f76411c = big_open_url;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f build() {
            Integer num = this.f76409a;
            if (num == null) {
                throw new IllegalStateException("Required field 'show_time' is missing");
            }
            int intValue = num.intValue();
            String str = this.f76410b;
            if (str == null) {
                throw new IllegalStateException("Required field 'big_close_url' is missing");
            }
            String str2 = this.f76411c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'big_open_url' is missing");
            }
            String str3 = this.f76412d;
            if (str3 != null) {
                return new f(intValue, str, str2, str3);
            }
            throw new IllegalStateException("Required field 'small_url' is missing");
        }

        @m80.k
        public final a d(int i11) {
            this.f76409a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(@m80.k String small_url) {
            g0.p(small_url, "small_url");
            this.f76412d = small_url;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76409a = null;
            this.f76410b = null;
            this.f76411c = null;
            this.f76412d = null;
        }

        public a(@m80.k f source) {
            g0.p(source, "source");
            this.f76409a = Integer.valueOf(source.f76405a);
            this.f76410b = source.f76406b;
            this.f76411c = source.f76407c;
            this.f76412d = source.f76408d;
        }
    }
}
