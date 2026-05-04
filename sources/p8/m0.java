package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class m0 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f79994d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<m0, a> f79995e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79996a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f79997b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<t0> f79998c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<m0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            at.b.a(protocol, b11);
                        } else if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i11 = v42.f96838b;
                            for (int i12 = 0; i12 < i11; i12++) {
                                arrayList.add(t0.f80175d.read(protocol));
                            }
                            protocol.l8();
                            builder.d(arrayList);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.b(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.c(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k m0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("SentenceBuildingStatus");
            protocol.Q6("totalCoin", 1, (byte) 8);
            protocol.l5(struct.f79996a);
            protocol.N2();
            protocol.Q6("spentCoin", 2, (byte) 8);
            protocol.l5(struct.f79997b);
            protocol.N2();
            protocol.Q6("userBuildingLevels", 3, (byte) 15);
            protocol.y2((byte) 12, struct.f79998c.size());
            Iterator<t0> it = struct.f79998c.iterator();
            while (it.hasNext()) {
                t0.f80175d.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public m0(int i11, int i12, @m80.k List<t0> userBuildingLevels) {
        kotlin.jvm.internal.g0.p(userBuildingLevels, "userBuildingLevels");
        this.f79996a = i11;
        this.f79997b = i12;
        this.f79998c = userBuildingLevels;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m0 e(m0 m0Var, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = m0Var.f79996a;
        }
        if ((i13 & 2) != 0) {
            i12 = m0Var.f79997b;
        }
        if ((i13 & 4) != 0) {
            list = m0Var.f79998c;
        }
        return m0Var.d(i11, i12, list);
    }

    public final int a() {
        return this.f79996a;
    }

    public final int b() {
        return this.f79997b;
    }

    @m80.k
    public final List<t0> c() {
        return this.f79998c;
    }

    @m80.k
    public final m0 d(int i11, int i12, @m80.k List<t0> userBuildingLevels) {
        kotlin.jvm.internal.g0.p(userBuildingLevels, "userBuildingLevels");
        return new m0(i11, i12, userBuildingLevels);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f79996a == m0Var.f79996a && this.f79997b == m0Var.f79997b && kotlin.jvm.internal.g0.g(this.f79998c, m0Var.f79998c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f79996a) * 31) + Integer.hashCode(this.f79997b)) * 31) + this.f79998c.hashCode();
    }

    @m80.k
    public String toString() {
        return "SentenceBuildingStatus(totalCoin=" + this.f79996a + ", spentCoin=" + this.f79997b + ", userBuildingLevels=" + this.f79998c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79995e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSentenceBuildingStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceBuildingStatus.kt\ncom/baicizhan/biz/online/game_api/SentenceBuildingStatus$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
    public static final class a implements ts.f<m0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79999a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f80000b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<t0> f80001c;

        public a() {
            this.f79999a = null;
            this.f80000b = null;
            this.f80001c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m0 build() {
            Integer num = this.f79999a;
            if (num == null) {
                throw new IllegalStateException("Required field 'totalCoin' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f80000b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'spentCoin' is missing");
            }
            int intValue2 = num2.intValue();
            List<t0> list = this.f80001c;
            if (list != null) {
                return new m0(intValue, intValue2, list);
            }
            throw new IllegalStateException("Required field 'userBuildingLevels' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f80000b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f79999a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.k List<t0> userBuildingLevels) {
            kotlin.jvm.internal.g0.p(userBuildingLevels, "userBuildingLevels");
            this.f80001c = userBuildingLevels;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79999a = null;
            this.f80000b = null;
            this.f80001c = null;
        }

        public a(@m80.k m0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79999a = Integer.valueOf(source.f79996a);
            this.f80000b = Integer.valueOf(source.f79997b);
            this.f80001c = source.f79998c;
        }
    }
}
