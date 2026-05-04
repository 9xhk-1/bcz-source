package h8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final c f58901e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<f, b> f58902f = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f58903a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58904b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58905c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58906d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<f, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol, @m80.k b builder) {
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
                                builder.d(protocol.readString());
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
                } else if (b11 == 8) {
                    builder.e(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k f struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AvatarBasicInfo");
            protocol.Q6("ip_type", 1, (byte) 8);
            protocol.l5(struct.f58903a);
            protocol.N2();
            protocol.Q6("ip_cn", 2, (byte) 11);
            protocol.p1(struct.f58904b);
            protocol.N2();
            protocol.Q6("ip_en", 3, (byte) 11);
            protocol.p1(struct.f58905c);
            protocol.N2();
            protocol.Q6("ip_tag", 4, (byte) 11);
            protocol.p1(struct.f58906d);
            protocol.N2();
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

    public f(int i11, @m80.k String ip_cn, @m80.k String ip_en, @m80.k String ip_tag) {
        g0.p(ip_cn, "ip_cn");
        g0.p(ip_en, "ip_en");
        g0.p(ip_tag, "ip_tag");
        this.f58903a = i11;
        this.f58904b = ip_cn;
        this.f58905c = ip_en;
        this.f58906d = ip_tag;
    }

    public static /* synthetic */ f f(f fVar, int i11, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = fVar.f58903a;
        }
        if ((i12 & 2) != 0) {
            str = fVar.f58904b;
        }
        if ((i12 & 4) != 0) {
            str2 = fVar.f58905c;
        }
        if ((i12 & 8) != 0) {
            str3 = fVar.f58906d;
        }
        return fVar.e(i11, str, str2, str3);
    }

    public final int a() {
        return this.f58903a;
    }

    @m80.k
    public final String b() {
        return this.f58904b;
    }

    @m80.k
    public final String c() {
        return this.f58905c;
    }

    @m80.k
    public final String d() {
        return this.f58906d;
    }

    @m80.k
    public final f e(int i11, @m80.k String ip_cn, @m80.k String ip_en, @m80.k String ip_tag) {
        g0.p(ip_cn, "ip_cn");
        g0.p(ip_en, "ip_en");
        g0.p(ip_tag, "ip_tag");
        return new f(i11, ip_cn, ip_en, ip_tag);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f58903a == fVar.f58903a && g0.g(this.f58904b, fVar.f58904b) && g0.g(this.f58905c, fVar.f58905c) && g0.g(this.f58906d, fVar.f58906d);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f58903a) * 31) + this.f58904b.hashCode()) * 31) + this.f58905c.hashCode()) * 31) + this.f58906d.hashCode();
    }

    @m80.k
    public String toString() {
        return "AvatarBasicInfo(ip_type=" + this.f58903a + ", ip_cn=" + this.f58904b + ", ip_en=" + this.f58905c + ", ip_tag=" + this.f58906d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f58902f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAvatarBasicInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarBasicInfo.kt\ncom/baicizhan/biz/online/avatar_api/AvatarBasicInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
    public static final class b implements ts.f<f> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f58907a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f58908b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f58909c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f58910d;

        public b() {
            this.f58907a = null;
            this.f58908b = null;
            this.f58909c = null;
            this.f58910d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f build() {
            Integer num = this.f58907a;
            if (num == null) {
                throw new IllegalStateException("Required field 'ip_type' is missing");
            }
            int intValue = num.intValue();
            String str = this.f58908b;
            if (str == null) {
                throw new IllegalStateException("Required field 'ip_cn' is missing");
            }
            String str2 = this.f58909c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'ip_en' is missing");
            }
            String str3 = this.f58910d;
            if (str3 != null) {
                return new f(intValue, str, str2, str3);
            }
            throw new IllegalStateException("Required field 'ip_tag' is missing");
        }

        @m80.k
        public final b b(@m80.k String ip_cn) {
            g0.p(ip_cn, "ip_cn");
            this.f58908b = ip_cn;
            return this;
        }

        @m80.k
        public final b c(@m80.k String ip_en) {
            g0.p(ip_en, "ip_en");
            this.f58909c = ip_en;
            return this;
        }

        @m80.k
        public final b d(@m80.k String ip_tag) {
            g0.p(ip_tag, "ip_tag");
            this.f58910d = ip_tag;
            return this;
        }

        @m80.k
        public final b e(int i11) {
            this.f58907a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f58907a = null;
            this.f58908b = null;
            this.f58909c = null;
            this.f58910d = null;
        }

        public b(@m80.k f source) {
            g0.p(source, "source");
            this.f58907a = Integer.valueOf(source.f58903a);
            this.f58908b = source.f58904b;
            this.f58909c = source.f58905c;
            this.f58910d = source.f58906d;
        }
    }
}
