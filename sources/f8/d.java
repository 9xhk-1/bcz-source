package f8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ts.e;
import ts.f;
import w00.g;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d implements e {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final c f51284e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    @g
    @k
    public static final ts.a<d, b> f51285f = new a();

    /* renamed from: a, reason: collision with root package name */
    @l
    @g
    public final String f51286a;

    /* renamed from: b, reason: collision with root package name */
    @l
    @g
    public final String f51287b;

    /* renamed from: c, reason: collision with root package name */
    @l
    @g
    public final Integer f51288c;

    /* renamed from: d, reason: collision with root package name */
    @l
    @g
    public final String f51289d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<d, b> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d read(@k i protocol, @k b builder) {
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
                            if (s11 != 4) {
                                at.b.a(protocol, b11);
                            } else if (b11 == 11) {
                                builder.a(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.e(Integer.valueOf(protocol.s8()));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.d(protocol.readString());
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
        public void write(@k i protocol, @k d struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AdLunchWechatProgram");
            if (struct.f51286a != null) {
                protocol.Q6("program_id", 1, (byte) 11);
                protocol.p1(struct.f51286a);
                protocol.N2();
            }
            if (struct.f51287b != null) {
                protocol.Q6("program_path", 2, (byte) 11);
                protocol.p1(struct.f51287b);
                protocol.N2();
            }
            if (struct.f51288c != null) {
                protocol.Q6("program_type", 3, (byte) 8);
                protocol.l5(struct.f51288c.intValue());
                protocol.N2();
            }
            if (struct.f51289d != null) {
                protocol.Q6("bind_app", 4, (byte) 11);
                protocol.p1(struct.f51289d);
                protocol.N2();
            }
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

    public d(@l String str, @l String str2, @l Integer num, @l String str3) {
        this.f51286a = str;
        this.f51287b = str2;
        this.f51288c = num;
        this.f51289d = str3;
    }

    public static /* synthetic */ d f(d dVar, String str, String str2, Integer num, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dVar.f51286a;
        }
        if ((i11 & 2) != 0) {
            str2 = dVar.f51287b;
        }
        if ((i11 & 4) != 0) {
            num = dVar.f51288c;
        }
        if ((i11 & 8) != 0) {
            str3 = dVar.f51289d;
        }
        return dVar.e(str, str2, num, str3);
    }

    @l
    public final String a() {
        return this.f51286a;
    }

    @l
    public final String b() {
        return this.f51287b;
    }

    @l
    public final Integer c() {
        return this.f51288c;
    }

    @l
    public final String d() {
        return this.f51289d;
    }

    @k
    public final d e(@l String str, @l String str2, @l Integer num, @l String str3) {
        return new d(str, str2, num, str3);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return g0.g(this.f51286a, dVar.f51286a) && g0.g(this.f51287b, dVar.f51287b) && g0.g(this.f51288c, dVar.f51288c) && g0.g(this.f51289d, dVar.f51289d);
    }

    public int hashCode() {
        String str = this.f51286a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f51287b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f51288c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f51289d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AdLunchWechatProgram(program_id=" + this.f51286a + ", program_path=" + this.f51287b + ", program_type=" + this.f51288c + ", bind_app=" + this.f51289d + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f51285f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAdLunchWechatProgram.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdLunchWechatProgram.kt\ncom/baicizhan/biz/online/ad_property/AdLunchWechatProgram$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
    public static final class b implements f<d> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public String f51290a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f51291b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Integer f51292c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public String f51293d;

        public b() {
            this.f51290a = null;
            this.f51291b = null;
            this.f51292c = null;
            this.f51293d = null;
        }

        @k
        public final b a(@l String str) {
            this.f51293d = str;
            return this;
        }

        @Override // ts.f
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d build() {
            return new d(this.f51290a, this.f51291b, this.f51292c, this.f51293d);
        }

        @k
        public final b c(@l String str) {
            this.f51290a = str;
            return this;
        }

        @k
        public final b d(@l String str) {
            this.f51291b = str;
            return this;
        }

        @k
        public final b e(@l Integer num) {
            this.f51292c = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f51290a = null;
            this.f51291b = null;
            this.f51292c = null;
            this.f51293d = null;
        }

        public b(@k d source) {
            g0.p(source, "source");
            this.f51290a = source.f51286a;
            this.f51291b = source.f51287b;
            this.f51292c = source.f51288c;
            this.f51293d = source.f51289d;
        }
    }
}
