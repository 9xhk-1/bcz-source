package x8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C1313b f97684h = new C1313b(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<b, a> f97685i = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f97686a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f97687b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f97688c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f97689d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f97690e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final int f97691f;

    /* renamed from: g, reason: collision with root package name */
    @l
    @w00.g
    public final Integer f97692g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: x8.b$b, reason: collision with other inner class name */
    public static final class C1313b {
        public /* synthetic */ C1313b(v vVar) {
            this();
        }

        public C1313b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<b, a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b read(@k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b read(@k ws.i protocol, @k a builder) {
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
                            builder.h(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.s8());
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
                            builder.b(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.s8());
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(Integer.valueOf(protocol.s8()));
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
        public void write(@k ws.i protocol, @k b struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("DoneWordStatLog");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f97686a);
            protocol.N2();
            protocol.Q6("is_today_new", 2, (byte) 8);
            protocol.l5(struct.f97687b);
            protocol.N2();
            protocol.Q6("is_done_right", 3, (byte) 8);
            protocol.l5(struct.f97688c);
            protocol.N2();
            protocol.Q6("option", 4, (byte) 8);
            protocol.l5(struct.f97689d);
            protocol.N2();
            protocol.Q6("done_type", 5, (byte) 8);
            protocol.l5(struct.f97690e);
            protocol.N2();
            protocol.Q6("duration", 6, (byte) 8);
            protocol.l5(struct.f97691f);
            protocol.N2();
            if (struct.f97692g != null) {
                protocol.Q6("tag_id", 7, (byte) 8);
                protocol.l5(struct.f97692g.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public b(int i11, int i12, int i13, int i14, int i15, int i16, @l Integer num) {
        this.f97686a = i11;
        this.f97687b = i12;
        this.f97688c = i13;
        this.f97689d = i14;
        this.f97690e = i15;
        this.f97691f = i16;
        this.f97692g = num;
    }

    public static /* synthetic */ b i(b bVar, int i11, int i12, int i13, int i14, int i15, int i16, Integer num, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i11 = bVar.f97686a;
        }
        if ((i17 & 2) != 0) {
            i12 = bVar.f97687b;
        }
        if ((i17 & 4) != 0) {
            i13 = bVar.f97688c;
        }
        if ((i17 & 8) != 0) {
            i14 = bVar.f97689d;
        }
        if ((i17 & 16) != 0) {
            i15 = bVar.f97690e;
        }
        if ((i17 & 32) != 0) {
            i16 = bVar.f97691f;
        }
        if ((i17 & 64) != 0) {
            num = bVar.f97692g;
        }
        int i18 = i16;
        Integer num2 = num;
        int i19 = i15;
        int i21 = i13;
        return bVar.h(i11, i12, i21, i14, i19, i18, num2);
    }

    public final int a() {
        return this.f97686a;
    }

    public final int b() {
        return this.f97687b;
    }

    public final int c() {
        return this.f97688c;
    }

    public final int d() {
        return this.f97689d;
    }

    public final int e() {
        return this.f97690e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f97686a == bVar.f97686a && this.f97687b == bVar.f97687b && this.f97688c == bVar.f97688c && this.f97689d == bVar.f97689d && this.f97690e == bVar.f97690e && this.f97691f == bVar.f97691f && g0.g(this.f97692g, bVar.f97692g);
    }

    public final int f() {
        return this.f97691f;
    }

    @l
    public final Integer g() {
        return this.f97692g;
    }

    @k
    public final b h(int i11, int i12, int i13, int i14, int i15, int i16, @l Integer num) {
        return new b(i11, i12, i13, i14, i15, i16, num);
    }

    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(this.f97686a) * 31) + Integer.hashCode(this.f97687b)) * 31) + Integer.hashCode(this.f97688c)) * 31) + Integer.hashCode(this.f97689d)) * 31) + Integer.hashCode(this.f97690e)) * 31) + Integer.hashCode(this.f97691f)) * 31;
        Integer num = this.f97692g;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @k
    public String toString() {
        return "DoneWordStatLog(topic_id=" + this.f97686a + ", is_today_new=" + this.f97687b + ", is_done_right=" + this.f97688c + ", option=" + this.f97689d + ", done_type=" + this.f97690e + ", duration=" + this.f97691f + ", tag_id=" + this.f97692g + ')';
    }

    @Override // ts.e
    public void write(@k ws.i protocol) {
        g0.p(protocol, "protocol");
        f97685i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDoneWordStatLog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoneWordStatLog.kt\ncom/baicizhan/biz/online/user_assistant_api/DoneWordStatLog$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n1#2:264\n*E\n"})
    public static final class a implements ts.f<b> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Integer f97693a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public Integer f97694b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Integer f97695c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public Integer f97696d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public Integer f97697e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public Integer f97698f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public Integer f97699g;

        public a() {
            this.f97693a = null;
            this.f97694b = null;
            this.f97695c = null;
            this.f97696d = null;
            this.f97697e = null;
            this.f97698f = null;
            this.f97699g = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b build() {
            Integer num = this.f97693a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f97694b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'is_today_new' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f97695c;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'is_done_right' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f97696d;
            if (num4 == null) {
                throw new IllegalStateException("Required field 'option' is missing");
            }
            int intValue4 = num4.intValue();
            Integer num5 = this.f97697e;
            if (num5 == null) {
                throw new IllegalStateException("Required field 'done_type' is missing");
            }
            int intValue5 = num5.intValue();
            Integer num6 = this.f97698f;
            if (num6 != null) {
                return new b(intValue, intValue2, intValue3, intValue4, intValue5, num6.intValue(), this.f97699g);
            }
            throw new IllegalStateException("Required field 'duration' is missing");
        }

        @k
        public final a b(int i11) {
            this.f97697e = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a c(int i11) {
            this.f97698f = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a d(int i11) {
            this.f97695c = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a e(int i11) {
            this.f97694b = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a f(int i11) {
            this.f97696d = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a g(@l Integer num) {
            this.f97699g = num;
            return this;
        }

        @k
        public final a h(int i11) {
            this.f97693a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f97693a = null;
            this.f97694b = null;
            this.f97695c = null;
            this.f97696d = null;
            this.f97697e = null;
            this.f97698f = null;
            this.f97699g = null;
        }

        public a(@k b source) {
            g0.p(source, "source");
            this.f97693a = Integer.valueOf(source.f97686a);
            this.f97694b = Integer.valueOf(source.f97687b);
            this.f97695c = Integer.valueOf(source.f97688c);
            this.f97696d = Integer.valueOf(source.f97689d);
            this.f97697e = Integer.valueOf(source.f97690e);
            this.f97698f = Integer.valueOf(source.f97691f);
            this.f97699g = source.f97692g;
        }
    }
}
