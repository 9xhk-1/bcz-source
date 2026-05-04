package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class o0 implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f80026g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<o0, a> f80027h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f80028a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final m0 f80029b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f80030c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final i1 f80031d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<Integer> f80032e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<Integer> f80033f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<o0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(m0.f79995e.read(protocol));
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(i1.f79927g.read(protocol));
                            break;
                        }
                    case 5:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i12 = v42.f96838b;
                            while (i11 < i12) {
                                arrayList.add(Integer.valueOf(protocol.s8()));
                                i11++;
                            }
                            protocol.l8();
                            builder.d(arrayList);
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
                                arrayList2.add(Integer.valueOf(protocol.s8()));
                                i11++;
                            }
                            protocol.l8();
                            builder.e(arrayList2);
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
        public void write(@m80.k ws.i protocol, @m80.k o0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("SentenceCurrentInfo");
            protocol.Q6("skuId", 1, (byte) 8);
            protocol.l5(struct.f80028a);
            protocol.N2();
            protocol.Q6("buildingStatus", 2, (byte) 12);
            m0.f79995e.write(protocol, struct.f80029b);
            protocol.N2();
            protocol.Q6("latestContentVersion", 3, (byte) 11);
            protocol.p1(struct.f80030c);
            protocol.N2();
            protocol.Q6("energy_info", 4, (byte) 12);
            i1.f79927g.write(protocol, struct.f80031d);
            protocol.N2();
            if (struct.f80032e != null) {
                protocol.Q6("finishedLessonIds", 5, (byte) 15);
                protocol.y2((byte) 8, struct.f80032e.size());
                Iterator<Integer> it = struct.f80032e.iterator();
                while (it.hasNext()) {
                    protocol.l5(it.next().intValue());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f80033f != null) {
                protocol.Q6("hideLessonIds", 6, (byte) 15);
                protocol.y2((byte) 8, struct.f80033f.size());
                Iterator<Integer> it2 = struct.f80033f.iterator();
                while (it2.hasNext()) {
                    protocol.l5(it2.next().intValue());
                }
                protocol.i5();
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public o0(int i11, @m80.k m0 buildingStatus, @m80.k String latestContentVersion, @m80.k i1 energy_info, @m80.l List<Integer> list, @m80.l List<Integer> list2) {
        kotlin.jvm.internal.g0.p(buildingStatus, "buildingStatus");
        kotlin.jvm.internal.g0.p(latestContentVersion, "latestContentVersion");
        kotlin.jvm.internal.g0.p(energy_info, "energy_info");
        this.f80028a = i11;
        this.f80029b = buildingStatus;
        this.f80030c = latestContentVersion;
        this.f80031d = energy_info;
        this.f80032e = list;
        this.f80033f = list2;
    }

    public static /* synthetic */ o0 h(o0 o0Var, int i11, m0 m0Var, String str, i1 i1Var, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = o0Var.f80028a;
        }
        if ((i12 & 2) != 0) {
            m0Var = o0Var.f80029b;
        }
        if ((i12 & 4) != 0) {
            str = o0Var.f80030c;
        }
        if ((i12 & 8) != 0) {
            i1Var = o0Var.f80031d;
        }
        if ((i12 & 16) != 0) {
            list = o0Var.f80032e;
        }
        if ((i12 & 32) != 0) {
            list2 = o0Var.f80033f;
        }
        List list3 = list;
        List list4 = list2;
        return o0Var.g(i11, m0Var, str, i1Var, list3, list4);
    }

    public final int a() {
        return this.f80028a;
    }

    @m80.k
    public final m0 b() {
        return this.f80029b;
    }

    @m80.k
    public final String c() {
        return this.f80030c;
    }

    @m80.k
    public final i1 d() {
        return this.f80031d;
    }

    @m80.l
    public final List<Integer> e() {
        return this.f80032e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f80028a == o0Var.f80028a && kotlin.jvm.internal.g0.g(this.f80029b, o0Var.f80029b) && kotlin.jvm.internal.g0.g(this.f80030c, o0Var.f80030c) && kotlin.jvm.internal.g0.g(this.f80031d, o0Var.f80031d) && kotlin.jvm.internal.g0.g(this.f80032e, o0Var.f80032e) && kotlin.jvm.internal.g0.g(this.f80033f, o0Var.f80033f);
    }

    @m80.l
    public final List<Integer> f() {
        return this.f80033f;
    }

    @m80.k
    public final o0 g(int i11, @m80.k m0 buildingStatus, @m80.k String latestContentVersion, @m80.k i1 energy_info, @m80.l List<Integer> list, @m80.l List<Integer> list2) {
        kotlin.jvm.internal.g0.p(buildingStatus, "buildingStatus");
        kotlin.jvm.internal.g0.p(latestContentVersion, "latestContentVersion");
        kotlin.jvm.internal.g0.p(energy_info, "energy_info");
        return new o0(i11, buildingStatus, latestContentVersion, energy_info, list, list2);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f80028a) * 31) + this.f80029b.hashCode()) * 31) + this.f80030c.hashCode()) * 31) + this.f80031d.hashCode()) * 31;
        List<Integer> list = this.f80032e;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.f80033f;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "SentenceCurrentInfo(skuId=" + this.f80028a + ", buildingStatus=" + this.f80029b + ", latestContentVersion=" + this.f80030c + ", energy_info=" + this.f80031d + ", finishedLessonIds=" + this.f80032e + ", hideLessonIds=" + this.f80033f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80027h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSentenceCurrentInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceCurrentInfo.kt\ncom/baicizhan/biz/online/game_api/SentenceCurrentInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,253:1\n1#2:254\n*E\n"})
    public static final class a implements ts.f<o0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f80034a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public m0 f80035b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f80036c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public i1 f80037d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public List<Integer> f80038e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public List<Integer> f80039f;

        public a() {
            this.f80034a = null;
            this.f80035b = null;
            this.f80036c = null;
            this.f80037d = null;
            this.f80038e = null;
            this.f80039f = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o0 build() {
            Integer num = this.f80034a;
            if (num == null) {
                throw new IllegalStateException("Required field 'skuId' is missing");
            }
            int intValue = num.intValue();
            m0 m0Var = this.f80035b;
            if (m0Var == null) {
                throw new IllegalStateException("Required field 'buildingStatus' is missing");
            }
            String str = this.f80036c;
            if (str == null) {
                throw new IllegalStateException("Required field 'latestContentVersion' is missing");
            }
            i1 i1Var = this.f80037d;
            if (i1Var != null) {
                return new o0(intValue, m0Var, str, i1Var, this.f80038e, this.f80039f);
            }
            throw new IllegalStateException("Required field 'energy_info' is missing");
        }

        @m80.k
        public final a b(@m80.k m0 buildingStatus) {
            kotlin.jvm.internal.g0.p(buildingStatus, "buildingStatus");
            this.f80035b = buildingStatus;
            return this;
        }

        @m80.k
        public final a c(@m80.k i1 energy_info) {
            kotlin.jvm.internal.g0.p(energy_info, "energy_info");
            this.f80037d = energy_info;
            return this;
        }

        @m80.k
        public final a d(@m80.l List<Integer> list) {
            this.f80038e = list;
            return this;
        }

        @m80.k
        public final a e(@m80.l List<Integer> list) {
            this.f80039f = list;
            return this;
        }

        @m80.k
        public final a f(@m80.k String latestContentVersion) {
            kotlin.jvm.internal.g0.p(latestContentVersion, "latestContentVersion");
            this.f80036c = latestContentVersion;
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f80034a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80034a = null;
            this.f80035b = null;
            this.f80036c = null;
            this.f80037d = null;
            this.f80038e = null;
            this.f80039f = null;
        }

        public a(@m80.k o0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80034a = Integer.valueOf(source.f80028a);
            this.f80035b = source.f80029b;
            this.f80036c = source.f80030c;
            this.f80037d = source.f80031d;
            this.f80038e = source.f80032e;
            this.f80039f = source.f80033f;
        }
    }
}
