package o8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class u implements ts.e {

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final b f76539k = new b(null);

    /* renamed from: l, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<u, a> f76540l = new c();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f76541a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<k> f76542b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f76543c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76544d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final f f76545e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<l> f76546f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<String> f76547g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<String> f76548h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final e f76549i;

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    public final int f76550j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<u, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
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
                                arrayList.add(k.f76448e.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.f(arrayList);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(f.f76404f.read(protocol));
                            break;
                        }
                    case 6:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v43 = protocol.v4();
                            ArrayList arrayList2 = new ArrayList(v43.f96838b);
                            int i13 = v43.f96838b;
                            while (i11 < i13) {
                                arrayList2.add(l.f76456d.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.a(arrayList2);
                            break;
                        }
                    case 7:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v44 = protocol.v4();
                            ArrayList arrayList3 = new ArrayList(v44.f96838b);
                            int i14 = v44.f96838b;
                            while (i11 < i14) {
                                arrayList3.add(protocol.readString());
                                i11++;
                            }
                            protocol.l8();
                            builder.e(arrayList3);
                            break;
                        }
                    case 8:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v45 = protocol.v4();
                            ArrayList arrayList4 = new ArrayList(v45.f96838b);
                            int i15 = v45.f96838b;
                            while (i11 < i15) {
                                arrayList4.add(protocol.readString());
                                i11++;
                            }
                            protocol.l8();
                            builder.i(arrayList4);
                            break;
                        }
                    case 9:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(e.f76396e.read(protocol));
                            break;
                        }
                    case 10:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k u struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("VocabLiveInfo");
            if (struct.f76541a != null) {
                protocol.Q6("nickname", 1, (byte) 11);
                protocol.p1(struct.f76541a);
                protocol.N2();
            }
            protocol.Q6("line_infos", 2, (byte) 15);
            protocol.y2((byte) 12, struct.f76542b.size());
            Iterator<k> it = struct.f76542b.iterator();
            while (it.hasNext()) {
                k.f76448e.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("duration", 3, (byte) 8);
            protocol.l5(struct.f76543c);
            protocol.N2();
            protocol.Q6("title", 4, (byte) 11);
            protocol.p1(struct.f76544d);
            protocol.N2();
            if (struct.f76545e != null) {
                protocol.Q6("discountcoupon", 5, (byte) 12);
                f.f76404f.write(protocol, struct.f76545e);
                protocol.N2();
            }
            if (struct.f76546f != null) {
                protocol.Q6("answers", 6, (byte) 15);
                protocol.y2((byte) 12, struct.f76546f.size());
                Iterator<l> it2 = struct.f76546f.iterator();
                while (it2.hasNext()) {
                    l.f76456d.write(protocol, it2.next());
                }
                protocol.i5();
                protocol.N2();
            }
            protocol.Q6("emojis", 7, (byte) 15);
            protocol.y2((byte) 11, struct.f76547g.size());
            Iterator<String> it3 = struct.f76547g.iterator();
            while (it3.hasNext()) {
                protocol.p1(it3.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("sents", 8, (byte) 15);
            protocol.y2((byte) 11, struct.f76548h.size());
            Iterator<String> it4 = struct.f76548h.iterator();
            while (it4.hasNext()) {
                protocol.p1(it4.next());
            }
            protocol.i5();
            protocol.N2();
            if (struct.f76549i != null) {
                protocol.Q6("qs", 9, (byte) 12);
                e.f76396e.write(protocol, struct.f76549i);
                protocol.N2();
            }
            protocol.Q6("study_done", 10, (byte) 8);
            protocol.l5(struct.f76550j);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public u(@m80.l String str, @m80.k List<k> line_infos, int i11, @m80.k String title, @m80.l f fVar, @m80.l List<l> list, @m80.k List<String> emojis, @m80.k List<String> sents, @m80.l e eVar, int i12) {
        g0.p(line_infos, "line_infos");
        g0.p(title, "title");
        g0.p(emojis, "emojis");
        g0.p(sents, "sents");
        this.f76541a = str;
        this.f76542b = line_infos;
        this.f76543c = i11;
        this.f76544d = title;
        this.f76545e = fVar;
        this.f76546f = list;
        this.f76547g = emojis;
        this.f76548h = sents;
        this.f76549i = eVar;
        this.f76550j = i12;
    }

    public static /* synthetic */ u l(u uVar, String str, List list, int i11, String str2, f fVar, List list2, List list3, List list4, e eVar, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = uVar.f76541a;
        }
        if ((i13 & 2) != 0) {
            list = uVar.f76542b;
        }
        if ((i13 & 4) != 0) {
            i11 = uVar.f76543c;
        }
        if ((i13 & 8) != 0) {
            str2 = uVar.f76544d;
        }
        if ((i13 & 16) != 0) {
            fVar = uVar.f76545e;
        }
        if ((i13 & 32) != 0) {
            list2 = uVar.f76546f;
        }
        if ((i13 & 64) != 0) {
            list3 = uVar.f76547g;
        }
        if ((i13 & 128) != 0) {
            list4 = uVar.f76548h;
        }
        if ((i13 & 256) != 0) {
            eVar = uVar.f76549i;
        }
        if ((i13 & 512) != 0) {
            i12 = uVar.f76550j;
        }
        e eVar2 = eVar;
        int i14 = i12;
        List list5 = list3;
        List list6 = list4;
        f fVar2 = fVar;
        List list7 = list2;
        return uVar.k(str, list, i11, str2, fVar2, list7, list5, list6, eVar2, i14);
    }

    @m80.l
    public final String a() {
        return this.f76541a;
    }

    public final int b() {
        return this.f76550j;
    }

    @m80.k
    public final List<k> c() {
        return this.f76542b;
    }

    public final int d() {
        return this.f76543c;
    }

    @m80.k
    public final String e() {
        return this.f76544d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return g0.g(this.f76541a, uVar.f76541a) && g0.g(this.f76542b, uVar.f76542b) && this.f76543c == uVar.f76543c && g0.g(this.f76544d, uVar.f76544d) && g0.g(this.f76545e, uVar.f76545e) && g0.g(this.f76546f, uVar.f76546f) && g0.g(this.f76547g, uVar.f76547g) && g0.g(this.f76548h, uVar.f76548h) && g0.g(this.f76549i, uVar.f76549i) && this.f76550j == uVar.f76550j;
    }

    @m80.l
    public final f f() {
        return this.f76545e;
    }

    @m80.l
    public final List<l> g() {
        return this.f76546f;
    }

    @m80.k
    public final List<String> h() {
        return this.f76547g;
    }

    public int hashCode() {
        String str = this.f76541a;
        int hashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.f76542b.hashCode()) * 31) + Integer.hashCode(this.f76543c)) * 31) + this.f76544d.hashCode()) * 31;
        f fVar = this.f76545e;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        List<l> list = this.f76546f;
        int hashCode3 = (((((hashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.f76547g.hashCode()) * 31) + this.f76548h.hashCode()) * 31;
        e eVar = this.f76549i;
        return ((hashCode3 + (eVar != null ? eVar.hashCode() : 0)) * 31) + Integer.hashCode(this.f76550j);
    }

    @m80.k
    public final List<String> i() {
        return this.f76548h;
    }

    @m80.l
    public final e j() {
        return this.f76549i;
    }

    @m80.k
    public final u k(@m80.l String str, @m80.k List<k> line_infos, int i11, @m80.k String title, @m80.l f fVar, @m80.l List<l> list, @m80.k List<String> emojis, @m80.k List<String> sents, @m80.l e eVar, int i12) {
        g0.p(line_infos, "line_infos");
        g0.p(title, "title");
        g0.p(emojis, "emojis");
        g0.p(sents, "sents");
        return new u(str, line_infos, i11, title, fVar, list, emojis, sents, eVar, i12);
    }

    @m80.k
    public String toString() {
        return "VocabLiveInfo(nickname=" + this.f76541a + ", line_infos=" + this.f76542b + ", duration=" + this.f76543c + ", title=" + this.f76544d + ", discountcoupon=" + this.f76545e + ", answers=" + this.f76546f + ", emojis=" + this.f76547g + ", sents=" + this.f76548h + ", qs=" + this.f76549i + ", study_done=" + this.f76550j + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76540l.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nVocabLiveInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VocabLiveInfo.kt\ncom/baicizhan/biz/online/course_api/VocabLiveInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n1#2:399\n*E\n"})
    public static final class a implements ts.f<u> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f76551a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<k> f76552b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f76553c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f76554d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public f f76555e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public List<l> f76556f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public List<String> f76557g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public List<String> f76558h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public e f76559i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public Integer f76560j;

        public a() {
            this.f76551a = null;
            this.f76552b = null;
            this.f76553c = null;
            this.f76554d = null;
            this.f76555e = null;
            this.f76556f = null;
            this.f76557g = null;
            this.f76558h = null;
            this.f76559i = null;
            this.f76560j = null;
        }

        @m80.k
        public final a a(@m80.l List<l> list) {
            this.f76556f = list;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u build() {
            String str = this.f76551a;
            List<k> list = this.f76552b;
            if (list == null) {
                throw new IllegalStateException("Required field 'line_infos' is missing");
            }
            Integer num = this.f76553c;
            if (num == null) {
                throw new IllegalStateException("Required field 'duration' is missing");
            }
            int intValue = num.intValue();
            String str2 = this.f76554d;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'title' is missing");
            }
            f fVar = this.f76555e;
            List<l> list2 = this.f76556f;
            List<String> list3 = this.f76557g;
            if (list3 == null) {
                throw new IllegalStateException("Required field 'emojis' is missing");
            }
            List<String> list4 = this.f76558h;
            if (list4 == null) {
                throw new IllegalStateException("Required field 'sents' is missing");
            }
            e eVar = this.f76559i;
            Integer num2 = this.f76560j;
            if (num2 != null) {
                return new u(str, list, intValue, str2, fVar, list2, list3, list4, eVar, num2.intValue());
            }
            throw new IllegalStateException("Required field 'study_done' is missing");
        }

        @m80.k
        public final a c(@m80.l f fVar) {
            this.f76555e = fVar;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f76553c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(@m80.k List<String> emojis) {
            g0.p(emojis, "emojis");
            this.f76557g = emojis;
            return this;
        }

        @m80.k
        public final a f(@m80.k List<k> line_infos) {
            g0.p(line_infos, "line_infos");
            this.f76552b = line_infos;
            return this;
        }

        @m80.k
        public final a g(@m80.l String str) {
            this.f76551a = str;
            return this;
        }

        @m80.k
        public final a h(@m80.l e eVar) {
            this.f76559i = eVar;
            return this;
        }

        @m80.k
        public final a i(@m80.k List<String> sents) {
            g0.p(sents, "sents");
            this.f76558h = sents;
            return this;
        }

        @m80.k
        public final a j(int i11) {
            this.f76560j = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a k(@m80.k String title) {
            g0.p(title, "title");
            this.f76554d = title;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76551a = null;
            this.f76552b = null;
            this.f76553c = null;
            this.f76554d = null;
            this.f76555e = null;
            this.f76556f = null;
            this.f76557g = null;
            this.f76558h = null;
            this.f76559i = null;
            this.f76560j = null;
        }

        public a(@m80.k u source) {
            g0.p(source, "source");
            this.f76551a = source.f76541a;
            this.f76552b = source.f76542b;
            this.f76553c = Integer.valueOf(source.f76543c);
            this.f76554d = source.f76544d;
            this.f76555e = source.f76545e;
            this.f76556f = source.f76546f;
            this.f76557g = source.f76547g;
            this.f76558h = source.f76548h;
            this.f76559i = source.f76549i;
            this.f76560j = Integer.valueOf(source.f76550j);
        }
    }
}
