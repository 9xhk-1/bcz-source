package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h1 implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f101575e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<h1, a> f101576f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<d1> f101577a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<f1> f101578b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<z8.a> f101579c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<z8.a> f101580d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<h1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                short s11 = a62.f96797c;
                int i11 = 0;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                at.b.a(protocol, b11);
                            } else if (b11 == 15) {
                                ws.f v42 = protocol.v4();
                                ArrayList arrayList = new ArrayList(v42.f96838b);
                                int i12 = v42.f96838b;
                                while (i11 < i12) {
                                    arrayList.add(z8.a.f101109f.read(protocol));
                                    i11++;
                                }
                                protocol.l8();
                                builder.a(arrayList);
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 15) {
                            ws.f v43 = protocol.v4();
                            ArrayList arrayList2 = new ArrayList(v43.f96838b);
                            int i13 = v43.f96838b;
                            while (i11 < i13) {
                                arrayList2.add(z8.a.f101109f.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.e(arrayList2);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 15) {
                        ws.f v44 = protocol.v4();
                        ArrayList arrayList3 = new ArrayList(v44.f96838b);
                        int i14 = v44.f96838b;
                        while (i11 < i14) {
                            arrayList3.add(f1.f101514f.read(protocol));
                            i11++;
                        }
                        protocol.l8();
                        builder.d(arrayList3);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v45 = protocol.v4();
                    ArrayList arrayList4 = new ArrayList(v45.f96838b);
                    int i15 = v45.f96838b;
                    while (i11 < i15) {
                        arrayList4.add(d1.f101428j.read(protocol));
                        i11++;
                    }
                    protocol.l8();
                    builder.b(arrayList4);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k h1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserBookListInfo");
            protocol.Q6("books_info", 1, (byte) 15);
            protocol.y2((byte) 12, struct.f101577a.size());
            Iterator<d1> it = struct.f101577a.iterator();
            while (it.hasNext()) {
                d1.f101428j.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("categories_info", 2, (byte) 15);
            protocol.y2((byte) 12, struct.f101578b.size());
            Iterator<f1> it2 = struct.f101578b.iterator();
            while (it2.hasNext()) {
                f1.f101514f.write(protocol, it2.next());
            }
            protocol.i5();
            protocol.N2();
            if (struct.f101579c != null) {
                protocol.Q6("levels_info", 3, (byte) 15);
                protocol.y2((byte) 12, struct.f101579c.size());
                Iterator<z8.a> it3 = struct.f101579c.iterator();
                while (it3.hasNext()) {
                    z8.a.f101109f.write(protocol, it3.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f101580d != null) {
                protocol.Q6("all_tops", 4, (byte) 15);
                protocol.y2((byte) 12, struct.f101580d.size());
                Iterator<z8.a> it4 = struct.f101580d.iterator();
                while (it4.hasNext()) {
                    z8.a.f101109f.write(protocol, it4.next());
                }
                protocol.i5();
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public h1(@m80.k List<d1> books_info, @m80.k List<f1> categories_info, @m80.l List<z8.a> list, @m80.l List<z8.a> list2) {
        kotlin.jvm.internal.g0.p(books_info, "books_info");
        kotlin.jvm.internal.g0.p(categories_info, "categories_info");
        this.f101577a = books_info;
        this.f101578b = categories_info;
        this.f101579c = list;
        this.f101580d = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h1 f(h1 h1Var, List list, List list2, List list3, List list4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = h1Var.f101577a;
        }
        if ((i11 & 2) != 0) {
            list2 = h1Var.f101578b;
        }
        if ((i11 & 4) != 0) {
            list3 = h1Var.f101579c;
        }
        if ((i11 & 8) != 0) {
            list4 = h1Var.f101580d;
        }
        return h1Var.e(list, list2, list3, list4);
    }

    @m80.k
    public final List<d1> a() {
        return this.f101577a;
    }

    @m80.k
    public final List<f1> b() {
        return this.f101578b;
    }

    @m80.l
    public final List<z8.a> c() {
        return this.f101579c;
    }

    @m80.l
    public final List<z8.a> d() {
        return this.f101580d;
    }

    @m80.k
    public final h1 e(@m80.k List<d1> books_info, @m80.k List<f1> categories_info, @m80.l List<z8.a> list, @m80.l List<z8.a> list2) {
        kotlin.jvm.internal.g0.p(books_info, "books_info");
        kotlin.jvm.internal.g0.p(categories_info, "categories_info");
        return new h1(books_info, categories_info, list, list2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return kotlin.jvm.internal.g0.g(this.f101577a, h1Var.f101577a) && kotlin.jvm.internal.g0.g(this.f101578b, h1Var.f101578b) && kotlin.jvm.internal.g0.g(this.f101579c, h1Var.f101579c) && kotlin.jvm.internal.g0.g(this.f101580d, h1Var.f101580d);
    }

    public int hashCode() {
        int hashCode = ((this.f101577a.hashCode() * 31) + this.f101578b.hashCode()) * 31;
        List<z8.a> list = this.f101579c;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<z8.a> list2 = this.f101580d;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "UserBookListInfo(books_info=" + this.f101577a + ", categories_info=" + this.f101578b + ", levels_info=" + this.f101579c + ", all_tops=" + this.f101580d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101576f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserBookListInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBookListInfo.kt\ncom/baicizhan/biz/online/user_study_api/UserBookListInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"})
    public static final class a implements ts.f<h1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<d1> f101581a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<f1> f101582b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<z8.a> f101583c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public List<z8.a> f101584d;

        public a() {
            this.f101581a = null;
            this.f101582b = null;
            this.f101583c = null;
            this.f101584d = null;
        }

        @m80.k
        public final a a(@m80.l List<z8.a> list) {
            this.f101584d = list;
            return this;
        }

        @m80.k
        public final a b(@m80.k List<d1> books_info) {
            kotlin.jvm.internal.g0.p(books_info, "books_info");
            this.f101581a = books_info;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public h1 build() {
            List<d1> list = this.f101581a;
            if (list == null) {
                throw new IllegalStateException("Required field 'books_info' is missing");
            }
            List<f1> list2 = this.f101582b;
            if (list2 != null) {
                return new h1(list, list2, this.f101583c, this.f101584d);
            }
            throw new IllegalStateException("Required field 'categories_info' is missing");
        }

        @m80.k
        public final a d(@m80.k List<f1> categories_info) {
            kotlin.jvm.internal.g0.p(categories_info, "categories_info");
            this.f101582b = categories_info;
            return this;
        }

        @m80.k
        public final a e(@m80.l List<z8.a> list) {
            this.f101583c = list;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101581a = null;
            this.f101582b = null;
            this.f101583c = null;
            this.f101584d = null;
        }

        public a(@m80.k h1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101581a = source.f101577a;
            this.f101582b = source.f101578b;
            this.f101583c = source.f101579c;
            this.f101584d = source.f101580d;
        }
    }
}
