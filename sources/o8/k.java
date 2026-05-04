package o8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f76447d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<k, a> f76448e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76449a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f76450b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f76451c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<k, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        } else if (b11 == 8) {
                            builder.d(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
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
        public void write(@m80.k ws.i protocol, @m80.k k struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("LineInfo");
            protocol.Q6("line_name", 1, (byte) 11);
            protocol.p1(struct.f76449a);
            protocol.N2();
            if (struct.f76450b != null) {
                protocol.Q6("line_url", 2, (byte) 11);
                protocol.p1(struct.f76450b);
                protocol.N2();
            }
            protocol.Q6("type", 3, (byte) 8);
            protocol.l5(struct.f76451c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public k(@m80.k String line_name, @m80.l String str, int i11) {
        g0.p(line_name, "line_name");
        this.f76449a = line_name;
        this.f76450b = str;
        this.f76451c = i11;
    }

    public static /* synthetic */ k e(k kVar, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = kVar.f76449a;
        }
        if ((i12 & 2) != 0) {
            str2 = kVar.f76450b;
        }
        if ((i12 & 4) != 0) {
            i11 = kVar.f76451c;
        }
        return kVar.d(str, str2, i11);
    }

    @m80.k
    public final String a() {
        return this.f76449a;
    }

    @m80.l
    public final String b() {
        return this.f76450b;
    }

    public final int c() {
        return this.f76451c;
    }

    @m80.k
    public final k d(@m80.k String line_name, @m80.l String str, int i11) {
        g0.p(line_name, "line_name");
        return new k(line_name, str, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return g0.g(this.f76449a, kVar.f76449a) && g0.g(this.f76450b, kVar.f76450b) && this.f76451c == kVar.f76451c;
    }

    public int hashCode() {
        int hashCode = this.f76449a.hashCode() * 31;
        String str = this.f76450b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f76451c);
    }

    @m80.k
    public String toString() {
        return "LineInfo(line_name=" + this.f76449a + ", line_url=" + this.f76450b + ", type=" + this.f76451c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76448e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLineInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineInfo.kt\ncom/baicizhan/biz/online/course_api/LineInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
    public static final class a implements ts.f<k> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f76452a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f76453b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f76454c;

        public a() {
            this.f76452a = null;
            this.f76453b = null;
            this.f76454c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k build() {
            String str = this.f76452a;
            if (str == null) {
                throw new IllegalStateException("Required field 'line_name' is missing");
            }
            String str2 = this.f76453b;
            Integer num = this.f76454c;
            if (num != null) {
                return new k(str, str2, num.intValue());
            }
            throw new IllegalStateException("Required field 'type' is missing");
        }

        @m80.k
        public final a b(@m80.k String line_name) {
            g0.p(line_name, "line_name");
            this.f76452a = line_name;
            return this;
        }

        @m80.k
        public final a c(@m80.l String str) {
            this.f76453b = str;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f76454c = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76452a = null;
            this.f76453b = null;
            this.f76454c = null;
        }

        public a(@m80.k k source) {
            g0.p(source, "source");
            this.f76452a = source.f76449a;
            this.f76453b = source.f76450b;
            this.f76454c = Integer.valueOf(source.f76451c);
        }
    }
}
