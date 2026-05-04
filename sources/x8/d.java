package x8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final b f97712d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<d, a> f97713e = new c();

    /* renamed from: a, reason: collision with root package name */
    @l
    @w00.g
    public final Integer f97714a;

    /* renamed from: b, reason: collision with root package name */
    @l
    @w00.g
    public final String f97715b;

    /* renamed from: c, reason: collision with root package name */
    @l
    @w00.g
    public final String f97716c;

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
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d read(@k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d read(@k ws.i protocol, @k a builder) {
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
                            builder.c(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.b(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.d(Integer.valueOf(protocol.s8()));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@k ws.i protocol, @k d struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("HarmonyPayInfo");
            if (struct.f97714a != null) {
                protocol.Q6("type", 1, (byte) 8);
                protocol.l5(struct.f97714a.intValue());
                protocol.N2();
            }
            if (struct.f97715b != null) {
                protocol.Q6("jws_purchase_order", 2, (byte) 11);
                protocol.p1(struct.f97715b);
                protocol.N2();
            }
            if (struct.f97716c != null) {
                protocol.Q6("jws_subscription_status", 3, (byte) 11);
                protocol.p1(struct.f97716c);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public d(@l Integer num, @l String str, @l String str2) {
        this.f97714a = num;
        this.f97715b = str;
        this.f97716c = str2;
    }

    public static /* synthetic */ d e(d dVar, Integer num, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = dVar.f97714a;
        }
        if ((i11 & 2) != 0) {
            str = dVar.f97715b;
        }
        if ((i11 & 4) != 0) {
            str2 = dVar.f97716c;
        }
        return dVar.d(num, str, str2);
    }

    @l
    public final Integer a() {
        return this.f97714a;
    }

    @l
    public final String b() {
        return this.f97715b;
    }

    @l
    public final String c() {
        return this.f97716c;
    }

    @k
    public final d d(@l Integer num, @l String str, @l String str2) {
        return new d(num, str, str2);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return g0.g(this.f97714a, dVar.f97714a) && g0.g(this.f97715b, dVar.f97715b) && g0.g(this.f97716c, dVar.f97716c);
    }

    public int hashCode() {
        Integer num = this.f97714a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f97715b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f97716c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "HarmonyPayInfo(type=" + this.f97714a + ", jws_purchase_order=" + this.f97715b + ", jws_subscription_status=" + this.f97716c + ')';
    }

    @Override // ts.e
    public void write(@k ws.i protocol) {
        g0.p(protocol, "protocol");
        f97713e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHarmonyPayInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HarmonyPayInfo.kt\ncom/baicizhan/biz/online/user_assistant_api/HarmonyPayInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
    public static final class a implements ts.f<d> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Integer f97717a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f97718b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f97719c;

        public a() {
            this.f97717a = null;
            this.f97718b = null;
            this.f97719c = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d build() {
            return new d(this.f97717a, this.f97718b, this.f97719c);
        }

        @k
        public final a b(@l String str) {
            this.f97718b = str;
            return this;
        }

        @k
        public final a c(@l String str) {
            this.f97719c = str;
            return this;
        }

        @k
        public final a d(@l Integer num) {
            this.f97717a = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f97717a = null;
            this.f97718b = null;
            this.f97719c = null;
        }

        public a(@k d source) {
            g0.p(source, "source");
            this.f97717a = source.f97714a;
            this.f97718b = source.f97715b;
            this.f97719c = source.f97716c;
        }
    }
}
