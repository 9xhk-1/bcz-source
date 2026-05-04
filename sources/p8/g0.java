package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g0 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f79824d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<g0, a> f79825e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79826a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f79827b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<p8.c> f79828c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<g0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                arrayList.add(p8.c.f79705d.read(protocol));
                            }
                            protocol.l8();
                            builder.a(arrayList);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.d(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k g0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("RoundCombo");
            protocol.Q6("current_combo", 1, (byte) 8);
            protocol.l5(struct.f79826a);
            protocol.N2();
            protocol.Q6("max_combo", 2, (byte) 8);
            protocol.l5(struct.f79827b);
            protocol.N2();
            protocol.Q6("award_combos", 3, (byte) 15);
            protocol.y2((byte) 12, struct.f79828c.size());
            Iterator<p8.c> it = struct.f79828c.iterator();
            while (it.hasNext()) {
                p8.c.f79705d.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public g0(int i11, int i12, @m80.k List<p8.c> award_combos) {
        kotlin.jvm.internal.g0.p(award_combos, "award_combos");
        this.f79826a = i11;
        this.f79827b = i12;
        this.f79828c = award_combos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g0 e(g0 g0Var, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = g0Var.f79826a;
        }
        if ((i13 & 2) != 0) {
            i12 = g0Var.f79827b;
        }
        if ((i13 & 4) != 0) {
            list = g0Var.f79828c;
        }
        return g0Var.d(i11, i12, list);
    }

    public final int a() {
        return this.f79826a;
    }

    public final int b() {
        return this.f79827b;
    }

    @m80.k
    public final List<p8.c> c() {
        return this.f79828c;
    }

    @m80.k
    public final g0 d(int i11, int i12, @m80.k List<p8.c> award_combos) {
        kotlin.jvm.internal.g0.p(award_combos, "award_combos");
        return new g0(i11, i12, award_combos);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f79826a == g0Var.f79826a && this.f79827b == g0Var.f79827b && kotlin.jvm.internal.g0.g(this.f79828c, g0Var.f79828c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f79826a) * 31) + Integer.hashCode(this.f79827b)) * 31) + this.f79828c.hashCode();
    }

    @m80.k
    public String toString() {
        return "RoundCombo(current_combo=" + this.f79826a + ", max_combo=" + this.f79827b + ", award_combos=" + this.f79828c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79825e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nRoundCombo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundCombo.kt\ncom/baicizhan/biz/online/game_api/RoundCombo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
    public static final class a implements ts.f<g0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79829a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f79830b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<p8.c> f79831c;

        public a() {
            this.f79829a = null;
            this.f79830b = null;
            this.f79831c = null;
        }

        @m80.k
        public final a a(@m80.k List<p8.c> award_combos) {
            kotlin.jvm.internal.g0.p(award_combos, "award_combos");
            this.f79831c = award_combos;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g0 build() {
            Integer num = this.f79829a;
            if (num == null) {
                throw new IllegalStateException("Required field 'current_combo' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f79830b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'max_combo' is missing");
            }
            int intValue2 = num2.intValue();
            List<p8.c> list = this.f79831c;
            if (list != null) {
                return new g0(intValue, intValue2, list);
            }
            throw new IllegalStateException("Required field 'award_combos' is missing");
        }

        @m80.k
        public final a c(int i11) {
            this.f79829a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f79830b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79829a = null;
            this.f79830b = null;
            this.f79831c = null;
        }

        public a(@m80.k g0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79829a = Integer.valueOf(source.f79826a);
            this.f79830b = Integer.valueOf(source.f79827b);
            this.f79831c = source.f79828c;
        }
    }
}
