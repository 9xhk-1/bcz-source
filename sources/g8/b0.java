package g8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b0 implements ts.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final b f53182b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<b0, a> f53183c = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f53184a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<b0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b0 read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                if (a62.f96797c != 1) {
                    at.b.a(protocol, b11);
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
        public void write(@m80.k ws.i protocol, @m80.k b0 struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ThirdAd");
            protocol.Q6("showTimes", 1, (byte) 8);
            protocol.l5(struct.f53184a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public b0(int i11) {
        this.f53184a = i11;
    }

    public static /* synthetic */ b0 c(b0 b0Var, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = b0Var.f53184a;
        }
        return b0Var.b(i11);
    }

    public final int a() {
        return this.f53184a;
    }

    @m80.k
    public final b0 b(int i11) {
        return new b0(i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && this.f53184a == ((b0) obj).f53184a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f53184a);
    }

    @m80.k
    public String toString() {
        return "ThirdAd(showTimes=" + this.f53184a + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53183c.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThirdAd.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdAd.kt\ncom/baicizhan/biz/online/advertise_api/ThirdAd$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
    public static final class a implements ts.f<b0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f53185a;

        public a() {
            this.f53185a = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b0 build() {
            Integer num = this.f53185a;
            if (num != null) {
                return new b0(num.intValue());
            }
            throw new IllegalStateException("Required field 'showTimes' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f53185a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53185a = null;
        }

        public a(@m80.k b0 source) {
            g0.p(source, "source");
            this.f53185a = Integer.valueOf(source.f53184a);
        }
    }
}
