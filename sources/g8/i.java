package g8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class i implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final c f53289d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<i, b> f53290e = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f53291a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f53292b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f53293c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<i, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i read(@m80.k ws.i protocol, @m80.k b builder) {
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
        public void write(@m80.k ws.i protocol, @m80.k i struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BczLaunchAdReport");
            protocol.Q6("ad_id", 1, (byte) 8);
            protocol.l5(struct.f53291a);
            protocol.N2();
            protocol.Q6("rp_type", 2, (byte) 8);
            protocol.l5(struct.f53292b);
            protocol.N2();
            protocol.Q6("show_count", 3, (byte) 8);
            protocol.l5(struct.f53293c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public c() {
        }
    }

    public i(int i11, int i12, int i13) {
        this.f53291a = i11;
        this.f53292b = i12;
        this.f53293c = i13;
    }

    public static /* synthetic */ i e(i iVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = iVar.f53291a;
        }
        if ((i14 & 2) != 0) {
            i12 = iVar.f53292b;
        }
        if ((i14 & 4) != 0) {
            i13 = iVar.f53293c;
        }
        return iVar.d(i11, i12, i13);
    }

    public final int a() {
        return this.f53291a;
    }

    public final int b() {
        return this.f53292b;
    }

    public final int c() {
        return this.f53293c;
    }

    @m80.k
    public final i d(int i11, int i12, int i13) {
        return new i(i11, i12, i13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f53291a == iVar.f53291a && this.f53292b == iVar.f53292b && this.f53293c == iVar.f53293c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f53291a) * 31) + Integer.hashCode(this.f53292b)) * 31) + Integer.hashCode(this.f53293c);
    }

    @m80.k
    public String toString() {
        return "BczLaunchAdReport(ad_id=" + this.f53291a + ", rp_type=" + this.f53292b + ", show_count=" + this.f53293c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53290e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBczLaunchAdReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczLaunchAdReport.kt\ncom/baicizhan/biz/online/advertise_api/BczLaunchAdReport$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    public static final class b implements ts.f<i> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f53294a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f53295b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f53296c;

        public b() {
            this.f53294a = null;
            this.f53295b = null;
            this.f53296c = null;
        }

        @m80.k
        public final b a(int i11) {
            this.f53294a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i build() {
            Integer num = this.f53294a;
            if (num == null) {
                throw new IllegalStateException("Required field 'ad_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f53295b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'rp_type' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f53296c;
            if (num3 != null) {
                return new i(intValue, intValue2, num3.intValue());
            }
            throw new IllegalStateException("Required field 'show_count' is missing");
        }

        @m80.k
        public final b c(int i11) {
            this.f53295b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b d(int i11) {
            this.f53296c = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53294a = null;
            this.f53295b = null;
            this.f53296c = null;
        }

        public b(@m80.k i source) {
            g0.p(source, "source");
            this.f53294a = Integer.valueOf(source.f53291a);
            this.f53295b = Integer.valueOf(source.f53292b);
            this.f53296c = Integer.valueOf(source.f53293c);
        }
    }
}
