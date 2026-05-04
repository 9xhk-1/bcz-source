package o8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class m implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f76461c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<m, a> f76462d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76463a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f76464b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<m, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m read(@m80.k ws.i protocol, @m80.k a builder) {
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
                } else if (b11 == 11) {
                    builder.c(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k m struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("LiveAnswerOptionItem");
            protocol.Q6("option", 1, (byte) 11);
            protocol.p1(struct.f76463a);
            protocol.N2();
            protocol.Q6(ma.b.P, 2, (byte) 8);
            protocol.l5(struct.f76464b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public m(@m80.k String option, int i11) {
        g0.p(option, "option");
        this.f76463a = option;
        this.f76464b = i11;
    }

    public static /* synthetic */ m d(m mVar, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = mVar.f76463a;
        }
        if ((i12 & 2) != 0) {
            i11 = mVar.f76464b;
        }
        return mVar.c(str, i11);
    }

    @m80.k
    public final String a() {
        return this.f76463a;
    }

    public final int b() {
        return this.f76464b;
    }

    @m80.k
    public final m c(@m80.k String option, int i11) {
        g0.p(option, "option");
        return new m(option, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return g0.g(this.f76463a, mVar.f76463a) && this.f76464b == mVar.f76464b;
    }

    public int hashCode() {
        return (this.f76463a.hashCode() * 31) + Integer.hashCode(this.f76464b);
    }

    @m80.k
    public String toString() {
        return "LiveAnswerOptionItem(option=" + this.f76463a + ", correct=" + this.f76464b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76462d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLiveAnswerOptionItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveAnswerOptionItem.kt\ncom/baicizhan/biz/online/course_api/LiveAnswerOptionItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
    public static final class a implements ts.f<m> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f76465a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f76466b;

        public a() {
            this.f76465a = null;
            this.f76466b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m build() {
            String str = this.f76465a;
            if (str == null) {
                throw new IllegalStateException("Required field 'option' is missing");
            }
            Integer num = this.f76466b;
            if (num != null) {
                return new m(str, num.intValue());
            }
            throw new IllegalStateException("Required field 'correct' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f76466b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.k String option) {
            g0.p(option, "option");
            this.f76465a = option;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76465a = null;
            this.f76466b = null;
        }

        public a(@m80.k m source) {
            g0.p(source, "source");
            this.f76465a = source.f76463a;
            this.f76466b = Integer.valueOf(source.f76464b);
        }
    }
}
