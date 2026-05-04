package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k implements ts.e {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final b f101683j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<k, a> f101684k = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101685a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<String> f101686b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<String> f101687c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<Long> f101688d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101689e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101690f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101691g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101692h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101693i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<k, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k read(@m80.k ws.i protocol, @m80.k a builder) {
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
                int i11 = 0;
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 2:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i12 = v42.f96838b;
                            while (i11 < i12) {
                                arrayList.add(protocol.readString());
                                i11++;
                            }
                            protocol.l8();
                            builder.d(arrayList);
                            break;
                        }
                    case 3:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v43 = protocol.v4();
                            ArrayList arrayList2 = new ArrayList(v43.f96838b);
                            int i13 = v43.f96838b;
                            while (i11 < i13) {
                                arrayList2.add(protocol.readString());
                                i11++;
                            }
                            protocol.l8();
                            builder.b(arrayList2);
                            break;
                        }
                    case 4:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v44 = protocol.v4();
                            ArrayList arrayList3 = new ArrayList(v44.f96838b);
                            int i14 = v44.f96838b;
                            while (i11 < i14) {
                                arrayList3.add(Long.valueOf(protocol.T1()));
                                i11++;
                            }
                            protocol.l8();
                            builder.c(arrayList3);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k k struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("DakaBackgroundCategoryInfo");
            protocol.Q6("name", 1, (byte) 11);
            protocol.p1(struct.f101685a);
            protocol.N2();
            protocol.Q6("images", 2, (byte) 15);
            protocol.y2((byte) 11, struct.f101686b.size());
            Iterator<String> it = struct.f101686b.iterator();
            while (it.hasNext()) {
                protocol.p1(it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("colors", 3, (byte) 15);
            protocol.y2((byte) 11, struct.f101687c.size());
            Iterator<String> it2 = struct.f101687c.iterator();
            while (it2.hasNext()) {
                protocol.p1(it2.next());
            }
            protocol.i5();
            protocol.N2();
            if (struct.f101688d != null) {
                protocol.Q6("image_ids", 4, (byte) 15);
                protocol.y2((byte) 10, struct.f101688d.size());
                Iterator<Long> it3 = struct.f101688d.iterator();
                while (it3.hasNext()) {
                    protocol.q7(it3.next().longValue());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f101689e != null) {
                protocol.Q6("sentence", 5, (byte) 11);
                protocol.p1(struct.f101689e);
                protocol.N2();
            }
            if (struct.f101690f != null) {
                protocol.Q6("sen_mean", 6, (byte) 11);
                protocol.p1(struct.f101690f);
                protocol.N2();
            }
            if (struct.f101691g != null) {
                protocol.Q6("sen_source", 7, (byte) 11);
                protocol.p1(struct.f101691g);
                protocol.N2();
            }
            if (struct.f101692h != null) {
                protocol.Q6("win_days", 8, (byte) 8);
                protocol.l5(struct.f101692h.intValue());
                protocol.N2();
            }
            if (struct.f101693i != null) {
                protocol.Q6("win_type", 9, (byte) 8);
                protocol.l5(struct.f101693i.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public k(@m80.k String name, @m80.k List<String> images, @m80.k List<String> colors, @m80.l List<Long> list, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l Integer num, @m80.l Integer num2) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(images, "images");
        kotlin.jvm.internal.g0.p(colors, "colors");
        this.f101685a = name;
        this.f101686b = images;
        this.f101687c = colors;
        this.f101688d = list;
        this.f101689e = str;
        this.f101690f = str2;
        this.f101691g = str3;
        this.f101692h = num;
        this.f101693i = num2;
    }

    public static /* synthetic */ k k(k kVar, String str, List list, List list2, List list3, String str2, String str3, String str4, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kVar.f101685a;
        }
        if ((i11 & 2) != 0) {
            list = kVar.f101686b;
        }
        if ((i11 & 4) != 0) {
            list2 = kVar.f101687c;
        }
        if ((i11 & 8) != 0) {
            list3 = kVar.f101688d;
        }
        if ((i11 & 16) != 0) {
            str2 = kVar.f101689e;
        }
        if ((i11 & 32) != 0) {
            str3 = kVar.f101690f;
        }
        if ((i11 & 64) != 0) {
            str4 = kVar.f101691g;
        }
        if ((i11 & 128) != 0) {
            num = kVar.f101692h;
        }
        if ((i11 & 256) != 0) {
            num2 = kVar.f101693i;
        }
        Integer num3 = num;
        Integer num4 = num2;
        String str5 = str3;
        String str6 = str4;
        String str7 = str2;
        List list4 = list2;
        return kVar.j(str, list, list4, list3, str7, str5, str6, num3, num4);
    }

    @m80.k
    public final String a() {
        return this.f101685a;
    }

    @m80.k
    public final List<String> b() {
        return this.f101686b;
    }

    @m80.k
    public final List<String> c() {
        return this.f101687c;
    }

    @m80.l
    public final List<Long> d() {
        return this.f101688d;
    }

    @m80.l
    public final String e() {
        return this.f101689e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.g0.g(this.f101685a, kVar.f101685a) && kotlin.jvm.internal.g0.g(this.f101686b, kVar.f101686b) && kotlin.jvm.internal.g0.g(this.f101687c, kVar.f101687c) && kotlin.jvm.internal.g0.g(this.f101688d, kVar.f101688d) && kotlin.jvm.internal.g0.g(this.f101689e, kVar.f101689e) && kotlin.jvm.internal.g0.g(this.f101690f, kVar.f101690f) && kotlin.jvm.internal.g0.g(this.f101691g, kVar.f101691g) && kotlin.jvm.internal.g0.g(this.f101692h, kVar.f101692h) && kotlin.jvm.internal.g0.g(this.f101693i, kVar.f101693i);
    }

    @m80.l
    public final String f() {
        return this.f101690f;
    }

    @m80.l
    public final String g() {
        return this.f101691g;
    }

    @m80.l
    public final Integer h() {
        return this.f101692h;
    }

    public int hashCode() {
        int hashCode = ((((this.f101685a.hashCode() * 31) + this.f101686b.hashCode()) * 31) + this.f101687c.hashCode()) * 31;
        List<Long> list = this.f101688d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f101689e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f101690f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f101691g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f101692h;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f101693i;
        return hashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    @m80.l
    public final Integer i() {
        return this.f101693i;
    }

    @m80.k
    public final k j(@m80.k String name, @m80.k List<String> images, @m80.k List<String> colors, @m80.l List<Long> list, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l Integer num, @m80.l Integer num2) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(images, "images");
        kotlin.jvm.internal.g0.p(colors, "colors");
        return new k(name, images, colors, list, str, str2, str3, num, num2);
    }

    @m80.k
    public String toString() {
        return "DakaBackgroundCategoryInfo(name=" + this.f101685a + ", images=" + this.f101686b + ", colors=" + this.f101687c + ", image_ids=" + this.f101688d + ", sentence=" + this.f101689e + ", sen_mean=" + this.f101690f + ", sen_source=" + this.f101691g + ", win_days=" + this.f101692h + ", win_type=" + this.f101693i + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101684k.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nDakaBackgroundCategoryInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DakaBackgroundCategoryInfo.kt\ncom/baicizhan/biz/online/user_study_api/DakaBackgroundCategoryInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n1#2:367\n*E\n"})
    public static final class a implements ts.f<k> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f101694a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<String> f101695b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<String> f101696c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public List<Long> f101697d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f101698e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f101699f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f101700g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Integer f101701h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public Integer f101702i;

        public a() {
            this.f101694a = null;
            this.f101695b = null;
            this.f101696c = null;
            this.f101697d = null;
            this.f101698e = null;
            this.f101699f = null;
            this.f101700g = null;
            this.f101701h = null;
            this.f101702i = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k build() {
            String str = this.f101694a;
            if (str == null) {
                throw new IllegalStateException("Required field 'name' is missing");
            }
            List<String> list = this.f101695b;
            if (list == null) {
                throw new IllegalStateException("Required field 'images' is missing");
            }
            List<String> list2 = this.f101696c;
            if (list2 != null) {
                return new k(str, list, list2, this.f101697d, this.f101698e, this.f101699f, this.f101700g, this.f101701h, this.f101702i);
            }
            throw new IllegalStateException("Required field 'colors' is missing");
        }

        @m80.k
        public final a b(@m80.k List<String> colors) {
            kotlin.jvm.internal.g0.p(colors, "colors");
            this.f101696c = colors;
            return this;
        }

        @m80.k
        public final a c(@m80.l List<Long> list) {
            this.f101697d = list;
            return this;
        }

        @m80.k
        public final a d(@m80.k List<String> images) {
            kotlin.jvm.internal.g0.p(images, "images");
            this.f101695b = images;
            return this;
        }

        @m80.k
        public final a e(@m80.k String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            this.f101694a = name;
            return this;
        }

        @m80.k
        public final a f(@m80.l String str) {
            this.f101699f = str;
            return this;
        }

        @m80.k
        public final a g(@m80.l String str) {
            this.f101700g = str;
            return this;
        }

        @m80.k
        public final a h(@m80.l String str) {
            this.f101698e = str;
            return this;
        }

        @m80.k
        public final a i(@m80.l Integer num) {
            this.f101701h = num;
            return this;
        }

        @m80.k
        public final a j(@m80.l Integer num) {
            this.f101702i = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101694a = null;
            this.f101695b = null;
            this.f101696c = null;
            this.f101697d = null;
            this.f101698e = null;
            this.f101699f = null;
            this.f101700g = null;
            this.f101701h = null;
            this.f101702i = null;
        }

        public a(@m80.k k source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101694a = source.f101685a;
            this.f101695b = source.f101686b;
            this.f101696c = source.f101687c;
            this.f101697d = source.f101688d;
            this.f101698e = source.f101689e;
            this.f101699f = source.f101690f;
            this.f101700g = source.f101691g;
            this.f101701h = source.f101692h;
            this.f101702i = source.f101693i;
        }
    }
}
