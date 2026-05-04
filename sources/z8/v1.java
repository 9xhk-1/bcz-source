package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class v1 implements ts.e {

    @m80.k
    public static final b A = new b(null);

    @w00.g
    @m80.k
    public static final ts.a<v1, a> B = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f102137a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f102138b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102139c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102140d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102141e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102142f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102143g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f102144h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f102145i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f102146j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102147k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102148l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f102149m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f102150n;

    /* renamed from: o, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102151o;

    /* renamed from: p, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102152p;

    /* renamed from: q, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102153q;

    /* renamed from: r, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102154r;

    /* renamed from: s, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<h2> f102155s;

    /* renamed from: t, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102156t;

    /* renamed from: u, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102157u;

    /* renamed from: v, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102158v;

    /* renamed from: w, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102159w;

    /* renamed from: x, reason: collision with root package name */
    @m80.l
    @w00.g
    public final p f102160x;

    /* renamed from: y, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102161y;

    /* renamed from: z, reason: collision with root package name */
    @m80.l
    @w00.g
    public final f0 f102162z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<v1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public v1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 == 8) {
                            builder.u(protocol.s8());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 8) {
                            builder.j(protocol.s8());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 8) {
                            builder.v(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 8) {
                            builder.k(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 8) {
                            builder.o(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 8) {
                            builder.b(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 7:
                        if (b11 == 8) {
                            builder.f(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 8:
                        if (b11 == 10) {
                            builder.q(Long.valueOf(protocol.T1()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 9:
                        if (b11 == 10) {
                            builder.w(Long.valueOf(protocol.T1()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 10:
                        if (b11 == 10) {
                            builder.x(Long.valueOf(protocol.T1()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 11:
                        if (b11 == 8) {
                            builder.s(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 12:
                        if (b11 == 8) {
                            builder.t(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 13:
                        if (b11 == 10) {
                            builder.d(Long.valueOf(protocol.T1()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 14:
                        if (b11 == 10) {
                            builder.A(Long.valueOf(protocol.T1()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 15:
                        if (b11 == 8) {
                            builder.h(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 16:
                        if (b11 == 8) {
                            builder.e(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 17:
                        if (b11 == 8) {
                            builder.i(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 18:
                        if (b11 == 8) {
                            builder.z(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 19:
                        if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i11 = v42.f96838b;
                            for (int i12 = 0; i12 < i11; i12++) {
                                arrayList.add(h2.f101586e.read(protocol));
                            }
                            protocol.l8();
                            builder.y(arrayList);
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 20:
                        if (b11 == 8) {
                            builder.l(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 21:
                        if (b11 == 8) {
                            builder.m(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 22:
                        if (b11 == 8) {
                            builder.c(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 23:
                        if (b11 == 8) {
                            builder.r(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 24:
                        if (b11 == 12) {
                            builder.g(p.f101864d.read(protocol));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 25:
                        if (b11 == 8) {
                            builder.p(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 26:
                        if (b11 == 12) {
                            builder.n(f0.f101506e.read(protocol));
                            break;
                        } else {
                            at.b.a(protocol, b11);
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
        public void write(@m80.k ws.i protocol, @m80.k v1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserLimitInfo");
            protocol.Q6("show_sentence_trans", 1, (byte) 8);
            protocol.l5(struct.f102137a);
            protocol.N2();
            protocol.Q6("has_word_friends", 2, (byte) 8);
            protocol.l5(struct.f102138b);
            protocol.N2();
            if (struct.f102139c != null) {
                protocol.Q6("spell_mode", 3, (byte) 8);
                protocol.l5(struct.f102139c.intValue());
                protocol.N2();
            }
            if (struct.f102140d != null) {
                protocol.Q6("listening_mode", 4, (byte) 8);
                protocol.l5(struct.f102140d.intValue());
                protocol.N2();
            }
            if (struct.f102141e != null) {
                protocol.Q6("question_book_cfg", 5, (byte) 8);
                protocol.l5(struct.f102141e.intValue());
                protocol.N2();
            }
            if (struct.f102142f != null) {
                protocol.Q6("chn_mode", 6, (byte) 8);
                protocol.l5(struct.f102142f.intValue());
                protocol.N2();
            }
            if (struct.f102143g != null) {
                protocol.Q6("difficulty_updated_at", 7, (byte) 8);
                protocol.l5(struct.f102143g.intValue());
                protocol.N2();
            }
            if (struct.f102144h != null) {
                protocol.Q6("roadmap_version", 8, (byte) 10);
                protocol.q7(struct.f102144h.longValue());
                protocol.N2();
            }
            if (struct.f102145i != null) {
                protocol.Q6("update_at_of_book_info", 9, (byte) 10);
                protocol.q7(struct.f102145i.longValue());
                protocol.N2();
            }
            if (struct.f102146j != null) {
                protocol.Q6("update_at_of_notify_info", 10, (byte) 10);
                protocol.q7(struct.f102146j.longValue());
                protocol.N2();
            }
            if (struct.f102147k != null) {
                protocol.Q6("show_horizontal", 11, (byte) 8);
                protocol.l5(struct.f102147k.intValue());
                protocol.N2();
            }
            if (struct.f102148l != null) {
                protocol.Q6("show_night", 12, (byte) 8);
                protocol.l5(struct.f102148l.intValue());
                protocol.N2();
            }
            if (struct.f102149m != null) {
                protocol.Q6("collect_words_updated_at", 13, (byte) 10);
                protocol.q7(struct.f102149m.longValue());
                protocol.N2();
            }
            if (struct.f102150n != null) {
                protocol.Q6("word_note_updated_at", 14, (byte) 10);
                protocol.q7(struct.f102150n.longValue());
                protocol.N2();
            }
            if (struct.f102151o != null) {
                protocol.Q6("exam_flag", 15, (byte) 8);
                protocol.l5(struct.f102151o.intValue());
                protocol.N2();
            }
            if (struct.f102152p != null) {
                protocol.Q6("cur_book_has_primary_school_mode", 16, (byte) 8);
                protocol.l5(struct.f102152p.intValue());
                protocol.N2();
            }
            if (struct.f102153q != null) {
                protocol.Q6("first_day_test_group", 17, (byte) 8);
                protocol.l5(struct.f102153q.intValue());
                protocol.N2();
            }
            if (struct.f102154r != null) {
                protocol.Q6("word_note_enable", 18, (byte) 8);
                protocol.l5(struct.f102154r.intValue());
                protocol.N2();
            }
            if (struct.f102155s != null) {
                protocol.Q6("wiki_component_cfg", 19, (byte) 15);
                protocol.y2((byte) 12, struct.f102155s.size());
                Iterator<h2> it = struct.f102155s.iterator();
                while (it.hasNext()) {
                    h2.f101586e.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f102156t != null) {
                protocol.Q6("middle_school_test_code", 20, (byte) 8);
                protocol.l5(struct.f102156t.intValue());
                protocol.N2();
            }
            if (struct.f102157u != null) {
                protocol.Q6("new_wiki", 21, (byte) 8);
                protocol.l5(struct.f102157u.intValue());
                protocol.N2();
            }
            if (struct.f102158v != null) {
                protocol.Q6("chn_style", 22, (byte) 8);
                protocol.l5(struct.f102158v.intValue());
                protocol.N2();
            }
            if (struct.f102159w != null) {
                protocol.Q6("show_device", 23, (byte) 8);
                protocol.l5(struct.f102159w.intValue());
                protocol.N2();
            }
            if (struct.f102160x != null) {
                protocol.Q6("dual_mode", 24, (byte) 12);
                p.f101864d.write(protocol, struct.f102160x);
                protocol.N2();
            }
            if (struct.f102161y != null) {
                protocol.Q6("rhyme_mode", 25, (byte) 8);
                protocol.l5(struct.f102161y.intValue());
                protocol.N2();
            }
            if (struct.f102162z != null) {
                protocol.Q6("pangolin_ad", 26, (byte) 12);
                f0.f101506e.write(protocol, struct.f102162z);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public v1(int i11, int i12, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l Integer num4, @m80.l Integer num5, @m80.l Long l11, @m80.l Long l12, @m80.l Long l13, @m80.l Integer num6, @m80.l Integer num7, @m80.l Long l14, @m80.l Long l15, @m80.l Integer num8, @m80.l Integer num9, @m80.l Integer num10, @m80.l Integer num11, @m80.l List<h2> list, @m80.l Integer num12, @m80.l Integer num13, @m80.l Integer num14, @m80.l Integer num15, @m80.l p pVar, @m80.l Integer num16, @m80.l f0 f0Var) {
        this.f102137a = i11;
        this.f102138b = i12;
        this.f102139c = num;
        this.f102140d = num2;
        this.f102141e = num3;
        this.f102142f = num4;
        this.f102143g = num5;
        this.f102144h = l11;
        this.f102145i = l12;
        this.f102146j = l13;
        this.f102147k = num6;
        this.f102148l = num7;
        this.f102149m = l14;
        this.f102150n = l15;
        this.f102151o = num8;
        this.f102152p = num9;
        this.f102153q = num10;
        this.f102154r = num11;
        this.f102155s = list;
        this.f102156t = num12;
        this.f102157u = num13;
        this.f102158v = num14;
        this.f102159w = num15;
        this.f102160x = pVar;
        this.f102161y = num16;
        this.f102162z = f0Var;
    }

    public static /* synthetic */ v1 B(v1 v1Var, int i11, int i12, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l11, Long l12, Long l13, Integer num6, Integer num7, Long l14, Long l15, Integer num8, Integer num9, Integer num10, Integer num11, List list, Integer num12, Integer num13, Integer num14, Integer num15, p pVar, Integer num16, f0 f0Var, int i13, Object obj) {
        f0 f0Var2;
        Integer num17;
        int i14 = (i13 & 1) != 0 ? v1Var.f102137a : i11;
        int i15 = (i13 & 2) != 0 ? v1Var.f102138b : i12;
        Integer num18 = (i13 & 4) != 0 ? v1Var.f102139c : num;
        Integer num19 = (i13 & 8) != 0 ? v1Var.f102140d : num2;
        Integer num20 = (i13 & 16) != 0 ? v1Var.f102141e : num3;
        Integer num21 = (i13 & 32) != 0 ? v1Var.f102142f : num4;
        Integer num22 = (i13 & 64) != 0 ? v1Var.f102143g : num5;
        Long l16 = (i13 & 128) != 0 ? v1Var.f102144h : l11;
        Long l17 = (i13 & 256) != 0 ? v1Var.f102145i : l12;
        Long l18 = (i13 & 512) != 0 ? v1Var.f102146j : l13;
        Integer num23 = (i13 & 1024) != 0 ? v1Var.f102147k : num6;
        Integer num24 = (i13 & 2048) != 0 ? v1Var.f102148l : num7;
        Long l19 = (i13 & 4096) != 0 ? v1Var.f102149m : l14;
        Long l21 = (i13 & 8192) != 0 ? v1Var.f102150n : l15;
        int i16 = i14;
        Integer num25 = (i13 & 16384) != 0 ? v1Var.f102151o : num8;
        Integer num26 = (i13 & 32768) != 0 ? v1Var.f102152p : num9;
        Integer num27 = (i13 & 65536) != 0 ? v1Var.f102153q : num10;
        Integer num28 = (i13 & 131072) != 0 ? v1Var.f102154r : num11;
        List list2 = (i13 & 262144) != 0 ? v1Var.f102155s : list;
        Integer num29 = (i13 & 524288) != 0 ? v1Var.f102156t : num12;
        Integer num30 = (i13 & 1048576) != 0 ? v1Var.f102157u : num13;
        Integer num31 = (i13 & 2097152) != 0 ? v1Var.f102158v : num14;
        Integer num32 = (i13 & 4194304) != 0 ? v1Var.f102159w : num15;
        p pVar2 = (i13 & 8388608) != 0 ? v1Var.f102160x : pVar;
        Integer num33 = (i13 & 16777216) != 0 ? v1Var.f102161y : num16;
        if ((i13 & 33554432) != 0) {
            num17 = num33;
            f0Var2 = v1Var.f102162z;
        } else {
            f0Var2 = f0Var;
            num17 = num33;
        }
        return v1Var.A(i16, i15, num18, num19, num20, num21, num22, l16, l17, l18, num23, num24, l19, l21, num25, num26, num27, num28, list2, num29, num30, num31, num32, pVar2, num17, f0Var2);
    }

    @m80.k
    public final v1 A(int i11, int i12, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l Integer num4, @m80.l Integer num5, @m80.l Long l11, @m80.l Long l12, @m80.l Long l13, @m80.l Integer num6, @m80.l Integer num7, @m80.l Long l14, @m80.l Long l15, @m80.l Integer num8, @m80.l Integer num9, @m80.l Integer num10, @m80.l Integer num11, @m80.l List<h2> list, @m80.l Integer num12, @m80.l Integer num13, @m80.l Integer num14, @m80.l Integer num15, @m80.l p pVar, @m80.l Integer num16, @m80.l f0 f0Var) {
        return new v1(i11, i12, num, num2, num3, num4, num5, l11, l12, l13, num6, num7, l14, l15, num8, num9, num10, num11, list, num12, num13, num14, num15, pVar, num16, f0Var);
    }

    public final int a() {
        return this.f102137a;
    }

    @m80.l
    public final Long b() {
        return this.f102146j;
    }

    @m80.l
    public final Integer c() {
        return this.f102147k;
    }

    @m80.l
    public final Integer d() {
        return this.f102148l;
    }

    @m80.l
    public final Long e() {
        return this.f102149m;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return this.f102137a == v1Var.f102137a && this.f102138b == v1Var.f102138b && kotlin.jvm.internal.g0.g(this.f102139c, v1Var.f102139c) && kotlin.jvm.internal.g0.g(this.f102140d, v1Var.f102140d) && kotlin.jvm.internal.g0.g(this.f102141e, v1Var.f102141e) && kotlin.jvm.internal.g0.g(this.f102142f, v1Var.f102142f) && kotlin.jvm.internal.g0.g(this.f102143g, v1Var.f102143g) && kotlin.jvm.internal.g0.g(this.f102144h, v1Var.f102144h) && kotlin.jvm.internal.g0.g(this.f102145i, v1Var.f102145i) && kotlin.jvm.internal.g0.g(this.f102146j, v1Var.f102146j) && kotlin.jvm.internal.g0.g(this.f102147k, v1Var.f102147k) && kotlin.jvm.internal.g0.g(this.f102148l, v1Var.f102148l) && kotlin.jvm.internal.g0.g(this.f102149m, v1Var.f102149m) && kotlin.jvm.internal.g0.g(this.f102150n, v1Var.f102150n) && kotlin.jvm.internal.g0.g(this.f102151o, v1Var.f102151o) && kotlin.jvm.internal.g0.g(this.f102152p, v1Var.f102152p) && kotlin.jvm.internal.g0.g(this.f102153q, v1Var.f102153q) && kotlin.jvm.internal.g0.g(this.f102154r, v1Var.f102154r) && kotlin.jvm.internal.g0.g(this.f102155s, v1Var.f102155s) && kotlin.jvm.internal.g0.g(this.f102156t, v1Var.f102156t) && kotlin.jvm.internal.g0.g(this.f102157u, v1Var.f102157u) && kotlin.jvm.internal.g0.g(this.f102158v, v1Var.f102158v) && kotlin.jvm.internal.g0.g(this.f102159w, v1Var.f102159w) && kotlin.jvm.internal.g0.g(this.f102160x, v1Var.f102160x) && kotlin.jvm.internal.g0.g(this.f102161y, v1Var.f102161y) && kotlin.jvm.internal.g0.g(this.f102162z, v1Var.f102162z);
    }

    @m80.l
    public final Long f() {
        return this.f102150n;
    }

    @m80.l
    public final Integer g() {
        return this.f102151o;
    }

    @m80.l
    public final Integer h() {
        return this.f102152p;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f102137a) * 31) + Integer.hashCode(this.f102138b)) * 31;
        Integer num = this.f102139c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f102140d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f102141e;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f102142f;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f102143g;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Long l11 = this.f102144h;
        int hashCode7 = (hashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f102145i;
        int hashCode8 = (hashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f102146j;
        int hashCode9 = (hashCode8 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Integer num6 = this.f102147k;
        int hashCode10 = (hashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f102148l;
        int hashCode11 = (hashCode10 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Long l14 = this.f102149m;
        int hashCode12 = (hashCode11 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f102150n;
        int hashCode13 = (hashCode12 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num8 = this.f102151o;
        int hashCode14 = (hashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f102152p;
        int hashCode15 = (hashCode14 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.f102153q;
        int hashCode16 = (hashCode15 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.f102154r;
        int hashCode17 = (hashCode16 + (num11 == null ? 0 : num11.hashCode())) * 31;
        List<h2> list = this.f102155s;
        int hashCode18 = (hashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num12 = this.f102156t;
        int hashCode19 = (hashCode18 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.f102157u;
        int hashCode20 = (hashCode19 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.f102158v;
        int hashCode21 = (hashCode20 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.f102159w;
        int hashCode22 = (hashCode21 + (num15 == null ? 0 : num15.hashCode())) * 31;
        p pVar = this.f102160x;
        int hashCode23 = (hashCode22 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        Integer num16 = this.f102161y;
        int hashCode24 = (hashCode23 + (num16 == null ? 0 : num16.hashCode())) * 31;
        f0 f0Var = this.f102162z;
        return hashCode24 + (f0Var != null ? f0Var.hashCode() : 0);
    }

    @m80.l
    public final Integer i() {
        return this.f102153q;
    }

    @m80.l
    public final Integer j() {
        return this.f102154r;
    }

    @m80.l
    public final List<h2> k() {
        return this.f102155s;
    }

    public final int l() {
        return this.f102138b;
    }

    @m80.l
    public final Integer m() {
        return this.f102156t;
    }

    @m80.l
    public final Integer n() {
        return this.f102157u;
    }

    @m80.l
    public final Integer o() {
        return this.f102158v;
    }

    @m80.l
    public final Integer p() {
        return this.f102159w;
    }

    @m80.l
    public final p q() {
        return this.f102160x;
    }

    @m80.l
    public final Integer r() {
        return this.f102161y;
    }

    @m80.l
    public final f0 s() {
        return this.f102162z;
    }

    @m80.l
    public final Integer t() {
        return this.f102139c;
    }

    @m80.k
    public String toString() {
        return "UserLimitInfo(show_sentence_trans=" + this.f102137a + ", has_word_friends=" + this.f102138b + ", spell_mode=" + this.f102139c + ", listening_mode=" + this.f102140d + ", question_book_cfg=" + this.f102141e + ", chn_mode=" + this.f102142f + ", difficulty_updated_at=" + this.f102143g + ", roadmap_version=" + this.f102144h + ", update_at_of_book_info=" + this.f102145i + ", update_at_of_notify_info=" + this.f102146j + ", show_horizontal=" + this.f102147k + ", show_night=" + this.f102148l + ", collect_words_updated_at=" + this.f102149m + ", word_note_updated_at=" + this.f102150n + ", exam_flag=" + this.f102151o + ", cur_book_has_primary_school_mode=" + this.f102152p + ", first_day_test_group=" + this.f102153q + ", word_note_enable=" + this.f102154r + ", wiki_component_cfg=" + this.f102155s + ", middle_school_test_code=" + this.f102156t + ", new_wiki=" + this.f102157u + ", chn_style=" + this.f102158v + ", show_device=" + this.f102159w + ", dual_mode=" + this.f102160x + ", rhyme_mode=" + this.f102161y + ", pangolin_ad=" + this.f102162z + ')';
    }

    @m80.l
    public final Integer u() {
        return this.f102140d;
    }

    @m80.l
    public final Integer v() {
        return this.f102141e;
    }

    @m80.l
    public final Integer w() {
        return this.f102142f;
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        B.write(protocol, this);
    }

    @m80.l
    public final Integer x() {
        return this.f102143g;
    }

    @m80.l
    public final Long y() {
        return this.f102144h;
    }

    @m80.l
    public final Long z() {
        return this.f102145i;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserLimitInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserLimitInfo.kt\ncom/baicizhan/biz/online/user_study_api/UserLimitInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,856:1\n1#2:857\n*E\n"})
    public static final class a implements ts.f<v1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f102163a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f102164b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f102165c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f102166d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f102167e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f102168f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f102169g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Long f102170h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public Long f102171i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public Long f102172j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public Integer f102173k;

        /* renamed from: l, reason: collision with root package name */
        @m80.l
        public Integer f102174l;

        /* renamed from: m, reason: collision with root package name */
        @m80.l
        public Long f102175m;

        /* renamed from: n, reason: collision with root package name */
        @m80.l
        public Long f102176n;

        /* renamed from: o, reason: collision with root package name */
        @m80.l
        public Integer f102177o;

        /* renamed from: p, reason: collision with root package name */
        @m80.l
        public Integer f102178p;

        /* renamed from: q, reason: collision with root package name */
        @m80.l
        public Integer f102179q;

        /* renamed from: r, reason: collision with root package name */
        @m80.l
        public Integer f102180r;

        /* renamed from: s, reason: collision with root package name */
        @m80.l
        public List<h2> f102181s;

        /* renamed from: t, reason: collision with root package name */
        @m80.l
        public Integer f102182t;

        /* renamed from: u, reason: collision with root package name */
        @m80.l
        public Integer f102183u;

        /* renamed from: v, reason: collision with root package name */
        @m80.l
        public Integer f102184v;

        /* renamed from: w, reason: collision with root package name */
        @m80.l
        public Integer f102185w;

        /* renamed from: x, reason: collision with root package name */
        @m80.l
        public p f102186x;

        /* renamed from: y, reason: collision with root package name */
        @m80.l
        public Integer f102187y;

        /* renamed from: z, reason: collision with root package name */
        @m80.l
        public f0 f102188z;

        public a() {
            this.f102167e = 0;
            this.f102163a = null;
            this.f102164b = null;
            this.f102165c = null;
            this.f102166d = null;
            this.f102167e = 0;
            this.f102168f = null;
            this.f102169g = null;
            this.f102170h = null;
            this.f102171i = null;
            this.f102172j = null;
            this.f102173k = null;
            this.f102174l = null;
            this.f102175m = null;
            this.f102176n = null;
            this.f102177o = null;
            this.f102178p = null;
            this.f102179q = null;
            this.f102180r = null;
            this.f102181s = null;
            this.f102182t = null;
            this.f102183u = null;
            this.f102184v = null;
            this.f102185w = null;
            this.f102186x = null;
            this.f102187y = null;
            this.f102188z = null;
        }

        @m80.k
        public final a A(@m80.l Long l11) {
            this.f102176n = l11;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v1 build() {
            Integer num = this.f102163a;
            if (num == null) {
                throw new IllegalStateException("Required field 'show_sentence_trans' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f102164b;
            if (num2 != null) {
                return new v1(intValue, num2.intValue(), this.f102165c, this.f102166d, this.f102167e, this.f102168f, this.f102169g, this.f102170h, this.f102171i, this.f102172j, this.f102173k, this.f102174l, this.f102175m, this.f102176n, this.f102177o, this.f102178p, this.f102179q, this.f102180r, this.f102181s, this.f102182t, this.f102183u, this.f102184v, this.f102185w, this.f102186x, this.f102187y, this.f102188z);
            }
            throw new IllegalStateException("Required field 'has_word_friends' is missing");
        }

        @m80.k
        public final a b(@m80.l Integer num) {
            this.f102168f = num;
            return this;
        }

        @m80.k
        public final a c(@m80.l Integer num) {
            this.f102184v = num;
            return this;
        }

        @m80.k
        public final a d(@m80.l Long l11) {
            this.f102175m = l11;
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f102178p = num;
            return this;
        }

        @m80.k
        public final a f(@m80.l Integer num) {
            this.f102169g = num;
            return this;
        }

        @m80.k
        public final a g(@m80.l p pVar) {
            this.f102186x = pVar;
            return this;
        }

        @m80.k
        public final a h(@m80.l Integer num) {
            this.f102177o = num;
            return this;
        }

        @m80.k
        public final a i(@m80.l Integer num) {
            this.f102179q = num;
            return this;
        }

        @m80.k
        public final a j(int i11) {
            this.f102164b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a k(@m80.l Integer num) {
            this.f102166d = num;
            return this;
        }

        @m80.k
        public final a l(@m80.l Integer num) {
            this.f102182t = num;
            return this;
        }

        @m80.k
        public final a m(@m80.l Integer num) {
            this.f102183u = num;
            return this;
        }

        @m80.k
        public final a n(@m80.l f0 f0Var) {
            this.f102188z = f0Var;
            return this;
        }

        @m80.k
        public final a o(@m80.l Integer num) {
            this.f102167e = num;
            return this;
        }

        @m80.k
        public final a p(@m80.l Integer num) {
            this.f102187y = num;
            return this;
        }

        @m80.k
        public final a q(@m80.l Long l11) {
            this.f102170h = l11;
            return this;
        }

        @m80.k
        public final a r(@m80.l Integer num) {
            this.f102185w = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102163a = null;
            this.f102164b = null;
            this.f102165c = null;
            this.f102166d = null;
            this.f102167e = 0;
            this.f102168f = null;
            this.f102169g = null;
            this.f102170h = null;
            this.f102171i = null;
            this.f102172j = null;
            this.f102173k = null;
            this.f102174l = null;
            this.f102175m = null;
            this.f102176n = null;
            this.f102177o = null;
            this.f102178p = null;
            this.f102179q = null;
            this.f102180r = null;
            this.f102181s = null;
            this.f102182t = null;
            this.f102183u = null;
            this.f102184v = null;
            this.f102185w = null;
            this.f102186x = null;
            this.f102187y = null;
            this.f102188z = null;
        }

        @m80.k
        public final a s(@m80.l Integer num) {
            this.f102173k = num;
            return this;
        }

        @m80.k
        public final a t(@m80.l Integer num) {
            this.f102174l = num;
            return this;
        }

        @m80.k
        public final a u(int i11) {
            this.f102163a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a v(@m80.l Integer num) {
            this.f102165c = num;
            return this;
        }

        @m80.k
        public final a w(@m80.l Long l11) {
            this.f102171i = l11;
            return this;
        }

        @m80.k
        public final a x(@m80.l Long l11) {
            this.f102172j = l11;
            return this;
        }

        @m80.k
        public final a y(@m80.l List<h2> list) {
            this.f102181s = list;
            return this;
        }

        @m80.k
        public final a z(@m80.l Integer num) {
            this.f102180r = num;
            return this;
        }

        public a(@m80.k v1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102167e = 0;
            this.f102163a = Integer.valueOf(source.f102137a);
            this.f102164b = Integer.valueOf(source.f102138b);
            this.f102165c = source.f102139c;
            this.f102166d = source.f102140d;
            this.f102167e = source.f102141e;
            this.f102168f = source.f102142f;
            this.f102169g = source.f102143g;
            this.f102170h = source.f102144h;
            this.f102171i = source.f102145i;
            this.f102172j = source.f102146j;
            this.f102173k = source.f102147k;
            this.f102174l = source.f102148l;
            this.f102175m = source.f102149m;
            this.f102176n = source.f102150n;
            this.f102177o = source.f102151o;
            this.f102178p = source.f102152p;
            this.f102179q = source.f102153q;
            this.f102180r = source.f102154r;
            this.f102181s = source.f102155s;
            this.f102182t = source.f102156t;
            this.f102183u = source.f102157u;
            this.f102184v = source.f102158v;
            this.f102185w = source.f102159w;
            this.f102186x = source.f102160x;
            this.f102187y = source.f102161y;
            this.f102188z = source.f102162z;
        }
    }

    public /* synthetic */ v1(int i11, int i12, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l11, Long l12, Long l13, Integer num6, Integer num7, Long l14, Long l15, Integer num8, Integer num9, Integer num10, Integer num11, List list, Integer num12, Integer num13, Integer num14, Integer num15, p pVar, Integer num16, f0 f0Var, int i13, kotlin.jvm.internal.v vVar) {
        this(i11, i12, num, num2, (i13 & 16) != 0 ? 0 : num3, num4, num5, l11, l12, l13, num6, num7, l14, l15, num8, num9, num10, num11, list, num12, num13, num14, num15, pVar, num16, f0Var);
    }
}
