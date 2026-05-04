package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final c f101108e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<a, b> f101109f = new C1385a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101110a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<String> f101111b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<String> f101112c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101113d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: z8.a$a, reason: collision with other inner class name */
    public static final class C1385a implements ts.a<a, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@m80.k ws.i protocol, @m80.k b builder) {
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
                    int i11 = 0;
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                at.b.a(protocol, b11);
                            } else if (b11 == 11) {
                                builder.c(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i12 = v42.f96838b;
                            while (i11 < i12) {
                                arrayList.add(protocol.readString());
                                i11++;
                            }
                            protocol.l8();
                            builder.d(arrayList);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 15) {
                        ws.f v43 = protocol.v4();
                        ArrayList arrayList2 = new ArrayList(v43.f96838b);
                        int i13 = v43.f96838b;
                        while (i11 < i13) {
                            arrayList2.add(protocol.readString());
                            i11++;
                        }
                        protocol.l8();
                        builder.b(arrayList2);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.e(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k a struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("BookLevelInfo");
            protocol.Q6("role_id", 1, (byte) 8);
            protocol.l5(struct.f101110a);
            protocol.N2();
            protocol.Q6("cate_ids", 2, (byte) 15);
            protocol.y2((byte) 11, struct.f101111b.size());
            Iterator<String> it = struct.f101111b.iterator();
            while (it.hasNext()) {
                protocol.p1(it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("next_cates", 3, (byte) 15);
            protocol.y2((byte) 11, struct.f101112c.size());
            Iterator<String> it2 = struct.f101112c.iterator();
            while (it2.hasNext()) {
                protocol.p1(it2.next());
            }
            protocol.i5();
            protocol.N2();
            if (struct.f101113d != null) {
                protocol.Q6(ma.b.f72942s, 4, (byte) 11);
                protocol.p1(struct.f101113d);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public c() {
        }
    }

    public a(int i11, @m80.k List<String> cate_ids, @m80.k List<String> next_cates, @m80.l String str) {
        kotlin.jvm.internal.g0.p(cate_ids, "cate_ids");
        kotlin.jvm.internal.g0.p(next_cates, "next_cates");
        this.f101110a = i11;
        this.f101111b = cate_ids;
        this.f101112c = next_cates;
        this.f101113d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a f(a aVar, int i11, List list, List list2, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = aVar.f101110a;
        }
        if ((i12 & 2) != 0) {
            list = aVar.f101111b;
        }
        if ((i12 & 4) != 0) {
            list2 = aVar.f101112c;
        }
        if ((i12 & 8) != 0) {
            str = aVar.f101113d;
        }
        return aVar.e(i11, list, list2, str);
    }

    public final int a() {
        return this.f101110a;
    }

    @m80.k
    public final List<String> b() {
        return this.f101111b;
    }

    @m80.k
    public final List<String> c() {
        return this.f101112c;
    }

    @m80.l
    public final String d() {
        return this.f101113d;
    }

    @m80.k
    public final a e(int i11, @m80.k List<String> cate_ids, @m80.k List<String> next_cates, @m80.l String str) {
        kotlin.jvm.internal.g0.p(cate_ids, "cate_ids");
        kotlin.jvm.internal.g0.p(next_cates, "next_cates");
        return new a(i11, cate_ids, next_cates, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f101110a == aVar.f101110a && kotlin.jvm.internal.g0.g(this.f101111b, aVar.f101111b) && kotlin.jvm.internal.g0.g(this.f101112c, aVar.f101112c) && kotlin.jvm.internal.g0.g(this.f101113d, aVar.f101113d);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f101110a) * 31) + this.f101111b.hashCode()) * 31) + this.f101112c.hashCode()) * 31;
        String str = this.f101113d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "BookLevelInfo(role_id=" + this.f101110a + ", cate_ids=" + this.f101111b + ", next_cates=" + this.f101112c + ", cate_name=" + this.f101113d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101109f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nBookLevelInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookLevelInfo.kt\ncom/baicizhan/biz/online/user_study_api/BookLevelInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    public static final class b implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101114a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<String> f101115b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<String> f101116c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f101117d;

        public b() {
            this.f101114a = null;
            this.f101115b = null;
            this.f101116c = null;
            this.f101117d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a build() {
            Integer num = this.f101114a;
            if (num == null) {
                throw new IllegalStateException("Required field 'role_id' is missing");
            }
            int intValue = num.intValue();
            List<String> list = this.f101115b;
            if (list == null) {
                throw new IllegalStateException("Required field 'cate_ids' is missing");
            }
            List<String> list2 = this.f101116c;
            if (list2 != null) {
                return new a(intValue, list, list2, this.f101117d);
            }
            throw new IllegalStateException("Required field 'next_cates' is missing");
        }

        @m80.k
        public final b b(@m80.k List<String> cate_ids) {
            kotlin.jvm.internal.g0.p(cate_ids, "cate_ids");
            this.f101115b = cate_ids;
            return this;
        }

        @m80.k
        public final b c(@m80.l String str) {
            this.f101117d = str;
            return this;
        }

        @m80.k
        public final b d(@m80.k List<String> next_cates) {
            kotlin.jvm.internal.g0.p(next_cates, "next_cates");
            this.f101116c = next_cates;
            return this;
        }

        @m80.k
        public final b e(int i11) {
            this.f101114a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101114a = null;
            this.f101115b = null;
            this.f101116c = null;
            this.f101117d = null;
        }

        public b(@m80.k a source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101114a = Integer.valueOf(source.f101110a);
            this.f101115b = source.f101111b;
            this.f101116c = source.f101112c;
            this.f101117d = source.f101113d;
        }
    }
}
