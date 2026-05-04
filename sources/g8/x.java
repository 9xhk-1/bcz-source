package g8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class x implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final b f53425h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<x, a> f53426i = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53427a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f53428b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53429c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53430d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53431e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f53432f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f53433g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<x, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k x struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ShoppingAd");
            protocol.Q6("ad_url", 1, (byte) 11);
            protocol.p1(struct.f53427a);
            protocol.N2();
            protocol.Q6("click_type", 2, (byte) 8);
            protocol.l5(struct.f53428b);
            protocol.N2();
            protocol.Q6("text", 3, (byte) 11);
            protocol.p1(struct.f53429c);
            protocol.N2();
            protocol.Q6("color", 4, (byte) 11);
            protocol.p1(struct.f53430d);
            protocol.N2();
            if (struct.f53431e != null) {
                protocol.Q6("left_menu_ad_url", 5, (byte) 11);
                protocol.p1(struct.f53431e);
                protocol.N2();
            }
            if (struct.f53432f != null) {
                protocol.Q6(com.alipay.sdk.m.t.a.f11034k, 6, (byte) 8);
                protocol.l5(struct.f53432f.intValue());
                protocol.N2();
            }
            if (struct.f53433g != null) {
                protocol.Q6("is_new_mall", 7, (byte) 8);
                protocol.l5(struct.f53433g.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public x(@m80.k String ad_url, int i11, @m80.k String text, @m80.k String color, @m80.l String str, @m80.l Integer num, @m80.l Integer num2) {
        g0.p(ad_url, "ad_url");
        g0.p(text, "text");
        g0.p(color, "color");
        this.f53427a = ad_url;
        this.f53428b = i11;
        this.f53429c = text;
        this.f53430d = color;
        this.f53431e = str;
        this.f53432f = num;
        this.f53433g = num2;
    }

    public static /* synthetic */ x i(x xVar, String str, int i11, String str2, String str3, String str4, Integer num, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = xVar.f53427a;
        }
        if ((i12 & 2) != 0) {
            i11 = xVar.f53428b;
        }
        if ((i12 & 4) != 0) {
            str2 = xVar.f53429c;
        }
        if ((i12 & 8) != 0) {
            str3 = xVar.f53430d;
        }
        if ((i12 & 16) != 0) {
            str4 = xVar.f53431e;
        }
        if ((i12 & 32) != 0) {
            num = xVar.f53432f;
        }
        if ((i12 & 64) != 0) {
            num2 = xVar.f53433g;
        }
        Integer num3 = num;
        Integer num4 = num2;
        String str5 = str4;
        String str6 = str2;
        return xVar.h(str, i11, str6, str3, str5, num3, num4);
    }

    @m80.k
    public final String a() {
        return this.f53427a;
    }

    public final int b() {
        return this.f53428b;
    }

    @m80.k
    public final String c() {
        return this.f53429c;
    }

    @m80.k
    public final String d() {
        return this.f53430d;
    }

    @m80.l
    public final String e() {
        return this.f53431e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return g0.g(this.f53427a, xVar.f53427a) && this.f53428b == xVar.f53428b && g0.g(this.f53429c, xVar.f53429c) && g0.g(this.f53430d, xVar.f53430d) && g0.g(this.f53431e, xVar.f53431e) && g0.g(this.f53432f, xVar.f53432f) && g0.g(this.f53433g, xVar.f53433g);
    }

    @m80.l
    public final Integer f() {
        return this.f53432f;
    }

    @m80.l
    public final Integer g() {
        return this.f53433g;
    }

    @m80.k
    public final x h(@m80.k String ad_url, int i11, @m80.k String text, @m80.k String color, @m80.l String str, @m80.l Integer num, @m80.l Integer num2) {
        g0.p(ad_url, "ad_url");
        g0.p(text, "text");
        g0.p(color, "color");
        return new x(ad_url, i11, text, color, str, num, num2);
    }

    public int hashCode() {
        int hashCode = ((((((this.f53427a.hashCode() * 31) + Integer.hashCode(this.f53428b)) * 31) + this.f53429c.hashCode()) * 31) + this.f53430d.hashCode()) * 31;
        String str = this.f53431e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f53432f;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f53433g;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "ShoppingAd(ad_url=" + this.f53427a + ", click_type=" + this.f53428b + ", text=" + this.f53429c + ", color=" + this.f53430d + ", left_menu_ad_url=" + this.f53431e + ", timestamp=" + this.f53432f + ", is_new_mall=" + this.f53433g + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53426i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nShoppingAd.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingAd.kt\ncom/baicizhan/biz/online/advertise_api/ShoppingAd$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n1#2:266\n*E\n"})
    public static final class a implements ts.f<x> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f53434a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f53435b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f53436c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f53437d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f53438e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f53439f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f53440g;

        public a() {
            this.f53434a = null;
            this.f53435b = null;
            this.f53436c = null;
            this.f53437d = null;
            this.f53438e = null;
            this.f53439f = null;
            this.f53440g = null;
        }

        @m80.k
        public final a a(@m80.k String ad_url) {
            g0.p(ad_url, "ad_url");
            this.f53434a = ad_url;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x build() {
            String str = this.f53434a;
            if (str == null) {
                throw new IllegalStateException("Required field 'ad_url' is missing");
            }
            Integer num = this.f53435b;
            if (num == null) {
                throw new IllegalStateException("Required field 'click_type' is missing");
            }
            int intValue = num.intValue();
            String str2 = this.f53436c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'text' is missing");
            }
            String str3 = this.f53437d;
            if (str3 != null) {
                return new x(str, intValue, str2, str3, this.f53438e, this.f53439f, this.f53440g);
            }
            throw new IllegalStateException("Required field 'color' is missing");
        }

        @m80.k
        public final a c(int i11) {
            this.f53435b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.k String color) {
            g0.p(color, "color");
            this.f53437d = color;
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f53440g = num;
            return this;
        }

        @m80.k
        public final a f(@m80.l String str) {
            this.f53438e = str;
            return this;
        }

        @m80.k
        public final a g(@m80.k String text) {
            g0.p(text, "text");
            this.f53436c = text;
            return this;
        }

        @m80.k
        public final a h(@m80.l Integer num) {
            this.f53439f = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53434a = null;
            this.f53435b = null;
            this.f53436c = null;
            this.f53437d = null;
            this.f53438e = null;
            this.f53439f = null;
            this.f53440g = null;
        }

        public a(@m80.k x source) {
            g0.p(source, "source");
            this.f53434a = source.f53427a;
            this.f53435b = Integer.valueOf(source.f53428b);
            this.f53436c = source.f53429c;
            this.f53437d = source.f53430d;
            this.f53438e = source.f53431e;
            this.f53439f = source.f53432f;
            this.f53440g = source.f53433g;
        }
    }
}
