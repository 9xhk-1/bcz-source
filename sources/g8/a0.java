package g8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a0 implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f53162e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<a0, a> f53163f = new c();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f53164a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f53165b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53166c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53167d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<a0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a0 read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                builder.c(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.a(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.e(Integer.valueOf(protocol.s8()));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.d(Integer.valueOf(protocol.s8()));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k a0 struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("StartupAdRequest");
            if (struct.f53164a != null) {
                protocol.Q6("screen_length", 1, (byte) 8);
                protocol.l5(struct.f53164a.intValue());
                protocol.N2();
            }
            if (struct.f53165b != null) {
                protocol.Q6("screen_width", 2, (byte) 8);
                protocol.l5(struct.f53165b.intValue());
                protocol.N2();
            }
            if (struct.f53166c != null) {
                protocol.Q6("android_id", 3, (byte) 11);
                protocol.p1(struct.f53166c);
                protocol.N2();
            }
            if (struct.f53167d != null) {
                protocol.Q6("oaid", 4, (byte) 11);
                protocol.p1(struct.f53167d);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public a0(@m80.l Integer num, @m80.l Integer num2, @m80.l String str, @m80.l String str2) {
        this.f53164a = num;
        this.f53165b = num2;
        this.f53166c = str;
        this.f53167d = str2;
    }

    public static /* synthetic */ a0 f(a0 a0Var, Integer num, Integer num2, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = a0Var.f53164a;
        }
        if ((i11 & 2) != 0) {
            num2 = a0Var.f53165b;
        }
        if ((i11 & 4) != 0) {
            str = a0Var.f53166c;
        }
        if ((i11 & 8) != 0) {
            str2 = a0Var.f53167d;
        }
        return a0Var.e(num, num2, str, str2);
    }

    @m80.l
    public final Integer a() {
        return this.f53164a;
    }

    @m80.l
    public final Integer b() {
        return this.f53165b;
    }

    @m80.l
    public final String c() {
        return this.f53166c;
    }

    @m80.l
    public final String d() {
        return this.f53167d;
    }

    @m80.k
    public final a0 e(@m80.l Integer num, @m80.l Integer num2, @m80.l String str, @m80.l String str2) {
        return new a0(num, num2, str, str2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return g0.g(this.f53164a, a0Var.f53164a) && g0.g(this.f53165b, a0Var.f53165b) && g0.g(this.f53166c, a0Var.f53166c) && g0.g(this.f53167d, a0Var.f53167d);
    }

    public int hashCode() {
        Integer num = this.f53164a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f53165b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f53166c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f53167d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "StartupAdRequest(screen_length=" + this.f53164a + ", screen_width=" + this.f53165b + ", android_id=" + this.f53166c + ", oaid=" + this.f53167d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53163f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nStartupAdRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupAdRequest.kt\ncom/baicizhan/biz/online/advertise_api/StartupAdRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
    public static final class a implements ts.f<a0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f53168a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f53169b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f53170c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f53171d;

        public a() {
            this.f53168a = null;
            this.f53169b = null;
            this.f53170c = null;
            this.f53171d = null;
        }

        @m80.k
        public final a a(@m80.l String str) {
            this.f53170c = str;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a0 build() {
            return new a0(this.f53168a, this.f53169b, this.f53170c, this.f53171d);
        }

        @m80.k
        public final a c(@m80.l String str) {
            this.f53171d = str;
            return this;
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f53168a = num;
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f53169b = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53168a = null;
            this.f53169b = null;
            this.f53170c = null;
            this.f53171d = null;
        }

        public a(@m80.k a0 source) {
            g0.p(source, "source");
            this.f53168a = source.f53164a;
            this.f53169b = source.f53165b;
            this.f53170c = source.f53166c;
            this.f53171d = source.f53167d;
        }
    }
}
