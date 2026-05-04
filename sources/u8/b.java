package u8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final C1228b f91892c = new C1228b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<b, a> f91893d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f91894a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f91895b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: u8.b$b, reason: collision with other inner class name */
    public static final class C1228b {
        public /* synthetic */ C1228b(v vVar) {
            this();
        }

        public C1228b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<b, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol, @m80.k a builder) {
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
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 8) {
                        builder.c(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.a(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k b struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("EnergyAdInfo");
            protocol.Q6("add_energy", 1, (byte) 8);
            protocol.l5(struct.f91894a);
            protocol.N2();
            protocol.Q6("remain_count", 2, (byte) 8);
            protocol.l5(struct.f91895b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public b(int i11, int i12) {
        this.f91894a = i11;
        this.f91895b = i12;
    }

    public static /* synthetic */ b d(b bVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = bVar.f91894a;
        }
        if ((i13 & 2) != 0) {
            i12 = bVar.f91895b;
        }
        return bVar.c(i11, i12);
    }

    public final int a() {
        return this.f91894a;
    }

    public final int b() {
        return this.f91895b;
    }

    @m80.k
    public final b c(int i11, int i12) {
        return new b(i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f91894a == bVar.f91894a && this.f91895b == bVar.f91895b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f91894a) * 31) + Integer.hashCode(this.f91895b);
    }

    @m80.k
    public String toString() {
        return "EnergyAdInfo(add_energy=" + this.f91894a + ", remain_count=" + this.f91895b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f91893d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nEnergyAdInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnergyAdInfo.kt\ncom/baicizhan/biz/online/strategy_api/EnergyAdInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
    public static final class a implements ts.f<b> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f91896a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f91897b;

        public a() {
            this.f91896a = null;
            this.f91897b = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f91896a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b build() {
            Integer num = this.f91896a;
            if (num == null) {
                throw new IllegalStateException("Required field 'add_energy' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f91897b;
            if (num2 != null) {
                return new b(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'remain_count' is missing");
        }

        @m80.k
        public final a c(int i11) {
            this.f91897b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f91896a = null;
            this.f91897b = null;
        }

        public a(@m80.k b source) {
            g0.p(source, "source");
            this.f91896a = Integer.valueOf(source.f91894a);
            this.f91897b = Integer.valueOf(source.f91895b);
        }
    }
}
