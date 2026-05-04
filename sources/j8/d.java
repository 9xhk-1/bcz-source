package j8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d implements ts.e {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final c f63750j = new c(null);

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<d, b> f63751k = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63752a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63753b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63754c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63755d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63756e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63757f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63758g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63759h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f63760i;

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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
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
                            builder.h(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
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
                            builder.b(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.readString());
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k d struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BczAppInfo");
            protocol.Q6("device_id", 1, (byte) 11);
            protocol.p1(struct.f63752a);
            protocol.N2();
            protocol.Q6("device_manufacturer", 2, (byte) 11);
            protocol.p1(struct.f63753b);
            protocol.N2();
            protocol.Q6("device_model", 3, (byte) 11);
            protocol.p1(struct.f63754c);
            protocol.N2();
            protocol.Q6("os_name", 4, (byte) 11);
            protocol.p1(struct.f63755d);
            protocol.N2();
            protocol.Q6("os_sdk", 5, (byte) 11);
            protocol.p1(struct.f63756e);
            protocol.N2();
            protocol.Q6("app_name", 6, (byte) 11);
            protocol.p1(struct.f63757f);
            protocol.N2();
            protocol.Q6("app_channel", 7, (byte) 11);
            protocol.p1(struct.f63758g);
            protocol.N2();
            protocol.Q6("user_position", 8, (byte) 11);
            protocol.p1(struct.f63759h);
            protocol.N2();
            if (struct.f63760i != null) {
                protocol.Q6("action", 9, (byte) 8);
                protocol.l5(struct.f63760i.intValue());
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

    public d(@m80.k String device_id, @m80.k String device_manufacturer, @m80.k String device_model, @m80.k String os_name, @m80.k String os_sdk, @m80.k String app_name, @m80.k String app_channel, @m80.k String user_position, @m80.l Integer num) {
        g0.p(device_id, "device_id");
        g0.p(device_manufacturer, "device_manufacturer");
        g0.p(device_model, "device_model");
        g0.p(os_name, "os_name");
        g0.p(os_sdk, "os_sdk");
        g0.p(app_name, "app_name");
        g0.p(app_channel, "app_channel");
        g0.p(user_position, "user_position");
        this.f63752a = device_id;
        this.f63753b = device_manufacturer;
        this.f63754c = device_model;
        this.f63755d = os_name;
        this.f63756e = os_sdk;
        this.f63757f = app_name;
        this.f63758g = app_channel;
        this.f63759h = user_position;
        this.f63760i = num;
    }

    public static /* synthetic */ d k(d dVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dVar.f63752a;
        }
        if ((i11 & 2) != 0) {
            str2 = dVar.f63753b;
        }
        if ((i11 & 4) != 0) {
            str3 = dVar.f63754c;
        }
        if ((i11 & 8) != 0) {
            str4 = dVar.f63755d;
        }
        if ((i11 & 16) != 0) {
            str5 = dVar.f63756e;
        }
        if ((i11 & 32) != 0) {
            str6 = dVar.f63757f;
        }
        if ((i11 & 64) != 0) {
            str7 = dVar.f63758g;
        }
        if ((i11 & 128) != 0) {
            str8 = dVar.f63759h;
        }
        if ((i11 & 256) != 0) {
            num = dVar.f63760i;
        }
        String str9 = str8;
        Integer num2 = num;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return dVar.j(str, str2, str13, str4, str12, str10, str11, str9, num2);
    }

    @m80.k
    public final String a() {
        return this.f63752a;
    }

    @m80.k
    public final String b() {
        return this.f63753b;
    }

    @m80.k
    public final String c() {
        return this.f63754c;
    }

    @m80.k
    public final String d() {
        return this.f63755d;
    }

    @m80.k
    public final String e() {
        return this.f63756e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return g0.g(this.f63752a, dVar.f63752a) && g0.g(this.f63753b, dVar.f63753b) && g0.g(this.f63754c, dVar.f63754c) && g0.g(this.f63755d, dVar.f63755d) && g0.g(this.f63756e, dVar.f63756e) && g0.g(this.f63757f, dVar.f63757f) && g0.g(this.f63758g, dVar.f63758g) && g0.g(this.f63759h, dVar.f63759h) && g0.g(this.f63760i, dVar.f63760i);
    }

    @m80.k
    public final String f() {
        return this.f63757f;
    }

    @m80.k
    public final String g() {
        return this.f63758g;
    }

    @m80.k
    public final String h() {
        return this.f63759h;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f63752a.hashCode() * 31) + this.f63753b.hashCode()) * 31) + this.f63754c.hashCode()) * 31) + this.f63755d.hashCode()) * 31) + this.f63756e.hashCode()) * 31) + this.f63757f.hashCode()) * 31) + this.f63758g.hashCode()) * 31) + this.f63759h.hashCode()) * 31;
        Integer num = this.f63760i;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @m80.l
    public final Integer i() {
        return this.f63760i;
    }

    @m80.k
    public final d j(@m80.k String device_id, @m80.k String device_manufacturer, @m80.k String device_model, @m80.k String os_name, @m80.k String os_sdk, @m80.k String app_name, @m80.k String app_channel, @m80.k String user_position, @m80.l Integer num) {
        g0.p(device_id, "device_id");
        g0.p(device_manufacturer, "device_manufacturer");
        g0.p(device_model, "device_model");
        g0.p(os_name, "os_name");
        g0.p(os_sdk, "os_sdk");
        g0.p(app_name, "app_name");
        g0.p(app_channel, "app_channel");
        g0.p(user_position, "user_position");
        return new d(device_id, device_manufacturer, device_model, os_name, os_sdk, app_name, app_channel, user_position, num);
    }

    @m80.k
    public String toString() {
        return "BczAppInfo(device_id=" + this.f63752a + ", device_manufacturer=" + this.f63753b + ", device_model=" + this.f63754c + ", os_name=" + this.f63755d + ", os_sdk=" + this.f63756e + ", app_name=" + this.f63757f + ", app_channel=" + this.f63758g + ", user_position=" + this.f63759h + ", action=" + this.f63760i + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f63751k.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBczAppInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczAppInfo.kt\ncom/baicizhan/biz/online/bcz_system_api/BczAppInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
    public static final class b implements ts.f<d> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f63761a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f63762b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f63763c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f63764d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f63765e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f63766f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f63767g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f63768h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public Integer f63769i;

        public b() {
            this.f63761a = null;
            this.f63762b = null;
            this.f63763c = null;
            this.f63764d = null;
            this.f63765e = null;
            this.f63766f = null;
            this.f63767g = null;
            this.f63768h = null;
            this.f63769i = null;
        }

        @m80.k
        public final b a(@m80.l Integer num) {
            this.f63769i = num;
            return this;
        }

        @m80.k
        public final b b(@m80.k String app_channel) {
            g0.p(app_channel, "app_channel");
            this.f63767g = app_channel;
            return this;
        }

        @m80.k
        public final b c(@m80.k String app_name) {
            g0.p(app_name, "app_name");
            this.f63766f = app_name;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public d build() {
            String str = this.f63761a;
            if (str == null) {
                throw new IllegalStateException("Required field 'device_id' is missing");
            }
            String str2 = this.f63762b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'device_manufacturer' is missing");
            }
            String str3 = this.f63763c;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'device_model' is missing");
            }
            String str4 = this.f63764d;
            if (str4 == null) {
                throw new IllegalStateException("Required field 'os_name' is missing");
            }
            String str5 = this.f63765e;
            if (str5 == null) {
                throw new IllegalStateException("Required field 'os_sdk' is missing");
            }
            String str6 = this.f63766f;
            if (str6 == null) {
                throw new IllegalStateException("Required field 'app_name' is missing");
            }
            String str7 = this.f63767g;
            if (str7 == null) {
                throw new IllegalStateException("Required field 'app_channel' is missing");
            }
            String str8 = this.f63768h;
            if (str8 != null) {
                return new d(str, str2, str3, str4, str5, str6, str7, str8, this.f63769i);
            }
            throw new IllegalStateException("Required field 'user_position' is missing");
        }

        @m80.k
        public final b e(@m80.k String device_id) {
            g0.p(device_id, "device_id");
            this.f63761a = device_id;
            return this;
        }

        @m80.k
        public final b f(@m80.k String device_manufacturer) {
            g0.p(device_manufacturer, "device_manufacturer");
            this.f63762b = device_manufacturer;
            return this;
        }

        @m80.k
        public final b g(@m80.k String device_model) {
            g0.p(device_model, "device_model");
            this.f63763c = device_model;
            return this;
        }

        @m80.k
        public final b h(@m80.k String os_name) {
            g0.p(os_name, "os_name");
            this.f63764d = os_name;
            return this;
        }

        @m80.k
        public final b i(@m80.k String os_sdk) {
            g0.p(os_sdk, "os_sdk");
            this.f63765e = os_sdk;
            return this;
        }

        @m80.k
        public final b j(@m80.k String user_position) {
            g0.p(user_position, "user_position");
            this.f63768h = user_position;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f63761a = null;
            this.f63762b = null;
            this.f63763c = null;
            this.f63764d = null;
            this.f63765e = null;
            this.f63766f = null;
            this.f63767g = null;
            this.f63768h = null;
            this.f63769i = null;
        }

        public b(@m80.k d source) {
            g0.p(source, "source");
            this.f63761a = source.f63752a;
            this.f63762b = source.f63753b;
            this.f63763c = source.f63754c;
            this.f63764d = source.f63755d;
            this.f63765e = source.f63756e;
            this.f63766f = source.f63757f;
            this.f63767g = source.f63758g;
            this.f63768h = source.f63759h;
            this.f63769i = source.f63760i;
        }
    }
}
