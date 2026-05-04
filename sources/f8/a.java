package f8;

import com.igexin.push.g.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ts.e;
import w00.g;
import ws.f;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements e {

    /* renamed from: u, reason: collision with root package name */
    @k
    public static final c f51222u = new c(null);

    /* renamed from: v, reason: collision with root package name */
    @g
    @k
    public static final ts.a<a, b> f51223v = new C0610a();

    /* renamed from: a, reason: collision with root package name */
    @l
    @g
    public final String f51224a;

    /* renamed from: b, reason: collision with root package name */
    @l
    @g
    public final String f51225b;

    /* renamed from: c, reason: collision with root package name */
    @l
    @g
    public final String f51226c;

    /* renamed from: d, reason: collision with root package name */
    @l
    @g
    public final String f51227d;

    /* renamed from: e, reason: collision with root package name */
    @l
    @g
    public final String f51228e;

    /* renamed from: f, reason: collision with root package name */
    @l
    @g
    public final String f51229f;

    /* renamed from: g, reason: collision with root package name */
    @l
    @g
    public final String f51230g;

    /* renamed from: h, reason: collision with root package name */
    @l
    @g
    public final String f51231h;

    /* renamed from: i, reason: collision with root package name */
    @l
    @g
    public final Integer f51232i;

    /* renamed from: j, reason: collision with root package name */
    @l
    @g
    public final Integer f51233j;

    /* renamed from: k, reason: collision with root package name */
    @l
    @g
    public final Integer f51234k;

    /* renamed from: l, reason: collision with root package name */
    @l
    @g
    public final Integer f51235l;

    /* renamed from: m, reason: collision with root package name */
    @l
    @g
    public final Integer f51236m;

    /* renamed from: n, reason: collision with root package name */
    @l
    @g
    public final Integer f51237n;

    /* renamed from: o, reason: collision with root package name */
    @l
    @g
    public final Integer f51238o;

    /* renamed from: p, reason: collision with root package name */
    @l
    @g
    public final Integer f51239p;

    /* renamed from: q, reason: collision with root package name */
    @l
    @g
    public final List<Integer> f51240q;

    /* renamed from: r, reason: collision with root package name */
    @l
    @g
    public final String f51241r;

    /* renamed from: s, reason: collision with root package name */
    @l
    @g
    public final String f51242s;

    /* renamed from: t, reason: collision with root package name */
    @l
    @g
    public final String f51243t;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: f8.a$a, reason: collision with other inner class name */
    public static final class C0610a implements ts.a<a, b> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol, @k b builder) {
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
                        if (b11 == 11) {
                            builder.m(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 11) {
                            builder.a(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 11) {
                            builder.k(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 11) {
                            builder.d(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 11) {
                            builder.e(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 11) {
                            builder.i(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 7:
                        if (b11 == 11) {
                            builder.l(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 8:
                        if (b11 == 11) {
                            builder.s(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 9:
                        if (b11 == 8) {
                            builder.f(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 10:
                        if (b11 == 8) {
                            builder.g(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 11:
                        if (b11 == 8) {
                            builder.r(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 12:
                        if (b11 == 8) {
                            builder.q(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 13:
                        if (b11 == 8) {
                            builder.p(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 14:
                        if (b11 == 8) {
                            builder.j(Integer.valueOf(protocol.s8()));
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
                            builder.n(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 17:
                        if (b11 == 15) {
                            f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i11 = v42.f96838b;
                            for (int i12 = 0; i12 < i11; i12++) {
                                arrayList.add(Integer.valueOf(protocol.s8()));
                            }
                            protocol.l8();
                            builder.b(arrayList);
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 18:
                        if (b11 == 11) {
                            builder.u(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 19:
                        if (b11 == 11) {
                            builder.t(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 20:
                        if (b11 == 11) {
                            builder.o(protocol.readString());
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
        public void write(@k i protocol, @k a struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AdDeviceInfo");
            if (struct.f51224a != null) {
                protocol.Q6("oaid", 1, (byte) 11);
                protocol.p1(struct.f51224a);
                protocol.N2();
            }
            if (struct.f51225b != null) {
                protocol.Q6("aid", 2, (byte) 11);
                protocol.p1(struct.f51225b);
                protocol.N2();
            }
            if (struct.f51226c != null) {
                protocol.Q6("idfa", 3, (byte) 11);
                protocol.p1(struct.f51226c);
                protocol.N2();
            }
            if (struct.f51227d != null) {
                protocol.Q6("caid", 4, (byte) 11);
                protocol.p1(struct.f51227d);
                protocol.N2();
            }
            if (struct.f51228e != null) {
                protocol.Q6("caid_version", 5, (byte) 11);
                protocol.p1(struct.f51228e);
                protocol.N2();
            }
            if (struct.f51229f != null) {
                protocol.Q6("device_make", 6, (byte) 11);
                protocol.p1(struct.f51229f);
                protocol.N2();
            }
            if (struct.f51230g != null) {
                protocol.Q6("model", 7, (byte) 11);
                protocol.p1(struct.f51230g);
                protocol.N2();
            }
            if (struct.f51231h != null) {
                protocol.Q6(o.f38735d, 8, (byte) 11);
                protocol.p1(struct.f51231h);
                protocol.N2();
            }
            if (struct.f51232i != null) {
                protocol.Q6(ma.b.f72892b0, 9, (byte) 8);
                protocol.l5(struct.f51232i.intValue());
                protocol.N2();
            }
            if (struct.f51233j != null) {
                protocol.Q6("connection_type", 10, (byte) 8);
                protocol.l5(struct.f51233j.intValue());
                protocol.N2();
            }
            if (struct.f51234k != null) {
                protocol.Q6("sw", 11, (byte) 8);
                protocol.l5(struct.f51234k.intValue());
                protocol.N2();
            }
            if (struct.f51235l != null) {
                protocol.Q6("sh", 12, (byte) 8);
                protocol.l5(struct.f51235l.intValue());
                protocol.N2();
            }
            if (struct.f51236m != null) {
                protocol.Q6("ppi", 13, (byte) 8);
                protocol.l5(struct.f51236m.intValue());
                protocol.N2();
            }
            if (struct.f51237n != null) {
                protocol.Q6("dpi", 14, (byte) 8);
                protocol.l5(struct.f51237n.intValue());
                protocol.N2();
            }
            if (struct.f51238o != null) {
                protocol.Q6("density", 15, (byte) 8);
                protocol.l5(struct.f51238o.intValue());
                protocol.N2();
            }
            if (struct.f51239p != null) {
                protocol.Q6("ori", 16, (byte) 8);
                protocol.l5(struct.f51239p.intValue());
                protocol.N2();
            }
            if (struct.f51240q != null) {
                protocol.Q6("apps", 17, (byte) 15);
                protocol.y2((byte) 8, struct.f51240q.size());
                Iterator<Integer> it = struct.f51240q.iterator();
                while (it.hasNext()) {
                    protocol.l5(it.next().intValue());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f51241r != null) {
                protocol.Q6("ver_code_hms", 18, (byte) 11);
                protocol.p1(struct.f51241r);
                protocol.N2();
            }
            if (struct.f51242s != null) {
                protocol.Q6("ver_code_ag", 19, (byte) 11);
                protocol.p1(struct.f51242s);
                protocol.N2();
            }
            if (struct.f51243t != null) {
                protocol.Q6("paid", 20, (byte) 11);
                protocol.p1(struct.f51243t);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(v vVar) {
            this();
        }

        public c() {
        }
    }

    public a(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8, @l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l Integer num5, @l Integer num6, @l Integer num7, @l Integer num8, @l List<Integer> list, @l String str9, @l String str10, @l String str11) {
        this.f51224a = str;
        this.f51225b = str2;
        this.f51226c = str3;
        this.f51227d = str4;
        this.f51228e = str5;
        this.f51229f = str6;
        this.f51230g = str7;
        this.f51231h = str8;
        this.f51232i = num;
        this.f51233j = num2;
        this.f51234k = num3;
        this.f51235l = num4;
        this.f51236m = num5;
        this.f51237n = num6;
        this.f51238o = num7;
        this.f51239p = num8;
        this.f51240q = list;
        this.f51241r = str9;
        this.f51242s = str10;
        this.f51243t = str11;
    }

    public static /* synthetic */ a v(a aVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, List list, String str9, String str10, String str11, int i11, Object obj) {
        String str12;
        String str13;
        String str14 = (i11 & 1) != 0 ? aVar.f51224a : str;
        String str15 = (i11 & 2) != 0 ? aVar.f51225b : str2;
        String str16 = (i11 & 4) != 0 ? aVar.f51226c : str3;
        String str17 = (i11 & 8) != 0 ? aVar.f51227d : str4;
        String str18 = (i11 & 16) != 0 ? aVar.f51228e : str5;
        String str19 = (i11 & 32) != 0 ? aVar.f51229f : str6;
        String str20 = (i11 & 64) != 0 ? aVar.f51230g : str7;
        String str21 = (i11 & 128) != 0 ? aVar.f51231h : str8;
        Integer num9 = (i11 & 256) != 0 ? aVar.f51232i : num;
        Integer num10 = (i11 & 512) != 0 ? aVar.f51233j : num2;
        Integer num11 = (i11 & 1024) != 0 ? aVar.f51234k : num3;
        Integer num12 = (i11 & 2048) != 0 ? aVar.f51235l : num4;
        Integer num13 = (i11 & 4096) != 0 ? aVar.f51236m : num5;
        Integer num14 = (i11 & 8192) != 0 ? aVar.f51237n : num6;
        String str22 = str14;
        Integer num15 = (i11 & 16384) != 0 ? aVar.f51238o : num7;
        Integer num16 = (i11 & 32768) != 0 ? aVar.f51239p : num8;
        List list2 = (i11 & 65536) != 0 ? aVar.f51240q : list;
        String str23 = (i11 & 131072) != 0 ? aVar.f51241r : str9;
        String str24 = (i11 & 262144) != 0 ? aVar.f51242s : str10;
        if ((i11 & 524288) != 0) {
            str13 = str24;
            str12 = aVar.f51243t;
        } else {
            str12 = str11;
            str13 = str24;
        }
        return aVar.u(str22, str15, str16, str17, str18, str19, str20, str21, num9, num10, num11, num12, num13, num14, num15, num16, list2, str23, str13, str12);
    }

    @l
    public final String a() {
        return this.f51224a;
    }

    @l
    public final Integer b() {
        return this.f51233j;
    }

    @l
    public final Integer c() {
        return this.f51234k;
    }

    @l
    public final Integer d() {
        return this.f51235l;
    }

    @l
    public final Integer e() {
        return this.f51236m;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f51224a, aVar.f51224a) && g0.g(this.f51225b, aVar.f51225b) && g0.g(this.f51226c, aVar.f51226c) && g0.g(this.f51227d, aVar.f51227d) && g0.g(this.f51228e, aVar.f51228e) && g0.g(this.f51229f, aVar.f51229f) && g0.g(this.f51230g, aVar.f51230g) && g0.g(this.f51231h, aVar.f51231h) && g0.g(this.f51232i, aVar.f51232i) && g0.g(this.f51233j, aVar.f51233j) && g0.g(this.f51234k, aVar.f51234k) && g0.g(this.f51235l, aVar.f51235l) && g0.g(this.f51236m, aVar.f51236m) && g0.g(this.f51237n, aVar.f51237n) && g0.g(this.f51238o, aVar.f51238o) && g0.g(this.f51239p, aVar.f51239p) && g0.g(this.f51240q, aVar.f51240q) && g0.g(this.f51241r, aVar.f51241r) && g0.g(this.f51242s, aVar.f51242s) && g0.g(this.f51243t, aVar.f51243t);
    }

    @l
    public final Integer f() {
        return this.f51237n;
    }

    @l
    public final Integer g() {
        return this.f51238o;
    }

    @l
    public final Integer h() {
        return this.f51239p;
    }

    public int hashCode() {
        String str = this.f51224a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f51225b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f51226c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f51227d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f51228e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f51229f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f51230g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f51231h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f51232i;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f51233j;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f51234k;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f51235l;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f51236m;
        int hashCode13 = (hashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f51237n;
        int hashCode14 = (hashCode13 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f51238o;
        int hashCode15 = (hashCode14 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f51239p;
        int hashCode16 = (hashCode15 + (num8 == null ? 0 : num8.hashCode())) * 31;
        List<Integer> list = this.f51240q;
        int hashCode17 = (hashCode16 + (list == null ? 0 : list.hashCode())) * 31;
        String str9 = this.f51241r;
        int hashCode18 = (hashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f51242s;
        int hashCode19 = (hashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f51243t;
        return hashCode19 + (str11 != null ? str11.hashCode() : 0);
    }

    @l
    public final List<Integer> i() {
        return this.f51240q;
    }

    @l
    public final String j() {
        return this.f51241r;
    }

    @l
    public final String k() {
        return this.f51242s;
    }

    @l
    public final String l() {
        return this.f51225b;
    }

    @l
    public final String m() {
        return this.f51243t;
    }

    @l
    public final String n() {
        return this.f51226c;
    }

    @l
    public final String o() {
        return this.f51227d;
    }

    @l
    public final String p() {
        return this.f51228e;
    }

    @l
    public final String q() {
        return this.f51229f;
    }

    @l
    public final String r() {
        return this.f51230g;
    }

    @l
    public final String s() {
        return this.f51231h;
    }

    @l
    public final Integer t() {
        return this.f51232i;
    }

    @k
    public String toString() {
        return "AdDeviceInfo(oaid=" + this.f51224a + ", aid=" + this.f51225b + ", idfa=" + this.f51226c + ", caid=" + this.f51227d + ", caid_version=" + this.f51228e + ", device_make=" + this.f51229f + ", model=" + this.f51230g + ", ua=" + this.f51231h + ", carrier=" + this.f51232i + ", connection_type=" + this.f51233j + ", sw=" + this.f51234k + ", sh=" + this.f51235l + ", ppi=" + this.f51236m + ", dpi=" + this.f51237n + ", density=" + this.f51238o + ", ori=" + this.f51239p + ", apps=" + this.f51240q + ", ver_code_hms=" + this.f51241r + ", ver_code_ag=" + this.f51242s + ", paid=" + this.f51243t + ')';
    }

    @k
    public final a u(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8, @l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l Integer num5, @l Integer num6, @l Integer num7, @l Integer num8, @l List<Integer> list, @l String str9, @l String str10, @l String str11) {
        return new a(str, str2, str3, str4, str5, str6, str7, str8, num, num2, num3, num4, num5, num6, num7, num8, list, str9, str10, str11);
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f51223v.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAdDeviceInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdDeviceInfo.kt\ncom/baicizhan/biz/online/ad_property/AdDeviceInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,650:1\n1#2:651\n*E\n"})
    public static final class b implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public String f51244a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f51245b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f51246c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public String f51247d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public String f51248e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public String f51249f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public String f51250g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public String f51251h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public Integer f51252i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public Integer f51253j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public Integer f51254k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public Integer f51255l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public Integer f51256m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public Integer f51257n;

        /* renamed from: o, reason: collision with root package name */
        @l
        public Integer f51258o;

        /* renamed from: p, reason: collision with root package name */
        @l
        public Integer f51259p;

        /* renamed from: q, reason: collision with root package name */
        @l
        public List<Integer> f51260q;

        /* renamed from: r, reason: collision with root package name */
        @l
        public String f51261r;

        /* renamed from: s, reason: collision with root package name */
        @l
        public String f51262s;

        /* renamed from: t, reason: collision with root package name */
        @l
        public String f51263t;

        public b() {
            this.f51244a = null;
            this.f51245b = null;
            this.f51246c = null;
            this.f51247d = null;
            this.f51248e = null;
            this.f51249f = null;
            this.f51250g = null;
            this.f51251h = null;
            this.f51252i = null;
            this.f51253j = null;
            this.f51254k = null;
            this.f51255l = null;
            this.f51256m = null;
            this.f51257n = null;
            this.f51258o = null;
            this.f51259p = null;
            this.f51260q = null;
            this.f51261r = null;
            this.f51262s = null;
            this.f51263t = null;
        }

        @k
        public final b a(@l String str) {
            this.f51245b = str;
            return this;
        }

        @k
        public final b b(@l List<Integer> list) {
            this.f51260q = list;
            return this;
        }

        @Override // ts.f
        @k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a build() {
            return new a(this.f51244a, this.f51245b, this.f51246c, this.f51247d, this.f51248e, this.f51249f, this.f51250g, this.f51251h, this.f51252i, this.f51253j, this.f51254k, this.f51255l, this.f51256m, this.f51257n, this.f51258o, this.f51259p, this.f51260q, this.f51261r, this.f51262s, this.f51263t);
        }

        @k
        public final b d(@l String str) {
            this.f51247d = str;
            return this;
        }

        @k
        public final b e(@l String str) {
            this.f51248e = str;
            return this;
        }

        @k
        public final b f(@l Integer num) {
            this.f51252i = num;
            return this;
        }

        @k
        public final b g(@l Integer num) {
            this.f51253j = num;
            return this;
        }

        @k
        public final b h(@l Integer num) {
            this.f51258o = num;
            return this;
        }

        @k
        public final b i(@l String str) {
            this.f51249f = str;
            return this;
        }

        @k
        public final b j(@l Integer num) {
            this.f51257n = num;
            return this;
        }

        @k
        public final b k(@l String str) {
            this.f51246c = str;
            return this;
        }

        @k
        public final b l(@l String str) {
            this.f51250g = str;
            return this;
        }

        @k
        public final b m(@l String str) {
            this.f51244a = str;
            return this;
        }

        @k
        public final b n(@l Integer num) {
            this.f51259p = num;
            return this;
        }

        @k
        public final b o(@l String str) {
            this.f51263t = str;
            return this;
        }

        @k
        public final b p(@l Integer num) {
            this.f51256m = num;
            return this;
        }

        @k
        public final b q(@l Integer num) {
            this.f51255l = num;
            return this;
        }

        @k
        public final b r(@l Integer num) {
            this.f51254k = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f51244a = null;
            this.f51245b = null;
            this.f51246c = null;
            this.f51247d = null;
            this.f51248e = null;
            this.f51249f = null;
            this.f51250g = null;
            this.f51251h = null;
            this.f51252i = null;
            this.f51253j = null;
            this.f51254k = null;
            this.f51255l = null;
            this.f51256m = null;
            this.f51257n = null;
            this.f51258o = null;
            this.f51259p = null;
            this.f51260q = null;
            this.f51261r = null;
            this.f51262s = null;
            this.f51263t = null;
        }

        @k
        public final b s(@l String str) {
            this.f51251h = str;
            return this;
        }

        @k
        public final b t(@l String str) {
            this.f51262s = str;
            return this;
        }

        @k
        public final b u(@l String str) {
            this.f51261r = str;
            return this;
        }

        public b(@k a source) {
            g0.p(source, "source");
            this.f51244a = source.f51224a;
            this.f51245b = source.f51225b;
            this.f51246c = source.f51226c;
            this.f51247d = source.f51227d;
            this.f51248e = source.f51228e;
            this.f51249f = source.f51229f;
            this.f51250g = source.f51230g;
            this.f51251h = source.f51231h;
            this.f51252i = source.f51232i;
            this.f51253j = source.f51233j;
            this.f51254k = source.f51234k;
            this.f51255l = source.f51235l;
            this.f51256m = source.f51236m;
            this.f51257n = source.f51237n;
            this.f51258o = source.f51238o;
            this.f51259p = source.f51239p;
            this.f51260q = source.f51240q;
            this.f51261r = source.f51241r;
            this.f51262s = source.f51242s;
            this.f51263t = source.f51243t;
        }
    }
}
