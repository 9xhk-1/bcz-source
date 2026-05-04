package z8;

import com.baicizhan.client.business.dataset.provider.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f2 implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f101523c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<f2, a> f101524d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101525a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<Integer> f101526b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<f2, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f2 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f2 read(@m80.k ws.i protocol, @m80.k a builder) {
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
        public void write(@m80.k ws.i protocol, @m80.k f2 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserSubCategory");
            protocol.Q6("sub_name", 1, (byte) 11);
            protocol.p1(struct.f101525a);
            protocol.N2();
            protocol.Q6(a.f.C0247a.f16190b, 2, (byte) 15);
            protocol.y2((byte) 8, struct.f101526b.size());
            Iterator<Integer> it = struct.f101526b.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public f2(@m80.k String sub_name, @m80.k List<Integer> book_ids) {
        kotlin.jvm.internal.g0.p(sub_name, "sub_name");
        kotlin.jvm.internal.g0.p(book_ids, "book_ids");
        this.f101525a = sub_name;
        this.f101526b = book_ids;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f2 d(f2 f2Var, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = f2Var.f101525a;
        }
        if ((i11 & 2) != 0) {
            list = f2Var.f101526b;
        }
        return f2Var.c(str, list);
    }

    @m80.k
    public final String a() {
        return this.f101525a;
    }

    @m80.k
    public final List<Integer> b() {
        return this.f101526b;
    }

    @m80.k
    public final f2 c(@m80.k String sub_name, @m80.k List<Integer> book_ids) {
        kotlin.jvm.internal.g0.p(sub_name, "sub_name");
        kotlin.jvm.internal.g0.p(book_ids, "book_ids");
        return new f2(sub_name, book_ids);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return kotlin.jvm.internal.g0.g(this.f101525a, f2Var.f101525a) && kotlin.jvm.internal.g0.g(this.f101526b, f2Var.f101526b);
    }

    public int hashCode() {
        return (this.f101525a.hashCode() * 31) + this.f101526b.hashCode();
    }

    @m80.k
    public String toString() {
        return "UserSubCategory(sub_name=" + this.f101525a + ", book_ids=" + this.f101526b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101524d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserSubCategory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserSubCategory.kt\ncom/baicizhan/biz/online/user_study_api/UserSubCategory$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
    public static final class a implements ts.f<f2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f101527a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<Integer> f101528b;

        public a() {
            this.f101527a = null;
            this.f101528b = null;
        }

        @m80.k
        public final a a(@m80.k List<Integer> book_ids) {
            kotlin.jvm.internal.g0.p(book_ids, "book_ids");
            this.f101528b = book_ids;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f2 build() {
            String str = this.f101527a;
            if (str == null) {
                throw new IllegalStateException("Required field 'sub_name' is missing");
            }
            List<Integer> list = this.f101528b;
            if (list != null) {
                return new f2(str, list);
            }
            throw new IllegalStateException("Required field 'book_ids' is missing");
        }

        @m80.k
        public final a c(@m80.k String sub_name) {
            kotlin.jvm.internal.g0.p(sub_name, "sub_name");
            this.f101527a = sub_name;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101527a = null;
            this.f101528b = null;
        }

        public a(@m80.k f2 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101527a = source.f101525a;
            this.f101528b = source.f101526b;
        }
    }
}
