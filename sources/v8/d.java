package v8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d implements ts.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final c f93265b = new c(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<d, b> f93266c = new a();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93267a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<d, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d read(@m80.k ws.i protocol, @m80.k b builder) {
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
        public void write(@m80.k ws.i protocol, @m80.k d struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BindPhoneResult");
            if (struct.f93267a != null) {
                protocol.Q6("phone", 1, (byte) 11);
                protocol.p1(struct.f93267a);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public c() {
        }
    }

    public d(@m80.l String str) {
        this.f93267a = str;
    }

    public static /* synthetic */ d c(d dVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dVar.f93267a;
        }
        return dVar.b(str);
    }

    @m80.l
    public final String a() {
        return this.f93267a;
    }

    @m80.k
    public final d b(@m80.l String str) {
        return new d(str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && g0.g(this.f93267a, ((d) obj).f93267a);
    }

    public int hashCode() {
        String str = this.f93267a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @m80.k
    public String toString() {
        return "BindPhoneResult(phone=" + this.f93267a + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93266c.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBindPhoneResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BindPhoneResult.kt\ncom/baicizhan/biz/online/unified_user_service/BindPhoneResult$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
    public static final class b implements ts.f<d> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f93268a;

        public b() {
            this.f93268a = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d build() {
            return new d(this.f93268a);
        }

        @m80.k
        public final b b(@m80.l String str) {
            this.f93268a = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93268a = null;
        }

        public b(@m80.k d source) {
            g0.p(source, "source");
            this.f93268a = source.f93267a;
        }
    }
}
