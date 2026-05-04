package t8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f90003c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<d, a> f90004d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f90005a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f90006b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
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
                        at.b.a(protocol, b11);
                    } else if (b11 == 8) {
                        builder.c(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.b(protocol.s8());
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
            protocol.g6("GameWordItemUpdateInfo");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f90005a);
            protocol.N2();
            protocol.Q6("topic_version", 2, (byte) 8);
            protocol.l5(struct.f90006b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public d(int i11, int i12) {
        this.f90005a = i11;
        this.f90006b = i12;
    }

    public static /* synthetic */ d d(d dVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = dVar.f90005a;
        }
        if ((i13 & 2) != 0) {
            i12 = dVar.f90006b;
        }
        return dVar.c(i11, i12);
    }

    public final int a() {
        return this.f90005a;
    }

    public final int b() {
        return this.f90006b;
    }

    @m80.k
    public final d c(int i11, int i12) {
        return new d(i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f90005a == dVar.f90005a && this.f90006b == dVar.f90006b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f90005a) * 31) + Integer.hashCode(this.f90006b);
    }

    @m80.k
    public String toString() {
        return "GameWordItemUpdateInfo(topic_id=" + this.f90005a + ", topic_version=" + this.f90006b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90004d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nGameWordItemUpdateInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameWordItemUpdateInfo.kt\ncom/baicizhan/biz/online/resource_api/GameWordItemUpdateInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
    public static final class a implements ts.f<d> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f90007a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f90008b;

        public a() {
            this.f90007a = null;
            this.f90008b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d build() {
            Integer num = this.f90007a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f90008b;
            if (num2 != null) {
                return new d(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'topic_version' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f90007a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f90008b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90007a = null;
            this.f90008b = null;
        }

        public a(@m80.k d source) {
            g0.p(source, "source");
            this.f90007a = Integer.valueOf(source.f90005a);
            this.f90008b = Integer.valueOf(source.f90006b);
        }
    }
}
