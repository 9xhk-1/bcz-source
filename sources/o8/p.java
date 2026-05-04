package o8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class p implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f76489f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<p, a> f76490g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76491a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76492b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f76493c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f76494d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f76495e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<p, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                    builder.c(protocol.s8());
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 8) {
                                builder.e(protocol.s8());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.f(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.b(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.d(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k p struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ProContent");
            protocol.Q6("nickname", 1, (byte) 11);
            protocol.p1(struct.f76491a);
            protocol.N2();
            protocol.Q6("content", 2, (byte) 11);
            protocol.p1(struct.f76492b);
            protocol.N2();
            if (struct.f76493c != null) {
                protocol.Q6("url", 3, (byte) 11);
                protocol.p1(struct.f76493c);
                protocol.N2();
            }
            protocol.Q6("show_time", 4, (byte) 8);
            protocol.l5(struct.f76494d);
            protocol.N2();
            protocol.Q6("end_time", 5, (byte) 8);
            protocol.l5(struct.f76495e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public p(@m80.k String nickname, @m80.k String content, @m80.l String str, int i11, int i12) {
        g0.p(nickname, "nickname");
        g0.p(content, "content");
        this.f76491a = nickname;
        this.f76492b = content;
        this.f76493c = str;
        this.f76494d = i11;
        this.f76495e = i12;
    }

    public static /* synthetic */ p g(p pVar, String str, String str2, String str3, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pVar.f76491a;
        }
        if ((i13 & 2) != 0) {
            str2 = pVar.f76492b;
        }
        if ((i13 & 4) != 0) {
            str3 = pVar.f76493c;
        }
        if ((i13 & 8) != 0) {
            i11 = pVar.f76494d;
        }
        if ((i13 & 16) != 0) {
            i12 = pVar.f76495e;
        }
        int i14 = i12;
        String str4 = str3;
        return pVar.f(str, str2, str4, i11, i14);
    }

    @m80.k
    public final String a() {
        return this.f76491a;
    }

    @m80.k
    public final String b() {
        return this.f76492b;
    }

    @m80.l
    public final String c() {
        return this.f76493c;
    }

    public final int d() {
        return this.f76494d;
    }

    public final int e() {
        return this.f76495e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return g0.g(this.f76491a, pVar.f76491a) && g0.g(this.f76492b, pVar.f76492b) && g0.g(this.f76493c, pVar.f76493c) && this.f76494d == pVar.f76494d && this.f76495e == pVar.f76495e;
    }

    @m80.k
    public final p f(@m80.k String nickname, @m80.k String content, @m80.l String str, int i11, int i12) {
        g0.p(nickname, "nickname");
        g0.p(content, "content");
        return new p(nickname, content, str, i11, i12);
    }

    public int hashCode() {
        int hashCode = ((this.f76491a.hashCode() * 31) + this.f76492b.hashCode()) * 31;
        String str = this.f76493c;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f76494d)) * 31) + Integer.hashCode(this.f76495e);
    }

    @m80.k
    public String toString() {
        return "ProContent(nickname=" + this.f76491a + ", content=" + this.f76492b + ", url=" + this.f76493c + ", show_time=" + this.f76494d + ", end_time=" + this.f76495e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76490g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nProContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProContent.kt\ncom/baicizhan/biz/online/course_api/ProContent$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1#2:212\n*E\n"})
    public static final class a implements ts.f<p> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f76496a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f76497b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f76498c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f76499d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f76500e;

        public a() {
            this.f76496a = null;
            this.f76497b = null;
            this.f76498c = null;
            this.f76499d = null;
            this.f76500e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p build() {
            String str = this.f76496a;
            if (str == null) {
                throw new IllegalStateException("Required field 'nickname' is missing");
            }
            String str2 = this.f76497b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'content' is missing");
            }
            String str3 = this.f76498c;
            Integer num = this.f76499d;
            if (num == null) {
                throw new IllegalStateException("Required field 'show_time' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f76500e;
            if (num2 != null) {
                return new p(str, str2, str3, intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'end_time' is missing");
        }

        @m80.k
        public final a b(@m80.k String content) {
            g0.p(content, "content");
            this.f76497b = content;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f76500e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.k String nickname) {
            g0.p(nickname, "nickname");
            this.f76496a = nickname;
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f76499d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(@m80.l String str) {
            this.f76498c = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76496a = null;
            this.f76497b = null;
            this.f76498c = null;
            this.f76499d = null;
            this.f76500e = null;
        }

        public a(@m80.k p source) {
            g0.p(source, "source");
            this.f76496a = source.f76491a;
            this.f76497b = source.f76492b;
            this.f76498c = source.f76493c;
            this.f76499d = Integer.valueOf(source.f76494d);
            this.f76500e = Integer.valueOf(source.f76495e);
        }
    }
}
