package h8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class l implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f58973g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<l, a> f58974h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f58975a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f58976b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f58977c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f58978d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f58979e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f58980f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<l, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.s8());
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
                            builder.b(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(Long.valueOf(protocol.T1()));
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
        public void write(@m80.k ws.i protocol, @m80.k l struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserCurrentAvatarInfo");
            protocol.Q6("ip_type", 1, (byte) 8);
            protocol.l5(struct.f58975a);
            protocol.N2();
            protocol.Q6("ip_status", 2, (byte) 8);
            protocol.l5(struct.f58976b);
            protocol.N2();
            protocol.Q6(c6.d.f8119k, 3, (byte) 8);
            protocol.l5(struct.f58977c);
            protocol.N2();
            protocol.Q6("travel_energy", 4, (byte) 8);
            protocol.l5(struct.f58978d);
            protocol.N2();
            protocol.Q6("travel_area_id", 5, (byte) 8);
            protocol.l5(struct.f58979e);
            protocol.N2();
            if (struct.f58980f != null) {
                protocol.Q6("travel_return_time", 6, (byte) 10);
                protocol.q7(struct.f58980f.longValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public l(int i11, int i12, int i13, int i14, int i15, @m80.l Long l11) {
        this.f58975a = i11;
        this.f58976b = i12;
        this.f58977c = i13;
        this.f58978d = i14;
        this.f58979e = i15;
        this.f58980f = l11;
    }

    public static /* synthetic */ l h(l lVar, int i11, int i12, int i13, int i14, int i15, Long l11, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = lVar.f58975a;
        }
        if ((i16 & 2) != 0) {
            i12 = lVar.f58976b;
        }
        if ((i16 & 4) != 0) {
            i13 = lVar.f58977c;
        }
        if ((i16 & 8) != 0) {
            i14 = lVar.f58978d;
        }
        if ((i16 & 16) != 0) {
            i15 = lVar.f58979e;
        }
        if ((i16 & 32) != 0) {
            l11 = lVar.f58980f;
        }
        int i17 = i15;
        Long l12 = l11;
        return lVar.g(i11, i12, i13, i14, i17, l12);
    }

    public final int a() {
        return this.f58975a;
    }

    public final int b() {
        return this.f58976b;
    }

    public final int c() {
        return this.f58977c;
    }

    public final int d() {
        return this.f58978d;
    }

    public final int e() {
        return this.f58979e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f58975a == lVar.f58975a && this.f58976b == lVar.f58976b && this.f58977c == lVar.f58977c && this.f58978d == lVar.f58978d && this.f58979e == lVar.f58979e && g0.g(this.f58980f, lVar.f58980f);
    }

    @m80.l
    public final Long f() {
        return this.f58980f;
    }

    @m80.k
    public final l g(int i11, int i12, int i13, int i14, int i15, @m80.l Long l11) {
        return new l(i11, i12, i13, i14, i15, l11);
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f58975a) * 31) + Integer.hashCode(this.f58976b)) * 31) + Integer.hashCode(this.f58977c)) * 31) + Integer.hashCode(this.f58978d)) * 31) + Integer.hashCode(this.f58979e)) * 31;
        Long l11 = this.f58980f;
        return hashCode + (l11 == null ? 0 : l11.hashCode());
    }

    @m80.k
    public String toString() {
        return "UserCurrentAvatarInfo(ip_type=" + this.f58975a + ", ip_status=" + this.f58976b + ", energy=" + this.f58977c + ", travel_energy=" + this.f58978d + ", travel_area_id=" + this.f58979e + ", travel_return_time=" + this.f58980f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f58974h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserCurrentAvatarInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserCurrentAvatarInfo.kt\ncom/baicizhan/biz/online/avatar_api/UserCurrentAvatarInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1#2:242\n*E\n"})
    public static final class a implements ts.f<l> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f58981a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f58982b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f58983c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f58984d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f58985e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Long f58986f;

        public a() {
            this.f58981a = null;
            this.f58982b = null;
            this.f58983c = null;
            this.f58984d = null;
            this.f58985e = null;
            this.f58986f = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l build() {
            Integer num = this.f58981a;
            if (num == null) {
                throw new IllegalStateException("Required field 'ip_type' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f58982b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'ip_status' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f58983c;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'energy' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f58984d;
            if (num4 == null) {
                throw new IllegalStateException("Required field 'travel_energy' is missing");
            }
            int intValue4 = num4.intValue();
            Integer num5 = this.f58985e;
            if (num5 != null) {
                return new l(intValue, intValue2, intValue3, intValue4, num5.intValue(), this.f58986f);
            }
            throw new IllegalStateException("Required field 'travel_area_id' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f58983c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f58982b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f58981a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f58985e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f58984d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(@m80.l Long l11) {
            this.f58986f = l11;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f58981a = null;
            this.f58982b = null;
            this.f58983c = null;
            this.f58984d = null;
            this.f58985e = null;
            this.f58986f = null;
        }

        public a(@m80.k l source) {
            g0.p(source, "source");
            this.f58981a = Integer.valueOf(source.f58975a);
            this.f58982b = Integer.valueOf(source.f58976b);
            this.f58983c = Integer.valueOf(source.f58977c);
            this.f58984d = Integer.valueOf(source.f58978d);
            this.f58985e = Integer.valueOf(source.f58979e);
            this.f58986f = source.f58980f;
        }
    }
}
