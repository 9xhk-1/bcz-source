package y8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f99543c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<e, a> f99544d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f99545a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f99546b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<e, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        builder.b(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k e struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("MachineBindHint");
            protocol.Q6("text", 1, (byte) 11);
            protocol.p1(struct.f99545a);
            protocol.N2();
            protocol.Q6("pic", 2, (byte) 11);
            protocol.p1(struct.f99546b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public e(@m80.k String text, @m80.k String pic) {
        g0.p(text, "text");
        g0.p(pic, "pic");
        this.f99545a = text;
        this.f99546b = pic;
    }

    public static /* synthetic */ e d(e eVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = eVar.f99545a;
        }
        if ((i11 & 2) != 0) {
            str2 = eVar.f99546b;
        }
        return eVar.c(str, str2);
    }

    @m80.k
    public final String a() {
        return this.f99545a;
    }

    @m80.k
    public final String b() {
        return this.f99546b;
    }

    @m80.k
    public final e c(@m80.k String text, @m80.k String pic) {
        g0.p(text, "text");
        g0.p(pic, "pic");
        return new e(text, pic);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return g0.g(this.f99545a, eVar.f99545a) && g0.g(this.f99546b, eVar.f99546b);
    }

    public int hashCode() {
        return (this.f99545a.hashCode() * 31) + this.f99546b.hashCode();
    }

    @m80.k
    public String toString() {
        return "MachineBindHint(text=" + this.f99545a + ", pic=" + this.f99546b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f99544d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMachineBindHint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MachineBindHint.kt\ncom/baicizhan/biz/online/user_book/MachineBindHint$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
    public static final class a implements ts.f<e> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f99547a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f99548b;

        public a() {
            this.f99547a = null;
            this.f99548b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e build() {
            String str = this.f99547a;
            if (str == null) {
                throw new IllegalStateException("Required field 'text' is missing");
            }
            String str2 = this.f99548b;
            if (str2 != null) {
                return new e(str, str2);
            }
            throw new IllegalStateException("Required field 'pic' is missing");
        }

        @m80.k
        public final a b(@m80.k String pic) {
            g0.p(pic, "pic");
            this.f99548b = pic;
            return this;
        }

        @m80.k
        public final a c(@m80.k String text) {
            g0.p(text, "text");
            this.f99547a = text;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f99547a = null;
            this.f99548b = null;
        }

        public a(@m80.k e source) {
            g0.p(source, "source");
            this.f99547a = source.f99545a;
            this.f99548b = source.f99546b;
        }
    }
}
