package h8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final c f58911g = new c(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<g, b> f58912h = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f58913a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f58914b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58915c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58916d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58917e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58918f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<g, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g read(@m80.k ws.i protocol, @m80.k b builder) {
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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    default:
                        at.b.a(protocol, b11);
                        break;
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k g struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AvatarGiftInfo");
            protocol.Q6("gift_id", 1, (byte) 8);
            protocol.l5(struct.f58913a);
            protocol.N2();
            protocol.Q6("gift_type", 2, (byte) 8);
            protocol.l5(struct.f58914b);
            protocol.N2();
            protocol.Q6("gift_cn", 3, (byte) 11);
            protocol.p1(struct.f58915c);
            protocol.N2();
            protocol.Q6("gift_pic", 4, (byte) 11);
            protocol.p1(struct.f58916d);
            protocol.N2();
            protocol.Q6("gift_cn_pic", 5, (byte) 11);
            protocol.p1(struct.f58917e);
            protocol.N2();
            protocol.Q6("gift_en_pic", 6, (byte) 11);
            protocol.p1(struct.f58918f);
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

    public g(int i11, int i12, @m80.k String gift_cn, @m80.k String gift_pic, @m80.k String gift_cn_pic, @m80.k String gift_en_pic) {
        g0.p(gift_cn, "gift_cn");
        g0.p(gift_pic, "gift_pic");
        g0.p(gift_cn_pic, "gift_cn_pic");
        g0.p(gift_en_pic, "gift_en_pic");
        this.f58913a = i11;
        this.f58914b = i12;
        this.f58915c = gift_cn;
        this.f58916d = gift_pic;
        this.f58917e = gift_cn_pic;
        this.f58918f = gift_en_pic;
    }

    public static /* synthetic */ g h(g gVar, int i11, int i12, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = gVar.f58913a;
        }
        if ((i13 & 2) != 0) {
            i12 = gVar.f58914b;
        }
        if ((i13 & 4) != 0) {
            str = gVar.f58915c;
        }
        if ((i13 & 8) != 0) {
            str2 = gVar.f58916d;
        }
        if ((i13 & 16) != 0) {
            str3 = gVar.f58917e;
        }
        if ((i13 & 32) != 0) {
            str4 = gVar.f58918f;
        }
        String str5 = str3;
        String str6 = str4;
        return gVar.g(i11, i12, str, str2, str5, str6);
    }

    public final int a() {
        return this.f58913a;
    }

    public final int b() {
        return this.f58914b;
    }

    @m80.k
    public final String c() {
        return this.f58915c;
    }

    @m80.k
    public final String d() {
        return this.f58916d;
    }

    @m80.k
    public final String e() {
        return this.f58917e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f58913a == gVar.f58913a && this.f58914b == gVar.f58914b && g0.g(this.f58915c, gVar.f58915c) && g0.g(this.f58916d, gVar.f58916d) && g0.g(this.f58917e, gVar.f58917e) && g0.g(this.f58918f, gVar.f58918f);
    }

    @m80.k
    public final String f() {
        return this.f58918f;
    }

    @m80.k
    public final g g(int i11, int i12, @m80.k String gift_cn, @m80.k String gift_pic, @m80.k String gift_cn_pic, @m80.k String gift_en_pic) {
        g0.p(gift_cn, "gift_cn");
        g0.p(gift_pic, "gift_pic");
        g0.p(gift_cn_pic, "gift_cn_pic");
        g0.p(gift_en_pic, "gift_en_pic");
        return new g(i11, i12, gift_cn, gift_pic, gift_cn_pic, gift_en_pic);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f58913a) * 31) + Integer.hashCode(this.f58914b)) * 31) + this.f58915c.hashCode()) * 31) + this.f58916d.hashCode()) * 31) + this.f58917e.hashCode()) * 31) + this.f58918f.hashCode();
    }

    @m80.k
    public String toString() {
        return "AvatarGiftInfo(gift_id=" + this.f58913a + ", gift_type=" + this.f58914b + ", gift_cn=" + this.f58915c + ", gift_pic=" + this.f58916d + ", gift_cn_pic=" + this.f58917e + ", gift_en_pic=" + this.f58918f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f58912h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAvatarGiftInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarGiftInfo.kt\ncom/baicizhan/biz/online/avatar_api/AvatarGiftInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
    public static final class b implements ts.f<g> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f58919a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f58920b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f58921c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f58922d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f58923e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f58924f;

        public b() {
            this.f58919a = null;
            this.f58920b = null;
            this.f58921c = null;
            this.f58922d = null;
            this.f58923e = null;
            this.f58924f = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g build() {
            Integer num = this.f58919a;
            if (num == null) {
                throw new IllegalStateException("Required field 'gift_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f58920b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'gift_type' is missing");
            }
            int intValue2 = num2.intValue();
            String str = this.f58921c;
            if (str == null) {
                throw new IllegalStateException("Required field 'gift_cn' is missing");
            }
            String str2 = this.f58922d;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'gift_pic' is missing");
            }
            String str3 = this.f58923e;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'gift_cn_pic' is missing");
            }
            String str4 = this.f58924f;
            if (str4 != null) {
                return new g(intValue, intValue2, str, str2, str3, str4);
            }
            throw new IllegalStateException("Required field 'gift_en_pic' is missing");
        }

        @m80.k
        public final b b(@m80.k String gift_cn) {
            g0.p(gift_cn, "gift_cn");
            this.f58921c = gift_cn;
            return this;
        }

        @m80.k
        public final b c(@m80.k String gift_cn_pic) {
            g0.p(gift_cn_pic, "gift_cn_pic");
            this.f58923e = gift_cn_pic;
            return this;
        }

        @m80.k
        public final b d(@m80.k String gift_en_pic) {
            g0.p(gift_en_pic, "gift_en_pic");
            this.f58924f = gift_en_pic;
            return this;
        }

        @m80.k
        public final b e(int i11) {
            this.f58919a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b f(@m80.k String gift_pic) {
            g0.p(gift_pic, "gift_pic");
            this.f58922d = gift_pic;
            return this;
        }

        @m80.k
        public final b g(int i11) {
            this.f58920b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f58919a = null;
            this.f58920b = null;
            this.f58921c = null;
            this.f58922d = null;
            this.f58923e = null;
            this.f58924f = null;
        }

        public b(@m80.k g source) {
            g0.p(source, "source");
            this.f58919a = Integer.valueOf(source.f58913a);
            this.f58920b = Integer.valueOf(source.f58914b);
            this.f58921c = source.f58915c;
            this.f58922d = source.f58916d;
            this.f58923e = source.f58917e;
            this.f58924f = source.f58918f;
        }
    }
}
