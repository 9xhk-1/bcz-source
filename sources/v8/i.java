package v8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class i implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f93299d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<i, a> f93300e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f93301a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93302b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93303c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<i, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.b(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.c(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.d(protocol.s8());
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
            protocol.g6(ma.b.W1);
            protocol.Q6("position_code", 1, (byte) 8);
            protocol.l5(struct.f93301a);
            protocol.N2();
            protocol.Q6("name", 2, (byte) 11);
            protocol.p1(struct.f93302b);
            protocol.N2();
            protocol.Q6("display_name", 3, (byte) 11);
            protocol.p1(struct.f93303c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public i(int i11, @m80.k String name, @m80.k String display_name) {
        g0.p(name, "name");
        g0.p(display_name, "display_name");
        this.f93301a = i11;
        this.f93302b = name;
        this.f93303c = display_name;
    }

    public static /* synthetic */ i e(i iVar, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = iVar.f93301a;
        }
        if ((i12 & 2) != 0) {
            str = iVar.f93302b;
        }
        if ((i12 & 4) != 0) {
            str2 = iVar.f93303c;
        }
        return iVar.d(i11, str, str2);
    }

    public final int a() {
        return this.f93301a;
    }

    @m80.k
    public final String b() {
        return this.f93302b;
    }

    @m80.k
    public final String c() {
        return this.f93303c;
    }

    @m80.k
    public final i d(int i11, @m80.k String name, @m80.k String display_name) {
        g0.p(name, "name");
        g0.p(display_name, "display_name");
        return new i(i11, name, display_name);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f93301a == iVar.f93301a && g0.g(this.f93302b, iVar.f93302b) && g0.g(this.f93303c, iVar.f93303c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f93301a) * 31) + this.f93302b.hashCode()) * 31) + this.f93303c.hashCode();
    }

    @m80.k
    public String toString() {
        return "Position(position_code=" + this.f93301a + ", name=" + this.f93302b + ", display_name=" + this.f93303c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93300e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Position.kt\ncom/baicizhan/biz/online/unified_user_service/Position$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"})
    public static final class a implements ts.f<i> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f93304a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f93305b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f93306c;

        public a() {
            this.f93304a = null;
            this.f93305b = null;
            this.f93306c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i build() {
            Integer num = this.f93304a;
            if (num == null) {
                throw new IllegalStateException("Required field 'position_code' is missing");
            }
            int intValue = num.intValue();
            String str = this.f93305b;
            if (str == null) {
                throw new IllegalStateException("Required field 'name' is missing");
            }
            String str2 = this.f93306c;
            if (str2 != null) {
                return new i(intValue, str, str2);
            }
            throw new IllegalStateException("Required field 'display_name' is missing");
        }

        @m80.k
        public final a b(@m80.k String display_name) {
            g0.p(display_name, "display_name");
            this.f93306c = display_name;
            return this;
        }

        @m80.k
        public final a c(@m80.k String name) {
            g0.p(name, "name");
            this.f93305b = name;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f93304a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93304a = null;
            this.f93305b = null;
            this.f93306c = null;
        }

        public a(@m80.k i source) {
            g0.p(source, "source");
            this.f93304a = Integer.valueOf(source.f93301a);
            this.f93305b = source.f93302b;
            this.f93306c = source.f93303c;
        }
    }
}
