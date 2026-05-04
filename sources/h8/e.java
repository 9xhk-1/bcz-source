package h8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final c f58885h = new c(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<e, b> f58886i = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f58887a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58888b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58889c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58890d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58891e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58892f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58893g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<e, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            builder.f(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k e struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AvatarAreaInfo");
            protocol.Q6("area_id", 1, (byte) 8);
            protocol.l5(struct.f58887a);
            protocol.N2();
            protocol.Q6("area_cn", 2, (byte) 11);
            protocol.p1(struct.f58888b);
            protocol.N2();
            protocol.Q6("area_en", 3, (byte) 11);
            protocol.p1(struct.f58889c);
            protocol.N2();
            protocol.Q6("area_upgrade_text", 4, (byte) 11);
            protocol.p1(struct.f58890d);
            protocol.N2();
            protocol.Q6("area_icon", 5, (byte) 11);
            protocol.p1(struct.f58891e);
            protocol.N2();
            protocol.Q6("area_desc", 6, (byte) 11);
            protocol.p1(struct.f58892f);
            protocol.N2();
            protocol.Q6("area_bg_pic", 7, (byte) 11);
            protocol.p1(struct.f58893g);
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

    public e(int i11, @m80.k String area_cn, @m80.k String area_en, @m80.k String area_upgrade_text, @m80.k String area_icon, @m80.k String area_desc, @m80.k String area_bg_pic) {
        g0.p(area_cn, "area_cn");
        g0.p(area_en, "area_en");
        g0.p(area_upgrade_text, "area_upgrade_text");
        g0.p(area_icon, "area_icon");
        g0.p(area_desc, "area_desc");
        g0.p(area_bg_pic, "area_bg_pic");
        this.f58887a = i11;
        this.f58888b = area_cn;
        this.f58889c = area_en;
        this.f58890d = area_upgrade_text;
        this.f58891e = area_icon;
        this.f58892f = area_desc;
        this.f58893g = area_bg_pic;
    }

    public static /* synthetic */ e i(e eVar, int i11, String str, String str2, String str3, String str4, String str5, String str6, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = eVar.f58887a;
        }
        if ((i12 & 2) != 0) {
            str = eVar.f58888b;
        }
        if ((i12 & 4) != 0) {
            str2 = eVar.f58889c;
        }
        if ((i12 & 8) != 0) {
            str3 = eVar.f58890d;
        }
        if ((i12 & 16) != 0) {
            str4 = eVar.f58891e;
        }
        if ((i12 & 32) != 0) {
            str5 = eVar.f58892f;
        }
        if ((i12 & 64) != 0) {
            str6 = eVar.f58893g;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return eVar.h(i11, str, str10, str3, str9, str7, str8);
    }

    public final int a() {
        return this.f58887a;
    }

    @m80.k
    public final String b() {
        return this.f58888b;
    }

    @m80.k
    public final String c() {
        return this.f58889c;
    }

    @m80.k
    public final String d() {
        return this.f58890d;
    }

    @m80.k
    public final String e() {
        return this.f58891e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f58887a == eVar.f58887a && g0.g(this.f58888b, eVar.f58888b) && g0.g(this.f58889c, eVar.f58889c) && g0.g(this.f58890d, eVar.f58890d) && g0.g(this.f58891e, eVar.f58891e) && g0.g(this.f58892f, eVar.f58892f) && g0.g(this.f58893g, eVar.f58893g);
    }

    @m80.k
    public final String f() {
        return this.f58892f;
    }

    @m80.k
    public final String g() {
        return this.f58893g;
    }

    @m80.k
    public final e h(int i11, @m80.k String area_cn, @m80.k String area_en, @m80.k String area_upgrade_text, @m80.k String area_icon, @m80.k String area_desc, @m80.k String area_bg_pic) {
        g0.p(area_cn, "area_cn");
        g0.p(area_en, "area_en");
        g0.p(area_upgrade_text, "area_upgrade_text");
        g0.p(area_icon, "area_icon");
        g0.p(area_desc, "area_desc");
        g0.p(area_bg_pic, "area_bg_pic");
        return new e(i11, area_cn, area_en, area_upgrade_text, area_icon, area_desc, area_bg_pic);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f58887a) * 31) + this.f58888b.hashCode()) * 31) + this.f58889c.hashCode()) * 31) + this.f58890d.hashCode()) * 31) + this.f58891e.hashCode()) * 31) + this.f58892f.hashCode()) * 31) + this.f58893g.hashCode();
    }

    @m80.k
    public String toString() {
        return "AvatarAreaInfo(area_id=" + this.f58887a + ", area_cn=" + this.f58888b + ", area_en=" + this.f58889c + ", area_upgrade_text=" + this.f58890d + ", area_icon=" + this.f58891e + ", area_desc=" + this.f58892f + ", area_bg_pic=" + this.f58893g + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f58886i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAvatarAreaInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarAreaInfo.kt\ncom/baicizhan/biz/online/avatar_api/AvatarAreaInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,267:1\n1#2:268\n*E\n"})
    public static final class b implements ts.f<e> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f58894a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f58895b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f58896c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f58897d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f58898e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f58899f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f58900g;

        public b() {
            this.f58894a = null;
            this.f58895b = null;
            this.f58896c = null;
            this.f58897d = null;
            this.f58898e = null;
            this.f58899f = null;
            this.f58900g = null;
        }

        @m80.k
        public final b a(@m80.k String area_bg_pic) {
            g0.p(area_bg_pic, "area_bg_pic");
            this.f58900g = area_bg_pic;
            return this;
        }

        @m80.k
        public final b b(@m80.k String area_cn) {
            g0.p(area_cn, "area_cn");
            this.f58895b = area_cn;
            return this;
        }

        @m80.k
        public final b c(@m80.k String area_desc) {
            g0.p(area_desc, "area_desc");
            this.f58899f = area_desc;
            return this;
        }

        @m80.k
        public final b d(@m80.k String area_en) {
            g0.p(area_en, "area_en");
            this.f58896c = area_en;
            return this;
        }

        @m80.k
        public final b e(@m80.k String area_icon) {
            g0.p(area_icon, "area_icon");
            this.f58898e = area_icon;
            return this;
        }

        @m80.k
        public final b f(int i11) {
            this.f58894a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b g(@m80.k String area_upgrade_text) {
            g0.p(area_upgrade_text, "area_upgrade_text");
            this.f58897d = area_upgrade_text;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public e build() {
            Integer num = this.f58894a;
            if (num == null) {
                throw new IllegalStateException("Required field 'area_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f58895b;
            if (str == null) {
                throw new IllegalStateException("Required field 'area_cn' is missing");
            }
            String str2 = this.f58896c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'area_en' is missing");
            }
            String str3 = this.f58897d;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'area_upgrade_text' is missing");
            }
            String str4 = this.f58898e;
            if (str4 == null) {
                throw new IllegalStateException("Required field 'area_icon' is missing");
            }
            String str5 = this.f58899f;
            if (str5 == null) {
                throw new IllegalStateException("Required field 'area_desc' is missing");
            }
            String str6 = this.f58900g;
            if (str6 != null) {
                return new e(intValue, str, str2, str3, str4, str5, str6);
            }
            throw new IllegalStateException("Required field 'area_bg_pic' is missing");
        }

        @Override // ts.f
        public void reset() {
            this.f58894a = null;
            this.f58895b = null;
            this.f58896c = null;
            this.f58897d = null;
            this.f58898e = null;
            this.f58899f = null;
            this.f58900g = null;
        }

        public b(@m80.k e source) {
            g0.p(source, "source");
            this.f58894a = Integer.valueOf(source.f58887a);
            this.f58895b = source.f58888b;
            this.f58896c = source.f58889c;
            this.f58897d = source.f58890d;
            this.f58898e = source.f58891e;
            this.f58899f = source.f58892f;
            this.f58900g = source.f58893g;
        }
    }
}
