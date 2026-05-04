package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k1 implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f101709c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<k1, a> f101710d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101711a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<l1> f101712b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<k1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            arrayList.add(l1.f101744f.read(protocol));
                        }
                        protocol.l8();
                        builder.b(arrayList);
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
        public void write(@m80.k ws.i protocol, @m80.k k1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserDakaBaseInfo");
            protocol.Q6("total_daka_days", 1, (byte) 8);
            protocol.l5(struct.f101711a);
            protocol.N2();
            protocol.Q6("daka_dates", 2, (byte) 15);
            protocol.y2((byte) 12, struct.f101712b.size());
            Iterator<l1> it = struct.f101712b.iterator();
            while (it.hasNext()) {
                l1.f101744f.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public k1(int i11, @m80.k List<l1> daka_dates) {
        kotlin.jvm.internal.g0.p(daka_dates, "daka_dates");
        this.f101711a = i11;
        this.f101712b = daka_dates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k1 d(k1 k1Var, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = k1Var.f101711a;
        }
        if ((i12 & 2) != 0) {
            list = k1Var.f101712b;
        }
        return k1Var.c(i11, list);
    }

    public final int a() {
        return this.f101711a;
    }

    @m80.k
    public final List<l1> b() {
        return this.f101712b;
    }

    @m80.k
    public final k1 c(int i11, @m80.k List<l1> daka_dates) {
        kotlin.jvm.internal.g0.p(daka_dates, "daka_dates");
        return new k1(i11, daka_dates);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return this.f101711a == k1Var.f101711a && kotlin.jvm.internal.g0.g(this.f101712b, k1Var.f101712b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f101711a) * 31) + this.f101712b.hashCode();
    }

    @m80.k
    public String toString() {
        return "UserDakaBaseInfo(total_daka_days=" + this.f101711a + ", daka_dates=" + this.f101712b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101710d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserDakaBaseInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserDakaBaseInfo.kt\ncom/baicizhan/biz/online/user_study_api/UserDakaBaseInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
    public static final class a implements ts.f<k1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101713a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<l1> f101714b;

        public a() {
            this.f101713a = null;
            this.f101714b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k1 build() {
            Integer num = this.f101713a;
            if (num == null) {
                throw new IllegalStateException("Required field 'total_daka_days' is missing");
            }
            int intValue = num.intValue();
            List<l1> list = this.f101714b;
            if (list != null) {
                return new k1(intValue, list);
            }
            throw new IllegalStateException("Required field 'daka_dates' is missing");
        }

        @m80.k
        public final a b(@m80.k List<l1> daka_dates) {
            kotlin.jvm.internal.g0.p(daka_dates, "daka_dates");
            this.f101714b = daka_dates;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f101713a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101713a = null;
            this.f101714b = null;
        }

        public a(@m80.k k1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101713a = Integer.valueOf(source.f101711a);
            this.f101714b = source.f101712b;
        }
    }
}
