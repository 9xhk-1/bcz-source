package x8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f97754c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<g, a> f97755d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f97756a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f97757b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<g, a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g read(@k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g read(@k ws.i protocol, @k a builder) {
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
        public void write(@k ws.i protocol, @k g struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("SubItemInfo");
            protocol.Q6("sub_item_id", 1, (byte) 8);
            protocol.l5(struct.f97756a);
            protocol.N2();
            protocol.Q6("count", 2, (byte) 8);
            protocol.l5(struct.f97757b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public g(int i11, int i12) {
        this.f97756a = i11;
        this.f97757b = i12;
    }

    public static /* synthetic */ g d(g gVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = gVar.f97756a;
        }
        if ((i13 & 2) != 0) {
            i12 = gVar.f97757b;
        }
        return gVar.c(i11, i12);
    }

    public final int a() {
        return this.f97756a;
    }

    public final int b() {
        return this.f97757b;
    }

    @k
    public final g c(int i11, int i12) {
        return new g(i11, i12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f97756a == gVar.f97756a && this.f97757b == gVar.f97757b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f97756a) * 31) + Integer.hashCode(this.f97757b);
    }

    @k
    public String toString() {
        return "SubItemInfo(sub_item_id=" + this.f97756a + ", count=" + this.f97757b + ')';
    }

    @Override // ts.e
    public void write(@k ws.i protocol) {
        g0.p(protocol, "protocol");
        f97755d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSubItemInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubItemInfo.kt\ncom/baicizhan/biz/online/user_assistant_api/SubItemInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
    public static final class a implements ts.f<g> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Integer f97758a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public Integer f97759b;

        public a() {
            this.f97758a = null;
            this.f97759b = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g build() {
            Integer num = this.f97758a;
            if (num == null) {
                throw new IllegalStateException("Required field 'sub_item_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f97759b;
            if (num2 != null) {
                return new g(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'count' is missing");
        }

        @k
        public final a b(int i11) {
            this.f97759b = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a c(int i11) {
            this.f97758a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f97758a = null;
            this.f97759b = null;
        }

        public a(@k g source) {
            g0.p(source, "source");
            this.f97758a = Integer.valueOf(source.f97756a);
            this.f97759b = Integer.valueOf(source.f97757b);
        }
    }
}
