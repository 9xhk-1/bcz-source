package m8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final c f72624f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<e, b> f72625g = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f72626a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f72627b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f72628c;

    /* renamed from: d, reason: collision with root package name */
    @l
    @w00.g
    public final Boolean f72629d;

    /* renamed from: e, reason: collision with root package name */
    @l
    @w00.g
    public final Boolean f72630e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<e, b> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e read(@k i protocol, @k b builder) {
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
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    at.b.a(protocol, b11);
                                } else if (b11 == 2) {
                                    builder.c(Boolean.valueOf(protocol.readBool()));
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 2) {
                                builder.d(Boolean.valueOf(protocol.readBool()));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.b(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.f(protocol.s8());
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
        public void write(@k i protocol, @k e struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBUserWordMedia");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f72626a);
            protocol.N2();
            protocol.Q6("tv_view_times", 2, (byte) 8);
            protocol.l5(struct.f72627b);
            protocol.N2();
            protocol.Q6("fm_view_times", 3, (byte) 8);
            protocol.l5(struct.f72628c);
            protocol.N2();
            if (struct.f72629d != null) {
                protocol.Q6("is_tv_skip", 4, (byte) 2);
                protocol.a4(struct.f72629d.booleanValue());
                protocol.N2();
            }
            if (struct.f72630e != null) {
                protocol.Q6("is_fm_skip", 5, (byte) 2);
                protocol.a4(struct.f72630e.booleanValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(v vVar) {
            this();
        }

        public c() {
        }
    }

    public e(int i11, int i12, int i13, @l Boolean bool, @l Boolean bool2) {
        this.f72626a = i11;
        this.f72627b = i12;
        this.f72628c = i13;
        this.f72629d = bool;
        this.f72630e = bool2;
    }

    public static /* synthetic */ e g(e eVar, int i11, int i12, int i13, Boolean bool, Boolean bool2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = eVar.f72626a;
        }
        if ((i14 & 2) != 0) {
            i12 = eVar.f72627b;
        }
        if ((i14 & 4) != 0) {
            i13 = eVar.f72628c;
        }
        if ((i14 & 8) != 0) {
            bool = eVar.f72629d;
        }
        if ((i14 & 16) != 0) {
            bool2 = eVar.f72630e;
        }
        Boolean bool3 = bool2;
        int i15 = i13;
        return eVar.f(i11, i12, i15, bool, bool3);
    }

    public final int a() {
        return this.f72626a;
    }

    public final int b() {
        return this.f72627b;
    }

    public final int c() {
        return this.f72628c;
    }

    @l
    public final Boolean d() {
        return this.f72629d;
    }

    @l
    public final Boolean e() {
        return this.f72630e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f72626a == eVar.f72626a && this.f72627b == eVar.f72627b && this.f72628c == eVar.f72628c && g0.g(this.f72629d, eVar.f72629d) && g0.g(this.f72630e, eVar.f72630e);
    }

    @k
    public final e f(int i11, int i12, int i13, @l Boolean bool, @l Boolean bool2) {
        return new e(i11, i12, i13, bool, bool2);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f72626a) * 31) + Integer.hashCode(this.f72627b)) * 31) + Integer.hashCode(this.f72628c)) * 31;
        Boolean bool = this.f72629d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f72630e;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BBUserWordMedia(topic_id=" + this.f72626a + ", tv_view_times=" + this.f72627b + ", fm_view_times=" + this.f72628c + ", is_tv_skip=" + this.f72629d + ", is_fm_skip=" + this.f72630e + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f72625g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBUserWordMedia.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBUserWordMedia.kt\ncom/baicizhan/biz/online/bs_users/BBUserWordMedia$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"})
    public static final class b implements ts.f<e> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Integer f72631a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public Integer f72632b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Integer f72633c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public Boolean f72634d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public Boolean f72635e;

        public b() {
            this.f72631a = null;
            this.f72632b = null;
            this.f72633c = null;
            this.f72634d = null;
            this.f72635e = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e build() {
            Integer num = this.f72631a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f72632b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'tv_view_times' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f72633c;
            if (num3 != null) {
                return new e(intValue, intValue2, num3.intValue(), this.f72634d, this.f72635e);
            }
            throw new IllegalStateException("Required field 'fm_view_times' is missing");
        }

        @k
        public final b b(int i11) {
            this.f72633c = Integer.valueOf(i11);
            return this;
        }

        @k
        public final b c(@l Boolean bool) {
            this.f72635e = bool;
            return this;
        }

        @k
        public final b d(@l Boolean bool) {
            this.f72634d = bool;
            return this;
        }

        @k
        public final b e(int i11) {
            this.f72631a = Integer.valueOf(i11);
            return this;
        }

        @k
        public final b f(int i11) {
            this.f72632b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f72631a = null;
            this.f72632b = null;
            this.f72633c = null;
            this.f72634d = null;
            this.f72635e = null;
        }

        public b(@k e source) {
            g0.p(source, "source");
            this.f72631a = Integer.valueOf(source.f72626a);
            this.f72632b = Integer.valueOf(source.f72627b);
            this.f72633c = Integer.valueOf(source.f72628c);
            this.f72634d = source.f72629d;
            this.f72635e = source.f72630e;
        }
    }
}
