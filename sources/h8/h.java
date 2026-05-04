package h8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final c f58925i = new c(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<h, b> f58926j = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f58927a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f58928b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f58929c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f58930d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f58931e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<i> f58932f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<e> f58933g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<h8.a> f58934h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<h, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h read(@m80.k ws.i protocol, @m80.k b builder) {
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
                int i11 = 0;
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i12 = v42.f96838b;
                            while (i11 < i12) {
                                arrayList.add(i.f58944g.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.i(arrayList);
                            break;
                        }
                    case 7:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v43 = protocol.v4();
                            ArrayList arrayList2 = new ArrayList(v43.f96838b);
                            int i13 = v43.f96838b;
                            while (i11 < i13) {
                                arrayList2.add(e.f58886i.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.h(arrayList2);
                            break;
                        }
                    case 8:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v44 = protocol.v4();
                            ArrayList arrayList3 = new ArrayList(v44.f96838b);
                            int i14 = v44.f96838b;
                            while (i11 < i14) {
                                arrayList3.add(h8.a.f58850i.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.g(arrayList3);
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
        public void write(@m80.k ws.i protocol, @m80.k h struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AvatarLevelInfo");
            protocol.Q6("level", 1, (byte) 8);
            protocol.l5(struct.f58927a);
            protocol.N2();
            protocol.Q6("level_up_exp", 2, (byte) 8);
            protocol.l5(struct.f58928b);
            protocol.N2();
            protocol.Q6("level_cookie_cost", 3, (byte) 8);
            protocol.l5(struct.f58929c);
            protocol.N2();
            protocol.Q6("level_travel_time", 4, (byte) 8);
            protocol.l5(struct.f58930d);
            protocol.N2();
            protocol.Q6("level_gift_prob", 5, (byte) 8);
            protocol.l5(struct.f58931e);
            protocol.N2();
            if (struct.f58932f != null) {
                protocol.Q6("unlock_skill_list", 6, (byte) 15);
                protocol.y2((byte) 12, struct.f58932f.size());
                Iterator<i> it = struct.f58932f.iterator();
                while (it.hasNext()) {
                    i.f58944g.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f58933g != null) {
                protocol.Q6("unlock_area_list", 7, (byte) 15);
                protocol.y2((byte) 12, struct.f58933g.size());
                Iterator<e> it2 = struct.f58933g.iterator();
                while (it2.hasNext()) {
                    e.f58886i.write(protocol, it2.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f58934h != null) {
                protocol.Q6("unlock_action_list", 8, (byte) 15);
                protocol.y2((byte) 12, struct.f58934h.size());
                Iterator<h8.a> it3 = struct.f58934h.iterator();
                while (it3.hasNext()) {
                    h8.a.f58850i.write(protocol, it3.next());
                }
                protocol.i5();
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

    public h(int i11, int i12, int i13, int i14, int i15, @m80.l List<i> list, @m80.l List<e> list2, @m80.l List<h8.a> list3) {
        this.f58927a = i11;
        this.f58928b = i12;
        this.f58929c = i13;
        this.f58930d = i14;
        this.f58931e = i15;
        this.f58932f = list;
        this.f58933g = list2;
        this.f58934h = list3;
    }

    public static /* synthetic */ h j(h hVar, int i11, int i12, int i13, int i14, int i15, List list, List list2, List list3, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = hVar.f58927a;
        }
        if ((i16 & 2) != 0) {
            i12 = hVar.f58928b;
        }
        if ((i16 & 4) != 0) {
            i13 = hVar.f58929c;
        }
        if ((i16 & 8) != 0) {
            i14 = hVar.f58930d;
        }
        if ((i16 & 16) != 0) {
            i15 = hVar.f58931e;
        }
        if ((i16 & 32) != 0) {
            list = hVar.f58932f;
        }
        if ((i16 & 64) != 0) {
            list2 = hVar.f58933g;
        }
        if ((i16 & 128) != 0) {
            list3 = hVar.f58934h;
        }
        List list4 = list2;
        List list5 = list3;
        int i17 = i15;
        List list6 = list;
        return hVar.i(i11, i12, i13, i14, i17, list6, list4, list5);
    }

    public final int a() {
        return this.f58927a;
    }

    public final int b() {
        return this.f58928b;
    }

    public final int c() {
        return this.f58929c;
    }

    public final int d() {
        return this.f58930d;
    }

    public final int e() {
        return this.f58931e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f58927a == hVar.f58927a && this.f58928b == hVar.f58928b && this.f58929c == hVar.f58929c && this.f58930d == hVar.f58930d && this.f58931e == hVar.f58931e && g0.g(this.f58932f, hVar.f58932f) && g0.g(this.f58933g, hVar.f58933g) && g0.g(this.f58934h, hVar.f58934h);
    }

    @m80.l
    public final List<i> f() {
        return this.f58932f;
    }

    @m80.l
    public final List<e> g() {
        return this.f58933g;
    }

    @m80.l
    public final List<h8.a> h() {
        return this.f58934h;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f58927a) * 31) + Integer.hashCode(this.f58928b)) * 31) + Integer.hashCode(this.f58929c)) * 31) + Integer.hashCode(this.f58930d)) * 31) + Integer.hashCode(this.f58931e)) * 31;
        List<i> list = this.f58932f;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<e> list2 = this.f58933g;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<h8.a> list3 = this.f58934h;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @m80.k
    public final h i(int i11, int i12, int i13, int i14, int i15, @m80.l List<i> list, @m80.l List<e> list2, @m80.l List<h8.a> list3) {
        return new h(i11, i12, i13, i14, i15, list, list2, list3);
    }

    @m80.k
    public String toString() {
        return "AvatarLevelInfo(level=" + this.f58927a + ", level_up_exp=" + this.f58928b + ", level_cookie_cost=" + this.f58929c + ", level_travel_time=" + this.f58930d + ", level_gift_prob=" + this.f58931e + ", unlock_skill_list=" + this.f58932f + ", unlock_area_list=" + this.f58933g + ", unlock_action_list=" + this.f58934h + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f58926j.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAvatarLevelInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarLevelInfo.kt\ncom/baicizhan/biz/online/avatar_api/AvatarLevelInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
    public static final class b implements ts.f<h> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f58935a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f58936b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f58937c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f58938d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f58939e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public List<i> f58940f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public List<e> f58941g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public List<h8.a> f58942h;

        public b() {
            this.f58935a = null;
            this.f58936b = null;
            this.f58937c = null;
            this.f58938d = null;
            this.f58939e = null;
            this.f58940f = null;
            this.f58941g = null;
            this.f58942h = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h build() {
            Integer num = this.f58935a;
            if (num == null) {
                throw new IllegalStateException("Required field 'level' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f58936b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'level_up_exp' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f58937c;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'level_cookie_cost' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f58938d;
            if (num4 == null) {
                throw new IllegalStateException("Required field 'level_travel_time' is missing");
            }
            int intValue4 = num4.intValue();
            Integer num5 = this.f58939e;
            if (num5 != null) {
                return new h(intValue, intValue2, intValue3, intValue4, num5.intValue(), this.f58940f, this.f58941g, this.f58942h);
            }
            throw new IllegalStateException("Required field 'level_gift_prob' is missing");
        }

        @m80.k
        public final b b(int i11) {
            this.f58935a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b c(int i11) {
            this.f58937c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b d(int i11) {
            this.f58939e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b e(int i11) {
            this.f58938d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b f(int i11) {
            this.f58936b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b g(@m80.l List<h8.a> list) {
            this.f58942h = list;
            return this;
        }

        @m80.k
        public final b h(@m80.l List<e> list) {
            this.f58941g = list;
            return this;
        }

        @m80.k
        public final b i(@m80.l List<i> list) {
            this.f58940f = list;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f58935a = null;
            this.f58936b = null;
            this.f58937c = null;
            this.f58938d = null;
            this.f58939e = null;
            this.f58940f = null;
            this.f58941g = null;
            this.f58942h = null;
        }

        public b(@m80.k h source) {
            g0.p(source, "source");
            this.f58935a = Integer.valueOf(source.f58927a);
            this.f58936b = Integer.valueOf(source.f58928b);
            this.f58937c = Integer.valueOf(source.f58929c);
            this.f58938d = Integer.valueOf(source.f58930d);
            this.f58939e = Integer.valueOf(source.f58931e);
            this.f58940f = source.f58932f;
            this.f58941g = source.f58933g;
            this.f58942h = source.f58934h;
        }
    }
}
