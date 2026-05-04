package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e0 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f79770d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<e0, a> f79771e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<Integer> f79772a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final long f79773b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<i> f79774c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<e0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            at.b.a(protocol, b11);
                        } else if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i12 = v42.f96838b;
                            while (i11 < i12) {
                                arrayList.add(i.f79907d.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.b(arrayList);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 10) {
                        builder.d(protocol.T1());
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
                    builder.c(arrayList2);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k e0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("RoadmapInfo");
            protocol.Q6("topic_ids", 1, (byte) 15);
            protocol.y2((byte) 8, struct.f79772a.size());
            Iterator<Integer> it = struct.f79772a.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("version", 2, (byte) 10);
            protocol.q7(struct.f79773b);
            protocol.N2();
            if (struct.f79774c != null) {
                protocol.Q6("cake_modules", 3, (byte) 15);
                protocol.y2((byte) 12, struct.f79774c.size());
                Iterator<i> it2 = struct.f79774c.iterator();
                while (it2.hasNext()) {
                    i.f79907d.write(protocol, it2.next());
                }
                protocol.i5();
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public e0(@m80.k List<Integer> topic_ids, long j11, @m80.l List<i> list) {
        kotlin.jvm.internal.g0.p(topic_ids, "topic_ids");
        this.f79772a = topic_ids;
        this.f79773b = j11;
        this.f79774c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e0 e(e0 e0Var, List list, long j11, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = e0Var.f79772a;
        }
        if ((i11 & 2) != 0) {
            j11 = e0Var.f79773b;
        }
        if ((i11 & 4) != 0) {
            list2 = e0Var.f79774c;
        }
        return e0Var.d(list, j11, list2);
    }

    @m80.k
    public final List<Integer> a() {
        return this.f79772a;
    }

    public final long b() {
        return this.f79773b;
    }

    @m80.l
    public final List<i> c() {
        return this.f79774c;
    }

    @m80.k
    public final e0 d(@m80.k List<Integer> topic_ids, long j11, @m80.l List<i> list) {
        kotlin.jvm.internal.g0.p(topic_ids, "topic_ids");
        return new e0(topic_ids, j11, list);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.g0.g(this.f79772a, e0Var.f79772a) && this.f79773b == e0Var.f79773b && kotlin.jvm.internal.g0.g(this.f79774c, e0Var.f79774c);
    }

    public int hashCode() {
        int hashCode = ((this.f79772a.hashCode() * 31) + Long.hashCode(this.f79773b)) * 31;
        List<i> list = this.f79774c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @m80.k
    public String toString() {
        return "RoadmapInfo(topic_ids=" + this.f79772a + ", version=" + this.f79773b + ", cake_modules=" + this.f79774c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79771e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nRoadmapInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoadmapInfo.kt\ncom/baicizhan/biz/online/game_api/RoadmapInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
    public static final class a implements ts.f<e0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<Integer> f79775a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Long f79776b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<i> f79777c;

        public a() {
            this.f79775a = null;
            this.f79776b = null;
            this.f79777c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e0 build() {
            List<Integer> list = this.f79775a;
            if (list == null) {
                throw new IllegalStateException("Required field 'topic_ids' is missing");
            }
            Long l11 = this.f79776b;
            if (l11 != null) {
                return new e0(list, l11.longValue(), this.f79777c);
            }
            throw new IllegalStateException("Required field 'version' is missing");
        }

        @m80.k
        public final a b(@m80.l List<i> list) {
            this.f79777c = list;
            return this;
        }

        @m80.k
        public final a c(@m80.k List<Integer> topic_ids) {
            kotlin.jvm.internal.g0.p(topic_ids, "topic_ids");
            this.f79775a = topic_ids;
            return this;
        }

        @m80.k
        public final a d(long j11) {
            this.f79776b = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79775a = null;
            this.f79776b = null;
            this.f79777c = null;
        }

        public a(@m80.k e0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79775a = source.f79772a;
            this.f79776b = Long.valueOf(source.f79773b);
            this.f79777c = source.f79774c;
        }
    }
}
