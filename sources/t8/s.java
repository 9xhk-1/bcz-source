package t8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class s implements ts.e {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final b f90240j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<s, a> f90241k = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final r f90242a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<f> f90243b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<f> f90244c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<k> f90245d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<l> f90246e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<n> f90247f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<n> f90248g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final q f90249h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<String> f90250i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<s, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(r.f90223j.read(protocol));
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
                                arrayList.add(f.f90016j.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.c(arrayList);
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
                                arrayList2.add(f.f90016j.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.d(arrayList2);
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
                                arrayList3.add(k.f90099j.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.f(arrayList3);
                            break;
                        }
                    case 5:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v45 = protocol.v4();
                            ArrayList arrayList4 = new ArrayList(v45.f96838b);
                            int i15 = v45.f96838b;
                            while (i11 < i15) {
                                arrayList4.add(l.f90117h.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.g(arrayList4);
                            break;
                        }
                    case 6:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v46 = protocol.v4();
                            ArrayList arrayList5 = new ArrayList(v46.f96838b);
                            int i16 = v46.f96838b;
                            while (i11 < i16) {
                                arrayList5.add(n.f90139g.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.a(arrayList5);
                            break;
                        }
                    case 7:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v47 = protocol.v4();
                            ArrayList arrayList6 = new ArrayList(v47.f96838b);
                            int i17 = v47.f96838b;
                            while (i11 < i17) {
                                arrayList6.add(n.f90139g.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.h(arrayList6);
                            break;
                        }
                    case 8:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(q.C.read(protocol));
                            break;
                        }
                    case 9:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v48 = protocol.v4();
                            ArrayList arrayList7 = new ArrayList(v48.f96838b);
                            int i18 = v48.f96838b;
                            while (i11 < i18) {
                                arrayList7.add(protocol.readString());
                                i11++;
                            }
                            protocol.l8();
                            builder.e(arrayList7);
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
        public void write(@m80.k ws.i protocol, @m80.k s struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("WordDictV2");
            protocol.Q6("word_basic_info", 1, (byte) 12);
            r.f90223j.write(protocol, struct.f90242a);
            protocol.N2();
            protocol.Q6("chn_means", 2, (byte) 15);
            protocol.y2((byte) 12, struct.f90243b.size());
            Iterator<f> it = struct.f90243b.iterator();
            while (it.hasNext()) {
                f.f90016j.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            if (struct.f90244c != null) {
                protocol.Q6("en_means", 3, (byte) 15);
                protocol.y2((byte) 12, struct.f90244c.size());
                Iterator<f> it2 = struct.f90244c.iterator();
                while (it2.hasNext()) {
                    f.f90016j.write(protocol, it2.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f90245d != null) {
                protocol.Q6("sentences", 4, (byte) 15);
                protocol.y2((byte) 12, struct.f90245d.size());
                Iterator<k> it3 = struct.f90245d.iterator();
                while (it3.hasNext()) {
                    k.f90099j.write(protocol, it3.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f90246e != null) {
                protocol.Q6("short_phrases", 5, (byte) 15);
                protocol.y2((byte) 12, struct.f90246e.size());
                Iterator<l> it4 = struct.f90246e.iterator();
                while (it4.hasNext()) {
                    l.f90117h.write(protocol, it4.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f90247f != null) {
                protocol.Q6("antonyms", 6, (byte) 15);
                protocol.y2((byte) 12, struct.f90247f.size());
                Iterator<n> it5 = struct.f90247f.iterator();
                while (it5.hasNext()) {
                    n.f90139g.write(protocol, it5.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f90248g != null) {
                protocol.Q6("synonyms", 7, (byte) 15);
                protocol.y2((byte) 12, struct.f90248g.size());
                Iterator<n> it6 = struct.f90248g.iterator();
                while (it6.hasNext()) {
                    n.f90139g.write(protocol, it6.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f90249h != null) {
                protocol.Q6("variant_info", 8, (byte) 12);
                q.C.write(protocol, struct.f90249h);
                protocol.N2();
            }
            if (struct.f90250i != null) {
                protocol.Q6("exams", 9, (byte) 15);
                protocol.y2((byte) 11, struct.f90250i.size());
                Iterator<String> it7 = struct.f90250i.iterator();
                while (it7.hasNext()) {
                    protocol.p1(it7.next());
                }
                protocol.i5();
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public s(@m80.k r word_basic_info, @m80.k List<f> chn_means, @m80.l List<f> list, @m80.l List<k> list2, @m80.l List<l> list3, @m80.l List<n> list4, @m80.l List<n> list5, @m80.l q qVar, @m80.l List<String> list6) {
        g0.p(word_basic_info, "word_basic_info");
        g0.p(chn_means, "chn_means");
        this.f90242a = word_basic_info;
        this.f90243b = chn_means;
        this.f90244c = list;
        this.f90245d = list2;
        this.f90246e = list3;
        this.f90247f = list4;
        this.f90248g = list5;
        this.f90249h = qVar;
        this.f90250i = list6;
    }

    public static /* synthetic */ s k(s sVar, r rVar, List list, List list2, List list3, List list4, List list5, List list6, q qVar, List list7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            rVar = sVar.f90242a;
        }
        if ((i11 & 2) != 0) {
            list = sVar.f90243b;
        }
        if ((i11 & 4) != 0) {
            list2 = sVar.f90244c;
        }
        if ((i11 & 8) != 0) {
            list3 = sVar.f90245d;
        }
        if ((i11 & 16) != 0) {
            list4 = sVar.f90246e;
        }
        if ((i11 & 32) != 0) {
            list5 = sVar.f90247f;
        }
        if ((i11 & 64) != 0) {
            list6 = sVar.f90248g;
        }
        if ((i11 & 128) != 0) {
            qVar = sVar.f90249h;
        }
        if ((i11 & 256) != 0) {
            list7 = sVar.f90250i;
        }
        q qVar2 = qVar;
        List list8 = list7;
        List list9 = list5;
        List list10 = list6;
        List list11 = list4;
        List list12 = list2;
        return sVar.j(rVar, list, list12, list3, list11, list9, list10, qVar2, list8);
    }

    @m80.k
    public final r a() {
        return this.f90242a;
    }

    @m80.k
    public final List<f> b() {
        return this.f90243b;
    }

    @m80.l
    public final List<f> c() {
        return this.f90244c;
    }

    @m80.l
    public final List<k> d() {
        return this.f90245d;
    }

    @m80.l
    public final List<l> e() {
        return this.f90246e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return g0.g(this.f90242a, sVar.f90242a) && g0.g(this.f90243b, sVar.f90243b) && g0.g(this.f90244c, sVar.f90244c) && g0.g(this.f90245d, sVar.f90245d) && g0.g(this.f90246e, sVar.f90246e) && g0.g(this.f90247f, sVar.f90247f) && g0.g(this.f90248g, sVar.f90248g) && g0.g(this.f90249h, sVar.f90249h) && g0.g(this.f90250i, sVar.f90250i);
    }

    @m80.l
    public final List<n> f() {
        return this.f90247f;
    }

    @m80.l
    public final List<n> g() {
        return this.f90248g;
    }

    @m80.l
    public final q h() {
        return this.f90249h;
    }

    public int hashCode() {
        int hashCode = ((this.f90242a.hashCode() * 31) + this.f90243b.hashCode()) * 31;
        List<f> list = this.f90244c;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<k> list2 = this.f90245d;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<l> list3 = this.f90246e;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<n> list4 = this.f90247f;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<n> list5 = this.f90248g;
        int hashCode6 = (hashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        q qVar = this.f90249h;
        int hashCode7 = (hashCode6 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        List<String> list6 = this.f90250i;
        return hashCode7 + (list6 != null ? list6.hashCode() : 0);
    }

    @m80.l
    public final List<String> i() {
        return this.f90250i;
    }

    @m80.k
    public final s j(@m80.k r word_basic_info, @m80.k List<f> chn_means, @m80.l List<f> list, @m80.l List<k> list2, @m80.l List<l> list3, @m80.l List<n> list4, @m80.l List<n> list5, @m80.l q qVar, @m80.l List<String> list6) {
        g0.p(word_basic_info, "word_basic_info");
        g0.p(chn_means, "chn_means");
        return new s(word_basic_info, chn_means, list, list2, list3, list4, list5, qVar, list6);
    }

    @m80.k
    public String toString() {
        return "WordDictV2(word_basic_info=" + this.f90242a + ", chn_means=" + this.f90243b + ", en_means=" + this.f90244c + ", sentences=" + this.f90245d + ", short_phrases=" + this.f90246e + ", antonyms=" + this.f90247f + ", synonyms=" + this.f90248g + ", variant_info=" + this.f90249h + ", exams=" + this.f90250i + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90241k.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nWordDictV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordDictV2.kt\ncom/baicizhan/biz/online/resource_api/WordDictV2$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n1#2:391\n*E\n"})
    public static final class a implements ts.f<s> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public r f90251a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<f> f90252b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<f> f90253c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public List<k> f90254d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public List<l> f90255e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public List<n> f90256f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public List<n> f90257g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public q f90258h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public List<String> f90259i;

        public a() {
            this.f90251a = null;
            this.f90252b = null;
            this.f90253c = null;
            this.f90254d = null;
            this.f90255e = null;
            this.f90256f = null;
            this.f90257g = null;
            this.f90258h = null;
            this.f90259i = null;
        }

        @m80.k
        public final a a(@m80.l List<n> list) {
            this.f90256f = list;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s build() {
            r rVar = this.f90251a;
            if (rVar == null) {
                throw new IllegalStateException("Required field 'word_basic_info' is missing");
            }
            List<f> list = this.f90252b;
            if (list != null) {
                return new s(rVar, list, this.f90253c, this.f90254d, this.f90255e, this.f90256f, this.f90257g, this.f90258h, this.f90259i);
            }
            throw new IllegalStateException("Required field 'chn_means' is missing");
        }

        @m80.k
        public final a c(@m80.k List<f> chn_means) {
            g0.p(chn_means, "chn_means");
            this.f90252b = chn_means;
            return this;
        }

        @m80.k
        public final a d(@m80.l List<f> list) {
            this.f90253c = list;
            return this;
        }

        @m80.k
        public final a e(@m80.l List<String> list) {
            this.f90259i = list;
            return this;
        }

        @m80.k
        public final a f(@m80.l List<k> list) {
            this.f90254d = list;
            return this;
        }

        @m80.k
        public final a g(@m80.l List<l> list) {
            this.f90255e = list;
            return this;
        }

        @m80.k
        public final a h(@m80.l List<n> list) {
            this.f90257g = list;
            return this;
        }

        @m80.k
        public final a i(@m80.l q qVar) {
            this.f90258h = qVar;
            return this;
        }

        @m80.k
        public final a j(@m80.k r word_basic_info) {
            g0.p(word_basic_info, "word_basic_info");
            this.f90251a = word_basic_info;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90251a = null;
            this.f90252b = null;
            this.f90253c = null;
            this.f90254d = null;
            this.f90255e = null;
            this.f90256f = null;
            this.f90257g = null;
            this.f90258h = null;
            this.f90259i = null;
        }

        public a(@m80.k s source) {
            g0.p(source, "source");
            this.f90251a = source.f90242a;
            this.f90252b = source.f90243b;
            this.f90253c = source.f90244c;
            this.f90254d = source.f90245d;
            this.f90255e = source.f90246e;
            this.f90256f = source.f90247f;
            this.f90257g = source.f90248g;
            this.f90258h = source.f90249h;
            this.f90259i = source.f90250i;
        }
    }
}
