package v8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class m implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f93329d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<m, a> f93330e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f93331a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f93332b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93333c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
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
                        if (s11 != 3) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 11) {
                            builder.b(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
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
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k m struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("SchoolMajorRequest");
            protocol.Q6("page_num", 1, (byte) 8);
            protocol.l5(struct.f93331a);
            protocol.N2();
            protocol.Q6("page_size", 2, (byte) 8);
            protocol.l5(struct.f93332b);
            protocol.N2();
            if (struct.f93333c != null) {
                protocol.Q6("major_key", 3, (byte) 11);
                protocol.p1(struct.f93333c);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public m(int i11, int i12, @m80.l String str) {
        this.f93331a = i11;
        this.f93332b = i12;
        this.f93333c = str;
    }

    public static /* synthetic */ m e(m mVar, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = mVar.f93331a;
        }
        if ((i13 & 2) != 0) {
            i12 = mVar.f93332b;
        }
        if ((i13 & 4) != 0) {
            str = mVar.f93333c;
        }
        return mVar.d(i11, i12, str);
    }

    public final int a() {
        return this.f93331a;
    }

    public final int b() {
        return this.f93332b;
    }

    @m80.l
    public final String c() {
        return this.f93333c;
    }

    @m80.k
    public final m d(int i11, int i12, @m80.l String str) {
        return new m(i11, i12, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f93331a == mVar.f93331a && this.f93332b == mVar.f93332b && g0.g(this.f93333c, mVar.f93333c);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f93331a) * 31) + Integer.hashCode(this.f93332b)) * 31;
        String str = this.f93333c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "SchoolMajorRequest(page_num=" + this.f93331a + ", page_size=" + this.f93332b + ", major_key=" + this.f93333c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93330e.write(protocol, this);
    }

    public /* synthetic */ m(int i11, int i12, String str, int i13, kotlin.jvm.internal.v vVar) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 20 : i12, str);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSchoolMajorRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchoolMajorRequest.kt\ncom/baicizhan/biz/online/unified_user_service/SchoolMajorRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
    public static final class a implements ts.f<m> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f93334a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f93335b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f93336c;

        public a() {
            this.f93334a = 0;
            this.f93335b = 20;
            this.f93334a = 0;
            this.f93335b = 20;
            this.f93336c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m build() {
            Integer num = this.f93334a;
            if (num == null) {
                throw new IllegalStateException("Required field 'page_num' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f93335b;
            if (num2 != null) {
                return new m(intValue, num2.intValue(), this.f93336c);
            }
            throw new IllegalStateException("Required field 'page_size' is missing");
        }

        @m80.k
        public final a b(@m80.l String str) {
            this.f93336c = str;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f93334a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f93335b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93334a = 0;
            this.f93335b = 20;
            this.f93336c = null;
        }

        public a(@m80.k m source) {
            g0.p(source, "source");
            this.f93334a = 0;
            this.f93335b = 20;
            this.f93334a = Integer.valueOf(source.f93331a);
            this.f93335b = Integer.valueOf(source.f93332b);
            this.f93336c = source.f93333c;
        }
    }
}
