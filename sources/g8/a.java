package g8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final c f53154d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<a, b> f53155e = new C0628a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f53156a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f53157b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53158c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: g8.a$a, reason: collision with other inner class name */
    public static final class C0628a implements ts.a<a, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            builder.d(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k a struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AdEvent");
            protocol.Q6("ad_id", 1, (byte) 8);
            protocol.l5(struct.f53156a);
            protocol.N2();
            protocol.Q6("event_type", 2, (byte) 8);
            protocol.l5(struct.f53157b);
            protocol.N2();
            if (struct.f53158c != null) {
                protocol.Q6("ext_ad_id", 3, (byte) 11);
                protocol.p1(struct.f53158c);
                protocol.N2();
            }
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

    public a(int i11, int i12, @m80.l String str) {
        this.f53156a = i11;
        this.f53157b = i12;
        this.f53158c = str;
    }

    public static /* synthetic */ a e(a aVar, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = aVar.f53156a;
        }
        if ((i13 & 2) != 0) {
            i12 = aVar.f53157b;
        }
        if ((i13 & 4) != 0) {
            str = aVar.f53158c;
        }
        return aVar.d(i11, i12, str);
    }

    public final int a() {
        return this.f53156a;
    }

    public final int b() {
        return this.f53157b;
    }

    @m80.l
    public final String c() {
        return this.f53158c;
    }

    @m80.k
    public final a d(int i11, int i12, @m80.l String str) {
        return new a(i11, i12, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f53156a == aVar.f53156a && this.f53157b == aVar.f53157b && g0.g(this.f53158c, aVar.f53158c);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f53156a) * 31) + Integer.hashCode(this.f53157b)) * 31;
        String str = this.f53158c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "AdEvent(ad_id=" + this.f53156a + ", event_type=" + this.f53157b + ", ext_ad_id=" + this.f53158c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53155e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAdEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdEvent.kt\ncom/baicizhan/biz/online/advertise_api/AdEvent$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
    public static final class b implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f53159a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f53160b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f53161c;

        public b() {
            this.f53159a = null;
            this.f53160b = null;
            this.f53161c = null;
        }

        @m80.k
        public final b a(int i11) {
            this.f53159a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a build() {
            Integer num = this.f53159a;
            if (num == null) {
                throw new IllegalStateException("Required field 'ad_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f53160b;
            if (num2 != null) {
                return new a(intValue, num2.intValue(), this.f53161c);
            }
            throw new IllegalStateException("Required field 'event_type' is missing");
        }

        @m80.k
        public final b c(int i11) {
            this.f53160b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b d(@m80.l String str) {
            this.f53161c = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53159a = null;
            this.f53160b = null;
            this.f53161c = null;
        }

        public b(@m80.k a source) {
            g0.p(source, "source");
            this.f53159a = Integer.valueOf(source.f53156a);
            this.f53160b = Integer.valueOf(source.f53157b);
            this.f53161c = source.f53158c;
        }
    }
}
