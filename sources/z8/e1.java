package z8;

import com.baicizhan.client.business.dataset.provider.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e1 implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f101479c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<e1, a> f101480d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101481a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<Integer> f101482b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<e1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 15) {
                        ws.f v42 = protocol.v4();
                        ArrayList arrayList = new ArrayList(v42.f96838b);
                        int i11 = v42.f96838b;
                        for (int i12 = 0; i12 < i11; i12++) {
                            arrayList.add(Integer.valueOf(protocol.s8()));
                        }
                        protocol.l8();
                        builder.a(arrayList);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.c(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k e1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserBookCateJapn");
            protocol.Q6(ma.b.f72942s, 1, (byte) 11);
            protocol.p1(struct.f101481a);
            protocol.N2();
            protocol.Q6(a.f.C0247a.f16190b, 2, (byte) 15);
            protocol.y2((byte) 8, struct.f101482b.size());
            Iterator<Integer> it = struct.f101482b.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public e1(@m80.k String cate_name, @m80.k List<Integer> book_ids) {
        kotlin.jvm.internal.g0.p(cate_name, "cate_name");
        kotlin.jvm.internal.g0.p(book_ids, "book_ids");
        this.f101481a = cate_name;
        this.f101482b = book_ids;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e1 d(e1 e1Var, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = e1Var.f101481a;
        }
        if ((i11 & 2) != 0) {
            list = e1Var.f101482b;
        }
        return e1Var.c(str, list);
    }

    @m80.k
    public final String a() {
        return this.f101481a;
    }

    @m80.k
    public final List<Integer> b() {
        return this.f101482b;
    }

    @m80.k
    public final e1 c(@m80.k String cate_name, @m80.k List<Integer> book_ids) {
        kotlin.jvm.internal.g0.p(cate_name, "cate_name");
        kotlin.jvm.internal.g0.p(book_ids, "book_ids");
        return new e1(cate_name, book_ids);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return kotlin.jvm.internal.g0.g(this.f101481a, e1Var.f101481a) && kotlin.jvm.internal.g0.g(this.f101482b, e1Var.f101482b);
    }

    public int hashCode() {
        return (this.f101481a.hashCode() * 31) + this.f101482b.hashCode();
    }

    @m80.k
    public String toString() {
        return "UserBookCateJapn(cate_name=" + this.f101481a + ", book_ids=" + this.f101482b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101480d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserBookCateJapn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBookCateJapn.kt\ncom/baicizhan/biz/online/user_study_api/UserBookCateJapn$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
    public static final class a implements ts.f<e1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f101483a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<Integer> f101484b;

        public a() {
            this.f101483a = null;
            this.f101484b = null;
        }

        @m80.k
        public final a a(@m80.k List<Integer> book_ids) {
            kotlin.jvm.internal.g0.p(book_ids, "book_ids");
            this.f101484b = book_ids;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e1 build() {
            String str = this.f101483a;
            if (str == null) {
                throw new IllegalStateException("Required field 'cate_name' is missing");
            }
            List<Integer> list = this.f101484b;
            if (list != null) {
                return new e1(str, list);
            }
            throw new IllegalStateException("Required field 'book_ids' is missing");
        }

        @m80.k
        public final a c(@m80.k String cate_name) {
            kotlin.jvm.internal.g0.p(cate_name, "cate_name");
            this.f101483a = cate_name;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101483a = null;
            this.f101484b = null;
        }

        public a(@m80.k e1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101483a = source.f101481a;
            this.f101484b = source.f101482b;
        }
    }
}
