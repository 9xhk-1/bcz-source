package x8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class j implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final b f97774d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<j, a> f97775e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @k
    public final List<Integer> f97776a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public final List<Integer> f97777b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @k
    public final List<Integer> f97778c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<j, a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j read(@k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j read(@k ws.i protocol, @k a builder) {
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
                short s11 = a62.f96797c;
                int i11 = 0;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i12 = v42.f96838b;
                            while (i11 < i12) {
                                arrayList.add(Integer.valueOf(protocol.s8()));
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
                            arrayList2.add(Integer.valueOf(protocol.s8()));
                            i11++;
                        }
                        protocol.l8();
                        builder.d(arrayList2);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v44 = protocol.v4();
                    ArrayList arrayList3 = new ArrayList(v44.f96838b);
                    int i14 = v44.f96838b;
                    while (i11 < i14) {
                        arrayList3.add(Integer.valueOf(protocol.s8()));
                        i11++;
                    }
                    protocol.l8();
                    builder.a(arrayList3);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@k ws.i protocol, @k j struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserBetaInfo");
            protocol.Q6("beta_types", 1, (byte) 15);
            protocol.y2((byte) 8, struct.f97776a.size());
            Iterator<Integer> it = struct.f97776a.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("high_level_book_ids", 2, (byte) 15);
            protocol.y2((byte) 8, struct.f97777b.size());
            Iterator<Integer> it2 = struct.f97777b.iterator();
            while (it2.hasNext()) {
                protocol.l5(it2.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("daka_poster_book_ids", 3, (byte) 15);
            protocol.y2((byte) 8, struct.f97778c.size());
            Iterator<Integer> it3 = struct.f97778c.iterator();
            while (it3.hasNext()) {
                protocol.l5(it3.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public j(@k List<Integer> beta_types, @k List<Integer> high_level_book_ids, @k List<Integer> daka_poster_book_ids) {
        g0.p(beta_types, "beta_types");
        g0.p(high_level_book_ids, "high_level_book_ids");
        g0.p(daka_poster_book_ids, "daka_poster_book_ids");
        this.f97776a = beta_types;
        this.f97777b = high_level_book_ids;
        this.f97778c = daka_poster_book_ids;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j e(j jVar, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = jVar.f97776a;
        }
        if ((i11 & 2) != 0) {
            list2 = jVar.f97777b;
        }
        if ((i11 & 4) != 0) {
            list3 = jVar.f97778c;
        }
        return jVar.d(list, list2, list3);
    }

    @k
    public final List<Integer> a() {
        return this.f97776a;
    }

    @k
    public final List<Integer> b() {
        return this.f97777b;
    }

    @k
    public final List<Integer> c() {
        return this.f97778c;
    }

    @k
    public final j d(@k List<Integer> beta_types, @k List<Integer> high_level_book_ids, @k List<Integer> daka_poster_book_ids) {
        g0.p(beta_types, "beta_types");
        g0.p(high_level_book_ids, "high_level_book_ids");
        g0.p(daka_poster_book_ids, "daka_poster_book_ids");
        return new j(beta_types, high_level_book_ids, daka_poster_book_ids);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return g0.g(this.f97776a, jVar.f97776a) && g0.g(this.f97777b, jVar.f97777b) && g0.g(this.f97778c, jVar.f97778c);
    }

    public int hashCode() {
        return (((this.f97776a.hashCode() * 31) + this.f97777b.hashCode()) * 31) + this.f97778c.hashCode();
    }

    @k
    public String toString() {
        return "UserBetaInfo(beta_types=" + this.f97776a + ", high_level_book_ids=" + this.f97777b + ", daka_poster_book_ids=" + this.f97778c + ')';
    }

    @Override // ts.e
    public void write(@k ws.i protocol) {
        g0.p(protocol, "protocol");
        f97775e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserBetaInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBetaInfo.kt\ncom/baicizhan/biz/online/user_assistant_api/UserBetaInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
    public static final class a implements ts.f<j> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public List<Integer> f97779a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public List<Integer> f97780b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public List<Integer> f97781c;

        public a() {
            this.f97779a = null;
            this.f97780b = null;
            this.f97781c = null;
        }

        @k
        public final a a(@k List<Integer> beta_types) {
            g0.p(beta_types, "beta_types");
            this.f97779a = beta_types;
            return this;
        }

        @Override // ts.f
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j build() {
            List<Integer> list = this.f97779a;
            if (list == null) {
                throw new IllegalStateException("Required field 'beta_types' is missing");
            }
            List<Integer> list2 = this.f97780b;
            if (list2 == null) {
                throw new IllegalStateException("Required field 'high_level_book_ids' is missing");
            }
            List<Integer> list3 = this.f97781c;
            if (list3 != null) {
                return new j(list, list2, list3);
            }
            throw new IllegalStateException("Required field 'daka_poster_book_ids' is missing");
        }

        @k
        public final a c(@k List<Integer> daka_poster_book_ids) {
            g0.p(daka_poster_book_ids, "daka_poster_book_ids");
            this.f97781c = daka_poster_book_ids;
            return this;
        }

        @k
        public final a d(@k List<Integer> high_level_book_ids) {
            g0.p(high_level_book_ids, "high_level_book_ids");
            this.f97780b = high_level_book_ids;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f97779a = null;
            this.f97780b = null;
            this.f97781c = null;
        }

        public a(@k j source) {
            g0.p(source, "source");
            this.f97779a = source.f97776a;
            this.f97780b = source.f97777b;
            this.f97781c = source.f97778c;
        }
    }
}
