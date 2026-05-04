package v8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class l implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f93323c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<l, a> f93324d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93325a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f93326b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<l, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol, @m80.k a builder) {
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
        public void write(@m80.k ws.i protocol, @m80.k l struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("SchoolMajorItem");
            protocol.Q6("major_name", 1, (byte) 11);
            protocol.p1(struct.f93325a);
            protocol.N2();
            protocol.Q6("major_id", 2, (byte) 8);
            protocol.l5(struct.f93326b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public l(@m80.k String major_name, int i11) {
        g0.p(major_name, "major_name");
        this.f93325a = major_name;
        this.f93326b = i11;
    }

    public static /* synthetic */ l d(l lVar, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = lVar.f93325a;
        }
        if ((i12 & 2) != 0) {
            i11 = lVar.f93326b;
        }
        return lVar.c(str, i11);
    }

    @m80.k
    public final String a() {
        return this.f93325a;
    }

    public final int b() {
        return this.f93326b;
    }

    @m80.k
    public final l c(@m80.k String major_name, int i11) {
        g0.p(major_name, "major_name");
        return new l(major_name, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return g0.g(this.f93325a, lVar.f93325a) && this.f93326b == lVar.f93326b;
    }

    public int hashCode() {
        return (this.f93325a.hashCode() * 31) + Integer.hashCode(this.f93326b);
    }

    @m80.k
    public String toString() {
        return "SchoolMajorItem(major_name=" + this.f93325a + ", major_id=" + this.f93326b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93324d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSchoolMajorItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchoolMajorItem.kt\ncom/baicizhan/biz/online/unified_user_service/SchoolMajorItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
    public static final class a implements ts.f<l> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f93327a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f93328b;

        public a() {
            this.f93327a = null;
            this.f93328b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l build() {
            String str = this.f93327a;
            if (str == null) {
                throw new IllegalStateException("Required field 'major_name' is missing");
            }
            Integer num = this.f93328b;
            if (num != null) {
                return new l(str, num.intValue());
            }
            throw new IllegalStateException("Required field 'major_id' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f93328b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.k String major_name) {
            g0.p(major_name, "major_name");
            this.f93327a = major_name;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93327a = null;
            this.f93328b = null;
        }

        public a(@m80.k l source) {
            g0.p(source, "source");
            this.f93327a = source.f93325a;
            this.f93328b = Integer.valueOf(source.f93326b);
        }
    }
}
