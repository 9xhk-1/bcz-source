package u8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f91906d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<d, a> f91907e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f91908a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f91909b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f91910c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<d, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (s11 != 3) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 11) {
                            builder.a(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k d struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("EntitlementMallGoodsInfo");
            protocol.Q6("item_id", 1, (byte) 8);
            protocol.l5(struct.f91908a);
            protocol.N2();
            protocol.Q6("sub_item_id", 2, (byte) 8);
            protocol.l5(struct.f91909b);
            protocol.N2();
            protocol.Q6("app_store_id", 3, (byte) 11);
            protocol.p1(struct.f91910c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public d(int i11, int i12, @m80.k String app_store_id) {
        g0.p(app_store_id, "app_store_id");
        this.f91908a = i11;
        this.f91909b = i12;
        this.f91910c = app_store_id;
    }

    public static /* synthetic */ d e(d dVar, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = dVar.f91908a;
        }
        if ((i13 & 2) != 0) {
            i12 = dVar.f91909b;
        }
        if ((i13 & 4) != 0) {
            str = dVar.f91910c;
        }
        return dVar.d(i11, i12, str);
    }

    public final int a() {
        return this.f91908a;
    }

    public final int b() {
        return this.f91909b;
    }

    @m80.k
    public final String c() {
        return this.f91910c;
    }

    @m80.k
    public final d d(int i11, int i12, @m80.k String app_store_id) {
        g0.p(app_store_id, "app_store_id");
        return new d(i11, i12, app_store_id);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f91908a == dVar.f91908a && this.f91909b == dVar.f91909b && g0.g(this.f91910c, dVar.f91910c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f91908a) * 31) + Integer.hashCode(this.f91909b)) * 31) + this.f91910c.hashCode();
    }

    @m80.k
    public String toString() {
        return "EntitlementMallGoodsInfo(item_id=" + this.f91908a + ", sub_item_id=" + this.f91909b + ", app_store_id=" + this.f91910c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f91907e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nEntitlementMallGoodsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntitlementMallGoodsInfo.kt\ncom/baicizhan/biz/online/strategy_api/EntitlementMallGoodsInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
    public static final class a implements ts.f<d> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f91911a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f91912b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f91913c;

        public a() {
            this.f91911a = null;
            this.f91912b = null;
            this.f91913c = null;
        }

        @m80.k
        public final a a(@m80.k String app_store_id) {
            g0.p(app_store_id, "app_store_id");
            this.f91913c = app_store_id;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d build() {
            Integer num = this.f91911a;
            if (num == null) {
                throw new IllegalStateException("Required field 'item_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f91912b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'sub_item_id' is missing");
            }
            int intValue2 = num2.intValue();
            String str = this.f91913c;
            if (str != null) {
                return new d(intValue, intValue2, str);
            }
            throw new IllegalStateException("Required field 'app_store_id' is missing");
        }

        @m80.k
        public final a c(int i11) {
            this.f91911a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f91912b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f91911a = null;
            this.f91912b = null;
            this.f91913c = null;
        }

        public a(@m80.k d source) {
            g0.p(source, "source");
            this.f91911a = Integer.valueOf(source.f91908a);
            this.f91912b = Integer.valueOf(source.f91909b);
            this.f91913c = source.f91910c;
        }
    }
}
