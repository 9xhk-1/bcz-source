package w8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import md.j;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C1285b f95705c = new C1285b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<b, a> f95706d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @k
    public final String f95707a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public final String f95708b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: w8.b$b, reason: collision with other inner class name */
    public static final class C1285b {
        public /* synthetic */ C1285b(v vVar) {
            this();
        }

        public C1285b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<b, a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b read(@k i protocol, @k a builder) {
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
                    } else if (b11 == 11) {
                        builder.c(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.b(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@k i protocol, @k b struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ExportBanner");
            protocol.Q6(com.baicizhan.main.activity.schedule_v2.e.f19255e, 1, (byte) 11);
            protocol.p1(struct.f95707a);
            protocol.N2();
            protocol.Q6(j.f73126f, 2, (byte) 11);
            protocol.p1(struct.f95708b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public b(@k String img_url, @k String jump_url) {
        g0.p(img_url, "img_url");
        g0.p(jump_url, "jump_url");
        this.f95707a = img_url;
        this.f95708b = jump_url;
    }

    public static /* synthetic */ b d(b bVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bVar.f95707a;
        }
        if ((i11 & 2) != 0) {
            str2 = bVar.f95708b;
        }
        return bVar.c(str, str2);
    }

    @k
    public final String a() {
        return this.f95707a;
    }

    @k
    public final String b() {
        return this.f95708b;
    }

    @k
    public final b c(@k String img_url, @k String jump_url) {
        g0.p(img_url, "img_url");
        g0.p(jump_url, "jump_url");
        return new b(img_url, jump_url);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g0.g(this.f95707a, bVar.f95707a) && g0.g(this.f95708b, bVar.f95708b);
    }

    public int hashCode() {
        return (this.f95707a.hashCode() * 31) + this.f95708b.hashCode();
    }

    @k
    public String toString() {
        return "ExportBanner(img_url=" + this.f95707a + ", jump_url=" + this.f95708b + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f95706d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nExportBanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportBanner.kt\ncom/baicizhan/biz/online/user_activity_api/ExportBanner$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
    public static final class a implements ts.f<b> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public String f95709a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f95710b;

        public a() {
            this.f95709a = null;
            this.f95710b = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b build() {
            String str = this.f95709a;
            if (str == null) {
                throw new IllegalStateException("Required field 'img_url' is missing");
            }
            String str2 = this.f95710b;
            if (str2 != null) {
                return new b(str, str2);
            }
            throw new IllegalStateException("Required field 'jump_url' is missing");
        }

        @k
        public final a b(@k String img_url) {
            g0.p(img_url, "img_url");
            this.f95709a = img_url;
            return this;
        }

        @k
        public final a c(@k String jump_url) {
            g0.p(jump_url, "jump_url");
            this.f95710b = jump_url;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f95709a = null;
            this.f95710b = null;
        }

        public a(@k b source) {
            g0.p(source, "source");
            this.f95709a = source.f95707a;
            this.f95710b = source.f95708b;
        }
    }
}
