package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b0 implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f79676e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<b0, a> f79677f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79678a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f79679b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final l f79680c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<h0> f79681d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<b0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (s11 != 3) {
                            if (s11 != 4) {
                                at.b.a(protocol, b11);
                            } else if (b11 == 15) {
                                ws.f v42 = protocol.v4();
                                ArrayList arrayList = new ArrayList(v42.f96838b);
                                int i11 = v42.f96838b;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    arrayList.add(h0.f79845h.read(protocol));
                                }
                                protocol.l8();
                                builder.d(arrayList);
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 12) {
                            builder.b(l.f79973d.read(protocol));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.c(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k b0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("PlanProgressInfo");
            protocol.Q6("target_round", 1, (byte) 8);
            protocol.l5(struct.f79678a);
            protocol.N2();
            protocol.Q6("finish_round", 2, (byte) 8);
            protocol.l5(struct.f79679b);
            protocol.N2();
            protocol.Q6("compass_info", 3, (byte) 12);
            l.f79973d.write(protocol, struct.f79680c);
            protocol.N2();
            protocol.Q6("rounds", 4, (byte) 15);
            protocol.y2((byte) 12, struct.f79681d.size());
            Iterator<h0> it = struct.f79681d.iterator();
            while (it.hasNext()) {
                h0.f79845h.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public b0(int i11, int i12, @m80.k l compass_info, @m80.k List<h0> rounds) {
        kotlin.jvm.internal.g0.p(compass_info, "compass_info");
        kotlin.jvm.internal.g0.p(rounds, "rounds");
        this.f79678a = i11;
        this.f79679b = i12;
        this.f79680c = compass_info;
        this.f79681d = rounds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b0 f(b0 b0Var, int i11, int i12, l lVar, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = b0Var.f79678a;
        }
        if ((i13 & 2) != 0) {
            i12 = b0Var.f79679b;
        }
        if ((i13 & 4) != 0) {
            lVar = b0Var.f79680c;
        }
        if ((i13 & 8) != 0) {
            list = b0Var.f79681d;
        }
        return b0Var.e(i11, i12, lVar, list);
    }

    public final int a() {
        return this.f79678a;
    }

    public final int b() {
        return this.f79679b;
    }

    @m80.k
    public final l c() {
        return this.f79680c;
    }

    @m80.k
    public final List<h0> d() {
        return this.f79681d;
    }

    @m80.k
    public final b0 e(int i11, int i12, @m80.k l compass_info, @m80.k List<h0> rounds) {
        kotlin.jvm.internal.g0.p(compass_info, "compass_info");
        kotlin.jvm.internal.g0.p(rounds, "rounds");
        return new b0(i11, i12, compass_info, rounds);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f79678a == b0Var.f79678a && this.f79679b == b0Var.f79679b && kotlin.jvm.internal.g0.g(this.f79680c, b0Var.f79680c) && kotlin.jvm.internal.g0.g(this.f79681d, b0Var.f79681d);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f79678a) * 31) + Integer.hashCode(this.f79679b)) * 31) + this.f79680c.hashCode()) * 31) + this.f79681d.hashCode();
    }

    @m80.k
    public String toString() {
        return "PlanProgressInfo(target_round=" + this.f79678a + ", finish_round=" + this.f79679b + ", compass_info=" + this.f79680c + ", rounds=" + this.f79681d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79677f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nPlanProgressInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanProgressInfo.kt\ncom/baicizhan/biz/online/game_api/PlanProgressInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
    public static final class a implements ts.f<b0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79682a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f79683b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public l f79684c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public List<h0> f79685d;

        public a() {
            this.f79682a = null;
            this.f79683b = null;
            this.f79684c = null;
            this.f79685d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b0 build() {
            Integer num = this.f79682a;
            if (num == null) {
                throw new IllegalStateException("Required field 'target_round' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f79683b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'finish_round' is missing");
            }
            int intValue2 = num2.intValue();
            l lVar = this.f79684c;
            if (lVar == null) {
                throw new IllegalStateException("Required field 'compass_info' is missing");
            }
            List<h0> list = this.f79685d;
            if (list != null) {
                return new b0(intValue, intValue2, lVar, list);
            }
            throw new IllegalStateException("Required field 'rounds' is missing");
        }

        @m80.k
        public final a b(@m80.k l compass_info) {
            kotlin.jvm.internal.g0.p(compass_info, "compass_info");
            this.f79684c = compass_info;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f79683b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.k List<h0> rounds) {
            kotlin.jvm.internal.g0.p(rounds, "rounds");
            this.f79685d = rounds;
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f79682a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79682a = null;
            this.f79683b = null;
            this.f79684c = null;
            this.f79685d = null;
        }

        public a(@m80.k b0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79682a = Integer.valueOf(source.f79678a);
            this.f79683b = Integer.valueOf(source.f79679b);
            this.f79684c = source.f79680c;
            this.f79685d = source.f79681d;
        }
    }
}
