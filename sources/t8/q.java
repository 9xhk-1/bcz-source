package t8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class q implements ts.e {

    @m80.k
    public static final b B = new b(null);

    @w00.g
    @m80.k
    public static final ts.a<q, a> C = new c();

    @m80.l
    @w00.g
    public final Integer A;

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f90170a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90171b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f90172c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90173d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f90174e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90175f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f90176g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90177h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f90178i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90179j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f90180k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90181l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f90182m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90183n;

    /* renamed from: o, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f90184o;

    /* renamed from: p, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90185p;

    /* renamed from: q, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f90186q;

    /* renamed from: r, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90187r;

    /* renamed from: s, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f90188s;

    /* renamed from: t, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90189t;

    /* renamed from: u, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f90190u;

    /* renamed from: v, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90191v;

    /* renamed from: w, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f90192w;

    /* renamed from: x, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90193x;

    /* renamed from: y, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f90194y;

    /* renamed from: z, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90195z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<q, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q read(@m80.k ws.i protocol, @m80.k a builder) {
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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.z(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.t(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.u(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.x(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.y(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.r(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.s(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 10:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.n(protocol.readString());
                            break;
                        }
                    case 11:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.o(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 12:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.readString());
                            break;
                        }
                    case 13:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 14:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.l(protocol.readString());
                            break;
                        }
                    case 15:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.m(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 16:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.v(protocol.readString());
                            break;
                        }
                    case 17:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.w(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 18:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
                            break;
                        }
                    case 19:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 20:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.A(protocol.readString());
                            break;
                        }
                    case 21:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.B(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 22:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.p(protocol.readString());
                            break;
                        }
                    case 23:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.q(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 24:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
                            break;
                        }
                    case 25:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 26:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 27:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k q struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("VariantInfo");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f90170a);
            protocol.N2();
            if (struct.f90171b != null) {
                protocol.Q6("pl", 2, (byte) 11);
                protocol.p1(struct.f90171b);
                protocol.N2();
            }
            if (struct.f90172c != null) {
                protocol.Q6("pl_topic_id", 3, (byte) 8);
                protocol.l5(struct.f90172c.intValue());
                protocol.N2();
            }
            if (struct.f90173d != null) {
                protocol.Q6(com.alipay.sdk.m.k.b.f10659o, 4, (byte) 11);
                protocol.p1(struct.f90173d);
                protocol.N2();
            }
            if (struct.f90174e != null) {
                protocol.Q6("third_topic_id", 5, (byte) 8);
                protocol.l5(struct.f90174e.intValue());
                protocol.N2();
            }
            if (struct.f90175f != null) {
                protocol.Q6("past", 6, (byte) 11);
                protocol.p1(struct.f90175f);
                protocol.N2();
            }
            if (struct.f90176g != null) {
                protocol.Q6("past_topic_id", 7, (byte) 8);
                protocol.l5(struct.f90176g.intValue());
                protocol.N2();
            }
            if (struct.f90177h != null) {
                protocol.Q6("done", 8, (byte) 11);
                protocol.p1(struct.f90177h);
                protocol.N2();
            }
            if (struct.f90178i != null) {
                protocol.Q6("done_topic_id", 9, (byte) 8);
                protocol.l5(struct.f90178i.intValue());
                protocol.N2();
            }
            if (struct.f90179j != null) {
                protocol.Q6("ing", 10, (byte) 11);
                protocol.p1(struct.f90179j);
                protocol.N2();
            }
            if (struct.f90180k != null) {
                protocol.Q6("ing_topic_id", 11, (byte) 8);
                protocol.l5(struct.f90180k.intValue());
                protocol.N2();
            }
            if (struct.f90181l != null) {
                protocol.Q6("er", 12, (byte) 11);
                protocol.p1(struct.f90181l);
                protocol.N2();
            }
            if (struct.f90182m != null) {
                protocol.Q6("er_topic_id", 13, (byte) 8);
                protocol.l5(struct.f90182m.intValue());
                protocol.N2();
            }
            if (struct.f90183n != null) {
                protocol.Q6("est", 14, (byte) 11);
                protocol.p1(struct.f90183n);
                protocol.N2();
            }
            if (struct.f90184o != null) {
                protocol.Q6("est_topic_id", 15, (byte) 8);
                protocol.l5(struct.f90184o.intValue());
                protocol.N2();
            }
            if (struct.f90185p != null) {
                protocol.Q6("prep", 16, (byte) 11);
                protocol.p1(struct.f90185p);
                protocol.N2();
            }
            if (struct.f90186q != null) {
                protocol.Q6("prep_topic_id", 17, (byte) 8);
                protocol.l5(struct.f90186q.intValue());
                protocol.N2();
            }
            if (struct.f90187r != null) {
                protocol.Q6("adv", 18, (byte) 11);
                protocol.p1(struct.f90187r);
                protocol.N2();
            }
            if (struct.f90188s != null) {
                protocol.Q6("adv_topic_id", 19, (byte) 8);
                protocol.l5(struct.f90188s.intValue());
                protocol.N2();
            }
            if (struct.f90189t != null) {
                protocol.Q6("verb", 20, (byte) 11);
                protocol.p1(struct.f90189t);
                protocol.N2();
            }
            if (struct.f90190u != null) {
                protocol.Q6("verb_topic_id", 21, (byte) 8);
                protocol.l5(struct.f90190u.intValue());
                protocol.N2();
            }
            if (struct.f90191v != null) {
                protocol.Q6("noun", 22, (byte) 11);
                protocol.p1(struct.f90191v);
                protocol.N2();
            }
            if (struct.f90192w != null) {
                protocol.Q6("noun_topic_id", 23, (byte) 8);
                protocol.l5(struct.f90192w.intValue());
                protocol.N2();
            }
            if (struct.f90193x != null) {
                protocol.Q6("adj", 24, (byte) 11);
                protocol.p1(struct.f90193x);
                protocol.N2();
            }
            if (struct.f90194y != null) {
                protocol.Q6("adj_topic_id", 25, (byte) 8);
                protocol.l5(struct.f90194y.intValue());
                protocol.N2();
            }
            if (struct.f90195z != null) {
                protocol.Q6("conn", 26, (byte) 11);
                protocol.p1(struct.f90195z);
                protocol.N2();
            }
            if (struct.A != null) {
                protocol.Q6("conn_topic_id", 27, (byte) 8);
                protocol.l5(struct.A.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public q(int i11, @m80.l String str, @m80.l Integer num, @m80.l String str2, @m80.l Integer num2, @m80.l String str3, @m80.l Integer num3, @m80.l String str4, @m80.l Integer num4, @m80.l String str5, @m80.l Integer num5, @m80.l String str6, @m80.l Integer num6, @m80.l String str7, @m80.l Integer num7, @m80.l String str8, @m80.l Integer num8, @m80.l String str9, @m80.l Integer num9, @m80.l String str10, @m80.l Integer num10, @m80.l String str11, @m80.l Integer num11, @m80.l String str12, @m80.l Integer num12, @m80.l String str13, @m80.l Integer num13) {
        this.f90170a = i11;
        this.f90171b = str;
        this.f90172c = num;
        this.f90173d = str2;
        this.f90174e = num2;
        this.f90175f = str3;
        this.f90176g = num3;
        this.f90177h = str4;
        this.f90178i = num4;
        this.f90179j = str5;
        this.f90180k = num5;
        this.f90181l = str6;
        this.f90182m = num6;
        this.f90183n = str7;
        this.f90184o = num7;
        this.f90185p = str8;
        this.f90186q = num8;
        this.f90187r = str9;
        this.f90188s = num9;
        this.f90189t = str10;
        this.f90190u = num10;
        this.f90191v = str11;
        this.f90192w = num11;
        this.f90193x = str12;
        this.f90194y = num12;
        this.f90195z = str13;
        this.A = num13;
    }

    public static /* synthetic */ q C(q qVar, int i11, String str, Integer num, String str2, Integer num2, String str3, Integer num3, String str4, Integer num4, String str5, Integer num5, String str6, Integer num6, String str7, Integer num7, String str8, Integer num8, String str9, Integer num9, String str10, Integer num10, String str11, Integer num11, String str12, Integer num12, String str13, Integer num13, int i12, Object obj) {
        Integer num14;
        String str14;
        int i13 = (i12 & 1) != 0 ? qVar.f90170a : i11;
        String str15 = (i12 & 2) != 0 ? qVar.f90171b : str;
        Integer num15 = (i12 & 4) != 0 ? qVar.f90172c : num;
        String str16 = (i12 & 8) != 0 ? qVar.f90173d : str2;
        Integer num16 = (i12 & 16) != 0 ? qVar.f90174e : num2;
        String str17 = (i12 & 32) != 0 ? qVar.f90175f : str3;
        Integer num17 = (i12 & 64) != 0 ? qVar.f90176g : num3;
        String str18 = (i12 & 128) != 0 ? qVar.f90177h : str4;
        Integer num18 = (i12 & 256) != 0 ? qVar.f90178i : num4;
        String str19 = (i12 & 512) != 0 ? qVar.f90179j : str5;
        Integer num19 = (i12 & 1024) != 0 ? qVar.f90180k : num5;
        String str20 = (i12 & 2048) != 0 ? qVar.f90181l : str6;
        Integer num20 = (i12 & 4096) != 0 ? qVar.f90182m : num6;
        String str21 = (i12 & 8192) != 0 ? qVar.f90183n : str7;
        int i14 = i13;
        Integer num21 = (i12 & 16384) != 0 ? qVar.f90184o : num7;
        String str22 = (i12 & 32768) != 0 ? qVar.f90185p : str8;
        Integer num22 = (i12 & 65536) != 0 ? qVar.f90186q : num8;
        String str23 = (i12 & 131072) != 0 ? qVar.f90187r : str9;
        Integer num23 = (i12 & 262144) != 0 ? qVar.f90188s : num9;
        String str24 = (i12 & 524288) != 0 ? qVar.f90189t : str10;
        Integer num24 = (i12 & 1048576) != 0 ? qVar.f90190u : num10;
        String str25 = (i12 & 2097152) != 0 ? qVar.f90191v : str11;
        Integer num25 = (i12 & 4194304) != 0 ? qVar.f90192w : num11;
        String str26 = (i12 & 8388608) != 0 ? qVar.f90193x : str12;
        Integer num26 = (i12 & 16777216) != 0 ? qVar.f90194y : num12;
        String str27 = (i12 & 33554432) != 0 ? qVar.f90195z : str13;
        if ((i12 & 67108864) != 0) {
            str14 = str27;
            num14 = qVar.A;
        } else {
            num14 = num13;
            str14 = str27;
        }
        return qVar.B(i14, str15, num15, str16, num16, str17, num17, str18, num18, str19, num19, str20, num20, str21, num21, str22, num22, str23, num23, str24, num24, str25, num25, str26, num26, str14, num14);
    }

    @m80.l
    public final Integer A() {
        return this.f90178i;
    }

    @m80.k
    public final q B(int i11, @m80.l String str, @m80.l Integer num, @m80.l String str2, @m80.l Integer num2, @m80.l String str3, @m80.l Integer num3, @m80.l String str4, @m80.l Integer num4, @m80.l String str5, @m80.l Integer num5, @m80.l String str6, @m80.l Integer num6, @m80.l String str7, @m80.l Integer num7, @m80.l String str8, @m80.l Integer num8, @m80.l String str9, @m80.l Integer num9, @m80.l String str10, @m80.l Integer num10, @m80.l String str11, @m80.l Integer num11, @m80.l String str12, @m80.l Integer num12, @m80.l String str13, @m80.l Integer num13) {
        return new q(i11, str, num, str2, num2, str3, num3, str4, num4, str5, num5, str6, num6, str7, num7, str8, num8, str9, num9, str10, num10, str11, num11, str12, num12, str13, num13);
    }

    public final int a() {
        return this.f90170a;
    }

    @m80.l
    public final String b() {
        return this.f90179j;
    }

    @m80.l
    public final Integer c() {
        return this.f90180k;
    }

    @m80.l
    public final String d() {
        return this.f90181l;
    }

    @m80.l
    public final Integer e() {
        return this.f90182m;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f90170a == qVar.f90170a && g0.g(this.f90171b, qVar.f90171b) && g0.g(this.f90172c, qVar.f90172c) && g0.g(this.f90173d, qVar.f90173d) && g0.g(this.f90174e, qVar.f90174e) && g0.g(this.f90175f, qVar.f90175f) && g0.g(this.f90176g, qVar.f90176g) && g0.g(this.f90177h, qVar.f90177h) && g0.g(this.f90178i, qVar.f90178i) && g0.g(this.f90179j, qVar.f90179j) && g0.g(this.f90180k, qVar.f90180k) && g0.g(this.f90181l, qVar.f90181l) && g0.g(this.f90182m, qVar.f90182m) && g0.g(this.f90183n, qVar.f90183n) && g0.g(this.f90184o, qVar.f90184o) && g0.g(this.f90185p, qVar.f90185p) && g0.g(this.f90186q, qVar.f90186q) && g0.g(this.f90187r, qVar.f90187r) && g0.g(this.f90188s, qVar.f90188s) && g0.g(this.f90189t, qVar.f90189t) && g0.g(this.f90190u, qVar.f90190u) && g0.g(this.f90191v, qVar.f90191v) && g0.g(this.f90192w, qVar.f90192w) && g0.g(this.f90193x, qVar.f90193x) && g0.g(this.f90194y, qVar.f90194y) && g0.g(this.f90195z, qVar.f90195z) && g0.g(this.A, qVar.A);
    }

    @m80.l
    public final String f() {
        return this.f90183n;
    }

    @m80.l
    public final Integer g() {
        return this.f90184o;
    }

    @m80.l
    public final String h() {
        return this.f90185p;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f90170a) * 31;
        String str = this.f90171b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f90172c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f90173d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f90174e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f90175f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f90176g;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.f90177h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.f90178i;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str5 = this.f90179j;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num5 = this.f90180k;
        int hashCode11 = (hashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str6 = this.f90181l;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num6 = this.f90182m;
        int hashCode13 = (hashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str7 = this.f90183n;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num7 = this.f90184o;
        int hashCode15 = (hashCode14 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str8 = this.f90185p;
        int hashCode16 = (hashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num8 = this.f90186q;
        int hashCode17 = (hashCode16 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str9 = this.f90187r;
        int hashCode18 = (hashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num9 = this.f90188s;
        int hashCode19 = (hashCode18 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str10 = this.f90189t;
        int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num10 = this.f90190u;
        int hashCode21 = (hashCode20 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str11 = this.f90191v;
        int hashCode22 = (hashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num11 = this.f90192w;
        int hashCode23 = (hashCode22 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str12 = this.f90193x;
        int hashCode24 = (hashCode23 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num12 = this.f90194y;
        int hashCode25 = (hashCode24 + (num12 == null ? 0 : num12.hashCode())) * 31;
        String str13 = this.f90195z;
        int hashCode26 = (hashCode25 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num13 = this.A;
        return hashCode26 + (num13 != null ? num13.hashCode() : 0);
    }

    @m80.l
    public final Integer i() {
        return this.f90186q;
    }

    @m80.l
    public final String j() {
        return this.f90187r;
    }

    @m80.l
    public final Integer k() {
        return this.f90188s;
    }

    @m80.l
    public final String l() {
        return this.f90171b;
    }

    @m80.l
    public final String m() {
        return this.f90189t;
    }

    @m80.l
    public final Integer n() {
        return this.f90190u;
    }

    @m80.l
    public final String o() {
        return this.f90191v;
    }

    @m80.l
    public final Integer p() {
        return this.f90192w;
    }

    @m80.l
    public final String q() {
        return this.f90193x;
    }

    @m80.l
    public final Integer r() {
        return this.f90194y;
    }

    @m80.l
    public final String s() {
        return this.f90195z;
    }

    @m80.l
    public final Integer t() {
        return this.A;
    }

    @m80.k
    public String toString() {
        return "VariantInfo(topic_id=" + this.f90170a + ", pl=" + this.f90171b + ", pl_topic_id=" + this.f90172c + ", third=" + this.f90173d + ", third_topic_id=" + this.f90174e + ", past=" + this.f90175f + ", past_topic_id=" + this.f90176g + ", done=" + this.f90177h + ", done_topic_id=" + this.f90178i + ", ing=" + this.f90179j + ", ing_topic_id=" + this.f90180k + ", er=" + this.f90181l + ", er_topic_id=" + this.f90182m + ", est=" + this.f90183n + ", est_topic_id=" + this.f90184o + ", prep=" + this.f90185p + ", prep_topic_id=" + this.f90186q + ", adv=" + this.f90187r + ", adv_topic_id=" + this.f90188s + ", verb=" + this.f90189t + ", verb_topic_id=" + this.f90190u + ", noun=" + this.f90191v + ", noun_topic_id=" + this.f90192w + ", adj=" + this.f90193x + ", adj_topic_id=" + this.f90194y + ", conn=" + this.f90195z + ", conn_topic_id=" + this.A + ')';
    }

    @m80.l
    public final Integer u() {
        return this.f90172c;
    }

    @m80.l
    public final String v() {
        return this.f90173d;
    }

    @m80.l
    public final Integer w() {
        return this.f90174e;
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        C.write(protocol, this);
    }

    @m80.l
    public final String x() {
        return this.f90175f;
    }

    @m80.l
    public final Integer y() {
        return this.f90176g;
    }

    @m80.l
    public final String z() {
        return this.f90177h;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nVariantInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VariantInfo.kt\ncom/baicizhan/biz/online/resource_api/VariantInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,782:1\n1#2:783\n*E\n"})
    public static final class a implements ts.f<q> {

        @m80.l
        public Integer A;

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f90196a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f90197b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f90198c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f90199d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f90200e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f90201f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f90202g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f90203h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public Integer f90204i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public String f90205j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public Integer f90206k;

        /* renamed from: l, reason: collision with root package name */
        @m80.l
        public String f90207l;

        /* renamed from: m, reason: collision with root package name */
        @m80.l
        public Integer f90208m;

        /* renamed from: n, reason: collision with root package name */
        @m80.l
        public String f90209n;

        /* renamed from: o, reason: collision with root package name */
        @m80.l
        public Integer f90210o;

        /* renamed from: p, reason: collision with root package name */
        @m80.l
        public String f90211p;

        /* renamed from: q, reason: collision with root package name */
        @m80.l
        public Integer f90212q;

        /* renamed from: r, reason: collision with root package name */
        @m80.l
        public String f90213r;

        /* renamed from: s, reason: collision with root package name */
        @m80.l
        public Integer f90214s;

        /* renamed from: t, reason: collision with root package name */
        @m80.l
        public String f90215t;

        /* renamed from: u, reason: collision with root package name */
        @m80.l
        public Integer f90216u;

        /* renamed from: v, reason: collision with root package name */
        @m80.l
        public String f90217v;

        /* renamed from: w, reason: collision with root package name */
        @m80.l
        public Integer f90218w;

        /* renamed from: x, reason: collision with root package name */
        @m80.l
        public String f90219x;

        /* renamed from: y, reason: collision with root package name */
        @m80.l
        public Integer f90220y;

        /* renamed from: z, reason: collision with root package name */
        @m80.l
        public String f90221z;

        public a() {
            this.f90196a = null;
            this.f90197b = null;
            this.f90198c = null;
            this.f90199d = null;
            this.f90200e = null;
            this.f90201f = null;
            this.f90202g = null;
            this.f90203h = null;
            this.f90204i = null;
            this.f90205j = null;
            this.f90206k = null;
            this.f90207l = null;
            this.f90208m = null;
            this.f90209n = null;
            this.f90210o = null;
            this.f90211p = null;
            this.f90212q = null;
            this.f90213r = null;
            this.f90214s = null;
            this.f90215t = null;
            this.f90216u = null;
            this.f90217v = null;
            this.f90218w = null;
            this.f90219x = null;
            this.f90220y = null;
            this.f90221z = null;
            this.A = null;
        }

        @m80.k
        public final a A(@m80.l String str) {
            this.f90215t = str;
            return this;
        }

        @m80.k
        public final a B(@m80.l Integer num) {
            this.f90216u = num;
            return this;
        }

        @m80.k
        public final a a(@m80.l String str) {
            this.f90219x = str;
            return this;
        }

        @m80.k
        public final a b(@m80.l Integer num) {
            this.f90220y = num;
            return this;
        }

        @m80.k
        public final a c(@m80.l String str) {
            this.f90213r = str;
            return this;
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f90214s = num;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public q build() {
            Integer num = this.f90196a;
            if (num != null) {
                return new q(num.intValue(), this.f90197b, this.f90198c, this.f90199d, this.f90200e, this.f90201f, this.f90202g, this.f90203h, this.f90204i, this.f90205j, this.f90206k, this.f90207l, this.f90208m, this.f90209n, this.f90210o, this.f90211p, this.f90212q, this.f90213r, this.f90214s, this.f90215t, this.f90216u, this.f90217v, this.f90218w, this.f90219x, this.f90220y, this.f90221z, this.A);
            }
            throw new IllegalStateException("Required field 'topic_id' is missing");
        }

        @m80.k
        public final a f(@m80.l String str) {
            this.f90221z = str;
            return this;
        }

        @m80.k
        public final a g(@m80.l Integer num) {
            this.A = num;
            return this;
        }

        @m80.k
        public final a h(@m80.l String str) {
            this.f90203h = str;
            return this;
        }

        @m80.k
        public final a i(@m80.l Integer num) {
            this.f90204i = num;
            return this;
        }

        @m80.k
        public final a j(@m80.l String str) {
            this.f90207l = str;
            return this;
        }

        @m80.k
        public final a k(@m80.l Integer num) {
            this.f90208m = num;
            return this;
        }

        @m80.k
        public final a l(@m80.l String str) {
            this.f90209n = str;
            return this;
        }

        @m80.k
        public final a m(@m80.l Integer num) {
            this.f90210o = num;
            return this;
        }

        @m80.k
        public final a n(@m80.l String str) {
            this.f90205j = str;
            return this;
        }

        @m80.k
        public final a o(@m80.l Integer num) {
            this.f90206k = num;
            return this;
        }

        @m80.k
        public final a p(@m80.l String str) {
            this.f90217v = str;
            return this;
        }

        @m80.k
        public final a q(@m80.l Integer num) {
            this.f90218w = num;
            return this;
        }

        @m80.k
        public final a r(@m80.l String str) {
            this.f90201f = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90196a = null;
            this.f90197b = null;
            this.f90198c = null;
            this.f90199d = null;
            this.f90200e = null;
            this.f90201f = null;
            this.f90202g = null;
            this.f90203h = null;
            this.f90204i = null;
            this.f90205j = null;
            this.f90206k = null;
            this.f90207l = null;
            this.f90208m = null;
            this.f90209n = null;
            this.f90210o = null;
            this.f90211p = null;
            this.f90212q = null;
            this.f90213r = null;
            this.f90214s = null;
            this.f90215t = null;
            this.f90216u = null;
            this.f90217v = null;
            this.f90218w = null;
            this.f90219x = null;
            this.f90220y = null;
            this.f90221z = null;
            this.A = null;
        }

        @m80.k
        public final a s(@m80.l Integer num) {
            this.f90202g = num;
            return this;
        }

        @m80.k
        public final a t(@m80.l String str) {
            this.f90197b = str;
            return this;
        }

        @m80.k
        public final a u(@m80.l Integer num) {
            this.f90198c = num;
            return this;
        }

        @m80.k
        public final a v(@m80.l String str) {
            this.f90211p = str;
            return this;
        }

        @m80.k
        public final a w(@m80.l Integer num) {
            this.f90212q = num;
            return this;
        }

        @m80.k
        public final a x(@m80.l String str) {
            this.f90199d = str;
            return this;
        }

        @m80.k
        public final a y(@m80.l Integer num) {
            this.f90200e = num;
            return this;
        }

        @m80.k
        public final a z(int i11) {
            this.f90196a = Integer.valueOf(i11);
            return this;
        }

        public a(@m80.k q source) {
            g0.p(source, "source");
            this.f90196a = Integer.valueOf(source.f90170a);
            this.f90197b = source.f90171b;
            this.f90198c = source.f90172c;
            this.f90199d = source.f90173d;
            this.f90200e = source.f90174e;
            this.f90201f = source.f90175f;
            this.f90202g = source.f90176g;
            this.f90203h = source.f90177h;
            this.f90204i = source.f90178i;
            this.f90205j = source.f90179j;
            this.f90206k = source.f90180k;
            this.f90207l = source.f90181l;
            this.f90208m = source.f90182m;
            this.f90209n = source.f90183n;
            this.f90210o = source.f90184o;
            this.f90211p = source.f90185p;
            this.f90212q = source.f90186q;
            this.f90213r = source.f90187r;
            this.f90214s = source.f90188s;
            this.f90215t = source.f90189t;
            this.f90216u = source.f90190u;
            this.f90217v = source.f90191v;
            this.f90218w = source.f90192w;
            this.f90219x = source.f90193x;
            this.f90220y = source.f90194y;
            this.f90221z = source.f90195z;
            this.A = source.A;
        }
    }
}
