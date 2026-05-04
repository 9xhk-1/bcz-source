package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g1 implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f101547c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<g1, a> f101548d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<d1> f101549a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<e1> f101550b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<g1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        at.b.a(protocol, b11);
                    } else if (b11 == 15) {
                        ws.f v42 = protocol.v4();
                        ArrayList arrayList = new ArrayList(v42.f96838b);
                        int i12 = v42.f96838b;
                        while (i11 < i12) {
                            arrayList.add(e1.f101480d.read(protocol));
                            i11++;
                        }
                        protocol.l8();
                        builder.c(arrayList);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v43 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v43.f96838b);
                    int i13 = v43.f96838b;
                    while (i11 < i13) {
                        arrayList2.add(d1.f101428j.read(protocol));
                        i11++;
                    }
                    protocol.l8();
                    builder.a(arrayList2);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k g1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserBookInfoJapan");
            protocol.Q6("books", 1, (byte) 15);
            protocol.y2((byte) 12, struct.f101549a.size());
            Iterator<d1> it = struct.f101549a.iterator();
            while (it.hasNext()) {
                d1.f101428j.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("cates", 2, (byte) 15);
            protocol.y2((byte) 12, struct.f101550b.size());
            Iterator<e1> it2 = struct.f101550b.iterator();
            while (it2.hasNext()) {
                e1.f101480d.write(protocol, it2.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public g1(@m80.k List<d1> books, @m80.k List<e1> cates) {
        kotlin.jvm.internal.g0.p(books, "books");
        kotlin.jvm.internal.g0.p(cates, "cates");
        this.f101549a = books;
        this.f101550b = cates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g1 d(g1 g1Var, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = g1Var.f101549a;
        }
        if ((i11 & 2) != 0) {
            list2 = g1Var.f101550b;
        }
        return g1Var.c(list, list2);
    }

    @m80.k
    public final List<d1> a() {
        return this.f101549a;
    }

    @m80.k
    public final List<e1> b() {
        return this.f101550b;
    }

    @m80.k
    public final g1 c(@m80.k List<d1> books, @m80.k List<e1> cates) {
        kotlin.jvm.internal.g0.p(books, "books");
        kotlin.jvm.internal.g0.p(cates, "cates");
        return new g1(books, cates);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return kotlin.jvm.internal.g0.g(this.f101549a, g1Var.f101549a) && kotlin.jvm.internal.g0.g(this.f101550b, g1Var.f101550b);
    }

    public int hashCode() {
        return (this.f101549a.hashCode() * 31) + this.f101550b.hashCode();
    }

    @m80.k
    public String toString() {
        return "UserBookInfoJapan(books=" + this.f101549a + ", cates=" + this.f101550b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101548d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserBookInfoJapan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBookInfoJapan.kt\ncom/baicizhan/biz/online/user_study_api/UserBookInfoJapan$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n1#2:141\n*E\n"})
    public static final class a implements ts.f<g1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<d1> f101551a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<e1> f101552b;

        public a() {
            this.f101551a = null;
            this.f101552b = null;
        }

        @m80.k
        public final a a(@m80.k List<d1> books) {
            kotlin.jvm.internal.g0.p(books, "books");
            this.f101551a = books;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g1 build() {
            List<d1> list = this.f101551a;
            if (list == null) {
                throw new IllegalStateException("Required field 'books' is missing");
            }
            List<e1> list2 = this.f101552b;
            if (list2 != null) {
                return new g1(list, list2);
            }
            throw new IllegalStateException("Required field 'cates' is missing");
        }

        @m80.k
        public final a c(@m80.k List<e1> cates) {
            kotlin.jvm.internal.g0.p(cates, "cates");
            this.f101552b = cates;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101551a = null;
            this.f101552b = null;
        }

        public a(@m80.k g1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101551a = source.f101549a;
            this.f101552b = source.f101550b;
        }
    }
}
