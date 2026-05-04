package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class w1 implements ts.e {

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public static final b f102205u = new b(null);

    /* renamed from: v, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<w1, a> f102206v = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f102207a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f102208b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102209c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102210d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102211e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f102212f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f102213g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f102214h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f102215i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102216j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102217k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<h2> f102218l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102219m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102220n;

    /* renamed from: o, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102221o;

    /* renamed from: p, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102222p;

    /* renamed from: q, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f102223q;

    /* renamed from: r, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102224r;

    /* renamed from: s, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f102225s;

    /* renamed from: t, reason: collision with root package name */
    @m80.l
    @w00.g
    public final x f102226t;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<w1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public w1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.m(protocol.s8());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 8) {
                            builder.h(protocol.s8());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 8) {
                            builder.o(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 8) {
                            builder.i(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 8) {
                            builder.b(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 10) {
                            builder.p(Long.valueOf(protocol.T1()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 7:
                        if (b11 == 10) {
                            builder.q(Long.valueOf(protocol.T1()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 8:
                        if (b11 == 10) {
                            builder.d(Long.valueOf(protocol.T1()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 9:
                        if (b11 == 10) {
                            builder.t(Long.valueOf(protocol.T1()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 10:
                        if (b11 == 8) {
                            builder.e(Integer.valueOf(protocol.s8()));
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
                        if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i11 = v42.f96838b;
                            for (int i12 = 0; i12 < i11; i12++) {
                                arrayList.add(h2.f101586e.read(protocol));
                            }
                            protocol.l8();
                            builder.r(arrayList);
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 13:
                        if (b11 == 8) {
                            builder.j(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 14:
                        if (b11 == 8) {
                            builder.c(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 15:
                        if (b11 == 8) {
                            builder.l(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 16:
                        if (b11 == 8) {
                            builder.f(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 17:
                        if (b11 == 11) {
                            builder.u(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 18:
                        if (b11 == 8) {
                            builder.n(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 19:
                        if (b11 == 10) {
                            builder.k(Long.valueOf(protocol.T1()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 20:
                        if (b11 == 12) {
                            builder.g(x.f102248d.read(protocol));
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
        public void write(@m80.k ws.i protocol, @m80.k w1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserLimitInfoV2");
            protocol.Q6("show_sentence_trans", 1, (byte) 8);
            protocol.l5(struct.f102207a);
            protocol.N2();
            protocol.Q6("has_word_friends", 2, (byte) 8);
            protocol.l5(struct.f102208b);
            protocol.N2();
            if (struct.f102209c != null) {
                protocol.Q6("spell_mode", 3, (byte) 8);
                protocol.l5(struct.f102209c.intValue());
                protocol.N2();
            }
            if (struct.f102210d != null) {
                protocol.Q6("listening_mode", 4, (byte) 8);
                protocol.l5(struct.f102210d.intValue());
                protocol.N2();
            }
            if (struct.f102211e != null) {
                protocol.Q6("chn_mode", 5, (byte) 8);
                protocol.l5(struct.f102211e.intValue());
                protocol.N2();
            }
            if (struct.f102212f != null) {
                protocol.Q6("update_at_of_book_info", 6, (byte) 10);
                protocol.q7(struct.f102212f.longValue());
                protocol.N2();
            }
            if (struct.f102213g != null) {
                protocol.Q6("update_at_of_notify_info", 7, (byte) 10);
                protocol.q7(struct.f102213g.longValue());
                protocol.N2();
            }
            if (struct.f102214h != null) {
                protocol.Q6("collect_words_updated_at", 8, (byte) 10);
                protocol.q7(struct.f102214h.longValue());
                protocol.N2();
            }
            if (struct.f102215i != null) {
                protocol.Q6("word_note_updated_at", 9, (byte) 10);
                protocol.q7(struct.f102215i.longValue());
                protocol.N2();
            }
            if (struct.f102216j != null) {
                protocol.Q6("cur_book_has_primary_school_mode", 10, (byte) 8);
                protocol.l5(struct.f102216j.intValue());
                protocol.N2();
            }
            if (struct.f102217k != null) {
                protocol.Q6("word_note_enable", 11, (byte) 8);
                protocol.l5(struct.f102217k.intValue());
                protocol.N2();
            }
            if (struct.f102218l != null) {
                protocol.Q6("wiki_component_cfg", 12, (byte) 15);
                protocol.y2((byte) 12, struct.f102218l.size());
                Iterator<h2> it = struct.f102218l.iterator();
                while (it.hasNext()) {
                    h2.f101586e.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f102219m != null) {
                protocol.Q6("new_wiki", 13, (byte) 8);
                protocol.l5(struct.f102219m.intValue());
                protocol.N2();
            }
            if (struct.f102220n != null) {
                protocol.Q6("chn_style", 14, (byte) 8);
                protocol.l5(struct.f102220n.intValue());
                protocol.N2();
            }
            if (struct.f102221o != null) {
                protocol.Q6("show_device", 15, (byte) 8);
                protocol.l5(struct.f102221o.intValue());
                protocol.N2();
            }
            if (struct.f102222p != null) {
                protocol.Q6("current_mode", 16, (byte) 8);
                protocol.l5(struct.f102222p.intValue());
                protocol.N2();
            }
            if (struct.f102223q != null) {
                protocol.Q6("x_mode_setting", 17, (byte) 11);
                protocol.p1(struct.f102223q);
                protocol.N2();
            }
            if (struct.f102224r != null) {
                protocol.Q6("show_topic_correction", 18, (byte) 8);
                protocol.l5(struct.f102224r.intValue());
                protocol.N2();
            }
            if (struct.f102225s != null) {
                protocol.Q6("server_timestamp", 19, (byte) 10);
                protocol.q7(struct.f102225s.longValue());
                protocol.N2();
            }
            if (struct.f102226t != null) {
                protocol.Q6("game_mode", 20, (byte) 12);
                x.f102248d.write(protocol, struct.f102226t);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public w1(int i11, int i12, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l Long l11, @m80.l Long l12, @m80.l Long l13, @m80.l Long l14, @m80.l Integer num4, @m80.l Integer num5, @m80.l List<h2> list, @m80.l Integer num6, @m80.l Integer num7, @m80.l Integer num8, @m80.l Integer num9, @m80.l String str, @m80.l Integer num10, @m80.l Long l15, @m80.l x xVar) {
        this.f102207a = i11;
        this.f102208b = i12;
        this.f102209c = num;
        this.f102210d = num2;
        this.f102211e = num3;
        this.f102212f = l11;
        this.f102213g = l12;
        this.f102214h = l13;
        this.f102215i = l14;
        this.f102216j = num4;
        this.f102217k = num5;
        this.f102218l = list;
        this.f102219m = num6;
        this.f102220n = num7;
        this.f102221o = num8;
        this.f102222p = num9;
        this.f102223q = str;
        this.f102224r = num10;
        this.f102225s = l15;
        this.f102226t = xVar;
    }

    public static /* synthetic */ w1 v(w1 w1Var, int i11, int i12, Integer num, Integer num2, Integer num3, Long l11, Long l12, Long l13, Long l14, Integer num4, Integer num5, List list, Integer num6, Integer num7, Integer num8, Integer num9, String str, Integer num10, Long l15, x xVar, int i13, Object obj) {
        x xVar2;
        Long l16;
        int i14 = (i13 & 1) != 0 ? w1Var.f102207a : i11;
        int i15 = (i13 & 2) != 0 ? w1Var.f102208b : i12;
        Integer num11 = (i13 & 4) != 0 ? w1Var.f102209c : num;
        Integer num12 = (i13 & 8) != 0 ? w1Var.f102210d : num2;
        Integer num13 = (i13 & 16) != 0 ? w1Var.f102211e : num3;
        Long l17 = (i13 & 32) != 0 ? w1Var.f102212f : l11;
        Long l18 = (i13 & 64) != 0 ? w1Var.f102213g : l12;
        Long l19 = (i13 & 128) != 0 ? w1Var.f102214h : l13;
        Long l21 = (i13 & 256) != 0 ? w1Var.f102215i : l14;
        Integer num14 = (i13 & 512) != 0 ? w1Var.f102216j : num4;
        Integer num15 = (i13 & 1024) != 0 ? w1Var.f102217k : num5;
        List list2 = (i13 & 2048) != 0 ? w1Var.f102218l : list;
        Integer num16 = (i13 & 4096) != 0 ? w1Var.f102219m : num6;
        Integer num17 = (i13 & 8192) != 0 ? w1Var.f102220n : num7;
        int i16 = i14;
        Integer num18 = (i13 & 16384) != 0 ? w1Var.f102221o : num8;
        Integer num19 = (i13 & 32768) != 0 ? w1Var.f102222p : num9;
        String str2 = (i13 & 65536) != 0 ? w1Var.f102223q : str;
        Integer num20 = (i13 & 131072) != 0 ? w1Var.f102224r : num10;
        Long l22 = (i13 & 262144) != 0 ? w1Var.f102225s : l15;
        if ((i13 & 524288) != 0) {
            l16 = l22;
            xVar2 = w1Var.f102226t;
        } else {
            xVar2 = xVar;
            l16 = l22;
        }
        return w1Var.u(i16, i15, num11, num12, num13, l17, l18, l19, l21, num14, num15, list2, num16, num17, num18, num19, str2, num20, l16, xVar2);
    }

    public final int a() {
        return this.f102207a;
    }

    @m80.l
    public final Integer b() {
        return this.f102216j;
    }

    @m80.l
    public final Integer c() {
        return this.f102217k;
    }

    @m80.l
    public final List<h2> d() {
        return this.f102218l;
    }

    @m80.l
    public final Integer e() {
        return this.f102219m;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return this.f102207a == w1Var.f102207a && this.f102208b == w1Var.f102208b && kotlin.jvm.internal.g0.g(this.f102209c, w1Var.f102209c) && kotlin.jvm.internal.g0.g(this.f102210d, w1Var.f102210d) && kotlin.jvm.internal.g0.g(this.f102211e, w1Var.f102211e) && kotlin.jvm.internal.g0.g(this.f102212f, w1Var.f102212f) && kotlin.jvm.internal.g0.g(this.f102213g, w1Var.f102213g) && kotlin.jvm.internal.g0.g(this.f102214h, w1Var.f102214h) && kotlin.jvm.internal.g0.g(this.f102215i, w1Var.f102215i) && kotlin.jvm.internal.g0.g(this.f102216j, w1Var.f102216j) && kotlin.jvm.internal.g0.g(this.f102217k, w1Var.f102217k) && kotlin.jvm.internal.g0.g(this.f102218l, w1Var.f102218l) && kotlin.jvm.internal.g0.g(this.f102219m, w1Var.f102219m) && kotlin.jvm.internal.g0.g(this.f102220n, w1Var.f102220n) && kotlin.jvm.internal.g0.g(this.f102221o, w1Var.f102221o) && kotlin.jvm.internal.g0.g(this.f102222p, w1Var.f102222p) && kotlin.jvm.internal.g0.g(this.f102223q, w1Var.f102223q) && kotlin.jvm.internal.g0.g(this.f102224r, w1Var.f102224r) && kotlin.jvm.internal.g0.g(this.f102225s, w1Var.f102225s) && kotlin.jvm.internal.g0.g(this.f102226t, w1Var.f102226t);
    }

    @m80.l
    public final Integer f() {
        return this.f102220n;
    }

    @m80.l
    public final Integer g() {
        return this.f102221o;
    }

    @m80.l
    public final Integer h() {
        return this.f102222p;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f102207a) * 31) + Integer.hashCode(this.f102208b)) * 31;
        Integer num = this.f102209c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f102210d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f102211e;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l11 = this.f102212f;
        int hashCode5 = (hashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f102213g;
        int hashCode6 = (hashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f102214h;
        int hashCode7 = (hashCode6 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f102215i;
        int hashCode8 = (hashCode7 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Integer num4 = this.f102216j;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f102217k;
        int hashCode10 = (hashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<h2> list = this.f102218l;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num6 = this.f102219m;
        int hashCode12 = (hashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f102220n;
        int hashCode13 = (hashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f102221o;
        int hashCode14 = (hashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f102222p;
        int hashCode15 = (hashCode14 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str = this.f102223q;
        int hashCode16 = (hashCode15 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num10 = this.f102224r;
        int hashCode17 = (hashCode16 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Long l15 = this.f102225s;
        int hashCode18 = (hashCode17 + (l15 == null ? 0 : l15.hashCode())) * 31;
        x xVar = this.f102226t;
        return hashCode18 + (xVar != null ? xVar.hashCode() : 0);
    }

    @m80.l
    public final String i() {
        return this.f102223q;
    }

    @m80.l
    public final Integer j() {
        return this.f102224r;
    }

    @m80.l
    public final Long k() {
        return this.f102225s;
    }

    public final int l() {
        return this.f102208b;
    }

    @m80.l
    public final x m() {
        return this.f102226t;
    }

    @m80.l
    public final Integer n() {
        return this.f102209c;
    }

    @m80.l
    public final Integer o() {
        return this.f102210d;
    }

    @m80.l
    public final Integer p() {
        return this.f102211e;
    }

    @m80.l
    public final Long q() {
        return this.f102212f;
    }

    @m80.l
    public final Long r() {
        return this.f102213g;
    }

    @m80.l
    public final Long s() {
        return this.f102214h;
    }

    @m80.l
    public final Long t() {
        return this.f102215i;
    }

    @m80.k
    public String toString() {
        return "UserLimitInfoV2(show_sentence_trans=" + this.f102207a + ", has_word_friends=" + this.f102208b + ", spell_mode=" + this.f102209c + ", listening_mode=" + this.f102210d + ", chn_mode=" + this.f102211e + ", update_at_of_book_info=" + this.f102212f + ", update_at_of_notify_info=" + this.f102213g + ", collect_words_updated_at=" + this.f102214h + ", word_note_updated_at=" + this.f102215i + ", cur_book_has_primary_school_mode=" + this.f102216j + ", word_note_enable=" + this.f102217k + ", wiki_component_cfg=" + this.f102218l + ", new_wiki=" + this.f102219m + ", chn_style=" + this.f102220n + ", show_device=" + this.f102221o + ", current_mode=" + this.f102222p + ", x_mode_setting=" + this.f102223q + ", show_topic_correction=" + this.f102224r + ", server_timestamp=" + this.f102225s + ", game_mode=" + this.f102226t + ')';
    }

    @m80.k
    public final w1 u(int i11, int i12, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l Long l11, @m80.l Long l12, @m80.l Long l13, @m80.l Long l14, @m80.l Integer num4, @m80.l Integer num5, @m80.l List<h2> list, @m80.l Integer num6, @m80.l Integer num7, @m80.l Integer num8, @m80.l Integer num9, @m80.l String str, @m80.l Integer num10, @m80.l Long l15, @m80.l x xVar) {
        return new w1(i11, i12, num, num2, num3, l11, l12, l13, l14, num4, num5, list, num6, num7, num8, num9, str, num10, l15, xVar);
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102206v.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserLimitInfoV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserLimitInfoV2.kt\ncom/baicizhan/biz/online/user_study_api/UserLimitInfoV2$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,678:1\n1#2:679\n*E\n"})
    public static final class a implements ts.f<w1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f102227a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f102228b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f102229c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f102230d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f102231e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Long f102232f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Long f102233g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Long f102234h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public Long f102235i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public Integer f102236j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public Integer f102237k;

        /* renamed from: l, reason: collision with root package name */
        @m80.l
        public List<h2> f102238l;

        /* renamed from: m, reason: collision with root package name */
        @m80.l
        public Integer f102239m;

        /* renamed from: n, reason: collision with root package name */
        @m80.l
        public Integer f102240n;

        /* renamed from: o, reason: collision with root package name */
        @m80.l
        public Integer f102241o;

        /* renamed from: p, reason: collision with root package name */
        @m80.l
        public Integer f102242p;

        /* renamed from: q, reason: collision with root package name */
        @m80.l
        public String f102243q;

        /* renamed from: r, reason: collision with root package name */
        @m80.l
        public Integer f102244r;

        /* renamed from: s, reason: collision with root package name */
        @m80.l
        public Long f102245s;

        /* renamed from: t, reason: collision with root package name */
        @m80.l
        public x f102246t;

        public a() {
            this.f102227a = null;
            this.f102228b = null;
            this.f102229c = null;
            this.f102230d = null;
            this.f102231e = null;
            this.f102232f = null;
            this.f102233g = null;
            this.f102234h = null;
            this.f102235i = null;
            this.f102236j = null;
            this.f102237k = null;
            this.f102238l = null;
            this.f102239m = null;
            this.f102240n = null;
            this.f102241o = null;
            this.f102242p = null;
            this.f102243q = null;
            this.f102244r = null;
            this.f102245s = null;
            this.f102246t = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w1 build() {
            Integer num = this.f102227a;
            if (num == null) {
                throw new IllegalStateException("Required field 'show_sentence_trans' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f102228b;
            if (num2 != null) {
                return new w1(intValue, num2.intValue(), this.f102229c, this.f102230d, this.f102231e, this.f102232f, this.f102233g, this.f102234h, this.f102235i, this.f102236j, this.f102237k, this.f102238l, this.f102239m, this.f102240n, this.f102241o, this.f102242p, this.f102243q, this.f102244r, this.f102245s, this.f102246t);
            }
            throw new IllegalStateException("Required field 'has_word_friends' is missing");
        }

        @m80.k
        public final a b(@m80.l Integer num) {
            this.f102231e = num;
            return this;
        }

        @m80.k
        public final a c(@m80.l Integer num) {
            this.f102240n = num;
            return this;
        }

        @m80.k
        public final a d(@m80.l Long l11) {
            this.f102234h = l11;
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f102236j = num;
            return this;
        }

        @m80.k
        public final a f(@m80.l Integer num) {
            this.f102242p = num;
            return this;
        }

        @m80.k
        public final a g(@m80.l x xVar) {
            this.f102246t = xVar;
            return this;
        }

        @m80.k
        public final a h(int i11) {
            this.f102228b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a i(@m80.l Integer num) {
            this.f102230d = num;
            return this;
        }

        @m80.k
        public final a j(@m80.l Integer num) {
            this.f102239m = num;
            return this;
        }

        @m80.k
        public final a k(@m80.l Long l11) {
            this.f102245s = l11;
            return this;
        }

        @m80.k
        public final a l(@m80.l Integer num) {
            this.f102241o = num;
            return this;
        }

        @m80.k
        public final a m(int i11) {
            this.f102227a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a n(@m80.l Integer num) {
            this.f102244r = num;
            return this;
        }

        @m80.k
        public final a o(@m80.l Integer num) {
            this.f102229c = num;
            return this;
        }

        @m80.k
        public final a p(@m80.l Long l11) {
            this.f102232f = l11;
            return this;
        }

        @m80.k
        public final a q(@m80.l Long l11) {
            this.f102233g = l11;
            return this;
        }

        @m80.k
        public final a r(@m80.l List<h2> list) {
            this.f102238l = list;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102227a = null;
            this.f102228b = null;
            this.f102229c = null;
            this.f102230d = null;
            this.f102231e = null;
            this.f102232f = null;
            this.f102233g = null;
            this.f102234h = null;
            this.f102235i = null;
            this.f102236j = null;
            this.f102237k = null;
            this.f102238l = null;
            this.f102239m = null;
            this.f102240n = null;
            this.f102241o = null;
            this.f102242p = null;
            this.f102243q = null;
            this.f102244r = null;
            this.f102245s = null;
            this.f102246t = null;
        }

        @m80.k
        public final a s(@m80.l Integer num) {
            this.f102237k = num;
            return this;
        }

        @m80.k
        public final a t(@m80.l Long l11) {
            this.f102235i = l11;
            return this;
        }

        @m80.k
        public final a u(@m80.l String str) {
            this.f102243q = str;
            return this;
        }

        public a(@m80.k w1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102227a = Integer.valueOf(source.f102207a);
            this.f102228b = Integer.valueOf(source.f102208b);
            this.f102229c = source.f102209c;
            this.f102230d = source.f102210d;
            this.f102231e = source.f102211e;
            this.f102232f = source.f102212f;
            this.f102233g = source.f102213g;
            this.f102234h = source.f102214h;
            this.f102235i = source.f102215i;
            this.f102236j = source.f102216j;
            this.f102237k = source.f102217k;
            this.f102238l = source.f102218l;
            this.f102239m = source.f102219m;
            this.f102240n = source.f102220n;
            this.f102241o = source.f102221o;
            this.f102242p = source.f102222p;
            this.f102243q = source.f102223q;
            this.f102244r = source.f102224r;
            this.f102245s = source.f102225s;
            this.f102246t = source.f102226t;
        }
    }
}
