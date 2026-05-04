package o8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f76413d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<g, a> f76414e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f76415a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f76416b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f76417c;

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
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.c(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.d(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k g struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("FeedBackReq");
            protocol.Q6(ma.b.f72902e1, 1, (byte) 8);
            protocol.l5(struct.f76415a);
            protocol.N2();
            protocol.Q6("qs_id", 2, (byte) 8);
            protocol.l5(struct.f76416b);
            protocol.N2();
            protocol.Q6("choice", 3, (byte) 8);
            protocol.l5(struct.f76417c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public g(int i11, int i12, int i13) {
        this.f76415a = i11;
        this.f76416b = i12;
        this.f76417c = i13;
    }

    public static /* synthetic */ g e(g gVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = gVar.f76415a;
        }
        if ((i14 & 2) != 0) {
            i12 = gVar.f76416b;
        }
        if ((i14 & 4) != 0) {
            i13 = gVar.f76417c;
        }
        return gVar.d(i11, i12, i13);
    }

    public final int a() {
        return this.f76415a;
    }

    public final int b() {
        return this.f76416b;
    }

    public final int c() {
        return this.f76417c;
    }

    @m80.k
    public final g d(int i11, int i12, int i13) {
        return new g(i11, i12, i13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f76415a == gVar.f76415a && this.f76416b == gVar.f76416b && this.f76417c == gVar.f76417c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f76415a) * 31) + Integer.hashCode(this.f76416b)) * 31) + Integer.hashCode(this.f76417c);
    }

    @m80.k
    public String toString() {
        return "FeedBackReq(article_id=" + this.f76415a + ", qs_id=" + this.f76416b + ", choice=" + this.f76417c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76414e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nFeedBackReq.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedBackReq.kt\ncom/baicizhan/biz/online/course_api/FeedBackReq$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    public static final class a implements ts.f<g> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f76418a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f76419b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f76420c;

        public a() {
            this.f76418a = null;
            this.f76419b = null;
            this.f76420c = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f76418a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g build() {
            Integer num = this.f76418a;
            if (num == null) {
                throw new IllegalStateException("Required field 'article_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f76419b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'qs_id' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f76420c;
            if (num3 != null) {
                return new g(intValue, intValue2, num3.intValue());
            }
            throw new IllegalStateException("Required field 'choice' is missing");
        }

        @m80.k
        public final a c(int i11) {
            this.f76420c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f76419b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76418a = null;
            this.f76419b = null;
            this.f76420c = null;
        }

        public a(@m80.k g source) {
            g0.p(source, "source");
            this.f76418a = Integer.valueOf(source.f76415a);
            this.f76419b = Integer.valueOf(source.f76416b);
            this.f76420c = Integer.valueOf(source.f76417c);
        }
    }
}
