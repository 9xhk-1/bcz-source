package j8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f63770c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<e, b> f63771d = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final boolean f63772a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final boolean f63773b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<e, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol, @m80.k b builder) {
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
                    } else if (b11 == 2) {
                        builder.a(protocol.readBool());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 2) {
                    builder.b(protocol.readBool());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k e struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BczAppSwitch");
            protocol.Q6("allow_try_user", 1, (byte) 2);
            protocol.a4(struct.f63772a);
            protocol.N2();
            protocol.Q6("allow_fast_login", 2, (byte) 2);
            protocol.a4(struct.f63773b);
            protocol.N2();
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

    public e(boolean z11, boolean z12) {
        this.f63772a = z11;
        this.f63773b = z12;
    }

    public static /* synthetic */ e d(e eVar, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = eVar.f63772a;
        }
        if ((i11 & 2) != 0) {
            z12 = eVar.f63773b;
        }
        return eVar.c(z11, z12);
    }

    public final boolean a() {
        return this.f63772a;
    }

    public final boolean b() {
        return this.f63773b;
    }

    @m80.k
    public final e c(boolean z11, boolean z12) {
        return new e(z11, z12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f63772a == eVar.f63772a && this.f63773b == eVar.f63773b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f63772a) * 31) + Boolean.hashCode(this.f63773b);
    }

    @m80.k
    public String toString() {
        return "BczAppSwitch(allow_try_user=" + this.f63772a + ", allow_fast_login=" + this.f63773b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f63771d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBczAppSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczAppSwitch.kt\ncom/baicizhan/biz/online/bcz_system_api/BczAppSwitch$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
    public static final class b implements ts.f<e> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Boolean f63774a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Boolean f63775b;

        public b() {
            this.f63774a = null;
            this.f63775b = null;
        }

        @m80.k
        public final b a(boolean z11) {
            this.f63775b = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final b b(boolean z11) {
            this.f63774a = Boolean.valueOf(z11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e build() {
            Boolean bool = this.f63774a;
            if (bool == null) {
                throw new IllegalStateException("Required field 'allow_try_user' is missing");
            }
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = this.f63775b;
            if (bool2 != null) {
                return new e(booleanValue, bool2.booleanValue());
            }
            throw new IllegalStateException("Required field 'allow_fast_login' is missing");
        }

        @Override // ts.f
        public void reset() {
            this.f63774a = null;
            this.f63775b = null;
        }

        public b(@m80.k e source) {
            g0.p(source, "source");
            this.f63774a = Boolean.valueOf(source.f63772a);
            this.f63775b = Boolean.valueOf(source.f63773b);
        }
    }
}
