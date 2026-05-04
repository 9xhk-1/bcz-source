package r8;

import k3.u0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;
import xo.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final b f83657h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<g, a> f83658i = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final boolean f83659a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f83660b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f83661c;

    /* renamed from: d, reason: collision with root package name */
    @l
    @w00.g
    public final Boolean f83662d;

    /* renamed from: e, reason: collision with root package name */
    @l
    @w00.g
    public final Integer f83663e;

    /* renamed from: f, reason: collision with root package name */
    @l
    @w00.g
    public final Integer f83664f;

    /* renamed from: g, reason: collision with root package name */
    @l
    @w00.g
    public final Integer f83665g;

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
        public g read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g read(@k i protocol, @k a builder) {
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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readBool());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(Boolean.valueOf(protocol.readBool()));
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(Integer.valueOf(protocol.s8()));
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
        public void write(@k i protocol, @k g struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserRemindInfo");
            protocol.Q6(u0.f65628b, 1, (byte) 2);
            protocol.a4(struct.f83659a);
            protocol.N2();
            protocol.Q6("hour", 2, (byte) 8);
            protocol.l5(struct.f83660b);
            protocol.N2();
            protocol.Q6(n.r.f98263e, 3, (byte) 8);
            protocol.l5(struct.f83661c);
            protocol.N2();
            if (struct.f83662d != null) {
                protocol.Q6("wx_enable", 4, (byte) 2);
                protocol.a4(struct.f83662d.booleanValue());
                protocol.N2();
            }
            if (struct.f83663e != null) {
                protocol.Q6("task_enable", 5, (byte) 8);
                protocol.l5(struct.f83663e.intValue());
                protocol.N2();
            }
            if (struct.f83664f != null) {
                protocol.Q6("social_enable", 6, (byte) 8);
                protocol.l5(struct.f83664f.intValue());
                protocol.N2();
            }
            if (struct.f83665g != null) {
                protocol.Q6("sentence_enable", 7, (byte) 8);
                protocol.l5(struct.f83665g.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public g(boolean z11, int i11, int i12, @l Boolean bool, @l Integer num, @l Integer num2, @l Integer num3) {
        this.f83659a = z11;
        this.f83660b = i11;
        this.f83661c = i12;
        this.f83662d = bool;
        this.f83663e = num;
        this.f83664f = num2;
        this.f83665g = num3;
    }

    public static /* synthetic */ g i(g gVar, boolean z11, int i11, int i12, Boolean bool, Integer num, Integer num2, Integer num3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z11 = gVar.f83659a;
        }
        if ((i13 & 2) != 0) {
            i11 = gVar.f83660b;
        }
        if ((i13 & 4) != 0) {
            i12 = gVar.f83661c;
        }
        if ((i13 & 8) != 0) {
            bool = gVar.f83662d;
        }
        if ((i13 & 16) != 0) {
            num = gVar.f83663e;
        }
        if ((i13 & 32) != 0) {
            num2 = gVar.f83664f;
        }
        if ((i13 & 64) != 0) {
            num3 = gVar.f83665g;
        }
        Integer num4 = num2;
        Integer num5 = num3;
        Integer num6 = num;
        int i14 = i12;
        return gVar.h(z11, i11, i14, bool, num6, num4, num5);
    }

    public final boolean a() {
        return this.f83659a;
    }

    public final int b() {
        return this.f83660b;
    }

    public final int c() {
        return this.f83661c;
    }

    @l
    public final Boolean d() {
        return this.f83662d;
    }

    @l
    public final Integer e() {
        return this.f83663e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f83659a == gVar.f83659a && this.f83660b == gVar.f83660b && this.f83661c == gVar.f83661c && g0.g(this.f83662d, gVar.f83662d) && g0.g(this.f83663e, gVar.f83663e) && g0.g(this.f83664f, gVar.f83664f) && g0.g(this.f83665g, gVar.f83665g);
    }

    @l
    public final Integer f() {
        return this.f83664f;
    }

    @l
    public final Integer g() {
        return this.f83665g;
    }

    @k
    public final g h(boolean z11, int i11, int i12, @l Boolean bool, @l Integer num, @l Integer num2, @l Integer num3) {
        return new g(z11, i11, i12, bool, num, num2, num3);
    }

    public int hashCode() {
        int hashCode = ((((Boolean.hashCode(this.f83659a) * 31) + Integer.hashCode(this.f83660b)) * 31) + Integer.hashCode(this.f83661c)) * 31;
        Boolean bool = this.f83662d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f83663e;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f83664f;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f83665g;
        return hashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    @k
    public String toString() {
        return "UserRemindInfo(enable=" + this.f83659a + ", hour=" + this.f83660b + ", minute=" + this.f83661c + ", wx_enable=" + this.f83662d + ", task_enable=" + this.f83663e + ", social_enable=" + this.f83664f + ", sentence_enable=" + this.f83665g + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f83658i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserRemindInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserRemindInfo.kt\ncom/baicizhan/biz/online/notify/UserRemindInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n1#2:262\n*E\n"})
    public static final class a implements ts.f<g> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Boolean f83666a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public Integer f83667b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Integer f83668c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public Boolean f83669d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public Integer f83670e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public Integer f83671f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public Integer f83672g;

        public a() {
            this.f83666a = null;
            this.f83667b = null;
            this.f83668c = null;
            this.f83669d = null;
            this.f83670e = null;
            this.f83671f = null;
            this.f83672g = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g build() {
            Boolean bool = this.f83666a;
            if (bool == null) {
                throw new IllegalStateException("Required field 'enable' is missing");
            }
            boolean booleanValue = bool.booleanValue();
            Integer num = this.f83667b;
            if (num == null) {
                throw new IllegalStateException("Required field 'hour' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f83668c;
            if (num2 != null) {
                return new g(booleanValue, intValue, num2.intValue(), this.f83669d, this.f83670e, this.f83671f, this.f83672g);
            }
            throw new IllegalStateException("Required field 'minute' is missing");
        }

        @k
        public final a b(boolean z11) {
            this.f83666a = Boolean.valueOf(z11);
            return this;
        }

        @k
        public final a c(int i11) {
            this.f83667b = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a d(int i11) {
            this.f83668c = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a e(@l Integer num) {
            this.f83672g = num;
            return this;
        }

        @k
        public final a f(@l Integer num) {
            this.f83671f = num;
            return this;
        }

        @k
        public final a g(@l Integer num) {
            this.f83670e = num;
            return this;
        }

        @k
        public final a h(@l Boolean bool) {
            this.f83669d = bool;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f83666a = null;
            this.f83667b = null;
            this.f83668c = null;
            this.f83669d = null;
            this.f83670e = null;
            this.f83671f = null;
            this.f83672g = null;
        }

        public a(@k g source) {
            g0.p(source, "source");
            this.f83666a = Boolean.valueOf(source.f83659a);
            this.f83667b = Integer.valueOf(source.f83660b);
            this.f83668c = Integer.valueOf(source.f83661c);
            this.f83669d = source.f83662d;
            this.f83670e = source.f83663e;
            this.f83671f = source.f83664f;
            this.f83672g = source.f83665g;
        }
    }
}
