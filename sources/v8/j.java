package v8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class j implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f93307c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<j, a> f93308d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f93309a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f93310b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<j, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j read(@m80.k ws.i protocol, @m80.k a builder) {
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
                } else if (b11 == 8) {
                    builder.c(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k j struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("RoleInfo");
            protocol.Q6("role_up", 1, (byte) 8);
            protocol.l5(struct.f93309a);
            protocol.N2();
            protocol.Q6("grade", 2, (byte) 8);
            protocol.l5(struct.f93310b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public j(int i11, int i12) {
        this.f93309a = i11;
        this.f93310b = i12;
    }

    public static /* synthetic */ j d(j jVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = jVar.f93309a;
        }
        if ((i13 & 2) != 0) {
            i12 = jVar.f93310b;
        }
        return jVar.c(i11, i12);
    }

    public final int a() {
        return this.f93309a;
    }

    public final int b() {
        return this.f93310b;
    }

    @m80.k
    public final j c(int i11, int i12) {
        return new j(i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f93309a == jVar.f93309a && this.f93310b == jVar.f93310b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f93309a) * 31) + Integer.hashCode(this.f93310b);
    }

    @m80.k
    public String toString() {
        return "RoleInfo(role_up=" + this.f93309a + ", grade=" + this.f93310b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93308d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRoleInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoleInfo.kt\ncom/baicizhan/biz/online/unified_user_service/RoleInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
    public static final class a implements ts.f<j> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f93311a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f93312b;

        public a() {
            this.f93311a = null;
            this.f93312b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j build() {
            Integer num = this.f93311a;
            if (num == null) {
                throw new IllegalStateException("Required field 'role_up' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f93312b;
            if (num2 != null) {
                return new j(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'grade' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f93312b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f93311a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93311a = null;
            this.f93312b = null;
        }

        public a(@m80.k j source) {
            g0.p(source, "source");
            this.f93311a = Integer.valueOf(source.f93309a);
            this.f93312b = Integer.valueOf(source.f93310b);
        }
    }
}
