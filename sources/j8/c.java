package j8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final C0740c f63742d = new C0740c(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<c, b> f63743e = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f63744a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63745b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63746c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<c, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c read(@m80.k ws.i protocol, @m80.k b builder) {
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
                        builder.d(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k c struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AppNewVersionResult");
            protocol.Q6("type", 1, (byte) 8);
            protocol.l5(struct.f63744a);
            protocol.N2();
            protocol.Q6("version_description", 2, (byte) 11);
            protocol.p1(struct.f63745b);
            protocol.N2();
            protocol.Q6("new_version", 3, (byte) 11);
            protocol.p1(struct.f63746c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: j8.c$c, reason: collision with other inner class name */
    public static final class C0740c {
        public /* synthetic */ C0740c(v vVar) {
            this();
        }

        public C0740c() {
        }
    }

    public c(int i11, @m80.k String version_description, @m80.k String new_version) {
        g0.p(version_description, "version_description");
        g0.p(new_version, "new_version");
        this.f63744a = i11;
        this.f63745b = version_description;
        this.f63746c = new_version;
    }

    public static /* synthetic */ c e(c cVar, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cVar.f63744a;
        }
        if ((i12 & 2) != 0) {
            str = cVar.f63745b;
        }
        if ((i12 & 4) != 0) {
            str2 = cVar.f63746c;
        }
        return cVar.d(i11, str, str2);
    }

    public final int a() {
        return this.f63744a;
    }

    @m80.k
    public final String b() {
        return this.f63745b;
    }

    @m80.k
    public final String c() {
        return this.f63746c;
    }

    @m80.k
    public final c d(int i11, @m80.k String version_description, @m80.k String new_version) {
        g0.p(version_description, "version_description");
        g0.p(new_version, "new_version");
        return new c(i11, version_description, new_version);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f63744a == cVar.f63744a && g0.g(this.f63745b, cVar.f63745b) && g0.g(this.f63746c, cVar.f63746c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f63744a) * 31) + this.f63745b.hashCode()) * 31) + this.f63746c.hashCode();
    }

    @m80.k
    public String toString() {
        return "AppNewVersionResult(type=" + this.f63744a + ", version_description=" + this.f63745b + ", new_version=" + this.f63746c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f63743e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAppNewVersionResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppNewVersionResult.kt\ncom/baicizhan/biz/online/bcz_system_api/AppNewVersionResult$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
    public static final class b implements ts.f<c> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f63747a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f63748b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f63749c;

        public b() {
            this.f63747a = null;
            this.f63748b = null;
            this.f63749c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c build() {
            Integer num = this.f63747a;
            if (num == null) {
                throw new IllegalStateException("Required field 'type' is missing");
            }
            int intValue = num.intValue();
            String str = this.f63748b;
            if (str == null) {
                throw new IllegalStateException("Required field 'version_description' is missing");
            }
            String str2 = this.f63749c;
            if (str2 != null) {
                return new c(intValue, str, str2);
            }
            throw new IllegalStateException("Required field 'new_version' is missing");
        }

        @m80.k
        public final b b(@m80.k String new_version) {
            g0.p(new_version, "new_version");
            this.f63749c = new_version;
            return this;
        }

        @m80.k
        public final b c(int i11) {
            this.f63747a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b d(@m80.k String version_description) {
            g0.p(version_description, "version_description");
            this.f63748b = version_description;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f63747a = null;
            this.f63748b = null;
            this.f63749c = null;
        }

        public b(@m80.k c source) {
            g0.p(source, "source");
            this.f63747a = Integer.valueOf(source.f63744a);
            this.f63748b = source.f63745b;
            this.f63749c = source.f63746c;
        }
    }
}
