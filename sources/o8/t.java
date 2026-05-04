package o8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class t implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f76527f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<t, a> f76528g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76529a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76530b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f76531c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76532d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f76533e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<t, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            } else if (b11 == 11) {
                                builder.d(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.f(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.b(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.e(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k t struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserContent");
            protocol.Q6("nickname", 1, (byte) 11);
            protocol.p1(struct.f76529a);
            protocol.N2();
            protocol.Q6("content", 2, (byte) 11);
            protocol.p1(struct.f76530b);
            protocol.N2();
            protocol.Q6("show_time", 3, (byte) 8);
            protocol.l5(struct.f76531c);
            protocol.N2();
            protocol.Q6("msg_id", 4, (byte) 11);
            protocol.p1(struct.f76532d);
            protocol.N2();
            protocol.Q6("end_time", 5, (byte) 8);
            protocol.l5(struct.f76533e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public t(@m80.k String nickname, @m80.k String content, int i11, @m80.k String msg_id, int i12) {
        g0.p(nickname, "nickname");
        g0.p(content, "content");
        g0.p(msg_id, "msg_id");
        this.f76529a = nickname;
        this.f76530b = content;
        this.f76531c = i11;
        this.f76532d = msg_id;
        this.f76533e = i12;
    }

    public static /* synthetic */ t g(t tVar, String str, String str2, int i11, String str3, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = tVar.f76529a;
        }
        if ((i13 & 2) != 0) {
            str2 = tVar.f76530b;
        }
        if ((i13 & 4) != 0) {
            i11 = tVar.f76531c;
        }
        if ((i13 & 8) != 0) {
            str3 = tVar.f76532d;
        }
        if ((i13 & 16) != 0) {
            i12 = tVar.f76533e;
        }
        int i14 = i12;
        int i15 = i11;
        return tVar.f(str, str2, i15, str3, i14);
    }

    @m80.k
    public final String a() {
        return this.f76529a;
    }

    @m80.k
    public final String b() {
        return this.f76530b;
    }

    public final int c() {
        return this.f76531c;
    }

    @m80.k
    public final String d() {
        return this.f76532d;
    }

    public final int e() {
        return this.f76533e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return g0.g(this.f76529a, tVar.f76529a) && g0.g(this.f76530b, tVar.f76530b) && this.f76531c == tVar.f76531c && g0.g(this.f76532d, tVar.f76532d) && this.f76533e == tVar.f76533e;
    }

    @m80.k
    public final t f(@m80.k String nickname, @m80.k String content, int i11, @m80.k String msg_id, int i12) {
        g0.p(nickname, "nickname");
        g0.p(content, "content");
        g0.p(msg_id, "msg_id");
        return new t(nickname, content, i11, msg_id, i12);
    }

    public int hashCode() {
        return (((((((this.f76529a.hashCode() * 31) + this.f76530b.hashCode()) * 31) + Integer.hashCode(this.f76531c)) * 31) + this.f76532d.hashCode()) * 31) + Integer.hashCode(this.f76533e);
    }

    @m80.k
    public String toString() {
        return "UserContent(nickname=" + this.f76529a + ", content=" + this.f76530b + ", show_time=" + this.f76531c + ", msg_id=" + this.f76532d + ", end_time=" + this.f76533e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76528g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserContent.kt\ncom/baicizhan/biz/online/course_api/UserContent$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
    public static final class a implements ts.f<t> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f76534a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f76535b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f76536c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f76537d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f76538e;

        public a() {
            this.f76534a = null;
            this.f76535b = null;
            this.f76536c = null;
            this.f76537d = null;
            this.f76538e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t build() {
            String str = this.f76534a;
            if (str == null) {
                throw new IllegalStateException("Required field 'nickname' is missing");
            }
            String str2 = this.f76535b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'content' is missing");
            }
            Integer num = this.f76536c;
            if (num == null) {
                throw new IllegalStateException("Required field 'show_time' is missing");
            }
            int intValue = num.intValue();
            String str3 = this.f76537d;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'msg_id' is missing");
            }
            Integer num2 = this.f76538e;
            if (num2 != null) {
                return new t(str, str2, intValue, str3, num2.intValue());
            }
            throw new IllegalStateException("Required field 'end_time' is missing");
        }

        @m80.k
        public final a b(@m80.k String content) {
            g0.p(content, "content");
            this.f76535b = content;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f76538e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.k String msg_id) {
            g0.p(msg_id, "msg_id");
            this.f76537d = msg_id;
            return this;
        }

        @m80.k
        public final a e(@m80.k String nickname) {
            g0.p(nickname, "nickname");
            this.f76534a = nickname;
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f76536c = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76534a = null;
            this.f76535b = null;
            this.f76536c = null;
            this.f76537d = null;
            this.f76538e = null;
        }

        public a(@m80.k t source) {
            g0.p(source, "source");
            this.f76534a = source.f76529a;
            this.f76535b = source.f76530b;
            this.f76536c = Integer.valueOf(source.f76531c);
            this.f76537d = source.f76532d;
            this.f76538e = Integer.valueOf(source.f76533e);
        }
    }
}
